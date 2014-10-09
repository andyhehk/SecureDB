// $ANTLR 3.4 IdentifiersParser.g 2014-10-09 18:00:59

//package org.apache.hadoop.hive.ql.parse;
package edu.hku.sdb.parser;
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
public class HiveParser_IdentifiersParser extends Parser {
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


    public HiveParser_IdentifiersParser(TokenStream input, HiveParser gHiveParser) {
        this(input, new RecognizerSharedState(), gHiveParser);
    }
    public HiveParser_IdentifiersParser(TokenStream input, RecognizerSharedState state, HiveParser gHiveParser) {
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
    public String getGrammarFileName() { return "IdentifiersParser.g"; }


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


    public static class groupByClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupByClause"
    // IdentifiersParser.g:49:1: groupByClause : KW_GROUP KW_BY groupByExpression ( COMMA groupByExpression )* ( (rollup= KW_WITH KW_ROLLUP ) | (cube= KW_WITH KW_CUBE ) )? (sets= KW_GROUPING KW_SETS LPAREN groupingSetExpression ( COMMA groupingSetExpression )* RPAREN )? -> {rollup != null}? ^( TOK_ROLLUP_GROUPBY ( groupByExpression )+ ) -> {cube != null}? ^( TOK_CUBE_GROUPBY ( groupByExpression )+ ) -> {sets != null}? ^( TOK_GROUPING_SETS ( groupByExpression )+ ( groupingSetExpression )+ ) -> ^( TOK_GROUPBY ( groupByExpression )+ ) ;
    public final HiveParser_IdentifiersParser.groupByClause_return groupByClause() throws RecognitionException {
        HiveParser_IdentifiersParser.groupByClause_return retval = new HiveParser_IdentifiersParser.groupByClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token rollup=null;
        Token cube=null;
        Token sets=null;
        Token KW_GROUP1=null;
        Token KW_BY2=null;
        Token COMMA4=null;
        Token KW_ROLLUP6=null;
        Token KW_CUBE7=null;
        Token KW_SETS8=null;
        Token LPAREN9=null;
        Token COMMA11=null;
        Token RPAREN13=null;
        HiveParser_IdentifiersParser.groupByExpression_return groupByExpression3 =null;

        HiveParser_IdentifiersParser.groupByExpression_return groupByExpression5 =null;

        HiveParser_IdentifiersParser.groupingSetExpression_return groupingSetExpression10 =null;

        HiveParser_IdentifiersParser.groupingSetExpression_return groupingSetExpression12 =null;


        CommonTree rollup_tree=null;
        CommonTree cube_tree=null;
        CommonTree sets_tree=null;
        CommonTree KW_GROUP1_tree=null;
        CommonTree KW_BY2_tree=null;
        CommonTree COMMA4_tree=null;
        CommonTree KW_ROLLUP6_tree=null;
        CommonTree KW_CUBE7_tree=null;
        CommonTree KW_SETS8_tree=null;
        CommonTree LPAREN9_tree=null;
        CommonTree COMMA11_tree=null;
        CommonTree RPAREN13_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_GROUPING=new RewriteRuleTokenStream(adaptor,"token KW_GROUPING");
        RewriteRuleTokenStream stream_KW_CUBE=new RewriteRuleTokenStream(adaptor,"token KW_CUBE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_ROLLUP=new RewriteRuleTokenStream(adaptor,"token KW_ROLLUP");
        RewriteRuleTokenStream stream_KW_WITH=new RewriteRuleTokenStream(adaptor,"token KW_WITH");
        RewriteRuleTokenStream stream_KW_GROUP=new RewriteRuleTokenStream(adaptor,"token KW_GROUP");
        RewriteRuleTokenStream stream_KW_SETS=new RewriteRuleTokenStream(adaptor,"token KW_SETS");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
        RewriteRuleSubtreeStream stream_groupingSetExpression=new RewriteRuleSubtreeStream(adaptor,"rule groupingSetExpression");
        RewriteRuleSubtreeStream stream_groupByExpression=new RewriteRuleSubtreeStream(adaptor,"rule groupByExpression");
         gParent.msgs.push("group by clause"); 
        try {
            // IdentifiersParser.g:52:5: ( KW_GROUP KW_BY groupByExpression ( COMMA groupByExpression )* ( (rollup= KW_WITH KW_ROLLUP ) | (cube= KW_WITH KW_CUBE ) )? (sets= KW_GROUPING KW_SETS LPAREN groupingSetExpression ( COMMA groupingSetExpression )* RPAREN )? -> {rollup != null}? ^( TOK_ROLLUP_GROUPBY ( groupByExpression )+ ) -> {cube != null}? ^( TOK_CUBE_GROUPBY ( groupByExpression )+ ) -> {sets != null}? ^( TOK_GROUPING_SETS ( groupByExpression )+ ( groupingSetExpression )+ ) -> ^( TOK_GROUPBY ( groupByExpression )+ ) )
            // IdentifiersParser.g:53:5: KW_GROUP KW_BY groupByExpression ( COMMA groupByExpression )* ( (rollup= KW_WITH KW_ROLLUP ) | (cube= KW_WITH KW_CUBE ) )? (sets= KW_GROUPING KW_SETS LPAREN groupingSetExpression ( COMMA groupingSetExpression )* RPAREN )?
            {
            KW_GROUP1=(Token)match(input,KW_GROUP,FOLLOW_KW_GROUP_in_groupByClause72); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_GROUP.add(KW_GROUP1);


            KW_BY2=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_groupByClause74); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY2);


            pushFollow(FOLLOW_groupByExpression_in_groupByClause80);
            groupByExpression3=groupByExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_groupByExpression.add(groupByExpression3.getTree());

            // IdentifiersParser.g:55:5: ( COMMA groupByExpression )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==COMMA) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // IdentifiersParser.g:55:7: COMMA groupByExpression
            	    {
            	    COMMA4=(Token)match(input,COMMA,FOLLOW_COMMA_in_groupByClause88); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA4);


            	    pushFollow(FOLLOW_groupByExpression_in_groupByClause90);
            	    groupByExpression5=groupByExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_groupByExpression.add(groupByExpression5.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // IdentifiersParser.g:56:5: ( (rollup= KW_WITH KW_ROLLUP ) | (cube= KW_WITH KW_CUBE ) )?
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==KW_WITH) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==KW_ROLLUP) ) {
                    alt2=1;
                }
                else if ( (LA2_1==KW_CUBE) ) {
                    alt2=2;
                }
            }
            switch (alt2) {
                case 1 :
                    // IdentifiersParser.g:56:6: (rollup= KW_WITH KW_ROLLUP )
                    {
                    // IdentifiersParser.g:56:6: (rollup= KW_WITH KW_ROLLUP )
                    // IdentifiersParser.g:56:7: rollup= KW_WITH KW_ROLLUP
                    {
                    rollup=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_groupByClause103); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_WITH.add(rollup);


                    KW_ROLLUP6=(Token)match(input,KW_ROLLUP,FOLLOW_KW_ROLLUP_in_groupByClause105); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ROLLUP.add(KW_ROLLUP6);


                    }


                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:56:35: (cube= KW_WITH KW_CUBE )
                    {
                    // IdentifiersParser.g:56:35: (cube= KW_WITH KW_CUBE )
                    // IdentifiersParser.g:56:36: cube= KW_WITH KW_CUBE
                    {
                    cube=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_groupByClause113); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_WITH.add(cube);


                    KW_CUBE7=(Token)match(input,KW_CUBE,FOLLOW_KW_CUBE_in_groupByClause115); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_CUBE.add(KW_CUBE7);


                    }


                    }
                    break;

            }


            // IdentifiersParser.g:57:5: (sets= KW_GROUPING KW_SETS LPAREN groupingSetExpression ( COMMA groupingSetExpression )* RPAREN )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==KW_GROUPING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // IdentifiersParser.g:57:6: sets= KW_GROUPING KW_SETS LPAREN groupingSetExpression ( COMMA groupingSetExpression )* RPAREN
                    {
                    sets=(Token)match(input,KW_GROUPING,FOLLOW_KW_GROUPING_in_groupByClause128); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_GROUPING.add(sets);


                    KW_SETS8=(Token)match(input,KW_SETS,FOLLOW_KW_SETS_in_groupByClause130); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SETS.add(KW_SETS8);


                    LPAREN9=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_groupByClause137); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN9);


                    pushFollow(FOLLOW_groupingSetExpression_in_groupByClause139);
                    groupingSetExpression10=groupingSetExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_groupingSetExpression.add(groupingSetExpression10.getTree());

                    // IdentifiersParser.g:58:34: ( COMMA groupingSetExpression )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==COMMA) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // IdentifiersParser.g:58:36: COMMA groupingSetExpression
                    	    {
                    	    COMMA11=(Token)match(input,COMMA,FOLLOW_COMMA_in_groupByClause143); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA11);


                    	    pushFollow(FOLLOW_groupingSetExpression_in_groupByClause145);
                    	    groupingSetExpression12=groupingSetExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_groupingSetExpression.add(groupingSetExpression12.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    RPAREN13=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_groupByClause150); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN13);


                    }
                    break;

            }


            // AST REWRITE
            // elements: groupingSetExpression, groupByExpression, groupByExpression, groupByExpression, groupByExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 59:5: -> {rollup != null}? ^( TOK_ROLLUP_GROUPBY ( groupByExpression )+ )
            if (rollup != null) {
                // IdentifiersParser.g:59:26: ^( TOK_ROLLUP_GROUPBY ( groupByExpression )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_ROLLUP_GROUPBY, "TOK_ROLLUP_GROUPBY")
                , root_1);

                if ( !(stream_groupByExpression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_groupByExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_groupByExpression.nextTree());

                }
                stream_groupByExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 60:5: -> {cube != null}? ^( TOK_CUBE_GROUPBY ( groupByExpression )+ )
            if (cube != null) {
                // IdentifiersParser.g:60:24: ^( TOK_CUBE_GROUPBY ( groupByExpression )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_CUBE_GROUPBY, "TOK_CUBE_GROUPBY")
                , root_1);

                if ( !(stream_groupByExpression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_groupByExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_groupByExpression.nextTree());

                }
                stream_groupByExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 61:5: -> {sets != null}? ^( TOK_GROUPING_SETS ( groupByExpression )+ ( groupingSetExpression )+ )
            if (sets != null) {
                // IdentifiersParser.g:61:24: ^( TOK_GROUPING_SETS ( groupByExpression )+ ( groupingSetExpression )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_GROUPING_SETS, "TOK_GROUPING_SETS")
                , root_1);

                if ( !(stream_groupByExpression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_groupByExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_groupByExpression.nextTree());

                }
                stream_groupByExpression.reset();

                if ( !(stream_groupingSetExpression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_groupingSetExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_groupingSetExpression.nextTree());

                }
                stream_groupingSetExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 62:5: -> ^( TOK_GROUPBY ( groupByExpression )+ )
            {
                // IdentifiersParser.g:62:8: ^( TOK_GROUPBY ( groupByExpression )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_GROUPBY, "TOK_GROUPBY")
                , root_1);

                if ( !(stream_groupByExpression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_groupByExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_groupByExpression.nextTree());

                }
                stream_groupByExpression.reset();

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
    // $ANTLR end "groupByClause"


    public static class groupingSetExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupingSetExpression"
    // IdentifiersParser.g:65:1: groupingSetExpression : ( groupByExpression -> ^( TOK_GROUPING_SETS_EXPRESSION groupByExpression ) | LPAREN groupByExpression ( COMMA groupByExpression )* RPAREN -> ^( TOK_GROUPING_SETS_EXPRESSION ( groupByExpression )+ ) | LPAREN RPAREN -> ^( TOK_GROUPING_SETS_EXPRESSION ) );
    public final HiveParser_IdentifiersParser.groupingSetExpression_return groupingSetExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.groupingSetExpression_return retval = new HiveParser_IdentifiersParser.groupingSetExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LPAREN15=null;
        Token COMMA17=null;
        Token RPAREN19=null;
        Token LPAREN20=null;
        Token RPAREN21=null;
        HiveParser_IdentifiersParser.groupByExpression_return groupByExpression14 =null;

        HiveParser_IdentifiersParser.groupByExpression_return groupByExpression16 =null;

        HiveParser_IdentifiersParser.groupByExpression_return groupByExpression18 =null;


        CommonTree LPAREN15_tree=null;
        CommonTree COMMA17_tree=null;
        CommonTree RPAREN19_tree=null;
        CommonTree LPAREN20_tree=null;
        CommonTree RPAREN21_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_groupByExpression=new RewriteRuleSubtreeStream(adaptor,"rule groupByExpression");
        gParent.msgs.push("grouping set expression"); 
        try {
            // IdentifiersParser.g:68:4: ( groupByExpression -> ^( TOK_GROUPING_SETS_EXPRESSION groupByExpression ) | LPAREN groupByExpression ( COMMA groupByExpression )* RPAREN -> ^( TOK_GROUPING_SETS_EXPRESSION ( groupByExpression )+ ) | LPAREN RPAREN -> ^( TOK_GROUPING_SETS_EXPRESSION ) )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // IdentifiersParser.g:69:4: groupByExpression
                    {
                    pushFollow(FOLLOW_groupByExpression_in_groupingSetExpression244);
                    groupByExpression14=groupByExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_groupByExpression.add(groupByExpression14.getTree());

                    // AST REWRITE
                    // elements: groupByExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 70:4: -> ^( TOK_GROUPING_SETS_EXPRESSION groupByExpression )
                    {
                        // IdentifiersParser.g:70:7: ^( TOK_GROUPING_SETS_EXPRESSION groupByExpression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_GROUPING_SETS_EXPRESSION, "TOK_GROUPING_SETS_EXPRESSION")
                        , root_1);

                        adaptor.addChild(root_1, stream_groupByExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:72:4: LPAREN groupByExpression ( COMMA groupByExpression )* RPAREN
                    {
                    LPAREN15=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_groupingSetExpression265); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN15);


                    pushFollow(FOLLOW_groupByExpression_in_groupingSetExpression271);
                    groupByExpression16=groupByExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_groupByExpression.add(groupByExpression16.getTree());

                    // IdentifiersParser.g:73:22: ( COMMA groupByExpression )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==COMMA) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // IdentifiersParser.g:73:23: COMMA groupByExpression
                    	    {
                    	    COMMA17=(Token)match(input,COMMA,FOLLOW_COMMA_in_groupingSetExpression274); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA17);


                    	    pushFollow(FOLLOW_groupByExpression_in_groupingSetExpression276);
                    	    groupByExpression18=groupByExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_groupByExpression.add(groupByExpression18.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    RPAREN19=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_groupingSetExpression283); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN19);


                    // AST REWRITE
                    // elements: groupByExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 75:4: -> ^( TOK_GROUPING_SETS_EXPRESSION ( groupByExpression )+ )
                    {
                        // IdentifiersParser.g:75:7: ^( TOK_GROUPING_SETS_EXPRESSION ( groupByExpression )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_GROUPING_SETS_EXPRESSION, "TOK_GROUPING_SETS_EXPRESSION")
                        , root_1);

                        if ( !(stream_groupByExpression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_groupByExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_groupByExpression.nextTree());

                        }
                        stream_groupByExpression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // IdentifiersParser.g:77:4: LPAREN RPAREN
                    {
                    LPAREN20=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_groupingSetExpression305); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN20);


                    RPAREN21=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_groupingSetExpression310); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN21);


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
                    // 79:4: -> ^( TOK_GROUPING_SETS_EXPRESSION )
                    {
                        // IdentifiersParser.g:79:7: ^( TOK_GROUPING_SETS_EXPRESSION )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_GROUPING_SETS_EXPRESSION, "TOK_GROUPING_SETS_EXPRESSION")
                        , root_1);

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
    // $ANTLR end "groupingSetExpression"


    public static class groupByExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupByExpression"
    // IdentifiersParser.g:83:1: groupByExpression : expression ;
    public final HiveParser_IdentifiersParser.groupByExpression_return groupByExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.groupByExpression_return retval = new HiveParser_IdentifiersParser.groupByExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.expression_return expression22 =null;



         gParent.msgs.push("group by expression"); 
        try {
            // IdentifiersParser.g:86:5: ( expression )
            // IdentifiersParser.g:87:5: expression
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expression_in_groupByExpression350);
            expression22=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression22.getTree());

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
    // $ANTLR end "groupByExpression"


    public static class havingClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "havingClause"
    // IdentifiersParser.g:90:1: havingClause : KW_HAVING havingCondition -> ^( TOK_HAVING havingCondition ) ;
    public final HiveParser_IdentifiersParser.havingClause_return havingClause() throws RecognitionException {
        HiveParser_IdentifiersParser.havingClause_return retval = new HiveParser_IdentifiersParser.havingClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_HAVING23=null;
        HiveParser_IdentifiersParser.havingCondition_return havingCondition24 =null;


        CommonTree KW_HAVING23_tree=null;
        RewriteRuleTokenStream stream_KW_HAVING=new RewriteRuleTokenStream(adaptor,"token KW_HAVING");
        RewriteRuleSubtreeStream stream_havingCondition=new RewriteRuleSubtreeStream(adaptor,"rule havingCondition");
         gParent.msgs.push("having clause"); 
        try {
            // IdentifiersParser.g:93:5: ( KW_HAVING havingCondition -> ^( TOK_HAVING havingCondition ) )
            // IdentifiersParser.g:94:5: KW_HAVING havingCondition
            {
            KW_HAVING23=(Token)match(input,KW_HAVING,FOLLOW_KW_HAVING_in_havingClause381); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_HAVING.add(KW_HAVING23);


            pushFollow(FOLLOW_havingCondition_in_havingClause383);
            havingCondition24=havingCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_havingCondition.add(havingCondition24.getTree());

            // AST REWRITE
            // elements: havingCondition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 94:31: -> ^( TOK_HAVING havingCondition )
            {
                // IdentifiersParser.g:94:34: ^( TOK_HAVING havingCondition )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_HAVING, "TOK_HAVING")
                , root_1);

                adaptor.addChild(root_1, stream_havingCondition.nextTree());

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
    // $ANTLR end "havingClause"


    public static class havingCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "havingCondition"
    // IdentifiersParser.g:97:1: havingCondition : expression ;
    public final HiveParser_IdentifiersParser.havingCondition_return havingCondition() throws RecognitionException {
        HiveParser_IdentifiersParser.havingCondition_return retval = new HiveParser_IdentifiersParser.havingCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.expression_return expression25 =null;



         gParent.msgs.push("having condition"); 
        try {
            // IdentifiersParser.g:100:5: ( expression )
            // IdentifiersParser.g:101:5: expression
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expression_in_havingCondition422);
            expression25=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression25.getTree());

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
    // $ANTLR end "havingCondition"


    public static class orderByClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "orderByClause"
    // IdentifiersParser.g:105:1: orderByClause : ( KW_ORDER KW_BY LPAREN columnRefOrder ( COMMA columnRefOrder )* RPAREN -> ^( TOK_ORDERBY ( columnRefOrder )+ ) | KW_ORDER KW_BY columnRefOrder ( COMMA columnRefOrder )* -> ^( TOK_ORDERBY ( columnRefOrder )+ ) );
    public final HiveParser_IdentifiersParser.orderByClause_return orderByClause() throws RecognitionException {
        HiveParser_IdentifiersParser.orderByClause_return retval = new HiveParser_IdentifiersParser.orderByClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_ORDER26=null;
        Token KW_BY27=null;
        Token LPAREN28=null;
        Token COMMA30=null;
        Token RPAREN32=null;
        Token KW_ORDER33=null;
        Token KW_BY34=null;
        Token COMMA36=null;
        HiveParser.columnRefOrder_return columnRefOrder29 =null;

        HiveParser.columnRefOrder_return columnRefOrder31 =null;

        HiveParser.columnRefOrder_return columnRefOrder35 =null;

        HiveParser.columnRefOrder_return columnRefOrder37 =null;


        CommonTree KW_ORDER26_tree=null;
        CommonTree KW_BY27_tree=null;
        CommonTree LPAREN28_tree=null;
        CommonTree COMMA30_tree=null;
        CommonTree RPAREN32_tree=null;
        CommonTree KW_ORDER33_tree=null;
        CommonTree KW_BY34_tree=null;
        CommonTree COMMA36_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_ORDER=new RewriteRuleTokenStream(adaptor,"token KW_ORDER");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
        RewriteRuleSubtreeStream stream_columnRefOrder=new RewriteRuleSubtreeStream(adaptor,"rule columnRefOrder");
         gParent.msgs.push("order by clause"); 
        try {
            // IdentifiersParser.g:108:5: ( KW_ORDER KW_BY LPAREN columnRefOrder ( COMMA columnRefOrder )* RPAREN -> ^( TOK_ORDERBY ( columnRefOrder )+ ) | KW_ORDER KW_BY columnRefOrder ( COMMA columnRefOrder )* -> ^( TOK_ORDERBY ( columnRefOrder )+ ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==KW_ORDER) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==KW_BY) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==LPAREN) ) {
                        alt9=1;
                    }
                    else if ( (LA9_2==BigintLiteral||LA9_2==CharSetName||LA9_2==DecimalLiteral||(LA9_2 >= Identifier && LA9_2 <= KW_ADD)||LA9_2==KW_AFTER||(LA9_2 >= KW_ALTER && LA9_2 <= KW_ANALYZE)||(LA9_2 >= KW_ARCHIVE && LA9_2 <= KW_CHANGE)||(LA9_2 >= KW_CLUSTER && LA9_2 <= KW_CLUSTERSTATUS)||LA9_2==KW_COLLECTION||(LA9_2 >= KW_COLUMNS && LA9_2 <= KW_CONCATENATE)||LA9_2==KW_CONTINUE||LA9_2==KW_CREATE||LA9_2==KW_CUBE||(LA9_2 >= KW_CURSOR && LA9_2 <= KW_DATA)||(LA9_2 >= KW_DATABASES && LA9_2 <= KW_DISTANCE)||(LA9_2 >= KW_DISTRIBUTE && LA9_2 <= KW_DOUBLE)||(LA9_2 >= KW_DROP && LA9_2 <= KW_ELEM_TYPE)||LA9_2==KW_ENABLE||LA9_2==KW_ESCAPED||LA9_2==KW_EXCLUSIVE||(LA9_2 >= KW_EXISTS && LA9_2 <= KW_EXPORT)||(LA9_2 >= KW_EXTERNAL && LA9_2 <= KW_FLOAT)||(LA9_2 >= KW_FOR && LA9_2 <= KW_FORMATTED)||LA9_2==KW_FULL||(LA9_2 >= KW_FUNCTIONS && LA9_2 <= KW_GROUPING)||(LA9_2 >= KW_HOLD_DDLTIME && LA9_2 <= KW_INTERSECT)||(LA9_2 >= KW_INTO && LA9_2 <= KW_ITEMS)||(LA9_2 >= KW_KEYS && LA9_2 <= KW_LENGTH)||(LA9_2 >= KW_LIKE && LA9_2 <= KW_LONG)||(LA9_2 >= KW_MAP && LA9_2 <= KW_MINUS)||(LA9_2 >= KW_MSCK && LA9_2 <= KW_OFFLINE)||LA9_2==KW_OPTION||(LA9_2 >= KW_ORCFILE && LA9_2 <= KW_OUTPUTFORMAT)||LA9_2==KW_OVERWRITE||(LA9_2 >= KW_PARTITION && LA9_2 <= KW_PLUS)||(LA9_2 >= KW_PRETTY && LA9_2 <= KW_PROCEDURE)||(LA9_2 >= KW_PROTECTION && LA9_2 <= KW_RECORDWRITER)||(LA9_2 >= KW_REGEXP && LA9_2 <= KW_SCHEMAS)||(LA9_2 >= KW_SEMI && LA9_2 <= KW_STRUCT)||(LA9_2 >= KW_TABLE && LA9_2 <= KW_TABLES)||(LA9_2 >= KW_TBLPROPERTIES && LA9_2 <= KW_TEXTFILE)||(LA9_2 >= KW_TIMESTAMP && LA9_2 <= KW_TOUCH)||(LA9_2 >= KW_TRIGGER && LA9_2 <= KW_UNARCHIVE)||(LA9_2 >= KW_UNDO && LA9_2 <= KW_UNIONTYPE)||(LA9_2 >= KW_UNLOCK && LA9_2 <= KW_UPDATE)||(LA9_2 >= KW_USE && LA9_2 <= KW_VIEW)||LA9_2==KW_WHILE||LA9_2==KW_WITH||LA9_2==LSQUARE||LA9_2==MINUS||(LA9_2 >= Number && LA9_2 <= PLUS)||(LA9_2 >= SmallintLiteral && LA9_2 <= TinyintLiteral)) ) {
                        alt9=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // IdentifiersParser.g:109:5: KW_ORDER KW_BY LPAREN columnRefOrder ( COMMA columnRefOrder )* RPAREN
                    {
                    KW_ORDER26=(Token)match(input,KW_ORDER,FOLLOW_KW_ORDER_in_orderByClause454); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ORDER.add(KW_ORDER26);


                    KW_BY27=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_orderByClause456); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY27);


                    LPAREN28=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_orderByClause462); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN28);


                    pushFollow(FOLLOW_columnRefOrder_in_orderByClause464);
                    columnRefOrder29=gHiveParser.columnRefOrder();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder29.getTree());

                    // IdentifiersParser.g:111:5: ( COMMA columnRefOrder )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==COMMA) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // IdentifiersParser.g:111:7: COMMA columnRefOrder
                    	    {
                    	    COMMA30=(Token)match(input,COMMA,FOLLOW_COMMA_in_orderByClause472); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA30);


                    	    pushFollow(FOLLOW_columnRefOrder_in_orderByClause474);
                    	    columnRefOrder31=gHiveParser.columnRefOrder();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder31.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    RPAREN32=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_orderByClause478); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN32);


                    // AST REWRITE
                    // elements: columnRefOrder
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 111:37: -> ^( TOK_ORDERBY ( columnRefOrder )+ )
                    {
                        // IdentifiersParser.g:111:40: ^( TOK_ORDERBY ( columnRefOrder )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_ORDERBY, "TOK_ORDERBY")
                        , root_1);

                        if ( !(stream_columnRefOrder.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_columnRefOrder.hasNext() ) {
                            adaptor.addChild(root_1, stream_columnRefOrder.nextTree());

                        }
                        stream_columnRefOrder.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:113:5: KW_ORDER KW_BY columnRefOrder ( COMMA columnRefOrder )*
                    {
                    KW_ORDER33=(Token)match(input,KW_ORDER,FOLLOW_KW_ORDER_in_orderByClause499); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ORDER.add(KW_ORDER33);


                    KW_BY34=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_orderByClause501); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY34);


                    pushFollow(FOLLOW_columnRefOrder_in_orderByClause507);
                    columnRefOrder35=gHiveParser.columnRefOrder();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder35.getTree());

                    // IdentifiersParser.g:115:5: ( COMMA columnRefOrder )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==COMMA) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // IdentifiersParser.g:115:7: COMMA columnRefOrder
                    	    {
                    	    COMMA36=(Token)match(input,COMMA,FOLLOW_COMMA_in_orderByClause515); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA36);


                    	    pushFollow(FOLLOW_columnRefOrder_in_orderByClause517);
                    	    columnRefOrder37=gHiveParser.columnRefOrder();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder37.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: columnRefOrder
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 115:30: -> ^( TOK_ORDERBY ( columnRefOrder )+ )
                    {
                        // IdentifiersParser.g:115:33: ^( TOK_ORDERBY ( columnRefOrder )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_ORDERBY, "TOK_ORDERBY")
                        , root_1);

                        if ( !(stream_columnRefOrder.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_columnRefOrder.hasNext() ) {
                            adaptor.addChild(root_1, stream_columnRefOrder.nextTree());

                        }
                        stream_columnRefOrder.reset();

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
    // $ANTLR end "orderByClause"


    public static class clusterByClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "clusterByClause"
    // IdentifiersParser.g:118:1: clusterByClause : ( KW_CLUSTER KW_BY LPAREN expression ( COMMA expression )* RPAREN -> ^( TOK_CLUSTERBY ( expression )+ ) | KW_CLUSTER KW_BY expression ( ( COMMA )=> COMMA expression )* -> ^( TOK_CLUSTERBY ( expression )+ ) );
    public final HiveParser_IdentifiersParser.clusterByClause_return clusterByClause() throws RecognitionException {
        HiveParser_IdentifiersParser.clusterByClause_return retval = new HiveParser_IdentifiersParser.clusterByClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_CLUSTER38=null;
        Token KW_BY39=null;
        Token LPAREN40=null;
        Token COMMA42=null;
        Token RPAREN44=null;
        Token KW_CLUSTER45=null;
        Token KW_BY46=null;
        Token COMMA48=null;
        HiveParser_IdentifiersParser.expression_return expression41 =null;

        HiveParser_IdentifiersParser.expression_return expression43 =null;

        HiveParser_IdentifiersParser.expression_return expression47 =null;

        HiveParser_IdentifiersParser.expression_return expression49 =null;


        CommonTree KW_CLUSTER38_tree=null;
        CommonTree KW_BY39_tree=null;
        CommonTree LPAREN40_tree=null;
        CommonTree COMMA42_tree=null;
        CommonTree RPAREN44_tree=null;
        CommonTree KW_CLUSTER45_tree=null;
        CommonTree KW_BY46_tree=null;
        CommonTree COMMA48_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_CLUSTER=new RewriteRuleTokenStream(adaptor,"token KW_CLUSTER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         gParent.msgs.push("cluster by clause"); 
        try {
            // IdentifiersParser.g:121:5: ( KW_CLUSTER KW_BY LPAREN expression ( COMMA expression )* RPAREN -> ^( TOK_CLUSTERBY ( expression )+ ) | KW_CLUSTER KW_BY expression ( ( COMMA )=> COMMA expression )* -> ^( TOK_CLUSTERBY ( expression )+ ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==KW_CLUSTER) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==KW_BY) ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==LPAREN) ) {
                        alt12=1;
                    }
                    else if ( (LA12_2==BigintLiteral||LA12_2==CharSetName||LA12_2==DecimalLiteral||(LA12_2 >= Identifier && LA12_2 <= KW_ADD)||LA12_2==KW_AFTER||(LA12_2 >= KW_ALTER && LA12_2 <= KW_ANALYZE)||(LA12_2 >= KW_ARCHIVE && LA12_2 <= KW_CHANGE)||(LA12_2 >= KW_CLUSTER && LA12_2 <= KW_CLUSTERSTATUS)||LA12_2==KW_COLLECTION||(LA12_2 >= KW_COLUMNS && LA12_2 <= KW_CONCATENATE)||LA12_2==KW_CONTINUE||LA12_2==KW_CREATE||LA12_2==KW_CUBE||(LA12_2 >= KW_CURSOR && LA12_2 <= KW_DATA)||(LA12_2 >= KW_DATABASES && LA12_2 <= KW_DISTANCE)||(LA12_2 >= KW_DISTRIBUTE && LA12_2 <= KW_DOUBLE)||(LA12_2 >= KW_DROP && LA12_2 <= KW_ELEM_TYPE)||LA12_2==KW_ENABLE||LA12_2==KW_ESCAPED||LA12_2==KW_EXCLUSIVE||(LA12_2 >= KW_EXISTS && LA12_2 <= KW_EXPORT)||(LA12_2 >= KW_EXTERNAL && LA12_2 <= KW_FLOAT)||(LA12_2 >= KW_FOR && LA12_2 <= KW_FORMATTED)||LA12_2==KW_FULL||(LA12_2 >= KW_FUNCTIONS && LA12_2 <= KW_GROUPING)||(LA12_2 >= KW_HOLD_DDLTIME && LA12_2 <= KW_INTERSECT)||(LA12_2 >= KW_INTO && LA12_2 <= KW_ITEMS)||(LA12_2 >= KW_KEYS && LA12_2 <= KW_LENGTH)||(LA12_2 >= KW_LIKE && LA12_2 <= KW_LONG)||(LA12_2 >= KW_MAP && LA12_2 <= KW_MINUS)||(LA12_2 >= KW_MSCK && LA12_2 <= KW_OFFLINE)||LA12_2==KW_OPTION||(LA12_2 >= KW_ORCFILE && LA12_2 <= KW_OUTPUTFORMAT)||LA12_2==KW_OVERWRITE||(LA12_2 >= KW_PARTITION && LA12_2 <= KW_PLUS)||(LA12_2 >= KW_PRETTY && LA12_2 <= KW_PROCEDURE)||(LA12_2 >= KW_PROTECTION && LA12_2 <= KW_RECORDWRITER)||(LA12_2 >= KW_REGEXP && LA12_2 <= KW_SCHEMAS)||(LA12_2 >= KW_SEMI && LA12_2 <= KW_STRUCT)||(LA12_2 >= KW_TABLE && LA12_2 <= KW_TABLES)||(LA12_2 >= KW_TBLPROPERTIES && LA12_2 <= KW_TEXTFILE)||(LA12_2 >= KW_TIMESTAMP && LA12_2 <= KW_TOUCH)||(LA12_2 >= KW_TRIGGER && LA12_2 <= KW_UNARCHIVE)||(LA12_2 >= KW_UNDO && LA12_2 <= KW_UNIONTYPE)||(LA12_2 >= KW_UNLOCK && LA12_2 <= KW_UPDATE)||(LA12_2 >= KW_USE && LA12_2 <= KW_VIEW)||LA12_2==KW_WHILE||LA12_2==KW_WITH||LA12_2==LSQUARE||LA12_2==MINUS||(LA12_2 >= Number && LA12_2 <= PLUS)||(LA12_2 >= SmallintLiteral && LA12_2 <= TinyintLiteral)) ) {
                        alt12=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // IdentifiersParser.g:122:5: KW_CLUSTER KW_BY LPAREN expression ( COMMA expression )* RPAREN
                    {
                    KW_CLUSTER38=(Token)match(input,KW_CLUSTER,FOLLOW_KW_CLUSTER_in_clusterByClause559); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_CLUSTER.add(KW_CLUSTER38);


                    KW_BY39=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_clusterByClause561); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY39);


                    LPAREN40=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_clusterByClause567); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN40);


                    pushFollow(FOLLOW_expression_in_clusterByClause569);
                    expression41=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression41.getTree());

                    // IdentifiersParser.g:123:23: ( COMMA expression )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==COMMA) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // IdentifiersParser.g:123:24: COMMA expression
                    	    {
                    	    COMMA42=(Token)match(input,COMMA,FOLLOW_COMMA_in_clusterByClause572); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA42);


                    	    pushFollow(FOLLOW_expression_in_clusterByClause574);
                    	    expression43=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression43.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    RPAREN44=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_clusterByClause578); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN44);


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
                    // 123:50: -> ^( TOK_CLUSTERBY ( expression )+ )
                    {
                        // IdentifiersParser.g:123:53: ^( TOK_CLUSTERBY ( expression )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_CLUSTERBY, "TOK_CLUSTERBY")
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
                    break;
                case 2 :
                    // IdentifiersParser.g:125:5: KW_CLUSTER KW_BY expression ( ( COMMA )=> COMMA expression )*
                    {
                    KW_CLUSTER45=(Token)match(input,KW_CLUSTER,FOLLOW_KW_CLUSTER_in_clusterByClause599); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_CLUSTER.add(KW_CLUSTER45);


                    KW_BY46=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_clusterByClause601); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY46);


                    pushFollow(FOLLOW_expression_in_clusterByClause607);
                    expression47=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression47.getTree());

                    // IdentifiersParser.g:127:5: ( ( COMMA )=> COMMA expression )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==COMMA) && (synpred1_IdentifiersParser())) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // IdentifiersParser.g:127:7: ( COMMA )=> COMMA expression
                    	    {
                    	    COMMA48=(Token)match(input,COMMA,FOLLOW_COMMA_in_clusterByClause619); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA48);


                    	    pushFollow(FOLLOW_expression_in_clusterByClause621);
                    	    expression49=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression49.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
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
                    // 127:36: -> ^( TOK_CLUSTERBY ( expression )+ )
                    {
                        // IdentifiersParser.g:127:39: ^( TOK_CLUSTERBY ( expression )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_CLUSTERBY, "TOK_CLUSTERBY")
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
    // $ANTLR end "clusterByClause"


    public static class partitionByClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "partitionByClause"
    // IdentifiersParser.g:130:1: partitionByClause : ( KW_PARTITION KW_BY LPAREN expression ( COMMA expression )* RPAREN -> ^( TOK_DISTRIBUTEBY ( expression )+ ) | KW_PARTITION KW_BY expression ( ( COMMA )=> COMMA expression )* -> ^( TOK_DISTRIBUTEBY ( expression )+ ) );
    public final HiveParser_IdentifiersParser.partitionByClause_return partitionByClause() throws RecognitionException {
        HiveParser_IdentifiersParser.partitionByClause_return retval = new HiveParser_IdentifiersParser.partitionByClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_PARTITION50=null;
        Token KW_BY51=null;
        Token LPAREN52=null;
        Token COMMA54=null;
        Token RPAREN56=null;
        Token KW_PARTITION57=null;
        Token KW_BY58=null;
        Token COMMA60=null;
        HiveParser_IdentifiersParser.expression_return expression53 =null;

        HiveParser_IdentifiersParser.expression_return expression55 =null;

        HiveParser_IdentifiersParser.expression_return expression59 =null;

        HiveParser_IdentifiersParser.expression_return expression61 =null;


        CommonTree KW_PARTITION50_tree=null;
        CommonTree KW_BY51_tree=null;
        CommonTree LPAREN52_tree=null;
        CommonTree COMMA54_tree=null;
        CommonTree RPAREN56_tree=null;
        CommonTree KW_PARTITION57_tree=null;
        CommonTree KW_BY58_tree=null;
        CommonTree COMMA60_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_PARTITION=new RewriteRuleTokenStream(adaptor,"token KW_PARTITION");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         gParent.msgs.push("partition by clause"); 
        try {
            // IdentifiersParser.g:133:5: ( KW_PARTITION KW_BY LPAREN expression ( COMMA expression )* RPAREN -> ^( TOK_DISTRIBUTEBY ( expression )+ ) | KW_PARTITION KW_BY expression ( ( COMMA )=> COMMA expression )* -> ^( TOK_DISTRIBUTEBY ( expression )+ ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==KW_PARTITION) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==KW_BY) ) {
                    int LA15_2 = input.LA(3);

                    if ( (LA15_2==LPAREN) ) {
                        alt15=1;
                    }
                    else if ( (LA15_2==BigintLiteral||LA15_2==CharSetName||LA15_2==DecimalLiteral||(LA15_2 >= Identifier && LA15_2 <= KW_ADD)||LA15_2==KW_AFTER||(LA15_2 >= KW_ALTER && LA15_2 <= KW_ANALYZE)||(LA15_2 >= KW_ARCHIVE && LA15_2 <= KW_CHANGE)||(LA15_2 >= KW_CLUSTER && LA15_2 <= KW_CLUSTERSTATUS)||LA15_2==KW_COLLECTION||(LA15_2 >= KW_COLUMNS && LA15_2 <= KW_CONCATENATE)||LA15_2==KW_CONTINUE||LA15_2==KW_CREATE||LA15_2==KW_CUBE||(LA15_2 >= KW_CURSOR && LA15_2 <= KW_DATA)||(LA15_2 >= KW_DATABASES && LA15_2 <= KW_DISTANCE)||(LA15_2 >= KW_DISTRIBUTE && LA15_2 <= KW_DOUBLE)||(LA15_2 >= KW_DROP && LA15_2 <= KW_ELEM_TYPE)||LA15_2==KW_ENABLE||LA15_2==KW_ESCAPED||LA15_2==KW_EXCLUSIVE||(LA15_2 >= KW_EXISTS && LA15_2 <= KW_EXPORT)||(LA15_2 >= KW_EXTERNAL && LA15_2 <= KW_FLOAT)||(LA15_2 >= KW_FOR && LA15_2 <= KW_FORMATTED)||LA15_2==KW_FULL||(LA15_2 >= KW_FUNCTIONS && LA15_2 <= KW_GROUPING)||(LA15_2 >= KW_HOLD_DDLTIME && LA15_2 <= KW_INTERSECT)||(LA15_2 >= KW_INTO && LA15_2 <= KW_ITEMS)||(LA15_2 >= KW_KEYS && LA15_2 <= KW_LENGTH)||(LA15_2 >= KW_LIKE && LA15_2 <= KW_LONG)||(LA15_2 >= KW_MAP && LA15_2 <= KW_MINUS)||(LA15_2 >= KW_MSCK && LA15_2 <= KW_OFFLINE)||LA15_2==KW_OPTION||(LA15_2 >= KW_ORCFILE && LA15_2 <= KW_OUTPUTFORMAT)||LA15_2==KW_OVERWRITE||(LA15_2 >= KW_PARTITION && LA15_2 <= KW_PLUS)||(LA15_2 >= KW_PRETTY && LA15_2 <= KW_PROCEDURE)||(LA15_2 >= KW_PROTECTION && LA15_2 <= KW_RECORDWRITER)||(LA15_2 >= KW_REGEXP && LA15_2 <= KW_SCHEMAS)||(LA15_2 >= KW_SEMI && LA15_2 <= KW_STRUCT)||(LA15_2 >= KW_TABLE && LA15_2 <= KW_TABLES)||(LA15_2 >= KW_TBLPROPERTIES && LA15_2 <= KW_TEXTFILE)||(LA15_2 >= KW_TIMESTAMP && LA15_2 <= KW_TOUCH)||(LA15_2 >= KW_TRIGGER && LA15_2 <= KW_UNARCHIVE)||(LA15_2 >= KW_UNDO && LA15_2 <= KW_UNIONTYPE)||(LA15_2 >= KW_UNLOCK && LA15_2 <= KW_UPDATE)||(LA15_2 >= KW_USE && LA15_2 <= KW_VIEW)||LA15_2==KW_WHILE||LA15_2==KW_WITH||LA15_2==LSQUARE||LA15_2==MINUS||(LA15_2 >= Number && LA15_2 <= PLUS)||(LA15_2 >= SmallintLiteral && LA15_2 <= TinyintLiteral)) ) {
                        alt15=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // IdentifiersParser.g:134:5: KW_PARTITION KW_BY LPAREN expression ( COMMA expression )* RPAREN
                    {
                    KW_PARTITION50=(Token)match(input,KW_PARTITION,FOLLOW_KW_PARTITION_in_partitionByClause665); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_PARTITION.add(KW_PARTITION50);


                    KW_BY51=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_partitionByClause667); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY51);


                    LPAREN52=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_partitionByClause673); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN52);


                    pushFollow(FOLLOW_expression_in_partitionByClause675);
                    expression53=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression53.getTree());

                    // IdentifiersParser.g:135:23: ( COMMA expression )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==COMMA) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // IdentifiersParser.g:135:24: COMMA expression
                    	    {
                    	    COMMA54=(Token)match(input,COMMA,FOLLOW_COMMA_in_partitionByClause678); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA54);


                    	    pushFollow(FOLLOW_expression_in_partitionByClause680);
                    	    expression55=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression55.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    RPAREN56=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_partitionByClause684); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN56);


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
                    // 135:50: -> ^( TOK_DISTRIBUTEBY ( expression )+ )
                    {
                        // IdentifiersParser.g:135:53: ^( TOK_DISTRIBUTEBY ( expression )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_DISTRIBUTEBY, "TOK_DISTRIBUTEBY")
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
                    break;
                case 2 :
                    // IdentifiersParser.g:137:5: KW_PARTITION KW_BY expression ( ( COMMA )=> COMMA expression )*
                    {
                    KW_PARTITION57=(Token)match(input,KW_PARTITION,FOLLOW_KW_PARTITION_in_partitionByClause705); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_PARTITION.add(KW_PARTITION57);


                    KW_BY58=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_partitionByClause707); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY58);


                    pushFollow(FOLLOW_expression_in_partitionByClause713);
                    expression59=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression59.getTree());

                    // IdentifiersParser.g:138:16: ( ( COMMA )=> COMMA expression )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==COMMA) && (synpred2_IdentifiersParser())) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // IdentifiersParser.g:138:17: ( COMMA )=> COMMA expression
                    	    {
                    	    COMMA60=(Token)match(input,COMMA,FOLLOW_COMMA_in_partitionByClause721); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA60);


                    	    pushFollow(FOLLOW_expression_in_partitionByClause723);
                    	    expression61=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression61.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
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
                    // 138:46: -> ^( TOK_DISTRIBUTEBY ( expression )+ )
                    {
                        // IdentifiersParser.g:138:49: ^( TOK_DISTRIBUTEBY ( expression )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_DISTRIBUTEBY, "TOK_DISTRIBUTEBY")
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
    // $ANTLR end "partitionByClause"


    public static class distributeByClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "distributeByClause"
    // IdentifiersParser.g:141:1: distributeByClause : ( KW_DISTRIBUTE KW_BY LPAREN expression ( COMMA expression )* RPAREN -> ^( TOK_DISTRIBUTEBY ( expression )+ ) | KW_DISTRIBUTE KW_BY expression ( ( COMMA )=> COMMA expression )* -> ^( TOK_DISTRIBUTEBY ( expression )+ ) );
    public final HiveParser_IdentifiersParser.distributeByClause_return distributeByClause() throws RecognitionException {
        HiveParser_IdentifiersParser.distributeByClause_return retval = new HiveParser_IdentifiersParser.distributeByClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_DISTRIBUTE62=null;
        Token KW_BY63=null;
        Token LPAREN64=null;
        Token COMMA66=null;
        Token RPAREN68=null;
        Token KW_DISTRIBUTE69=null;
        Token KW_BY70=null;
        Token COMMA72=null;
        HiveParser_IdentifiersParser.expression_return expression65 =null;

        HiveParser_IdentifiersParser.expression_return expression67 =null;

        HiveParser_IdentifiersParser.expression_return expression71 =null;

        HiveParser_IdentifiersParser.expression_return expression73 =null;


        CommonTree KW_DISTRIBUTE62_tree=null;
        CommonTree KW_BY63_tree=null;
        CommonTree LPAREN64_tree=null;
        CommonTree COMMA66_tree=null;
        CommonTree RPAREN68_tree=null;
        CommonTree KW_DISTRIBUTE69_tree=null;
        CommonTree KW_BY70_tree=null;
        CommonTree COMMA72_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_DISTRIBUTE=new RewriteRuleTokenStream(adaptor,"token KW_DISTRIBUTE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         gParent.msgs.push("distribute by clause"); 
        try {
            // IdentifiersParser.g:144:5: ( KW_DISTRIBUTE KW_BY LPAREN expression ( COMMA expression )* RPAREN -> ^( TOK_DISTRIBUTEBY ( expression )+ ) | KW_DISTRIBUTE KW_BY expression ( ( COMMA )=> COMMA expression )* -> ^( TOK_DISTRIBUTEBY ( expression )+ ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==KW_DISTRIBUTE) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==KW_BY) ) {
                    int LA18_2 = input.LA(3);

                    if ( (LA18_2==LPAREN) ) {
                        alt18=1;
                    }
                    else if ( (LA18_2==BigintLiteral||LA18_2==CharSetName||LA18_2==DecimalLiteral||(LA18_2 >= Identifier && LA18_2 <= KW_ADD)||LA18_2==KW_AFTER||(LA18_2 >= KW_ALTER && LA18_2 <= KW_ANALYZE)||(LA18_2 >= KW_ARCHIVE && LA18_2 <= KW_CHANGE)||(LA18_2 >= KW_CLUSTER && LA18_2 <= KW_CLUSTERSTATUS)||LA18_2==KW_COLLECTION||(LA18_2 >= KW_COLUMNS && LA18_2 <= KW_CONCATENATE)||LA18_2==KW_CONTINUE||LA18_2==KW_CREATE||LA18_2==KW_CUBE||(LA18_2 >= KW_CURSOR && LA18_2 <= KW_DATA)||(LA18_2 >= KW_DATABASES && LA18_2 <= KW_DISTANCE)||(LA18_2 >= KW_DISTRIBUTE && LA18_2 <= KW_DOUBLE)||(LA18_2 >= KW_DROP && LA18_2 <= KW_ELEM_TYPE)||LA18_2==KW_ENABLE||LA18_2==KW_ESCAPED||LA18_2==KW_EXCLUSIVE||(LA18_2 >= KW_EXISTS && LA18_2 <= KW_EXPORT)||(LA18_2 >= KW_EXTERNAL && LA18_2 <= KW_FLOAT)||(LA18_2 >= KW_FOR && LA18_2 <= KW_FORMATTED)||LA18_2==KW_FULL||(LA18_2 >= KW_FUNCTIONS && LA18_2 <= KW_GROUPING)||(LA18_2 >= KW_HOLD_DDLTIME && LA18_2 <= KW_INTERSECT)||(LA18_2 >= KW_INTO && LA18_2 <= KW_ITEMS)||(LA18_2 >= KW_KEYS && LA18_2 <= KW_LENGTH)||(LA18_2 >= KW_LIKE && LA18_2 <= KW_LONG)||(LA18_2 >= KW_MAP && LA18_2 <= KW_MINUS)||(LA18_2 >= KW_MSCK && LA18_2 <= KW_OFFLINE)||LA18_2==KW_OPTION||(LA18_2 >= KW_ORCFILE && LA18_2 <= KW_OUTPUTFORMAT)||LA18_2==KW_OVERWRITE||(LA18_2 >= KW_PARTITION && LA18_2 <= KW_PLUS)||(LA18_2 >= KW_PRETTY && LA18_2 <= KW_PROCEDURE)||(LA18_2 >= KW_PROTECTION && LA18_2 <= KW_RECORDWRITER)||(LA18_2 >= KW_REGEXP && LA18_2 <= KW_SCHEMAS)||(LA18_2 >= KW_SEMI && LA18_2 <= KW_STRUCT)||(LA18_2 >= KW_TABLE && LA18_2 <= KW_TABLES)||(LA18_2 >= KW_TBLPROPERTIES && LA18_2 <= KW_TEXTFILE)||(LA18_2 >= KW_TIMESTAMP && LA18_2 <= KW_TOUCH)||(LA18_2 >= KW_TRIGGER && LA18_2 <= KW_UNARCHIVE)||(LA18_2 >= KW_UNDO && LA18_2 <= KW_UNIONTYPE)||(LA18_2 >= KW_UNLOCK && LA18_2 <= KW_UPDATE)||(LA18_2 >= KW_USE && LA18_2 <= KW_VIEW)||LA18_2==KW_WHILE||LA18_2==KW_WITH||LA18_2==LSQUARE||LA18_2==MINUS||(LA18_2 >= Number && LA18_2 <= PLUS)||(LA18_2 >= SmallintLiteral && LA18_2 <= TinyintLiteral)) ) {
                        alt18=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // IdentifiersParser.g:145:5: KW_DISTRIBUTE KW_BY LPAREN expression ( COMMA expression )* RPAREN
                    {
                    KW_DISTRIBUTE62=(Token)match(input,KW_DISTRIBUTE,FOLLOW_KW_DISTRIBUTE_in_distributeByClause765); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_DISTRIBUTE.add(KW_DISTRIBUTE62);


                    KW_BY63=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_distributeByClause767); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY63);


                    LPAREN64=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_distributeByClause773); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN64);


                    pushFollow(FOLLOW_expression_in_distributeByClause775);
                    expression65=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression65.getTree());

                    // IdentifiersParser.g:146:23: ( COMMA expression )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMA) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // IdentifiersParser.g:146:24: COMMA expression
                    	    {
                    	    COMMA66=(Token)match(input,COMMA,FOLLOW_COMMA_in_distributeByClause778); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA66);


                    	    pushFollow(FOLLOW_expression_in_distributeByClause780);
                    	    expression67=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression67.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    RPAREN68=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_distributeByClause784); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN68);


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
                    // 146:50: -> ^( TOK_DISTRIBUTEBY ( expression )+ )
                    {
                        // IdentifiersParser.g:146:53: ^( TOK_DISTRIBUTEBY ( expression )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_DISTRIBUTEBY, "TOK_DISTRIBUTEBY")
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
                    break;
                case 2 :
                    // IdentifiersParser.g:148:5: KW_DISTRIBUTE KW_BY expression ( ( COMMA )=> COMMA expression )*
                    {
                    KW_DISTRIBUTE69=(Token)match(input,KW_DISTRIBUTE,FOLLOW_KW_DISTRIBUTE_in_distributeByClause805); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_DISTRIBUTE.add(KW_DISTRIBUTE69);


                    KW_BY70=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_distributeByClause807); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY70);


                    pushFollow(FOLLOW_expression_in_distributeByClause813);
                    expression71=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression71.getTree());

                    // IdentifiersParser.g:149:16: ( ( COMMA )=> COMMA expression )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==COMMA) && (synpred3_IdentifiersParser())) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // IdentifiersParser.g:149:17: ( COMMA )=> COMMA expression
                    	    {
                    	    COMMA72=(Token)match(input,COMMA,FOLLOW_COMMA_in_distributeByClause821); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA72);


                    	    pushFollow(FOLLOW_expression_in_distributeByClause823);
                    	    expression73=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression73.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
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
                    // 149:46: -> ^( TOK_DISTRIBUTEBY ( expression )+ )
                    {
                        // IdentifiersParser.g:149:49: ^( TOK_DISTRIBUTEBY ( expression )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_DISTRIBUTEBY, "TOK_DISTRIBUTEBY")
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
    // $ANTLR end "distributeByClause"


    public static class sortByClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sortByClause"
    // IdentifiersParser.g:152:1: sortByClause : ( KW_SORT KW_BY LPAREN columnRefOrder ( COMMA columnRefOrder )* RPAREN -> ^( TOK_SORTBY ( columnRefOrder )+ ) | KW_SORT KW_BY columnRefOrder ( ( COMMA )=> COMMA columnRefOrder )* -> ^( TOK_SORTBY ( columnRefOrder )+ ) );
    public final HiveParser_IdentifiersParser.sortByClause_return sortByClause() throws RecognitionException {
        HiveParser_IdentifiersParser.sortByClause_return retval = new HiveParser_IdentifiersParser.sortByClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_SORT74=null;
        Token KW_BY75=null;
        Token LPAREN76=null;
        Token COMMA78=null;
        Token RPAREN80=null;
        Token KW_SORT81=null;
        Token KW_BY82=null;
        Token COMMA84=null;
        HiveParser.columnRefOrder_return columnRefOrder77 =null;

        HiveParser.columnRefOrder_return columnRefOrder79 =null;

        HiveParser.columnRefOrder_return columnRefOrder83 =null;

        HiveParser.columnRefOrder_return columnRefOrder85 =null;


        CommonTree KW_SORT74_tree=null;
        CommonTree KW_BY75_tree=null;
        CommonTree LPAREN76_tree=null;
        CommonTree COMMA78_tree=null;
        CommonTree RPAREN80_tree=null;
        CommonTree KW_SORT81_tree=null;
        CommonTree KW_BY82_tree=null;
        CommonTree COMMA84_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_SORT=new RewriteRuleTokenStream(adaptor,"token KW_SORT");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
        RewriteRuleSubtreeStream stream_columnRefOrder=new RewriteRuleSubtreeStream(adaptor,"rule columnRefOrder");
         gParent.msgs.push("sort by clause"); 
        try {
            // IdentifiersParser.g:155:5: ( KW_SORT KW_BY LPAREN columnRefOrder ( COMMA columnRefOrder )* RPAREN -> ^( TOK_SORTBY ( columnRefOrder )+ ) | KW_SORT KW_BY columnRefOrder ( ( COMMA )=> COMMA columnRefOrder )* -> ^( TOK_SORTBY ( columnRefOrder )+ ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==KW_SORT) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==KW_BY) ) {
                    int LA21_2 = input.LA(3);

                    if ( (LA21_2==LPAREN) ) {
                        alt21=1;
                    }
                    else if ( (LA21_2==BigintLiteral||LA21_2==CharSetName||LA21_2==DecimalLiteral||(LA21_2 >= Identifier && LA21_2 <= KW_ADD)||LA21_2==KW_AFTER||(LA21_2 >= KW_ALTER && LA21_2 <= KW_ANALYZE)||(LA21_2 >= KW_ARCHIVE && LA21_2 <= KW_CHANGE)||(LA21_2 >= KW_CLUSTER && LA21_2 <= KW_CLUSTERSTATUS)||LA21_2==KW_COLLECTION||(LA21_2 >= KW_COLUMNS && LA21_2 <= KW_CONCATENATE)||LA21_2==KW_CONTINUE||LA21_2==KW_CREATE||LA21_2==KW_CUBE||(LA21_2 >= KW_CURSOR && LA21_2 <= KW_DATA)||(LA21_2 >= KW_DATABASES && LA21_2 <= KW_DISTANCE)||(LA21_2 >= KW_DISTRIBUTE && LA21_2 <= KW_DOUBLE)||(LA21_2 >= KW_DROP && LA21_2 <= KW_ELEM_TYPE)||LA21_2==KW_ENABLE||LA21_2==KW_ESCAPED||LA21_2==KW_EXCLUSIVE||(LA21_2 >= KW_EXISTS && LA21_2 <= KW_EXPORT)||(LA21_2 >= KW_EXTERNAL && LA21_2 <= KW_FLOAT)||(LA21_2 >= KW_FOR && LA21_2 <= KW_FORMATTED)||LA21_2==KW_FULL||(LA21_2 >= KW_FUNCTIONS && LA21_2 <= KW_GROUPING)||(LA21_2 >= KW_HOLD_DDLTIME && LA21_2 <= KW_INTERSECT)||(LA21_2 >= KW_INTO && LA21_2 <= KW_ITEMS)||(LA21_2 >= KW_KEYS && LA21_2 <= KW_LENGTH)||(LA21_2 >= KW_LIKE && LA21_2 <= KW_LONG)||(LA21_2 >= KW_MAP && LA21_2 <= KW_MINUS)||(LA21_2 >= KW_MSCK && LA21_2 <= KW_OFFLINE)||LA21_2==KW_OPTION||(LA21_2 >= KW_ORCFILE && LA21_2 <= KW_OUTPUTFORMAT)||LA21_2==KW_OVERWRITE||(LA21_2 >= KW_PARTITION && LA21_2 <= KW_PLUS)||(LA21_2 >= KW_PRETTY && LA21_2 <= KW_PROCEDURE)||(LA21_2 >= KW_PROTECTION && LA21_2 <= KW_RECORDWRITER)||(LA21_2 >= KW_REGEXP && LA21_2 <= KW_SCHEMAS)||(LA21_2 >= KW_SEMI && LA21_2 <= KW_STRUCT)||(LA21_2 >= KW_TABLE && LA21_2 <= KW_TABLES)||(LA21_2 >= KW_TBLPROPERTIES && LA21_2 <= KW_TEXTFILE)||(LA21_2 >= KW_TIMESTAMP && LA21_2 <= KW_TOUCH)||(LA21_2 >= KW_TRIGGER && LA21_2 <= KW_UNARCHIVE)||(LA21_2 >= KW_UNDO && LA21_2 <= KW_UNIONTYPE)||(LA21_2 >= KW_UNLOCK && LA21_2 <= KW_UPDATE)||(LA21_2 >= KW_USE && LA21_2 <= KW_VIEW)||LA21_2==KW_WHILE||LA21_2==KW_WITH||LA21_2==LSQUARE||LA21_2==MINUS||(LA21_2 >= Number && LA21_2 <= PLUS)||(LA21_2 >= SmallintLiteral && LA21_2 <= TinyintLiteral)) ) {
                        alt21=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // IdentifiersParser.g:156:5: KW_SORT KW_BY LPAREN columnRefOrder ( COMMA columnRefOrder )* RPAREN
                    {
                    KW_SORT74=(Token)match(input,KW_SORT,FOLLOW_KW_SORT_in_sortByClause865); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SORT.add(KW_SORT74);


                    KW_BY75=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_sortByClause867); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY75);


                    LPAREN76=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_sortByClause873); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN76);


                    pushFollow(FOLLOW_columnRefOrder_in_sortByClause875);
                    columnRefOrder77=gHiveParser.columnRefOrder();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder77.getTree());

                    // IdentifiersParser.g:158:5: ( COMMA columnRefOrder )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==COMMA) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // IdentifiersParser.g:158:7: COMMA columnRefOrder
                    	    {
                    	    COMMA78=(Token)match(input,COMMA,FOLLOW_COMMA_in_sortByClause883); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA78);


                    	    pushFollow(FOLLOW_columnRefOrder_in_sortByClause885);
                    	    columnRefOrder79=gHiveParser.columnRefOrder();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder79.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    RPAREN80=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_sortByClause889); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN80);


                    // AST REWRITE
                    // elements: columnRefOrder
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 158:37: -> ^( TOK_SORTBY ( columnRefOrder )+ )
                    {
                        // IdentifiersParser.g:158:40: ^( TOK_SORTBY ( columnRefOrder )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_SORTBY, "TOK_SORTBY")
                        , root_1);

                        if ( !(stream_columnRefOrder.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_columnRefOrder.hasNext() ) {
                            adaptor.addChild(root_1, stream_columnRefOrder.nextTree());

                        }
                        stream_columnRefOrder.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:160:5: KW_SORT KW_BY columnRefOrder ( ( COMMA )=> COMMA columnRefOrder )*
                    {
                    KW_SORT81=(Token)match(input,KW_SORT,FOLLOW_KW_SORT_in_sortByClause910); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SORT.add(KW_SORT81);


                    KW_BY82=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_sortByClause912); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY82);


                    pushFollow(FOLLOW_columnRefOrder_in_sortByClause918);
                    columnRefOrder83=gHiveParser.columnRefOrder();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder83.getTree());

                    // IdentifiersParser.g:162:5: ( ( COMMA )=> COMMA columnRefOrder )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==COMMA) && (synpred4_IdentifiersParser())) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // IdentifiersParser.g:162:7: ( COMMA )=> COMMA columnRefOrder
                    	    {
                    	    COMMA84=(Token)match(input,COMMA,FOLLOW_COMMA_in_sortByClause931); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA84);


                    	    pushFollow(FOLLOW_columnRefOrder_in_sortByClause933);
                    	    columnRefOrder85=gHiveParser.columnRefOrder();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder85.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: columnRefOrder
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 162:40: -> ^( TOK_SORTBY ( columnRefOrder )+ )
                    {
                        // IdentifiersParser.g:162:43: ^( TOK_SORTBY ( columnRefOrder )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_SORTBY, "TOK_SORTBY")
                        , root_1);

                        if ( !(stream_columnRefOrder.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_columnRefOrder.hasNext() ) {
                            adaptor.addChild(root_1, stream_columnRefOrder.nextTree());

                        }
                        stream_columnRefOrder.reset();

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
    // $ANTLR end "sortByClause"


    public static class function_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function"
    // IdentifiersParser.g:166:1: function : functionName LPAREN ( (star= STAR ) | (dist= KW_DISTINCT )? ( selectExpression ( COMMA selectExpression )* )? ) RPAREN -> {$star != null}? ^( TOK_FUNCTIONSTAR functionName ) -> {$dist == null}? ^( TOK_FUNCTION functionName ( ( selectExpression )+ )? ) -> ^( TOK_FUNCTIONDI functionName ( ( selectExpression )+ )? ) ;
    public final HiveParser_IdentifiersParser.function_return function() throws RecognitionException {
        HiveParser_IdentifiersParser.function_return retval = new HiveParser_IdentifiersParser.function_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token star=null;
        Token dist=null;
        Token LPAREN87=null;
        Token COMMA89=null;
        Token RPAREN91=null;
        HiveParser_IdentifiersParser.functionName_return functionName86 =null;

        HiveParser_SelectClauseParser.selectExpression_return selectExpression88 =null;

        HiveParser_SelectClauseParser.selectExpression_return selectExpression90 =null;


        CommonTree star_tree=null;
        CommonTree dist_tree=null;
        CommonTree LPAREN87_tree=null;
        CommonTree COMMA89_tree=null;
        CommonTree RPAREN91_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_DISTINCT=new RewriteRuleTokenStream(adaptor,"token KW_DISTINCT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_selectExpression=new RewriteRuleSubtreeStream(adaptor,"rule selectExpression");
        RewriteRuleSubtreeStream stream_functionName=new RewriteRuleSubtreeStream(adaptor,"rule functionName");
         gParent.msgs.push("function specification"); 
        try {
            // IdentifiersParser.g:169:5: ( functionName LPAREN ( (star= STAR ) | (dist= KW_DISTINCT )? ( selectExpression ( COMMA selectExpression )* )? ) RPAREN -> {$star != null}? ^( TOK_FUNCTIONSTAR functionName ) -> {$dist == null}? ^( TOK_FUNCTION functionName ( ( selectExpression )+ )? ) -> ^( TOK_FUNCTIONDI functionName ( ( selectExpression )+ )? ) )
            // IdentifiersParser.g:170:5: functionName LPAREN ( (star= STAR ) | (dist= KW_DISTINCT )? ( selectExpression ( COMMA selectExpression )* )? ) RPAREN
            {
            pushFollow(FOLLOW_functionName_in_function976);
            functionName86=functionName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionName.add(functionName86.getTree());

            LPAREN87=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_function982); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN87);


            // IdentifiersParser.g:172:7: ( (star= STAR ) | (dist= KW_DISTINCT )? ( selectExpression ( COMMA selectExpression )* )? )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==STAR) ) {
                alt25=1;
            }
            else if ( (LA25_0==BigintLiteral||LA25_0==CharSetName||LA25_0==DecimalLiteral||(LA25_0 >= Identifier && LA25_0 <= KW_ADD)||LA25_0==KW_AFTER||(LA25_0 >= KW_ALTER && LA25_0 <= KW_ANALYZE)||(LA25_0 >= KW_ARCHIVE && LA25_0 <= KW_CHANGE)||(LA25_0 >= KW_CLUSTER && LA25_0 <= KW_CLUSTERSTATUS)||LA25_0==KW_COLLECTION||(LA25_0 >= KW_COLUMNS && LA25_0 <= KW_CONCATENATE)||LA25_0==KW_CONTINUE||LA25_0==KW_CREATE||LA25_0==KW_CUBE||(LA25_0 >= KW_CURSOR && LA25_0 <= KW_DATA)||(LA25_0 >= KW_DATABASES && LA25_0 <= KW_DOUBLE)||(LA25_0 >= KW_DROP && LA25_0 <= KW_ELEM_TYPE)||LA25_0==KW_ENABLE||LA25_0==KW_ESCAPED||LA25_0==KW_EXCLUSIVE||(LA25_0 >= KW_EXISTS && LA25_0 <= KW_EXPORT)||(LA25_0 >= KW_EXTERNAL && LA25_0 <= KW_FLOAT)||(LA25_0 >= KW_FOR && LA25_0 <= KW_FORMATTED)||LA25_0==KW_FULL||(LA25_0 >= KW_FUNCTIONS && LA25_0 <= KW_GROUPING)||(LA25_0 >= KW_HOLD_DDLTIME && LA25_0 <= KW_INTERSECT)||(LA25_0 >= KW_INTO && LA25_0 <= KW_ITEMS)||(LA25_0 >= KW_KEYS && LA25_0 <= KW_LENGTH)||(LA25_0 >= KW_LIKE && LA25_0 <= KW_LONG)||(LA25_0 >= KW_MAP && LA25_0 <= KW_MINUS)||(LA25_0 >= KW_MSCK && LA25_0 <= KW_OFFLINE)||LA25_0==KW_OPTION||(LA25_0 >= KW_ORCFILE && LA25_0 <= KW_OUTPUTFORMAT)||LA25_0==KW_OVERWRITE||(LA25_0 >= KW_PARTITION && LA25_0 <= KW_PLUS)||(LA25_0 >= KW_PRETTY && LA25_0 <= KW_PROCEDURE)||(LA25_0 >= KW_PROTECTION && LA25_0 <= KW_RECORDWRITER)||(LA25_0 >= KW_REGEXP && LA25_0 <= KW_SCHEMAS)||(LA25_0 >= KW_SEMI && LA25_0 <= KW_STRUCT)||(LA25_0 >= KW_TABLE && LA25_0 <= KW_TABLES)||(LA25_0 >= KW_TBLPROPERTIES && LA25_0 <= KW_TEXTFILE)||(LA25_0 >= KW_TIMESTAMP && LA25_0 <= KW_TOUCH)||(LA25_0 >= KW_TRIGGER && LA25_0 <= KW_UNARCHIVE)||(LA25_0 >= KW_UNDO && LA25_0 <= KW_UNIONTYPE)||(LA25_0 >= KW_UNLOCK && LA25_0 <= KW_UPDATE)||(LA25_0 >= KW_USE && LA25_0 <= KW_VIEW)||LA25_0==KW_WHILE||LA25_0==KW_WITH||(LA25_0 >= LPAREN && LA25_0 <= LSQUARE)||LA25_0==MINUS||(LA25_0 >= Number && LA25_0 <= PLUS)||LA25_0==RPAREN||(LA25_0 >= SmallintLiteral && LA25_0 <= TinyintLiteral)) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // IdentifiersParser.g:173:9: (star= STAR )
                    {
                    // IdentifiersParser.g:173:9: (star= STAR )
                    // IdentifiersParser.g:173:10: star= STAR
                    {
                    star=(Token)match(input,STAR,FOLLOW_STAR_in_function1003); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(star);


                    }


                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:174:11: (dist= KW_DISTINCT )? ( selectExpression ( COMMA selectExpression )* )?
                    {
                    // IdentifiersParser.g:174:11: (dist= KW_DISTINCT )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==KW_DISTINCT) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // IdentifiersParser.g:174:12: dist= KW_DISTINCT
                            {
                            dist=(Token)match(input,KW_DISTINCT,FOLLOW_KW_DISTINCT_in_function1019); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_DISTINCT.add(dist);


                            }
                            break;

                    }


                    // IdentifiersParser.g:174:31: ( selectExpression ( COMMA selectExpression )* )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==BigintLiteral||LA24_0==CharSetName||LA24_0==DecimalLiteral||(LA24_0 >= Identifier && LA24_0 <= KW_ADD)||LA24_0==KW_AFTER||(LA24_0 >= KW_ALTER && LA24_0 <= KW_ANALYZE)||(LA24_0 >= KW_ARCHIVE && LA24_0 <= KW_CHANGE)||(LA24_0 >= KW_CLUSTER && LA24_0 <= KW_CLUSTERSTATUS)||LA24_0==KW_COLLECTION||(LA24_0 >= KW_COLUMNS && LA24_0 <= KW_CONCATENATE)||LA24_0==KW_CONTINUE||LA24_0==KW_CREATE||LA24_0==KW_CUBE||(LA24_0 >= KW_CURSOR && LA24_0 <= KW_DATA)||(LA24_0 >= KW_DATABASES && LA24_0 <= KW_DISTANCE)||(LA24_0 >= KW_DISTRIBUTE && LA24_0 <= KW_DOUBLE)||(LA24_0 >= KW_DROP && LA24_0 <= KW_ELEM_TYPE)||LA24_0==KW_ENABLE||LA24_0==KW_ESCAPED||LA24_0==KW_EXCLUSIVE||(LA24_0 >= KW_EXISTS && LA24_0 <= KW_EXPORT)||(LA24_0 >= KW_EXTERNAL && LA24_0 <= KW_FLOAT)||(LA24_0 >= KW_FOR && LA24_0 <= KW_FORMATTED)||LA24_0==KW_FULL||(LA24_0 >= KW_FUNCTIONS && LA24_0 <= KW_GROUPING)||(LA24_0 >= KW_HOLD_DDLTIME && LA24_0 <= KW_INTERSECT)||(LA24_0 >= KW_INTO && LA24_0 <= KW_ITEMS)||(LA24_0 >= KW_KEYS && LA24_0 <= KW_LENGTH)||(LA24_0 >= KW_LIKE && LA24_0 <= KW_LONG)||(LA24_0 >= KW_MAP && LA24_0 <= KW_MINUS)||(LA24_0 >= KW_MSCK && LA24_0 <= KW_OFFLINE)||LA24_0==KW_OPTION||(LA24_0 >= KW_ORCFILE && LA24_0 <= KW_OUTPUTFORMAT)||LA24_0==KW_OVERWRITE||(LA24_0 >= KW_PARTITION && LA24_0 <= KW_PLUS)||(LA24_0 >= KW_PRETTY && LA24_0 <= KW_PROCEDURE)||(LA24_0 >= KW_PROTECTION && LA24_0 <= KW_RECORDWRITER)||(LA24_0 >= KW_REGEXP && LA24_0 <= KW_SCHEMAS)||(LA24_0 >= KW_SEMI && LA24_0 <= KW_STRUCT)||(LA24_0 >= KW_TABLE && LA24_0 <= KW_TABLES)||(LA24_0 >= KW_TBLPROPERTIES && LA24_0 <= KW_TEXTFILE)||(LA24_0 >= KW_TIMESTAMP && LA24_0 <= KW_TOUCH)||(LA24_0 >= KW_TRIGGER && LA24_0 <= KW_UNARCHIVE)||(LA24_0 >= KW_UNDO && LA24_0 <= KW_UNIONTYPE)||(LA24_0 >= KW_UNLOCK && LA24_0 <= KW_UPDATE)||(LA24_0 >= KW_USE && LA24_0 <= KW_VIEW)||LA24_0==KW_WHILE||LA24_0==KW_WITH||(LA24_0 >= LPAREN && LA24_0 <= LSQUARE)||LA24_0==MINUS||(LA24_0 >= Number && LA24_0 <= PLUS)||(LA24_0 >= STAR && LA24_0 <= TinyintLiteral)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // IdentifiersParser.g:174:32: selectExpression ( COMMA selectExpression )*
                            {
                            pushFollow(FOLLOW_selectExpression_in_function1024);
                            selectExpression88=gHiveParser.selectExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_selectExpression.add(selectExpression88.getTree());

                            // IdentifiersParser.g:174:49: ( COMMA selectExpression )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==COMMA) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // IdentifiersParser.g:174:50: COMMA selectExpression
                            	    {
                            	    COMMA89=(Token)match(input,COMMA,FOLLOW_COMMA_in_function1027); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA89);


                            	    pushFollow(FOLLOW_selectExpression_in_function1029);
                            	    selectExpression90=gHiveParser.selectExpression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_selectExpression.add(selectExpression90.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop23;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }


            RPAREN91=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function1047); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN91);


            // AST REWRITE
            // elements: selectExpression, functionName, selectExpression, functionName, functionName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 176:12: -> {$star != null}? ^( TOK_FUNCTIONSTAR functionName )
            if (star != null) {
                // IdentifiersParser.g:176:32: ^( TOK_FUNCTIONSTAR functionName )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_FUNCTIONSTAR, "TOK_FUNCTIONSTAR")
                , root_1);

                adaptor.addChild(root_1, stream_functionName.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 177:12: -> {$dist == null}? ^( TOK_FUNCTION functionName ( ( selectExpression )+ )? )
            if (dist == null) {
                // IdentifiersParser.g:177:32: ^( TOK_FUNCTION functionName ( ( selectExpression )+ )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
                , root_1);

                adaptor.addChild(root_1, stream_functionName.nextTree());

                // IdentifiersParser.g:177:60: ( ( selectExpression )+ )?
                if ( stream_selectExpression.hasNext() ) {
                    if ( !(stream_selectExpression.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_selectExpression.hasNext() ) {
                        adaptor.addChild(root_1, stream_selectExpression.nextTree());

                    }
                    stream_selectExpression.reset();

                }
                stream_selectExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 178:29: -> ^( TOK_FUNCTIONDI functionName ( ( selectExpression )+ )? )
            {
                // IdentifiersParser.g:178:32: ^( TOK_FUNCTIONDI functionName ( ( selectExpression )+ )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_FUNCTIONDI, "TOK_FUNCTIONDI")
                , root_1);

                adaptor.addChild(root_1, stream_functionName.nextTree());

                // IdentifiersParser.g:178:62: ( ( selectExpression )+ )?
                if ( stream_selectExpression.hasNext() ) {
                    if ( !(stream_selectExpression.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_selectExpression.hasNext() ) {
                        adaptor.addChild(root_1, stream_selectExpression.nextTree());

                    }
                    stream_selectExpression.reset();

                }
                stream_selectExpression.reset();

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
    // $ANTLR end "function"


    public static class functionName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionName"
    // IdentifiersParser.g:181:1: functionName : ( KW_IF | KW_ARRAY | KW_MAP | KW_STRUCT | KW_UNIONTYPE | identifier );
    public final HiveParser_IdentifiersParser.functionName_return functionName() throws RecognitionException {
        HiveParser_IdentifiersParser.functionName_return retval = new HiveParser_IdentifiersParser.functionName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_IF92=null;
        Token KW_ARRAY93=null;
        Token KW_MAP94=null;
        Token KW_STRUCT95=null;
        Token KW_UNIONTYPE96=null;
        HiveParser_IdentifiersParser.identifier_return identifier97 =null;


        CommonTree KW_IF92_tree=null;
        CommonTree KW_ARRAY93_tree=null;
        CommonTree KW_MAP94_tree=null;
        CommonTree KW_STRUCT95_tree=null;
        CommonTree KW_UNIONTYPE96_tree=null;

         gParent.msgs.push("function name"); 
        try {
            // IdentifiersParser.g:184:5: ( KW_IF | KW_ARRAY | KW_MAP | KW_STRUCT | KW_UNIONTYPE | identifier )
            int alt26=6;
            switch ( input.LA(1) ) {
            case KW_IF:
                {
                alt26=1;
                }
                break;
            case KW_ARRAY:
                {
                alt26=2;
                }
                break;
            case KW_MAP:
                {
                alt26=3;
                }
                break;
            case KW_STRUCT:
                {
                alt26=4;
                }
                break;
            case KW_UNIONTYPE:
                {
                alt26=5;
                }
                break;
            case Identifier:
            case KW_ADD:
            case KW_AFTER:
            case KW_ALTER:
            case KW_ANALYZE:
            case KW_ARCHIVE:
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
                alt26=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // IdentifiersParser.g:185:5: KW_IF
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    KW_IF92=(Token)match(input,KW_IF,FOLLOW_KW_IF_in_functionName1158); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_IF92_tree = 
                    (CommonTree)adaptor.create(KW_IF92)
                    ;
                    adaptor.addChild(root_0, KW_IF92_tree);
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:185:13: KW_ARRAY
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    KW_ARRAY93=(Token)match(input,KW_ARRAY,FOLLOW_KW_ARRAY_in_functionName1162); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ARRAY93_tree = 
                    (CommonTree)adaptor.create(KW_ARRAY93)
                    ;
                    adaptor.addChild(root_0, KW_ARRAY93_tree);
                    }

                    }
                    break;
                case 3 :
                    // IdentifiersParser.g:185:24: KW_MAP
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    KW_MAP94=(Token)match(input,KW_MAP,FOLLOW_KW_MAP_in_functionName1166); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_MAP94_tree = 
                    (CommonTree)adaptor.create(KW_MAP94)
                    ;
                    adaptor.addChild(root_0, KW_MAP94_tree);
                    }

                    }
                    break;
                case 4 :
                    // IdentifiersParser.g:185:33: KW_STRUCT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    KW_STRUCT95=(Token)match(input,KW_STRUCT,FOLLOW_KW_STRUCT_in_functionName1170); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_STRUCT95_tree = 
                    (CommonTree)adaptor.create(KW_STRUCT95)
                    ;
                    adaptor.addChild(root_0, KW_STRUCT95_tree);
                    }

                    }
                    break;
                case 5 :
                    // IdentifiersParser.g:185:45: KW_UNIONTYPE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    KW_UNIONTYPE96=(Token)match(input,KW_UNIONTYPE,FOLLOW_KW_UNIONTYPE_in_functionName1174); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_UNIONTYPE96_tree = 
                    (CommonTree)adaptor.create(KW_UNIONTYPE96)
                    ;
                    adaptor.addChild(root_0, KW_UNIONTYPE96_tree);
                    }

                    }
                    break;
                case 6 :
                    // IdentifiersParser.g:185:60: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_functionName1178);
                    identifier97=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier97.getTree());

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
    // $ANTLR end "functionName"


    public static class castExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "castExpression"
    // IdentifiersParser.g:188:1: castExpression : KW_CAST LPAREN expression KW_AS primitiveType RPAREN -> ^( TOK_FUNCTION primitiveType expression ) ;
    public final HiveParser_IdentifiersParser.castExpression_return castExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.castExpression_return retval = new HiveParser_IdentifiersParser.castExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_CAST98=null;
        Token LPAREN99=null;
        Token KW_AS101=null;
        Token RPAREN103=null;
        HiveParser_IdentifiersParser.expression_return expression100 =null;

        HiveParser.primitiveType_return primitiveType102 =null;


        CommonTree KW_CAST98_tree=null;
        CommonTree LPAREN99_tree=null;
        CommonTree KW_AS101_tree=null;
        CommonTree RPAREN103_tree=null;
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_CAST=new RewriteRuleTokenStream(adaptor,"token KW_CAST");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_primitiveType=new RewriteRuleSubtreeStream(adaptor,"rule primitiveType");
         gParent.msgs.push("cast expression"); 
        try {
            // IdentifiersParser.g:191:5: ( KW_CAST LPAREN expression KW_AS primitiveType RPAREN -> ^( TOK_FUNCTION primitiveType expression ) )
            // IdentifiersParser.g:192:5: KW_CAST LPAREN expression KW_AS primitiveType RPAREN
            {
            KW_CAST98=(Token)match(input,KW_CAST,FOLLOW_KW_CAST_in_castExpression1209); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CAST.add(KW_CAST98);


            LPAREN99=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_castExpression1215); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN99);


            pushFollow(FOLLOW_expression_in_castExpression1227);
            expression100=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression100.getTree());

            KW_AS101=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_castExpression1239); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS101);


            pushFollow(FOLLOW_primitiveType_in_castExpression1251);
            primitiveType102=gHiveParser.primitiveType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primitiveType.add(primitiveType102.getTree());

            RPAREN103=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_castExpression1257); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN103);


            // AST REWRITE
            // elements: expression, primitiveType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 197:12: -> ^( TOK_FUNCTION primitiveType expression )
            {
                // IdentifiersParser.g:197:15: ^( TOK_FUNCTION primitiveType expression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
                , root_1);

                adaptor.addChild(root_1, stream_primitiveType.nextTree());

                adaptor.addChild(root_1, stream_expression.nextTree());

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
    // $ANTLR end "castExpression"


    public static class caseExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "caseExpression"
    // IdentifiersParser.g:200:1: caseExpression : KW_CASE expression ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END -> ^( TOK_FUNCTION KW_CASE ( expression )* ) ;
    public final HiveParser_IdentifiersParser.caseExpression_return caseExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.caseExpression_return retval = new HiveParser_IdentifiersParser.caseExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_CASE104=null;
        Token KW_WHEN106=null;
        Token KW_THEN108=null;
        Token KW_ELSE110=null;
        Token KW_END112=null;
        HiveParser_IdentifiersParser.expression_return expression105 =null;

        HiveParser_IdentifiersParser.expression_return expression107 =null;

        HiveParser_IdentifiersParser.expression_return expression109 =null;

        HiveParser_IdentifiersParser.expression_return expression111 =null;


        CommonTree KW_CASE104_tree=null;
        CommonTree KW_WHEN106_tree=null;
        CommonTree KW_THEN108_tree=null;
        CommonTree KW_ELSE110_tree=null;
        CommonTree KW_END112_tree=null;
        RewriteRuleTokenStream stream_KW_THEN=new RewriteRuleTokenStream(adaptor,"token KW_THEN");
        RewriteRuleTokenStream stream_KW_CASE=new RewriteRuleTokenStream(adaptor,"token KW_CASE");
        RewriteRuleTokenStream stream_KW_WHEN=new RewriteRuleTokenStream(adaptor,"token KW_WHEN");
        RewriteRuleTokenStream stream_KW_END=new RewriteRuleTokenStream(adaptor,"token KW_END");
        RewriteRuleTokenStream stream_KW_ELSE=new RewriteRuleTokenStream(adaptor,"token KW_ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         gParent.msgs.push("case expression"); 
        try {
            // IdentifiersParser.g:203:5: ( KW_CASE expression ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END -> ^( TOK_FUNCTION KW_CASE ( expression )* ) )
            // IdentifiersParser.g:204:5: KW_CASE expression ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END
            {
            KW_CASE104=(Token)match(input,KW_CASE,FOLLOW_KW_CASE_in_caseExpression1298); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CASE.add(KW_CASE104);


            pushFollow(FOLLOW_expression_in_caseExpression1300);
            expression105=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression105.getTree());

            // IdentifiersParser.g:205:5: ( KW_WHEN expression KW_THEN expression )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==KW_WHEN) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // IdentifiersParser.g:205:6: KW_WHEN expression KW_THEN expression
            	    {
            	    KW_WHEN106=(Token)match(input,KW_WHEN,FOLLOW_KW_WHEN_in_caseExpression1307); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_KW_WHEN.add(KW_WHEN106);


            	    pushFollow(FOLLOW_expression_in_caseExpression1309);
            	    expression107=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression107.getTree());

            	    KW_THEN108=(Token)match(input,KW_THEN,FOLLOW_KW_THEN_in_caseExpression1311); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_KW_THEN.add(KW_THEN108);


            	    pushFollow(FOLLOW_expression_in_caseExpression1313);
            	    expression109=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression109.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            // IdentifiersParser.g:206:5: ( KW_ELSE expression )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==KW_ELSE) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // IdentifiersParser.g:206:6: KW_ELSE expression
                    {
                    KW_ELSE110=(Token)match(input,KW_ELSE,FOLLOW_KW_ELSE_in_caseExpression1322); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ELSE.add(KW_ELSE110);


                    pushFollow(FOLLOW_expression_in_caseExpression1324);
                    expression111=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression111.getTree());

                    }
                    break;

            }


            KW_END112=(Token)match(input,KW_END,FOLLOW_KW_END_in_caseExpression1332); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_END.add(KW_END112);


            // AST REWRITE
            // elements: expression, KW_CASE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 207:12: -> ^( TOK_FUNCTION KW_CASE ( expression )* )
            {
                // IdentifiersParser.g:207:15: ^( TOK_FUNCTION KW_CASE ( expression )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
                , root_1);

                adaptor.addChild(root_1, 
                stream_KW_CASE.nextNode()
                );

                // IdentifiersParser.g:207:38: ( expression )*
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
    // $ANTLR end "caseExpression"


    public static class whenExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whenExpression"
    // IdentifiersParser.g:210:1: whenExpression : KW_CASE ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END -> ^( TOK_FUNCTION KW_WHEN ( expression )* ) ;
    public final HiveParser_IdentifiersParser.whenExpression_return whenExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.whenExpression_return retval = new HiveParser_IdentifiersParser.whenExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_CASE113=null;
        Token KW_WHEN114=null;
        Token KW_THEN116=null;
        Token KW_ELSE118=null;
        Token KW_END120=null;
        HiveParser_IdentifiersParser.expression_return expression115 =null;

        HiveParser_IdentifiersParser.expression_return expression117 =null;

        HiveParser_IdentifiersParser.expression_return expression119 =null;


        CommonTree KW_CASE113_tree=null;
        CommonTree KW_WHEN114_tree=null;
        CommonTree KW_THEN116_tree=null;
        CommonTree KW_ELSE118_tree=null;
        CommonTree KW_END120_tree=null;
        RewriteRuleTokenStream stream_KW_THEN=new RewriteRuleTokenStream(adaptor,"token KW_THEN");
        RewriteRuleTokenStream stream_KW_CASE=new RewriteRuleTokenStream(adaptor,"token KW_CASE");
        RewriteRuleTokenStream stream_KW_WHEN=new RewriteRuleTokenStream(adaptor,"token KW_WHEN");
        RewriteRuleTokenStream stream_KW_END=new RewriteRuleTokenStream(adaptor,"token KW_END");
        RewriteRuleTokenStream stream_KW_ELSE=new RewriteRuleTokenStream(adaptor,"token KW_ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         gParent.msgs.push("case expression"); 
        try {
            // IdentifiersParser.g:213:5: ( KW_CASE ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END -> ^( TOK_FUNCTION KW_WHEN ( expression )* ) )
            // IdentifiersParser.g:214:5: KW_CASE ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END
            {
            KW_CASE113=(Token)match(input,KW_CASE,FOLLOW_KW_CASE_in_whenExpression1374); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CASE.add(KW_CASE113);


            // IdentifiersParser.g:215:6: ( KW_WHEN expression KW_THEN expression )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==KW_WHEN) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // IdentifiersParser.g:215:8: KW_WHEN expression KW_THEN expression
            	    {
            	    KW_WHEN114=(Token)match(input,KW_WHEN,FOLLOW_KW_WHEN_in_whenExpression1383); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_KW_WHEN.add(KW_WHEN114);


            	    pushFollow(FOLLOW_expression_in_whenExpression1385);
            	    expression115=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression115.getTree());

            	    KW_THEN116=(Token)match(input,KW_THEN,FOLLOW_KW_THEN_in_whenExpression1387); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_KW_THEN.add(KW_THEN116);


            	    pushFollow(FOLLOW_expression_in_whenExpression1389);
            	    expression117=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression117.getTree());

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


            // IdentifiersParser.g:216:5: ( KW_ELSE expression )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==KW_ELSE) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // IdentifiersParser.g:216:6: KW_ELSE expression
                    {
                    KW_ELSE118=(Token)match(input,KW_ELSE,FOLLOW_KW_ELSE_in_whenExpression1398); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ELSE.add(KW_ELSE118);


                    pushFollow(FOLLOW_expression_in_whenExpression1400);
                    expression119=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression119.getTree());

                    }
                    break;

            }


            KW_END120=(Token)match(input,KW_END,FOLLOW_KW_END_in_whenExpression1408); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_END.add(KW_END120);


            // AST REWRITE
            // elements: expression, KW_WHEN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 217:12: -> ^( TOK_FUNCTION KW_WHEN ( expression )* )
            {
                // IdentifiersParser.g:217:15: ^( TOK_FUNCTION KW_WHEN ( expression )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
                , root_1);

                adaptor.addChild(root_1, 
                stream_KW_WHEN.nextNode()
                );

                // IdentifiersParser.g:217:38: ( expression )*
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
    // $ANTLR end "whenExpression"


    public static class constant_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constant"
    // IdentifiersParser.g:220:1: constant : ( Number | dateLiteral | StringLiteral | stringLiteralSequence | BigintLiteral | SmallintLiteral | TinyintLiteral | DecimalLiteral | charSetStringLiteral | booleanValue );
    public final HiveParser_IdentifiersParser.constant_return constant() throws RecognitionException {
        HiveParser_IdentifiersParser.constant_return retval = new HiveParser_IdentifiersParser.constant_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token Number121=null;
        Token StringLiteral123=null;
        Token BigintLiteral125=null;
        Token SmallintLiteral126=null;
        Token TinyintLiteral127=null;
        Token DecimalLiteral128=null;
        HiveParser_IdentifiersParser.dateLiteral_return dateLiteral122 =null;

        HiveParser_IdentifiersParser.stringLiteralSequence_return stringLiteralSequence124 =null;

        HiveParser_IdentifiersParser.charSetStringLiteral_return charSetStringLiteral129 =null;

        HiveParser_IdentifiersParser.booleanValue_return booleanValue130 =null;


        CommonTree Number121_tree=null;
        CommonTree StringLiteral123_tree=null;
        CommonTree BigintLiteral125_tree=null;
        CommonTree SmallintLiteral126_tree=null;
        CommonTree TinyintLiteral127_tree=null;
        CommonTree DecimalLiteral128_tree=null;

         gParent.msgs.push("constant"); 
        try {
            // IdentifiersParser.g:223:5: ( Number | dateLiteral | StringLiteral | stringLiteralSequence | BigintLiteral | SmallintLiteral | TinyintLiteral | DecimalLiteral | charSetStringLiteral | booleanValue )
            int alt31=10;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // IdentifiersParser.g:224:5: Number
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Number121=(Token)match(input,Number,FOLLOW_Number_in_constant1450); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Number121_tree = 
                    (CommonTree)adaptor.create(Number121)
                    ;
                    adaptor.addChild(root_0, Number121_tree);
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:225:7: dateLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_dateLiteral_in_constant1458);
                    dateLiteral122=dateLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateLiteral122.getTree());

                    }
                    break;
                case 3 :
                    // IdentifiersParser.g:226:7: StringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    StringLiteral123=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_constant1466); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral123_tree = 
                    (CommonTree)adaptor.create(StringLiteral123)
                    ;
                    adaptor.addChild(root_0, StringLiteral123_tree);
                    }

                    }
                    break;
                case 4 :
                    // IdentifiersParser.g:227:7: stringLiteralSequence
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_stringLiteralSequence_in_constant1474);
                    stringLiteralSequence124=stringLiteralSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringLiteralSequence124.getTree());

                    }
                    break;
                case 5 :
                    // IdentifiersParser.g:228:7: BigintLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    BigintLiteral125=(Token)match(input,BigintLiteral,FOLLOW_BigintLiteral_in_constant1482); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BigintLiteral125_tree = 
                    (CommonTree)adaptor.create(BigintLiteral125)
                    ;
                    adaptor.addChild(root_0, BigintLiteral125_tree);
                    }

                    }
                    break;
                case 6 :
                    // IdentifiersParser.g:229:7: SmallintLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    SmallintLiteral126=(Token)match(input,SmallintLiteral,FOLLOW_SmallintLiteral_in_constant1490); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SmallintLiteral126_tree = 
                    (CommonTree)adaptor.create(SmallintLiteral126)
                    ;
                    adaptor.addChild(root_0, SmallintLiteral126_tree);
                    }

                    }
                    break;
                case 7 :
                    // IdentifiersParser.g:230:7: TinyintLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    TinyintLiteral127=(Token)match(input,TinyintLiteral,FOLLOW_TinyintLiteral_in_constant1498); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TinyintLiteral127_tree = 
                    (CommonTree)adaptor.create(TinyintLiteral127)
                    ;
                    adaptor.addChild(root_0, TinyintLiteral127_tree);
                    }

                    }
                    break;
                case 8 :
                    // IdentifiersParser.g:231:7: DecimalLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    DecimalLiteral128=(Token)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_constant1506); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DecimalLiteral128_tree = 
                    (CommonTree)adaptor.create(DecimalLiteral128)
                    ;
                    adaptor.addChild(root_0, DecimalLiteral128_tree);
                    }

                    }
                    break;
                case 9 :
                    // IdentifiersParser.g:232:7: charSetStringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_charSetStringLiteral_in_constant1514);
                    charSetStringLiteral129=charSetStringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, charSetStringLiteral129.getTree());

                    }
                    break;
                case 10 :
                    // IdentifiersParser.g:233:7: booleanValue
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_booleanValue_in_constant1522);
                    booleanValue130=booleanValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanValue130.getTree());

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
    // $ANTLR end "constant"


    public static class stringLiteralSequence_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stringLiteralSequence"
    // IdentifiersParser.g:236:1: stringLiteralSequence : StringLiteral ( StringLiteral )+ -> ^( TOK_STRINGLITERALSEQUENCE StringLiteral ( StringLiteral )+ ) ;
    public final HiveParser_IdentifiersParser.stringLiteralSequence_return stringLiteralSequence() throws RecognitionException {
        HiveParser_IdentifiersParser.stringLiteralSequence_return retval = new HiveParser_IdentifiersParser.stringLiteralSequence_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token StringLiteral131=null;
        Token StringLiteral132=null;

        CommonTree StringLiteral131_tree=null;
        CommonTree StringLiteral132_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");

        try {
            // IdentifiersParser.g:237:5: ( StringLiteral ( StringLiteral )+ -> ^( TOK_STRINGLITERALSEQUENCE StringLiteral ( StringLiteral )+ ) )
            // IdentifiersParser.g:238:5: StringLiteral ( StringLiteral )+
            {
            StringLiteral131=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_stringLiteralSequence1543); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral131);


            // IdentifiersParser.g:238:19: ( StringLiteral )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                alt32 = dfa32.predict(input);
                switch (alt32) {
            	case 1 :
            	    // IdentifiersParser.g:238:19: StringLiteral
            	    {
            	    StringLiteral132=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_stringLiteralSequence1545); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral132);


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


            // AST REWRITE
            // elements: StringLiteral, StringLiteral
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 238:34: -> ^( TOK_STRINGLITERALSEQUENCE StringLiteral ( StringLiteral )+ )
            {
                // IdentifiersParser.g:238:37: ^( TOK_STRINGLITERALSEQUENCE StringLiteral ( StringLiteral )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_STRINGLITERALSEQUENCE, "TOK_STRINGLITERALSEQUENCE")
                , root_1);

                adaptor.addChild(root_1, 
                stream_StringLiteral.nextNode()
                );

                if ( !(stream_StringLiteral.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_StringLiteral.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_StringLiteral.nextNode()
                    );

                }
                stream_StringLiteral.reset();

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
    // $ANTLR end "stringLiteralSequence"


    public static class charSetStringLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "charSetStringLiteral"
    // IdentifiersParser.g:241:1: charSetStringLiteral : csName= CharSetName csLiteral= CharSetLiteral -> ^( TOK_CHARSETLITERAL $csName $csLiteral) ;
    public final HiveParser_IdentifiersParser.charSetStringLiteral_return charSetStringLiteral() throws RecognitionException {
        HiveParser_IdentifiersParser.charSetStringLiteral_return retval = new HiveParser_IdentifiersParser.charSetStringLiteral_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token csName=null;
        Token csLiteral=null;

        CommonTree csName_tree=null;
        CommonTree csLiteral_tree=null;
        RewriteRuleTokenStream stream_CharSetLiteral=new RewriteRuleTokenStream(adaptor,"token CharSetLiteral");
        RewriteRuleTokenStream stream_CharSetName=new RewriteRuleTokenStream(adaptor,"token CharSetName");

         gParent.msgs.push("character string literal"); 
        try {
            // IdentifiersParser.g:244:5: (csName= CharSetName csLiteral= CharSetLiteral -> ^( TOK_CHARSETLITERAL $csName $csLiteral) )
            // IdentifiersParser.g:245:5: csName= CharSetName csLiteral= CharSetLiteral
            {
            csName=(Token)match(input,CharSetName,FOLLOW_CharSetName_in_charSetStringLiteral1590); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CharSetName.add(csName);


            csLiteral=(Token)match(input,CharSetLiteral,FOLLOW_CharSetLiteral_in_charSetStringLiteral1594); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CharSetLiteral.add(csLiteral);


            // AST REWRITE
            // elements: csLiteral, csName
            // token labels: csName, csLiteral
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_csName=new RewriteRuleTokenStream(adaptor,"token csName",csName);
            RewriteRuleTokenStream stream_csLiteral=new RewriteRuleTokenStream(adaptor,"token csLiteral",csLiteral);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 245:49: -> ^( TOK_CHARSETLITERAL $csName $csLiteral)
            {
                // IdentifiersParser.g:245:52: ^( TOK_CHARSETLITERAL $csName $csLiteral)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_CHARSETLITERAL, "TOK_CHARSETLITERAL")
                , root_1);

                adaptor.addChild(root_1, stream_csName.nextNode());

                adaptor.addChild(root_1, stream_csLiteral.nextNode());

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
    // $ANTLR end "charSetStringLiteral"


    public static class dateLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dateLiteral"
    // IdentifiersParser.g:248:1: dateLiteral : KW_DATE StringLiteral ->;
    public final HiveParser_IdentifiersParser.dateLiteral_return dateLiteral() throws RecognitionException {
        HiveParser_IdentifiersParser.dateLiteral_return retval = new HiveParser_IdentifiersParser.dateLiteral_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_DATE133=null;
        Token StringLiteral134=null;

        CommonTree KW_DATE133_tree=null;
        CommonTree StringLiteral134_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_DATE=new RewriteRuleTokenStream(adaptor,"token KW_DATE");

        try {
            // IdentifiersParser.g:249:5: ( KW_DATE StringLiteral ->)
            // IdentifiersParser.g:250:5: KW_DATE StringLiteral
            {
            KW_DATE133=(Token)match(input,KW_DATE,FOLLOW_KW_DATE_in_dateLiteral1627); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_DATE.add(KW_DATE133);


            StringLiteral134=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_dateLiteral1629); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral134);


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
            // 250:27: ->
            {
                adaptor.addChild(root_0, 
                      // Create DateLiteral token, but with the text of the string value
                      // This makes the dateLiteral more consistent with the other type literals.
                      adaptor.create(TOK_DATELITERAL, (StringLiteral134!=null?StringLiteral134.getText():null))
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
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dateLiteral"


    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // IdentifiersParser.g:258:1: expression : precedenceOrExpression ;
    public final HiveParser_IdentifiersParser.expression_return expression() throws RecognitionException {
        HiveParser_IdentifiersParser.expression_return retval = new HiveParser_IdentifiersParser.expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedenceOrExpression_return precedenceOrExpression135 =null;



         gParent.msgs.push("expression specification"); 
        try {
            // IdentifiersParser.g:261:5: ( precedenceOrExpression )
            // IdentifiersParser.g:262:5: precedenceOrExpression
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_precedenceOrExpression_in_expression1668);
            precedenceOrExpression135=precedenceOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceOrExpression135.getTree());

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
    // $ANTLR end "expression"


    public static class atomExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atomExpression"
    // IdentifiersParser.g:265:1: atomExpression : ( KW_NULL -> TOK_NULL | dateLiteral | constant | function | castExpression | caseExpression | whenExpression | tableOrColumn | LPAREN ! expression RPAREN !| intervalOrIntervalProp | intervalDistance );
    public final HiveParser_IdentifiersParser.atomExpression_return atomExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.atomExpression_return retval = new HiveParser_IdentifiersParser.atomExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_NULL136=null;
        Token LPAREN144=null;
        Token RPAREN146=null;
        HiveParser_IdentifiersParser.dateLiteral_return dateLiteral137 =null;

        HiveParser_IdentifiersParser.constant_return constant138 =null;

        HiveParser_IdentifiersParser.function_return function139 =null;

        HiveParser_IdentifiersParser.castExpression_return castExpression140 =null;

        HiveParser_IdentifiersParser.caseExpression_return caseExpression141 =null;

        HiveParser_IdentifiersParser.whenExpression_return whenExpression142 =null;

        HiveParser_FromClauseParser.tableOrColumn_return tableOrColumn143 =null;

        HiveParser_IdentifiersParser.expression_return expression145 =null;

        HiveParser_IdentifiersParser.intervalOrIntervalProp_return intervalOrIntervalProp147 =null;

        HiveParser_IdentifiersParser.intervalDistance_return intervalDistance148 =null;


        CommonTree KW_NULL136_tree=null;
        CommonTree LPAREN144_tree=null;
        CommonTree RPAREN146_tree=null;
        RewriteRuleTokenStream stream_KW_NULL=new RewriteRuleTokenStream(adaptor,"token KW_NULL");

        try {
            // IdentifiersParser.g:266:5: ( KW_NULL -> TOK_NULL | dateLiteral | constant | function | castExpression | caseExpression | whenExpression | tableOrColumn | LPAREN ! expression RPAREN !| intervalOrIntervalProp | intervalDistance )
            int alt33=11;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // IdentifiersParser.g:267:5: KW_NULL
                    {
                    KW_NULL136=(Token)match(input,KW_NULL,FOLLOW_KW_NULL_in_atomExpression1689); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_NULL.add(KW_NULL136);


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
                    // 267:13: -> TOK_NULL
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(TOK_NULL, "TOK_NULL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:268:7: dateLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_dateLiteral_in_atomExpression1701);
                    dateLiteral137=dateLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateLiteral137.getTree());

                    }
                    break;
                case 3 :
                    // IdentifiersParser.g:269:7: constant
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_constant_in_atomExpression1709);
                    constant138=constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant138.getTree());

                    }
                    break;
                case 4 :
                    // IdentifiersParser.g:270:7: function
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_in_atomExpression1717);
                    function139=function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function139.getTree());

                    }
                    break;
                case 5 :
                    // IdentifiersParser.g:271:7: castExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_castExpression_in_atomExpression1725);
                    castExpression140=castExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, castExpression140.getTree());

                    }
                    break;
                case 6 :
                    // IdentifiersParser.g:272:7: caseExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_caseExpression_in_atomExpression1733);
                    caseExpression141=caseExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, caseExpression141.getTree());

                    }
                    break;
                case 7 :
                    // IdentifiersParser.g:273:7: whenExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_whenExpression_in_atomExpression1741);
                    whenExpression142=whenExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whenExpression142.getTree());

                    }
                    break;
                case 8 :
                    // IdentifiersParser.g:274:7: tableOrColumn
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_tableOrColumn_in_atomExpression1749);
                    tableOrColumn143=gHiveParser.tableOrColumn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tableOrColumn143.getTree());

                    }
                    break;
                case 9 :
                    // IdentifiersParser.g:275:7: LPAREN ! expression RPAREN !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LPAREN144=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atomExpression1757); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_atomExpression1760);
                    expression145=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression145.getTree());

                    RPAREN146=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atomExpression1762); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // IdentifiersParser.g:276:7: intervalOrIntervalProp
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_intervalOrIntervalProp_in_atomExpression1771);
                    intervalOrIntervalProp147=intervalOrIntervalProp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, intervalOrIntervalProp147.getTree());

                    }
                    break;
                case 11 :
                    // IdentifiersParser.g:277:7: intervalDistance
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_intervalDistance_in_atomExpression1779);
                    intervalDistance148=intervalDistance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, intervalDistance148.getTree());

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
    // $ANTLR end "atomExpression"


    public static class intervalOrIntervalProp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "intervalOrIntervalProp"
    // IdentifiersParser.g:280:1: intervalOrIntervalProp : ( tableOrColumn DOT KW_INTERVAL (prop= DOT identifier )? -> {$prop != null}? ^( TOK_INTERVALPROP tableOrColumn identifier ) -> ^( TOK_INTERVAL tableOrColumn ) | intervalConstant | KW_LENGTH LPAREN ( tableOrColumn DOT KW_INTERVAL ) RPAREN -> ^( TOK_LENGTHOFINTERVAL tableOrColumn ) );
    public final HiveParser_IdentifiersParser.intervalOrIntervalProp_return intervalOrIntervalProp() throws RecognitionException {
        HiveParser_IdentifiersParser.intervalOrIntervalProp_return retval = new HiveParser_IdentifiersParser.intervalOrIntervalProp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token prop=null;
        Token DOT150=null;
        Token KW_INTERVAL151=null;
        Token KW_LENGTH154=null;
        Token LPAREN155=null;
        Token DOT157=null;
        Token KW_INTERVAL158=null;
        Token RPAREN159=null;
        HiveParser_FromClauseParser.tableOrColumn_return tableOrColumn149 =null;

        HiveParser_IdentifiersParser.identifier_return identifier152 =null;

        HiveParser_IdentifiersParser.intervalConstant_return intervalConstant153 =null;

        HiveParser_FromClauseParser.tableOrColumn_return tableOrColumn156 =null;


        CommonTree prop_tree=null;
        CommonTree DOT150_tree=null;
        CommonTree KW_INTERVAL151_tree=null;
        CommonTree KW_LENGTH154_tree=null;
        CommonTree LPAREN155_tree=null;
        CommonTree DOT157_tree=null;
        CommonTree KW_INTERVAL158_tree=null;
        CommonTree RPAREN159_tree=null;
        RewriteRuleTokenStream stream_KW_LENGTH=new RewriteRuleTokenStream(adaptor,"token KW_LENGTH");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_INTERVAL=new RewriteRuleTokenStream(adaptor,"token KW_INTERVAL");
        RewriteRuleSubtreeStream stream_tableOrColumn=new RewriteRuleSubtreeStream(adaptor,"rule tableOrColumn");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // IdentifiersParser.g:281:2: ( tableOrColumn DOT KW_INTERVAL (prop= DOT identifier )? -> {$prop != null}? ^( TOK_INTERVALPROP tableOrColumn identifier ) -> ^( TOK_INTERVAL tableOrColumn ) | intervalConstant | KW_LENGTH LPAREN ( tableOrColumn DOT KW_INTERVAL ) RPAREN -> ^( TOK_LENGTHOFINTERVAL tableOrColumn ) )
            int alt35=3;
            switch ( input.LA(1) ) {
            case Identifier:
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
                alt35=1;
                }
                break;
            case LSQUARE:
                {
                alt35=2;
                }
                break;
            case KW_LENGTH:
                {
                alt35=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }

            switch (alt35) {
                case 1 :
                    // IdentifiersParser.g:282:2: tableOrColumn DOT KW_INTERVAL (prop= DOT identifier )?
                    {
                    pushFollow(FOLLOW_tableOrColumn_in_intervalOrIntervalProp1794);
                    tableOrColumn149=gHiveParser.tableOrColumn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableOrColumn.add(tableOrColumn149.getTree());

                    DOT150=(Token)match(input,DOT,FOLLOW_DOT_in_intervalOrIntervalProp1796); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT150);


                    KW_INTERVAL151=(Token)match(input,KW_INTERVAL,FOLLOW_KW_INTERVAL_in_intervalOrIntervalProp1798); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_INTERVAL.add(KW_INTERVAL151);


                    // IdentifiersParser.g:282:32: (prop= DOT identifier )?
                    int alt34=2;
                    alt34 = dfa34.predict(input);
                    switch (alt34) {
                        case 1 :
                            // IdentifiersParser.g:282:33: prop= DOT identifier
                            {
                            prop=(Token)match(input,DOT,FOLLOW_DOT_in_intervalOrIntervalProp1803); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(prop);


                            pushFollow(FOLLOW_identifier_in_intervalOrIntervalProp1805);
                            identifier152=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier152.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: tableOrColumn, tableOrColumn, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 283:2: -> {$prop != null}? ^( TOK_INTERVALPROP tableOrColumn identifier )
                    if (prop != null) {
                        // IdentifiersParser.g:283:22: ^( TOK_INTERVALPROP tableOrColumn identifier )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_INTERVALPROP, "TOK_INTERVALPROP")
                        , root_1);

                        adaptor.addChild(root_1, stream_tableOrColumn.nextTree());

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    else // 284:2: -> ^( TOK_INTERVAL tableOrColumn )
                    {
                        // IdentifiersParser.g:284:5: ^( TOK_INTERVAL tableOrColumn )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_INTERVAL, "TOK_INTERVAL")
                        , root_1);

                        adaptor.addChild(root_1, stream_tableOrColumn.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:285:4: intervalConstant
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_intervalConstant_in_intervalOrIntervalProp1834);
                    intervalConstant153=intervalConstant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, intervalConstant153.getTree());

                    }
                    break;
                case 3 :
                    // IdentifiersParser.g:286:4: KW_LENGTH LPAREN ( tableOrColumn DOT KW_INTERVAL ) RPAREN
                    {
                    KW_LENGTH154=(Token)match(input,KW_LENGTH,FOLLOW_KW_LENGTH_in_intervalOrIntervalProp1839); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_LENGTH.add(KW_LENGTH154);


                    LPAREN155=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_intervalOrIntervalProp1841); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN155);


                    // IdentifiersParser.g:286:21: ( tableOrColumn DOT KW_INTERVAL )
                    // IdentifiersParser.g:286:22: tableOrColumn DOT KW_INTERVAL
                    {
                    pushFollow(FOLLOW_tableOrColumn_in_intervalOrIntervalProp1844);
                    tableOrColumn156=gHiveParser.tableOrColumn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableOrColumn.add(tableOrColumn156.getTree());

                    DOT157=(Token)match(input,DOT,FOLLOW_DOT_in_intervalOrIntervalProp1846); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT157);


                    KW_INTERVAL158=(Token)match(input,KW_INTERVAL,FOLLOW_KW_INTERVAL_in_intervalOrIntervalProp1848); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_INTERVAL.add(KW_INTERVAL158);


                    }


                    RPAREN159=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_intervalOrIntervalProp1851); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN159);


                    // AST REWRITE
                    // elements: tableOrColumn
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 286:60: -> ^( TOK_LENGTHOFINTERVAL tableOrColumn )
                    {
                        // IdentifiersParser.g:286:63: ^( TOK_LENGTHOFINTERVAL tableOrColumn )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_LENGTHOFINTERVAL, "TOK_LENGTHOFINTERVAL")
                        , root_1);

                        adaptor.addChild(root_1, stream_tableOrColumn.nextTree());

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
    // $ANTLR end "intervalOrIntervalProp"


    public static class intervalDistance_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "intervalDistance"
    // IdentifiersParser.g:289:1: intervalDistance : KW_DISTANCE LPAREN intervalOrIntervalProp COMMA intervalOrIntervalProp RPAREN -> ^( TOK_DISTANCE intervalOrIntervalProp intervalOrIntervalProp ) ;
    public final HiveParser_IdentifiersParser.intervalDistance_return intervalDistance() throws RecognitionException {
        HiveParser_IdentifiersParser.intervalDistance_return retval = new HiveParser_IdentifiersParser.intervalDistance_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_DISTANCE160=null;
        Token LPAREN161=null;
        Token COMMA163=null;
        Token RPAREN165=null;
        HiveParser_IdentifiersParser.intervalOrIntervalProp_return intervalOrIntervalProp162 =null;

        HiveParser_IdentifiersParser.intervalOrIntervalProp_return intervalOrIntervalProp164 =null;


        CommonTree KW_DISTANCE160_tree=null;
        CommonTree LPAREN161_tree=null;
        CommonTree COMMA163_tree=null;
        CommonTree RPAREN165_tree=null;
        RewriteRuleTokenStream stream_KW_DISTANCE=new RewriteRuleTokenStream(adaptor,"token KW_DISTANCE");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_intervalOrIntervalProp=new RewriteRuleSubtreeStream(adaptor,"rule intervalOrIntervalProp");
        try {
            // IdentifiersParser.g:290:5: ( KW_DISTANCE LPAREN intervalOrIntervalProp COMMA intervalOrIntervalProp RPAREN -> ^( TOK_DISTANCE intervalOrIntervalProp intervalOrIntervalProp ) )
            // IdentifiersParser.g:291:5: KW_DISTANCE LPAREN intervalOrIntervalProp COMMA intervalOrIntervalProp RPAREN
            {
            KW_DISTANCE160=(Token)match(input,KW_DISTANCE,FOLLOW_KW_DISTANCE_in_intervalDistance1878); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_DISTANCE.add(KW_DISTANCE160);


            LPAREN161=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_intervalDistance1880); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN161);


            pushFollow(FOLLOW_intervalOrIntervalProp_in_intervalDistance1882);
            intervalOrIntervalProp162=intervalOrIntervalProp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_intervalOrIntervalProp.add(intervalOrIntervalProp162.getTree());

            COMMA163=(Token)match(input,COMMA,FOLLOW_COMMA_in_intervalDistance1884); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA163);


            pushFollow(FOLLOW_intervalOrIntervalProp_in_intervalDistance1886);
            intervalOrIntervalProp164=intervalOrIntervalProp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_intervalOrIntervalProp.add(intervalOrIntervalProp164.getTree());

            RPAREN165=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_intervalDistance1888); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN165);


            // AST REWRITE
            // elements: intervalOrIntervalProp, intervalOrIntervalProp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 291:83: -> ^( TOK_DISTANCE intervalOrIntervalProp intervalOrIntervalProp )
            {
                // IdentifiersParser.g:291:86: ^( TOK_DISTANCE intervalOrIntervalProp intervalOrIntervalProp )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_DISTANCE, "TOK_DISTANCE")
                , root_1);

                adaptor.addChild(root_1, stream_intervalOrIntervalProp.nextTree());

                adaptor.addChild(root_1, stream_intervalOrIntervalProp.nextTree());

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
    // $ANTLR end "intervalDistance"


    public static class intervalConstant_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "intervalConstant"
    // IdentifiersParser.g:294:1: intervalConstant : LSQUARE intervalCoor COMMA intervalSta COMMA intervalEnd ( COMMA intervalStr )? RSQUARE -> ^( TOK_INTERVALCONSTANT intervalCoor intervalSta intervalEnd ( intervalStr )? ) ;
    public final HiveParser_IdentifiersParser.intervalConstant_return intervalConstant() throws RecognitionException {
        HiveParser_IdentifiersParser.intervalConstant_return retval = new HiveParser_IdentifiersParser.intervalConstant_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LSQUARE166=null;
        Token COMMA168=null;
        Token COMMA170=null;
        Token COMMA172=null;
        Token RSQUARE174=null;
        HiveParser_IdentifiersParser.intervalCoor_return intervalCoor167 =null;

        HiveParser_IdentifiersParser.intervalSta_return intervalSta169 =null;

        HiveParser_IdentifiersParser.intervalEnd_return intervalEnd171 =null;

        HiveParser_IdentifiersParser.intervalStr_return intervalStr173 =null;


        CommonTree LSQUARE166_tree=null;
        CommonTree COMMA168_tree=null;
        CommonTree COMMA170_tree=null;
        CommonTree COMMA172_tree=null;
        CommonTree RSQUARE174_tree=null;
        RewriteRuleTokenStream stream_LSQUARE=new RewriteRuleTokenStream(adaptor,"token LSQUARE");
        RewriteRuleTokenStream stream_RSQUARE=new RewriteRuleTokenStream(adaptor,"token RSQUARE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_intervalEnd=new RewriteRuleSubtreeStream(adaptor,"rule intervalEnd");
        RewriteRuleSubtreeStream stream_intervalStr=new RewriteRuleSubtreeStream(adaptor,"rule intervalStr");
        RewriteRuleSubtreeStream stream_intervalCoor=new RewriteRuleSubtreeStream(adaptor,"rule intervalCoor");
        RewriteRuleSubtreeStream stream_intervalSta=new RewriteRuleSubtreeStream(adaptor,"rule intervalSta");
        try {
            // IdentifiersParser.g:295:2: ( LSQUARE intervalCoor COMMA intervalSta COMMA intervalEnd ( COMMA intervalStr )? RSQUARE -> ^( TOK_INTERVALCONSTANT intervalCoor intervalSta intervalEnd ( intervalStr )? ) )
            // IdentifiersParser.g:296:2: LSQUARE intervalCoor COMMA intervalSta COMMA intervalEnd ( COMMA intervalStr )? RSQUARE
            {
            LSQUARE166=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_intervalConstant1913); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LSQUARE.add(LSQUARE166);


            pushFollow(FOLLOW_intervalCoor_in_intervalConstant1915);
            intervalCoor167=intervalCoor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_intervalCoor.add(intervalCoor167.getTree());

            COMMA168=(Token)match(input,COMMA,FOLLOW_COMMA_in_intervalConstant1917); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA168);


            pushFollow(FOLLOW_intervalSta_in_intervalConstant1919);
            intervalSta169=intervalSta();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_intervalSta.add(intervalSta169.getTree());

            COMMA170=(Token)match(input,COMMA,FOLLOW_COMMA_in_intervalConstant1921); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA170);


            pushFollow(FOLLOW_intervalEnd_in_intervalConstant1923);
            intervalEnd171=intervalEnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_intervalEnd.add(intervalEnd171.getTree());

            // IdentifiersParser.g:296:59: ( COMMA intervalStr )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==COMMA) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // IdentifiersParser.g:296:60: COMMA intervalStr
                    {
                    COMMA172=(Token)match(input,COMMA,FOLLOW_COMMA_in_intervalConstant1926); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA172);


                    pushFollow(FOLLOW_intervalStr_in_intervalConstant1928);
                    intervalStr173=intervalStr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_intervalStr.add(intervalStr173.getTree());

                    }
                    break;

            }


            RSQUARE174=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_intervalConstant1932); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RSQUARE.add(RSQUARE174);


            // AST REWRITE
            // elements: intervalStr, intervalSta, intervalEnd, intervalCoor
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 297:2: -> ^( TOK_INTERVALCONSTANT intervalCoor intervalSta intervalEnd ( intervalStr )? )
            {
                // IdentifiersParser.g:297:5: ^( TOK_INTERVALCONSTANT intervalCoor intervalSta intervalEnd ( intervalStr )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_INTERVALCONSTANT, "TOK_INTERVALCONSTANT")
                , root_1);

                adaptor.addChild(root_1, stream_intervalCoor.nextTree());

                adaptor.addChild(root_1, stream_intervalSta.nextTree());

                adaptor.addChild(root_1, stream_intervalEnd.nextTree());

                // IdentifiersParser.g:297:65: ( intervalStr )?
                if ( stream_intervalStr.hasNext() ) {
                    adaptor.addChild(root_1, stream_intervalStr.nextTree());

                }
                stream_intervalStr.reset();

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
    // $ANTLR end "intervalConstant"


    public static class intervalCoor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "intervalCoor"
    // IdentifiersParser.g:300:1: intervalCoor : identifier ;
    public final HiveParser_IdentifiersParser.intervalCoor_return intervalCoor() throws RecognitionException {
        HiveParser_IdentifiersParser.intervalCoor_return retval = new HiveParser_IdentifiersParser.intervalCoor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.identifier_return identifier175 =null;



        try {
            // IdentifiersParser.g:301:2: ( identifier )
            // IdentifiersParser.g:302:2: identifier
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_identifier_in_intervalCoor1961);
            identifier175=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier175.getTree());

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
    // $ANTLR end "intervalCoor"


    public static class intervalSta_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "intervalSta"
    // IdentifiersParser.g:305:1: intervalSta : Number ;
    public final HiveParser_IdentifiersParser.intervalSta_return intervalSta() throws RecognitionException {
        HiveParser_IdentifiersParser.intervalSta_return retval = new HiveParser_IdentifiersParser.intervalSta_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token Number176=null;

        CommonTree Number176_tree=null;

        try {
            // IdentifiersParser.g:306:2: ( Number )
            // IdentifiersParser.g:307:2: Number
            {
            root_0 = (CommonTree)adaptor.nil();


            Number176=(Token)match(input,Number,FOLLOW_Number_in_intervalSta1974); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Number176_tree = 
            (CommonTree)adaptor.create(Number176)
            ;
            adaptor.addChild(root_0, Number176_tree);
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
    // $ANTLR end "intervalSta"


    public static class intervalEnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "intervalEnd"
    // IdentifiersParser.g:310:1: intervalEnd : Number ;
    public final HiveParser_IdentifiersParser.intervalEnd_return intervalEnd() throws RecognitionException {
        HiveParser_IdentifiersParser.intervalEnd_return retval = new HiveParser_IdentifiersParser.intervalEnd_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token Number177=null;

        CommonTree Number177_tree=null;

        try {
            // IdentifiersParser.g:311:2: ( Number )
            // IdentifiersParser.g:312:2: Number
            {
            root_0 = (CommonTree)adaptor.nil();


            Number177=(Token)match(input,Number,FOLLOW_Number_in_intervalEnd1987); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Number177_tree = 
            (CommonTree)adaptor.create(Number177)
            ;
            adaptor.addChild(root_0, Number177_tree);
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
    // $ANTLR end "intervalEnd"


    public static class intervalStr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "intervalStr"
    // IdentifiersParser.g:315:1: intervalStr : ( PLUS | MINUS | DOT );
    public final HiveParser_IdentifiersParser.intervalStr_return intervalStr() throws RecognitionException {
        HiveParser_IdentifiersParser.intervalStr_return retval = new HiveParser_IdentifiersParser.intervalStr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set178=null;

        CommonTree set178_tree=null;

        try {
            // IdentifiersParser.g:316:2: ( PLUS | MINUS | DOT )
            // IdentifiersParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set178=(Token)input.LT(1);

            if ( input.LA(1)==DOT||input.LA(1)==MINUS||input.LA(1)==PLUS ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set178)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "intervalStr"


    public static class precedenceFieldExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceFieldExpression"
    // IdentifiersParser.g:320:1: precedenceFieldExpression : atomExpression ( ( LSQUARE ^ expression RSQUARE !) | ( DOT ^ identifier ) )* ;
    public final HiveParser_IdentifiersParser.precedenceFieldExpression_return precedenceFieldExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceFieldExpression_return retval = new HiveParser_IdentifiersParser.precedenceFieldExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LSQUARE180=null;
        Token RSQUARE182=null;
        Token DOT183=null;
        HiveParser_IdentifiersParser.atomExpression_return atomExpression179 =null;

        HiveParser_IdentifiersParser.expression_return expression181 =null;

        HiveParser_IdentifiersParser.identifier_return identifier184 =null;


        CommonTree LSQUARE180_tree=null;
        CommonTree RSQUARE182_tree=null;
        CommonTree DOT183_tree=null;

        try {
            // IdentifiersParser.g:321:5: ( atomExpression ( ( LSQUARE ^ expression RSQUARE !) | ( DOT ^ identifier ) )* )
            // IdentifiersParser.g:322:5: atomExpression ( ( LSQUARE ^ expression RSQUARE !) | ( DOT ^ identifier ) )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_atomExpression_in_precedenceFieldExpression2026);
            atomExpression179=atomExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, atomExpression179.getTree());

            // IdentifiersParser.g:322:20: ( ( LSQUARE ^ expression RSQUARE !) | ( DOT ^ identifier ) )*
            loop37:
            do {
                int alt37=3;
                alt37 = dfa37.predict(input);
                switch (alt37) {
            	case 1 :
            	    // IdentifiersParser.g:322:21: ( LSQUARE ^ expression RSQUARE !)
            	    {
            	    // IdentifiersParser.g:322:21: ( LSQUARE ^ expression RSQUARE !)
            	    // IdentifiersParser.g:322:22: LSQUARE ^ expression RSQUARE !
            	    {
            	    LSQUARE180=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_precedenceFieldExpression2030); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LSQUARE180_tree = 
            	    (CommonTree)adaptor.create(LSQUARE180)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(LSQUARE180_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_expression_in_precedenceFieldExpression2033);
            	    expression181=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression181.getTree());

            	    RSQUARE182=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_precedenceFieldExpression2035); if (state.failed) return retval;

            	    }


            	    }
            	    break;
            	case 2 :
            	    // IdentifiersParser.g:322:54: ( DOT ^ identifier )
            	    {
            	    // IdentifiersParser.g:322:54: ( DOT ^ identifier )
            	    // IdentifiersParser.g:322:55: DOT ^ identifier
            	    {
            	    DOT183=(Token)match(input,DOT,FOLLOW_DOT_in_precedenceFieldExpression2042); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOT183_tree = 
            	    (CommonTree)adaptor.create(DOT183)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(DOT183_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_identifier_in_precedenceFieldExpression2045);
            	    identifier184=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier184.getTree());

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


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
    // $ANTLR end "precedenceFieldExpression"


    public static class precedenceUnaryOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceUnaryOperator"
    // IdentifiersParser.g:325:1: precedenceUnaryOperator : ( PLUS | MINUS | TILDE );
    public final HiveParser_IdentifiersParser.precedenceUnaryOperator_return precedenceUnaryOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceUnaryOperator_return retval = new HiveParser_IdentifiersParser.precedenceUnaryOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set185=null;

        CommonTree set185_tree=null;

        try {
            // IdentifiersParser.g:326:5: ( PLUS | MINUS | TILDE )
            // IdentifiersParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set185=(Token)input.LT(1);

            if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==TILDE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set185)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "precedenceUnaryOperator"


    public static class nullCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nullCondition"
    // IdentifiersParser.g:330:1: nullCondition : ( KW_NULL -> ^( TOK_ISNULL ) | KW_NOT KW_NULL -> ^( TOK_ISNOTNULL ) );
    public final HiveParser_IdentifiersParser.nullCondition_return nullCondition() throws RecognitionException {
        HiveParser_IdentifiersParser.nullCondition_return retval = new HiveParser_IdentifiersParser.nullCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_NULL186=null;
        Token KW_NOT187=null;
        Token KW_NULL188=null;

        CommonTree KW_NULL186_tree=null;
        CommonTree KW_NOT187_tree=null;
        CommonTree KW_NULL188_tree=null;
        RewriteRuleTokenStream stream_KW_NULL=new RewriteRuleTokenStream(adaptor,"token KW_NULL");
        RewriteRuleTokenStream stream_KW_NOT=new RewriteRuleTokenStream(adaptor,"token KW_NOT");

        try {
            // IdentifiersParser.g:331:5: ( KW_NULL -> ^( TOK_ISNULL ) | KW_NOT KW_NULL -> ^( TOK_ISNOTNULL ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==KW_NULL) ) {
                alt38=1;
            }
            else if ( (LA38_0==KW_NOT) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }
            switch (alt38) {
                case 1 :
                    // IdentifiersParser.g:332:5: KW_NULL
                    {
                    KW_NULL186=(Token)match(input,KW_NULL,FOLLOW_KW_NULL_in_nullCondition2098); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_NULL.add(KW_NULL186);


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
                    // 332:13: -> ^( TOK_ISNULL )
                    {
                        // IdentifiersParser.g:332:16: ^( TOK_ISNULL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_ISNULL, "TOK_ISNULL")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:333:7: KW_NOT KW_NULL
                    {
                    KW_NOT187=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_nullCondition2112); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT187);


                    KW_NULL188=(Token)match(input,KW_NULL,FOLLOW_KW_NULL_in_nullCondition2114); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_NULL.add(KW_NULL188);


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
                    // 333:22: -> ^( TOK_ISNOTNULL )
                    {
                        // IdentifiersParser.g:333:25: ^( TOK_ISNOTNULL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_ISNOTNULL, "TOK_ISNOTNULL")
                        , root_1);

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
    // $ANTLR end "nullCondition"


    public static class precedenceUnaryPrefixExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceUnaryPrefixExpression"
    // IdentifiersParser.g:336:1: precedenceUnaryPrefixExpression : ( precedenceUnaryOperator ^)* precedenceFieldExpression ;
    public final HiveParser_IdentifiersParser.precedenceUnaryPrefixExpression_return precedenceUnaryPrefixExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceUnaryPrefixExpression_return retval = new HiveParser_IdentifiersParser.precedenceUnaryPrefixExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedenceUnaryOperator_return precedenceUnaryOperator189 =null;

        HiveParser_IdentifiersParser.precedenceFieldExpression_return precedenceFieldExpression190 =null;



        try {
            // IdentifiersParser.g:337:5: ( ( precedenceUnaryOperator ^)* precedenceFieldExpression )
            // IdentifiersParser.g:338:5: ( precedenceUnaryOperator ^)* precedenceFieldExpression
            {
            root_0 = (CommonTree)adaptor.nil();


            // IdentifiersParser.g:338:5: ( precedenceUnaryOperator ^)*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==MINUS||LA39_0==PLUS||LA39_0==TILDE) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // IdentifiersParser.g:338:6: precedenceUnaryOperator ^
            	    {
            	    pushFollow(FOLLOW_precedenceUnaryOperator_in_precedenceUnaryPrefixExpression2142);
            	    precedenceUnaryOperator189=precedenceUnaryOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceUnaryOperator189.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            pushFollow(FOLLOW_precedenceFieldExpression_in_precedenceUnaryPrefixExpression2147);
            precedenceFieldExpression190=precedenceFieldExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceFieldExpression190.getTree());

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
    // $ANTLR end "precedenceUnaryPrefixExpression"


    public static class precedenceUnarySuffixExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceUnarySuffixExpression"
    // IdentifiersParser.g:341:1: precedenceUnarySuffixExpression : precedenceUnaryPrefixExpression (a= KW_IS nullCondition )? -> {$a != null}? ^( TOK_FUNCTION nullCondition precedenceUnaryPrefixExpression ) -> precedenceUnaryPrefixExpression ;
    public final HiveParser_IdentifiersParser.precedenceUnarySuffixExpression_return precedenceUnarySuffixExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceUnarySuffixExpression_return retval = new HiveParser_IdentifiersParser.precedenceUnarySuffixExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token a=null;
        HiveParser_IdentifiersParser.precedenceUnaryPrefixExpression_return precedenceUnaryPrefixExpression191 =null;

        HiveParser_IdentifiersParser.nullCondition_return nullCondition192 =null;


        CommonTree a_tree=null;
        RewriteRuleTokenStream stream_KW_IS=new RewriteRuleTokenStream(adaptor,"token KW_IS");
        RewriteRuleSubtreeStream stream_precedenceUnaryPrefixExpression=new RewriteRuleSubtreeStream(adaptor,"rule precedenceUnaryPrefixExpression");
        RewriteRuleSubtreeStream stream_nullCondition=new RewriteRuleSubtreeStream(adaptor,"rule nullCondition");
        try {
            // IdentifiersParser.g:342:5: ( precedenceUnaryPrefixExpression (a= KW_IS nullCondition )? -> {$a != null}? ^( TOK_FUNCTION nullCondition precedenceUnaryPrefixExpression ) -> precedenceUnaryPrefixExpression )
            // IdentifiersParser.g:342:7: precedenceUnaryPrefixExpression (a= KW_IS nullCondition )?
            {
            pushFollow(FOLLOW_precedenceUnaryPrefixExpression_in_precedenceUnarySuffixExpression2164);
            precedenceUnaryPrefixExpression191=precedenceUnaryPrefixExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_precedenceUnaryPrefixExpression.add(precedenceUnaryPrefixExpression191.getTree());

            // IdentifiersParser.g:342:39: (a= KW_IS nullCondition )?
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // IdentifiersParser.g:342:40: a= KW_IS nullCondition
                    {
                    a=(Token)match(input,KW_IS,FOLLOW_KW_IS_in_precedenceUnarySuffixExpression2169); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_IS.add(a);


                    pushFollow(FOLLOW_nullCondition_in_precedenceUnarySuffixExpression2171);
                    nullCondition192=nullCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_nullCondition.add(nullCondition192.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: precedenceUnaryPrefixExpression, nullCondition, precedenceUnaryPrefixExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 343:5: -> {$a != null}? ^( TOK_FUNCTION nullCondition precedenceUnaryPrefixExpression )
            if (a != null) {
                // IdentifiersParser.g:343:22: ^( TOK_FUNCTION nullCondition precedenceUnaryPrefixExpression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
                , root_1);

                adaptor.addChild(root_1, stream_nullCondition.nextTree());

                adaptor.addChild(root_1, stream_precedenceUnaryPrefixExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 344:5: -> precedenceUnaryPrefixExpression
            {
                adaptor.addChild(root_0, stream_precedenceUnaryPrefixExpression.nextTree());

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
    // $ANTLR end "precedenceUnarySuffixExpression"


    public static class precedenceBitwiseXorOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceBitwiseXorOperator"
    // IdentifiersParser.g:348:1: precedenceBitwiseXorOperator : BITWISEXOR ;
    public final HiveParser_IdentifiersParser.precedenceBitwiseXorOperator_return precedenceBitwiseXorOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceBitwiseXorOperator_return retval = new HiveParser_IdentifiersParser.precedenceBitwiseXorOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BITWISEXOR193=null;

        CommonTree BITWISEXOR193_tree=null;

        try {
            // IdentifiersParser.g:349:5: ( BITWISEXOR )
            // IdentifiersParser.g:350:5: BITWISEXOR
            {
            root_0 = (CommonTree)adaptor.nil();


            BITWISEXOR193=(Token)match(input,BITWISEXOR,FOLLOW_BITWISEXOR_in_precedenceBitwiseXorOperator2219); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BITWISEXOR193_tree = 
            (CommonTree)adaptor.create(BITWISEXOR193)
            ;
            adaptor.addChild(root_0, BITWISEXOR193_tree);
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
    // $ANTLR end "precedenceBitwiseXorOperator"


    public static class precedenceBitwiseXorExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceBitwiseXorExpression"
    // IdentifiersParser.g:353:1: precedenceBitwiseXorExpression : precedenceUnarySuffixExpression ( precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression )* ;
    public final HiveParser_IdentifiersParser.precedenceBitwiseXorExpression_return precedenceBitwiseXorExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceBitwiseXorExpression_return retval = new HiveParser_IdentifiersParser.precedenceBitwiseXorExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedenceUnarySuffixExpression_return precedenceUnarySuffixExpression194 =null;

        HiveParser_IdentifiersParser.precedenceBitwiseXorOperator_return precedenceBitwiseXorOperator195 =null;

        HiveParser_IdentifiersParser.precedenceUnarySuffixExpression_return precedenceUnarySuffixExpression196 =null;



        try {
            // IdentifiersParser.g:354:5: ( precedenceUnarySuffixExpression ( precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression )* )
            // IdentifiersParser.g:355:5: precedenceUnarySuffixExpression ( precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_precedenceUnarySuffixExpression_in_precedenceBitwiseXorExpression2240);
            precedenceUnarySuffixExpression194=precedenceUnarySuffixExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceUnarySuffixExpression194.getTree());

            // IdentifiersParser.g:355:37: ( precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression )*
            loop41:
            do {
                int alt41=2;
                alt41 = dfa41.predict(input);
                switch (alt41) {
            	case 1 :
            	    // IdentifiersParser.g:355:38: precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression
            	    {
            	    pushFollow(FOLLOW_precedenceBitwiseXorOperator_in_precedenceBitwiseXorExpression2243);
            	    precedenceBitwiseXorOperator195=precedenceBitwiseXorOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceBitwiseXorOperator195.getTree(), root_0);

            	    pushFollow(FOLLOW_precedenceUnarySuffixExpression_in_precedenceBitwiseXorExpression2246);
            	    precedenceUnarySuffixExpression196=precedenceUnarySuffixExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceUnarySuffixExpression196.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


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
    // $ANTLR end "precedenceBitwiseXorExpression"


    public static class precedenceStarOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceStarOperator"
    // IdentifiersParser.g:359:1: precedenceStarOperator : ( STAR | DIVIDE | MOD | DIV );
    public final HiveParser_IdentifiersParser.precedenceStarOperator_return precedenceStarOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceStarOperator_return retval = new HiveParser_IdentifiersParser.precedenceStarOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set197=null;

        CommonTree set197_tree=null;

        try {
            // IdentifiersParser.g:360:5: ( STAR | DIVIDE | MOD | DIV )
            // IdentifiersParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set197=(Token)input.LT(1);

            if ( (input.LA(1) >= DIV && input.LA(1) <= DIVIDE)||input.LA(1)==MOD||input.LA(1)==STAR ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set197)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "precedenceStarOperator"


    public static class precedenceStarExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceStarExpression"
    // IdentifiersParser.g:364:1: precedenceStarExpression : precedenceBitwiseXorExpression ( precedenceStarOperator ^ precedenceBitwiseXorExpression )* ;
    public final HiveParser_IdentifiersParser.precedenceStarExpression_return precedenceStarExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceStarExpression_return retval = new HiveParser_IdentifiersParser.precedenceStarExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedenceBitwiseXorExpression_return precedenceBitwiseXorExpression198 =null;

        HiveParser_IdentifiersParser.precedenceStarOperator_return precedenceStarOperator199 =null;

        HiveParser_IdentifiersParser.precedenceBitwiseXorExpression_return precedenceBitwiseXorExpression200 =null;



        try {
            // IdentifiersParser.g:365:5: ( precedenceBitwiseXorExpression ( precedenceStarOperator ^ precedenceBitwiseXorExpression )* )
            // IdentifiersParser.g:366:5: precedenceBitwiseXorExpression ( precedenceStarOperator ^ precedenceBitwiseXorExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_precedenceBitwiseXorExpression_in_precedenceStarExpression2303);
            precedenceBitwiseXorExpression198=precedenceBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceBitwiseXorExpression198.getTree());

            // IdentifiersParser.g:366:36: ( precedenceStarOperator ^ precedenceBitwiseXorExpression )*
            loop42:
            do {
                int alt42=2;
                alt42 = dfa42.predict(input);
                switch (alt42) {
            	case 1 :
            	    // IdentifiersParser.g:366:37: precedenceStarOperator ^ precedenceBitwiseXorExpression
            	    {
            	    pushFollow(FOLLOW_precedenceStarOperator_in_precedenceStarExpression2306);
            	    precedenceStarOperator199=precedenceStarOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceStarOperator199.getTree(), root_0);

            	    pushFollow(FOLLOW_precedenceBitwiseXorExpression_in_precedenceStarExpression2309);
            	    precedenceBitwiseXorExpression200=precedenceBitwiseXorExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceBitwiseXorExpression200.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


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
    // $ANTLR end "precedenceStarExpression"


    public static class precedencePlusOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedencePlusOperator"
    // IdentifiersParser.g:370:1: precedencePlusOperator : ( PLUS | MINUS );
    public final HiveParser_IdentifiersParser.precedencePlusOperator_return precedencePlusOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedencePlusOperator_return retval = new HiveParser_IdentifiersParser.precedencePlusOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set201=null;

        CommonTree set201_tree=null;

        try {
            // IdentifiersParser.g:371:5: ( PLUS | MINUS )
            // IdentifiersParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set201=(Token)input.LT(1);

            if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set201)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "precedencePlusOperator"


    public static class precedencePlusExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedencePlusExpression"
    // IdentifiersParser.g:375:1: precedencePlusExpression : precedenceStarExpression ( precedencePlusOperator ^ precedenceStarExpression )* ;
    public final HiveParser_IdentifiersParser.precedencePlusExpression_return precedencePlusExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedencePlusExpression_return retval = new HiveParser_IdentifiersParser.precedencePlusExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedenceStarExpression_return precedenceStarExpression202 =null;

        HiveParser_IdentifiersParser.precedencePlusOperator_return precedencePlusOperator203 =null;

        HiveParser_IdentifiersParser.precedenceStarExpression_return precedenceStarExpression204 =null;



        try {
            // IdentifiersParser.g:376:5: ( precedenceStarExpression ( precedencePlusOperator ^ precedenceStarExpression )* )
            // IdentifiersParser.g:377:5: precedenceStarExpression ( precedencePlusOperator ^ precedenceStarExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_precedenceStarExpression_in_precedencePlusExpression2358);
            precedenceStarExpression202=precedenceStarExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceStarExpression202.getTree());

            // IdentifiersParser.g:377:30: ( precedencePlusOperator ^ precedenceStarExpression )*
            loop43:
            do {
                int alt43=2;
                alt43 = dfa43.predict(input);
                switch (alt43) {
            	case 1 :
            	    // IdentifiersParser.g:377:31: precedencePlusOperator ^ precedenceStarExpression
            	    {
            	    pushFollow(FOLLOW_precedencePlusOperator_in_precedencePlusExpression2361);
            	    precedencePlusOperator203=precedencePlusOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedencePlusOperator203.getTree(), root_0);

            	    pushFollow(FOLLOW_precedenceStarExpression_in_precedencePlusExpression2364);
            	    precedenceStarExpression204=precedenceStarExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceStarExpression204.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


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
    // $ANTLR end "precedencePlusExpression"


    public static class precedenceAmpersandOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceAmpersandOperator"
    // IdentifiersParser.g:381:1: precedenceAmpersandOperator : AMPERSAND ;
    public final HiveParser_IdentifiersParser.precedenceAmpersandOperator_return precedenceAmpersandOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceAmpersandOperator_return retval = new HiveParser_IdentifiersParser.precedenceAmpersandOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AMPERSAND205=null;

        CommonTree AMPERSAND205_tree=null;

        try {
            // IdentifiersParser.g:382:5: ( AMPERSAND )
            // IdentifiersParser.g:383:5: AMPERSAND
            {
            root_0 = (CommonTree)adaptor.nil();


            AMPERSAND205=(Token)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_precedenceAmpersandOperator2388); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AMPERSAND205_tree = 
            (CommonTree)adaptor.create(AMPERSAND205)
            ;
            adaptor.addChild(root_0, AMPERSAND205_tree);
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
    // $ANTLR end "precedenceAmpersandOperator"


    public static class precedenceAmpersandExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceAmpersandExpression"
    // IdentifiersParser.g:386:1: precedenceAmpersandExpression : precedencePlusExpression ( precedenceAmpersandOperator ^ precedencePlusExpression )* ;
    public final HiveParser_IdentifiersParser.precedenceAmpersandExpression_return precedenceAmpersandExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceAmpersandExpression_return retval = new HiveParser_IdentifiersParser.precedenceAmpersandExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedencePlusExpression_return precedencePlusExpression206 =null;

        HiveParser_IdentifiersParser.precedenceAmpersandOperator_return precedenceAmpersandOperator207 =null;

        HiveParser_IdentifiersParser.precedencePlusExpression_return precedencePlusExpression208 =null;



        try {
            // IdentifiersParser.g:387:5: ( precedencePlusExpression ( precedenceAmpersandOperator ^ precedencePlusExpression )* )
            // IdentifiersParser.g:388:5: precedencePlusExpression ( precedenceAmpersandOperator ^ precedencePlusExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_precedencePlusExpression_in_precedenceAmpersandExpression2409);
            precedencePlusExpression206=precedencePlusExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedencePlusExpression206.getTree());

            // IdentifiersParser.g:388:30: ( precedenceAmpersandOperator ^ precedencePlusExpression )*
            loop44:
            do {
                int alt44=2;
                alt44 = dfa44.predict(input);
                switch (alt44) {
            	case 1 :
            	    // IdentifiersParser.g:388:31: precedenceAmpersandOperator ^ precedencePlusExpression
            	    {
            	    pushFollow(FOLLOW_precedenceAmpersandOperator_in_precedenceAmpersandExpression2412);
            	    precedenceAmpersandOperator207=precedenceAmpersandOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceAmpersandOperator207.getTree(), root_0);

            	    pushFollow(FOLLOW_precedencePlusExpression_in_precedenceAmpersandExpression2415);
            	    precedencePlusExpression208=precedencePlusExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, precedencePlusExpression208.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


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
    // $ANTLR end "precedenceAmpersandExpression"


    public static class precedenceBitwiseOrOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceBitwiseOrOperator"
    // IdentifiersParser.g:392:1: precedenceBitwiseOrOperator : BITWISEOR ;
    public final HiveParser_IdentifiersParser.precedenceBitwiseOrOperator_return precedenceBitwiseOrOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceBitwiseOrOperator_return retval = new HiveParser_IdentifiersParser.precedenceBitwiseOrOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BITWISEOR209=null;

        CommonTree BITWISEOR209_tree=null;

        try {
            // IdentifiersParser.g:393:5: ( BITWISEOR )
            // IdentifiersParser.g:394:5: BITWISEOR
            {
            root_0 = (CommonTree)adaptor.nil();


            BITWISEOR209=(Token)match(input,BITWISEOR,FOLLOW_BITWISEOR_in_precedenceBitwiseOrOperator2439); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BITWISEOR209_tree = 
            (CommonTree)adaptor.create(BITWISEOR209)
            ;
            adaptor.addChild(root_0, BITWISEOR209_tree);
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
    // $ANTLR end "precedenceBitwiseOrOperator"


    public static class precedenceBitwiseOrExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceBitwiseOrExpression"
    // IdentifiersParser.g:397:1: precedenceBitwiseOrExpression : precedenceAmpersandExpression ( precedenceBitwiseOrOperator ^ precedenceAmpersandExpression )* ;
    public final HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return precedenceBitwiseOrExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return retval = new HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedenceAmpersandExpression_return precedenceAmpersandExpression210 =null;

        HiveParser_IdentifiersParser.precedenceBitwiseOrOperator_return precedenceBitwiseOrOperator211 =null;

        HiveParser_IdentifiersParser.precedenceAmpersandExpression_return precedenceAmpersandExpression212 =null;



        try {
            // IdentifiersParser.g:398:5: ( precedenceAmpersandExpression ( precedenceBitwiseOrOperator ^ precedenceAmpersandExpression )* )
            // IdentifiersParser.g:399:5: precedenceAmpersandExpression ( precedenceBitwiseOrOperator ^ precedenceAmpersandExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_precedenceAmpersandExpression_in_precedenceBitwiseOrExpression2460);
            precedenceAmpersandExpression210=precedenceAmpersandExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceAmpersandExpression210.getTree());

            // IdentifiersParser.g:399:35: ( precedenceBitwiseOrOperator ^ precedenceAmpersandExpression )*
            loop45:
            do {
                int alt45=2;
                alt45 = dfa45.predict(input);
                switch (alt45) {
            	case 1 :
            	    // IdentifiersParser.g:399:36: precedenceBitwiseOrOperator ^ precedenceAmpersandExpression
            	    {
            	    pushFollow(FOLLOW_precedenceBitwiseOrOperator_in_precedenceBitwiseOrExpression2463);
            	    precedenceBitwiseOrOperator211=precedenceBitwiseOrOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceBitwiseOrOperator211.getTree(), root_0);

            	    pushFollow(FOLLOW_precedenceAmpersandExpression_in_precedenceBitwiseOrExpression2466);
            	    precedenceAmpersandExpression212=precedenceAmpersandExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceAmpersandExpression212.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


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
    // $ANTLR end "precedenceBitwiseOrExpression"


    public static class precedenceEqualNegatableOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceEqualNegatableOperator"
    // IdentifiersParser.g:404:1: precedenceEqualNegatableOperator : ( KW_LIKE | KW_RLIKE | KW_REGEXP );
    public final HiveParser_IdentifiersParser.precedenceEqualNegatableOperator_return precedenceEqualNegatableOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceEqualNegatableOperator_return retval = new HiveParser_IdentifiersParser.precedenceEqualNegatableOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set213=null;

        CommonTree set213_tree=null;

        try {
            // IdentifiersParser.g:405:5: ( KW_LIKE | KW_RLIKE | KW_REGEXP )
            // IdentifiersParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set213=(Token)input.LT(1);

            if ( input.LA(1)==KW_LIKE||input.LA(1)==KW_REGEXP||input.LA(1)==KW_RLIKE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set213)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "precedenceEqualNegatableOperator"


    public static class precedenceEqualOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceEqualOperator"
    // IdentifiersParser.g:409:1: precedenceEqualOperator : ( precedenceEqualNegatableOperator | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | locationComparator );
    public final HiveParser_IdentifiersParser.precedenceEqualOperator_return precedenceEqualOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceEqualOperator_return retval = new HiveParser_IdentifiersParser.precedenceEqualOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQUAL215=null;
        Token EQUAL_NS216=null;
        Token NOTEQUAL217=null;
        Token LESSTHANOREQUALTO218=null;
        Token LESSTHAN219=null;
        Token GREATERTHANOREQUALTO220=null;
        Token GREATERTHAN221=null;
        HiveParser_IdentifiersParser.precedenceEqualNegatableOperator_return precedenceEqualNegatableOperator214 =null;

        HiveParser_IdentifiersParser.locationComparator_return locationComparator222 =null;


        CommonTree EQUAL215_tree=null;
        CommonTree EQUAL_NS216_tree=null;
        CommonTree NOTEQUAL217_tree=null;
        CommonTree LESSTHANOREQUALTO218_tree=null;
        CommonTree LESSTHAN219_tree=null;
        CommonTree GREATERTHANOREQUALTO220_tree=null;
        CommonTree GREATERTHAN221_tree=null;

        try {
            // IdentifiersParser.g:410:5: ( precedenceEqualNegatableOperator | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | locationComparator )
            int alt46=9;
            switch ( input.LA(1) ) {
            case KW_LIKE:
            case KW_REGEXP:
            case KW_RLIKE:
                {
                alt46=1;
                }
                break;
            case EQUAL:
                {
                alt46=2;
                }
                break;
            case EQUAL_NS:
                {
                alt46=3;
                }
                break;
            case NOTEQUAL:
                {
                alt46=4;
                }
                break;
            case LESSTHANOREQUALTO:
                {
                alt46=5;
                }
                break;
            case LESSTHAN:
                {
                alt46=6;
                }
                break;
            case GREATERTHANOREQUALTO:
                {
                alt46=7;
                }
                break;
            case GREATERTHAN:
                {
                alt46=8;
                }
                break;
            case KW_CONTAINS:
            case KW_IS:
            case KW_OVERLAPS:
                {
                alt46=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }

            switch (alt46) {
                case 1 :
                    // IdentifiersParser.g:411:5: precedenceEqualNegatableOperator
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_precedenceEqualNegatableOperator_in_precedenceEqualOperator2520);
                    precedenceEqualNegatableOperator214=precedenceEqualNegatableOperator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceEqualNegatableOperator214.getTree());

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:411:40: EQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    EQUAL215=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_precedenceEqualOperator2524); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUAL215_tree = 
                    (CommonTree)adaptor.create(EQUAL215)
                    ;
                    adaptor.addChild(root_0, EQUAL215_tree);
                    }

                    }
                    break;
                case 3 :
                    // IdentifiersParser.g:411:48: EQUAL_NS
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    EQUAL_NS216=(Token)match(input,EQUAL_NS,FOLLOW_EQUAL_NS_in_precedenceEqualOperator2528); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUAL_NS216_tree = 
                    (CommonTree)adaptor.create(EQUAL_NS216)
                    ;
                    adaptor.addChild(root_0, EQUAL_NS216_tree);
                    }

                    }
                    break;
                case 4 :
                    // IdentifiersParser.g:411:59: NOTEQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NOTEQUAL217=(Token)match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_precedenceEqualOperator2532); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOTEQUAL217_tree = 
                    (CommonTree)adaptor.create(NOTEQUAL217)
                    ;
                    adaptor.addChild(root_0, NOTEQUAL217_tree);
                    }

                    }
                    break;
                case 5 :
                    // IdentifiersParser.g:411:70: LESSTHANOREQUALTO
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LESSTHANOREQUALTO218=(Token)match(input,LESSTHANOREQUALTO,FOLLOW_LESSTHANOREQUALTO_in_precedenceEqualOperator2536); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LESSTHANOREQUALTO218_tree = 
                    (CommonTree)adaptor.create(LESSTHANOREQUALTO218)
                    ;
                    adaptor.addChild(root_0, LESSTHANOREQUALTO218_tree);
                    }

                    }
                    break;
                case 6 :
                    // IdentifiersParser.g:411:90: LESSTHAN
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LESSTHAN219=(Token)match(input,LESSTHAN,FOLLOW_LESSTHAN_in_precedenceEqualOperator2540); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LESSTHAN219_tree = 
                    (CommonTree)adaptor.create(LESSTHAN219)
                    ;
                    adaptor.addChild(root_0, LESSTHAN219_tree);
                    }

                    }
                    break;
                case 7 :
                    // IdentifiersParser.g:411:101: GREATERTHANOREQUALTO
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    GREATERTHANOREQUALTO220=(Token)match(input,GREATERTHANOREQUALTO,FOLLOW_GREATERTHANOREQUALTO_in_precedenceEqualOperator2544); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GREATERTHANOREQUALTO220_tree = 
                    (CommonTree)adaptor.create(GREATERTHANOREQUALTO220)
                    ;
                    adaptor.addChild(root_0, GREATERTHANOREQUALTO220_tree);
                    }

                    }
                    break;
                case 8 :
                    // IdentifiersParser.g:411:124: GREATERTHAN
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    GREATERTHAN221=(Token)match(input,GREATERTHAN,FOLLOW_GREATERTHAN_in_precedenceEqualOperator2548); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GREATERTHAN221_tree = 
                    (CommonTree)adaptor.create(GREATERTHAN221)
                    ;
                    adaptor.addChild(root_0, GREATERTHAN221_tree);
                    }

                    }
                    break;
                case 9 :
                    // IdentifiersParser.g:412:7: locationComparator
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_locationComparator_in_precedenceEqualOperator2557);
                    locationComparator222=locationComparator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, locationComparator222.getTree());

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
    // $ANTLR end "precedenceEqualOperator"


    public static class locationComparator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "locationComparator"
    // IdentifiersParser.g:415:1: locationComparator : ( KW_IS KW_BEFORE -> TOK_ISBEFORE | KW_IS KW_AFTER -> TOK_ISAFTER | KW_IS KW_ADJACENT KW_TO -> TOK_ISADJACENTTO | KW_IS KW_CORRESPONDING KW_TO -> TOK_ISCORRESPONDINGTO | KW_OVERLAPS KW_WITH -> TOK_OVERLAPSWITH | KW_CONTAINS -> TOK_CONTAINS | KW_IS KW_WITHIN -> TOK_ISWITHIN | KW_IS KW_PREFIX KW_OF -> TOK_ISPREFIXOF | KW_IS KW_SUFFIX KW_OF -> TOK_ISSUFFIXOF | KW_IS KW_UPSTREAM KW_OF -> TOK_ISUPSTREAMOF | KW_IS KW_DOWNSTREAM KW_OF -> TOK_ISDOWNSTREAMOF | KW_IS KW_CLOSEST KW_TO -> TOK_ISCLOSESTTO );
    public final HiveParser_IdentifiersParser.locationComparator_return locationComparator() throws RecognitionException {
        HiveParser_IdentifiersParser.locationComparator_return retval = new HiveParser_IdentifiersParser.locationComparator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_IS223=null;
        Token KW_BEFORE224=null;
        Token KW_IS225=null;
        Token KW_AFTER226=null;
        Token KW_IS227=null;
        Token KW_ADJACENT228=null;
        Token KW_TO229=null;
        Token KW_IS230=null;
        Token KW_CORRESPONDING231=null;
        Token KW_TO232=null;
        Token KW_OVERLAPS233=null;
        Token KW_WITH234=null;
        Token KW_CONTAINS235=null;
        Token KW_IS236=null;
        Token KW_WITHIN237=null;
        Token KW_IS238=null;
        Token KW_PREFIX239=null;
        Token KW_OF240=null;
        Token KW_IS241=null;
        Token KW_SUFFIX242=null;
        Token KW_OF243=null;
        Token KW_IS244=null;
        Token KW_UPSTREAM245=null;
        Token KW_OF246=null;
        Token KW_IS247=null;
        Token KW_DOWNSTREAM248=null;
        Token KW_OF249=null;
        Token KW_IS250=null;
        Token KW_CLOSEST251=null;
        Token KW_TO252=null;

        CommonTree KW_IS223_tree=null;
        CommonTree KW_BEFORE224_tree=null;
        CommonTree KW_IS225_tree=null;
        CommonTree KW_AFTER226_tree=null;
        CommonTree KW_IS227_tree=null;
        CommonTree KW_ADJACENT228_tree=null;
        CommonTree KW_TO229_tree=null;
        CommonTree KW_IS230_tree=null;
        CommonTree KW_CORRESPONDING231_tree=null;
        CommonTree KW_TO232_tree=null;
        CommonTree KW_OVERLAPS233_tree=null;
        CommonTree KW_WITH234_tree=null;
        CommonTree KW_CONTAINS235_tree=null;
        CommonTree KW_IS236_tree=null;
        CommonTree KW_WITHIN237_tree=null;
        CommonTree KW_IS238_tree=null;
        CommonTree KW_PREFIX239_tree=null;
        CommonTree KW_OF240_tree=null;
        CommonTree KW_IS241_tree=null;
        CommonTree KW_SUFFIX242_tree=null;
        CommonTree KW_OF243_tree=null;
        CommonTree KW_IS244_tree=null;
        CommonTree KW_UPSTREAM245_tree=null;
        CommonTree KW_OF246_tree=null;
        CommonTree KW_IS247_tree=null;
        CommonTree KW_DOWNSTREAM248_tree=null;
        CommonTree KW_OF249_tree=null;
        CommonTree KW_IS250_tree=null;
        CommonTree KW_CLOSEST251_tree=null;
        CommonTree KW_TO252_tree=null;
        RewriteRuleTokenStream stream_KW_PREFIX=new RewriteRuleTokenStream(adaptor,"token KW_PREFIX");
        RewriteRuleTokenStream stream_KW_WITHIN=new RewriteRuleTokenStream(adaptor,"token KW_WITHIN");
        RewriteRuleTokenStream stream_KW_ADJACENT=new RewriteRuleTokenStream(adaptor,"token KW_ADJACENT");
        RewriteRuleTokenStream stream_KW_CORRESPONDING=new RewriteRuleTokenStream(adaptor,"token KW_CORRESPONDING");
        RewriteRuleTokenStream stream_KW_AFTER=new RewriteRuleTokenStream(adaptor,"token KW_AFTER");
        RewriteRuleTokenStream stream_KW_CONTAINS=new RewriteRuleTokenStream(adaptor,"token KW_CONTAINS");
        RewriteRuleTokenStream stream_KW_DOWNSTREAM=new RewriteRuleTokenStream(adaptor,"token KW_DOWNSTREAM");
        RewriteRuleTokenStream stream_KW_TO=new RewriteRuleTokenStream(adaptor,"token KW_TO");
        RewriteRuleTokenStream stream_KW_CLOSEST=new RewriteRuleTokenStream(adaptor,"token KW_CLOSEST");
        RewriteRuleTokenStream stream_KW_OVERLAPS=new RewriteRuleTokenStream(adaptor,"token KW_OVERLAPS");
        RewriteRuleTokenStream stream_KW_BEFORE=new RewriteRuleTokenStream(adaptor,"token KW_BEFORE");
        RewriteRuleTokenStream stream_KW_IS=new RewriteRuleTokenStream(adaptor,"token KW_IS");
        RewriteRuleTokenStream stream_KW_OF=new RewriteRuleTokenStream(adaptor,"token KW_OF");
        RewriteRuleTokenStream stream_KW_UPSTREAM=new RewriteRuleTokenStream(adaptor,"token KW_UPSTREAM");
        RewriteRuleTokenStream stream_KW_SUFFIX=new RewriteRuleTokenStream(adaptor,"token KW_SUFFIX");
        RewriteRuleTokenStream stream_KW_WITH=new RewriteRuleTokenStream(adaptor,"token KW_WITH");

        try {
            // IdentifiersParser.g:416:2: ( KW_IS KW_BEFORE -> TOK_ISBEFORE | KW_IS KW_AFTER -> TOK_ISAFTER | KW_IS KW_ADJACENT KW_TO -> TOK_ISADJACENTTO | KW_IS KW_CORRESPONDING KW_TO -> TOK_ISCORRESPONDINGTO | KW_OVERLAPS KW_WITH -> TOK_OVERLAPSWITH | KW_CONTAINS -> TOK_CONTAINS | KW_IS KW_WITHIN -> TOK_ISWITHIN | KW_IS KW_PREFIX KW_OF -> TOK_ISPREFIXOF | KW_IS KW_SUFFIX KW_OF -> TOK_ISSUFFIXOF | KW_IS KW_UPSTREAM KW_OF -> TOK_ISUPSTREAMOF | KW_IS KW_DOWNSTREAM KW_OF -> TOK_ISDOWNSTREAMOF | KW_IS KW_CLOSEST KW_TO -> TOK_ISCLOSESTTO )
            int alt47=12;
            switch ( input.LA(1) ) {
            case KW_IS:
                {
                switch ( input.LA(2) ) {
                case KW_BEFORE:
                    {
                    alt47=1;
                    }
                    break;
                case KW_AFTER:
                    {
                    alt47=2;
                    }
                    break;
                case KW_ADJACENT:
                    {
                    alt47=3;
                    }
                    break;
                case KW_CORRESPONDING:
                    {
                    alt47=4;
                    }
                    break;
                case KW_WITHIN:
                    {
                    alt47=7;
                    }
                    break;
                case KW_PREFIX:
                    {
                    alt47=8;
                    }
                    break;
                case KW_SUFFIX:
                    {
                    alt47=9;
                    }
                    break;
                case KW_UPSTREAM:
                    {
                    alt47=10;
                    }
                    break;
                case KW_DOWNSTREAM:
                    {
                    alt47=11;
                    }
                    break;
                case KW_CLOSEST:
                    {
                    alt47=12;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;

                }

                }
                break;
            case KW_OVERLAPS:
                {
                alt47=5;
                }
                break;
            case KW_CONTAINS:
                {
                alt47=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;

            }

            switch (alt47) {
                case 1 :
                    // IdentifiersParser.g:417:2: KW_IS KW_BEFORE
                    {
                    KW_IS223=(Token)match(input,KW_IS,FOLLOW_KW_IS_in_locationComparator2576); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_IS.add(KW_IS223);


                    KW_BEFORE224=(Token)match(input,KW_BEFORE,FOLLOW_KW_BEFORE_in_locationComparator2578); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BEFORE.add(KW_BEFORE224);


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
                    // 417:18: -> TOK_ISBEFORE
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(TOK_ISBEFORE, "TOK_ISBEFORE")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:418:4: KW_IS KW_AFTER
                    {
                    KW_IS225=(Token)match(input,KW_IS,FOLLOW_KW_IS_in_locationComparator2587); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_IS.add(KW_IS225);


                    KW_AFTER226=(Token)match(input,KW_AFTER,FOLLOW_KW_AFTER_in_locationComparator2589); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_AFTER.add(KW_AFTER226);


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
                    // 418:19: -> TOK_ISAFTER
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(TOK_ISAFTER, "TOK_ISAFTER")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // IdentifiersParser.g:419:4: KW_IS KW_ADJACENT KW_TO
                    {
                    KW_IS227=(Token)match(input,KW_IS,FOLLOW_KW_IS_in_locationComparator2598); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_IS.add(KW_IS227);


                    KW_ADJACENT228=(Token)match(input,KW_ADJACENT,FOLLOW_KW_ADJACENT_in_locationComparator2600); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ADJACENT.add(KW_ADJACENT228);


                    KW_TO229=(Token)match(input,KW_TO,FOLLOW_KW_TO_in_locationComparator2602); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_TO.add(KW_TO229);


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
                    // 419:28: -> TOK_ISADJACENTTO
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(TOK_ISADJACENTTO, "TOK_ISADJACENTTO")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // IdentifiersParser.g:420:4: KW_IS KW_CORRESPONDING KW_TO
                    {
                    KW_IS230=(Token)match(input,KW_IS,FOLLOW_KW_IS_in_locationComparator2611); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_IS.add(KW_IS230);


                    KW_CORRESPONDING231=(Token)match(input,KW_CORRESPONDING,FOLLOW_KW_CORRESPONDING_in_locationComparator2613); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_CORRESPONDING.add(KW_CORRESPONDING231);


                    KW_TO232=(Token)match(input,KW_TO,FOLLOW_KW_TO_in_locationComparator2615); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_TO.add(KW_TO232);


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
                    // 420:33: -> TOK_ISCORRESPONDINGTO
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(TOK_ISCORRESPONDINGTO, "TOK_ISCORRESPONDINGTO")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // IdentifiersParser.g:421:4: KW_OVERLAPS KW_WITH
                    {
                    KW_OVERLAPS233=(Token)match(input,KW_OVERLAPS,FOLLOW_KW_OVERLAPS_in_locationComparator2624); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_OVERLAPS.add(KW_OVERLAPS233);


                    KW_WITH234=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_locationComparator2626); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_WITH.add(KW_WITH234);


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
                    // 421:24: -> TOK_OVERLAPSWITH
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(TOK_OVERLAPSWITH, "TOK_OVERLAPSWITH")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // IdentifiersParser.g:422:4: KW_CONTAINS
                    {
                    KW_CONTAINS235=(Token)match(input,KW_CONTAINS,FOLLOW_KW_CONTAINS_in_locationComparator2635); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_CONTAINS.add(KW_CONTAINS235);


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
                    // 422:16: -> TOK_CONTAINS
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(TOK_CONTAINS, "TOK_CONTAINS")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // IdentifiersParser.g:423:4: KW_IS KW_WITHIN
                    {
                    KW_IS236=(Token)match(input,KW_IS,FOLLOW_KW_IS_in_locationComparator2644); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_IS.add(KW_IS236);


                    KW_WITHIN237=(Token)match(input,KW_WITHIN,FOLLOW_KW_WITHIN_in_locationComparator2646); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_WITHIN.add(KW_WITHIN237);


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
                    // 423:20: -> TOK_ISWITHIN
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(TOK_ISWITHIN, "TOK_ISWITHIN")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // IdentifiersParser.g:424:4: KW_IS KW_PREFIX KW_OF
                    {
                    KW_IS238=(Token)match(input,KW_IS,FOLLOW_KW_IS_in_locationComparator2655); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_IS.add(KW_IS238);


                    KW_PREFIX239=(Token)match(input,KW_PREFIX,FOLLOW_KW_PREFIX_in_locationComparator2657); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_PREFIX.add(KW_PREFIX239);


                    KW_OF240=(Token)match(input,KW_OF,FOLLOW_KW_OF_in_locationComparator2659); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_OF.add(KW_OF240);


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
                    // 424:26: -> TOK_ISPREFIXOF
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(TOK_ISPREFIXOF, "TOK_ISPREFIXOF")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 9 :
                    // IdentifiersParser.g:425:4: KW_IS KW_SUFFIX KW_OF
                    {
                    KW_IS241=(Token)match(input,KW_IS,FOLLOW_KW_IS_in_locationComparator2668); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_IS.add(KW_IS241);


                    KW_SUFFIX242=(Token)match(input,KW_SUFFIX,FOLLOW_KW_SUFFIX_in_locationComparator2670); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SUFFIX.add(KW_SUFFIX242);


                    KW_OF243=(Token)match(input,KW_OF,FOLLOW_KW_OF_in_locationComparator2672); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_OF.add(KW_OF243);


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
                    // 425:26: -> TOK_ISSUFFIXOF
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(TOK_ISSUFFIXOF, "TOK_ISSUFFIXOF")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 10 :
                    // IdentifiersParser.g:426:4: KW_IS KW_UPSTREAM KW_OF
                    {
                    KW_IS244=(Token)match(input,KW_IS,FOLLOW_KW_IS_in_locationComparator2681); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_IS.add(KW_IS244);


                    KW_UPSTREAM245=(Token)match(input,KW_UPSTREAM,FOLLOW_KW_UPSTREAM_in_locationComparator2683); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_UPSTREAM.add(KW_UPSTREAM245);


                    KW_OF246=(Token)match(input,KW_OF,FOLLOW_KW_OF_in_locationComparator2685); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_OF.add(KW_OF246);


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
                    // 426:28: -> TOK_ISUPSTREAMOF
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(TOK_ISUPSTREAMOF, "TOK_ISUPSTREAMOF")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 11 :
                    // IdentifiersParser.g:427:4: KW_IS KW_DOWNSTREAM KW_OF
                    {
                    KW_IS247=(Token)match(input,KW_IS,FOLLOW_KW_IS_in_locationComparator2694); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_IS.add(KW_IS247);


                    KW_DOWNSTREAM248=(Token)match(input,KW_DOWNSTREAM,FOLLOW_KW_DOWNSTREAM_in_locationComparator2696); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_DOWNSTREAM.add(KW_DOWNSTREAM248);


                    KW_OF249=(Token)match(input,KW_OF,FOLLOW_KW_OF_in_locationComparator2698); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_OF.add(KW_OF249);


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
                    // 427:30: -> TOK_ISDOWNSTREAMOF
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(TOK_ISDOWNSTREAMOF, "TOK_ISDOWNSTREAMOF")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 12 :
                    // IdentifiersParser.g:428:4: KW_IS KW_CLOSEST KW_TO
                    {
                    KW_IS250=(Token)match(input,KW_IS,FOLLOW_KW_IS_in_locationComparator2707); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_IS.add(KW_IS250);


                    KW_CLOSEST251=(Token)match(input,KW_CLOSEST,FOLLOW_KW_CLOSEST_in_locationComparator2709); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_CLOSEST.add(KW_CLOSEST251);


                    KW_TO252=(Token)match(input,KW_TO,FOLLOW_KW_TO_in_locationComparator2711); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_TO.add(KW_TO252);


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
                    // 428:27: -> TOK_ISCLOSESTTO
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(TOK_ISCLOSESTTO, "TOK_ISCLOSESTTO")
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
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "locationComparator"


    public static class precedenceEqualExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceEqualExpression"
    // IdentifiersParser.g:432:1: precedenceEqualExpression : (left= precedenceBitwiseOrExpression -> $left) ( ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression ) -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) ) | ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression ) -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr) | ( KW_NOT KW_IN expressions ) -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) ) | ( KW_IN expressions ) -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) | ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max) | ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max) )* ;
    public final HiveParser_IdentifiersParser.precedenceEqualExpression_return precedenceEqualExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceEqualExpression_return retval = new HiveParser_IdentifiersParser.precedenceEqualExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_NOT253=null;
        Token KW_NOT256=null;
        Token KW_IN257=null;
        Token KW_IN259=null;
        Token KW_NOT261=null;
        Token KW_BETWEEN262=null;
        Token KW_AND263=null;
        Token KW_BETWEEN264=null;
        Token KW_AND265=null;
        HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return left =null;

        HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return notExpr =null;

        HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return equalExpr =null;

        HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return min =null;

        HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return max =null;

        HiveParser_IdentifiersParser.precedenceEqualNegatableOperator_return precedenceEqualNegatableOperator254 =null;

        HiveParser_IdentifiersParser.precedenceEqualOperator_return precedenceEqualOperator255 =null;

        HiveParser_IdentifiersParser.expressions_return expressions258 =null;

        HiveParser_IdentifiersParser.expressions_return expressions260 =null;


        CommonTree KW_NOT253_tree=null;
        CommonTree KW_NOT256_tree=null;
        CommonTree KW_IN257_tree=null;
        CommonTree KW_IN259_tree=null;
        CommonTree KW_NOT261_tree=null;
        CommonTree KW_BETWEEN262_tree=null;
        CommonTree KW_AND263_tree=null;
        CommonTree KW_BETWEEN264_tree=null;
        CommonTree KW_AND265_tree=null;
        RewriteRuleTokenStream stream_KW_IN=new RewriteRuleTokenStream(adaptor,"token KW_IN");
        RewriteRuleTokenStream stream_KW_BETWEEN=new RewriteRuleTokenStream(adaptor,"token KW_BETWEEN");
        RewriteRuleTokenStream stream_KW_AND=new RewriteRuleTokenStream(adaptor,"token KW_AND");
        RewriteRuleTokenStream stream_KW_NOT=new RewriteRuleTokenStream(adaptor,"token KW_NOT");
        RewriteRuleSubtreeStream stream_precedenceEqualNegatableOperator=new RewriteRuleSubtreeStream(adaptor,"rule precedenceEqualNegatableOperator");
        RewriteRuleSubtreeStream stream_precedenceEqualOperator=new RewriteRuleSubtreeStream(adaptor,"rule precedenceEqualOperator");
        RewriteRuleSubtreeStream stream_precedenceBitwiseOrExpression=new RewriteRuleSubtreeStream(adaptor,"rule precedenceBitwiseOrExpression");
        RewriteRuleSubtreeStream stream_expressions=new RewriteRuleSubtreeStream(adaptor,"rule expressions");
        try {
            // IdentifiersParser.g:433:5: ( (left= precedenceBitwiseOrExpression -> $left) ( ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression ) -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) ) | ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression ) -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr) | ( KW_NOT KW_IN expressions ) -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) ) | ( KW_IN expressions ) -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) | ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max) | ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max) )* )
            // IdentifiersParser.g:434:5: (left= precedenceBitwiseOrExpression -> $left) ( ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression ) -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) ) | ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression ) -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr) | ( KW_NOT KW_IN expressions ) -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) ) | ( KW_IN expressions ) -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) | ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max) | ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max) )*
            {
            // IdentifiersParser.g:434:5: (left= precedenceBitwiseOrExpression -> $left)
            // IdentifiersParser.g:434:6: left= precedenceBitwiseOrExpression
            {
            pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2737);
            left=precedenceBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(left.getTree());

            // AST REWRITE
            // elements: left
            // token labels: 
            // rule labels: retval, left
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_left=new RewriteRuleSubtreeStream(adaptor,"rule left",left!=null?left.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 434:41: -> $left
            {
                adaptor.addChild(root_0, stream_left.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // IdentifiersParser.g:435:5: ( ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression ) -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) ) | ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression ) -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr) | ( KW_NOT KW_IN expressions ) -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) ) | ( KW_IN expressions ) -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) | ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max) | ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max) )*
            loop48:
            do {
                int alt48=7;
                alt48 = dfa48.predict(input);
                switch (alt48) {
            	case 1 :
            	    // IdentifiersParser.g:436:8: ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression )
            	    {
            	    // IdentifiersParser.g:436:8: ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression )
            	    // IdentifiersParser.g:436:9: KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression
            	    {
            	    KW_NOT253=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_precedenceEqualExpression2759); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT253);


            	    pushFollow(FOLLOW_precedenceEqualNegatableOperator_in_precedenceEqualExpression2761);
            	    precedenceEqualNegatableOperator254=precedenceEqualNegatableOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_precedenceEqualNegatableOperator.add(precedenceEqualNegatableOperator254.getTree());

            	    pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2765);
            	    notExpr=precedenceBitwiseOrExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(notExpr.getTree());

            	    }


            	    // AST REWRITE
            	    // elements: KW_NOT, notExpr, precedenceEqualNegatableOperator, precedenceEqualExpression
            	    // token labels: 
            	    // rule labels: retval, notExpr
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_notExpr=new RewriteRuleSubtreeStream(adaptor,"rule notExpr",notExpr!=null?notExpr.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 437:8: -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) )
            	    {
            	        // IdentifiersParser.g:437:11: ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(
            	        stream_KW_NOT.nextNode()
            	        , root_1);

            	        // IdentifiersParser.g:437:20: ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr)
            	        {
            	        CommonTree root_2 = (CommonTree)adaptor.nil();
            	        root_2 = (CommonTree)adaptor.becomeRoot(stream_precedenceEqualNegatableOperator.nextNode(), root_2);

            	        adaptor.addChild(root_2, stream_retval.nextTree());

            	        adaptor.addChild(root_2, stream_notExpr.nextTree());

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
            	    // IdentifiersParser.g:438:7: ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression )
            	    {
            	    // IdentifiersParser.g:438:7: ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression )
            	    // IdentifiersParser.g:438:8: precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression
            	    {
            	    pushFollow(FOLLOW_precedenceEqualOperator_in_precedenceEqualExpression2798);
            	    precedenceEqualOperator255=precedenceEqualOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_precedenceEqualOperator.add(precedenceEqualOperator255.getTree());

            	    pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2802);
            	    equalExpr=precedenceBitwiseOrExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(equalExpr.getTree());

            	    }


            	    // AST REWRITE
            	    // elements: equalExpr, precedenceEqualExpression, precedenceEqualOperator
            	    // token labels: 
            	    // rule labels: equalExpr, retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_equalExpr=new RewriteRuleSubtreeStream(adaptor,"rule equalExpr",equalExpr!=null?equalExpr.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 439:8: -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr)
            	    {
            	        // IdentifiersParser.g:439:11: ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(stream_precedenceEqualOperator.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_equalExpr.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 3 :
            	    // IdentifiersParser.g:440:7: ( KW_NOT KW_IN expressions )
            	    {
            	    // IdentifiersParser.g:440:7: ( KW_NOT KW_IN expressions )
            	    // IdentifiersParser.g:440:8: KW_NOT KW_IN expressions
            	    {
            	    KW_NOT256=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_precedenceEqualExpression2831); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT256);


            	    KW_IN257=(Token)match(input,KW_IN,FOLLOW_KW_IN_in_precedenceEqualExpression2833); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_KW_IN.add(KW_IN257);


            	    pushFollow(FOLLOW_expressions_in_precedenceEqualExpression2835);
            	    expressions258=expressions();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expressions.add(expressions258.getTree());

            	    }


            	    // AST REWRITE
            	    // elements: KW_NOT, expressions, KW_IN, precedenceEqualExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 441:8: -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) )
            	    {
            	        // IdentifiersParser.g:441:11: ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(
            	        stream_KW_NOT.nextNode()
            	        , root_1);

            	        // IdentifiersParser.g:441:20: ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions )
            	        {
            	        CommonTree root_2 = (CommonTree)adaptor.nil();
            	        root_2 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
            	        , root_2);

            	        adaptor.addChild(root_2, 
            	        stream_KW_IN.nextNode()
            	        );

            	        adaptor.addChild(root_2, stream_retval.nextTree());

            	        adaptor.addChild(root_2, stream_expressions.nextTree());

            	        adaptor.addChild(root_1, root_2);
            	        }

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 4 :
            	    // IdentifiersParser.g:442:7: ( KW_IN expressions )
            	    {
            	    // IdentifiersParser.g:442:7: ( KW_IN expressions )
            	    // IdentifiersParser.g:442:8: KW_IN expressions
            	    {
            	    KW_IN259=(Token)match(input,KW_IN,FOLLOW_KW_IN_in_precedenceEqualExpression2869); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_KW_IN.add(KW_IN259);


            	    pushFollow(FOLLOW_expressions_in_precedenceEqualExpression2871);
            	    expressions260=expressions();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expressions.add(expressions260.getTree());

            	    }


            	    // AST REWRITE
            	    // elements: precedenceEqualExpression, KW_IN, expressions
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 443:8: -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions )
            	    {
            	        // IdentifiersParser.g:443:11: ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
            	        , root_1);

            	        adaptor.addChild(root_1, 
            	        stream_KW_IN.nextNode()
            	        );

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_expressions.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 5 :
            	    // IdentifiersParser.g:444:7: ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) )
            	    {
            	    // IdentifiersParser.g:444:7: ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) )
            	    // IdentifiersParser.g:444:9: KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression )
            	    {
            	    KW_NOT261=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_precedenceEqualExpression2902); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT261);


            	    KW_BETWEEN262=(Token)match(input,KW_BETWEEN,FOLLOW_KW_BETWEEN_in_precedenceEqualExpression2904); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_KW_BETWEEN.add(KW_BETWEEN262);


            	    // IdentifiersParser.g:444:27: (min= precedenceBitwiseOrExpression )
            	    // IdentifiersParser.g:444:28: min= precedenceBitwiseOrExpression
            	    {
            	    pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2909);
            	    min=precedenceBitwiseOrExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(min.getTree());

            	    }


            	    KW_AND263=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_precedenceEqualExpression2912); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_KW_AND.add(KW_AND263);


            	    // IdentifiersParser.g:444:70: (max= precedenceBitwiseOrExpression )
            	    // IdentifiersParser.g:444:71: max= precedenceBitwiseOrExpression
            	    {
            	    pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2917);
            	    max=precedenceBitwiseOrExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(max.getTree());

            	    }


            	    }


            	    // AST REWRITE
            	    // elements: left, max, min
            	    // token labels: 
            	    // rule labels: min, retval, max, left
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_min=new RewriteRuleSubtreeStream(adaptor,"rule min",min!=null?min.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_max=new RewriteRuleSubtreeStream(adaptor,"rule max",max!=null?max.tree:null);
            	    RewriteRuleSubtreeStream stream_left=new RewriteRuleSubtreeStream(adaptor,"rule left",left!=null?left.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 445:8: -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max)
            	    {
            	        // IdentifiersParser.g:445:11: ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
            	        , root_1);

            	        adaptor.addChild(root_1, 
            	        (CommonTree)adaptor.create(Identifier, "between")
            	        );

            	        adaptor.addChild(root_1, 
            	        (CommonTree)adaptor.create(KW_TRUE, "KW_TRUE")
            	        );

            	        adaptor.addChild(root_1, stream_left.nextTree());

            	        adaptor.addChild(root_1, stream_min.nextTree());

            	        adaptor.addChild(root_1, stream_max.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 6 :
            	    // IdentifiersParser.g:446:7: ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) )
            	    {
            	    // IdentifiersParser.g:446:7: ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) )
            	    // IdentifiersParser.g:446:9: KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression )
            	    {
            	    KW_BETWEEN264=(Token)match(input,KW_BETWEEN,FOLLOW_KW_BETWEEN_in_precedenceEqualExpression2957); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_KW_BETWEEN.add(KW_BETWEEN264);


            	    // IdentifiersParser.g:446:20: (min= precedenceBitwiseOrExpression )
            	    // IdentifiersParser.g:446:21: min= precedenceBitwiseOrExpression
            	    {
            	    pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2962);
            	    min=precedenceBitwiseOrExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(min.getTree());

            	    }


            	    KW_AND265=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_precedenceEqualExpression2965); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_KW_AND.add(KW_AND265);


            	    // IdentifiersParser.g:446:63: (max= precedenceBitwiseOrExpression )
            	    // IdentifiersParser.g:446:64: max= precedenceBitwiseOrExpression
            	    {
            	    pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2970);
            	    max=precedenceBitwiseOrExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(max.getTree());

            	    }


            	    }


            	    // AST REWRITE
            	    // elements: min, left, max
            	    // token labels: 
            	    // rule labels: min, retval, max, left
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_min=new RewriteRuleSubtreeStream(adaptor,"rule min",min!=null?min.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_max=new RewriteRuleSubtreeStream(adaptor,"rule max",max!=null?max.tree:null);
            	    RewriteRuleSubtreeStream stream_left=new RewriteRuleSubtreeStream(adaptor,"rule left",left!=null?left.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 447:8: -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max)
            	    {
            	        // IdentifiersParser.g:447:11: ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
            	        , root_1);

            	        adaptor.addChild(root_1, 
            	        (CommonTree)adaptor.create(Identifier, "between")
            	        );

            	        adaptor.addChild(root_1, 
            	        (CommonTree)adaptor.create(KW_FALSE, "KW_FALSE")
            	        );

            	        adaptor.addChild(root_1, stream_left.nextTree());

            	        adaptor.addChild(root_1, stream_min.nextTree());

            	        adaptor.addChild(root_1, stream_max.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


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
    // $ANTLR end "precedenceEqualExpression"


    public static class expressions_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressions"
    // IdentifiersParser.g:451:1: expressions : LPAREN expression ( COMMA expression )* RPAREN -> ( expression )* ;
    public final HiveParser_IdentifiersParser.expressions_return expressions() throws RecognitionException {
        HiveParser_IdentifiersParser.expressions_return retval = new HiveParser_IdentifiersParser.expressions_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LPAREN266=null;
        Token COMMA268=null;
        Token RPAREN270=null;
        HiveParser_IdentifiersParser.expression_return expression267 =null;

        HiveParser_IdentifiersParser.expression_return expression269 =null;


        CommonTree LPAREN266_tree=null;
        CommonTree COMMA268_tree=null;
        CommonTree RPAREN270_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // IdentifiersParser.g:452:5: ( LPAREN expression ( COMMA expression )* RPAREN -> ( expression )* )
            // IdentifiersParser.g:453:5: LPAREN expression ( COMMA expression )* RPAREN
            {
            LPAREN266=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expressions3028); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN266);


            pushFollow(FOLLOW_expression_in_expressions3030);
            expression267=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression267.getTree());

            // IdentifiersParser.g:453:23: ( COMMA expression )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==COMMA) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // IdentifiersParser.g:453:24: COMMA expression
            	    {
            	    COMMA268=(Token)match(input,COMMA,FOLLOW_COMMA_in_expressions3033); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA268);


            	    pushFollow(FOLLOW_expression_in_expressions3035);
            	    expression269=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression269.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            RPAREN270=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expressions3039); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN270);


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
            // 453:50: -> ( expression )*
            {
                // IdentifiersParser.g:453:53: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_0, stream_expression.nextTree());

                }
                stream_expression.reset();

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
    // $ANTLR end "expressions"


    public static class precedenceNotOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceNotOperator"
    // IdentifiersParser.g:456:1: precedenceNotOperator : KW_NOT ;
    public final HiveParser_IdentifiersParser.precedenceNotOperator_return precedenceNotOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceNotOperator_return retval = new HiveParser_IdentifiersParser.precedenceNotOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_NOT271=null;

        CommonTree KW_NOT271_tree=null;

        try {
            // IdentifiersParser.g:457:5: ( KW_NOT )
            // IdentifiersParser.g:458:5: KW_NOT
            {
            root_0 = (CommonTree)adaptor.nil();


            KW_NOT271=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_precedenceNotOperator3065); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_NOT271_tree = 
            (CommonTree)adaptor.create(KW_NOT271)
            ;
            adaptor.addChild(root_0, KW_NOT271_tree);
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
    // $ANTLR end "precedenceNotOperator"


    public static class precedenceNotExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceNotExpression"
    // IdentifiersParser.g:461:1: precedenceNotExpression : ( precedenceNotOperator ^)* precedenceEqualExpression ;
    public final HiveParser_IdentifiersParser.precedenceNotExpression_return precedenceNotExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceNotExpression_return retval = new HiveParser_IdentifiersParser.precedenceNotExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedenceNotOperator_return precedenceNotOperator272 =null;

        HiveParser_IdentifiersParser.precedenceEqualExpression_return precedenceEqualExpression273 =null;



        try {
            // IdentifiersParser.g:462:5: ( ( precedenceNotOperator ^)* precedenceEqualExpression )
            // IdentifiersParser.g:463:5: ( precedenceNotOperator ^)* precedenceEqualExpression
            {
            root_0 = (CommonTree)adaptor.nil();


            // IdentifiersParser.g:463:5: ( precedenceNotOperator ^)*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==KW_NOT) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // IdentifiersParser.g:463:6: precedenceNotOperator ^
            	    {
            	    pushFollow(FOLLOW_precedenceNotOperator_in_precedenceNotExpression3087);
            	    precedenceNotOperator272=precedenceNotOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceNotOperator272.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            pushFollow(FOLLOW_precedenceEqualExpression_in_precedenceNotExpression3092);
            precedenceEqualExpression273=precedenceEqualExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceEqualExpression273.getTree());

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
    // $ANTLR end "precedenceNotExpression"


    public static class precedenceAndOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceAndOperator"
    // IdentifiersParser.g:467:1: precedenceAndOperator : KW_AND ;
    public final HiveParser_IdentifiersParser.precedenceAndOperator_return precedenceAndOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceAndOperator_return retval = new HiveParser_IdentifiersParser.precedenceAndOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_AND274=null;

        CommonTree KW_AND274_tree=null;

        try {
            // IdentifiersParser.g:468:5: ( KW_AND )
            // IdentifiersParser.g:469:5: KW_AND
            {
            root_0 = (CommonTree)adaptor.nil();


            KW_AND274=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_precedenceAndOperator3114); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_AND274_tree = 
            (CommonTree)adaptor.create(KW_AND274)
            ;
            adaptor.addChild(root_0, KW_AND274_tree);
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
    // $ANTLR end "precedenceAndOperator"


    public static class precedenceAndExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceAndExpression"
    // IdentifiersParser.g:472:1: precedenceAndExpression : precedenceNotExpression ( precedenceAndOperator ^ precedenceNotExpression )* ;
    public final HiveParser_IdentifiersParser.precedenceAndExpression_return precedenceAndExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceAndExpression_return retval = new HiveParser_IdentifiersParser.precedenceAndExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedenceNotExpression_return precedenceNotExpression275 =null;

        HiveParser_IdentifiersParser.precedenceAndOperator_return precedenceAndOperator276 =null;

        HiveParser_IdentifiersParser.precedenceNotExpression_return precedenceNotExpression277 =null;



        try {
            // IdentifiersParser.g:473:5: ( precedenceNotExpression ( precedenceAndOperator ^ precedenceNotExpression )* )
            // IdentifiersParser.g:474:5: precedenceNotExpression ( precedenceAndOperator ^ precedenceNotExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_precedenceNotExpression_in_precedenceAndExpression3135);
            precedenceNotExpression275=precedenceNotExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceNotExpression275.getTree());

            // IdentifiersParser.g:474:29: ( precedenceAndOperator ^ precedenceNotExpression )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==KW_AND) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // IdentifiersParser.g:474:30: precedenceAndOperator ^ precedenceNotExpression
            	    {
            	    pushFollow(FOLLOW_precedenceAndOperator_in_precedenceAndExpression3138);
            	    precedenceAndOperator276=precedenceAndOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceAndOperator276.getTree(), root_0);

            	    pushFollow(FOLLOW_precedenceNotExpression_in_precedenceAndExpression3141);
            	    precedenceNotExpression277=precedenceNotExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceNotExpression277.getTree());

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


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
    // $ANTLR end "precedenceAndExpression"


    public static class precedenceOrOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceOrOperator"
    // IdentifiersParser.g:478:1: precedenceOrOperator : KW_OR ;
    public final HiveParser_IdentifiersParser.precedenceOrOperator_return precedenceOrOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceOrOperator_return retval = new HiveParser_IdentifiersParser.precedenceOrOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_OR278=null;

        CommonTree KW_OR278_tree=null;

        try {
            // IdentifiersParser.g:479:5: ( KW_OR )
            // IdentifiersParser.g:480:5: KW_OR
            {
            root_0 = (CommonTree)adaptor.nil();


            KW_OR278=(Token)match(input,KW_OR,FOLLOW_KW_OR_in_precedenceOrOperator3165); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_OR278_tree = 
            (CommonTree)adaptor.create(KW_OR278)
            ;
            adaptor.addChild(root_0, KW_OR278_tree);
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
    // $ANTLR end "precedenceOrOperator"


    public static class precedenceOrExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceOrExpression"
    // IdentifiersParser.g:483:1: precedenceOrExpression : precedenceAndExpression ( precedenceOrOperator ^ precedenceAndExpression )* ;
    public final HiveParser_IdentifiersParser.precedenceOrExpression_return precedenceOrExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceOrExpression_return retval = new HiveParser_IdentifiersParser.precedenceOrExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedenceAndExpression_return precedenceAndExpression279 =null;

        HiveParser_IdentifiersParser.precedenceOrOperator_return precedenceOrOperator280 =null;

        HiveParser_IdentifiersParser.precedenceAndExpression_return precedenceAndExpression281 =null;



        try {
            // IdentifiersParser.g:484:5: ( precedenceAndExpression ( precedenceOrOperator ^ precedenceAndExpression )* )
            // IdentifiersParser.g:485:5: precedenceAndExpression ( precedenceOrOperator ^ precedenceAndExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_precedenceAndExpression_in_precedenceOrExpression3186);
            precedenceAndExpression279=precedenceAndExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceAndExpression279.getTree());

            // IdentifiersParser.g:485:29: ( precedenceOrOperator ^ precedenceAndExpression )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==KW_OR) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // IdentifiersParser.g:485:30: precedenceOrOperator ^ precedenceAndExpression
            	    {
            	    pushFollow(FOLLOW_precedenceOrOperator_in_precedenceOrExpression3189);
            	    precedenceOrOperator280=precedenceOrOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceOrOperator280.getTree(), root_0);

            	    pushFollow(FOLLOW_precedenceAndExpression_in_precedenceOrExpression3192);
            	    precedenceAndExpression281=precedenceAndExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceAndExpression281.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


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
    // $ANTLR end "precedenceOrExpression"


    public static class booleanValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanValue"
    // IdentifiersParser.g:489:1: booleanValue : ( KW_TRUE ^| KW_FALSE ^);
    public final HiveParser_IdentifiersParser.booleanValue_return booleanValue() throws RecognitionException {
        HiveParser_IdentifiersParser.booleanValue_return retval = new HiveParser_IdentifiersParser.booleanValue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_TRUE282=null;
        Token KW_FALSE283=null;

        CommonTree KW_TRUE282_tree=null;
        CommonTree KW_FALSE283_tree=null;

        try {
            // IdentifiersParser.g:490:5: ( KW_TRUE ^| KW_FALSE ^)
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==KW_TRUE) ) {
                alt53=1;
            }
            else if ( (LA53_0==KW_FALSE) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;

            }
            switch (alt53) {
                case 1 :
                    // IdentifiersParser.g:491:5: KW_TRUE ^
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    KW_TRUE282=(Token)match(input,KW_TRUE,FOLLOW_KW_TRUE_in_booleanValue3216); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_TRUE282_tree = 
                    (CommonTree)adaptor.create(KW_TRUE282)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(KW_TRUE282_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:491:16: KW_FALSE ^
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    KW_FALSE283=(Token)match(input,KW_FALSE,FOLLOW_KW_FALSE_in_booleanValue3221); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FALSE283_tree = 
                    (CommonTree)adaptor.create(KW_FALSE283)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(KW_FALSE283_tree, root_0);
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
    // $ANTLR end "booleanValue"


    public static class tableOrPartition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableOrPartition"
    // IdentifiersParser.g:494:1: tableOrPartition : tableName ( partitionSpec )? -> ^( TOK_TAB tableName ( partitionSpec )? ) ;
    public final HiveParser_IdentifiersParser.tableOrPartition_return tableOrPartition() throws RecognitionException {
        HiveParser_IdentifiersParser.tableOrPartition_return retval = new HiveParser_IdentifiersParser.tableOrPartition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_FromClauseParser.tableName_return tableName284 =null;

        HiveParser_IdentifiersParser.partitionSpec_return partitionSpec285 =null;


        RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");
        RewriteRuleSubtreeStream stream_partitionSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitionSpec");
        try {
            // IdentifiersParser.g:495:4: ( tableName ( partitionSpec )? -> ^( TOK_TAB tableName ( partitionSpec )? ) )
            // IdentifiersParser.g:496:4: tableName ( partitionSpec )?
            {
            pushFollow(FOLLOW_tableName_in_tableOrPartition3241);
            tableName284=gHiveParser.tableName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tableName.add(tableName284.getTree());

            // IdentifiersParser.g:496:14: ( partitionSpec )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==KW_PARTITION) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // IdentifiersParser.g:496:14: partitionSpec
                    {
                    pushFollow(FOLLOW_partitionSpec_in_tableOrPartition3243);
                    partitionSpec285=partitionSpec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_partitionSpec.add(partitionSpec285.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: tableName, partitionSpec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 496:29: -> ^( TOK_TAB tableName ( partitionSpec )? )
            {
                // IdentifiersParser.g:496:32: ^( TOK_TAB tableName ( partitionSpec )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_TAB, "TOK_TAB")
                , root_1);

                adaptor.addChild(root_1, stream_tableName.nextTree());

                // IdentifiersParser.g:496:52: ( partitionSpec )?
                if ( stream_partitionSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_partitionSpec.nextTree());

                }
                stream_partitionSpec.reset();

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
    // $ANTLR end "tableOrPartition"


    public static class partitionSpec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "partitionSpec"
    // IdentifiersParser.g:499:1: partitionSpec : KW_PARTITION LPAREN partitionVal ( COMMA partitionVal )* RPAREN -> ^( TOK_PARTSPEC ( partitionVal )+ ) ;
    public final HiveParser_IdentifiersParser.partitionSpec_return partitionSpec() throws RecognitionException {
        HiveParser_IdentifiersParser.partitionSpec_return retval = new HiveParser_IdentifiersParser.partitionSpec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_PARTITION286=null;
        Token LPAREN287=null;
        Token COMMA289=null;
        Token RPAREN291=null;
        HiveParser_IdentifiersParser.partitionVal_return partitionVal288 =null;

        HiveParser_IdentifiersParser.partitionVal_return partitionVal290 =null;


        CommonTree KW_PARTITION286_tree=null;
        CommonTree LPAREN287_tree=null;
        CommonTree COMMA289_tree=null;
        CommonTree RPAREN291_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_PARTITION=new RewriteRuleTokenStream(adaptor,"token KW_PARTITION");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_partitionVal=new RewriteRuleSubtreeStream(adaptor,"rule partitionVal");
        try {
            // IdentifiersParser.g:500:5: ( KW_PARTITION LPAREN partitionVal ( COMMA partitionVal )* RPAREN -> ^( TOK_PARTSPEC ( partitionVal )+ ) )
            // IdentifiersParser.g:501:5: KW_PARTITION LPAREN partitionVal ( COMMA partitionVal )* RPAREN
            {
            KW_PARTITION286=(Token)match(input,KW_PARTITION,FOLLOW_KW_PARTITION_in_partitionSpec3275); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_PARTITION.add(KW_PARTITION286);


            LPAREN287=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_partitionSpec3282); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN287);


            pushFollow(FOLLOW_partitionVal_in_partitionSpec3284);
            partitionVal288=partitionVal();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_partitionVal.add(partitionVal288.getTree());

            // IdentifiersParser.g:502:26: ( COMMA partitionVal )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==COMMA) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // IdentifiersParser.g:502:27: COMMA partitionVal
            	    {
            	    COMMA289=(Token)match(input,COMMA,FOLLOW_COMMA_in_partitionSpec3287); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA289);


            	    pushFollow(FOLLOW_partitionVal_in_partitionSpec3290);
            	    partitionVal290=partitionVal();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_partitionVal.add(partitionVal290.getTree());

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            RPAREN291=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_partitionSpec3295); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN291);


            // AST REWRITE
            // elements: partitionVal
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 502:57: -> ^( TOK_PARTSPEC ( partitionVal )+ )
            {
                // IdentifiersParser.g:502:60: ^( TOK_PARTSPEC ( partitionVal )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_PARTSPEC, "TOK_PARTSPEC")
                , root_1);

                if ( !(stream_partitionVal.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_partitionVal.hasNext() ) {
                    adaptor.addChild(root_1, stream_partitionVal.nextTree());

                }
                stream_partitionVal.reset();

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
    // $ANTLR end "partitionSpec"


    public static class partitionVal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "partitionVal"
    // IdentifiersParser.g:505:1: partitionVal : identifier ( EQUAL constant )? -> ^( TOK_PARTVAL identifier ( constant )? ) ;
    public final HiveParser_IdentifiersParser.partitionVal_return partitionVal() throws RecognitionException {
        HiveParser_IdentifiersParser.partitionVal_return retval = new HiveParser_IdentifiersParser.partitionVal_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQUAL293=null;
        HiveParser_IdentifiersParser.identifier_return identifier292 =null;

        HiveParser_IdentifiersParser.constant_return constant294 =null;


        CommonTree EQUAL293_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // IdentifiersParser.g:506:5: ( identifier ( EQUAL constant )? -> ^( TOK_PARTVAL identifier ( constant )? ) )
            // IdentifiersParser.g:507:5: identifier ( EQUAL constant )?
            {
            pushFollow(FOLLOW_identifier_in_partitionVal3326);
            identifier292=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier292.getTree());

            // IdentifiersParser.g:507:16: ( EQUAL constant )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==EQUAL) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // IdentifiersParser.g:507:17: EQUAL constant
                    {
                    EQUAL293=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_partitionVal3329); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL293);


                    pushFollow(FOLLOW_constant_in_partitionVal3331);
                    constant294=constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constant.add(constant294.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: constant, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 507:34: -> ^( TOK_PARTVAL identifier ( constant )? )
            {
                // IdentifiersParser.g:507:37: ^( TOK_PARTVAL identifier ( constant )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_PARTVAL, "TOK_PARTVAL")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // IdentifiersParser.g:507:62: ( constant )?
                if ( stream_constant.hasNext() ) {
                    adaptor.addChild(root_1, stream_constant.nextTree());

                }
                stream_constant.reset();

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
    // $ANTLR end "partitionVal"


    public static class dropPartitionSpec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dropPartitionSpec"
    // IdentifiersParser.g:510:1: dropPartitionSpec : KW_PARTITION LPAREN dropPartitionVal ( COMMA dropPartitionVal )* RPAREN -> ^( TOK_PARTSPEC ( dropPartitionVal )+ ) ;
    public final HiveParser_IdentifiersParser.dropPartitionSpec_return dropPartitionSpec() throws RecognitionException {
        HiveParser_IdentifiersParser.dropPartitionSpec_return retval = new HiveParser_IdentifiersParser.dropPartitionSpec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_PARTITION295=null;
        Token LPAREN296=null;
        Token COMMA298=null;
        Token RPAREN300=null;
        HiveParser_IdentifiersParser.dropPartitionVal_return dropPartitionVal297 =null;

        HiveParser_IdentifiersParser.dropPartitionVal_return dropPartitionVal299 =null;


        CommonTree KW_PARTITION295_tree=null;
        CommonTree LPAREN296_tree=null;
        CommonTree COMMA298_tree=null;
        CommonTree RPAREN300_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_PARTITION=new RewriteRuleTokenStream(adaptor,"token KW_PARTITION");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_dropPartitionVal=new RewriteRuleSubtreeStream(adaptor,"rule dropPartitionVal");
        try {
            // IdentifiersParser.g:511:5: ( KW_PARTITION LPAREN dropPartitionVal ( COMMA dropPartitionVal )* RPAREN -> ^( TOK_PARTSPEC ( dropPartitionVal )+ ) )
            // IdentifiersParser.g:512:5: KW_PARTITION LPAREN dropPartitionVal ( COMMA dropPartitionVal )* RPAREN
            {
            KW_PARTITION295=(Token)match(input,KW_PARTITION,FOLLOW_KW_PARTITION_in_dropPartitionSpec3365); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_PARTITION.add(KW_PARTITION295);


            LPAREN296=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dropPartitionSpec3372); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN296);


            pushFollow(FOLLOW_dropPartitionVal_in_dropPartitionSpec3374);
            dropPartitionVal297=dropPartitionVal();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dropPartitionVal.add(dropPartitionVal297.getTree());

            // IdentifiersParser.g:513:30: ( COMMA dropPartitionVal )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==COMMA) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // IdentifiersParser.g:513:31: COMMA dropPartitionVal
            	    {
            	    COMMA298=(Token)match(input,COMMA,FOLLOW_COMMA_in_dropPartitionSpec3377); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA298);


            	    pushFollow(FOLLOW_dropPartitionVal_in_dropPartitionSpec3380);
            	    dropPartitionVal299=dropPartitionVal();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_dropPartitionVal.add(dropPartitionVal299.getTree());

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            RPAREN300=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dropPartitionSpec3385); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN300);


            // AST REWRITE
            // elements: dropPartitionVal
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 513:65: -> ^( TOK_PARTSPEC ( dropPartitionVal )+ )
            {
                // IdentifiersParser.g:513:68: ^( TOK_PARTSPEC ( dropPartitionVal )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_PARTSPEC, "TOK_PARTSPEC")
                , root_1);

                if ( !(stream_dropPartitionVal.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_dropPartitionVal.hasNext() ) {
                    adaptor.addChild(root_1, stream_dropPartitionVal.nextTree());

                }
                stream_dropPartitionVal.reset();

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
    // $ANTLR end "dropPartitionSpec"


    public static class dropPartitionVal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dropPartitionVal"
    // IdentifiersParser.g:516:1: dropPartitionVal : identifier dropPartitionOperator constant -> ^( TOK_PARTVAL identifier dropPartitionOperator constant ) ;
    public final HiveParser_IdentifiersParser.dropPartitionVal_return dropPartitionVal() throws RecognitionException {
        HiveParser_IdentifiersParser.dropPartitionVal_return retval = new HiveParser_IdentifiersParser.dropPartitionVal_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.identifier_return identifier301 =null;

        HiveParser_IdentifiersParser.dropPartitionOperator_return dropPartitionOperator302 =null;

        HiveParser_IdentifiersParser.constant_return constant303 =null;


        RewriteRuleSubtreeStream stream_dropPartitionOperator=new RewriteRuleSubtreeStream(adaptor,"rule dropPartitionOperator");
        RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // IdentifiersParser.g:517:5: ( identifier dropPartitionOperator constant -> ^( TOK_PARTVAL identifier dropPartitionOperator constant ) )
            // IdentifiersParser.g:518:5: identifier dropPartitionOperator constant
            {
            pushFollow(FOLLOW_identifier_in_dropPartitionVal3416);
            identifier301=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier301.getTree());

            pushFollow(FOLLOW_dropPartitionOperator_in_dropPartitionVal3418);
            dropPartitionOperator302=dropPartitionOperator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dropPartitionOperator.add(dropPartitionOperator302.getTree());

            pushFollow(FOLLOW_constant_in_dropPartitionVal3420);
            constant303=constant();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_constant.add(constant303.getTree());

            // AST REWRITE
            // elements: identifier, dropPartitionOperator, constant
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 518:47: -> ^( TOK_PARTVAL identifier dropPartitionOperator constant )
            {
                // IdentifiersParser.g:518:50: ^( TOK_PARTVAL identifier dropPartitionOperator constant )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_PARTVAL, "TOK_PARTVAL")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_1, stream_dropPartitionOperator.nextTree());

                adaptor.addChild(root_1, stream_constant.nextTree());

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
    // $ANTLR end "dropPartitionVal"


    public static class dropPartitionOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dropPartitionOperator"
    // IdentifiersParser.g:521:1: dropPartitionOperator : ( EQUAL | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN );
    public final HiveParser_IdentifiersParser.dropPartitionOperator_return dropPartitionOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.dropPartitionOperator_return retval = new HiveParser_IdentifiersParser.dropPartitionOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set304=null;

        CommonTree set304_tree=null;

        try {
            // IdentifiersParser.g:522:5: ( EQUAL | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN )
            // IdentifiersParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set304=(Token)input.LT(1);

            if ( input.LA(1)==EQUAL||(input.LA(1) >= GREATERTHAN && input.LA(1) <= GREATERTHANOREQUALTO)||(input.LA(1) >= LESSTHAN && input.LA(1) <= LESSTHANOREQUALTO)||input.LA(1)==NOTEQUAL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set304)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "dropPartitionOperator"


    public static class sysFuncNames_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sysFuncNames"
    // IdentifiersParser.g:526:1: sysFuncNames : ( KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_IF | KW_CASE | KW_WHEN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_BOOLEAN | KW_STRING | KW_BINARY | KW_ARRAY | KW_MAP | KW_STRUCT | KW_UNIONTYPE | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | BITWISEXOR | KW_RLIKE | KW_REGEXP | KW_IN | KW_BETWEEN );
    public final HiveParser_IdentifiersParser.sysFuncNames_return sysFuncNames() throws RecognitionException {
        HiveParser_IdentifiersParser.sysFuncNames_return retval = new HiveParser_IdentifiersParser.sysFuncNames_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set305=null;

        CommonTree set305_tree=null;

        try {
            // IdentifiersParser.g:527:5: ( KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_IF | KW_CASE | KW_WHEN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_BOOLEAN | KW_STRING | KW_BINARY | KW_ARRAY | KW_MAP | KW_STRUCT | KW_UNIONTYPE | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | BITWISEXOR | KW_RLIKE | KW_REGEXP | KW_IN | KW_BETWEEN )
            // IdentifiersParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set305=(Token)input.LT(1);

            if ( (input.LA(1) >= AMPERSAND && input.LA(1) <= BITWISEXOR)||(input.LA(1) >= DIV && input.LA(1) <= DIVIDE)||(input.LA(1) >= EQUAL && input.LA(1) <= EQUAL_NS)||(input.LA(1) >= GREATERTHAN && input.LA(1) <= GREATERTHANOREQUALTO)||input.LA(1)==KW_AND||input.LA(1)==KW_ARRAY||(input.LA(1) >= KW_BETWEEN && input.LA(1) <= KW_BOOLEAN)||input.LA(1)==KW_CASE||input.LA(1)==KW_DOUBLE||input.LA(1)==KW_FLOAT||input.LA(1)==KW_IF||input.LA(1)==KW_IN||input.LA(1)==KW_INT||input.LA(1)==KW_LIKE||input.LA(1)==KW_MAP||input.LA(1)==KW_NOT||input.LA(1)==KW_OR||input.LA(1)==KW_REGEXP||input.LA(1)==KW_RLIKE||input.LA(1)==KW_SMALLINT||(input.LA(1) >= KW_STRING && input.LA(1) <= KW_STRUCT)||input.LA(1)==KW_TINYINT||input.LA(1)==KW_UNIONTYPE||input.LA(1)==KW_WHEN||(input.LA(1) >= LESSTHAN && input.LA(1) <= LESSTHANOREQUALTO)||(input.LA(1) >= MINUS && input.LA(1) <= NOTEQUAL)||input.LA(1)==PLUS||input.LA(1)==STAR||input.LA(1)==TILDE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set305)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "sysFuncNames"


    public static class descFuncNames_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "descFuncNames"
    // IdentifiersParser.g:571:1: descFuncNames : ( sysFuncNames | StringLiteral | identifier );
    public final HiveParser_IdentifiersParser.descFuncNames_return descFuncNames() throws RecognitionException {
        HiveParser_IdentifiersParser.descFuncNames_return retval = new HiveParser_IdentifiersParser.descFuncNames_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token StringLiteral307=null;
        HiveParser_IdentifiersParser.sysFuncNames_return sysFuncNames306 =null;

        HiveParser_IdentifiersParser.identifier_return identifier308 =null;


        CommonTree StringLiteral307_tree=null;

        try {
            // IdentifiersParser.g:572:5: ( sysFuncNames | StringLiteral | identifier )
            int alt58=3;
            switch ( input.LA(1) ) {
            case AMPERSAND:
            case BITWISEOR:
            case BITWISEXOR:
            case DIV:
            case DIVIDE:
            case EQUAL:
            case EQUAL_NS:
            case GREATERTHAN:
            case GREATERTHANOREQUALTO:
            case KW_AND:
            case KW_ARRAY:
            case KW_BETWEEN:
            case KW_BIGINT:
            case KW_BINARY:
            case KW_BOOLEAN:
            case KW_CASE:
            case KW_DOUBLE:
            case KW_FLOAT:
            case KW_IF:
            case KW_IN:
            case KW_INT:
            case KW_LIKE:
            case KW_MAP:
            case KW_NOT:
            case KW_OR:
            case KW_REGEXP:
            case KW_RLIKE:
            case KW_SMALLINT:
            case KW_STRING:
            case KW_STRUCT:
            case KW_TINYINT:
            case KW_UNIONTYPE:
            case KW_WHEN:
            case LESSTHAN:
            case LESSTHANOREQUALTO:
            case MINUS:
            case MOD:
            case NOTEQUAL:
            case PLUS:
            case STAR:
            case TILDE:
                {
                alt58=1;
                }
                break;
            case StringLiteral:
                {
                alt58=2;
                }
                break;
            case Identifier:
            case KW_ADD:
            case KW_AFTER:
            case KW_ALTER:
            case KW_ANALYZE:
            case KW_ARCHIVE:
            case KW_AS:
            case KW_ASC:
            case KW_BEFORE:
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
            case KW_INDEX:
            case KW_INDEXES:
            case KW_INNER:
            case KW_INPATH:
            case KW_INPUTDRIVER:
            case KW_INPUTFORMAT:
            case KW_INSERT:
            case KW_INTERSECT:
            case KW_INTO:
            case KW_IS:
            case KW_ITEMS:
            case KW_KEYS:
            case KW_KEY_TYPE:
            case KW_LATERAL:
            case KW_LEFT:
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
            case KW_RENAME:
            case KW_REPAIR:
            case KW_REPLACE:
            case KW_RESTRICT:
            case KW_REVOKE:
            case KW_RIGHT:
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
            case KW_SORT:
            case KW_SORTED:
            case KW_SSL:
            case KW_STATISTICS:
            case KW_STORED:
            case KW_STREAMTABLE:
            case KW_TABLE:
            case KW_TABLES:
            case KW_TBLPROPERTIES:
            case KW_TEMPORARY:
            case KW_TERMINATED:
            case KW_TEXTFILE:
            case KW_TIMESTAMP:
            case KW_TO:
            case KW_TOUCH:
            case KW_TRIGGER:
            case KW_TRUE:
            case KW_TRUNCATE:
            case KW_UNARCHIVE:
            case KW_UNDO:
            case KW_UNION:
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
                alt58=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;

            }

            switch (alt58) {
                case 1 :
                    // IdentifiersParser.g:573:7: sysFuncNames
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_sysFuncNames_in_descFuncNames3839);
                    sysFuncNames306=sysFuncNames();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sysFuncNames306.getTree());

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:574:7: StringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    StringLiteral307=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_descFuncNames3847); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral307_tree = 
                    (CommonTree)adaptor.create(StringLiteral307)
                    ;
                    adaptor.addChild(root_0, StringLiteral307_tree);
                    }

                    }
                    break;
                case 3 :
                    // IdentifiersParser.g:575:7: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_descFuncNames3855);
                    identifier308=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier308.getTree());

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
    // $ANTLR end "descFuncNames"


    public static class identifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier"
    // IdentifiersParser.g:578:1: identifier : ( Identifier | nonReserved -> Identifier[$nonReserved.text] );
    public final HiveParser_IdentifiersParser.identifier_return identifier() throws RecognitionException {
        HiveParser_IdentifiersParser.identifier_return retval = new HiveParser_IdentifiersParser.identifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token Identifier309=null;
        HiveParser_IdentifiersParser.nonReserved_return nonReserved310 =null;


        CommonTree Identifier309_tree=null;
        RewriteRuleSubtreeStream stream_nonReserved=new RewriteRuleSubtreeStream(adaptor,"rule nonReserved");
        try {
            // IdentifiersParser.g:579:5: ( Identifier | nonReserved -> Identifier[$nonReserved.text] )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==Identifier) ) {
                alt59=1;
            }
            else if ( (LA59_0==KW_ADD||LA59_0==KW_AFTER||(LA59_0 >= KW_ALTER && LA59_0 <= KW_ANALYZE)||(LA59_0 >= KW_ARCHIVE && LA59_0 <= KW_CASCADE)||LA59_0==KW_CHANGE||(LA59_0 >= KW_CLUSTER && LA59_0 <= KW_CLUSTERSTATUS)||LA59_0==KW_COLLECTION||(LA59_0 >= KW_COLUMNS && LA59_0 <= KW_CONCATENATE)||LA59_0==KW_CONTINUE||LA59_0==KW_CREATE||LA59_0==KW_CUBE||(LA59_0 >= KW_CURSOR && LA59_0 <= KW_DATA)||(LA59_0 >= KW_DATABASES && LA59_0 <= KW_DISABLE)||(LA59_0 >= KW_DISTRIBUTE && LA59_0 <= KW_DOUBLE)||(LA59_0 >= KW_DROP && LA59_0 <= KW_ELEM_TYPE)||LA59_0==KW_ENABLE||LA59_0==KW_ESCAPED||LA59_0==KW_EXCLUSIVE||(LA59_0 >= KW_EXISTS && LA59_0 <= KW_EXPORT)||(LA59_0 >= KW_EXTERNAL && LA59_0 <= KW_FLOAT)||(LA59_0 >= KW_FOR && LA59_0 <= KW_FORMATTED)||LA59_0==KW_FULL||(LA59_0 >= KW_FUNCTIONS && LA59_0 <= KW_GROUPING)||(LA59_0 >= KW_HOLD_DDLTIME && LA59_0 <= KW_IDXPROPERTIES)||(LA59_0 >= KW_IGNORE && LA59_0 <= KW_INTERSECT)||(LA59_0 >= KW_INTO && LA59_0 <= KW_ITEMS)||(LA59_0 >= KW_KEYS && LA59_0 <= KW_LEFT)||(LA59_0 >= KW_LIKE && LA59_0 <= KW_LONG)||(LA59_0 >= KW_MAPJOIN && LA59_0 <= KW_MINUS)||(LA59_0 >= KW_MSCK && LA59_0 <= KW_NOSCAN)||(LA59_0 >= KW_NO_DROP && LA59_0 <= KW_OFFLINE)||LA59_0==KW_OPTION||(LA59_0 >= KW_ORCFILE && LA59_0 <= KW_OUTPUTFORMAT)||LA59_0==KW_OVERWRITE||(LA59_0 >= KW_PARTITION && LA59_0 <= KW_PLUS)||(LA59_0 >= KW_PRETTY && LA59_0 <= KW_PROCEDURE)||(LA59_0 >= KW_PROTECTION && LA59_0 <= KW_RECORDWRITER)||(LA59_0 >= KW_REGEXP && LA59_0 <= KW_SCHEMAS)||(LA59_0 >= KW_SEMI && LA59_0 <= KW_STRUCT)||(LA59_0 >= KW_TABLE && LA59_0 <= KW_TABLES)||(LA59_0 >= KW_TBLPROPERTIES && LA59_0 <= KW_TEXTFILE)||(LA59_0 >= KW_TIMESTAMP && LA59_0 <= KW_TOUCH)||(LA59_0 >= KW_TRIGGER && LA59_0 <= KW_UNARCHIVE)||(LA59_0 >= KW_UNDO && LA59_0 <= KW_UNIONTYPE)||(LA59_0 >= KW_UNLOCK && LA59_0 <= KW_UPDATE)||(LA59_0 >= KW_USE && LA59_0 <= KW_VIEW)||LA59_0==KW_WHILE||LA59_0==KW_WITH) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;

            }
            switch (alt59) {
                case 1 :
                    // IdentifiersParser.g:580:5: Identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Identifier309=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifier3876); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier309_tree = 
                    (CommonTree)adaptor.create(Identifier309)
                    ;
                    adaptor.addChild(root_0, Identifier309_tree);
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:581:7: nonReserved
                    {
                    pushFollow(FOLLOW_nonReserved_in_identifier3884);
                    nonReserved310=nonReserved();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_nonReserved.add(nonReserved310.getTree());

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
                    // 581:19: -> Identifier[$nonReserved.text]
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(Identifier, (nonReserved310!=null?input.toString(nonReserved310.start,nonReserved310.stop):null))
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
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "identifier"


    public static class nonReserved_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nonReserved"
    // IdentifiersParser.g:584:1: nonReserved : ( KW_TRUE | KW_FALSE | KW_LIKE | KW_EXISTS | KW_ASC | KW_DESC | KW_ORDER | KW_GROUP | KW_BY | KW_AS | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_LEFT | KW_RIGHT | KW_FULL | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_IGNORE | KW_PROTECTION | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_DECIMAL | KW_STRING | KW_ARRAY | KW_STRUCT | KW_UNIONTYPE | KW_PARTITIONED | KW_CLUSTERED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_SEQUENCEFILE | KW_TEXTFILE | KW_RCFILE | KW_ORCFILE | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_OFFLINE | KW_ENABLE | KW_DISABLE | KW_READONLY | KW_NO_DROP | KW_LOCATION | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_EXPLAIN | KW_FORMATTED | KW_PRETTY | KW_DEPENDENCY | KW_LOGICAL | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_MAPJOIN | KW_STREAMTABLE | KW_HOLD_DDLTIME | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_IN | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_GROUPING | KW_SETS | KW_TRUNCATE | KW_NOSCAN | KW_USER | KW_ROLE | KW_INNER );
    public final HiveParser_IdentifiersParser.nonReserved_return nonReserved() throws RecognitionException {
        HiveParser_IdentifiersParser.nonReserved_return retval = new HiveParser_IdentifiersParser.nonReserved_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set311=null;

        CommonTree set311_tree=null;

        try {
            // IdentifiersParser.g:585:5: ( KW_TRUE | KW_FALSE | KW_LIKE | KW_EXISTS | KW_ASC | KW_DESC | KW_ORDER | KW_GROUP | KW_BY | KW_AS | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_LEFT | KW_RIGHT | KW_FULL | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_IGNORE | KW_PROTECTION | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_DECIMAL | KW_STRING | KW_ARRAY | KW_STRUCT | KW_UNIONTYPE | KW_PARTITIONED | KW_CLUSTERED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_SEQUENCEFILE | KW_TEXTFILE | KW_RCFILE | KW_ORCFILE | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_OFFLINE | KW_ENABLE | KW_DISABLE | KW_READONLY | KW_NO_DROP | KW_LOCATION | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_EXPLAIN | KW_FORMATTED | KW_PRETTY | KW_DEPENDENCY | KW_LOGICAL | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_MAPJOIN | KW_STREAMTABLE | KW_HOLD_DDLTIME | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_IN | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_GROUPING | KW_SETS | KW_TRUNCATE | KW_NOSCAN | KW_USER | KW_ROLE | KW_INNER )
            // IdentifiersParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set311=(Token)input.LT(1);

            if ( input.LA(1)==KW_ADD||input.LA(1)==KW_AFTER||(input.LA(1) >= KW_ALTER && input.LA(1) <= KW_ANALYZE)||(input.LA(1) >= KW_ARCHIVE && input.LA(1) <= KW_CASCADE)||input.LA(1)==KW_CHANGE||(input.LA(1) >= KW_CLUSTER && input.LA(1) <= KW_CLUSTERSTATUS)||input.LA(1)==KW_COLLECTION||(input.LA(1) >= KW_COLUMNS && input.LA(1) <= KW_CONCATENATE)||input.LA(1)==KW_CONTINUE||input.LA(1)==KW_CREATE||input.LA(1)==KW_CUBE||(input.LA(1) >= KW_CURSOR && input.LA(1) <= KW_DATA)||(input.LA(1) >= KW_DATABASES && input.LA(1) <= KW_DISABLE)||(input.LA(1) >= KW_DISTRIBUTE && input.LA(1) <= KW_DOUBLE)||(input.LA(1) >= KW_DROP && input.LA(1) <= KW_ELEM_TYPE)||input.LA(1)==KW_ENABLE||input.LA(1)==KW_ESCAPED||input.LA(1)==KW_EXCLUSIVE||(input.LA(1) >= KW_EXISTS && input.LA(1) <= KW_EXPORT)||(input.LA(1) >= KW_EXTERNAL && input.LA(1) <= KW_FLOAT)||(input.LA(1) >= KW_FOR && input.LA(1) <= KW_FORMATTED)||input.LA(1)==KW_FULL||(input.LA(1) >= KW_FUNCTIONS && input.LA(1) <= KW_GROUPING)||(input.LA(1) >= KW_HOLD_DDLTIME && input.LA(1) <= KW_IDXPROPERTIES)||(input.LA(1) >= KW_IGNORE && input.LA(1) <= KW_INTERSECT)||(input.LA(1) >= KW_INTO && input.LA(1) <= KW_ITEMS)||(input.LA(1) >= KW_KEYS && input.LA(1) <= KW_LEFT)||(input.LA(1) >= KW_LIKE && input.LA(1) <= KW_LONG)||(input.LA(1) >= KW_MAPJOIN && input.LA(1) <= KW_MINUS)||(input.LA(1) >= KW_MSCK && input.LA(1) <= KW_NOSCAN)||(input.LA(1) >= KW_NO_DROP && input.LA(1) <= KW_OFFLINE)||input.LA(1)==KW_OPTION||(input.LA(1) >= KW_ORCFILE && input.LA(1) <= KW_OUTPUTFORMAT)||input.LA(1)==KW_OVERWRITE||(input.LA(1) >= KW_PARTITION && input.LA(1) <= KW_PLUS)||(input.LA(1) >= KW_PRETTY && input.LA(1) <= KW_PROCEDURE)||(input.LA(1) >= KW_PROTECTION && input.LA(1) <= KW_RECORDWRITER)||(input.LA(1) >= KW_REGEXP && input.LA(1) <= KW_SCHEMAS)||(input.LA(1) >= KW_SEMI && input.LA(1) <= KW_STRUCT)||(input.LA(1) >= KW_TABLE && input.LA(1) <= KW_TABLES)||(input.LA(1) >= KW_TBLPROPERTIES && input.LA(1) <= KW_TEXTFILE)||(input.LA(1) >= KW_TIMESTAMP && input.LA(1) <= KW_TOUCH)||(input.LA(1) >= KW_TRIGGER && input.LA(1) <= KW_UNARCHIVE)||(input.LA(1) >= KW_UNDO && input.LA(1) <= KW_UNIONTYPE)||(input.LA(1) >= KW_UNLOCK && input.LA(1) <= KW_UPDATE)||(input.LA(1) >= KW_USE && input.LA(1) <= KW_VIEW)||input.LA(1)==KW_WHILE||input.LA(1)==KW_WITH ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set311)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "nonReserved"

    // $ANTLR start synpred1_IdentifiersParser
    public final void synpred1_IdentifiersParser_fragment() throws RecognitionException {
        // IdentifiersParser.g:127:7: ( COMMA )
        // IdentifiersParser.g:127:8: COMMA
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred1_IdentifiersParser616); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_IdentifiersParser

    // $ANTLR start synpred2_IdentifiersParser
    public final void synpred2_IdentifiersParser_fragment() throws RecognitionException {
        // IdentifiersParser.g:138:17: ( COMMA )
        // IdentifiersParser.g:138:18: COMMA
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred2_IdentifiersParser717); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_IdentifiersParser

    // $ANTLR start synpred3_IdentifiersParser
    public final void synpred3_IdentifiersParser_fragment() throws RecognitionException {
        // IdentifiersParser.g:149:17: ( COMMA )
        // IdentifiersParser.g:149:18: COMMA
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred3_IdentifiersParser817); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_IdentifiersParser

    // $ANTLR start synpred4_IdentifiersParser
    public final void synpred4_IdentifiersParser_fragment() throws RecognitionException {
        // IdentifiersParser.g:162:7: ( COMMA )
        // IdentifiersParser.g:162:8: COMMA
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred4_IdentifiersParser927); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_IdentifiersParser

    // Delegated rules

    public final boolean synpred4_IdentifiersParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_IdentifiersParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_IdentifiersParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_IdentifiersParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_IdentifiersParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_IdentifiersParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_IdentifiersParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_IdentifiersParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA48 dfa48 = new DFA48(this);
    static final String DFA6_eotS =
        "\u0231\uffff";
    static final String DFA6_eofS =
        "\u0231\uffff";
    static final String DFA6_minS =
        "\1\7\26\uffff\1\7\4\uffff\2\7\10\4\1\14\2\4\1\u0120\1\4\1\u0120"+
        "\4\4\1\u0120\2\7\1\32\2\u0120\u01fb\uffff";
    static final String DFA6_maxS =
        "\1\u0132\26\uffff\1\u0132\4\uffff\2\u0132\1\u012e\1\u0130\1\u012e"+
        "\1\u0130\4\u012e\1\14\2\u012e\1\u0120\1\u012e\1\u0120\4\u012e\1"+
        "\u0120\2\u0132\1\u011b\2\u0120\u01fb\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\31\uffff\1\3\32\uffff\114\1\1\uffff\1\2\2\1\1\uffff"+
        "\30\1\1\uffff\30\1\1\uffff\31\1\1\uffff\30\1\1\uffff\30\1\1\uffff"+
        "\30\1\1\uffff\30\1\1\uffff\32\1\2\uffff\31\1\2\uffff\2\1\1\uffff"+
        "\30\1\1\uffff\2\1\1\uffff\30\1\1\uffff\1\1\1\uffff\30\1\1\uffff"+
        "\1\1\1\uffff\30\1\1\uffff\1\1\1\uffff\30\1\1\uffff\72\1";
    static final String DFA6_specialS =
        "\u0231\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\5\uffff\1\1\4\uffff\1\1\7\uffff\2\1\1\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\21\1\1\uffff\3\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
            "\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\2\1\1\uffff\17\1\1\uffff"+
            "\2\1\1\uffff\2\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\3\1\1\uffff\7\1\1\uffff\3\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
            "\17\1\2\uffff\3\1\1\uffff\5\1\1\uffff\12\1\1\uffff\4\1\1\uffff"+
            "\7\1\1\uffff\1\1\1\uffff\6\1\2\uffff\1\1\1\uffff\5\1\3\uffff"+
            "\2\1\1\uffff\12\1\1\uffff\16\1\1\uffff\23\1\1\uffff\2\1\1\uffff"+
            "\4\1\1\uffff\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\4\1\1\uffff"+
            "\7\1\3\uffff\1\1\1\uffff\1\1\4\uffff\1\27\1\1\1\uffff\1\1\2"+
            "\uffff\2\1\7\uffff\4\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\42\5\uffff\1\46\4\uffff\1\45\7\uffff\1\56\1\57\1\uffff\1"+
            "\57\1\uffff\2\57\1\uffff\1\57\1\52\14\57\1\61\1\60\1\57\1\uffff"+
            "\3\57\1\uffff\1\57\1\uffff\4\57\1\uffff\1\57\1\uffff\1\57\1"+
            "\uffff\1\57\1\uffff\2\57\1\uffff\1\57\1\37\14\57\1\65\1\uffff"+
            "\2\57\1\uffff\2\57\1\uffff\1\57\2\uffff\1\57\1\uffff\1\57\1"+
            "\uffff\3\57\1\uffff\1\57\1\50\5\57\1\uffff\3\57\1\uffff\1\57"+
            "\1\uffff\4\57\1\uffff\2\57\1\51\14\57\2\uffff\3\57\1\uffff\4"+
            "\57\1\64\1\uffff\12\57\1\uffff\1\53\3\57\1\uffff\2\57\1\34\1"+
            "\57\1\36\2\57\1\uffff\1\57\1\uffff\6\57\2\uffff\1\57\1\uffff"+
            "\5\57\3\uffff\2\57\1\uffff\12\57\1\uffff\16\57\1\uffff\22\57"+
            "\1\54\1\uffff\2\57\1\uffff\4\57\1\uffff\4\57\1\uffff\1\57\1"+
            "\47\2\57\1\uffff\2\57\1\55\1\uffff\4\57\1\uffff\7\57\3\uffff"+
            "\1\57\1\uffff\1\57\4\uffff\1\62\1\63\1\uffff\1\35\2\uffff\1"+
            "\40\1\35\2\uffff\1\33\4\uffff\1\43\1\41\1\35\1\44",
            "",
            "",
            "",
            "",
            "\1\73\5\uffff\1\77\4\uffff\1\76\7\uffff\1\107\1\110\1\uffff"+
            "\1\110\1\uffff\2\110\1\uffff\1\110\1\103\14\110\1\112\1\111"+
            "\1\110\1\uffff\3\110\1\uffff\1\110\1\uffff\4\110\1\uffff\1\110"+
            "\1\uffff\1\110\1\uffff\1\110\1\uffff\2\110\1\uffff\1\110\1\70"+
            "\14\110\1\116\1\uffff\2\110\1\uffff\2\110\1\uffff\1\110\2\uffff"+
            "\1\110\1\uffff\1\110\1\uffff\3\110\1\uffff\1\110\1\101\5\110"+
            "\1\uffff\3\110\1\uffff\1\110\1\uffff\4\110\1\uffff\2\110\1\102"+
            "\14\110\2\uffff\3\110\1\uffff\4\110\1\115\1\uffff\12\110\1\uffff"+
            "\1\104\3\110\1\uffff\2\110\1\117\1\110\1\67\2\110\1\uffff\1"+
            "\110\1\uffff\6\110\2\uffff\1\110\1\uffff\5\110\3\uffff\2\110"+
            "\1\uffff\12\110\1\uffff\16\110\1\uffff\22\110\1\105\1\uffff"+
            "\2\110\1\uffff\4\110\1\uffff\4\110\1\uffff\1\110\1\100\2\110"+
            "\1\uffff\2\110\1\106\1\uffff\4\110\1\uffff\7\110\3\uffff\1\110"+
            "\1\uffff\1\110\4\uffff\1\113\1\114\1\uffff\1\66\2\uffff\1\71"+
            "\1\66\7\uffff\1\74\1\72\1\66\1\75",
            "\1\124\5\uffff\1\130\4\uffff\1\127\7\uffff\1\140\1\141\1\uffff"+
            "\1\141\1\uffff\2\141\1\uffff\1\141\1\134\14\141\1\143\1\142"+
            "\1\141\1\uffff\3\141\1\uffff\1\141\1\uffff\4\141\1\uffff\1\141"+
            "\1\uffff\1\141\1\uffff\1\141\1\uffff\2\141\1\uffff\1\141\1\121"+
            "\14\141\1\147\1\uffff\2\141\1\uffff\2\141\1\uffff\1\141\2\uffff"+
            "\1\141\1\uffff\1\141\1\uffff\3\141\1\uffff\1\141\1\132\5\141"+
            "\1\uffff\3\141\1\uffff\1\141\1\uffff\4\141\1\uffff\2\141\1\133"+
            "\14\141\2\uffff\3\141\1\uffff\4\141\1\146\1\uffff\12\141\1\uffff"+
            "\1\135\3\141\1\uffff\2\141\1\uffff\1\141\1\120\2\141\1\uffff"+
            "\1\141\1\uffff\6\141\2\uffff\1\141\1\uffff\5\141\3\uffff\2\141"+
            "\1\uffff\12\141\1\uffff\16\141\1\uffff\22\141\1\136\1\uffff"+
            "\2\141\1\uffff\4\141\1\uffff\4\141\1\uffff\1\141\1\131\2\141"+
            "\1\uffff\2\141\1\137\1\uffff\4\141\1\uffff\7\141\3\uffff\1\141"+
            "\1\uffff\1\141\4\uffff\1\144\1\145\1\uffff\1\150\2\uffff\1\122"+
            "\1\150\7\uffff\1\125\1\123\1\150\1\126",
            "\1\157\1\160\1\154\3\uffff\1\u0083\3\uffff\2\155\1\uffff\1"+
            "\152\2\uffff\1\163\1\164\1\uffff\1\171\1\170\10\uffff\1\176"+
            "\5\uffff\1\175\26\uffff\1\173\102\uffff\1\174\14\uffff\1\153"+
            "\10\uffff\1\162\21\uffff\1\161\6\uffff\1\177\7\uffff\1\172\30"+
            "\uffff\1\162\6\uffff\1\162\105\uffff\1\167\1\166\1\u0081\1\151"+
            "\1\uffff\1\156\1\155\1\165\1\uffff\1\156\2\uffff\1\u0080\3\uffff"+
            "\1\155",
            "\1\u008d\1\u008e\1\u008a\3\uffff\1\u0083\3\uffff\2\u008b\1"+
            "\uffff\1\u0088\2\uffff\1\u0091\1\u0092\1\uffff\1\u0097\1\u0096"+
            "\10\uffff\1\u009c\5\uffff\1\u009b\26\uffff\1\u0099\102\uffff"+
            "\1\u009a\14\uffff\1\u0089\10\uffff\1\u0090\21\uffff\1\u008f"+
            "\6\uffff\1\u009d\7\uffff\1\u0098\30\uffff\1\u0090\6\uffff\1"+
            "\u0090\105\uffff\1\u0095\1\u0094\1\u0085\1\u0087\1\uffff\1\u008c"+
            "\1\u008b\1\u0093\1\uffff\1\u008c\2\uffff\1\u009e\3\uffff\1\u008b"+
            "\1\uffff\1\u0084",
            "\1\u00a6\1\u00a7\1\u00a3\3\uffff\1\u0083\3\uffff\2\u00a4\1"+
            "\uffff\1\u00a1\2\uffff\1\u00aa\1\u00ab\1\uffff\1\u00b0\1\u00af"+
            "\10\uffff\1\u00b5\5\uffff\1\u00b4\26\uffff\1\u00b2\102\uffff"+
            "\1\u00b3\14\uffff\1\u00a2\10\uffff\1\u00a9\21\uffff\1\u00a8"+
            "\6\uffff\1\u00b6\7\uffff\1\u00b1\30\uffff\1\u00a9\6\uffff\1"+
            "\u00a9\105\uffff\1\u00ae\1\u00ad\1\uffff\1\u00a0\1\uffff\1\u00a5"+
            "\1\u00a4\1\u00ac\1\uffff\1\u00a5\2\uffff\1\u00b7\3\uffff\1\u00a4",
            "\1\u00bf\1\u00c0\1\u00bc\3\uffff\1\u0083\3\uffff\2\u00bd\1"+
            "\uffff\1\u00ba\2\uffff\1\u00c3\1\u00c4\1\uffff\1\u00c9\1\u00c8"+
            "\10\uffff\1\u00ce\5\uffff\1\u00cd\26\uffff\1\u00cb\102\uffff"+
            "\1\u00cc\14\uffff\1\u00bb\10\uffff\1\u00c2\21\uffff\1\u00c1"+
            "\6\uffff\1\u00cf\7\uffff\1\u00ca\30\uffff\1\u00c2\6\uffff\1"+
            "\u00c2\105\uffff\1\u00c7\1\u00c6\1\uffff\1\u00b9\1\uffff\1\u00be"+
            "\1\u00bd\1\u00c5\1\uffff\1\u00be\2\uffff\1\u00d0\3\uffff\1\u00bd"+
            "\1\uffff\1\u00d1",
            "\1\u00d9\1\u00da\1\u00d6\3\uffff\1\u0083\3\uffff\2\u00d7\1"+
            "\uffff\1\u00d4\2\uffff\1\u00dd\1\u00de\1\uffff\1\u00e3\1\u00e2"+
            "\10\uffff\1\u00e8\5\uffff\1\u00e7\26\uffff\1\u00e5\102\uffff"+
            "\1\u00e6\14\uffff\1\u00d5\10\uffff\1\u00dc\21\uffff\1\u00db"+
            "\6\uffff\1\u00e9\7\uffff\1\u00e4\30\uffff\1\u00dc\6\uffff\1"+
            "\u00dc\105\uffff\1\u00e1\1\u00e0\1\uffff\1\u00d3\1\uffff\1\u00d8"+
            "\1\u00d7\1\u00df\1\uffff\1\u00d8\2\uffff\1\u00ea\3\uffff\1\u00d7",
            "\1\u00f2\1\u00f3\1\u00ef\3\uffff\1\u0083\3\uffff\2\u00f0\1"+
            "\uffff\1\u00ed\2\uffff\1\u00f6\1\u00f7\1\uffff\1\u00fc\1\u00fb"+
            "\10\uffff\1\u0101\5\uffff\1\u0100\26\uffff\1\u00fe\102\uffff"+
            "\1\u00ff\14\uffff\1\u00ee\10\uffff\1\u00f5\21\uffff\1\u00f4"+
            "\6\uffff\1\u0102\7\uffff\1\u00fd\30\uffff\1\u00f5\6\uffff\1"+
            "\u00f5\105\uffff\1\u00fa\1\u00f9\1\uffff\1\u00ec\1\uffff\1\u00f1"+
            "\1\u00f0\1\u00f8\1\uffff\1\u00f1\2\uffff\1\u0103\3\uffff\1\u00f0",
            "\1\u010b\1\u010c\1\u0108\3\uffff\1\u0083\3\uffff\2\u0109\1"+
            "\uffff\1\u0106\2\uffff\1\u010f\1\u0110\1\uffff\1\u0115\1\u0114"+
            "\10\uffff\1\u011a\5\uffff\1\u0119\26\uffff\1\u0117\102\uffff"+
            "\1\u0118\14\uffff\1\u0107\10\uffff\1\u010e\21\uffff\1\u010d"+
            "\6\uffff\1\u011b\7\uffff\1\u0116\30\uffff\1\u010e\6\uffff\1"+
            "\u010e\105\uffff\1\u0113\1\u0112\1\uffff\1\u0105\1\uffff\1\u010a"+
            "\1\u0109\1\u0111\1\uffff\1\u010a\2\uffff\1\u011c\3\uffff\1\u0109",
            "\1\u0124\1\u0125\1\u0121\3\uffff\1\u0083\3\uffff\2\u0122\1"+
            "\uffff\1\u011f\2\uffff\1\u0128\1\u0129\1\uffff\1\u012e\1\u012d"+
            "\10\uffff\1\u0133\5\uffff\1\u0132\26\uffff\1\u0130\102\uffff"+
            "\1\u0131\14\uffff\1\u0120\10\uffff\1\u0127\21\uffff\1\u0126"+
            "\6\uffff\1\u0134\7\uffff\1\u012f\30\uffff\1\u0127\6\uffff\1"+
            "\u0127\105\uffff\1\u012c\1\u012b\1\uffff\1\u011e\1\uffff\1\u0123"+
            "\1\u0122\1\u012a\1\uffff\1\u0123\2\uffff\1\u0135\3\uffff\1\u0122",
            "\1\u0137",
            "\1\u013e\1\u013f\1\u013b\3\uffff\1\u0083\3\uffff\2\u013c\1"+
            "\uffff\1\u0139\2\uffff\1\u0142\1\u0143\1\uffff\1\u0148\1\u0147"+
            "\10\uffff\1\u014d\5\uffff\1\u014c\26\uffff\1\u014a\102\uffff"+
            "\1\u014b\14\uffff\1\u013a\10\uffff\1\u0141\21\uffff\1\u0140"+
            "\6\uffff\1\u014e\7\uffff\1\u0149\30\uffff\1\u0141\6\uffff\1"+
            "\u0141\105\uffff\1\u0146\1\u0145\1\u0150\1\u0138\1\uffff\1\u013d"+
            "\1\u013c\1\u0144\1\uffff\1\u013d\2\uffff\1\u014f\3\uffff\1\u013c",
            "\1\u0159\1\u015a\1\u0156\3\uffff\1\u0083\3\uffff\2\u0157\1"+
            "\uffff\1\u0154\2\uffff\1\u015d\1\u015e\1\uffff\1\u0163\1\u0162"+
            "\10\uffff\1\u0168\5\uffff\1\u0167\26\uffff\1\u0165\102\uffff"+
            "\1\u0166\14\uffff\1\u0155\10\uffff\1\u015c\21\uffff\1\u015b"+
            "\6\uffff\1\u0169\7\uffff\1\u0164\30\uffff\1\u015c\6\uffff\1"+
            "\u015c\105\uffff\1\u0161\1\u0160\1\u016b\1\u0153\1\uffff\1\u0158"+
            "\1\u0157\1\u015f\1\uffff\1\u0158\2\uffff\1\u016a\3\uffff\1\u0157",
            "\1\u016e",
            "\1\u0177\1\u0178\1\u0174\3\uffff\1\u0083\3\uffff\2\u0175\1"+
            "\uffff\1\u0172\2\uffff\1\u017b\1\u017c\1\uffff\1\u0181\1\u0180"+
            "\10\uffff\1\u0186\5\uffff\1\u0185\26\uffff\1\u0183\102\uffff"+
            "\1\u0184\14\uffff\1\u0173\10\uffff\1\u017a\21\uffff\1\u0179"+
            "\6\uffff\1\u0187\7\uffff\1\u0182\30\uffff\1\u017a\6\uffff\1"+
            "\u017a\105\uffff\1\u017f\1\u017e\1\u016f\1\u0171\1\uffff\1\u0176"+
            "\1\u0175\1\u017d\1\uffff\1\u0176\2\uffff\1\u0188\3\uffff\1\u0175",
            "\1\u018a",
            "\1\u0193\1\u0194\1\u0190\3\uffff\1\u0083\3\uffff\2\u0191\1"+
            "\uffff\1\u018e\2\uffff\1\u0197\1\u0198\1\uffff\1\u019d\1\u019c"+
            "\10\uffff\1\u01a2\5\uffff\1\u01a1\26\uffff\1\u019f\102\uffff"+
            "\1\u01a0\14\uffff\1\u018f\10\uffff\1\u0196\21\uffff\1\u0195"+
            "\6\uffff\1\u01a3\7\uffff\1\u019e\30\uffff\1\u0196\6\uffff\1"+
            "\u0196\105\uffff\1\u019b\1\u019a\1\u018b\1\u018d\1\uffff\1\u0192"+
            "\1\u0191\1\u0199\1\uffff\1\u0192\2\uffff\1\u01a4\3\uffff\1\u0191",
            "\1\u01ae\1\u01af\1\u01ab\3\uffff\1\u0083\3\uffff\2\u01ac\1"+
            "\uffff\1\u01a9\2\uffff\1\u01b2\1\u01b3\1\uffff\1\u01b8\1\u01b7"+
            "\10\uffff\1\u01bd\5\uffff\1\u01bc\26\uffff\1\u01ba\102\uffff"+
            "\1\u01bb\14\uffff\1\u01aa\10\uffff\1\u01b1\21\uffff\1\u01b0"+
            "\6\uffff\1\u01be\7\uffff\1\u01b9\30\uffff\1\u01b1\6\uffff\1"+
            "\u01b1\105\uffff\1\u01b6\1\u01b5\1\u01a6\1\u01a8\1\uffff\1\u01ad"+
            "\1\u01ac\1\u01b4\1\uffff\1\u01ad\2\uffff\1\u01bf\3\uffff\1\u01ac",
            "\1\u01c9\1\u01ca\1\u01c6\3\uffff\1\u0083\3\uffff\2\u01c7\1"+
            "\uffff\1\u01c4\2\uffff\1\u01cd\1\u01ce\1\uffff\1\u01d3\1\u01d2"+
            "\10\uffff\1\u01d8\5\uffff\1\u01d7\26\uffff\1\u01d5\102\uffff"+
            "\1\u01d6\14\uffff\1\u01c5\10\uffff\1\u01cc\21\uffff\1\u01cb"+
            "\6\uffff\1\u01d9\7\uffff\1\u01d4\30\uffff\1\u01cc\6\uffff\1"+
            "\u01cc\105\uffff\1\u01d1\1\u01d0\1\u01c1\1\u01c3\1\uffff\1\u01c8"+
            "\1\u01c7\1\u01cf\1\uffff\1\u01c8\2\uffff\1\u01da\3\uffff\1\u01c7",
            "\1\u01e4\1\u01e5\1\u01e1\3\uffff\1\u0083\3\uffff\2\u01e2\1"+
            "\uffff\1\u01df\2\uffff\1\u01e8\1\u01e9\1\uffff\1\u01ee\1\u01ed"+
            "\10\uffff\1\u01f3\5\uffff\1\u01f2\26\uffff\1\u01f0\102\uffff"+
            "\1\u01f1\14\uffff\1\u01e0\10\uffff\1\u01e7\21\uffff\1\u01e6"+
            "\6\uffff\1\u01f4\7\uffff\1\u01ef\30\uffff\1\u01e7\6\uffff\1"+
            "\u01e7\105\uffff\1\u01ec\1\u01eb\1\u01dc\1\u01de\1\uffff\1\u01e3"+
            "\1\u01e2\1\u01ea\1\uffff\1\u01e3\2\uffff\1\u01f5\3\uffff\1\u01e2",
            "\1\u01f7",
            "\1\u01fe\5\uffff\1\u0202\4\uffff\1\u0201\7\uffff\1\u020a\1"+
            "\u020b\1\uffff\1\u020b\1\uffff\2\u020b\1\uffff\1\u020b\1\u0206"+
            "\14\u020b\1\u020d\1\u020c\1\u020b\1\uffff\3\u020b\1\uffff\1"+
            "\u020b\1\uffff\4\u020b\1\uffff\1\u020b\1\uffff\1\u020b\1\uffff"+
            "\1\u020b\1\uffff\2\u020b\1\uffff\1\u020b\1\u01fb\14\u020b\1"+
            "\u0211\1\uffff\2\u020b\1\uffff\2\u020b\1\uffff\1\u020b\2\uffff"+
            "\1\u020b\1\uffff\1\u020b\1\uffff\3\u020b\1\uffff\1\u020b\1\u0204"+
            "\5\u020b\1\uffff\3\u020b\1\uffff\1\u020b\1\uffff\4\u020b\1\uffff"+
            "\2\u020b\1\u0205\14\u020b\2\uffff\3\u020b\1\uffff\4\u020b\1"+
            "\u0210\1\uffff\12\u020b\1\uffff\1\u0207\3\u020b\1\uffff\2\u020b"+
            "\1\u01f8\1\u020b\1\u01fa\2\u020b\1\uffff\1\u020b\1\uffff\6\u020b"+
            "\2\uffff\1\u020b\1\uffff\5\u020b\3\uffff\2\u020b\1\uffff\12"+
            "\u020b\1\uffff\16\u020b\1\uffff\22\u020b\1\u0208\1\uffff\2\u020b"+
            "\1\uffff\4\u020b\1\uffff\4\u020b\1\uffff\1\u020b\1\u0203\2\u020b"+
            "\1\uffff\2\u020b\1\u0209\1\uffff\4\u020b\1\uffff\7\u020b\1\uffff"+
            "\1\u0212\1\uffff\1\u020b\1\uffff\1\u020b\4\uffff\1\u020e\1\u020f"+
            "\1\uffff\1\u01f9\2\uffff\1\u01fc\1\u01f9\7\uffff\1\u01ff\1\u01fd"+
            "\1\u01f9\1\u0200",
            "\1\u0219\5\uffff\1\u021d\4\uffff\1\u021c\7\uffff\1\u0225\1"+
            "\u0226\1\uffff\1\u0226\1\uffff\2\u0226\1\uffff\1\u0226\1\u0221"+
            "\14\u0226\1\u0228\1\u0227\1\u0226\1\uffff\3\u0226\1\uffff\1"+
            "\u0226\1\uffff\4\u0226\1\uffff\1\u0226\1\uffff\1\u0226\1\uffff"+
            "\1\u0226\1\uffff\2\u0226\1\uffff\1\u0226\1\u0216\14\u0226\1"+
            "\u022c\1\uffff\2\u0226\1\uffff\2\u0226\1\uffff\1\u0226\2\uffff"+
            "\1\u0226\1\uffff\1\u0226\1\uffff\3\u0226\1\uffff\1\u0226\1\u021f"+
            "\5\u0226\1\uffff\3\u0226\1\uffff\1\u0226\1\uffff\4\u0226\1\uffff"+
            "\2\u0226\1\u0220\14\u0226\2\uffff\3\u0226\1\uffff\4\u0226\1"+
            "\u022b\1\uffff\12\u0226\1\uffff\1\u0222\3\u0226\1\uffff\2\u0226"+
            "\1\u0213\1\u0226\1\u0215\2\u0226\1\uffff\1\u0226\1\uffff\6\u0226"+
            "\2\uffff\1\u0226\1\uffff\5\u0226\3\uffff\2\u0226\1\uffff\12"+
            "\u0226\1\uffff\16\u0226\1\uffff\22\u0226\1\u0223\1\uffff\2\u0226"+
            "\1\uffff\4\u0226\1\uffff\4\u0226\1\uffff\1\u0226\1\u021e\2\u0226"+
            "\1\uffff\2\u0226\1\u0224\1\uffff\4\u0226\1\uffff\7\u0226\3\uffff"+
            "\1\u0226\1\uffff\1\u0226\4\uffff\1\u0229\1\u022a\1\uffff\1\u0214"+
            "\2\uffff\1\u0217\1\u0214\7\uffff\1\u021a\1\u0218\1\u0214\1\u021b",
            "\1\u022d\1\u022e\1\uffff\1\u022e\1\uffff\2\u022e\1\uffff\16"+
            "\u022e\2\uffff\1\u022e\1\uffff\3\u022e\1\uffff\1\u022e\1\uffff"+
            "\4\u022e\1\uffff\1\u022e\1\uffff\1\u022e\1\uffff\1\u022e\1\uffff"+
            "\2\u022e\1\uffff\16\u022e\2\uffff\2\u022e\1\uffff\2\u022e\1"+
            "\uffff\1\u022e\2\uffff\1\u022e\1\uffff\1\u022e\1\uffff\3\u022e"+
            "\1\uffff\7\u022e\1\uffff\3\u022e\1\uffff\1\u022e\1\uffff\4\u022e"+
            "\1\uffff\2\u022e\1\uffff\14\u022e\2\uffff\3\u022e\1\uffff\4"+
            "\u022e\2\uffff\12\u022e\2\uffff\3\u022e\1\uffff\2\u022e\1\uffff"+
            "\4\u022e\1\uffff\1\u022e\1\uffff\6\u022e\2\uffff\1\u022e\1\uffff"+
            "\5\u022e\3\uffff\2\u022e\1\uffff\12\u022e\1\uffff\16\u022e\1"+
            "\uffff\23\u022e\1\uffff\2\u022e\1\uffff\4\u022e\1\uffff\4\u022e"+
            "\1\uffff\4\u022e\1\uffff\3\u022e\1\uffff\4\u022e\1\uffff\7\u022e"+
            "\3\uffff\1\u022e\1\uffff\1\u022e",
            "\1\u022f",
            "\1\u0230",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "65:1: groupingSetExpression : ( groupByExpression -> ^( TOK_GROUPING_SETS_EXPRESSION groupByExpression ) | LPAREN groupByExpression ( COMMA groupByExpression )* RPAREN -> ^( TOK_GROUPING_SETS_EXPRESSION ( groupByExpression )+ ) | LPAREN RPAREN -> ^( TOK_GROUPING_SETS_EXPRESSION ) );";
        }
    }
    static final String DFA31_eotS =
        "\116\uffff";
    static final String DFA31_eofS =
        "\3\uffff\1\13\112\uffff";
    static final String DFA31_minS =
        "\1\7\2\uffff\1\4\112\uffff";
    static final String DFA31_maxS =
        "\1\u0132\2\uffff\1\u0130\112\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff\1\3"+
        "\101\uffff\1\4";
    static final String DFA31_specialS =
        "\116\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\4\5\uffff\1\10\4\uffff\1\7\66\uffff\1\2\40\uffff\1\11\u0097"+
            "\uffff\1\11\43\uffff\1\1\10\uffff\1\5\1\3\1\uffff\1\6",
            "",
            "",
            "\3\13\3\uffff\1\13\3\uffff\2\13\1\uffff\1\13\2\uffff\2\13\1"+
            "\uffff\2\13\1\uffff\2\13\1\uffff\1\13\1\uffff\21\13\2\uffff"+
            "\1\13\1\uffff\3\13\1\uffff\1\13\1\uffff\6\13\1\uffff\3\13\1"+
            "\uffff\2\13\1\uffff\16\13\2\uffff\2\13\1\uffff\4\13\1\uffff"+
            "\2\13\1\uffff\1\13\1\uffff\3\13\1\uffff\7\13\1\uffff\5\13\1"+
            "\uffff\7\13\1\uffff\14\13\2\uffff\10\13\2\uffff\12\13\1\uffff"+
            "\4\13\1\uffff\7\13\1\uffff\13\13\1\uffff\5\13\3\uffff\2\13\1"+
            "\uffff\55\13\1\uffff\2\13\1\uffff\11\13\1\uffff\4\13\1\uffff"+
            "\3\13\1\uffff\4\13\1\uffff\7\13\1\uffff\5\13\2\uffff\2\13\1"+
            "\uffff\1\13\1\uffff\3\13\1\uffff\1\13\2\uffff\2\13\2\uffff\1"+
            "\13\1\uffff\1\115",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "220:1: constant : ( Number | dateLiteral | StringLiteral | stringLiteralSequence | BigintLiteral | SmallintLiteral | TinyintLiteral | DecimalLiteral | charSetStringLiteral | booleanValue );";
        }
    }
    static final String DFA32_eotS =
        "\104\uffff";
    static final String DFA32_eofS =
        "\1\1\103\uffff";
    static final String DFA32_minS =
        "\1\4\103\uffff";
    static final String DFA32_maxS =
        "\1\u0130\103\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\2\101\uffff\1\1";
    static final String DFA32_specialS =
        "\104\uffff}>";
    static final String[] DFA32_transitionS = {
            "\3\1\3\uffff\1\1\3\uffff\2\1\1\uffff\1\1\2\uffff\2\1\1\uffff"+
            "\2\1\1\uffff\2\1\1\uffff\1\1\1\uffff\21\1\2\uffff\1\1\1\uffff"+
            "\3\1\1\uffff\1\1\1\uffff\6\1\1\uffff\3\1\1\uffff\2\1\1\uffff"+
            "\16\1\2\uffff\2\1\1\uffff\4\1\1\uffff\2\1\1\uffff\1\1\1\uffff"+
            "\3\1\1\uffff\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff\14\1\2\uffff"+
            "\10\1\2\uffff\12\1\1\uffff\4\1\1\uffff\7\1\1\uffff\13\1\1\uffff"+
            "\5\1\3\uffff\2\1\1\uffff\55\1\1\uffff\2\1\1\uffff\11\1\1\uffff"+
            "\4\1\1\uffff\3\1\1\uffff\4\1\1\uffff\7\1\1\uffff\5\1\2\uffff"+
            "\2\1\1\uffff\1\1\1\uffff\3\1\1\uffff\1\1\2\uffff\2\1\2\uffff"+
            "\1\1\1\uffff\1\103",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "()+ loopback of 238:19: ( StringLiteral )+";
        }
    }
    static final String DFA33_eotS =
        "\u02ab\uffff";
    static final String DFA33_eofS =
        "\1\uffff\1\31\1\136\7\uffff\2\3\1\uffff\1\136\1\uffff\4\136\u0298"+
        "\uffff";
    static final String DFA33_minS =
        "\1\7\2\4\7\uffff\2\4\1\uffff\1\4\1\uffff\4\4\1\uffff\1\7\5\uffff"+
        "\1\32\105\uffff\1\32\100\uffff\1\32\102\uffff\1\32\104\uffff\1\32"+
        "\102\uffff\1\32\102\uffff\1\32\102\uffff\1\32\102\uffff\1\32\165"+
        "\uffff";
    static final String DFA33_maxS =
        "\1\u0132\1\u012e\1\u0130\7\uffff\2\u012e\1\uffff\1\u012e\1\uffff"+
        "\4\u012e\1\uffff\1\u0132\5\uffff\1\u011b\105\uffff\1\u011b\100\uffff"+
        "\1\u011b\102\uffff\1\u011b\104\uffff\1\u011b\102\uffff\1\u011b\102"+
        "\uffff\1\u011b\102\uffff\1\u011b\102\uffff\1\u011b\165\uffff";
    static final String DFA33_acceptS =
        "\3\uffff\1\3\10\uffff\1\4\6\uffff\1\5\1\uffff\1\11\1\12\1\uffff"+
        "\1\13\1\1\102\uffff\1\2\1\uffff\1\10\u0216\uffff\1\6\31\uffff\1"+
        "\7\33\uffff";
    static final String DFA33_specialS =
        "\u02ab\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\3\5\uffff\1\3\4\uffff\1\3\7\uffff\1\21\1\22\1\uffff\1\22"+
            "\1\uffff\2\22\1\uffff\1\22\1\15\14\22\1\24\1\23\1\22\1\uffff"+
            "\3\22\1\uffff\1\22\1\uffff\4\22\1\uffff\1\22\1\uffff\1\22\1"+
            "\uffff\1\22\1\uffff\2\22\1\uffff\1\22\1\2\14\22\1\30\1\uffff"+
            "\2\22\1\uffff\2\22\1\uffff\1\22\2\uffff\1\22\1\uffff\1\22\1"+
            "\uffff\3\22\1\uffff\1\22\1\13\5\22\1\uffff\3\22\1\uffff\1\22"+
            "\1\uffff\4\22\1\uffff\2\22\1\14\14\22\2\uffff\3\22\1\uffff\4"+
            "\22\1\26\1\uffff\12\22\1\uffff\1\14\3\22\1\uffff\2\22\1\uffff"+
            "\1\22\1\1\2\22\1\uffff\1\22\1\uffff\6\22\2\uffff\1\22\1\uffff"+
            "\5\22\3\uffff\2\22\1\uffff\12\22\1\uffff\16\22\1\uffff\22\22"+
            "\1\17\1\uffff\2\22\1\uffff\4\22\1\uffff\4\22\1\uffff\1\22\1"+
            "\12\2\22\1\uffff\2\22\1\20\1\uffff\4\22\1\uffff\7\22\3\uffff"+
            "\1\22\1\uffff\1\22\4\uffff\1\25\1\26\4\uffff\1\3\10\uffff\2"+
            "\3\1\uffff\1\3",
            "\3\31\3\uffff\1\31\3\uffff\2\31\1\uffff\1\32\2\uffff\2\31\1"+
            "\uffff\2\31\1\uffff\2\31\1\uffff\1\31\1\uffff\21\31\2\uffff"+
            "\1\31\1\uffff\3\31\1\uffff\1\31\1\uffff\6\31\1\uffff\3\31\1"+
            "\uffff\2\31\1\uffff\16\31\2\uffff\2\31\1\uffff\4\31\1\uffff"+
            "\2\31\1\uffff\1\31\1\uffff\3\31\1\uffff\7\31\1\uffff\5\31\1"+
            "\uffff\7\31\1\uffff\14\31\2\uffff\10\31\2\uffff\12\31\1\uffff"+
            "\4\31\1\uffff\7\31\1\uffff\13\31\1\uffff\5\31\3\uffff\2\31\1"+
            "\uffff\55\31\1\uffff\2\31\1\uffff\11\31\1\uffff\4\31\1\uffff"+
            "\3\31\1\uffff\4\31\1\uffff\7\31\1\uffff\5\31\2\uffff\2\31\1"+
            "\14\1\31\1\uffff\3\31\1\uffff\1\31\2\uffff\2\31\2\uffff\1\31",
            "\3\136\3\uffff\1\136\3\uffff\2\136\1\uffff\1\140\2\uffff\2"+
            "\136\1\uffff\2\136\1\uffff\2\136\1\uffff\1\136\1\uffff\21\136"+
            "\2\uffff\1\136\1\uffff\3\136\1\uffff\1\136\1\uffff\6\136\1\uffff"+
            "\3\136\1\uffff\2\136\1\uffff\16\136\2\uffff\2\136\1\uffff\4"+
            "\136\1\uffff\2\136\1\uffff\1\136\1\uffff\3\136\1\uffff\7\136"+
            "\1\uffff\5\136\1\uffff\7\136\1\uffff\14\136\2\uffff\10\136\2"+
            "\uffff\12\136\1\uffff\4\136\1\uffff\7\136\1\uffff\13\136\1\uffff"+
            "\5\136\3\uffff\2\136\1\uffff\55\136\1\uffff\2\136\1\uffff\11"+
            "\136\1\uffff\4\136\1\uffff\3\136\1\uffff\4\136\1\uffff\7\136"+
            "\1\uffff\5\136\2\uffff\2\136\1\14\1\136\1\uffff\3\136\1\uffff"+
            "\1\136\2\uffff\2\136\2\uffff\1\136\1\uffff\1\134",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\3\3\uffff\1\3\3\uffff\2\3\1\uffff\1\u00a1\2\uffff\2\3\1"+
            "\uffff\2\3\1\uffff\2\3\1\uffff\1\3\1\uffff\21\3\2\uffff\1\3"+
            "\1\uffff\3\3\1\uffff\1\3\1\uffff\6\3\1\uffff\3\3\1\uffff\2\3"+
            "\1\uffff\16\3\2\uffff\2\3\1\uffff\4\3\1\uffff\2\3\1\uffff\1"+
            "\3\1\uffff\3\3\1\uffff\7\3\1\uffff\5\3\1\uffff\7\3\1\uffff\14"+
            "\3\2\uffff\10\3\2\uffff\12\3\1\uffff\4\3\1\uffff\7\3\1\uffff"+
            "\13\3\1\uffff\5\3\3\uffff\2\3\1\uffff\55\3\1\uffff\2\3\1\uffff"+
            "\11\3\1\uffff\4\3\1\uffff\3\3\1\uffff\4\3\1\uffff\7\3\1\uffff"+
            "\5\3\2\uffff\2\3\1\14\1\3\1\uffff\3\3\1\uffff\1\3\2\uffff\2"+
            "\3\2\uffff\1\3",
            "\3\3\3\uffff\1\3\3\uffff\2\3\1\uffff\1\u00e4\2\uffff\2\3\1"+
            "\uffff\2\3\1\uffff\2\3\1\uffff\1\3\1\uffff\21\3\2\uffff\1\3"+
            "\1\uffff\3\3\1\uffff\1\3\1\uffff\6\3\1\uffff\3\3\1\uffff\2\3"+
            "\1\uffff\16\3\2\uffff\2\3\1\uffff\4\3\1\uffff\2\3\1\uffff\1"+
            "\3\1\uffff\3\3\1\uffff\7\3\1\uffff\5\3\1\uffff\7\3\1\uffff\14"+
            "\3\2\uffff\10\3\2\uffff\12\3\1\uffff\4\3\1\uffff\7\3\1\uffff"+
            "\13\3\1\uffff\5\3\3\uffff\2\3\1\uffff\55\3\1\uffff\2\3\1\uffff"+
            "\11\3\1\uffff\4\3\1\uffff\3\3\1\uffff\4\3\1\uffff\7\3\1\uffff"+
            "\5\3\2\uffff\2\3\1\14\1\3\1\uffff\3\3\1\uffff\1\3\2\uffff\2"+
            "\3\2\uffff\1\3",
            "",
            "\3\136\3\uffff\1\136\3\uffff\2\136\1\uffff\1\u0129\2\uffff"+
            "\2\136\1\uffff\2\136\1\uffff\2\136\1\uffff\1\136\1\uffff\21"+
            "\136\2\uffff\1\136\1\uffff\3\136\1\uffff\1\136\1\uffff\6\136"+
            "\1\uffff\3\136\1\uffff\2\136\1\uffff\16\136\2\uffff\2\136\1"+
            "\uffff\4\136\1\uffff\2\136\1\uffff\1\136\1\uffff\3\136\1\uffff"+
            "\7\136\1\uffff\5\136\1\uffff\7\136\1\uffff\14\136\2\uffff\10"+
            "\136\2\uffff\12\136\1\uffff\4\136\1\uffff\7\136\1\uffff\13\136"+
            "\1\uffff\5\136\3\uffff\2\136\1\uffff\55\136\1\uffff\2\136\1"+
            "\uffff\11\136\1\uffff\4\136\1\uffff\3\136\1\uffff\4\136\1\uffff"+
            "\7\136\1\uffff\5\136\2\uffff\2\136\1\14\1\136\1\uffff\3\136"+
            "\1\uffff\1\136\2\uffff\2\136\2\uffff\1\136",
            "",
            "\3\136\3\uffff\1\136\3\uffff\2\136\1\uffff\1\u016c\2\uffff"+
            "\2\136\1\uffff\2\136\1\uffff\2\136\1\uffff\1\136\1\uffff\21"+
            "\136\2\uffff\1\136\1\uffff\3\136\1\uffff\1\136\1\uffff\6\136"+
            "\1\uffff\3\136\1\uffff\2\136\1\uffff\16\136\2\uffff\2\136\1"+
            "\uffff\4\136\1\uffff\2\136\1\uffff\1\136\1\uffff\3\136\1\uffff"+
            "\7\136\1\uffff\5\136\1\uffff\7\136\1\uffff\14\136\2\uffff\10"+
            "\136\2\uffff\12\136\1\uffff\4\136\1\uffff\7\136\1\uffff\13\136"+
            "\1\uffff\5\136\3\uffff\2\136\1\uffff\55\136\1\uffff\2\136\1"+
            "\uffff\11\136\1\uffff\4\136\1\uffff\3\136\1\uffff\4\136\1\uffff"+
            "\7\136\1\uffff\5\136\2\uffff\2\136\1\14\1\136\1\uffff\3\136"+
            "\1\uffff\1\136\2\uffff\2\136\2\uffff\1\136",
            "\3\136\3\uffff\1\136\3\uffff\2\136\1\uffff\1\u01af\2\uffff"+
            "\2\136\1\uffff\2\136\1\uffff\2\136\1\uffff\1\136\1\uffff\21"+
            "\136\2\uffff\1\136\1\uffff\3\136\1\uffff\1\136\1\uffff\6\136"+
            "\1\uffff\3\136\1\uffff\2\136\1\uffff\16\136\2\uffff\2\136\1"+
            "\uffff\4\136\1\uffff\2\136\1\uffff\1\136\1\uffff\3\136\1\uffff"+
            "\7\136\1\uffff\5\136\1\uffff\7\136\1\uffff\14\136\2\uffff\10"+
            "\136\2\uffff\12\136\1\uffff\4\136\1\uffff\7\136\1\uffff\13\136"+
            "\1\uffff\5\136\3\uffff\2\136\1\uffff\55\136\1\uffff\2\136\1"+
            "\uffff\11\136\1\uffff\4\136\1\uffff\3\136\1\uffff\4\136\1\uffff"+
            "\7\136\1\uffff\5\136\2\uffff\2\136\1\14\1\136\1\uffff\3\136"+
            "\1\uffff\1\136\2\uffff\2\136\2\uffff\1\136",
            "\3\136\3\uffff\1\136\3\uffff\2\136\1\uffff\1\u01f2\2\uffff"+
            "\2\136\1\uffff\2\136\1\uffff\2\136\1\uffff\1\136\1\uffff\21"+
            "\136\2\uffff\1\136\1\uffff\3\136\1\uffff\1\136\1\uffff\6\136"+
            "\1\uffff\3\136\1\uffff\2\136\1\uffff\16\136\2\uffff\2\136\1"+
            "\uffff\4\136\1\uffff\2\136\1\uffff\1\136\1\uffff\3\136\1\uffff"+
            "\7\136\1\uffff\5\136\1\uffff\7\136\1\uffff\14\136\2\uffff\10"+
            "\136\2\uffff\12\136\1\uffff\4\136\1\uffff\7\136\1\uffff\13\136"+
            "\1\uffff\5\136\3\uffff\2\136\1\uffff\55\136\1\uffff\2\136\1"+
            "\uffff\11\136\1\uffff\4\136\1\uffff\3\136\1\uffff\4\136\1\uffff"+
            "\7\136\1\uffff\5\136\2\uffff\2\136\1\14\1\136\1\uffff\3\136"+
            "\1\uffff\1\136\2\uffff\2\136\2\uffff\1\136",
            "\3\136\3\uffff\1\136\3\uffff\2\136\1\uffff\1\u0235\2\uffff"+
            "\2\136\1\uffff\2\136\1\uffff\2\136\1\uffff\1\136\1\uffff\21"+
            "\136\2\uffff\1\136\1\uffff\3\136\1\uffff\1\136\1\uffff\6\136"+
            "\1\uffff\3\136\1\uffff\2\136\1\uffff\16\136\2\uffff\2\136\1"+
            "\uffff\4\136\1\uffff\2\136\1\uffff\1\136\1\uffff\3\136\1\uffff"+
            "\7\136\1\uffff\5\136\1\uffff\7\136\1\uffff\14\136\2\uffff\10"+
            "\136\2\uffff\12\136\1\uffff\4\136\1\uffff\7\136\1\uffff\13\136"+
            "\1\uffff\5\136\3\uffff\2\136\1\uffff\55\136\1\uffff\2\136\1"+
            "\uffff\11\136\1\uffff\4\136\1\uffff\3\136\1\uffff\4\136\1\uffff"+
            "\7\136\1\uffff\5\136\2\uffff\2\136\1\14\1\136\1\uffff\3\136"+
            "\1\uffff\1\136\2\uffff\2\136\2\uffff\1\136",
            "",
            "\1\u0275\5\uffff\1\u0275\4\uffff\1\u0275\7\uffff\2\u0275\1"+
            "\uffff\1\u0275\1\uffff\2\u0275\1\uffff\21\u0275\1\uffff\3\u0275"+
            "\1\uffff\1\u0275\1\uffff\4\u0275\1\uffff\1\u0275\1\uffff\1\u0275"+
            "\1\uffff\1\u0275\1\uffff\2\u0275\1\uffff\17\u0275\1\uffff\2"+
            "\u0275\1\uffff\2\u0275\1\uffff\1\u0275\2\uffff\1\u0275\1\uffff"+
            "\1\u0275\1\uffff\3\u0275\1\uffff\7\u0275\1\uffff\3\u0275\1\uffff"+
            "\1\u0275\1\uffff\4\u0275\1\uffff\17\u0275\2\uffff\3\u0275\1"+
            "\uffff\5\u0275\1\uffff\12\u0275\1\uffff\4\u0275\1\uffff\7\u0275"+
            "\1\uffff\1\u0275\1\uffff\6\u0275\2\uffff\1\u0275\1\uffff\5\u0275"+
            "\3\uffff\2\u0275\1\uffff\12\u0275\1\uffff\16\u0275\1\uffff\23"+
            "\u0275\1\uffff\2\u0275\1\uffff\4\u0275\1\uffff\4\u0275\1\uffff"+
            "\4\u0275\1\uffff\3\u0275\1\uffff\4\u0275\1\uffff\7\u0275\1\uffff"+
            "\1\u028f\1\uffff\1\u0275\1\uffff\1\u0275\4\uffff\2\u0275\1\uffff"+
            "\1\u0275\2\uffff\2\u0275\7\uffff\4\u0275",
            "",
            "",
            "",
            "",
            "",
            "\2\31\1\uffff\1\31\1\uffff\2\31\1\uffff\16\31\2\uffff\1\31"+
            "\1\uffff\3\31\1\uffff\1\31\1\uffff\4\31\1\uffff\1\31\1\uffff"+
            "\1\31\1\uffff\1\31\1\uffff\2\31\1\uffff\16\31\2\uffff\2\31\1"+
            "\uffff\2\31\1\uffff\1\31\2\uffff\1\31\1\uffff\1\31\1\uffff\3"+
            "\31\1\uffff\7\31\1\uffff\3\31\1\uffff\1\31\1\uffff\4\31\1\uffff"+
            "\2\31\1\uffff\14\31\1\uffff\1\26\3\31\1\uffff\4\31\2\uffff\12"+
            "\31\2\uffff\3\31\1\uffff\2\31\1\uffff\4\31\1\uffff\1\31\1\uffff"+
            "\6\31\2\uffff\1\31\1\uffff\5\31\3\uffff\2\31\1\uffff\12\31\1"+
            "\uffff\16\31\1\uffff\23\31\1\uffff\2\31\1\uffff\4\31\1\uffff"+
            "\4\31\1\uffff\4\31\1\uffff\3\31\1\uffff\4\31\1\uffff\7\31\3"+
            "\uffff\1\31\1\uffff\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\136\1\uffff\1\136\1\uffff\2\136\1\uffff\16\136\2\uffff\1"+
            "\136\1\uffff\3\136\1\uffff\1\136\1\uffff\4\136\1\uffff\1\136"+
            "\1\uffff\1\136\1\uffff\1\136\1\uffff\2\136\1\uffff\16\136\2"+
            "\uffff\2\136\1\uffff\2\136\1\uffff\1\136\2\uffff\1\136\1\uffff"+
            "\1\136\1\uffff\3\136\1\uffff\7\136\1\uffff\3\136\1\uffff\1\136"+
            "\1\uffff\4\136\1\uffff\2\136\1\uffff\14\136\1\uffff\1\26\3\136"+
            "\1\uffff\4\136\2\uffff\12\136\2\uffff\3\136\1\uffff\2\136\1"+
            "\uffff\4\136\1\uffff\1\136\1\uffff\6\136\2\uffff\1\136\1\uffff"+
            "\5\136\3\uffff\2\136\1\uffff\12\136\1\uffff\16\136\1\uffff\23"+
            "\136\1\uffff\2\136\1\uffff\4\136\1\uffff\4\136\1\uffff\4\136"+
            "\1\uffff\3\136\1\uffff\4\136\1\uffff\7\136\3\uffff\1\136\1\uffff"+
            "\1\136",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\3\1\uffff\1\3\1\uffff\2\3\1\uffff\16\3\2\uffff\1\3\1\uffff"+
            "\3\3\1\uffff\1\3\1\uffff\4\3\1\uffff\1\3\1\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\2\3\1\uffff\16\3\2\uffff\2\3\1\uffff\2\3\1\uffff"+
            "\1\3\2\uffff\1\3\1\uffff\1\3\1\uffff\3\3\1\uffff\7\3\1\uffff"+
            "\3\3\1\uffff\1\3\1\uffff\4\3\1\uffff\2\3\1\uffff\14\3\1\uffff"+
            "\1\26\3\3\1\uffff\4\3\2\uffff\12\3\2\uffff\3\3\1\uffff\2\3\1"+
            "\uffff\4\3\1\uffff\1\3\1\uffff\6\3\2\uffff\1\3\1\uffff\5\3\3"+
            "\uffff\2\3\1\uffff\12\3\1\uffff\16\3\1\uffff\23\3\1\uffff\2"+
            "\3\1\uffff\4\3\1\uffff\4\3\1\uffff\4\3\1\uffff\3\3\1\uffff\4"+
            "\3\1\uffff\7\3\3\uffff\1\3\1\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\3\1\uffff\1\3\1\uffff\2\3\1\uffff\16\3\2\uffff\1\3\1\uffff"+
            "\3\3\1\uffff\1\3\1\uffff\4\3\1\uffff\1\3\1\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\2\3\1\uffff\16\3\2\uffff\2\3\1\uffff\2\3\1\uffff"+
            "\1\3\2\uffff\1\3\1\uffff\1\3\1\uffff\3\3\1\uffff\7\3\1\uffff"+
            "\3\3\1\uffff\1\3\1\uffff\4\3\1\uffff\2\3\1\uffff\14\3\1\uffff"+
            "\1\26\3\3\1\uffff\4\3\2\uffff\12\3\2\uffff\3\3\1\uffff\2\3\1"+
            "\uffff\4\3\1\uffff\1\3\1\uffff\6\3\2\uffff\1\3\1\uffff\5\3\3"+
            "\uffff\2\3\1\uffff\12\3\1\uffff\16\3\1\uffff\23\3\1\uffff\2"+
            "\3\1\uffff\4\3\1\uffff\4\3\1\uffff\4\3\1\uffff\3\3\1\uffff\4"+
            "\3\1\uffff\7\3\3\uffff\1\3\1\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\136\1\uffff\1\136\1\uffff\2\136\1\uffff\16\136\2\uffff\1"+
            "\136\1\uffff\3\136\1\uffff\1\136\1\uffff\4\136\1\uffff\1\136"+
            "\1\uffff\1\136\1\uffff\1\136\1\uffff\2\136\1\uffff\16\136\2"+
            "\uffff\2\136\1\uffff\2\136\1\uffff\1\136\2\uffff\1\136\1\uffff"+
            "\1\136\1\uffff\3\136\1\uffff\7\136\1\uffff\3\136\1\uffff\1\136"+
            "\1\uffff\4\136\1\uffff\2\136\1\uffff\14\136\1\uffff\1\26\3\136"+
            "\1\uffff\4\136\2\uffff\12\136\2\uffff\3\136\1\uffff\2\136\1"+
            "\uffff\4\136\1\uffff\1\136\1\uffff\6\136\2\uffff\1\136\1\uffff"+
            "\5\136\3\uffff\2\136\1\uffff\12\136\1\uffff\16\136\1\uffff\23"+
            "\136\1\uffff\2\136\1\uffff\4\136\1\uffff\4\136\1\uffff\4\136"+
            "\1\uffff\3\136\1\uffff\4\136\1\uffff\7\136\3\uffff\1\136\1\uffff"+
            "\1\136",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\136\1\uffff\1\136\1\uffff\2\136\1\uffff\16\136\2\uffff\1"+
            "\136\1\uffff\3\136\1\uffff\1\136\1\uffff\4\136\1\uffff\1\136"+
            "\1\uffff\1\136\1\uffff\1\136\1\uffff\2\136\1\uffff\16\136\2"+
            "\uffff\2\136\1\uffff\2\136\1\uffff\1\136\2\uffff\1\136\1\uffff"+
            "\1\136\1\uffff\3\136\1\uffff\7\136\1\uffff\3\136\1\uffff\1\136"+
            "\1\uffff\4\136\1\uffff\2\136\1\uffff\14\136\1\uffff\1\26\3\136"+
            "\1\uffff\4\136\2\uffff\12\136\2\uffff\3\136\1\uffff\2\136\1"+
            "\uffff\4\136\1\uffff\1\136\1\uffff\6\136\2\uffff\1\136\1\uffff"+
            "\5\136\3\uffff\2\136\1\uffff\12\136\1\uffff\16\136\1\uffff\23"+
            "\136\1\uffff\2\136\1\uffff\4\136\1\uffff\4\136\1\uffff\4\136"+
            "\1\uffff\3\136\1\uffff\4\136\1\uffff\7\136\3\uffff\1\136\1\uffff"+
            "\1\136",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\136\1\uffff\1\136\1\uffff\2\136\1\uffff\16\136\2\uffff\1"+
            "\136\1\uffff\3\136\1\uffff\1\136\1\uffff\4\136\1\uffff\1\136"+
            "\1\uffff\1\136\1\uffff\1\136\1\uffff\2\136\1\uffff\16\136\2"+
            "\uffff\2\136\1\uffff\2\136\1\uffff\1\136\2\uffff\1\136\1\uffff"+
            "\1\136\1\uffff\3\136\1\uffff\7\136\1\uffff\3\136\1\uffff\1\136"+
            "\1\uffff\4\136\1\uffff\2\136\1\uffff\14\136\1\uffff\1\26\3\136"+
            "\1\uffff\4\136\2\uffff\12\136\2\uffff\3\136\1\uffff\2\136\1"+
            "\uffff\4\136\1\uffff\1\136\1\uffff\6\136\2\uffff\1\136\1\uffff"+
            "\5\136\3\uffff\2\136\1\uffff\12\136\1\uffff\16\136\1\uffff\23"+
            "\136\1\uffff\2\136\1\uffff\4\136\1\uffff\4\136\1\uffff\4\136"+
            "\1\uffff\3\136\1\uffff\4\136\1\uffff\7\136\3\uffff\1\136\1\uffff"+
            "\1\136",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\136\1\uffff\1\136\1\uffff\2\136\1\uffff\16\136\2\uffff\1"+
            "\136\1\uffff\3\136\1\uffff\1\136\1\uffff\4\136\1\uffff\1\136"+
            "\1\uffff\1\136\1\uffff\1\136\1\uffff\2\136\1\uffff\16\136\2"+
            "\uffff\2\136\1\uffff\2\136\1\uffff\1\136\2\uffff\1\136\1\uffff"+
            "\1\136\1\uffff\3\136\1\uffff\7\136\1\uffff\3\136\1\uffff\1\136"+
            "\1\uffff\4\136\1\uffff\2\136\1\uffff\14\136\1\uffff\1\26\3\136"+
            "\1\uffff\4\136\2\uffff\12\136\2\uffff\3\136\1\uffff\2\136\1"+
            "\uffff\4\136\1\uffff\1\136\1\uffff\6\136\2\uffff\1\136\1\uffff"+
            "\5\136\3\uffff\2\136\1\uffff\12\136\1\uffff\16\136\1\uffff\23"+
            "\136\1\uffff\2\136\1\uffff\4\136\1\uffff\4\136\1\uffff\4\136"+
            "\1\uffff\3\136\1\uffff\4\136\1\uffff\7\136\3\uffff\1\136\1\uffff"+
            "\1\136",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\136\1\uffff\1\136\1\uffff\2\136\1\uffff\16\136\2\uffff\1"+
            "\136\1\uffff\3\136\1\uffff\1\136\1\uffff\4\136\1\uffff\1\136"+
            "\1\uffff\1\136\1\uffff\1\136\1\uffff\2\136\1\uffff\16\136\2"+
            "\uffff\2\136\1\uffff\2\136\1\uffff\1\136\2\uffff\1\136\1\uffff"+
            "\1\136\1\uffff\3\136\1\uffff\7\136\1\uffff\3\136\1\uffff\1\136"+
            "\1\uffff\4\136\1\uffff\2\136\1\uffff\14\136\1\uffff\1\26\3\136"+
            "\1\uffff\4\136\2\uffff\12\136\2\uffff\3\136\1\uffff\2\136\1"+
            "\uffff\4\136\1\uffff\1\136\1\uffff\6\136\2\uffff\1\136\1\uffff"+
            "\5\136\3\uffff\2\136\1\uffff\12\136\1\uffff\16\136\1\uffff\23"+
            "\136\1\uffff\2\136\1\uffff\4\136\1\uffff\4\136\1\uffff\4\136"+
            "\1\uffff\3\136\1\uffff\4\136\1\uffff\7\136\3\uffff\1\136\1\uffff"+
            "\1\136",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "265:1: atomExpression : ( KW_NULL -> TOK_NULL | dateLiteral | constant | function | castExpression | caseExpression | whenExpression | tableOrColumn | LPAREN ! expression RPAREN !| intervalOrIntervalProp | intervalDistance );";
        }
    }
    static final String DFA34_eotS =
        "\105\uffff";
    static final String DFA34_eofS =
        "\1\2\104\uffff";
    static final String DFA34_minS =
        "\1\4\1\32\103\uffff";
    static final String DFA34_maxS =
        "\1\u012e\1\u011b\103\uffff";
    static final String DFA34_acceptS =
        "\2\uffff\1\2\100\uffff\2\1";
    static final String DFA34_specialS =
        "\105\uffff}>";
    static final String[] DFA34_transitionS = {
            "\3\2\3\uffff\1\2\3\uffff\2\2\1\uffff\1\1\2\uffff\2\2\1\uffff"+
            "\2\2\1\uffff\2\2\1\uffff\1\2\1\uffff\21\2\2\uffff\1\2\1\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\6\2\1\uffff\3\2\1\uffff\2\2\1\uffff"+
            "\16\2\2\uffff\2\2\1\uffff\4\2\1\uffff\2\2\1\uffff\1\2\1\uffff"+
            "\3\2\1\uffff\7\2\1\uffff\5\2\1\uffff\7\2\1\uffff\14\2\2\uffff"+
            "\10\2\2\uffff\12\2\1\uffff\4\2\1\uffff\7\2\1\uffff\13\2\1\uffff"+
            "\5\2\3\uffff\2\2\1\uffff\55\2\1\uffff\2\2\1\uffff\11\2\1\uffff"+
            "\4\2\1\uffff\3\2\1\uffff\4\2\1\uffff\7\2\1\uffff\5\2\2\uffff"+
            "\2\2\1\uffff\1\2\1\uffff\3\2\1\uffff\1\2\2\uffff\2\2\2\uffff"+
            "\1\2",
            "\1\103\1\104\1\uffff\1\104\1\uffff\2\104\1\uffff\16\104\2\uffff"+
            "\1\104\1\uffff\3\104\1\uffff\1\104\1\uffff\4\104\1\uffff\1\104"+
            "\1\uffff\1\104\1\uffff\1\104\1\uffff\2\104\1\uffff\16\104\2"+
            "\uffff\2\104\1\uffff\2\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\1\104\1\uffff\3\104\1\uffff\7\104\1\uffff\3\104\1\uffff\1\104"+
            "\1\uffff\4\104\1\uffff\2\104\1\uffff\14\104\2\uffff\3\104\1"+
            "\uffff\4\104\2\uffff\12\104\2\uffff\3\104\1\uffff\2\104\1\uffff"+
            "\4\104\1\uffff\1\104\1\uffff\6\104\2\uffff\1\104\1\uffff\5\104"+
            "\3\uffff\2\104\1\uffff\12\104\1\uffff\16\104\1\uffff\23\104"+
            "\1\uffff\2\104\1\uffff\4\104\1\uffff\4\104\1\uffff\4\104\1\uffff"+
            "\3\104\1\uffff\4\104\1\uffff\7\104\3\uffff\1\104\1\uffff\1\104",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "282:32: (prop= DOT identifier )?";
        }
    }
    static final String DFA37_eotS =
        "\103\uffff";
    static final String DFA37_eofS =
        "\1\1\102\uffff";
    static final String DFA37_minS =
        "\1\4\102\uffff";
    static final String DFA37_maxS =
        "\1\u012e\102\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\3\77\uffff\1\1\1\2";
    static final String DFA37_specialS =
        "\103\uffff}>";
    static final String[] DFA37_transitionS = {
            "\3\1\3\uffff\1\1\3\uffff\2\1\1\uffff\1\102\2\uffff\2\1\1\uffff"+
            "\2\1\1\uffff\2\1\1\uffff\1\1\1\uffff\21\1\2\uffff\1\1\1\uffff"+
            "\3\1\1\uffff\1\1\1\uffff\6\1\1\uffff\3\1\1\uffff\2\1\1\uffff"+
            "\16\1\2\uffff\2\1\1\uffff\4\1\1\uffff\2\1\1\uffff\1\1\1\uffff"+
            "\3\1\1\uffff\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff\14\1\2\uffff"+
            "\10\1\2\uffff\12\1\1\uffff\4\1\1\uffff\7\1\1\uffff\13\1\1\uffff"+
            "\5\1\3\uffff\2\1\1\uffff\55\1\1\uffff\2\1\1\uffff\11\1\1\uffff"+
            "\4\1\1\uffff\3\1\1\uffff\4\1\1\uffff\7\1\1\uffff\5\1\2\uffff"+
            "\2\1\1\uffff\1\101\1\uffff\3\1\1\uffff\1\1\2\uffff\2\1\2\uffff"+
            "\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "()* loopback of 322:20: ( ( LSQUARE ^ expression RSQUARE !) | ( DOT ^ identifier ) )*";
        }
    }
    static final String DFA40_eotS =
        "\140\uffff";
    static final String DFA40_eofS =
        "\2\2\136\uffff";
    static final String DFA40_minS =
        "\1\4\1\12\136\uffff";
    static final String DFA40_maxS =
        "\1\u012e\1\u012a\136\uffff";
    static final String DFA40_acceptS =
        "\2\uffff\1\2\110\uffff\1\1\24\uffff";
    static final String DFA40_specialS =
        "\140\uffff}>";
    static final String[] DFA40_transitionS = {
            "\3\2\3\uffff\1\2\3\uffff\2\2\4\uffff\2\2\1\uffff\2\2\1\uffff"+
            "\2\2\1\uffff\1\2\1\uffff\21\2\2\uffff\1\2\1\uffff\3\2\1\uffff"+
            "\1\2\1\uffff\6\2\1\uffff\3\2\1\uffff\2\2\1\uffff\16\2\2\uffff"+
            "\2\2\1\uffff\4\2\1\uffff\2\2\1\uffff\1\2\1\uffff\3\2\1\uffff"+
            "\7\2\1\uffff\5\2\1\uffff\7\2\1\uffff\14\2\2\uffff\1\2\1\1\6"+
            "\2\2\uffff\12\2\1\uffff\4\2\1\uffff\7\2\1\uffff\13\2\1\uffff"+
            "\5\2\3\uffff\2\2\1\uffff\55\2\1\uffff\2\2\1\uffff\11\2\1\uffff"+
            "\4\2\1\uffff\3\2\1\uffff\4\2\1\uffff\7\2\1\uffff\5\2\2\uffff"+
            "\2\2\3\uffff\3\2\1\uffff\1\2\2\uffff\2\2\2\uffff\1\2",
            "\1\2\21\uffff\2\2\10\uffff\1\2\14\uffff\2\2\13\uffff\1\2\27"+
            "\uffff\1\2\1\uffff\1\2\31\uffff\1\2\4\uffff\1\2\1\uffff\1\2"+
            "\14\uffff\1\2\12\uffff\1\2\4\uffff\1\2\11\uffff\1\2\6\uffff"+
            "\1\113\1\uffff\1\113\6\uffff\1\2\16\uffff\1\2\16\uffff\1\2\16"+
            "\uffff\1\2\13\uffff\1\2\7\uffff\1\2\23\uffff\1\2\6\uffff\1\2"+
            "\11\uffff\1\2\1\uffff\1\2\1\uffff\1\2\15\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "342:39: (a= KW_IS nullCondition )?";
        }
    }
    static final String DFA41_eotS =
        "\101\uffff";
    static final String DFA41_eofS =
        "\1\1\100\uffff";
    static final String DFA41_minS =
        "\1\4\100\uffff";
    static final String DFA41_maxS =
        "\1\u012e\100\uffff";
    static final String DFA41_acceptS =
        "\1\uffff\1\2\76\uffff\1\1";
    static final String DFA41_specialS =
        "\101\uffff}>";
    static final String[] DFA41_transitionS = {
            "\2\1\1\100\3\uffff\1\1\3\uffff\2\1\4\uffff\2\1\1\uffff\2\1\1"+
            "\uffff\2\1\1\uffff\1\1\1\uffff\21\1\2\uffff\1\1\1\uffff\3\1"+
            "\1\uffff\1\1\1\uffff\6\1\1\uffff\3\1\1\uffff\2\1\1\uffff\16"+
            "\1\2\uffff\2\1\1\uffff\4\1\1\uffff\2\1\1\uffff\1\1\1\uffff\3"+
            "\1\1\uffff\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff\14\1\2\uffff"+
            "\10\1\2\uffff\12\1\1\uffff\4\1\1\uffff\7\1\1\uffff\13\1\1\uffff"+
            "\5\1\3\uffff\2\1\1\uffff\55\1\1\uffff\2\1\1\uffff\11\1\1\uffff"+
            "\4\1\1\uffff\3\1\1\uffff\4\1\1\uffff\7\1\1\uffff\5\1\2\uffff"+
            "\2\1\3\uffff\3\1\1\uffff\1\1\2\uffff\2\1\2\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "()* loopback of 355:37: ( precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression )*";
        }
    }
    static final String DFA42_eotS =
        "\100\uffff";
    static final String DFA42_eofS =
        "\1\1\77\uffff";
    static final String DFA42_minS =
        "\1\4\77\uffff";
    static final String DFA42_maxS =
        "\1\u012e\77\uffff";
    static final String DFA42_acceptS =
        "\1\uffff\1\2\75\uffff\1\1";
    static final String DFA42_specialS =
        "\100\uffff}>";
    static final String[] DFA42_transitionS = {
            "\2\1\4\uffff\1\1\3\uffff\2\77\4\uffff\2\1\1\uffff\2\1\1\uffff"+
            "\2\1\1\uffff\1\1\1\uffff\21\1\2\uffff\1\1\1\uffff\3\1\1\uffff"+
            "\1\1\1\uffff\6\1\1\uffff\3\1\1\uffff\2\1\1\uffff\16\1\2\uffff"+
            "\2\1\1\uffff\4\1\1\uffff\2\1\1\uffff\1\1\1\uffff\3\1\1\uffff"+
            "\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff\14\1\2\uffff\10\1\2\uffff"+
            "\12\1\1\uffff\4\1\1\uffff\7\1\1\uffff\13\1\1\uffff\5\1\3\uffff"+
            "\2\1\1\uffff\55\1\1\uffff\2\1\1\uffff\11\1\1\uffff\4\1\1\uffff"+
            "\3\1\1\uffff\4\1\1\uffff\7\1\1\uffff\5\1\2\uffff\2\1\3\uffff"+
            "\1\1\1\77\1\1\1\uffff\1\1\2\uffff\2\1\2\uffff\1\77",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "()* loopback of 366:36: ( precedenceStarOperator ^ precedenceBitwiseXorExpression )*";
        }
    }
    static final String DFA43_eotS =
        "\77\uffff";
    static final String DFA43_eofS =
        "\1\1\76\uffff";
    static final String DFA43_minS =
        "\1\4\76\uffff";
    static final String DFA43_maxS =
        "\1\u012b\76\uffff";
    static final String DFA43_acceptS =
        "\1\uffff\1\2\74\uffff\1\1";
    static final String DFA43_specialS =
        "\77\uffff}>";
    static final String[] DFA43_transitionS = {
            "\2\1\4\uffff\1\1\11\uffff\2\1\1\uffff\2\1\1\uffff\2\1\1\uffff"+
            "\1\1\1\uffff\21\1\2\uffff\1\1\1\uffff\3\1\1\uffff\1\1\1\uffff"+
            "\6\1\1\uffff\3\1\1\uffff\2\1\1\uffff\16\1\2\uffff\2\1\1\uffff"+
            "\4\1\1\uffff\2\1\1\uffff\1\1\1\uffff\3\1\1\uffff\7\1\1\uffff"+
            "\5\1\1\uffff\7\1\1\uffff\14\1\2\uffff\10\1\2\uffff\12\1\1\uffff"+
            "\4\1\1\uffff\7\1\1\uffff\13\1\1\uffff\5\1\3\uffff\2\1\1\uffff"+
            "\55\1\1\uffff\2\1\1\uffff\11\1\1\uffff\4\1\1\uffff\3\1\1\uffff"+
            "\4\1\1\uffff\7\1\1\uffff\5\1\2\uffff\2\1\3\uffff\1\76\1\uffff"+
            "\1\1\1\uffff\1\76\2\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "()* loopback of 377:30: ( precedencePlusOperator ^ precedenceStarExpression )*";
        }
    }
    static final String DFA44_eotS =
        "\76\uffff";
    static final String DFA44_eofS =
        "\1\1\75\uffff";
    static final String DFA44_minS =
        "\1\4\75\uffff";
    static final String DFA44_maxS =
        "\1\u012b\75\uffff";
    static final String DFA44_acceptS =
        "\1\uffff\1\2\73\uffff\1\1";
    static final String DFA44_specialS =
        "\76\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\75\1\1\4\uffff\1\1\11\uffff\2\1\1\uffff\2\1\1\uffff\2\1\1"+
            "\uffff\1\1\1\uffff\21\1\2\uffff\1\1\1\uffff\3\1\1\uffff\1\1"+
            "\1\uffff\6\1\1\uffff\3\1\1\uffff\2\1\1\uffff\16\1\2\uffff\2"+
            "\1\1\uffff\4\1\1\uffff\2\1\1\uffff\1\1\1\uffff\3\1\1\uffff\7"+
            "\1\1\uffff\5\1\1\uffff\7\1\1\uffff\14\1\2\uffff\10\1\2\uffff"+
            "\12\1\1\uffff\4\1\1\uffff\7\1\1\uffff\13\1\1\uffff\5\1\3\uffff"+
            "\2\1\1\uffff\55\1\1\uffff\2\1\1\uffff\11\1\1\uffff\4\1\1\uffff"+
            "\3\1\1\uffff\4\1\1\uffff\7\1\1\uffff\5\1\2\uffff\2\1\5\uffff"+
            "\1\1\4\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 388:30: ( precedenceAmpersandOperator ^ precedencePlusExpression )*";
        }
    }
    static final String DFA45_eotS =
        "\75\uffff";
    static final String DFA45_eofS =
        "\1\1\74\uffff";
    static final String DFA45_minS =
        "\1\5\74\uffff";
    static final String DFA45_maxS =
        "\1\u012b\74\uffff";
    static final String DFA45_acceptS =
        "\1\uffff\1\2\72\uffff\1\1";
    static final String DFA45_specialS =
        "\75\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\74\4\uffff\1\1\11\uffff\2\1\1\uffff\2\1\1\uffff\2\1\1\uffff"+
            "\1\1\1\uffff\21\1\2\uffff\1\1\1\uffff\3\1\1\uffff\1\1\1\uffff"+
            "\6\1\1\uffff\3\1\1\uffff\2\1\1\uffff\16\1\2\uffff\2\1\1\uffff"+
            "\4\1\1\uffff\2\1\1\uffff\1\1\1\uffff\3\1\1\uffff\7\1\1\uffff"+
            "\5\1\1\uffff\7\1\1\uffff\14\1\2\uffff\10\1\2\uffff\12\1\1\uffff"+
            "\4\1\1\uffff\7\1\1\uffff\13\1\1\uffff\5\1\3\uffff\2\1\1\uffff"+
            "\55\1\1\uffff\2\1\1\uffff\11\1\1\uffff\4\1\1\uffff\3\1\1\uffff"+
            "\4\1\1\uffff\7\1\1\uffff\5\1\2\uffff\2\1\5\uffff\1\1\4\uffff"+
            "\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "()* loopback of 399:35: ( precedenceBitwiseOrOperator ^ precedenceAmpersandExpression )*";
        }
    }
    static final String DFA48_eotS =
        "\u03ce\uffff";
    static final String DFA48_eofS =
        "\1\1\54\uffff\1\1\1\uffff\1\1\7\uffff\1\1\2\uffff\1\1\4\uffff\1"+
        "\60\1\uffff\1\60\1\uffff\4\60\1\uffff\2\60\1\uffff\1\60\u0382\uffff";
    static final String DFA48_minS =
        "\1\12\54\uffff\1\7\1\47\1\12\7\uffff\1\12\2\uffff\1\7\4\uffff\1"+
        "\4\1\uffff\1\4\1\uffff\4\4\1\uffff\2\4\1\uffff\1\4\1\uffff\1\7\120"+
        "\uffff\1\4\1\uffff\1\4\1\uffff\4\4\1\uffff\2\4\1\uffff\1\4\1\uffff"+
        "\1\7\u0321\uffff";
    static final String DFA48_maxS =
        "\1\u012b\54\uffff\1\u0132\1\u00d8\1\u012a\7\uffff\1\u012a\2\uffff"+
        "\1\u0132\4\uffff\1\u012e\1\uffff\1\u012e\1\uffff\4\u012e\1\uffff"+
        "\2\u012e\1\uffff\1\u012e\1\uffff\1\u0132\120\uffff\1\u012e\1\uffff"+
        "\1\u012e\1\uffff\4\u012e\1\uffff\2\u012e\1\uffff\1\u012e\1\uffff"+
        "\1\u0132\u0321\uffff";
    static final String DFA48_acceptS =
        "\1\uffff\1\7\56\uffff\1\2\66\uffff\1\3\1\5\1\1\60\uffff\1\4\23\uffff"+
        "\1\6\27\uffff\1\2\103\uffff\1\2\103\uffff\1\2\103\uffff\1\2\103"+
        "\uffff\1\2\103\uffff\1\2\u00cb\uffff\2\2\131\uffff\1\2\u0087\uffff"+
        "\1\6\4\uffff";
    static final String DFA48_specialS =
        "\u03ce\uffff}>";
    static final String[] DFA48_transitionS = {
            "\1\1\11\uffff\2\60\1\uffff\2\60\1\uffff\2\1\1\uffff\1\1\1\uffff"+
            "\10\1\1\72\10\1\2\uffff\1\1\1\uffff\3\1\1\uffff\1\1\1\uffff"+
            "\4\1\1\60\1\1\1\uffff\3\1\1\uffff\2\1\1\uffff\16\1\2\uffff\2"+
            "\1\1\uffff\4\1\1\uffff\2\1\1\uffff\1\1\1\uffff\3\1\1\uffff\7"+
            "\1\1\uffff\5\1\1\uffff\7\1\1\uffff\2\1\1\67\11\1\2\uffff\1\1"+
            "\1\57\6\1\2\uffff\1\55\11\1\1\uffff\4\1\1\uffff\2\1\1\56\4\1"+
            "\1\uffff\11\1\1\60\1\1\1\uffff\5\1\3\uffff\2\1\1\uffff\13\1"+
            "\1\55\6\1\1\55\32\1\1\uffff\2\1\1\uffff\11\1\1\uffff\4\1\1\uffff"+
            "\3\1\1\uffff\4\1\1\uffff\7\1\1\uffff\5\1\2\uffff\2\60\5\uffff"+
            "\1\60\4\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\60\2\uffff\1\1\2\uffff\1\60\4\uffff\1\60\7\uffff\2\60\1"+
            "\uffff\1\60\1\uffff\2\60\1\uffff\21\60\1\uffff\1\104\2\60\1"+
            "\uffff\1\60\1\uffff\4\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1"+
            "\60\1\uffff\2\60\1\uffff\17\60\1\uffff\1\105\1\60\1\uffff\2"+
            "\60\1\uffff\1\60\2\uffff\1\60\1\uffff\1\60\1\uffff\3\60\1\uffff"+
            "\7\60\1\uffff\3\60\1\1\1\60\1\uffff\2\60\1\101\1\60\1\1\14\60"+
            "\1\113\2\60\2\uffff\3\60\1\uffff\2\60\1\77\2\60\1\uffff\1\60"+
            "\1\110\10\60\1\uffff\1\115\3\60\1\uffff\2\60\1\uffff\4\60\1"+
            "\uffff\1\60\1\uffff\1\60\1\103\4\60\2\uffff\1\60\1\uffff\5\60"+
            "\3\uffff\2\60\1\uffff\12\60\1\1\16\60\1\1\13\60\1\106\7\60\1"+
            "\uffff\2\60\1\uffff\4\60\1\uffff\4\60\1\uffff\4\60\1\uffff\1"+
            "\60\1\111\1\60\1\uffff\4\60\1\uffff\7\60\2\uffff\1\1\1\60\1"+
            "\1\1\60\4\uffff\2\60\1\uffff\1\60\2\uffff\2\60\2\uffff\1\1\4"+
            "\uffff\4\60",
            "\1\150\131\uffff\1\147\25\uffff\1\151\71\uffff\1\151\6\uffff"+
            "\1\151",
            "\1\1\21\uffff\2\60\10\uffff\1\60\14\uffff\1\60\1\1\13\uffff"+
            "\1\60\27\uffff\1\1\1\uffff\1\60\31\uffff\1\1\4\uffff\1\1\1\uffff"+
            "\1\1\14\uffff\1\1\12\uffff\1\1\4\uffff\1\1\11\uffff\1\1\17\uffff"+
            "\1\1\16\uffff\1\60\16\uffff\1\1\16\uffff\1\1\13\uffff\1\1\7"+
            "\uffff\1\60\23\uffff\1\1\6\uffff\1\60\11\uffff\1\1\1\uffff\1"+
            "\1\1\uffff\1\60\15\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\1\51\uffff\1\1\43\uffff\1\1\33\uffff\1\1\4\uffff\1\1\1\uffff"+
            "\1\1\14\uffff\1\1\12\uffff\1\1\4\uffff\1\1\11\uffff\1\1\17\uffff"+
            "\1\1\35\uffff\1\1\16\uffff\1\1\13\uffff\1\1\33\uffff\1\1\20"+
            "\uffff\1\1\1\uffff\1\1\5\uffff\1\u009a\11\uffff\1\1",
            "",
            "",
            "\1\u00ae\2\uffff\1\1\2\uffff\1\u00ae\4\uffff\1\u00ae\7\uffff"+
            "\2\u00ae\1\uffff\1\u00ae\1\uffff\2\u00ae\1\uffff\21\u00ae\1"+
            "\uffff\1\u00a3\2\u00ae\1\uffff\1\u00ae\1\uffff\4\u00ae\1\uffff"+
            "\1\u00ae\1\uffff\1\u00ae\1\uffff\1\u00ae\1\uffff\2\u00ae\1\uffff"+
            "\17\u00ae\1\uffff\1\u00a4\1\u00ae\1\uffff\2\u00ae\1\uffff\1"+
            "\u00ae\2\uffff\1\u00ae\1\uffff\1\u00ae\1\uffff\3\u00ae\1\uffff"+
            "\7\u00ae\1\uffff\3\u00ae\1\1\1\u00ae\1\uffff\2\u00ae\1\u00a0"+
            "\1\u00ae\1\1\14\u00ae\1\u00aa\2\u00ae\2\uffff\3\u00ae\1\uffff"+
            "\2\u00ae\1\u009e\2\u00ae\1\uffff\1\u00ae\1\u00a7\10\u00ae\1"+
            "\uffff\1\u00ac\3\u00ae\1\uffff\2\u00ae\1\uffff\4\u00ae\1\uffff"+
            "\1\u00ae\1\uffff\1\u00ae\1\u00a2\4\u00ae\2\uffff\1\u00ae\1\uffff"+
            "\5\u00ae\3\uffff\2\u00ae\1\uffff\12\u00ae\1\1\16\u00ae\1\1\13"+
            "\u00ae\1\u00a5\7\u00ae\1\uffff\2\u00ae\1\uffff\4\u00ae\1\uffff"+
            "\4\u00ae\1\uffff\4\u00ae\1\uffff\1\u00ae\1\u00a8\1\u00ae\1\uffff"+
            "\4\u00ae\1\uffff\7\u00ae\2\uffff\1\1\1\u00ae\1\1\1\u00ae\4\uffff"+
            "\2\u00ae\1\uffff\1\u00ae\2\uffff\2\u00ae\2\uffff\1\1\4\uffff"+
            "\4\u00ae",
            "",
            "",
            "",
            "",
            "\3\60\3\uffff\1\60\3\uffff\2\60\1\uffff\1\60\2\uffff\2\60\1"+
            "\uffff\2\60\1\uffff\2\60\1\uffff\1\60\1\uffff\21\60\2\uffff"+
            "\1\60\1\uffff\3\60\1\uffff\1\60\1\uffff\6\60\1\uffff\3\60\1"+
            "\uffff\2\60\1\uffff\16\60\2\uffff\2\60\1\uffff\4\60\1\uffff"+
            "\2\60\1\uffff\1\60\1\uffff\3\60\1\uffff\7\60\1\uffff\5\60\1"+
            "\uffff\7\60\1\uffff\14\60\2\uffff\10\60\2\uffff\12\60\1\uffff"+
            "\4\60\1\uffff\7\60\1\uffff\13\60\1\uffff\5\60\3\uffff\2\60\1"+
            "\uffff\55\60\1\uffff\2\60\1\uffff\11\60\1\uffff\4\60\1\uffff"+
            "\3\60\1\uffff\4\60\1\uffff\6\60\1\u00c6\1\uffff\5\60\2\uffff"+
            "\4\60\1\uffff\3\60\1\uffff\1\60\2\uffff\2\60\2\uffff\1\60",
            "",
            "\3\60\3\uffff\1\60\3\uffff\2\60\1\uffff\1\60\2\uffff\2\60\1"+
            "\uffff\2\60\1\uffff\2\60\1\uffff\1\60\1\uffff\17\60\1\u010a"+
            "\1\60\2\uffff\1\60\1\uffff\3\60\1\uffff\1\60\1\uffff\6\60\1"+
            "\uffff\3\60\1\uffff\2\60\1\uffff\16\60\2\uffff\2\60\1\uffff"+
            "\4\60\1\uffff\2\60\1\uffff\1\60\1\uffff\3\60\1\uffff\7\60\1"+
            "\uffff\5\60\1\uffff\7\60\1\uffff\14\60\2\uffff\10\60\2\uffff"+
            "\12\60\1\uffff\4\60\1\uffff\7\60\1\uffff\13\60\1\uffff\5\60"+
            "\3\uffff\2\60\1\uffff\55\60\1\uffff\2\60\1\uffff\11\60\1\uffff"+
            "\4\60\1\uffff\3\60\1\uffff\4\60\1\uffff\7\60\1\uffff\5\60\2"+
            "\uffff\4\60\1\uffff\3\60\1\uffff\1\60\2\uffff\2\60\2\uffff\1"+
            "\60",
            "",
            "\3\60\3\uffff\1\60\3\uffff\2\60\1\uffff\1\60\2\uffff\2\60\1"+
            "\uffff\2\60\1\uffff\2\60\1\uffff\1\60\1\uffff\17\60\1\u014e"+
            "\1\60\2\uffff\1\60\1\uffff\3\60\1\uffff\1\60\1\uffff\6\60\1"+
            "\uffff\3\60\1\uffff\2\60\1\uffff\16\60\2\uffff\2\60\1\uffff"+
            "\4\60\1\uffff\2\60\1\uffff\1\60\1\uffff\3\60\1\uffff\7\60\1"+
            "\uffff\5\60\1\uffff\7\60\1\uffff\14\60\2\uffff\10\60\2\uffff"+
            "\12\60\1\uffff\4\60\1\uffff\7\60\1\uffff\13\60\1\uffff\5\60"+
            "\3\uffff\2\60\1\uffff\55\60\1\uffff\2\60\1\uffff\11\60\1\uffff"+
            "\4\60\1\uffff\3\60\1\uffff\4\60\1\uffff\7\60\1\uffff\5\60\2"+
            "\uffff\4\60\1\uffff\3\60\1\uffff\1\60\2\uffff\2\60\2\uffff\1"+
            "\60",
            "\3\60\3\uffff\1\60\3\uffff\2\60\1\uffff\1\60\2\uffff\2\60\1"+
            "\uffff\2\60\1\uffff\2\60\1\uffff\1\60\1\uffff\17\60\1\u0192"+
            "\1\60\2\uffff\1\60\1\uffff\3\60\1\uffff\1\60\1\uffff\6\60\1"+
            "\uffff\3\60\1\uffff\2\60\1\uffff\16\60\2\uffff\2\60\1\uffff"+
            "\4\60\1\uffff\2\60\1\uffff\1\60\1\uffff\3\60\1\uffff\7\60\1"+
            "\uffff\5\60\1\uffff\7\60\1\uffff\14\60\2\uffff\10\60\2\uffff"+
            "\12\60\1\uffff\4\60\1\uffff\7\60\1\uffff\13\60\1\uffff\5\60"+
            "\3\uffff\2\60\1\uffff\55\60\1\uffff\2\60\1\uffff\11\60\1\uffff"+
            "\4\60\1\uffff\3\60\1\uffff\4\60\1\uffff\7\60\1\uffff\5\60\2"+
            "\uffff\4\60\1\uffff\3\60\1\uffff\1\60\2\uffff\2\60\2\uffff\1"+
            "\60",
            "\3\60\3\uffff\1\60\3\uffff\2\60\1\uffff\1\60\2\uffff\2\60\1"+
            "\uffff\2\60\1\uffff\2\60\1\uffff\1\60\1\uffff\17\60\1\u01d6"+
            "\1\60\2\uffff\1\60\1\uffff\3\60\1\uffff\1\60\1\uffff\6\60\1"+
            "\uffff\3\60\1\uffff\2\60\1\uffff\16\60\2\uffff\2\60\1\uffff"+
            "\4\60\1\uffff\2\60\1\uffff\1\60\1\uffff\3\60\1\uffff\7\60\1"+
            "\uffff\5\60\1\uffff\7\60\1\uffff\14\60\2\uffff\10\60\2\uffff"+
            "\12\60\1\uffff\4\60\1\uffff\7\60\1\uffff\13\60\1\uffff\5\60"+
            "\3\uffff\2\60\1\uffff\55\60\1\uffff\2\60\1\uffff\11\60\1\uffff"+
            "\4\60\1\uffff\3\60\1\uffff\4\60\1\uffff\7\60\1\uffff\5\60\2"+
            "\uffff\4\60\1\uffff\3\60\1\uffff\1\60\2\uffff\2\60\2\uffff\1"+
            "\60",
            "\3\60\3\uffff\1\60\3\uffff\2\60\1\uffff\1\60\2\uffff\2\60\1"+
            "\uffff\2\60\1\uffff\2\60\1\uffff\1\60\1\uffff\17\60\1\u021a"+
            "\1\60\2\uffff\1\60\1\uffff\3\60\1\uffff\1\60\1\uffff\6\60\1"+
            "\uffff\3\60\1\uffff\2\60\1\uffff\16\60\2\uffff\2\60\1\uffff"+
            "\4\60\1\uffff\2\60\1\uffff\1\60\1\uffff\3\60\1\uffff\7\60\1"+
            "\uffff\5\60\1\uffff\7\60\1\uffff\14\60\2\uffff\10\60\2\uffff"+
            "\12\60\1\uffff\4\60\1\uffff\7\60\1\uffff\13\60\1\uffff\5\60"+
            "\3\uffff\2\60\1\uffff\55\60\1\uffff\2\60\1\uffff\11\60\1\uffff"+
            "\4\60\1\uffff\3\60\1\uffff\4\60\1\uffff\7\60\1\uffff\5\60\2"+
            "\uffff\4\60\1\uffff\3\60\1\uffff\1\60\2\uffff\2\60\2\uffff\1"+
            "\60",
            "",
            "\3\60\3\uffff\1\60\3\uffff\2\60\1\uffff\1\60\2\uffff\2\60\1"+
            "\uffff\2\60\1\uffff\2\60\1\uffff\1\60\1\uffff\21\60\2\uffff"+
            "\1\60\1\uffff\3\60\1\uffff\1\60\1\uffff\6\60\1\uffff\3\60\1"+
            "\uffff\2\60\1\uffff\16\60\2\uffff\2\60\1\uffff\4\60\1\uffff"+
            "\2\60\1\uffff\1\60\1\uffff\3\60\1\uffff\7\60\1\uffff\5\60\1"+
            "\uffff\7\60\1\uffff\14\60\2\uffff\10\60\2\uffff\12\60\1\uffff"+
            "\4\60\1\uffff\7\60\1\uffff\13\60\1\uffff\5\60\3\uffff\2\60\1"+
            "\uffff\55\60\1\uffff\2\60\1\uffff\11\60\1\uffff\4\60\1\uffff"+
            "\3\60\1\uffff\4\60\1\uffff\7\60\1\uffff\5\60\2\uffff\4\60\1"+
            "\uffff\3\60\1\1\1\60\2\uffff\2\60\2\uffff\1\60",
            "\3\60\3\uffff\1\60\3\uffff\2\60\1\uffff\1\60\2\uffff\2\60\1"+
            "\uffff\2\60\1\uffff\2\60\1\uffff\1\60\1\1\21\60\2\uffff\1\60"+
            "\1\uffff\3\60\1\uffff\1\60\1\uffff\6\60\1\uffff\3\60\1\uffff"+
            "\2\60\1\uffff\16\60\2\uffff\2\60\1\uffff\4\60\1\uffff\2\60\1"+
            "\uffff\1\60\1\uffff\3\60\1\uffff\7\60\1\uffff\5\60\1\uffff\7"+
            "\60\1\uffff\14\60\2\uffff\10\60\2\uffff\12\60\1\uffff\4\60\1"+
            "\uffff\7\60\1\uffff\13\60\1\uffff\5\60\3\uffff\2\60\1\uffff"+
            "\55\60\1\uffff\2\60\1\uffff\11\60\1\uffff\4\60\1\uffff\3\60"+
            "\1\uffff\4\60\1\uffff\7\60\1\uffff\5\60\2\uffff\4\60\1\uffff"+
            "\3\60\1\uffff\1\60\2\uffff\2\60\2\uffff\1\60",
            "",
            "\3\60\3\uffff\1\60\3\uffff\2\60\1\uffff\1\60\2\uffff\2\60\1"+
            "\uffff\2\60\1\uffff\2\60\1\uffff\1\60\1\uffff\21\60\2\uffff"+
            "\1\60\1\uffff\3\60\1\uffff\1\60\1\uffff\6\60\1\uffff\3\60\1"+
            "\uffff\2\60\1\uffff\16\60\2\uffff\2\60\1\uffff\4\60\1\uffff"+
            "\2\60\1\uffff\1\60\1\uffff\3\60\1\uffff\7\60\1\uffff\5\60\1"+
            "\uffff\7\60\1\uffff\14\60\2\uffff\1\u02e7\7\60\2\uffff\12\60"+
            "\1\uffff\4\60\1\uffff\7\60\1\uffff\12\60\1\u02e6\1\uffff\5\60"+
            "\3\uffff\2\60\1\uffff\55\60\1\uffff\2\60\1\uffff\11\60\1\uffff"+
            "\4\60\1\uffff\3\60\1\uffff\4\60\1\uffff\7\60\1\uffff\5\60\2"+
            "\uffff\4\60\1\uffff\3\60\1\uffff\1\60\2\uffff\2\60\2\uffff\1"+
            "\60",
            "",
            "\1\1\5\uffff\1\1\4\uffff\1\1\7\uffff\2\1\1\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\21\1\1\uffff\3\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
            "\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\2\1\1\uffff\17\1\1\uffff"+
            "\2\1\1\uffff\2\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\3\1\1\uffff\7\1\1\uffff\3\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
            "\17\1\2\uffff\3\1\1\uffff\5\1\1\uffff\12\1\1\uffff\4\1\1\uffff"+
            "\7\1\1\uffff\1\1\1\uffff\6\1\2\uffff\1\1\1\uffff\5\1\3\uffff"+
            "\2\1\1\uffff\12\1\1\uffff\16\1\1\uffff\23\1\1\uffff\2\1\1\uffff"+
            "\4\1\1\uffff\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\4\1\1\uffff"+
            "\7\1\3\uffff\1\1\1\uffff\1\1\4\uffff\1\u0341\1\1\1\uffff\1\1"+
            "\2\uffff\2\1\6\uffff\5\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\u00ae\7\uffff\2\u00ae\1\uffff\1\u00ae\17\uffff\1\u00ae\154"+
            "\uffff\1\u00ae\u0086\uffff\1\1\12\uffff\2\u00ae\1\uffff\2\u00ae"+
            "\2\uffff\1\u00ae\6\uffff\1\u00ae",
            "",
            "\3\u00ae\7\uffff\2\u00ae\1\uffff\1\u00ae\17\uffff\1\u00ae\14"+
            "\uffff\1\1\137\uffff\1\u00ae\u0091\uffff\2\u00ae\1\uffff\2\u00ae"+
            "\2\uffff\1\u00ae\6\uffff\1\u00ae",
            "",
            "\3\u00ae\7\uffff\2\u00ae\1\uffff\1\u00ae\17\uffff\1\u00ae\14"+
            "\uffff\1\1\137\uffff\1\u00ae\u0091\uffff\2\u00ae\1\uffff\2\u00ae"+
            "\2\uffff\1\u00ae\6\uffff\1\u00ae",
            "\3\u00ae\7\uffff\2\u00ae\1\uffff\1\u00ae\17\uffff\1\u00ae\14"+
            "\uffff\1\1\137\uffff\1\u00ae\u0091\uffff\2\u00ae\1\uffff\2\u00ae"+
            "\2\uffff\1\u00ae\6\uffff\1\u00ae",
            "\3\u00ae\7\uffff\2\u00ae\1\uffff\1\u00ae\17\uffff\1\u00ae\14"+
            "\uffff\1\1\137\uffff\1\u00ae\u0091\uffff\2\u00ae\1\uffff\2\u00ae"+
            "\2\uffff\1\u00ae\6\uffff\1\u00ae",
            "\3\u00ae\7\uffff\2\u00ae\1\uffff\1\u00ae\17\uffff\1\u00ae\14"+
            "\uffff\1\1\137\uffff\1\u00ae\u0091\uffff\2\u00ae\1\uffff\2\u00ae"+
            "\2\uffff\1\u00ae\6\uffff\1\u00ae",
            "",
            "\3\u00ae\7\uffff\2\u00ae\1\uffff\1\u00ae\17\uffff\1\u00ae\154"+
            "\uffff\1\u00ae\u0091\uffff\2\u00ae\1\uffff\2\u00ae\1\uffff\1"+
            "\1\1\u00ae\6\uffff\1\u00ae",
            "\3\u00ae\7\uffff\2\u00ae\1\uffff\1\u00ae\14\uffff\1\1\2\uffff"+
            "\1\u00ae\154\uffff\1\u00ae\u0091\uffff\2\u00ae\1\uffff\2\u00ae"+
            "\2\uffff\1\u00ae\6\uffff\1\u00ae",
            "",
            "\3\u00ae\7\uffff\2\u00ae\1\uffff\1\u00ae\17\uffff\1\u00ae\153"+
            "\uffff\1\1\1\u00ae\52\uffff\1\1\146\uffff\2\u00ae\1\uffff\2"+
            "\u00ae\2\uffff\1\u00ae\6\uffff\1\u00ae",
            "",
            "\1\1\5\uffff\1\1\4\uffff\1\1\7\uffff\2\1\1\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\21\1\1\uffff\3\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
            "\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\2\1\1\uffff\17\1\1\uffff"+
            "\2\1\1\uffff\2\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\3\1\1\uffff\7\1\1\uffff\3\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
            "\17\1\2\uffff\3\1\1\uffff\5\1\1\uffff\12\1\1\uffff\4\1\1\uffff"+
            "\7\1\1\uffff\1\1\1\uffff\6\1\2\uffff\1\1\1\uffff\5\1\3\uffff"+
            "\2\1\1\uffff\12\1\1\uffff\16\1\1\uffff\23\1\1\uffff\2\1\1\uffff"+
            "\4\1\1\uffff\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\4\1\1\uffff"+
            "\7\1\3\uffff\1\1\1\uffff\1\1\4\uffff\1\u03c9\1\1\1\uffff\1\1"+
            "\2\uffff\2\1\6\uffff\5\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "()* loopback of 435:5: ( ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression ) -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) ) | ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression ) -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr) | ( KW_NOT KW_IN expressions ) -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) ) | ( KW_IN expressions ) -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) | ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max) | ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max) )*";
        }
    }
 

    public static final BitSet FOLLOW_KW_GROUP_in_groupByClause72 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KW_BY_in_groupByClause74 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_groupByExpression_in_groupByClause80 = new BitSet(new long[]{0x0000000000000402L,0x0400000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_COMMA_in_groupByClause88 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_groupByExpression_in_groupByClause90 = new BitSet(new long[]{0x0000000000000402L,0x0400000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_KW_WITH_in_groupByClause103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_KW_ROLLUP_in_groupByClause105 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_KW_WITH_in_groupByClause113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_KW_CUBE_in_groupByClause115 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_KW_GROUPING_in_groupByClause128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_KW_SETS_in_groupByClause130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_groupByClause137 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_groupingSetExpression_in_groupByClause139 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_COMMA_in_groupByClause143 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_groupingSetExpression_in_groupByClause145 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_groupByClause150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupByExpression_in_groupingSetExpression244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_groupingSetExpression265 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_groupByExpression_in_groupingSetExpression271 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_COMMA_in_groupingSetExpression274 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_groupByExpression_in_groupingSetExpression276 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_groupingSetExpression283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_groupingSetExpression305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_groupingSetExpression310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_groupByExpression350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_HAVING_in_havingClause381 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_havingCondition_in_havingClause383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_havingCondition422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ORDER_in_orderByClause454 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KW_BY_in_orderByClause456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_orderByClause462 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_columnRefOrder_in_orderByClause464 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_COMMA_in_orderByClause472 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_columnRefOrder_in_orderByClause474 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_orderByClause478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ORDER_in_orderByClause499 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KW_BY_in_orderByClause501 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_columnRefOrder_in_orderByClause507 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_orderByClause515 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_columnRefOrder_in_orderByClause517 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_KW_CLUSTER_in_clusterByClause559 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KW_BY_in_clusterByClause561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_clusterByClause567 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_clusterByClause569 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_COMMA_in_clusterByClause572 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_clusterByClause574 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_clusterByClause578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CLUSTER_in_clusterByClause599 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KW_BY_in_clusterByClause601 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_clusterByClause607 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_clusterByClause619 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_clusterByClause621 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_KW_PARTITION_in_partitionByClause665 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KW_BY_in_partitionByClause667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_partitionByClause673 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_partitionByClause675 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_COMMA_in_partitionByClause678 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_partitionByClause680 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_partitionByClause684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_PARTITION_in_partitionByClause705 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KW_BY_in_partitionByClause707 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_partitionByClause713 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_partitionByClause721 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_partitionByClause723 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_KW_DISTRIBUTE_in_distributeByClause765 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KW_BY_in_distributeByClause767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_distributeByClause773 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_distributeByClause775 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_COMMA_in_distributeByClause778 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_distributeByClause780 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_distributeByClause784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DISTRIBUTE_in_distributeByClause805 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KW_BY_in_distributeByClause807 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_distributeByClause813 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_distributeByClause821 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_distributeByClause823 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_KW_SORT_in_sortByClause865 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KW_BY_in_sortByClause867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_sortByClause873 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_columnRefOrder_in_sortByClause875 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_COMMA_in_sortByClause883 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_columnRefOrder_in_sortByClause885 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_sortByClause889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SORT_in_sortByClause910 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_KW_BY_in_sortByClause912 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_columnRefOrder_in_sortByClause918 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_sortByClause931 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_columnRefOrder_in_sortByClause933 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_functionName_in_function976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_function982 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5BFFFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x0007C4CB0A3FBDDEL});
    public static final BitSet FOLLOW_STAR_in_function1003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_KW_DISTINCT_in_function1019 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x0007C4CB0A3FBDDEL});
    public static final BitSet FOLLOW_selectExpression_in_function1024 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_COMMA_in_function1027 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x0007C0CB0A3FBDDEL});
    public static final BitSet FOLLOW_selectExpression_in_function1029 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_function1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IF_in_functionName1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ARRAY_in_functionName1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_MAP_in_functionName1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STRUCT_in_functionName1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_UNIONTYPE_in_functionName1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_functionName1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CAST_in_castExpression1209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_castExpression1215 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_castExpression1227 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_KW_AS_in_castExpression1239 = new BitSet(new long[]{0x0000070000000000L,0x0000800002001600L,0x0000000000000200L,0x3002040000000000L});
    public static final BitSet FOLLOW_primitiveType_in_castExpression1251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_castExpression1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CASE_in_caseExpression1298 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_caseExpression1300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_KW_WHEN_in_caseExpression1307 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_caseExpression1309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_KW_THEN_in_caseExpression1311 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_caseExpression1313 = new BitSet(new long[]{0x0000000000000000L,0x0000000120000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_KW_ELSE_in_caseExpression1322 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_caseExpression1324 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_KW_END_in_caseExpression1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CASE_in_whenExpression1374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_KW_WHEN_in_whenExpression1383 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_whenExpression1385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_KW_THEN_in_whenExpression1387 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_whenExpression1389 = new BitSet(new long[]{0x0000000000000000L,0x0000000120000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_KW_ELSE_in_whenExpression1398 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_whenExpression1400 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_KW_END_in_whenExpression1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Number_in_constant1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateLiteral_in_constant1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_constant1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteralSequence_in_constant1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BigintLiteral_in_constant1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SmallintLiteral_in_constant1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TinyintLiteral_in_constant1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DecimalLiteral_in_constant1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_charSetStringLiteral_in_constant1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanValue_in_constant1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_stringLiteralSequence1543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_stringLiteralSequence1545 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_CharSetName_in_charSetStringLiteral1590 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CharSetLiteral_in_charSetStringLiteral1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DATE_in_dateLiteral1627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_dateLiteral1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceOrExpression_in_expression1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NULL_in_atomExpression1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateLiteral_in_atomExpression1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_atomExpression1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_atomExpression1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpression_in_atomExpression1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_caseExpression_in_atomExpression1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whenExpression_in_atomExpression1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableOrColumn_in_atomExpression1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atomExpression1757 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_atomExpression1760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_atomExpression1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intervalOrIntervalProp_in_atomExpression1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intervalDistance_in_atomExpression1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableOrColumn_in_intervalOrIntervalProp1794 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DOT_in_intervalOrIntervalProp1796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_KW_INTERVAL_in_intervalOrIntervalProp1798 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_DOT_in_intervalOrIntervalProp1803 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_identifier_in_intervalOrIntervalProp1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intervalConstant_in_intervalOrIntervalProp1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_LENGTH_in_intervalOrIntervalProp1839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_intervalOrIntervalProp1841 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_tableOrColumn_in_intervalOrIntervalProp1844 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DOT_in_intervalOrIntervalProp1846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_KW_INTERVAL_in_intervalOrIntervalProp1848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_intervalOrIntervalProp1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DISTANCE_in_intervalDistance1878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_intervalDistance1880 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000020A3FBDDEL});
    public static final BitSet FOLLOW_intervalOrIntervalProp_in_intervalDistance1882 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_intervalDistance1884 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000020A3FBDDEL});
    public static final BitSet FOLLOW_intervalOrIntervalProp_in_intervalDistance1886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_intervalDistance1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_intervalConstant1913 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_intervalCoor_in_intervalConstant1915 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_intervalConstant1917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_intervalSta_in_intervalConstant1919 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_intervalConstant1921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_intervalEnd_in_intervalConstant1923 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_COMMA_in_intervalConstant1926 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008800000000L});
    public static final BitSet FOLLOW_intervalStr_in_intervalConstant1928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RSQUARE_in_intervalConstant1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_intervalCoor1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Number_in_intervalSta1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Number_in_intervalEnd1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomExpression_in_precedenceFieldExpression2026 = new BitSet(new long[]{0x0000000000020002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_LSQUARE_in_precedenceFieldExpression2030 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_precedenceFieldExpression2033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RSQUARE_in_precedenceFieldExpression2035 = new BitSet(new long[]{0x0000000000020002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_DOT_in_precedenceFieldExpression2042 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_identifier_in_precedenceFieldExpression2045 = new BitSet(new long[]{0x0000000000020002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_KW_NULL_in_nullCondition2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NOT_in_nullCondition2112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_KW_NULL_in_nullCondition2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceUnaryOperator_in_precedenceUnaryPrefixExpression2142 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBDBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_precedenceFieldExpression_in_precedenceUnaryPrefixExpression2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceUnaryPrefixExpression_in_precedenceUnarySuffixExpression2164 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_KW_IS_in_precedenceUnarySuffixExpression2169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000A0000000000L});
    public static final BitSet FOLLOW_nullCondition_in_precedenceUnarySuffixExpression2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BITWISEXOR_in_precedenceBitwiseXorOperator2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceUnarySuffixExpression_in_precedenceBitwiseXorExpression2240 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_precedenceBitwiseXorOperator_in_precedenceBitwiseXorExpression2243 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBDBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_precedenceUnarySuffixExpression_in_precedenceBitwiseXorExpression2246 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_precedenceBitwiseXorExpression_in_precedenceStarExpression2303 = new BitSet(new long[]{0x000000000000C002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000401000000000L});
    public static final BitSet FOLLOW_precedenceStarOperator_in_precedenceStarExpression2306 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBDBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_precedenceBitwiseXorExpression_in_precedenceStarExpression2309 = new BitSet(new long[]{0x000000000000C002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000401000000000L});
    public static final BitSet FOLLOW_precedenceStarExpression_in_precedencePlusExpression2358 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008800000000L});
    public static final BitSet FOLLOW_precedencePlusOperator_in_precedencePlusExpression2361 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBDBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_precedenceStarExpression_in_precedencePlusExpression2364 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008800000000L});
    public static final BitSet FOLLOW_AMPERSAND_in_precedenceAmpersandOperator2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedencePlusExpression_in_precedenceAmpersandExpression2409 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_precedenceAmpersandOperator_in_precedenceAmpersandExpression2412 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBDBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_precedencePlusExpression_in_precedenceAmpersandExpression2415 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_BITWISEOR_in_precedenceBitwiseOrOperator2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceAmpersandExpression_in_precedenceBitwiseOrExpression2460 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_precedenceBitwiseOrOperator_in_precedenceBitwiseOrExpression2463 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBDBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_precedenceAmpersandExpression_in_precedenceBitwiseOrExpression2466 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_precedenceEqualNegatableOperator_in_precedenceEqualOperator2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_precedenceEqualOperator2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_NS_in_precedenceEqualOperator2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEQUAL_in_precedenceEqualOperator2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESSTHANOREQUALTO_in_precedenceEqualOperator2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESSTHAN_in_precedenceEqualOperator2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATERTHANOREQUALTO_in_precedenceEqualOperator2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATERTHAN_in_precedenceEqualOperator2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_locationComparator_in_precedenceEqualOperator2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IS_in_locationComparator2576 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_KW_BEFORE_in_locationComparator2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IS_in_locationComparator2587 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_KW_AFTER_in_locationComparator2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IS_in_locationComparator2598 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_KW_ADJACENT_in_locationComparator2600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_KW_TO_in_locationComparator2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IS_in_locationComparator2611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KW_CORRESPONDING_in_locationComparator2613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_KW_TO_in_locationComparator2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_OVERLAPS_in_locationComparator2624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_KW_WITH_in_locationComparator2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONTAINS_in_locationComparator2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IS_in_locationComparator2644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_KW_WITHIN_in_locationComparator2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IS_in_locationComparator2655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KW_PREFIX_in_locationComparator2657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_KW_OF_in_locationComparator2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IS_in_locationComparator2668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_KW_SUFFIX_in_locationComparator2670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_KW_OF_in_locationComparator2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IS_in_locationComparator2681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_KW_UPSTREAM_in_locationComparator2683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_KW_OF_in_locationComparator2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IS_in_locationComparator2694 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_KW_DOWNSTREAM_in_locationComparator2696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_KW_OF_in_locationComparator2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IS_in_locationComparator2707 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_KW_CLOSEST_in_locationComparator2709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_KW_TO_in_locationComparator2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2737 = new BitSet(new long[]{0x4000008001B00002L,0x0000000000000000L,0x0100020000804002L,0x0000000001020000L,0x00000020C0000000L});
    public static final BitSet FOLLOW_KW_NOT_in_precedenceEqualExpression2759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L,0x0000000001020000L});
    public static final BitSet FOLLOW_precedenceEqualNegatableOperator_in_precedenceEqualExpression2761 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBDBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2765 = new BitSet(new long[]{0x4000008001B00002L,0x0000000000000000L,0x0100020000804002L,0x0000000001020000L,0x00000020C0000000L});
    public static final BitSet FOLLOW_precedenceEqualOperator_in_precedenceEqualExpression2798 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBDBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2802 = new BitSet(new long[]{0x4000008001B00002L,0x0000000000000000L,0x0100020000804002L,0x0000000001020000L,0x00000020C0000000L});
    public static final BitSet FOLLOW_KW_NOT_in_precedenceEqualExpression2831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IN_in_precedenceEqualExpression2833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_expressions_in_precedenceEqualExpression2835 = new BitSet(new long[]{0x4000008001B00002L,0x0000000000000000L,0x0100020000804002L,0x0000000001020000L,0x00000020C0000000L});
    public static final BitSet FOLLOW_KW_IN_in_precedenceEqualExpression2869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_expressions_in_precedenceEqualExpression2871 = new BitSet(new long[]{0x4000008001B00002L,0x0000000000000000L,0x0100020000804002L,0x0000000001020000L,0x00000020C0000000L});
    public static final BitSet FOLLOW_KW_NOT_in_precedenceEqualExpression2902 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_KW_BETWEEN_in_precedenceEqualExpression2904 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBDBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2909 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_KW_AND_in_precedenceEqualExpression2912 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBDBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2917 = new BitSet(new long[]{0x4000008001B00002L,0x0000000000000000L,0x0100020000804002L,0x0000000001020000L,0x00000020C0000000L});
    public static final BitSet FOLLOW_KW_BETWEEN_in_precedenceEqualExpression2957 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBDBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2962 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_KW_AND_in_precedenceEqualExpression2965 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBDBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2970 = new BitSet(new long[]{0x4000008001B00002L,0x0000000000000000L,0x0100020000804002L,0x0000000001020000L,0x00000020C0000000L});
    public static final BitSet FOLLOW_LPAREN_in_expressions3028 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_expressions3030 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_COMMA_in_expressions3033 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_expression_in_expressions3035 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_expressions3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NOT_in_precedenceNotOperator3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceNotOperator_in_precedenceNotExpression3087 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_precedenceEqualExpression_in_precedenceNotExpression3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_AND_in_precedenceAndOperator3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceNotExpression_in_precedenceAndExpression3135 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_precedenceAndOperator_in_precedenceAndExpression3138 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_precedenceNotExpression_in_precedenceAndExpression3141 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_KW_OR_in_precedenceOrOperator3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceAndExpression_in_precedenceOrExpression3186 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_precedenceOrOperator_in_precedenceOrExpression3189 = new BitSet(new long[]{0xBD77FFFDAC042080L,0xF7AEFEEA5B7FFF6AL,0xFA7EBFBDFFBEE7FFL,0xF7B7FFFF7FFEFFD8L,0x000780CB0A3FBDDEL});
    public static final BitSet FOLLOW_precedenceAndExpression_in_precedenceOrExpression3192 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_KW_TRUE_in_booleanValue3216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FALSE_in_booleanValue3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableName_in_tableOrPartition3241 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_partitionSpec_in_tableOrPartition3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_PARTITION_in_partitionSpec3275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_partitionSpec3282 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_partitionVal_in_partitionSpec3284 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_COMMA_in_partitionSpec3287 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_partitionVal_in_partitionSpec3290 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_partitionSpec3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_partitionVal3326 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_EQUAL_in_partitionVal3329 = new BitSet(new long[]{0x0000000000042080L,0x0000040000000200L,0x0000000000000000L,0x0000000000000000L,0x0005804000000004L});
    public static final BitSet FOLLOW_constant_in_partitionVal3331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_PARTITION_in_dropPartitionSpec3365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_dropPartitionSpec3372 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_dropPartitionVal_in_dropPartitionSpec3374 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_COMMA_in_dropPartitionSpec3377 = new BitSet(new long[]{0xBD74FFFDAC000000L,0xB7AEFEEA5B3FFF6AL,0xFA7EBDB9FF9EE7FFL,0xF7B7FFFF7FFEFFD8L,0x000000000A3FBDDEL});
    public static final BitSet FOLLOW_dropPartitionVal_in_dropPartitionSpec3380 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_dropPartitionSpec3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_dropPartitionVal3416 = new BitSet(new long[]{0x0000000001900000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000020C0000000L});
    public static final BitSet FOLLOW_dropPartitionOperator_in_dropPartitionVal3418 = new BitSet(new long[]{0x0000000000042080L,0x0000040000000200L,0x0000000000000000L,0x0000000000000000L,0x0005804000000004L});
    public static final BitSet FOLLOW_constant_in_dropPartitionVal3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sysFuncNames_in_descFuncNames3839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_descFuncNames3847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_descFuncNames3855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_identifier3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonReserved_in_identifier3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred1_IdentifiersParser616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred2_IdentifiersParser717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred3_IdentifiersParser817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred4_IdentifiersParser927 = new BitSet(new long[]{0x0000000000000002L});

}