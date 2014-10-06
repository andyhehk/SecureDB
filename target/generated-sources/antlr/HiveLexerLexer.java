// $ANTLR 3.0.1 /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g 2014-10-06 20:56:09

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

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
public class HiveLexerLexer extends Lexer {
    public static final int KW_ALTER=64;
    public static final int KW_EXCLUSIVE=189;
    public static final int KW_LIKE=11;
    public static final int KW_PARTITIONED=93;
    public static final int STAR=282;
    public static final int KW_JOIN=30;
    public static final int LSQUARE=268;
    public static final int KW_PLUS=170;
    public static final int MOD=283;
    public static final int KW_REPAIR=46;
    public static final int KW_ITEMS=106;
    public static final int KW_ROW=98;
    public static final int KW_FORMAT=100;
    public static final int KW_FIRST=67;
    public static final int KW_INNER=242;
    public static final int KW_CONCATENATE=217;
    public static final int KW_REVOKE=182;
    public static final int ByteLengthLiteral=303;
    public static final int KW_FLOAT=81;
    public static final int KW_GROUPING=235;
    public static final int KW_BOTH=200;
    public static final int KW_DROP=70;
    public static final int EOF=-1;
    public static final int TinyintLiteral=300;
    public static final int KW_EXPLAIN=139;
    public static final int KW_PERCENT=130;
    public static final int KW_ASC=14;
    public static final int EQUAL_NS=273;
    public static final int RPAREN=267;
    public static final int RegexComponent=295;
    public static final int KW_CASCADE=221;
    public static final int KW_DBPROPERTIES=149;
    public static final int KW_PARTITIONS=36;
    public static final int KW_ORCFILE=115;
    public static final int KW_RANGE=196;
    public static final int KW_THEN=159;
    public static final int KW_TABLE=37;
    public static final int DIVIDE=279;
    public static final int KW_OPTION=216;
    public static final int KW_SCHEMA=179;
    public static final int KW_HOLD_DDLTIME=164;
    public static final int KW_SHOW_DATABASE=218;
    public static final int KW_ENABLE=121;
    public static final int KW_DECIMAL=86;
    public static final int KW_CLOSEST=256;
    public static final int KW_ADD=132;
    public static final int KW_LATERAL=209;
    public static final int KW_NOSCAN=238;
    public static final int LCURLY=270;
    public static final int SEMICOLON=265;
    public static final int KW_COALESCE=254;
    public static final int KW_FILEFORMAT=111;
    public static final int KW_FETCH=172;
    public static final int KW_TRANSFORM=49;
    public static final int KW_DELETE=169;
    public static final int KW_MATERIALIZED=178;
    public static final int KW_OUTPUTDRIVER=119;
    public static final int KW_TBLPROPERTIES=153;
    public static final int KW_UNIQUEJOIN=28;
    public static final int WS=306;
    public static final int KW_SELECT=23;
    public static final int KW_REPLACE=133;
    public static final int KW_LOCK=185;
    public static final int KW_BUCKET=127;
    public static final int KW_LOAD=55;
    public static final int KW_GROUP=17;
    public static final int KW_TO=74;
    public static final int KW_BY=18;
    public static final int KW_UPSTREAM=252;
    public static final int KW_SEMI=208;
    public static final int KW_LOCAL=48;
    public static final int KW_CHANGE=65;
    public static final int KW_DISTRIBUTE=52;
    public static final int KW_NOT=10;
    public static final int KW_MORE=233;
    public static final int KW_ELSE=160;
    public static final int KW_UTC=166;
    public static final int KW_PRECEDING=229;
    public static final int KW_INPUTDRIVER=118;
    public static final int KW_INPATH=59;
    public static final int KW_OUT=128;
    public static final int KW_LINES=109;
    public static final int KW_AND=8;
    public static final int CharSetName=305;
    public static final int KW_BOOLEAN=76;
    public static final int KW_CLUSTERSTATUS=165;
    public static final int KW_INDEXES=41;
    public static final int KW_REGEXP=135;
    public static final int KW_DIRECTORY=47;
    public static final int HexDigit=292;
    public static final int KW_SHARED=188;
    public static final int KW_COMPUTE=213;
    public static final int LPAREN=266;
    public static final int KW_PARTITION=35;
    public static final int KW_SORT=53;
    public static final int KW_FROM=21;
    public static final int KW_DEFERRED=147;
    public static final int KW_PROJECT=260;
    public static final int GREATERTHANOREQUALTO=277;
    public static final int KW_REDUCE=92;
    public static final int KW_FORMATTED=141;
    public static final int KW_USE=215;
    public static final int KW_STRUCT=89;
    public static final int KW_CURRENT=231;
    public static final int KW_FOR=226;
    public static final int KW_TERMINATED=103;
    public static final int KW_READS=194;
    public static final int KW_SET=151;
    public static final int KW_IN=175;
    public static final int PLUS=280;
    public static final int KW_INPUTFORMAT=116;
    public static final int KW_SSL=183;
    public static final int KW_IS=60;
    public static final int KW_OUTER=27;
    public static final int KW_REBUILD=42;
    public static final int KW_EXTENDED=140;
    public static final int KW_IF=12;
    public static final int KW_DATABASES=177;
    public static final int KW_LOCATION=125;
    public static final int KW_ORDER=16;
    public static final int KW_MSCK=45;
    public static final int LESSTHAN=276;
    public static final int KW_ALL=7;
    public static final int KW_HAVING=19;
    public static final int KW_ROLE=241;
    public static final int KW_DELIMITED=101;
    public static final int KW_WHEN=158;
    public static final int KW_FUNCTIONS=43;
    public static final int KW_OVERLAPS=247;
    public static final int KW_EXCHANGE=243;
    public static final int AMPERSAND=285;
    public static final int KW_VIRTUALTRACK=261;
    public static final int KW_EXPORT=56;
    public static final int MINUS=281;
    public static final int KW_CUBE=224;
    public static final int KW_FIELDS=102;
    public static final int Tokens=308;
    public static final int KW_SEQUENCEFILE=112;
    public static final int BITWISEOR=287;
    public static final int KW_SERDEPROPERTIES=148;
    public static final int StringLiteral=296;
    public static final int COLON=263;
    public static final int KW_ANALYZE=197;
    public static final int SmallintLiteral=299;
    public static final int CharSetLiteral=297;
    public static final int KW_PROCEDURE=190;
    public static final int KW_INTERSECTJOIN=258;
    public static final int KW_CONTAINS=248;
    public static final int KW_CLUSTERED=94;
    public static final int KW_TABLESAMPLE=126;
    public static final int RCURLY=271;
    public static final int KW_TRUNCATE=237;
    public static final int KW_DISABLE=122;
    public static final int KW_PURGE=195;
    public static final int KW_COMMENT=75;
    public static final int KW_NO_DROP=124;
    public static final int KW_USING=50;
    public static final int KW_NULL=61;
    public static final int DIV=284;
    public static final int KW_WINDOW=227;
    public static final int KW_RECORDWRITER=207;
    public static final int KW_DATABASE=176;
    public static final int KW_SERDE=145;
    public static final int KW_TOUCH=210;
    public static final int KW_TINYINT=77;
    public static final int KW_INTERVAL=244;
    public static final int KW_DATETIME=84;
    public static final int KW_STRING=87;
    public static final int KW_WITHIN=249;
    public static final int KW_CROSS=202;
    public static final int KW_OUTPUTFORMAT=117;
    public static final int KW_COLLECTION=105;
    public static final int KW_LONG=168;
    public static final int KW_INSERT=25;
    public static final int BITWISEXOR=288;
    public static final int KW_DISTANCE=259;
    public static final int KW_OVER=234;
    public static final int KW_ROWS=99;
    public static final int KW_WHERE=20;
    public static final int Identifier=304;
    public static final int KW_EXISTS=13;
    public static final int NOTEQUAL=274;
    public static final int KW_LOCKS=186;
    public static final int KW_RLIKE=134;
    public static final int KW_UPDATE=219;
    public static final int KW_SCHEMAS=180;
    public static final int COMMENT=307;
    public static final int KW_PROTECTION=73;
    public static final int KW_OVERWRITE=26;
    public static final int KW_DISTINCT=24;
    public static final int KW_MACRO=138;
    public static final int GREATERTHAN=278;
    public static final int KW_CLUSTER=51;
    public static final int KW_PRESERVE=29;
    public static final int KW_READONLY=123;
    public static final int KW_FUNCTION=137;
    public static final int KW_ADJACENT=245;
    public static final int KW_ESCAPED=104;
    public static final int KW_LESS=232;
    public static final int KW_INT=79;
    public static final int KW_SMALLINT=78;
    public static final int KW_PRETTY=142;
    public static final int KW_SETS=236;
    public static final int KW_LOGICAL=144;
    public static final int KW_ARCHIVE=211;
    public static final int KW_TEXTFILE=113;
    public static final int KW_LENGTH=255;
    public static final int KW_RENAME=71;
    public static final int KW_LEFT=31;
    public static final int KW_KEYS=107;
    public static final int KW_IMPORT=57;
    public static final int KW_DEPENDENCY=143;
    public static final int KW_VIEW=174;
    public static final int KW_DOUBLE=82;
    public static final int KW_IGNORE=72;
    public static final int KW_SORTED=95;
    public static final int KW_ENC=4;
    public static final int KW_BINARY=201;
    public static final int KW_MAP=90;
    public static final int KW_ELEM_TYPE=156;
    public static final int KW_DOWNSTREAM=253;
    public static final int KW_END=161;
    public static final int KW_FULL=33;
    public static final int LESSTHANOREQUALTO=275;
    public static final int KW_TABLES=38;
    public static final int KW_ARRAY=88;
    public static final int KW_BUCKETS=97;
    public static final int Letter=291;
    public static final int KW_CURSOR=204;
    public static final int DOLLAR=290;
    public static final int KW_TIMESTAMP=85;
    public static final int KW_UTCTIMESTAMP=167;
    public static final int KW_READ=193;
    public static final int KW_CORRESPONDING=246;
    public static final int KW_COLUMNS=39;
    public static final int KW_UNLOCK=187;
    public static final int KW_UNIONTYPE=91;
    public static final int KW_DESCRIBE=69;
    public static final int KW_DESC=15;
    public static final int KW_RCFILE=114;
    public static final int Exponent=294;
    public static final int KW_CREATE=62;
    public static final int KW_MAPJOIN=162;
    public static final int KW_TRUE=5;
    public static final int KW_SUFFIX=251;
    public static final int KW_LIMIT=150;
    public static final int KW_WITH=146;
    public static final int KW_BIGINT=80;
    public static final int KW_MINUS=171;
    public static final int KW_PREFIX=250;
    public static final int KW_RIGHT=32;
    public static final int KW_GRANT=181;
    public static final int Number=301;
    public static final int KW_EXTERNAL=63;
    public static final int COMMA=264;
    public static final int KW_STATISTICS=214;
    public static final int KW_WHILE=192;
    public static final int KW_AFTER=68;
    public static final int EQUAL=272;
    public static final int KW_USER=240;
    public static final int KW_UNSET=152;
    public static final int TILDE=286;
    public static final int KW_UNARCHIVE=212;
    public static final int KW_RECORDREADER=206;
    public static final int KW_COLUMN=66;
    public static final int KW_INDEX=40;
    public static final int KW_OFFLINE=120;
    public static final int DOT=262;
    public static final int KW_UNDO=184;
    public static final int KW_STREAMTABLE=163;
    public static final int KW_UNBOUNDED=228;
    public static final int KW_RESTRICT=220;
    public static final int KW_FOLLOWING=230;
    public static final int KW_UNION=54;
    public static final int KW_TEMPORARY=136;
    public static final int KW_ROLLUP=223;
    public static final int KW_CAST=131;
    public static final int KW_FALSE=6;
    public static final int KW_DIRECTORIES=225;
    public static final int KW_IDXPROPERTIES=154;
    public static final int KW_INTERSECT=173;
    public static final int KW_TRIGGER=205;
    public static final int KW_CONTINUE=203;
    public static final int RSQUARE=269;
    public static final int Digit=293;
    public static final int KW_STORED=110;
    public static final int DecimalLiteral=302;
    public static final int KW_UNSIGNED=191;
    public static final int KW_CASE=157;
    public static final int KW_EXCLUSIVENESSJOIN=257;
    public static final int KW_DATA=58;
    public static final int KW_PARTIALSCAN=239;
    public static final int KW_SKEWED=222;
    public static final int KW_SHOW=44;
    public static final int BigintLiteral=298;
    public static final int KW_DATE=83;
    public static final int KW_INTO=96;
    public static final int QUESTION=289;
    public static final int KW_OR=9;
    public static final int KW_ON=34;
    public static final int KW_VALUE_TYPE=155;
    public static final int KW_AS=22;
    public static final int KW_BEFORE=198;
    public static final int KW_OF=129;
    public static final int KW_BETWEEN=199;
    public static final int KW_KEY_TYPE=108;
    public HiveLexerLexer() {;} 
    public HiveLexerLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "/Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g"; }

    // $ANTLR start KW_ENC
    public final void mKW_ENC() throws RecognitionException {
        try {
            int _type = KW_ENC;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:22:8: ( 'ENC' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:22:10: 'ENC'
            {
            match("ENC"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ENC

    // $ANTLR start KW_TRUE
    public final void mKW_TRUE() throws RecognitionException {
        try {
            int _type = KW_TRUE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:23:9: ( 'TRUE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:23:11: 'TRUE'
            {
            match("TRUE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TRUE

    // $ANTLR start KW_FALSE
    public final void mKW_FALSE() throws RecognitionException {
        try {
            int _type = KW_FALSE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:24:10: ( 'FALSE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:24:12: 'FALSE'
            {
            match("FALSE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FALSE

    // $ANTLR start KW_ALL
    public final void mKW_ALL() throws RecognitionException {
        try {
            int _type = KW_ALL;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:25:8: ( 'ALL' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:25:10: 'ALL'
            {
            match("ALL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ALL

    // $ANTLR start KW_AND
    public final void mKW_AND() throws RecognitionException {
        try {
            int _type = KW_AND;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:26:8: ( 'AND' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:26:10: 'AND'
            {
            match("AND"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_AND

    // $ANTLR start KW_OR
    public final void mKW_OR() throws RecognitionException {
        try {
            int _type = KW_OR;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:27:7: ( 'OR' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:27:9: 'OR'
            {
            match("OR"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_OR

    // $ANTLR start KW_NOT
    public final void mKW_NOT() throws RecognitionException {
        try {
            int _type = KW_NOT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:28:8: ( 'NOT' | '!' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='N') ) {
                alt1=1;
            }
            else if ( (LA1_0=='!') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("28:1: KW_NOT : ( 'NOT' | '!' );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:28:10: 'NOT'
                    {
                    match("NOT"); 


                    }
                    break;
                case 2 :
                    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:28:18: '!'
                    {
                    match('!'); 

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_NOT

    // $ANTLR start KW_LIKE
    public final void mKW_LIKE() throws RecognitionException {
        try {
            int _type = KW_LIKE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:29:9: ( 'LIKE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:29:11: 'LIKE'
            {
            match("LIKE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LIKE

    // $ANTLR start KW_IF
    public final void mKW_IF() throws RecognitionException {
        try {
            int _type = KW_IF;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:31:7: ( 'IF' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:31:9: 'IF'
            {
            match("IF"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_IF

    // $ANTLR start KW_EXISTS
    public final void mKW_EXISTS() throws RecognitionException {
        try {
            int _type = KW_EXISTS;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:32:11: ( 'EXISTS' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:32:13: 'EXISTS'
            {
            match("EXISTS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_EXISTS

    // $ANTLR start KW_ASC
    public final void mKW_ASC() throws RecognitionException {
        try {
            int _type = KW_ASC;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:34:8: ( 'ASC' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:34:10: 'ASC'
            {
            match("ASC"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ASC

    // $ANTLR start KW_DESC
    public final void mKW_DESC() throws RecognitionException {
        try {
            int _type = KW_DESC;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:35:9: ( 'DESC' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:35:11: 'DESC'
            {
            match("DESC"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DESC

    // $ANTLR start KW_ORDER
    public final void mKW_ORDER() throws RecognitionException {
        try {
            int _type = KW_ORDER;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:36:10: ( 'ORDER' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:36:12: 'ORDER'
            {
            match("ORDER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ORDER

    // $ANTLR start KW_GROUP
    public final void mKW_GROUP() throws RecognitionException {
        try {
            int _type = KW_GROUP;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:37:10: ( 'GROUP' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:37:12: 'GROUP'
            {
            match("GROUP"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_GROUP

    // $ANTLR start KW_BY
    public final void mKW_BY() throws RecognitionException {
        try {
            int _type = KW_BY;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:38:7: ( 'BY' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:38:9: 'BY'
            {
            match("BY"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_BY

    // $ANTLR start KW_HAVING
    public final void mKW_HAVING() throws RecognitionException {
        try {
            int _type = KW_HAVING;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:39:11: ( 'HAVING' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:39:13: 'HAVING'
            {
            match("HAVING"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_HAVING

    // $ANTLR start KW_WHERE
    public final void mKW_WHERE() throws RecognitionException {
        try {
            int _type = KW_WHERE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:40:10: ( 'WHERE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:40:12: 'WHERE'
            {
            match("WHERE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_WHERE

    // $ANTLR start KW_FROM
    public final void mKW_FROM() throws RecognitionException {
        try {
            int _type = KW_FROM;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:41:9: ( 'FROM' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:41:11: 'FROM'
            {
            match("FROM"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FROM

    // $ANTLR start KW_AS
    public final void mKW_AS() throws RecognitionException {
        try {
            int _type = KW_AS;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:42:7: ( 'AS' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:42:9: 'AS'
            {
            match("AS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_AS

    // $ANTLR start KW_SELECT
    public final void mKW_SELECT() throws RecognitionException {
        try {
            int _type = KW_SELECT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:43:11: ( 'SELECT' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:43:13: 'SELECT'
            {
            match("SELECT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SELECT

    // $ANTLR start KW_DISTINCT
    public final void mKW_DISTINCT() throws RecognitionException {
        try {
            int _type = KW_DISTINCT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:44:13: ( 'DISTINCT' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:44:15: 'DISTINCT'
            {
            match("DISTINCT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DISTINCT

    // $ANTLR start KW_INSERT
    public final void mKW_INSERT() throws RecognitionException {
        try {
            int _type = KW_INSERT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:45:11: ( 'INSERT' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:45:13: 'INSERT'
            {
            match("INSERT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INSERT

    // $ANTLR start KW_OVERWRITE
    public final void mKW_OVERWRITE() throws RecognitionException {
        try {
            int _type = KW_OVERWRITE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:46:14: ( 'OVERWRITE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:46:16: 'OVERWRITE'
            {
            match("OVERWRITE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_OVERWRITE

    // $ANTLR start KW_OUTER
    public final void mKW_OUTER() throws RecognitionException {
        try {
            int _type = KW_OUTER;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:47:10: ( 'OUTER' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:47:12: 'OUTER'
            {
            match("OUTER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_OUTER

    // $ANTLR start KW_UNIQUEJOIN
    public final void mKW_UNIQUEJOIN() throws RecognitionException {
        try {
            int _type = KW_UNIQUEJOIN;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:48:15: ( 'UNIQUEJOIN' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:48:17: 'UNIQUEJOIN'
            {
            match("UNIQUEJOIN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UNIQUEJOIN

    // $ANTLR start KW_PRESERVE
    public final void mKW_PRESERVE() throws RecognitionException {
        try {
            int _type = KW_PRESERVE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:49:13: ( 'PRESERVE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:49:15: 'PRESERVE'
            {
            match("PRESERVE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PRESERVE

    // $ANTLR start KW_JOIN
    public final void mKW_JOIN() throws RecognitionException {
        try {
            int _type = KW_JOIN;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:50:9: ( 'JOIN' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:50:11: 'JOIN'
            {
            match("JOIN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_JOIN

    // $ANTLR start KW_LEFT
    public final void mKW_LEFT() throws RecognitionException {
        try {
            int _type = KW_LEFT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:51:9: ( 'LEFT' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:51:11: 'LEFT'
            {
            match("LEFT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LEFT

    // $ANTLR start KW_RIGHT
    public final void mKW_RIGHT() throws RecognitionException {
        try {
            int _type = KW_RIGHT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:52:10: ( 'RIGHT' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:52:12: 'RIGHT'
            {
            match("RIGHT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_RIGHT

    // $ANTLR start KW_FULL
    public final void mKW_FULL() throws RecognitionException {
        try {
            int _type = KW_FULL;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:53:9: ( 'FULL' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:53:11: 'FULL'
            {
            match("FULL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FULL

    // $ANTLR start KW_ON
    public final void mKW_ON() throws RecognitionException {
        try {
            int _type = KW_ON;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:54:7: ( 'ON' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:54:9: 'ON'
            {
            match("ON"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ON

    // $ANTLR start KW_PARTITION
    public final void mKW_PARTITION() throws RecognitionException {
        try {
            int _type = KW_PARTITION;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:55:14: ( 'PARTITION' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:55:16: 'PARTITION'
            {
            match("PARTITION"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PARTITION

    // $ANTLR start KW_PARTITIONS
    public final void mKW_PARTITIONS() throws RecognitionException {
        try {
            int _type = KW_PARTITIONS;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:56:15: ( 'PARTITIONS' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:56:17: 'PARTITIONS'
            {
            match("PARTITIONS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PARTITIONS

    // $ANTLR start KW_TABLE
    public final void mKW_TABLE() throws RecognitionException {
        try {
            int _type = KW_TABLE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:57:9: ( 'TABLE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:57:11: 'TABLE'
            {
            match("TABLE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TABLE

    // $ANTLR start KW_TABLES
    public final void mKW_TABLES() throws RecognitionException {
        try {
            int _type = KW_TABLES;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:58:10: ( 'TABLES' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:58:12: 'TABLES'
            {
            match("TABLES"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TABLES

    // $ANTLR start KW_COLUMNS
    public final void mKW_COLUMNS() throws RecognitionException {
        try {
            int _type = KW_COLUMNS;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:59:11: ( 'COLUMNS' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:59:13: 'COLUMNS'
            {
            match("COLUMNS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_COLUMNS

    // $ANTLR start KW_INDEX
    public final void mKW_INDEX() throws RecognitionException {
        try {
            int _type = KW_INDEX;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:60:9: ( 'INDEX' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:60:11: 'INDEX'
            {
            match("INDEX"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INDEX

    // $ANTLR start KW_INDEXES
    public final void mKW_INDEXES() throws RecognitionException {
        try {
            int _type = KW_INDEXES;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:61:11: ( 'INDEXES' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:61:13: 'INDEXES'
            {
            match("INDEXES"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INDEXES

    // $ANTLR start KW_REBUILD
    public final void mKW_REBUILD() throws RecognitionException {
        try {
            int _type = KW_REBUILD;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:62:11: ( 'REBUILD' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:62:13: 'REBUILD'
            {
            match("REBUILD"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_REBUILD

    // $ANTLR start KW_FUNCTIONS
    public final void mKW_FUNCTIONS() throws RecognitionException {
        try {
            int _type = KW_FUNCTIONS;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:63:13: ( 'FUNCTIONS' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:63:15: 'FUNCTIONS'
            {
            match("FUNCTIONS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FUNCTIONS

    // $ANTLR start KW_SHOW
    public final void mKW_SHOW() throws RecognitionException {
        try {
            int _type = KW_SHOW;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:64:8: ( 'SHOW' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:64:10: 'SHOW'
            {
            match("SHOW"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SHOW

    // $ANTLR start KW_MSCK
    public final void mKW_MSCK() throws RecognitionException {
        try {
            int _type = KW_MSCK;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:65:8: ( 'MSCK' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:65:10: 'MSCK'
            {
            match("MSCK"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_MSCK

    // $ANTLR start KW_REPAIR
    public final void mKW_REPAIR() throws RecognitionException {
        try {
            int _type = KW_REPAIR;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:66:10: ( 'REPAIR' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:66:12: 'REPAIR'
            {
            match("REPAIR"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_REPAIR

    // $ANTLR start KW_DIRECTORY
    public final void mKW_DIRECTORY() throws RecognitionException {
        try {
            int _type = KW_DIRECTORY;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:67:13: ( 'DIRECTORY' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:67:15: 'DIRECTORY'
            {
            match("DIRECTORY"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DIRECTORY

    // $ANTLR start KW_LOCAL
    public final void mKW_LOCAL() throws RecognitionException {
        try {
            int _type = KW_LOCAL;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:68:9: ( 'LOCAL' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:68:11: 'LOCAL'
            {
            match("LOCAL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LOCAL

    // $ANTLR start KW_TRANSFORM
    public final void mKW_TRANSFORM() throws RecognitionException {
        try {
            int _type = KW_TRANSFORM;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:69:14: ( 'TRANSFORM' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:69:16: 'TRANSFORM'
            {
            match("TRANSFORM"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TRANSFORM

    // $ANTLR start KW_USING
    public final void mKW_USING() throws RecognitionException {
        try {
            int _type = KW_USING;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:70:9: ( 'USING' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:70:11: 'USING'
            {
            match("USING"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_USING

    // $ANTLR start KW_CLUSTER
    public final void mKW_CLUSTER() throws RecognitionException {
        try {
            int _type = KW_CLUSTER;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:71:11: ( 'CLUSTER' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:71:13: 'CLUSTER'
            {
            match("CLUSTER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CLUSTER

    // $ANTLR start KW_DISTRIBUTE
    public final void mKW_DISTRIBUTE() throws RecognitionException {
        try {
            int _type = KW_DISTRIBUTE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:72:14: ( 'DISTRIBUTE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:72:16: 'DISTRIBUTE'
            {
            match("DISTRIBUTE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DISTRIBUTE

    // $ANTLR start KW_SORT
    public final void mKW_SORT() throws RecognitionException {
        try {
            int _type = KW_SORT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:73:8: ( 'SORT' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:73:10: 'SORT'
            {
            match("SORT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SORT

    // $ANTLR start KW_UNION
    public final void mKW_UNION() throws RecognitionException {
        try {
            int _type = KW_UNION;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:74:9: ( 'UNION' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:74:11: 'UNION'
            {
            match("UNION"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UNION

    // $ANTLR start KW_LOAD
    public final void mKW_LOAD() throws RecognitionException {
        try {
            int _type = KW_LOAD;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:75:8: ( 'LOAD' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:75:10: 'LOAD'
            {
            match("LOAD"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LOAD

    // $ANTLR start KW_EXPORT
    public final void mKW_EXPORT() throws RecognitionException {
        try {
            int _type = KW_EXPORT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:76:10: ( 'EXPORT' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:76:12: 'EXPORT'
            {
            match("EXPORT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_EXPORT

    // $ANTLR start KW_IMPORT
    public final void mKW_IMPORT() throws RecognitionException {
        try {
            int _type = KW_IMPORT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:77:10: ( 'IMPORT' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:77:12: 'IMPORT'
            {
            match("IMPORT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_IMPORT

    // $ANTLR start KW_DATA
    public final void mKW_DATA() throws RecognitionException {
        try {
            int _type = KW_DATA;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:78:8: ( 'DATA' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:78:10: 'DATA'
            {
            match("DATA"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DATA

    // $ANTLR start KW_INPATH
    public final void mKW_INPATH() throws RecognitionException {
        try {
            int _type = KW_INPATH;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:79:10: ( 'INPATH' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:79:12: 'INPATH'
            {
            match("INPATH"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INPATH

    // $ANTLR start KW_IS
    public final void mKW_IS() throws RecognitionException {
        try {
            int _type = KW_IS;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:80:6: ( 'IS' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:80:8: 'IS'
            {
            match("IS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_IS

    // $ANTLR start KW_NULL
    public final void mKW_NULL() throws RecognitionException {
        try {
            int _type = KW_NULL;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:81:8: ( 'NULL' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:81:10: 'NULL'
            {
            match("NULL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_NULL

    // $ANTLR start KW_CREATE
    public final void mKW_CREATE() throws RecognitionException {
        try {
            int _type = KW_CREATE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:82:10: ( 'CREATE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:82:12: 'CREATE'
            {
            match("CREATE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CREATE

    // $ANTLR start KW_EXTERNAL
    public final void mKW_EXTERNAL() throws RecognitionException {
        try {
            int _type = KW_EXTERNAL;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:83:12: ( 'EXTERNAL' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:83:14: 'EXTERNAL'
            {
            match("EXTERNAL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_EXTERNAL

    // $ANTLR start KW_ALTER
    public final void mKW_ALTER() throws RecognitionException {
        try {
            int _type = KW_ALTER;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:84:9: ( 'ALTER' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:84:11: 'ALTER'
            {
            match("ALTER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ALTER

    // $ANTLR start KW_CHANGE
    public final void mKW_CHANGE() throws RecognitionException {
        try {
            int _type = KW_CHANGE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:85:10: ( 'CHANGE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:85:12: 'CHANGE'
            {
            match("CHANGE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CHANGE

    // $ANTLR start KW_COLUMN
    public final void mKW_COLUMN() throws RecognitionException {
        try {
            int _type = KW_COLUMN;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:86:10: ( 'COLUMN' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:86:12: 'COLUMN'
            {
            match("COLUMN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_COLUMN

    // $ANTLR start KW_FIRST
    public final void mKW_FIRST() throws RecognitionException {
        try {
            int _type = KW_FIRST;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:87:9: ( 'FIRST' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:87:11: 'FIRST'
            {
            match("FIRST"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FIRST

    // $ANTLR start KW_AFTER
    public final void mKW_AFTER() throws RecognitionException {
        try {
            int _type = KW_AFTER;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:88:9: ( 'AFTER' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:88:11: 'AFTER'
            {
            match("AFTER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_AFTER

    // $ANTLR start KW_DESCRIBE
    public final void mKW_DESCRIBE() throws RecognitionException {
        try {
            int _type = KW_DESCRIBE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:89:12: ( 'DESCRIBE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:89:14: 'DESCRIBE'
            {
            match("DESCRIBE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DESCRIBE

    // $ANTLR start KW_DROP
    public final void mKW_DROP() throws RecognitionException {
        try {
            int _type = KW_DROP;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:90:8: ( 'DROP' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:90:10: 'DROP'
            {
            match("DROP"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DROP

    // $ANTLR start KW_RENAME
    public final void mKW_RENAME() throws RecognitionException {
        try {
            int _type = KW_RENAME;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:91:10: ( 'RENAME' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:91:12: 'RENAME'
            {
            match("RENAME"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_RENAME

    // $ANTLR start KW_IGNORE
    public final void mKW_IGNORE() throws RecognitionException {
        try {
            int _type = KW_IGNORE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:92:10: ( 'IGNORE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:92:12: 'IGNORE'
            {
            match("IGNORE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_IGNORE

    // $ANTLR start KW_PROTECTION
    public final void mKW_PROTECTION() throws RecognitionException {
        try {
            int _type = KW_PROTECTION;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:93:14: ( 'PROTECTION' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:93:16: 'PROTECTION'
            {
            match("PROTECTION"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PROTECTION

    // $ANTLR start KW_TO
    public final void mKW_TO() throws RecognitionException {
        try {
            int _type = KW_TO;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:94:6: ( 'TO' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:94:8: 'TO'
            {
            match("TO"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TO

    // $ANTLR start KW_COMMENT
    public final void mKW_COMMENT() throws RecognitionException {
        try {
            int _type = KW_COMMENT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:95:11: ( 'COMMENT' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:95:13: 'COMMENT'
            {
            match("COMMENT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_COMMENT

    // $ANTLR start KW_BOOLEAN
    public final void mKW_BOOLEAN() throws RecognitionException {
        try {
            int _type = KW_BOOLEAN;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:96:11: ( 'BOOLEAN' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:96:13: 'BOOLEAN'
            {
            match("BOOLEAN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_BOOLEAN

    // $ANTLR start KW_TINYINT
    public final void mKW_TINYINT() throws RecognitionException {
        try {
            int _type = KW_TINYINT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:97:11: ( 'TINYINT' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:97:13: 'TINYINT'
            {
            match("TINYINT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TINYINT

    // $ANTLR start KW_SMALLINT
    public final void mKW_SMALLINT() throws RecognitionException {
        try {
            int _type = KW_SMALLINT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:98:12: ( 'SMALLINT' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:98:14: 'SMALLINT'
            {
            match("SMALLINT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SMALLINT

    // $ANTLR start KW_INT
    public final void mKW_INT() throws RecognitionException {
        try {
            int _type = KW_INT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:99:7: ( 'INT' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:99:9: 'INT'
            {
            match("INT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INT

    // $ANTLR start KW_BIGINT
    public final void mKW_BIGINT() throws RecognitionException {
        try {
            int _type = KW_BIGINT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:100:10: ( 'BIGINT' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:100:12: 'BIGINT'
            {
            match("BIGINT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_BIGINT

    // $ANTLR start KW_FLOAT
    public final void mKW_FLOAT() throws RecognitionException {
        try {
            int _type = KW_FLOAT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:101:9: ( 'FLOAT' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:101:11: 'FLOAT'
            {
            match("FLOAT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FLOAT

    // $ANTLR start KW_DOUBLE
    public final void mKW_DOUBLE() throws RecognitionException {
        try {
            int _type = KW_DOUBLE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:102:10: ( 'DOUBLE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:102:12: 'DOUBLE'
            {
            match("DOUBLE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DOUBLE

    // $ANTLR start KW_DATE
    public final void mKW_DATE() throws RecognitionException {
        try {
            int _type = KW_DATE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:103:8: ( 'DATE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:103:10: 'DATE'
            {
            match("DATE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DATE

    // $ANTLR start KW_DATETIME
    public final void mKW_DATETIME() throws RecognitionException {
        try {
            int _type = KW_DATETIME;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:104:12: ( 'DATETIME' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:104:14: 'DATETIME'
            {
            match("DATETIME"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DATETIME

    // $ANTLR start KW_TIMESTAMP
    public final void mKW_TIMESTAMP() throws RecognitionException {
        try {
            int _type = KW_TIMESTAMP;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:105:13: ( 'TIMESTAMP' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:105:15: 'TIMESTAMP'
            {
            match("TIMESTAMP"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TIMESTAMP

    // $ANTLR start KW_DECIMAL
    public final void mKW_DECIMAL() throws RecognitionException {
        try {
            int _type = KW_DECIMAL;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:106:11: ( 'DECIMAL' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:106:13: 'DECIMAL'
            {
            match("DECIMAL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DECIMAL

    // $ANTLR start KW_STRING
    public final void mKW_STRING() throws RecognitionException {
        try {
            int _type = KW_STRING;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:107:10: ( 'STRING' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:107:12: 'STRING'
            {
            match("STRING"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_STRING

    // $ANTLR start KW_ARRAY
    public final void mKW_ARRAY() throws RecognitionException {
        try {
            int _type = KW_ARRAY;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:108:9: ( 'ARRAY' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:108:11: 'ARRAY'
            {
            match("ARRAY"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ARRAY

    // $ANTLR start KW_STRUCT
    public final void mKW_STRUCT() throws RecognitionException {
        try {
            int _type = KW_STRUCT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:109:10: ( 'STRUCT' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:109:12: 'STRUCT'
            {
            match("STRUCT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_STRUCT

    // $ANTLR start KW_MAP
    public final void mKW_MAP() throws RecognitionException {
        try {
            int _type = KW_MAP;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:110:7: ( 'MAP' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:110:9: 'MAP'
            {
            match("MAP"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_MAP

    // $ANTLR start KW_UNIONTYPE
    public final void mKW_UNIONTYPE() throws RecognitionException {
        try {
            int _type = KW_UNIONTYPE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:111:13: ( 'UNIONTYPE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:111:15: 'UNIONTYPE'
            {
            match("UNIONTYPE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UNIONTYPE

    // $ANTLR start KW_REDUCE
    public final void mKW_REDUCE() throws RecognitionException {
        try {
            int _type = KW_REDUCE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:112:10: ( 'REDUCE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:112:12: 'REDUCE'
            {
            match("REDUCE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_REDUCE

    // $ANTLR start KW_PARTITIONED
    public final void mKW_PARTITIONED() throws RecognitionException {
        try {
            int _type = KW_PARTITIONED;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:113:15: ( 'PARTITIONED' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:113:17: 'PARTITIONED'
            {
            match("PARTITIONED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PARTITIONED

    // $ANTLR start KW_CLUSTERED
    public final void mKW_CLUSTERED() throws RecognitionException {
        try {
            int _type = KW_CLUSTERED;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:114:13: ( 'CLUSTERED' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:114:15: 'CLUSTERED'
            {
            match("CLUSTERED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CLUSTERED

    // $ANTLR start KW_SORTED
    public final void mKW_SORTED() throws RecognitionException {
        try {
            int _type = KW_SORTED;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:115:10: ( 'SORTED' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:115:12: 'SORTED'
            {
            match("SORTED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SORTED

    // $ANTLR start KW_INTO
    public final void mKW_INTO() throws RecognitionException {
        try {
            int _type = KW_INTO;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:116:8: ( 'INTO' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:116:10: 'INTO'
            {
            match("INTO"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INTO

    // $ANTLR start KW_BUCKETS
    public final void mKW_BUCKETS() throws RecognitionException {
        try {
            int _type = KW_BUCKETS;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:117:11: ( 'BUCKETS' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:117:13: 'BUCKETS'
            {
            match("BUCKETS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_BUCKETS

    // $ANTLR start KW_ROW
    public final void mKW_ROW() throws RecognitionException {
        try {
            int _type = KW_ROW;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:118:7: ( 'ROW' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:118:9: 'ROW'
            {
            match("ROW"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ROW

    // $ANTLR start KW_ROWS
    public final void mKW_ROWS() throws RecognitionException {
        try {
            int _type = KW_ROWS;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:119:8: ( 'ROWS' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:119:10: 'ROWS'
            {
            match("ROWS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ROWS

    // $ANTLR start KW_FORMAT
    public final void mKW_FORMAT() throws RecognitionException {
        try {
            int _type = KW_FORMAT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:120:10: ( 'FORMAT' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:120:12: 'FORMAT'
            {
            match("FORMAT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FORMAT

    // $ANTLR start KW_DELIMITED
    public final void mKW_DELIMITED() throws RecognitionException {
        try {
            int _type = KW_DELIMITED;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:121:13: ( 'DELIMITED' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:121:15: 'DELIMITED'
            {
            match("DELIMITED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DELIMITED

    // $ANTLR start KW_FIELDS
    public final void mKW_FIELDS() throws RecognitionException {
        try {
            int _type = KW_FIELDS;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:122:10: ( 'FIELDS' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:122:12: 'FIELDS'
            {
            match("FIELDS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FIELDS

    // $ANTLR start KW_TERMINATED
    public final void mKW_TERMINATED() throws RecognitionException {
        try {
            int _type = KW_TERMINATED;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:123:14: ( 'TERMINATED' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:123:16: 'TERMINATED'
            {
            match("TERMINATED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TERMINATED

    // $ANTLR start KW_ESCAPED
    public final void mKW_ESCAPED() throws RecognitionException {
        try {
            int _type = KW_ESCAPED;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:124:11: ( 'ESCAPED' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:124:13: 'ESCAPED'
            {
            match("ESCAPED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ESCAPED

    // $ANTLR start KW_COLLECTION
    public final void mKW_COLLECTION() throws RecognitionException {
        try {
            int _type = KW_COLLECTION;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:125:14: ( 'COLLECTION' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:125:16: 'COLLECTION'
            {
            match("COLLECTION"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_COLLECTION

    // $ANTLR start KW_ITEMS
    public final void mKW_ITEMS() throws RecognitionException {
        try {
            int _type = KW_ITEMS;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:126:9: ( 'ITEMS' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:126:11: 'ITEMS'
            {
            match("ITEMS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ITEMS

    // $ANTLR start KW_KEYS
    public final void mKW_KEYS() throws RecognitionException {
        try {
            int _type = KW_KEYS;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:127:8: ( 'KEYS' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:127:10: 'KEYS'
            {
            match("KEYS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_KEYS

    // $ANTLR start KW_KEY_TYPE
    public final void mKW_KEY_TYPE() throws RecognitionException {
        try {
            int _type = KW_KEY_TYPE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:128:12: ( '$KEY$' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:128:14: '$KEY$'
            {
            match("$KEY$"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_KEY_TYPE

    // $ANTLR start KW_LINES
    public final void mKW_LINES() throws RecognitionException {
        try {
            int _type = KW_LINES;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:129:9: ( 'LINES' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:129:11: 'LINES'
            {
            match("LINES"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LINES

    // $ANTLR start KW_STORED
    public final void mKW_STORED() throws RecognitionException {
        try {
            int _type = KW_STORED;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:130:10: ( 'STORED' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:130:12: 'STORED'
            {
            match("STORED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_STORED

    // $ANTLR start KW_FILEFORMAT
    public final void mKW_FILEFORMAT() throws RecognitionException {
        try {
            int _type = KW_FILEFORMAT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:131:14: ( 'FILEFORMAT' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:131:16: 'FILEFORMAT'
            {
            match("FILEFORMAT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FILEFORMAT

    // $ANTLR start KW_SEQUENCEFILE
    public final void mKW_SEQUENCEFILE() throws RecognitionException {
        try {
            int _type = KW_SEQUENCEFILE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:132:16: ( 'SEQUENCEFILE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:132:18: 'SEQUENCEFILE'
            {
            match("SEQUENCEFILE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SEQUENCEFILE

    // $ANTLR start KW_TEXTFILE
    public final void mKW_TEXTFILE() throws RecognitionException {
        try {
            int _type = KW_TEXTFILE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:133:12: ( 'TEXTFILE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:133:14: 'TEXTFILE'
            {
            match("TEXTFILE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TEXTFILE

    // $ANTLR start KW_RCFILE
    public final void mKW_RCFILE() throws RecognitionException {
        try {
            int _type = KW_RCFILE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:134:10: ( 'RCFILE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:134:12: 'RCFILE'
            {
            match("RCFILE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_RCFILE

    // $ANTLR start KW_ORCFILE
    public final void mKW_ORCFILE() throws RecognitionException {
        try {
            int _type = KW_ORCFILE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:135:11: ( 'ORC' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:135:13: 'ORC'
            {
            match("ORC"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ORCFILE

    // $ANTLR start KW_INPUTFORMAT
    public final void mKW_INPUTFORMAT() throws RecognitionException {
        try {
            int _type = KW_INPUTFORMAT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:136:15: ( 'INPUTFORMAT' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:136:17: 'INPUTFORMAT'
            {
            match("INPUTFORMAT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INPUTFORMAT

    // $ANTLR start KW_OUTPUTFORMAT
    public final void mKW_OUTPUTFORMAT() throws RecognitionException {
        try {
            int _type = KW_OUTPUTFORMAT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:137:16: ( 'OUTPUTFORMAT' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:137:18: 'OUTPUTFORMAT'
            {
            match("OUTPUTFORMAT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_OUTPUTFORMAT

    // $ANTLR start KW_INPUTDRIVER
    public final void mKW_INPUTDRIVER() throws RecognitionException {
        try {
            int _type = KW_INPUTDRIVER;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:138:15: ( 'INPUTDRIVER' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:138:17: 'INPUTDRIVER'
            {
            match("INPUTDRIVER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INPUTDRIVER

    // $ANTLR start KW_OUTPUTDRIVER
    public final void mKW_OUTPUTDRIVER() throws RecognitionException {
        try {
            int _type = KW_OUTPUTDRIVER;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:139:16: ( 'OUTPUTDRIVER' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:139:18: 'OUTPUTDRIVER'
            {
            match("OUTPUTDRIVER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_OUTPUTDRIVER

    // $ANTLR start KW_OFFLINE
    public final void mKW_OFFLINE() throws RecognitionException {
        try {
            int _type = KW_OFFLINE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:140:11: ( 'OFFLINE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:140:13: 'OFFLINE'
            {
            match("OFFLINE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_OFFLINE

    // $ANTLR start KW_ENABLE
    public final void mKW_ENABLE() throws RecognitionException {
        try {
            int _type = KW_ENABLE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:141:10: ( 'ENABLE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:141:12: 'ENABLE'
            {
            match("ENABLE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ENABLE

    // $ANTLR start KW_DISABLE
    public final void mKW_DISABLE() throws RecognitionException {
        try {
            int _type = KW_DISABLE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:142:11: ( 'DISABLE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:142:13: 'DISABLE'
            {
            match("DISABLE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DISABLE

    // $ANTLR start KW_READONLY
    public final void mKW_READONLY() throws RecognitionException {
        try {
            int _type = KW_READONLY;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:143:12: ( 'READONLY' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:143:14: 'READONLY'
            {
            match("READONLY"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_READONLY

    // $ANTLR start KW_NO_DROP
    public final void mKW_NO_DROP() throws RecognitionException {
        try {
            int _type = KW_NO_DROP;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:144:11: ( 'NO_DROP' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:144:13: 'NO_DROP'
            {
            match("NO_DROP"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_NO_DROP

    // $ANTLR start KW_LOCATION
    public final void mKW_LOCATION() throws RecognitionException {
        try {
            int _type = KW_LOCATION;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:145:12: ( 'LOCATION' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:145:14: 'LOCATION'
            {
            match("LOCATION"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LOCATION

    // $ANTLR start KW_TABLESAMPLE
    public final void mKW_TABLESAMPLE() throws RecognitionException {
        try {
            int _type = KW_TABLESAMPLE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:146:15: ( 'TABLESAMPLE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:146:17: 'TABLESAMPLE'
            {
            match("TABLESAMPLE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TABLESAMPLE

    // $ANTLR start KW_BUCKET
    public final void mKW_BUCKET() throws RecognitionException {
        try {
            int _type = KW_BUCKET;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:147:10: ( 'BUCKET' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:147:12: 'BUCKET'
            {
            match("BUCKET"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_BUCKET

    // $ANTLR start KW_OUT
    public final void mKW_OUT() throws RecognitionException {
        try {
            int _type = KW_OUT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:148:7: ( 'OUT' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:148:9: 'OUT'
            {
            match("OUT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_OUT

    // $ANTLR start KW_OF
    public final void mKW_OF() throws RecognitionException {
        try {
            int _type = KW_OF;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:149:6: ( 'OF' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:149:8: 'OF'
            {
            match("OF"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_OF

    // $ANTLR start KW_PERCENT
    public final void mKW_PERCENT() throws RecognitionException {
        try {
            int _type = KW_PERCENT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:150:11: ( 'PERCENT' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:150:13: 'PERCENT'
            {
            match("PERCENT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PERCENT

    // $ANTLR start KW_CAST
    public final void mKW_CAST() throws RecognitionException {
        try {
            int _type = KW_CAST;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:151:8: ( 'CAST' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:151:10: 'CAST'
            {
            match("CAST"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CAST

    // $ANTLR start KW_ADD
    public final void mKW_ADD() throws RecognitionException {
        try {
            int _type = KW_ADD;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:152:7: ( 'ADD' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:152:9: 'ADD'
            {
            match("ADD"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ADD

    // $ANTLR start KW_REPLACE
    public final void mKW_REPLACE() throws RecognitionException {
        try {
            int _type = KW_REPLACE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:153:11: ( 'REPLACE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:153:13: 'REPLACE'
            {
            match("REPLACE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_REPLACE

    // $ANTLR start KW_RLIKE
    public final void mKW_RLIKE() throws RecognitionException {
        try {
            int _type = KW_RLIKE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:154:9: ( 'RLIKE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:154:11: 'RLIKE'
            {
            match("RLIKE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_RLIKE

    // $ANTLR start KW_REGEXP
    public final void mKW_REGEXP() throws RecognitionException {
        try {
            int _type = KW_REGEXP;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:155:10: ( 'REGEXP' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:155:12: 'REGEXP'
            {
            match("REGEXP"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_REGEXP

    // $ANTLR start KW_TEMPORARY
    public final void mKW_TEMPORARY() throws RecognitionException {
        try {
            int _type = KW_TEMPORARY;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:156:13: ( 'TEMPORARY' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:156:15: 'TEMPORARY'
            {
            match("TEMPORARY"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TEMPORARY

    // $ANTLR start KW_FUNCTION
    public final void mKW_FUNCTION() throws RecognitionException {
        try {
            int _type = KW_FUNCTION;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:157:12: ( 'FUNCTION' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:157:14: 'FUNCTION'
            {
            match("FUNCTION"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FUNCTION

    // $ANTLR start KW_MACRO
    public final void mKW_MACRO() throws RecognitionException {
        try {
            int _type = KW_MACRO;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:158:9: ( 'MACRO' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:158:11: 'MACRO'
            {
            match("MACRO"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_MACRO

    // $ANTLR start KW_EXPLAIN
    public final void mKW_EXPLAIN() throws RecognitionException {
        try {
            int _type = KW_EXPLAIN;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:159:11: ( 'EXPLAIN' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:159:13: 'EXPLAIN'
            {
            match("EXPLAIN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_EXPLAIN

    // $ANTLR start KW_EXTENDED
    public final void mKW_EXTENDED() throws RecognitionException {
        try {
            int _type = KW_EXTENDED;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:160:12: ( 'EXTENDED' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:160:14: 'EXTENDED'
            {
            match("EXTENDED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_EXTENDED

    // $ANTLR start KW_FORMATTED
    public final void mKW_FORMATTED() throws RecognitionException {
        try {
            int _type = KW_FORMATTED;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:161:13: ( 'FORMATTED' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:161:15: 'FORMATTED'
            {
            match("FORMATTED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FORMATTED

    // $ANTLR start KW_PRETTY
    public final void mKW_PRETTY() throws RecognitionException {
        try {
            int _type = KW_PRETTY;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:162:10: ( 'PRETTY' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:162:12: 'PRETTY'
            {
            match("PRETTY"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PRETTY

    // $ANTLR start KW_DEPENDENCY
    public final void mKW_DEPENDENCY() throws RecognitionException {
        try {
            int _type = KW_DEPENDENCY;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:163:14: ( 'DEPENDENCY' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:163:16: 'DEPENDENCY'
            {
            match("DEPENDENCY"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DEPENDENCY

    // $ANTLR start KW_LOGICAL
    public final void mKW_LOGICAL() throws RecognitionException {
        try {
            int _type = KW_LOGICAL;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:164:11: ( 'LOGICAL' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:164:13: 'LOGICAL'
            {
            match("LOGICAL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LOGICAL

    // $ANTLR start KW_SERDE
    public final void mKW_SERDE() throws RecognitionException {
        try {
            int _type = KW_SERDE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:165:9: ( 'SERDE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:165:11: 'SERDE'
            {
            match("SERDE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SERDE

    // $ANTLR start KW_WITH
    public final void mKW_WITH() throws RecognitionException {
        try {
            int _type = KW_WITH;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:166:8: ( 'WITH' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:166:10: 'WITH'
            {
            match("WITH"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_WITH

    // $ANTLR start KW_DEFERRED
    public final void mKW_DEFERRED() throws RecognitionException {
        try {
            int _type = KW_DEFERRED;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:167:12: ( 'DEFERRED' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:167:14: 'DEFERRED'
            {
            match("DEFERRED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DEFERRED

    // $ANTLR start KW_SERDEPROPERTIES
    public final void mKW_SERDEPROPERTIES() throws RecognitionException {
        try {
            int _type = KW_SERDEPROPERTIES;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:168:19: ( 'SERDEPROPERTIES' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:168:21: 'SERDEPROPERTIES'
            {
            match("SERDEPROPERTIES"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SERDEPROPERTIES

    // $ANTLR start KW_DBPROPERTIES
    public final void mKW_DBPROPERTIES() throws RecognitionException {
        try {
            int _type = KW_DBPROPERTIES;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:169:16: ( 'DBPROPERTIES' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:169:18: 'DBPROPERTIES'
            {
            match("DBPROPERTIES"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DBPROPERTIES

    // $ANTLR start KW_LIMIT
    public final void mKW_LIMIT() throws RecognitionException {
        try {
            int _type = KW_LIMIT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:170:9: ( 'LIMIT' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:170:11: 'LIMIT'
            {
            match("LIMIT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LIMIT

    // $ANTLR start KW_SET
    public final void mKW_SET() throws RecognitionException {
        try {
            int _type = KW_SET;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:171:7: ( 'SET' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:171:9: 'SET'
            {
            match("SET"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SET

    // $ANTLR start KW_UNSET
    public final void mKW_UNSET() throws RecognitionException {
        try {
            int _type = KW_UNSET;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:172:9: ( 'UNSET' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:172:11: 'UNSET'
            {
            match("UNSET"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UNSET

    // $ANTLR start KW_TBLPROPERTIES
    public final void mKW_TBLPROPERTIES() throws RecognitionException {
        try {
            int _type = KW_TBLPROPERTIES;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:173:17: ( 'TBLPROPERTIES' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:173:19: 'TBLPROPERTIES'
            {
            match("TBLPROPERTIES"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TBLPROPERTIES

    // $ANTLR start KW_IDXPROPERTIES
    public final void mKW_IDXPROPERTIES() throws RecognitionException {
        try {
            int _type = KW_IDXPROPERTIES;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:174:17: ( 'IDXPROPERTIES' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:174:19: 'IDXPROPERTIES'
            {
            match("IDXPROPERTIES"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_IDXPROPERTIES

    // $ANTLR start KW_VALUE_TYPE
    public final void mKW_VALUE_TYPE() throws RecognitionException {
        try {
            int _type = KW_VALUE_TYPE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:175:14: ( '$VALUE$' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:175:16: '$VALUE$'
            {
            match("$VALUE$"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_VALUE_TYPE

    // $ANTLR start KW_ELEM_TYPE
    public final void mKW_ELEM_TYPE() throws RecognitionException {
        try {
            int _type = KW_ELEM_TYPE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:176:13: ( '$ELEM$' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:176:15: '$ELEM$'
            {
            match("$ELEM$"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ELEM_TYPE

    // $ANTLR start KW_CASE
    public final void mKW_CASE() throws RecognitionException {
        try {
            int _type = KW_CASE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:177:8: ( 'CASE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:177:10: 'CASE'
            {
            match("CASE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CASE

    // $ANTLR start KW_WHEN
    public final void mKW_WHEN() throws RecognitionException {
        try {
            int _type = KW_WHEN;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:178:8: ( 'WHEN' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:178:10: 'WHEN'
            {
            match("WHEN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_WHEN

    // $ANTLR start KW_THEN
    public final void mKW_THEN() throws RecognitionException {
        try {
            int _type = KW_THEN;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:179:8: ( 'THEN' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:179:10: 'THEN'
            {
            match("THEN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_THEN

    // $ANTLR start KW_ELSE
    public final void mKW_ELSE() throws RecognitionException {
        try {
            int _type = KW_ELSE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:180:8: ( 'ELSE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:180:10: 'ELSE'
            {
            match("ELSE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ELSE

    // $ANTLR start KW_END
    public final void mKW_END() throws RecognitionException {
        try {
            int _type = KW_END;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:181:7: ( 'END' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:181:9: 'END'
            {
            match("END"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_END

    // $ANTLR start KW_MAPJOIN
    public final void mKW_MAPJOIN() throws RecognitionException {
        try {
            int _type = KW_MAPJOIN;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:182:11: ( 'MAPJOIN' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:182:13: 'MAPJOIN'
            {
            match("MAPJOIN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_MAPJOIN

    // $ANTLR start KW_STREAMTABLE
    public final void mKW_STREAMTABLE() throws RecognitionException {
        try {
            int _type = KW_STREAMTABLE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:183:15: ( 'STREAMTABLE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:183:17: 'STREAMTABLE'
            {
            match("STREAMTABLE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_STREAMTABLE

    // $ANTLR start KW_HOLD_DDLTIME
    public final void mKW_HOLD_DDLTIME() throws RecognitionException {
        try {
            int _type = KW_HOLD_DDLTIME;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:184:16: ( 'HOLD_DDLTIME' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:184:18: 'HOLD_DDLTIME'
            {
            match("HOLD_DDLTIME"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_HOLD_DDLTIME

    // $ANTLR start KW_CLUSTERSTATUS
    public final void mKW_CLUSTERSTATUS() throws RecognitionException {
        try {
            int _type = KW_CLUSTERSTATUS;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:185:17: ( 'CLUSTERSTATUS' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:185:19: 'CLUSTERSTATUS'
            {
            match("CLUSTERSTATUS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CLUSTERSTATUS

    // $ANTLR start KW_UTC
    public final void mKW_UTC() throws RecognitionException {
        try {
            int _type = KW_UTC;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:186:7: ( 'UTC' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:186:9: 'UTC'
            {
            match("UTC"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UTC

    // $ANTLR start KW_UTCTIMESTAMP
    public final void mKW_UTCTIMESTAMP() throws RecognitionException {
        try {
            int _type = KW_UTCTIMESTAMP;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:187:16: ( 'UTC_TMESTAMP' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:187:18: 'UTC_TMESTAMP'
            {
            match("UTC_TMESTAMP"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UTCTIMESTAMP

    // $ANTLR start KW_LONG
    public final void mKW_LONG() throws RecognitionException {
        try {
            int _type = KW_LONG;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:188:8: ( 'LONG' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:188:10: 'LONG'
            {
            match("LONG"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LONG

    // $ANTLR start KW_DELETE
    public final void mKW_DELETE() throws RecognitionException {
        try {
            int _type = KW_DELETE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:189:10: ( 'DELETE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:189:12: 'DELETE'
            {
            match("DELETE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DELETE

    // $ANTLR start KW_PLUS
    public final void mKW_PLUS() throws RecognitionException {
        try {
            int _type = KW_PLUS;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:190:8: ( 'PLUS' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:190:10: 'PLUS'
            {
            match("PLUS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PLUS

    // $ANTLR start KW_MINUS
    public final void mKW_MINUS() throws RecognitionException {
        try {
            int _type = KW_MINUS;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:191:9: ( 'MINUS' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:191:11: 'MINUS'
            {
            match("MINUS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_MINUS

    // $ANTLR start KW_FETCH
    public final void mKW_FETCH() throws RecognitionException {
        try {
            int _type = KW_FETCH;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:192:9: ( 'FETCH' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:192:11: 'FETCH'
            {
            match("FETCH"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FETCH

    // $ANTLR start KW_INTERSECT
    public final void mKW_INTERSECT() throws RecognitionException {
        try {
            int _type = KW_INTERSECT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:193:13: ( 'INTERSECT' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:193:15: 'INTERSECT'
            {
            match("INTERSECT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INTERSECT

    // $ANTLR start KW_VIEW
    public final void mKW_VIEW() throws RecognitionException {
        try {
            int _type = KW_VIEW;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:194:8: ( 'VIEW' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:194:10: 'VIEW'
            {
            match("VIEW"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_VIEW

    // $ANTLR start KW_IN
    public final void mKW_IN() throws RecognitionException {
        try {
            int _type = KW_IN;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:195:6: ( 'IN' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:195:8: 'IN'
            {
            match("IN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_IN

    // $ANTLR start KW_DATABASE
    public final void mKW_DATABASE() throws RecognitionException {
        try {
            int _type = KW_DATABASE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:196:12: ( 'DATABASE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:196:14: 'DATABASE'
            {
            match("DATABASE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DATABASE

    // $ANTLR start KW_DATABASES
    public final void mKW_DATABASES() throws RecognitionException {
        try {
            int _type = KW_DATABASES;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:197:13: ( 'DATABASES' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:197:15: 'DATABASES'
            {
            match("DATABASES"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DATABASES

    // $ANTLR start KW_MATERIALIZED
    public final void mKW_MATERIALIZED() throws RecognitionException {
        try {
            int _type = KW_MATERIALIZED;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:198:16: ( 'MATERIALIZED' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:198:18: 'MATERIALIZED'
            {
            match("MATERIALIZED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_MATERIALIZED

    // $ANTLR start KW_SCHEMA
    public final void mKW_SCHEMA() throws RecognitionException {
        try {
            int _type = KW_SCHEMA;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:199:10: ( 'SCHEMA' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:199:12: 'SCHEMA'
            {
            match("SCHEMA"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SCHEMA

    // $ANTLR start KW_SCHEMAS
    public final void mKW_SCHEMAS() throws RecognitionException {
        try {
            int _type = KW_SCHEMAS;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:200:11: ( 'SCHEMAS' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:200:13: 'SCHEMAS'
            {
            match("SCHEMAS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SCHEMAS

    // $ANTLR start KW_GRANT
    public final void mKW_GRANT() throws RecognitionException {
        try {
            int _type = KW_GRANT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:201:9: ( 'GRANT' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:201:11: 'GRANT'
            {
            match("GRANT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_GRANT

    // $ANTLR start KW_REVOKE
    public final void mKW_REVOKE() throws RecognitionException {
        try {
            int _type = KW_REVOKE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:202:10: ( 'REVOKE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:202:12: 'REVOKE'
            {
            match("REVOKE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_REVOKE

    // $ANTLR start KW_SSL
    public final void mKW_SSL() throws RecognitionException {
        try {
            int _type = KW_SSL;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:203:7: ( 'SSL' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:203:9: 'SSL'
            {
            match("SSL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SSL

    // $ANTLR start KW_UNDO
    public final void mKW_UNDO() throws RecognitionException {
        try {
            int _type = KW_UNDO;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:204:8: ( 'UNDO' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:204:10: 'UNDO'
            {
            match("UNDO"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UNDO

    // $ANTLR start KW_LOCK
    public final void mKW_LOCK() throws RecognitionException {
        try {
            int _type = KW_LOCK;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:205:8: ( 'LOCK' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:205:10: 'LOCK'
            {
            match("LOCK"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LOCK

    // $ANTLR start KW_LOCKS
    public final void mKW_LOCKS() throws RecognitionException {
        try {
            int _type = KW_LOCKS;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:206:9: ( 'LOCKS' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:206:11: 'LOCKS'
            {
            match("LOCKS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LOCKS

    // $ANTLR start KW_UNLOCK
    public final void mKW_UNLOCK() throws RecognitionException {
        try {
            int _type = KW_UNLOCK;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:207:10: ( 'UNLOCK' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:207:12: 'UNLOCK'
            {
            match("UNLOCK"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UNLOCK

    // $ANTLR start KW_SHARED
    public final void mKW_SHARED() throws RecognitionException {
        try {
            int _type = KW_SHARED;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:208:10: ( 'SHARED' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:208:12: 'SHARED'
            {
            match("SHARED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SHARED

    // $ANTLR start KW_EXCLUSIVE
    public final void mKW_EXCLUSIVE() throws RecognitionException {
        try {
            int _type = KW_EXCLUSIVE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:209:13: ( 'EXCLUSIVE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:209:15: 'EXCLUSIVE'
            {
            match("EXCLUSIVE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_EXCLUSIVE

    // $ANTLR start KW_PROCEDURE
    public final void mKW_PROCEDURE() throws RecognitionException {
        try {
            int _type = KW_PROCEDURE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:210:13: ( 'PROCEDURE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:210:15: 'PROCEDURE'
            {
            match("PROCEDURE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PROCEDURE

    // $ANTLR start KW_UNSIGNED
    public final void mKW_UNSIGNED() throws RecognitionException {
        try {
            int _type = KW_UNSIGNED;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:211:12: ( 'UNSIGNED' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:211:14: 'UNSIGNED'
            {
            match("UNSIGNED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UNSIGNED

    // $ANTLR start KW_WHILE
    public final void mKW_WHILE() throws RecognitionException {
        try {
            int _type = KW_WHILE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:212:9: ( 'WHILE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:212:11: 'WHILE'
            {
            match("WHILE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_WHILE

    // $ANTLR start KW_READ
    public final void mKW_READ() throws RecognitionException {
        try {
            int _type = KW_READ;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:213:8: ( 'READ' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:213:10: 'READ'
            {
            match("READ"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_READ

    // $ANTLR start KW_READS
    public final void mKW_READS() throws RecognitionException {
        try {
            int _type = KW_READS;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:214:9: ( 'READS' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:214:11: 'READS'
            {
            match("READS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_READS

    // $ANTLR start KW_PURGE
    public final void mKW_PURGE() throws RecognitionException {
        try {
            int _type = KW_PURGE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:215:9: ( 'PURGE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:215:11: 'PURGE'
            {
            match("PURGE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PURGE

    // $ANTLR start KW_RANGE
    public final void mKW_RANGE() throws RecognitionException {
        try {
            int _type = KW_RANGE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:216:9: ( 'RANGE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:216:11: 'RANGE'
            {
            match("RANGE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_RANGE

    // $ANTLR start KW_ANALYZE
    public final void mKW_ANALYZE() throws RecognitionException {
        try {
            int _type = KW_ANALYZE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:217:11: ( 'ANALYZE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:217:13: 'ANALYZE'
            {
            match("ANALYZE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ANALYZE

    // $ANTLR start KW_BEFORE
    public final void mKW_BEFORE() throws RecognitionException {
        try {
            int _type = KW_BEFORE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:218:10: ( 'BEFORE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:218:12: 'BEFORE'
            {
            match("BEFORE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_BEFORE

    // $ANTLR start KW_BETWEEN
    public final void mKW_BETWEEN() throws RecognitionException {
        try {
            int _type = KW_BETWEEN;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:219:11: ( 'BETWEEN' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:219:13: 'BETWEEN'
            {
            match("BETWEEN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_BETWEEN

    // $ANTLR start KW_BOTH
    public final void mKW_BOTH() throws RecognitionException {
        try {
            int _type = KW_BOTH;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:220:8: ( 'BOTH' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:220:10: 'BOTH'
            {
            match("BOTH"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_BOTH

    // $ANTLR start KW_BINARY
    public final void mKW_BINARY() throws RecognitionException {
        try {
            int _type = KW_BINARY;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:221:10: ( 'BINARY' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:221:12: 'BINARY'
            {
            match("BINARY"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_BINARY

    // $ANTLR start KW_CROSS
    public final void mKW_CROSS() throws RecognitionException {
        try {
            int _type = KW_CROSS;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:222:9: ( 'CROSS' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:222:11: 'CROSS'
            {
            match("CROSS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CROSS

    // $ANTLR start KW_CONTINUE
    public final void mKW_CONTINUE() throws RecognitionException {
        try {
            int _type = KW_CONTINUE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:223:12: ( 'CONTINUE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:223:14: 'CONTINUE'
            {
            match("CONTINUE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CONTINUE

    // $ANTLR start KW_CURSOR
    public final void mKW_CURSOR() throws RecognitionException {
        try {
            int _type = KW_CURSOR;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:224:10: ( 'CURSOR' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:224:12: 'CURSOR'
            {
            match("CURSOR"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CURSOR

    // $ANTLR start KW_TRIGGER
    public final void mKW_TRIGGER() throws RecognitionException {
        try {
            int _type = KW_TRIGGER;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:225:11: ( 'TRIGGER' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:225:13: 'TRIGGER'
            {
            match("TRIGGER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TRIGGER

    // $ANTLR start KW_RECORDREADER
    public final void mKW_RECORDREADER() throws RecognitionException {
        try {
            int _type = KW_RECORDREADER;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:226:16: ( 'RECORDREADER' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:226:18: 'RECORDREADER'
            {
            match("RECORDREADER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_RECORDREADER

    // $ANTLR start KW_RECORDWRITER
    public final void mKW_RECORDWRITER() throws RecognitionException {
        try {
            int _type = KW_RECORDWRITER;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:227:16: ( 'RECORDWRITER' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:227:18: 'RECORDWRITER'
            {
            match("RECORDWRITER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_RECORDWRITER

    // $ANTLR start KW_SEMI
    public final void mKW_SEMI() throws RecognitionException {
        try {
            int _type = KW_SEMI;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:228:8: ( 'SEMI' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:228:10: 'SEMI'
            {
            match("SEMI"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SEMI

    // $ANTLR start KW_LATERAL
    public final void mKW_LATERAL() throws RecognitionException {
        try {
            int _type = KW_LATERAL;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:229:11: ( 'LATERAL' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:229:13: 'LATERAL'
            {
            match("LATERAL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LATERAL

    // $ANTLR start KW_TOUCH
    public final void mKW_TOUCH() throws RecognitionException {
        try {
            int _type = KW_TOUCH;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:230:9: ( 'TOUCH' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:230:11: 'TOUCH'
            {
            match("TOUCH"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TOUCH

    // $ANTLR start KW_ARCHIVE
    public final void mKW_ARCHIVE() throws RecognitionException {
        try {
            int _type = KW_ARCHIVE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:231:11: ( 'ARCHIVE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:231:13: 'ARCHIVE'
            {
            match("ARCHIVE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ARCHIVE

    // $ANTLR start KW_UNARCHIVE
    public final void mKW_UNARCHIVE() throws RecognitionException {
        try {
            int _type = KW_UNARCHIVE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:232:13: ( 'UNARCHIVE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:232:15: 'UNARCHIVE'
            {
            match("UNARCHIVE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UNARCHIVE

    // $ANTLR start KW_COMPUTE
    public final void mKW_COMPUTE() throws RecognitionException {
        try {
            int _type = KW_COMPUTE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:233:11: ( 'COMPUTE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:233:13: 'COMPUTE'
            {
            match("COMPUTE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_COMPUTE

    // $ANTLR start KW_STATISTICS
    public final void mKW_STATISTICS() throws RecognitionException {
        try {
            int _type = KW_STATISTICS;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:234:14: ( 'STATISTICS' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:234:16: 'STATISTICS'
            {
            match("STATISTICS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_STATISTICS

    // $ANTLR start KW_USE
    public final void mKW_USE() throws RecognitionException {
        try {
            int _type = KW_USE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:235:7: ( 'USE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:235:9: 'USE'
            {
            match("USE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_USE

    // $ANTLR start KW_OPTION
    public final void mKW_OPTION() throws RecognitionException {
        try {
            int _type = KW_OPTION;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:236:10: ( 'OPTION' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:236:12: 'OPTION'
            {
            match("OPTION"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_OPTION

    // $ANTLR start KW_CONCATENATE
    public final void mKW_CONCATENATE() throws RecognitionException {
        try {
            int _type = KW_CONCATENATE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:237:15: ( 'CONCATENATE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:237:17: 'CONCATENATE'
            {
            match("CONCATENATE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CONCATENATE

    // $ANTLR start KW_SHOW_DATABASE
    public final void mKW_SHOW_DATABASE() throws RecognitionException {
        try {
            int _type = KW_SHOW_DATABASE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:238:17: ( 'SHOW_DATABASE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:238:19: 'SHOW_DATABASE'
            {
            match("SHOW_DATABASE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SHOW_DATABASE

    // $ANTLR start KW_UPDATE
    public final void mKW_UPDATE() throws RecognitionException {
        try {
            int _type = KW_UPDATE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:239:10: ( 'UPDATE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:239:12: 'UPDATE'
            {
            match("UPDATE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UPDATE

    // $ANTLR start KW_RESTRICT
    public final void mKW_RESTRICT() throws RecognitionException {
        try {
            int _type = KW_RESTRICT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:240:12: ( 'RESTRICT' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:240:14: 'RESTRICT'
            {
            match("RESTRICT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_RESTRICT

    // $ANTLR start KW_CASCADE
    public final void mKW_CASCADE() throws RecognitionException {
        try {
            int _type = KW_CASCADE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:241:11: ( 'CASCADE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:241:13: 'CASCADE'
            {
            match("CASCADE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CASCADE

    // $ANTLR start KW_SKEWED
    public final void mKW_SKEWED() throws RecognitionException {
        try {
            int _type = KW_SKEWED;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:242:10: ( 'SKEWED' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:242:12: 'SKEWED'
            {
            match("SKEWED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SKEWED

    // $ANTLR start KW_ROLLUP
    public final void mKW_ROLLUP() throws RecognitionException {
        try {
            int _type = KW_ROLLUP;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:243:10: ( 'ROLLUP' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:243:12: 'ROLLUP'
            {
            match("ROLLUP"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ROLLUP

    // $ANTLR start KW_CUBE
    public final void mKW_CUBE() throws RecognitionException {
        try {
            int _type = KW_CUBE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:244:8: ( 'CUBE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:244:10: 'CUBE'
            {
            match("CUBE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CUBE

    // $ANTLR start KW_DIRECTORIES
    public final void mKW_DIRECTORIES() throws RecognitionException {
        try {
            int _type = KW_DIRECTORIES;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:245:15: ( 'DIRECTORIES' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:245:17: 'DIRECTORIES'
            {
            match("DIRECTORIES"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DIRECTORIES

    // $ANTLR start KW_FOR
    public final void mKW_FOR() throws RecognitionException {
        try {
            int _type = KW_FOR;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:246:7: ( 'FOR' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:246:9: 'FOR'
            {
            match("FOR"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FOR

    // $ANTLR start KW_WINDOW
    public final void mKW_WINDOW() throws RecognitionException {
        try {
            int _type = KW_WINDOW;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:247:10: ( 'WINDOW' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:247:12: 'WINDOW'
            {
            match("WINDOW"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_WINDOW

    // $ANTLR start KW_UNBOUNDED
    public final void mKW_UNBOUNDED() throws RecognitionException {
        try {
            int _type = KW_UNBOUNDED;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:248:13: ( 'UNBOUNDED' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:248:15: 'UNBOUNDED'
            {
            match("UNBOUNDED"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UNBOUNDED

    // $ANTLR start KW_PRECEDING
    public final void mKW_PRECEDING() throws RecognitionException {
        try {
            int _type = KW_PRECEDING;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:249:13: ( 'PRECEDING' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:249:15: 'PRECEDING'
            {
            match("PRECEDING"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PRECEDING

    // $ANTLR start KW_FOLLOWING
    public final void mKW_FOLLOWING() throws RecognitionException {
        try {
            int _type = KW_FOLLOWING;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:250:13: ( 'FOLLOWING' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:250:15: 'FOLLOWING'
            {
            match("FOLLOWING"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_FOLLOWING

    // $ANTLR start KW_CURRENT
    public final void mKW_CURRENT() throws RecognitionException {
        try {
            int _type = KW_CURRENT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:251:11: ( 'CURRENT' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:251:13: 'CURRENT'
            {
            match("CURRENT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CURRENT

    // $ANTLR start KW_LESS
    public final void mKW_LESS() throws RecognitionException {
        try {
            int _type = KW_LESS;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:252:8: ( 'LESS' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:252:10: 'LESS'
            {
            match("LESS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LESS

    // $ANTLR start KW_MORE
    public final void mKW_MORE() throws RecognitionException {
        try {
            int _type = KW_MORE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:253:8: ( 'MORE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:253:10: 'MORE'
            {
            match("MORE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_MORE

    // $ANTLR start KW_OVER
    public final void mKW_OVER() throws RecognitionException {
        try {
            int _type = KW_OVER;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:254:8: ( 'OVER' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:254:10: 'OVER'
            {
            match("OVER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_OVER

    // $ANTLR start KW_GROUPING
    public final void mKW_GROUPING() throws RecognitionException {
        try {
            int _type = KW_GROUPING;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:255:12: ( 'GROUPING' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:255:14: 'GROUPING'
            {
            match("GROUPING"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_GROUPING

    // $ANTLR start KW_SETS
    public final void mKW_SETS() throws RecognitionException {
        try {
            int _type = KW_SETS;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:256:8: ( 'SETS' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:256:10: 'SETS'
            {
            match("SETS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SETS

    // $ANTLR start KW_TRUNCATE
    public final void mKW_TRUNCATE() throws RecognitionException {
        try {
            int _type = KW_TRUNCATE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:257:12: ( 'TRUNCATE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:257:14: 'TRUNCATE'
            {
            match("TRUNCATE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_TRUNCATE

    // $ANTLR start KW_NOSCAN
    public final void mKW_NOSCAN() throws RecognitionException {
        try {
            int _type = KW_NOSCAN;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:258:10: ( 'NOSCAN' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:258:12: 'NOSCAN'
            {
            match("NOSCAN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_NOSCAN

    // $ANTLR start KW_PARTIALSCAN
    public final void mKW_PARTIALSCAN() throws RecognitionException {
        try {
            int _type = KW_PARTIALSCAN;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:259:15: ( 'PARTIALSCAN' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:259:17: 'PARTIALSCAN'
            {
            match("PARTIALSCAN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PARTIALSCAN

    // $ANTLR start KW_USER
    public final void mKW_USER() throws RecognitionException {
        try {
            int _type = KW_USER;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:260:8: ( 'USER' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:260:10: 'USER'
            {
            match("USER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_USER

    // $ANTLR start KW_ROLE
    public final void mKW_ROLE() throws RecognitionException {
        try {
            int _type = KW_ROLE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:261:8: ( 'ROLE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:261:10: 'ROLE'
            {
            match("ROLE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ROLE

    // $ANTLR start KW_INNER
    public final void mKW_INNER() throws RecognitionException {
        try {
            int _type = KW_INNER;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:262:9: ( 'INNER' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:262:11: 'INNER'
            {
            match("INNER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INNER

    // $ANTLR start KW_EXCHANGE
    public final void mKW_EXCHANGE() throws RecognitionException {
        try {
            int _type = KW_EXCHANGE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:263:12: ( 'EXCHANGE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:263:14: 'EXCHANGE'
            {
            match("EXCHANGE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_EXCHANGE

    // $ANTLR start KW_INTERVAL
    public final void mKW_INTERVAL() throws RecognitionException {
        try {
            int _type = KW_INTERVAL;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:266:12: ( 'INTERVAL' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:266:14: 'INTERVAL'
            {
            match("INTERVAL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INTERVAL

    // $ANTLR start KW_ADJACENT
    public final void mKW_ADJACENT() throws RecognitionException {
        try {
            int _type = KW_ADJACENT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:267:12: ( 'ADJACENT' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:267:14: 'ADJACENT'
            {
            match("ADJACENT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_ADJACENT

    // $ANTLR start KW_CORRESPONDING
    public final void mKW_CORRESPONDING() throws RecognitionException {
        try {
            int _type = KW_CORRESPONDING;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:268:17: ( 'CORRESPONDING' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:268:19: 'CORRESPONDING'
            {
            match("CORRESPONDING"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CORRESPONDING

    // $ANTLR start KW_OVERLAPS
    public final void mKW_OVERLAPS() throws RecognitionException {
        try {
            int _type = KW_OVERLAPS;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:269:12: ( 'OVERLAPS' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:269:14: 'OVERLAPS'
            {
            match("OVERLAPS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_OVERLAPS

    // $ANTLR start KW_CONTAINS
    public final void mKW_CONTAINS() throws RecognitionException {
        try {
            int _type = KW_CONTAINS;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:270:12: ( 'CONTAINS' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:270:14: 'CONTAINS'
            {
            match("CONTAINS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CONTAINS

    // $ANTLR start KW_WITHIN
    public final void mKW_WITHIN() throws RecognitionException {
        try {
            int _type = KW_WITHIN;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:271:10: ( 'WITHIN' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:271:12: 'WITHIN'
            {
            match("WITHIN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_WITHIN

    // $ANTLR start KW_PREFIX
    public final void mKW_PREFIX() throws RecognitionException {
        try {
            int _type = KW_PREFIX;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:272:10: ( 'PREFIX' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:272:12: 'PREFIX'
            {
            match("PREFIX"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PREFIX

    // $ANTLR start KW_SUFFIX
    public final void mKW_SUFFIX() throws RecognitionException {
        try {
            int _type = KW_SUFFIX;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:273:10: ( 'SUFFIX' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:273:12: 'SUFFIX'
            {
            match("SUFFIX"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_SUFFIX

    // $ANTLR start KW_UPSTREAM
    public final void mKW_UPSTREAM() throws RecognitionException {
        try {
            int _type = KW_UPSTREAM;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:274:12: ( 'UPSTREAM' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:274:14: 'UPSTREAM'
            {
            match("UPSTREAM"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_UPSTREAM

    // $ANTLR start KW_DOWNSTREAM
    public final void mKW_DOWNSTREAM() throws RecognitionException {
        try {
            int _type = KW_DOWNSTREAM;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:275:14: ( 'DOWNSTREAM' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:275:16: 'DOWNSTREAM'
            {
            match("DOWNSTREAM"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DOWNSTREAM

    // $ANTLR start KW_COALESCE
    public final void mKW_COALESCE() throws RecognitionException {
        try {
            int _type = KW_COALESCE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:276:12: ( 'COALESCE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:276:14: 'COALESCE'
            {
            match("COALESCE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_COALESCE

    // $ANTLR start KW_LENGTH
    public final void mKW_LENGTH() throws RecognitionException {
        try {
            int _type = KW_LENGTH;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:277:10: ( 'LENGTH' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:277:12: 'LENGTH'
            {
            match("LENGTH"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_LENGTH

    // $ANTLR start KW_CLOSEST
    public final void mKW_CLOSEST() throws RecognitionException {
        try {
            int _type = KW_CLOSEST;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:278:11: ( 'CLOSEST' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:278:13: 'CLOSEST'
            {
            match("CLOSEST"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_CLOSEST

    // $ANTLR start KW_EXCLUSIVENESSJOIN
    public final void mKW_EXCLUSIVENESSJOIN() throws RecognitionException {
        try {
            int _type = KW_EXCLUSIVENESSJOIN;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:279:21: ( 'EXCLUSIVENESSJOIN' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:279:23: 'EXCLUSIVENESSJOIN'
            {
            match("EXCLUSIVENESSJOIN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_EXCLUSIVENESSJOIN

    // $ANTLR start KW_INTERSECTJOIN
    public final void mKW_INTERSECTJOIN() throws RecognitionException {
        try {
            int _type = KW_INTERSECTJOIN;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:280:17: ( 'INTERSECTJOIN' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:280:19: 'INTERSECTJOIN'
            {
            match("INTERSECTJOIN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_INTERSECTJOIN

    // $ANTLR start KW_DISTANCE
    public final void mKW_DISTANCE() throws RecognitionException {
        try {
            int _type = KW_DISTANCE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:281:12: ( 'DISTANCE' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:281:14: 'DISTANCE'
            {
            match("DISTANCE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_DISTANCE

    // $ANTLR start KW_PROJECT
    public final void mKW_PROJECT() throws RecognitionException {
        try {
            int _type = KW_PROJECT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:287:11: ( 'PROJECT' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:287:13: 'PROJECT'
            {
            match("PROJECT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_PROJECT

    // $ANTLR start KW_VIRTUALTRACK
    public final void mKW_VIRTUALTRACK() throws RecognitionException {
        try {
            int _type = KW_VIRTUALTRACK;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:288:16: ( 'GENERATE BINS WITH LENGTH' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:288:18: 'GENERATE BINS WITH LENGTH'
            {
            match("GENERATE BINS WITH LENGTH"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KW_VIRTUALTRACK

    // $ANTLR start DOT
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:293:5: ( '.' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:293:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOT

    // $ANTLR start COLON
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:294:7: ( ':' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:294:9: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COLON

    // $ANTLR start COMMA
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:295:7: ( ',' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:295:9: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMA

    // $ANTLR start SEMICOLON
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:296:11: ( ';' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:296:13: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SEMICOLON

    // $ANTLR start LPAREN
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:298:8: ( '(' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:298:10: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LPAREN

    // $ANTLR start RPAREN
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:299:8: ( ')' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:299:10: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RPAREN

    // $ANTLR start LSQUARE
    public final void mLSQUARE() throws RecognitionException {
        try {
            int _type = LSQUARE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:300:9: ( '[' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:300:11: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LSQUARE

    // $ANTLR start RSQUARE
    public final void mRSQUARE() throws RecognitionException {
        try {
            int _type = RSQUARE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:301:9: ( ']' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:301:11: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RSQUARE

    // $ANTLR start LCURLY
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:302:8: ( '{' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:302:10: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LCURLY

    // $ANTLR start RCURLY
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:303:8: ( '}' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:303:10: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RCURLY

    // $ANTLR start EQUAL
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:305:7: ( '=' | '==' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='=') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='=') ) {
                    alt2=2;
                }
                else {
                    alt2=1;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("305:1: EQUAL : ( '=' | '==' );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:305:9: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:305:15: '=='
                    {
                    match("=="); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQUAL

    // $ANTLR start EQUAL_NS
    public final void mEQUAL_NS() throws RecognitionException {
        try {
            int _type = EQUAL_NS;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:306:10: ( '<=>' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:306:12: '<=>'
            {
            match("<=>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQUAL_NS

    // $ANTLR start NOTEQUAL
    public final void mNOTEQUAL() throws RecognitionException {
        try {
            int _type = NOTEQUAL;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:307:10: ( '<>' | '!=' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='<') ) {
                alt3=1;
            }
            else if ( (LA3_0=='!') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("307:1: NOTEQUAL : ( '<>' | '!=' );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:307:12: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 2 :
                    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:307:19: '!='
                    {
                    match("!="); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NOTEQUAL

    // $ANTLR start LESSTHANOREQUALTO
    public final void mLESSTHANOREQUALTO() throws RecognitionException {
        try {
            int _type = LESSTHANOREQUALTO;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:308:19: ( '<=' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:308:21: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LESSTHANOREQUALTO

    // $ANTLR start LESSTHAN
    public final void mLESSTHAN() throws RecognitionException {
        try {
            int _type = LESSTHAN;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:309:10: ( '<' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:309:12: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LESSTHAN

    // $ANTLR start GREATERTHANOREQUALTO
    public final void mGREATERTHANOREQUALTO() throws RecognitionException {
        try {
            int _type = GREATERTHANOREQUALTO;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:310:22: ( '>=' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:310:24: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GREATERTHANOREQUALTO

    // $ANTLR start GREATERTHAN
    public final void mGREATERTHAN() throws RecognitionException {
        try {
            int _type = GREATERTHAN;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:311:13: ( '>' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:311:15: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GREATERTHAN

    // $ANTLR start DIVIDE
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:313:8: ( '/' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:313:10: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIVIDE

    // $ANTLR start PLUS
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:314:6: ( '+' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:314:8: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PLUS

    // $ANTLR start MINUS
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:315:7: ( '-' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:315:9: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MINUS

    // $ANTLR start STAR
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:316:6: ( '*' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:316:8: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STAR

    // $ANTLR start MOD
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:317:5: ( '%' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:317:7: '%'
            {
            match('%'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MOD

    // $ANTLR start DIV
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:318:5: ( 'DIV' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:318:7: 'DIV'
            {
            match("DIV"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIV

    // $ANTLR start AMPERSAND
    public final void mAMPERSAND() throws RecognitionException {
        try {
            int _type = AMPERSAND;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:320:11: ( '&' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:320:13: '&'
            {
            match('&'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end AMPERSAND

    // $ANTLR start TILDE
    public final void mTILDE() throws RecognitionException {
        try {
            int _type = TILDE;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:321:7: ( '~' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:321:9: '~'
            {
            match('~'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TILDE

    // $ANTLR start BITWISEOR
    public final void mBITWISEOR() throws RecognitionException {
        try {
            int _type = BITWISEOR;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:322:11: ( '|' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:322:13: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BITWISEOR

    // $ANTLR start BITWISEXOR
    public final void mBITWISEXOR() throws RecognitionException {
        try {
            int _type = BITWISEXOR;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:323:12: ( '^' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:323:14: '^'
            {
            match('^'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BITWISEXOR

    // $ANTLR start QUESTION
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:324:10: ( '?' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:324:12: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end QUESTION

    // $ANTLR start DOLLAR
    public final void mDOLLAR() throws RecognitionException {
        try {
            int _type = DOLLAR;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:325:8: ( '$' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:325:10: '$'
            {
            match('$'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOLLAR

    // $ANTLR start Letter
    public final void mLetter() throws RecognitionException {
        try {
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:330:5: ( 'a' .. 'z' | 'A' .. 'Z' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end Letter

    // $ANTLR start HexDigit
    public final void mHexDigit() throws RecognitionException {
        try {
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:335:5: ( 'a' .. 'f' | 'A' .. 'F' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end HexDigit

    // $ANTLR start Digit
    public final void mDigit() throws RecognitionException {
        try {
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:340:5: ( '0' .. '9' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:341:5: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end Digit

    // $ANTLR start Exponent
    public final void mExponent() throws RecognitionException {
        try {
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:346:5: ( ( 'e' | 'E' ) ( PLUS | MINUS )? ( Digit )+ )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:347:5: ( 'e' | 'E' ) ( PLUS | MINUS )? ( Digit )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:347:17: ( PLUS | MINUS )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='+'||LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }

            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:347:33: ( Digit )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:347:34: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end Exponent

    // $ANTLR start RegexComponent
    public final void mRegexComponent() throws RecognitionException {
        try {
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:352:5: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | PLUS | STAR | QUESTION | MINUS | DOT | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | BITWISEXOR | BITWISEOR | DOLLAR )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='(' && input.LA(1)<='+')||(input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='}') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end RegexComponent

    // $ANTLR start StringLiteral
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:359:5: ( ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+ )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:360:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+
            {
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:360:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\'') ) {
                    alt8=1;
                }
                else if ( (LA8_0=='\"') ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:360:7: '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\''
            	    {
            	    match('\''); 
            	    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:360:12: (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )*
            	    loop6:
            	    do {
            	        int alt6=3;
            	        int LA6_0 = input.LA(1);

            	        if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFE')) ) {
            	            alt6=1;
            	        }
            	        else if ( (LA6_0=='\\') ) {
            	            alt6=2;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:360:14: ~ ( '\\'' | '\\\\' )
            	    	    {
            	    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse =
            	    	            new MismatchedSetException(null,input);
            	    	        recover(mse);    throw mse;
            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:360:29: ( '\\\\' . )
            	    	    {
            	    	    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:360:29: ( '\\\\' . )
            	    	    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:360:30: '\\\\' .
            	    	    {
            	    	    match('\\'); 
            	    	    matchAny(); 

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);

            	    match('\''); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:361:7: '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"'
            	    {
            	    match('\"'); 
            	    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:361:12: (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )*
            	    loop7:
            	    do {
            	        int alt7=3;
            	        int LA7_0 = input.LA(1);

            	        if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFE')) ) {
            	            alt7=1;
            	        }
            	        else if ( (LA7_0=='\\') ) {
            	            alt7=2;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:361:14: ~ ( '\\\"' | '\\\\' )
            	    	    {
            	    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse =
            	    	            new MismatchedSetException(null,input);
            	    	        recover(mse);    throw mse;
            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:361:29: ( '\\\\' . )
            	    	    {
            	    	    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:361:29: ( '\\\\' . )
            	    	    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:361:30: '\\\\' .
            	    	    {
            	    	    match('\\'); 
            	    	    matchAny(); 

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);

            	    match('\"'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end StringLiteral

    // $ANTLR start CharSetLiteral
    public final void mCharSetLiteral() throws RecognitionException {
        try {
            int _type = CharSetLiteral;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:366:5: ( StringLiteral | '0' 'X' ( HexDigit | Digit )+ )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"'||LA10_0=='\'') ) {
                alt10=1;
            }
            else if ( (LA10_0=='0') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("365:1: CharSetLiteral : ( StringLiteral | '0' 'X' ( HexDigit | Digit )+ );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:367:5: StringLiteral
                    {
                    mStringLiteral(); 

                    }
                    break;
                case 2 :
                    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:368:7: '0' 'X' ( HexDigit | Digit )+
                    {
                    match('0'); 
                    match('X'); 
                    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:368:15: ( HexDigit | Digit )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='F')||(LA9_0>='a' && LA9_0<='f')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CharSetLiteral

    // $ANTLR start BigintLiteral
    public final void mBigintLiteral() throws RecognitionException {
        try {
            int _type = BigintLiteral;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:372:5: ( ( Digit )+ 'L' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:373:5: ( Digit )+ 'L'
            {
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:373:5: ( Digit )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:373:6: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            match('L'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BigintLiteral

    // $ANTLR start SmallintLiteral
    public final void mSmallintLiteral() throws RecognitionException {
        try {
            int _type = SmallintLiteral;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:377:5: ( ( Digit )+ 'S' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:378:5: ( Digit )+ 'S'
            {
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:378:5: ( Digit )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:378:6: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            match('S'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SmallintLiteral

    // $ANTLR start TinyintLiteral
    public final void mTinyintLiteral() throws RecognitionException {
        try {
            int _type = TinyintLiteral;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:382:5: ( ( Digit )+ 'Y' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:383:5: ( Digit )+ 'Y'
            {
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:383:5: ( Digit )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:383:6: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            match('Y'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TinyintLiteral

    // $ANTLR start DecimalLiteral
    public final void mDecimalLiteral() throws RecognitionException {
        try {
            int _type = DecimalLiteral;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:387:5: ( Number 'B' 'D' )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:388:5: Number 'B' 'D'
            {
            mNumber(); 
            match('B'); 
            match('D'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DecimalLiteral

    // $ANTLR start ByteLengthLiteral
    public final void mByteLengthLiteral() throws RecognitionException {
        try {
            int _type = ByteLengthLiteral;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:392:5: ( ( Digit )+ ( 'b' | 'B' | 'k' | 'K' | 'm' | 'M' | 'g' | 'G' ) )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:393:5: ( Digit )+ ( 'b' | 'B' | 'k' | 'K' | 'm' | 'M' | 'g' | 'G' )
            {
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:393:5: ( Digit )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:393:6: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            if ( input.LA(1)=='B'||input.LA(1)=='G'||input.LA(1)=='K'||input.LA(1)=='M'||input.LA(1)=='b'||input.LA(1)=='g'||input.LA(1)=='k'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ByteLengthLiteral

    // $ANTLR start Number
    public final void mNumber() throws RecognitionException {
        try {
            int _type = Number;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:397:5: ( ( Digit )+ ( DOT ( Digit )* ( Exponent )? | Exponent )? )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:398:5: ( Digit )+ ( DOT ( Digit )* ( Exponent )? | Exponent )?
            {
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:398:5: ( Digit )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:398:6: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:398:14: ( DOT ( Digit )* ( Exponent )? | Exponent )?
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='.') ) {
                alt18=1;
            }
            else if ( (LA18_0=='E'||LA18_0=='e') ) {
                alt18=2;
            }
            switch (alt18) {
                case 1 :
                    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:398:16: DOT ( Digit )* ( Exponent )?
                    {
                    mDOT(); 
                    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:398:20: ( Digit )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:398:21: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:398:29: ( Exponent )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='E'||LA17_0=='e') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:398:30: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:398:43: Exponent
                    {
                    mExponent(); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Number

    // $ANTLR start Identifier
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:402:5: ( ( Letter | Digit ) ( Letter | Digit | '_' )* | '`' ( RegexComponent )+ '`' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>='0' && LA21_0<='9')||(LA21_0>='A' && LA21_0<='Z')||(LA21_0>='a' && LA21_0<='z')) ) {
                alt21=1;
            }
            else if ( (LA21_0=='`') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("401:1: Identifier : ( ( Letter | Digit ) ( Letter | Digit | '_' )* | '`' ( RegexComponent )+ '`' );", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:403:5: ( Letter | Digit ) ( Letter | Digit | '_' )*
                    {
                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }

                    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:403:22: ( Letter | Digit | '_' )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>='0' && LA19_0<='9')||(LA19_0>='A' && LA19_0<='Z')||LA19_0=='_'||(LA19_0>='a' && LA19_0<='z')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:404:7: '`' ( RegexComponent )+ '`'
                    {
                    match('`'); 
                    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:404:11: ( RegexComponent )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0=='$'||(LA20_0>='(' && LA20_0<='+')||(LA20_0>='-' && LA20_0<='.')||(LA20_0>='0' && LA20_0<='9')||LA20_0=='?'||(LA20_0>='A' && LA20_0<='[')||(LA20_0>=']' && LA20_0<='_')||(LA20_0>='a' && LA20_0<='}')) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:404:11: RegexComponent
                    	    {
                    	    mRegexComponent(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);

                    match('`'); 

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Identifier

    // $ANTLR start CharSetName
    public final void mCharSetName() throws RecognitionException {
        try {
            int _type = CharSetName;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:408:5: ( '_' ( Letter | Digit | '_' | '-' | '.' | ':' )+ )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:409:5: '_' ( Letter | Digit | '_' | '-' | '.' | ':' )+
            {
            match('_'); 
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:409:9: ( Letter | Digit | '_' | '-' | '.' | ':' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='-' && LA22_0<='.')||(LA22_0>='0' && LA22_0<=':')||(LA22_0>='A' && LA22_0<='Z')||LA22_0=='_'||(LA22_0>='a' && LA22_0<='z')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:
            	    {
            	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<=':')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CharSetName

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:412:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:412:8: ( ' ' | '\\r' | '\\t' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    // $ANTLR start COMMENT
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:416:3: ( '--' (~ ( '\\n' | '\\r' ) )* )
            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:416:5: '--' (~ ( '\\n' | '\\r' ) )*
            {
            match("--"); 

            // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:416:10: (~ ( '\\n' | '\\r' ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='\u0000' && LA23_0<='\t')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\uFFFE')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:416:11: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             channel=HIDDEN; 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMENT

    public void mTokens() throws RecognitionException {
        // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:8: ( KW_ENC | KW_TRUE | KW_FALSE | KW_ALL | KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_IF | KW_EXISTS | KW_ASC | KW_DESC | KW_ORDER | KW_GROUP | KW_BY | KW_HAVING | KW_WHERE | KW_FROM | KW_AS | KW_SELECT | KW_DISTINCT | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_UNIQUEJOIN | KW_PRESERVE | KW_JOIN | KW_LEFT | KW_RIGHT | KW_FULL | KW_ON | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_TRANSFORM | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_COLUMN | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_IGNORE | KW_PROTECTION | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_DECIMAL | KW_STRING | KW_ARRAY | KW_STRUCT | KW_MAP | KW_UNIONTYPE | KW_REDUCE | KW_PARTITIONED | KW_CLUSTERED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_SEQUENCEFILE | KW_TEXTFILE | KW_RCFILE | KW_ORCFILE | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_OFFLINE | KW_ENABLE | KW_DISABLE | KW_READONLY | KW_NO_DROP | KW_LOCATION | KW_TABLESAMPLE | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_CAST | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_FUNCTION | KW_MACRO | KW_EXPLAIN | KW_EXTENDED | KW_FORMATTED | KW_PRETTY | KW_DEPENDENCY | KW_LOGICAL | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_CASE | KW_WHEN | KW_THEN | KW_ELSE | KW_END | KW_MAPJOIN | KW_STREAMTABLE | KW_HOLD_DDLTIME | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_IN | KW_DATABASE | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CROSS | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_WINDOW | KW_UNBOUNDED | KW_PRECEDING | KW_FOLLOWING | KW_CURRENT | KW_LESS | KW_MORE | KW_OVER | KW_GROUPING | KW_SETS | KW_TRUNCATE | KW_NOSCAN | KW_PARTIALSCAN | KW_USER | KW_ROLE | KW_INNER | KW_EXCHANGE | KW_INTERVAL | KW_ADJACENT | KW_CORRESPONDING | KW_OVERLAPS | KW_CONTAINS | KW_WITHIN | KW_PREFIX | KW_SUFFIX | KW_UPSTREAM | KW_DOWNSTREAM | KW_COALESCE | KW_LENGTH | KW_CLOSEST | KW_EXCLUSIVENESSJOIN | KW_INTERSECTJOIN | KW_DISTANCE | KW_PROJECT | KW_VIRTUALTRACK | DOT | COLON | COMMA | SEMICOLON | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | BITWISEXOR | QUESTION | DOLLAR | StringLiteral | CharSetLiteral | BigintLiteral | SmallintLiteral | TinyintLiteral | DecimalLiteral | ByteLengthLiteral | Number | Identifier | CharSetName | WS | COMMENT )
        int alt24=299;
        alt24 = dfa24.predict(input);
        switch (alt24) {
            case 1 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:10: KW_ENC
                {
                mKW_ENC(); 

                }
                break;
            case 2 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:17: KW_TRUE
                {
                mKW_TRUE(); 

                }
                break;
            case 3 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:25: KW_FALSE
                {
                mKW_FALSE(); 

                }
                break;
            case 4 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:34: KW_ALL
                {
                mKW_ALL(); 

                }
                break;
            case 5 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:41: KW_AND
                {
                mKW_AND(); 

                }
                break;
            case 6 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:48: KW_OR
                {
                mKW_OR(); 

                }
                break;
            case 7 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:54: KW_NOT
                {
                mKW_NOT(); 

                }
                break;
            case 8 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:61: KW_LIKE
                {
                mKW_LIKE(); 

                }
                break;
            case 9 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:69: KW_IF
                {
                mKW_IF(); 

                }
                break;
            case 10 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:75: KW_EXISTS
                {
                mKW_EXISTS(); 

                }
                break;
            case 11 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:85: KW_ASC
                {
                mKW_ASC(); 

                }
                break;
            case 12 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:92: KW_DESC
                {
                mKW_DESC(); 

                }
                break;
            case 13 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:100: KW_ORDER
                {
                mKW_ORDER(); 

                }
                break;
            case 14 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:109: KW_GROUP
                {
                mKW_GROUP(); 

                }
                break;
            case 15 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:118: KW_BY
                {
                mKW_BY(); 

                }
                break;
            case 16 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:124: KW_HAVING
                {
                mKW_HAVING(); 

                }
                break;
            case 17 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:134: KW_WHERE
                {
                mKW_WHERE(); 

                }
                break;
            case 18 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:143: KW_FROM
                {
                mKW_FROM(); 

                }
                break;
            case 19 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:151: KW_AS
                {
                mKW_AS(); 

                }
                break;
            case 20 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:157: KW_SELECT
                {
                mKW_SELECT(); 

                }
                break;
            case 21 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:167: KW_DISTINCT
                {
                mKW_DISTINCT(); 

                }
                break;
            case 22 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:179: KW_INSERT
                {
                mKW_INSERT(); 

                }
                break;
            case 23 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:189: KW_OVERWRITE
                {
                mKW_OVERWRITE(); 

                }
                break;
            case 24 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:202: KW_OUTER
                {
                mKW_OUTER(); 

                }
                break;
            case 25 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:211: KW_UNIQUEJOIN
                {
                mKW_UNIQUEJOIN(); 

                }
                break;
            case 26 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:225: KW_PRESERVE
                {
                mKW_PRESERVE(); 

                }
                break;
            case 27 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:237: KW_JOIN
                {
                mKW_JOIN(); 

                }
                break;
            case 28 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:245: KW_LEFT
                {
                mKW_LEFT(); 

                }
                break;
            case 29 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:253: KW_RIGHT
                {
                mKW_RIGHT(); 

                }
                break;
            case 30 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:262: KW_FULL
                {
                mKW_FULL(); 

                }
                break;
            case 31 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:270: KW_ON
                {
                mKW_ON(); 

                }
                break;
            case 32 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:276: KW_PARTITION
                {
                mKW_PARTITION(); 

                }
                break;
            case 33 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:289: KW_PARTITIONS
                {
                mKW_PARTITIONS(); 

                }
                break;
            case 34 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:303: KW_TABLE
                {
                mKW_TABLE(); 

                }
                break;
            case 35 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:312: KW_TABLES
                {
                mKW_TABLES(); 

                }
                break;
            case 36 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:322: KW_COLUMNS
                {
                mKW_COLUMNS(); 

                }
                break;
            case 37 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:333: KW_INDEX
                {
                mKW_INDEX(); 

                }
                break;
            case 38 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:342: KW_INDEXES
                {
                mKW_INDEXES(); 

                }
                break;
            case 39 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:353: KW_REBUILD
                {
                mKW_REBUILD(); 

                }
                break;
            case 40 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:364: KW_FUNCTIONS
                {
                mKW_FUNCTIONS(); 

                }
                break;
            case 41 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:377: KW_SHOW
                {
                mKW_SHOW(); 

                }
                break;
            case 42 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:385: KW_MSCK
                {
                mKW_MSCK(); 

                }
                break;
            case 43 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:393: KW_REPAIR
                {
                mKW_REPAIR(); 

                }
                break;
            case 44 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:403: KW_DIRECTORY
                {
                mKW_DIRECTORY(); 

                }
                break;
            case 45 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:416: KW_LOCAL
                {
                mKW_LOCAL(); 

                }
                break;
            case 46 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:425: KW_TRANSFORM
                {
                mKW_TRANSFORM(); 

                }
                break;
            case 47 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:438: KW_USING
                {
                mKW_USING(); 

                }
                break;
            case 48 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:447: KW_CLUSTER
                {
                mKW_CLUSTER(); 

                }
                break;
            case 49 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:458: KW_DISTRIBUTE
                {
                mKW_DISTRIBUTE(); 

                }
                break;
            case 50 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:472: KW_SORT
                {
                mKW_SORT(); 

                }
                break;
            case 51 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:480: KW_UNION
                {
                mKW_UNION(); 

                }
                break;
            case 52 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:489: KW_LOAD
                {
                mKW_LOAD(); 

                }
                break;
            case 53 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:497: KW_EXPORT
                {
                mKW_EXPORT(); 

                }
                break;
            case 54 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:507: KW_IMPORT
                {
                mKW_IMPORT(); 

                }
                break;
            case 55 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:517: KW_DATA
                {
                mKW_DATA(); 

                }
                break;
            case 56 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:525: KW_INPATH
                {
                mKW_INPATH(); 

                }
                break;
            case 57 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:535: KW_IS
                {
                mKW_IS(); 

                }
                break;
            case 58 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:541: KW_NULL
                {
                mKW_NULL(); 

                }
                break;
            case 59 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:549: KW_CREATE
                {
                mKW_CREATE(); 

                }
                break;
            case 60 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:559: KW_EXTERNAL
                {
                mKW_EXTERNAL(); 

                }
                break;
            case 61 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:571: KW_ALTER
                {
                mKW_ALTER(); 

                }
                break;
            case 62 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:580: KW_CHANGE
                {
                mKW_CHANGE(); 

                }
                break;
            case 63 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:590: KW_COLUMN
                {
                mKW_COLUMN(); 

                }
                break;
            case 64 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:600: KW_FIRST
                {
                mKW_FIRST(); 

                }
                break;
            case 65 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:609: KW_AFTER
                {
                mKW_AFTER(); 

                }
                break;
            case 66 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:618: KW_DESCRIBE
                {
                mKW_DESCRIBE(); 

                }
                break;
            case 67 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:630: KW_DROP
                {
                mKW_DROP(); 

                }
                break;
            case 68 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:638: KW_RENAME
                {
                mKW_RENAME(); 

                }
                break;
            case 69 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:648: KW_IGNORE
                {
                mKW_IGNORE(); 

                }
                break;
            case 70 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:658: KW_PROTECTION
                {
                mKW_PROTECTION(); 

                }
                break;
            case 71 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:672: KW_TO
                {
                mKW_TO(); 

                }
                break;
            case 72 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:678: KW_COMMENT
                {
                mKW_COMMENT(); 

                }
                break;
            case 73 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:689: KW_BOOLEAN
                {
                mKW_BOOLEAN(); 

                }
                break;
            case 74 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:700: KW_TINYINT
                {
                mKW_TINYINT(); 

                }
                break;
            case 75 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:711: KW_SMALLINT
                {
                mKW_SMALLINT(); 

                }
                break;
            case 76 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:723: KW_INT
                {
                mKW_INT(); 

                }
                break;
            case 77 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:730: KW_BIGINT
                {
                mKW_BIGINT(); 

                }
                break;
            case 78 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:740: KW_FLOAT
                {
                mKW_FLOAT(); 

                }
                break;
            case 79 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:749: KW_DOUBLE
                {
                mKW_DOUBLE(); 

                }
                break;
            case 80 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:759: KW_DATE
                {
                mKW_DATE(); 

                }
                break;
            case 81 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:767: KW_DATETIME
                {
                mKW_DATETIME(); 

                }
                break;
            case 82 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:779: KW_TIMESTAMP
                {
                mKW_TIMESTAMP(); 

                }
                break;
            case 83 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:792: KW_DECIMAL
                {
                mKW_DECIMAL(); 

                }
                break;
            case 84 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:803: KW_STRING
                {
                mKW_STRING(); 

                }
                break;
            case 85 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:813: KW_ARRAY
                {
                mKW_ARRAY(); 

                }
                break;
            case 86 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:822: KW_STRUCT
                {
                mKW_STRUCT(); 

                }
                break;
            case 87 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:832: KW_MAP
                {
                mKW_MAP(); 

                }
                break;
            case 88 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:839: KW_UNIONTYPE
                {
                mKW_UNIONTYPE(); 

                }
                break;
            case 89 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:852: KW_REDUCE
                {
                mKW_REDUCE(); 

                }
                break;
            case 90 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:862: KW_PARTITIONED
                {
                mKW_PARTITIONED(); 

                }
                break;
            case 91 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:877: KW_CLUSTERED
                {
                mKW_CLUSTERED(); 

                }
                break;
            case 92 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:890: KW_SORTED
                {
                mKW_SORTED(); 

                }
                break;
            case 93 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:900: KW_INTO
                {
                mKW_INTO(); 

                }
                break;
            case 94 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:908: KW_BUCKETS
                {
                mKW_BUCKETS(); 

                }
                break;
            case 95 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:919: KW_ROW
                {
                mKW_ROW(); 

                }
                break;
            case 96 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:926: KW_ROWS
                {
                mKW_ROWS(); 

                }
                break;
            case 97 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:934: KW_FORMAT
                {
                mKW_FORMAT(); 

                }
                break;
            case 98 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:944: KW_DELIMITED
                {
                mKW_DELIMITED(); 

                }
                break;
            case 99 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:957: KW_FIELDS
                {
                mKW_FIELDS(); 

                }
                break;
            case 100 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:967: KW_TERMINATED
                {
                mKW_TERMINATED(); 

                }
                break;
            case 101 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:981: KW_ESCAPED
                {
                mKW_ESCAPED(); 

                }
                break;
            case 102 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:992: KW_COLLECTION
                {
                mKW_COLLECTION(); 

                }
                break;
            case 103 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1006: KW_ITEMS
                {
                mKW_ITEMS(); 

                }
                break;
            case 104 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1015: KW_KEYS
                {
                mKW_KEYS(); 

                }
                break;
            case 105 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1023: KW_KEY_TYPE
                {
                mKW_KEY_TYPE(); 

                }
                break;
            case 106 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1035: KW_LINES
                {
                mKW_LINES(); 

                }
                break;
            case 107 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1044: KW_STORED
                {
                mKW_STORED(); 

                }
                break;
            case 108 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1054: KW_FILEFORMAT
                {
                mKW_FILEFORMAT(); 

                }
                break;
            case 109 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1068: KW_SEQUENCEFILE
                {
                mKW_SEQUENCEFILE(); 

                }
                break;
            case 110 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1084: KW_TEXTFILE
                {
                mKW_TEXTFILE(); 

                }
                break;
            case 111 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1096: KW_RCFILE
                {
                mKW_RCFILE(); 

                }
                break;
            case 112 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1106: KW_ORCFILE
                {
                mKW_ORCFILE(); 

                }
                break;
            case 113 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1117: KW_INPUTFORMAT
                {
                mKW_INPUTFORMAT(); 

                }
                break;
            case 114 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1132: KW_OUTPUTFORMAT
                {
                mKW_OUTPUTFORMAT(); 

                }
                break;
            case 115 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1148: KW_INPUTDRIVER
                {
                mKW_INPUTDRIVER(); 

                }
                break;
            case 116 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1163: KW_OUTPUTDRIVER
                {
                mKW_OUTPUTDRIVER(); 

                }
                break;
            case 117 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1179: KW_OFFLINE
                {
                mKW_OFFLINE(); 

                }
                break;
            case 118 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1190: KW_ENABLE
                {
                mKW_ENABLE(); 

                }
                break;
            case 119 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1200: KW_DISABLE
                {
                mKW_DISABLE(); 

                }
                break;
            case 120 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1211: KW_READONLY
                {
                mKW_READONLY(); 

                }
                break;
            case 121 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1223: KW_NO_DROP
                {
                mKW_NO_DROP(); 

                }
                break;
            case 122 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1234: KW_LOCATION
                {
                mKW_LOCATION(); 

                }
                break;
            case 123 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1246: KW_TABLESAMPLE
                {
                mKW_TABLESAMPLE(); 

                }
                break;
            case 124 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1261: KW_BUCKET
                {
                mKW_BUCKET(); 

                }
                break;
            case 125 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1271: KW_OUT
                {
                mKW_OUT(); 

                }
                break;
            case 126 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1278: KW_OF
                {
                mKW_OF(); 

                }
                break;
            case 127 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1284: KW_PERCENT
                {
                mKW_PERCENT(); 

                }
                break;
            case 128 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1295: KW_CAST
                {
                mKW_CAST(); 

                }
                break;
            case 129 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1303: KW_ADD
                {
                mKW_ADD(); 

                }
                break;
            case 130 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1310: KW_REPLACE
                {
                mKW_REPLACE(); 

                }
                break;
            case 131 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1321: KW_RLIKE
                {
                mKW_RLIKE(); 

                }
                break;
            case 132 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1330: KW_REGEXP
                {
                mKW_REGEXP(); 

                }
                break;
            case 133 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1340: KW_TEMPORARY
                {
                mKW_TEMPORARY(); 

                }
                break;
            case 134 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1353: KW_FUNCTION
                {
                mKW_FUNCTION(); 

                }
                break;
            case 135 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1365: KW_MACRO
                {
                mKW_MACRO(); 

                }
                break;
            case 136 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1374: KW_EXPLAIN
                {
                mKW_EXPLAIN(); 

                }
                break;
            case 137 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1385: KW_EXTENDED
                {
                mKW_EXTENDED(); 

                }
                break;
            case 138 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1397: KW_FORMATTED
                {
                mKW_FORMATTED(); 

                }
                break;
            case 139 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1410: KW_PRETTY
                {
                mKW_PRETTY(); 

                }
                break;
            case 140 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1420: KW_DEPENDENCY
                {
                mKW_DEPENDENCY(); 

                }
                break;
            case 141 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1434: KW_LOGICAL
                {
                mKW_LOGICAL(); 

                }
                break;
            case 142 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1445: KW_SERDE
                {
                mKW_SERDE(); 

                }
                break;
            case 143 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1454: KW_WITH
                {
                mKW_WITH(); 

                }
                break;
            case 144 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1462: KW_DEFERRED
                {
                mKW_DEFERRED(); 

                }
                break;
            case 145 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1474: KW_SERDEPROPERTIES
                {
                mKW_SERDEPROPERTIES(); 

                }
                break;
            case 146 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1493: KW_DBPROPERTIES
                {
                mKW_DBPROPERTIES(); 

                }
                break;
            case 147 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1509: KW_LIMIT
                {
                mKW_LIMIT(); 

                }
                break;
            case 148 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1518: KW_SET
                {
                mKW_SET(); 

                }
                break;
            case 149 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1525: KW_UNSET
                {
                mKW_UNSET(); 

                }
                break;
            case 150 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1534: KW_TBLPROPERTIES
                {
                mKW_TBLPROPERTIES(); 

                }
                break;
            case 151 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1551: KW_IDXPROPERTIES
                {
                mKW_IDXPROPERTIES(); 

                }
                break;
            case 152 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1568: KW_VALUE_TYPE
                {
                mKW_VALUE_TYPE(); 

                }
                break;
            case 153 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1582: KW_ELEM_TYPE
                {
                mKW_ELEM_TYPE(); 

                }
                break;
            case 154 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1595: KW_CASE
                {
                mKW_CASE(); 

                }
                break;
            case 155 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1603: KW_WHEN
                {
                mKW_WHEN(); 

                }
                break;
            case 156 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1611: KW_THEN
                {
                mKW_THEN(); 

                }
                break;
            case 157 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1619: KW_ELSE
                {
                mKW_ELSE(); 

                }
                break;
            case 158 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1627: KW_END
                {
                mKW_END(); 

                }
                break;
            case 159 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1634: KW_MAPJOIN
                {
                mKW_MAPJOIN(); 

                }
                break;
            case 160 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1645: KW_STREAMTABLE
                {
                mKW_STREAMTABLE(); 

                }
                break;
            case 161 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1660: KW_HOLD_DDLTIME
                {
                mKW_HOLD_DDLTIME(); 

                }
                break;
            case 162 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1676: KW_CLUSTERSTATUS
                {
                mKW_CLUSTERSTATUS(); 

                }
                break;
            case 163 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1693: KW_UTC
                {
                mKW_UTC(); 

                }
                break;
            case 164 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1700: KW_UTCTIMESTAMP
                {
                mKW_UTCTIMESTAMP(); 

                }
                break;
            case 165 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1716: KW_LONG
                {
                mKW_LONG(); 

                }
                break;
            case 166 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1724: KW_DELETE
                {
                mKW_DELETE(); 

                }
                break;
            case 167 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1734: KW_PLUS
                {
                mKW_PLUS(); 

                }
                break;
            case 168 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1742: KW_MINUS
                {
                mKW_MINUS(); 

                }
                break;
            case 169 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1751: KW_FETCH
                {
                mKW_FETCH(); 

                }
                break;
            case 170 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1760: KW_INTERSECT
                {
                mKW_INTERSECT(); 

                }
                break;
            case 171 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1773: KW_VIEW
                {
                mKW_VIEW(); 

                }
                break;
            case 172 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1781: KW_IN
                {
                mKW_IN(); 

                }
                break;
            case 173 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1787: KW_DATABASE
                {
                mKW_DATABASE(); 

                }
                break;
            case 174 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1799: KW_DATABASES
                {
                mKW_DATABASES(); 

                }
                break;
            case 175 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1812: KW_MATERIALIZED
                {
                mKW_MATERIALIZED(); 

                }
                break;
            case 176 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1828: KW_SCHEMA
                {
                mKW_SCHEMA(); 

                }
                break;
            case 177 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1838: KW_SCHEMAS
                {
                mKW_SCHEMAS(); 

                }
                break;
            case 178 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1849: KW_GRANT
                {
                mKW_GRANT(); 

                }
                break;
            case 179 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1858: KW_REVOKE
                {
                mKW_REVOKE(); 

                }
                break;
            case 180 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1868: KW_SSL
                {
                mKW_SSL(); 

                }
                break;
            case 181 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1875: KW_UNDO
                {
                mKW_UNDO(); 

                }
                break;
            case 182 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1883: KW_LOCK
                {
                mKW_LOCK(); 

                }
                break;
            case 183 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1891: KW_LOCKS
                {
                mKW_LOCKS(); 

                }
                break;
            case 184 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1900: KW_UNLOCK
                {
                mKW_UNLOCK(); 

                }
                break;
            case 185 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1910: KW_SHARED
                {
                mKW_SHARED(); 

                }
                break;
            case 186 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1920: KW_EXCLUSIVE
                {
                mKW_EXCLUSIVE(); 

                }
                break;
            case 187 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1933: KW_PROCEDURE
                {
                mKW_PROCEDURE(); 

                }
                break;
            case 188 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1946: KW_UNSIGNED
                {
                mKW_UNSIGNED(); 

                }
                break;
            case 189 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1958: KW_WHILE
                {
                mKW_WHILE(); 

                }
                break;
            case 190 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1967: KW_READ
                {
                mKW_READ(); 

                }
                break;
            case 191 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1975: KW_READS
                {
                mKW_READS(); 

                }
                break;
            case 192 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1984: KW_PURGE
                {
                mKW_PURGE(); 

                }
                break;
            case 193 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:1993: KW_RANGE
                {
                mKW_RANGE(); 

                }
                break;
            case 194 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2002: KW_ANALYZE
                {
                mKW_ANALYZE(); 

                }
                break;
            case 195 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2013: KW_BEFORE
                {
                mKW_BEFORE(); 

                }
                break;
            case 196 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2023: KW_BETWEEN
                {
                mKW_BETWEEN(); 

                }
                break;
            case 197 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2034: KW_BOTH
                {
                mKW_BOTH(); 

                }
                break;
            case 198 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2042: KW_BINARY
                {
                mKW_BINARY(); 

                }
                break;
            case 199 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2052: KW_CROSS
                {
                mKW_CROSS(); 

                }
                break;
            case 200 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2061: KW_CONTINUE
                {
                mKW_CONTINUE(); 

                }
                break;
            case 201 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2073: KW_CURSOR
                {
                mKW_CURSOR(); 

                }
                break;
            case 202 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2083: KW_TRIGGER
                {
                mKW_TRIGGER(); 

                }
                break;
            case 203 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2094: KW_RECORDREADER
                {
                mKW_RECORDREADER(); 

                }
                break;
            case 204 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2110: KW_RECORDWRITER
                {
                mKW_RECORDWRITER(); 

                }
                break;
            case 205 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2126: KW_SEMI
                {
                mKW_SEMI(); 

                }
                break;
            case 206 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2134: KW_LATERAL
                {
                mKW_LATERAL(); 

                }
                break;
            case 207 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2145: KW_TOUCH
                {
                mKW_TOUCH(); 

                }
                break;
            case 208 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2154: KW_ARCHIVE
                {
                mKW_ARCHIVE(); 

                }
                break;
            case 209 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2165: KW_UNARCHIVE
                {
                mKW_UNARCHIVE(); 

                }
                break;
            case 210 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2178: KW_COMPUTE
                {
                mKW_COMPUTE(); 

                }
                break;
            case 211 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2189: KW_STATISTICS
                {
                mKW_STATISTICS(); 

                }
                break;
            case 212 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2203: KW_USE
                {
                mKW_USE(); 

                }
                break;
            case 213 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2210: KW_OPTION
                {
                mKW_OPTION(); 

                }
                break;
            case 214 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2220: KW_CONCATENATE
                {
                mKW_CONCATENATE(); 

                }
                break;
            case 215 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2235: KW_SHOW_DATABASE
                {
                mKW_SHOW_DATABASE(); 

                }
                break;
            case 216 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2252: KW_UPDATE
                {
                mKW_UPDATE(); 

                }
                break;
            case 217 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2262: KW_RESTRICT
                {
                mKW_RESTRICT(); 

                }
                break;
            case 218 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2274: KW_CASCADE
                {
                mKW_CASCADE(); 

                }
                break;
            case 219 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2285: KW_SKEWED
                {
                mKW_SKEWED(); 

                }
                break;
            case 220 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2295: KW_ROLLUP
                {
                mKW_ROLLUP(); 

                }
                break;
            case 221 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2305: KW_CUBE
                {
                mKW_CUBE(); 

                }
                break;
            case 222 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2313: KW_DIRECTORIES
                {
                mKW_DIRECTORIES(); 

                }
                break;
            case 223 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2328: KW_FOR
                {
                mKW_FOR(); 

                }
                break;
            case 224 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2335: KW_WINDOW
                {
                mKW_WINDOW(); 

                }
                break;
            case 225 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2345: KW_UNBOUNDED
                {
                mKW_UNBOUNDED(); 

                }
                break;
            case 226 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2358: KW_PRECEDING
                {
                mKW_PRECEDING(); 

                }
                break;
            case 227 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2371: KW_FOLLOWING
                {
                mKW_FOLLOWING(); 

                }
                break;
            case 228 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2384: KW_CURRENT
                {
                mKW_CURRENT(); 

                }
                break;
            case 229 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2395: KW_LESS
                {
                mKW_LESS(); 

                }
                break;
            case 230 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2403: KW_MORE
                {
                mKW_MORE(); 

                }
                break;
            case 231 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2411: KW_OVER
                {
                mKW_OVER(); 

                }
                break;
            case 232 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2419: KW_GROUPING
                {
                mKW_GROUPING(); 

                }
                break;
            case 233 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2431: KW_SETS
                {
                mKW_SETS(); 

                }
                break;
            case 234 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2439: KW_TRUNCATE
                {
                mKW_TRUNCATE(); 

                }
                break;
            case 235 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2451: KW_NOSCAN
                {
                mKW_NOSCAN(); 

                }
                break;
            case 236 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2461: KW_PARTIALSCAN
                {
                mKW_PARTIALSCAN(); 

                }
                break;
            case 237 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2476: KW_USER
                {
                mKW_USER(); 

                }
                break;
            case 238 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2484: KW_ROLE
                {
                mKW_ROLE(); 

                }
                break;
            case 239 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2492: KW_INNER
                {
                mKW_INNER(); 

                }
                break;
            case 240 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2501: KW_EXCHANGE
                {
                mKW_EXCHANGE(); 

                }
                break;
            case 241 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2513: KW_INTERVAL
                {
                mKW_INTERVAL(); 

                }
                break;
            case 242 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2525: KW_ADJACENT
                {
                mKW_ADJACENT(); 

                }
                break;
            case 243 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2537: KW_CORRESPONDING
                {
                mKW_CORRESPONDING(); 

                }
                break;
            case 244 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2554: KW_OVERLAPS
                {
                mKW_OVERLAPS(); 

                }
                break;
            case 245 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2566: KW_CONTAINS
                {
                mKW_CONTAINS(); 

                }
                break;
            case 246 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2578: KW_WITHIN
                {
                mKW_WITHIN(); 

                }
                break;
            case 247 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2588: KW_PREFIX
                {
                mKW_PREFIX(); 

                }
                break;
            case 248 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2598: KW_SUFFIX
                {
                mKW_SUFFIX(); 

                }
                break;
            case 249 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2608: KW_UPSTREAM
                {
                mKW_UPSTREAM(); 

                }
                break;
            case 250 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2620: KW_DOWNSTREAM
                {
                mKW_DOWNSTREAM(); 

                }
                break;
            case 251 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2634: KW_COALESCE
                {
                mKW_COALESCE(); 

                }
                break;
            case 252 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2646: KW_LENGTH
                {
                mKW_LENGTH(); 

                }
                break;
            case 253 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2656: KW_CLOSEST
                {
                mKW_CLOSEST(); 

                }
                break;
            case 254 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2667: KW_EXCLUSIVENESSJOIN
                {
                mKW_EXCLUSIVENESSJOIN(); 

                }
                break;
            case 255 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2688: KW_INTERSECTJOIN
                {
                mKW_INTERSECTJOIN(); 

                }
                break;
            case 256 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2705: KW_DISTANCE
                {
                mKW_DISTANCE(); 

                }
                break;
            case 257 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2717: KW_PROJECT
                {
                mKW_PROJECT(); 

                }
                break;
            case 258 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2728: KW_VIRTUALTRACK
                {
                mKW_VIRTUALTRACK(); 

                }
                break;
            case 259 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2744: DOT
                {
                mDOT(); 

                }
                break;
            case 260 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2748: COLON
                {
                mCOLON(); 

                }
                break;
            case 261 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2754: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 262 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2760: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 263 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2770: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 264 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2777: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 265 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2784: LSQUARE
                {
                mLSQUARE(); 

                }
                break;
            case 266 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2792: RSQUARE
                {
                mRSQUARE(); 

                }
                break;
            case 267 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2800: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 268 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2807: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 269 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2814: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 270 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2820: EQUAL_NS
                {
                mEQUAL_NS(); 

                }
                break;
            case 271 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2829: NOTEQUAL
                {
                mNOTEQUAL(); 

                }
                break;
            case 272 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2838: LESSTHANOREQUALTO
                {
                mLESSTHANOREQUALTO(); 

                }
                break;
            case 273 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2856: LESSTHAN
                {
                mLESSTHAN(); 

                }
                break;
            case 274 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2865: GREATERTHANOREQUALTO
                {
                mGREATERTHANOREQUALTO(); 

                }
                break;
            case 275 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2886: GREATERTHAN
                {
                mGREATERTHAN(); 

                }
                break;
            case 276 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2898: DIVIDE
                {
                mDIVIDE(); 

                }
                break;
            case 277 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2905: PLUS
                {
                mPLUS(); 

                }
                break;
            case 278 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2910: MINUS
                {
                mMINUS(); 

                }
                break;
            case 279 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2916: STAR
                {
                mSTAR(); 

                }
                break;
            case 280 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2921: MOD
                {
                mMOD(); 

                }
                break;
            case 281 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2925: DIV
                {
                mDIV(); 

                }
                break;
            case 282 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2929: AMPERSAND
                {
                mAMPERSAND(); 

                }
                break;
            case 283 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2939: TILDE
                {
                mTILDE(); 

                }
                break;
            case 284 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2945: BITWISEOR
                {
                mBITWISEOR(); 

                }
                break;
            case 285 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2955: BITWISEXOR
                {
                mBITWISEXOR(); 

                }
                break;
            case 286 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2966: QUESTION
                {
                mQUESTION(); 

                }
                break;
            case 287 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2975: DOLLAR
                {
                mDOLLAR(); 

                }
                break;
            case 288 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2982: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 289 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:2996: CharSetLiteral
                {
                mCharSetLiteral(); 

                }
                break;
            case 290 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:3011: BigintLiteral
                {
                mBigintLiteral(); 

                }
                break;
            case 291 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:3025: SmallintLiteral
                {
                mSmallintLiteral(); 

                }
                break;
            case 292 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:3041: TinyintLiteral
                {
                mTinyintLiteral(); 

                }
                break;
            case 293 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:3056: DecimalLiteral
                {
                mDecimalLiteral(); 

                }
                break;
            case 294 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:3071: ByteLengthLiteral
                {
                mByteLengthLiteral(); 

                }
                break;
            case 295 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:3089: Number
                {
                mNumber(); 

                }
                break;
            case 296 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:3096: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 297 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:3107: CharSetName
                {
                mCharSetName(); 

                }
                break;
            case 298 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:3119: WS
                {
                mWS(); 

                }
                break;
            case 299 :
                // /Users/Yifan/SDB/dev/parser/src/SDB/src/main/antlr/HiveLexer.g:1:3122: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA24_eotS =
        "\1\uffff\6\64\1\130\17\64\1\u009c\1\64\13\uffff\1\u009f\1\u00a1"+
        "\2\uffff\1\u00a3\11\uffff\2\u00ab\3\uffff\4\64\1\u00be\21\64\1\u00dd"+
        "\2\64\1\u00e3\1\64\1\u00e6\1\64\1\u00e8\2\64\2\uffff\5\64\1\u00fe"+
        "\1\u00ff\3\64\1\u0103\14\64\1\u011b\50\64\4\uffff\1\64\1\u0169\7"+
        "\uffff\1\u016b\2\uffff\1\u016b\1\64\1\uffff\1\u016f\1\u00ab\1\u0170"+
        "\1\64\1\u00ab\1\u0176\1\u0177\1\u016f\4\64\1\u017e\1\u017f\4\64"+
        "\1\uffff\21\64\1\u0197\5\64\1\u019d\1\64\1\u019f\3\64\1\u01a3\1"+
        "\uffff\1\64\1\u01a5\1\64\1\u01a7\1\64\1\uffff\1\u01ab\1\64\1\uffff"+
        "\1\64\1\uffff\2\64\1\130\16\64\1\u01c2\3\64\2\uffff\3\64\1\uffff"+
        "\13\64\1\u01d7\13\64\1\uffff\12\64\1\u01ef\12\64\1\u01fc\3\64\1"+
        "\u0201\6\64\1\u020b\20\64\1\u0223\26\64\1\u0242\3\64\5\uffff\1\u0246"+
        "\1\u0175\3\uffff\2\u00ab\4\uffff\6\64\2\uffff\2\64\1\u0254\4\64"+
        "\1\u0259\6\64\1\u0260\6\64\1\u0267\1\64\1\uffff\3\64\1\u026c\1\64"+
        "\1\uffff\1\64\1\uffff\3\64\1\uffff\1\64\1\uffff\1\u0275\1\uffff"+
        "\3\64\1\uffff\4\64\1\u027d\1\u027e\1\64\1\u0280\1\64\1\u0284\1\64"+
        "\1\u0286\1\u0287\1\64\1\u0289\6\64\1\u0290\1\uffff\10\64\1\u029a"+
        "\5\64\1\u02a0\1\u02a2\1\u02a4\3\64\1\uffff\6\64\1\u02b0\6\64\1\u02b8"+
        "\2\64\1\u02bb\3\64\1\u02c0\1\64\1\u02c2\1\uffff\2\64\1\u02c5\1\64"+
        "\1\u02c8\7\64\1\uffff\3\64\1\u02d3\1\uffff\1\u02d4\10\64\1\uffff"+
        "\10\64\1\u02e5\2\64\1\u02e8\5\64\1\u02f0\4\64\1\u02f5\1\uffff\1"+
        "\u02f6\22\64\1\u030a\2\64\1\u030d\1\u030e\1\64\1\u0310\1\u0311\3"+
        "\64\1\uffff\1\64\1\u0316\1\u0317\1\uffff\1\u00ab\1\64\1\uffff\1"+
        "\u00ab\11\64\1\uffff\1\u0321\3\64\1\uffff\5\64\1\u032b\1\uffff\2"+
        "\64\1\u032e\1\64\1\u0330\1\64\1\uffff\2\64\1\u0334\1\u0335\1\uffff"+
        "\1\u0336\1\u0337\1\64\1\u0339\4\64\1\uffff\1\u033e\1\64\1\u0340"+
        "\4\64\2\uffff\1\64\1\uffff\1\64\1\u0347\1\u0348\1\uffff\1\64\2\uffff"+
        "\1\u034a\1\uffff\1\u034b\5\64\1\uffff\1\u0353\1\u0355\2\64\1\u0358"+
        "\4\64\1\uffff\5\64\1\uffff\1\64\1\uffff\1\64\1\uffff\6\64\1\u036b"+
        "\1\u036c\3\64\1\uffff\7\64\1\uffff\1\64\1\u0378\1\uffff\1\u0379"+
        "\3\64\1\uffff\1\64\1\uffff\1\u037f\1\64\1\uffff\2\64\1\uffff\11"+
        "\64\1\u038c\2\uffff\1\64\1\u038f\1\u0390\15\64\1\uffff\1\64\1\u03a0"+
        "\1\uffff\6\64\1\u03a7\1\uffff\4\64\2\uffff\2\64\1\u03ae\1\u03af"+
        "\1\u03b0\16\64\1\uffff\1\u03bf\1\64\2\uffff\1\64\2\uffff\1\64\1"+
        "\u03c3\1\64\1\u03c5\2\uffff\4\64\1\u03ca\1\64\1\u03cc\1\u03cd\1"+
        "\64\1\uffff\10\64\1\u03d8\1\uffff\2\64\1\uffff\1\u03db\1\uffff\1"+
        "\64\1\u03de\1\64\4\uffff\1\64\1\uffff\4\64\1\uffff\1\64\1\uffff"+
        "\1\64\1\u03e8\1\u03e9\1\64\1\u03eb\1\64\2\uffff\1\64\2\uffff\1\64"+
        "\1\u03ef\2\64\1\u03f2\2\64\1\uffff\1\64\1\uffff\1\u03f6\1\u03f7"+
        "\1\uffff\5\64\1\u03fd\2\64\1\u0400\11\64\2\uffff\1\64\1\u040b\1"+
        "\u040c\1\64\1\u040f\1\64\1\u0411\1\64\1\u0413\1\u0414\1\u0415\2"+
        "\uffff\1\u0416\2\64\1\u0419\1\64\1\uffff\1\u041b\1\64\1\u041d\1"+
        "\u041e\1\u041f\1\64\1\u0421\1\u0422\1\64\1\u0425\1\64\1\u0427\1"+
        "\uffff\2\64\2\uffff\3\64\1\u042d\6\64\1\u0434\1\u0435\3\64\1\uffff"+
        "\1\u0439\2\64\1\u043c\2\64\1\uffff\1\u0440\1\u0441\1\u0442\1\64"+
        "\1\u0444\1\u0445\3\uffff\1\u0446\6\64\1\u044e\4\64\1\u0453\1\64"+
        "\1\uffff\1\u0455\2\64\1\uffff\1\64\1\uffff\4\64\1\uffff\1\u045d"+
        "\2\uffff\1\u045e\1\64\1\u0460\2\64\1\u0463\4\64\1\uffff\2\64\1\uffff"+
        "\2\64\1\uffff\2\64\1\u046e\1\u046f\4\64\1\u0474\2\uffff\1\u0475"+
        "\1\uffff\1\64\1\u0477\1\u0478\1\uffff\2\64\1\uffff\2\64\1\u047d"+
        "\2\uffff\1\64\1\u047f\3\64\1\uffff\2\64\1\uffff\5\64\1\u048a\4\64"+
        "\2\uffff\1\u048f\1\u0490\1\uffff\1\u0491\1\uffff\1\64\4\uffff\2"+
        "\64\1\uffff\1\64\1\uffff\1\64\3\uffff\1\64\2\uffff\1\64\1\u0499"+
        "\1\uffff\1\64\1\uffff\5\64\1\uffff\2\64\1\u04a2\3\64\2\uffff\2\64"+
        "\1\u04a8\1\uffff\1\64\1\u04aa\1\uffff\3\64\3\uffff\1\u04ae\3\uffff"+
        "\4\64\1\u04b3\1\u04b4\1\u04b5\1\uffff\2\64\1\u04ba\1\u04bb\1\uffff"+
        "\1\u04bc\1\uffff\1\u04bd\1\64\1\u04bf\1\64\1\u04c1\1\u04c2\1\u04c3"+
        "\2\uffff\1\64\1\uffff\1\u04c5\1\64\1\uffff\1\64\1\u04c8\4\64\1\u04ce"+
        "\2\64\1\u04d1\2\uffff\1\64\1\u04d3\2\64\2\uffff\1\u04d6\2\uffff"+
        "\2\64\1\u04d9\1\64\1\uffff\1\64\1\uffff\1\64\1\u04dd\1\64\1\u04df"+
        "\1\64\1\u04e2\1\u04e3\1\u04e4\1\64\1\u04e6\1\uffff\2\64\1\u04ea"+
        "\1\64\3\uffff\1\64\1\u04ed\5\64\1\uffff\1\u04f3\2\64\1\u04f6\4\64"+
        "\1\uffff\2\64\1\u04fd\2\64\1\uffff\1\u0500\1\uffff\2\64\1\u0503"+
        "\1\uffff\1\u0504\1\u0505\2\64\3\uffff\1\64\1\u0509\2\64\4\uffff"+
        "\1\64\1\uffff\1\u050e\3\uffff\1\u050f\1\uffff\1\u0510\1\u0511\1"+
        "\uffff\4\64\1\u0516\1\uffff\1\u0517\1\u0518\1\uffff\1\u0519\1\uffff"+
        "\2\64\1\uffff\2\64\1\uffff\1\u051f\2\64\1\uffff\1\u0522\1\uffff"+
        "\1\64\1\u0524\3\uffff\1\64\1\uffff\1\64\1\u0527\1\64\2\uffff\1\64"+
        "\1\uffff\5\64\1\uffff\1\64\1\u0530\1\uffff\1\u0531\1\u0532\1\64"+
        "\1\u0534\1\64\1\u0536\1\uffff\1\u0539\1\64\1\uffff\2\64\3\uffff"+
        "\3\64\1\uffff\1\u0540\3\64\4\uffff\1\u0544\2\64\1\u0547\4\uffff"+
        "\5\64\1\uffff\1\64\1\u054e\1\uffff\1\u054f\1\uffff\1\u0550\1\64"+
        "\1\uffff\6\64\1\u0558\1\u0559\3\uffff\1\64\1\uffff\1\u055b\1\uffff"+
        "\1\64\1\u055d\1\uffff\5\64\1\u0563\1\uffff\3\64\1\uffff\1\u0567"+
        "\1\64\1\uffff\2\64\1\u056b\1\u056c\2\64\3\uffff\1\u056f\5\64\1\u0575"+
        "\2\uffff\1\64\1\uffff\1\u0577\1\uffff\1\u0578\2\64\1\u057b\1\64"+
        "\1\uffff\3\64\1\uffff\1\64\1\u0581\1\u0582\2\uffff\2\64\1\uffff"+
        "\1\u0585\1\u0586\2\64\1\u0589\1\uffff\1\u058a\2\uffff\1\u058b\1"+
        "\u058c\1\uffff\2\64\1\u058f\1\64\1\u0591\2\uffff\1\u0592\1\u0593"+
        "\2\uffff\1\u0594\1\64\4\uffff\1\u0596\1\u0597\1\uffff\1\64\4\uffff"+
        "\1\64\2\uffff\1\64\1\u059b\1\64\1\uffff\1\u059d\1\uffff";
    static final String DFA24_eofS =
        "\u059e\uffff";
    static final String DFA24_minS =
        "\1\11\1\114\2\101\1\104\1\106\1\117\1\75\1\101\1\104\1\101\2\105"+
        "\1\101\1\110\1\103\1\116\1\101\1\117\3\101\2\105\1\111\13\uffff"+
        "\2\75\2\uffff\1\55\7\uffff\2\0\2\56\3\uffff\1\103\1\101\1\103\1"+
        "\123\1\60\1\115\1\101\1\115\1\102\1\105\1\114\1\105\1\117\3\114"+
        "\1\124\1\117\1\124\1\114\1\104\1\103\1\60\1\101\1\105\1\60\1\124"+
        "\1\60\1\124\1\60\1\123\1\114\2\uffff\1\106\1\101\1\113\1\124\1\116"+
        "\2\60\1\120\1\105\1\130\1\60\1\103\1\125\1\117\1\124\1\122\1\120"+
        "\1\101\1\116\1\107\1\117\1\103\1\106\1\60\1\114\1\126\1\116\1\105"+
        "\1\106\2\101\1\114\1\122\1\105\1\101\1\110\1\114\1\104\1\105\1\101"+
        "\1\103\1\105\1\122\1\125\2\122\1\111\1\101\1\114\1\106\1\111\1\116"+
        "\1\107\2\101\1\117\1\102\1\105\1\123\1\103\1\122\1\103\1\116\1\131"+
        "\4\uffff\1\105\1\76\5\uffff\2\0\1\42\2\0\1\42\1\60\1\uffff\1\60"+
        "\1\56\1\60\1\53\4\60\1\110\1\105\1\114\1\123\2\60\1\102\1\101\1"+
        "\105\1\103\1\uffff\1\105\1\131\1\105\1\116\1\107\1\120\1\124\1\115"+
        "\1\114\1\116\1\120\1\105\1\123\1\114\1\101\1\103\1\114\1\60\1\114"+
        "\1\123\1\103\1\115\1\105\1\60\1\105\1\60\2\101\1\110\1\60\1\uffff"+
        "\1\114\1\60\1\122\1\60\1\105\1\uffff\1\60\1\114\1\uffff\1\111\1"+
        "\uffff\1\103\1\104\1\60\1\114\1\124\1\107\1\123\1\101\1\111\1\104"+
        "\1\107\2\105\1\111\1\105\1\117\1\101\1\60\3\105\2\uffff\1\117\1"+
        "\115\1\120\1\uffff\1\111\1\105\1\103\2\105\1\116\1\102\1\120\2\101"+
        "\1\105\1\60\1\122\1\125\1\116\1\105\1\111\1\101\1\110\1\114\1\113"+
        "\1\127\1\117\1\uffff\1\104\1\111\1\110\1\104\1\116\1\114\1\106\1"+
        "\114\1\127\1\122\1\60\1\104\1\105\1\111\1\125\1\124\1\127\1\105"+
        "\1\122\1\124\1\105\1\60\1\124\1\101\1\116\1\60\2\117\1\105\1\122"+
        "\2\117\1\60\2\103\1\124\1\123\1\103\1\107\1\116\1\125\1\124\1\101"+
        "\1\117\1\104\1\101\1\105\1\117\1\125\1\60\1\105\1\111\1\113\1\107"+
        "\1\110\1\116\1\103\1\122\1\115\2\114\2\123\1\122\1\105\1\123\1\101"+
        "\1\103\1\113\2\105\1\122\1\60\1\125\1\123\1\127\2\uffff\1\0\1\uffff"+
        "\1\0\2\60\2\uffff\3\60\1\53\3\uffff\1\125\1\101\1\116\1\122\1\101"+
        "\1\124\2\uffff\1\114\1\120\1\60\1\110\1\123\1\111\1\103\1\60\1\123"+
        "\1\107\1\117\1\106\1\111\1\105\1\60\1\122\1\106\1\124\1\104\2\124"+
        "\1\60\1\101\1\uffff\1\117\1\105\1\110\1\60\1\122\1\uffff\1\122\1"+
        "\uffff\1\103\1\131\1\111\1\uffff\1\131\1\uffff\1\60\1\uffff\1\122"+
        "\1\125\1\122\1\uffff\1\111\1\117\1\101\1\122\2\60\1\124\1\60\1\114"+
        "\1\60\1\103\2\60\1\123\1\60\1\124\2\122\2\124\1\122\1\60\1\uffff"+
        "\1\122\1\130\2\122\1\123\1\122\1\115\1\116\1\60\1\115\1\124\1\122"+
        "\1\123\1\114\3\60\1\101\1\102\1\103\1\uffff\1\117\1\120\1\124\1"+
        "\122\1\116\1\122\1\60\3\105\1\122\1\137\1\116\1\60\1\117\1\105\1"+
        "\60\1\105\1\111\1\114\1\60\1\105\1\60\1\uffff\1\105\1\103\1\60\1"+
        "\105\1\60\1\105\1\103\1\101\1\116\1\105\1\111\1\115\1\uffff\1\122"+
        "\1\124\1\107\1\60\1\uffff\1\60\1\125\1\116\1\124\1\107\1\103\1\125"+
        "\1\103\1\124\1\uffff\5\105\1\111\1\124\1\111\1\60\2\105\1\60\1\103"+
        "\1\122\1\101\1\111\1\122\1\60\1\115\1\130\1\113\1\111\1\60\1\uffff"+
        "\1\60\1\125\1\114\2\105\1\124\1\107\2\101\1\105\1\125\1\105\1\115"+
        "\2\105\1\124\1\105\1\117\1\105\1\60\1\123\1\124\2\60\1\101\2\60"+
        "\1\122\2\117\1\uffff\1\123\2\60\1\uffff\1\60\1\104\2\60\1\123\1"+
        "\116\1\104\1\116\1\124\1\111\1\123\2\105\1\uffff\1\60\1\124\1\116"+
        "\1\101\1\uffff\1\106\1\105\1\122\1\111\1\116\1\60\1\uffff\2\117"+
        "\1\60\1\123\1\60\1\111\1\uffff\1\124\1\127\2\60\1\uffff\2\60\1\105"+
        "\1\60\1\126\1\132\1\122\1\101\1\uffff\1\60\1\124\1\60\3\116\1\117"+
        "\2\uffff\1\110\1\uffff\1\111\2\60\1\uffff\1\101\2\uffff\1\60\1\uffff"+
        "\1\60\1\101\1\105\1\104\1\110\1\123\1\uffff\2\60\2\124\1\60\1\117"+
        "\1\101\1\104\1\111\1\uffff\1\111\1\105\1\122\1\124\1\105\1\uffff"+
        "\1\101\1\uffff\1\111\1\uffff\1\116\1\111\1\116\1\114\1\124\1\120"+
        "\2\60\1\101\1\124\1\131\1\uffff\1\101\1\124\2\105\1\104\1\107\1"+
        "\116\1\uffff\1\127\1\60\1\uffff\1\60\1\130\1\111\1\104\1\uffff\1"+
        "\104\1\uffff\1\60\1\124\1\uffff\1\116\1\104\1\uffff\1\104\1\124"+
        "\1\115\1\107\1\104\1\123\1\101\2\105\1\60\2\uffff\1\105\2\60\1\116"+
        "\1\110\1\116\1\113\1\115\1\104\2\103\1\104\1\122\1\130\1\131\1\101"+
        "\1\uffff\1\116\1\60\1\uffff\1\105\1\111\1\103\1\122\1\104\1\116"+
        "\1\60\1\uffff\1\105\1\120\1\105\1\114\2\uffff\1\120\1\105\3\60\1"+
        "\105\1\116\1\111\1\124\1\123\1\124\2\116\1\103\1\123\1\105\1\123"+
        "\1\122\1\116\1\uffff\1\60\1\105\2\uffff\1\104\2\uffff\1\111\1\60"+
        "\1\111\1\60\2\uffff\1\111\1\107\1\105\1\101\1\60\1\116\2\60\1\104"+
        "\1\uffff\1\101\2\124\1\117\1\122\1\101\1\114\1\101\1\60\1\uffff"+
        "\1\120\1\122\1\uffff\1\60\1\uffff\1\117\1\60\1\111\4\uffff\1\116"+
        "\1\uffff\2\105\1\111\1\120\1\uffff\1\104\1\uffff\1\105\2\60\1\120"+
        "\1\60\1\117\2\uffff\1\114\2\uffff\1\114\1\60\1\122\1\117\1\60\1"+
        "\101\1\105\1\uffff\1\123\1\uffff\2\60\1\uffff\1\120\1\114\1\105"+
        "\1\102\1\124\1\60\1\105\1\122\1\60\1\123\1\115\1\103\1\102\1\103"+
        "\1\105\1\117\1\105\1\116\2\uffff\1\124\2\60\1\116\1\60\1\116\1\60"+
        "\1\104\3\60\2\uffff\1\60\1\116\1\101\1\60\1\122\1\uffff\1\60\1\103"+
        "\3\60\1\124\2\60\1\124\1\60\1\101\1\60\1\uffff\1\112\1\131\2\uffff"+
        "\1\105\1\111\1\104\1\60\1\105\1\125\2\124\1\111\1\126\2\60\1\111"+
        "\1\114\1\124\1\uffff\1\60\1\103\1\105\1\60\1\122\1\114\1\uffff\3"+
        "\60\1\104\2\60\3\uffff\1\60\1\125\1\116\1\105\1\120\1\105\1\124"+
        "\1\60\1\124\1\103\1\122\1\124\1\60\1\124\1\uffff\1\60\1\105\1\101"+
        "\1\uffff\1\116\1\uffff\1\126\1\105\1\104\1\114\1\uffff\1\60\2\uffff"+
        "\1\60\1\115\1\60\1\105\1\122\1\60\1\122\1\105\1\124\1\115\1\uffff"+
        "\1\105\1\115\1\uffff\1\116\1\105\1\uffff\1\116\1\124\2\60\1\124"+
        "\1\123\1\122\1\117\1\60\2\uffff\1\60\1\uffff\1\116\2\60\1\uffff"+
        "\1\111\1\122\1\uffff\1\114\1\103\1\60\2\uffff\1\105\1\60\1\116\2"+
        "\105\1\uffff\1\104\1\105\1\uffff\3\105\1\125\1\124\1\60\2\122\1"+
        "\107\1\105\2\uffff\2\60\1\uffff\1\60\1\uffff\1\114\4\uffff\2\124"+
        "\1\uffff\1\117\1\uffff\1\105\3\uffff\1\101\2\uffff\1\111\1\60\1"+
        "\uffff\1\115\1\uffff\1\117\1\120\1\104\1\126\1\105\1\uffff\1\123"+
        "\1\122\1\60\1\111\1\116\1\105\2\uffff\1\117\1\123\1\60\1\uffff\1"+
        "\124\1\60\1\uffff\1\122\1\105\1\131\3\uffff\1\60\3\uffff\1\105\1"+
        "\123\1\116\1\117\3\60\1\uffff\1\111\1\105\2\60\1\uffff\1\60\1\uffff"+
        "\1\60\1\114\1\60\1\105\3\60\2\uffff\1\120\1\uffff\1\60\1\115\1\uffff"+
        "\1\131\1\60\1\105\1\120\1\122\1\101\1\60\1\104\1\107\1\60\2\uffff"+
        "\1\105\1\60\1\111\1\122\2\uffff\1\60\2\uffff\1\126\1\115\1\60\1"+
        "\124\1\uffff\1\122\1\uffff\1\103\1\60\1\104\1\60\1\101\3\60\1\124"+
        "\1\60\1\uffff\1\111\1\124\1\60\1\40\3\uffff\1\124\1\60\1\101\1\120"+
        "\1\106\1\102\1\103\1\uffff\1\60\1\111\1\105\1\60\1\105\1\104\1\124"+
        "\1\105\1\uffff\1\117\1\107\1\60\1\116\1\103\1\uffff\1\60\1\uffff"+
        "\1\111\1\101\1\60\1\uffff\2\60\1\101\1\116\3\uffff\1\117\1\60\1"+
        "\104\1\124\4\uffff\1\111\1\uffff\1\60\3\uffff\1\60\1\uffff\2\60"+
        "\1\uffff\1\104\1\114\2\124\1\60\1\uffff\2\60\1\uffff\1\60\1\uffff"+
        "\1\126\1\115\1\uffff\1\105\1\101\1\uffff\1\60\1\124\1\131\1\uffff"+
        "\1\60\1\uffff\1\115\1\60\3\uffff\1\105\1\uffff\1\105\1\60\1\111"+
        "\2\uffff\1\111\1\uffff\1\102\1\105\1\111\1\114\1\123\1\uffff\1\116"+
        "\1\60\1\uffff\2\60\1\101\1\60\1\116\1\60\1\uffff\1\60\1\101\1\uffff"+
        "\1\124\1\104\3\uffff\1\124\1\104\1\116\1\uffff\1\60\1\101\1\132"+
        "\1\105\4\uffff\1\60\1\105\1\111\1\60\4\uffff\1\105\1\101\1\122\1"+
        "\124\1\117\1\uffff\1\111\1\60\1\uffff\1\60\1\uffff\1\60\1\123\1"+
        "\uffff\1\105\1\115\1\101\1\122\1\114\1\105\2\60\3\uffff\1\115\1"+
        "\uffff\1\60\1\uffff\1\104\1\60\1\uffff\1\116\3\105\1\111\1\60\1"+
        "\uffff\1\124\1\105\1\123\1\uffff\1\60\1\105\1\uffff\1\122\1\124"+
        "\2\60\1\111\1\105\3\uffff\1\60\1\123\1\105\1\123\1\124\1\105\1\60"+
        "\2\uffff\1\120\1\uffff\1\60\1\uffff\1\60\2\122\1\60\1\116\1\uffff"+
        "\1\125\1\104\1\123\1\uffff\1\123\2\60\2\uffff\1\116\1\123\1\uffff"+
        "\2\60\1\105\1\111\1\60\1\uffff\1\60\2\uffff\2\60\1\uffff\1\107\1"+
        "\123\1\60\1\112\1\60\2\uffff\2\60\2\uffff\1\60\1\105\4\uffff\2\60"+
        "\1\uffff\1\117\4\uffff\1\123\2\uffff\1\111\1\60\1\116\1\uffff\1"+
        "\60\1\uffff";
    static final String DFA24_maxS =
        "\1\176\1\130\1\122\1\125\1\123\1\126\1\125\1\75\1\117\1\124\2\122"+
        "\1\131\1\117\1\111\1\125\1\124\1\125\2\117\1\125\1\123\1\105\1\126"+
        "\1\111\13\uffff\1\76\1\75\2\uffff\1\55\7\uffff\2\ufffe\2\172\3\uffff"+
        "\1\124\1\104\1\103\1\123\1\172\1\116\1\125\1\130\1\102\1\105\1\114"+
        "\1\122\1\117\1\116\1\122\1\114\1\124\1\117\2\124\1\112\1\122\1\172"+
        "\1\104\1\105\1\172\1\124\1\172\1\124\1\172\1\137\1\114\2\uffff\1"+
        "\123\2\116\1\124\1\116\2\172\1\120\1\105\1\130\1\172\1\123\1\127"+
        "\1\117\1\124\1\126\1\120\1\117\2\116\1\124\1\103\1\124\1\172\1\114"+
        "\1\126\1\124\1\111\1\106\1\101\1\117\1\124\1\122\1\105\1\122\1\110"+
        "\1\114\1\123\1\111\1\123\1\103\1\117\1\122\1\125\2\122\1\111\1\126"+
        "\1\127\1\106\1\111\1\116\1\107\1\101\1\122\1\125\1\122\1\117\1\123"+
        "\1\103\1\122\1\124\1\116\1\131\4\uffff\1\105\1\76\5\uffff\2\ufffe"+
        "\1\47\2\ufffe\1\47\1\146\1\uffff\3\172\1\71\1\145\3\172\1\114\1"+
        "\105\1\117\1\123\2\172\1\102\1\101\1\105\1\103\1\uffff\1\105\1\131"+
        "\2\116\1\107\1\120\1\124\1\115\1\114\1\116\1\120\1\105\1\123\1\114"+
        "\1\101\1\103\1\114\1\172\1\114\1\123\1\103\1\115\1\105\1\172\1\105"+
        "\1\172\2\101\1\110\1\172\1\uffff\1\114\1\172\1\122\1\172\1\105\1"+
        "\uffff\1\172\1\114\1\uffff\1\111\1\uffff\1\103\1\104\1\172\1\114"+
        "\1\124\1\107\1\123\1\113\1\111\1\104\1\107\2\105\1\111\1\105\1\117"+
        "\1\125\1\172\3\105\2\uffff\1\117\1\115\1\120\1\uffff\1\111\1\105"+
        "\1\103\1\111\1\105\1\116\1\102\1\120\1\105\1\124\1\105\1\172\1\122"+
        "\1\125\1\116\1\105\1\111\1\101\1\110\1\114\1\113\1\127\1\117\1\uffff"+
        "\1\104\1\111\1\110\1\104\1\122\1\114\1\106\1\114\1\127\1\122\1\172"+
        "\1\104\1\105\1\111\1\125\1\124\1\127\1\125\1\122\1\124\1\105\1\172"+
        "\1\124\1\101\1\116\1\172\1\117\1\121\1\111\1\122\2\117\1\172\3\124"+
        "\1\123\1\103\1\107\1\116\1\125\1\124\1\114\1\117\1\104\1\101\1\105"+
        "\1\117\1\125\1\172\1\114\1\111\1\113\1\107\1\110\1\116\1\124\1\122"+
        "\1\120\1\125\1\114\3\123\1\105\1\123\1\101\1\124\1\113\2\105\1\122"+
        "\1\172\1\125\1\123\1\127\2\uffff\1\ufffe\1\uffff\1\ufffe\2\172\2"+
        "\uffff\1\71\1\172\1\145\1\71\3\uffff\1\125\1\101\2\122\1\101\1\124"+
        "\2\uffff\1\114\1\120\1\172\1\110\1\123\1\111\1\103\1\172\1\123\1"+
        "\107\1\117\1\106\1\111\1\105\1\172\1\122\1\106\1\124\1\104\2\124"+
        "\1\172\1\101\1\uffff\1\117\1\105\1\110\1\172\1\122\1\uffff\1\122"+
        "\1\uffff\1\103\1\131\1\111\1\uffff\1\131\1\uffff\1\172\1\uffff\1"+
        "\122\1\125\1\122\1\uffff\1\111\1\117\1\101\1\122\2\172\1\124\1\172"+
        "\1\124\1\172\1\103\2\172\1\123\1\172\1\124\2\122\2\124\1\122\1\172"+
        "\1\uffff\1\122\1\130\2\122\1\123\1\122\1\115\1\116\1\172\1\115\1"+
        "\124\1\122\1\123\1\114\3\172\1\122\1\102\1\103\1\uffff\1\117\1\120"+
        "\1\124\1\122\1\116\1\122\1\172\3\105\1\122\1\137\1\116\1\172\1\117"+
        "\1\105\1\172\1\105\1\111\1\114\1\172\1\105\1\172\1\uffff\1\105\1"+
        "\103\1\172\1\105\1\172\1\105\1\103\1\101\1\116\1\105\1\111\1\115"+
        "\1\uffff\1\122\1\124\1\107\1\172\1\uffff\1\172\1\125\1\116\1\124"+
        "\1\107\1\103\1\125\1\103\1\124\1\uffff\5\105\1\111\1\124\1\111\1"+
        "\172\2\105\1\172\1\103\1\122\1\101\1\111\1\122\1\172\1\115\1\130"+
        "\1\113\1\111\1\172\1\uffff\1\172\1\125\1\114\2\105\1\124\1\107\1"+
        "\111\1\101\1\105\1\125\1\105\1\115\2\105\1\124\1\105\1\117\1\105"+
        "\1\172\1\123\1\124\2\172\1\101\2\172\1\122\2\117\1\uffff\1\123\2"+
        "\172\1\uffff\1\102\1\104\1\71\1\102\1\123\1\116\1\104\1\116\1\124"+
        "\1\111\1\123\2\105\1\uffff\1\172\1\124\1\116\1\101\1\uffff\1\106"+
        "\1\105\1\122\1\111\1\116\1\172\1\uffff\2\117\1\172\1\123\1\172\1"+
        "\111\1\uffff\1\124\1\127\2\172\1\uffff\2\172\1\105\1\172\1\126\1"+
        "\132\1\122\1\101\1\uffff\1\172\1\124\1\172\3\116\1\117\2\uffff\1"+
        "\110\1\uffff\1\111\2\172\1\uffff\1\101\2\uffff\1\172\1\uffff\1\172"+
        "\1\101\1\105\1\106\1\110\1\126\1\uffff\2\172\2\124\1\172\1\117\1"+
        "\101\1\104\1\111\1\uffff\1\111\1\105\1\122\1\124\1\105\1\uffff\1"+
        "\101\1\uffff\1\111\1\uffff\1\116\1\111\1\116\1\114\1\124\1\120\2"+
        "\172\1\101\1\124\1\131\1\uffff\1\101\1\124\2\105\1\104\1\107\1\116"+
        "\1\uffff\1\127\1\172\1\uffff\1\172\1\130\1\111\1\104\1\uffff\1\104"+
        "\1\uffff\1\172\1\124\1\uffff\1\116\1\104\1\uffff\1\104\1\124\1\115"+
        "\1\107\1\104\1\123\1\101\2\105\1\172\2\uffff\1\105\2\172\1\116\1"+
        "\110\1\116\1\113\1\115\1\104\2\103\1\104\1\122\1\130\1\131\1\124"+
        "\1\uffff\1\116\1\172\1\uffff\1\105\1\111\1\103\1\122\1\104\1\116"+
        "\1\172\1\uffff\1\105\1\120\1\105\1\114\2\uffff\1\120\1\105\3\172"+
        "\1\105\1\116\1\111\1\124\1\123\1\124\2\116\1\103\1\123\1\105\1\123"+
        "\1\122\1\116\1\uffff\1\172\1\105\2\uffff\1\104\2\uffff\1\111\1\172"+
        "\1\111\1\172\2\uffff\1\111\1\107\1\105\1\101\1\172\1\116\2\172\1"+
        "\104\1\uffff\1\101\2\124\1\117\1\122\1\101\1\114\1\101\1\172\1\uffff"+
        "\1\120\1\122\1\uffff\1\172\1\uffff\1\117\1\172\1\111\4\uffff\1\116"+
        "\1\uffff\2\105\1\111\1\120\1\uffff\1\106\1\uffff\1\105\2\172\1\120"+
        "\1\172\1\117\2\uffff\1\114\2\uffff\1\114\1\172\1\122\1\117\1\172"+
        "\1\101\1\105\1\uffff\1\123\1\uffff\2\172\1\uffff\1\120\1\114\1\105"+
        "\1\102\1\124\1\172\1\105\1\122\1\172\1\123\1\115\1\103\1\102\1\103"+
        "\1\105\1\117\1\105\1\116\2\uffff\1\124\2\172\1\116\1\172\1\116\1"+
        "\172\1\104\3\172\2\uffff\1\172\1\116\1\101\1\172\1\122\1\uffff\1"+
        "\172\1\103\3\172\1\124\2\172\1\124\1\172\1\101\1\172\1\uffff\1\112"+
        "\1\131\2\uffff\1\105\1\111\1\104\1\172\1\105\1\125\2\124\1\111\1"+
        "\126\2\172\1\111\1\114\1\124\1\uffff\1\172\1\103\1\105\1\172\1\127"+
        "\1\114\1\uffff\3\172\1\104\2\172\3\uffff\1\172\1\125\1\116\1\105"+
        "\1\120\1\105\1\124\1\172\1\124\1\103\1\122\1\124\1\172\1\124\1\uffff"+
        "\1\172\1\105\1\101\1\uffff\1\116\1\uffff\1\126\1\105\1\104\1\114"+
        "\1\uffff\1\172\2\uffff\1\172\1\115\1\172\1\105\1\122\1\172\1\122"+
        "\1\105\1\124\1\115\1\uffff\1\105\1\115\1\uffff\1\116\1\105\1\uffff"+
        "\1\116\1\124\2\172\1\124\1\123\1\122\1\117\1\172\2\uffff\1\172\1"+
        "\uffff\1\116\2\172\1\uffff\1\111\1\122\1\uffff\1\114\1\103\1\172"+
        "\2\uffff\1\105\1\172\1\116\2\105\1\uffff\1\104\1\105\1\uffff\3\105"+
        "\1\125\1\124\1\172\2\122\1\107\1\105\2\uffff\2\172\1\uffff\1\172"+
        "\1\uffff\1\114\4\uffff\2\124\1\uffff\1\117\1\uffff\1\105\3\uffff"+
        "\1\101\2\uffff\1\111\1\172\1\uffff\1\115\1\uffff\1\117\1\120\1\104"+
        "\1\126\1\105\1\uffff\1\123\1\122\1\172\1\111\1\116\1\105\2\uffff"+
        "\1\117\1\123\1\172\1\uffff\1\124\1\172\1\uffff\1\122\1\105\1\131"+
        "\3\uffff\1\172\3\uffff\1\105\1\123\1\116\1\117\3\172\1\uffff\1\111"+
        "\1\105\2\172\1\uffff\1\172\1\uffff\1\172\1\114\1\172\1\105\3\172"+
        "\2\uffff\1\120\1\uffff\1\172\1\115\1\uffff\1\131\1\172\1\105\1\120"+
        "\1\122\1\101\1\172\1\104\1\107\1\172\2\uffff\1\105\1\172\1\111\1"+
        "\122\2\uffff\1\172\2\uffff\1\126\1\115\1\172\1\124\1\uffff\1\122"+
        "\1\uffff\1\103\1\172\1\104\1\172\1\101\3\172\1\124\1\172\1\uffff"+
        "\1\131\1\124\1\172\1\40\3\uffff\1\124\1\172\1\101\1\120\1\106\1"+
        "\102\1\103\1\uffff\1\172\1\111\1\105\1\172\1\105\1\104\1\124\1\105"+
        "\1\uffff\1\117\1\107\1\172\1\116\1\103\1\uffff\1\172\1\uffff\1\111"+
        "\1\101\1\172\1\uffff\2\172\1\101\1\116\3\uffff\1\117\1\172\1\104"+
        "\1\124\4\uffff\1\111\1\uffff\1\172\3\uffff\1\172\1\uffff\2\172\1"+
        "\uffff\1\104\1\114\2\124\1\172\1\uffff\2\172\1\uffff\1\172\1\uffff"+
        "\1\126\1\115\1\uffff\1\105\1\101\1\uffff\1\172\1\124\1\131\1\uffff"+
        "\1\172\1\uffff\1\115\1\172\3\uffff\1\105\1\uffff\1\105\1\172\1\111"+
        "\2\uffff\1\111\1\uffff\1\102\1\105\1\111\1\114\1\123\1\uffff\1\116"+
        "\1\172\1\uffff\2\172\1\101\1\172\1\116\1\172\1\uffff\1\172\1\101"+
        "\1\uffff\1\124\1\104\3\uffff\1\124\1\104\1\116\1\uffff\1\172\1\101"+
        "\1\132\1\105\4\uffff\1\172\1\105\1\111\1\172\4\uffff\1\105\1\101"+
        "\1\122\1\124\1\117\1\uffff\1\111\1\172\1\uffff\1\172\1\uffff\1\172"+
        "\1\123\1\uffff\1\105\1\115\1\101\1\122\1\114\1\105\2\172\3\uffff"+
        "\1\115\1\uffff\1\172\1\uffff\1\104\1\172\1\uffff\1\116\3\105\1\111"+
        "\1\172\1\uffff\1\124\1\105\1\123\1\uffff\1\172\1\105\1\uffff\1\122"+
        "\1\124\2\172\1\111\1\105\3\uffff\1\172\1\123\1\105\1\123\1\124\1"+
        "\105\1\172\2\uffff\1\120\1\uffff\1\172\1\uffff\1\172\2\122\1\172"+
        "\1\116\1\uffff\1\125\1\104\1\123\1\uffff\1\123\2\172\2\uffff\1\116"+
        "\1\123\1\uffff\2\172\1\105\1\111\1\172\1\uffff\1\172\2\uffff\2\172"+
        "\1\uffff\1\107\1\123\1\172\1\112\1\172\2\uffff\2\172\2\uffff\1\172"+
        "\1\105\4\uffff\2\172\1\uffff\1\117\4\uffff\1\123\2\uffff\1\111\1"+
        "\172\1\116\1\uffff\1\172\1\uffff";
    static final String DFA24_acceptS =
        "\31\uffff\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109"+
        "\1\u010a\1\u010b\1\u010c\1\u010d\2\uffff\1\u0114\1\u0115\1\uffff"+
        "\1\u0117\1\u0118\1\u011a\1\u011b\1\u011c\1\u011d\1\u011e\4\uffff"+
        "\1\u0128\1\u0129\1\u012a\40\uffff\1\u010f\1\7\100\uffff\1\151\1"+
        "\u0099\1\u0098\1\u011f\2\uffff\1\u0111\1\u0112\1\u0113\1\u012b\1"+
        "\u0116\7\uffff\1\u0127\22\uffff\1\107\36\uffff\1\23\5\uffff\1\6"+
        "\2\uffff\1\176\1\uffff\1\37\25\uffff\1\u00ac\1\71\3\uffff\1\11\27"+
        "\uffff\1\17\114\uffff\1\u010e\1\u0110\1\uffff\1\u0120\3\uffff\1"+
        "\u0126\1\u0122\4\uffff\1\u0125\1\u0124\1\u0123\6\uffff\1\u009e\1"+
        "\1\27\uffff\1\u00df\5\uffff\1\4\1\uffff\1\u0081\3\uffff\1\13\1\uffff"+
        "\1\5\1\uffff\1\160\3\uffff\1\175\26\uffff\1\114\24\uffff\1\u0119"+
        "\27\uffff\1\u0094\14\uffff\1\u00b4\4\uffff\1\u00d4\11\uffff\1\u00a3"+
        "\27\uffff\1\137\36\uffff\1\127\3\uffff\1\u0121\15\uffff\1\u009d"+
        "\4\uffff\1\2\6\uffff\1\u009c\6\uffff\1\36\4\uffff\1\22\10\uffff"+
        "\1\u00e7\7\uffff\1\72\1\34\1\uffff\1\u00e5\3\uffff\1\u00b6\1\uffff"+
        "\1\64\1\u00a5\1\uffff\1\10\6\uffff\1\135\11\uffff\1\14\5\uffff\1"+
        "\103\1\uffff\1\67\1\uffff\1\120\13\uffff\1\u00c5\7\uffff\1\u008f"+
        "\2\uffff\1\u009b\4\uffff\1\51\1\uffff\1\u00e9\2\uffff\1\u00cd\2"+
        "\uffff\1\62\12\uffff\1\u00ed\1\u00b5\20\uffff\1\u00a7\2\uffff\1"+
        "\33\7\uffff\1\u00be\4\uffff\1\140\1\u00ee\23\uffff\1\u00dd\2\uffff"+
        "\1\u009a\1\u0080\1\uffff\1\52\1\u00e6\4\uffff\1\150\1\u00ab\11\uffff"+
        "\1\u00cf\11\uffff\1\42\2\uffff\1\100\1\uffff\1\116\3\uffff\1\3\1"+
        "\u00a9\1\101\1\75\1\uffff\1\125\4\uffff\1\15\1\uffff\1\30\6\uffff"+
        "\1\55\1\u00b7\1\uffff\1\152\1\u0093\7\uffff\1\u00ef\1\uffff\1\45"+
        "\2\uffff\1\147\22\uffff\1\16\1\u00b2\13\uffff\1\21\1\u00bd\5\uffff"+
        "\1\u008e\14\uffff\1\57\2\uffff\1\63\1\u0095\17\uffff\1\u00c0\6\uffff"+
        "\1\u00bf\6\uffff\1\u0083\1\u00c1\1\35\16\uffff\1\u00c7\3\uffff\1"+
        "\u0087\1\uffff\1\u00a8\4\uffff\1\65\1\uffff\1\12\1\166\12\uffff"+
        "\1\43\2\uffff\1\143\2\uffff\1\141\11\uffff\1\u00d5\1\u00eb\1\uffff"+
        "\1\u00fc\3\uffff\1\105\2\uffff\1\70\3\uffff\1\26\1\66\5\uffff\1"+
        "\u00a6\2\uffff\1\117\12\uffff\1\115\1\u00c6\2\uffff\1\174\1\uffff"+
        "\1\u00c3\1\uffff\1\20\1\u00f6\1\u00e0\1\u00f8\2\uffff\1\u00b9\1"+
        "\uffff\1\24\1\uffff\1\134\1\u00db\1\126\1\uffff\1\124\1\153\2\uffff"+
        "\1\u00b0\1\uffff\1\u00d8\5\uffff\1\u00b8\6\uffff\1\u00f7\1\u008b"+
        "\3\uffff\1\131\2\uffff\1\53\3\uffff\1\104\1\u0084\1\u00b3\1\uffff"+
        "\1\u00dc\1\157\1\76\7\uffff\1\77\4\uffff\1\u00c9\1\uffff\1\73\7"+
        "\uffff\1\u0088\1\145\1\uffff\1\112\2\uffff\1\u00ca\12\uffff\1\u00d0"+
        "\1\u00c2\4\uffff\1\165\1\171\1\uffff\1\u008d\1\u00ce\4\uffff\1\46"+
        "\1\uffff\1\123\12\uffff\1\167\4\uffff\1\111\1\136\1\u00c4\7\uffff"+
        "\1\u00b1\10\uffff\1\u0101\5\uffff\1\177\1\uffff\1\u0082\3\uffff"+
        "\1\47\4\uffff\1\u00d2\1\110\1\44\4\uffff\1\60\1\u00fd\1\u00e4\1"+
        "\u00da\1\uffff\1\u009f\1\uffff\1\u00f0\1\u0089\1\74\1\uffff\1\u00ea"+
        "\2\uffff\1\156\5\uffff\1\u0086\2\uffff\1\u00f2\1\uffff\1\u00f4\2"+
        "\uffff\1\172\2\uffff\1\u00f1\3\uffff\1\102\1\uffff\1\u0090\2\uffff"+
        "\1\u00ad\1\121\1\u0100\1\uffff\1\25\3\uffff\1\u00e8\1\u0102\1\uffff"+
        "\1\113\5\uffff\1\u00f9\2\uffff\1\u00bc\6\uffff\1\32\2\uffff\1\u00d9"+
        "\2\uffff\1\170\1\u00c8\1\u00f5\3\uffff\1\u00fb\4\uffff\1\u00ba\1"+
        "\122\1\56\1\u0085\4\uffff\1\50\1\u008a\1\u00e3\1\27\5\uffff\1\u00aa"+
        "\2\uffff\1\142\1\uffff\1\u00ae\2\uffff\1\54\10\uffff\1\130\1\u00d1"+
        "\1\u00e1\1\uffff\1\u00bb\1\uffff\1\u00e2\2\uffff\1\40\6\uffff\1"+
        "\133\3\uffff\1\144\2\uffff\1\154\6\uffff\1\u008c\1\u00fa\1\61\7"+
        "\uffff\1\u00d3\1\31\1\uffff\1\106\1\uffff\1\41\5\uffff\1\146\3\uffff"+
        "\1\173\3\uffff\1\163\1\161\2\uffff\1\u00de\5\uffff\1\u00a0\1\uffff"+
        "\1\132\1\u00ec\2\uffff\1\u00d6\5\uffff\1\164\1\162\2\uffff\1\u0092"+
        "\1\u00a1\2\uffff\1\155\1\u00a4\1\u00cc\1\u00cb\2\uffff\1\u00af\1"+
        "\uffff\1\u0096\1\u00ff\1\u0097\1\u00d7\1\uffff\1\u00f3\1\u00a2\3"+
        "\uffff\1\u0091\1\uffff\1\u00fe";
    static final String DFA24_specialS =
        "\u059e\uffff}>";
    static final String[] DFA24_transitionS = {
            "\2\66\2\uffff\1\66\22\uffff\1\66\1\7\1\61\1\uffff\1\27\1\52"+
            "\1\53\1\60\1\35\1\36\1\51\1\47\1\33\1\50\1\31\1\46\1\62\11\63"+
            "\1\32\1\34\1\44\1\43\1\45\1\57\1\uffff\1\4\1\14\1\24\1\12\1"+
            "\1\1\3\1\13\1\15\1\11\1\22\1\26\1\10\1\25\1\6\1\5\1\21\1\64"+
            "\1\23\1\17\1\2\1\20\1\30\1\16\3\64\1\37\1\uffff\1\40\1\56\1"+
            "\65\33\64\1\41\1\55\1\42\1\54",
            "\1\72\1\uffff\1\70\4\uffff\1\71\4\uffff\1\67",
            "\1\77\1\101\2\uffff\1\76\2\uffff\1\100\1\74\5\uffff\1\73\2\uffff"+
            "\1\75",
            "\1\106\3\uffff\1\107\3\uffff\1\102\2\uffff\1\103\2\uffff\1\105"+
            "\2\uffff\1\110\2\uffff\1\104",
            "\1\113\1\uffff\1\111\5\uffff\1\112\1\uffff\1\116\3\uffff\1\114"+
            "\1\115",
            "\1\122\7\uffff\1\124\1\uffff\1\123\1\uffff\1\120\2\uffff\1\121"+
            "\1\117",
            "\1\125\5\uffff\1\126",
            "\1\127",
            "\1\134\3\uffff\1\131\3\uffff\1\133\5\uffff\1\132",
            "\1\142\1\uffff\1\143\1\135\5\uffff\1\140\1\136\4\uffff\1\137"+
            "\1\141",
            "\1\147\1\151\2\uffff\1\144\3\uffff\1\150\5\uffff\1\145\2\uffff"+
            "\1\146",
            "\1\153\14\uffff\1\152",
            "\1\157\3\uffff\1\154\5\uffff\1\155\5\uffff\1\156\3\uffff\1\160",
            "\1\162\15\uffff\1\161",
            "\1\164\1\163",
            "\1\174\1\uffff\1\170\2\uffff\1\167\2\uffff\1\172\1\uffff\1\166"+
            "\1\uffff\1\171\3\uffff\1\175\1\173\1\165",
            "\1\u0080\1\uffff\1\176\2\uffff\1\177\1\u0081",
            "\1\u0083\3\uffff\1\u0085\6\uffff\1\u0084\5\uffff\1\u0082\2\uffff"+
            "\1\u0086",
            "\1\u0087",
            "\1\u008c\1\uffff\1\u008a\1\uffff\1\u0088\3\uffff\1\u008d\2\uffff"+
            "\1\u008b\2\uffff\1\u0089",
            "\1\u0093\6\uffff\1\u008e\3\uffff\1\u0090\2\uffff\1\u008f\2\uffff"+
            "\1\u0092\2\uffff\1\u0091",
            "\1\u0096\7\uffff\1\u0097\5\uffff\1\u0095\3\uffff\1\u0094",
            "\1\u0098",
            "\1\u009a\5\uffff\1\u0099\12\uffff\1\u009b",
            "\1\u009d",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009e\1\127",
            "\1\u00a0",
            "",
            "",
            "\1\u00a2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\47\u00a4\1\u00a6\64\u00a4\1\u00a5\uffa2\u00a4",
            "\42\u00a7\1\u00a9\71\u00a7\1\u00a8\uffa2\u00a7",
            "\1\u00b0\1\uffff\12\u00ad\7\uffff\1\64\1\u00ac\2\64\1\u00af"+
            "\1\64\1\u00b3\3\64\1\u00b3\1\u00ae\1\u00b3\5\64\1\u00b2\4\64"+
            "\1\u00aa\1\u00b1\1\64\4\uffff\1\64\1\uffff\1\64\1\u00b3\2\64"+
            "\1\u00af\1\64\1\u00b3\3\64\1\u00b3\1\64\1\u00b3\15\64",
            "\1\u00b0\1\uffff\12\u00ad\7\uffff\1\64\1\u00ac\2\64\1\u00af"+
            "\1\64\1\u00b3\3\64\1\u00b3\1\u00ae\1\u00b3\5\64\1\u00b2\5\64"+
            "\1\u00b1\1\64\4\uffff\1\64\1\uffff\1\64\1\u00b3\2\64\1\u00af"+
            "\1\64\1\u00b3\3\64\1\u00b3\1\64\1\u00b3\15\64",
            "",
            "",
            "",
            "\1\u00b4\5\uffff\1\u00b7\6\uffff\1\u00b6\3\uffff\1\u00b5",
            "\1\u00ba\1\uffff\1\u00b9\1\u00b8",
            "\1\u00bb",
            "\1\u00bc",
            "\12\64\7\uffff\24\64\1\u00bd\5\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00bf\1\u00c0",
            "\1\u00c2\7\uffff\1\u00c3\13\uffff\1\u00c1",
            "\1\u00c4\4\uffff\1\u00c6\5\uffff\1\u00c5",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00cc\6\uffff\1\u00ca\5\uffff\1\u00cb",
            "\1\u00cd",
            "\1\u00cf\1\uffff\1\u00ce",
            "\1\u00d1\5\uffff\1\u00d0",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6\7\uffff\1\u00d7",
            "\1\u00d8\5\uffff\1\u00d9",
            "\1\u00db\16\uffff\1\u00da",
            "\12\64\7\uffff\2\64\1\u00dc\27\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00de\2\uffff\1\u00df",
            "\1\u00e0",
            "\12\64\7\uffff\2\64\1\u00e1\1\u00e2\26\64\4\uffff\1\64\1\uffff"+
            "\32\64",
            "\1\u00e4",
            "\12\64\7\uffff\5\64\1\u00e5\24\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00e7",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00e9\1\u00eb\12\uffff\1\u00ea",
            "\1\u00ec",
            "",
            "",
            "\1\u00ed\7\uffff\1\u00ee\4\uffff\1\u00ef",
            "\1\u00f2\1\uffff\1\u00f0\3\uffff\1\u00f1\6\uffff\1\u00f3",
            "\1\u00f5\1\uffff\1\u00f6\1\u00f4",
            "\1\u00f7",
            "\1\u00f8",
            "\12\64\7\uffff\3\64\1\u00fc\11\64\1\u00fb\1\64\1\u00f9\2\64"+
            "\1\u00fd\1\u00fa\6\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0104\2\uffff\1\u0108\5\uffff\1\u0107\3\uffff\1\u0105\2\uffff"+
            "\1\u0106",
            "\1\u010a\1\uffff\1\u0109",
            "\1\u010b",
            "\1\u010c",
            "\1\u010e\1\u010d\2\uffff\1\u010f",
            "\1\u0110",
            "\1\u0112\15\uffff\1\u0111",
            "\1\u0113",
            "\1\u0114\6\uffff\1\u0115",
            "\1\u0117\4\uffff\1\u0116",
            "\1\u0118",
            "\1\u011a\15\uffff\1\u0119",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u011c",
            "\1\u011d",
            "\1\u011f\5\uffff\1\u011e",
            "\1\u0120\3\uffff\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0125\15\uffff\1\u0124",
            "\1\u0128\1\u0129\3\uffff\1\u012a\1\u0127\1\uffff\1\u0126",
            "\1\u012b",
            "\1\u012c",
            "\1\u012f\15\uffff\1\u012e\2\uffff\1\u012d",
            "\1\u0130",
            "\1\u0131",
            "\1\u0133\16\uffff\1\u0132",
            "\1\u0135\3\uffff\1\u0134",
            "\1\u0139\1\u013a\1\uffff\1\u0136\4\uffff\1\u0137\2\uffff\1\u013b"+
            "\6\uffff\1\u0138",
            "\1\u013c",
            "\1\u013e\11\uffff\1\u013d",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0148\1\u014c\1\u0147\1\u0144\2\uffff\1\u014a\6\uffff\1\u0149"+
            "\1\uffff\1\u0146\2\uffff\1\u0145\2\uffff\1\u014b",
            "\1\u014e\12\uffff\1\u014d",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0158\12\uffff\1\u0157\1\u0156\1\u0154\3\uffff\1\u0155",
            "\1\u015a\5\uffff\1\u0159",
            "\1\u015c\17\uffff\1\u015b",
            "\1\u015e\11\uffff\1\u015d",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0163\14\uffff\1\u0164\3\uffff\1\u0162",
            "\1\u0165",
            "\1\u0166",
            "",
            "",
            "",
            "",
            "\1\u0167",
            "\1\u0168",
            "",
            "",
            "",
            "",
            "",
            "\47\u00a4\1\u00a6\64\u00a4\1\u00a5\uffa2\u00a4",
            "\uffff\u016a",
            "\1\61\4\uffff\1\60",
            "\42\u00a7\1\u00a9\71\u00a7\1\u00a8\uffa2\u00a7",
            "\uffff\u016c",
            "\1\61\4\uffff\1\60",
            "\12\u016d\7\uffff\6\u016d\32\uffff\6\u016d",
            "",
            "\12\64\7\uffff\3\64\1\u016e\26\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00b0\1\uffff\12\u00ad\7\uffff\1\64\1\u00ac\2\64\1\u00af"+
            "\1\64\1\u00b3\3\64\1\u00b3\1\u00ae\1\u00b3\5\64\1\u00b2\5\64"+
            "\1\u00b1\1\64\4\uffff\1\64\1\uffff\1\64\1\u00b3\2\64\1\u00af"+
            "\1\64\1\u00b3\3\64\1\u00b3\1\64\1\u00b3\15\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0171\1\uffff\1\u0171\2\uffff\12\u0172",
            "\12\u0173\10\uffff\1\u0175\2\uffff\1\u0174\37\uffff\1\u0174",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0179\3\uffff\1\u0178",
            "\1\u017a",
            "\1\u017c\2\uffff\1\u017b",
            "\1\u017d",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "",
            "\1\u0184",
            "\1\u0185",
            "\1\u0187\10\uffff\1\u0186",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\12\64\7\uffff\14\64\1\u0196\15\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u019e",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u01a4",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01a6",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01a8",
            "",
            "\12\64\7\uffff\4\64\1\u01aa\12\64\1\u01a9\12\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\u01ac",
            "",
            "\1\u01ad",
            "",
            "\1\u01ae",
            "\1\u01af",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4\11\uffff\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01bf\23\uffff\1\u01be",
            "\12\64\7\uffff\4\64\1\u01c0\11\64\1\u01c1\13\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5",
            "",
            "",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cd\3\uffff\1\u01cc",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2\3\uffff\1\u01d3",
            "\1\u01d5\22\uffff\1\u01d4",
            "\1\u01d6",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e8\3\uffff\1\u01e7",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "\12\64\7\uffff\22\64\1\u01ee\7\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f7\3\uffff\1\u01f8\13\uffff\1\u01f6",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\12\64\7\uffff\21\64\1\u0200\10\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0202",
            "\1\u0204\1\uffff\1\u0203",
            "\1\u0205\3\uffff\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "\12\64\7\uffff\32\64\4\uffff\1\u020a\1\uffff\32\64",
            "\1\u020c\6\uffff\1\u020d\11\uffff\1\u020e",
            "\1\u020f\2\uffff\1\u0211\14\uffff\1\u0210\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021b\12\uffff\1\u021a",
            "\1\u021c",
            "\1\u021d",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\12\64\7\uffff\22\64\1\u0222\7\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0224\6\uffff\1\u0225",
            "\1\u0226",
            "\1\u0227",
            "\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "\1\u022c\20\uffff\1\u022b",
            "\1\u022d",
            "\1\u022f\2\uffff\1\u022e",
            "\1\u0231\10\uffff\1\u0230",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "\1\u0236\1\u0235",
            "\1\u0237",
            "\1\u0238",
            "\1\u0239",
            "\1\u023c\1\uffff\1\u023a\16\uffff\1\u023b",
            "\1\u023d",
            "\1\u023e",
            "\1\u023f",
            "\1\u0240",
            "\12\64\7\uffff\11\64\1\u0241\20\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0243",
            "\1\u0244",
            "\1\u0245",
            "",
            "",
            "\47\u00a4\1\u00a6\64\u00a4\1\u00a5\uffa2\u00a4",
            "",
            "\42\u00a7\1\u00a9\71\u00a7\1\u00a8\uffa2\u00a7",
            "\12\u016d\7\uffff\6\u016d\24\64\4\uffff\1\64\1\uffff\6\u016d"+
            "\24\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\u0247",
            "\12\u0172\7\uffff\1\64\1\u0248\30\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\12\u0173\10\uffff\1\u0175\2\uffff\1\u0174\37\uffff\1\u0174",
            "\1\u0249\1\uffff\1\u0249\2\uffff\12\u024a",
            "",
            "",
            "",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d\3\uffff\1\u024e",
            "\1\u024f",
            "\1\u0250",
            "\1\u0251",
            "",
            "",
            "\1\u0252",
            "\1\u0253",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0255",
            "\1\u0256",
            "\1\u0257",
            "\1\u0258",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u025a",
            "\1\u025b",
            "\1\u025c",
            "\1\u025d",
            "\1\u025e",
            "\1\u025f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0261",
            "\1\u0262",
            "\1\u0263",
            "\1\u0264",
            "\1\u0265",
            "\1\u0266",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0268",
            "",
            "\1\u0269",
            "\1\u026a",
            "\1\u026b",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u026d",
            "",
            "\1\u026e",
            "",
            "\1\u026f",
            "\1\u0270",
            "\1\u0271",
            "",
            "\1\u0272",
            "",
            "\12\64\7\uffff\13\64\1\u0274\12\64\1\u0273\3\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "",
            "\1\u0276",
            "\1\u0277",
            "\1\u0278",
            "",
            "\1\u0279",
            "\1\u027a",
            "\1\u027b",
            "\1\u027c",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u027f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0282\7\uffff\1\u0281",
            "\12\64\7\uffff\22\64\1\u0283\7\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0285",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0288",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u028a",
            "\1\u028b",
            "\1\u028c",
            "\1\u028d",
            "\1\u028e",
            "\1\u028f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0291",
            "\1\u0292",
            "\1\u0293",
            "\1\u0294",
            "\1\u0295",
            "\1\u0296",
            "\1\u0297",
            "\1\u0298",
            "\12\64\7\uffff\21\64\1\u0299\10\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u029b",
            "\1\u029c",
            "\1\u029d",
            "\1\u029e",
            "\1\u029f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\1\64\1\u02a1\30\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\23\64\1\u02a3\6\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02a5\7\uffff\1\u02a7\10\uffff\1\u02a6",
            "\1\u02a8",
            "\1\u02a9",
            "",
            "\1\u02aa",
            "\1\u02ab",
            "\1\u02ac",
            "\1\u02ad",
            "\1\u02ae",
            "\1\u02af",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02b1",
            "\1\u02b2",
            "\1\u02b3",
            "\1\u02b4",
            "\1\u02b5",
            "\1\u02b6",
            "\12\64\7\uffff\10\64\1\u02b7\21\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02b9",
            "\1\u02ba",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02bc",
            "\1\u02bd",
            "\1\u02be",
            "\12\64\7\uffff\32\64\4\uffff\1\u02bf\1\uffff\32\64",
            "\1\u02c1",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u02c3",
            "\1\u02c4",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02c6",
            "\12\64\7\uffff\4\64\1\u02c7\25\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02c9",
            "\1\u02ca",
            "\1\u02cb",
            "\1\u02cc",
            "\1\u02cd",
            "\1\u02ce",
            "\1\u02cf",
            "",
            "\1\u02d0",
            "\1\u02d1",
            "\1\u02d2",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02d5",
            "\1\u02d6",
            "\1\u02d7",
            "\1\u02d8",
            "\1\u02d9",
            "\1\u02da",
            "\1\u02db",
            "\1\u02dc",
            "",
            "\1\u02dd",
            "\1\u02de",
            "\1\u02df",
            "\1\u02e0",
            "\1\u02e1",
            "\1\u02e2",
            "\1\u02e3",
            "\1\u02e4",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02e6",
            "\1\u02e7",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02e9",
            "\1\u02ea",
            "\1\u02eb",
            "\1\u02ec",
            "\1\u02ed",
            "\12\64\7\uffff\16\64\1\u02ee\3\64\1\u02ef\7\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\u02f1",
            "\1\u02f2",
            "\1\u02f3",
            "\1\u02f4",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02f7",
            "\1\u02f8",
            "\1\u02f9",
            "\1\u02fa",
            "\1\u02fb",
            "\1\u02fc",
            "\1\u02fe\7\uffff\1\u02fd",
            "\1\u02ff",
            "\1\u0300",
            "\1\u0301",
            "\1\u0302",
            "\1\u0303",
            "\1\u0304",
            "\1\u0305",
            "\1\u0306",
            "\1\u0307",
            "\1\u0308",
            "\1\u0309",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u030b",
            "\1\u030c",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u030f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0312",
            "\1\u0313",
            "\1\u0314",
            "",
            "\1\u0315",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\u0247\10\uffff\1\u0175",
            "\1\u016e",
            "\12\u024a",
            "\12\u024a\10\uffff\1\u0175",
            "\1\u0318",
            "\1\u0319",
            "\1\u031a",
            "\1\u031b",
            "\1\u031c",
            "\1\u031d",
            "\1\u031e",
            "\1\u031f",
            "\1\u0320",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0322",
            "\1\u0323",
            "\1\u0324",
            "",
            "\1\u0325",
            "\1\u0326",
            "\1\u0327",
            "\1\u0328",
            "\1\u0329",
            "\12\64\7\uffff\22\64\1\u032a\7\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u032c",
            "\1\u032d",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u032f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0331",
            "",
            "\1\u0332",
            "\1\u0333",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0338",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u033a",
            "\1\u033b",
            "\1\u033c",
            "\1\u033d",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u033f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0341",
            "\1\u0342",
            "\1\u0343",
            "\1\u0344",
            "",
            "",
            "\1\u0345",
            "",
            "\1\u0346",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0349",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u034c",
            "\1\u034d",
            "\1\u034e\1\uffff\1\u034f",
            "\1\u0350",
            "\1\u0352\2\uffff\1\u0351",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\4\64\1\u0354\25\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0356",
            "\1\u0357",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0359",
            "\1\u035a",
            "\1\u035b",
            "\1\u035c",
            "",
            "\1\u035d",
            "\1\u035e",
            "\1\u035f",
            "\1\u0360",
            "\1\u0361",
            "",
            "\1\u0362",
            "",
            "\1\u0363",
            "",
            "\1\u0364",
            "\1\u0365",
            "\1\u0366",
            "\1\u0367",
            "\1\u0368",
            "\1\u0369",
            "\12\64\7\uffff\10\64\1\u036a\21\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u036d",
            "\1\u036e",
            "\1\u036f",
            "",
            "\1\u0370",
            "\1\u0371",
            "\1\u0372",
            "\1\u0373",
            "\1\u0374",
            "\1\u0375",
            "\1\u0376",
            "",
            "\1\u0377",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u037a",
            "\1\u037b",
            "\1\u037c",
            "",
            "\1\u037d",
            "",
            "\12\64\7\uffff\17\64\1\u037e\12\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0380",
            "",
            "\1\u0381",
            "\1\u0382",
            "",
            "\1\u0383",
            "\1\u0384",
            "\1\u0385",
            "\1\u0386",
            "\1\u0387",
            "\1\u0388",
            "\1\u0389",
            "\1\u038a",
            "\1\u038b",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u038d",
            "\12\64\7\uffff\23\64\1\u038e\6\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0391",
            "\1\u0392",
            "\1\u0393",
            "\1\u0394",
            "\1\u0395",
            "\1\u0396",
            "\1\u0397",
            "\1\u0398",
            "\1\u0399",
            "\1\u039a",
            "\1\u039b",
            "\1\u039c",
            "\1\u039e\22\uffff\1\u039d",
            "",
            "\1\u039f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u03a1",
            "\1\u03a2",
            "\1\u03a3",
            "\1\u03a4",
            "\1\u03a5",
            "\1\u03a6",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u03a8",
            "\1\u03a9",
            "\1\u03aa",
            "\1\u03ab",
            "",
            "",
            "\1\u03ac",
            "\1\u03ad",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03b1",
            "\1\u03b2",
            "\1\u03b3",
            "\1\u03b4",
            "\1\u03b5",
            "\1\u03b6",
            "\1\u03b7",
            "\1\u03b8",
            "\1\u03b9",
            "\1\u03ba",
            "\1\u03bb",
            "\1\u03bc",
            "\1\u03bd",
            "\1\u03be",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03c0",
            "",
            "",
            "\1\u03c1",
            "",
            "",
            "\1\u03c2",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03c4",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u03c6",
            "\1\u03c7",
            "\1\u03c8",
            "\1\u03c9",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03cb",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03ce",
            "",
            "\1\u03cf",
            "\1\u03d0",
            "\1\u03d1",
            "\1\u03d2",
            "\1\u03d3",
            "\1\u03d4",
            "\1\u03d5",
            "\1\u03d6",
            "\12\64\7\uffff\1\u03d7\31\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u03d9",
            "\1\u03da",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u03dc",
            "\12\64\7\uffff\23\64\1\u03dd\6\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03df",
            "",
            "",
            "",
            "",
            "\1\u03e0",
            "",
            "\1\u03e1",
            "\1\u03e2",
            "\1\u03e3",
            "\1\u03e4",
            "",
            "\1\u03e5\1\uffff\1\u03e6",
            "",
            "\1\u03e7",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03ea",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03ec",
            "",
            "",
            "\1\u03ed",
            "",
            "",
            "\1\u03ee",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03f0",
            "\1\u03f1",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03f3",
            "\1\u03f4",
            "",
            "\1\u03f5",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u03f8",
            "\1\u03f9",
            "\1\u03fa",
            "\1\u03fb",
            "\1\u03fc",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03fe",
            "\1\u03ff",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0401",
            "\1\u0402",
            "\1\u0403",
            "\1\u0404",
            "\1\u0405",
            "\1\u0406",
            "\1\u0407",
            "\1\u0408",
            "\1\u0409",
            "",
            "",
            "\1\u040a",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u040d",
            "\12\64\7\uffff\22\64\1\u040e\7\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0410",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0412",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0417",
            "\1\u0418",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u041a",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u041c",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0420",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0423",
            "\12\64\7\uffff\22\64\1\u0424\7\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0426",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0428",
            "\1\u0429",
            "",
            "",
            "\1\u042a",
            "\1\u042b",
            "\1\u042c",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u042e",
            "\1\u042f",
            "\1\u0430",
            "\1\u0431",
            "\1\u0432",
            "\1\u0433",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0436",
            "\1\u0437",
            "\1\u0438",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u043a",
            "\1\u043b",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u043e\4\uffff\1\u043d",
            "\1\u043f",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0443",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0447",
            "\1\u0448",
            "\1\u0449",
            "\1\u044a",
            "\1\u044b",
            "\1\u044c",
            "\12\64\7\uffff\22\64\1\u044d\7\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u044f",
            "\1\u0450",
            "\1\u0451",
            "\1\u0452",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0454",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0456",
            "\1\u0457",
            "",
            "\1\u0458",
            "",
            "\1\u0459",
            "\1\u045a",
            "\1\u045b",
            "\1\u045c",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u045f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0461",
            "\1\u0462",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0464",
            "\1\u0465",
            "\1\u0466",
            "\1\u0467",
            "",
            "\1\u0468",
            "\1\u0469",
            "",
            "\1\u046a",
            "\1\u046b",
            "",
            "\1\u046c",
            "\1\u046d",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0470",
            "\1\u0471",
            "\1\u0472",
            "\1\u0473",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0476",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0479",
            "\1\u047a",
            "",
            "\1\u047b",
            "\1\u047c",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u047e",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0480",
            "\1\u0481",
            "\1\u0482",
            "",
            "\1\u0483",
            "\1\u0484",
            "",
            "\1\u0485",
            "\1\u0486",
            "\1\u0487",
            "\1\u0488",
            "\1\u0489",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u048b",
            "\1\u048c",
            "\1\u048d",
            "\1\u048e",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0492",
            "",
            "",
            "",
            "",
            "\1\u0493",
            "\1\u0494",
            "",
            "\1\u0495",
            "",
            "\1\u0496",
            "",
            "",
            "",
            "\1\u0497",
            "",
            "",
            "\1\u0498",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u049a",
            "",
            "\1\u049b",
            "\1\u049c",
            "\1\u049d",
            "\1\u049e",
            "\1\u049f",
            "",
            "\1\u04a0",
            "\1\u04a1",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04a3",
            "\1\u04a4",
            "\1\u04a5",
            "",
            "",
            "\1\u04a6",
            "\1\u04a7",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u04a9",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u04ab",
            "\1\u04ac",
            "\1\u04ad",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\1\u04af",
            "\1\u04b0",
            "\1\u04b1",
            "\1\u04b2",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u04b6",
            "\1\u04b7",
            "\12\64\7\uffff\4\64\1\u04b8\15\64\1\u04b9\7\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04be",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04c0",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u04c4",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04c6",
            "",
            "\1\u04c7",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04c9",
            "\1\u04ca",
            "\1\u04cb",
            "\1\u04cc",
            "\12\64\7\uffff\22\64\1\u04cd\7\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04cf",
            "\1\u04d0",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u04d2",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04d4",
            "\1\u04d5",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u04d7",
            "\1\u04d8",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04da",
            "",
            "\1\u04db",
            "",
            "\1\u04dc",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04de",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04e0",
            "\12\64\7\uffff\22\64\1\u04e1\7\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04e5",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u04e7\17\uffff\1\u04e8",
            "\1\u04e9",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04eb",
            "",
            "",
            "",
            "\1\u04ec",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04ee",
            "\1\u04ef",
            "\1\u04f0",
            "\1\u04f1",
            "\1\u04f2",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04f4",
            "\1\u04f5",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04f7",
            "\1\u04f8",
            "\1\u04f9",
            "\1\u04fa",
            "",
            "\1\u04fb",
            "\1\u04fc",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04fe",
            "\1\u04ff",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0501",
            "\1\u0502",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0506",
            "\1\u0507",
            "",
            "",
            "",
            "\1\u0508",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u050a",
            "\1\u050b",
            "",
            "",
            "",
            "",
            "\1\u050c",
            "",
            "\12\64\7\uffff\15\64\1\u050d\14\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0512",
            "\1\u0513",
            "\1\u0514",
            "\1\u0515",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u051a",
            "\1\u051b",
            "",
            "\1\u051c",
            "\1\u051d",
            "",
            "\12\64\7\uffff\11\64\1\u051e\20\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0520",
            "\1\u0521",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0523",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\1\u0525",
            "",
            "\1\u0526",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0528",
            "",
            "",
            "\1\u0529",
            "",
            "\1\u052a",
            "\1\u052b",
            "\1\u052c",
            "\1\u052d",
            "\1\u052e",
            "",
            "\1\u052f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0533",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0535",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\4\64\1\u0537\15\64\1\u0538\7\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\u053a",
            "",
            "\1\u053b",
            "\1\u053c",
            "",
            "",
            "",
            "\1\u053d",
            "\1\u053e",
            "\1\u053f",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0541",
            "\1\u0542",
            "\1\u0543",
            "",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0545",
            "\1\u0546",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "",
            "\1\u0548",
            "\1\u0549",
            "\1\u054a",
            "\1\u054b",
            "\1\u054c",
            "",
            "\1\u054d",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0551",
            "",
            "\1\u0552",
            "\1\u0553",
            "\1\u0554",
            "\1\u0555",
            "\1\u0556",
            "\1\u0557",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\1\u055a",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u055c",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u055e",
            "\1\u055f",
            "\1\u0560",
            "\1\u0561",
            "\1\u0562",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0564",
            "\1\u0565",
            "\1\u0566",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0568",
            "",
            "\1\u0569",
            "\1\u056a",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u056d",
            "\1\u056e",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0570",
            "\1\u0571",
            "\1\u0572",
            "\1\u0573",
            "\1\u0574",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u0576",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0579",
            "\1\u057a",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u057c",
            "",
            "\1\u057d",
            "\1\u057e",
            "\1\u057f",
            "",
            "\1\u0580",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u0583",
            "\1\u0584",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0587",
            "\1\u0588",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u058d",
            "\1\u058e",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0590",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0595",
            "",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0598",
            "",
            "",
            "",
            "",
            "\1\u0599",
            "",
            "",
            "\1\u059a",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u059c",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( KW_ENC | KW_TRUE | KW_FALSE | KW_ALL | KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_IF | KW_EXISTS | KW_ASC | KW_DESC | KW_ORDER | KW_GROUP | KW_BY | KW_HAVING | KW_WHERE | KW_FROM | KW_AS | KW_SELECT | KW_DISTINCT | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_UNIQUEJOIN | KW_PRESERVE | KW_JOIN | KW_LEFT | KW_RIGHT | KW_FULL | KW_ON | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_TRANSFORM | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_COLUMN | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_IGNORE | KW_PROTECTION | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_DECIMAL | KW_STRING | KW_ARRAY | KW_STRUCT | KW_MAP | KW_UNIONTYPE | KW_REDUCE | KW_PARTITIONED | KW_CLUSTERED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_SEQUENCEFILE | KW_TEXTFILE | KW_RCFILE | KW_ORCFILE | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_OFFLINE | KW_ENABLE | KW_DISABLE | KW_READONLY | KW_NO_DROP | KW_LOCATION | KW_TABLESAMPLE | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_CAST | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_FUNCTION | KW_MACRO | KW_EXPLAIN | KW_EXTENDED | KW_FORMATTED | KW_PRETTY | KW_DEPENDENCY | KW_LOGICAL | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_CASE | KW_WHEN | KW_THEN | KW_ELSE | KW_END | KW_MAPJOIN | KW_STREAMTABLE | KW_HOLD_DDLTIME | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_IN | KW_DATABASE | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CROSS | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_WINDOW | KW_UNBOUNDED | KW_PRECEDING | KW_FOLLOWING | KW_CURRENT | KW_LESS | KW_MORE | KW_OVER | KW_GROUPING | KW_SETS | KW_TRUNCATE | KW_NOSCAN | KW_PARTIALSCAN | KW_USER | KW_ROLE | KW_INNER | KW_EXCHANGE | KW_INTERVAL | KW_ADJACENT | KW_CORRESPONDING | KW_OVERLAPS | KW_CONTAINS | KW_WITHIN | KW_PREFIX | KW_SUFFIX | KW_UPSTREAM | KW_DOWNSTREAM | KW_COALESCE | KW_LENGTH | KW_CLOSEST | KW_EXCLUSIVENESSJOIN | KW_INTERSECTJOIN | KW_DISTANCE | KW_PROJECT | KW_VIRTUALTRACK | DOT | COLON | COMMA | SEMICOLON | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | BITWISEXOR | QUESTION | DOLLAR | StringLiteral | CharSetLiteral | BigintLiteral | SmallintLiteral | TinyintLiteral | DecimalLiteral | ByteLengthLiteral | Number | Identifier | CharSetName | WS | COMMENT );";
        }
    }
 

}