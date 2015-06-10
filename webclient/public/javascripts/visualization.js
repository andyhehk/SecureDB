if (window.console) {
  console.log("Welcome to your Play application's JavaScript!");
}

function drawCharts(cost){
    Chart.defaults.global.tooltipFontSize = 12;
    Chart.defaults.global.scaleFontSize = 10;

    var clientCost = cost.clientCost;
    var serverCost = cost.serverCost;
    var parseCost = cost.clientParseCost;
    var analyseCost = cost.clientAnalyseCost;
    var rewriteCost = cost.clientRewriteCost;
    var executeCost = cost.clientExecuteCost;

    var parseColor = "#91cf91";
    var analyseColor = "#6ec06e";
    var rewriteColor = "#4cae4c";
    var executeColor = "#3d8b3d";
    var serverColor = "#d9534f";

    var detailBlock = $("#chart-detail");
    detailBlock.append('<span style="background-color: ' + parseColor + '; width: 15px; height: 15px; color: ' + parseColor + '">__</span>');
    detailBlock.append("<span> Client Parse Time: " + parseCost + " ms </span>");

    detailBlock.append('<span style="background-color: ' + analyseColor + '; width: 15px; height: 15px; color: ' + analyseColor + '">__</span>');
    detailBlock.append("<span> Client Analyse Time: " + analyseCost + " ms </span>");
    detailBlock.append("<br>");

    detailBlock.append('<span style="background-color: ' + rewriteColor + '; width: 15px; height: 15px; color: ' + rewriteColor + '">__</span>');
    detailBlock.append("<span> Client Rewrite Time: " + rewriteCost + " ms </span>");

    detailBlock.append('<span style="background-color: ' + executeColor + '; width: 15px; height: 15px; color: ' + executeColor + '">__</span>');
    detailBlock.append("<span> Client Execute Time: " + executeCost + " ms </span>");
    detailBlock.append("<br>");

    detailBlock.append('<span style="background-color: ' + serverColor + '; width: 15px; height: 15px; color: ' + serverColor + '">__</span>');
    detailBlock.append("<span> Server Execute Time: " + serverCost + " ms </span>");
    detailBlock.append("<br>");

    var chartOptions = {
        //Number - Width of the grid lines
        scaleGridLineWidth : 1,

        //Number - Pixel width of the bar stroke
        barStrokeWidth : 1,

        //Number - Spacing between each of the X value sets
        barValueSpacing : 20,

        //Number - Spacing between data sets within X values
        barDatasetSpacing : 40,

        // Boolean - Determines whether to draw tooltips on the canvas or not
        showTooltips: true,

        // Function - Determines whether to execute the customTooltips function instead of drawing the built in tooltips (See [Advanced - External Tooltips](#advanced-usage-custom-tooltips))
        customTooltips: false,

        // Array - Array of string names to attach tooltip events
        tooltipEvents: ["mousemove", "touchstart", "touchmove"],

        // String - Tooltip background colour
        tooltipFillColor: "rgba(0,0,0,0.8)",

        // String - Tooltip label font declaration for the scale label
        tooltipFontFamily: "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif",

        // Number - Tooltip label font size in pixels
        tooltipFontSize: 12,

        // String - Tooltip font weight style
        tooltipFontStyle: "normal",

        // String - Tooltip label font colour
        tooltipFontColor: "#fff",

        // String - Tooltip title font declaration for the scale label
        tooltipTitleFontFamily: "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif",

        // Number - Tooltip title font size in pixels
        tooltipTitleFontSize: 9,

        // String - Tooltip title font weight style
        tooltipTitleFontStyle: "bold",

        // String - Tooltip title font colour
        tooltipTitleFontColor: "#fff",

        // Number - pixel width of padding around tooltip text
        tooltipYPadding: 6,

        // Number - pixel width of padding around tooltip text
        tooltipXPadding: 6,

        // Number - Size of the caret on the tooltip
        tooltipCaretSize: 8,

        // Number - Pixel radius of the tooltip border
        tooltipCornerRadius: 6,

        // Number - Pixel offset from point x to tooltip edge
        tooltipXOffset: 10,

        // String - Template string for single tooltips
        tooltipTemplate: "<%if (label){%><%=label%>: <%}%><%= value %> "
    };

    var chartData = {
        labels: ["Client Exe. Time    |     Server Exe. Time (ms)"],
        datasets: [
            {
                label: "Server Cost",
                fillColor: "#5cb85c",
                strokeColor: "#449d44",
                highlightFill: "#80c780",
                highlightStroke: "#5cb85c",
                data: [clientCost]
            },
            {
                label: "Server Cost",
                fillColor: "#d9534f",
                strokeColor: "#b52b27",
                highlightFill: "#de6764",
                highlightStroke: "#d9534f",
                data: [serverCost]
            }
        ]
    };

    var chartContext = $("#barChart").get(0).getContext("2d");
    new Chart(chartContext).Bar(chartData, chartOptions);

    var totalCost = clientCost + serverCost;

    var pieData = [
        {
            value: Math.floor(parseCost * 100 / totalCost),
            color: parseColor,
            highlight: "#b5deb5",
            label: "Client Parse Time (%)"
        }, {
            value: Math.floor(analyseCost * 100 / totalCost),
            color: analyseColor,
            highlight: "#80c780",
            label: "Client Analyse Time (%)"
        },{
            value: Math.floor(rewriteCost * 100 / totalCost),
            color: rewriteColor,
            highlight: "#5cb85c",
            label: "Client Rewrite Time (%)"
        },{
            value: Math.floor(executeCost * 100 / totalCost),
            color: executeColor,
            highlight: "#449d44",
            label: "Client Execution Time (%)"
        },{
            value: Math.ceil(serverCost * 100 / totalCost),
            color: serverColor,
            highlight: "#de6764",
            label: "Server Execution Time (%)"
        }
    ];


    var pieContext = $("#pieChart").get(0).getContext("2d");
    var pieChart = new Chart(pieContext).Pie(pieData);

}