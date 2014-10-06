// $ANTLR 3.4 FromClauseParser.g 2014-10-06 21:41:25

//package org.apache.hadoop.hive.ql.parse;

import java.util.Collection;
import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


/**
   Licensed to the Apache Software Foundation (ASF) under one or more 
   contributor license agreements.  See the NOTICE file distributed with 
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with 
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
@SuppressWarnings({"all", "warnings", "unchecked"})
public class HiveParser_FromClauseParser extends Parser {
    public static final int EOF=-1;
    public static final int AMPERSAND=4;
    public static final int BITWISEOR=5;
    public static final int BITWISEXOR=6;
    public static final int BigintLiteral=7;
    public static final int ByteLengthLiteral=8;
    public static final int COLON=9;
    public static final int COMMA=10;
    public static final int COMMENT=11;
    public static final int CharSetLiteral=12;
    public static final int CharSetName=13;
    public static final int DIV=14;
    public static final int DIVIDE=15;
    public static final int DOLLAR=16;
    public static final int DOT=17;
    public static final int DecimalLiteral=18;
    public static final int Digit=19;
    public static final int EQUAL=20;
    public static final int EQUAL_NS=21;
    public static final int Exponent=22;
    public static final int GREATERTHAN=23;
    public static final int GREATERTHANOREQUALTO=24;
    public static final int HexDigit=25;
    public static final int Identifier=26;
    public static final int KW_ADD=27;
    public static final int KW_ADJACENT=28;
    public static final int KW_AFTER=29;
    public static final int KW_ALL=30;
    public static final int KW_ALTER=31;
    public static final int KW_ANALYZE=32;
    public static final int KW_AND=33;
    public static final int KW_ARCHIVE=34;
    public static final int KW_ARRAY=35;
    public static final int KW_AS=36;
    public static final int KW_ASC=37;
    public static final int KW_BEFORE=38;
    public static final int KW_BETWEEN=39;
    public static final int KW_BIGINT=40;
    public static final int KW_BINARY=41;
    public static final int KW_BOOLEAN=42;
    public static final int KW_BOTH=43;
    public static final int KW_BUCKET=44;
    public static final int KW_BUCKETS=45;
    public static final int KW_BY=46;
    public static final int KW_CASCADE=47;
    public static final int KW_CASE=48;
    public static final int KW_CAST=49;
    public static final int KW_CHANGE=50;
    public static final int KW_CLOSEST=51;
    public static final int KW_CLUSTER=52;
    public static final int KW_CLUSTERED=53;
    public static final int KW_CLUSTERSTATUS=54;
    public static final int KW_COALESCE=55;
    public static final int KW_COLLECTION=56;
    public static final int KW_COLUMN=57;
    public static final int KW_COLUMNS=58;
    public static final int KW_COMMENT=59;
    public static final int KW_COMPUTE=60;
    public static final int KW_CONCATENATE=61;
    public static final int KW_CONTAINS=62;
    public static final int KW_CONTINUE=63;
    public static final int KW_CORRESPONDING=64;
    public static final int KW_CREATE=65;
    public static final int KW_CROSS=66;
    public static final int KW_CUBE=67;
    public static final int KW_CURRENT=68;
    public static final int KW_CURSOR=69;
    public static final int KW_DATA=70;
    public static final int KW_DATABASE=71;
    public static final int KW_DATABASES=72;
    public static final int KW_DATE=73;
    public static final int KW_DATETIME=74;
    public static final int KW_DBPROPERTIES=75;
    public static final int KW_DECIMAL=76;
    public static final int KW_DEFERRED=77;
    public static final int KW_DELETE=78;
    public static final int KW_DELIMITED=79;
    public static final int KW_DEPENDENCY=80;
    public static final int KW_DESC=81;
    public static final int KW_DESCRIBE=82;
    public static final int KW_DIRECTORIES=83;
    public static final int KW_DIRECTORY=84;
    public static final int KW_DISABLE=85;
    public static final int KW_DISTANCE=86;
    public static final int KW_DISTINCT=87;
    public static final int KW_DISTRIBUTE=88;
    public static final int KW_DOUBLE=89;
    public static final int KW_DOWNSTREAM=90;
    public static final int KW_DROP=91;
    public static final int KW_ELEM_TYPE=92;
    public static final int KW_ELSE=93;
    public static final int KW_ENABLE=94;
    public static final int KW_ENC=95;
    public static final int KW_END=96;
    public static final int KW_ESCAPED=97;
    public static final int KW_EXCHANGE=98;
    public static final int KW_EXCLUSIVE=99;
    public static final int KW_EXCLUSIVENESSJOIN=100;
    public static final int KW_EXISTS=101;
    public static final int KW_EXPLAIN=102;
    public static final int KW_EXPORT=103;
    public static final int KW_EXTENDED=104;
    public static final int KW_EXTERNAL=105;
    public static final int KW_FALSE=106;
    public static final int KW_FETCH=107;
    public static final int KW_FIELDS=108;
    public static final int KW_FILEFORMAT=109;
    public static final int KW_FIRST=110;
    public static final int KW_FLOAT=111;
    public static final int KW_FOLLOWING=112;
    public static final int KW_FOR=113;
    public static final int KW_FORMAT=114;
    public static final int KW_FORMATTED=115;
    public static final int KW_FROM=116;
    public static final int KW_FULL=117;
    public static final int KW_FUNCTION=118;
    public static final int KW_FUNCTIONS=119;
    public static final int KW_GRANT=120;
    public static final int KW_GROUP=121;
    public static final int KW_GROUPING=122;
    public static final int KW_HAVING=123;
    public static final int KW_HOLD_DDLTIME=124;
    public static final int KW_IDXPROPERTIES=125;
    public static final int KW_IF=126;
    public static final int KW_IGNORE=127;
    public static final int KW_IMPORT=128;
    public static final int KW_IN=129;
    public static final int KW_INDEX=130;
    public static final int KW_INDEXES=131;
    public static final int KW_INNER=132;
    public static final int KW_INPATH=133;
    public static final int KW_INPUTDRIVER=134;
    public static final int KW_INPUTFORMAT=135;
    public static final int KW_INSERT=136;
    public static final int KW_INT=137;
    public static final int KW_INTERSECT=138;
    public static final int KW_INTERSECTJOIN=139;
    public static final int KW_INTERVAL=140;
    public static final int KW_INTO=141;
    public static final int KW_IS=142;
    public static final int KW_ITEMS=143;
    public static final int KW_JOIN=144;
    public static final int KW_KEYS=145;
    public static final int KW_KEY_TYPE=146;
    public static final int KW_LATERAL=147;
    public static final int KW_LEFT=148;
    public static final int KW_LENGTH=149;
    public static final int KW_LESS=150;
    public static final int KW_LIKE=151;
    public static final int KW_LIMIT=152;
    public static final int KW_LINES=153;
    public static final int KW_LOAD=154;
    public static final int KW_LOCAL=155;
    public static final int KW_LOCATION=156;
    public static final int KW_LOCK=157;
    public static final int KW_LOCKS=158;
    public static final int KW_LOGICAL=159;
    public static final int KW_LONG=160;
    public static final int KW_MACRO=161;
    public static final int KW_MAP=162;
    public static final int KW_MAPJOIN=163;
    public static final int KW_MATERIALIZED=164;
    public static final int KW_MINUS=165;
    public static final int KW_MORE=166;
    public static final int KW_MSCK=167;
    public static final int KW_NOSCAN=168;
    public static final int KW_NOT=169;
    public static final int KW_NO_DROP=170;
    public static final int KW_NULL=171;
    public static final int KW_OF=172;
    public static final int KW_OFFLINE=173;
    public static final int KW_ON=174;
    public static final int KW_OPTION=175;
    public static final int KW_OR=176;
    public static final int KW_ORCFILE=177;
    public static final int KW_ORDER=178;
    public static final int KW_OUT=179;
    public static final int KW_OUTER=180;
    public static final int KW_OUTPUTDRIVER=181;
    public static final int KW_OUTPUTFORMAT=182;
    public static final int KW_OVER=183;
    public static final int KW_OVERLAPS=184;
    public static final int KW_OVERWRITE=185;
    public static final int KW_PARTIALSCAN=186;
    public static final int KW_PARTITION=187;
    public static final int KW_PARTITIONED=188;
    public static final int KW_PARTITIONS=189;
    public static final int KW_PERCENT=190;
    public static final int KW_PLUS=191;
    public static final int KW_PRECEDING=192;
    public static final int KW_PREFIX=193;
    public static final int KW_PRESERVE=194;
    public static final int KW_PRETTY=195;
    public static final int KW_PROCEDURE=196;
    public static final int KW_PROJECT=197;
    public static final int KW_PROTECTION=198;
    public static final int KW_PURGE=199;
    public static final int KW_RANGE=200;
    public static final int KW_RCFILE=201;
    public static final int KW_READ=202;
    public static final int KW_READONLY=203;
    public static final int KW_READS=204;
    public static final int KW_REBUILD=205;
    public static final int KW_RECORDREADER=206;
    public static final int KW_RECORDWRITER=207;
    public static final int KW_REDUCE=208;
    public static final int KW_REGEXP=209;
    public static final int KW_RENAME=210;
    public static final int KW_REPAIR=211;
    public static final int KW_REPLACE=212;
    public static final int KW_RESTRICT=213;
    public static final int KW_REVOKE=214;
    public static final int KW_RIGHT=215;
    public static final int KW_RLIKE=216;
    public static final int KW_ROLE=217;
    public static final int KW_ROLLUP=218;
    public static final int KW_ROW=219;
    public static final int KW_ROWS=220;
    public static final int KW_SCHEMA=221;
    public static final int KW_SCHEMAS=222;
    public static final int KW_SELECT=223;
    public static final int KW_SEMI=224;
    public static final int KW_SEQUENCEFILE=225;
    public static final int KW_SERDE=226;
    public static final int KW_SERDEPROPERTIES=227;
    public static final int KW_SET=228;
    public static final int KW_SETS=229;
    public static final int KW_SHARED=230;
    public static final int KW_SHOW=231;
    public static final int KW_SHOW_DATABASE=232;
    public static final int KW_SKEWED=233;
    public static final int KW_SMALLINT=234;
    public static final int KW_SORT=235;
    public static final int KW_SORTED=236;
    public static final int KW_SSL=237;
    public static final int KW_STATISTICS=238;
    public static final int KW_STORED=239;
    public static final int KW_STREAMTABLE=240;
    public static final int KW_STRING=241;
    public static final int KW_STRUCT=242;
    public static final int KW_SUFFIX=243;
    public static final int KW_TABLE=244;
    public static final int KW_TABLES=245;
    public static final int KW_TABLESAMPLE=246;
    public static final int KW_TBLPROPERTIES=247;
    public static final int KW_TEMPORARY=248;
    public static final int KW_TERMINATED=249;
    public static final int KW_TEXTFILE=250;
    public static final int KW_THEN=251;
    public static final int KW_TIMESTAMP=252;
    public static final int KW_TINYINT=253;
    public static final int KW_TO=254;
    public static final int KW_TOUCH=255;
    public static final int KW_TRANSFORM=256;
    public static final int KW_TRIGGER=257;
    public static final int KW_TRUE=258;
    public static final int KW_TRUNCATE=259;
    public static final int KW_UNARCHIVE=260;
    public static final int KW_UNBOUNDED=261;
    public static final int KW_UNDO=262;
    public static final int KW_UNION=263;
    public static final int KW_UNIONTYPE=264;
    public static final int KW_UNIQUEJOIN=265;
    public static final int KW_UNLOCK=266;
    public static final int KW_UNSET=267;
    public static final int KW_UNSIGNED=268;
    public static final int KW_UPDATE=269;
    public static final int KW_UPSTREAM=270;
    public static final int KW_USE=271;
    public static final int KW_USER=272;
    public static final int KW_USING=273;
    public static final int KW_UTC=274;
    public static final int KW_UTCTIMESTAMP=275;
    public static final int KW_VALUE_TYPE=276;
    public static final int KW_VIEW=277;
    public static final int KW_VIRTUALTRACK=278;
    public static final int KW_WHEN=279;
    public static final int KW_WHERE=280;
    public static final int KW_WHILE=281;
    public static final int KW_WINDOW=282;
    public static final int KW_WITH=283;
    public static final int KW_WITHIN=284;
    public static final int LCURLY=285;
    public static final int LESSTHAN=286;
    public static final int LESSTHANOREQUALTO=287;
    public static final int LPAREN=288;
    public static final int LSQUARE=289;
    public static final int Letter=290;
    public static final int MINUS=291;
    public static final int MOD=292;
    public static final int NOTEQUAL=293;
    public static final int Number=294;
    public static final int PLUS=295;
    public static final int QUESTION=296;
    public static final int RCURLY=297;
    public static final int RPAREN=298;
    public static final int RSQUARE=299;
    public static final int RegexComponent=300;
    public static final int SEMICOLON=301;
    public static final int STAR=302;
    public static final int SmallintLiteral=303;
    public static final int StringLiteral=304;
    public static final int TILDE=305;
    public static final int TinyintLiteral=306;
    public static final int WS=307;
    public static final int TOK_ALIASLIST=588;
    public static final int TOK_ALLCOLREF=589;
    public static final int TOK_ALTERDATABASE_PROPERTIES=590;
    public static final int TOK_ALTERINDEX_PROPERTIES=591;
    public static final int TOK_ALTERINDEX_REBUILD=592;
    public static final int TOK_ALTERTABLE_ADDCOLS=593;
    public static final int TOK_ALTERTABLE_ADDPARTS=594;
    public static final int TOK_ALTERTABLE_ALTERPARTS=595;
    public static final int TOK_ALTERTABLE_ALTERPARTS_MERGEFILES=596;
    public static final int TOK_ALTERTABLE_ALTERPARTS_PROTECTMODE=597;
    public static final int TOK_ALTERTABLE_ARCHIVE=598;
    public static final int TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION=599;
    public static final int TOK_ALTERTABLE_CLUSTER_SORT=600;
    public static final int TOK_ALTERTABLE_DROPPARTS=601;
    public static final int TOK_ALTERTABLE_FILEFORMAT=602;
    public static final int TOK_ALTERTABLE_LOCATION=603;
    public static final int TOK_ALTERTABLE_PARTITION=604;
    public static final int TOK_ALTERTABLE_PROPERTIES=605;
    public static final int TOK_ALTERTABLE_RENAME=606;
    public static final int TOK_ALTERTABLE_RENAMECOL=607;
    public static final int TOK_ALTERTABLE_RENAMEPART=608;
    public static final int TOK_ALTERTABLE_REPLACECOLS=609;
    public static final int TOK_ALTERTABLE_SERDEPROPERTIES=610;
    public static final int TOK_ALTERTABLE_SERIALIZER=611;
    public static final int TOK_ALTERTABLE_SKEWED=612;
    public static final int TOK_ALTERTABLE_TOUCH=613;
    public static final int TOK_ALTERTABLE_UNARCHIVE=614;
    public static final int TOK_ALTERTBLPART_SKEWED_LOCATION=615;
    public static final int TOK_ALTERVIEW_ADDPARTS=616;
    public static final int TOK_ALTERVIEW_AS=617;
    public static final int TOK_ALTERVIEW_DROPPARTS=618;
    public static final int TOK_ALTERVIEW_PROPERTIES=619;
    public static final int TOK_ALTERVIEW_RENAME=620;
    public static final int TOK_ANALYZE=621;
    public static final int TOK_BIGINT=622;
    public static final int TOK_BINARY=623;
    public static final int TOK_BOOLEAN=624;
    public static final int TOK_CASCADE=625;
    public static final int TOK_CHARSETLITERAL=626;
    public static final int TOK_CLUSTERBY=627;
    public static final int TOK_COALESCE=628;
    public static final int TOK_COLTYPELIST=629;
    public static final int TOK_CONTAINS=630;
    public static final int TOK_CREATEDATABASE=631;
    public static final int TOK_CREATEFUNCTION=632;
    public static final int TOK_CREATEINDEX=633;
    public static final int TOK_CREATEINDEX_INDEXTBLNAME=634;
    public static final int TOK_CREATEMACRO=635;
    public static final int TOK_CREATEROLE=636;
    public static final int TOK_CREATETABLE=637;
    public static final int TOK_CREATEVIEW=638;
    public static final int TOK_CROSSJOIN=639;
    public static final int TOK_CUBE_GROUPBY=640;
    public static final int TOK_DATABASECOMMENT=641;
    public static final int TOK_DATABASELOCATION=642;
    public static final int TOK_DATABASEPROPERTIES=643;
    public static final int TOK_DATE=644;
    public static final int TOK_DATELITERAL=645;
    public static final int TOK_DATETIME=646;
    public static final int TOK_DBPROPLIST=647;
    public static final int TOK_DECIMAL=648;
    public static final int TOK_DEFERRED_REBUILDINDEX=649;
    public static final int TOK_DESCDATABASE=650;
    public static final int TOK_DESCFUNCTION=651;
    public static final int TOK_DESCTABLE=652;
    public static final int TOK_DESTINATION=653;
    public static final int TOK_DIR=654;
    public static final int TOK_DISABLE=655;
    public static final int TOK_DISTANCE=656;
    public static final int TOK_DISTRIBUTEBY=657;
    public static final int TOK_DOUBLE=658;
    public static final int TOK_DROPDATABASE=659;
    public static final int TOK_DROPFUNCTION=660;
    public static final int TOK_DROPINDEX=661;
    public static final int TOK_DROPMACRO=662;
    public static final int TOK_DROPROLE=663;
    public static final int TOK_DROPTABLE=664;
    public static final int TOK_DROPTABLE_PROPERTIES=665;
    public static final int TOK_DROPVIEW=666;
    public static final int TOK_DROPVIEW_PROPERTIES=667;
    public static final int TOK_ENABLE=668;
    public static final int TOK_ENC=669;
    public static final int TOK_EXCHANGEPARTITION=670;
    public static final int TOK_EXCLUSIVENESSJOIN=671;
    public static final int TOK_EXPLAIN=672;
    public static final int TOK_EXPLIST=673;
    public static final int TOK_EXPORT=674;
    public static final int TOK_FALSE=675;
    public static final int TOK_FILEFORMAT_GENERIC=676;
    public static final int TOK_FLOAT=677;
    public static final int TOK_FROM=678;
    public static final int TOK_FULLOUTERJOIN=679;
    public static final int TOK_FUNCTION=680;
    public static final int TOK_FUNCTIONDI=681;
    public static final int TOK_FUNCTIONSTAR=682;
    public static final int TOK_GRANT=683;
    public static final int TOK_GRANT_ROLE=684;
    public static final int TOK_GRANT_WITH_OPTION=685;
    public static final int TOK_GROUP=686;
    public static final int TOK_GROUPBY=687;
    public static final int TOK_GROUPING_SETS=688;
    public static final int TOK_GROUPING_SETS_EXPRESSION=689;
    public static final int TOK_HAVING=690;
    public static final int TOK_HINT=691;
    public static final int TOK_HINTARGLIST=692;
    public static final int TOK_HINTLIST=693;
    public static final int TOK_HOLD_DDLTIME=694;
    public static final int TOK_IFEXISTS=695;
    public static final int TOK_IFNOTEXISTS=696;
    public static final int TOK_IGNOREPROTECTION=697;
    public static final int TOK_IMPORT=698;
    public static final int TOK_INDEXCOMMENT=699;
    public static final int TOK_INDEXPROPERTIES=700;
    public static final int TOK_INDEXPROPLIST=701;
    public static final int TOK_INSERT=702;
    public static final int TOK_INSERT_INTO=703;
    public static final int TOK_INT=704;
    public static final int TOK_INTERSECTJOIN=705;
    public static final int TOK_INTERVAL=706;
    public static final int TOK_INTERVALCONSTANT=707;
    public static final int TOK_INTERVALLENGTH=708;
    public static final int TOK_INTERVALPROP=709;
    public static final int TOK_ISADJACENTTO=710;
    public static final int TOK_ISAFTER=711;
    public static final int TOK_ISBEFORE=712;
    public static final int TOK_ISCLOSESTTO=713;
    public static final int TOK_ISCORRESPONDINGTO=714;
    public static final int TOK_ISDOWNSTREAMOF=715;
    public static final int TOK_ISNOTNULL=716;
    public static final int TOK_ISNULL=717;
    public static final int TOK_ISPREFIXOF=718;
    public static final int TOK_ISSUFFIXOF=719;
    public static final int TOK_ISUPSTREAMOF=720;
    public static final int TOK_ISWITHIN=721;
    public static final int TOK_JOIN=722;
    public static final int TOK_LATERAL_VIEW=723;
    public static final int TOK_LATERAL_VIEW_OUTER=724;
    public static final int TOK_LEFTOUTERJOIN=725;
    public static final int TOK_LEFTSEMIJOIN=726;
    public static final int TOK_LENGTH=727;
    public static final int TOK_LENGTHOFINTERVAL=728;
    public static final int TOK_LIKETABLE=729;
    public static final int TOK_LIMIT=730;
    public static final int TOK_LIST=731;
    public static final int TOK_LOAD=732;
    public static final int TOK_LOCAL_DIR=733;
    public static final int TOK_LOCKTABLE=734;
    public static final int TOK_MAP=735;
    public static final int TOK_MAPJOIN=736;
    public static final int TOK_MSCK=737;
    public static final int TOK_MULTIPLETRACK=738;
    public static final int TOK_NOT_CLUSTERED=739;
    public static final int TOK_NOT_SORTED=740;
    public static final int TOK_NO_DROP=741;
    public static final int TOK_NULL=742;
    public static final int TOK_OFFLINE=743;
    public static final int TOK_OP_ADD=744;
    public static final int TOK_OP_AND=745;
    public static final int TOK_OP_BITAND=746;
    public static final int TOK_OP_BITNOT=747;
    public static final int TOK_OP_BITOR=748;
    public static final int TOK_OP_BITXOR=749;
    public static final int TOK_OP_DIV=750;
    public static final int TOK_OP_EQ=751;
    public static final int TOK_OP_GE=752;
    public static final int TOK_OP_GT=753;
    public static final int TOK_OP_LE=754;
    public static final int TOK_OP_LIKE=755;
    public static final int TOK_OP_LT=756;
    public static final int TOK_OP_MOD=757;
    public static final int TOK_OP_MUL=758;
    public static final int TOK_OP_NE=759;
    public static final int TOK_OP_NOT=760;
    public static final int TOK_OP_OR=761;
    public static final int TOK_OP_SUB=762;
    public static final int TOK_ORDERBY=763;
    public static final int TOK_ORREPLACE=764;
    public static final int TOK_OVERLAPSWITH=765;
    public static final int TOK_PARTITIONINGSPEC=766;
    public static final int TOK_PARTITIONLOCATION=767;
    public static final int TOK_PARTSPEC=768;
    public static final int TOK_PARTVAL=769;
    public static final int TOK_PERCENT=770;
    public static final int TOK_PRINCIPAL_NAME=771;
    public static final int TOK_PRIVILEGE=772;
    public static final int TOK_PRIVILEGE_LIST=773;
    public static final int TOK_PRIV_ALL=774;
    public static final int TOK_PRIV_ALTER_DATA=775;
    public static final int TOK_PRIV_ALTER_METADATA=776;
    public static final int TOK_PRIV_CREATE=777;
    public static final int TOK_PRIV_DROP=778;
    public static final int TOK_PRIV_INDEX=779;
    public static final int TOK_PRIV_LOCK=780;
    public static final int TOK_PRIV_OBJECT=781;
    public static final int TOK_PRIV_OBJECT_COL=782;
    public static final int TOK_PRIV_SELECT=783;
    public static final int TOK_PRIV_SHOW_DATABASE=784;
    public static final int TOK_PROJECT=785;
    public static final int TOK_PTBLFUNCTION=786;
    public static final int TOK_QUERY=787;
    public static final int TOK_READONLY=788;
    public static final int TOK_RECORDREADER=789;
    public static final int TOK_RECORDWRITER=790;
    public static final int TOK_RESTRICT=791;
    public static final int TOK_REVOKE=792;
    public static final int TOK_REVOKE_ROLE=793;
    public static final int TOK_RIGHTOUTERJOIN=794;
    public static final int TOK_ROLE=795;
    public static final int TOK_ROLLUP_GROUPBY=796;
    public static final int TOK_ROWCOUNT=797;
    public static final int TOK_SELECT=798;
    public static final int TOK_SELECTDI=799;
    public static final int TOK_SELEXPR=800;
    public static final int TOK_SERDE=801;
    public static final int TOK_SERDENAME=802;
    public static final int TOK_SERDEPROPS=803;
    public static final int TOK_SHOWCOLUMNS=804;
    public static final int TOK_SHOWDATABASES=805;
    public static final int TOK_SHOWFUNCTIONS=806;
    public static final int TOK_SHOWINDEXES=807;
    public static final int TOK_SHOWLOCKS=808;
    public static final int TOK_SHOWPARTITIONS=809;
    public static final int TOK_SHOWTABLES=810;
    public static final int TOK_SHOW_CREATETABLE=811;
    public static final int TOK_SHOW_GRANT=812;
    public static final int TOK_SHOW_ROLE_GRANT=813;
    public static final int TOK_SHOW_TABLESTATUS=814;
    public static final int TOK_SHOW_TBLPROPERTIES=815;
    public static final int TOK_SKEWED_LOCATIONS=816;
    public static final int TOK_SKEWED_LOCATION_LIST=817;
    public static final int TOK_SKEWED_LOCATION_MAP=818;
    public static final int TOK_SMALLINT=819;
    public static final int TOK_SORTBY=820;
    public static final int TOK_STORAGEHANDLER=821;
    public static final int TOK_STOREDASDIRS=822;
    public static final int TOK_STREAMTABLE=823;
    public static final int TOK_STRING=824;
    public static final int TOK_STRINGLITERALSEQUENCE=825;
    public static final int TOK_STRUCT=826;
    public static final int TOK_SUBQUERY=827;
    public static final int TOK_SWITCHDATABASE=828;
    public static final int TOK_TAB=829;
    public static final int TOK_TABALIAS=830;
    public static final int TOK_TABCOL=831;
    public static final int TOK_TABCOLLIST=832;
    public static final int TOK_TABCOLNAME=833;
    public static final int TOK_TABCOLVALUE=834;
    public static final int TOK_TABCOLVALUES=835;
    public static final int TOK_TABCOLVALUE_PAIR=836;
    public static final int TOK_TABLEBUCKETS=837;
    public static final int TOK_TABLEBUCKETSAMPLE=838;
    public static final int TOK_TABLECOMMENT=839;
    public static final int TOK_TABLEFILEFORMAT=840;
    public static final int TOK_TABLELOCATION=841;
    public static final int TOK_TABLEPARTCOLS=842;
    public static final int TOK_TABLEPROPERTIES=843;
    public static final int TOK_TABLEPROPERTY=844;
    public static final int TOK_TABLEPROPLIST=845;
    public static final int TOK_TABLEROWFORMAT=846;
    public static final int TOK_TABLEROWFORMATCOLLITEMS=847;
    public static final int TOK_TABLEROWFORMATFIELD=848;
    public static final int TOK_TABLEROWFORMATLINES=849;
    public static final int TOK_TABLEROWFORMATMAPKEYS=850;
    public static final int TOK_TABLESERIALIZER=851;
    public static final int TOK_TABLESKEWED=852;
    public static final int TOK_TABLESPLITSAMPLE=853;
    public static final int TOK_TABLE_OR_COL=854;
    public static final int TOK_TABLE_PARTITION=855;
    public static final int TOK_TABNAME=856;
    public static final int TOK_TABREF=857;
    public static final int TOK_TABSORTCOLNAMEASC=858;
    public static final int TOK_TABSORTCOLNAMEDESC=859;
    public static final int TOK_TABSRC=860;
    public static final int TOK_TABTYPE=861;
    public static final int TOK_TBLORCFILE=862;
    public static final int TOK_TBLRCFILE=863;
    public static final int TOK_TBLSEQUENCEFILE=864;
    public static final int TOK_TBLTEXTFILE=865;
    public static final int TOK_TIMESTAMP=866;
    public static final int TOK_TINYINT=867;
    public static final int TOK_TMP_FILE=868;
    public static final int TOK_TRANSFORM=869;
    public static final int TOK_TRUE=870;
    public static final int TOK_TRUNCATETABLE=871;
    public static final int TOK_UNION=872;
    public static final int TOK_UNIONTYPE=873;
    public static final int TOK_UNIQUEJOIN=874;
    public static final int TOK_UNLOCKTABLE=875;
    public static final int TOK_USER=876;
    public static final int TOK_USERSCRIPTCOLNAMES=877;
    public static final int TOK_USERSCRIPTCOLSCHEMA=878;
    public static final int TOK_VIEWPARTCOLS=879;
    public static final int TOK_WHERE=880;
    public static final int TOK_WINDOWDEF=881;
    public static final int TOK_WINDOWRANGE=882;
    public static final int TOK_WINDOWSPEC=883;
    public static final int TOK_WINDOWVALUES=884;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators
    public HiveParser gHiveParser;
    public HiveParser gParent;


    public HiveParser_FromClauseParser(TokenStream input, HiveParser gHiveParser) {
        this(input, new RecognizerSharedState(), gHiveParser);
    }
    public HiveParser_FromClauseParser(TokenStream input, RecognizerSharedState state, HiveParser gHiveParser) {
        super(input, state);
        this.gHiveParser = gHiveParser;
        gParent = gHiveParser;
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return HiveParser.tokenNames; }
    public String getGrammarFileName() { return "FromClauseParser.g"; }


      @Override
      public Object recoverFromMismatchedSet(IntStream input,
          RecognitionException re, BitSet follow) throws RecognitionException {
        throw re;
      }
      @Override
      public void displayRecognitionError(String[] tokenNames,
          RecognitionException e) {
        gParent.errors.add(new ParseError(gParent, e, tokenNames));
      }


    public static class tableAllColumns_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableAllColumns"
    // FromClauseParser.g:48:1: tableAllColumns : ( STAR -> ^( TOK_ALLCOLREF ) | tableName DOT STAR -> ^( TOK_ALLCOLREF tableName ) );
    public final HiveParser_FromClauseParser.tableAllColumns_return tableAllColumns() throws RecognitionException {
        HiveParser_FromClauseParser.tableAllColumns_return retval = new HiveParser_FromClauseParser.tableAllColumns_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STAR1=null;
        Token DOT3=null;
        Token STAR4=null;
        HiveParser_FromClauseParser.tableName_return tableName2 =null;


        CommonTree STAR1_tree=null;
        CommonTree DOT3_tree=null;
        CommonTree STAR4_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");
        try {
            // FromClauseParser.g:49:5: ( STAR -> ^( TOK_ALLCOLREF ) | tableName DOT STAR -> ^( TOK_ALLCOLREF tableName ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==STAR) ) {
                alt1=1;
            }
            else if ( ((LA1_0 >= Identifier && LA1_0 <= KW_ADD)||LA1_0==KW_AFTER||(LA1_0 >= KW_ALTER && LA1_0 <= KW_ANALYZE)||(LA1_0 >= KW_ARCHIVE && LA1_0 <= KW_CASCADE)||LA1_0==KW_CHANGE||(LA1_0 >= KW_CLUSTER && LA1_0 <= KW_CLUSTERSTATUS)||LA1_0==KW_COLLECTION||(LA1_0 >= KW_COLUMNS && LA1_0 <= KW_CONCATENATE)||LA1_0==KW_CONTINUE||LA1_0==KW_CREATE||LA1_0==KW_CUBE||(LA1_0 >= KW_CURSOR && LA1_0 <= KW_DATA)||(LA1_0 >= KW_DATABASES && LA1_0 <= KW_DISABLE)||(LA1_0 >= KW_DISTRIBUTE && LA1_0 <= KW_DOUBLE)||(LA1_0 >= KW_DROP && LA1_0 <= KW_ELEM_TYPE)||LA1_0==KW_ENABLE||LA1_0==KW_ESCAPED||LA1_0==KW_EXCLUSIVE||(LA1_0 >= KW_EXISTS && LA1_0 <= KW_EXPORT)||(LA1_0 >= KW_EXTERNAL && LA1_0 <= KW_FLOAT)||(LA1_0 >= KW_FOR && LA1_0 <= KW_FORMATTED)||LA1_0==KW_FULL||(LA1_0 >= KW_FUNCTIONS && LA1_0 <= KW_GROUPING)||(LA1_0 >= KW_HOLD_DDLTIME && LA1_0 <= KW_IDXPROPERTIES)||(LA1_0 >= KW_IGNORE && LA1_0 <= KW_INTERSECT)||(LA1_0 >= KW_INTO && LA1_0 <= KW_ITEMS)||(LA1_0 >= KW_KEYS && LA1_0 <= KW_LEFT)||(LA1_0 >= KW_LIKE && LA1_0 <= KW_LONG)||(LA1_0 >= KW_MAPJOIN && LA1_0 <= KW_MINUS)||(LA1_0 >= KW_MSCK && LA1_0 <= KW_NOSCAN)||(LA1_0 >= KW_NO_DROP && LA1_0 <= KW_OFFLINE)||LA1_0==KW_OPTION||(LA1_0 >= KW_ORCFILE && LA1_0 <= KW_OUTPUTFORMAT)||LA1_0==KW_OVERWRITE||(LA1_0 >= KW_PARTITION && LA1_0 <= KW_PLUS)||(LA1_0 >= KW_PRETTY && LA1_0 <= KW_PROCEDURE)||(LA1_0 >= KW_PROTECTION && LA1_0 <= KW_RECORDWRITER)||(LA1_0 >= KW_REGEXP && LA1_0 <= KW_SCHEMAS)||(LA1_0 >= KW_SEMI && LA1_0 <= KW_STRUCT)||(LA1_0 >= KW_TABLE && LA1_0 <= KW_TABLES)||(LA1_0 >= KW_TBLPROPERTIES && LA1_0 <= KW_TEXTFILE)||(LA1_0 >= KW_TIMESTAMP && LA1_0 <= KW_TOUCH)||(LA1_0 >= KW_TRIGGER && LA1_0 <= KW_UNARCHIVE)||(LA1_0 >= KW_UNDO && LA1_0 <= KW_UNIONTYPE)||(LA1_0 >= KW_UNLOCK && LA1_0 <= KW_UPDATE)||(LA1_0 >= KW_USE && LA1_0 <= KW_VIEW)||LA1_0==KW_WHILE||LA1_0==KW_WITH) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // FromClauseParser.g:49:7: STAR
                    {
                    STAR1=(Token)match(input,STAR,FOLLOW_STAR_in_tableAllColumns57); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(STAR1);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 50:9: -> ^( TOK_ALLCOLREF )
                    {
                        // FromClauseParser.g:50:12: ^( TOK_ALLCOLREF )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_ALLCOLREF, "TOK_ALLCOLREF")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // FromClauseParser.g:51:7: tableName DOT STAR
                    {
                    pushFollow(FOLLOW_tableName_in_tableAllColumns79);
                    tableName2=tableName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableName.add(tableName2.getTree());

                    DOT3=(Token)match(input,DOT,FOLLOW_DOT_in_tableAllColumns81); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT3);


                    STAR4=(Token)match(input,STAR,FOLLOW_STAR_in_tableAllColumns83); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(STAR4);


                    // AST REWRITE
                    // elements: tableName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 52:9: -> ^( TOK_ALLCOLREF tableName )
                    {
                        // FromClauseParser.g:52:12: ^( TOK_ALLCOLREF tableName )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_ALLCOLREF, "TOK_ALLCOLREF")
                        , root_1);

                        adaptor.addChild(root_1, stream_tableName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tableAllColumns"


    public static class tableOrColumn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableOrColumn"
    // FromClauseParser.g:56:1: tableOrColumn : identifier -> ^( TOK_TABLE_OR_COL identifier ) ;
    public final HiveParser_FromClauseParser.tableOrColumn_return tableOrColumn() throws RecognitionException {
        HiveParser_FromClauseParser.tableOrColumn_return retval = new HiveParser_FromClauseParser.tableOrColumn_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.identifier_return identifier5 =null;


        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
         gParent.msgs.push("table or column identifier"); 
        try {
            // FromClauseParser.g:59:5: ( identifier -> ^( TOK_TABLE_OR_COL identifier ) )
            // FromClauseParser.g:60:5: identifier
            {
            pushFollow(FOLLOW_identifier_in_tableOrColumn131);
            identifier5=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier5.getTree());

            // AST REWRITE
            // elements: identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 60:16: -> ^( TOK_TABLE_OR_COL identifier )
            {
                // FromClauseParser.g:60:19: ^( TOK_TABLE_OR_COL identifier )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_TABLE_OR_COL, "TOK_TABLE_OR_COL")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.msgs.pop(); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tableOrColumn"


    public static class expressionList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressionList"
    // FromClauseParser.g:63:1: expressionList : expression ( COMMA expression )* -> ^( TOK_EXPLIST ( expression )+ ) ;
    public final HiveParser_FromClauseParser.expressionList_return expressionList() throws RecognitionException {
        HiveParser_FromClauseParser.expressionList_return retval = new HiveParser_FromClauseParser.expressionList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMMA7=null;
        HiveParser_IdentifiersParser.expression_return expression6 =null;

        HiveParser_IdentifiersParser.expression_return expression8 =null;


        CommonTree COMMA7_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         gParent.msgs.push("expression list"); 
        try {
            // FromClauseParser.g:66:5: ( expression ( COMMA expression )* -> ^( TOK_EXPLIST ( expression )+ ) )
            // FromClauseParser.g:67:5: expression ( COMMA expression )*
            {
            pushFollow(FOLLOW_expression_in_expressionList170);
            expression6=gHiveParser.expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression6.getTree());

            // FromClauseParser.g:67:16: ( COMMA expression )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==COMMA) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // FromClauseParser.g:67:17: COMMA expression
            	    {
            	    COMMA7=(Token)match(input,COMMA,FOLLOW_COMMA_in_expressionList173); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA7);


            	    pushFollow(FOLLOW_expression_in_expressionList175);
            	    expression8=gHiveParser.expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression8.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 67:36: -> ^( TOK_EXPLIST ( expression )+ )
            {
                // FromClauseParser.g:67:39: ^( TOK_EXPLIST ( expression )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_EXPLIST, "TOK_EXPLIST")
                , root_1);

                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.msgs.pop(); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressionList"


    public static class aliasList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "aliasList"
    // FromClauseParser.g:70:1: aliasList : identifier ( COMMA identifier )* -> ^( TOK_ALIASLIST ( identifier )+ ) ;
    public final HiveParser_FromClauseParser.aliasList_return aliasList() throws RecognitionException {
        HiveParser_FromClauseParser.aliasList_return retval = new HiveParser_FromClauseParser.aliasList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMMA10=null;
        HiveParser_IdentifiersParser.identifier_return identifier9 =null;

        HiveParser_IdentifiersParser.identifier_return identifier11 =null;


        CommonTree COMMA10_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
         gParent.msgs.push("alias list"); 
        try {
            // FromClauseParser.g:73:5: ( identifier ( COMMA identifier )* -> ^( TOK_ALIASLIST ( identifier )+ ) )
            // FromClauseParser.g:74:5: identifier ( COMMA identifier )*
            {
            pushFollow(FOLLOW_identifier_in_aliasList217);
            identifier9=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier9.getTree());

            // FromClauseParser.g:74:16: ( COMMA identifier )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==COMMA) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // FromClauseParser.g:74:17: COMMA identifier
            	    {
            	    COMMA10=(Token)match(input,COMMA,FOLLOW_COMMA_in_aliasList220); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA10);


            	    pushFollow(FOLLOW_identifier_in_aliasList222);
            	    identifier11=gHiveParser.identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identifier.add(identifier11.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // AST REWRITE
            // elements: identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 74:36: -> ^( TOK_ALIASLIST ( identifier )+ )
            {
                // FromClauseParser.g:74:39: ^( TOK_ALIASLIST ( identifier )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_ALIASLIST, "TOK_ALIASLIST")
                , root_1);

                if ( !(stream_identifier.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_identifier.nextTree());

                }
                stream_identifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.msgs.pop(); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "aliasList"


    public static class fromClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fromClause"
    // FromClauseParser.g:79:1: fromClause : ( KW_FROM joinSource -> ^( TOK_FROM joinSource ) | KW_FROM coalesceSource -> ^( TOK_FROM coalesceSource ) );
    public final HiveParser_FromClauseParser.fromClause_return fromClause() throws RecognitionException {
        HiveParser_FromClauseParser.fromClause_return retval = new HiveParser_FromClauseParser.fromClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_FROM12=null;
        Token KW_FROM14=null;
        HiveParser_FromClauseParser.joinSource_return joinSource13 =null;

        HiveParser_FromClauseParser.coalesceSource_return coalesceSource15 =null;


        CommonTree KW_FROM12_tree=null;
        CommonTree KW_FROM14_tree=null;
        RewriteRuleTokenStream stream_KW_FROM=new RewriteRuleTokenStream(adaptor,"token KW_FROM");
        RewriteRuleSubtreeStream stream_coalesceSource=new RewriteRuleSubtreeStream(adaptor,"rule coalesceSource");
        RewriteRuleSubtreeStream stream_joinSource=new RewriteRuleSubtreeStream(adaptor,"rule joinSource");
         gParent.msgs.push("from clause"); 
        try {
            // FromClauseParser.g:82:5: ( KW_FROM joinSource -> ^( TOK_FROM joinSource ) | KW_FROM coalesceSource -> ^( TOK_FROM coalesceSource ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==KW_FROM) ) {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1 >= Identifier && LA4_1 <= KW_ADD)||LA4_1==KW_AFTER||(LA4_1 >= KW_ALTER && LA4_1 <= KW_ANALYZE)||(LA4_1 >= KW_ARCHIVE && LA4_1 <= KW_CASCADE)||LA4_1==KW_CHANGE||(LA4_1 >= KW_CLUSTER && LA4_1 <= KW_CLUSTERSTATUS)||LA4_1==KW_COLLECTION||(LA4_1 >= KW_COLUMNS && LA4_1 <= KW_CONCATENATE)||LA4_1==KW_CONTINUE||LA4_1==KW_CREATE||LA4_1==KW_CUBE||(LA4_1 >= KW_CURSOR && LA4_1 <= KW_DATA)||(LA4_1 >= KW_DATABASES && LA4_1 <= KW_DISABLE)||(LA4_1 >= KW_DISTRIBUTE && LA4_1 <= KW_DOUBLE)||(LA4_1 >= KW_DROP && LA4_1 <= KW_ELEM_TYPE)||LA4_1==KW_ENABLE||LA4_1==KW_ESCAPED||(LA4_1 >= KW_EXCLUSIVE && LA4_1 <= KW_EXPORT)||(LA4_1 >= KW_EXTERNAL && LA4_1 <= KW_FLOAT)||(LA4_1 >= KW_FOR && LA4_1 <= KW_FORMATTED)||LA4_1==KW_FULL||(LA4_1 >= KW_FUNCTIONS && LA4_1 <= KW_GROUPING)||(LA4_1 >= KW_HOLD_DDLTIME && LA4_1 <= KW_IDXPROPERTIES)||(LA4_1 >= KW_IGNORE && LA4_1 <= KW_INTERSECTJOIN)||(LA4_1 >= KW_INTO && LA4_1 <= KW_ITEMS)||(LA4_1 >= KW_KEYS && LA4_1 <= KW_LEFT)||(LA4_1 >= KW_LIKE && LA4_1 <= KW_LONG)||(LA4_1 >= KW_MAPJOIN && LA4_1 <= KW_MINUS)||(LA4_1 >= KW_MSCK && LA4_1 <= KW_NOSCAN)||(LA4_1 >= KW_NO_DROP && LA4_1 <= KW_OFFLINE)||LA4_1==KW_OPTION||(LA4_1 >= KW_ORCFILE && LA4_1 <= KW_OUTPUTFORMAT)||LA4_1==KW_OVERWRITE||(LA4_1 >= KW_PARTITION && LA4_1 <= KW_PLUS)||(LA4_1 >= KW_PRETTY && LA4_1 <= KW_RECORDWRITER)||(LA4_1 >= KW_REGEXP && LA4_1 <= KW_SCHEMAS)||(LA4_1 >= KW_SEMI && LA4_1 <= KW_STRUCT)||(LA4_1 >= KW_TABLE && LA4_1 <= KW_TABLES)||(LA4_1 >= KW_TBLPROPERTIES && LA4_1 <= KW_TEXTFILE)||(LA4_1 >= KW_TIMESTAMP && LA4_1 <= KW_TOUCH)||(LA4_1 >= KW_TRIGGER && LA4_1 <= KW_UNARCHIVE)||(LA4_1 >= KW_UNDO && LA4_1 <= KW_UPDATE)||(LA4_1 >= KW_USE && LA4_1 <= KW_VIEW)||LA4_1==KW_WHILE||LA4_1==KW_WITH||LA4_1==LPAREN) ) {
                    alt4=1;
                }
                else if ( (LA4_1==KW_COALESCE) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // FromClauseParser.g:83:5: KW_FROM joinSource
                    {
                    KW_FROM12=(Token)match(input,KW_FROM,FOLLOW_KW_FROM_in_fromClause266); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_FROM.add(KW_FROM12);


                    pushFollow(FOLLOW_joinSource_in_fromClause268);
                    joinSource13=joinSource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_joinSource.add(joinSource13.getTree());

                    // AST REWRITE
                    // elements: joinSource
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 83:24: -> ^( TOK_FROM joinSource )
                    {
                        // FromClauseParser.g:83:27: ^( TOK_FROM joinSource )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_FROM, "TOK_FROM")
                        , root_1);

                        adaptor.addChild(root_1, stream_joinSource.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // FromClauseParser.g:84:7: KW_FROM coalesceSource
                    {
                    KW_FROM14=(Token)match(input,KW_FROM,FOLLOW_KW_FROM_in_fromClause284); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_FROM.add(KW_FROM14);


                    pushFollow(FOLLOW_coalesceSource_in_fromClause286);
                    coalesceSource15=coalesceSource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_coalesceSource.add(coalesceSource15.getTree());

                    // AST REWRITE
                    // elements: coalesceSource
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 84:30: -> ^( TOK_FROM coalesceSource )
                    {
                        // FromClauseParser.g:84:33: ^( TOK_FROM coalesceSource )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_FROM, "TOK_FROM")
                        , root_1);

                        adaptor.addChild(root_1, stream_coalesceSource.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.msgs.pop(); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fromClause"


    public static class coalesceSource_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "coalesceSource"
    // FromClauseParser.g:87:1: coalesceSource : KW_COALESCE fromSource -> ^( TOK_COALESCE fromSource ) ;
    public final HiveParser_FromClauseParser.coalesceSource_return coalesceSource() throws RecognitionException {
        HiveParser_FromClauseParser.coalesceSource_return retval = new HiveParser_FromClauseParser.coalesceSource_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_COALESCE16=null;
        HiveParser_FromClauseParser.fromSource_return fromSource17 =null;


        CommonTree KW_COALESCE16_tree=null;
        RewriteRuleTokenStream stream_KW_COALESCE=new RewriteRuleTokenStream(adaptor,"token KW_COALESCE");
        RewriteRuleSubtreeStream stream_fromSource=new RewriteRuleSubtreeStream(adaptor,"rule fromSource");
        gParent.msgs.push("coalesce source"); 
        try {
            // FromClauseParser.g:90:2: ( KW_COALESCE fromSource -> ^( TOK_COALESCE fromSource ) )
            // FromClauseParser.g:91:2: KW_COALESCE fromSource
            {
            KW_COALESCE16=(Token)match(input,KW_COALESCE,FOLLOW_KW_COALESCE_in_coalesceSource323); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_COALESCE.add(KW_COALESCE16);


            pushFollow(FOLLOW_fromSource_in_coalesceSource325);
            fromSource17=fromSource();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fromSource.add(fromSource17.getTree());

            // AST REWRITE
            // elements: fromSource
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 91:25: -> ^( TOK_COALESCE fromSource )
            {
                // FromClauseParser.g:91:28: ^( TOK_COALESCE fromSource )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_COALESCE, "TOK_COALESCE")
                , root_1);

                adaptor.addChild(root_1, stream_fromSource.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {gParent.msgs.pop(); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "coalesceSource"


    public static class joinSource_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "joinSource"
    // FromClauseParser.g:94:1: joinSource : ( fromSource ( joinToken ^ fromSource ( KW_ON ! expression )? )* | uniqueJoinToken ^ uniqueJoinSource ( COMMA ! uniqueJoinSource )+ | multipleTrack | exclusivenessJoinSource | intersectJoinSource | projectSource );
    public final HiveParser_FromClauseParser.joinSource_return joinSource() throws RecognitionException {
        HiveParser_FromClauseParser.joinSource_return retval = new HiveParser_FromClauseParser.joinSource_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_ON21=null;
        Token COMMA25=null;
        HiveParser_FromClauseParser.fromSource_return fromSource18 =null;

        HiveParser_FromClauseParser.joinToken_return joinToken19 =null;

        HiveParser_FromClauseParser.fromSource_return fromSource20 =null;

        HiveParser_IdentifiersParser.expression_return expression22 =null;

        HiveParser_FromClauseParser.uniqueJoinToken_return uniqueJoinToken23 =null;

        HiveParser_FromClauseParser.uniqueJoinSource_return uniqueJoinSource24 =null;

        HiveParser_FromClauseParser.uniqueJoinSource_return uniqueJoinSource26 =null;

        HiveParser_FromClauseParser.multipleTrack_return multipleTrack27 =null;

        HiveParser_FromClauseParser.exclusivenessJoinSource_return exclusivenessJoinSource28 =null;

        HiveParser_FromClauseParser.intersectJoinSource_return intersectJoinSource29 =null;

        HiveParser_FromClauseParser.projectSource_return projectSource30 =null;


        CommonTree KW_ON21_tree=null;
        CommonTree COMMA25_tree=null;

         gParent.msgs.push("join source"); 
        try {
            // FromClauseParser.g:97:5: ( fromSource ( joinToken ^ fromSource ( KW_ON ! expression )? )* | uniqueJoinToken ^ uniqueJoinSource ( COMMA ! uniqueJoinSource )+ | multipleTrack | exclusivenessJoinSource | intersectJoinSource | projectSource )
            int alt8=6;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // FromClauseParser.g:97:7: fromSource ( joinToken ^ fromSource ( KW_ON ! expression )? )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_fromSource_in_joinSource357);
                    fromSource18=fromSource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fromSource18.getTree());

                    // FromClauseParser.g:97:18: ( joinToken ^ fromSource ( KW_ON ! expression )? )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==KW_CROSS||LA6_0==KW_FULL||LA6_0==KW_INNER||LA6_0==KW_JOIN||LA6_0==KW_LEFT||LA6_0==KW_RIGHT) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // FromClauseParser.g:97:20: joinToken ^ fromSource ( KW_ON ! expression )?
                    	    {
                    	    pushFollow(FOLLOW_joinToken_in_joinSource361);
                    	    joinToken19=joinToken();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(joinToken19.getTree(), root_0);

                    	    pushFollow(FOLLOW_fromSource_in_joinSource364);
                    	    fromSource20=fromSource();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, fromSource20.getTree());

                    	    // FromClauseParser.g:97:42: ( KW_ON ! expression )?
                    	    int alt5=2;
                    	    int LA5_0 = input.LA(1);

                    	    if ( (LA5_0==KW_ON) ) {
                    	        alt5=1;
                    	    }
                    	    switch (alt5) {
                    	        case 1 :
                    	            // FromClauseParser.g:97:43: KW_ON ! expression
                    	            {
                    	            KW_ON21=(Token)match(input,KW_ON,FOLLOW_KW_ON_in_joinSource367); if (state.failed) return retval;

                    	            pushFollow(FOLLOW_expression_in_joinSource370);
                    	            expression22=gHiveParser.expression();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression22.getTree());

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // FromClauseParser.g:98:7: uniqueJoinToken ^ uniqueJoinSource ( COMMA ! uniqueJoinSource )+
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_uniqueJoinToken_in_joinSource383);
                    uniqueJoinToken23=uniqueJoinToken();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(uniqueJoinToken23.getTree(), root_0);

                    pushFollow(FOLLOW_uniqueJoinSource_in_joinSource386);
                    uniqueJoinSource24=uniqueJoinSource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, uniqueJoinSource24.getTree());

                    // FromClauseParser.g:98:41: ( COMMA ! uniqueJoinSource )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==COMMA) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // FromClauseParser.g:98:42: COMMA ! uniqueJoinSource
                    	    {
                    	    COMMA25=(Token)match(input,COMMA,FOLLOW_COMMA_in_joinSource389); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_uniqueJoinSource_in_joinSource392);
                    	    uniqueJoinSource26=uniqueJoinSource();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, uniqueJoinSource26.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // FromClauseParser.g:99:7: multipleTrack
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_multipleTrack_in_joinSource402);
                    multipleTrack27=multipleTrack();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, multipleTrack27.getTree());

                    }
                    break;
                case 4 :
                    // FromClauseParser.g:100:7: exclusivenessJoinSource
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_exclusivenessJoinSource_in_joinSource410);
                    exclusivenessJoinSource28=exclusivenessJoinSource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exclusivenessJoinSource28.getTree());

                    }
                    break;
                case 5 :
                    // FromClauseParser.g:101:7: intersectJoinSource
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_intersectJoinSource_in_joinSource418);
                    intersectJoinSource29=intersectJoinSource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, intersectJoinSource29.getTree());

                    }
                    break;
                case 6 :
                    // FromClauseParser.g:102:7: projectSource
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_projectSource_in_joinSource426);
                    projectSource30=projectSource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, projectSource30.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.msgs.pop(); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "joinSource"


    public static class uniqueJoinSource_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "uniqueJoinSource"
    // FromClauseParser.g:105:1: uniqueJoinSource : ( KW_PRESERVE )? fromSource uniqueJoinExpr ;
    public final HiveParser_FromClauseParser.uniqueJoinSource_return uniqueJoinSource() throws RecognitionException {
        HiveParser_FromClauseParser.uniqueJoinSource_return retval = new HiveParser_FromClauseParser.uniqueJoinSource_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_PRESERVE31=null;
        HiveParser_FromClauseParser.fromSource_return fromSource32 =null;

        HiveParser_FromClauseParser.uniqueJoinExpr_return uniqueJoinExpr33 =null;


        CommonTree KW_PRESERVE31_tree=null;

         gParent.msgs.push("join source"); 
        try {
            // FromClauseParser.g:108:5: ( ( KW_PRESERVE )? fromSource uniqueJoinExpr )
            // FromClauseParser.g:108:7: ( KW_PRESERVE )? fromSource uniqueJoinExpr
            {
            root_0 = (CommonTree)adaptor.nil();


            // FromClauseParser.g:108:7: ( KW_PRESERVE )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==KW_PRESERVE) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // FromClauseParser.g:108:7: KW_PRESERVE
                    {
                    KW_PRESERVE31=(Token)match(input,KW_PRESERVE,FOLLOW_KW_PRESERVE_in_uniqueJoinSource454); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_PRESERVE31_tree = 
                    (CommonTree)adaptor.create(KW_PRESERVE31)
                    ;
                    adaptor.addChild(root_0, KW_PRESERVE31_tree);
                    }

                    }
                    break;

            }


            pushFollow(FOLLOW_fromSource_in_uniqueJoinSource457);
            fromSource32=fromSource();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, fromSource32.getTree());

            pushFollow(FOLLOW_uniqueJoinExpr_in_uniqueJoinSource459);
            uniqueJoinExpr33=uniqueJoinExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, uniqueJoinExpr33.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.msgs.pop(); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "uniqueJoinSource"


    public static class uniqueJoinExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "uniqueJoinExpr"
    // FromClauseParser.g:111:1: uniqueJoinExpr : LPAREN e1+= expression ( COMMA e1+= expression )* RPAREN -> ^( TOK_EXPLIST ( $e1)* ) ;
    public final HiveParser_FromClauseParser.uniqueJoinExpr_return uniqueJoinExpr() throws RecognitionException {
        HiveParser_FromClauseParser.uniqueJoinExpr_return retval = new HiveParser_FromClauseParser.uniqueJoinExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LPAREN34=null;
        Token COMMA35=null;
        Token RPAREN36=null;
        List list_e1=null;
        RuleReturnScope e1 = null;
        CommonTree LPAREN34_tree=null;
        CommonTree COMMA35_tree=null;
        CommonTree RPAREN36_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         gParent.msgs.push("unique join expression list"); 
        try {
            // FromClauseParser.g:114:5: ( LPAREN e1+= expression ( COMMA e1+= expression )* RPAREN -> ^( TOK_EXPLIST ( $e1)* ) )
            // FromClauseParser.g:114:7: LPAREN e1+= expression ( COMMA e1+= expression )* RPAREN
            {
            LPAREN34=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_uniqueJoinExpr486); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN34);


            pushFollow(FOLLOW_expression_in_uniqueJoinExpr490);
            e1=gHiveParser.expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(e1.getTree());
            if (list_e1==null) list_e1=new ArrayList();
            list_e1.add(e1.getTree());


            // FromClauseParser.g:114:29: ( COMMA e1+= expression )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==COMMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // FromClauseParser.g:114:30: COMMA e1+= expression
            	    {
            	    COMMA35=(Token)match(input,COMMA,FOLLOW_COMMA_in_uniqueJoinExpr493); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA35);


            	    pushFollow(FOLLOW_expression_in_uniqueJoinExpr497);
            	    e1=gHiveParser.expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(e1.getTree());
            	    if (list_e1==null) list_e1=new ArrayList();
            	    list_e1.add(e1.getTree());


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            RPAREN36=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_uniqueJoinExpr501); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN36);


            // AST REWRITE
            // elements: e1
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: e1
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"token e1",list_e1);
            root_0 = (CommonTree)adaptor.nil();
            // 115:7: -> ^( TOK_EXPLIST ( $e1)* )
            {
                // FromClauseParser.g:115:10: ^( TOK_EXPLIST ( $e1)* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_EXPLIST, "TOK_EXPLIST")
                , root_1);

                // FromClauseParser.g:115:25: ( $e1)*
                while ( stream_e1.hasNext() ) {
                    adaptor.addChild(root_1, stream_e1.nextTree());

                }
                stream_e1.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.msgs.pop(); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "uniqueJoinExpr"


    public static class uniqueJoinToken_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "uniqueJoinToken"
    // FromClauseParser.g:118:1: uniqueJoinToken : KW_UNIQUEJOIN -> TOK_UNIQUEJOIN ;
    public final HiveParser_FromClauseParser.uniqueJoinToken_return uniqueJoinToken() throws RecognitionException {
        HiveParser_FromClauseParser.uniqueJoinToken_return retval = new HiveParser_FromClauseParser.uniqueJoinToken_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_UNIQUEJOIN37=null;

        CommonTree KW_UNIQUEJOIN37_tree=null;
        RewriteRuleTokenStream stream_KW_UNIQUEJOIN=new RewriteRuleTokenStream(adaptor,"token KW_UNIQUEJOIN");

         gParent.msgs.push("unique join"); 
        try {
            // FromClauseParser.g:121:5: ( KW_UNIQUEJOIN -> TOK_UNIQUEJOIN )
            // FromClauseParser.g:121:7: KW_UNIQUEJOIN
            {
            KW_UNIQUEJOIN37=(Token)match(input,KW_UNIQUEJOIN,FOLLOW_KW_UNIQUEJOIN_in_uniqueJoinToken544); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_UNIQUEJOIN.add(KW_UNIQUEJOIN37);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 121:21: -> TOK_UNIQUEJOIN
            {
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(TOK_UNIQUEJOIN, "TOK_UNIQUEJOIN")
                );

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.msgs.pop(); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "uniqueJoinToken"


    public static class joinToken_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "joinToken"
    // FromClauseParser.g:123:1: joinToken : ( KW_JOIN -> TOK_JOIN | KW_INNER KW_JOIN -> TOK_JOIN | KW_CROSS KW_JOIN -> TOK_CROSSJOIN | KW_LEFT ( KW_OUTER )? KW_JOIN -> TOK_LEFTOUTERJOIN | KW_RIGHT ( KW_OUTER )? KW_JOIN -> TOK_RIGHTOUTERJOIN | KW_FULL ( KW_OUTER )? KW_JOIN -> TOK_FULLOUTERJOIN | KW_LEFT KW_SEMI KW_JOIN -> TOK_LEFTSEMIJOIN );
    public final HiveParser_FromClauseParser.joinToken_return joinToken() throws RecognitionException {
        HiveParser_FromClauseParser.joinToken_return retval = new HiveParser_FromClauseParser.joinToken_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_JOIN38=null;
        Token KW_INNER39=null;
        Token KW_JOIN40=null;
        Token KW_CROSS41=null;
        Token KW_JOIN42=null;
        Token KW_LEFT43=null;
        Token KW_OUTER44=null;
        Token KW_JOIN45=null;
        Token KW_RIGHT46=null;
        Token KW_OUTER47=null;
        Token KW_JOIN48=null;
        Token KW_FULL49=null;
        Token KW_OUTER50=null;
        Token KW_JOIN51=null;
        Token KW_LEFT52=null;
        Token KW_SEMI53=null;
        Token KW_JOIN54=null;

        CommonTree KW_JOIN38_tree=null;
        CommonTree KW_INNER39_tree=null;
        CommonTree KW_JOIN40_tree=null;
        CommonTree KW_CROSS41_tree=null;
        CommonTree KW_JOIN42_tree=null;
        CommonTree KW_LEFT43_tree=null;
        CommonTree KW_OUTER44_tree=null;
        CommonTree KW_JOIN45_tree=null;
        CommonTree KW_RIGHT46_tree=null;
        CommonTree KW_OUTER47_tree=null;
        CommonTree KW_JOIN48_tree=null;
        CommonTree KW_FULL49_tree=null;
        CommonTree KW_OUTER50_tree=null;
        CommonTree KW_JOIN51_tree=null;
        CommonTree KW_LEFT52_tree=null;
        CommonTree KW_SEMI53_tree=null;
        CommonTree KW_JOIN54_tree=null;
        RewriteRuleTokenStream stream_KW_INNER=new RewriteRuleTokenStream(adaptor,"token KW_INNER");
        RewriteRuleTokenStream stream_KW_RIGHT=new RewriteRuleTokenStream(adaptor,"token KW_RIGHT");
        RewriteRuleTokenStream stream_KW_OUTER=new RewriteRuleTokenStream(adaptor,"token KW_OUTER");
        RewriteRuleTokenStream stream_KW_JOIN=new RewriteRuleTokenStream(adaptor,"token KW_JOIN");
        RewriteRuleTokenStream stream_KW_LEFT=new RewriteRuleTokenStream(adaptor,"token KW_LEFT");
        RewriteRuleTokenStream stream_KW_CROSS=new RewriteRuleTokenStream(adaptor,"token KW_CROSS");
        RewriteRuleTokenStream stream_KW_SEMI=new RewriteRuleTokenStream(adaptor,"token KW_SEMI");
        RewriteRuleTokenStream stream_KW_FULL=new RewriteRuleTokenStream(adaptor,"token KW_FULL");

         gParent.msgs.push("join type specifier"); 
        try {
            // FromClauseParser.g:126:5: ( KW_JOIN -> TOK_JOIN | KW_INNER KW_JOIN -> TOK_JOIN | KW_CROSS KW_JOIN -> TOK_CROSSJOIN | KW_LEFT ( KW_OUTER )? KW_JOIN -> TOK_LEFTOUTERJOIN | KW_RIGHT ( KW_OUTER )? KW_JOIN -> TOK_RIGHTOUTERJOIN | KW_FULL ( KW_OUTER )? KW_JOIN -> TOK_FULLOUTERJOIN | KW_LEFT KW_SEMI KW_JOIN -> TOK_LEFTSEMIJOIN )
            int alt14=7;
            switch ( input.LA(1) ) {
            case KW_JOIN:
                {
                alt14=1;
                }
                break;
            case KW_INNER:
                {
                alt14=2;
                }
                break;
            case KW_CROSS:
                {
                alt14=3;
                }
                break;
            case KW_LEFT:
                {
                int LA14_4 = input.LA(2);

                if ( (LA14_4==KW_SEMI) ) {
                    alt14=7;
                }
                else if ( (LA14_4==KW_JOIN||LA14_4==KW_OUTER) ) {
                    alt14=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 4, input);

                    throw nvae;

                }
                }
                break;
            case KW_RIGHT:
                {
                alt14=5;
                }
                break;
            case KW_FULL:
                {
                alt14=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // FromClauseParser.g:127:7: KW_JOIN
                    {
                    KW_JOIN38=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken576); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN38);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 127:36: -> TOK_JOIN
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(TOK_JOIN, "TOK_JOIN")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // FromClauseParser.g:128:7: KW_INNER KW_JOIN
                    {
                    KW_INNER39=(Token)match(input,KW_INNER,FOLLOW_KW_INNER_in_joinToken609); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_INNER.add(KW_INNER39);


                    KW_JOIN40=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken611); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN40);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 128:36: -> TOK_JOIN
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(TOK_JOIN, "TOK_JOIN")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // FromClauseParser.g:129:7: KW_CROSS KW_JOIN
                    {
                    KW_CROSS41=(Token)match(input,KW_CROSS,FOLLOW_KW_CROSS_in_joinToken635); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_CROSS.add(KW_CROSS41);


                    KW_JOIN42=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken637); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN42);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 129:36: -> TOK_CROSSJOIN
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(TOK_CROSSJOIN, "TOK_CROSSJOIN")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // FromClauseParser.g:130:7: KW_LEFT ( KW_OUTER )? KW_JOIN
                    {
                    KW_LEFT43=(Token)match(input,KW_LEFT,FOLLOW_KW_LEFT_in_joinToken661); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_LEFT.add(KW_LEFT43);


                    // FromClauseParser.g:130:16: ( KW_OUTER )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==KW_OUTER) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // FromClauseParser.g:130:17: KW_OUTER
                            {
                            KW_OUTER44=(Token)match(input,KW_OUTER,FOLLOW_KW_OUTER_in_joinToken665); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_OUTER.add(KW_OUTER44);


                            }
                            break;

                    }


                    KW_JOIN45=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken669); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN45);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 130:36: -> TOK_LEFTOUTERJOIN
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(TOK_LEFTOUTERJOIN, "TOK_LEFTOUTERJOIN")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // FromClauseParser.g:131:7: KW_RIGHT ( KW_OUTER )? KW_JOIN
                    {
                    KW_RIGHT46=(Token)match(input,KW_RIGHT,FOLLOW_KW_RIGHT_in_joinToken681); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_RIGHT.add(KW_RIGHT46);


                    // FromClauseParser.g:131:16: ( KW_OUTER )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==KW_OUTER) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // FromClauseParser.g:131:17: KW_OUTER
                            {
                            KW_OUTER47=(Token)match(input,KW_OUTER,FOLLOW_KW_OUTER_in_joinToken684); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_OUTER.add(KW_OUTER47);


                            }
                            break;

                    }


                    KW_JOIN48=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken688); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN48);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 131:36: -> TOK_RIGHTOUTERJOIN
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(TOK_RIGHTOUTERJOIN, "TOK_RIGHTOUTERJOIN")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // FromClauseParser.g:132:7: KW_FULL ( KW_OUTER )? KW_JOIN
                    {
                    KW_FULL49=(Token)match(input,KW_FULL,FOLLOW_KW_FULL_in_joinToken700); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_FULL.add(KW_FULL49);


                    // FromClauseParser.g:132:16: ( KW_OUTER )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==KW_OUTER) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // FromClauseParser.g:132:17: KW_OUTER
                            {
                            KW_OUTER50=(Token)match(input,KW_OUTER,FOLLOW_KW_OUTER_in_joinToken704); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_OUTER.add(KW_OUTER50);


                            }
                            break;

                    }


                    KW_JOIN51=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken708); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN51);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 132:36: -> TOK_FULLOUTERJOIN
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(TOK_FULLOUTERJOIN, "TOK_FULLOUTERJOIN")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // FromClauseParser.g:133:7: KW_LEFT KW_SEMI KW_JOIN
                    {
                    KW_LEFT52=(Token)match(input,KW_LEFT,FOLLOW_KW_LEFT_in_joinToken720); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_LEFT.add(KW_LEFT52);


                    KW_SEMI53=(Token)match(input,KW_SEMI,FOLLOW_KW_SEMI_in_joinToken722); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SEMI.add(KW_SEMI53);


                    KW_JOIN54=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken724); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN54);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 133:36: -> TOK_LEFTSEMIJOIN
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(TOK_LEFTSEMIJOIN, "TOK_LEFTSEMIJOIN")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.msgs.pop(); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "joinToken"


    public static class lateralView_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lateralView"
    // FromClauseParser.g:136:1: lateralView : ( KW_LATERAL KW_VIEW KW_OUTER function tableAlias KW_AS identifier ( COMMA identifier )* -> ^( TOK_LATERAL_VIEW_OUTER ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )+ tableAlias ) ) ) | KW_LATERAL KW_VIEW function tableAlias KW_AS identifier ( COMMA identifier )* -> ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )+ tableAlias ) ) ) );
    public final HiveParser_FromClauseParser.lateralView_return lateralView() throws RecognitionException {
        HiveParser_FromClauseParser.lateralView_return retval = new HiveParser_FromClauseParser.lateralView_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_LATERAL55=null;
        Token KW_VIEW56=null;
        Token KW_OUTER57=null;
        Token KW_AS60=null;
        Token COMMA62=null;
        Token KW_LATERAL64=null;
        Token KW_VIEW65=null;
        Token KW_AS68=null;
        Token COMMA70=null;
        HiveParser_IdentifiersParser.function_return function58 =null;

        HiveParser_FromClauseParser.tableAlias_return tableAlias59 =null;

        HiveParser_IdentifiersParser.identifier_return identifier61 =null;

        HiveParser_IdentifiersParser.identifier_return identifier63 =null;

        HiveParser_IdentifiersParser.function_return function66 =null;

        HiveParser_FromClauseParser.tableAlias_return tableAlias67 =null;

        HiveParser_IdentifiersParser.identifier_return identifier69 =null;

        HiveParser_IdentifiersParser.identifier_return identifier71 =null;


        CommonTree KW_LATERAL55_tree=null;
        CommonTree KW_VIEW56_tree=null;
        CommonTree KW_OUTER57_tree=null;
        CommonTree KW_AS60_tree=null;
        CommonTree COMMA62_tree=null;
        CommonTree KW_LATERAL64_tree=null;
        CommonTree KW_VIEW65_tree=null;
        CommonTree KW_AS68_tree=null;
        CommonTree COMMA70_tree=null;
        RewriteRuleTokenStream stream_KW_LATERAL=new RewriteRuleTokenStream(adaptor,"token KW_LATERAL");
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleTokenStream stream_KW_OUTER=new RewriteRuleTokenStream(adaptor,"token KW_OUTER");
        RewriteRuleTokenStream stream_KW_VIEW=new RewriteRuleTokenStream(adaptor,"token KW_VIEW");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_tableAlias=new RewriteRuleSubtreeStream(adaptor,"rule tableAlias");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        gParent.msgs.push("lateral view"); 
        try {
            // FromClauseParser.g:139:2: ( KW_LATERAL KW_VIEW KW_OUTER function tableAlias KW_AS identifier ( COMMA identifier )* -> ^( TOK_LATERAL_VIEW_OUTER ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )+ tableAlias ) ) ) | KW_LATERAL KW_VIEW function tableAlias KW_AS identifier ( COMMA identifier )* -> ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )+ tableAlias ) ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==KW_LATERAL) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==KW_VIEW) ) {
                    int LA17_2 = input.LA(3);

                    if ( (LA17_2==KW_OUTER) ) {
                        alt17=1;
                    }
                    else if ( ((LA17_2 >= Identifier && LA17_2 <= KW_ADD)||LA17_2==KW_AFTER||(LA17_2 >= KW_ALTER && LA17_2 <= KW_ANALYZE)||(LA17_2 >= KW_ARCHIVE && LA17_2 <= KW_CASCADE)||LA17_2==KW_CHANGE||(LA17_2 >= KW_CLUSTER && LA17_2 <= KW_CLUSTERSTATUS)||LA17_2==KW_COLLECTION||(LA17_2 >= KW_COLUMNS && LA17_2 <= KW_CONCATENATE)||LA17_2==KW_CONTINUE||LA17_2==KW_CREATE||LA17_2==KW_CUBE||(LA17_2 >= KW_CURSOR && LA17_2 <= KW_DATA)||(LA17_2 >= KW_DATABASES && LA17_2 <= KW_DISABLE)||(LA17_2 >= KW_DISTRIBUTE && LA17_2 <= KW_DOUBLE)||(LA17_2 >= KW_DROP && LA17_2 <= KW_ELEM_TYPE)||LA17_2==KW_ENABLE||LA17_2==KW_ESCAPED||LA17_2==KW_EXCLUSIVE||(LA17_2 >= KW_EXISTS && LA17_2 <= KW_EXPORT)||(LA17_2 >= KW_EXTERNAL && LA17_2 <= KW_FLOAT)||(LA17_2 >= KW_FOR && LA17_2 <= KW_FORMATTED)||LA17_2==KW_FULL||(LA17_2 >= KW_FUNCTIONS && LA17_2 <= KW_GROUPING)||(LA17_2 >= KW_HOLD_DDLTIME && LA17_2 <= KW_INTERSECT)||(LA17_2 >= KW_INTO && LA17_2 <= KW_ITEMS)||(LA17_2 >= KW_KEYS && LA17_2 <= KW_LEFT)||(LA17_2 >= KW_LIKE && LA17_2 <= KW_LONG)||(LA17_2 >= KW_MAP && LA17_2 <= KW_MINUS)||(LA17_2 >= KW_MSCK && LA17_2 <= KW_NOSCAN)||(LA17_2 >= KW_NO_DROP && LA17_2 <= KW_OFFLINE)||LA17_2==KW_OPTION||(LA17_2 >= KW_ORCFILE && LA17_2 <= KW_OUT)||(LA17_2 >= KW_OUTPUTDRIVER && LA17_2 <= KW_OUTPUTFORMAT)||LA17_2==KW_OVERWRITE||(LA17_2 >= KW_PARTITION && LA17_2 <= KW_PLUS)||(LA17_2 >= KW_PRETTY && LA17_2 <= KW_PROCEDURE)||(LA17_2 >= KW_PROTECTION && LA17_2 <= KW_RECORDWRITER)||(LA17_2 >= KW_REGEXP && LA17_2 <= KW_SCHEMAS)||(LA17_2 >= KW_SEMI && LA17_2 <= KW_STRUCT)||(LA17_2 >= KW_TABLE && LA17_2 <= KW_TABLES)||(LA17_2 >= KW_TBLPROPERTIES && LA17_2 <= KW_TEXTFILE)||(LA17_2 >= KW_TIMESTAMP && LA17_2 <= KW_TOUCH)||(LA17_2 >= KW_TRIGGER && LA17_2 <= KW_UNARCHIVE)||(LA17_2 >= KW_UNDO && LA17_2 <= KW_UNIONTYPE)||(LA17_2 >= KW_UNLOCK && LA17_2 <= KW_UPDATE)||(LA17_2 >= KW_USE && LA17_2 <= KW_VIEW)||LA17_2==KW_WHILE||LA17_2==KW_WITH) ) {
                        alt17=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // FromClauseParser.g:140:2: KW_LATERAL KW_VIEW KW_OUTER function tableAlias KW_AS identifier ( COMMA identifier )*
                    {
                    KW_LATERAL55=(Token)match(input,KW_LATERAL,FOLLOW_KW_LATERAL_in_lateralView758); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_LATERAL.add(KW_LATERAL55);


                    KW_VIEW56=(Token)match(input,KW_VIEW,FOLLOW_KW_VIEW_in_lateralView760); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_VIEW.add(KW_VIEW56);


                    KW_OUTER57=(Token)match(input,KW_OUTER,FOLLOW_KW_OUTER_in_lateralView762); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_OUTER.add(KW_OUTER57);


                    pushFollow(FOLLOW_function_in_lateralView764);
                    function58=gHiveParser.function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_function.add(function58.getTree());

                    pushFollow(FOLLOW_tableAlias_in_lateralView766);
                    tableAlias59=tableAlias();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableAlias.add(tableAlias59.getTree());

                    KW_AS60=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_lateralView768); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS60);


                    pushFollow(FOLLOW_identifier_in_lateralView770);
                    identifier61=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier61.getTree());

                    // FromClauseParser.g:140:67: ( COMMA identifier )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==COMMA) ) {
                            int LA15_25 = input.LA(2);

                            if ( (LA15_25==Identifier) ) {
                                alt15=1;
                            }
                            else if ( (LA15_25==KW_ADD||LA15_25==KW_AFTER||(LA15_25 >= KW_ALTER && LA15_25 <= KW_ANALYZE)||(LA15_25 >= KW_ARCHIVE && LA15_25 <= KW_CASCADE)||LA15_25==KW_CHANGE||(LA15_25 >= KW_CLUSTER && LA15_25 <= KW_CLUSTERSTATUS)||LA15_25==KW_COLLECTION||(LA15_25 >= KW_COLUMNS && LA15_25 <= KW_CONCATENATE)||LA15_25==KW_CONTINUE||LA15_25==KW_CREATE||LA15_25==KW_CUBE||(LA15_25 >= KW_CURSOR && LA15_25 <= KW_DATA)||(LA15_25 >= KW_DATABASES && LA15_25 <= KW_DISABLE)||(LA15_25 >= KW_DISTRIBUTE && LA15_25 <= KW_DOUBLE)||(LA15_25 >= KW_DROP && LA15_25 <= KW_ELEM_TYPE)||LA15_25==KW_ENABLE||LA15_25==KW_ESCAPED||LA15_25==KW_EXCLUSIVE||(LA15_25 >= KW_EXISTS && LA15_25 <= KW_EXPORT)||(LA15_25 >= KW_EXTERNAL && LA15_25 <= KW_FLOAT)||(LA15_25 >= KW_FOR && LA15_25 <= KW_FORMATTED)||LA15_25==KW_FULL||(LA15_25 >= KW_FUNCTIONS && LA15_25 <= KW_GROUPING)||(LA15_25 >= KW_HOLD_DDLTIME && LA15_25 <= KW_IDXPROPERTIES)||(LA15_25 >= KW_IGNORE && LA15_25 <= KW_INTERSECT)||(LA15_25 >= KW_INTO && LA15_25 <= KW_ITEMS)||(LA15_25 >= KW_KEYS && LA15_25 <= KW_LEFT)||(LA15_25 >= KW_LIKE && LA15_25 <= KW_LONG)||(LA15_25 >= KW_MAPJOIN && LA15_25 <= KW_MINUS)||(LA15_25 >= KW_MSCK && LA15_25 <= KW_NOSCAN)||(LA15_25 >= KW_NO_DROP && LA15_25 <= KW_OFFLINE)||LA15_25==KW_OPTION||(LA15_25 >= KW_ORCFILE && LA15_25 <= KW_OUTPUTFORMAT)||LA15_25==KW_OVERWRITE||(LA15_25 >= KW_PARTITION && LA15_25 <= KW_PLUS)||(LA15_25 >= KW_PRETTY && LA15_25 <= KW_PROCEDURE)||(LA15_25 >= KW_PROTECTION && LA15_25 <= KW_RECORDWRITER)||(LA15_25 >= KW_REGEXP && LA15_25 <= KW_SCHEMAS)||(LA15_25 >= KW_SEMI && LA15_25 <= KW_STRUCT)||(LA15_25 >= KW_TABLE && LA15_25 <= KW_TABLES)||(LA15_25 >= KW_TBLPROPERTIES && LA15_25 <= KW_TEXTFILE)||(LA15_25 >= KW_TIMESTAMP && LA15_25 <= KW_TOUCH)||(LA15_25 >= KW_TRIGGER && LA15_25 <= KW_UNARCHIVE)||(LA15_25 >= KW_UNDO && LA15_25 <= KW_UNIONTYPE)||(LA15_25 >= KW_UNLOCK && LA15_25 <= KW_UPDATE)||(LA15_25 >= KW_USE && LA15_25 <= KW_VIEW)||LA15_25==KW_WHILE||LA15_25==KW_WITH) ) {
                                alt15=1;
                            }


                        }


                        switch (alt15) {
                    	case 1 :
                    	    // FromClauseParser.g:140:68: COMMA identifier
                    	    {
                    	    COMMA62=(Token)match(input,COMMA,FOLLOW_COMMA_in_lateralView773); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA62);


                    	    pushFollow(FOLLOW_identifier_in_lateralView775);
                    	    identifier63=gHiveParser.identifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifier.add(identifier63.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: tableAlias, identifier, function
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 141:2: -> ^( TOK_LATERAL_VIEW_OUTER ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )+ tableAlias ) ) )
                    {
                        // FromClauseParser.g:141:5: ^( TOK_LATERAL_VIEW_OUTER ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )+ tableAlias ) ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_LATERAL_VIEW_OUTER, "TOK_LATERAL_VIEW_OUTER")
                        , root_1);

                        // FromClauseParser.g:141:30: ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )+ tableAlias ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_SELECT, "TOK_SELECT")
                        , root_2);

                        // FromClauseParser.g:141:43: ^( TOK_SELEXPR function ( identifier )+ tableAlias )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR")
                        , root_3);

                        adaptor.addChild(root_3, stream_function.nextTree());

                        if ( !(stream_identifier.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_identifier.hasNext() ) {
                            adaptor.addChild(root_3, stream_identifier.nextTree());

                        }
                        stream_identifier.reset();

                        adaptor.addChild(root_3, stream_tableAlias.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // FromClauseParser.g:143:2: KW_LATERAL KW_VIEW function tableAlias KW_AS identifier ( COMMA identifier )*
                    {
                    KW_LATERAL64=(Token)match(input,KW_LATERAL,FOLLOW_KW_LATERAL_in_lateralView805); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_LATERAL.add(KW_LATERAL64);


                    KW_VIEW65=(Token)match(input,KW_VIEW,FOLLOW_KW_VIEW_in_lateralView807); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_VIEW.add(KW_VIEW65);


                    pushFollow(FOLLOW_function_in_lateralView809);
                    function66=gHiveParser.function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_function.add(function66.getTree());

                    pushFollow(FOLLOW_tableAlias_in_lateralView811);
                    tableAlias67=tableAlias();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableAlias.add(tableAlias67.getTree());

                    KW_AS68=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_lateralView813); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS68);


                    pushFollow(FOLLOW_identifier_in_lateralView815);
                    identifier69=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier69.getTree());

                    // FromClauseParser.g:143:58: ( COMMA identifier )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMA) ) {
                            int LA16_25 = input.LA(2);

                            if ( (LA16_25==Identifier) ) {
                                alt16=1;
                            }
                            else if ( (LA16_25==KW_ADD||LA16_25==KW_AFTER||(LA16_25 >= KW_ALTER && LA16_25 <= KW_ANALYZE)||(LA16_25 >= KW_ARCHIVE && LA16_25 <= KW_CASCADE)||LA16_25==KW_CHANGE||(LA16_25 >= KW_CLUSTER && LA16_25 <= KW_CLUSTERSTATUS)||LA16_25==KW_COLLECTION||(LA16_25 >= KW_COLUMNS && LA16_25 <= KW_CONCATENATE)||LA16_25==KW_CONTINUE||LA16_25==KW_CREATE||LA16_25==KW_CUBE||(LA16_25 >= KW_CURSOR && LA16_25 <= KW_DATA)||(LA16_25 >= KW_DATABASES && LA16_25 <= KW_DISABLE)||(LA16_25 >= KW_DISTRIBUTE && LA16_25 <= KW_DOUBLE)||(LA16_25 >= KW_DROP && LA16_25 <= KW_ELEM_TYPE)||LA16_25==KW_ENABLE||LA16_25==KW_ESCAPED||LA16_25==KW_EXCLUSIVE||(LA16_25 >= KW_EXISTS && LA16_25 <= KW_EXPORT)||(LA16_25 >= KW_EXTERNAL && LA16_25 <= KW_FLOAT)||(LA16_25 >= KW_FOR && LA16_25 <= KW_FORMATTED)||LA16_25==KW_FULL||(LA16_25 >= KW_FUNCTIONS && LA16_25 <= KW_GROUPING)||(LA16_25 >= KW_HOLD_DDLTIME && LA16_25 <= KW_IDXPROPERTIES)||(LA16_25 >= KW_IGNORE && LA16_25 <= KW_INTERSECT)||(LA16_25 >= KW_INTO && LA16_25 <= KW_ITEMS)||(LA16_25 >= KW_KEYS && LA16_25 <= KW_LEFT)||(LA16_25 >= KW_LIKE && LA16_25 <= KW_LONG)||(LA16_25 >= KW_MAPJOIN && LA16_25 <= KW_MINUS)||(LA16_25 >= KW_MSCK && LA16_25 <= KW_NOSCAN)||(LA16_25 >= KW_NO_DROP && LA16_25 <= KW_OFFLINE)||LA16_25==KW_OPTION||(LA16_25 >= KW_ORCFILE && LA16_25 <= KW_OUTPUTFORMAT)||LA16_25==KW_OVERWRITE||(LA16_25 >= KW_PARTITION && LA16_25 <= KW_PLUS)||(LA16_25 >= KW_PRETTY && LA16_25 <= KW_PROCEDURE)||(LA16_25 >= KW_PROTECTION && LA16_25 <= KW_RECORDWRITER)||(LA16_25 >= KW_REGEXP && LA16_25 <= KW_SCHEMAS)||(LA16_25 >= KW_SEMI && LA16_25 <= KW_STRUCT)||(LA16_25 >= KW_TABLE && LA16_25 <= KW_TABLES)||(LA16_25 >= KW_TBLPROPERTIES && LA16_25 <= KW_TEXTFILE)||(LA16_25 >= KW_TIMESTAMP && LA16_25 <= KW_TOUCH)||(LA16_25 >= KW_TRIGGER && LA16_25 <= KW_UNARCHIVE)||(LA16_25 >= KW_UNDO && LA16_25 <= KW_UNIONTYPE)||(LA16_25 >= KW_UNLOCK && LA16_25 <= KW_UPDATE)||(LA16_25 >= KW_USE && LA16_25 <= KW_VIEW)||LA16_25==KW_WHILE||LA16_25==KW_WITH) ) {
                                alt16=1;
                            }


                        }


                        switch (alt16) {
                    	case 1 :
                    	    // FromClauseParser.g:143:59: COMMA identifier
                    	    {
                    	    COMMA70=(Token)match(input,COMMA,FOLLOW_COMMA_in_lateralView818); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA70);


                    	    pushFollow(FOLLOW_identifier_in_lateralView820);
                    	    identifier71=gHiveParser.identifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifier.add(identifier71.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: identifier, function, tableAlias
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 144:2: -> ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )+ tableAlias ) ) )
                    {
                        // FromClauseParser.g:144:5: ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )+ tableAlias ) ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_LATERAL_VIEW, "TOK_LATERAL_VIEW")
                        , root_1);

                        // FromClauseParser.g:144:24: ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )+ tableAlias ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_SELECT, "TOK_SELECT")
                        , root_2);

                        // FromClauseParser.g:144:37: ^( TOK_SELEXPR function ( identifier )+ tableAlias )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR")
                        , root_3);

                        adaptor.addChild(root_3, stream_function.nextTree());

                        if ( !(stream_identifier.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_identifier.hasNext() ) {
                            adaptor.addChild(root_3, stream_identifier.nextTree());

                        }
                        stream_identifier.reset();

                        adaptor.addChild(root_3, stream_tableAlias.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {gParent.msgs.pop(); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lateralView"


    public static class tableAlias_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableAlias"
    // FromClauseParser.g:147:1: tableAlias : identifier -> ^( TOK_TABALIAS identifier ) ;
    public final HiveParser_FromClauseParser.tableAlias_return tableAlias() throws RecognitionException {
        HiveParser_FromClauseParser.tableAlias_return retval = new HiveParser_FromClauseParser.tableAlias_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.identifier_return identifier72 =null;


        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        gParent.msgs.push("table alias"); 
        try {
            // FromClauseParser.g:150:5: ( identifier -> ^( TOK_TABALIAS identifier ) )
            // FromClauseParser.g:151:5: identifier
            {
            pushFollow(FOLLOW_identifier_in_tableAlias872);
            identifier72=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier72.getTree());

            // AST REWRITE
            // elements: identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 151:16: -> ^( TOK_TABALIAS identifier )
            {
                // FromClauseParser.g:151:19: ^( TOK_TABALIAS identifier )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_TABALIAS, "TOK_TABALIAS")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {gParent.msgs.pop(); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tableAlias"


    public static class fromSource_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fromSource"
    // FromClauseParser.g:154:1: fromSource : ( ( Identifier LPAREN )=> partitionedTableFunction | tableSource | subQuerySource ) ( lateralView ^)* ;
    public final HiveParser_FromClauseParser.fromSource_return fromSource() throws RecognitionException {
        HiveParser_FromClauseParser.fromSource_return retval = new HiveParser_FromClauseParser.fromSource_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_FromClauseParser.partitionedTableFunction_return partitionedTableFunction73 =null;

        HiveParser_FromClauseParser.tableSource_return tableSource74 =null;

        HiveParser_FromClauseParser.subQuerySource_return subQuerySource75 =null;

        HiveParser_FromClauseParser.lateralView_return lateralView76 =null;



         gParent.msgs.push("from source"); 
        try {
            // FromClauseParser.g:157:5: ( ( ( Identifier LPAREN )=> partitionedTableFunction | tableSource | subQuerySource ) ( lateralView ^)* )
            // FromClauseParser.g:158:5: ( ( Identifier LPAREN )=> partitionedTableFunction | tableSource | subQuerySource ) ( lateralView ^)*
            {
            root_0 = (CommonTree)adaptor.nil();


            // FromClauseParser.g:158:5: ( ( Identifier LPAREN )=> partitionedTableFunction | tableSource | subQuerySource )
            int alt18=3;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // FromClauseParser.g:158:6: ( Identifier LPAREN )=> partitionedTableFunction
                    {
                    pushFollow(FOLLOW_partitionedTableFunction_in_fromSource919);
                    partitionedTableFunction73=partitionedTableFunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, partitionedTableFunction73.getTree());

                    }
                    break;
                case 2 :
                    // FromClauseParser.g:158:55: tableSource
                    {
                    pushFollow(FOLLOW_tableSource_in_fromSource923);
                    tableSource74=tableSource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tableSource74.getTree());

                    }
                    break;
                case 3 :
                    // FromClauseParser.g:158:69: subQuerySource
                    {
                    pushFollow(FOLLOW_subQuerySource_in_fromSource927);
                    subQuerySource75=subQuerySource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, subQuerySource75.getTree());

                    }
                    break;

            }


            // FromClauseParser.g:158:85: ( lateralView ^)*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==KW_LATERAL) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // FromClauseParser.g:158:86: lateralView ^
            	    {
            	    pushFollow(FOLLOW_lateralView_in_fromSource931);
            	    lateralView76=lateralView();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(lateralView76.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.msgs.pop(); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fromSource"


    public static class tableBucketSample_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableBucketSample"
    // FromClauseParser.g:161:1: tableBucketSample : KW_TABLESAMPLE LPAREN KW_BUCKET (numerator= Number ) KW_OUT KW_OF (denominator= Number ) ( KW_ON expr+= expression ( COMMA expr+= expression )* )? RPAREN -> ^( TOK_TABLEBUCKETSAMPLE $numerator $denominator ( $expr)* ) ;
    public final HiveParser_FromClauseParser.tableBucketSample_return tableBucketSample() throws RecognitionException {
        HiveParser_FromClauseParser.tableBucketSample_return retval = new HiveParser_FromClauseParser.tableBucketSample_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token numerator=null;
        Token denominator=null;
        Token KW_TABLESAMPLE77=null;
        Token LPAREN78=null;
        Token KW_BUCKET79=null;
        Token KW_OUT80=null;
        Token KW_OF81=null;
        Token KW_ON82=null;
        Token COMMA83=null;
        Token RPAREN84=null;
        List list_expr=null;
        RuleReturnScope expr = null;
        CommonTree numerator_tree=null;
        CommonTree denominator_tree=null;
        CommonTree KW_TABLESAMPLE77_tree=null;
        CommonTree LPAREN78_tree=null;
        CommonTree KW_BUCKET79_tree=null;
        CommonTree KW_OUT80_tree=null;
        CommonTree KW_OF81_tree=null;
        CommonTree KW_ON82_tree=null;
        CommonTree COMMA83_tree=null;
        CommonTree RPAREN84_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_OUT=new RewriteRuleTokenStream(adaptor,"token KW_OUT");
        RewriteRuleTokenStream stream_KW_OF=new RewriteRuleTokenStream(adaptor,"token KW_OF");
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_BUCKET=new RewriteRuleTokenStream(adaptor,"token KW_BUCKET");
        RewriteRuleTokenStream stream_KW_TABLESAMPLE=new RewriteRuleTokenStream(adaptor,"token KW_TABLESAMPLE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_ON=new RewriteRuleTokenStream(adaptor,"token KW_ON");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         gParent.msgs.push("table bucket sample specification"); 
        try {
            // FromClauseParser.g:164:5: ( KW_TABLESAMPLE LPAREN KW_BUCKET (numerator= Number ) KW_OUT KW_OF (denominator= Number ) ( KW_ON expr+= expression ( COMMA expr+= expression )* )? RPAREN -> ^( TOK_TABLEBUCKETSAMPLE $numerator $denominator ( $expr)* ) )
            // FromClauseParser.g:165:5: KW_TABLESAMPLE LPAREN KW_BUCKET (numerator= Number ) KW_OUT KW_OF (denominator= Number ) ( KW_ON expr+= expression ( COMMA expr+= expression )* )? RPAREN
            {
            KW_TABLESAMPLE77=(Token)match(input,KW_TABLESAMPLE,FOLLOW_KW_TABLESAMPLE_in_tableBucketSample965); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_TABLESAMPLE.add(KW_TABLESAMPLE77);


            LPAREN78=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_tableBucketSample967); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN78);


            KW_BUCKET79=(Token)match(input,KW_BUCKET,FOLLOW_KW_BUCKET_in_tableBucketSample969); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_BUCKET.add(KW_BUCKET79);


            // FromClauseParser.g:165:37: (numerator= Number )
            // FromClauseParser.g:165:38: numerator= Number
            {
            numerator=(Token)match(input,Number,FOLLOW_Number_in_tableBucketSample974); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Number.add(numerator);


            }


            KW_OUT80=(Token)match(input,KW_OUT,FOLLOW_KW_OUT_in_tableBucketSample977); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_OUT.add(KW_OUT80);


            KW_OF81=(Token)match(input,KW_OF,FOLLOW_KW_OF_in_tableBucketSample979); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_OF.add(KW_OF81);


            // FromClauseParser.g:165:69: (denominator= Number )
            // FromClauseParser.g:165:70: denominator= Number
            {
            denominator=(Token)match(input,Number,FOLLOW_Number_in_tableBucketSample984); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Number.add(denominator);


            }


            // FromClauseParser.g:165:90: ( KW_ON expr+= expression ( COMMA expr+= expression )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==KW_ON) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // FromClauseParser.g:165:91: KW_ON expr+= expression ( COMMA expr+= expression )*
                    {
                    KW_ON82=(Token)match(input,KW_ON,FOLLOW_KW_ON_in_tableBucketSample988); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ON.add(KW_ON82);


                    pushFollow(FOLLOW_expression_in_tableBucketSample992);
                    expr=gHiveParser.expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expr.getTree());
                    if (list_expr==null) list_expr=new ArrayList();
                    list_expr.add(expr.getTree());


                    // FromClauseParser.g:165:114: ( COMMA expr+= expression )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==COMMA) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // FromClauseParser.g:165:115: COMMA expr+= expression
                    	    {
                    	    COMMA83=(Token)match(input,COMMA,FOLLOW_COMMA_in_tableBucketSample995); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA83);


                    	    pushFollow(FOLLOW_expression_in_tableBucketSample999);
                    	    expr=gHiveParser.expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expr.getTree());
                    	    if (list_expr==null) list_expr=new ArrayList();
                    	    list_expr.add(expr.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }


            RPAREN84=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_tableBucketSample1005); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN84);


            // AST REWRITE
            // elements: numerator, expr, denominator
            // token labels: denominator, numerator
            // rule labels: retval
            // token list labels: 
            // rule list labels: expr
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_denominator=new RewriteRuleTokenStream(adaptor,"token denominator",denominator);
            RewriteRuleTokenStream stream_numerator=new RewriteRuleTokenStream(adaptor,"token numerator",numerator);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"token expr",list_expr);
            root_0 = (CommonTree)adaptor.nil();
            // 165:149: -> ^( TOK_TABLEBUCKETSAMPLE $numerator $denominator ( $expr)* )
            {
                // FromClauseParser.g:165:152: ^( TOK_TABLEBUCKETSAMPLE $numerator $denominator ( $expr)* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_TABLEBUCKETSAMPLE, "TOK_TABLEBUCKETSAMPLE")
                , root_1);

                adaptor.addChild(root_1, stream_numerator.nextNode());

                adaptor.addChild(root_1, stream_denominator.nextNode());

                // FromClauseParser.g:165:201: ( $expr)*
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.msgs.pop(); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tableBucketSample"


    public static class splitSample_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "splitSample"
    // FromClauseParser.g:168:1: splitSample : ( KW_TABLESAMPLE LPAREN (numerator= Number ) (percent= KW_PERCENT | KW_ROWS ) RPAREN -> {percent != null}? ^( TOK_TABLESPLITSAMPLE TOK_PERCENT $numerator) -> ^( TOK_TABLESPLITSAMPLE TOK_ROWCOUNT $numerator) | KW_TABLESAMPLE LPAREN (numerator= ByteLengthLiteral ) RPAREN -> ^( TOK_TABLESPLITSAMPLE TOK_LENGTH $numerator) );
    public final HiveParser_FromClauseParser.splitSample_return splitSample() throws RecognitionException {
        HiveParser_FromClauseParser.splitSample_return retval = new HiveParser_FromClauseParser.splitSample_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token numerator=null;
        Token percent=null;
        Token KW_TABLESAMPLE85=null;
        Token LPAREN86=null;
        Token KW_ROWS87=null;
        Token RPAREN88=null;
        Token KW_TABLESAMPLE89=null;
        Token LPAREN90=null;
        Token RPAREN91=null;

        CommonTree numerator_tree=null;
        CommonTree percent_tree=null;
        CommonTree KW_TABLESAMPLE85_tree=null;
        CommonTree LPAREN86_tree=null;
        CommonTree KW_ROWS87_tree=null;
        CommonTree RPAREN88_tree=null;
        CommonTree KW_TABLESAMPLE89_tree=null;
        CommonTree LPAREN90_tree=null;
        CommonTree RPAREN91_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ByteLengthLiteral=new RewriteRuleTokenStream(adaptor,"token ByteLengthLiteral");
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
        RewriteRuleTokenStream stream_KW_ROWS=new RewriteRuleTokenStream(adaptor,"token KW_ROWS");
        RewriteRuleTokenStream stream_KW_TABLESAMPLE=new RewriteRuleTokenStream(adaptor,"token KW_TABLESAMPLE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_PERCENT=new RewriteRuleTokenStream(adaptor,"token KW_PERCENT");

         gParent.msgs.push("table split sample specification"); 
        try {
            // FromClauseParser.g:171:5: ( KW_TABLESAMPLE LPAREN (numerator= Number ) (percent= KW_PERCENT | KW_ROWS ) RPAREN -> {percent != null}? ^( TOK_TABLESPLITSAMPLE TOK_PERCENT $numerator) -> ^( TOK_TABLESPLITSAMPLE TOK_ROWCOUNT $numerator) | KW_TABLESAMPLE LPAREN (numerator= ByteLengthLiteral ) RPAREN -> ^( TOK_TABLESPLITSAMPLE TOK_LENGTH $numerator) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==KW_TABLESAMPLE) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==LPAREN) ) {
                    int LA23_2 = input.LA(3);

                    if ( (LA23_2==Number) ) {
                        alt23=1;
                    }
                    else if ( (LA23_2==ByteLengthLiteral) ) {
                        alt23=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // FromClauseParser.g:172:5: KW_TABLESAMPLE LPAREN (numerator= Number ) (percent= KW_PERCENT | KW_ROWS ) RPAREN
                    {
                    KW_TABLESAMPLE85=(Token)match(input,KW_TABLESAMPLE,FOLLOW_KW_TABLESAMPLE_in_splitSample1052); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_TABLESAMPLE.add(KW_TABLESAMPLE85);


                    LPAREN86=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_splitSample1054); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN86);


                    // FromClauseParser.g:172:28: (numerator= Number )
                    // FromClauseParser.g:172:29: numerator= Number
                    {
                    numerator=(Token)match(input,Number,FOLLOW_Number_in_splitSample1060); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Number.add(numerator);


                    }


                    // FromClauseParser.g:172:47: (percent= KW_PERCENT | KW_ROWS )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==KW_PERCENT) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==KW_ROWS) ) {
                        alt22=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;

                    }
                    switch (alt22) {
                        case 1 :
                            // FromClauseParser.g:172:48: percent= KW_PERCENT
                            {
                            percent=(Token)match(input,KW_PERCENT,FOLLOW_KW_PERCENT_in_splitSample1066); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_PERCENT.add(percent);


                            }
                            break;
                        case 2 :
                            // FromClauseParser.g:172:67: KW_ROWS
                            {
                            KW_ROWS87=(Token)match(input,KW_ROWS,FOLLOW_KW_ROWS_in_splitSample1068); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_ROWS.add(KW_ROWS87);


                            }
                            break;

                    }


                    RPAREN88=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_splitSample1071); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN88);


                    // AST REWRITE
                    // elements: numerator, numerator
                    // token labels: numerator
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_numerator=new RewriteRuleTokenStream(adaptor,"token numerator",numerator);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 173:5: -> {percent != null}? ^( TOK_TABLESPLITSAMPLE TOK_PERCENT $numerator)
                    if (percent != null) {
                        // FromClauseParser.g:173:27: ^( TOK_TABLESPLITSAMPLE TOK_PERCENT $numerator)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_TABLESPLITSAMPLE, "TOK_TABLESPLITSAMPLE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(TOK_PERCENT, "TOK_PERCENT")
                        );

                        adaptor.addChild(root_1, stream_numerator.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    else // 174:5: -> ^( TOK_TABLESPLITSAMPLE TOK_ROWCOUNT $numerator)
                    {
                        // FromClauseParser.g:174:8: ^( TOK_TABLESPLITSAMPLE TOK_ROWCOUNT $numerator)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_TABLESPLITSAMPLE, "TOK_TABLESPLITSAMPLE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(TOK_ROWCOUNT, "TOK_ROWCOUNT")
                        );

                        adaptor.addChild(root_1, stream_numerator.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // FromClauseParser.g:176:5: KW_TABLESAMPLE LPAREN (numerator= ByteLengthLiteral ) RPAREN
                    {
                    KW_TABLESAMPLE89=(Token)match(input,KW_TABLESAMPLE,FOLLOW_KW_TABLESAMPLE_in_splitSample1115); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_TABLESAMPLE.add(KW_TABLESAMPLE89);


                    LPAREN90=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_splitSample1117); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN90);


                    // FromClauseParser.g:176:28: (numerator= ByteLengthLiteral )
                    // FromClauseParser.g:176:29: numerator= ByteLengthLiteral
                    {
                    numerator=(Token)match(input,ByteLengthLiteral,FOLLOW_ByteLengthLiteral_in_splitSample1123); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ByteLengthLiteral.add(numerator);


                    }


                    RPAREN91=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_splitSample1126); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN91);


                    // AST REWRITE
                    // elements: numerator
                    // token labels: numerator
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_numerator=new RewriteRuleTokenStream(adaptor,"token numerator",numerator);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 177:5: -> ^( TOK_TABLESPLITSAMPLE TOK_LENGTH $numerator)
                    {
                        // FromClauseParser.g:177:8: ^( TOK_TABLESPLITSAMPLE TOK_LENGTH $numerator)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_TABLESPLITSAMPLE, "TOK_TABLESPLITSAMPLE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(TOK_LENGTH, "TOK_LENGTH")
                        );

                        adaptor.addChild(root_1, stream_numerator.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.msgs.pop(); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "splitSample"


    public static class tableSample_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableSample"
    // FromClauseParser.g:180:1: tableSample : ( tableBucketSample | splitSample );
    public final HiveParser_FromClauseParser.tableSample_return tableSample() throws RecognitionException {
        HiveParser_FromClauseParser.tableSample_return retval = new HiveParser_FromClauseParser.tableSample_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_FromClauseParser.tableBucketSample_return tableBucketSample92 =null;

        HiveParser_FromClauseParser.splitSample_return splitSample93 =null;



         gParent.msgs.push("table sample specification"); 
        try {
            // FromClauseParser.g:183:5: ( tableBucketSample | splitSample )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==KW_TABLESAMPLE) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==LPAREN) ) {
                    int LA24_2 = input.LA(3);

                    if ( (LA24_2==KW_BUCKET) ) {
                        alt24=1;
                    }
                    else if ( (LA24_2==ByteLengthLiteral||LA24_2==Number) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // FromClauseParser.g:184:5: tableBucketSample
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_tableBucketSample_in_tableSample1172);
                    tableBucketSample92=tableBucketSample();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tableBucketSample92.getTree());

                    }
                    break;
                case 2 :
                    // FromClauseParser.g:185:5: splitSample
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_splitSample_in_tableSample1180);
                    splitSample93=splitSample();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, splitSample93.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.msgs.pop(); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tableSample"


    public static class tableSource_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableSource"
    // FromClauseParser.g:188:1: tableSource : tabname= tableName (props= tableProperties )? (ts= tableSample )? ( ( KW_AS )? alias= Identifier )? -> ^( TOK_TABREF $tabname ( $props)? ( $ts)? ( $alias)? ) ;
    public final HiveParser_FromClauseParser.tableSource_return tableSource() throws RecognitionException {
        HiveParser_FromClauseParser.tableSource_return retval = new HiveParser_FromClauseParser.tableSource_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token alias=null;
        Token KW_AS94=null;
        HiveParser_FromClauseParser.tableName_return tabname =null;

        HiveParser.tableProperties_return props =null;

        HiveParser_FromClauseParser.tableSample_return ts =null;


        CommonTree alias_tree=null;
        CommonTree KW_AS94_tree=null;
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");
        RewriteRuleSubtreeStream stream_tableSample=new RewriteRuleSubtreeStream(adaptor,"rule tableSample");
        RewriteRuleSubtreeStream stream_tableProperties=new RewriteRuleSubtreeStream(adaptor,"rule tableProperties");
         gParent.msgs.push("table source"); 
        try {
            // FromClauseParser.g:191:5: (tabname= tableName (props= tableProperties )? (ts= tableSample )? ( ( KW_AS )? alias= Identifier )? -> ^( TOK_TABREF $tabname ( $props)? ( $ts)? ( $alias)? ) )
            // FromClauseParser.g:191:7: tabname= tableName (props= tableProperties )? (ts= tableSample )? ( ( KW_AS )? alias= Identifier )?
            {
            pushFollow(FOLLOW_tableName_in_tableSource1209);
            tabname=tableName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tableName.add(tabname.getTree());

            // FromClauseParser.g:191:25: (props= tableProperties )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // FromClauseParser.g:191:26: props= tableProperties
                    {
                    pushFollow(FOLLOW_tableProperties_in_tableSource1214);
                    props=gHiveParser.tableProperties();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableProperties.add(props.getTree());

                    }
                    break;

            }


            // FromClauseParser.g:191:50: (ts= tableSample )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==KW_TABLESAMPLE) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // FromClauseParser.g:191:51: ts= tableSample
                    {
                    pushFollow(FOLLOW_tableSample_in_tableSource1221);
                    ts=tableSample();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableSample.add(ts.getTree());

                    }
                    break;

            }


            // FromClauseParser.g:191:68: ( ( KW_AS )? alias= Identifier )?
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // FromClauseParser.g:191:69: ( KW_AS )? alias= Identifier
                    {
                    // FromClauseParser.g:191:69: ( KW_AS )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==KW_AS) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // FromClauseParser.g:191:69: KW_AS
                            {
                            KW_AS94=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_tableSource1226); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS94);


                            }
                            break;

                    }


                    alias=(Token)match(input,Identifier,FOLLOW_Identifier_in_tableSource1231); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(alias);


                    }
                    break;

            }


            // AST REWRITE
            // elements: tabname, ts, alias, props
            // token labels: alias
            // rule labels: retval, ts, tabname, props
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_alias=new RewriteRuleTokenStream(adaptor,"token alias",alias);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ts=new RewriteRuleSubtreeStream(adaptor,"rule ts",ts!=null?ts.tree:null);
            RewriteRuleSubtreeStream stream_tabname=new RewriteRuleSubtreeStream(adaptor,"rule tabname",tabname!=null?tabname.tree:null);
            RewriteRuleSubtreeStream stream_props=new RewriteRuleSubtreeStream(adaptor,"rule props",props!=null?props.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 192:5: -> ^( TOK_TABREF $tabname ( $props)? ( $ts)? ( $alias)? )
            {
                // FromClauseParser.g:192:8: ^( TOK_TABREF $tabname ( $props)? ( $ts)? ( $alias)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_TABREF, "TOK_TABREF")
                , root_1);

                adaptor.addChild(root_1, stream_tabname.nextTree());

                // FromClauseParser.g:192:31: ( $props)?
                if ( stream_props.hasNext() ) {
                    adaptor.addChild(root_1, stream_props.nextTree());

                }
                stream_props.reset();

                // FromClauseParser.g:192:39: ( $ts)?
                if ( stream_ts.hasNext() ) {
                    adaptor.addChild(root_1, stream_ts.nextTree());

                }
                stream_ts.reset();

                // FromClauseParser.g:192:44: ( $alias)?
                if ( stream_alias.hasNext() ) {
                    adaptor.addChild(root_1, stream_alias.nextNode());

                }
                stream_alias.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.msgs.pop(); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tableSource"


    public static class multipleTrack_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multipleTrack"
    // FromClauseParser.g:195:1: multipleTrack : multipleSource ( COMMA multipleSource )+ -> ^( TOK_MULTIPLETRACK multipleSource ( multipleSource )+ ) ;
    public final HiveParser_FromClauseParser.multipleTrack_return multipleTrack() throws RecognitionException {
        HiveParser_FromClauseParser.multipleTrack_return retval = new HiveParser_FromClauseParser.multipleTrack_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMMA96=null;
        HiveParser_FromClauseParser.multipleSource_return multipleSource95 =null;

        HiveParser_FromClauseParser.multipleSource_return multipleSource97 =null;


        CommonTree COMMA96_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_multipleSource=new RewriteRuleSubtreeStream(adaptor,"rule multipleSource");
        try {
            // FromClauseParser.g:196:5: ( multipleSource ( COMMA multipleSource )+ -> ^( TOK_MULTIPLETRACK multipleSource ( multipleSource )+ ) )
            // FromClauseParser.g:196:7: multipleSource ( COMMA multipleSource )+
            {
            pushFollow(FOLLOW_multipleSource_in_multipleTrack1275);
            multipleSource95=multipleSource();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_multipleSource.add(multipleSource95.getTree());

            // FromClauseParser.g:196:22: ( COMMA multipleSource )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==COMMA) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // FromClauseParser.g:196:23: COMMA multipleSource
            	    {
            	    COMMA96=(Token)match(input,COMMA,FOLLOW_COMMA_in_multipleTrack1278); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA96);


            	    pushFollow(FOLLOW_multipleSource_in_multipleTrack1280);
            	    multipleSource97=multipleSource();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_multipleSource.add(multipleSource97.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);


            // AST REWRITE
            // elements: multipleSource, multipleSource
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 196:46: -> ^( TOK_MULTIPLETRACK multipleSource ( multipleSource )+ )
            {
                // FromClauseParser.g:196:49: ^( TOK_MULTIPLETRACK multipleSource ( multipleSource )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_MULTIPLETRACK, "TOK_MULTIPLETRACK")
                , root_1);

                adaptor.addChild(root_1, stream_multipleSource.nextTree());

                if ( !(stream_multipleSource.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_multipleSource.hasNext() ) {
                    adaptor.addChild(root_1, stream_multipleSource.nextTree());

                }
                stream_multipleSource.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multipleTrack"


    public static class multipleSource_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multipleSource"
    // FromClauseParser.g:199:1: multipleSource : ( tableSource | subQuerySource );
    public final HiveParser_FromClauseParser.multipleSource_return multipleSource() throws RecognitionException {
        HiveParser_FromClauseParser.multipleSource_return retval = new HiveParser_FromClauseParser.multipleSource_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_FromClauseParser.tableSource_return tableSource98 =null;

        HiveParser_FromClauseParser.subQuerySource_return subQuerySource99 =null;



        try {
            // FromClauseParser.g:200:5: ( tableSource | subQuerySource )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0 >= Identifier && LA30_0 <= KW_ADD)||LA30_0==KW_AFTER||(LA30_0 >= KW_ALTER && LA30_0 <= KW_ANALYZE)||(LA30_0 >= KW_ARCHIVE && LA30_0 <= KW_CASCADE)||LA30_0==KW_CHANGE||(LA30_0 >= KW_CLUSTER && LA30_0 <= KW_CLUSTERSTATUS)||LA30_0==KW_COLLECTION||(LA30_0 >= KW_COLUMNS && LA30_0 <= KW_CONCATENATE)||LA30_0==KW_CONTINUE||LA30_0==KW_CREATE||LA30_0==KW_CUBE||(LA30_0 >= KW_CURSOR && LA30_0 <= KW_DATA)||(LA30_0 >= KW_DATABASES && LA30_0 <= KW_DISABLE)||(LA30_0 >= KW_DISTRIBUTE && LA30_0 <= KW_DOUBLE)||(LA30_0 >= KW_DROP && LA30_0 <= KW_ELEM_TYPE)||LA30_0==KW_ENABLE||LA30_0==KW_ESCAPED||LA30_0==KW_EXCLUSIVE||(LA30_0 >= KW_EXISTS && LA30_0 <= KW_EXPORT)||(LA30_0 >= KW_EXTERNAL && LA30_0 <= KW_FLOAT)||(LA30_0 >= KW_FOR && LA30_0 <= KW_FORMATTED)||LA30_0==KW_FULL||(LA30_0 >= KW_FUNCTIONS && LA30_0 <= KW_GROUPING)||(LA30_0 >= KW_HOLD_DDLTIME && LA30_0 <= KW_IDXPROPERTIES)||(LA30_0 >= KW_IGNORE && LA30_0 <= KW_INTERSECT)||(LA30_0 >= KW_INTO && LA30_0 <= KW_ITEMS)||(LA30_0 >= KW_KEYS && LA30_0 <= KW_LEFT)||(LA30_0 >= KW_LIKE && LA30_0 <= KW_LONG)||(LA30_0 >= KW_MAPJOIN && LA30_0 <= KW_MINUS)||(LA30_0 >= KW_MSCK && LA30_0 <= KW_NOSCAN)||(LA30_0 >= KW_NO_DROP && LA30_0 <= KW_OFFLINE)||LA30_0==KW_OPTION||(LA30_0 >= KW_ORCFILE && LA30_0 <= KW_OUTPUTFORMAT)||LA30_0==KW_OVERWRITE||(LA30_0 >= KW_PARTITION && LA30_0 <= KW_PLUS)||(LA30_0 >= KW_PRETTY && LA30_0 <= KW_PROCEDURE)||(LA30_0 >= KW_PROTECTION && LA30_0 <= KW_RECORDWRITER)||(LA30_0 >= KW_REGEXP && LA30_0 <= KW_SCHEMAS)||(LA30_0 >= KW_SEMI && LA30_0 <= KW_STRUCT)||(LA30_0 >= KW_TABLE && LA30_0 <= KW_TABLES)||(LA30_0 >= KW_TBLPROPERTIES && LA30_0 <= KW_TEXTFILE)||(LA30_0 >= KW_TIMESTAMP && LA30_0 <= KW_TOUCH)||(LA30_0 >= KW_TRIGGER && LA30_0 <= KW_UNARCHIVE)||(LA30_0 >= KW_UNDO && LA30_0 <= KW_UNIONTYPE)||(LA30_0 >= KW_UNLOCK && LA30_0 <= KW_UPDATE)||(LA30_0 >= KW_USE && LA30_0 <= KW_VIEW)||LA30_0==KW_WHILE||LA30_0==KW_WITH) ) {
                alt30=1;
            }
            else if ( (LA30_0==LPAREN) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // FromClauseParser.g:200:7: tableSource
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_tableSource_in_multipleSource1314);
                    tableSource98=tableSource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tableSource98.getTree());

                    }
                    break;
                case 2 :
                    // FromClauseParser.g:200:21: subQuerySource
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_subQuerySource_in_multipleSource1318);
                    subQuerySource99=subQuerySource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, subQuerySource99.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multipleSource"


    public static class exclusivenessJoinSource_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exclusivenessJoinSource"
    // FromClauseParser.g:203:1: exclusivenessJoinSource : KW_EXCLUSIVENESSJOIN LPAREN fromSource COMMA fromSource RPAREN ( KW_BY aggregation )? -> ^( TOK_EXCLUSIVENESSJOIN fromSource fromSource ( aggregation )? ) ;
    public final HiveParser_FromClauseParser.exclusivenessJoinSource_return exclusivenessJoinSource() throws RecognitionException {
        HiveParser_FromClauseParser.exclusivenessJoinSource_return retval = new HiveParser_FromClauseParser.exclusivenessJoinSource_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_EXCLUSIVENESSJOIN100=null;
        Token LPAREN101=null;
        Token COMMA103=null;
        Token RPAREN105=null;
        Token KW_BY106=null;
        HiveParser_FromClauseParser.fromSource_return fromSource102 =null;

        HiveParser_FromClauseParser.fromSource_return fromSource104 =null;

        HiveParser_FromClauseParser.aggregation_return aggregation107 =null;


        CommonTree KW_EXCLUSIVENESSJOIN100_tree=null;
        CommonTree LPAREN101_tree=null;
        CommonTree COMMA103_tree=null;
        CommonTree RPAREN105_tree=null;
        CommonTree KW_BY106_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_EXCLUSIVENESSJOIN=new RewriteRuleTokenStream(adaptor,"token KW_EXCLUSIVENESSJOIN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
        RewriteRuleSubtreeStream stream_aggregation=new RewriteRuleSubtreeStream(adaptor,"rule aggregation");
        RewriteRuleSubtreeStream stream_fromSource=new RewriteRuleSubtreeStream(adaptor,"rule fromSource");
        try {
            // FromClauseParser.g:204:2: ( KW_EXCLUSIVENESSJOIN LPAREN fromSource COMMA fromSource RPAREN ( KW_BY aggregation )? -> ^( TOK_EXCLUSIVENESSJOIN fromSource fromSource ( aggregation )? ) )
            // FromClauseParser.g:204:4: KW_EXCLUSIVENESSJOIN LPAREN fromSource COMMA fromSource RPAREN ( KW_BY aggregation )?
            {
            KW_EXCLUSIVENESSJOIN100=(Token)match(input,KW_EXCLUSIVENESSJOIN,FOLLOW_KW_EXCLUSIVENESSJOIN_in_exclusivenessJoinSource1336); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_EXCLUSIVENESSJOIN.add(KW_EXCLUSIVENESSJOIN100);


            LPAREN101=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_exclusivenessJoinSource1338); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN101);


            pushFollow(FOLLOW_fromSource_in_exclusivenessJoinSource1340);
            fromSource102=fromSource();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fromSource.add(fromSource102.getTree());

            COMMA103=(Token)match(input,COMMA,FOLLOW_COMMA_in_exclusivenessJoinSource1342); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA103);


            pushFollow(FOLLOW_fromSource_in_exclusivenessJoinSource1344);
            fromSource104=fromSource();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fromSource.add(fromSource104.getTree());

            RPAREN105=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_exclusivenessJoinSource1346); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN105);


            // FromClauseParser.g:204:67: ( KW_BY aggregation )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==KW_BY) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // FromClauseParser.g:204:68: KW_BY aggregation
                    {
                    KW_BY106=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_exclusivenessJoinSource1349); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY106);


                    pushFollow(FOLLOW_aggregation_in_exclusivenessJoinSource1351);
                    aggregation107=aggregation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_aggregation.add(aggregation107.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: fromSource, aggregation, fromSource
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 204:88: -> ^( TOK_EXCLUSIVENESSJOIN fromSource fromSource ( aggregation )? )
            {
                // FromClauseParser.g:204:91: ^( TOK_EXCLUSIVENESSJOIN fromSource fromSource ( aggregation )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_EXCLUSIVENESSJOIN, "TOK_EXCLUSIVENESSJOIN")
                , root_1);

                adaptor.addChild(root_1, stream_fromSource.nextTree());

                adaptor.addChild(root_1, stream_fromSource.nextTree());

                // FromClauseParser.g:204:137: ( aggregation )?
                if ( stream_aggregation.hasNext() ) {
                    adaptor.addChild(root_1, stream_aggregation.nextTree());

                }
                stream_aggregation.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exclusivenessJoinSource"


    public static class intersectJoinSource_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "intersectJoinSource"
    // FromClauseParser.g:207:1: intersectJoinSource : KW_INTERSECTJOIN LPAREN fromSource ( COMMA fromSource )+ RPAREN ( KW_BY aggregation )? -> ^( TOK_INTERSECTJOIN fromSource ( fromSource )+ ( aggregation )? ) ;
    public final HiveParser_FromClauseParser.intersectJoinSource_return intersectJoinSource() throws RecognitionException {
        HiveParser_FromClauseParser.intersectJoinSource_return retval = new HiveParser_FromClauseParser.intersectJoinSource_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_INTERSECTJOIN108=null;
        Token LPAREN109=null;
        Token COMMA111=null;
        Token RPAREN113=null;
        Token KW_BY114=null;
        HiveParser_FromClauseParser.fromSource_return fromSource110 =null;

        HiveParser_FromClauseParser.fromSource_return fromSource112 =null;

        HiveParser_FromClauseParser.aggregation_return aggregation115 =null;


        CommonTree KW_INTERSECTJOIN108_tree=null;
        CommonTree LPAREN109_tree=null;
        CommonTree COMMA111_tree=null;
        CommonTree RPAREN113_tree=null;
        CommonTree KW_BY114_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_INTERSECTJOIN=new RewriteRuleTokenStream(adaptor,"token KW_INTERSECTJOIN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
        RewriteRuleSubtreeStream stream_aggregation=new RewriteRuleSubtreeStream(adaptor,"rule aggregation");
        RewriteRuleSubtreeStream stream_fromSource=new RewriteRuleSubtreeStream(adaptor,"rule fromSource");
        try {
            // FromClauseParser.g:208:2: ( KW_INTERSECTJOIN LPAREN fromSource ( COMMA fromSource )+ RPAREN ( KW_BY aggregation )? -> ^( TOK_INTERSECTJOIN fromSource ( fromSource )+ ( aggregation )? ) )
            // FromClauseParser.g:208:4: KW_INTERSECTJOIN LPAREN fromSource ( COMMA fromSource )+ RPAREN ( KW_BY aggregation )?
            {
            KW_INTERSECTJOIN108=(Token)match(input,KW_INTERSECTJOIN,FOLLOW_KW_INTERSECTJOIN_in_intersectJoinSource1378); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_INTERSECTJOIN.add(KW_INTERSECTJOIN108);


            LPAREN109=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_intersectJoinSource1380); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN109);


            pushFollow(FOLLOW_fromSource_in_intersectJoinSource1382);
            fromSource110=fromSource();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fromSource.add(fromSource110.getTree());

            // FromClauseParser.g:208:39: ( COMMA fromSource )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==COMMA) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // FromClauseParser.g:208:40: COMMA fromSource
            	    {
            	    COMMA111=(Token)match(input,COMMA,FOLLOW_COMMA_in_intersectJoinSource1385); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA111);


            	    pushFollow(FOLLOW_fromSource_in_intersectJoinSource1387);
            	    fromSource112=fromSource();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_fromSource.add(fromSource112.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);


            RPAREN113=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_intersectJoinSource1391); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN113);


            // FromClauseParser.g:208:66: ( KW_BY aggregation )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==KW_BY) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // FromClauseParser.g:208:67: KW_BY aggregation
                    {
                    KW_BY114=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_intersectJoinSource1394); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY114);


                    pushFollow(FOLLOW_aggregation_in_intersectJoinSource1396);
                    aggregation115=aggregation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_aggregation.add(aggregation115.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: aggregation, fromSource, fromSource
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 208:87: -> ^( TOK_INTERSECTJOIN fromSource ( fromSource )+ ( aggregation )? )
            {
                // FromClauseParser.g:208:90: ^( TOK_INTERSECTJOIN fromSource ( fromSource )+ ( aggregation )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_INTERSECTJOIN, "TOK_INTERSECTJOIN")
                , root_1);

                adaptor.addChild(root_1, stream_fromSource.nextTree());

                if ( !(stream_fromSource.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_fromSource.hasNext() ) {
                    adaptor.addChild(root_1, stream_fromSource.nextTree());

                }
                stream_fromSource.reset();

                // FromClauseParser.g:208:133: ( aggregation )?
                if ( stream_aggregation.hasNext() ) {
                    adaptor.addChild(root_1, stream_aggregation.nextTree());

                }
                stream_aggregation.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "intersectJoinSource"


    public static class aggregation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "aggregation"
    // FromClauseParser.g:211:1: aggregation : identifier ;
    public final HiveParser_FromClauseParser.aggregation_return aggregation() throws RecognitionException {
        HiveParser_FromClauseParser.aggregation_return retval = new HiveParser_FromClauseParser.aggregation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.identifier_return identifier116 =null;



        try {
            // FromClauseParser.g:212:5: ( identifier )
            // FromClauseParser.g:212:7: identifier
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_identifier_in_aggregation1427);
            identifier116=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier116.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "aggregation"


    public static class projectSource_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "projectSource"
    // FromClauseParser.g:215:1: projectSource : ( KW_PROJECT KW_VIRTUALTRACK intervalLength KW_ON fromSource -> ^( TOK_PROJECT intervalLength fromSource ) | KW_PROJECT fromSource KW_ON fromSource -> ^( TOK_PROJECT fromSource fromSource ) );
    public final HiveParser_FromClauseParser.projectSource_return projectSource() throws RecognitionException {
        HiveParser_FromClauseParser.projectSource_return retval = new HiveParser_FromClauseParser.projectSource_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_PROJECT117=null;
        Token KW_VIRTUALTRACK118=null;
        Token KW_ON120=null;
        Token KW_PROJECT122=null;
        Token KW_ON124=null;
        HiveParser_FromClauseParser.intervalLength_return intervalLength119 =null;

        HiveParser_FromClauseParser.fromSource_return fromSource121 =null;

        HiveParser_FromClauseParser.fromSource_return fromSource123 =null;

        HiveParser_FromClauseParser.fromSource_return fromSource125 =null;


        CommonTree KW_PROJECT117_tree=null;
        CommonTree KW_VIRTUALTRACK118_tree=null;
        CommonTree KW_ON120_tree=null;
        CommonTree KW_PROJECT122_tree=null;
        CommonTree KW_ON124_tree=null;
        RewriteRuleTokenStream stream_KW_PROJECT=new RewriteRuleTokenStream(adaptor,"token KW_PROJECT");
        RewriteRuleTokenStream stream_KW_VIRTUALTRACK=new RewriteRuleTokenStream(adaptor,"token KW_VIRTUALTRACK");
        RewriteRuleTokenStream stream_KW_ON=new RewriteRuleTokenStream(adaptor,"token KW_ON");
        RewriteRuleSubtreeStream stream_fromSource=new RewriteRuleSubtreeStream(adaptor,"rule fromSource");
        RewriteRuleSubtreeStream stream_intervalLength=new RewriteRuleSubtreeStream(adaptor,"rule intervalLength");
        gParent.msgs.push("project source"); 
        try {
            // FromClauseParser.g:218:5: ( KW_PROJECT KW_VIRTUALTRACK intervalLength KW_ON fromSource -> ^( TOK_PROJECT intervalLength fromSource ) | KW_PROJECT fromSource KW_ON fromSource -> ^( TOK_PROJECT fromSource fromSource ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==KW_PROJECT) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==KW_VIRTUALTRACK) ) {
                    alt34=1;
                }
                else if ( ((LA34_1 >= Identifier && LA34_1 <= KW_ADD)||LA34_1==KW_AFTER||(LA34_1 >= KW_ALTER && LA34_1 <= KW_ANALYZE)||(LA34_1 >= KW_ARCHIVE && LA34_1 <= KW_CASCADE)||LA34_1==KW_CHANGE||(LA34_1 >= KW_CLUSTER && LA34_1 <= KW_CLUSTERSTATUS)||LA34_1==KW_COLLECTION||(LA34_1 >= KW_COLUMNS && LA34_1 <= KW_CONCATENATE)||LA34_1==KW_CONTINUE||LA34_1==KW_CREATE||LA34_1==KW_CUBE||(LA34_1 >= KW_CURSOR && LA34_1 <= KW_DATA)||(LA34_1 >= KW_DATABASES && LA34_1 <= KW_DISABLE)||(LA34_1 >= KW_DISTRIBUTE && LA34_1 <= KW_DOUBLE)||(LA34_1 >= KW_DROP && LA34_1 <= KW_ELEM_TYPE)||LA34_1==KW_ENABLE||LA34_1==KW_ESCAPED||LA34_1==KW_EXCLUSIVE||(LA34_1 >= KW_EXISTS && LA34_1 <= KW_EXPORT)||(LA34_1 >= KW_EXTERNAL && LA34_1 <= KW_FLOAT)||(LA34_1 >= KW_FOR && LA34_1 <= KW_FORMATTED)||LA34_1==KW_FULL||(LA34_1 >= KW_FUNCTIONS && LA34_1 <= KW_GROUPING)||(LA34_1 >= KW_HOLD_DDLTIME && LA34_1 <= KW_IDXPROPERTIES)||(LA34_1 >= KW_IGNORE && LA34_1 <= KW_INTERSECT)||(LA34_1 >= KW_INTO && LA34_1 <= KW_ITEMS)||(LA34_1 >= KW_KEYS && LA34_1 <= KW_LEFT)||(LA34_1 >= KW_LIKE && LA34_1 <= KW_LONG)||(LA34_1 >= KW_MAPJOIN && LA34_1 <= KW_MINUS)||(LA34_1 >= KW_MSCK && LA34_1 <= KW_NOSCAN)||(LA34_1 >= KW_NO_DROP && LA34_1 <= KW_OFFLINE)||LA34_1==KW_OPTION||(LA34_1 >= KW_ORCFILE && LA34_1 <= KW_OUTPUTFORMAT)||LA34_1==KW_OVERWRITE||(LA34_1 >= KW_PARTITION && LA34_1 <= KW_PLUS)||(LA34_1 >= KW_PRETTY && LA34_1 <= KW_PROCEDURE)||(LA34_1 >= KW_PROTECTION && LA34_1 <= KW_RECORDWRITER)||(LA34_1 >= KW_REGEXP && LA34_1 <= KW_SCHEMAS)||(LA34_1 >= KW_SEMI && LA34_1 <= KW_STRUCT)||(LA34_1 >= KW_TABLE && LA34_1 <= KW_TABLES)||(LA34_1 >= KW_TBLPROPERTIES && LA34_1 <= KW_TEXTFILE)||(LA34_1 >= KW_TIMESTAMP && LA34_1 <= KW_TOUCH)||(LA34_1 >= KW_TRIGGER && LA34_1 <= KW_UNARCHIVE)||(LA34_1 >= KW_UNDO && LA34_1 <= KW_UNIONTYPE)||(LA34_1 >= KW_UNLOCK && LA34_1 <= KW_UPDATE)||(LA34_1 >= KW_USE && LA34_1 <= KW_VIEW)||LA34_1==KW_WHILE||LA34_1==KW_WITH||LA34_1==LPAREN) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }
            switch (alt34) {
                case 1 :
                    // FromClauseParser.g:219:5: KW_PROJECT KW_VIRTUALTRACK intervalLength KW_ON fromSource
                    {
                    KW_PROJECT117=(Token)match(input,KW_PROJECT,FOLLOW_KW_PROJECT_in_projectSource1458); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_PROJECT.add(KW_PROJECT117);


                    KW_VIRTUALTRACK118=(Token)match(input,KW_VIRTUALTRACK,FOLLOW_KW_VIRTUALTRACK_in_projectSource1460); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_VIRTUALTRACK.add(KW_VIRTUALTRACK118);


                    pushFollow(FOLLOW_intervalLength_in_projectSource1462);
                    intervalLength119=intervalLength();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_intervalLength.add(intervalLength119.getTree());

                    KW_ON120=(Token)match(input,KW_ON,FOLLOW_KW_ON_in_projectSource1464); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ON.add(KW_ON120);


                    pushFollow(FOLLOW_fromSource_in_projectSource1466);
                    fromSource121=fromSource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fromSource.add(fromSource121.getTree());

                    // AST REWRITE
                    // elements: intervalLength, fromSource
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 219:64: -> ^( TOK_PROJECT intervalLength fromSource )
                    {
                        // FromClauseParser.g:219:67: ^( TOK_PROJECT intervalLength fromSource )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_PROJECT, "TOK_PROJECT")
                        , root_1);

                        adaptor.addChild(root_1, stream_intervalLength.nextTree());

                        adaptor.addChild(root_1, stream_fromSource.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // FromClauseParser.g:221:5: KW_PROJECT fromSource KW_ON fromSource
                    {
                    KW_PROJECT122=(Token)match(input,KW_PROJECT,FOLLOW_KW_PROJECT_in_projectSource1488); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_PROJECT.add(KW_PROJECT122);


                    pushFollow(FOLLOW_fromSource_in_projectSource1490);
                    fromSource123=fromSource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fromSource.add(fromSource123.getTree());

                    KW_ON124=(Token)match(input,KW_ON,FOLLOW_KW_ON_in_projectSource1492); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ON.add(KW_ON124);


                    pushFollow(FOLLOW_fromSource_in_projectSource1494);
                    fromSource125=fromSource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fromSource.add(fromSource125.getTree());

                    // AST REWRITE
                    // elements: fromSource, fromSource
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 221:44: -> ^( TOK_PROJECT fromSource fromSource )
                    {
                        // FromClauseParser.g:221:47: ^( TOK_PROJECT fromSource fromSource )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_PROJECT, "TOK_PROJECT")
                        , root_1);

                        adaptor.addChild(root_1, stream_fromSource.nextTree());

                        adaptor.addChild(root_1, stream_fromSource.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {gParent.msgs.pop(); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "projectSource"


    public static class intervalLength_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "intervalLength"
    // FromClauseParser.g:224:1: intervalLength : Number -> ^( TOK_INTERVALLENGTH Number ) ;
    public final HiveParser_FromClauseParser.intervalLength_return intervalLength() throws RecognitionException {
        HiveParser_FromClauseParser.intervalLength_return retval = new HiveParser_FromClauseParser.intervalLength_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token Number126=null;

        CommonTree Number126_tree=null;
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");

        gParent.msgs.push("intervalLength"); 
        try {
            // FromClauseParser.g:227:5: ( Number -> ^( TOK_INTERVALLENGTH Number ) )
            // FromClauseParser.g:228:5: Number
            {
            Number126=(Token)match(input,Number,FOLLOW_Number_in_intervalLength1535); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Number.add(Number126);


            // AST REWRITE
            // elements: Number
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 228:12: -> ^( TOK_INTERVALLENGTH Number )
            {
                // FromClauseParser.g:228:15: ^( TOK_INTERVALLENGTH Number )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_INTERVALLENGTH, "TOK_INTERVALLENGTH")
                , root_1);

                adaptor.addChild(root_1, 
                stream_Number.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {gParent.msgs.pop(); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "intervalLength"


    public static class tableName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableName"
    // FromClauseParser.g:231:1: tableName : (db= identifier DOT tab= identifier -> ^( TOK_TABNAME $db $tab) |tab= identifier -> ^( TOK_TABNAME $tab) );
    public final HiveParser_FromClauseParser.tableName_return tableName() throws RecognitionException {
        HiveParser_FromClauseParser.tableName_return retval = new HiveParser_FromClauseParser.tableName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DOT127=null;
        HiveParser_IdentifiersParser.identifier_return db =null;

        HiveParser_IdentifiersParser.identifier_return tab =null;


        CommonTree DOT127_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
         gParent.msgs.push("table name"); 
        try {
            // FromClauseParser.g:234:5: (db= identifier DOT tab= identifier -> ^( TOK_TABNAME $db $tab) |tab= identifier -> ^( TOK_TABNAME $tab) )
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // FromClauseParser.g:235:5: db= identifier DOT tab= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_tableName1576);
                    db=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(db.getTree());

                    DOT127=(Token)match(input,DOT,FOLLOW_DOT_in_tableName1578); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT127);


                    pushFollow(FOLLOW_identifier_in_tableName1582);
                    tab=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(tab.getTree());

                    // AST REWRITE
                    // elements: db, tab
                    // token labels: 
                    // rule labels: db, retval, tab
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_db=new RewriteRuleSubtreeStream(adaptor,"rule db",db!=null?db.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_tab=new RewriteRuleSubtreeStream(adaptor,"rule tab",tab!=null?tab.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 236:5: -> ^( TOK_TABNAME $db $tab)
                    {
                        // FromClauseParser.g:236:8: ^( TOK_TABNAME $db $tab)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_TABNAME, "TOK_TABNAME")
                        , root_1);

                        adaptor.addChild(root_1, stream_db.nextTree());

                        adaptor.addChild(root_1, stream_tab.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // FromClauseParser.g:238:5: tab= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_tableName1612);
                    tab=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(tab.getTree());

                    // AST REWRITE
                    // elements: tab
                    // token labels: 
                    // rule labels: retval, tab
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_tab=new RewriteRuleSubtreeStream(adaptor,"rule tab",tab!=null?tab.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 239:5: -> ^( TOK_TABNAME $tab)
                    {
                        // FromClauseParser.g:239:8: ^( TOK_TABNAME $tab)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_TABNAME, "TOK_TABNAME")
                        , root_1);

                        adaptor.addChild(root_1, stream_tab.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.msgs.pop(); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tableName"


    public static class viewName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "viewName"
    // FromClauseParser.g:242:1: viewName : (db= identifier DOT )? view= identifier -> ^( TOK_TABNAME ( $db)? $view) ;
    public final HiveParser_FromClauseParser.viewName_return viewName() throws RecognitionException {
        HiveParser_FromClauseParser.viewName_return retval = new HiveParser_FromClauseParser.viewName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DOT128=null;
        HiveParser_IdentifiersParser.identifier_return db =null;

        HiveParser_IdentifiersParser.identifier_return view =null;


        CommonTree DOT128_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
         gParent.msgs.push("view name"); 
        try {
            // FromClauseParser.g:245:5: ( (db= identifier DOT )? view= identifier -> ^( TOK_TABNAME ( $db)? $view) )
            // FromClauseParser.g:246:5: (db= identifier DOT )? view= identifier
            {
            // FromClauseParser.g:246:5: (db= identifier DOT )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Identifier) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==DOT) ) {
                    alt36=1;
                }
            }
            else if ( (LA36_0==KW_ADD||LA36_0==KW_AFTER||(LA36_0 >= KW_ALTER && LA36_0 <= KW_ANALYZE)||(LA36_0 >= KW_ARCHIVE && LA36_0 <= KW_CASCADE)||LA36_0==KW_CHANGE||(LA36_0 >= KW_CLUSTER && LA36_0 <= KW_CLUSTERSTATUS)||LA36_0==KW_COLLECTION||(LA36_0 >= KW_COLUMNS && LA36_0 <= KW_CONCATENATE)||LA36_0==KW_CONTINUE||LA36_0==KW_CREATE||LA36_0==KW_CUBE||(LA36_0 >= KW_CURSOR && LA36_0 <= KW_DATA)||(LA36_0 >= KW_DATABASES && LA36_0 <= KW_DISABLE)||(LA36_0 >= KW_DISTRIBUTE && LA36_0 <= KW_DOUBLE)||(LA36_0 >= KW_DROP && LA36_0 <= KW_ELEM_TYPE)||LA36_0==KW_ENABLE||LA36_0==KW_ESCAPED||LA36_0==KW_EXCLUSIVE||(LA36_0 >= KW_EXISTS && LA36_0 <= KW_EXPORT)||(LA36_0 >= KW_EXTERNAL && LA36_0 <= KW_FLOAT)||(LA36_0 >= KW_FOR && LA36_0 <= KW_FORMATTED)||LA36_0==KW_FULL||(LA36_0 >= KW_FUNCTIONS && LA36_0 <= KW_GROUPING)||(LA36_0 >= KW_HOLD_DDLTIME && LA36_0 <= KW_IDXPROPERTIES)||(LA36_0 >= KW_IGNORE && LA36_0 <= KW_INTERSECT)||(LA36_0 >= KW_INTO && LA36_0 <= KW_ITEMS)||(LA36_0 >= KW_KEYS && LA36_0 <= KW_LEFT)||(LA36_0 >= KW_LIKE && LA36_0 <= KW_LONG)||(LA36_0 >= KW_MAPJOIN && LA36_0 <= KW_MINUS)||(LA36_0 >= KW_MSCK && LA36_0 <= KW_NOSCAN)||(LA36_0 >= KW_NO_DROP && LA36_0 <= KW_OFFLINE)||LA36_0==KW_OPTION||(LA36_0 >= KW_ORCFILE && LA36_0 <= KW_OUTPUTFORMAT)||LA36_0==KW_OVERWRITE||(LA36_0 >= KW_PARTITION && LA36_0 <= KW_PLUS)||(LA36_0 >= KW_PRETTY && LA36_0 <= KW_PROCEDURE)||(LA36_0 >= KW_PROTECTION && LA36_0 <= KW_RECORDWRITER)||(LA36_0 >= KW_REGEXP && LA36_0 <= KW_SCHEMAS)||(LA36_0 >= KW_SEMI && LA36_0 <= KW_STRUCT)||(LA36_0 >= KW_TABLE && LA36_0 <= KW_TABLES)||(LA36_0 >= KW_TBLPROPERTIES && LA36_0 <= KW_TEXTFILE)||(LA36_0 >= KW_TIMESTAMP && LA36_0 <= KW_TOUCH)||(LA36_0 >= KW_TRIGGER && LA36_0 <= KW_UNARCHIVE)||(LA36_0 >= KW_UNDO && LA36_0 <= KW_UNIONTYPE)||(LA36_0 >= KW_UNLOCK && LA36_0 <= KW_UPDATE)||(LA36_0 >= KW_USE && LA36_0 <= KW_VIEW)||LA36_0==KW_WHILE||LA36_0==KW_WITH) ) {
                int LA36_2 = input.LA(2);

                if ( (LA36_2==DOT) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // FromClauseParser.g:246:6: db= identifier DOT
                    {
                    pushFollow(FOLLOW_identifier_in_viewName1659);
                    db=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(db.getTree());

                    DOT128=(Token)match(input,DOT,FOLLOW_DOT_in_viewName1661); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT128);


                    }
                    break;

            }


            pushFollow(FOLLOW_identifier_in_viewName1667);
            view=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(view.getTree());

            // AST REWRITE
            // elements: view, db
            // token labels: 
            // rule labels: db, retval, view
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_db=new RewriteRuleSubtreeStream(adaptor,"rule db",db!=null?db.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_view=new RewriteRuleSubtreeStream(adaptor,"rule view",view!=null?view.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 247:5: -> ^( TOK_TABNAME ( $db)? $view)
            {
                // FromClauseParser.g:247:8: ^( TOK_TABNAME ( $db)? $view)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_TABNAME, "TOK_TABNAME")
                , root_1);

                // FromClauseParser.g:247:23: ( $db)?
                if ( stream_db.hasNext() ) {
                    adaptor.addChild(root_1, stream_db.nextTree());

                }
                stream_db.reset();

                adaptor.addChild(root_1, stream_view.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.msgs.pop(); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "viewName"


    public static class subQuerySource_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "subQuerySource"
    // FromClauseParser.g:250:1: subQuerySource : LPAREN queryStatementExpression RPAREN identifier -> ^( TOK_SUBQUERY queryStatementExpression identifier ) ;
    public final HiveParser_FromClauseParser.subQuerySource_return subQuerySource() throws RecognitionException {
        HiveParser_FromClauseParser.subQuerySource_return retval = new HiveParser_FromClauseParser.subQuerySource_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LPAREN129=null;
        Token RPAREN131=null;
        HiveParser.queryStatementExpression_return queryStatementExpression130 =null;

        HiveParser_IdentifiersParser.identifier_return identifier132 =null;


        CommonTree LPAREN129_tree=null;
        CommonTree RPAREN131_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_queryStatementExpression=new RewriteRuleSubtreeStream(adaptor,"rule queryStatementExpression");
         gParent.msgs.push("subquery source"); 
        try {
            // FromClauseParser.g:253:5: ( LPAREN queryStatementExpression RPAREN identifier -> ^( TOK_SUBQUERY queryStatementExpression identifier ) )
            // FromClauseParser.g:254:5: LPAREN queryStatementExpression RPAREN identifier
            {
            LPAREN129=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_subQuerySource1715); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN129);


            pushFollow(FOLLOW_queryStatementExpression_in_subQuerySource1717);
            queryStatementExpression130=gHiveParser.queryStatementExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_queryStatementExpression.add(queryStatementExpression130.getTree());

            RPAREN131=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_subQuerySource1719); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN131);


            pushFollow(FOLLOW_identifier_in_subQuerySource1721);
            identifier132=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier132.getTree());

            // AST REWRITE
            // elements: identifier, queryStatementExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 254:55: -> ^( TOK_SUBQUERY queryStatementExpression identifier )
            {
                // FromClauseParser.g:254:58: ^( TOK_SUBQUERY queryStatementExpression identifier )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_SUBQUERY, "TOK_SUBQUERY")
                , root_1);

                adaptor.addChild(root_1, stream_queryStatementExpression.nextTree());

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.msgs.pop(); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "subQuerySource"


    public static class partitioningSpec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "partitioningSpec"
    // FromClauseParser.g:258:1: partitioningSpec : ( partitionByClause ( orderByClause )? -> ^( TOK_PARTITIONINGSPEC partitionByClause ( orderByClause )? ) | orderByClause -> ^( TOK_PARTITIONINGSPEC orderByClause ) | distributeByClause ( sortByClause )? -> ^( TOK_PARTITIONINGSPEC distributeByClause ( sortByClause )? ) | sortByClause -> ^( TOK_PARTITIONINGSPEC sortByClause ) | clusterByClause -> ^( TOK_PARTITIONINGSPEC clusterByClause ) );
    public final HiveParser_FromClauseParser.partitioningSpec_return partitioningSpec() throws RecognitionException {
        HiveParser_FromClauseParser.partitioningSpec_return retval = new HiveParser_FromClauseParser.partitioningSpec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.partitionByClause_return partitionByClause133 =null;

        HiveParser_IdentifiersParser.orderByClause_return orderByClause134 =null;

        HiveParser_IdentifiersParser.orderByClause_return orderByClause135 =null;

        HiveParser_IdentifiersParser.distributeByClause_return distributeByClause136 =null;

        HiveParser_IdentifiersParser.sortByClause_return sortByClause137 =null;

        HiveParser_IdentifiersParser.sortByClause_return sortByClause138 =null;

        HiveParser_IdentifiersParser.clusterByClause_return clusterByClause139 =null;


        RewriteRuleSubtreeStream stream_clusterByClause=new RewriteRuleSubtreeStream(adaptor,"rule clusterByClause");
        RewriteRuleSubtreeStream stream_distributeByClause=new RewriteRuleSubtreeStream(adaptor,"rule distributeByClause");
        RewriteRuleSubtreeStream stream_partitionByClause=new RewriteRuleSubtreeStream(adaptor,"rule partitionByClause");
        RewriteRuleSubtreeStream stream_sortByClause=new RewriteRuleSubtreeStream(adaptor,"rule sortByClause");
        RewriteRuleSubtreeStream stream_orderByClause=new RewriteRuleSubtreeStream(adaptor,"rule orderByClause");
         gParent.msgs.push("partitioningSpec clause"); 
        try {
            // FromClauseParser.g:261:4: ( partitionByClause ( orderByClause )? -> ^( TOK_PARTITIONINGSPEC partitionByClause ( orderByClause )? ) | orderByClause -> ^( TOK_PARTITIONINGSPEC orderByClause ) | distributeByClause ( sortByClause )? -> ^( TOK_PARTITIONINGSPEC distributeByClause ( sortByClause )? ) | sortByClause -> ^( TOK_PARTITIONINGSPEC sortByClause ) | clusterByClause -> ^( TOK_PARTITIONINGSPEC clusterByClause ) )
            int alt39=5;
            switch ( input.LA(1) ) {
            case KW_PARTITION:
                {
                alt39=1;
                }
                break;
            case KW_ORDER:
                {
                alt39=2;
                }
                break;
            case KW_DISTRIBUTE:
                {
                alt39=3;
                }
                break;
            case KW_SORT:
                {
                alt39=4;
                }
                break;
            case KW_CLUSTER:
                {
                alt39=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }

            switch (alt39) {
                case 1 :
                    // FromClauseParser.g:262:4: partitionByClause ( orderByClause )?
                    {
                    pushFollow(FOLLOW_partitionByClause_in_partitioningSpec1762);
                    partitionByClause133=gHiveParser.partitionByClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_partitionByClause.add(partitionByClause133.getTree());

                    // FromClauseParser.g:262:22: ( orderByClause )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==KW_ORDER) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // FromClauseParser.g:262:22: orderByClause
                            {
                            pushFollow(FOLLOW_orderByClause_in_partitioningSpec1764);
                            orderByClause134=gHiveParser.orderByClause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_orderByClause.add(orderByClause134.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: orderByClause, partitionByClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 262:37: -> ^( TOK_PARTITIONINGSPEC partitionByClause ( orderByClause )? )
                    {
                        // FromClauseParser.g:262:40: ^( TOK_PARTITIONINGSPEC partitionByClause ( orderByClause )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC")
                        , root_1);

                        adaptor.addChild(root_1, stream_partitionByClause.nextTree());

                        // FromClauseParser.g:262:81: ( orderByClause )?
                        if ( stream_orderByClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_orderByClause.nextTree());

                        }
                        stream_orderByClause.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // FromClauseParser.g:263:4: orderByClause
                    {
                    pushFollow(FOLLOW_orderByClause_in_partitioningSpec1783);
                    orderByClause135=gHiveParser.orderByClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_orderByClause.add(orderByClause135.getTree());

                    // AST REWRITE
                    // elements: orderByClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 263:18: -> ^( TOK_PARTITIONINGSPEC orderByClause )
                    {
                        // FromClauseParser.g:263:21: ^( TOK_PARTITIONINGSPEC orderByClause )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC")
                        , root_1);

                        adaptor.addChild(root_1, stream_orderByClause.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // FromClauseParser.g:264:4: distributeByClause ( sortByClause )?
                    {
                    pushFollow(FOLLOW_distributeByClause_in_partitioningSpec1798);
                    distributeByClause136=gHiveParser.distributeByClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_distributeByClause.add(distributeByClause136.getTree());

                    // FromClauseParser.g:264:23: ( sortByClause )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==KW_SORT) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // FromClauseParser.g:264:23: sortByClause
                            {
                            pushFollow(FOLLOW_sortByClause_in_partitioningSpec1800);
                            sortByClause137=gHiveParser.sortByClause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sortByClause.add(sortByClause137.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: distributeByClause, sortByClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 264:37: -> ^( TOK_PARTITIONINGSPEC distributeByClause ( sortByClause )? )
                    {
                        // FromClauseParser.g:264:40: ^( TOK_PARTITIONINGSPEC distributeByClause ( sortByClause )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC")
                        , root_1);

                        adaptor.addChild(root_1, stream_distributeByClause.nextTree());

                        // FromClauseParser.g:264:82: ( sortByClause )?
                        if ( stream_sortByClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_sortByClause.nextTree());

                        }
                        stream_sortByClause.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // FromClauseParser.g:265:4: sortByClause
                    {
                    pushFollow(FOLLOW_sortByClause_in_partitioningSpec1819);
                    sortByClause138=gHiveParser.sortByClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sortByClause.add(sortByClause138.getTree());

                    // AST REWRITE
                    // elements: sortByClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 265:17: -> ^( TOK_PARTITIONINGSPEC sortByClause )
                    {
                        // FromClauseParser.g:265:20: ^( TOK_PARTITIONINGSPEC sortByClause )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC")
                        , root_1);

                        adaptor.addChild(root_1, stream_sortByClause.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // FromClauseParser.g:266:4: clusterByClause
                    {
                    pushFollow(FOLLOW_clusterByClause_in_partitioningSpec1834);
                    clusterByClause139=gHiveParser.clusterByClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_clusterByClause.add(clusterByClause139.getTree());

                    // AST REWRITE
                    // elements: clusterByClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 266:20: -> ^( TOK_PARTITIONINGSPEC clusterByClause )
                    {
                        // FromClauseParser.g:266:23: ^( TOK_PARTITIONINGSPEC clusterByClause )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC")
                        , root_1);

                        adaptor.addChild(root_1, stream_clusterByClause.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.msgs.pop(); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "partitioningSpec"


    public static class partitionTableFunctionSource_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "partitionTableFunctionSource"
    // FromClauseParser.g:269:1: partitionTableFunctionSource : ( subQuerySource | tableSource | partitionedTableFunction );
    public final HiveParser_FromClauseParser.partitionTableFunctionSource_return partitionTableFunctionSource() throws RecognitionException {
        HiveParser_FromClauseParser.partitionTableFunctionSource_return retval = new HiveParser_FromClauseParser.partitionTableFunctionSource_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_FromClauseParser.subQuerySource_return subQuerySource140 =null;

        HiveParser_FromClauseParser.tableSource_return tableSource141 =null;

        HiveParser_FromClauseParser.partitionedTableFunction_return partitionedTableFunction142 =null;



         gParent.msgs.push("partitionTableFunctionSource clause"); 
        try {
            // FromClauseParser.g:272:4: ( subQuerySource | tableSource | partitionedTableFunction )
            int alt40=3;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt40=1;
                }
                break;
            case Identifier:
                {
                int LA40_2 = input.LA(2);

                if ( (LA40_2==LPAREN) ) {
                    int LA40_4 = input.LA(3);

                    if ( (LA40_4==KW_ON) ) {
                        alt40=3;
                    }
                    else if ( (LA40_4==StringLiteral) ) {
                        alt40=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 4, input);

                        throw nvae;

                    }
                }
                else if ( (LA40_2==DOT||LA40_2==Identifier||LA40_2==KW_AS||LA40_2==KW_CLUSTER||LA40_2==KW_DISTRIBUTE||LA40_2==KW_ORDER||LA40_2==KW_PARTITION||LA40_2==KW_SORT||LA40_2==KW_TABLESAMPLE||LA40_2==RPAREN) ) {
                    alt40=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 2, input);

                    throw nvae;

                }
                }
                break;
            case KW_ADD:
            case KW_AFTER:
            case KW_ALTER:
            case KW_ANALYZE:
            case KW_ARCHIVE:
            case KW_ARRAY:
            case KW_AS:
            case KW_ASC:
            case KW_BEFORE:
            case KW_BETWEEN:
            case KW_BIGINT:
            case KW_BINARY:
            case KW_BOOLEAN:
            case KW_BOTH:
            case KW_BUCKET:
            case KW_BUCKETS:
            case KW_BY:
            case KW_CASCADE:
            case KW_CHANGE:
            case KW_CLUSTER:
            case KW_CLUSTERED:
            case KW_CLUSTERSTATUS:
            case KW_COLLECTION:
            case KW_COLUMNS:
            case KW_COMMENT:
            case KW_COMPUTE:
            case KW_CONCATENATE:
            case KW_CONTINUE:
            case KW_CREATE:
            case KW_CUBE:
            case KW_CURSOR:
            case KW_DATA:
            case KW_DATABASES:
            case KW_DATE:
            case KW_DATETIME:
            case KW_DBPROPERTIES:
            case KW_DECIMAL:
            case KW_DEFERRED:
            case KW_DELETE:
            case KW_DELIMITED:
            case KW_DEPENDENCY:
            case KW_DESC:
            case KW_DESCRIBE:
            case KW_DIRECTORIES:
            case KW_DIRECTORY:
            case KW_DISABLE:
            case KW_DISTRIBUTE:
            case KW_DOUBLE:
            case KW_DROP:
            case KW_ELEM_TYPE:
            case KW_ENABLE:
            case KW_ESCAPED:
            case KW_EXCLUSIVE:
            case KW_EXISTS:
            case KW_EXPLAIN:
            case KW_EXPORT:
            case KW_EXTERNAL:
            case KW_FALSE:
            case KW_FETCH:
            case KW_FIELDS:
            case KW_FILEFORMAT:
            case KW_FIRST:
            case KW_FLOAT:
            case KW_FOR:
            case KW_FORMAT:
            case KW_FORMATTED:
            case KW_FULL:
            case KW_FUNCTIONS:
            case KW_GRANT:
            case KW_GROUP:
            case KW_GROUPING:
            case KW_HOLD_DDLTIME:
            case KW_IDXPROPERTIES:
            case KW_IGNORE:
            case KW_IMPORT:
            case KW_IN:
            case KW_INDEX:
            case KW_INDEXES:
            case KW_INNER:
            case KW_INPATH:
            case KW_INPUTDRIVER:
            case KW_INPUTFORMAT:
            case KW_INSERT:
            case KW_INT:
            case KW_INTERSECT:
            case KW_INTO:
            case KW_IS:
            case KW_ITEMS:
            case KW_KEYS:
            case KW_KEY_TYPE:
            case KW_LATERAL:
            case KW_LEFT:
            case KW_LIKE:
            case KW_LIMIT:
            case KW_LINES:
            case KW_LOAD:
            case KW_LOCAL:
            case KW_LOCATION:
            case KW_LOCK:
            case KW_LOCKS:
            case KW_LOGICAL:
            case KW_LONG:
            case KW_MAPJOIN:
            case KW_MATERIALIZED:
            case KW_MINUS:
            case KW_MSCK:
            case KW_NOSCAN:
            case KW_NO_DROP:
            case KW_NULL:
            case KW_OF:
            case KW_OFFLINE:
            case KW_OPTION:
            case KW_ORCFILE:
            case KW_ORDER:
            case KW_OUT:
            case KW_OUTER:
            case KW_OUTPUTDRIVER:
            case KW_OUTPUTFORMAT:
            case KW_OVERWRITE:
            case KW_PARTITION:
            case KW_PARTITIONED:
            case KW_PARTITIONS:
            case KW_PERCENT:
            case KW_PLUS:
            case KW_PRETTY:
            case KW_PROCEDURE:
            case KW_PROTECTION:
            case KW_PURGE:
            case KW_RANGE:
            case KW_RCFILE:
            case KW_READ:
            case KW_READONLY:
            case KW_READS:
            case KW_REBUILD:
            case KW_RECORDREADER:
            case KW_RECORDWRITER:
            case KW_REGEXP:
            case KW_RENAME:
            case KW_REPAIR:
            case KW_REPLACE:
            case KW_RESTRICT:
            case KW_REVOKE:
            case KW_RIGHT:
            case KW_RLIKE:
            case KW_ROLE:
            case KW_ROLLUP:
            case KW_ROW:
            case KW_ROWS:
            case KW_SCHEMA:
            case KW_SCHEMAS:
            case KW_SEMI:
            case KW_SEQUENCEFILE:
            case KW_SERDE:
            case KW_SERDEPROPERTIES:
            case KW_SET:
            case KW_SETS:
            case KW_SHARED:
            case KW_SHOW:
            case KW_SHOW_DATABASE:
            case KW_SKEWED:
            case KW_SMALLINT:
            case KW_SORT:
            case KW_SORTED:
            case KW_SSL:
            case KW_STATISTICS:
            case KW_STORED:
            case KW_STREAMTABLE:
            case KW_STRING:
            case KW_STRUCT:
            case KW_TABLE:
            case KW_TABLES:
            case KW_TBLPROPERTIES:
            case KW_TEMPORARY:
            case KW_TERMINATED:
            case KW_TEXTFILE:
            case KW_TIMESTAMP:
            case KW_TINYINT:
            case KW_TO:
            case KW_TOUCH:
            case KW_TRIGGER:
            case KW_TRUE:
            case KW_TRUNCATE:
            case KW_UNARCHIVE:
            case KW_UNDO:
            case KW_UNION:
            case KW_UNIONTYPE:
            case KW_UNLOCK:
            case KW_UNSET:
            case KW_UNSIGNED:
            case KW_UPDATE:
            case KW_USE:
            case KW_USER:
            case KW_USING:
            case KW_UTC:
            case KW_UTCTIMESTAMP:
            case KW_VALUE_TYPE:
            case KW_VIEW:
            case KW_WHILE:
            case KW_WITH:
                {
                alt40=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }

            switch (alt40) {
                case 1 :
                    // FromClauseParser.g:273:4: subQuerySource
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_subQuerySource_in_partitionTableFunctionSource1871);
                    subQuerySource140=subQuerySource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, subQuerySource140.getTree());

                    }
                    break;
                case 2 :
                    // FromClauseParser.g:274:4: tableSource
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_tableSource_in_partitionTableFunctionSource1878);
                    tableSource141=tableSource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tableSource141.getTree());

                    }
                    break;
                case 3 :
                    // FromClauseParser.g:275:4: partitionedTableFunction
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_partitionedTableFunction_in_partitionTableFunctionSource1885);
                    partitionedTableFunction142=partitionedTableFunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, partitionedTableFunction142.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.msgs.pop(); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "partitionTableFunctionSource"


    public static class partitionedTableFunction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "partitionedTableFunction"
    // FromClauseParser.g:278:1: partitionedTableFunction : name= Identifier LPAREN KW_ON ptfsrc= partitionTableFunctionSource ( partitioningSpec )? ( ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )* )? RPAREN (alias= Identifier )? -> ^( TOK_PTBLFUNCTION $name ( $alias)? partitionTableFunctionSource ( partitioningSpec )? ( expression )* ) ;
    public final HiveParser_FromClauseParser.partitionedTableFunction_return partitionedTableFunction() throws RecognitionException {
        HiveParser_FromClauseParser.partitionedTableFunction_return retval = new HiveParser_FromClauseParser.partitionedTableFunction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token name=null;
        Token alias=null;
        Token LPAREN143=null;
        Token KW_ON144=null;
        Token Identifier146=null;
        Token LPAREN147=null;
        Token RPAREN149=null;
        Token COMMA150=null;
        Token Identifier151=null;
        Token LPAREN152=null;
        Token RPAREN154=null;
        Token RPAREN155=null;
        HiveParser_FromClauseParser.partitionTableFunctionSource_return ptfsrc =null;

        HiveParser_FromClauseParser.partitioningSpec_return partitioningSpec145 =null;

        HiveParser_IdentifiersParser.expression_return expression148 =null;

        HiveParser_IdentifiersParser.expression_return expression153 =null;


        CommonTree name_tree=null;
        CommonTree alias_tree=null;
        CommonTree LPAREN143_tree=null;
        CommonTree KW_ON144_tree=null;
        CommonTree Identifier146_tree=null;
        CommonTree LPAREN147_tree=null;
        CommonTree RPAREN149_tree=null;
        CommonTree COMMA150_tree=null;
        CommonTree Identifier151_tree=null;
        CommonTree LPAREN152_tree=null;
        CommonTree RPAREN154_tree=null;
        CommonTree RPAREN155_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_ON=new RewriteRuleTokenStream(adaptor,"token KW_ON");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_partitionTableFunctionSource=new RewriteRuleSubtreeStream(adaptor,"rule partitionTableFunctionSource");
        RewriteRuleSubtreeStream stream_partitioningSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitioningSpec");
         gParent.msgs.push("ptf clause"); 
        try {
            // FromClauseParser.g:281:4: (name= Identifier LPAREN KW_ON ptfsrc= partitionTableFunctionSource ( partitioningSpec )? ( ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )* )? RPAREN (alias= Identifier )? -> ^( TOK_PTBLFUNCTION $name ( $alias)? partitionTableFunctionSource ( partitioningSpec )? ( expression )* ) )
            // FromClauseParser.g:282:4: name= Identifier LPAREN KW_ON ptfsrc= partitionTableFunctionSource ( partitioningSpec )? ( ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )* )? RPAREN (alias= Identifier )?
            {
            name=(Token)match(input,Identifier,FOLLOW_Identifier_in_partitionedTableFunction1916); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(name);


            LPAREN143=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_partitionedTableFunction1921); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN143);


            KW_ON144=(Token)match(input,KW_ON,FOLLOW_KW_ON_in_partitionedTableFunction1923); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_ON.add(KW_ON144);


            pushFollow(FOLLOW_partitionTableFunctionSource_in_partitionedTableFunction1927);
            ptfsrc=partitionTableFunctionSource();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_partitionTableFunctionSource.add(ptfsrc.getTree());

            // FromClauseParser.g:283:53: ( partitioningSpec )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==KW_CLUSTER||LA41_0==KW_DISTRIBUTE||LA41_0==KW_ORDER||LA41_0==KW_PARTITION||LA41_0==KW_SORT) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // FromClauseParser.g:283:53: partitioningSpec
                    {
                    pushFollow(FOLLOW_partitioningSpec_in_partitionedTableFunction1929);
                    partitioningSpec145=partitioningSpec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_partitioningSpec.add(partitioningSpec145.getTree());

                    }
                    break;

            }


            // FromClauseParser.g:284:6: ( ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Identifier) && (synpred2_FromClauseParser())) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // FromClauseParser.g:284:7: ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )*
                    {
                    Identifier146=(Token)match(input,Identifier,FOLLOW_Identifier_in_partitionedTableFunction1951); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier146);


                    LPAREN147=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_partitionedTableFunction1953); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN147);


                    pushFollow(FOLLOW_expression_in_partitionedTableFunction1955);
                    expression148=gHiveParser.expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression148.getTree());

                    RPAREN149=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_partitionedTableFunction1957); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN149);


                    // FromClauseParser.g:284:85: ( COMMA Identifier LPAREN expression RPAREN )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==COMMA) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // FromClauseParser.g:284:87: COMMA Identifier LPAREN expression RPAREN
                    	    {
                    	    COMMA150=(Token)match(input,COMMA,FOLLOW_COMMA_in_partitionedTableFunction1961); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA150);


                    	    Identifier151=(Token)match(input,Identifier,FOLLOW_Identifier_in_partitionedTableFunction1963); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_Identifier.add(Identifier151);


                    	    LPAREN152=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_partitionedTableFunction1965); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN152);


                    	    pushFollow(FOLLOW_expression_in_partitionedTableFunction1967);
                    	    expression153=gHiveParser.expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression153.getTree());

                    	    RPAREN154=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_partitionedTableFunction1969); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN154);


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;

            }


            RPAREN155=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_partitionedTableFunction1979); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN155);


            // FromClauseParser.g:285:16: (alias= Identifier )?
            int alt44=2;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // FromClauseParser.g:285:16: alias= Identifier
                    {
                    alias=(Token)match(input,Identifier,FOLLOW_Identifier_in_partitionedTableFunction1983); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(alias);


                    }
                    break;

            }


            // AST REWRITE
            // elements: partitionTableFunctionSource, partitioningSpec, alias, expression, name
            // token labels: alias, name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_alias=new RewriteRuleTokenStream(adaptor,"token alias",alias);
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 286:4: -> ^( TOK_PTBLFUNCTION $name ( $alias)? partitionTableFunctionSource ( partitioningSpec )? ( expression )* )
            {
                // FromClauseParser.g:286:9: ^( TOK_PTBLFUNCTION $name ( $alias)? partitionTableFunctionSource ( partitioningSpec )? ( expression )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_PTBLFUNCTION, "TOK_PTBLFUNCTION")
                , root_1);

                adaptor.addChild(root_1, stream_name.nextNode());

                // FromClauseParser.g:286:35: ( $alias)?
                if ( stream_alias.hasNext() ) {
                    adaptor.addChild(root_1, stream_alias.nextNode());

                }
                stream_alias.reset();

                adaptor.addChild(root_1, stream_partitionTableFunctionSource.nextTree());

                // FromClauseParser.g:286:71: ( partitioningSpec )?
                if ( stream_partitioningSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_partitioningSpec.nextTree());

                }
                stream_partitioningSpec.reset();

                // FromClauseParser.g:286:89: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.msgs.pop(); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "partitionedTableFunction"


    public static class whereClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whereClause"
    // FromClauseParser.g:291:1: whereClause : KW_WHERE searchCondition -> ^( TOK_WHERE searchCondition ) ;
    public final HiveParser_FromClauseParser.whereClause_return whereClause() throws RecognitionException {
        HiveParser_FromClauseParser.whereClause_return retval = new HiveParser_FromClauseParser.whereClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_WHERE156=null;
        HiveParser_FromClauseParser.searchCondition_return searchCondition157 =null;


        CommonTree KW_WHERE156_tree=null;
        RewriteRuleTokenStream stream_KW_WHERE=new RewriteRuleTokenStream(adaptor,"token KW_WHERE");
        RewriteRuleSubtreeStream stream_searchCondition=new RewriteRuleSubtreeStream(adaptor,"rule searchCondition");
         gParent.msgs.push("where clause"); 
        try {
            // FromClauseParser.g:294:5: ( KW_WHERE searchCondition -> ^( TOK_WHERE searchCondition ) )
            // FromClauseParser.g:295:5: KW_WHERE searchCondition
            {
            KW_WHERE156=(Token)match(input,KW_WHERE,FOLLOW_KW_WHERE_in_whereClause2043); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_WHERE.add(KW_WHERE156);


            pushFollow(FOLLOW_searchCondition_in_whereClause2045);
            searchCondition157=searchCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_searchCondition.add(searchCondition157.getTree());

            // AST REWRITE
            // elements: searchCondition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 295:30: -> ^( TOK_WHERE searchCondition )
            {
                // FromClauseParser.g:295:33: ^( TOK_WHERE searchCondition )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_WHERE, "TOK_WHERE")
                , root_1);

                adaptor.addChild(root_1, stream_searchCondition.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.msgs.pop(); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whereClause"


    public static class searchCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "searchCondition"
    // FromClauseParser.g:298:1: searchCondition : expression ;
    public final HiveParser_FromClauseParser.searchCondition_return searchCondition() throws RecognitionException {
        HiveParser_FromClauseParser.searchCondition_return retval = new HiveParser_FromClauseParser.searchCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.expression_return expression158 =null;



         gParent.msgs.push("search condition"); 
        try {
            // FromClauseParser.g:301:5: ( expression )
            // FromClauseParser.g:302:5: expression
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expression_in_searchCondition2084);
            expression158=gHiveParser.expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression158.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.msgs.pop(); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "searchCondition"

    // $ANTLR start synpred1_FromClauseParser
    public final void synpred1_FromClauseParser_fragment() throws RecognitionException {
        // FromClauseParser.g:158:6: ( Identifier LPAREN )
        // FromClauseParser.g:158:7: Identifier LPAREN
        {
        match(input,Identifier,FOLLOW_Identifier_in_synpred1_FromClauseParser913); if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred1_FromClauseParser915); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_FromClauseParser

    // $ANTLR start synpred2_FromClauseParser
    public final void synpred2_FromClauseParser_fragment() throws RecognitionException {
        // FromClauseParser.g:284:7: ( Identifier LPAREN expression RPAREN )
        // FromClauseParser.g:284:8: Identifier LPAREN expression RPAREN
        {
        match(input,Identifier,FOLLOW_Identifier_in_synpred2_FromClauseParser1939); if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred2_FromClauseParser1941); if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred2_FromClauseParser1943);
        gHiveParser.expression();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred2_FromClauseParser1945); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_FromClauseParser

    // Delegated rules

    public final boolean synpred2_FromClauseParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_FromClauseParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_FromClauseParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_FromClauseParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA44 dfa44 = new DFA44(this);
    static final String DFA8_eotS =
        "\u00e1\uffff";
    static final String DFA8_eofS =
        "\1\uffff\2\15\11\uffff\1\15\34\uffff\1\15\u00b7\uffff";
    static final String DFA8_minS =
        "\1\32\2\12\1\164\4\uffff\1\u00ae\1\32\1\u0120\1\32\1\12\30\uffff"+
        "\1\32\1\u0130\1\u0120\1\32\1\12\30\uffff\1\32\1\u008d\3\7\u009a"+
        "\uffff";
    static final String DFA8_maxS =
        "\1\u0120\2\u012a\1\u00df\4\uffff\1\u0130\1\u011b\1\u0120\1\32\1"+
        "\u012a\30\uffff\1\u011b\1\u0130\1\u0120\1\32\1\u012a\30\uffff\1"+
        "\u0120\1\u00b9\3\u0132\u009a\uffff";
    static final String DFA8_acceptS =
        "\4\uffff\1\2\1\4\1\5\1\6\5\uffff\1\1\26\uffff\1\3\43\uffff\5\1\30"+
        "\uffff\5\1\30\uffff\137\1";
    static final String DFA8_specialS =
        "\u00e1\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\1\2\1\uffff\1\2\1\uffff\2\2\1\uffff\16\2\2\uffff\1\2\1"+
            "\uffff\3\2\1\uffff\1\2\1\uffff\4\2\1\uffff\1\2\1\uffff\1\2\1"+
            "\uffff\1\2\1\uffff\2\2\1\uffff\16\2\2\uffff\2\2\1\uffff\2\2"+
            "\1\uffff\1\2\2\uffff\1\2\1\uffff\1\2\1\5\3\2\1\uffff\7\2\1\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\4\2\1\uffff\2\2\1\uffff\14\2\1\6\1"+
            "\uffff\3\2\1\uffff\4\2\2\uffff\12\2\2\uffff\3\2\1\uffff\2\2"+
            "\1\uffff\4\2\1\uffff\1\2\1\uffff\6\2\2\uffff\1\2\1\uffff\5\2"+
            "\3\uffff\2\2\1\7\12\2\1\uffff\16\2\1\uffff\23\2\1\uffff\2\2"+
            "\1\uffff\4\2\1\uffff\4\2\1\uffff\4\2\1\uffff\3\2\1\4\4\2\1\uffff"+
            "\7\2\3\uffff\1\2\1\uffff\1\2\4\uffff\1\3",
            "\1\44\6\uffff\1\11\10\uffff\1\14\11\uffff\1\13\17\uffff\1\15"+
            "\15\uffff\1\15\25\uffff\1\15\34\uffff\1\15\3\uffff\1\15\1\uffff"+
            "\1\15\10\uffff\1\15\3\uffff\1\15\7\uffff\1\15\2\uffff\2\15\3"+
            "\uffff\1\15\11\uffff\1\15\17\uffff\1\15\35\uffff\1\15\6\uffff"+
            "\1\15\7\uffff\1\15\13\uffff\1\15\12\uffff\1\12\20\uffff\1\15"+
            "\20\uffff\1\15\1\uffff\1\15\5\uffff\1\10\11\uffff\1\15",
            "\1\44\6\uffff\1\45\10\uffff\1\51\11\uffff\1\50\17\uffff\1\15"+
            "\15\uffff\1\15\25\uffff\1\15\34\uffff\1\15\3\uffff\1\15\1\uffff"+
            "\1\15\10\uffff\1\15\3\uffff\1\15\7\uffff\1\15\2\uffff\2\15\3"+
            "\uffff\1\15\11\uffff\1\15\17\uffff\1\15\35\uffff\1\15\6\uffff"+
            "\1\15\7\uffff\1\15\13\uffff\1\15\12\uffff\1\47\20\uffff\1\15"+
            "\20\uffff\1\15\1\uffff\1\15\5\uffff\1\46\11\uffff\1\15",
            "\1\102\23\uffff\1\103\31\uffff\1\105\55\uffff\1\106\16\uffff"+
            "\1\104",
            "",
            "",
            "",
            "",
            "\1\15\u0081\uffff\1\110",
            "\1\111\1\112\1\uffff\1\112\1\uffff\2\112\1\uffff\16\112\2\uffff"+
            "\1\112\1\uffff\3\112\1\uffff\1\112\1\uffff\4\112\1\uffff\1\112"+
            "\1\uffff\1\112\1\uffff\1\112\1\uffff\2\112\1\uffff\16\112\2"+
            "\uffff\2\112\1\uffff\2\112\1\uffff\1\112\2\uffff\1\112\1\uffff"+
            "\1\112\1\uffff\3\112\1\uffff\7\112\1\uffff\3\112\1\uffff\1\112"+
            "\1\uffff\4\112\1\uffff\2\112\1\uffff\14\112\2\uffff\3\112\1"+
            "\uffff\4\112\2\uffff\12\112\2\uffff\3\112\1\uffff\2\112\1\uffff"+
            "\4\112\1\uffff\1\112\1\uffff\6\112\2\uffff\1\112\1\uffff\5\112"+
            "\3\uffff\2\112\1\uffff\12\112\1\uffff\16\112\1\uffff\23\112"+
            "\1\uffff\2\112\1\uffff\4\112\1\uffff\4\112\1\uffff\4\112\1\uffff"+
            "\3\112\1\uffff\4\112\1\uffff\7\112\3\uffff\1\112\1\uffff\1\112",
            "\1\113",
            "\1\114",
            "\1\44\51\uffff\1\15\15\uffff\1\15\25\uffff\1\15\34\uffff\1"+
            "\15\3\uffff\1\15\1\uffff\1\15\10\uffff\1\15\3\uffff\1\15\7\uffff"+
            "\1\15\2\uffff\2\15\3\uffff\1\15\11\uffff\1\15\17\uffff\1\15"+
            "\35\uffff\1\15\6\uffff\1\15\7\uffff\1\15\13\uffff\1\15\33\uffff"+
            "\1\15\20\uffff\1\15\1\uffff\1\15\17\uffff\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\145\1\146\1\uffff\1\146\1\uffff\2\146\1\uffff\16\146\2\uffff"+
            "\1\146\1\uffff\3\146\1\uffff\1\146\1\uffff\4\146\1\uffff\1\146"+
            "\1\uffff\1\146\1\uffff\1\146\1\uffff\2\146\1\uffff\16\146\2"+
            "\uffff\2\146\1\uffff\2\146\1\uffff\1\146\2\uffff\1\146\1\uffff"+
            "\1\146\1\uffff\3\146\1\uffff\7\146\1\uffff\3\146\1\uffff\1\146"+
            "\1\uffff\4\146\1\uffff\2\146\1\uffff\14\146\2\uffff\3\146\1"+
            "\uffff\4\146\2\uffff\12\146\2\uffff\3\146\1\uffff\2\146\1\uffff"+
            "\4\146\1\uffff\1\146\1\uffff\6\146\2\uffff\1\146\1\uffff\5\146"+
            "\3\uffff\2\146\1\uffff\12\146\1\uffff\16\146\1\uffff\23\146"+
            "\1\uffff\2\146\1\uffff\4\146\1\uffff\4\146\1\uffff\4\146\1\uffff"+
            "\3\146\1\uffff\4\146\1\uffff\7\146\3\uffff\1\146\1\uffff\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\44\51\uffff\1\15\15\uffff\1\15\25\uffff\1\15\34\uffff\1"+
            "\15\3\uffff\1\15\1\uffff\1\15\10\uffff\1\15\3\uffff\1\15\7\uffff"+
            "\1\15\2\uffff\2\15\3\uffff\1\15\11\uffff\1\15\17\uffff\1\15"+
            "\35\uffff\1\15\6\uffff\1\15\7\uffff\1\15\13\uffff\1\15\33\uffff"+
            "\1\15\20\uffff\1\15\1\uffff\1\15\17\uffff\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0082\1\u0083\1\uffff\1\u0083\1\uffff\2\u0083\1\uffff\16"+
            "\u0083\2\uffff\1\u0083\1\uffff\3\u0083\1\u0089\1\u0083\1\uffff"+
            "\4\u0083\1\uffff\1\u0083\1\uffff\1\u0083\1\uffff\1\u0083\1\uffff"+
            "\2\u0083\1\uffff\16\u0083\2\uffff\2\u0083\1\uffff\2\u0083\1"+
            "\uffff\1\u0083\2\uffff\1\u0083\1\uffff\1\u0083\1\u0086\3\u0083"+
            "\1\uffff\7\u0083\1\uffff\3\u0083\1\uffff\1\u0083\1\uffff\4\u0083"+
            "\1\uffff\2\u0083\1\uffff\14\u0083\1\u0087\1\uffff\3\u0083\1"+
            "\uffff\4\u0083\2\uffff\12\u0083\2\uffff\3\u0083\1\uffff\2\u0083"+
            "\1\uffff\4\u0083\1\uffff\1\u0083\1\uffff\6\u0083\2\uffff\1\u0083"+
            "\1\uffff\5\u0083\3\uffff\2\u0083\1\u0088\12\u0083\1\uffff\16"+
            "\u0083\1\uffff\23\u0083\1\uffff\2\u0083\1\uffff\4\u0083\1\uffff"+
            "\4\u0083\1\uffff\4\u0083\1\uffff\3\u0083\1\u0085\4\u0083\1\uffff"+
            "\7\u0083\3\uffff\1\u0083\1\uffff\1\u0083\4\uffff\1\u0084",
            "\1\u008b\53\uffff\1\u008a",
            "\1\u0095\5\uffff\1\u0099\1\uffff\1\u008c\2\uffff\1\u0098\7"+
            "\uffff\1\u00a1\1\u00a2\1\uffff\1\u00a2\1\u008d\2\u00a2\1\uffff"+
            "\1\u00a2\1\u009d\14\u00a2\1\u00a4\1\u00a3\1\u00a2\1\uffff\3"+
            "\u00a2\1\uffff\1\u00a2\1\uffff\4\u00a2\1\uffff\1\u00a2\1\uffff"+
            "\1\u00a2\1\uffff\1\u00a2\1\uffff\2\u00a2\1\uffff\1\u00a2\1\u0092"+
            "\14\u00a2\1\u00a8\1\u008e\2\u00a2\1\uffff\2\u00a2\1\uffff\1"+
            "\u00a2\2\uffff\1\u00a2\1\uffff\1\u00a2\1\uffff\3\u00a2\1\uffff"+
            "\1\u00a2\1\u009b\5\u00a2\1\uffff\3\u00a2\1\uffff\1\u00a2\1\uffff"+
            "\4\u00a2\1\uffff\2\u00a2\1\u009c\14\u00a2\2\uffff\3\u00a2\1"+
            "\uffff\4\u00a2\1\u00a7\1\uffff\12\u00a2\1\uffff\1\u009e\3\u00a2"+
            "\1\uffff\2\u00a2\1\u008f\1\u00a2\1\u0091\2\u00a2\1\uffff\1\u00a2"+
            "\1\uffff\6\u00a2\2\uffff\1\u00a2\1\uffff\5\u00a2\3\uffff\2\u00a2"+
            "\1\uffff\12\u00a2\1\uffff\16\u00a2\1\uffff\22\u00a2\1\u009f"+
            "\1\uffff\2\u00a2\1\uffff\4\u00a2\1\uffff\4\u00a2\1\u00aa\1\u00a2"+
            "\1\u009a\2\u00a2\1\uffff\2\u00a2\1\u00a0\1\uffff\4\u00a2\1\uffff"+
            "\7\u00a2\3\uffff\1\u00a2\1\uffff\1\u00a2\4\uffff\1\u00a5\1\u00a6"+
            "\1\uffff\1\u0090\2\uffff\1\u0093\1\u0090\6\uffff\1\u00a9\1\u0096"+
            "\1\u0094\1\u0090\1\u0097",
            "\1\u00b1\5\uffff\1\u00b5\4\uffff\1\u00b4\7\uffff\1\u00bd\1"+
            "\u00be\1\uffff\1\u00be\1\uffff\2\u00be\1\uffff\1\u00be\1\u00b9"+
            "\14\u00be\1\u00c0\1\u00bf\1\u00be\1\uffff\3\u00be\1\uffff\1"+
            "\u00be\1\uffff\4\u00be\1\uffff\1\u00be\1\uffff\1\u00be\1\uffff"+
            "\1\u00be\1\uffff\2\u00be\1\uffff\1\u00be\1\u00ae\14\u00be\1"+
            "\u00c4\1\uffff\2\u00be\1\uffff\2\u00be\1\uffff\1\u00be\2\uffff"+
            "\1\u00be\1\uffff\1\u00be\1\uffff\3\u00be\1\uffff\1\u00be\1\u00b7"+
            "\5\u00be\1\uffff\3\u00be\1\uffff\1\u00be\1\uffff\4\u00be\1\uffff"+
            "\2\u00be\1\u00b8\14\u00be\2\uffff\3\u00be\1\uffff\4\u00be\1"+
            "\u00c3\1\uffff\12\u00be\1\uffff\1\u00ba\3\u00be\1\uffff\2\u00be"+
            "\1\u00ab\1\u00be\1\u00ad\2\u00be\1\uffff\1\u00be\1\uffff\6\u00be"+
            "\2\uffff\1\u00be\1\uffff\5\u00be\3\uffff\2\u00be\1\uffff\12"+
            "\u00be\1\uffff\16\u00be\1\uffff\22\u00be\1\u00bb\1\uffff\2\u00be"+
            "\1\uffff\4\u00be\1\uffff\4\u00be\1\uffff\1\u00be\1\u00b6\2\u00be"+
            "\1\uffff\2\u00be\1\u00bc\1\uffff\4\u00be\1\uffff\7\u00be\3\uffff"+
            "\1\u00be\1\uffff\1\u00be\4\uffff\1\u00c1\1\u00c2\1\uffff\1\u00ac"+
            "\2\uffff\1\u00af\1\u00ac\6\uffff\1\u00c5\1\u00b2\1\u00b0\1\u00ac"+
            "\1\u00b3",
            "\1\u00cc\5\uffff\1\u00d0\4\uffff\1\u00cf\7\uffff\1\u00d8\1"+
            "\u00d9\1\uffff\1\u00d9\1\uffff\2\u00d9\1\uffff\1\u00d9\1\u00d4"+
            "\14\u00d9\1\u00db\1\u00da\1\u00d9\1\uffff\3\u00d9\1\uffff\1"+
            "\u00d9\1\uffff\4\u00d9\1\uffff\1\u00d9\1\uffff\1\u00d9\1\uffff"+
            "\1\u00d9\1\uffff\2\u00d9\1\uffff\1\u00d9\1\u00c9\14\u00d9\1"+
            "\u00df\1\uffff\2\u00d9\1\uffff\2\u00d9\1\uffff\1\u00d9\2\uffff"+
            "\1\u00d9\1\uffff\1\u00d9\1\uffff\3\u00d9\1\uffff\1\u00d9\1\u00d2"+
            "\5\u00d9\1\uffff\3\u00d9\1\uffff\1\u00d9\1\uffff\4\u00d9\1\uffff"+
            "\2\u00d9\1\u00d3\14\u00d9\2\uffff\3\u00d9\1\uffff\4\u00d9\1"+
            "\u00de\1\uffff\12\u00d9\1\uffff\1\u00d5\3\u00d9\1\uffff\2\u00d9"+
            "\1\u00c6\1\u00d9\1\u00c8\2\u00d9\1\uffff\1\u00d9\1\uffff\6\u00d9"+
            "\2\uffff\1\u00d9\1\uffff\5\u00d9\3\uffff\2\u00d9\1\uffff\12"+
            "\u00d9\1\uffff\16\u00d9\1\uffff\22\u00d9\1\u00d6\1\uffff\2\u00d9"+
            "\1\uffff\4\u00d9\1\uffff\4\u00d9\1\uffff\1\u00d9\1\u00d1\2\u00d9"+
            "\1\uffff\2\u00d9\1\u00d7\1\uffff\4\u00d9\1\uffff\7\u00d9\3\uffff"+
            "\1\u00d9\1\uffff\1\u00d9\4\uffff\1\u00dc\1\u00dd\1\uffff\1\u00c7"+
            "\2\uffff\1\u00ca\1\u00c7\6\uffff\1\u00e0\1\u00cd\1\u00cb\1\u00c7"+
            "\1\u00ce",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "94:1: joinSource : ( fromSource ( joinToken ^ fromSource ( KW_ON ! expression )? )* | uniqueJoinToken ^ uniqueJoinSource ( COMMA ! uniqueJoinSource )+ | multipleTrack | exclusivenessJoinSource | intersectJoinSource | projectSource );";
        }
    }
    static final String DFA18_eotS =
        "\75\uffff";
    static final String DFA18_eofS =
        "\1\uffff\1\2\73\uffff";
    static final String DFA18_minS =
        "\1\32\1\12\2\uffff\1\7\70\uffff";
    static final String DFA18_maxS =
        "\1\u0120\1\u012a\2\uffff\1\u0132\70\uffff";
    static final String DFA18_acceptS =
        "\2\uffff\1\2\1\3\36\uffff\1\1\32\uffff";
    static final String DFA18_specialS =
        "\4\uffff\1\0\70\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1\1\2\1\uffff\1\2\1\uffff\2\2\1\uffff\16\2\2\uffff\1\2\1"+
            "\uffff\3\2\1\uffff\1\2\1\uffff\4\2\1\uffff\1\2\1\uffff\1\2\1"+
            "\uffff\1\2\1\uffff\2\2\1\uffff\16\2\2\uffff\2\2\1\uffff\2\2"+
            "\1\uffff\1\2\2\uffff\1\2\1\uffff\1\2\1\uffff\3\2\1\uffff\7\2"+
            "\1\uffff\3\2\1\uffff\1\2\1\uffff\4\2\1\uffff\2\2\1\uffff\14"+
            "\2\2\uffff\3\2\1\uffff\4\2\2\uffff\12\2\2\uffff\3\2\1\uffff"+
            "\2\2\1\uffff\4\2\1\uffff\1\2\1\uffff\6\2\2\uffff\1\2\1\uffff"+
            "\5\2\3\uffff\2\2\1\uffff\12\2\1\uffff\16\2\1\uffff\23\2\1\uffff"+
            "\2\2\1\uffff\4\2\1\uffff\4\2\1\uffff\4\2\1\uffff\3\2\1\uffff"+
            "\4\2\1\uffff\7\2\3\uffff\1\2\1\uffff\1\2\4\uffff\1\3",
            "\1\2\6\uffff\1\2\10\uffff\1\2\11\uffff\1\2\17\uffff\1\2\15"+
            "\uffff\1\2\25\uffff\1\2\34\uffff\1\2\3\uffff\1\2\1\uffff\1\2"+
            "\10\uffff\1\2\3\uffff\1\2\7\uffff\1\2\2\uffff\2\2\3\uffff\1"+
            "\2\11\uffff\1\2\13\uffff\1\2\3\uffff\1\2\35\uffff\1\2\6\uffff"+
            "\1\2\7\uffff\1\2\13\uffff\1\2\12\uffff\1\2\20\uffff\1\2\20\uffff"+
            "\1\2\1\uffff\1\2\5\uffff\1\4\11\uffff\1\2",
            "",
            "",
            "\1\2\5\uffff\1\2\4\uffff\1\2\7\uffff\2\2\1\uffff\1\2\1\uffff"+
            "\2\2\1\uffff\21\2\1\uffff\3\2\1\uffff\1\2\1\uffff\4\2\1\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\2\2\1\uffff\17\2\1\uffff"+
            "\2\2\1\uffff\2\2\1\uffff\1\2\2\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\3\2\1\uffff\7\2\1\uffff\3\2\1\uffff\1\2\1\uffff\4\2\1\uffff"+
            "\17\2\2\uffff\3\2\1\uffff\5\2\1\uffff\12\2\1\uffff\4\2\1\uffff"+
            "\7\2\1\42\1\2\1\uffff\6\2\2\uffff\1\2\1\uffff\5\2\3\uffff\2"+
            "\2\1\uffff\12\2\1\uffff\16\2\1\uffff\23\2\1\uffff\2\2\1\uffff"+
            "\4\2\1\uffff\4\2\1\uffff\4\2\1\uffff\3\2\1\uffff\4\2\1\uffff"+
            "\7\2\3\uffff\1\2\1\uffff\1\2\4\uffff\2\2\1\uffff\1\2\2\uffff"+
            "\2\2\7\uffff\4\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "158:5: ( ( Identifier LPAREN )=> partitionedTableFunction | tableSource | subQuerySource )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_4 = input.LA(1);

                         
                        int index18_4 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA18_4==KW_ON) && (synpred1_FromClauseParser())) {s = 34;}

                        else if ( (LA18_4==BigintLiteral||LA18_4==CharSetName||LA18_4==DecimalLiteral||(LA18_4 >= Identifier && LA18_4 <= KW_ADD)||LA18_4==KW_AFTER||(LA18_4 >= KW_ALTER && LA18_4 <= KW_ANALYZE)||(LA18_4 >= KW_ARCHIVE && LA18_4 <= KW_CHANGE)||(LA18_4 >= KW_CLUSTER && LA18_4 <= KW_CLUSTERSTATUS)||LA18_4==KW_COLLECTION||(LA18_4 >= KW_COLUMNS && LA18_4 <= KW_CONCATENATE)||LA18_4==KW_CONTINUE||LA18_4==KW_CREATE||LA18_4==KW_CUBE||(LA18_4 >= KW_CURSOR && LA18_4 <= KW_DATA)||(LA18_4 >= KW_DATABASES && LA18_4 <= KW_DISTANCE)||(LA18_4 >= KW_DISTRIBUTE && LA18_4 <= KW_DOUBLE)||(LA18_4 >= KW_DROP && LA18_4 <= KW_ELEM_TYPE)||LA18_4==KW_ENABLE||LA18_4==KW_ESCAPED||LA18_4==KW_EXCLUSIVE||(LA18_4 >= KW_EXISTS && LA18_4 <= KW_EXPORT)||(LA18_4 >= KW_EXTERNAL && LA18_4 <= KW_FLOAT)||(LA18_4 >= KW_FOR && LA18_4 <= KW_FORMATTED)||LA18_4==KW_FULL||(LA18_4 >= KW_FUNCTIONS && LA18_4 <= KW_GROUPING)||(LA18_4 >= KW_HOLD_DDLTIME && LA18_4 <= KW_INTERSECT)||(LA18_4 >= KW_INTO && LA18_4 <= KW_ITEMS)||(LA18_4 >= KW_KEYS && LA18_4 <= KW_LENGTH)||(LA18_4 >= KW_LIKE && LA18_4 <= KW_LONG)||(LA18_4 >= KW_MAP && LA18_4 <= KW_MINUS)||(LA18_4 >= KW_MSCK && LA18_4 <= KW_OFFLINE)||LA18_4==KW_OPTION||(LA18_4 >= KW_ORCFILE && LA18_4 <= KW_OUTPUTFORMAT)||LA18_4==KW_OVERWRITE||(LA18_4 >= KW_PARTITION && LA18_4 <= KW_PLUS)||(LA18_4 >= KW_PRETTY && LA18_4 <= KW_PROCEDURE)||(LA18_4 >= KW_PROTECTION && LA18_4 <= KW_RECORDWRITER)||(LA18_4 >= KW_REGEXP && LA18_4 <= KW_SCHEMAS)||(LA18_4 >= KW_SEMI && LA18_4 <= KW_STRUCT)||(LA18_4 >= KW_TABLE && LA18_4 <= KW_TABLES)||(LA18_4 >= KW_TBLPROPERTIES && LA18_4 <= KW_TEXTFILE)||(LA18_4 >= KW_TIMESTAMP && LA18_4 <= KW_TOUCH)||(LA18_4 >= KW_TRIGGER && LA18_4 <= KW_UNARCHIVE)||(LA18_4 >= KW_UNDO && LA18_4 <= KW_UNIONTYPE)||(LA18_4 >= KW_UNLOCK && LA18_4 <= KW_UPDATE)||(LA18_4 >= KW_USE && LA18_4 <= KW_VIEW)||LA18_4==KW_WHILE||LA18_4==KW_WITH||(LA18_4 >= LPAREN && LA18_4 <= LSQUARE)||LA18_4==MINUS||(LA18_4 >= Number && LA18_4 <= PLUS)||(LA18_4 >= SmallintLiteral && LA18_4 <= TinyintLiteral)) ) {s = 2;}

                         
                        input.seek(index18_4);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA25_eotS =
        "\123\uffff";
    static final String DFA25_eofS =
        "\1\2\122\uffff";
    static final String DFA25_minS =
        "\1\12\1\7\35\uffff\1\4\63\uffff";
    static final String DFA25_maxS =
        "\1\u012a\1\u0132\35\uffff\1\u0130\63\uffff";
    static final String DFA25_acceptS =
        "\2\uffff\1\2\66\uffff\3\1\27\uffff";
    static final String DFA25_specialS =
        "\123\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\2\17\uffff\1\2\11\uffff\1\2\17\uffff\1\2\15\uffff\1\2\25"+
            "\uffff\1\2\34\uffff\1\2\3\uffff\1\2\1\uffff\1\2\10\uffff\1\2"+
            "\3\uffff\1\2\7\uffff\1\2\2\uffff\2\2\3\uffff\1\2\11\uffff\1"+
            "\2\13\uffff\1\2\3\uffff\1\2\10\uffff\1\2\24\uffff\1\2\6\uffff"+
            "\1\2\7\uffff\1\2\13\uffff\1\2\12\uffff\1\2\20\uffff\1\2\20\uffff"+
            "\1\2\1\uffff\1\2\5\uffff\1\1\11\uffff\1\2",
            "\1\2\5\uffff\1\2\4\uffff\1\2\7\uffff\2\2\1\uffff\1\2\1\uffff"+
            "\2\2\1\uffff\21\2\1\uffff\3\2\1\uffff\1\2\1\uffff\4\2\1\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\2\2\1\uffff\17\2\1\uffff"+
            "\2\2\1\uffff\2\2\1\uffff\1\2\2\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\3\2\1\uffff\7\2\1\uffff\3\2\1\uffff\1\2\1\uffff\4\2\1\uffff"+
            "\17\2\2\uffff\3\2\1\uffff\5\2\1\uffff\12\2\1\uffff\4\2\1\uffff"+
            "\7\2\1\uffff\1\2\1\uffff\6\2\2\uffff\1\2\1\uffff\5\2\3\uffff"+
            "\2\2\1\uffff\12\2\1\uffff\16\2\1\uffff\23\2\1\uffff\2\2\1\uffff"+
            "\4\2\1\uffff\4\2\1\uffff\4\2\1\uffff\3\2\1\uffff\4\2\1\uffff"+
            "\7\2\3\uffff\1\2\1\uffff\1\2\4\uffff\2\2\1\uffff\1\2\2\uffff"+
            "\2\2\7\uffff\1\2\1\37\2\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\2\3\uffff\1\72\3\uffff\2\2\1\uffff\1\2\2\uffff\1\71\1\2"+
            "\1\uffff\2\2\10\uffff\1\2\5\uffff\1\2\26\uffff\1\2\102\uffff"+
            "\1\2\14\uffff\1\2\10\uffff\1\2\21\uffff\1\2\6\uffff\1\2\7\uffff"+
            "\1\2\30\uffff\1\2\6\uffff\1\2\105\uffff\2\2\1\uffff\1\2\1\uffff"+
            "\3\2\1\uffff\1\2\2\uffff\1\73\3\uffff\1\2\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "191:25: (props= tableProperties )?";
        }
    }
    static final String DFA28_eotS =
        "\124\uffff";
    static final String DFA28_eofS =
        "\1\3\1\uffff\1\1\121\uffff";
    static final String DFA28_minS =
        "\1\12\1\uffff\1\12\33\uffff\1\7\65\uffff";
    static final String DFA28_maxS =
        "\1\u012a\1\uffff\1\u012a\33\uffff\1\u0132\65\uffff";
    static final String DFA28_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\66\uffff\32\1";
    static final String DFA28_specialS =
        "\124\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\3\17\uffff\1\2\11\uffff\1\1\17\uffff\1\3\15\uffff\1\3\25"+
            "\uffff\1\3\34\uffff\1\3\3\uffff\1\3\1\uffff\1\3\10\uffff\1\3"+
            "\3\uffff\1\3\7\uffff\1\3\2\uffff\2\3\3\uffff\1\3\11\uffff\1"+
            "\3\13\uffff\1\3\3\uffff\1\3\10\uffff\1\3\24\uffff\1\3\6\uffff"+
            "\1\3\7\uffff\1\3\13\uffff\1\3\33\uffff\1\3\20\uffff\1\3\1\uffff"+
            "\1\3\5\uffff\1\3\11\uffff\1\3",
            "",
            "\1\1\17\uffff\1\1\31\uffff\1\1\15\uffff\1\1\25\uffff\1\1\34"+
            "\uffff\1\1\3\uffff\1\1\1\uffff\1\1\10\uffff\1\1\3\uffff\1\1"+
            "\7\uffff\1\1\2\uffff\2\1\3\uffff\1\1\11\uffff\1\1\13\uffff\1"+
            "\1\3\uffff\1\1\10\uffff\1\1\24\uffff\1\1\6\uffff\1\1\7\uffff"+
            "\1\1\13\uffff\1\1\33\uffff\1\1\20\uffff\1\1\1\uffff\1\1\5\uffff"+
            "\1\36\11\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\100\5\uffff\1\104\4\uffff\1\103\7\uffff\1\114\1\115\1\uffff"+
            "\1\115\1\uffff\2\115\1\uffff\1\115\1\110\14\115\1\117\1\116"+
            "\1\115\1\uffff\3\115\1\uffff\1\115\1\uffff\4\115\1\uffff\1\115"+
            "\1\uffff\1\115\1\uffff\1\115\1\uffff\2\115\1\uffff\1\115\1\75"+
            "\14\115\1\123\1\uffff\2\115\1\uffff\2\115\1\uffff\1\115\2\uffff"+
            "\1\115\1\uffff\1\115\1\uffff\3\115\1\uffff\1\115\1\106\5\115"+
            "\1\uffff\3\115\1\uffff\1\115\1\uffff\4\115\1\uffff\2\115\1\107"+
            "\14\115\2\uffff\3\115\1\uffff\4\115\1\122\1\uffff\12\115\1\uffff"+
            "\1\111\3\115\1\uffff\2\115\1\72\1\115\1\74\2\115\1\uffff\1\115"+
            "\1\uffff\6\115\2\uffff\1\115\1\uffff\5\115\3\uffff\2\115\1\uffff"+
            "\12\115\1\uffff\16\115\1\uffff\22\115\1\112\1\uffff\2\115\1"+
            "\uffff\4\115\1\uffff\4\115\1\uffff\1\115\1\105\2\115\1\uffff"+
            "\2\115\1\113\1\uffff\4\115\1\uffff\7\115\3\uffff\1\115\1\uffff"+
            "\1\115\4\uffff\1\120\1\121\1\uffff\1\73\2\uffff\1\76\1\73\7"+
            "\uffff\1\101\1\77\1\73\1\102",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "191:68: ( ( KW_AS )? alias= Identifier )?";
        }
    }
    static final String DFA35_eotS =
        "\147\uffff";
    static final String DFA35_eofS =
        "\1\uffff\2\4\144\uffff";
    static final String DFA35_minS =
        "\1\32\2\12\1\32\56\uffff\1\32\64\uffff";
    static final String DFA35_maxS =
        "\1\u011b\2\u012a\1\u012e\56\uffff\1\u012e\64\uffff";
    static final String DFA35_acceptS =
        "\4\uffff\1\2\135\uffff\1\1\4\uffff";
    static final String DFA35_specialS =
        "\147\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\1\1\2\1\uffff\1\2\1\uffff\2\2\1\uffff\16\2\2\uffff\1\2\1"+
            "\uffff\3\2\1\uffff\1\2\1\uffff\4\2\1\uffff\1\2\1\uffff\1\2\1"+
            "\uffff\1\2\1\uffff\2\2\1\uffff\16\2\2\uffff\2\2\1\uffff\2\2"+
            "\1\uffff\1\2\2\uffff\1\2\1\uffff\1\2\1\uffff\3\2\1\uffff\7\2"+
            "\1\uffff\3\2\1\uffff\1\2\1\uffff\4\2\1\uffff\2\2\1\uffff\14"+
            "\2\2\uffff\3\2\1\uffff\4\2\2\uffff\12\2\2\uffff\3\2\1\uffff"+
            "\2\2\1\uffff\4\2\1\uffff\1\2\1\uffff\6\2\2\uffff\1\2\1\uffff"+
            "\5\2\3\uffff\2\2\1\uffff\12\2\1\uffff\16\2\1\uffff\23\2\1\uffff"+
            "\2\2\1\uffff\4\2\1\uffff\4\2\1\uffff\4\2\1\uffff\3\2\1\uffff"+
            "\4\2\1\uffff\7\2\3\uffff\1\2\1\uffff\1\2",
            "\1\4\6\uffff\1\3\10\uffff\1\4\11\uffff\1\4\17\uffff\2\4\5\uffff"+
            "\2\4\5\uffff\1\4\25\uffff\1\4\11\uffff\2\4\20\uffff\2\4\3\uffff"+
            "\1\4\1\uffff\1\4\2\uffff\1\4\2\uffff\1\4\2\uffff\1\4\3\uffff"+
            "\1\4\7\uffff\1\4\2\uffff\2\4\2\uffff\2\4\3\uffff\1\4\5\uffff"+
            "\1\4\13\uffff\1\4\3\uffff\1\4\10\uffff\2\4\23\uffff\1\4\6\uffff"+
            "\1\4\3\uffff\1\4\3\uffff\1\4\6\uffff\1\4\2\uffff\1\4\1\uffff"+
            "\1\4\3\uffff\1\4\6\uffff\2\4\6\uffff\1\4\10\uffff\1\4\20\uffff"+
            "\1\4\1\uffff\1\4\5\uffff\1\4\11\uffff\1\4",
            "\1\4\6\uffff\1\62\10\uffff\1\4\11\uffff\1\4\17\uffff\2\4\5"+
            "\uffff\2\4\5\uffff\1\4\25\uffff\1\4\11\uffff\2\4\20\uffff\2"+
            "\4\3\uffff\1\4\1\uffff\1\4\2\uffff\1\4\2\uffff\1\4\2\uffff\1"+
            "\4\3\uffff\1\4\7\uffff\1\4\2\uffff\2\4\2\uffff\2\4\3\uffff\1"+
            "\4\5\uffff\1\4\13\uffff\1\4\3\uffff\1\4\10\uffff\2\4\23\uffff"+
            "\1\4\6\uffff\1\4\3\uffff\1\4\3\uffff\1\4\6\uffff\1\4\2\uffff"+
            "\1\4\1\uffff\1\4\3\uffff\1\4\6\uffff\2\4\6\uffff\1\4\10\uffff"+
            "\1\4\20\uffff\1\4\1\uffff\1\4\5\uffff\1\4\11\uffff\1\4",
            "\2\142\1\uffff\1\142\1\uffff\2\142\1\uffff\16\142\2\uffff\1"+
            "\142\1\uffff\3\142\1\uffff\1\142\1\uffff\4\142\1\uffff\1\142"+
            "\1\uffff\1\142\1\uffff\1\142\1\uffff\2\142\1\uffff\16\142\2"+
            "\uffff\2\142\1\uffff\2\142\1\uffff\1\142\2\uffff\1\142\1\uffff"+
            "\1\142\1\uffff\3\142\1\uffff\7\142\1\uffff\3\142\1\uffff\1\142"+
            "\1\uffff\4\142\1\uffff\2\142\1\uffff\14\142\2\uffff\3\142\1"+
            "\uffff\4\142\2\uffff\12\142\2\uffff\3\142\1\uffff\2\142\1\uffff"+
            "\4\142\1\uffff\1\142\1\uffff\6\142\2\uffff\1\142\1\uffff\5\142"+
            "\3\uffff\2\142\1\uffff\12\142\1\uffff\16\142\1\uffff\23\142"+
            "\1\uffff\2\142\1\uffff\4\142\1\uffff\4\142\1\uffff\4\142\1\uffff"+
            "\3\142\1\uffff\4\142\1\uffff\7\142\3\uffff\1\142\1\uffff\1\142"+
            "\22\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\142\1\uffff\1\142\1\uffff\2\142\1\uffff\16\142\2\uffff\1"+
            "\142\1\uffff\3\142\1\uffff\1\142\1\uffff\4\142\1\uffff\1\142"+
            "\1\uffff\1\142\1\uffff\1\142\1\uffff\2\142\1\uffff\16\142\2"+
            "\uffff\2\142\1\uffff\2\142\1\uffff\1\142\2\uffff\1\142\1\uffff"+
            "\1\142\1\uffff\3\142\1\uffff\7\142\1\uffff\3\142\1\uffff\1\142"+
            "\1\uffff\4\142\1\uffff\2\142\1\uffff\14\142\2\uffff\3\142\1"+
            "\uffff\4\142\2\uffff\12\142\2\uffff\3\142\1\uffff\2\142\1\uffff"+
            "\4\142\1\uffff\1\142\1\uffff\6\142\2\uffff\1\142\1\uffff\5\142"+
            "\3\uffff\2\142\1\uffff\12\142\1\uffff\16\142\1\uffff\23\142"+
            "\1\uffff\2\142\1\uffff\4\142\1\uffff\4\142\1\uffff\4\142\1\uffff"+
            "\3\142\1\uffff\4\142\1\uffff\7\142\3\uffff\1\142\1\uffff\1\142"+
            "\22\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "231:1: tableName : (db= identifier DOT tab= identifier -> ^( TOK_TABNAME $db $tab) |tab= identifier -> ^( TOK_TABNAME $tab) );";
        }
    }
    static final String DFA44_eotS =
        "\123\uffff";
    static final String DFA44_eofS =
        "\1\2\1\36\121\uffff";
    static final String DFA44_minS =
        "\2\12\33\uffff\1\7\65\uffff";
    static final String DFA44_maxS =
        "\2\u012a\33\uffff\1\u0132\65\uffff";
    static final String DFA44_acceptS =
        "\2\uffff\1\2\33\uffff\1\1\32\uffff\32\1";
    static final String DFA44_specialS =
        "\123\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\2\17\uffff\1\1\31\uffff\1\2\15\uffff\1\2\25\uffff\1\2\34"+
            "\uffff\1\2\3\uffff\1\2\1\uffff\1\2\10\uffff\1\2\3\uffff\1\2"+
            "\7\uffff\1\2\2\uffff\2\2\3\uffff\1\2\11\uffff\1\2\13\uffff\1"+
            "\2\3\uffff\1\2\10\uffff\1\2\24\uffff\1\2\6\uffff\1\2\7\uffff"+
            "\1\2\13\uffff\1\2\33\uffff\1\2\20\uffff\1\2\1\uffff\1\2\5\uffff"+
            "\1\2\11\uffff\1\2",
            "\1\36\17\uffff\1\36\31\uffff\1\36\15\uffff\1\36\25\uffff\1"+
            "\36\34\uffff\1\36\3\uffff\1\36\1\uffff\1\36\10\uffff\1\36\3"+
            "\uffff\1\36\7\uffff\1\36\2\uffff\2\36\3\uffff\1\36\11\uffff"+
            "\1\36\13\uffff\1\36\3\uffff\1\36\10\uffff\1\36\24\uffff\1\36"+
            "\6\uffff\1\36\7\uffff\1\36\13\uffff\1\36\33\uffff\1\36\20\uffff"+
            "\1\36\1\uffff\1\36\5\uffff\1\35\11\uffff\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\77\5\uffff\1\103\4\uffff\1\102\7\uffff\1\113\1\114\1\uffff"+
            "\1\114\1\uffff\2\114\1\uffff\1\114\1\107\14\114\1\116\1\115"+
            "\1\114\1\uffff\3\114\1\uffff\1\114\1\uffff\4\114\1\uffff\1\114"+
            "\1\uffff\1\114\1\uffff\1\114\1\uffff\2\114\1\uffff\1\114\1\74"+
            "\14\114\1\122\1\uffff\2\114\1\uffff\2\114\1\uffff\1\114\2\uffff"+
            "\1\114\1\uffff\1\114\1\uffff\3\114\1\uffff\1\114\1\105\5\114"+
            "\1\uffff\3\114\1\uffff\1\114\1\uffff\4\114\1\uffff\2\114\1\106"+
            "\14\114\2\uffff\3\114\1\uffff\4\114\1\121\1\uffff\12\114\1\uffff"+
            "\1\110\3\114\1\uffff\2\114\1\71\1\114\1\73\2\114\1\uffff\1\114"+
            "\1\uffff\6\114\2\uffff\1\114\1\uffff\5\114\3\uffff\2\114\1\uffff"+
            "\12\114\1\uffff\16\114\1\uffff\22\114\1\111\1\uffff\2\114\1"+
            "\uffff\4\114\1\uffff\4\114\1\uffff\1\114\1\104\2\114\1\uffff"+
            "\2\114\1\112\1\uffff\4\114\1\uffff\7\114\3\uffff\1\114\1\uffff"+
            "\1\114\4\uffff\1\117\1\120\1\uffff\1\72\2\uffff\1\75\1\72\7"+
            "\uffff\1\100\1\76\1\72\1\101",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "285:16: (alias= Identifier )?";
        }
    }
 

    public static final BitSet FOLLOW_STAR_in_tableAllColumns57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableName_in_tableAllColumns79 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DOT_in_tableAllColumns81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_STAR_in_tableAllColumns83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_tableOrColumn131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList170 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_expressionList173 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_expressionList175 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_identifier_in_aliasList217 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_aliasList220 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_identifier_in_aliasList222 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_KW_FROM_in_fromClause266 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEFA5B3FFF6AL,0xFA7EBDB9FF9EEFFFL,0xF7B7FFFF7FFEFFF8L,0x000000010A3FBFDEL});
    public static final BitSet FOLLOW_joinSource_in_fromClause268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FROM_in_fromClause284 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_coalesceSource_in_fromClause286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_COALESCE_in_coalesceSource323 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000010A3FBDDEL});
    public static final BitSet FOLLOW_fromSource_in_coalesceSource325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fromSource_in_joinSource357 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000004L,0x0000000000110010L,0x0000000000800000L});
    public static final BitSet FOLLOW_joinToken_in_joinSource361 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000010A3FBDDEL});
    public static final BitSet FOLLOW_fromSource_in_joinSource364 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000004L,0x0000400000110010L,0x0000000000800000L});
    public static final BitSet FOLLOW_KW_ON_in_joinSource367 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_joinSource370 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000004L,0x0000000000110010L,0x0000000000800000L});
    public static final BitSet FOLLOW_uniqueJoinToken_in_joinSource383 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFDCL,0x000000010A3FBDDEL});
    public static final BitSet FOLLOW_uniqueJoinSource_in_joinSource386 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_joinSource389 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFDCL,0x000000010A3FBDDEL});
    public static final BitSet FOLLOW_uniqueJoinSource_in_joinSource392 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_multipleTrack_in_joinSource402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exclusivenessJoinSource_in_joinSource410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intersectJoinSource_in_joinSource418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_projectSource_in_joinSource426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_PRESERVE_in_uniqueJoinSource454 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000010A3FBDDEL});
    public static final BitSet FOLLOW_fromSource_in_uniqueJoinSource457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_uniqueJoinExpr_in_uniqueJoinSource459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_uniqueJoinExpr486 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_uniqueJoinExpr490 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_COMMA_in_uniqueJoinExpr493 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_uniqueJoinExpr497 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_uniqueJoinExpr501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_UNIQUEJOIN_in_uniqueJoinToken544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_JOIN_in_joinToken576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_INNER_in_joinToken609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_KW_JOIN_in_joinToken611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CROSS_in_joinToken635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_KW_JOIN_in_joinToken637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_LEFT_in_joinToken661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000010000L});
    public static final BitSet FOLLOW_KW_OUTER_in_joinToken665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_KW_JOIN_in_joinToken669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RIGHT_in_joinToken681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000010000L});
    public static final BitSet FOLLOW_KW_OUTER_in_joinToken684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_KW_JOIN_in_joinToken688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FULL_in_joinToken700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000010000L});
    public static final BitSet FOLLOW_KW_OUTER_in_joinToken704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_KW_JOIN_in_joinToken708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_LEFT_in_joinToken720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_KW_SEMI_in_joinToken722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_KW_JOIN_in_joinToken724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_LATERAL_in_lateralView758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_KW_VIEW_in_lateralView760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_KW_OUTER_in_lateralView762 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xF7AEFEEA5B3FFF6AL,0xFA7EBDBDFF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_function_in_lateralView764 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_tableAlias_in_lateralView766 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_KW_AS_in_lateralView768 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_identifier_in_lateralView770 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_lateralView773 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_identifier_in_lateralView775 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_KW_LATERAL_in_lateralView805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_KW_VIEW_in_lateralView807 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xF7AEFEEA5B3FFF6AL,0xFA7EBDBDFF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_function_in_lateralView809 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_tableAlias_in_lateralView811 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_KW_AS_in_lateralView813 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_identifier_in_lateralView815 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_lateralView818 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_identifier_in_lateralView820 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_identifier_in_tableAlias872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_partitionedTableFunction_in_fromSource919 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_tableSource_in_fromSource923 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_subQuerySource_in_fromSource927 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_lateralView_in_fromSource931 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KW_TABLESAMPLE_in_tableBucketSample965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_tableBucketSample967 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_KW_BUCKET_in_tableBucketSample969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_Number_in_tableBucketSample974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_KW_OUT_in_tableBucketSample977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_KW_OF_in_tableBucketSample979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_Number_in_tableBucketSample984 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_KW_ON_in_tableBucketSample988 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_tableBucketSample992 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_COMMA_in_tableBucketSample995 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_tableBucketSample999 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_tableBucketSample1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TABLESAMPLE_in_splitSample1052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_splitSample1054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_Number_in_splitSample1060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_KW_PERCENT_in_splitSample1066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_KW_ROWS_in_splitSample1068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_splitSample1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TABLESAMPLE_in_splitSample1115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_splitSample1117 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ByteLengthLiteral_in_splitSample1123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_splitSample1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableBucketSample_in_tableSample1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_splitSample_in_tableSample1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableName_in_tableSource1209 = new BitSet(new long[]{0x0000001004000002L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_tableProperties_in_tableSource1214 = new BitSet(new long[]{0x0000001004000002L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_tableSample_in_tableSource1221 = new BitSet(new long[]{0x0000001004000002L});
    public static final BitSet FOLLOW_KW_AS_in_tableSource1226 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_Identifier_in_tableSource1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multipleSource_in_multipleTrack1275 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_multipleTrack1278 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000010A3FBDDEL});
    public static final BitSet FOLLOW_multipleSource_in_multipleTrack1280 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_tableSource_in_multipleSource1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subQuerySource_in_multipleSource1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_EXCLUSIVENESSJOIN_in_exclusivenessJoinSource1336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_exclusivenessJoinSource1338 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000010A3FBDDEL});
    public static final BitSet FOLLOW_fromSource_in_exclusivenessJoinSource1340 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_exclusivenessJoinSource1342 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000010A3FBDDEL});
    public static final BitSet FOLLOW_fromSource_in_exclusivenessJoinSource1344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_exclusivenessJoinSource1346 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_KW_BY_in_exclusivenessJoinSource1349 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_aggregation_in_exclusivenessJoinSource1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_INTERSECTJOIN_in_intersectJoinSource1378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_intersectJoinSource1380 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000010A3FBDDEL});
    public static final BitSet FOLLOW_fromSource_in_intersectJoinSource1382 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_intersectJoinSource1385 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000010A3FBDDEL});
    public static final BitSet FOLLOW_fromSource_in_intersectJoinSource1387 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_intersectJoinSource1391 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_KW_BY_in_intersectJoinSource1394 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_aggregation_in_intersectJoinSource1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_aggregation1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_PROJECT_in_projectSource1458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_KW_VIRTUALTRACK_in_projectSource1460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_intervalLength_in_projectSource1462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_KW_ON_in_projectSource1464 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000010A3FBDDEL});
    public static final BitSet FOLLOW_fromSource_in_projectSource1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_PROJECT_in_projectSource1488 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000010A3FBDDEL});
    public static final BitSet FOLLOW_fromSource_in_projectSource1490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_KW_ON_in_projectSource1492 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000010A3FBDDEL});
    public static final BitSet FOLLOW_fromSource_in_projectSource1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Number_in_intervalLength1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_tableName1576 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DOT_in_tableName1578 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_identifier_in_tableName1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_tableName1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_viewName1659 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DOT_in_viewName1661 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_identifier_in_viewName1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_subQuerySource1715 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x0000000400000100L,0x0000000080010000L});
    public static final BitSet FOLLOW_queryStatementExpression_in_subQuerySource1717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_subQuerySource1719 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_identifier_in_subQuerySource1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_partitionByClause_in_partitioningSpec1762 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_orderByClause_in_partitioningSpec1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderByClause_in_partitioningSpec1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distributeByClause_in_partitioningSpec1798 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_sortByClause_in_partitioningSpec1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sortByClause_in_partitioningSpec1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_clusterByClause_in_partitioningSpec1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subQuerySource_in_partitionTableFunctionSource1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableSource_in_partitionTableFunctionSource1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_partitionedTableFunction_in_partitionTableFunctionSource1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_partitionedTableFunction1916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_partitionedTableFunction1921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_KW_ON_in_partitionedTableFunction1923 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000010A3FBDDEL});
    public static final BitSet FOLLOW_partitionTableFunctionSource_in_partitionedTableFunction1927 = new BitSet(new long[]{0x0010000004000000L,0x0000000001000000L,0x0804000000000000L,0x0000080000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_partitioningSpec_in_partitionedTableFunction1929 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_Identifier_in_partitionedTableFunction1951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_partitionedTableFunction1953 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_partitionedTableFunction1955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_partitionedTableFunction1957 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_COMMA_in_partitionedTableFunction1961 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_Identifier_in_partitionedTableFunction1963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_partitionedTableFunction1965 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_partitionedTableFunction1967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_partitionedTableFunction1969 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_partitionedTableFunction1979 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_Identifier_in_partitionedTableFunction1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_WHERE_in_whereClause2043 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_searchCondition_in_whereClause2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_searchCondition2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_synpred1_FromClauseParser913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred1_FromClauseParser915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_synpred2_FromClauseParser1939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred2_FromClauseParser1941 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_synpred2_FromClauseParser1943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred2_FromClauseParser1945 = new BitSet(new long[]{0x0000000000000002L});

}