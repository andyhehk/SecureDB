// $ANTLR 3.4 SelectClauseParser.g 2014-10-06 21:41:24

//package org.apache.hadoop.hive.ql.parse;

import java.util.Collection;
import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

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
public class HiveParser_SelectClauseParser extends Parser {
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


    public HiveParser_SelectClauseParser(TokenStream input, HiveParser gHiveParser) {
        this(input, new RecognizerSharedState(), gHiveParser);
    }
    public HiveParser_SelectClauseParser(TokenStream input, RecognizerSharedState state, HiveParser gHiveParser) {
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
    public String getGrammarFileName() { return "SelectClauseParser.g"; }


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

      private static void printStack() {
        new Exception().printStackTrace();
      }


    public static class selectClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectClause"
    // SelectClauseParser.g:52:1: selectClause : ( KW_SELECT ( hintClause )? ( ( ( KW_ALL |dist= KW_DISTINCT )? selectList ) | (transform= KW_TRANSFORM selectTrfmClause ) ) -> {$transform == null && $dist == null}? ^( TOK_SELECT ( hintClause )? selectList ) -> {$transform == null && $dist != null}? ^( TOK_SELECTDI ( hintClause )? selectList ) -> ^( TOK_SELECT ( hintClause )? ^( TOK_SELEXPR selectTrfmClause ) ) | trfmClause -> ^( TOK_SELECT ^( TOK_SELEXPR trfmClause ) ) );
    public final HiveParser_SelectClauseParser.selectClause_return selectClause() throws RecognitionException {
        HiveParser_SelectClauseParser.selectClause_return retval = new HiveParser_SelectClauseParser.selectClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token dist=null;
        Token transform=null;
        Token KW_SELECT1=null;
        Token KW_ALL3=null;
        HiveParser_SelectClauseParser.hintClause_return hintClause2 =null;

        HiveParser_SelectClauseParser.selectList_return selectList4 =null;

        HiveParser_SelectClauseParser.selectTrfmClause_return selectTrfmClause5 =null;

        HiveParser_SelectClauseParser.trfmClause_return trfmClause6 =null;


        CommonTree dist_tree=null;
        CommonTree transform_tree=null;
        CommonTree KW_SELECT1_tree=null;
        CommonTree KW_ALL3_tree=null;
        RewriteRuleTokenStream stream_KW_ALL=new RewriteRuleTokenStream(adaptor,"token KW_ALL");
        RewriteRuleTokenStream stream_KW_SELECT=new RewriteRuleTokenStream(adaptor,"token KW_SELECT");
        RewriteRuleTokenStream stream_KW_TRANSFORM=new RewriteRuleTokenStream(adaptor,"token KW_TRANSFORM");
        RewriteRuleTokenStream stream_KW_DISTINCT=new RewriteRuleTokenStream(adaptor,"token KW_DISTINCT");
        RewriteRuleSubtreeStream stream_selectList=new RewriteRuleSubtreeStream(adaptor,"rule selectList");
        RewriteRuleSubtreeStream stream_hintClause=new RewriteRuleSubtreeStream(adaptor,"rule hintClause");
        RewriteRuleSubtreeStream stream_trfmClause=new RewriteRuleSubtreeStream(adaptor,"rule trfmClause");
        RewriteRuleSubtreeStream stream_selectTrfmClause=new RewriteRuleSubtreeStream(adaptor,"rule selectTrfmClause");
         gParent.msgs.push("select clause"); 
        try {
            // SelectClauseParser.g:55:5: ( KW_SELECT ( hintClause )? ( ( ( KW_ALL |dist= KW_DISTINCT )? selectList ) | (transform= KW_TRANSFORM selectTrfmClause ) ) -> {$transform == null && $dist == null}? ^( TOK_SELECT ( hintClause )? selectList ) -> {$transform == null && $dist != null}? ^( TOK_SELECTDI ( hintClause )? selectList ) -> ^( TOK_SELECT ( hintClause )? ^( TOK_SELEXPR selectTrfmClause ) ) | trfmClause -> ^( TOK_SELECT ^( TOK_SELEXPR trfmClause ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==KW_SELECT) ) {
                alt4=1;
            }
            else if ( (LA4_0==KW_MAP||LA4_0==KW_REDUCE) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // SelectClauseParser.g:56:5: KW_SELECT ( hintClause )? ( ( ( KW_ALL |dist= KW_DISTINCT )? selectList ) | (transform= KW_TRANSFORM selectTrfmClause ) )
                    {
                    KW_SELECT1=(Token)match(input,KW_SELECT,FOLLOW_KW_SELECT_in_selectClause71);  
                    stream_KW_SELECT.add(KW_SELECT1);


                    // SelectClauseParser.g:56:15: ( hintClause )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==DIVIDE) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // SelectClauseParser.g:56:15: hintClause
                            {
                            pushFollow(FOLLOW_hintClause_in_selectClause73);
                            hintClause2=hintClause();

                            state._fsp--;

                            stream_hintClause.add(hintClause2.getTree());

                            }
                            break;

                    }


                    // SelectClauseParser.g:56:27: ( ( ( KW_ALL |dist= KW_DISTINCT )? selectList ) | (transform= KW_TRANSFORM selectTrfmClause ) )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==BigintLiteral||LA3_0==CharSetName||LA3_0==DecimalLiteral||(LA3_0 >= Identifier && LA3_0 <= KW_ADD)||(LA3_0 >= KW_AFTER && LA3_0 <= KW_ANALYZE)||(LA3_0 >= KW_ARCHIVE && LA3_0 <= KW_CHANGE)||(LA3_0 >= KW_CLUSTER && LA3_0 <= KW_CLUSTERSTATUS)||LA3_0==KW_COLLECTION||(LA3_0 >= KW_COLUMNS && LA3_0 <= KW_CONCATENATE)||LA3_0==KW_CONTINUE||LA3_0==KW_CREATE||LA3_0==KW_CUBE||(LA3_0 >= KW_CURSOR && LA3_0 <= KW_DATA)||(LA3_0 >= KW_DATABASES && LA3_0 <= KW_DOUBLE)||(LA3_0 >= KW_DROP && LA3_0 <= KW_ELEM_TYPE)||LA3_0==KW_ENABLE||LA3_0==KW_ESCAPED||LA3_0==KW_EXCLUSIVE||(LA3_0 >= KW_EXISTS && LA3_0 <= KW_EXPORT)||(LA3_0 >= KW_EXTERNAL && LA3_0 <= KW_FLOAT)||(LA3_0 >= KW_FOR && LA3_0 <= KW_FORMATTED)||LA3_0==KW_FULL||(LA3_0 >= KW_FUNCTIONS && LA3_0 <= KW_GROUPING)||(LA3_0 >= KW_HOLD_DDLTIME && LA3_0 <= KW_INTERSECT)||(LA3_0 >= KW_INTO && LA3_0 <= KW_ITEMS)||(LA3_0 >= KW_KEYS && LA3_0 <= KW_LENGTH)||(LA3_0 >= KW_LIKE && LA3_0 <= KW_LONG)||(LA3_0 >= KW_MAP && LA3_0 <= KW_MINUS)||(LA3_0 >= KW_MSCK && LA3_0 <= KW_OFFLINE)||LA3_0==KW_OPTION||(LA3_0 >= KW_ORCFILE && LA3_0 <= KW_OUTPUTFORMAT)||LA3_0==KW_OVERWRITE||(LA3_0 >= KW_PARTITION && LA3_0 <= KW_PLUS)||(LA3_0 >= KW_PRETTY && LA3_0 <= KW_PROCEDURE)||(LA3_0 >= KW_PROTECTION && LA3_0 <= KW_RECORDWRITER)||(LA3_0 >= KW_REGEXP && LA3_0 <= KW_SCHEMAS)||(LA3_0 >= KW_SEMI && LA3_0 <= KW_STRUCT)||(LA3_0 >= KW_TABLE && LA3_0 <= KW_TABLES)||(LA3_0 >= KW_TBLPROPERTIES && LA3_0 <= KW_TEXTFILE)||(LA3_0 >= KW_TIMESTAMP && LA3_0 <= KW_TOUCH)||(LA3_0 >= KW_TRIGGER && LA3_0 <= KW_UNARCHIVE)||(LA3_0 >= KW_UNDO && LA3_0 <= KW_UNIONTYPE)||(LA3_0 >= KW_UNLOCK && LA3_0 <= KW_UPDATE)||(LA3_0 >= KW_USE && LA3_0 <= KW_VIEW)||LA3_0==KW_WHILE||LA3_0==KW_WITH||(LA3_0 >= LPAREN && LA3_0 <= LSQUARE)||LA3_0==MINUS||(LA3_0 >= Number && LA3_0 <= PLUS)||(LA3_0 >= STAR && LA3_0 <= TinyintLiteral)) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==KW_TRANSFORM) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;

                    }
                    switch (alt3) {
                        case 1 :
                            // SelectClauseParser.g:56:28: ( ( KW_ALL |dist= KW_DISTINCT )? selectList )
                            {
                            // SelectClauseParser.g:56:28: ( ( KW_ALL |dist= KW_DISTINCT )? selectList )
                            // SelectClauseParser.g:56:29: ( KW_ALL |dist= KW_DISTINCT )? selectList
                            {
                            // SelectClauseParser.g:56:29: ( KW_ALL |dist= KW_DISTINCT )?
                            int alt2=3;
                            int LA2_0 = input.LA(1);

                            if ( (LA2_0==KW_ALL) ) {
                                alt2=1;
                            }
                            else if ( (LA2_0==KW_DISTINCT) ) {
                                alt2=2;
                            }
                            switch (alt2) {
                                case 1 :
                                    // SelectClauseParser.g:56:30: KW_ALL
                                    {
                                    KW_ALL3=(Token)match(input,KW_ALL,FOLLOW_KW_ALL_in_selectClause79);  
                                    stream_KW_ALL.add(KW_ALL3);


                                    }
                                    break;
                                case 2 :
                                    // SelectClauseParser.g:56:39: dist= KW_DISTINCT
                                    {
                                    dist=(Token)match(input,KW_DISTINCT,FOLLOW_KW_DISTINCT_in_selectClause85);  
                                    stream_KW_DISTINCT.add(dist);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_selectList_in_selectClause89);
                            selectList4=selectList();

                            state._fsp--;

                            stream_selectList.add(selectList4.getTree());

                            }


                            }
                            break;
                        case 2 :
                            // SelectClauseParser.g:57:29: (transform= KW_TRANSFORM selectTrfmClause )
                            {
                            // SelectClauseParser.g:57:29: (transform= KW_TRANSFORM selectTrfmClause )
                            // SelectClauseParser.g:57:30: transform= KW_TRANSFORM selectTrfmClause
                            {
                            transform=(Token)match(input,KW_TRANSFORM,FOLLOW_KW_TRANSFORM_in_selectClause123);  
                            stream_KW_TRANSFORM.add(transform);


                            pushFollow(FOLLOW_selectTrfmClause_in_selectClause125);
                            selectTrfmClause5=selectTrfmClause();

                            state._fsp--;

                            stream_selectTrfmClause.add(selectTrfmClause5.getTree());

                            }


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: selectList, selectTrfmClause, selectList, hintClause, hintClause, hintClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 58:6: -> {$transform == null && $dist == null}? ^( TOK_SELECT ( hintClause )? selectList )
                    if (transform == null && dist == null) {
                        // SelectClauseParser.g:58:48: ^( TOK_SELECT ( hintClause )? selectList )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_SELECT, "TOK_SELECT")
                        , root_1);

                        // SelectClauseParser.g:58:61: ( hintClause )?
                        if ( stream_hintClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_hintClause.nextTree());

                        }
                        stream_hintClause.reset();

                        adaptor.addChild(root_1, stream_selectList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    else // 59:6: -> {$transform == null && $dist != null}? ^( TOK_SELECTDI ( hintClause )? selectList )
                    if (transform == null && dist != null) {
                        // SelectClauseParser.g:59:48: ^( TOK_SELECTDI ( hintClause )? selectList )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_SELECTDI, "TOK_SELECTDI")
                        , root_1);

                        // SelectClauseParser.g:59:63: ( hintClause )?
                        if ( stream_hintClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_hintClause.nextTree());

                        }
                        stream_hintClause.reset();

                        adaptor.addChild(root_1, stream_selectList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    else // 60:6: -> ^( TOK_SELECT ( hintClause )? ^( TOK_SELEXPR selectTrfmClause ) )
                    {
                        // SelectClauseParser.g:60:9: ^( TOK_SELECT ( hintClause )? ^( TOK_SELEXPR selectTrfmClause ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_SELECT, "TOK_SELECT")
                        , root_1);

                        // SelectClauseParser.g:60:22: ( hintClause )?
                        if ( stream_hintClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_hintClause.nextTree());

                        }
                        stream_hintClause.reset();

                        // SelectClauseParser.g:60:34: ^( TOK_SELEXPR selectTrfmClause )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR")
                        , root_2);

                        adaptor.addChild(root_2, stream_selectTrfmClause.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // SelectClauseParser.g:62:5: trfmClause
                    {
                    pushFollow(FOLLOW_trfmClause_in_selectClause196);
                    trfmClause6=trfmClause();

                    state._fsp--;

                    stream_trfmClause.add(trfmClause6.getTree());

                    // AST REWRITE
                    // elements: trfmClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 62:17: -> ^( TOK_SELECT ^( TOK_SELEXPR trfmClause ) )
                    {
                        // SelectClauseParser.g:62:19: ^( TOK_SELECT ^( TOK_SELEXPR trfmClause ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_SELECT, "TOK_SELECT")
                        , root_1);

                        // SelectClauseParser.g:62:32: ^( TOK_SELEXPR trfmClause )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR")
                        , root_2);

                        adaptor.addChild(root_2, stream_trfmClause.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             gParent.msgs.pop(); 
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selectClause"


    public static class selectList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectList"
    // SelectClauseParser.g:65:1: selectList : selectItem ( COMMA selectItem )* -> ( selectItem )+ ;
    public final HiveParser_SelectClauseParser.selectList_return selectList() throws RecognitionException {
        HiveParser_SelectClauseParser.selectList_return retval = new HiveParser_SelectClauseParser.selectList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMMA8=null;
        HiveParser_SelectClauseParser.selectItem_return selectItem7 =null;

        HiveParser_SelectClauseParser.selectItem_return selectItem9 =null;


        CommonTree COMMA8_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_selectItem=new RewriteRuleSubtreeStream(adaptor,"rule selectItem");
         gParent.msgs.push("select list"); 
        try {
            // SelectClauseParser.g:68:5: ( selectItem ( COMMA selectItem )* -> ( selectItem )+ )
            // SelectClauseParser.g:69:5: selectItem ( COMMA selectItem )*
            {
            pushFollow(FOLLOW_selectItem_in_selectList239);
            selectItem7=selectItem();

            state._fsp--;

            stream_selectItem.add(selectItem7.getTree());

            // SelectClauseParser.g:69:16: ( COMMA selectItem )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // SelectClauseParser.g:69:18: COMMA selectItem
            	    {
            	    COMMA8=(Token)match(input,COMMA,FOLLOW_COMMA_in_selectList243);  
            	    stream_COMMA.add(COMMA8);


            	    pushFollow(FOLLOW_selectItem_in_selectList246);
            	    selectItem9=selectItem();

            	    state._fsp--;

            	    stream_selectItem.add(selectItem9.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // AST REWRITE
            // elements: selectItem
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 69:39: -> ( selectItem )+
            {
                if ( !(stream_selectItem.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_selectItem.hasNext() ) {
                    adaptor.addChild(root_0, stream_selectItem.nextTree());

                }
                stream_selectItem.reset();

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             gParent.msgs.pop(); 
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selectList"


    public static class selectTrfmClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectTrfmClause"
    // SelectClauseParser.g:72:1: selectTrfmClause : LPAREN selectExpressionList RPAREN inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? ) ;
    public final HiveParser_SelectClauseParser.selectTrfmClause_return selectTrfmClause() throws RecognitionException {
        HiveParser_SelectClauseParser.selectTrfmClause_return retval = new HiveParser_SelectClauseParser.selectTrfmClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LPAREN10=null;
        Token RPAREN12=null;
        Token KW_USING13=null;
        Token StringLiteral14=null;
        Token KW_AS15=null;
        Token LPAREN16=null;
        Token RPAREN19=null;
        HiveParser.rowFormat_return inSerde =null;

        HiveParser.recordWriter_return inRec =null;

        HiveParser.rowFormat_return outSerde =null;

        HiveParser.recordReader_return outRec =null;

        HiveParser_SelectClauseParser.selectExpressionList_return selectExpressionList11 =null;

        HiveParser_FromClauseParser.aliasList_return aliasList17 =null;

        HiveParser.columnNameTypeList_return columnNameTypeList18 =null;

        HiveParser_FromClauseParser.aliasList_return aliasList20 =null;

        HiveParser.columnNameTypeList_return columnNameTypeList21 =null;


        CommonTree LPAREN10_tree=null;
        CommonTree RPAREN12_tree=null;
        CommonTree KW_USING13_tree=null;
        CommonTree StringLiteral14_tree=null;
        CommonTree KW_AS15_tree=null;
        CommonTree LPAREN16_tree=null;
        CommonTree RPAREN19_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_USING=new RewriteRuleTokenStream(adaptor,"token KW_USING");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_rowFormat=new RewriteRuleSubtreeStream(adaptor,"rule rowFormat");
        RewriteRuleSubtreeStream stream_columnNameTypeList=new RewriteRuleSubtreeStream(adaptor,"rule columnNameTypeList");
        RewriteRuleSubtreeStream stream_recordReader=new RewriteRuleSubtreeStream(adaptor,"rule recordReader");
        RewriteRuleSubtreeStream stream_aliasList=new RewriteRuleSubtreeStream(adaptor,"rule aliasList");
        RewriteRuleSubtreeStream stream_selectExpressionList=new RewriteRuleSubtreeStream(adaptor,"rule selectExpressionList");
        RewriteRuleSubtreeStream stream_recordWriter=new RewriteRuleSubtreeStream(adaptor,"rule recordWriter");
         gParent.msgs.push("transform clause"); 
        try {
            // SelectClauseParser.g:75:5: ( LPAREN selectExpressionList RPAREN inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? ) )
            // SelectClauseParser.g:76:5: LPAREN selectExpressionList RPAREN inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader
            {
            LPAREN10=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_selectTrfmClause285);  
            stream_LPAREN.add(LPAREN10);


            pushFollow(FOLLOW_selectExpressionList_in_selectTrfmClause287);
            selectExpressionList11=selectExpressionList();

            state._fsp--;

            stream_selectExpressionList.add(selectExpressionList11.getTree());

            RPAREN12=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_selectTrfmClause289);  
            stream_RPAREN.add(RPAREN12);


            pushFollow(FOLLOW_rowFormat_in_selectTrfmClause297);
            inSerde=gHiveParser.rowFormat();

            state._fsp--;

            stream_rowFormat.add(inSerde.getTree());

            pushFollow(FOLLOW_recordWriter_in_selectTrfmClause301);
            inRec=gHiveParser.recordWriter();

            state._fsp--;

            stream_recordWriter.add(inRec.getTree());

            KW_USING13=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_selectTrfmClause307);  
            stream_KW_USING.add(KW_USING13);


            StringLiteral14=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_selectTrfmClause309);  
            stream_StringLiteral.add(StringLiteral14);


            // SelectClauseParser.g:79:5: ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==KW_AS) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // SelectClauseParser.g:79:7: KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) )
                    {
                    KW_AS15=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_selectTrfmClause317);  
                    stream_KW_AS.add(KW_AS15);


                    // SelectClauseParser.g:79:13: ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==LPAREN) ) {
                        alt8=1;
                    }
                    else if ( ((LA8_0 >= Identifier && LA8_0 <= KW_ADD)||LA8_0==KW_AFTER||(LA8_0 >= KW_ALTER && LA8_0 <= KW_ANALYZE)||(LA8_0 >= KW_ARCHIVE && LA8_0 <= KW_CASCADE)||LA8_0==KW_CHANGE||(LA8_0 >= KW_CLUSTER && LA8_0 <= KW_CLUSTERSTATUS)||LA8_0==KW_COLLECTION||(LA8_0 >= KW_COLUMNS && LA8_0 <= KW_CONCATENATE)||LA8_0==KW_CONTINUE||LA8_0==KW_CREATE||LA8_0==KW_CUBE||(LA8_0 >= KW_CURSOR && LA8_0 <= KW_DATA)||(LA8_0 >= KW_DATABASES && LA8_0 <= KW_DISABLE)||(LA8_0 >= KW_DISTRIBUTE && LA8_0 <= KW_DOUBLE)||(LA8_0 >= KW_DROP && LA8_0 <= KW_ELEM_TYPE)||LA8_0==KW_ENABLE||LA8_0==KW_ESCAPED||LA8_0==KW_EXCLUSIVE||(LA8_0 >= KW_EXISTS && LA8_0 <= KW_EXPORT)||(LA8_0 >= KW_EXTERNAL && LA8_0 <= KW_FLOAT)||(LA8_0 >= KW_FOR && LA8_0 <= KW_FORMATTED)||LA8_0==KW_FULL||(LA8_0 >= KW_FUNCTIONS && LA8_0 <= KW_GROUPING)||(LA8_0 >= KW_HOLD_DDLTIME && LA8_0 <= KW_IDXPROPERTIES)||(LA8_0 >= KW_IGNORE && LA8_0 <= KW_INTERSECT)||(LA8_0 >= KW_INTO && LA8_0 <= KW_ITEMS)||(LA8_0 >= KW_KEYS && LA8_0 <= KW_LEFT)||(LA8_0 >= KW_LIKE && LA8_0 <= KW_LONG)||(LA8_0 >= KW_MAPJOIN && LA8_0 <= KW_MINUS)||(LA8_0 >= KW_MSCK && LA8_0 <= KW_NOSCAN)||(LA8_0 >= KW_NO_DROP && LA8_0 <= KW_OFFLINE)||LA8_0==KW_OPTION||(LA8_0 >= KW_ORCFILE && LA8_0 <= KW_OUTPUTFORMAT)||LA8_0==KW_OVERWRITE||(LA8_0 >= KW_PARTITION && LA8_0 <= KW_PLUS)||(LA8_0 >= KW_PRETTY && LA8_0 <= KW_PROCEDURE)||(LA8_0 >= KW_PROTECTION && LA8_0 <= KW_RECORDWRITER)||(LA8_0 >= KW_REGEXP && LA8_0 <= KW_SCHEMAS)||(LA8_0 >= KW_SEMI && LA8_0 <= KW_STRUCT)||(LA8_0 >= KW_TABLE && LA8_0 <= KW_TABLES)||(LA8_0 >= KW_TBLPROPERTIES && LA8_0 <= KW_TEXTFILE)||(LA8_0 >= KW_TIMESTAMP && LA8_0 <= KW_TOUCH)||(LA8_0 >= KW_TRIGGER && LA8_0 <= KW_UNARCHIVE)||(LA8_0 >= KW_UNDO && LA8_0 <= KW_UNIONTYPE)||(LA8_0 >= KW_UNLOCK && LA8_0 <= KW_UPDATE)||(LA8_0 >= KW_USE && LA8_0 <= KW_VIEW)||LA8_0==KW_WHILE||LA8_0==KW_WITH) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;

                    }
                    switch (alt8) {
                        case 1 :
                            // SelectClauseParser.g:79:14: ( LPAREN ( aliasList | columnNameTypeList ) RPAREN )
                            {
                            // SelectClauseParser.g:79:14: ( LPAREN ( aliasList | columnNameTypeList ) RPAREN )
                            // SelectClauseParser.g:79:15: LPAREN ( aliasList | columnNameTypeList ) RPAREN
                            {
                            LPAREN16=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_selectTrfmClause321);  
                            stream_LPAREN.add(LPAREN16);


                            // SelectClauseParser.g:79:22: ( aliasList | columnNameTypeList )
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( (LA6_0==Identifier) ) {
                                int LA6_1 = input.LA(2);

                                if ( (LA6_1==COMMA||LA6_1==RPAREN) ) {
                                    alt6=1;
                                }
                                else if ( (LA6_1==KW_ARRAY||(LA6_1 >= KW_BIGINT && LA6_1 <= KW_BOOLEAN)||(LA6_1 >= KW_DATE && LA6_1 <= KW_DATETIME)||LA6_1==KW_DECIMAL||LA6_1==KW_DOUBLE||LA6_1==KW_FLOAT||LA6_1==KW_INT||LA6_1==KW_MAP||LA6_1==KW_SMALLINT||(LA6_1 >= KW_STRING && LA6_1 <= KW_STRUCT)||(LA6_1 >= KW_TIMESTAMP && LA6_1 <= KW_TINYINT)||LA6_1==KW_UNIONTYPE) ) {
                                    alt6=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 6, 1, input);

                                    throw nvae;

                                }
                            }
                            else if ( (LA6_0==KW_ADD||LA6_0==KW_AFTER||(LA6_0 >= KW_ALTER && LA6_0 <= KW_ANALYZE)||(LA6_0 >= KW_ARCHIVE && LA6_0 <= KW_CASCADE)||LA6_0==KW_CHANGE||(LA6_0 >= KW_CLUSTER && LA6_0 <= KW_CLUSTERSTATUS)||LA6_0==KW_COLLECTION||(LA6_0 >= KW_COLUMNS && LA6_0 <= KW_CONCATENATE)||LA6_0==KW_CONTINUE||LA6_0==KW_CREATE||LA6_0==KW_CUBE||(LA6_0 >= KW_CURSOR && LA6_0 <= KW_DATA)||(LA6_0 >= KW_DATABASES && LA6_0 <= KW_DISABLE)||(LA6_0 >= KW_DISTRIBUTE && LA6_0 <= KW_DOUBLE)||(LA6_0 >= KW_DROP && LA6_0 <= KW_ELEM_TYPE)||LA6_0==KW_ENABLE||LA6_0==KW_ESCAPED||LA6_0==KW_EXCLUSIVE||(LA6_0 >= KW_EXISTS && LA6_0 <= KW_EXPORT)||(LA6_0 >= KW_EXTERNAL && LA6_0 <= KW_FLOAT)||(LA6_0 >= KW_FOR && LA6_0 <= KW_FORMATTED)||LA6_0==KW_FULL||(LA6_0 >= KW_FUNCTIONS && LA6_0 <= KW_GROUPING)||(LA6_0 >= KW_HOLD_DDLTIME && LA6_0 <= KW_IDXPROPERTIES)||(LA6_0 >= KW_IGNORE && LA6_0 <= KW_INTERSECT)||(LA6_0 >= KW_INTO && LA6_0 <= KW_ITEMS)||(LA6_0 >= KW_KEYS && LA6_0 <= KW_LEFT)||(LA6_0 >= KW_LIKE && LA6_0 <= KW_LONG)||(LA6_0 >= KW_MAPJOIN && LA6_0 <= KW_MINUS)||(LA6_0 >= KW_MSCK && LA6_0 <= KW_NOSCAN)||(LA6_0 >= KW_NO_DROP && LA6_0 <= KW_OFFLINE)||LA6_0==KW_OPTION||(LA6_0 >= KW_ORCFILE && LA6_0 <= KW_OUTPUTFORMAT)||LA6_0==KW_OVERWRITE||(LA6_0 >= KW_PARTITION && LA6_0 <= KW_PLUS)||(LA6_0 >= KW_PRETTY && LA6_0 <= KW_PROCEDURE)||(LA6_0 >= KW_PROTECTION && LA6_0 <= KW_RECORDWRITER)||(LA6_0 >= KW_REGEXP && LA6_0 <= KW_SCHEMAS)||(LA6_0 >= KW_SEMI && LA6_0 <= KW_STRUCT)||(LA6_0 >= KW_TABLE && LA6_0 <= KW_TABLES)||(LA6_0 >= KW_TBLPROPERTIES && LA6_0 <= KW_TEXTFILE)||(LA6_0 >= KW_TIMESTAMP && LA6_0 <= KW_TOUCH)||(LA6_0 >= KW_TRIGGER && LA6_0 <= KW_UNARCHIVE)||(LA6_0 >= KW_UNDO && LA6_0 <= KW_UNIONTYPE)||(LA6_0 >= KW_UNLOCK && LA6_0 <= KW_UPDATE)||(LA6_0 >= KW_USE && LA6_0 <= KW_VIEW)||LA6_0==KW_WHILE||LA6_0==KW_WITH) ) {
                                int LA6_2 = input.LA(2);

                                if ( (LA6_2==COMMA||LA6_2==RPAREN) ) {
                                    alt6=1;
                                }
                                else if ( (LA6_2==KW_ARRAY||(LA6_2 >= KW_BIGINT && LA6_2 <= KW_BOOLEAN)||(LA6_2 >= KW_DATE && LA6_2 <= KW_DATETIME)||LA6_2==KW_DECIMAL||LA6_2==KW_DOUBLE||LA6_2==KW_FLOAT||LA6_2==KW_INT||LA6_2==KW_MAP||LA6_2==KW_SMALLINT||(LA6_2 >= KW_STRING && LA6_2 <= KW_STRUCT)||(LA6_2 >= KW_TIMESTAMP && LA6_2 <= KW_TINYINT)||LA6_2==KW_UNIONTYPE) ) {
                                    alt6=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 6, 2, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 0, input);

                                throw nvae;

                            }
                            switch (alt6) {
                                case 1 :
                                    // SelectClauseParser.g:79:23: aliasList
                                    {
                                    pushFollow(FOLLOW_aliasList_in_selectTrfmClause324);
                                    aliasList17=gHiveParser.aliasList();

                                    state._fsp--;

                                    stream_aliasList.add(aliasList17.getTree());

                                    }
                                    break;
                                case 2 :
                                    // SelectClauseParser.g:79:35: columnNameTypeList
                                    {
                                    pushFollow(FOLLOW_columnNameTypeList_in_selectTrfmClause328);
                                    columnNameTypeList18=gHiveParser.columnNameTypeList();

                                    state._fsp--;

                                    stream_columnNameTypeList.add(columnNameTypeList18.getTree());

                                    }
                                    break;

                            }


                            RPAREN19=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_selectTrfmClause331);  
                            stream_RPAREN.add(RPAREN19);


                            }


                            }
                            break;
                        case 2 :
                            // SelectClauseParser.g:79:65: ( aliasList | columnNameTypeList )
                            {
                            // SelectClauseParser.g:79:65: ( aliasList | columnNameTypeList )
                            int alt7=2;
                            alt7 = dfa7.predict(input);
                            switch (alt7) {
                                case 1 :
                                    // SelectClauseParser.g:79:66: aliasList
                                    {
                                    pushFollow(FOLLOW_aliasList_in_selectTrfmClause337);
                                    aliasList20=gHiveParser.aliasList();

                                    state._fsp--;

                                    stream_aliasList.add(aliasList20.getTree());

                                    }
                                    break;
                                case 2 :
                                    // SelectClauseParser.g:79:78: columnNameTypeList
                                    {
                                    pushFollow(FOLLOW_columnNameTypeList_in_selectTrfmClause341);
                                    columnNameTypeList21=gHiveParser.columnNameTypeList();

                                    state._fsp--;

                                    stream_columnNameTypeList.add(columnNameTypeList21.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            pushFollow(FOLLOW_rowFormat_in_selectTrfmClause353);
            outSerde=gHiveParser.rowFormat();

            state._fsp--;

            stream_rowFormat.add(outSerde.getTree());

            pushFollow(FOLLOW_recordReader_in_selectTrfmClause357);
            outRec=gHiveParser.recordReader();

            state._fsp--;

            stream_recordReader.add(outRec.getTree());

            // AST REWRITE
            // elements: selectExpressionList, outSerde, inSerde, aliasList, columnNameTypeList, inRec, outRec, StringLiteral
            // token labels: 
            // rule labels: retval, inRec, inSerde, outRec, outSerde
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_inRec=new RewriteRuleSubtreeStream(adaptor,"rule inRec",inRec!=null?inRec.tree:null);
            RewriteRuleSubtreeStream stream_inSerde=new RewriteRuleSubtreeStream(adaptor,"rule inSerde",inSerde!=null?inSerde.tree:null);
            RewriteRuleSubtreeStream stream_outRec=new RewriteRuleSubtreeStream(adaptor,"rule outRec",outRec!=null?outRec.tree:null);
            RewriteRuleSubtreeStream stream_outSerde=new RewriteRuleSubtreeStream(adaptor,"rule outSerde",outSerde!=null?outSerde.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 81:5: -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? )
            {
                // SelectClauseParser.g:81:8: ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_TRANSFORM, "TOK_TRANSFORM")
                , root_1);

                adaptor.addChild(root_1, stream_selectExpressionList.nextTree());

                adaptor.addChild(root_1, stream_inSerde.nextTree());

                adaptor.addChild(root_1, stream_inRec.nextTree());

                adaptor.addChild(root_1, 
                stream_StringLiteral.nextNode()
                );

                adaptor.addChild(root_1, stream_outSerde.nextTree());

                adaptor.addChild(root_1, stream_outRec.nextTree());

                // SelectClauseParser.g:81:93: ( aliasList )?
                if ( stream_aliasList.hasNext() ) {
                    adaptor.addChild(root_1, stream_aliasList.nextTree());

                }
                stream_aliasList.reset();

                // SelectClauseParser.g:81:104: ( columnNameTypeList )?
                if ( stream_columnNameTypeList.hasNext() ) {
                    adaptor.addChild(root_1, stream_columnNameTypeList.nextTree());

                }
                stream_columnNameTypeList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             gParent.msgs.pop(); 
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selectTrfmClause"


    public static class hintClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hintClause"
    // SelectClauseParser.g:84:1: hintClause : DIVIDE STAR PLUS hintList STAR DIVIDE -> ^( TOK_HINTLIST hintList ) ;
    public final HiveParser_SelectClauseParser.hintClause_return hintClause() throws RecognitionException {
        HiveParser_SelectClauseParser.hintClause_return retval = new HiveParser_SelectClauseParser.hintClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DIVIDE22=null;
        Token STAR23=null;
        Token PLUS24=null;
        Token STAR26=null;
        Token DIVIDE27=null;
        HiveParser_SelectClauseParser.hintList_return hintList25 =null;


        CommonTree DIVIDE22_tree=null;
        CommonTree STAR23_tree=null;
        CommonTree PLUS24_tree=null;
        CommonTree STAR26_tree=null;
        CommonTree DIVIDE27_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");
        RewriteRuleSubtreeStream stream_hintList=new RewriteRuleSubtreeStream(adaptor,"rule hintList");
         gParent.msgs.push("hint clause"); 
        try {
            // SelectClauseParser.g:87:5: ( DIVIDE STAR PLUS hintList STAR DIVIDE -> ^( TOK_HINTLIST hintList ) )
            // SelectClauseParser.g:88:5: DIVIDE STAR PLUS hintList STAR DIVIDE
            {
            DIVIDE22=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_hintClause420);  
            stream_DIVIDE.add(DIVIDE22);


            STAR23=(Token)match(input,STAR,FOLLOW_STAR_in_hintClause422);  
            stream_STAR.add(STAR23);


            PLUS24=(Token)match(input,PLUS,FOLLOW_PLUS_in_hintClause424);  
            stream_PLUS.add(PLUS24);


            pushFollow(FOLLOW_hintList_in_hintClause426);
            hintList25=hintList();

            state._fsp--;

            stream_hintList.add(hintList25.getTree());

            STAR26=(Token)match(input,STAR,FOLLOW_STAR_in_hintClause428);  
            stream_STAR.add(STAR26);


            DIVIDE27=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_hintClause430);  
            stream_DIVIDE.add(DIVIDE27);


            // AST REWRITE
            // elements: hintList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 88:43: -> ^( TOK_HINTLIST hintList )
            {
                // SelectClauseParser.g:88:46: ^( TOK_HINTLIST hintList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_HINTLIST, "TOK_HINTLIST")
                , root_1);

                adaptor.addChild(root_1, stream_hintList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             gParent.msgs.pop(); 
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "hintClause"


    public static class hintList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hintList"
    // SelectClauseParser.g:91:1: hintList : hintItem ( COMMA hintItem )* -> ( hintItem )+ ;
    public final HiveParser_SelectClauseParser.hintList_return hintList() throws RecognitionException {
        HiveParser_SelectClauseParser.hintList_return retval = new HiveParser_SelectClauseParser.hintList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMMA29=null;
        HiveParser_SelectClauseParser.hintItem_return hintItem28 =null;

        HiveParser_SelectClauseParser.hintItem_return hintItem30 =null;


        CommonTree COMMA29_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_hintItem=new RewriteRuleSubtreeStream(adaptor,"rule hintItem");
         gParent.msgs.push("hint list"); 
        try {
            // SelectClauseParser.g:94:5: ( hintItem ( COMMA hintItem )* -> ( hintItem )+ )
            // SelectClauseParser.g:95:5: hintItem ( COMMA hintItem )*
            {
            pushFollow(FOLLOW_hintItem_in_hintList469);
            hintItem28=hintItem();

            state._fsp--;

            stream_hintItem.add(hintItem28.getTree());

            // SelectClauseParser.g:95:14: ( COMMA hintItem )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==COMMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // SelectClauseParser.g:95:15: COMMA hintItem
            	    {
            	    COMMA29=(Token)match(input,COMMA,FOLLOW_COMMA_in_hintList472);  
            	    stream_COMMA.add(COMMA29);


            	    pushFollow(FOLLOW_hintItem_in_hintList474);
            	    hintItem30=hintItem();

            	    state._fsp--;

            	    stream_hintItem.add(hintItem30.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            // AST REWRITE
            // elements: hintItem
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 95:32: -> ( hintItem )+
            {
                if ( !(stream_hintItem.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_hintItem.hasNext() ) {
                    adaptor.addChild(root_0, stream_hintItem.nextTree());

                }
                stream_hintItem.reset();

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             gParent.msgs.pop(); 
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "hintList"


    public static class hintItem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hintItem"
    // SelectClauseParser.g:98:1: hintItem : hintName ( LPAREN hintArgs RPAREN )? -> ^( TOK_HINT hintName ( hintArgs )? ) ;
    public final HiveParser_SelectClauseParser.hintItem_return hintItem() throws RecognitionException {
        HiveParser_SelectClauseParser.hintItem_return retval = new HiveParser_SelectClauseParser.hintItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LPAREN32=null;
        Token RPAREN34=null;
        HiveParser_SelectClauseParser.hintName_return hintName31 =null;

        HiveParser_SelectClauseParser.hintArgs_return hintArgs33 =null;


        CommonTree LPAREN32_tree=null;
        CommonTree RPAREN34_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_hintName=new RewriteRuleSubtreeStream(adaptor,"rule hintName");
        RewriteRuleSubtreeStream stream_hintArgs=new RewriteRuleSubtreeStream(adaptor,"rule hintArgs");
         gParent.msgs.push("hint item"); 
        try {
            // SelectClauseParser.g:101:5: ( hintName ( LPAREN hintArgs RPAREN )? -> ^( TOK_HINT hintName ( hintArgs )? ) )
            // SelectClauseParser.g:102:5: hintName ( LPAREN hintArgs RPAREN )?
            {
            pushFollow(FOLLOW_hintName_in_hintItem512);
            hintName31=hintName();

            state._fsp--;

            stream_hintName.add(hintName31.getTree());

            // SelectClauseParser.g:102:14: ( LPAREN hintArgs RPAREN )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==LPAREN) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // SelectClauseParser.g:102:15: LPAREN hintArgs RPAREN
                    {
                    LPAREN32=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_hintItem515);  
                    stream_LPAREN.add(LPAREN32);


                    pushFollow(FOLLOW_hintArgs_in_hintItem517);
                    hintArgs33=hintArgs();

                    state._fsp--;

                    stream_hintArgs.add(hintArgs33.getTree());

                    RPAREN34=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_hintItem519);  
                    stream_RPAREN.add(RPAREN34);


                    }
                    break;

            }


            // AST REWRITE
            // elements: hintArgs, hintName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 102:40: -> ^( TOK_HINT hintName ( hintArgs )? )
            {
                // SelectClauseParser.g:102:43: ^( TOK_HINT hintName ( hintArgs )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_HINT, "TOK_HINT")
                , root_1);

                adaptor.addChild(root_1, stream_hintName.nextTree());

                // SelectClauseParser.g:102:63: ( hintArgs )?
                if ( stream_hintArgs.hasNext() ) {
                    adaptor.addChild(root_1, stream_hintArgs.nextTree());

                }
                stream_hintArgs.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             gParent.msgs.pop(); 
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "hintItem"


    public static class hintName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hintName"
    // SelectClauseParser.g:105:1: hintName : ( KW_MAPJOIN -> TOK_MAPJOIN | KW_STREAMTABLE -> TOK_STREAMTABLE | KW_HOLD_DDLTIME -> TOK_HOLD_DDLTIME );
    public final HiveParser_SelectClauseParser.hintName_return hintName() throws RecognitionException {
        HiveParser_SelectClauseParser.hintName_return retval = new HiveParser_SelectClauseParser.hintName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_MAPJOIN35=null;
        Token KW_STREAMTABLE36=null;
        Token KW_HOLD_DDLTIME37=null;

        CommonTree KW_MAPJOIN35_tree=null;
        CommonTree KW_STREAMTABLE36_tree=null;
        CommonTree KW_HOLD_DDLTIME37_tree=null;
        RewriteRuleTokenStream stream_KW_HOLD_DDLTIME=new RewriteRuleTokenStream(adaptor,"token KW_HOLD_DDLTIME");
        RewriteRuleTokenStream stream_KW_MAPJOIN=new RewriteRuleTokenStream(adaptor,"token KW_MAPJOIN");
        RewriteRuleTokenStream stream_KW_STREAMTABLE=new RewriteRuleTokenStream(adaptor,"token KW_STREAMTABLE");

         gParent.msgs.push("hint name"); 
        try {
            // SelectClauseParser.g:108:5: ( KW_MAPJOIN -> TOK_MAPJOIN | KW_STREAMTABLE -> TOK_STREAMTABLE | KW_HOLD_DDLTIME -> TOK_HOLD_DDLTIME )
            int alt12=3;
            switch ( input.LA(1) ) {
            case KW_MAPJOIN:
                {
                alt12=1;
                }
                break;
            case KW_STREAMTABLE:
                {
                alt12=2;
                }
                break;
            case KW_HOLD_DDLTIME:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // SelectClauseParser.g:109:5: KW_MAPJOIN
                    {
                    KW_MAPJOIN35=(Token)match(input,KW_MAPJOIN,FOLLOW_KW_MAPJOIN_in_hintName563);  
                    stream_KW_MAPJOIN.add(KW_MAPJOIN35);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 109:16: -> TOK_MAPJOIN
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(TOK_MAPJOIN, "TOK_MAPJOIN")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // SelectClauseParser.g:110:7: KW_STREAMTABLE
                    {
                    KW_STREAMTABLE36=(Token)match(input,KW_STREAMTABLE,FOLLOW_KW_STREAMTABLE_in_hintName575);  
                    stream_KW_STREAMTABLE.add(KW_STREAMTABLE36);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 110:22: -> TOK_STREAMTABLE
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(TOK_STREAMTABLE, "TOK_STREAMTABLE")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // SelectClauseParser.g:111:7: KW_HOLD_DDLTIME
                    {
                    KW_HOLD_DDLTIME37=(Token)match(input,KW_HOLD_DDLTIME,FOLLOW_KW_HOLD_DDLTIME_in_hintName587);  
                    stream_KW_HOLD_DDLTIME.add(KW_HOLD_DDLTIME37);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 111:23: -> TOK_HOLD_DDLTIME
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(TOK_HOLD_DDLTIME, "TOK_HOLD_DDLTIME")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             gParent.msgs.pop(); 
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "hintName"


    public static class hintArgs_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hintArgs"
    // SelectClauseParser.g:114:1: hintArgs : hintArgName ( COMMA hintArgName )* -> ^( TOK_HINTARGLIST ( hintArgName )+ ) ;
    public final HiveParser_SelectClauseParser.hintArgs_return hintArgs() throws RecognitionException {
        HiveParser_SelectClauseParser.hintArgs_return retval = new HiveParser_SelectClauseParser.hintArgs_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMMA39=null;
        HiveParser_SelectClauseParser.hintArgName_return hintArgName38 =null;

        HiveParser_SelectClauseParser.hintArgName_return hintArgName40 =null;


        CommonTree COMMA39_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_hintArgName=new RewriteRuleSubtreeStream(adaptor,"rule hintArgName");
         gParent.msgs.push("hint arguments"); 
        try {
            // SelectClauseParser.g:117:5: ( hintArgName ( COMMA hintArgName )* -> ^( TOK_HINTARGLIST ( hintArgName )+ ) )
            // SelectClauseParser.g:118:5: hintArgName ( COMMA hintArgName )*
            {
            pushFollow(FOLLOW_hintArgName_in_hintArgs622);
            hintArgName38=hintArgName();

            state._fsp--;

            stream_hintArgName.add(hintArgName38.getTree());

            // SelectClauseParser.g:118:17: ( COMMA hintArgName )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // SelectClauseParser.g:118:18: COMMA hintArgName
            	    {
            	    COMMA39=(Token)match(input,COMMA,FOLLOW_COMMA_in_hintArgs625);  
            	    stream_COMMA.add(COMMA39);


            	    pushFollow(FOLLOW_hintArgName_in_hintArgs627);
            	    hintArgName40=hintArgName();

            	    state._fsp--;

            	    stream_hintArgName.add(hintArgName40.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            // AST REWRITE
            // elements: hintArgName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 118:38: -> ^( TOK_HINTARGLIST ( hintArgName )+ )
            {
                // SelectClauseParser.g:118:41: ^( TOK_HINTARGLIST ( hintArgName )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_HINTARGLIST, "TOK_HINTARGLIST")
                , root_1);

                if ( !(stream_hintArgName.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_hintArgName.hasNext() ) {
                    adaptor.addChild(root_1, stream_hintArgName.nextTree());

                }
                stream_hintArgName.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             gParent.msgs.pop(); 
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "hintArgs"


    public static class hintArgName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hintArgName"
    // SelectClauseParser.g:121:1: hintArgName : identifier ;
    public final HiveParser_SelectClauseParser.hintArgName_return hintArgName() throws RecognitionException {
        HiveParser_SelectClauseParser.hintArgName_return retval = new HiveParser_SelectClauseParser.hintArgName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.identifier_return identifier41 =null;



         gParent.msgs.push("hint argument name"); 
        try {
            // SelectClauseParser.g:124:5: ( identifier )
            // SelectClauseParser.g:125:5: identifier
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_identifier_in_hintArgName669);
            identifier41=gHiveParser.identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier41.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             gParent.msgs.pop(); 
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "hintArgName"


    public static class selectItem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectItem"
    // SelectClauseParser.g:128:1: selectItem : ( selectExpression ( KW_OVER ws= window_specification )? ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )? ) -> ^( TOK_SELEXPR selectExpression ( identifier )* ( $ws)? ) ;
    public final HiveParser_SelectClauseParser.selectItem_return selectItem() throws RecognitionException {
        HiveParser_SelectClauseParser.selectItem_return retval = new HiveParser_SelectClauseParser.selectItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_OVER43=null;
        Token KW_AS44=null;
        Token KW_AS46=null;
        Token LPAREN47=null;
        Token COMMA49=null;
        Token RPAREN51=null;
        HiveParser_SelectClauseParser.window_specification_return ws =null;

        HiveParser_SelectClauseParser.selectExpression_return selectExpression42 =null;

        HiveParser_IdentifiersParser.identifier_return identifier45 =null;

        HiveParser_IdentifiersParser.identifier_return identifier48 =null;

        HiveParser_IdentifiersParser.identifier_return identifier50 =null;


        CommonTree KW_OVER43_tree=null;
        CommonTree KW_AS44_tree=null;
        CommonTree KW_AS46_tree=null;
        CommonTree LPAREN47_tree=null;
        CommonTree COMMA49_tree=null;
        CommonTree RPAREN51_tree=null;
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_OVER=new RewriteRuleTokenStream(adaptor,"token KW_OVER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_window_specification=new RewriteRuleSubtreeStream(adaptor,"rule window_specification");
        RewriteRuleSubtreeStream stream_selectExpression=new RewriteRuleSubtreeStream(adaptor,"rule selectExpression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
         gParent.msgs.push("selection target"); 
        try {
            // SelectClauseParser.g:131:5: ( ( selectExpression ( KW_OVER ws= window_specification )? ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )? ) -> ^( TOK_SELEXPR selectExpression ( identifier )* ( $ws)? ) )
            // SelectClauseParser.g:132:5: ( selectExpression ( KW_OVER ws= window_specification )? ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )? )
            {
            // SelectClauseParser.g:132:5: ( selectExpression ( KW_OVER ws= window_specification )? ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )? )
            // SelectClauseParser.g:132:7: selectExpression ( KW_OVER ws= window_specification )? ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )?
            {
            pushFollow(FOLLOW_selectExpression_in_selectItem702);
            selectExpression42=selectExpression();

            state._fsp--;

            stream_selectExpression.add(selectExpression42.getTree());

            // SelectClauseParser.g:132:24: ( KW_OVER ws= window_specification )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==KW_OVER) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // SelectClauseParser.g:132:25: KW_OVER ws= window_specification
                    {
                    KW_OVER43=(Token)match(input,KW_OVER,FOLLOW_KW_OVER_in_selectItem705);  
                    stream_KW_OVER.add(KW_OVER43);


                    pushFollow(FOLLOW_window_specification_in_selectItem709);
                    ws=window_specification();

                    state._fsp--;

                    stream_window_specification.add(ws.getTree());

                    }
                    break;

            }


            // SelectClauseParser.g:133:7: ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )?
            int alt17=3;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // SelectClauseParser.g:133:8: ( ( KW_AS )? identifier )
                    {
                    // SelectClauseParser.g:133:8: ( ( KW_AS )? identifier )
                    // SelectClauseParser.g:133:9: ( KW_AS )? identifier
                    {
                    // SelectClauseParser.g:133:9: ( KW_AS )?
                    int alt15=2;
                    alt15 = dfa15.predict(input);
                    switch (alt15) {
                        case 1 :
                            // SelectClauseParser.g:133:9: KW_AS
                            {
                            KW_AS44=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_selectItem722);  
                            stream_KW_AS.add(KW_AS44);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_identifier_in_selectItem725);
                    identifier45=gHiveParser.identifier();

                    state._fsp--;

                    stream_identifier.add(identifier45.getTree());

                    }


                    }
                    break;
                case 2 :
                    // SelectClauseParser.g:133:30: ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN )
                    {
                    // SelectClauseParser.g:133:30: ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN )
                    // SelectClauseParser.g:133:31: KW_AS LPAREN identifier ( COMMA identifier )* RPAREN
                    {
                    KW_AS46=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_selectItem731);  
                    stream_KW_AS.add(KW_AS46);


                    LPAREN47=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_selectItem733);  
                    stream_LPAREN.add(LPAREN47);


                    pushFollow(FOLLOW_identifier_in_selectItem735);
                    identifier48=gHiveParser.identifier();

                    state._fsp--;

                    stream_identifier.add(identifier48.getTree());

                    // SelectClauseParser.g:133:55: ( COMMA identifier )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMA) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // SelectClauseParser.g:133:56: COMMA identifier
                    	    {
                    	    COMMA49=(Token)match(input,COMMA,FOLLOW_COMMA_in_selectItem738);  
                    	    stream_COMMA.add(COMMA49);


                    	    pushFollow(FOLLOW_identifier_in_selectItem740);
                    	    identifier50=gHiveParser.identifier();

                    	    state._fsp--;

                    	    stream_identifier.add(identifier50.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    RPAREN51=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_selectItem744);  
                    stream_RPAREN.add(RPAREN51);


                    }


                    }
                    break;

            }


            }


            // AST REWRITE
            // elements: identifier, selectExpression, ws
            // token labels: 
            // rule labels: retval, ws
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws",ws!=null?ws.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 134:7: -> ^( TOK_SELEXPR selectExpression ( identifier )* ( $ws)? )
            {
                // SelectClauseParser.g:134:10: ^( TOK_SELEXPR selectExpression ( identifier )* ( $ws)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR")
                , root_1);

                adaptor.addChild(root_1, stream_selectExpression.nextTree());

                // SelectClauseParser.g:134:41: ( identifier )*
                while ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_identifier.nextTree());

                }
                stream_identifier.reset();

                // SelectClauseParser.g:134:54: ( $ws)?
                if ( stream_ws.hasNext() ) {
                    adaptor.addChild(root_1, stream_ws.nextTree());

                }
                stream_ws.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             gParent.msgs.pop(); 
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selectItem"


    public static class trfmClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "trfmClause"
    // SelectClauseParser.g:137:1: trfmClause : ( KW_MAP selectExpressionList | KW_REDUCE selectExpressionList ) inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? ) ;
    public final HiveParser_SelectClauseParser.trfmClause_return trfmClause() throws RecognitionException {
        HiveParser_SelectClauseParser.trfmClause_return retval = new HiveParser_SelectClauseParser.trfmClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_MAP52=null;
        Token KW_REDUCE54=null;
        Token KW_USING56=null;
        Token StringLiteral57=null;
        Token KW_AS58=null;
        Token LPAREN59=null;
        Token RPAREN62=null;
        HiveParser.rowFormat_return inSerde =null;

        HiveParser.recordWriter_return inRec =null;

        HiveParser.rowFormat_return outSerde =null;

        HiveParser.recordReader_return outRec =null;

        HiveParser_SelectClauseParser.selectExpressionList_return selectExpressionList53 =null;

        HiveParser_SelectClauseParser.selectExpressionList_return selectExpressionList55 =null;

        HiveParser_FromClauseParser.aliasList_return aliasList60 =null;

        HiveParser.columnNameTypeList_return columnNameTypeList61 =null;

        HiveParser_FromClauseParser.aliasList_return aliasList63 =null;

        HiveParser.columnNameTypeList_return columnNameTypeList64 =null;


        CommonTree KW_MAP52_tree=null;
        CommonTree KW_REDUCE54_tree=null;
        CommonTree KW_USING56_tree=null;
        CommonTree StringLiteral57_tree=null;
        CommonTree KW_AS58_tree=null;
        CommonTree LPAREN59_tree=null;
        CommonTree RPAREN62_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_REDUCE=new RewriteRuleTokenStream(adaptor,"token KW_REDUCE");
        RewriteRuleTokenStream stream_KW_USING=new RewriteRuleTokenStream(adaptor,"token KW_USING");
        RewriteRuleTokenStream stream_KW_MAP=new RewriteRuleTokenStream(adaptor,"token KW_MAP");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_rowFormat=new RewriteRuleSubtreeStream(adaptor,"rule rowFormat");
        RewriteRuleSubtreeStream stream_columnNameTypeList=new RewriteRuleSubtreeStream(adaptor,"rule columnNameTypeList");
        RewriteRuleSubtreeStream stream_recordReader=new RewriteRuleSubtreeStream(adaptor,"rule recordReader");
        RewriteRuleSubtreeStream stream_aliasList=new RewriteRuleSubtreeStream(adaptor,"rule aliasList");
        RewriteRuleSubtreeStream stream_selectExpressionList=new RewriteRuleSubtreeStream(adaptor,"rule selectExpressionList");
        RewriteRuleSubtreeStream stream_recordWriter=new RewriteRuleSubtreeStream(adaptor,"rule recordWriter");
         gParent.msgs.push("transform clause"); 
        try {
            // SelectClauseParser.g:140:5: ( ( KW_MAP selectExpressionList | KW_REDUCE selectExpressionList ) inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? ) )
            // SelectClauseParser.g:141:5: ( KW_MAP selectExpressionList | KW_REDUCE selectExpressionList ) inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader
            {
            // SelectClauseParser.g:141:5: ( KW_MAP selectExpressionList | KW_REDUCE selectExpressionList )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==KW_MAP) ) {
                alt18=1;
            }
            else if ( (LA18_0==KW_REDUCE) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // SelectClauseParser.g:141:9: KW_MAP selectExpressionList
                    {
                    KW_MAP52=(Token)match(input,KW_MAP,FOLLOW_KW_MAP_in_trfmClause803);  
                    stream_KW_MAP.add(KW_MAP52);


                    pushFollow(FOLLOW_selectExpressionList_in_trfmClause808);
                    selectExpressionList53=selectExpressionList();

                    state._fsp--;

                    stream_selectExpressionList.add(selectExpressionList53.getTree());

                    }
                    break;
                case 2 :
                    // SelectClauseParser.g:142:9: KW_REDUCE selectExpressionList
                    {
                    KW_REDUCE54=(Token)match(input,KW_REDUCE,FOLLOW_KW_REDUCE_in_trfmClause818);  
                    stream_KW_REDUCE.add(KW_REDUCE54);


                    pushFollow(FOLLOW_selectExpressionList_in_trfmClause820);
                    selectExpressionList55=selectExpressionList();

                    state._fsp--;

                    stream_selectExpressionList.add(selectExpressionList55.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_rowFormat_in_trfmClause830);
            inSerde=gHiveParser.rowFormat();

            state._fsp--;

            stream_rowFormat.add(inSerde.getTree());

            pushFollow(FOLLOW_recordWriter_in_trfmClause834);
            inRec=gHiveParser.recordWriter();

            state._fsp--;

            stream_recordWriter.add(inRec.getTree());

            KW_USING56=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_trfmClause840);  
            stream_KW_USING.add(KW_USING56);


            StringLiteral57=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_trfmClause842);  
            stream_StringLiteral.add(StringLiteral57);


            // SelectClauseParser.g:145:5: ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==KW_AS) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // SelectClauseParser.g:145:7: KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) )
                    {
                    KW_AS58=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_trfmClause850);  
                    stream_KW_AS.add(KW_AS58);


                    // SelectClauseParser.g:145:13: ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==LPAREN) ) {
                        alt21=1;
                    }
                    else if ( ((LA21_0 >= Identifier && LA21_0 <= KW_ADD)||LA21_0==KW_AFTER||(LA21_0 >= KW_ALTER && LA21_0 <= KW_ANALYZE)||(LA21_0 >= KW_ARCHIVE && LA21_0 <= KW_CASCADE)||LA21_0==KW_CHANGE||(LA21_0 >= KW_CLUSTER && LA21_0 <= KW_CLUSTERSTATUS)||LA21_0==KW_COLLECTION||(LA21_0 >= KW_COLUMNS && LA21_0 <= KW_CONCATENATE)||LA21_0==KW_CONTINUE||LA21_0==KW_CREATE||LA21_0==KW_CUBE||(LA21_0 >= KW_CURSOR && LA21_0 <= KW_DATA)||(LA21_0 >= KW_DATABASES && LA21_0 <= KW_DISABLE)||(LA21_0 >= KW_DISTRIBUTE && LA21_0 <= KW_DOUBLE)||(LA21_0 >= KW_DROP && LA21_0 <= KW_ELEM_TYPE)||LA21_0==KW_ENABLE||LA21_0==KW_ESCAPED||LA21_0==KW_EXCLUSIVE||(LA21_0 >= KW_EXISTS && LA21_0 <= KW_EXPORT)||(LA21_0 >= KW_EXTERNAL && LA21_0 <= KW_FLOAT)||(LA21_0 >= KW_FOR && LA21_0 <= KW_FORMATTED)||LA21_0==KW_FULL||(LA21_0 >= KW_FUNCTIONS && LA21_0 <= KW_GROUPING)||(LA21_0 >= KW_HOLD_DDLTIME && LA21_0 <= KW_IDXPROPERTIES)||(LA21_0 >= KW_IGNORE && LA21_0 <= KW_INTERSECT)||(LA21_0 >= KW_INTO && LA21_0 <= KW_ITEMS)||(LA21_0 >= KW_KEYS && LA21_0 <= KW_LEFT)||(LA21_0 >= KW_LIKE && LA21_0 <= KW_LONG)||(LA21_0 >= KW_MAPJOIN && LA21_0 <= KW_MINUS)||(LA21_0 >= KW_MSCK && LA21_0 <= KW_NOSCAN)||(LA21_0 >= KW_NO_DROP && LA21_0 <= KW_OFFLINE)||LA21_0==KW_OPTION||(LA21_0 >= KW_ORCFILE && LA21_0 <= KW_OUTPUTFORMAT)||LA21_0==KW_OVERWRITE||(LA21_0 >= KW_PARTITION && LA21_0 <= KW_PLUS)||(LA21_0 >= KW_PRETTY && LA21_0 <= KW_PROCEDURE)||(LA21_0 >= KW_PROTECTION && LA21_0 <= KW_RECORDWRITER)||(LA21_0 >= KW_REGEXP && LA21_0 <= KW_SCHEMAS)||(LA21_0 >= KW_SEMI && LA21_0 <= KW_STRUCT)||(LA21_0 >= KW_TABLE && LA21_0 <= KW_TABLES)||(LA21_0 >= KW_TBLPROPERTIES && LA21_0 <= KW_TEXTFILE)||(LA21_0 >= KW_TIMESTAMP && LA21_0 <= KW_TOUCH)||(LA21_0 >= KW_TRIGGER && LA21_0 <= KW_UNARCHIVE)||(LA21_0 >= KW_UNDO && LA21_0 <= KW_UNIONTYPE)||(LA21_0 >= KW_UNLOCK && LA21_0 <= KW_UPDATE)||(LA21_0 >= KW_USE && LA21_0 <= KW_VIEW)||LA21_0==KW_WHILE||LA21_0==KW_WITH) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;

                    }
                    switch (alt21) {
                        case 1 :
                            // SelectClauseParser.g:145:14: ( LPAREN ( aliasList | columnNameTypeList ) RPAREN )
                            {
                            // SelectClauseParser.g:145:14: ( LPAREN ( aliasList | columnNameTypeList ) RPAREN )
                            // SelectClauseParser.g:145:15: LPAREN ( aliasList | columnNameTypeList ) RPAREN
                            {
                            LPAREN59=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_trfmClause854);  
                            stream_LPAREN.add(LPAREN59);


                            // SelectClauseParser.g:145:22: ( aliasList | columnNameTypeList )
                            int alt19=2;
                            int LA19_0 = input.LA(1);

                            if ( (LA19_0==Identifier) ) {
                                int LA19_1 = input.LA(2);

                                if ( (LA19_1==COMMA||LA19_1==RPAREN) ) {
                                    alt19=1;
                                }
                                else if ( (LA19_1==KW_ARRAY||(LA19_1 >= KW_BIGINT && LA19_1 <= KW_BOOLEAN)||(LA19_1 >= KW_DATE && LA19_1 <= KW_DATETIME)||LA19_1==KW_DECIMAL||LA19_1==KW_DOUBLE||LA19_1==KW_FLOAT||LA19_1==KW_INT||LA19_1==KW_MAP||LA19_1==KW_SMALLINT||(LA19_1 >= KW_STRING && LA19_1 <= KW_STRUCT)||(LA19_1 >= KW_TIMESTAMP && LA19_1 <= KW_TINYINT)||LA19_1==KW_UNIONTYPE) ) {
                                    alt19=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 19, 1, input);

                                    throw nvae;

                                }
                            }
                            else if ( (LA19_0==KW_ADD||LA19_0==KW_AFTER||(LA19_0 >= KW_ALTER && LA19_0 <= KW_ANALYZE)||(LA19_0 >= KW_ARCHIVE && LA19_0 <= KW_CASCADE)||LA19_0==KW_CHANGE||(LA19_0 >= KW_CLUSTER && LA19_0 <= KW_CLUSTERSTATUS)||LA19_0==KW_COLLECTION||(LA19_0 >= KW_COLUMNS && LA19_0 <= KW_CONCATENATE)||LA19_0==KW_CONTINUE||LA19_0==KW_CREATE||LA19_0==KW_CUBE||(LA19_0 >= KW_CURSOR && LA19_0 <= KW_DATA)||(LA19_0 >= KW_DATABASES && LA19_0 <= KW_DISABLE)||(LA19_0 >= KW_DISTRIBUTE && LA19_0 <= KW_DOUBLE)||(LA19_0 >= KW_DROP && LA19_0 <= KW_ELEM_TYPE)||LA19_0==KW_ENABLE||LA19_0==KW_ESCAPED||LA19_0==KW_EXCLUSIVE||(LA19_0 >= KW_EXISTS && LA19_0 <= KW_EXPORT)||(LA19_0 >= KW_EXTERNAL && LA19_0 <= KW_FLOAT)||(LA19_0 >= KW_FOR && LA19_0 <= KW_FORMATTED)||LA19_0==KW_FULL||(LA19_0 >= KW_FUNCTIONS && LA19_0 <= KW_GROUPING)||(LA19_0 >= KW_HOLD_DDLTIME && LA19_0 <= KW_IDXPROPERTIES)||(LA19_0 >= KW_IGNORE && LA19_0 <= KW_INTERSECT)||(LA19_0 >= KW_INTO && LA19_0 <= KW_ITEMS)||(LA19_0 >= KW_KEYS && LA19_0 <= KW_LEFT)||(LA19_0 >= KW_LIKE && LA19_0 <= KW_LONG)||(LA19_0 >= KW_MAPJOIN && LA19_0 <= KW_MINUS)||(LA19_0 >= KW_MSCK && LA19_0 <= KW_NOSCAN)||(LA19_0 >= KW_NO_DROP && LA19_0 <= KW_OFFLINE)||LA19_0==KW_OPTION||(LA19_0 >= KW_ORCFILE && LA19_0 <= KW_OUTPUTFORMAT)||LA19_0==KW_OVERWRITE||(LA19_0 >= KW_PARTITION && LA19_0 <= KW_PLUS)||(LA19_0 >= KW_PRETTY && LA19_0 <= KW_PROCEDURE)||(LA19_0 >= KW_PROTECTION && LA19_0 <= KW_RECORDWRITER)||(LA19_0 >= KW_REGEXP && LA19_0 <= KW_SCHEMAS)||(LA19_0 >= KW_SEMI && LA19_0 <= KW_STRUCT)||(LA19_0 >= KW_TABLE && LA19_0 <= KW_TABLES)||(LA19_0 >= KW_TBLPROPERTIES && LA19_0 <= KW_TEXTFILE)||(LA19_0 >= KW_TIMESTAMP && LA19_0 <= KW_TOUCH)||(LA19_0 >= KW_TRIGGER && LA19_0 <= KW_UNARCHIVE)||(LA19_0 >= KW_UNDO && LA19_0 <= KW_UNIONTYPE)||(LA19_0 >= KW_UNLOCK && LA19_0 <= KW_UPDATE)||(LA19_0 >= KW_USE && LA19_0 <= KW_VIEW)||LA19_0==KW_WHILE||LA19_0==KW_WITH) ) {
                                int LA19_2 = input.LA(2);

                                if ( (LA19_2==COMMA||LA19_2==RPAREN) ) {
                                    alt19=1;
                                }
                                else if ( (LA19_2==KW_ARRAY||(LA19_2 >= KW_BIGINT && LA19_2 <= KW_BOOLEAN)||(LA19_2 >= KW_DATE && LA19_2 <= KW_DATETIME)||LA19_2==KW_DECIMAL||LA19_2==KW_DOUBLE||LA19_2==KW_FLOAT||LA19_2==KW_INT||LA19_2==KW_MAP||LA19_2==KW_SMALLINT||(LA19_2 >= KW_STRING && LA19_2 <= KW_STRUCT)||(LA19_2 >= KW_TIMESTAMP && LA19_2 <= KW_TINYINT)||LA19_2==KW_UNIONTYPE) ) {
                                    alt19=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 19, 2, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 19, 0, input);

                                throw nvae;

                            }
                            switch (alt19) {
                                case 1 :
                                    // SelectClauseParser.g:145:23: aliasList
                                    {
                                    pushFollow(FOLLOW_aliasList_in_trfmClause857);
                                    aliasList60=gHiveParser.aliasList();

                                    state._fsp--;

                                    stream_aliasList.add(aliasList60.getTree());

                                    }
                                    break;
                                case 2 :
                                    // SelectClauseParser.g:145:35: columnNameTypeList
                                    {
                                    pushFollow(FOLLOW_columnNameTypeList_in_trfmClause861);
                                    columnNameTypeList61=gHiveParser.columnNameTypeList();

                                    state._fsp--;

                                    stream_columnNameTypeList.add(columnNameTypeList61.getTree());

                                    }
                                    break;

                            }


                            RPAREN62=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_trfmClause864);  
                            stream_RPAREN.add(RPAREN62);


                            }


                            }
                            break;
                        case 2 :
                            // SelectClauseParser.g:145:65: ( aliasList | columnNameTypeList )
                            {
                            // SelectClauseParser.g:145:65: ( aliasList | columnNameTypeList )
                            int alt20=2;
                            alt20 = dfa20.predict(input);
                            switch (alt20) {
                                case 1 :
                                    // SelectClauseParser.g:145:66: aliasList
                                    {
                                    pushFollow(FOLLOW_aliasList_in_trfmClause870);
                                    aliasList63=gHiveParser.aliasList();

                                    state._fsp--;

                                    stream_aliasList.add(aliasList63.getTree());

                                    }
                                    break;
                                case 2 :
                                    // SelectClauseParser.g:145:78: columnNameTypeList
                                    {
                                    pushFollow(FOLLOW_columnNameTypeList_in_trfmClause874);
                                    columnNameTypeList64=gHiveParser.columnNameTypeList();

                                    state._fsp--;

                                    stream_columnNameTypeList.add(columnNameTypeList64.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            pushFollow(FOLLOW_rowFormat_in_trfmClause886);
            outSerde=gHiveParser.rowFormat();

            state._fsp--;

            stream_rowFormat.add(outSerde.getTree());

            pushFollow(FOLLOW_recordReader_in_trfmClause890);
            outRec=gHiveParser.recordReader();

            state._fsp--;

            stream_recordReader.add(outRec.getTree());

            // AST REWRITE
            // elements: aliasList, outSerde, selectExpressionList, outRec, StringLiteral, columnNameTypeList, inRec, inSerde
            // token labels: 
            // rule labels: retval, inSerde, inRec, outRec, outSerde
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_inSerde=new RewriteRuleSubtreeStream(adaptor,"rule inSerde",inSerde!=null?inSerde.tree:null);
            RewriteRuleSubtreeStream stream_inRec=new RewriteRuleSubtreeStream(adaptor,"rule inRec",inRec!=null?inRec.tree:null);
            RewriteRuleSubtreeStream stream_outRec=new RewriteRuleSubtreeStream(adaptor,"rule outRec",outRec!=null?outRec.tree:null);
            RewriteRuleSubtreeStream stream_outSerde=new RewriteRuleSubtreeStream(adaptor,"rule outSerde",outSerde!=null?outSerde.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 147:5: -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? )
            {
                // SelectClauseParser.g:147:8: ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_TRANSFORM, "TOK_TRANSFORM")
                , root_1);

                adaptor.addChild(root_1, stream_selectExpressionList.nextTree());

                adaptor.addChild(root_1, stream_inSerde.nextTree());

                adaptor.addChild(root_1, stream_inRec.nextTree());

                adaptor.addChild(root_1, 
                stream_StringLiteral.nextNode()
                );

                adaptor.addChild(root_1, stream_outSerde.nextTree());

                adaptor.addChild(root_1, stream_outRec.nextTree());

                // SelectClauseParser.g:147:93: ( aliasList )?
                if ( stream_aliasList.hasNext() ) {
                    adaptor.addChild(root_1, stream_aliasList.nextTree());

                }
                stream_aliasList.reset();

                // SelectClauseParser.g:147:104: ( columnNameTypeList )?
                if ( stream_columnNameTypeList.hasNext() ) {
                    adaptor.addChild(root_1, stream_columnNameTypeList.nextTree());

                }
                stream_columnNameTypeList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             gParent.msgs.pop(); 
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "trfmClause"


    public static class selectExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectExpression"
    // SelectClauseParser.g:150:1: selectExpression : ( expression | tableAllColumns );
    public final HiveParser_SelectClauseParser.selectExpression_return selectExpression() throws RecognitionException {
        HiveParser_SelectClauseParser.selectExpression_return retval = new HiveParser_SelectClauseParser.selectExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.expression_return expression65 =null;

        HiveParser_FromClauseParser.tableAllColumns_return tableAllColumns66 =null;



         gParent.msgs.push("select expression"); 
        try {
            // SelectClauseParser.g:153:5: ( expression | tableAllColumns )
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // SelectClauseParser.g:154:5: expression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_expression_in_selectExpression953);
                    expression65=gHiveParser.expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression65.getTree());

                    }
                    break;
                case 2 :
                    // SelectClauseParser.g:154:18: tableAllColumns
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_tableAllColumns_in_selectExpression957);
                    tableAllColumns66=gHiveParser.tableAllColumns();

                    state._fsp--;

                    adaptor.addChild(root_0, tableAllColumns66.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             gParent.msgs.pop(); 
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selectExpression"


    public static class selectExpressionList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectExpressionList"
    // SelectClauseParser.g:157:1: selectExpressionList : selectExpression ( COMMA selectExpression )* -> ^( TOK_EXPLIST ( selectExpression )+ ) ;
    public final HiveParser_SelectClauseParser.selectExpressionList_return selectExpressionList() throws RecognitionException {
        HiveParser_SelectClauseParser.selectExpressionList_return retval = new HiveParser_SelectClauseParser.selectExpressionList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMMA68=null;
        HiveParser_SelectClauseParser.selectExpression_return selectExpression67 =null;

        HiveParser_SelectClauseParser.selectExpression_return selectExpression69 =null;


        CommonTree COMMA68_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_selectExpression=new RewriteRuleSubtreeStream(adaptor,"rule selectExpression");
         gParent.msgs.push("select expression list"); 
        try {
            // SelectClauseParser.g:160:5: ( selectExpression ( COMMA selectExpression )* -> ^( TOK_EXPLIST ( selectExpression )+ ) )
            // SelectClauseParser.g:161:5: selectExpression ( COMMA selectExpression )*
            {
            pushFollow(FOLLOW_selectExpression_in_selectExpressionList988);
            selectExpression67=selectExpression();

            state._fsp--;

            stream_selectExpression.add(selectExpression67.getTree());

            // SelectClauseParser.g:161:22: ( COMMA selectExpression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==COMMA) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // SelectClauseParser.g:161:23: COMMA selectExpression
            	    {
            	    COMMA68=(Token)match(input,COMMA,FOLLOW_COMMA_in_selectExpressionList991);  
            	    stream_COMMA.add(COMMA68);


            	    pushFollow(FOLLOW_selectExpression_in_selectExpressionList993);
            	    selectExpression69=selectExpression();

            	    state._fsp--;

            	    stream_selectExpression.add(selectExpression69.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            // AST REWRITE
            // elements: selectExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 161:48: -> ^( TOK_EXPLIST ( selectExpression )+ )
            {
                // SelectClauseParser.g:161:51: ^( TOK_EXPLIST ( selectExpression )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_EXPLIST, "TOK_EXPLIST")
                , root_1);

                if ( !(stream_selectExpression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_selectExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_selectExpression.nextTree());

                }
                stream_selectExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             gParent.msgs.pop(); 
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selectExpressionList"


    public static class window_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "window_clause"
    // SelectClauseParser.g:165:1: window_clause : KW_WINDOW window_defn ( COMMA window_defn )* -> ^( KW_WINDOW ( window_defn )+ ) ;
    public final HiveParser_SelectClauseParser.window_clause_return window_clause() throws RecognitionException {
        HiveParser_SelectClauseParser.window_clause_return retval = new HiveParser_SelectClauseParser.window_clause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_WINDOW70=null;
        Token COMMA72=null;
        HiveParser_SelectClauseParser.window_defn_return window_defn71 =null;

        HiveParser_SelectClauseParser.window_defn_return window_defn73 =null;


        CommonTree KW_WINDOW70_tree=null;
        CommonTree COMMA72_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_WINDOW=new RewriteRuleTokenStream(adaptor,"token KW_WINDOW");
        RewriteRuleSubtreeStream stream_window_defn=new RewriteRuleSubtreeStream(adaptor,"rule window_defn");
         gParent.msgs.push("window_clause"); 
        try {
            // SelectClauseParser.g:168:3: ( KW_WINDOW window_defn ( COMMA window_defn )* -> ^( KW_WINDOW ( window_defn )+ ) )
            // SelectClauseParser.g:169:3: KW_WINDOW window_defn ( COMMA window_defn )*
            {
            KW_WINDOW70=(Token)match(input,KW_WINDOW,FOLLOW_KW_WINDOW_in_window_clause1032);  
            stream_KW_WINDOW.add(KW_WINDOW70);


            pushFollow(FOLLOW_window_defn_in_window_clause1034);
            window_defn71=window_defn();

            state._fsp--;

            stream_window_defn.add(window_defn71.getTree());

            // SelectClauseParser.g:169:25: ( COMMA window_defn )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==COMMA) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // SelectClauseParser.g:169:26: COMMA window_defn
            	    {
            	    COMMA72=(Token)match(input,COMMA,FOLLOW_COMMA_in_window_clause1037);  
            	    stream_COMMA.add(COMMA72);


            	    pushFollow(FOLLOW_window_defn_in_window_clause1039);
            	    window_defn73=window_defn();

            	    state._fsp--;

            	    stream_window_defn.add(window_defn73.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            // AST REWRITE
            // elements: KW_WINDOW, window_defn
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 169:46: -> ^( KW_WINDOW ( window_defn )+ )
            {
                // SelectClauseParser.g:169:49: ^( KW_WINDOW ( window_defn )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_KW_WINDOW.nextNode()
                , root_1);

                if ( !(stream_window_defn.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_window_defn.hasNext() ) {
                    adaptor.addChild(root_1, stream_window_defn.nextTree());

                }
                stream_window_defn.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             gParent.msgs.pop(); 
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "window_clause"


    public static class window_defn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "window_defn"
    // SelectClauseParser.g:172:1: window_defn : Identifier KW_AS window_specification -> ^( TOK_WINDOWDEF Identifier window_specification ) ;
    public final HiveParser_SelectClauseParser.window_defn_return window_defn() throws RecognitionException {
        HiveParser_SelectClauseParser.window_defn_return retval = new HiveParser_SelectClauseParser.window_defn_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token Identifier74=null;
        Token KW_AS75=null;
        HiveParser_SelectClauseParser.window_specification_return window_specification76 =null;


        CommonTree Identifier74_tree=null;
        CommonTree KW_AS75_tree=null;
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_window_specification=new RewriteRuleSubtreeStream(adaptor,"rule window_specification");
         gParent.msgs.push("window_defn"); 
        try {
            // SelectClauseParser.g:175:3: ( Identifier KW_AS window_specification -> ^( TOK_WINDOWDEF Identifier window_specification ) )
            // SelectClauseParser.g:176:3: Identifier KW_AS window_specification
            {
            Identifier74=(Token)match(input,Identifier,FOLLOW_Identifier_in_window_defn1075);  
            stream_Identifier.add(Identifier74);


            KW_AS75=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_window_defn1077);  
            stream_KW_AS.add(KW_AS75);


            pushFollow(FOLLOW_window_specification_in_window_defn1079);
            window_specification76=window_specification();

            state._fsp--;

            stream_window_specification.add(window_specification76.getTree());

            // AST REWRITE
            // elements: Identifier, window_specification
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 176:41: -> ^( TOK_WINDOWDEF Identifier window_specification )
            {
                // SelectClauseParser.g:176:44: ^( TOK_WINDOWDEF Identifier window_specification )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_WINDOWDEF, "TOK_WINDOWDEF")
                , root_1);

                adaptor.addChild(root_1, 
                stream_Identifier.nextNode()
                );

                adaptor.addChild(root_1, stream_window_specification.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             gParent.msgs.pop(); 
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "window_defn"


    public static class window_specification_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "window_specification"
    // SelectClauseParser.g:179:1: window_specification : ( Identifier | ( LPAREN ( Identifier )? ( partitioningSpec )? ( window_frame )? RPAREN ) ) -> ^( TOK_WINDOWSPEC ( Identifier )? ( partitioningSpec )? ( window_frame )? ) ;
    public final HiveParser_SelectClauseParser.window_specification_return window_specification() throws RecognitionException {
        HiveParser_SelectClauseParser.window_specification_return retval = new HiveParser_SelectClauseParser.window_specification_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token Identifier77=null;
        Token LPAREN78=null;
        Token Identifier79=null;
        Token RPAREN82=null;
        HiveParser_FromClauseParser.partitioningSpec_return partitioningSpec80 =null;

        HiveParser_SelectClauseParser.window_frame_return window_frame81 =null;


        CommonTree Identifier77_tree=null;
        CommonTree LPAREN78_tree=null;
        CommonTree Identifier79_tree=null;
        CommonTree RPAREN82_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_window_frame=new RewriteRuleSubtreeStream(adaptor,"rule window_frame");
        RewriteRuleSubtreeStream stream_partitioningSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitioningSpec");
         gParent.msgs.push("window_specification"); 
        try {
            // SelectClauseParser.g:182:3: ( ( Identifier | ( LPAREN ( Identifier )? ( partitioningSpec )? ( window_frame )? RPAREN ) ) -> ^( TOK_WINDOWSPEC ( Identifier )? ( partitioningSpec )? ( window_frame )? ) )
            // SelectClauseParser.g:183:3: ( Identifier | ( LPAREN ( Identifier )? ( partitioningSpec )? ( window_frame )? RPAREN ) )
            {
            // SelectClauseParser.g:183:3: ( Identifier | ( LPAREN ( Identifier )? ( partitioningSpec )? ( window_frame )? RPAREN ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Identifier) ) {
                alt29=1;
            }
            else if ( (LA29_0==LPAREN) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // SelectClauseParser.g:183:4: Identifier
                    {
                    Identifier77=(Token)match(input,Identifier,FOLLOW_Identifier_in_window_specification1115);  
                    stream_Identifier.add(Identifier77);


                    }
                    break;
                case 2 :
                    // SelectClauseParser.g:183:17: ( LPAREN ( Identifier )? ( partitioningSpec )? ( window_frame )? RPAREN )
                    {
                    // SelectClauseParser.g:183:17: ( LPAREN ( Identifier )? ( partitioningSpec )? ( window_frame )? RPAREN )
                    // SelectClauseParser.g:183:19: LPAREN ( Identifier )? ( partitioningSpec )? ( window_frame )? RPAREN
                    {
                    LPAREN78=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_window_specification1121);  
                    stream_LPAREN.add(LPAREN78);


                    // SelectClauseParser.g:183:26: ( Identifier )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==Identifier) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // SelectClauseParser.g:183:26: Identifier
                            {
                            Identifier79=(Token)match(input,Identifier,FOLLOW_Identifier_in_window_specification1123);  
                            stream_Identifier.add(Identifier79);


                            }
                            break;

                    }


                    // SelectClauseParser.g:183:38: ( partitioningSpec )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==KW_CLUSTER||LA27_0==KW_DISTRIBUTE||LA27_0==KW_ORDER||LA27_0==KW_PARTITION||LA27_0==KW_SORT) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // SelectClauseParser.g:183:38: partitioningSpec
                            {
                            pushFollow(FOLLOW_partitioningSpec_in_window_specification1126);
                            partitioningSpec80=gHiveParser.partitioningSpec();

                            state._fsp--;

                            stream_partitioningSpec.add(partitioningSpec80.getTree());

                            }
                            break;

                    }


                    // SelectClauseParser.g:183:56: ( window_frame )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==KW_RANGE||LA28_0==KW_ROWS) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // SelectClauseParser.g:183:56: window_frame
                            {
                            pushFollow(FOLLOW_window_frame_in_window_specification1129);
                            window_frame81=window_frame();

                            state._fsp--;

                            stream_window_frame.add(window_frame81.getTree());

                            }
                            break;

                    }


                    RPAREN82=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_window_specification1132);  
                    stream_RPAREN.add(RPAREN82);


                    }


                    }
                    break;

            }


            // AST REWRITE
            // elements: window_frame, partitioningSpec, Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 183:79: -> ^( TOK_WINDOWSPEC ( Identifier )? ( partitioningSpec )? ( window_frame )? )
            {
                // SelectClauseParser.g:183:82: ^( TOK_WINDOWSPEC ( Identifier )? ( partitioningSpec )? ( window_frame )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_WINDOWSPEC, "TOK_WINDOWSPEC")
                , root_1);

                // SelectClauseParser.g:183:99: ( Identifier )?
                if ( stream_Identifier.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_Identifier.nextNode()
                    );

                }
                stream_Identifier.reset();

                // SelectClauseParser.g:183:111: ( partitioningSpec )?
                if ( stream_partitioningSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_partitioningSpec.nextTree());

                }
                stream_partitioningSpec.reset();

                // SelectClauseParser.g:183:129: ( window_frame )?
                if ( stream_window_frame.hasNext() ) {
                    adaptor.addChild(root_1, stream_window_frame.nextTree());

                }
                stream_window_frame.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             gParent.msgs.pop(); 
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "window_specification"


    public static class window_frame_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "window_frame"
    // SelectClauseParser.g:186:1: window_frame : ( window_range_expression | window_value_expression );
    public final HiveParser_SelectClauseParser.window_frame_return window_frame() throws RecognitionException {
        HiveParser_SelectClauseParser.window_frame_return retval = new HiveParser_SelectClauseParser.window_frame_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_SelectClauseParser.window_range_expression_return window_range_expression83 =null;

        HiveParser_SelectClauseParser.window_value_expression_return window_value_expression84 =null;



        try {
            // SelectClauseParser.g:186:14: ( window_range_expression | window_value_expression )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==KW_ROWS) ) {
                alt30=1;
            }
            else if ( (LA30_0==KW_RANGE) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // SelectClauseParser.g:187:2: window_range_expression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_window_range_expression_in_window_frame1159);
                    window_range_expression83=window_range_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, window_range_expression83.getTree());

                    }
                    break;
                case 2 :
                    // SelectClauseParser.g:188:2: window_value_expression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_window_value_expression_in_window_frame1164);
                    window_value_expression84=window_value_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, window_value_expression84.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "window_frame"


    public static class window_range_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "window_range_expression"
    // SelectClauseParser.g:191:1: window_range_expression : ( KW_ROWS sb= window_frame_start_boundary -> ^( TOK_WINDOWRANGE $sb) | KW_ROWS KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary -> ^( TOK_WINDOWRANGE $s $end) );
    public final HiveParser_SelectClauseParser.window_range_expression_return window_range_expression() throws RecognitionException {
        HiveParser_SelectClauseParser.window_range_expression_return retval = new HiveParser_SelectClauseParser.window_range_expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_ROWS85=null;
        Token KW_ROWS86=null;
        Token KW_BETWEEN87=null;
        Token KW_AND88=null;
        HiveParser_SelectClauseParser.window_frame_start_boundary_return sb =null;

        HiveParser_SelectClauseParser.window_frame_boundary_return s =null;

        HiveParser_SelectClauseParser.window_frame_boundary_return end =null;


        CommonTree KW_ROWS85_tree=null;
        CommonTree KW_ROWS86_tree=null;
        CommonTree KW_BETWEEN87_tree=null;
        CommonTree KW_AND88_tree=null;
        RewriteRuleTokenStream stream_KW_BETWEEN=new RewriteRuleTokenStream(adaptor,"token KW_BETWEEN");
        RewriteRuleTokenStream stream_KW_ROWS=new RewriteRuleTokenStream(adaptor,"token KW_ROWS");
        RewriteRuleTokenStream stream_KW_AND=new RewriteRuleTokenStream(adaptor,"token KW_AND");
        RewriteRuleSubtreeStream stream_window_frame_boundary=new RewriteRuleSubtreeStream(adaptor,"rule window_frame_boundary");
        RewriteRuleSubtreeStream stream_window_frame_start_boundary=new RewriteRuleSubtreeStream(adaptor,"rule window_frame_start_boundary");
         gParent.msgs.push("window_range_expression"); 
        try {
            // SelectClauseParser.g:194:2: ( KW_ROWS sb= window_frame_start_boundary -> ^( TOK_WINDOWRANGE $sb) | KW_ROWS KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary -> ^( TOK_WINDOWRANGE $s $end) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==KW_ROWS) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==KW_BETWEEN) ) {
                    alt31=2;
                }
                else if ( (LA31_1==KW_CURRENT||LA31_1==KW_UNBOUNDED||LA31_1==Number) ) {
                    alt31=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // SelectClauseParser.g:195:2: KW_ROWS sb= window_frame_start_boundary
                    {
                    KW_ROWS85=(Token)match(input,KW_ROWS,FOLLOW_KW_ROWS_in_window_range_expression1186);  
                    stream_KW_ROWS.add(KW_ROWS85);


                    pushFollow(FOLLOW_window_frame_start_boundary_in_window_range_expression1190);
                    sb=window_frame_start_boundary();

                    state._fsp--;

                    stream_window_frame_start_boundary.add(sb.getTree());

                    // AST REWRITE
                    // elements: sb
                    // token labels: 
                    // rule labels: retval, sb
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_sb=new RewriteRuleSubtreeStream(adaptor,"rule sb",sb!=null?sb.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 195:41: -> ^( TOK_WINDOWRANGE $sb)
                    {
                        // SelectClauseParser.g:195:44: ^( TOK_WINDOWRANGE $sb)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_WINDOWRANGE, "TOK_WINDOWRANGE")
                        , root_1);

                        adaptor.addChild(root_1, stream_sb.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // SelectClauseParser.g:196:2: KW_ROWS KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary
                    {
                    KW_ROWS86=(Token)match(input,KW_ROWS,FOLLOW_KW_ROWS_in_window_range_expression1204);  
                    stream_KW_ROWS.add(KW_ROWS86);


                    KW_BETWEEN87=(Token)match(input,KW_BETWEEN,FOLLOW_KW_BETWEEN_in_window_range_expression1206);  
                    stream_KW_BETWEEN.add(KW_BETWEEN87);


                    pushFollow(FOLLOW_window_frame_boundary_in_window_range_expression1210);
                    s=window_frame_boundary();

                    state._fsp--;

                    stream_window_frame_boundary.add(s.getTree());

                    KW_AND88=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_window_range_expression1212);  
                    stream_KW_AND.add(KW_AND88);


                    pushFollow(FOLLOW_window_frame_boundary_in_window_range_expression1216);
                    end=window_frame_boundary();

                    state._fsp--;

                    stream_window_frame_boundary.add(end.getTree());

                    // AST REWRITE
                    // elements: s, end
                    // token labels: 
                    // rule labels: retval, s, end
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.tree:null);
                    RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end",end!=null?end.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 196:78: -> ^( TOK_WINDOWRANGE $s $end)
                    {
                        // SelectClauseParser.g:196:81: ^( TOK_WINDOWRANGE $s $end)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_WINDOWRANGE, "TOK_WINDOWRANGE")
                        , root_1);

                        adaptor.addChild(root_1, stream_s.nextTree());

                        adaptor.addChild(root_1, stream_end.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             gParent.msgs.pop(); 
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "window_range_expression"


    public static class window_value_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "window_value_expression"
    // SelectClauseParser.g:199:1: window_value_expression : ( KW_RANGE sb= window_frame_start_boundary -> ^( TOK_WINDOWVALUES $sb) | KW_RANGE KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary -> ^( TOK_WINDOWVALUES $s $end) );
    public final HiveParser_SelectClauseParser.window_value_expression_return window_value_expression() throws RecognitionException {
        HiveParser_SelectClauseParser.window_value_expression_return retval = new HiveParser_SelectClauseParser.window_value_expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_RANGE89=null;
        Token KW_RANGE90=null;
        Token KW_BETWEEN91=null;
        Token KW_AND92=null;
        HiveParser_SelectClauseParser.window_frame_start_boundary_return sb =null;

        HiveParser_SelectClauseParser.window_frame_boundary_return s =null;

        HiveParser_SelectClauseParser.window_frame_boundary_return end =null;


        CommonTree KW_RANGE89_tree=null;
        CommonTree KW_RANGE90_tree=null;
        CommonTree KW_BETWEEN91_tree=null;
        CommonTree KW_AND92_tree=null;
        RewriteRuleTokenStream stream_KW_BETWEEN=new RewriteRuleTokenStream(adaptor,"token KW_BETWEEN");
        RewriteRuleTokenStream stream_KW_AND=new RewriteRuleTokenStream(adaptor,"token KW_AND");
        RewriteRuleTokenStream stream_KW_RANGE=new RewriteRuleTokenStream(adaptor,"token KW_RANGE");
        RewriteRuleSubtreeStream stream_window_frame_boundary=new RewriteRuleSubtreeStream(adaptor,"rule window_frame_boundary");
        RewriteRuleSubtreeStream stream_window_frame_start_boundary=new RewriteRuleSubtreeStream(adaptor,"rule window_frame_start_boundary");
         gParent.msgs.push("window_value_expression"); 
        try {
            // SelectClauseParser.g:202:2: ( KW_RANGE sb= window_frame_start_boundary -> ^( TOK_WINDOWVALUES $sb) | KW_RANGE KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary -> ^( TOK_WINDOWVALUES $s $end) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==KW_RANGE) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==KW_BETWEEN) ) {
                    alt32=2;
                }
                else if ( (LA32_1==KW_CURRENT||LA32_1==KW_UNBOUNDED||LA32_1==Number) ) {
                    alt32=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // SelectClauseParser.g:203:2: KW_RANGE sb= window_frame_start_boundary
                    {
                    KW_RANGE89=(Token)match(input,KW_RANGE,FOLLOW_KW_RANGE_in_window_value_expression1250);  
                    stream_KW_RANGE.add(KW_RANGE89);


                    pushFollow(FOLLOW_window_frame_start_boundary_in_window_value_expression1254);
                    sb=window_frame_start_boundary();

                    state._fsp--;

                    stream_window_frame_start_boundary.add(sb.getTree());

                    // AST REWRITE
                    // elements: sb
                    // token labels: 
                    // rule labels: retval, sb
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_sb=new RewriteRuleSubtreeStream(adaptor,"rule sb",sb!=null?sb.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 203:42: -> ^( TOK_WINDOWVALUES $sb)
                    {
                        // SelectClauseParser.g:203:45: ^( TOK_WINDOWVALUES $sb)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_WINDOWVALUES, "TOK_WINDOWVALUES")
                        , root_1);

                        adaptor.addChild(root_1, stream_sb.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // SelectClauseParser.g:204:2: KW_RANGE KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary
                    {
                    KW_RANGE90=(Token)match(input,KW_RANGE,FOLLOW_KW_RANGE_in_window_value_expression1268);  
                    stream_KW_RANGE.add(KW_RANGE90);


                    KW_BETWEEN91=(Token)match(input,KW_BETWEEN,FOLLOW_KW_BETWEEN_in_window_value_expression1270);  
                    stream_KW_BETWEEN.add(KW_BETWEEN91);


                    pushFollow(FOLLOW_window_frame_boundary_in_window_value_expression1274);
                    s=window_frame_boundary();

                    state._fsp--;

                    stream_window_frame_boundary.add(s.getTree());

                    KW_AND92=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_window_value_expression1276);  
                    stream_KW_AND.add(KW_AND92);


                    pushFollow(FOLLOW_window_frame_boundary_in_window_value_expression1280);
                    end=window_frame_boundary();

                    state._fsp--;

                    stream_window_frame_boundary.add(end.getTree());

                    // AST REWRITE
                    // elements: s, end
                    // token labels: 
                    // rule labels: retval, s, end
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.tree:null);
                    RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end",end!=null?end.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 204:79: -> ^( TOK_WINDOWVALUES $s $end)
                    {
                        // SelectClauseParser.g:204:82: ^( TOK_WINDOWVALUES $s $end)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_WINDOWVALUES, "TOK_WINDOWVALUES")
                        , root_1);

                        adaptor.addChild(root_1, stream_s.nextTree());

                        adaptor.addChild(root_1, stream_end.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             gParent.msgs.pop(); 
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "window_value_expression"


    public static class window_frame_start_boundary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "window_frame_start_boundary"
    // SelectClauseParser.g:207:1: window_frame_start_boundary : ( KW_UNBOUNDED KW_PRECEDING -> ^( KW_PRECEDING KW_UNBOUNDED ) | KW_CURRENT KW_ROW -> ^( KW_CURRENT ) | Number KW_PRECEDING -> ^( KW_PRECEDING Number ) );
    public final HiveParser_SelectClauseParser.window_frame_start_boundary_return window_frame_start_boundary() throws RecognitionException {
        HiveParser_SelectClauseParser.window_frame_start_boundary_return retval = new HiveParser_SelectClauseParser.window_frame_start_boundary_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_UNBOUNDED93=null;
        Token KW_PRECEDING94=null;
        Token KW_CURRENT95=null;
        Token KW_ROW96=null;
        Token Number97=null;
        Token KW_PRECEDING98=null;

        CommonTree KW_UNBOUNDED93_tree=null;
        CommonTree KW_PRECEDING94_tree=null;
        CommonTree KW_CURRENT95_tree=null;
        CommonTree KW_ROW96_tree=null;
        CommonTree Number97_tree=null;
        CommonTree KW_PRECEDING98_tree=null;
        RewriteRuleTokenStream stream_KW_PRECEDING=new RewriteRuleTokenStream(adaptor,"token KW_PRECEDING");
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
        RewriteRuleTokenStream stream_KW_CURRENT=new RewriteRuleTokenStream(adaptor,"token KW_CURRENT");
        RewriteRuleTokenStream stream_KW_ROW=new RewriteRuleTokenStream(adaptor,"token KW_ROW");
        RewriteRuleTokenStream stream_KW_UNBOUNDED=new RewriteRuleTokenStream(adaptor,"token KW_UNBOUNDED");

         gParent.msgs.push("windowframestartboundary"); 
        try {
            // SelectClauseParser.g:210:3: ( KW_UNBOUNDED KW_PRECEDING -> ^( KW_PRECEDING KW_UNBOUNDED ) | KW_CURRENT KW_ROW -> ^( KW_CURRENT ) | Number KW_PRECEDING -> ^( KW_PRECEDING Number ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case KW_UNBOUNDED:
                {
                alt33=1;
                }
                break;
            case KW_CURRENT:
                {
                alt33=2;
                }
                break;
            case Number:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }

            switch (alt33) {
                case 1 :
                    // SelectClauseParser.g:211:3: KW_UNBOUNDED KW_PRECEDING
                    {
                    KW_UNBOUNDED93=(Token)match(input,KW_UNBOUNDED,FOLLOW_KW_UNBOUNDED_in_window_frame_start_boundary1315);  
                    stream_KW_UNBOUNDED.add(KW_UNBOUNDED93);


                    KW_PRECEDING94=(Token)match(input,KW_PRECEDING,FOLLOW_KW_PRECEDING_in_window_frame_start_boundary1317);  
                    stream_KW_PRECEDING.add(KW_PRECEDING94);


                    // AST REWRITE
                    // elements: KW_UNBOUNDED, KW_PRECEDING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 211:30: -> ^( KW_PRECEDING KW_UNBOUNDED )
                    {
                        // SelectClauseParser.g:211:33: ^( KW_PRECEDING KW_UNBOUNDED )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_KW_PRECEDING.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_KW_UNBOUNDED.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // SelectClauseParser.g:212:3: KW_CURRENT KW_ROW
                    {
                    KW_CURRENT95=(Token)match(input,KW_CURRENT,FOLLOW_KW_CURRENT_in_window_frame_start_boundary1333);  
                    stream_KW_CURRENT.add(KW_CURRENT95);


                    KW_ROW96=(Token)match(input,KW_ROW,FOLLOW_KW_ROW_in_window_frame_start_boundary1335);  
                    stream_KW_ROW.add(KW_ROW96);


                    // AST REWRITE
                    // elements: KW_CURRENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 212:22: -> ^( KW_CURRENT )
                    {
                        // SelectClauseParser.g:212:25: ^( KW_CURRENT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_KW_CURRENT.nextNode()
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // SelectClauseParser.g:213:3: Number KW_PRECEDING
                    {
                    Number97=(Token)match(input,Number,FOLLOW_Number_in_window_frame_start_boundary1348);  
                    stream_Number.add(Number97);


                    KW_PRECEDING98=(Token)match(input,KW_PRECEDING,FOLLOW_KW_PRECEDING_in_window_frame_start_boundary1350);  
                    stream_KW_PRECEDING.add(KW_PRECEDING98);


                    // AST REWRITE
                    // elements: Number, KW_PRECEDING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 213:23: -> ^( KW_PRECEDING Number )
                    {
                        // SelectClauseParser.g:213:26: ^( KW_PRECEDING Number )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_KW_PRECEDING.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_Number.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             gParent.msgs.pop(); 
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "window_frame_start_boundary"


    public static class window_frame_boundary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "window_frame_boundary"
    // SelectClauseParser.g:216:1: window_frame_boundary : ( KW_UNBOUNDED (r= KW_PRECEDING |r= KW_FOLLOWING ) -> ^( $r KW_UNBOUNDED ) | KW_CURRENT KW_ROW -> ^( KW_CURRENT ) | Number (d= KW_PRECEDING |d= KW_FOLLOWING ) -> ^( $d Number ) );
    public final HiveParser_SelectClauseParser.window_frame_boundary_return window_frame_boundary() throws RecognitionException {
        HiveParser_SelectClauseParser.window_frame_boundary_return retval = new HiveParser_SelectClauseParser.window_frame_boundary_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token r=null;
        Token d=null;
        Token KW_UNBOUNDED99=null;
        Token KW_CURRENT100=null;
        Token KW_ROW101=null;
        Token Number102=null;

        CommonTree r_tree=null;
        CommonTree d_tree=null;
        CommonTree KW_UNBOUNDED99_tree=null;
        CommonTree KW_CURRENT100_tree=null;
        CommonTree KW_ROW101_tree=null;
        CommonTree Number102_tree=null;
        RewriteRuleTokenStream stream_KW_PRECEDING=new RewriteRuleTokenStream(adaptor,"token KW_PRECEDING");
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
        RewriteRuleTokenStream stream_KW_FOLLOWING=new RewriteRuleTokenStream(adaptor,"token KW_FOLLOWING");
        RewriteRuleTokenStream stream_KW_CURRENT=new RewriteRuleTokenStream(adaptor,"token KW_CURRENT");
        RewriteRuleTokenStream stream_KW_ROW=new RewriteRuleTokenStream(adaptor,"token KW_ROW");
        RewriteRuleTokenStream stream_KW_UNBOUNDED=new RewriteRuleTokenStream(adaptor,"token KW_UNBOUNDED");

         gParent.msgs.push("windowframeboundary"); 
        try {
            // SelectClauseParser.g:219:3: ( KW_UNBOUNDED (r= KW_PRECEDING |r= KW_FOLLOWING ) -> ^( $r KW_UNBOUNDED ) | KW_CURRENT KW_ROW -> ^( KW_CURRENT ) | Number (d= KW_PRECEDING |d= KW_FOLLOWING ) -> ^( $d Number ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case KW_UNBOUNDED:
                {
                alt36=1;
                }
                break;
            case KW_CURRENT:
                {
                alt36=2;
                }
                break;
            case Number:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }

            switch (alt36) {
                case 1 :
                    // SelectClauseParser.g:220:3: KW_UNBOUNDED (r= KW_PRECEDING |r= KW_FOLLOWING )
                    {
                    KW_UNBOUNDED99=(Token)match(input,KW_UNBOUNDED,FOLLOW_KW_UNBOUNDED_in_window_frame_boundary1381);  
                    stream_KW_UNBOUNDED.add(KW_UNBOUNDED99);


                    // SelectClauseParser.g:220:16: (r= KW_PRECEDING |r= KW_FOLLOWING )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==KW_PRECEDING) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==KW_FOLLOWING) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;

                    }
                    switch (alt34) {
                        case 1 :
                            // SelectClauseParser.g:220:17: r= KW_PRECEDING
                            {
                            r=(Token)match(input,KW_PRECEDING,FOLLOW_KW_PRECEDING_in_window_frame_boundary1386);  
                            stream_KW_PRECEDING.add(r);


                            }
                            break;
                        case 2 :
                            // SelectClauseParser.g:220:32: r= KW_FOLLOWING
                            {
                            r=(Token)match(input,KW_FOLLOWING,FOLLOW_KW_FOLLOWING_in_window_frame_boundary1390);  
                            stream_KW_FOLLOWING.add(r);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: r, KW_UNBOUNDED
                    // token labels: r
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_r=new RewriteRuleTokenStream(adaptor,"token r",r);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 220:49: -> ^( $r KW_UNBOUNDED )
                    {
                        // SelectClauseParser.g:220:52: ^( $r KW_UNBOUNDED )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_r.nextNode(), root_1);

                        adaptor.addChild(root_1, 
                        stream_KW_UNBOUNDED.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // SelectClauseParser.g:221:3: KW_CURRENT KW_ROW
                    {
                    KW_CURRENT100=(Token)match(input,KW_CURRENT,FOLLOW_KW_CURRENT_in_window_frame_boundary1408);  
                    stream_KW_CURRENT.add(KW_CURRENT100);


                    KW_ROW101=(Token)match(input,KW_ROW,FOLLOW_KW_ROW_in_window_frame_boundary1410);  
                    stream_KW_ROW.add(KW_ROW101);


                    // AST REWRITE
                    // elements: KW_CURRENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 221:22: -> ^( KW_CURRENT )
                    {
                        // SelectClauseParser.g:221:25: ^( KW_CURRENT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_KW_CURRENT.nextNode()
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // SelectClauseParser.g:222:3: Number (d= KW_PRECEDING |d= KW_FOLLOWING )
                    {
                    Number102=(Token)match(input,Number,FOLLOW_Number_in_window_frame_boundary1423);  
                    stream_Number.add(Number102);


                    // SelectClauseParser.g:222:10: (d= KW_PRECEDING |d= KW_FOLLOWING )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==KW_PRECEDING) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==KW_FOLLOWING) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;

                    }
                    switch (alt35) {
                        case 1 :
                            // SelectClauseParser.g:222:11: d= KW_PRECEDING
                            {
                            d=(Token)match(input,KW_PRECEDING,FOLLOW_KW_PRECEDING_in_window_frame_boundary1428);  
                            stream_KW_PRECEDING.add(d);


                            }
                            break;
                        case 2 :
                            // SelectClauseParser.g:222:28: d= KW_FOLLOWING
                            {
                            d=(Token)match(input,KW_FOLLOWING,FOLLOW_KW_FOLLOWING_in_window_frame_boundary1434);  
                            stream_KW_FOLLOWING.add(d);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: d, Number
                    // token labels: d
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_d=new RewriteRuleTokenStream(adaptor,"token d",d);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 222:45: -> ^( $d Number )
                    {
                        // SelectClauseParser.g:222:48: ^( $d Number )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_d.nextNode(), root_1);

                        adaptor.addChild(root_1, 
                        stream_Number.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             gParent.msgs.pop(); 
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "window_frame_boundary"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA7_eotS =
        "\u0085\uffff";
    static final String DFA7_eofS =
        "\1\uffff\2\3\u0082\uffff";
    static final String DFA7_minS =
        "\1\32\2\12\23\uffff\1\7\44\uffff\1\7\111\uffff";
    static final String DFA7_maxS =
        "\1\u011b\2\u012a\23\uffff\1\u0132\44\uffff\1\u0132\111\uffff";
    static final String DFA7_acceptS =
        "\3\uffff\1\1\24\uffff\1\2\154\uffff";
    static final String DFA7_specialS =
        "\u0085\uffff}>";
    static final String[] DFA7_transitionS = {
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
            "\1\3\30\uffff\1\30\4\uffff\3\30\11\uffff\1\3\24\uffff\2\30"+
            "\1\uffff\1\30\13\uffff\1\3\1\30\25\uffff\1\30\4\uffff\1\3\4"+
            "\uffff\1\3\1\uffff\1\3\14\uffff\1\3\1\30\11\uffff\1\3\4\uffff"+
            "\1\3\11\uffff\1\26\17\uffff\1\3\33\uffff\1\3\1\uffff\1\3\12"+
            "\uffff\1\3\3\uffff\1\3\12\uffff\1\30\1\3\5\uffff\2\30\11\uffff"+
            "\2\30\11\uffff\1\3\1\30\17\uffff\1\3\1\uffff\1\3\17\uffff\1"+
            "\3",
            "\1\3\30\uffff\1\30\4\uffff\3\30\11\uffff\1\3\24\uffff\2\30"+
            "\1\uffff\1\30\13\uffff\1\3\1\30\25\uffff\1\30\4\uffff\1\3\4"+
            "\uffff\1\3\1\uffff\1\3\14\uffff\1\3\1\30\11\uffff\1\3\4\uffff"+
            "\1\3\11\uffff\1\73\17\uffff\1\3\33\uffff\1\3\1\uffff\1\3\12"+
            "\uffff\1\3\3\uffff\1\3\12\uffff\1\30\1\3\5\uffff\2\30\11\uffff"+
            "\2\30\11\uffff\1\3\1\30\17\uffff\1\3\1\uffff\1\3\17\uffff\1"+
            "\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\3\5\uffff\1\3\4\uffff\1\3\7\uffff\2\3\1\uffff\1\3\1\uffff"+
            "\2\3\1\uffff\21\3\1\uffff\3\3\1\uffff\1\3\1\uffff\4\3\1\uffff"+
            "\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\2\3\1\uffff\17\3\1\uffff"+
            "\2\3\1\uffff\2\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\3\1\uffff"+
            "\3\3\1\uffff\7\3\1\uffff\3\3\1\uffff\1\3\1\uffff\4\3\1\uffff"+
            "\17\3\2\uffff\3\3\1\uffff\5\3\1\uffff\12\3\1\uffff\4\3\1\uffff"+
            "\7\3\1\uffff\1\3\1\uffff\6\3\2\uffff\1\3\1\uffff\5\3\3\uffff"+
            "\2\3\1\uffff\12\3\1\uffff\16\3\1\uffff\23\3\1\uffff\2\3\1\uffff"+
            "\4\3\1\uffff\4\3\1\uffff\4\3\1\uffff\3\3\1\uffff\4\3\1\uffff"+
            "\7\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\30\1\uffff\2\3\1\uffff"+
            "\1\3\2\uffff\2\3\6\uffff\5\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\3\5\uffff\1\3\4\uffff\1\3\7\uffff\2\3\1\uffff\1\3\1\uffff"+
            "\2\3\1\uffff\21\3\1\uffff\3\3\1\uffff\1\3\1\uffff\4\3\1\uffff"+
            "\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\2\3\1\uffff\17\3\1\uffff"+
            "\2\3\1\uffff\2\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\3\1\uffff"+
            "\3\3\1\uffff\7\3\1\uffff\3\3\1\uffff\1\3\1\uffff\4\3\1\uffff"+
            "\17\3\2\uffff\3\3\1\uffff\5\3\1\uffff\12\3\1\uffff\4\3\1\uffff"+
            "\7\3\1\uffff\1\3\1\uffff\6\3\2\uffff\1\3\1\uffff\5\3\3\uffff"+
            "\2\3\1\uffff\12\3\1\uffff\16\3\1\uffff\23\3\1\uffff\2\3\1\uffff"+
            "\4\3\1\uffff\4\3\1\uffff\4\3\1\uffff\3\3\1\uffff\4\3\1\uffff"+
            "\7\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\30\1\uffff\2\3\1\uffff"+
            "\1\3\2\uffff\2\3\6\uffff\5\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "79:65: ( aliasList | columnNameTypeList )";
        }
    }
    static final String DFA17_eotS =
        "\u00e2\uffff";
    static final String DFA17_eofS =
        "\1\4\1\2\1\uffff\1\2\3\uffff\1\2\1\uffff\1\2\1\uffff\4\2\1\uffff"+
        "\2\2\u00d0\uffff";
    static final String DFA17_minS =
        "\2\12\1\uffff\1\12\3\uffff\1\12\1\uffff\1\12\1\uffff\4\12\1\uffff"+
        "\2\12\u00d0\uffff";
    static final String DFA17_maxS =
        "\2\u012a\1\uffff\1\u012a\3\uffff\1\u012a\1\uffff\1\u012a\1\uffff"+
        "\4\u012a\1\uffff\2\u012a\u00d0\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\1\1\uffff\1\3\22\uffff\1\2\u00ca\uffff";
    static final String DFA17_specialS =
        "\u00e2\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\4\17\uffff\2\2\1\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\1\13"+
            "\2\2\uffff\1\2\1\uffff\1\13\2\2\1\uffff\1\2\1\uffff\4\2\1\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\2\2\1\uffff\16\2\2\uffff"+
            "\1\14\1\2\1\uffff\2\2\1\uffff\1\2\2\uffff\1\2\1\uffff\1\2\1"+
            "\uffff\3\2\1\uffff\7\2\1\uffff\3\2\1\4\1\2\1\uffff\2\2\1\7\1"+
            "\2\1\4\2\2\1\uffff\11\2\1\21\2\2\2\uffff\3\2\1\uffff\2\2\1\3"+
            "\1\2\2\uffff\1\2\1\16\10\2\1\uffff\1\4\3\2\1\uffff\2\2\1\uffff"+
            "\4\2\1\uffff\1\2\1\uffff\1\2\1\11\4\2\2\uffff\1\2\1\uffff\5"+
            "\2\3\uffff\2\2\1\uffff\12\2\1\4\16\2\1\4\13\2\1\15\7\2\1\uffff"+
            "\2\2\1\uffff\4\2\1\uffff\4\2\1\uffff\4\2\1\uffff\1\2\1\20\1"+
            "\2\1\uffff\4\2\1\uffff\7\2\2\uffff\1\4\1\2\1\4\1\2\16\uffff"+
            "\1\4",
            "\1\2\17\uffff\2\2\1\uffff\1\2\1\uffff\2\2\1\uffff\16\2\2\uffff"+
            "\1\2\1\uffff\3\2\1\uffff\1\2\1\uffff\4\2\1\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\2\2\1\uffff\16\2\2\uffff\2\2\1\uffff"+
            "\2\2\1\uffff\1\2\2\uffff\1\2\1\uffff\1\2\1\uffff\3\2\1\uffff"+
            "\7\2\1\uffff\5\2\1\uffff\7\2\1\uffff\14\2\2\uffff\3\2\1\uffff"+
            "\4\2\2\uffff\12\2\1\uffff\4\2\1\uffff\2\2\1\uffff\4\2\1\uffff"+
            "\1\2\1\uffff\6\2\2\uffff\1\2\1\uffff\5\2\3\uffff\2\2\1\uffff"+
            "\55\2\1\uffff\2\2\1\uffff\4\2\1\uffff\4\2\1\uffff\4\2\1\uffff"+
            "\3\2\1\uffff\4\2\1\uffff\7\2\2\uffff\4\2\4\uffff\1\27\11\uffff"+
            "\1\2",
            "",
            "\1\2\51\uffff\1\2\43\uffff\1\2\33\uffff\1\2\4\uffff\1\2\1\uffff"+
            "\1\2\14\uffff\1\2\12\uffff\1\2\4\uffff\1\2\11\uffff\1\2\17\uffff"+
            "\1\2\35\uffff\1\2\16\uffff\1\2\13\uffff\1\2\33\uffff\1\2\15"+
            "\uffff\1\4\2\uffff\1\2\1\uffff\1\2\17\uffff\1\2",
            "",
            "",
            "",
            "\1\2\43\uffff\1\4\5\uffff\1\2\43\uffff\1\2\33\uffff\1\2\4\uffff"+
            "\1\2\1\uffff\1\2\14\uffff\1\2\12\uffff\1\2\4\uffff\1\2\11\uffff"+
            "\1\2\17\uffff\1\2\35\uffff\1\2\16\uffff\1\2\13\uffff\1\2\33"+
            "\uffff\1\2\20\uffff\1\2\1\uffff\1\2\17\uffff\1\2",
            "",
            "\1\2\43\uffff\1\4\5\uffff\1\2\43\uffff\1\2\33\uffff\1\2\4\uffff"+
            "\1\2\1\uffff\1\2\14\uffff\1\2\12\uffff\1\2\4\uffff\1\2\11\uffff"+
            "\1\2\17\uffff\1\2\35\uffff\1\2\16\uffff\1\2\13\uffff\1\2\33"+
            "\uffff\1\2\20\uffff\1\2\1\uffff\1\2\17\uffff\1\2",
            "",
            "\1\2\43\uffff\1\4\5\uffff\1\2\43\uffff\1\2\33\uffff\1\2\4\uffff"+
            "\1\2\1\uffff\1\2\14\uffff\1\2\12\uffff\1\2\4\uffff\1\2\11\uffff"+
            "\1\2\17\uffff\1\2\35\uffff\1\2\16\uffff\1\2\13\uffff\1\2\33"+
            "\uffff\1\2\20\uffff\1\2\1\uffff\1\2\17\uffff\1\2",
            "\1\2\43\uffff\1\4\5\uffff\1\2\43\uffff\1\2\33\uffff\1\2\4\uffff"+
            "\1\2\1\uffff\1\2\14\uffff\1\2\12\uffff\1\2\4\uffff\1\2\11\uffff"+
            "\1\2\17\uffff\1\2\35\uffff\1\2\16\uffff\1\2\13\uffff\1\2\33"+
            "\uffff\1\2\20\uffff\1\2\1\uffff\1\2\17\uffff\1\2",
            "\1\2\43\uffff\1\4\5\uffff\1\2\43\uffff\1\2\33\uffff\1\2\4\uffff"+
            "\1\2\1\uffff\1\2\14\uffff\1\2\12\uffff\1\2\4\uffff\1\2\11\uffff"+
            "\1\2\17\uffff\1\2\35\uffff\1\2\16\uffff\1\2\13\uffff\1\2\33"+
            "\uffff\1\2\20\uffff\1\2\1\uffff\1\2\17\uffff\1\2",
            "\1\2\51\uffff\1\2\43\uffff\1\2\33\uffff\1\2\4\uffff\1\2\1\uffff"+
            "\1\2\14\uffff\1\2\12\uffff\1\2\4\uffff\1\2\11\uffff\1\2\17\uffff"+
            "\1\2\35\uffff\1\2\16\uffff\1\2\13\uffff\1\2\33\uffff\1\2\20"+
            "\uffff\1\2\1\uffff\1\2\13\uffff\1\4\3\uffff\1\2",
            "",
            "\1\2\23\uffff\1\4\25\uffff\1\2\43\uffff\1\2\33\uffff\1\2\4"+
            "\uffff\1\2\1\uffff\1\2\14\uffff\1\2\12\uffff\1\2\4\uffff\1\2"+
            "\11\uffff\1\2\17\uffff\1\2\35\uffff\1\2\16\uffff\1\2\13\uffff"+
            "\1\2\33\uffff\1\2\20\uffff\1\2\1\uffff\1\2\17\uffff\1\2",
            "\1\2\51\uffff\1\2\43\uffff\1\2\33\uffff\1\2\4\uffff\1\2\1\uffff"+
            "\1\2\14\uffff\1\2\4\uffff\1\4\5\uffff\1\2\4\uffff\1\2\11\uffff"+
            "\1\2\17\uffff\1\2\6\uffff\1\4\26\uffff\1\2\16\uffff\1\2\13\uffff"+
            "\1\2\33\uffff\1\2\20\uffff\1\2\1\uffff\1\2\17\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "133:7: ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )?";
        }
    }
    static final String DFA15_eotS =
        "\u00ce\uffff";
    static final String DFA15_eofS =
        "\1\uffff\1\2\3\uffff\1\4\3\uffff\1\4\1\uffff\1\4\1\uffff\4\4\1\uffff"+
        "\2\4\u00ba\uffff";
    static final String DFA15_minS =
        "\1\32\1\12\3\uffff\1\12\3\uffff\1\12\1\uffff\1\12\1\uffff\4\12\1"+
        "\uffff\2\12\u00ba\uffff";
    static final String DFA15_maxS =
        "\1\u011b\1\u012a\3\uffff\1\u012a\3\uffff\1\u012a\1\uffff\1\u012a"+
        "\1\uffff\4\u012a\1\uffff\2\u012a\u00ba\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\u00c9\uffff";
    static final String DFA15_specialS =
        "\u00ce\uffff}>";
    static final String[] DFA15_transitionS = {
            "\2\2\1\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\1\13\2\2\uffff\1"+
            "\2\1\uffff\3\2\1\uffff\1\2\1\uffff\4\2\1\uffff\1\2\1\uffff\1"+
            "\2\1\uffff\1\2\1\uffff\2\2\1\uffff\16\2\2\uffff\2\2\1\uffff"+
            "\2\2\1\uffff\1\2\2\uffff\1\2\1\uffff\1\2\1\uffff\3\2\1\uffff"+
            "\7\2\1\uffff\3\2\1\uffff\1\2\1\uffff\4\2\1\uffff\2\2\1\uffff"+
            "\14\2\2\uffff\3\2\1\uffff\4\2\2\uffff\12\2\2\uffff\3\2\1\uffff"+
            "\2\2\1\uffff\4\2\1\uffff\1\2\1\uffff\6\2\2\uffff\1\2\1\uffff"+
            "\5\2\3\uffff\2\2\1\uffff\12\2\1\uffff\16\2\1\uffff\23\2\1\uffff"+
            "\2\2\1\uffff\4\2\1\uffff\4\2\1\uffff\4\2\1\uffff\3\2\1\uffff"+
            "\4\2\1\uffff\7\2\3\uffff\1\2\1\uffff\1\2",
            "\1\2\17\uffff\2\4\1\uffff\1\4\1\uffff\2\4\1\uffff\16\4\2\uffff"+
            "\1\4\1\uffff\1\15\2\4\1\uffff\1\4\1\uffff\4\4\1\uffff\1\4\1"+
            "\uffff\1\4\1\uffff\1\4\1\uffff\2\4\1\uffff\16\4\2\uffff\1\16"+
            "\1\4\1\uffff\2\4\1\uffff\1\4\2\uffff\1\4\1\uffff\1\4\1\uffff"+
            "\3\4\1\uffff\7\4\1\uffff\3\4\1\2\1\4\1\uffff\2\4\1\11\1\4\1"+
            "\2\2\4\1\uffff\11\4\1\23\2\4\2\uffff\3\4\1\uffff\2\4\1\5\1\4"+
            "\2\uffff\1\4\1\20\10\4\1\uffff\1\2\3\4\1\uffff\2\4\1\uffff\4"+
            "\4\1\uffff\1\4\1\uffff\1\4\1\13\4\4\2\uffff\1\4\1\uffff\5\4"+
            "\3\uffff\2\4\1\uffff\12\4\1\2\16\4\1\2\13\4\1\17\7\4\1\uffff"+
            "\2\4\1\uffff\4\4\1\uffff\4\4\1\uffff\4\4\1\uffff\1\4\1\22\1"+
            "\4\1\uffff\4\4\1\uffff\7\4\2\uffff\1\2\1\4\1\2\1\4\16\uffff"+
            "\1\2",
            "",
            "",
            "",
            "\1\4\51\uffff\1\4\43\uffff\1\4\33\uffff\1\4\4\uffff\1\4\1\uffff"+
            "\1\4\14\uffff\1\4\12\uffff\1\4\4\uffff\1\4\11\uffff\1\4\17\uffff"+
            "\1\4\35\uffff\1\4\16\uffff\1\4\13\uffff\1\4\33\uffff\1\4\15"+
            "\uffff\1\2\2\uffff\1\4\1\uffff\1\4\17\uffff\1\4",
            "",
            "",
            "",
            "\1\4\43\uffff\1\2\5\uffff\1\4\43\uffff\1\4\33\uffff\1\4\4\uffff"+
            "\1\4\1\uffff\1\4\14\uffff\1\4\12\uffff\1\4\4\uffff\1\4\11\uffff"+
            "\1\4\17\uffff\1\4\35\uffff\1\4\16\uffff\1\4\13\uffff\1\4\33"+
            "\uffff\1\4\20\uffff\1\4\1\uffff\1\4\17\uffff\1\4",
            "",
            "\1\4\43\uffff\1\2\5\uffff\1\4\43\uffff\1\4\33\uffff\1\4\4\uffff"+
            "\1\4\1\uffff\1\4\14\uffff\1\4\12\uffff\1\4\4\uffff\1\4\11\uffff"+
            "\1\4\17\uffff\1\4\35\uffff\1\4\16\uffff\1\4\13\uffff\1\4\33"+
            "\uffff\1\4\20\uffff\1\4\1\uffff\1\4\17\uffff\1\4",
            "",
            "\1\4\43\uffff\1\2\5\uffff\1\4\43\uffff\1\4\33\uffff\1\4\4\uffff"+
            "\1\4\1\uffff\1\4\14\uffff\1\4\12\uffff\1\4\4\uffff\1\4\11\uffff"+
            "\1\4\17\uffff\1\4\35\uffff\1\4\16\uffff\1\4\13\uffff\1\4\33"+
            "\uffff\1\4\20\uffff\1\4\1\uffff\1\4\17\uffff\1\4",
            "\1\4\43\uffff\1\2\5\uffff\1\4\43\uffff\1\4\33\uffff\1\4\4\uffff"+
            "\1\4\1\uffff\1\4\14\uffff\1\4\12\uffff\1\4\4\uffff\1\4\11\uffff"+
            "\1\4\17\uffff\1\4\35\uffff\1\4\16\uffff\1\4\13\uffff\1\4\33"+
            "\uffff\1\4\20\uffff\1\4\1\uffff\1\4\17\uffff\1\4",
            "\1\4\43\uffff\1\2\5\uffff\1\4\43\uffff\1\4\33\uffff\1\4\4\uffff"+
            "\1\4\1\uffff\1\4\14\uffff\1\4\12\uffff\1\4\4\uffff\1\4\11\uffff"+
            "\1\4\17\uffff\1\4\35\uffff\1\4\16\uffff\1\4\13\uffff\1\4\33"+
            "\uffff\1\4\20\uffff\1\4\1\uffff\1\4\17\uffff\1\4",
            "\1\4\51\uffff\1\4\43\uffff\1\4\33\uffff\1\4\4\uffff\1\4\1\uffff"+
            "\1\4\14\uffff\1\4\12\uffff\1\4\4\uffff\1\4\11\uffff\1\4\17\uffff"+
            "\1\4\35\uffff\1\4\16\uffff\1\4\13\uffff\1\4\33\uffff\1\4\20"+
            "\uffff\1\4\1\uffff\1\4\13\uffff\1\2\3\uffff\1\4",
            "",
            "\1\4\23\uffff\1\2\25\uffff\1\4\43\uffff\1\4\33\uffff\1\4\4"+
            "\uffff\1\4\1\uffff\1\4\14\uffff\1\4\12\uffff\1\4\4\uffff\1\4"+
            "\11\uffff\1\4\17\uffff\1\4\35\uffff\1\4\16\uffff\1\4\13\uffff"+
            "\1\4\33\uffff\1\4\20\uffff\1\4\1\uffff\1\4\17\uffff\1\4",
            "\1\4\51\uffff\1\4\43\uffff\1\4\33\uffff\1\4\4\uffff\1\4\1\uffff"+
            "\1\4\14\uffff\1\4\4\uffff\1\2\5\uffff\1\4\4\uffff\1\4\11\uffff"+
            "\1\4\17\uffff\1\4\6\uffff\1\2\26\uffff\1\4\16\uffff\1\4\13\uffff"+
            "\1\4\33\uffff\1\4\20\uffff\1\4\1\uffff\1\4\17\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "133:9: ( KW_AS )?";
        }
    }
    static final String DFA20_eotS =
        "\u0085\uffff";
    static final String DFA20_eofS =
        "\1\uffff\2\3\u0082\uffff";
    static final String DFA20_minS =
        "\1\32\2\12\23\uffff\1\7\44\uffff\1\7\111\uffff";
    static final String DFA20_maxS =
        "\1\u011b\2\u012a\23\uffff\1\u0132\44\uffff\1\u0132\111\uffff";
    static final String DFA20_acceptS =
        "\3\uffff\1\1\24\uffff\1\2\154\uffff";
    static final String DFA20_specialS =
        "\u0085\uffff}>";
    static final String[] DFA20_transitionS = {
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
            "\1\3\30\uffff\1\30\4\uffff\3\30\11\uffff\1\3\24\uffff\2\30"+
            "\1\uffff\1\30\13\uffff\1\3\1\30\25\uffff\1\30\4\uffff\1\3\4"+
            "\uffff\1\3\1\uffff\1\3\14\uffff\1\3\1\30\11\uffff\1\3\4\uffff"+
            "\1\3\11\uffff\1\26\17\uffff\1\3\33\uffff\1\3\1\uffff\1\3\12"+
            "\uffff\1\3\3\uffff\1\3\12\uffff\1\30\1\3\5\uffff\2\30\11\uffff"+
            "\2\30\11\uffff\1\3\1\30\17\uffff\1\3\1\uffff\1\3\17\uffff\1"+
            "\3",
            "\1\3\30\uffff\1\30\4\uffff\3\30\11\uffff\1\3\24\uffff\2\30"+
            "\1\uffff\1\30\13\uffff\1\3\1\30\25\uffff\1\30\4\uffff\1\3\4"+
            "\uffff\1\3\1\uffff\1\3\14\uffff\1\3\1\30\11\uffff\1\3\4\uffff"+
            "\1\3\11\uffff\1\73\17\uffff\1\3\33\uffff\1\3\1\uffff\1\3\12"+
            "\uffff\1\3\3\uffff\1\3\12\uffff\1\30\1\3\5\uffff\2\30\11\uffff"+
            "\2\30\11\uffff\1\3\1\30\17\uffff\1\3\1\uffff\1\3\17\uffff\1"+
            "\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\3\5\uffff\1\3\4\uffff\1\3\7\uffff\2\3\1\uffff\1\3\1\uffff"+
            "\2\3\1\uffff\21\3\1\uffff\3\3\1\uffff\1\3\1\uffff\4\3\1\uffff"+
            "\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\2\3\1\uffff\17\3\1\uffff"+
            "\2\3\1\uffff\2\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\3\1\uffff"+
            "\3\3\1\uffff\7\3\1\uffff\3\3\1\uffff\1\3\1\uffff\4\3\1\uffff"+
            "\17\3\2\uffff\3\3\1\uffff\5\3\1\uffff\12\3\1\uffff\4\3\1\uffff"+
            "\7\3\1\uffff\1\3\1\uffff\6\3\2\uffff\1\3\1\uffff\5\3\3\uffff"+
            "\2\3\1\uffff\12\3\1\uffff\16\3\1\uffff\23\3\1\uffff\2\3\1\uffff"+
            "\4\3\1\uffff\4\3\1\uffff\4\3\1\uffff\3\3\1\uffff\4\3\1\uffff"+
            "\7\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\30\1\uffff\2\3\1\uffff"+
            "\1\3\2\uffff\2\3\6\uffff\5\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\3\5\uffff\1\3\4\uffff\1\3\7\uffff\2\3\1\uffff\1\3\1\uffff"+
            "\2\3\1\uffff\21\3\1\uffff\3\3\1\uffff\1\3\1\uffff\4\3\1\uffff"+
            "\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\2\3\1\uffff\17\3\1\uffff"+
            "\2\3\1\uffff\2\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\3\1\uffff"+
            "\3\3\1\uffff\7\3\1\uffff\3\3\1\uffff\1\3\1\uffff\4\3\1\uffff"+
            "\17\3\2\uffff\3\3\1\uffff\5\3\1\uffff\12\3\1\uffff\4\3\1\uffff"+
            "\7\3\1\uffff\1\3\1\uffff\6\3\2\uffff\1\3\1\uffff\5\3\3\uffff"+
            "\2\3\1\uffff\12\3\1\uffff\16\3\1\uffff\23\3\1\uffff\2\3\1\uffff"+
            "\4\3\1\uffff\4\3\1\uffff\4\3\1\uffff\3\3\1\uffff\4\3\1\uffff"+
            "\7\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\30\1\uffff\2\3\1\uffff"+
            "\1\3\2\uffff\2\3\6\uffff\5\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "145:65: ( aliasList | columnNameTypeList )";
        }
    }
    static final String DFA23_eotS =
        "\u0203\uffff";
    static final String DFA23_eofS =
        "\3\uffff\2\1\7\uffff\2\1\1\uffff\1\1\1\uffff\4\1\u01ee\uffff";
    static final String DFA23_minS =
        "\1\7\2\uffff\2\4\7\uffff\2\4\1\uffff\1\4\1\uffff\4\4\10\uffff\1"+
        "\32\64\uffff\1\32\57\uffff\1\32\61\uffff\1\32\63\uffff\1\32\61\uffff"+
        "\1\32\61\uffff\1\32\61\uffff\1\32\61\uffff\1\32\122\uffff";
    static final String DFA23_maxS =
        "\1\u0132\2\uffff\1\u012e\1\u0130\7\uffff\2\u012e\1\uffff\1\u012e"+
        "\1\uffff\4\u012e\10\uffff\1\u012e\64\uffff\1\u012e\57\uffff\1\u012e"+
        "\61\uffff\1\u012e\63\uffff\1\u012e\61\uffff\1\u012e\61\uffff\1\u012e"+
        "\61\uffff\1\u012e\61\uffff\1\u012e\122\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\31\uffff\1\2\u01c5\uffff\2\1\2\uffff\2\1\2\uffff\2"+
        "\1\2\uffff\2\1\2\uffff\2\1\2\uffff\2\1\2\uffff\2\1\2\uffff\2\1\2"+
        "\uffff\2\1";
    static final String DFA23_specialS =
        "\u0203\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\1\5\uffff\1\1\4\uffff\1\1\7\uffff\1\23\1\24\1\uffff\1\24"+
            "\1\uffff\2\24\1\uffff\1\24\1\17\14\24\2\1\1\24\1\uffff\3\24"+
            "\1\uffff\1\24\1\uffff\4\24\1\uffff\1\24\1\uffff\1\24\1\uffff"+
            "\1\24\1\uffff\2\24\1\uffff\1\24\1\4\14\24\1\1\1\uffff\2\24\1"+
            "\uffff\2\24\1\uffff\1\24\2\uffff\1\24\1\uffff\1\24\1\uffff\3"+
            "\24\1\uffff\1\24\1\15\5\24\1\uffff\3\24\1\uffff\1\24\1\uffff"+
            "\4\24\1\uffff\2\24\1\1\14\24\2\uffff\3\24\1\uffff\4\24\1\1\1"+
            "\uffff\12\24\1\uffff\1\1\3\24\1\uffff\2\24\1\1\1\24\1\3\2\24"+
            "\1\uffff\1\24\1\uffff\6\24\2\uffff\1\24\1\uffff\5\24\3\uffff"+
            "\2\24\1\uffff\12\24\1\uffff\16\24\1\uffff\22\24\1\21\1\uffff"+
            "\2\24\1\uffff\4\24\1\uffff\4\24\1\uffff\1\24\1\14\2\24\1\uffff"+
            "\2\24\1\22\1\uffff\4\24\1\uffff\7\24\3\uffff\1\24\1\uffff\1"+
            "\24\4\uffff\2\1\1\uffff\1\1\2\uffff\2\1\6\uffff\1\33\4\1",
            "",
            "",
            "\3\1\3\uffff\1\1\3\uffff\2\1\1\uffff\1\35\2\uffff\2\1\1\uffff"+
            "\2\1\1\uffff\2\1\1\uffff\1\1\1\uffff\21\1\2\uffff\1\1\1\uffff"+
            "\3\1\1\uffff\1\1\1\uffff\6\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\16\1\2\uffff\2\1\1\uffff\2\1\1\uffff\1\1\2\uffff"+
            "\1\1\1\uffff\1\1\1\uffff\3\1\1\uffff\7\1\1\uffff\5\1\1\uffff"+
            "\7\1\1\uffff\14\1\2\uffff\3\1\1\uffff\4\1\2\uffff\12\1\1\uffff"+
            "\4\1\1\uffff\7\1\1\uffff\13\1\1\uffff\5\1\3\uffff\2\1\1\uffff"+
            "\55\1\1\uffff\2\1\1\uffff\4\1\1\uffff\4\1\1\uffff\4\1\1\uffff"+
            "\3\1\1\uffff\4\1\1\uffff\7\1\2\uffff\4\1\2\uffff\4\1\1\uffff"+
            "\3\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1",
            "\3\1\3\uffff\1\1\3\uffff\2\1\1\uffff\1\122\2\uffff\2\1\1\uffff"+
            "\2\1\1\uffff\2\1\1\uffff\1\1\1\uffff\21\1\2\uffff\1\1\1\uffff"+
            "\3\1\1\uffff\1\1\1\uffff\6\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\16\1\2\uffff\2\1\1\uffff\2\1\1\uffff\1\1\2\uffff"+
            "\1\1\1\uffff\1\1\1\uffff\3\1\1\uffff\7\1\1\uffff\5\1\1\uffff"+
            "\7\1\1\uffff\14\1\2\uffff\3\1\1\uffff\4\1\2\uffff\12\1\1\uffff"+
            "\4\1\1\uffff\7\1\1\uffff\13\1\1\uffff\5\1\3\uffff\2\1\1\uffff"+
            "\55\1\1\uffff\2\1\1\uffff\4\1\1\uffff\4\1\1\uffff\4\1\1\uffff"+
            "\3\1\1\uffff\4\1\1\uffff\7\1\2\uffff\4\1\2\uffff\4\1\1\uffff"+
            "\3\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1\1\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\1\3\uffff\1\1\3\uffff\2\1\1\uffff\1\u0082\2\uffff\2\1\1"+
            "\uffff\2\1\1\uffff\2\1\1\uffff\1\1\1\uffff\21\1\2\uffff\1\1"+
            "\1\uffff\3\1\1\uffff\1\1\1\uffff\6\1\1\uffff\1\1\1\uffff\1\1"+
            "\1\uffff\2\1\1\uffff\16\1\2\uffff\2\1\1\uffff\2\1\1\uffff\1"+
            "\1\2\uffff\1\1\1\uffff\1\1\1\uffff\3\1\1\uffff\7\1\1\uffff\5"+
            "\1\1\uffff\7\1\1\uffff\14\1\2\uffff\3\1\1\uffff\4\1\2\uffff"+
            "\12\1\1\uffff\4\1\1\uffff\7\1\1\uffff\13\1\1\uffff\5\1\3\uffff"+
            "\2\1\1\uffff\55\1\1\uffff\2\1\1\uffff\4\1\1\uffff\4\1\1\uffff"+
            "\4\1\1\uffff\3\1\1\uffff\4\1\1\uffff\7\1\2\uffff\4\1\2\uffff"+
            "\4\1\1\uffff\3\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1",
            "\3\1\3\uffff\1\1\3\uffff\2\1\1\uffff\1\u00b4\2\uffff\2\1\1"+
            "\uffff\2\1\1\uffff\2\1\1\uffff\1\1\1\uffff\21\1\2\uffff\1\1"+
            "\1\uffff\3\1\1\uffff\1\1\1\uffff\6\1\1\uffff\1\1\1\uffff\1\1"+
            "\1\uffff\2\1\1\uffff\16\1\2\uffff\2\1\1\uffff\2\1\1\uffff\1"+
            "\1\2\uffff\1\1\1\uffff\1\1\1\uffff\3\1\1\uffff\7\1\1\uffff\5"+
            "\1\1\uffff\7\1\1\uffff\14\1\2\uffff\3\1\1\uffff\4\1\2\uffff"+
            "\12\1\1\uffff\4\1\1\uffff\7\1\1\uffff\13\1\1\uffff\5\1\3\uffff"+
            "\2\1\1\uffff\55\1\1\uffff\2\1\1\uffff\4\1\1\uffff\4\1\1\uffff"+
            "\4\1\1\uffff\3\1\1\uffff\4\1\1\uffff\7\1\2\uffff\4\1\2\uffff"+
            "\4\1\1\uffff\3\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1",
            "",
            "\3\1\3\uffff\1\1\3\uffff\2\1\1\uffff\1\u00e8\2\uffff\2\1\1"+
            "\uffff\2\1\1\uffff\2\1\1\uffff\1\1\1\uffff\21\1\2\uffff\1\1"+
            "\1\uffff\3\1\1\uffff\1\1\1\uffff\6\1\1\uffff\1\1\1\uffff\1\1"+
            "\1\uffff\2\1\1\uffff\16\1\2\uffff\2\1\1\uffff\2\1\1\uffff\1"+
            "\1\2\uffff\1\1\1\uffff\1\1\1\uffff\3\1\1\uffff\7\1\1\uffff\5"+
            "\1\1\uffff\7\1\1\uffff\14\1\2\uffff\3\1\1\uffff\4\1\2\uffff"+
            "\12\1\1\uffff\4\1\1\uffff\7\1\1\uffff\13\1\1\uffff\5\1\3\uffff"+
            "\2\1\1\uffff\55\1\1\uffff\2\1\1\uffff\4\1\1\uffff\4\1\1\uffff"+
            "\4\1\1\uffff\3\1\1\uffff\4\1\1\uffff\7\1\2\uffff\4\1\2\uffff"+
            "\4\1\1\uffff\3\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1",
            "",
            "\3\1\3\uffff\1\1\3\uffff\2\1\1\uffff\1\u011a\2\uffff\2\1\1"+
            "\uffff\2\1\1\uffff\2\1\1\uffff\1\1\1\uffff\21\1\2\uffff\1\1"+
            "\1\uffff\3\1\1\uffff\1\1\1\uffff\6\1\1\uffff\1\1\1\uffff\1\1"+
            "\1\uffff\2\1\1\uffff\16\1\2\uffff\2\1\1\uffff\2\1\1\uffff\1"+
            "\1\2\uffff\1\1\1\uffff\1\1\1\uffff\3\1\1\uffff\7\1\1\uffff\5"+
            "\1\1\uffff\7\1\1\uffff\14\1\2\uffff\3\1\1\uffff\4\1\2\uffff"+
            "\12\1\1\uffff\4\1\1\uffff\7\1\1\uffff\13\1\1\uffff\5\1\3\uffff"+
            "\2\1\1\uffff\55\1\1\uffff\2\1\1\uffff\4\1\1\uffff\4\1\1\uffff"+
            "\4\1\1\uffff\3\1\1\uffff\4\1\1\uffff\7\1\2\uffff\4\1\2\uffff"+
            "\4\1\1\uffff\3\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1",
            "\3\1\3\uffff\1\1\3\uffff\2\1\1\uffff\1\u014c\2\uffff\2\1\1"+
            "\uffff\2\1\1\uffff\2\1\1\uffff\1\1\1\uffff\21\1\2\uffff\1\1"+
            "\1\uffff\3\1\1\uffff\1\1\1\uffff\6\1\1\uffff\1\1\1\uffff\1\1"+
            "\1\uffff\2\1\1\uffff\16\1\2\uffff\2\1\1\uffff\2\1\1\uffff\1"+
            "\1\2\uffff\1\1\1\uffff\1\1\1\uffff\3\1\1\uffff\7\1\1\uffff\5"+
            "\1\1\uffff\7\1\1\uffff\14\1\2\uffff\3\1\1\uffff\4\1\2\uffff"+
            "\12\1\1\uffff\4\1\1\uffff\7\1\1\uffff\13\1\1\uffff\5\1\3\uffff"+
            "\2\1\1\uffff\55\1\1\uffff\2\1\1\uffff\4\1\1\uffff\4\1\1\uffff"+
            "\4\1\1\uffff\3\1\1\uffff\4\1\1\uffff\7\1\2\uffff\4\1\2\uffff"+
            "\4\1\1\uffff\3\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1",
            "\3\1\3\uffff\1\1\3\uffff\2\1\1\uffff\1\u017e\2\uffff\2\1\1"+
            "\uffff\2\1\1\uffff\2\1\1\uffff\1\1\1\uffff\21\1\2\uffff\1\1"+
            "\1\uffff\3\1\1\uffff\1\1\1\uffff\6\1\1\uffff\1\1\1\uffff\1\1"+
            "\1\uffff\2\1\1\uffff\16\1\2\uffff\2\1\1\uffff\2\1\1\uffff\1"+
            "\1\2\uffff\1\1\1\uffff\1\1\1\uffff\3\1\1\uffff\7\1\1\uffff\5"+
            "\1\1\uffff\7\1\1\uffff\14\1\2\uffff\3\1\1\uffff\4\1\2\uffff"+
            "\12\1\1\uffff\4\1\1\uffff\7\1\1\uffff\13\1\1\uffff\5\1\3\uffff"+
            "\2\1\1\uffff\55\1\1\uffff\2\1\1\uffff\4\1\1\uffff\4\1\1\uffff"+
            "\4\1\1\uffff\3\1\1\uffff\4\1\1\uffff\7\1\2\uffff\4\1\2\uffff"+
            "\4\1\1\uffff\3\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1",
            "\3\1\3\uffff\1\1\3\uffff\2\1\1\uffff\1\u01b0\2\uffff\2\1\1"+
            "\uffff\2\1\1\uffff\2\1\1\uffff\1\1\1\uffff\21\1\2\uffff\1\1"+
            "\1\uffff\3\1\1\uffff\1\1\1\uffff\6\1\1\uffff\1\1\1\uffff\1\1"+
            "\1\uffff\2\1\1\uffff\16\1\2\uffff\2\1\1\uffff\2\1\1\uffff\1"+
            "\1\2\uffff\1\1\1\uffff\1\1\1\uffff\3\1\1\uffff\7\1\1\uffff\5"+
            "\1\1\uffff\7\1\1\uffff\14\1\2\uffff\3\1\1\uffff\4\1\2\uffff"+
            "\12\1\1\uffff\4\1\1\uffff\7\1\1\uffff\13\1\1\uffff\5\1\3\uffff"+
            "\2\1\1\uffff\55\1\1\uffff\2\1\1\uffff\4\1\1\uffff\4\1\1\uffff"+
            "\4\1\1\uffff\3\1\1\uffff\4\1\1\uffff\7\1\2\uffff\4\1\2\uffff"+
            "\4\1\1\uffff\3\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01e1\1\u01e2\1\uffff\1\u01e2\1\uffff\2\u01e2\1\uffff\16"+
            "\u01e2\2\uffff\1\u01e2\1\uffff\3\u01e2\1\uffff\1\u01e2\1\uffff"+
            "\4\u01e2\1\uffff\1\u01e2\1\uffff\1\u01e2\1\uffff\1\u01e2\1\uffff"+
            "\2\u01e2\1\uffff\16\u01e2\2\uffff\2\u01e2\1\uffff\2\u01e2\1"+
            "\uffff\1\u01e2\2\uffff\1\u01e2\1\uffff\1\u01e2\1\uffff\3\u01e2"+
            "\1\uffff\7\u01e2\1\uffff\3\u01e2\1\uffff\1\u01e2\1\uffff\4\u01e2"+
            "\1\uffff\2\u01e2\1\uffff\14\u01e2\1\uffff\1\1\3\u01e2\1\uffff"+
            "\4\u01e2\2\uffff\12\u01e2\2\uffff\3\u01e2\1\uffff\2\u01e2\1"+
            "\uffff\4\u01e2\1\uffff\1\u01e2\1\uffff\6\u01e2\2\uffff\1\u01e2"+
            "\1\uffff\5\u01e2\3\uffff\2\u01e2\1\uffff\12\u01e2\1\uffff\16"+
            "\u01e2\1\uffff\23\u01e2\1\uffff\2\u01e2\1\uffff\4\u01e2\1\uffff"+
            "\4\u01e2\1\uffff\4\u01e2\1\uffff\3\u01e2\1\uffff\4\u01e2\1\uffff"+
            "\7\u01e2\3\uffff\1\u01e2\1\uffff\1\u01e2\22\uffff\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01e5\1\u01e6\1\uffff\1\u01e6\1\uffff\2\u01e6\1\uffff\16"+
            "\u01e6\2\uffff\1\u01e6\1\uffff\3\u01e6\1\uffff\1\u01e6\1\uffff"+
            "\4\u01e6\1\uffff\1\u01e6\1\uffff\1\u01e6\1\uffff\1\u01e6\1\uffff"+
            "\2\u01e6\1\uffff\16\u01e6\2\uffff\2\u01e6\1\uffff\2\u01e6\1"+
            "\uffff\1\u01e6\2\uffff\1\u01e6\1\uffff\1\u01e6\1\uffff\3\u01e6"+
            "\1\uffff\7\u01e6\1\uffff\3\u01e6\1\uffff\1\u01e6\1\uffff\4\u01e6"+
            "\1\uffff\2\u01e6\1\uffff\14\u01e6\1\uffff\1\1\3\u01e6\1\uffff"+
            "\4\u01e6\2\uffff\12\u01e6\2\uffff\3\u01e6\1\uffff\2\u01e6\1"+
            "\uffff\4\u01e6\1\uffff\1\u01e6\1\uffff\6\u01e6\2\uffff\1\u01e6"+
            "\1\uffff\5\u01e6\3\uffff\2\u01e6\1\uffff\12\u01e6\1\uffff\16"+
            "\u01e6\1\uffff\23\u01e6\1\uffff\2\u01e6\1\uffff\4\u01e6\1\uffff"+
            "\4\u01e6\1\uffff\4\u01e6\1\uffff\3\u01e6\1\uffff\4\u01e6\1\uffff"+
            "\7\u01e6\3\uffff\1\u01e6\1\uffff\1\u01e6\22\uffff\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01e9\1\u01ea\1\uffff\1\u01ea\1\uffff\2\u01ea\1\uffff\16"+
            "\u01ea\2\uffff\1\u01ea\1\uffff\3\u01ea\1\uffff\1\u01ea\1\uffff"+
            "\4\u01ea\1\uffff\1\u01ea\1\uffff\1\u01ea\1\uffff\1\u01ea\1\uffff"+
            "\2\u01ea\1\uffff\16\u01ea\2\uffff\2\u01ea\1\uffff\2\u01ea\1"+
            "\uffff\1\u01ea\2\uffff\1\u01ea\1\uffff\1\u01ea\1\uffff\3\u01ea"+
            "\1\uffff\7\u01ea\1\uffff\3\u01ea\1\uffff\1\u01ea\1\uffff\4\u01ea"+
            "\1\uffff\2\u01ea\1\uffff\14\u01ea\1\uffff\1\1\3\u01ea\1\uffff"+
            "\4\u01ea\2\uffff\12\u01ea\2\uffff\3\u01ea\1\uffff\2\u01ea\1"+
            "\uffff\4\u01ea\1\uffff\1\u01ea\1\uffff\6\u01ea\2\uffff\1\u01ea"+
            "\1\uffff\5\u01ea\3\uffff\2\u01ea\1\uffff\12\u01ea\1\uffff\16"+
            "\u01ea\1\uffff\23\u01ea\1\uffff\2\u01ea\1\uffff\4\u01ea\1\uffff"+
            "\4\u01ea\1\uffff\4\u01ea\1\uffff\3\u01ea\1\uffff\4\u01ea\1\uffff"+
            "\7\u01ea\3\uffff\1\u01ea\1\uffff\1\u01ea\22\uffff\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01ed\1\u01ee\1\uffff\1\u01ee\1\uffff\2\u01ee\1\uffff\16"+
            "\u01ee\2\uffff\1\u01ee\1\uffff\3\u01ee\1\uffff\1\u01ee\1\uffff"+
            "\4\u01ee\1\uffff\1\u01ee\1\uffff\1\u01ee\1\uffff\1\u01ee\1\uffff"+
            "\2\u01ee\1\uffff\16\u01ee\2\uffff\2\u01ee\1\uffff\2\u01ee\1"+
            "\uffff\1\u01ee\2\uffff\1\u01ee\1\uffff\1\u01ee\1\uffff\3\u01ee"+
            "\1\uffff\7\u01ee\1\uffff\3\u01ee\1\uffff\1\u01ee\1\uffff\4\u01ee"+
            "\1\uffff\2\u01ee\1\uffff\14\u01ee\1\uffff\1\1\3\u01ee\1\uffff"+
            "\4\u01ee\2\uffff\12\u01ee\2\uffff\3\u01ee\1\uffff\2\u01ee\1"+
            "\uffff\4\u01ee\1\uffff\1\u01ee\1\uffff\6\u01ee\2\uffff\1\u01ee"+
            "\1\uffff\5\u01ee\3\uffff\2\u01ee\1\uffff\12\u01ee\1\uffff\16"+
            "\u01ee\1\uffff\23\u01ee\1\uffff\2\u01ee\1\uffff\4\u01ee\1\uffff"+
            "\4\u01ee\1\uffff\4\u01ee\1\uffff\3\u01ee\1\uffff\4\u01ee\1\uffff"+
            "\7\u01ee\3\uffff\1\u01ee\1\uffff\1\u01ee\22\uffff\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01f1\1\u01f2\1\uffff\1\u01f2\1\uffff\2\u01f2\1\uffff\16"+
            "\u01f2\2\uffff\1\u01f2\1\uffff\3\u01f2\1\uffff\1\u01f2\1\uffff"+
            "\4\u01f2\1\uffff\1\u01f2\1\uffff\1\u01f2\1\uffff\1\u01f2\1\uffff"+
            "\2\u01f2\1\uffff\16\u01f2\2\uffff\2\u01f2\1\uffff\2\u01f2\1"+
            "\uffff\1\u01f2\2\uffff\1\u01f2\1\uffff\1\u01f2\1\uffff\3\u01f2"+
            "\1\uffff\7\u01f2\1\uffff\3\u01f2\1\uffff\1\u01f2\1\uffff\4\u01f2"+
            "\1\uffff\2\u01f2\1\uffff\14\u01f2\1\uffff\1\1\3\u01f2\1\uffff"+
            "\4\u01f2\2\uffff\12\u01f2\2\uffff\3\u01f2\1\uffff\2\u01f2\1"+
            "\uffff\4\u01f2\1\uffff\1\u01f2\1\uffff\6\u01f2\2\uffff\1\u01f2"+
            "\1\uffff\5\u01f2\3\uffff\2\u01f2\1\uffff\12\u01f2\1\uffff\16"+
            "\u01f2\1\uffff\23\u01f2\1\uffff\2\u01f2\1\uffff\4\u01f2\1\uffff"+
            "\4\u01f2\1\uffff\4\u01f2\1\uffff\3\u01f2\1\uffff\4\u01f2\1\uffff"+
            "\7\u01f2\3\uffff\1\u01f2\1\uffff\1\u01f2\22\uffff\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01f5\1\u01f6\1\uffff\1\u01f6\1\uffff\2\u01f6\1\uffff\16"+
            "\u01f6\2\uffff\1\u01f6\1\uffff\3\u01f6\1\uffff\1\u01f6\1\uffff"+
            "\4\u01f6\1\uffff\1\u01f6\1\uffff\1\u01f6\1\uffff\1\u01f6\1\uffff"+
            "\2\u01f6\1\uffff\16\u01f6\2\uffff\2\u01f6\1\uffff\2\u01f6\1"+
            "\uffff\1\u01f6\2\uffff\1\u01f6\1\uffff\1\u01f6\1\uffff\3\u01f6"+
            "\1\uffff\7\u01f6\1\uffff\3\u01f6\1\uffff\1\u01f6\1\uffff\4\u01f6"+
            "\1\uffff\2\u01f6\1\uffff\14\u01f6\1\uffff\1\1\3\u01f6\1\uffff"+
            "\4\u01f6\2\uffff\12\u01f6\2\uffff\3\u01f6\1\uffff\2\u01f6\1"+
            "\uffff\4\u01f6\1\uffff\1\u01f6\1\uffff\6\u01f6\2\uffff\1\u01f6"+
            "\1\uffff\5\u01f6\3\uffff\2\u01f6\1\uffff\12\u01f6\1\uffff\16"+
            "\u01f6\1\uffff\23\u01f6\1\uffff\2\u01f6\1\uffff\4\u01f6\1\uffff"+
            "\4\u01f6\1\uffff\4\u01f6\1\uffff\3\u01f6\1\uffff\4\u01f6\1\uffff"+
            "\7\u01f6\3\uffff\1\u01f6\1\uffff\1\u01f6\22\uffff\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01f9\1\u01fa\1\uffff\1\u01fa\1\uffff\2\u01fa\1\uffff\16"+
            "\u01fa\2\uffff\1\u01fa\1\uffff\3\u01fa\1\uffff\1\u01fa\1\uffff"+
            "\4\u01fa\1\uffff\1\u01fa\1\uffff\1\u01fa\1\uffff\1\u01fa\1\uffff"+
            "\2\u01fa\1\uffff\16\u01fa\2\uffff\2\u01fa\1\uffff\2\u01fa\1"+
            "\uffff\1\u01fa\2\uffff\1\u01fa\1\uffff\1\u01fa\1\uffff\3\u01fa"+
            "\1\uffff\7\u01fa\1\uffff\3\u01fa\1\uffff\1\u01fa\1\uffff\4\u01fa"+
            "\1\uffff\2\u01fa\1\uffff\14\u01fa\1\uffff\1\1\3\u01fa\1\uffff"+
            "\4\u01fa\2\uffff\12\u01fa\2\uffff\3\u01fa\1\uffff\2\u01fa\1"+
            "\uffff\4\u01fa\1\uffff\1\u01fa\1\uffff\6\u01fa\2\uffff\1\u01fa"+
            "\1\uffff\5\u01fa\3\uffff\2\u01fa\1\uffff\12\u01fa\1\uffff\16"+
            "\u01fa\1\uffff\23\u01fa\1\uffff\2\u01fa\1\uffff\4\u01fa\1\uffff"+
            "\4\u01fa\1\uffff\4\u01fa\1\uffff\3\u01fa\1\uffff\4\u01fa\1\uffff"+
            "\7\u01fa\3\uffff\1\u01fa\1\uffff\1\u01fa\22\uffff\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01fd\1\u01fe\1\uffff\1\u01fe\1\uffff\2\u01fe\1\uffff\16"+
            "\u01fe\2\uffff\1\u01fe\1\uffff\3\u01fe\1\uffff\1\u01fe\1\uffff"+
            "\4\u01fe\1\uffff\1\u01fe\1\uffff\1\u01fe\1\uffff\1\u01fe\1\uffff"+
            "\2\u01fe\1\uffff\16\u01fe\2\uffff\2\u01fe\1\uffff\2\u01fe\1"+
            "\uffff\1\u01fe\2\uffff\1\u01fe\1\uffff\1\u01fe\1\uffff\3\u01fe"+
            "\1\uffff\7\u01fe\1\uffff\3\u01fe\1\uffff\1\u01fe\1\uffff\4\u01fe"+
            "\1\uffff\2\u01fe\1\uffff\14\u01fe\1\uffff\1\1\3\u01fe\1\uffff"+
            "\4\u01fe\2\uffff\12\u01fe\2\uffff\3\u01fe\1\uffff\2\u01fe\1"+
            "\uffff\4\u01fe\1\uffff\1\u01fe\1\uffff\6\u01fe\2\uffff\1\u01fe"+
            "\1\uffff\5\u01fe\3\uffff\2\u01fe\1\uffff\12\u01fe\1\uffff\16"+
            "\u01fe\1\uffff\23\u01fe\1\uffff\2\u01fe\1\uffff\4\u01fe\1\uffff"+
            "\4\u01fe\1\uffff\4\u01fe\1\uffff\3\u01fe\1\uffff\4\u01fe\1\uffff"+
            "\7\u01fe\3\uffff\1\u01fe\1\uffff\1\u01fe\22\uffff\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0201\1\u0202\1\uffff\1\u0202\1\uffff\2\u0202\1\uffff\16"+
            "\u0202\2\uffff\1\u0202\1\uffff\3\u0202\1\uffff\1\u0202\1\uffff"+
            "\4\u0202\1\uffff\1\u0202\1\uffff\1\u0202\1\uffff\1\u0202\1\uffff"+
            "\2\u0202\1\uffff\16\u0202\2\uffff\2\u0202\1\uffff\2\u0202\1"+
            "\uffff\1\u0202\2\uffff\1\u0202\1\uffff\1\u0202\1\uffff\3\u0202"+
            "\1\uffff\7\u0202\1\uffff\3\u0202\1\uffff\1\u0202\1\uffff\4\u0202"+
            "\1\uffff\2\u0202\1\uffff\14\u0202\1\uffff\1\1\3\u0202\1\uffff"+
            "\4\u0202\2\uffff\12\u0202\2\uffff\3\u0202\1\uffff\2\u0202\1"+
            "\uffff\4\u0202\1\uffff\1\u0202\1\uffff\6\u0202\2\uffff\1\u0202"+
            "\1\uffff\5\u0202\3\uffff\2\u0202\1\uffff\12\u0202\1\uffff\16"+
            "\u0202\1\uffff\23\u0202\1\uffff\2\u0202\1\uffff\4\u0202\1\uffff"+
            "\4\u0202\1\uffff\4\u0202\1\uffff\3\u0202\1\uffff\4\u0202\1\uffff"+
            "\7\u0202\3\uffff\1\u0202\1\uffff\1\u0202\22\uffff\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "150:1: selectExpression : ( expression | tableAllColumns );";
        }
    }
 

    public static final BitSet FOLLOW_KW_SELECT_in_selectClause71 = new BitSet(new long[]{0xBD77FFFDEC04A080L,0xF7AEFEEA5BFFFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x0007C0CB0A3FBDDFL});
    public static final BitSet FOLLOW_hintClause_in_selectClause73 = new BitSet(new long[]{0xBD77FFFDEC042080L,0xF7AEFEEA5BFFFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x0007C0CB0A3FBDDFL});
    public static final BitSet FOLLOW_KW_ALL_in_selectClause79 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x0007C0CB0A3FBDDEL});
    public static final BitSet FOLLOW_KW_DISTINCT_in_selectClause85 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x0007C0CB0A3FBDDEL});
    public static final BitSet FOLLOW_selectList_in_selectClause89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRANSFORM_in_selectClause123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_selectTrfmClause_in_selectClause125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trfmClause_in_selectClause196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectItem_in_selectList239 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_selectList243 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x0007C0CB0A3FBDDEL});
    public static final BitSet FOLLOW_selectItem_in_selectList246 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_LPAREN_in_selectTrfmClause285 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x0007C0CB0A3FBDDEL});
    public static final BitSet FOLLOW_selectExpressionList_in_selectTrfmClause287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_selectTrfmClause289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008008000L,0x0000000000020000L});
    public static final BitSet FOLLOW_rowFormat_in_selectTrfmClause297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L,0x0000000000020000L});
    public static final BitSet FOLLOW_recordWriter_in_selectTrfmClause301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_KW_USING_in_selectTrfmClause307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_selectTrfmClause309 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008004000L});
    public static final BitSet FOLLOW_KW_AS_in_selectTrfmClause317 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000010A3FBDDEL});
    public static final BitSet FOLLOW_LPAREN_in_selectTrfmClause321 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_aliasList_in_selectTrfmClause324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_columnNameTypeList_in_selectTrfmClause328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_selectTrfmClause331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008004000L});
    public static final BitSet FOLLOW_aliasList_in_selectTrfmClause337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008004000L});
    public static final BitSet FOLLOW_columnNameTypeList_in_selectTrfmClause341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008004000L});
    public static final BitSet FOLLOW_rowFormat_in_selectTrfmClause353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_recordReader_in_selectTrfmClause357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIVIDE_in_hintClause420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_STAR_in_hintClause422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_PLUS_in_hintClause424 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000800000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_hintList_in_hintClause426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_STAR_in_hintClause428 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DIVIDE_in_hintClause430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hintItem_in_hintList469 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_hintList472 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000800000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_hintItem_in_hintList474 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_hintName_in_hintItem512 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_hintItem515 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_hintArgs_in_hintItem517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_hintItem519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_MAPJOIN_in_hintName563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STREAMTABLE_in_hintName575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_HOLD_DDLTIME_in_hintName587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hintArgName_in_hintArgs622 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_hintArgs625 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_hintArgName_in_hintArgs627 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_identifier_in_hintArgName669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectExpression_in_selectItem702 = new BitSet(new long[]{0xBD74FFFDAC000002L,0xB7AEFEEA5B3FFF6AL,0xFAFEBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_KW_OVER_in_selectItem705 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_window_specification_in_selectItem709 = new BitSet(new long[]{0xBD74FFFDAC000002L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_KW_AS_in_selectItem722 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_identifier_in_selectItem725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_AS_in_selectItem731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_selectItem733 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_identifier_in_selectItem735 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_COMMA_in_selectItem738 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_identifier_in_selectItem740 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_selectItem744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_MAP_in_trfmClause803 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x0007C0CB0A3FBDDEL});
    public static final BitSet FOLLOW_selectExpressionList_in_trfmClause808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008008000L,0x0000000000020000L});
    public static final BitSet FOLLOW_KW_REDUCE_in_trfmClause818 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x0007C0CB0A3FBDDEL});
    public static final BitSet FOLLOW_selectExpressionList_in_trfmClause820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008008000L,0x0000000000020000L});
    public static final BitSet FOLLOW_rowFormat_in_trfmClause830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L,0x0000000000020000L});
    public static final BitSet FOLLOW_recordWriter_in_trfmClause834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_KW_USING_in_trfmClause840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_trfmClause842 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008004000L});
    public static final BitSet FOLLOW_KW_AS_in_trfmClause850 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000010A3FBDDEL});
    public static final BitSet FOLLOW_LPAREN_in_trfmClause854 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_aliasList_in_trfmClause857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_columnNameTypeList_in_trfmClause861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_trfmClause864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008004000L});
    public static final BitSet FOLLOW_aliasList_in_trfmClause870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008004000L});
    public static final BitSet FOLLOW_columnNameTypeList_in_trfmClause874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008004000L});
    public static final BitSet FOLLOW_rowFormat_in_trfmClause886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_recordReader_in_trfmClause890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_selectExpression953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableAllColumns_in_selectExpression957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectExpression_in_selectExpressionList988 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_selectExpressionList991 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x0007C0CB0A3FBDDEL});
    public static final BitSet FOLLOW_selectExpression_in_selectExpressionList993 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_KW_WINDOW_in_window_clause1032 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_window_defn_in_window_clause1034 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_window_clause1037 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_window_defn_in_window_clause1039 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_Identifier_in_window_defn1075 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_KW_AS_in_window_defn1077 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_window_specification_in_window_defn1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_window_specification1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_window_specification1121 = new BitSet(new long[]{0x0010000004000000L,0x0000000001000000L,0x0804000000000000L,0x0000080010000100L,0x0000040000000000L});
    public static final BitSet FOLLOW_Identifier_in_window_specification1123 = new BitSet(new long[]{0x0010000000000000L,0x0000000001000000L,0x0804000000000000L,0x0000080010000100L,0x0000040000000000L});
    public static final BitSet FOLLOW_partitioningSpec_in_window_specification1126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000100L,0x0000040000000000L});
    public static final BitSet FOLLOW_window_frame_in_window_specification1129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_window_specification1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_window_range_expression_in_window_frame1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_window_value_expression_in_window_frame1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ROWS_in_window_range_expression1186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x0000000000000000L,0x0000000000000000L,0x0000004000000020L});
    public static final BitSet FOLLOW_window_frame_start_boundary_in_window_range_expression1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ROWS_in_window_range_expression1204 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_KW_BETWEEN_in_window_range_expression1206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x0000000000000000L,0x0000000000000000L,0x0000004000000020L});
    public static final BitSet FOLLOW_window_frame_boundary_in_window_range_expression1210 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_KW_AND_in_window_range_expression1212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x0000000000000000L,0x0000000000000000L,0x0000004000000020L});
    public static final BitSet FOLLOW_window_frame_boundary_in_window_range_expression1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RANGE_in_window_value_expression1250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x0000000000000000L,0x0000000000000000L,0x0000004000000020L});
    public static final BitSet FOLLOW_window_frame_start_boundary_in_window_value_expression1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RANGE_in_window_value_expression1268 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_KW_BETWEEN_in_window_value_expression1270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x0000000000000000L,0x0000000000000000L,0x0000004000000020L});
    public static final BitSet FOLLOW_window_frame_boundary_in_window_value_expression1274 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_KW_AND_in_window_value_expression1276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x0000000000000000L,0x0000000000000000L,0x0000004000000020L});
    public static final BitSet FOLLOW_window_frame_boundary_in_window_value_expression1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_UNBOUNDED_in_window_frame_start_boundary1315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KW_PRECEDING_in_window_frame_start_boundary1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CURRENT_in_window_frame_start_boundary1333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_KW_ROW_in_window_frame_start_boundary1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Number_in_window_frame_start_boundary1348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KW_PRECEDING_in_window_frame_start_boundary1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_UNBOUNDED_in_window_frame_boundary1381 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KW_PRECEDING_in_window_frame_boundary1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FOLLOWING_in_window_frame_boundary1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CURRENT_in_window_frame_boundary1408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_KW_ROW_in_window_frame_boundary1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Number_in_window_frame_boundary1423 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KW_PRECEDING_in_window_frame_boundary1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FOLLOWING_in_window_frame_boundary1434 = new BitSet(new long[]{0x0000000000000002L});

}