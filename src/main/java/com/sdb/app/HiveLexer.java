// $ANTLR 3.4 HiveLexer.g 2014-10-06 21:41:16

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
@SuppressWarnings({"all", "warnings", "unchecked"})
public class HiveLexer extends Lexer {
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

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public HiveLexer() {} 
    public HiveLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public HiveLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "HiveLexer.g"; }

    // $ANTLR start "KW_ENC"
    public final void mKW_ENC() throws RecognitionException {
        try {
            int _type = KW_ENC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:22:8: ( 'ENC' )
            // HiveLexer.g:22:10: 'ENC'
            {
            match("ENC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ENC"

    // $ANTLR start "KW_TRUE"
    public final void mKW_TRUE() throws RecognitionException {
        try {
            int _type = KW_TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:23:9: ( 'TRUE' )
            // HiveLexer.g:23:11: 'TRUE'
            {
            match("TRUE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TRUE"

    // $ANTLR start "KW_FALSE"
    public final void mKW_FALSE() throws RecognitionException {
        try {
            int _type = KW_FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:24:10: ( 'FALSE' )
            // HiveLexer.g:24:12: 'FALSE'
            {
            match("FALSE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FALSE"

    // $ANTLR start "KW_ALL"
    public final void mKW_ALL() throws RecognitionException {
        try {
            int _type = KW_ALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:25:8: ( 'ALL' )
            // HiveLexer.g:25:10: 'ALL'
            {
            match("ALL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ALL"

    // $ANTLR start "KW_AND"
    public final void mKW_AND() throws RecognitionException {
        try {
            int _type = KW_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:26:8: ( 'AND' )
            // HiveLexer.g:26:10: 'AND'
            {
            match("AND"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_AND"

    // $ANTLR start "KW_OR"
    public final void mKW_OR() throws RecognitionException {
        try {
            int _type = KW_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:27:7: ( 'OR' )
            // HiveLexer.g:27:9: 'OR'
            {
            match("OR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OR"

    // $ANTLR start "KW_NOT"
    public final void mKW_NOT() throws RecognitionException {
        try {
            int _type = KW_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:28:8: ( 'NOT' | '!' )
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
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // HiveLexer.g:28:10: 'NOT'
                    {
                    match("NOT"); 



                    }
                    break;
                case 2 :
                    // HiveLexer.g:28:18: '!'
                    {
                    match('!'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_NOT"

    // $ANTLR start "KW_LIKE"
    public final void mKW_LIKE() throws RecognitionException {
        try {
            int _type = KW_LIKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:29:9: ( 'LIKE' )
            // HiveLexer.g:29:11: 'LIKE'
            {
            match("LIKE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LIKE"

    // $ANTLR start "KW_IF"
    public final void mKW_IF() throws RecognitionException {
        try {
            int _type = KW_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:31:7: ( 'IF' )
            // HiveLexer.g:31:9: 'IF'
            {
            match("IF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_IF"

    // $ANTLR start "KW_EXISTS"
    public final void mKW_EXISTS() throws RecognitionException {
        try {
            int _type = KW_EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:32:11: ( 'EXISTS' )
            // HiveLexer.g:32:13: 'EXISTS'
            {
            match("EXISTS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_EXISTS"

    // $ANTLR start "KW_ASC"
    public final void mKW_ASC() throws RecognitionException {
        try {
            int _type = KW_ASC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:34:8: ( 'ASC' )
            // HiveLexer.g:34:10: 'ASC'
            {
            match("ASC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ASC"

    // $ANTLR start "KW_DESC"
    public final void mKW_DESC() throws RecognitionException {
        try {
            int _type = KW_DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:35:9: ( 'DESC' )
            // HiveLexer.g:35:11: 'DESC'
            {
            match("DESC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DESC"

    // $ANTLR start "KW_ORDER"
    public final void mKW_ORDER() throws RecognitionException {
        try {
            int _type = KW_ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:36:10: ( 'ORDER' )
            // HiveLexer.g:36:12: 'ORDER'
            {
            match("ORDER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ORDER"

    // $ANTLR start "KW_GROUP"
    public final void mKW_GROUP() throws RecognitionException {
        try {
            int _type = KW_GROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:37:10: ( 'GROUP' )
            // HiveLexer.g:37:12: 'GROUP'
            {
            match("GROUP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_GROUP"

    // $ANTLR start "KW_BY"
    public final void mKW_BY() throws RecognitionException {
        try {
            int _type = KW_BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:38:7: ( 'BY' )
            // HiveLexer.g:38:9: 'BY'
            {
            match("BY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_BY"

    // $ANTLR start "KW_HAVING"
    public final void mKW_HAVING() throws RecognitionException {
        try {
            int _type = KW_HAVING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:39:11: ( 'HAVING' )
            // HiveLexer.g:39:13: 'HAVING'
            {
            match("HAVING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_HAVING"

    // $ANTLR start "KW_WHERE"
    public final void mKW_WHERE() throws RecognitionException {
        try {
            int _type = KW_WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:40:10: ( 'WHERE' )
            // HiveLexer.g:40:12: 'WHERE'
            {
            match("WHERE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_WHERE"

    // $ANTLR start "KW_FROM"
    public final void mKW_FROM() throws RecognitionException {
        try {
            int _type = KW_FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:41:9: ( 'FROM' )
            // HiveLexer.g:41:11: 'FROM'
            {
            match("FROM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FROM"

    // $ANTLR start "KW_AS"
    public final void mKW_AS() throws RecognitionException {
        try {
            int _type = KW_AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:42:7: ( 'AS' )
            // HiveLexer.g:42:9: 'AS'
            {
            match("AS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_AS"

    // $ANTLR start "KW_SELECT"
    public final void mKW_SELECT() throws RecognitionException {
        try {
            int _type = KW_SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:43:11: ( 'SELECT' )
            // HiveLexer.g:43:13: 'SELECT'
            {
            match("SELECT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SELECT"

    // $ANTLR start "KW_DISTINCT"
    public final void mKW_DISTINCT() throws RecognitionException {
        try {
            int _type = KW_DISTINCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:44:13: ( 'DISTINCT' )
            // HiveLexer.g:44:15: 'DISTINCT'
            {
            match("DISTINCT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DISTINCT"

    // $ANTLR start "KW_INSERT"
    public final void mKW_INSERT() throws RecognitionException {
        try {
            int _type = KW_INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:45:11: ( 'INSERT' )
            // HiveLexer.g:45:13: 'INSERT'
            {
            match("INSERT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INSERT"

    // $ANTLR start "KW_OVERWRITE"
    public final void mKW_OVERWRITE() throws RecognitionException {
        try {
            int _type = KW_OVERWRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:46:14: ( 'OVERWRITE' )
            // HiveLexer.g:46:16: 'OVERWRITE'
            {
            match("OVERWRITE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OVERWRITE"

    // $ANTLR start "KW_OUTER"
    public final void mKW_OUTER() throws RecognitionException {
        try {
            int _type = KW_OUTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:47:10: ( 'OUTER' )
            // HiveLexer.g:47:12: 'OUTER'
            {
            match("OUTER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OUTER"

    // $ANTLR start "KW_UNIQUEJOIN"
    public final void mKW_UNIQUEJOIN() throws RecognitionException {
        try {
            int _type = KW_UNIQUEJOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:48:15: ( 'UNIQUEJOIN' )
            // HiveLexer.g:48:17: 'UNIQUEJOIN'
            {
            match("UNIQUEJOIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNIQUEJOIN"

    // $ANTLR start "KW_PRESERVE"
    public final void mKW_PRESERVE() throws RecognitionException {
        try {
            int _type = KW_PRESERVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:49:13: ( 'PRESERVE' )
            // HiveLexer.g:49:15: 'PRESERVE'
            {
            match("PRESERVE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PRESERVE"

    // $ANTLR start "KW_JOIN"
    public final void mKW_JOIN() throws RecognitionException {
        try {
            int _type = KW_JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:50:9: ( 'JOIN' )
            // HiveLexer.g:50:11: 'JOIN'
            {
            match("JOIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_JOIN"

    // $ANTLR start "KW_LEFT"
    public final void mKW_LEFT() throws RecognitionException {
        try {
            int _type = KW_LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:51:9: ( 'LEFT' )
            // HiveLexer.g:51:11: 'LEFT'
            {
            match("LEFT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LEFT"

    // $ANTLR start "KW_RIGHT"
    public final void mKW_RIGHT() throws RecognitionException {
        try {
            int _type = KW_RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:52:10: ( 'RIGHT' )
            // HiveLexer.g:52:12: 'RIGHT'
            {
            match("RIGHT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_RIGHT"

    // $ANTLR start "KW_FULL"
    public final void mKW_FULL() throws RecognitionException {
        try {
            int _type = KW_FULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:53:9: ( 'FULL' )
            // HiveLexer.g:53:11: 'FULL'
            {
            match("FULL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FULL"

    // $ANTLR start "KW_ON"
    public final void mKW_ON() throws RecognitionException {
        try {
            int _type = KW_ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:54:7: ( 'ON' )
            // HiveLexer.g:54:9: 'ON'
            {
            match("ON"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ON"

    // $ANTLR start "KW_PARTITION"
    public final void mKW_PARTITION() throws RecognitionException {
        try {
            int _type = KW_PARTITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:55:14: ( 'PARTITION' )
            // HiveLexer.g:55:16: 'PARTITION'
            {
            match("PARTITION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PARTITION"

    // $ANTLR start "KW_PARTITIONS"
    public final void mKW_PARTITIONS() throws RecognitionException {
        try {
            int _type = KW_PARTITIONS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:56:15: ( 'PARTITIONS' )
            // HiveLexer.g:56:17: 'PARTITIONS'
            {
            match("PARTITIONS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PARTITIONS"

    // $ANTLR start "KW_TABLE"
    public final void mKW_TABLE() throws RecognitionException {
        try {
            int _type = KW_TABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:57:9: ( 'TABLE' )
            // HiveLexer.g:57:11: 'TABLE'
            {
            match("TABLE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TABLE"

    // $ANTLR start "KW_TABLES"
    public final void mKW_TABLES() throws RecognitionException {
        try {
            int _type = KW_TABLES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:58:10: ( 'TABLES' )
            // HiveLexer.g:58:12: 'TABLES'
            {
            match("TABLES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TABLES"

    // $ANTLR start "KW_COLUMNS"
    public final void mKW_COLUMNS() throws RecognitionException {
        try {
            int _type = KW_COLUMNS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:59:11: ( 'COLUMNS' )
            // HiveLexer.g:59:13: 'COLUMNS'
            {
            match("COLUMNS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_COLUMNS"

    // $ANTLR start "KW_INDEX"
    public final void mKW_INDEX() throws RecognitionException {
        try {
            int _type = KW_INDEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:60:9: ( 'INDEX' )
            // HiveLexer.g:60:11: 'INDEX'
            {
            match("INDEX"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INDEX"

    // $ANTLR start "KW_INDEXES"
    public final void mKW_INDEXES() throws RecognitionException {
        try {
            int _type = KW_INDEXES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:61:11: ( 'INDEXES' )
            // HiveLexer.g:61:13: 'INDEXES'
            {
            match("INDEXES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INDEXES"

    // $ANTLR start "KW_REBUILD"
    public final void mKW_REBUILD() throws RecognitionException {
        try {
            int _type = KW_REBUILD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:62:11: ( 'REBUILD' )
            // HiveLexer.g:62:13: 'REBUILD'
            {
            match("REBUILD"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_REBUILD"

    // $ANTLR start "KW_FUNCTIONS"
    public final void mKW_FUNCTIONS() throws RecognitionException {
        try {
            int _type = KW_FUNCTIONS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:63:13: ( 'FUNCTIONS' )
            // HiveLexer.g:63:15: 'FUNCTIONS'
            {
            match("FUNCTIONS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FUNCTIONS"

    // $ANTLR start "KW_SHOW"
    public final void mKW_SHOW() throws RecognitionException {
        try {
            int _type = KW_SHOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:64:8: ( 'SHOW' )
            // HiveLexer.g:64:10: 'SHOW'
            {
            match("SHOW"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SHOW"

    // $ANTLR start "KW_MSCK"
    public final void mKW_MSCK() throws RecognitionException {
        try {
            int _type = KW_MSCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:65:8: ( 'MSCK' )
            // HiveLexer.g:65:10: 'MSCK'
            {
            match("MSCK"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MSCK"

    // $ANTLR start "KW_REPAIR"
    public final void mKW_REPAIR() throws RecognitionException {
        try {
            int _type = KW_REPAIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:66:10: ( 'REPAIR' )
            // HiveLexer.g:66:12: 'REPAIR'
            {
            match("REPAIR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_REPAIR"

    // $ANTLR start "KW_DIRECTORY"
    public final void mKW_DIRECTORY() throws RecognitionException {
        try {
            int _type = KW_DIRECTORY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:67:13: ( 'DIRECTORY' )
            // HiveLexer.g:67:15: 'DIRECTORY'
            {
            match("DIRECTORY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DIRECTORY"

    // $ANTLR start "KW_LOCAL"
    public final void mKW_LOCAL() throws RecognitionException {
        try {
            int _type = KW_LOCAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:68:9: ( 'LOCAL' )
            // HiveLexer.g:68:11: 'LOCAL'
            {
            match("LOCAL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LOCAL"

    // $ANTLR start "KW_TRANSFORM"
    public final void mKW_TRANSFORM() throws RecognitionException {
        try {
            int _type = KW_TRANSFORM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:69:14: ( 'TRANSFORM' )
            // HiveLexer.g:69:16: 'TRANSFORM'
            {
            match("TRANSFORM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TRANSFORM"

    // $ANTLR start "KW_USING"
    public final void mKW_USING() throws RecognitionException {
        try {
            int _type = KW_USING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:70:9: ( 'USING' )
            // HiveLexer.g:70:11: 'USING'
            {
            match("USING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_USING"

    // $ANTLR start "KW_CLUSTER"
    public final void mKW_CLUSTER() throws RecognitionException {
        try {
            int _type = KW_CLUSTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:71:11: ( 'CLUSTER' )
            // HiveLexer.g:71:13: 'CLUSTER'
            {
            match("CLUSTER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CLUSTER"

    // $ANTLR start "KW_DISTRIBUTE"
    public final void mKW_DISTRIBUTE() throws RecognitionException {
        try {
            int _type = KW_DISTRIBUTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:72:14: ( 'DISTRIBUTE' )
            // HiveLexer.g:72:16: 'DISTRIBUTE'
            {
            match("DISTRIBUTE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DISTRIBUTE"

    // $ANTLR start "KW_SORT"
    public final void mKW_SORT() throws RecognitionException {
        try {
            int _type = KW_SORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:73:8: ( 'SORT' )
            // HiveLexer.g:73:10: 'SORT'
            {
            match("SORT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SORT"

    // $ANTLR start "KW_UNION"
    public final void mKW_UNION() throws RecognitionException {
        try {
            int _type = KW_UNION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:74:9: ( 'UNION' )
            // HiveLexer.g:74:11: 'UNION'
            {
            match("UNION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNION"

    // $ANTLR start "KW_LOAD"
    public final void mKW_LOAD() throws RecognitionException {
        try {
            int _type = KW_LOAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:75:8: ( 'LOAD' )
            // HiveLexer.g:75:10: 'LOAD'
            {
            match("LOAD"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LOAD"

    // $ANTLR start "KW_EXPORT"
    public final void mKW_EXPORT() throws RecognitionException {
        try {
            int _type = KW_EXPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:76:10: ( 'EXPORT' )
            // HiveLexer.g:76:12: 'EXPORT'
            {
            match("EXPORT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_EXPORT"

    // $ANTLR start "KW_IMPORT"
    public final void mKW_IMPORT() throws RecognitionException {
        try {
            int _type = KW_IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:77:10: ( 'IMPORT' )
            // HiveLexer.g:77:12: 'IMPORT'
            {
            match("IMPORT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_IMPORT"

    // $ANTLR start "KW_DATA"
    public final void mKW_DATA() throws RecognitionException {
        try {
            int _type = KW_DATA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:78:8: ( 'DATA' )
            // HiveLexer.g:78:10: 'DATA'
            {
            match("DATA"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DATA"

    // $ANTLR start "KW_INPATH"
    public final void mKW_INPATH() throws RecognitionException {
        try {
            int _type = KW_INPATH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:79:10: ( 'INPATH' )
            // HiveLexer.g:79:12: 'INPATH'
            {
            match("INPATH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INPATH"

    // $ANTLR start "KW_IS"
    public final void mKW_IS() throws RecognitionException {
        try {
            int _type = KW_IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:80:6: ( 'IS' )
            // HiveLexer.g:80:8: 'IS'
            {
            match("IS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_IS"

    // $ANTLR start "KW_NULL"
    public final void mKW_NULL() throws RecognitionException {
        try {
            int _type = KW_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:81:8: ( 'NULL' )
            // HiveLexer.g:81:10: 'NULL'
            {
            match("NULL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_NULL"

    // $ANTLR start "KW_CREATE"
    public final void mKW_CREATE() throws RecognitionException {
        try {
            int _type = KW_CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:82:10: ( 'CREATE' )
            // HiveLexer.g:82:12: 'CREATE'
            {
            match("CREATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CREATE"

    // $ANTLR start "KW_EXTERNAL"
    public final void mKW_EXTERNAL() throws RecognitionException {
        try {
            int _type = KW_EXTERNAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:83:12: ( 'EXTERNAL' )
            // HiveLexer.g:83:14: 'EXTERNAL'
            {
            match("EXTERNAL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_EXTERNAL"

    // $ANTLR start "KW_ALTER"
    public final void mKW_ALTER() throws RecognitionException {
        try {
            int _type = KW_ALTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:84:9: ( 'ALTER' )
            // HiveLexer.g:84:11: 'ALTER'
            {
            match("ALTER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ALTER"

    // $ANTLR start "KW_CHANGE"
    public final void mKW_CHANGE() throws RecognitionException {
        try {
            int _type = KW_CHANGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:85:10: ( 'CHANGE' )
            // HiveLexer.g:85:12: 'CHANGE'
            {
            match("CHANGE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CHANGE"

    // $ANTLR start "KW_COLUMN"
    public final void mKW_COLUMN() throws RecognitionException {
        try {
            int _type = KW_COLUMN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:86:10: ( 'COLUMN' )
            // HiveLexer.g:86:12: 'COLUMN'
            {
            match("COLUMN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_COLUMN"

    // $ANTLR start "KW_FIRST"
    public final void mKW_FIRST() throws RecognitionException {
        try {
            int _type = KW_FIRST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:87:9: ( 'FIRST' )
            // HiveLexer.g:87:11: 'FIRST'
            {
            match("FIRST"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FIRST"

    // $ANTLR start "KW_AFTER"
    public final void mKW_AFTER() throws RecognitionException {
        try {
            int _type = KW_AFTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:88:9: ( 'AFTER' )
            // HiveLexer.g:88:11: 'AFTER'
            {
            match("AFTER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_AFTER"

    // $ANTLR start "KW_DESCRIBE"
    public final void mKW_DESCRIBE() throws RecognitionException {
        try {
            int _type = KW_DESCRIBE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:89:12: ( 'DESCRIBE' )
            // HiveLexer.g:89:14: 'DESCRIBE'
            {
            match("DESCRIBE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DESCRIBE"

    // $ANTLR start "KW_DROP"
    public final void mKW_DROP() throws RecognitionException {
        try {
            int _type = KW_DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:90:8: ( 'DROP' )
            // HiveLexer.g:90:10: 'DROP'
            {
            match("DROP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DROP"

    // $ANTLR start "KW_RENAME"
    public final void mKW_RENAME() throws RecognitionException {
        try {
            int _type = KW_RENAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:91:10: ( 'RENAME' )
            // HiveLexer.g:91:12: 'RENAME'
            {
            match("RENAME"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_RENAME"

    // $ANTLR start "KW_IGNORE"
    public final void mKW_IGNORE() throws RecognitionException {
        try {
            int _type = KW_IGNORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:92:10: ( 'IGNORE' )
            // HiveLexer.g:92:12: 'IGNORE'
            {
            match("IGNORE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_IGNORE"

    // $ANTLR start "KW_PROTECTION"
    public final void mKW_PROTECTION() throws RecognitionException {
        try {
            int _type = KW_PROTECTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:93:14: ( 'PROTECTION' )
            // HiveLexer.g:93:16: 'PROTECTION'
            {
            match("PROTECTION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PROTECTION"

    // $ANTLR start "KW_TO"
    public final void mKW_TO() throws RecognitionException {
        try {
            int _type = KW_TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:94:6: ( 'TO' )
            // HiveLexer.g:94:8: 'TO'
            {
            match("TO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TO"

    // $ANTLR start "KW_COMMENT"
    public final void mKW_COMMENT() throws RecognitionException {
        try {
            int _type = KW_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:95:11: ( 'COMMENT' )
            // HiveLexer.g:95:13: 'COMMENT'
            {
            match("COMMENT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_COMMENT"

    // $ANTLR start "KW_BOOLEAN"
    public final void mKW_BOOLEAN() throws RecognitionException {
        try {
            int _type = KW_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:96:11: ( 'BOOLEAN' )
            // HiveLexer.g:96:13: 'BOOLEAN'
            {
            match("BOOLEAN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_BOOLEAN"

    // $ANTLR start "KW_TINYINT"
    public final void mKW_TINYINT() throws RecognitionException {
        try {
            int _type = KW_TINYINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:97:11: ( 'TINYINT' )
            // HiveLexer.g:97:13: 'TINYINT'
            {
            match("TINYINT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TINYINT"

    // $ANTLR start "KW_SMALLINT"
    public final void mKW_SMALLINT() throws RecognitionException {
        try {
            int _type = KW_SMALLINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:98:12: ( 'SMALLINT' )
            // HiveLexer.g:98:14: 'SMALLINT'
            {
            match("SMALLINT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SMALLINT"

    // $ANTLR start "KW_INT"
    public final void mKW_INT() throws RecognitionException {
        try {
            int _type = KW_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:99:7: ( 'INT' )
            // HiveLexer.g:99:9: 'INT'
            {
            match("INT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INT"

    // $ANTLR start "KW_BIGINT"
    public final void mKW_BIGINT() throws RecognitionException {
        try {
            int _type = KW_BIGINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:100:10: ( 'BIGINT' )
            // HiveLexer.g:100:12: 'BIGINT'
            {
            match("BIGINT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_BIGINT"

    // $ANTLR start "KW_FLOAT"
    public final void mKW_FLOAT() throws RecognitionException {
        try {
            int _type = KW_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:101:9: ( 'FLOAT' )
            // HiveLexer.g:101:11: 'FLOAT'
            {
            match("FLOAT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FLOAT"

    // $ANTLR start "KW_DOUBLE"
    public final void mKW_DOUBLE() throws RecognitionException {
        try {
            int _type = KW_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:102:10: ( 'DOUBLE' )
            // HiveLexer.g:102:12: 'DOUBLE'
            {
            match("DOUBLE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DOUBLE"

    // $ANTLR start "KW_DATE"
    public final void mKW_DATE() throws RecognitionException {
        try {
            int _type = KW_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:103:8: ( 'DATE' )
            // HiveLexer.g:103:10: 'DATE'
            {
            match("DATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DATE"

    // $ANTLR start "KW_DATETIME"
    public final void mKW_DATETIME() throws RecognitionException {
        try {
            int _type = KW_DATETIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:104:12: ( 'DATETIME' )
            // HiveLexer.g:104:14: 'DATETIME'
            {
            match("DATETIME"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DATETIME"

    // $ANTLR start "KW_TIMESTAMP"
    public final void mKW_TIMESTAMP() throws RecognitionException {
        try {
            int _type = KW_TIMESTAMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:105:13: ( 'TIMESTAMP' )
            // HiveLexer.g:105:15: 'TIMESTAMP'
            {
            match("TIMESTAMP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TIMESTAMP"

    // $ANTLR start "KW_DECIMAL"
    public final void mKW_DECIMAL() throws RecognitionException {
        try {
            int _type = KW_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:106:11: ( 'DECIMAL' )
            // HiveLexer.g:106:13: 'DECIMAL'
            {
            match("DECIMAL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DECIMAL"

    // $ANTLR start "KW_STRING"
    public final void mKW_STRING() throws RecognitionException {
        try {
            int _type = KW_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:107:10: ( 'STRING' )
            // HiveLexer.g:107:12: 'STRING'
            {
            match("STRING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_STRING"

    // $ANTLR start "KW_ARRAY"
    public final void mKW_ARRAY() throws RecognitionException {
        try {
            int _type = KW_ARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:108:9: ( 'ARRAY' )
            // HiveLexer.g:108:11: 'ARRAY'
            {
            match("ARRAY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ARRAY"

    // $ANTLR start "KW_STRUCT"
    public final void mKW_STRUCT() throws RecognitionException {
        try {
            int _type = KW_STRUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:109:10: ( 'STRUCT' )
            // HiveLexer.g:109:12: 'STRUCT'
            {
            match("STRUCT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_STRUCT"

    // $ANTLR start "KW_MAP"
    public final void mKW_MAP() throws RecognitionException {
        try {
            int _type = KW_MAP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:110:7: ( 'MAP' )
            // HiveLexer.g:110:9: 'MAP'
            {
            match("MAP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MAP"

    // $ANTLR start "KW_UNIONTYPE"
    public final void mKW_UNIONTYPE() throws RecognitionException {
        try {
            int _type = KW_UNIONTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:111:13: ( 'UNIONTYPE' )
            // HiveLexer.g:111:15: 'UNIONTYPE'
            {
            match("UNIONTYPE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNIONTYPE"

    // $ANTLR start "KW_REDUCE"
    public final void mKW_REDUCE() throws RecognitionException {
        try {
            int _type = KW_REDUCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:112:10: ( 'REDUCE' )
            // HiveLexer.g:112:12: 'REDUCE'
            {
            match("REDUCE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_REDUCE"

    // $ANTLR start "KW_PARTITIONED"
    public final void mKW_PARTITIONED() throws RecognitionException {
        try {
            int _type = KW_PARTITIONED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:113:15: ( 'PARTITIONED' )
            // HiveLexer.g:113:17: 'PARTITIONED'
            {
            match("PARTITIONED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PARTITIONED"

    // $ANTLR start "KW_CLUSTERED"
    public final void mKW_CLUSTERED() throws RecognitionException {
        try {
            int _type = KW_CLUSTERED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:114:13: ( 'CLUSTERED' )
            // HiveLexer.g:114:15: 'CLUSTERED'
            {
            match("CLUSTERED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CLUSTERED"

    // $ANTLR start "KW_SORTED"
    public final void mKW_SORTED() throws RecognitionException {
        try {
            int _type = KW_SORTED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:115:10: ( 'SORTED' )
            // HiveLexer.g:115:12: 'SORTED'
            {
            match("SORTED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SORTED"

    // $ANTLR start "KW_INTO"
    public final void mKW_INTO() throws RecognitionException {
        try {
            int _type = KW_INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:116:8: ( 'INTO' )
            // HiveLexer.g:116:10: 'INTO'
            {
            match("INTO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INTO"

    // $ANTLR start "KW_BUCKETS"
    public final void mKW_BUCKETS() throws RecognitionException {
        try {
            int _type = KW_BUCKETS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:117:11: ( 'BUCKETS' )
            // HiveLexer.g:117:13: 'BUCKETS'
            {
            match("BUCKETS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_BUCKETS"

    // $ANTLR start "KW_ROW"
    public final void mKW_ROW() throws RecognitionException {
        try {
            int _type = KW_ROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:118:7: ( 'ROW' )
            // HiveLexer.g:118:9: 'ROW'
            {
            match("ROW"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ROW"

    // $ANTLR start "KW_ROWS"
    public final void mKW_ROWS() throws RecognitionException {
        try {
            int _type = KW_ROWS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:119:8: ( 'ROWS' )
            // HiveLexer.g:119:10: 'ROWS'
            {
            match("ROWS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ROWS"

    // $ANTLR start "KW_FORMAT"
    public final void mKW_FORMAT() throws RecognitionException {
        try {
            int _type = KW_FORMAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:120:10: ( 'FORMAT' )
            // HiveLexer.g:120:12: 'FORMAT'
            {
            match("FORMAT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FORMAT"

    // $ANTLR start "KW_DELIMITED"
    public final void mKW_DELIMITED() throws RecognitionException {
        try {
            int _type = KW_DELIMITED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:121:13: ( 'DELIMITED' )
            // HiveLexer.g:121:15: 'DELIMITED'
            {
            match("DELIMITED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DELIMITED"

    // $ANTLR start "KW_FIELDS"
    public final void mKW_FIELDS() throws RecognitionException {
        try {
            int _type = KW_FIELDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:122:10: ( 'FIELDS' )
            // HiveLexer.g:122:12: 'FIELDS'
            {
            match("FIELDS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FIELDS"

    // $ANTLR start "KW_TERMINATED"
    public final void mKW_TERMINATED() throws RecognitionException {
        try {
            int _type = KW_TERMINATED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:123:14: ( 'TERMINATED' )
            // HiveLexer.g:123:16: 'TERMINATED'
            {
            match("TERMINATED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TERMINATED"

    // $ANTLR start "KW_ESCAPED"
    public final void mKW_ESCAPED() throws RecognitionException {
        try {
            int _type = KW_ESCAPED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:124:11: ( 'ESCAPED' )
            // HiveLexer.g:124:13: 'ESCAPED'
            {
            match("ESCAPED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ESCAPED"

    // $ANTLR start "KW_COLLECTION"
    public final void mKW_COLLECTION() throws RecognitionException {
        try {
            int _type = KW_COLLECTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:125:14: ( 'COLLECTION' )
            // HiveLexer.g:125:16: 'COLLECTION'
            {
            match("COLLECTION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_COLLECTION"

    // $ANTLR start "KW_ITEMS"
    public final void mKW_ITEMS() throws RecognitionException {
        try {
            int _type = KW_ITEMS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:126:9: ( 'ITEMS' )
            // HiveLexer.g:126:11: 'ITEMS'
            {
            match("ITEMS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ITEMS"

    // $ANTLR start "KW_KEYS"
    public final void mKW_KEYS() throws RecognitionException {
        try {
            int _type = KW_KEYS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:127:8: ( 'KEYS' )
            // HiveLexer.g:127:10: 'KEYS'
            {
            match("KEYS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_KEYS"

    // $ANTLR start "KW_KEY_TYPE"
    public final void mKW_KEY_TYPE() throws RecognitionException {
        try {
            int _type = KW_KEY_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:128:12: ( '$KEY$' )
            // HiveLexer.g:128:14: '$KEY$'
            {
            match("$KEY$"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_KEY_TYPE"

    // $ANTLR start "KW_LINES"
    public final void mKW_LINES() throws RecognitionException {
        try {
            int _type = KW_LINES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:129:9: ( 'LINES' )
            // HiveLexer.g:129:11: 'LINES'
            {
            match("LINES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LINES"

    // $ANTLR start "KW_STORED"
    public final void mKW_STORED() throws RecognitionException {
        try {
            int _type = KW_STORED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:130:10: ( 'STORED' )
            // HiveLexer.g:130:12: 'STORED'
            {
            match("STORED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_STORED"

    // $ANTLR start "KW_FILEFORMAT"
    public final void mKW_FILEFORMAT() throws RecognitionException {
        try {
            int _type = KW_FILEFORMAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:131:14: ( 'FILEFORMAT' )
            // HiveLexer.g:131:16: 'FILEFORMAT'
            {
            match("FILEFORMAT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FILEFORMAT"

    // $ANTLR start "KW_SEQUENCEFILE"
    public final void mKW_SEQUENCEFILE() throws RecognitionException {
        try {
            int _type = KW_SEQUENCEFILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:132:16: ( 'SEQUENCEFILE' )
            // HiveLexer.g:132:18: 'SEQUENCEFILE'
            {
            match("SEQUENCEFILE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SEQUENCEFILE"

    // $ANTLR start "KW_TEXTFILE"
    public final void mKW_TEXTFILE() throws RecognitionException {
        try {
            int _type = KW_TEXTFILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:133:12: ( 'TEXTFILE' )
            // HiveLexer.g:133:14: 'TEXTFILE'
            {
            match("TEXTFILE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TEXTFILE"

    // $ANTLR start "KW_RCFILE"
    public final void mKW_RCFILE() throws RecognitionException {
        try {
            int _type = KW_RCFILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:134:10: ( 'RCFILE' )
            // HiveLexer.g:134:12: 'RCFILE'
            {
            match("RCFILE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_RCFILE"

    // $ANTLR start "KW_ORCFILE"
    public final void mKW_ORCFILE() throws RecognitionException {
        try {
            int _type = KW_ORCFILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:135:11: ( 'ORC' )
            // HiveLexer.g:135:13: 'ORC'
            {
            match("ORC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ORCFILE"

    // $ANTLR start "KW_INPUTFORMAT"
    public final void mKW_INPUTFORMAT() throws RecognitionException {
        try {
            int _type = KW_INPUTFORMAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:136:15: ( 'INPUTFORMAT' )
            // HiveLexer.g:136:17: 'INPUTFORMAT'
            {
            match("INPUTFORMAT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INPUTFORMAT"

    // $ANTLR start "KW_OUTPUTFORMAT"
    public final void mKW_OUTPUTFORMAT() throws RecognitionException {
        try {
            int _type = KW_OUTPUTFORMAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:137:16: ( 'OUTPUTFORMAT' )
            // HiveLexer.g:137:18: 'OUTPUTFORMAT'
            {
            match("OUTPUTFORMAT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OUTPUTFORMAT"

    // $ANTLR start "KW_INPUTDRIVER"
    public final void mKW_INPUTDRIVER() throws RecognitionException {
        try {
            int _type = KW_INPUTDRIVER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:138:15: ( 'INPUTDRIVER' )
            // HiveLexer.g:138:17: 'INPUTDRIVER'
            {
            match("INPUTDRIVER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INPUTDRIVER"

    // $ANTLR start "KW_OUTPUTDRIVER"
    public final void mKW_OUTPUTDRIVER() throws RecognitionException {
        try {
            int _type = KW_OUTPUTDRIVER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:139:16: ( 'OUTPUTDRIVER' )
            // HiveLexer.g:139:18: 'OUTPUTDRIVER'
            {
            match("OUTPUTDRIVER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OUTPUTDRIVER"

    // $ANTLR start "KW_OFFLINE"
    public final void mKW_OFFLINE() throws RecognitionException {
        try {
            int _type = KW_OFFLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:140:11: ( 'OFFLINE' )
            // HiveLexer.g:140:13: 'OFFLINE'
            {
            match("OFFLINE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OFFLINE"

    // $ANTLR start "KW_ENABLE"
    public final void mKW_ENABLE() throws RecognitionException {
        try {
            int _type = KW_ENABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:141:10: ( 'ENABLE' )
            // HiveLexer.g:141:12: 'ENABLE'
            {
            match("ENABLE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ENABLE"

    // $ANTLR start "KW_DISABLE"
    public final void mKW_DISABLE() throws RecognitionException {
        try {
            int _type = KW_DISABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:142:11: ( 'DISABLE' )
            // HiveLexer.g:142:13: 'DISABLE'
            {
            match("DISABLE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DISABLE"

    // $ANTLR start "KW_READONLY"
    public final void mKW_READONLY() throws RecognitionException {
        try {
            int _type = KW_READONLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:143:12: ( 'READONLY' )
            // HiveLexer.g:143:14: 'READONLY'
            {
            match("READONLY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_READONLY"

    // $ANTLR start "KW_NO_DROP"
    public final void mKW_NO_DROP() throws RecognitionException {
        try {
            int _type = KW_NO_DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:144:11: ( 'NO_DROP' )
            // HiveLexer.g:144:13: 'NO_DROP'
            {
            match("NO_DROP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_NO_DROP"

    // $ANTLR start "KW_LOCATION"
    public final void mKW_LOCATION() throws RecognitionException {
        try {
            int _type = KW_LOCATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:145:12: ( 'LOCATION' )
            // HiveLexer.g:145:14: 'LOCATION'
            {
            match("LOCATION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LOCATION"

    // $ANTLR start "KW_TABLESAMPLE"
    public final void mKW_TABLESAMPLE() throws RecognitionException {
        try {
            int _type = KW_TABLESAMPLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:146:15: ( 'TABLESAMPLE' )
            // HiveLexer.g:146:17: 'TABLESAMPLE'
            {
            match("TABLESAMPLE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TABLESAMPLE"

    // $ANTLR start "KW_BUCKET"
    public final void mKW_BUCKET() throws RecognitionException {
        try {
            int _type = KW_BUCKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:147:10: ( 'BUCKET' )
            // HiveLexer.g:147:12: 'BUCKET'
            {
            match("BUCKET"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_BUCKET"

    // $ANTLR start "KW_OUT"
    public final void mKW_OUT() throws RecognitionException {
        try {
            int _type = KW_OUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:148:7: ( 'OUT' )
            // HiveLexer.g:148:9: 'OUT'
            {
            match("OUT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OUT"

    // $ANTLR start "KW_OF"
    public final void mKW_OF() throws RecognitionException {
        try {
            int _type = KW_OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:149:6: ( 'OF' )
            // HiveLexer.g:149:8: 'OF'
            {
            match("OF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OF"

    // $ANTLR start "KW_PERCENT"
    public final void mKW_PERCENT() throws RecognitionException {
        try {
            int _type = KW_PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:150:11: ( 'PERCENT' )
            // HiveLexer.g:150:13: 'PERCENT'
            {
            match("PERCENT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PERCENT"

    // $ANTLR start "KW_CAST"
    public final void mKW_CAST() throws RecognitionException {
        try {
            int _type = KW_CAST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:151:8: ( 'CAST' )
            // HiveLexer.g:151:10: 'CAST'
            {
            match("CAST"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CAST"

    // $ANTLR start "KW_ADD"
    public final void mKW_ADD() throws RecognitionException {
        try {
            int _type = KW_ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:152:7: ( 'ADD' )
            // HiveLexer.g:152:9: 'ADD'
            {
            match("ADD"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ADD"

    // $ANTLR start "KW_REPLACE"
    public final void mKW_REPLACE() throws RecognitionException {
        try {
            int _type = KW_REPLACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:153:11: ( 'REPLACE' )
            // HiveLexer.g:153:13: 'REPLACE'
            {
            match("REPLACE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_REPLACE"

    // $ANTLR start "KW_RLIKE"
    public final void mKW_RLIKE() throws RecognitionException {
        try {
            int _type = KW_RLIKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:154:9: ( 'RLIKE' )
            // HiveLexer.g:154:11: 'RLIKE'
            {
            match("RLIKE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_RLIKE"

    // $ANTLR start "KW_REGEXP"
    public final void mKW_REGEXP() throws RecognitionException {
        try {
            int _type = KW_REGEXP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:155:10: ( 'REGEXP' )
            // HiveLexer.g:155:12: 'REGEXP'
            {
            match("REGEXP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_REGEXP"

    // $ANTLR start "KW_TEMPORARY"
    public final void mKW_TEMPORARY() throws RecognitionException {
        try {
            int _type = KW_TEMPORARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:156:13: ( 'TEMPORARY' )
            // HiveLexer.g:156:15: 'TEMPORARY'
            {
            match("TEMPORARY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TEMPORARY"

    // $ANTLR start "KW_FUNCTION"
    public final void mKW_FUNCTION() throws RecognitionException {
        try {
            int _type = KW_FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:157:12: ( 'FUNCTION' )
            // HiveLexer.g:157:14: 'FUNCTION'
            {
            match("FUNCTION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FUNCTION"

    // $ANTLR start "KW_MACRO"
    public final void mKW_MACRO() throws RecognitionException {
        try {
            int _type = KW_MACRO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:158:9: ( 'MACRO' )
            // HiveLexer.g:158:11: 'MACRO'
            {
            match("MACRO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MACRO"

    // $ANTLR start "KW_EXPLAIN"
    public final void mKW_EXPLAIN() throws RecognitionException {
        try {
            int _type = KW_EXPLAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:159:11: ( 'EXPLAIN' )
            // HiveLexer.g:159:13: 'EXPLAIN'
            {
            match("EXPLAIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_EXPLAIN"

    // $ANTLR start "KW_EXTENDED"
    public final void mKW_EXTENDED() throws RecognitionException {
        try {
            int _type = KW_EXTENDED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:160:12: ( 'EXTENDED' )
            // HiveLexer.g:160:14: 'EXTENDED'
            {
            match("EXTENDED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_EXTENDED"

    // $ANTLR start "KW_FORMATTED"
    public final void mKW_FORMATTED() throws RecognitionException {
        try {
            int _type = KW_FORMATTED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:161:13: ( 'FORMATTED' )
            // HiveLexer.g:161:15: 'FORMATTED'
            {
            match("FORMATTED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FORMATTED"

    // $ANTLR start "KW_PRETTY"
    public final void mKW_PRETTY() throws RecognitionException {
        try {
            int _type = KW_PRETTY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:162:10: ( 'PRETTY' )
            // HiveLexer.g:162:12: 'PRETTY'
            {
            match("PRETTY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PRETTY"

    // $ANTLR start "KW_DEPENDENCY"
    public final void mKW_DEPENDENCY() throws RecognitionException {
        try {
            int _type = KW_DEPENDENCY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:163:14: ( 'DEPENDENCY' )
            // HiveLexer.g:163:16: 'DEPENDENCY'
            {
            match("DEPENDENCY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DEPENDENCY"

    // $ANTLR start "KW_LOGICAL"
    public final void mKW_LOGICAL() throws RecognitionException {
        try {
            int _type = KW_LOGICAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:164:11: ( 'LOGICAL' )
            // HiveLexer.g:164:13: 'LOGICAL'
            {
            match("LOGICAL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LOGICAL"

    // $ANTLR start "KW_SERDE"
    public final void mKW_SERDE() throws RecognitionException {
        try {
            int _type = KW_SERDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:165:9: ( 'SERDE' )
            // HiveLexer.g:165:11: 'SERDE'
            {
            match("SERDE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SERDE"

    // $ANTLR start "KW_WITH"
    public final void mKW_WITH() throws RecognitionException {
        try {
            int _type = KW_WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:166:8: ( 'WITH' )
            // HiveLexer.g:166:10: 'WITH'
            {
            match("WITH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_WITH"

    // $ANTLR start "KW_DEFERRED"
    public final void mKW_DEFERRED() throws RecognitionException {
        try {
            int _type = KW_DEFERRED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:167:12: ( 'DEFERRED' )
            // HiveLexer.g:167:14: 'DEFERRED'
            {
            match("DEFERRED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DEFERRED"

    // $ANTLR start "KW_SERDEPROPERTIES"
    public final void mKW_SERDEPROPERTIES() throws RecognitionException {
        try {
            int _type = KW_SERDEPROPERTIES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:168:19: ( 'SERDEPROPERTIES' )
            // HiveLexer.g:168:21: 'SERDEPROPERTIES'
            {
            match("SERDEPROPERTIES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SERDEPROPERTIES"

    // $ANTLR start "KW_DBPROPERTIES"
    public final void mKW_DBPROPERTIES() throws RecognitionException {
        try {
            int _type = KW_DBPROPERTIES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:169:16: ( 'DBPROPERTIES' )
            // HiveLexer.g:169:18: 'DBPROPERTIES'
            {
            match("DBPROPERTIES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DBPROPERTIES"

    // $ANTLR start "KW_LIMIT"
    public final void mKW_LIMIT() throws RecognitionException {
        try {
            int _type = KW_LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:170:9: ( 'LIMIT' )
            // HiveLexer.g:170:11: 'LIMIT'
            {
            match("LIMIT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LIMIT"

    // $ANTLR start "KW_SET"
    public final void mKW_SET() throws RecognitionException {
        try {
            int _type = KW_SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:171:7: ( 'SET' )
            // HiveLexer.g:171:9: 'SET'
            {
            match("SET"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SET"

    // $ANTLR start "KW_UNSET"
    public final void mKW_UNSET() throws RecognitionException {
        try {
            int _type = KW_UNSET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:172:9: ( 'UNSET' )
            // HiveLexer.g:172:11: 'UNSET'
            {
            match("UNSET"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNSET"

    // $ANTLR start "KW_TBLPROPERTIES"
    public final void mKW_TBLPROPERTIES() throws RecognitionException {
        try {
            int _type = KW_TBLPROPERTIES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:173:17: ( 'TBLPROPERTIES' )
            // HiveLexer.g:173:19: 'TBLPROPERTIES'
            {
            match("TBLPROPERTIES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TBLPROPERTIES"

    // $ANTLR start "KW_IDXPROPERTIES"
    public final void mKW_IDXPROPERTIES() throws RecognitionException {
        try {
            int _type = KW_IDXPROPERTIES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:174:17: ( 'IDXPROPERTIES' )
            // HiveLexer.g:174:19: 'IDXPROPERTIES'
            {
            match("IDXPROPERTIES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_IDXPROPERTIES"

    // $ANTLR start "KW_VALUE_TYPE"
    public final void mKW_VALUE_TYPE() throws RecognitionException {
        try {
            int _type = KW_VALUE_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:175:14: ( '$VALUE$' )
            // HiveLexer.g:175:16: '$VALUE$'
            {
            match("$VALUE$"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_VALUE_TYPE"

    // $ANTLR start "KW_ELEM_TYPE"
    public final void mKW_ELEM_TYPE() throws RecognitionException {
        try {
            int _type = KW_ELEM_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:176:13: ( '$ELEM$' )
            // HiveLexer.g:176:15: '$ELEM$'
            {
            match("$ELEM$"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ELEM_TYPE"

    // $ANTLR start "KW_CASE"
    public final void mKW_CASE() throws RecognitionException {
        try {
            int _type = KW_CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:177:8: ( 'CASE' )
            // HiveLexer.g:177:10: 'CASE'
            {
            match("CASE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CASE"

    // $ANTLR start "KW_WHEN"
    public final void mKW_WHEN() throws RecognitionException {
        try {
            int _type = KW_WHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:178:8: ( 'WHEN' )
            // HiveLexer.g:178:10: 'WHEN'
            {
            match("WHEN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_WHEN"

    // $ANTLR start "KW_THEN"
    public final void mKW_THEN() throws RecognitionException {
        try {
            int _type = KW_THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:179:8: ( 'THEN' )
            // HiveLexer.g:179:10: 'THEN'
            {
            match("THEN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_THEN"

    // $ANTLR start "KW_ELSE"
    public final void mKW_ELSE() throws RecognitionException {
        try {
            int _type = KW_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:180:8: ( 'ELSE' )
            // HiveLexer.g:180:10: 'ELSE'
            {
            match("ELSE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ELSE"

    // $ANTLR start "KW_END"
    public final void mKW_END() throws RecognitionException {
        try {
            int _type = KW_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:181:7: ( 'END' )
            // HiveLexer.g:181:9: 'END'
            {
            match("END"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_END"

    // $ANTLR start "KW_MAPJOIN"
    public final void mKW_MAPJOIN() throws RecognitionException {
        try {
            int _type = KW_MAPJOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:182:11: ( 'MAPJOIN' )
            // HiveLexer.g:182:13: 'MAPJOIN'
            {
            match("MAPJOIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MAPJOIN"

    // $ANTLR start "KW_STREAMTABLE"
    public final void mKW_STREAMTABLE() throws RecognitionException {
        try {
            int _type = KW_STREAMTABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:183:15: ( 'STREAMTABLE' )
            // HiveLexer.g:183:17: 'STREAMTABLE'
            {
            match("STREAMTABLE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_STREAMTABLE"

    // $ANTLR start "KW_HOLD_DDLTIME"
    public final void mKW_HOLD_DDLTIME() throws RecognitionException {
        try {
            int _type = KW_HOLD_DDLTIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:184:16: ( 'HOLD_DDLTIME' )
            // HiveLexer.g:184:18: 'HOLD_DDLTIME'
            {
            match("HOLD_DDLTIME"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_HOLD_DDLTIME"

    // $ANTLR start "KW_CLUSTERSTATUS"
    public final void mKW_CLUSTERSTATUS() throws RecognitionException {
        try {
            int _type = KW_CLUSTERSTATUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:185:17: ( 'CLUSTERSTATUS' )
            // HiveLexer.g:185:19: 'CLUSTERSTATUS'
            {
            match("CLUSTERSTATUS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CLUSTERSTATUS"

    // $ANTLR start "KW_UTC"
    public final void mKW_UTC() throws RecognitionException {
        try {
            int _type = KW_UTC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:186:7: ( 'UTC' )
            // HiveLexer.g:186:9: 'UTC'
            {
            match("UTC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UTC"

    // $ANTLR start "KW_UTCTIMESTAMP"
    public final void mKW_UTCTIMESTAMP() throws RecognitionException {
        try {
            int _type = KW_UTCTIMESTAMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:187:16: ( 'UTC_TMESTAMP' )
            // HiveLexer.g:187:18: 'UTC_TMESTAMP'
            {
            match("UTC_TMESTAMP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UTCTIMESTAMP"

    // $ANTLR start "KW_LONG"
    public final void mKW_LONG() throws RecognitionException {
        try {
            int _type = KW_LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:188:8: ( 'LONG' )
            // HiveLexer.g:188:10: 'LONG'
            {
            match("LONG"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LONG"

    // $ANTLR start "KW_DELETE"
    public final void mKW_DELETE() throws RecognitionException {
        try {
            int _type = KW_DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:189:10: ( 'DELETE' )
            // HiveLexer.g:189:12: 'DELETE'
            {
            match("DELETE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DELETE"

    // $ANTLR start "KW_PLUS"
    public final void mKW_PLUS() throws RecognitionException {
        try {
            int _type = KW_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:190:8: ( 'PLUS' )
            // HiveLexer.g:190:10: 'PLUS'
            {
            match("PLUS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PLUS"

    // $ANTLR start "KW_MINUS"
    public final void mKW_MINUS() throws RecognitionException {
        try {
            int _type = KW_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:191:9: ( 'MINUS' )
            // HiveLexer.g:191:11: 'MINUS'
            {
            match("MINUS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MINUS"

    // $ANTLR start "KW_FETCH"
    public final void mKW_FETCH() throws RecognitionException {
        try {
            int _type = KW_FETCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:192:9: ( 'FETCH' )
            // HiveLexer.g:192:11: 'FETCH'
            {
            match("FETCH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FETCH"

    // $ANTLR start "KW_INTERSECT"
    public final void mKW_INTERSECT() throws RecognitionException {
        try {
            int _type = KW_INTERSECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:193:13: ( 'INTERSECT' )
            // HiveLexer.g:193:15: 'INTERSECT'
            {
            match("INTERSECT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INTERSECT"

    // $ANTLR start "KW_VIEW"
    public final void mKW_VIEW() throws RecognitionException {
        try {
            int _type = KW_VIEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:194:8: ( 'VIEW' )
            // HiveLexer.g:194:10: 'VIEW'
            {
            match("VIEW"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_VIEW"

    // $ANTLR start "KW_IN"
    public final void mKW_IN() throws RecognitionException {
        try {
            int _type = KW_IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:195:6: ( 'IN' )
            // HiveLexer.g:195:8: 'IN'
            {
            match("IN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_IN"

    // $ANTLR start "KW_DATABASE"
    public final void mKW_DATABASE() throws RecognitionException {
        try {
            int _type = KW_DATABASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:196:12: ( 'DATABASE' )
            // HiveLexer.g:196:14: 'DATABASE'
            {
            match("DATABASE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DATABASE"

    // $ANTLR start "KW_DATABASES"
    public final void mKW_DATABASES() throws RecognitionException {
        try {
            int _type = KW_DATABASES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:197:13: ( 'DATABASES' )
            // HiveLexer.g:197:15: 'DATABASES'
            {
            match("DATABASES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DATABASES"

    // $ANTLR start "KW_MATERIALIZED"
    public final void mKW_MATERIALIZED() throws RecognitionException {
        try {
            int _type = KW_MATERIALIZED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:198:16: ( 'MATERIALIZED' )
            // HiveLexer.g:198:18: 'MATERIALIZED'
            {
            match("MATERIALIZED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MATERIALIZED"

    // $ANTLR start "KW_SCHEMA"
    public final void mKW_SCHEMA() throws RecognitionException {
        try {
            int _type = KW_SCHEMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:199:10: ( 'SCHEMA' )
            // HiveLexer.g:199:12: 'SCHEMA'
            {
            match("SCHEMA"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SCHEMA"

    // $ANTLR start "KW_SCHEMAS"
    public final void mKW_SCHEMAS() throws RecognitionException {
        try {
            int _type = KW_SCHEMAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:200:11: ( 'SCHEMAS' )
            // HiveLexer.g:200:13: 'SCHEMAS'
            {
            match("SCHEMAS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SCHEMAS"

    // $ANTLR start "KW_GRANT"
    public final void mKW_GRANT() throws RecognitionException {
        try {
            int _type = KW_GRANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:201:9: ( 'GRANT' )
            // HiveLexer.g:201:11: 'GRANT'
            {
            match("GRANT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_GRANT"

    // $ANTLR start "KW_REVOKE"
    public final void mKW_REVOKE() throws RecognitionException {
        try {
            int _type = KW_REVOKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:202:10: ( 'REVOKE' )
            // HiveLexer.g:202:12: 'REVOKE'
            {
            match("REVOKE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_REVOKE"

    // $ANTLR start "KW_SSL"
    public final void mKW_SSL() throws RecognitionException {
        try {
            int _type = KW_SSL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:203:7: ( 'SSL' )
            // HiveLexer.g:203:9: 'SSL'
            {
            match("SSL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SSL"

    // $ANTLR start "KW_UNDO"
    public final void mKW_UNDO() throws RecognitionException {
        try {
            int _type = KW_UNDO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:204:8: ( 'UNDO' )
            // HiveLexer.g:204:10: 'UNDO'
            {
            match("UNDO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNDO"

    // $ANTLR start "KW_LOCK"
    public final void mKW_LOCK() throws RecognitionException {
        try {
            int _type = KW_LOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:205:8: ( 'LOCK' )
            // HiveLexer.g:205:10: 'LOCK'
            {
            match("LOCK"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LOCK"

    // $ANTLR start "KW_LOCKS"
    public final void mKW_LOCKS() throws RecognitionException {
        try {
            int _type = KW_LOCKS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:206:9: ( 'LOCKS' )
            // HiveLexer.g:206:11: 'LOCKS'
            {
            match("LOCKS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LOCKS"

    // $ANTLR start "KW_UNLOCK"
    public final void mKW_UNLOCK() throws RecognitionException {
        try {
            int _type = KW_UNLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:207:10: ( 'UNLOCK' )
            // HiveLexer.g:207:12: 'UNLOCK'
            {
            match("UNLOCK"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNLOCK"

    // $ANTLR start "KW_SHARED"
    public final void mKW_SHARED() throws RecognitionException {
        try {
            int _type = KW_SHARED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:208:10: ( 'SHARED' )
            // HiveLexer.g:208:12: 'SHARED'
            {
            match("SHARED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SHARED"

    // $ANTLR start "KW_EXCLUSIVE"
    public final void mKW_EXCLUSIVE() throws RecognitionException {
        try {
            int _type = KW_EXCLUSIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:209:13: ( 'EXCLUSIVE' )
            // HiveLexer.g:209:15: 'EXCLUSIVE'
            {
            match("EXCLUSIVE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_EXCLUSIVE"

    // $ANTLR start "KW_PROCEDURE"
    public final void mKW_PROCEDURE() throws RecognitionException {
        try {
            int _type = KW_PROCEDURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:210:13: ( 'PROCEDURE' )
            // HiveLexer.g:210:15: 'PROCEDURE'
            {
            match("PROCEDURE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PROCEDURE"

    // $ANTLR start "KW_UNSIGNED"
    public final void mKW_UNSIGNED() throws RecognitionException {
        try {
            int _type = KW_UNSIGNED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:211:12: ( 'UNSIGNED' )
            // HiveLexer.g:211:14: 'UNSIGNED'
            {
            match("UNSIGNED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNSIGNED"

    // $ANTLR start "KW_WHILE"
    public final void mKW_WHILE() throws RecognitionException {
        try {
            int _type = KW_WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:212:9: ( 'WHILE' )
            // HiveLexer.g:212:11: 'WHILE'
            {
            match("WHILE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_WHILE"

    // $ANTLR start "KW_READ"
    public final void mKW_READ() throws RecognitionException {
        try {
            int _type = KW_READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:213:8: ( 'READ' )
            // HiveLexer.g:213:10: 'READ'
            {
            match("READ"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_READ"

    // $ANTLR start "KW_READS"
    public final void mKW_READS() throws RecognitionException {
        try {
            int _type = KW_READS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:214:9: ( 'READS' )
            // HiveLexer.g:214:11: 'READS'
            {
            match("READS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_READS"

    // $ANTLR start "KW_PURGE"
    public final void mKW_PURGE() throws RecognitionException {
        try {
            int _type = KW_PURGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:215:9: ( 'PURGE' )
            // HiveLexer.g:215:11: 'PURGE'
            {
            match("PURGE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PURGE"

    // $ANTLR start "KW_RANGE"
    public final void mKW_RANGE() throws RecognitionException {
        try {
            int _type = KW_RANGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:216:9: ( 'RANGE' )
            // HiveLexer.g:216:11: 'RANGE'
            {
            match("RANGE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_RANGE"

    // $ANTLR start "KW_ANALYZE"
    public final void mKW_ANALYZE() throws RecognitionException {
        try {
            int _type = KW_ANALYZE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:217:11: ( 'ANALYZE' )
            // HiveLexer.g:217:13: 'ANALYZE'
            {
            match("ANALYZE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ANALYZE"

    // $ANTLR start "KW_BEFORE"
    public final void mKW_BEFORE() throws RecognitionException {
        try {
            int _type = KW_BEFORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:218:10: ( 'BEFORE' )
            // HiveLexer.g:218:12: 'BEFORE'
            {
            match("BEFORE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_BEFORE"

    // $ANTLR start "KW_BETWEEN"
    public final void mKW_BETWEEN() throws RecognitionException {
        try {
            int _type = KW_BETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:219:11: ( 'BETWEEN' )
            // HiveLexer.g:219:13: 'BETWEEN'
            {
            match("BETWEEN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_BETWEEN"

    // $ANTLR start "KW_BOTH"
    public final void mKW_BOTH() throws RecognitionException {
        try {
            int _type = KW_BOTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:220:8: ( 'BOTH' )
            // HiveLexer.g:220:10: 'BOTH'
            {
            match("BOTH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_BOTH"

    // $ANTLR start "KW_BINARY"
    public final void mKW_BINARY() throws RecognitionException {
        try {
            int _type = KW_BINARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:221:10: ( 'BINARY' )
            // HiveLexer.g:221:12: 'BINARY'
            {
            match("BINARY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_BINARY"

    // $ANTLR start "KW_CROSS"
    public final void mKW_CROSS() throws RecognitionException {
        try {
            int _type = KW_CROSS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:222:9: ( 'CROSS' )
            // HiveLexer.g:222:11: 'CROSS'
            {
            match("CROSS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CROSS"

    // $ANTLR start "KW_CONTINUE"
    public final void mKW_CONTINUE() throws RecognitionException {
        try {
            int _type = KW_CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:223:12: ( 'CONTINUE' )
            // HiveLexer.g:223:14: 'CONTINUE'
            {
            match("CONTINUE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CONTINUE"

    // $ANTLR start "KW_CURSOR"
    public final void mKW_CURSOR() throws RecognitionException {
        try {
            int _type = KW_CURSOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:224:10: ( 'CURSOR' )
            // HiveLexer.g:224:12: 'CURSOR'
            {
            match("CURSOR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CURSOR"

    // $ANTLR start "KW_TRIGGER"
    public final void mKW_TRIGGER() throws RecognitionException {
        try {
            int _type = KW_TRIGGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:225:11: ( 'TRIGGER' )
            // HiveLexer.g:225:13: 'TRIGGER'
            {
            match("TRIGGER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TRIGGER"

    // $ANTLR start "KW_RECORDREADER"
    public final void mKW_RECORDREADER() throws RecognitionException {
        try {
            int _type = KW_RECORDREADER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:226:16: ( 'RECORDREADER' )
            // HiveLexer.g:226:18: 'RECORDREADER'
            {
            match("RECORDREADER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_RECORDREADER"

    // $ANTLR start "KW_RECORDWRITER"
    public final void mKW_RECORDWRITER() throws RecognitionException {
        try {
            int _type = KW_RECORDWRITER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:227:16: ( 'RECORDWRITER' )
            // HiveLexer.g:227:18: 'RECORDWRITER'
            {
            match("RECORDWRITER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_RECORDWRITER"

    // $ANTLR start "KW_SEMI"
    public final void mKW_SEMI() throws RecognitionException {
        try {
            int _type = KW_SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:228:8: ( 'SEMI' )
            // HiveLexer.g:228:10: 'SEMI'
            {
            match("SEMI"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SEMI"

    // $ANTLR start "KW_LATERAL"
    public final void mKW_LATERAL() throws RecognitionException {
        try {
            int _type = KW_LATERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:229:11: ( 'LATERAL' )
            // HiveLexer.g:229:13: 'LATERAL'
            {
            match("LATERAL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LATERAL"

    // $ANTLR start "KW_TOUCH"
    public final void mKW_TOUCH() throws RecognitionException {
        try {
            int _type = KW_TOUCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:230:9: ( 'TOUCH' )
            // HiveLexer.g:230:11: 'TOUCH'
            {
            match("TOUCH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TOUCH"

    // $ANTLR start "KW_ARCHIVE"
    public final void mKW_ARCHIVE() throws RecognitionException {
        try {
            int _type = KW_ARCHIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:231:11: ( 'ARCHIVE' )
            // HiveLexer.g:231:13: 'ARCHIVE'
            {
            match("ARCHIVE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ARCHIVE"

    // $ANTLR start "KW_UNARCHIVE"
    public final void mKW_UNARCHIVE() throws RecognitionException {
        try {
            int _type = KW_UNARCHIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:232:13: ( 'UNARCHIVE' )
            // HiveLexer.g:232:15: 'UNARCHIVE'
            {
            match("UNARCHIVE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNARCHIVE"

    // $ANTLR start "KW_COMPUTE"
    public final void mKW_COMPUTE() throws RecognitionException {
        try {
            int _type = KW_COMPUTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:233:11: ( 'COMPUTE' )
            // HiveLexer.g:233:13: 'COMPUTE'
            {
            match("COMPUTE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_COMPUTE"

    // $ANTLR start "KW_STATISTICS"
    public final void mKW_STATISTICS() throws RecognitionException {
        try {
            int _type = KW_STATISTICS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:234:14: ( 'STATISTICS' )
            // HiveLexer.g:234:16: 'STATISTICS'
            {
            match("STATISTICS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_STATISTICS"

    // $ANTLR start "KW_USE"
    public final void mKW_USE() throws RecognitionException {
        try {
            int _type = KW_USE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:235:7: ( 'USE' )
            // HiveLexer.g:235:9: 'USE'
            {
            match("USE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_USE"

    // $ANTLR start "KW_OPTION"
    public final void mKW_OPTION() throws RecognitionException {
        try {
            int _type = KW_OPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:236:10: ( 'OPTION' )
            // HiveLexer.g:236:12: 'OPTION'
            {
            match("OPTION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OPTION"

    // $ANTLR start "KW_CONCATENATE"
    public final void mKW_CONCATENATE() throws RecognitionException {
        try {
            int _type = KW_CONCATENATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:237:15: ( 'CONCATENATE' )
            // HiveLexer.g:237:17: 'CONCATENATE'
            {
            match("CONCATENATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CONCATENATE"

    // $ANTLR start "KW_SHOW_DATABASE"
    public final void mKW_SHOW_DATABASE() throws RecognitionException {
        try {
            int _type = KW_SHOW_DATABASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:238:17: ( 'SHOW_DATABASE' )
            // HiveLexer.g:238:19: 'SHOW_DATABASE'
            {
            match("SHOW_DATABASE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SHOW_DATABASE"

    // $ANTLR start "KW_UPDATE"
    public final void mKW_UPDATE() throws RecognitionException {
        try {
            int _type = KW_UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:239:10: ( 'UPDATE' )
            // HiveLexer.g:239:12: 'UPDATE'
            {
            match("UPDATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UPDATE"

    // $ANTLR start "KW_RESTRICT"
    public final void mKW_RESTRICT() throws RecognitionException {
        try {
            int _type = KW_RESTRICT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:240:12: ( 'RESTRICT' )
            // HiveLexer.g:240:14: 'RESTRICT'
            {
            match("RESTRICT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_RESTRICT"

    // $ANTLR start "KW_CASCADE"
    public final void mKW_CASCADE() throws RecognitionException {
        try {
            int _type = KW_CASCADE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:241:11: ( 'CASCADE' )
            // HiveLexer.g:241:13: 'CASCADE'
            {
            match("CASCADE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CASCADE"

    // $ANTLR start "KW_SKEWED"
    public final void mKW_SKEWED() throws RecognitionException {
        try {
            int _type = KW_SKEWED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:242:10: ( 'SKEWED' )
            // HiveLexer.g:242:12: 'SKEWED'
            {
            match("SKEWED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SKEWED"

    // $ANTLR start "KW_ROLLUP"
    public final void mKW_ROLLUP() throws RecognitionException {
        try {
            int _type = KW_ROLLUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:243:10: ( 'ROLLUP' )
            // HiveLexer.g:243:12: 'ROLLUP'
            {
            match("ROLLUP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ROLLUP"

    // $ANTLR start "KW_CUBE"
    public final void mKW_CUBE() throws RecognitionException {
        try {
            int _type = KW_CUBE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:244:8: ( 'CUBE' )
            // HiveLexer.g:244:10: 'CUBE'
            {
            match("CUBE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CUBE"

    // $ANTLR start "KW_DIRECTORIES"
    public final void mKW_DIRECTORIES() throws RecognitionException {
        try {
            int _type = KW_DIRECTORIES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:245:15: ( 'DIRECTORIES' )
            // HiveLexer.g:245:17: 'DIRECTORIES'
            {
            match("DIRECTORIES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DIRECTORIES"

    // $ANTLR start "KW_FOR"
    public final void mKW_FOR() throws RecognitionException {
        try {
            int _type = KW_FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:246:7: ( 'FOR' )
            // HiveLexer.g:246:9: 'FOR'
            {
            match("FOR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FOR"

    // $ANTLR start "KW_WINDOW"
    public final void mKW_WINDOW() throws RecognitionException {
        try {
            int _type = KW_WINDOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:247:10: ( 'WINDOW' )
            // HiveLexer.g:247:12: 'WINDOW'
            {
            match("WINDOW"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_WINDOW"

    // $ANTLR start "KW_UNBOUNDED"
    public final void mKW_UNBOUNDED() throws RecognitionException {
        try {
            int _type = KW_UNBOUNDED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:248:13: ( 'UNBOUNDED' )
            // HiveLexer.g:248:15: 'UNBOUNDED'
            {
            match("UNBOUNDED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNBOUNDED"

    // $ANTLR start "KW_PRECEDING"
    public final void mKW_PRECEDING() throws RecognitionException {
        try {
            int _type = KW_PRECEDING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:249:13: ( 'PRECEDING' )
            // HiveLexer.g:249:15: 'PRECEDING'
            {
            match("PRECEDING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PRECEDING"

    // $ANTLR start "KW_FOLLOWING"
    public final void mKW_FOLLOWING() throws RecognitionException {
        try {
            int _type = KW_FOLLOWING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:250:13: ( 'FOLLOWING' )
            // HiveLexer.g:250:15: 'FOLLOWING'
            {
            match("FOLLOWING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FOLLOWING"

    // $ANTLR start "KW_CURRENT"
    public final void mKW_CURRENT() throws RecognitionException {
        try {
            int _type = KW_CURRENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:251:11: ( 'CURRENT' )
            // HiveLexer.g:251:13: 'CURRENT'
            {
            match("CURRENT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CURRENT"

    // $ANTLR start "KW_LESS"
    public final void mKW_LESS() throws RecognitionException {
        try {
            int _type = KW_LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:252:8: ( 'LESS' )
            // HiveLexer.g:252:10: 'LESS'
            {
            match("LESS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LESS"

    // $ANTLR start "KW_MORE"
    public final void mKW_MORE() throws RecognitionException {
        try {
            int _type = KW_MORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:253:8: ( 'MORE' )
            // HiveLexer.g:253:10: 'MORE'
            {
            match("MORE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MORE"

    // $ANTLR start "KW_OVER"
    public final void mKW_OVER() throws RecognitionException {
        try {
            int _type = KW_OVER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:254:8: ( 'OVER' )
            // HiveLexer.g:254:10: 'OVER'
            {
            match("OVER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OVER"

    // $ANTLR start "KW_GROUPING"
    public final void mKW_GROUPING() throws RecognitionException {
        try {
            int _type = KW_GROUPING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:255:12: ( 'GROUPING' )
            // HiveLexer.g:255:14: 'GROUPING'
            {
            match("GROUPING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_GROUPING"

    // $ANTLR start "KW_SETS"
    public final void mKW_SETS() throws RecognitionException {
        try {
            int _type = KW_SETS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:256:8: ( 'SETS' )
            // HiveLexer.g:256:10: 'SETS'
            {
            match("SETS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SETS"

    // $ANTLR start "KW_TRUNCATE"
    public final void mKW_TRUNCATE() throws RecognitionException {
        try {
            int _type = KW_TRUNCATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:257:12: ( 'TRUNCATE' )
            // HiveLexer.g:257:14: 'TRUNCATE'
            {
            match("TRUNCATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TRUNCATE"

    // $ANTLR start "KW_NOSCAN"
    public final void mKW_NOSCAN() throws RecognitionException {
        try {
            int _type = KW_NOSCAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:258:10: ( 'NOSCAN' )
            // HiveLexer.g:258:12: 'NOSCAN'
            {
            match("NOSCAN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_NOSCAN"

    // $ANTLR start "KW_PARTIALSCAN"
    public final void mKW_PARTIALSCAN() throws RecognitionException {
        try {
            int _type = KW_PARTIALSCAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:259:15: ( 'PARTIALSCAN' )
            // HiveLexer.g:259:17: 'PARTIALSCAN'
            {
            match("PARTIALSCAN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PARTIALSCAN"

    // $ANTLR start "KW_USER"
    public final void mKW_USER() throws RecognitionException {
        try {
            int _type = KW_USER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:260:8: ( 'USER' )
            // HiveLexer.g:260:10: 'USER'
            {
            match("USER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_USER"

    // $ANTLR start "KW_ROLE"
    public final void mKW_ROLE() throws RecognitionException {
        try {
            int _type = KW_ROLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:261:8: ( 'ROLE' )
            // HiveLexer.g:261:10: 'ROLE'
            {
            match("ROLE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ROLE"

    // $ANTLR start "KW_INNER"
    public final void mKW_INNER() throws RecognitionException {
        try {
            int _type = KW_INNER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:262:9: ( 'INNER' )
            // HiveLexer.g:262:11: 'INNER'
            {
            match("INNER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INNER"

    // $ANTLR start "KW_EXCHANGE"
    public final void mKW_EXCHANGE() throws RecognitionException {
        try {
            int _type = KW_EXCHANGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:263:12: ( 'EXCHANGE' )
            // HiveLexer.g:263:14: 'EXCHANGE'
            {
            match("EXCHANGE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_EXCHANGE"

    // $ANTLR start "KW_INTERVAL"
    public final void mKW_INTERVAL() throws RecognitionException {
        try {
            int _type = KW_INTERVAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:266:12: ( 'INTERVAL' )
            // HiveLexer.g:266:14: 'INTERVAL'
            {
            match("INTERVAL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INTERVAL"

    // $ANTLR start "KW_ADJACENT"
    public final void mKW_ADJACENT() throws RecognitionException {
        try {
            int _type = KW_ADJACENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:267:12: ( 'ADJACENT' )
            // HiveLexer.g:267:14: 'ADJACENT'
            {
            match("ADJACENT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ADJACENT"

    // $ANTLR start "KW_CORRESPONDING"
    public final void mKW_CORRESPONDING() throws RecognitionException {
        try {
            int _type = KW_CORRESPONDING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:268:17: ( 'CORRESPONDING' )
            // HiveLexer.g:268:19: 'CORRESPONDING'
            {
            match("CORRESPONDING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CORRESPONDING"

    // $ANTLR start "KW_OVERLAPS"
    public final void mKW_OVERLAPS() throws RecognitionException {
        try {
            int _type = KW_OVERLAPS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:269:12: ( 'OVERLAPS' )
            // HiveLexer.g:269:14: 'OVERLAPS'
            {
            match("OVERLAPS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OVERLAPS"

    // $ANTLR start "KW_CONTAINS"
    public final void mKW_CONTAINS() throws RecognitionException {
        try {
            int _type = KW_CONTAINS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:270:12: ( 'CONTAINS' )
            // HiveLexer.g:270:14: 'CONTAINS'
            {
            match("CONTAINS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CONTAINS"

    // $ANTLR start "KW_WITHIN"
    public final void mKW_WITHIN() throws RecognitionException {
        try {
            int _type = KW_WITHIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:271:10: ( 'WITHIN' )
            // HiveLexer.g:271:12: 'WITHIN'
            {
            match("WITHIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_WITHIN"

    // $ANTLR start "KW_PREFIX"
    public final void mKW_PREFIX() throws RecognitionException {
        try {
            int _type = KW_PREFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:272:10: ( 'PREFIX' )
            // HiveLexer.g:272:12: 'PREFIX'
            {
            match("PREFIX"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PREFIX"

    // $ANTLR start "KW_SUFFIX"
    public final void mKW_SUFFIX() throws RecognitionException {
        try {
            int _type = KW_SUFFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:273:10: ( 'SUFFIX' )
            // HiveLexer.g:273:12: 'SUFFIX'
            {
            match("SUFFIX"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SUFFIX"

    // $ANTLR start "KW_UPSTREAM"
    public final void mKW_UPSTREAM() throws RecognitionException {
        try {
            int _type = KW_UPSTREAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:274:12: ( 'UPSTREAM' )
            // HiveLexer.g:274:14: 'UPSTREAM'
            {
            match("UPSTREAM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UPSTREAM"

    // $ANTLR start "KW_DOWNSTREAM"
    public final void mKW_DOWNSTREAM() throws RecognitionException {
        try {
            int _type = KW_DOWNSTREAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:275:14: ( 'DOWNSTREAM' )
            // HiveLexer.g:275:16: 'DOWNSTREAM'
            {
            match("DOWNSTREAM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DOWNSTREAM"

    // $ANTLR start "KW_COALESCE"
    public final void mKW_COALESCE() throws RecognitionException {
        try {
            int _type = KW_COALESCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:276:12: ( 'COALESCE' )
            // HiveLexer.g:276:14: 'COALESCE'
            {
            match("COALESCE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_COALESCE"

    // $ANTLR start "KW_LENGTH"
    public final void mKW_LENGTH() throws RecognitionException {
        try {
            int _type = KW_LENGTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:277:10: ( 'LENGTH' )
            // HiveLexer.g:277:12: 'LENGTH'
            {
            match("LENGTH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LENGTH"

    // $ANTLR start "KW_CLOSEST"
    public final void mKW_CLOSEST() throws RecognitionException {
        try {
            int _type = KW_CLOSEST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:278:11: ( 'CLOSEST' )
            // HiveLexer.g:278:13: 'CLOSEST'
            {
            match("CLOSEST"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CLOSEST"

    // $ANTLR start "KW_EXCLUSIVENESSJOIN"
    public final void mKW_EXCLUSIVENESSJOIN() throws RecognitionException {
        try {
            int _type = KW_EXCLUSIVENESSJOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:279:21: ( 'EXCLUSIVENESSJOIN' )
            // HiveLexer.g:279:23: 'EXCLUSIVENESSJOIN'
            {
            match("EXCLUSIVENESSJOIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_EXCLUSIVENESSJOIN"

    // $ANTLR start "KW_INTERSECTJOIN"
    public final void mKW_INTERSECTJOIN() throws RecognitionException {
        try {
            int _type = KW_INTERSECTJOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:280:17: ( 'INTERSECTJOIN' )
            // HiveLexer.g:280:19: 'INTERSECTJOIN'
            {
            match("INTERSECTJOIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INTERSECTJOIN"

    // $ANTLR start "KW_DISTANCE"
    public final void mKW_DISTANCE() throws RecognitionException {
        try {
            int _type = KW_DISTANCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:281:12: ( 'DISTANCE' )
            // HiveLexer.g:281:14: 'DISTANCE'
            {
            match("DISTANCE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DISTANCE"

    // $ANTLR start "KW_PROJECT"
    public final void mKW_PROJECT() throws RecognitionException {
        try {
            int _type = KW_PROJECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:287:11: ( 'PROJECT' )
            // HiveLexer.g:287:13: 'PROJECT'
            {
            match("PROJECT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PROJECT"

    // $ANTLR start "KW_VIRTUALTRACK"
    public final void mKW_VIRTUALTRACK() throws RecognitionException {
        try {
            int _type = KW_VIRTUALTRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:288:16: ( 'GENERATE BINS WITH LENGTH' )
            // HiveLexer.g:288:18: 'GENERATE BINS WITH LENGTH'
            {
            match("GENERATE BINS WITH LENGTH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_VIRTUALTRACK"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:293:5: ( '.' )
            // HiveLexer.g:293:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:294:7: ( ':' )
            // HiveLexer.g:294:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:295:7: ( ',' )
            // HiveLexer.g:295:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:296:11: ( ';' )
            // HiveLexer.g:296:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:298:8: ( '(' )
            // HiveLexer.g:298:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:299:8: ( ')' )
            // HiveLexer.g:299:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LSQUARE"
    public final void mLSQUARE() throws RecognitionException {
        try {
            int _type = LSQUARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:300:9: ( '[' )
            // HiveLexer.g:300:11: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LSQUARE"

    // $ANTLR start "RSQUARE"
    public final void mRSQUARE() throws RecognitionException {
        try {
            int _type = RSQUARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:301:9: ( ']' )
            // HiveLexer.g:301:11: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RSQUARE"

    // $ANTLR start "LCURLY"
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:302:8: ( '{' )
            // HiveLexer.g:302:10: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LCURLY"

    // $ANTLR start "RCURLY"
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:303:8: ( '}' )
            // HiveLexer.g:303:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RCURLY"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:305:7: ( '=' | '==' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='=') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='=') ) {
                    alt2=2;
                }
                else {
                    alt2=1;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // HiveLexer.g:305:9: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // HiveLexer.g:305:15: '=='
                    {
                    match("=="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "EQUAL_NS"
    public final void mEQUAL_NS() throws RecognitionException {
        try {
            int _type = EQUAL_NS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:306:10: ( '<=>' )
            // HiveLexer.g:306:12: '<=>'
            {
            match("<=>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL_NS"

    // $ANTLR start "NOTEQUAL"
    public final void mNOTEQUAL() throws RecognitionException {
        try {
            int _type = NOTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:307:10: ( '<>' | '!=' )
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
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // HiveLexer.g:307:12: '<>'
                    {
                    match("<>"); 



                    }
                    break;
                case 2 :
                    // HiveLexer.g:307:19: '!='
                    {
                    match("!="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTEQUAL"

    // $ANTLR start "LESSTHANOREQUALTO"
    public final void mLESSTHANOREQUALTO() throws RecognitionException {
        try {
            int _type = LESSTHANOREQUALTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:308:19: ( '<=' )
            // HiveLexer.g:308:21: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESSTHANOREQUALTO"

    // $ANTLR start "LESSTHAN"
    public final void mLESSTHAN() throws RecognitionException {
        try {
            int _type = LESSTHAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:309:10: ( '<' )
            // HiveLexer.g:309:12: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESSTHAN"

    // $ANTLR start "GREATERTHANOREQUALTO"
    public final void mGREATERTHANOREQUALTO() throws RecognitionException {
        try {
            int _type = GREATERTHANOREQUALTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:310:22: ( '>=' )
            // HiveLexer.g:310:24: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATERTHANOREQUALTO"

    // $ANTLR start "GREATERTHAN"
    public final void mGREATERTHAN() throws RecognitionException {
        try {
            int _type = GREATERTHAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:311:13: ( '>' )
            // HiveLexer.g:311:15: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATERTHAN"

    // $ANTLR start "DIVIDE"
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:313:8: ( '/' )
            // HiveLexer.g:313:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIVIDE"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:314:6: ( '+' )
            // HiveLexer.g:314:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:315:7: ( '-' )
            // HiveLexer.g:315:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:316:6: ( '*' )
            // HiveLexer.g:316:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:317:5: ( '%' )
            // HiveLexer.g:317:7: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:318:5: ( 'DIV' )
            // HiveLexer.g:318:7: 'DIV'
            {
            match("DIV"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "AMPERSAND"
    public final void mAMPERSAND() throws RecognitionException {
        try {
            int _type = AMPERSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:320:11: ( '&' )
            // HiveLexer.g:320:13: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AMPERSAND"

    // $ANTLR start "TILDE"
    public final void mTILDE() throws RecognitionException {
        try {
            int _type = TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:321:7: ( '~' )
            // HiveLexer.g:321:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TILDE"

    // $ANTLR start "BITWISEOR"
    public final void mBITWISEOR() throws RecognitionException {
        try {
            int _type = BITWISEOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:322:11: ( '|' )
            // HiveLexer.g:322:13: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BITWISEOR"

    // $ANTLR start "BITWISEXOR"
    public final void mBITWISEXOR() throws RecognitionException {
        try {
            int _type = BITWISEXOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:323:12: ( '^' )
            // HiveLexer.g:323:14: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BITWISEXOR"

    // $ANTLR start "QUESTION"
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:324:10: ( '?' )
            // HiveLexer.g:324:12: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUESTION"

    // $ANTLR start "DOLLAR"
    public final void mDOLLAR() throws RecognitionException {
        try {
            int _type = DOLLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:325:8: ( '$' )
            // HiveLexer.g:325:10: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOLLAR"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            // HiveLexer.g:330:5: ( 'a' .. 'z' | 'A' .. 'Z' )
            // HiveLexer.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Letter"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
        try {
            // HiveLexer.g:335:5: ( 'a' .. 'f' | 'A' .. 'F' )
            // HiveLexer.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HexDigit"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // HiveLexer.g:340:5: ( '0' .. '9' )
            // HiveLexer.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Digit"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
        try {
            // HiveLexer.g:346:5: ( ( 'e' | 'E' ) ( PLUS | MINUS )? ( Digit )+ )
            // HiveLexer.g:347:5: ( 'e' | 'E' ) ( PLUS | MINUS )? ( Digit )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // HiveLexer.g:347:17: ( PLUS | MINUS )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='+'||LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // HiveLexer.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // HiveLexer.g:347:33: ( Digit )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // HiveLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Exponent"

    // $ANTLR start "RegexComponent"
    public final void mRegexComponent() throws RecognitionException {
        try {
            // HiveLexer.g:352:5: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | PLUS | STAR | QUESTION | MINUS | DOT | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | BITWISEXOR | BITWISEOR | DOLLAR )
            // HiveLexer.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1) >= '(' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= '}') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RegexComponent"

    // $ANTLR start "StringLiteral"
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:359:5: ( ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+ )
            // HiveLexer.g:360:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+
            {
            // HiveLexer.g:360:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+
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
            	    // HiveLexer.g:360:7: '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\''
            	    {
            	    match('\''); 

            	    // HiveLexer.g:360:12: (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )*
            	    loop6:
            	    do {
            	        int alt6=3;
            	        int LA6_0 = input.LA(1);

            	        if ( ((LA6_0 >= '\u0000' && LA6_0 <= '&')||(LA6_0 >= '(' && LA6_0 <= '[')||(LA6_0 >= ']' && LA6_0 <= '\uFFFF')) ) {
            	            alt6=1;
            	        }
            	        else if ( (LA6_0=='\\') ) {
            	            alt6=2;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // HiveLexer.g:360:14: ~ ( '\\'' | '\\\\' )
            	    	    {
            	    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	    	        input.consume();
            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;
            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // HiveLexer.g:360:29: ( '\\\\' . )
            	    	    {
            	    	    // HiveLexer.g:360:29: ( '\\\\' . )
            	    	    // HiveLexer.g:360:30: '\\\\' .
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
            	    // HiveLexer.g:361:7: '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"'
            	    {
            	    match('\"'); 

            	    // HiveLexer.g:361:12: (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )*
            	    loop7:
            	    do {
            	        int alt7=3;
            	        int LA7_0 = input.LA(1);

            	        if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
            	            alt7=1;
            	        }
            	        else if ( (LA7_0=='\\') ) {
            	            alt7=2;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // HiveLexer.g:361:14: ~ ( '\\\"' | '\\\\' )
            	    	    {
            	    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	    	        input.consume();
            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;
            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // HiveLexer.g:361:29: ( '\\\\' . )
            	    	    {
            	    	    // HiveLexer.g:361:29: ( '\\\\' . )
            	    	    // HiveLexer.g:361:30: '\\\\' .
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "StringLiteral"

    // $ANTLR start "CharSetLiteral"
    public final void mCharSetLiteral() throws RecognitionException {
        try {
            int _type = CharSetLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:366:5: ( StringLiteral | '0' 'X' ( HexDigit | Digit )+ )
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
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // HiveLexer.g:367:5: StringLiteral
                    {
                    mStringLiteral(); 


                    }
                    break;
                case 2 :
                    // HiveLexer.g:368:7: '0' 'X' ( HexDigit | Digit )+
                    {
                    match('0'); 

                    match('X'); 

                    // HiveLexer.g:368:15: ( HexDigit | Digit )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= '0' && LA9_0 <= '9')||(LA9_0 >= 'A' && LA9_0 <= 'F')||(LA9_0 >= 'a' && LA9_0 <= 'f')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // HiveLexer.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
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
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CharSetLiteral"

    // $ANTLR start "BigintLiteral"
    public final void mBigintLiteral() throws RecognitionException {
        try {
            int _type = BigintLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:372:5: ( ( Digit )+ 'L' )
            // HiveLexer.g:373:5: ( Digit )+ 'L'
            {
            // HiveLexer.g:373:5: ( Digit )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // HiveLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BigintLiteral"

    // $ANTLR start "SmallintLiteral"
    public final void mSmallintLiteral() throws RecognitionException {
        try {
            int _type = SmallintLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:377:5: ( ( Digit )+ 'S' )
            // HiveLexer.g:378:5: ( Digit )+ 'S'
            {
            // HiveLexer.g:378:5: ( Digit )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // HiveLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SmallintLiteral"

    // $ANTLR start "TinyintLiteral"
    public final void mTinyintLiteral() throws RecognitionException {
        try {
            int _type = TinyintLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:382:5: ( ( Digit )+ 'Y' )
            // HiveLexer.g:383:5: ( Digit )+ 'Y'
            {
            // HiveLexer.g:383:5: ( Digit )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // HiveLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TinyintLiteral"

    // $ANTLR start "DecimalLiteral"
    public final void mDecimalLiteral() throws RecognitionException {
        try {
            int _type = DecimalLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:387:5: ( Number 'B' 'D' )
            // HiveLexer.g:388:5: Number 'B' 'D'
            {
            mNumber(); 


            match('B'); 

            match('D'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DecimalLiteral"

    // $ANTLR start "ByteLengthLiteral"
    public final void mByteLengthLiteral() throws RecognitionException {
        try {
            int _type = ByteLengthLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:392:5: ( ( Digit )+ ( 'b' | 'B' | 'k' | 'K' | 'm' | 'M' | 'g' | 'G' ) )
            // HiveLexer.g:393:5: ( Digit )+ ( 'b' | 'B' | 'k' | 'K' | 'm' | 'M' | 'g' | 'G' )
            {
            // HiveLexer.g:393:5: ( Digit )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // HiveLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ByteLengthLiteral"

    // $ANTLR start "Number"
    public final void mNumber() throws RecognitionException {
        try {
            int _type = Number;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:397:5: ( ( Digit )+ ( DOT ( Digit )* ( Exponent )? | Exponent )? )
            // HiveLexer.g:398:5: ( Digit )+ ( DOT ( Digit )* ( Exponent )? | Exponent )?
            {
            // HiveLexer.g:398:5: ( Digit )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // HiveLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


            // HiveLexer.g:398:14: ( DOT ( Digit )* ( Exponent )? | Exponent )?
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
                    // HiveLexer.g:398:16: DOT ( Digit )* ( Exponent )?
                    {
                    mDOT(); 


                    // HiveLexer.g:398:20: ( Digit )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // HiveLexer.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    // HiveLexer.g:398:29: ( Exponent )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='E'||LA17_0=='e') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // HiveLexer.g:398:30: Exponent
                            {
                            mExponent(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // HiveLexer.g:398:43: Exponent
                    {
                    mExponent(); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Number"

    // $ANTLR start "Identifier"
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:402:5: ( ( Letter | Digit ) ( Letter | Digit | '_' )* | '`' ( RegexComponent )+ '`' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0 >= '0' && LA21_0 <= '9')||(LA21_0 >= 'A' && LA21_0 <= 'Z')||(LA21_0 >= 'a' && LA21_0 <= 'z')) ) {
                alt21=1;
            }
            else if ( (LA21_0=='`') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // HiveLexer.g:403:5: ( Letter | Digit ) ( Letter | Digit | '_' )*
                    {
                    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // HiveLexer.g:403:22: ( Letter | Digit | '_' )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0 >= '0' && LA19_0 <= '9')||(LA19_0 >= 'A' && LA19_0 <= 'Z')||LA19_0=='_'||(LA19_0 >= 'a' && LA19_0 <= 'z')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // HiveLexer.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
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
                    // HiveLexer.g:404:7: '`' ( RegexComponent )+ '`'
                    {
                    match('`'); 

                    // HiveLexer.g:404:11: ( RegexComponent )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0=='$'||(LA20_0 >= '(' && LA20_0 <= '+')||(LA20_0 >= '-' && LA20_0 <= '.')||(LA20_0 >= '0' && LA20_0 <= '9')||LA20_0=='?'||(LA20_0 >= 'A' && LA20_0 <= '[')||(LA20_0 >= ']' && LA20_0 <= '_')||(LA20_0 >= 'a' && LA20_0 <= '}')) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // HiveLexer.g:
                    	    {
                    	    if ( input.LA(1)=='$'||(input.LA(1) >= '(' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= '}') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


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
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Identifier"

    // $ANTLR start "CharSetName"
    public final void mCharSetName() throws RecognitionException {
        try {
            int _type = CharSetName;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:408:5: ( '_' ( Letter | Digit | '_' | '-' | '.' | ':' )+ )
            // HiveLexer.g:409:5: '_' ( Letter | Digit | '_' | '-' | '.' | ':' )+
            {
            match('_'); 

            // HiveLexer.g:409:9: ( Letter | Digit | '_' | '-' | '.' | ':' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0 >= '-' && LA22_0 <= '.')||(LA22_0 >= '0' && LA22_0 <= ':')||(LA22_0 >= 'A' && LA22_0 <= 'Z')||LA22_0=='_'||(LA22_0 >= 'a' && LA22_0 <= 'z')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // HiveLexer.g:
            	    {
            	    if ( (input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CharSetName"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:412:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
            // HiveLexer.g:412:8: ( ' ' | '\\r' | '\\t' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexer.g:416:3: ( '--' (~ ( '\\n' | '\\r' ) )* )
            // HiveLexer.g:416:5: '--' (~ ( '\\n' | '\\r' ) )*
            {
            match("--"); 



            // HiveLexer.g:416:10: (~ ( '\\n' | '\\r' ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0 >= '\u0000' && LA23_0 <= '\t')||(LA23_0 >= '\u000B' && LA23_0 <= '\f')||(LA23_0 >= '\u000E' && LA23_0 <= '\uFFFF')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // HiveLexer.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // HiveLexer.g:1:8: ( KW_ENC | KW_TRUE | KW_FALSE | KW_ALL | KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_IF | KW_EXISTS | KW_ASC | KW_DESC | KW_ORDER | KW_GROUP | KW_BY | KW_HAVING | KW_WHERE | KW_FROM | KW_AS | KW_SELECT | KW_DISTINCT | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_UNIQUEJOIN | KW_PRESERVE | KW_JOIN | KW_LEFT | KW_RIGHT | KW_FULL | KW_ON | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_TRANSFORM | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_COLUMN | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_IGNORE | KW_PROTECTION | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_DECIMAL | KW_STRING | KW_ARRAY | KW_STRUCT | KW_MAP | KW_UNIONTYPE | KW_REDUCE | KW_PARTITIONED | KW_CLUSTERED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_SEQUENCEFILE | KW_TEXTFILE | KW_RCFILE | KW_ORCFILE | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_OFFLINE | KW_ENABLE | KW_DISABLE | KW_READONLY | KW_NO_DROP | KW_LOCATION | KW_TABLESAMPLE | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_CAST | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_FUNCTION | KW_MACRO | KW_EXPLAIN | KW_EXTENDED | KW_FORMATTED | KW_PRETTY | KW_DEPENDENCY | KW_LOGICAL | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_CASE | KW_WHEN | KW_THEN | KW_ELSE | KW_END | KW_MAPJOIN | KW_STREAMTABLE | KW_HOLD_DDLTIME | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_IN | KW_DATABASE | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CROSS | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_WINDOW | KW_UNBOUNDED | KW_PRECEDING | KW_FOLLOWING | KW_CURRENT | KW_LESS | KW_MORE | KW_OVER | KW_GROUPING | KW_SETS | KW_TRUNCATE | KW_NOSCAN | KW_PARTIALSCAN | KW_USER | KW_ROLE | KW_INNER | KW_EXCHANGE | KW_INTERVAL | KW_ADJACENT | KW_CORRESPONDING | KW_OVERLAPS | KW_CONTAINS | KW_WITHIN | KW_PREFIX | KW_SUFFIX | KW_UPSTREAM | KW_DOWNSTREAM | KW_COALESCE | KW_LENGTH | KW_CLOSEST | KW_EXCLUSIVENESSJOIN | KW_INTERSECTJOIN | KW_DISTANCE | KW_PROJECT | KW_VIRTUALTRACK | DOT | COLON | COMMA | SEMICOLON | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | BITWISEXOR | QUESTION | DOLLAR | StringLiteral | CharSetLiteral | BigintLiteral | SmallintLiteral | TinyintLiteral | DecimalLiteral | ByteLengthLiteral | Number | Identifier | CharSetName | WS | COMMENT )
        int alt24=299;
        alt24 = dfa24.predict(input);
        switch (alt24) {
            case 1 :
                // HiveLexer.g:1:10: KW_ENC
                {
                mKW_ENC(); 


                }
                break;
            case 2 :
                // HiveLexer.g:1:17: KW_TRUE
                {
                mKW_TRUE(); 


                }
                break;
            case 3 :
                // HiveLexer.g:1:25: KW_FALSE
                {
                mKW_FALSE(); 


                }
                break;
            case 4 :
                // HiveLexer.g:1:34: KW_ALL
                {
                mKW_ALL(); 


                }
                break;
            case 5 :
                // HiveLexer.g:1:41: KW_AND
                {
                mKW_AND(); 


                }
                break;
            case 6 :
                // HiveLexer.g:1:48: KW_OR
                {
                mKW_OR(); 


                }
                break;
            case 7 :
                // HiveLexer.g:1:54: KW_NOT
                {
                mKW_NOT(); 


                }
                break;
            case 8 :
                // HiveLexer.g:1:61: KW_LIKE
                {
                mKW_LIKE(); 


                }
                break;
            case 9 :
                // HiveLexer.g:1:69: KW_IF
                {
                mKW_IF(); 


                }
                break;
            case 10 :
                // HiveLexer.g:1:75: KW_EXISTS
                {
                mKW_EXISTS(); 


                }
                break;
            case 11 :
                // HiveLexer.g:1:85: KW_ASC
                {
                mKW_ASC(); 


                }
                break;
            case 12 :
                // HiveLexer.g:1:92: KW_DESC
                {
                mKW_DESC(); 


                }
                break;
            case 13 :
                // HiveLexer.g:1:100: KW_ORDER
                {
                mKW_ORDER(); 


                }
                break;
            case 14 :
                // HiveLexer.g:1:109: KW_GROUP
                {
                mKW_GROUP(); 


                }
                break;
            case 15 :
                // HiveLexer.g:1:118: KW_BY
                {
                mKW_BY(); 


                }
                break;
            case 16 :
                // HiveLexer.g:1:124: KW_HAVING
                {
                mKW_HAVING(); 


                }
                break;
            case 17 :
                // HiveLexer.g:1:134: KW_WHERE
                {
                mKW_WHERE(); 


                }
                break;
            case 18 :
                // HiveLexer.g:1:143: KW_FROM
                {
                mKW_FROM(); 


                }
                break;
            case 19 :
                // HiveLexer.g:1:151: KW_AS
                {
                mKW_AS(); 


                }
                break;
            case 20 :
                // HiveLexer.g:1:157: KW_SELECT
                {
                mKW_SELECT(); 


                }
                break;
            case 21 :
                // HiveLexer.g:1:167: KW_DISTINCT
                {
                mKW_DISTINCT(); 


                }
                break;
            case 22 :
                // HiveLexer.g:1:179: KW_INSERT
                {
                mKW_INSERT(); 


                }
                break;
            case 23 :
                // HiveLexer.g:1:189: KW_OVERWRITE
                {
                mKW_OVERWRITE(); 


                }
                break;
            case 24 :
                // HiveLexer.g:1:202: KW_OUTER
                {
                mKW_OUTER(); 


                }
                break;
            case 25 :
                // HiveLexer.g:1:211: KW_UNIQUEJOIN
                {
                mKW_UNIQUEJOIN(); 


                }
                break;
            case 26 :
                // HiveLexer.g:1:225: KW_PRESERVE
                {
                mKW_PRESERVE(); 


                }
                break;
            case 27 :
                // HiveLexer.g:1:237: KW_JOIN
                {
                mKW_JOIN(); 


                }
                break;
            case 28 :
                // HiveLexer.g:1:245: KW_LEFT
                {
                mKW_LEFT(); 


                }
                break;
            case 29 :
                // HiveLexer.g:1:253: KW_RIGHT
                {
                mKW_RIGHT(); 


                }
                break;
            case 30 :
                // HiveLexer.g:1:262: KW_FULL
                {
                mKW_FULL(); 


                }
                break;
            case 31 :
                // HiveLexer.g:1:270: KW_ON
                {
                mKW_ON(); 


                }
                break;
            case 32 :
                // HiveLexer.g:1:276: KW_PARTITION
                {
                mKW_PARTITION(); 


                }
                break;
            case 33 :
                // HiveLexer.g:1:289: KW_PARTITIONS
                {
                mKW_PARTITIONS(); 


                }
                break;
            case 34 :
                // HiveLexer.g:1:303: KW_TABLE
                {
                mKW_TABLE(); 


                }
                break;
            case 35 :
                // HiveLexer.g:1:312: KW_TABLES
                {
                mKW_TABLES(); 


                }
                break;
            case 36 :
                // HiveLexer.g:1:322: KW_COLUMNS
                {
                mKW_COLUMNS(); 


                }
                break;
            case 37 :
                // HiveLexer.g:1:333: KW_INDEX
                {
                mKW_INDEX(); 


                }
                break;
            case 38 :
                // HiveLexer.g:1:342: KW_INDEXES
                {
                mKW_INDEXES(); 


                }
                break;
            case 39 :
                // HiveLexer.g:1:353: KW_REBUILD
                {
                mKW_REBUILD(); 


                }
                break;
            case 40 :
                // HiveLexer.g:1:364: KW_FUNCTIONS
                {
                mKW_FUNCTIONS(); 


                }
                break;
            case 41 :
                // HiveLexer.g:1:377: KW_SHOW
                {
                mKW_SHOW(); 


                }
                break;
            case 42 :
                // HiveLexer.g:1:385: KW_MSCK
                {
                mKW_MSCK(); 


                }
                break;
            case 43 :
                // HiveLexer.g:1:393: KW_REPAIR
                {
                mKW_REPAIR(); 


                }
                break;
            case 44 :
                // HiveLexer.g:1:403: KW_DIRECTORY
                {
                mKW_DIRECTORY(); 


                }
                break;
            case 45 :
                // HiveLexer.g:1:416: KW_LOCAL
                {
                mKW_LOCAL(); 


                }
                break;
            case 46 :
                // HiveLexer.g:1:425: KW_TRANSFORM
                {
                mKW_TRANSFORM(); 


                }
                break;
            case 47 :
                // HiveLexer.g:1:438: KW_USING
                {
                mKW_USING(); 


                }
                break;
            case 48 :
                // HiveLexer.g:1:447: KW_CLUSTER
                {
                mKW_CLUSTER(); 


                }
                break;
            case 49 :
                // HiveLexer.g:1:458: KW_DISTRIBUTE
                {
                mKW_DISTRIBUTE(); 


                }
                break;
            case 50 :
                // HiveLexer.g:1:472: KW_SORT
                {
                mKW_SORT(); 


                }
                break;
            case 51 :
                // HiveLexer.g:1:480: KW_UNION
                {
                mKW_UNION(); 


                }
                break;
            case 52 :
                // HiveLexer.g:1:489: KW_LOAD
                {
                mKW_LOAD(); 


                }
                break;
            case 53 :
                // HiveLexer.g:1:497: KW_EXPORT
                {
                mKW_EXPORT(); 


                }
                break;
            case 54 :
                // HiveLexer.g:1:507: KW_IMPORT
                {
                mKW_IMPORT(); 


                }
                break;
            case 55 :
                // HiveLexer.g:1:517: KW_DATA
                {
                mKW_DATA(); 


                }
                break;
            case 56 :
                // HiveLexer.g:1:525: KW_INPATH
                {
                mKW_INPATH(); 


                }
                break;
            case 57 :
                // HiveLexer.g:1:535: KW_IS
                {
                mKW_IS(); 


                }
                break;
            case 58 :
                // HiveLexer.g:1:541: KW_NULL
                {
                mKW_NULL(); 


                }
                break;
            case 59 :
                // HiveLexer.g:1:549: KW_CREATE
                {
                mKW_CREATE(); 


                }
                break;
            case 60 :
                // HiveLexer.g:1:559: KW_EXTERNAL
                {
                mKW_EXTERNAL(); 


                }
                break;
            case 61 :
                // HiveLexer.g:1:571: KW_ALTER
                {
                mKW_ALTER(); 


                }
                break;
            case 62 :
                // HiveLexer.g:1:580: KW_CHANGE
                {
                mKW_CHANGE(); 


                }
                break;
            case 63 :
                // HiveLexer.g:1:590: KW_COLUMN
                {
                mKW_COLUMN(); 


                }
                break;
            case 64 :
                // HiveLexer.g:1:600: KW_FIRST
                {
                mKW_FIRST(); 


                }
                break;
            case 65 :
                // HiveLexer.g:1:609: KW_AFTER
                {
                mKW_AFTER(); 


                }
                break;
            case 66 :
                // HiveLexer.g:1:618: KW_DESCRIBE
                {
                mKW_DESCRIBE(); 


                }
                break;
            case 67 :
                // HiveLexer.g:1:630: KW_DROP
                {
                mKW_DROP(); 


                }
                break;
            case 68 :
                // HiveLexer.g:1:638: KW_RENAME
                {
                mKW_RENAME(); 


                }
                break;
            case 69 :
                // HiveLexer.g:1:648: KW_IGNORE
                {
                mKW_IGNORE(); 


                }
                break;
            case 70 :
                // HiveLexer.g:1:658: KW_PROTECTION
                {
                mKW_PROTECTION(); 


                }
                break;
            case 71 :
                // HiveLexer.g:1:672: KW_TO
                {
                mKW_TO(); 


                }
                break;
            case 72 :
                // HiveLexer.g:1:678: KW_COMMENT
                {
                mKW_COMMENT(); 


                }
                break;
            case 73 :
                // HiveLexer.g:1:689: KW_BOOLEAN
                {
                mKW_BOOLEAN(); 


                }
                break;
            case 74 :
                // HiveLexer.g:1:700: KW_TINYINT
                {
                mKW_TINYINT(); 


                }
                break;
            case 75 :
                // HiveLexer.g:1:711: KW_SMALLINT
                {
                mKW_SMALLINT(); 


                }
                break;
            case 76 :
                // HiveLexer.g:1:723: KW_INT
                {
                mKW_INT(); 


                }
                break;
            case 77 :
                // HiveLexer.g:1:730: KW_BIGINT
                {
                mKW_BIGINT(); 


                }
                break;
            case 78 :
                // HiveLexer.g:1:740: KW_FLOAT
                {
                mKW_FLOAT(); 


                }
                break;
            case 79 :
                // HiveLexer.g:1:749: KW_DOUBLE
                {
                mKW_DOUBLE(); 


                }
                break;
            case 80 :
                // HiveLexer.g:1:759: KW_DATE
                {
                mKW_DATE(); 


                }
                break;
            case 81 :
                // HiveLexer.g:1:767: KW_DATETIME
                {
                mKW_DATETIME(); 


                }
                break;
            case 82 :
                // HiveLexer.g:1:779: KW_TIMESTAMP
                {
                mKW_TIMESTAMP(); 


                }
                break;
            case 83 :
                // HiveLexer.g:1:792: KW_DECIMAL
                {
                mKW_DECIMAL(); 


                }
                break;
            case 84 :
                // HiveLexer.g:1:803: KW_STRING
                {
                mKW_STRING(); 


                }
                break;
            case 85 :
                // HiveLexer.g:1:813: KW_ARRAY
                {
                mKW_ARRAY(); 


                }
                break;
            case 86 :
                // HiveLexer.g:1:822: KW_STRUCT
                {
                mKW_STRUCT(); 


                }
                break;
            case 87 :
                // HiveLexer.g:1:832: KW_MAP
                {
                mKW_MAP(); 


                }
                break;
            case 88 :
                // HiveLexer.g:1:839: KW_UNIONTYPE
                {
                mKW_UNIONTYPE(); 


                }
                break;
            case 89 :
                // HiveLexer.g:1:852: KW_REDUCE
                {
                mKW_REDUCE(); 


                }
                break;
            case 90 :
                // HiveLexer.g:1:862: KW_PARTITIONED
                {
                mKW_PARTITIONED(); 


                }
                break;
            case 91 :
                // HiveLexer.g:1:877: KW_CLUSTERED
                {
                mKW_CLUSTERED(); 


                }
                break;
            case 92 :
                // HiveLexer.g:1:890: KW_SORTED
                {
                mKW_SORTED(); 


                }
                break;
            case 93 :
                // HiveLexer.g:1:900: KW_INTO
                {
                mKW_INTO(); 


                }
                break;
            case 94 :
                // HiveLexer.g:1:908: KW_BUCKETS
                {
                mKW_BUCKETS(); 


                }
                break;
            case 95 :
                // HiveLexer.g:1:919: KW_ROW
                {
                mKW_ROW(); 


                }
                break;
            case 96 :
                // HiveLexer.g:1:926: KW_ROWS
                {
                mKW_ROWS(); 


                }
                break;
            case 97 :
                // HiveLexer.g:1:934: KW_FORMAT
                {
                mKW_FORMAT(); 


                }
                break;
            case 98 :
                // HiveLexer.g:1:944: KW_DELIMITED
                {
                mKW_DELIMITED(); 


                }
                break;
            case 99 :
                // HiveLexer.g:1:957: KW_FIELDS
                {
                mKW_FIELDS(); 


                }
                break;
            case 100 :
                // HiveLexer.g:1:967: KW_TERMINATED
                {
                mKW_TERMINATED(); 


                }
                break;
            case 101 :
                // HiveLexer.g:1:981: KW_ESCAPED
                {
                mKW_ESCAPED(); 


                }
                break;
            case 102 :
                // HiveLexer.g:1:992: KW_COLLECTION
                {
                mKW_COLLECTION(); 


                }
                break;
            case 103 :
                // HiveLexer.g:1:1006: KW_ITEMS
                {
                mKW_ITEMS(); 


                }
                break;
            case 104 :
                // HiveLexer.g:1:1015: KW_KEYS
                {
                mKW_KEYS(); 


                }
                break;
            case 105 :
                // HiveLexer.g:1:1023: KW_KEY_TYPE
                {
                mKW_KEY_TYPE(); 


                }
                break;
            case 106 :
                // HiveLexer.g:1:1035: KW_LINES
                {
                mKW_LINES(); 


                }
                break;
            case 107 :
                // HiveLexer.g:1:1044: KW_STORED
                {
                mKW_STORED(); 


                }
                break;
            case 108 :
                // HiveLexer.g:1:1054: KW_FILEFORMAT
                {
                mKW_FILEFORMAT(); 


                }
                break;
            case 109 :
                // HiveLexer.g:1:1068: KW_SEQUENCEFILE
                {
                mKW_SEQUENCEFILE(); 


                }
                break;
            case 110 :
                // HiveLexer.g:1:1084: KW_TEXTFILE
                {
                mKW_TEXTFILE(); 


                }
                break;
            case 111 :
                // HiveLexer.g:1:1096: KW_RCFILE
                {
                mKW_RCFILE(); 


                }
                break;
            case 112 :
                // HiveLexer.g:1:1106: KW_ORCFILE
                {
                mKW_ORCFILE(); 


                }
                break;
            case 113 :
                // HiveLexer.g:1:1117: KW_INPUTFORMAT
                {
                mKW_INPUTFORMAT(); 


                }
                break;
            case 114 :
                // HiveLexer.g:1:1132: KW_OUTPUTFORMAT
                {
                mKW_OUTPUTFORMAT(); 


                }
                break;
            case 115 :
                // HiveLexer.g:1:1148: KW_INPUTDRIVER
                {
                mKW_INPUTDRIVER(); 


                }
                break;
            case 116 :
                // HiveLexer.g:1:1163: KW_OUTPUTDRIVER
                {
                mKW_OUTPUTDRIVER(); 


                }
                break;
            case 117 :
                // HiveLexer.g:1:1179: KW_OFFLINE
                {
                mKW_OFFLINE(); 


                }
                break;
            case 118 :
                // HiveLexer.g:1:1190: KW_ENABLE
                {
                mKW_ENABLE(); 


                }
                break;
            case 119 :
                // HiveLexer.g:1:1200: KW_DISABLE
                {
                mKW_DISABLE(); 


                }
                break;
            case 120 :
                // HiveLexer.g:1:1211: KW_READONLY
                {
                mKW_READONLY(); 


                }
                break;
            case 121 :
                // HiveLexer.g:1:1223: KW_NO_DROP
                {
                mKW_NO_DROP(); 


                }
                break;
            case 122 :
                // HiveLexer.g:1:1234: KW_LOCATION
                {
                mKW_LOCATION(); 


                }
                break;
            case 123 :
                // HiveLexer.g:1:1246: KW_TABLESAMPLE
                {
                mKW_TABLESAMPLE(); 


                }
                break;
            case 124 :
                // HiveLexer.g:1:1261: KW_BUCKET
                {
                mKW_BUCKET(); 


                }
                break;
            case 125 :
                // HiveLexer.g:1:1271: KW_OUT
                {
                mKW_OUT(); 


                }
                break;
            case 126 :
                // HiveLexer.g:1:1278: KW_OF
                {
                mKW_OF(); 


                }
                break;
            case 127 :
                // HiveLexer.g:1:1284: KW_PERCENT
                {
                mKW_PERCENT(); 


                }
                break;
            case 128 :
                // HiveLexer.g:1:1295: KW_CAST
                {
                mKW_CAST(); 


                }
                break;
            case 129 :
                // HiveLexer.g:1:1303: KW_ADD
                {
                mKW_ADD(); 


                }
                break;
            case 130 :
                // HiveLexer.g:1:1310: KW_REPLACE
                {
                mKW_REPLACE(); 


                }
                break;
            case 131 :
                // HiveLexer.g:1:1321: KW_RLIKE
                {
                mKW_RLIKE(); 


                }
                break;
            case 132 :
                // HiveLexer.g:1:1330: KW_REGEXP
                {
                mKW_REGEXP(); 


                }
                break;
            case 133 :
                // HiveLexer.g:1:1340: KW_TEMPORARY
                {
                mKW_TEMPORARY(); 


                }
                break;
            case 134 :
                // HiveLexer.g:1:1353: KW_FUNCTION
                {
                mKW_FUNCTION(); 


                }
                break;
            case 135 :
                // HiveLexer.g:1:1365: KW_MACRO
                {
                mKW_MACRO(); 


                }
                break;
            case 136 :
                // HiveLexer.g:1:1374: KW_EXPLAIN
                {
                mKW_EXPLAIN(); 


                }
                break;
            case 137 :
                // HiveLexer.g:1:1385: KW_EXTENDED
                {
                mKW_EXTENDED(); 


                }
                break;
            case 138 :
                // HiveLexer.g:1:1397: KW_FORMATTED
                {
                mKW_FORMATTED(); 


                }
                break;
            case 139 :
                // HiveLexer.g:1:1410: KW_PRETTY
                {
                mKW_PRETTY(); 


                }
                break;
            case 140 :
                // HiveLexer.g:1:1420: KW_DEPENDENCY
                {
                mKW_DEPENDENCY(); 


                }
                break;
            case 141 :
                // HiveLexer.g:1:1434: KW_LOGICAL
                {
                mKW_LOGICAL(); 


                }
                break;
            case 142 :
                // HiveLexer.g:1:1445: KW_SERDE
                {
                mKW_SERDE(); 


                }
                break;
            case 143 :
                // HiveLexer.g:1:1454: KW_WITH
                {
                mKW_WITH(); 


                }
                break;
            case 144 :
                // HiveLexer.g:1:1462: KW_DEFERRED
                {
                mKW_DEFERRED(); 


                }
                break;
            case 145 :
                // HiveLexer.g:1:1474: KW_SERDEPROPERTIES
                {
                mKW_SERDEPROPERTIES(); 


                }
                break;
            case 146 :
                // HiveLexer.g:1:1493: KW_DBPROPERTIES
                {
                mKW_DBPROPERTIES(); 


                }
                break;
            case 147 :
                // HiveLexer.g:1:1509: KW_LIMIT
                {
                mKW_LIMIT(); 


                }
                break;
            case 148 :
                // HiveLexer.g:1:1518: KW_SET
                {
                mKW_SET(); 


                }
                break;
            case 149 :
                // HiveLexer.g:1:1525: KW_UNSET
                {
                mKW_UNSET(); 


                }
                break;
            case 150 :
                // HiveLexer.g:1:1534: KW_TBLPROPERTIES
                {
                mKW_TBLPROPERTIES(); 


                }
                break;
            case 151 :
                // HiveLexer.g:1:1551: KW_IDXPROPERTIES
                {
                mKW_IDXPROPERTIES(); 


                }
                break;
            case 152 :
                // HiveLexer.g:1:1568: KW_VALUE_TYPE
                {
                mKW_VALUE_TYPE(); 


                }
                break;
            case 153 :
                // HiveLexer.g:1:1582: KW_ELEM_TYPE
                {
                mKW_ELEM_TYPE(); 


                }
                break;
            case 154 :
                // HiveLexer.g:1:1595: KW_CASE
                {
                mKW_CASE(); 


                }
                break;
            case 155 :
                // HiveLexer.g:1:1603: KW_WHEN
                {
                mKW_WHEN(); 


                }
                break;
            case 156 :
                // HiveLexer.g:1:1611: KW_THEN
                {
                mKW_THEN(); 


                }
                break;
            case 157 :
                // HiveLexer.g:1:1619: KW_ELSE
                {
                mKW_ELSE(); 


                }
                break;
            case 158 :
                // HiveLexer.g:1:1627: KW_END
                {
                mKW_END(); 


                }
                break;
            case 159 :
                // HiveLexer.g:1:1634: KW_MAPJOIN
                {
                mKW_MAPJOIN(); 


                }
                break;
            case 160 :
                // HiveLexer.g:1:1645: KW_STREAMTABLE
                {
                mKW_STREAMTABLE(); 


                }
                break;
            case 161 :
                // HiveLexer.g:1:1660: KW_HOLD_DDLTIME
                {
                mKW_HOLD_DDLTIME(); 


                }
                break;
            case 162 :
                // HiveLexer.g:1:1676: KW_CLUSTERSTATUS
                {
                mKW_CLUSTERSTATUS(); 


                }
                break;
            case 163 :
                // HiveLexer.g:1:1693: KW_UTC
                {
                mKW_UTC(); 


                }
                break;
            case 164 :
                // HiveLexer.g:1:1700: KW_UTCTIMESTAMP
                {
                mKW_UTCTIMESTAMP(); 


                }
                break;
            case 165 :
                // HiveLexer.g:1:1716: KW_LONG
                {
                mKW_LONG(); 


                }
                break;
            case 166 :
                // HiveLexer.g:1:1724: KW_DELETE
                {
                mKW_DELETE(); 


                }
                break;
            case 167 :
                // HiveLexer.g:1:1734: KW_PLUS
                {
                mKW_PLUS(); 


                }
                break;
            case 168 :
                // HiveLexer.g:1:1742: KW_MINUS
                {
                mKW_MINUS(); 


                }
                break;
            case 169 :
                // HiveLexer.g:1:1751: KW_FETCH
                {
                mKW_FETCH(); 


                }
                break;
            case 170 :
                // HiveLexer.g:1:1760: KW_INTERSECT
                {
                mKW_INTERSECT(); 


                }
                break;
            case 171 :
                // HiveLexer.g:1:1773: KW_VIEW
                {
                mKW_VIEW(); 


                }
                break;
            case 172 :
                // HiveLexer.g:1:1781: KW_IN
                {
                mKW_IN(); 


                }
                break;
            case 173 :
                // HiveLexer.g:1:1787: KW_DATABASE
                {
                mKW_DATABASE(); 


                }
                break;
            case 174 :
                // HiveLexer.g:1:1799: KW_DATABASES
                {
                mKW_DATABASES(); 


                }
                break;
            case 175 :
                // HiveLexer.g:1:1812: KW_MATERIALIZED
                {
                mKW_MATERIALIZED(); 


                }
                break;
            case 176 :
                // HiveLexer.g:1:1828: KW_SCHEMA
                {
                mKW_SCHEMA(); 


                }
                break;
            case 177 :
                // HiveLexer.g:1:1838: KW_SCHEMAS
                {
                mKW_SCHEMAS(); 


                }
                break;
            case 178 :
                // HiveLexer.g:1:1849: KW_GRANT
                {
                mKW_GRANT(); 


                }
                break;
            case 179 :
                // HiveLexer.g:1:1858: KW_REVOKE
                {
                mKW_REVOKE(); 


                }
                break;
            case 180 :
                // HiveLexer.g:1:1868: KW_SSL
                {
                mKW_SSL(); 


                }
                break;
            case 181 :
                // HiveLexer.g:1:1875: KW_UNDO
                {
                mKW_UNDO(); 


                }
                break;
            case 182 :
                // HiveLexer.g:1:1883: KW_LOCK
                {
                mKW_LOCK(); 


                }
                break;
            case 183 :
                // HiveLexer.g:1:1891: KW_LOCKS
                {
                mKW_LOCKS(); 


                }
                break;
            case 184 :
                // HiveLexer.g:1:1900: KW_UNLOCK
                {
                mKW_UNLOCK(); 


                }
                break;
            case 185 :
                // HiveLexer.g:1:1910: KW_SHARED
                {
                mKW_SHARED(); 


                }
                break;
            case 186 :
                // HiveLexer.g:1:1920: KW_EXCLUSIVE
                {
                mKW_EXCLUSIVE(); 


                }
                break;
            case 187 :
                // HiveLexer.g:1:1933: KW_PROCEDURE
                {
                mKW_PROCEDURE(); 


                }
                break;
            case 188 :
                // HiveLexer.g:1:1946: KW_UNSIGNED
                {
                mKW_UNSIGNED(); 


                }
                break;
            case 189 :
                // HiveLexer.g:1:1958: KW_WHILE
                {
                mKW_WHILE(); 


                }
                break;
            case 190 :
                // HiveLexer.g:1:1967: KW_READ
                {
                mKW_READ(); 


                }
                break;
            case 191 :
                // HiveLexer.g:1:1975: KW_READS
                {
                mKW_READS(); 


                }
                break;
            case 192 :
                // HiveLexer.g:1:1984: KW_PURGE
                {
                mKW_PURGE(); 


                }
                break;
            case 193 :
                // HiveLexer.g:1:1993: KW_RANGE
                {
                mKW_RANGE(); 


                }
                break;
            case 194 :
                // HiveLexer.g:1:2002: KW_ANALYZE
                {
                mKW_ANALYZE(); 


                }
                break;
            case 195 :
                // HiveLexer.g:1:2013: KW_BEFORE
                {
                mKW_BEFORE(); 


                }
                break;
            case 196 :
                // HiveLexer.g:1:2023: KW_BETWEEN
                {
                mKW_BETWEEN(); 


                }
                break;
            case 197 :
                // HiveLexer.g:1:2034: KW_BOTH
                {
                mKW_BOTH(); 


                }
                break;
            case 198 :
                // HiveLexer.g:1:2042: KW_BINARY
                {
                mKW_BINARY(); 


                }
                break;
            case 199 :
                // HiveLexer.g:1:2052: KW_CROSS
                {
                mKW_CROSS(); 


                }
                break;
            case 200 :
                // HiveLexer.g:1:2061: KW_CONTINUE
                {
                mKW_CONTINUE(); 


                }
                break;
            case 201 :
                // HiveLexer.g:1:2073: KW_CURSOR
                {
                mKW_CURSOR(); 


                }
                break;
            case 202 :
                // HiveLexer.g:1:2083: KW_TRIGGER
                {
                mKW_TRIGGER(); 


                }
                break;
            case 203 :
                // HiveLexer.g:1:2094: KW_RECORDREADER
                {
                mKW_RECORDREADER(); 


                }
                break;
            case 204 :
                // HiveLexer.g:1:2110: KW_RECORDWRITER
                {
                mKW_RECORDWRITER(); 


                }
                break;
            case 205 :
                // HiveLexer.g:1:2126: KW_SEMI
                {
                mKW_SEMI(); 


                }
                break;
            case 206 :
                // HiveLexer.g:1:2134: KW_LATERAL
                {
                mKW_LATERAL(); 


                }
                break;
            case 207 :
                // HiveLexer.g:1:2145: KW_TOUCH
                {
                mKW_TOUCH(); 


                }
                break;
            case 208 :
                // HiveLexer.g:1:2154: KW_ARCHIVE
                {
                mKW_ARCHIVE(); 


                }
                break;
            case 209 :
                // HiveLexer.g:1:2165: KW_UNARCHIVE
                {
                mKW_UNARCHIVE(); 


                }
                break;
            case 210 :
                // HiveLexer.g:1:2178: KW_COMPUTE
                {
                mKW_COMPUTE(); 


                }
                break;
            case 211 :
                // HiveLexer.g:1:2189: KW_STATISTICS
                {
                mKW_STATISTICS(); 


                }
                break;
            case 212 :
                // HiveLexer.g:1:2203: KW_USE
                {
                mKW_USE(); 


                }
                break;
            case 213 :
                // HiveLexer.g:1:2210: KW_OPTION
                {
                mKW_OPTION(); 


                }
                break;
            case 214 :
                // HiveLexer.g:1:2220: KW_CONCATENATE
                {
                mKW_CONCATENATE(); 


                }
                break;
            case 215 :
                // HiveLexer.g:1:2235: KW_SHOW_DATABASE
                {
                mKW_SHOW_DATABASE(); 


                }
                break;
            case 216 :
                // HiveLexer.g:1:2252: KW_UPDATE
                {
                mKW_UPDATE(); 


                }
                break;
            case 217 :
                // HiveLexer.g:1:2262: KW_RESTRICT
                {
                mKW_RESTRICT(); 


                }
                break;
            case 218 :
                // HiveLexer.g:1:2274: KW_CASCADE
                {
                mKW_CASCADE(); 


                }
                break;
            case 219 :
                // HiveLexer.g:1:2285: KW_SKEWED
                {
                mKW_SKEWED(); 


                }
                break;
            case 220 :
                // HiveLexer.g:1:2295: KW_ROLLUP
                {
                mKW_ROLLUP(); 


                }
                break;
            case 221 :
                // HiveLexer.g:1:2305: KW_CUBE
                {
                mKW_CUBE(); 


                }
                break;
            case 222 :
                // HiveLexer.g:1:2313: KW_DIRECTORIES
                {
                mKW_DIRECTORIES(); 


                }
                break;
            case 223 :
                // HiveLexer.g:1:2328: KW_FOR
                {
                mKW_FOR(); 


                }
                break;
            case 224 :
                // HiveLexer.g:1:2335: KW_WINDOW
                {
                mKW_WINDOW(); 


                }
                break;
            case 225 :
                // HiveLexer.g:1:2345: KW_UNBOUNDED
                {
                mKW_UNBOUNDED(); 


                }
                break;
            case 226 :
                // HiveLexer.g:1:2358: KW_PRECEDING
                {
                mKW_PRECEDING(); 


                }
                break;
            case 227 :
                // HiveLexer.g:1:2371: KW_FOLLOWING
                {
                mKW_FOLLOWING(); 


                }
                break;
            case 228 :
                // HiveLexer.g:1:2384: KW_CURRENT
                {
                mKW_CURRENT(); 


                }
                break;
            case 229 :
                // HiveLexer.g:1:2395: KW_LESS
                {
                mKW_LESS(); 


                }
                break;
            case 230 :
                // HiveLexer.g:1:2403: KW_MORE
                {
                mKW_MORE(); 


                }
                break;
            case 231 :
                // HiveLexer.g:1:2411: KW_OVER
                {
                mKW_OVER(); 


                }
                break;
            case 232 :
                // HiveLexer.g:1:2419: KW_GROUPING
                {
                mKW_GROUPING(); 


                }
                break;
            case 233 :
                // HiveLexer.g:1:2431: KW_SETS
                {
                mKW_SETS(); 


                }
                break;
            case 234 :
                // HiveLexer.g:1:2439: KW_TRUNCATE
                {
                mKW_TRUNCATE(); 


                }
                break;
            case 235 :
                // HiveLexer.g:1:2451: KW_NOSCAN
                {
                mKW_NOSCAN(); 


                }
                break;
            case 236 :
                // HiveLexer.g:1:2461: KW_PARTIALSCAN
                {
                mKW_PARTIALSCAN(); 


                }
                break;
            case 237 :
                // HiveLexer.g:1:2476: KW_USER
                {
                mKW_USER(); 


                }
                break;
            case 238 :
                // HiveLexer.g:1:2484: KW_ROLE
                {
                mKW_ROLE(); 


                }
                break;
            case 239 :
                // HiveLexer.g:1:2492: KW_INNER
                {
                mKW_INNER(); 


                }
                break;
            case 240 :
                // HiveLexer.g:1:2501: KW_EXCHANGE
                {
                mKW_EXCHANGE(); 


                }
                break;
            case 241 :
                // HiveLexer.g:1:2513: KW_INTERVAL
                {
                mKW_INTERVAL(); 


                }
                break;
            case 242 :
                // HiveLexer.g:1:2525: KW_ADJACENT
                {
                mKW_ADJACENT(); 


                }
                break;
            case 243 :
                // HiveLexer.g:1:2537: KW_CORRESPONDING
                {
                mKW_CORRESPONDING(); 


                }
                break;
            case 244 :
                // HiveLexer.g:1:2554: KW_OVERLAPS
                {
                mKW_OVERLAPS(); 


                }
                break;
            case 245 :
                // HiveLexer.g:1:2566: KW_CONTAINS
                {
                mKW_CONTAINS(); 


                }
                break;
            case 246 :
                // HiveLexer.g:1:2578: KW_WITHIN
                {
                mKW_WITHIN(); 


                }
                break;
            case 247 :
                // HiveLexer.g:1:2588: KW_PREFIX
                {
                mKW_PREFIX(); 


                }
                break;
            case 248 :
                // HiveLexer.g:1:2598: KW_SUFFIX
                {
                mKW_SUFFIX(); 


                }
                break;
            case 249 :
                // HiveLexer.g:1:2608: KW_UPSTREAM
                {
                mKW_UPSTREAM(); 


                }
                break;
            case 250 :
                // HiveLexer.g:1:2620: KW_DOWNSTREAM
                {
                mKW_DOWNSTREAM(); 


                }
                break;
            case 251 :
                // HiveLexer.g:1:2634: KW_COALESCE
                {
                mKW_COALESCE(); 


                }
                break;
            case 252 :
                // HiveLexer.g:1:2646: KW_LENGTH
                {
                mKW_LENGTH(); 


                }
                break;
            case 253 :
                // HiveLexer.g:1:2656: KW_CLOSEST
                {
                mKW_CLOSEST(); 


                }
                break;
            case 254 :
                // HiveLexer.g:1:2667: KW_EXCLUSIVENESSJOIN
                {
                mKW_EXCLUSIVENESSJOIN(); 


                }
                break;
            case 255 :
                // HiveLexer.g:1:2688: KW_INTERSECTJOIN
                {
                mKW_INTERSECTJOIN(); 


                }
                break;
            case 256 :
                // HiveLexer.g:1:2705: KW_DISTANCE
                {
                mKW_DISTANCE(); 


                }
                break;
            case 257 :
                // HiveLexer.g:1:2717: KW_PROJECT
                {
                mKW_PROJECT(); 


                }
                break;
            case 258 :
                // HiveLexer.g:1:2728: KW_VIRTUALTRACK
                {
                mKW_VIRTUALTRACK(); 


                }
                break;
            case 259 :
                // HiveLexer.g:1:2744: DOT
                {
                mDOT(); 


                }
                break;
            case 260 :
                // HiveLexer.g:1:2748: COLON
                {
                mCOLON(); 


                }
                break;
            case 261 :
                // HiveLexer.g:1:2754: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 262 :
                // HiveLexer.g:1:2760: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;
            case 263 :
                // HiveLexer.g:1:2770: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 264 :
                // HiveLexer.g:1:2777: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 265 :
                // HiveLexer.g:1:2784: LSQUARE
                {
                mLSQUARE(); 


                }
                break;
            case 266 :
                // HiveLexer.g:1:2792: RSQUARE
                {
                mRSQUARE(); 


                }
                break;
            case 267 :
                // HiveLexer.g:1:2800: LCURLY
                {
                mLCURLY(); 


                }
                break;
            case 268 :
                // HiveLexer.g:1:2807: RCURLY
                {
                mRCURLY(); 


                }
                break;
            case 269 :
                // HiveLexer.g:1:2814: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 270 :
                // HiveLexer.g:1:2820: EQUAL_NS
                {
                mEQUAL_NS(); 


                }
                break;
            case 271 :
                // HiveLexer.g:1:2829: NOTEQUAL
                {
                mNOTEQUAL(); 


                }
                break;
            case 272 :
                // HiveLexer.g:1:2838: LESSTHANOREQUALTO
                {
                mLESSTHANOREQUALTO(); 


                }
                break;
            case 273 :
                // HiveLexer.g:1:2856: LESSTHAN
                {
                mLESSTHAN(); 


                }
                break;
            case 274 :
                // HiveLexer.g:1:2865: GREATERTHANOREQUALTO
                {
                mGREATERTHANOREQUALTO(); 


                }
                break;
            case 275 :
                // HiveLexer.g:1:2886: GREATERTHAN
                {
                mGREATERTHAN(); 


                }
                break;
            case 276 :
                // HiveLexer.g:1:2898: DIVIDE
                {
                mDIVIDE(); 


                }
                break;
            case 277 :
                // HiveLexer.g:1:2905: PLUS
                {
                mPLUS(); 


                }
                break;
            case 278 :
                // HiveLexer.g:1:2910: MINUS
                {
                mMINUS(); 


                }
                break;
            case 279 :
                // HiveLexer.g:1:2916: STAR
                {
                mSTAR(); 


                }
                break;
            case 280 :
                // HiveLexer.g:1:2921: MOD
                {
                mMOD(); 


                }
                break;
            case 281 :
                // HiveLexer.g:1:2925: DIV
                {
                mDIV(); 


                }
                break;
            case 282 :
                // HiveLexer.g:1:2929: AMPERSAND
                {
                mAMPERSAND(); 


                }
                break;
            case 283 :
                // HiveLexer.g:1:2939: TILDE
                {
                mTILDE(); 


                }
                break;
            case 284 :
                // HiveLexer.g:1:2945: BITWISEOR
                {
                mBITWISEOR(); 


                }
                break;
            case 285 :
                // HiveLexer.g:1:2955: BITWISEXOR
                {
                mBITWISEXOR(); 


                }
                break;
            case 286 :
                // HiveLexer.g:1:2966: QUESTION
                {
                mQUESTION(); 


                }
                break;
            case 287 :
                // HiveLexer.g:1:2975: DOLLAR
                {
                mDOLLAR(); 


                }
                break;
            case 288 :
                // HiveLexer.g:1:2982: StringLiteral
                {
                mStringLiteral(); 


                }
                break;
            case 289 :
                // HiveLexer.g:1:2996: CharSetLiteral
                {
                mCharSetLiteral(); 


                }
                break;
            case 290 :
                // HiveLexer.g:1:3011: BigintLiteral
                {
                mBigintLiteral(); 


                }
                break;
            case 291 :
                // HiveLexer.g:1:3025: SmallintLiteral
                {
                mSmallintLiteral(); 


                }
                break;
            case 292 :
                // HiveLexer.g:1:3041: TinyintLiteral
                {
                mTinyintLiteral(); 


                }
                break;
            case 293 :
                // HiveLexer.g:1:3056: DecimalLiteral
                {
                mDecimalLiteral(); 


                }
                break;
            case 294 :
                // HiveLexer.g:1:3071: ByteLengthLiteral
                {
                mByteLengthLiteral(); 


                }
                break;
            case 295 :
                // HiveLexer.g:1:3089: Number
                {
                mNumber(); 


                }
                break;
            case 296 :
                // HiveLexer.g:1:3096: Identifier
                {
                mIdentifier(); 


                }
                break;
            case 297 :
                // HiveLexer.g:1:3107: CharSetName
                {
                mCharSetName(); 


                }
                break;
            case 298 :
                // HiveLexer.g:1:3119: WS
                {
                mWS(); 


                }
                break;
            case 299 :
                // HiveLexer.g:1:3122: COMMENT
                {
                mCOMMENT(); 


                }
                break;

        }

    }


    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA24_eotS =
        "\1\uffff\6\64\1\130\17\64\1\u009c\1\64\13\uffff\1\u009f\1\u00a1"+
        "\2\uffff\1\u00a3\11\uffff\2\u00b1\3\uffff\6\64\1\u00c2\15\64\1\u00da"+
        "\3\64\1\u00e2\2\64\1\u00e5\1\u00e7\3\64\2\uffff\4\64\1\u00f8\1\u00fe"+
        "\1\64\1\u0100\13\64\1\u0114\54\64\4\uffff\1\64\1\u0169\7\uffff\1"+
        "\u016b\2\uffff\1\u016b\1\64\1\u016e\1\u00b1\1\u016f\1\u0170\1\u00b1"+
        "\1\64\1\uffff\2\u0177\1\u0178\1\64\1\u017a\13\64\1\uffff\17\64\1"+
        "\u0199\2\64\1\u019c\1\64\1\u019e\1\64\1\u01a0\1\uffff\3\64\1\u01a4"+
        "\2\64\1\u01a7\1\uffff\1\64\1\u01ab\1\uffff\1\64\1\uffff\1\64\1\130"+
        "\16\64\1\uffff\3\64\1\u01c3\1\64\1\uffff\1\64\1\uffff\12\64\1\u01d2"+
        "\10\64\1\uffff\20\64\1\u01ee\11\64\1\u01fa\11\64\1\u0207\1\u0209"+
        "\23\64\1\u0224\22\64\1\u023f\6\64\5\uffff\1\u0246\3\uffff\1\u00b1"+
        "\3\uffff\1\u00b1\1\u0173\2\uffff\1\64\1\uffff\7\64\1\u0254\1\u0255"+
        "\13\64\1\u0261\1\64\1\u0263\1\u0264\6\64\1\uffff\2\64\1\uffff\1"+
        "\64\1\uffff\1\64\1\uffff\3\64\1\uffff\2\64\1\uffff\1\u0276\2\64"+
        "\1\uffff\4\64\1\u027d\1\u027e\2\64\1\u0281\1\u0282\2\64\1\u0287"+
        "\1\u0288\1\64\1\u028a\5\64\1\u0290\1\64\1\uffff\5\64\1\u0298\10"+
        "\64\1\uffff\1\u02a4\1\u02a6\1\u02a7\7\64\1\u02af\10\64\1\u02b8\1"+
        "\64\1\u02bb\4\64\1\u02c0\1\uffff\1\u02c1\1\u02c3\1\64\1\u02c6\7"+
        "\64\1\uffff\6\64\1\u02d4\4\64\1\u02d9\1\uffff\1\64\1\uffff\13\64"+
        "\1\u02e6\1\64\1\u02e8\6\64\1\u02f1\4\64\1\u02f6\1\uffff\1\64\1\u02f8"+
        "\20\64\1\u030a\1\u030b\3\64\1\u030f\1\u0310\1\64\1\uffff\3\64\1"+
        "\u0315\1\u0316\1\u0317\2\uffff\2\u00b1\12\64\2\uffff\3\64\1\u0325"+
        "\1\u0326\6\64\1\uffff\1\u032d\2\uffff\1\64\1\u032f\2\64\1\u0332"+
        "\2\64\1\u0335\1\u0336\1\64\1\u0338\1\u0339\2\64\1\u033c\2\64\1\uffff"+
        "\1\u033f\5\64\2\uffff\1\u0345\1\u0346\2\uffff\1\64\1\u0348\1\64"+
        "\1\u034a\2\uffff\1\64\1\uffff\2\64\1\u034f\2\64\1\uffff\1\64\1\u0355"+
        "\2\64\1\u0358\2\64\1\uffff\13\64\1\uffff\1\64\2\uffff\3\64\1\u036b"+
        "\1\u036c\2\64\1\uffff\7\64\1\u0376\1\uffff\1\u0377\1\64\1\uffff"+
        "\3\64\1\u037d\2\uffff\1\64\1\uffff\2\64\1\uffff\12\64\1\u038c\1"+
        "\u038d\1\64\1\uffff\3\64\1\u0392\1\uffff\14\64\1\uffff\1\u03a0\1"+
        "\uffff\1\u03a1\6\64\1\u03a8\1\uffff\4\64\1\uffff\1\64\1\uffff\1"+
        "\64\1\u03af\1\u03b0\14\64\1\u03bd\1\64\2\uffff\3\64\2\uffff\1\64"+
        "\1\u03c3\1\64\1\u03c5\3\uffff\1\u03c6\1\u03c7\1\u03c8\11\64\1\u03d3"+
        "\2\uffff\6\64\1\uffff\1\64\1\uffff\1\u03db\1\64\1\uffff\1\u03de"+
        "\1\64\2\uffff\1\64\2\uffff\2\64\1\uffff\2\64\1\uffff\2\64\1\u03e8"+
        "\1\64\1\u03ea\2\uffff\1\u03eb\1\uffff\1\64\1\uffff\2\64\1\u03ef"+
        "\1\64\1\uffff\1\u03f1\4\64\1\uffff\1\u03f6\1\u03f7\1\uffff\4\64"+
        "\1\u03fc\11\64\1\u0406\3\64\2\uffff\2\64\1\u040c\1\u040d\1\u040f"+
        "\1\u0410\1\64\1\u0412\1\64\2\uffff\1\u0414\1\u0415\1\u0416\2\64"+
        "\1\uffff\1\64\1\u041a\1\u041b\1\64\1\u041d\1\u041e\1\64\1\u0420"+
        "\1\64\1\u0423\1\u0424\1\u0425\2\64\2\uffff\1\64\1\u0429\2\64\1\uffff"+
        "\1\64\1\u042d\2\64\1\u0430\1\64\1\u0432\6\64\2\uffff\1\64\1\u043a"+
        "\1\64\1\u043c\1\u043d\1\64\1\uffff\1\u043f\1\u0440\2\64\1\u0444"+
        "\1\u0445\2\uffff\1\u0447\12\64\1\u0452\1\uffff\1\u0453\1\64\1\u0455"+
        "\2\64\1\uffff\1\64\4\uffff\1\u0459\4\64\1\u045e\2\64\1\u0461\1\64"+
        "\1\uffff\1\u0463\6\64\1\uffff\2\64\1\uffff\1\64\1\u046d\1\u046e"+
        "\5\64\1\u0474\1\uffff\1\u0475\2\uffff\1\64\1\u0477\1\u0478\1\uffff"+
        "\1\u0479\1\uffff\4\64\2\uffff\2\64\1\u0480\1\64\1\uffff\5\64\1\u0487"+
        "\3\64\1\uffff\4\64\1\u048f\2\uffff\1\u0490\2\uffff\1\u0491\1\uffff"+
        "\1\64\3\uffff\3\64\2\uffff\1\64\2\uffff\1\64\1\uffff\1\64\1\u0499"+
        "\3\uffff\3\64\1\uffff\3\64\1\uffff\2\64\1\uffff\1\64\1\uffff\2\64"+
        "\1\u04a5\2\64\1\u04a8\1\u04a9\1\uffff\1\u04aa\2\uffff\1\64\2\uffff"+
        "\3\64\2\uffff\1\u04af\1\uffff\1\64\1\u04b1\1\u04b2\5\64\1\u04ba"+
        "\1\u04bb\2\uffff\1\u04bc\1\uffff\1\u04bd\1\u04be\1\64\1\uffff\1"+
        "\u04c0\1\u04c1\1\64\1\u04c3\1\uffff\1\u04c4\1\64\1\uffff\1\64\1"+
        "\uffff\2\64\1\u04c9\2\64\1\u04cd\3\64\2\uffff\1\u04d1\1\64\1\u04d3"+
        "\2\64\2\uffff\1\u04d6\3\uffff\3\64\1\u04da\1\64\1\u04dc\1\uffff"+
        "\2\64\1\u04df\1\u04e0\1\64\1\u04e2\1\uffff\1\64\1\u04e6\1\u04e7"+
        "\2\64\1\u04ea\1\64\3\uffff\4\64\1\u04f0\2\64\1\uffff\2\64\1\u04f5"+
        "\3\64\1\u04f9\1\u04fa\3\64\1\uffff\2\64\3\uffff\1\u0500\2\64\1\u0503"+
        "\1\uffff\1\64\2\uffff\1\u0505\1\u0506\2\64\1\u0509\2\64\5\uffff"+
        "\1\64\2\uffff\1\u050e\2\uffff\1\u050f\1\64\1\u0511\1\64\1\uffff"+
        "\1\u0513\1\64\1\u0515\1\uffff\1\64\1\u0517\1\u0518\1\uffff\1\u0519"+
        "\1\uffff\2\64\1\uffff\2\64\1\u051f\1\uffff\1\64\1\uffff\1\u0521"+
        "\1\64\2\uffff\1\64\1\uffff\1\u0524\1\64\1\u0526\2\uffff\2\64\2\uffff"+
        "\4\64\1\uffff\3\64\1\u0530\1\uffff\1\u0531\1\u0532\1\64\2\uffff"+
        "\1\u0534\1\64\1\u0536\1\u0539\1\64\1\uffff\2\64\1\uffff\1\64\2\uffff"+
        "\2\64\1\uffff\1\u0540\3\64\2\uffff\1\64\1\uffff\1\u0545\1\uffff"+
        "\1\64\1\uffff\1\u0547\3\uffff\5\64\1\uffff\1\64\1\uffff\1\u054e"+
        "\1\u054f\1\uffff\1\64\1\uffff\1\u0551\6\64\1\u0558\1\u0559\3\uffff"+
        "\1\64\1\uffff\1\u055b\1\uffff\1\u055c\1\64\1\uffff\3\64\1\u0561"+
        "\2\64\1\uffff\3\64\1\u0567\1\uffff\1\64\1\uffff\2\64\1\u056b\1\u056c"+
        "\2\64\2\uffff\1\u056f\1\uffff\5\64\1\u0575\2\uffff\1\64\2\uffff"+
        "\1\u0577\1\u0578\2\64\1\uffff\1\u057b\4\64\1\uffff\1\64\1\u0581"+
        "\1\u0582\2\uffff\2\64\1\uffff\1\u0585\1\u0586\1\u0587\2\64\1\uffff"+
        "\1\u058a\2\uffff\1\u058b\1\u058c\1\uffff\2\64\1\u058f\1\64\1\u0591"+
        "\2\uffff\1\u0592\1\u0593\3\uffff\1\64\1\u0595\3\uffff\1\u0596\1"+
        "\u0597\1\uffff\1\64\3\uffff\1\64\3\uffff\1\64\1\u059b\1\64\1\uffff"+
        "\1\u059d\1\uffff";
    static final String DFA24_eofS =
        "\u059e\uffff";
    static final String DFA24_minS =
        "\1\11\1\114\2\101\1\104\1\106\1\117\1\75\1\101\1\104\1\101\2\105"+
        "\1\101\1\110\1\103\1\116\1\101\1\117\3\101\2\105\1\111\13\uffff"+
        "\2\75\2\uffff\1\55\7\uffff\2\0\2\56\3\uffff\1\101\2\103\1\123\1"+
        "\101\1\102\1\60\2\115\1\114\1\105\1\114\1\117\1\114\1\105\1\117"+
        "\1\114\1\124\1\114\1\101\1\60\1\124\1\103\1\104\1\60\1\105\1\124"+
        "\2\60\1\124\1\123\1\114\2\uffff\1\113\1\106\1\101\1\124\2\60\1\120"+
        "\1\60\1\116\1\105\1\130\1\103\1\122\1\124\1\117\1\125\1\120\1\101"+
        "\1\116\1\60\1\117\1\107\1\103\1\106\1\126\1\114\1\105\1\116\1\114"+
        "\1\101\1\122\2\101\1\110\1\114\1\105\1\106\1\101\1\105\1\103\1\104"+
        "\1\105\2\122\1\125\1\122\1\111\1\107\1\101\1\114\1\106\1\111\1\116"+
        "\1\101\1\117\1\105\1\101\1\123\1\102\2\103\1\116\1\122\1\131\4\uffff"+
        "\1\105\1\76\5\uffff\2\0\1\42\2\0\1\42\2\60\1\56\3\60\1\53\1\uffff"+
        "\3\60\1\102\1\60\1\123\1\114\1\105\1\110\1\101\2\105\1\116\1\107"+
        "\1\114\1\103\1\uffff\1\131\1\105\1\115\1\124\2\120\1\116\1\123\1"+
        "\115\1\114\1\103\1\123\1\114\1\105\1\101\1\60\1\114\1\103\1\60\1"+
        "\105\1\60\1\114\1\60\1\uffff\1\105\1\101\1\110\1\60\1\101\1\105"+
        "\1\60\1\uffff\1\122\1\60\1\uffff\1\114\1\uffff\1\111\1\60\1\104"+
        "\1\103\1\114\2\105\1\111\1\124\1\123\1\107\1\101\1\104\1\111\1\107"+
        "\1\105\1\uffff\2\105\1\101\1\60\1\105\1\uffff\1\117\1\uffff\1\117"+
        "\1\115\1\120\1\103\1\111\3\105\1\101\1\105\1\60\1\101\1\120\1\102"+
        "\1\116\1\122\1\125\1\116\1\105\1\uffff\1\114\1\110\1\111\1\101\1"+
        "\113\1\117\1\127\1\111\1\104\1\116\1\114\1\110\1\104\1\105\1\125"+
        "\1\104\1\60\1\111\1\127\1\122\1\124\1\114\1\105\1\122\1\124\1\105"+
        "\1\60\1\127\1\106\1\117\1\105\2\117\1\122\1\117\1\116\2\60\1\101"+
        "\1\124\2\103\1\124\1\103\1\123\1\107\1\116\1\110\1\125\2\101\1\125"+
        "\1\104\1\105\2\117\1\124\1\60\1\105\1\111\1\113\1\107\1\114\1\115"+
        "\1\103\1\122\1\114\2\123\1\101\1\123\1\116\1\103\1\122\1\105\1\113"+
        "\1\60\1\122\1\105\1\125\1\105\1\123\1\127\2\uffff\1\0\1\uffff\1"+
        "\0\1\60\3\uffff\1\60\1\53\1\uffff\3\60\2\uffff\1\114\1\uffff\1\124"+
        "\1\122\1\101\1\116\1\125\1\101\1\120\2\60\1\103\1\123\1\107\1\105"+
        "\1\110\1\111\1\123\1\111\1\106\1\117\1\122\1\60\1\105\2\60\2\124"+
        "\1\104\1\106\1\124\1\101\1\uffff\1\117\1\110\1\uffff\1\122\1\uffff"+
        "\1\131\1\uffff\1\122\1\131\1\111\1\uffff\1\103\1\122\1\uffff\1\60"+
        "\1\122\1\125\1\uffff\1\111\1\117\1\122\1\101\2\60\1\123\1\124\2"+
        "\60\1\124\1\114\2\60\1\103\1\60\2\122\1\130\2\124\1\60\1\122\1\uffff"+
        "\3\122\1\123\1\122\1\60\2\115\1\124\1\116\1\122\1\101\1\102\1\103"+
        "\1\uffff\3\60\1\114\1\123\1\117\1\120\1\124\1\122\1\105\1\60\1\116"+
        "\1\122\1\105\1\122\1\105\1\116\1\137\1\105\1\60\1\105\1\60\1\117"+
        "\1\103\2\105\1\60\1\uffff\2\60\1\105\1\60\1\114\1\116\1\103\1\101"+
        "\1\105\1\111\1\115\1\uffff\1\105\1\111\1\125\1\116\1\124\1\107\1"+
        "\60\2\103\1\125\1\107\1\60\1\uffff\1\124\1\uffff\1\124\1\122\1\105"+
        "\1\124\1\105\1\111\3\105\1\111\1\105\1\60\1\105\1\60\1\124\2\111"+
        "\1\101\1\115\1\103\1\60\1\130\1\113\2\122\1\60\1\uffff\1\125\1\60"+
        "\1\114\2\105\1\115\2\105\1\125\2\101\2\105\1\124\1\105\1\124\1\123"+
        "\1\107\2\60\1\101\1\117\1\105\2\60\1\117\1\uffff\1\117\1\122\1\123"+
        "\3\60\1\uffff\3\60\1\104\1\105\1\123\1\124\1\111\1\116\1\104\1\123"+
        "\1\116\1\105\2\uffff\1\101\1\106\1\105\2\60\1\116\1\124\1\116\1"+
        "\111\1\122\1\117\1\uffff\1\60\2\uffff\1\111\1\60\1\123\1\117\1\60"+
        "\1\124\1\127\2\60\1\132\2\60\1\126\1\105\1\60\1\122\1\101\1\uffff"+
        "\1\60\1\124\2\116\1\117\1\116\2\uffff\2\60\2\uffff\1\110\1\60\1"+
        "\111\1\60\2\uffff\1\101\1\uffff\1\101\1\124\1\60\1\110\1\104\1\uffff"+
        "\1\123\1\60\1\124\1\105\1\60\1\117\1\111\1\uffff\1\101\1\111\1\105"+
        "\1\104\1\122\1\116\1\111\1\116\1\114\1\124\1\101\1\uffff\1\111\2"+
        "\uffff\1\105\1\124\1\120\2\60\2\101\1\uffff\1\124\1\131\1\124\2"+
        "\105\1\107\1\104\1\60\1\uffff\1\60\1\116\1\uffff\1\127\1\124\1\116"+
        "\1\60\2\uffff\1\104\1\uffff\2\104\1\uffff\1\111\1\107\1\124\1\115"+
        "\1\104\1\123\1\101\1\104\1\130\1\105\2\60\1\116\1\uffff\1\113\1"+
        "\110\1\116\1\60\1\uffff\1\115\2\105\1\122\1\131\1\104\1\130\1\103"+
        "\1\104\1\103\1\101\1\116\1\uffff\1\60\1\uffff\1\60\1\114\1\122\1"+
        "\103\2\105\1\116\1\60\1\uffff\1\120\1\105\1\104\1\111\1\uffff\1"+
        "\120\1\uffff\1\105\2\60\1\116\1\103\1\116\1\124\1\116\1\111\1\124"+
        "\2\123\1\105\1\123\1\105\1\60\1\105\2\uffff\1\104\1\122\1\116\2"+
        "\uffff\1\111\1\60\1\111\1\60\3\uffff\3\60\1\116\1\101\1\105\1\111"+
        "\1\107\1\104\1\124\1\117\1\122\1\60\2\uffff\1\124\2\101\1\114\1"+
        "\101\1\120\1\uffff\1\117\1\uffff\1\60\1\122\1\uffff\1\60\1\111\2"+
        "\uffff\1\105\2\uffff\1\105\1\116\1\uffff\1\111\1\120\1\uffff\1\104"+
        "\1\105\1\60\1\120\1\60\2\uffff\1\60\1\uffff\1\117\1\uffff\2\114"+
        "\1\60\1\123\1\uffff\1\60\1\117\1\122\1\105\1\101\1\uffff\2\60\1"+
        "\uffff\1\120\1\102\1\114\1\124\1\60\2\105\1\103\1\102\1\103\1\105"+
        "\1\117\1\123\1\115\1\60\1\122\1\105\1\116\2\uffff\1\124\1\116\4"+
        "\60\1\116\1\60\1\104\2\uffff\3\60\1\103\1\122\1\uffff\1\101\2\60"+
        "\1\116\2\60\1\124\1\60\1\124\3\60\1\112\1\131\2\uffff\1\105\1\60"+
        "\1\111\1\104\1\uffff\1\105\1\60\1\101\1\126\1\60\1\111\1\60\1\124"+
        "\1\125\1\124\1\111\1\114\1\124\2\uffff\1\104\1\60\1\105\2\60\1\114"+
        "\1\uffff\2\60\1\122\1\103\2\60\2\uffff\1\60\2\124\1\105\1\125\1"+
        "\116\1\105\1\120\1\103\1\122\1\124\1\60\1\uffff\1\60\1\105\1\60"+
        "\1\124\1\116\1\uffff\1\101\4\uffff\1\60\1\114\1\104\1\126\1\105"+
        "\1\60\1\105\1\122\1\60\1\115\1\uffff\1\60\1\115\1\124\1\105\1\122"+
        "\1\105\1\116\1\uffff\1\115\1\105\1\uffff\1\116\2\60\2\124\1\123"+
        "\1\117\1\122\1\60\1\uffff\1\60\2\uffff\1\116\2\60\1\uffff\1\60\1"+
        "\uffff\1\122\1\111\1\103\1\114\2\uffff\2\105\1\60\1\105\1\uffff"+
        "\1\116\1\104\1\124\1\125\1\105\1\60\1\122\2\105\1\uffff\1\105\1"+
        "\122\1\107\1\105\1\60\2\uffff\1\60\2\uffff\1\60\1\uffff\1\114\3"+
        "\uffff\1\105\1\117\1\124\2\uffff\1\124\2\uffff\1\101\1\uffff\1\111"+
        "\1\60\3\uffff\1\117\1\120\1\104\1\uffff\1\126\1\105\1\123\1\uffff"+
        "\1\115\1\105\1\uffff\1\116\1\uffff\1\111\1\122\1\60\1\117\1\123"+
        "\2\60\1\uffff\1\60\2\uffff\1\131\2\uffff\1\105\1\122\1\124\2\uffff"+
        "\1\60\1\uffff\1\111\2\60\1\105\1\123\1\116\1\117\1\105\2\60\2\uffff"+
        "\1\60\1\uffff\2\60\1\114\1\uffff\2\60\1\105\1\60\1\uffff\1\60\1"+
        "\115\1\uffff\1\120\1\uffff\1\120\1\105\1\60\1\131\1\122\1\60\1\101"+
        "\1\104\1\107\2\uffff\1\60\1\105\1\60\1\122\1\111\2\uffff\1\60\3"+
        "\uffff\1\115\1\126\1\124\1\60\1\122\1\60\1\uffff\1\104\1\103\2\60"+
        "\1\124\1\60\1\uffff\1\111\2\60\1\101\1\124\1\60\1\40\3\uffff\1\124"+
        "\1\106\1\120\1\101\1\60\1\102\1\103\1\uffff\1\111\1\105\1\60\1\105"+
        "\1\104\1\124\2\60\1\107\1\117\1\105\1\uffff\1\116\1\103\3\uffff"+
        "\1\60\1\101\1\111\1\60\1\uffff\1\117\2\uffff\2\60\1\101\1\116\1"+
        "\60\1\104\1\124\5\uffff\1\111\2\uffff\1\60\2\uffff\1\60\1\114\1"+
        "\60\1\104\1\uffff\1\60\1\124\1\60\1\uffff\1\124\2\60\1\uffff\1\60"+
        "\1\uffff\1\115\1\126\1\uffff\1\101\1\105\1\60\1\uffff\1\124\1\uffff"+
        "\1\60\1\131\2\uffff\1\105\1\uffff\1\60\1\105\1\60\2\uffff\1\115"+
        "\1\111\2\uffff\2\111\1\105\1\102\1\uffff\1\114\1\123\1\116\1\60"+
        "\1\uffff\2\60\1\101\2\uffff\1\60\1\116\2\60\1\101\1\uffff\1\104"+
        "\1\124\1\uffff\1\116\2\uffff\1\124\1\104\1\uffff\1\60\1\101\1\132"+
        "\1\105\2\uffff\1\105\1\uffff\1\60\1\uffff\1\111\1\uffff\1\60\3\uffff"+
        "\1\101\1\105\1\124\1\122\1\117\1\uffff\1\111\1\uffff\2\60\1\uffff"+
        "\1\123\1\uffff\1\60\1\105\1\115\1\114\1\122\1\101\1\105\2\60\3\uffff"+
        "\1\115\1\uffff\1\60\1\uffff\1\60\1\104\1\uffff\1\116\2\105\1\60"+
        "\1\105\1\111\1\uffff\1\124\1\105\1\123\1\60\1\uffff\1\105\1\uffff"+
        "\1\124\1\122\2\60\1\111\1\105\2\uffff\1\60\1\uffff\1\123\2\105\1"+
        "\124\1\123\1\60\2\uffff\1\120\2\uffff\2\60\2\122\1\uffff\1\60\1"+
        "\116\1\125\1\104\1\123\1\uffff\1\123\2\60\2\uffff\1\116\1\123\1"+
        "\uffff\3\60\1\111\1\105\1\uffff\1\60\2\uffff\2\60\1\uffff\1\107"+
        "\1\123\1\60\1\112\1\60\2\uffff\2\60\3\uffff\1\105\1\60\3\uffff\2"+
        "\60\1\uffff\1\117\3\uffff\1\123\3\uffff\1\111\1\60\1\116\1\uffff"+
        "\1\60\1\uffff";
    static final String DFA24_maxS =
        "\1\176\1\130\1\122\1\125\1\123\1\126\1\125\1\75\1\117\1\124\2\122"+
        "\1\131\1\117\1\111\1\125\1\124\1\125\2\117\1\125\1\123\1\105\1\126"+
        "\1\111\13\uffff\1\76\1\75\2\uffff\1\55\7\uffff\2\uffff\2\172\3\uffff"+
        "\1\104\1\124\1\103\1\123\1\125\1\102\1\172\1\116\1\130\1\114\1\105"+
        "\1\114\1\117\1\116\1\122\1\117\1\122\2\124\1\104\1\172\1\124\1\122"+
        "\1\112\1\172\1\105\1\124\2\172\1\124\1\137\1\114\2\uffff\1\116\1"+
        "\123\1\116\1\124\2\172\1\120\1\172\1\116\1\105\1\130\1\123\1\126"+
        "\1\124\1\117\1\127\1\120\1\117\1\116\1\172\1\124\1\116\1\103\1\124"+
        "\1\126\1\114\1\111\2\124\1\117\1\122\1\101\1\122\1\110\1\114\1\105"+
        "\1\106\1\123\1\111\1\103\1\123\1\117\2\122\1\125\1\122\1\111\1\107"+
        "\1\126\1\127\1\106\1\111\1\116\1\122\1\125\1\117\1\101\1\123\1\122"+
        "\1\103\1\124\1\116\1\122\1\131\4\uffff\1\105\1\76\5\uffff\2\uffff"+
        "\1\47\2\uffff\1\47\1\146\4\172\1\145\1\71\1\uffff\3\172\1\102\1"+
        "\172\1\123\1\117\1\105\1\114\1\101\1\105\2\116\1\107\1\114\1\103"+
        "\1\uffff\1\131\1\105\1\115\1\124\2\120\1\116\1\123\1\115\1\114\1"+
        "\103\1\123\1\114\1\105\1\101\1\172\1\114\1\103\1\172\1\105\1\172"+
        "\1\114\1\172\1\uffff\1\105\1\101\1\110\1\172\1\101\1\105\1\172\1"+
        "\uffff\1\122\1\172\1\uffff\1\114\1\uffff\1\111\1\172\1\104\1\103"+
        "\1\114\2\105\1\111\1\124\1\123\1\107\1\113\1\104\1\111\1\107\1\105"+
        "\1\uffff\2\105\1\125\1\172\1\105\1\uffff\1\117\1\uffff\1\117\1\115"+
        "\1\120\1\103\2\111\2\105\1\124\1\105\1\172\1\105\1\120\1\102\1\116"+
        "\1\122\1\125\1\116\1\105\1\uffff\1\114\1\110\1\111\1\101\1\113\1"+
        "\117\1\127\1\111\1\104\1\122\1\114\1\110\1\104\1\105\1\125\1\104"+
        "\1\172\1\111\1\127\1\122\1\124\1\114\1\125\1\122\1\124\1\105\1\172"+
        "\1\127\1\106\1\121\1\111\2\117\1\122\1\117\1\116\2\172\1\101\4\124"+
        "\1\103\1\123\1\107\1\116\1\110\1\125\1\114\1\101\1\125\1\104\1\105"+
        "\2\117\1\124\1\172\1\114\1\111\1\113\1\107\1\125\1\120\1\124\1\122"+
        "\1\114\2\123\1\101\1\123\1\116\1\124\1\123\1\105\1\113\1\172\1\122"+
        "\1\105\1\125\1\105\1\123\1\127\2\uffff\1\uffff\1\uffff\1\uffff\1"+
        "\172\3\uffff\1\145\1\71\1\uffff\1\71\2\172\2\uffff\1\114\1\uffff"+
        "\1\124\1\122\1\101\1\122\1\125\1\101\1\120\2\172\1\103\1\123\1\107"+
        "\1\105\1\110\1\111\1\123\1\111\1\106\1\117\1\122\1\172\1\105\2\172"+
        "\2\124\1\104\1\106\1\124\1\101\1\uffff\1\117\1\110\1\uffff\1\122"+
        "\1\uffff\1\131\1\uffff\1\122\1\131\1\111\1\uffff\1\103\1\122\1\uffff"+
        "\1\172\1\122\1\125\1\uffff\1\111\1\117\1\122\1\101\2\172\1\123\1"+
        "\124\2\172\2\124\2\172\1\103\1\172\2\122\1\130\2\124\1\172\1\122"+
        "\1\uffff\3\122\1\123\1\122\1\172\2\115\1\124\1\116\2\122\1\102\1"+
        "\103\1\uffff\3\172\1\114\1\123\1\117\1\120\1\124\1\122\1\105\1\172"+
        "\1\116\1\122\1\105\1\122\1\105\1\116\1\137\1\105\1\172\1\105\1\172"+
        "\1\117\1\103\2\105\1\172\1\uffff\2\172\1\105\1\172\1\114\1\116\1"+
        "\103\1\101\1\105\1\111\1\115\1\uffff\1\105\1\111\1\125\1\116\1\124"+
        "\1\107\1\172\2\103\1\125\1\107\1\172\1\uffff\1\124\1\uffff\1\124"+
        "\1\122\1\105\1\124\1\105\1\111\3\105\1\111\1\105\1\172\1\105\1\172"+
        "\1\124\2\111\1\101\1\115\1\103\1\172\1\130\1\113\2\122\1\172\1\uffff"+
        "\1\125\1\172\1\114\2\105\1\115\2\105\1\125\1\111\1\101\2\105\1\124"+
        "\1\105\1\124\1\123\1\107\2\172\1\101\1\117\1\105\2\172\1\117\1\uffff"+
        "\1\117\1\122\1\123\3\172\1\uffff\1\71\2\102\1\104\1\105\1\123\1"+
        "\124\1\111\1\116\1\104\1\123\1\116\1\105\2\uffff\1\101\1\106\1\105"+
        "\2\172\1\116\1\124\1\116\1\111\1\122\1\117\1\uffff\1\172\2\uffff"+
        "\1\111\1\172\1\123\1\117\1\172\1\124\1\127\2\172\1\132\2\172\1\126"+
        "\1\105\1\172\1\122\1\101\1\uffff\1\172\1\124\2\116\1\117\1\116\2"+
        "\uffff\2\172\2\uffff\1\110\1\172\1\111\1\172\2\uffff\1\101\1\uffff"+
        "\1\101\1\124\1\172\1\110\1\106\1\uffff\1\126\1\172\1\124\1\105\1"+
        "\172\1\117\1\111\1\uffff\1\101\1\111\1\105\1\104\1\122\1\116\1\111"+
        "\1\116\1\114\1\124\1\101\1\uffff\1\111\2\uffff\1\105\1\124\1\120"+
        "\2\172\2\101\1\uffff\1\124\1\131\1\124\2\105\1\107\1\104\1\172\1"+
        "\uffff\1\172\1\116\1\uffff\1\127\1\124\1\116\1\172\2\uffff\1\104"+
        "\1\uffff\2\104\1\uffff\1\111\1\107\1\124\1\115\1\104\1\123\1\101"+
        "\1\104\1\130\1\105\2\172\1\116\1\uffff\1\113\1\110\1\116\1\172\1"+
        "\uffff\1\115\2\105\1\122\1\131\1\104\1\130\1\103\1\104\1\103\1\124"+
        "\1\116\1\uffff\1\172\1\uffff\1\172\1\114\1\122\1\103\2\105\1\116"+
        "\1\172\1\uffff\1\120\1\105\1\104\1\111\1\uffff\1\120\1\uffff\1\105"+
        "\2\172\1\116\1\103\1\116\1\124\1\116\1\111\1\124\2\123\1\105\1\123"+
        "\1\105\1\172\1\105\2\uffff\1\104\1\122\1\116\2\uffff\1\111\1\172"+
        "\1\111\1\172\3\uffff\3\172\1\116\1\101\1\105\1\111\1\107\1\104\1"+
        "\124\1\117\1\122\1\172\2\uffff\1\124\2\101\1\114\1\101\1\120\1\uffff"+
        "\1\117\1\uffff\1\172\1\122\1\uffff\1\172\1\111\2\uffff\1\105\2\uffff"+
        "\1\105\1\116\1\uffff\1\111\1\120\1\uffff\1\106\1\105\1\172\1\120"+
        "\1\172\2\uffff\1\172\1\uffff\1\117\1\uffff\2\114\1\172\1\123\1\uffff"+
        "\1\172\1\117\1\122\1\105\1\101\1\uffff\2\172\1\uffff\1\120\1\102"+
        "\1\114\1\124\1\172\2\105\1\103\1\102\1\103\1\105\1\117\1\123\1\115"+
        "\1\172\1\122\1\105\1\116\2\uffff\1\124\1\116\4\172\1\116\1\172\1"+
        "\104\2\uffff\3\172\1\103\1\122\1\uffff\1\101\2\172\1\116\2\172\1"+
        "\124\1\172\1\124\3\172\1\112\1\131\2\uffff\1\105\1\172\1\111\1\104"+
        "\1\uffff\1\105\1\172\1\101\1\126\1\172\1\111\1\172\1\124\1\125\1"+
        "\124\1\111\1\114\1\124\2\uffff\1\104\1\172\1\105\2\172\1\114\1\uffff"+
        "\2\172\1\127\1\103\2\172\2\uffff\1\172\2\124\1\105\1\125\1\116\1"+
        "\105\1\120\1\103\1\122\1\124\1\172\1\uffff\1\172\1\105\1\172\1\124"+
        "\1\116\1\uffff\1\101\4\uffff\1\172\1\114\1\104\1\126\1\105\1\172"+
        "\1\105\1\122\1\172\1\115\1\uffff\1\172\1\115\1\124\1\105\1\122\1"+
        "\105\1\116\1\uffff\1\115\1\105\1\uffff\1\116\2\172\2\124\1\123\1"+
        "\117\1\122\1\172\1\uffff\1\172\2\uffff\1\116\2\172\1\uffff\1\172"+
        "\1\uffff\1\122\1\111\1\103\1\114\2\uffff\2\105\1\172\1\105\1\uffff"+
        "\1\116\1\104\1\124\1\125\1\105\1\172\1\122\2\105\1\uffff\1\105\1"+
        "\122\1\107\1\105\1\172\2\uffff\1\172\2\uffff\1\172\1\uffff\1\114"+
        "\3\uffff\1\105\1\117\1\124\2\uffff\1\124\2\uffff\1\101\1\uffff\1"+
        "\111\1\172\3\uffff\1\117\1\120\1\104\1\uffff\1\126\1\105\1\123\1"+
        "\uffff\1\115\1\105\1\uffff\1\116\1\uffff\1\111\1\122\1\172\1\117"+
        "\1\123\2\172\1\uffff\1\172\2\uffff\1\131\2\uffff\1\105\1\122\1\124"+
        "\2\uffff\1\172\1\uffff\1\111\2\172\1\105\1\123\1\116\1\117\1\105"+
        "\2\172\2\uffff\1\172\1\uffff\2\172\1\114\1\uffff\2\172\1\105\1\172"+
        "\1\uffff\1\172\1\115\1\uffff\1\120\1\uffff\1\120\1\105\1\172\1\131"+
        "\1\122\1\172\1\101\1\104\1\107\2\uffff\1\172\1\105\1\172\1\122\1"+
        "\111\2\uffff\1\172\3\uffff\1\115\1\126\1\124\1\172\1\122\1\172\1"+
        "\uffff\1\104\1\103\2\172\1\124\1\172\1\uffff\1\131\2\172\1\101\1"+
        "\124\1\172\1\40\3\uffff\1\124\1\106\1\120\1\101\1\172\1\102\1\103"+
        "\1\uffff\1\111\1\105\1\172\1\105\1\104\1\124\2\172\1\107\1\117\1"+
        "\105\1\uffff\1\116\1\103\3\uffff\1\172\1\101\1\111\1\172\1\uffff"+
        "\1\117\2\uffff\2\172\1\101\1\116\1\172\1\104\1\124\5\uffff\1\111"+
        "\2\uffff\1\172\2\uffff\1\172\1\114\1\172\1\104\1\uffff\1\172\1\124"+
        "\1\172\1\uffff\1\124\2\172\1\uffff\1\172\1\uffff\1\115\1\126\1\uffff"+
        "\1\101\1\105\1\172\1\uffff\1\124\1\uffff\1\172\1\131\2\uffff\1\105"+
        "\1\uffff\1\172\1\105\1\172\2\uffff\1\115\1\111\2\uffff\2\111\1\105"+
        "\1\102\1\uffff\1\114\1\123\1\116\1\172\1\uffff\2\172\1\101\2\uffff"+
        "\1\172\1\116\2\172\1\101\1\uffff\1\104\1\124\1\uffff\1\116\2\uffff"+
        "\1\124\1\104\1\uffff\1\172\1\101\1\132\1\105\2\uffff\1\105\1\uffff"+
        "\1\172\1\uffff\1\111\1\uffff\1\172\3\uffff\1\101\1\105\1\124\1\122"+
        "\1\117\1\uffff\1\111\1\uffff\2\172\1\uffff\1\123\1\uffff\1\172\1"+
        "\105\1\115\1\114\1\122\1\101\1\105\2\172\3\uffff\1\115\1\uffff\1"+
        "\172\1\uffff\1\172\1\104\1\uffff\1\116\2\105\1\172\1\105\1\111\1"+
        "\uffff\1\124\1\105\1\123\1\172\1\uffff\1\105\1\uffff\1\124\1\122"+
        "\2\172\1\111\1\105\2\uffff\1\172\1\uffff\1\123\2\105\1\124\1\123"+
        "\1\172\2\uffff\1\120\2\uffff\2\172\2\122\1\uffff\1\172\1\116\1\125"+
        "\1\104\1\123\1\uffff\1\123\2\172\2\uffff\1\116\1\123\1\uffff\3\172"+
        "\1\111\1\105\1\uffff\1\172\2\uffff\2\172\1\uffff\1\107\1\123\1\172"+
        "\1\112\1\172\2\uffff\2\172\3\uffff\1\105\1\172\3\uffff\2\172\1\uffff"+
        "\1\117\3\uffff\1\123\3\uffff\1\111\1\172\1\116\1\uffff\1\172\1\uffff";
    static final String DFA24_acceptS =
        "\31\uffff\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109"+
        "\1\u010a\1\u010b\1\u010c\1\u010d\2\uffff\1\u0114\1\u0115\1\uffff"+
        "\1\u0117\1\u0118\1\u011a\1\u011b\1\u011c\1\u011d\1\u011e\4\uffff"+
        "\1\u0128\1\u0129\1\u012a\40\uffff\1\u010f\1\7\100\uffff\1\151\1"+
        "\u0098\1\u0099\1\u011f\2\uffff\1\u0111\1\u0112\1\u0113\1\u012b\1"+
        "\u0116\15\uffff\1\u0127\20\uffff\1\107\27\uffff\1\23\7\uffff\1\6"+
        "\2\uffff\1\37\1\uffff\1\176\20\uffff\1\11\5\uffff\1\u00ac\1\uffff"+
        "\1\71\23\uffff\1\17\123\uffff\1\u010e\1\u0110\1\uffff\1\u0120\2"+
        "\uffff\1\u0122\1\u0123\1\u0124\2\uffff\1\u0125\3\uffff\1\u0126\1"+
        "\1\1\uffff\1\u009e\36\uffff\1\u00df\2\uffff\1\4\1\uffff\1\5\1\uffff"+
        "\1\13\3\uffff\1\u0081\2\uffff\1\160\3\uffff\1\175\27\uffff\1\114"+
        "\16\uffff\1\u0119\33\uffff\1\u0094\13\uffff\1\u00b4\14\uffff\1\u00d4"+
        "\1\uffff\1\u00a3\32\uffff\1\137\32\uffff\1\127\6\uffff\1\u0121\15"+
        "\uffff\1\u009d\1\2\13\uffff\1\u009c\1\uffff\1\22\1\36\21\uffff\1"+
        "\u00e7\6\uffff\1\72\1\10\2\uffff\1\34\1\u00e5\4\uffff\1\u00b6\1"+
        "\64\1\uffff\1\u00a5\5\uffff\1\135\7\uffff\1\14\13\uffff\1\67\1\uffff"+
        "\1\120\1\103\7\uffff\1\u00c5\10\uffff\1\u009b\2\uffff\1\u008f\4"+
        "\uffff\1\u00e9\1\u00cd\1\uffff\1\51\2\uffff\1\62\15\uffff\1\u00b5"+
        "\4\uffff\1\u00ed\14\uffff\1\u00a7\1\uffff\1\33\10\uffff\1\u00be"+
        "\4\uffff\1\140\1\uffff\1\u00ee\21\uffff\1\u0080\1\u009a\3\uffff"+
        "\1\u00dd\1\52\4\uffff\1\u00e6\1\150\1\u00ab\15\uffff\1\42\1\u00cf"+
        "\6\uffff\1\3\1\uffff\1\100\2\uffff\1\116\2\uffff\1\u00a9\1\75\1"+
        "\uffff\1\101\1\125\2\uffff\1\15\2\uffff\1\30\5\uffff\1\152\1\u0093"+
        "\1\uffff\1\55\1\uffff\1\u00b7\4\uffff\1\45\5\uffff\1\u00ef\2\uffff"+
        "\1\147\22\uffff\1\16\1\u00b2\11\uffff\1\21\1\u00bd\5\uffff\1\u008e"+
        "\16\uffff\1\63\1\u0095\4\uffff\1\57\15\uffff\1\u00c0\1\35\6\uffff"+
        "\1\u00bf\6\uffff\1\u0083\1\u00c1\14\uffff\1\u00c7\5\uffff\1\u0087"+
        "\1\uffff\1\u00a8\1\166\1\12\1\65\12\uffff\1\43\7\uffff\1\143\2\uffff"+
        "\1\141\11\uffff\1\u00d5\1\uffff\1\u00eb\1\u00fc\3\uffff\1\26\1\uffff"+
        "\1\70\4\uffff\1\66\1\105\4\uffff\1\u00a6\11\uffff\1\117\5\uffff"+
        "\1\115\1\u00c6\1\uffff\1\174\1\u00c3\1\uffff\1\20\1\uffff\1\u00f6"+
        "\1\u00e0\1\24\3\uffff\1\u00b9\1\134\1\uffff\1\124\1\126\1\uffff"+
        "\1\153\2\uffff\1\u00b0\1\u00db\1\u00f8\3\uffff\1\u00b8\3\uffff\1"+
        "\u00d8\2\uffff\1\u008b\1\uffff\1\u00f7\7\uffff\1\53\1\uffff\1\104"+
        "\1\131\1\uffff\1\u0084\1\u00b3\3\uffff\1\u00dc\1\157\1\uffff\1\77"+
        "\12\uffff\1\73\1\76\1\uffff\1\u00c9\3\uffff\1\u0088\4\uffff\1\145"+
        "\2\uffff\1\u00ca\1\uffff\1\112\11\uffff\1\u00c2\1\u00d0\5\uffff"+
        "\1\165\1\171\1\uffff\1\u008d\1\u00ce\1\46\6\uffff\1\123\6\uffff"+
        "\1\167\7\uffff\1\111\1\136\1\u00c4\7\uffff\1\u00b1\13\uffff\1\u0101"+
        "\2\uffff\1\177\1\47\1\u0082\4\uffff\1\44\1\uffff\1\110\1\u00d2\7"+
        "\uffff\1\60\1\u00fd\1\u00da\1\u00e4\1\u009f\1\uffff\1\74\1\u0089"+
        "\1\uffff\1\u00f0\1\u00ea\4\uffff\1\156\3\uffff\1\u0086\3\uffff\1"+
        "\u00f2\1\uffff\1\u00f4\2\uffff\1\172\3\uffff\1\u00f1\1\uffff\1\102"+
        "\2\uffff\1\u0090\1\25\1\uffff\1\u0100\3\uffff\1\u00ad\1\121\2\uffff"+
        "\1\u00e8\1\u0102\4\uffff\1\113\4\uffff\1\u00bc\3\uffff\1\u00f9\1"+
        "\32\5\uffff\1\170\2\uffff\1\u00d9\1\uffff\1\u00c8\1\u00f5\2\uffff"+
        "\1\u00fb\4\uffff\1\u00ba\1\56\1\uffff\1\122\1\uffff\1\u0085\1\uffff"+
        "\1\50\1\uffff\1\u008a\1\u00e3\1\27\5\uffff\1\u00aa\1\uffff\1\142"+
        "\2\uffff\1\54\1\uffff\1\u00ae\11\uffff\1\130\1\u00d1\1\u00e1\1\uffff"+
        "\1\u00e2\1\uffff\1\u00bb\2\uffff\1\40\6\uffff\1\133\4\uffff\1\144"+
        "\1\uffff\1\154\6\uffff\1\u008c\1\61\1\uffff\1\u00fa\6\uffff\1\u00d3"+
        "\1\31\1\uffff\1\106\1\41\4\uffff\1\146\5\uffff\1\173\3\uffff\1\161"+
        "\1\163\2\uffff\1\u00de\5\uffff\1\u00a0\1\uffff\1\132\1\u00ec\2\uffff"+
        "\1\u00d6\5\uffff\1\162\1\164\2\uffff\1\u0092\1\u00a1\1\155\2\uffff"+
        "\1\u00a4\1\u00cb\1\u00cc\2\uffff\1\u00af\1\uffff\1\u0096\1\u00ff"+
        "\1\u0097\1\uffff\1\u00d7\1\u00f3\1\u00a2\3\uffff\1\u0091\1\uffff"+
        "\1\u00fe";
    static final String DFA24_specialS =
        "\60\uffff\1\7\1\6\162\uffff\1\1\1\3\1\uffff\1\5\1\2\u00c1\uffff"+
        "\1\0\1\uffff\1\4\u0431\uffff}>";
    static final String[] DFA24_transitionS = {
            "\2\66\2\uffff\1\66\22\uffff\1\66\1\7\1\61\1\uffff\1\27\1\52"+
            "\1\53\1\60\1\35\1\36\1\51\1\47\1\33\1\50\1\31\1\46\1\62\11\63"+
            "\1\32\1\34\1\44\1\43\1\45\1\57\1\uffff\1\4\1\14\1\24\1\12\1"+
            "\1\1\3\1\13\1\15\1\11\1\22\1\26\1\10\1\25\1\6\1\5\1\21\1\64"+
            "\1\23\1\17\1\2\1\20\1\30\1\16\3\64\1\37\1\uffff\1\40\1\56\1"+
            "\65\33\64\1\41\1\55\1\42\1\54",
            "\1\72\1\uffff\1\67\4\uffff\1\71\4\uffff\1\70",
            "\1\74\1\100\2\uffff\1\77\2\uffff\1\101\1\76\5\uffff\1\75\2"+
            "\uffff\1\73",
            "\1\102\3\uffff\1\110\3\uffff\1\105\2\uffff\1\106\2\uffff\1"+
            "\107\2\uffff\1\103\2\uffff\1\104",
            "\1\116\1\uffff\1\114\5\uffff\1\111\1\uffff\1\112\3\uffff\1"+
            "\115\1\113",
            "\1\123\7\uffff\1\122\1\uffff\1\124\1\uffff\1\117\2\uffff\1"+
            "\121\1\120",
            "\1\125\5\uffff\1\126",
            "\1\127",
            "\1\134\3\uffff\1\132\3\uffff\1\131\5\uffff\1\133",
            "\1\143\1\uffff\1\135\1\141\5\uffff\1\137\1\136\4\uffff\1\140"+
            "\1\142",
            "\1\146\1\151\2\uffff\1\144\3\uffff\1\145\5\uffff\1\150\2\uffff"+
            "\1\147",
            "\1\153\14\uffff\1\152",
            "\1\160\3\uffff\1\156\5\uffff\1\155\5\uffff\1\157\3\uffff\1"+
            "\154",
            "\1\161\15\uffff\1\162",
            "\1\163\1\164",
            "\1\172\1\uffff\1\165\2\uffff\1\166\2\uffff\1\174\1\uffff\1"+
            "\170\1\uffff\1\167\3\uffff\1\173\1\171\1\175",
            "\1\176\1\uffff\1\u0081\2\uffff\1\177\1\u0080",
            "\1\u0083\3\uffff\1\u0084\6\uffff\1\u0085\5\uffff\1\u0082\2"+
            "\uffff\1\u0086",
            "\1\u0087",
            "\1\u008d\1\uffff\1\u008b\1\uffff\1\u0089\3\uffff\1\u0088\2"+
            "\uffff\1\u008c\2\uffff\1\u008a",
            "\1\u0092\6\uffff\1\u0091\3\uffff\1\u008f\2\uffff\1\u008e\2"+
            "\uffff\1\u0090\2\uffff\1\u0093",
            "\1\u0095\7\uffff\1\u0096\5\uffff\1\u0097\3\uffff\1\u0094",
            "\1\u0098",
            "\1\u009b\5\uffff\1\u0099\12\uffff\1\u009a",
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
            "\47\u00a4\1\u00a6\64\u00a4\1\u00a5\uffa3\u00a4",
            "\42\u00a7\1\u00a9\71\u00a7\1\u00a8\uffa3\u00a7",
            "\1\u00af\1\uffff\12\u00ac\7\uffff\1\64\1\u00b2\2\64\1\u00b0"+
            "\1\64\1\u00b3\3\64\1\u00b3\1\u00ab\1\u00b3\5\64\1\u00ad\4\64"+
            "\1\u00aa\1\u00ae\1\64\4\uffff\1\64\1\uffff\1\64\1\u00b3\2\64"+
            "\1\u00b0\1\64\1\u00b3\3\64\1\u00b3\1\64\1\u00b3\15\64",
            "\1\u00af\1\uffff\12\u00ac\7\uffff\1\64\1\u00b2\2\64\1\u00b0"+
            "\1\64\1\u00b3\3\64\1\u00b3\1\u00ab\1\u00b3\5\64\1\u00ad\5\64"+
            "\1\u00ae\1\64\4\uffff\1\64\1\uffff\1\64\1\u00b3\2\64\1\u00b0"+
            "\1\64\1\u00b3\3\64\1\u00b3\1\64\1\u00b3\15\64",
            "",
            "",
            "",
            "\1\u00b5\1\uffff\1\u00b4\1\u00b6",
            "\1\u00ba\5\uffff\1\u00b7\6\uffff\1\u00b8\3\uffff\1\u00b9",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00be\7\uffff\1\u00bf\13\uffff\1\u00bd",
            "\1\u00c0",
            "\12\64\7\uffff\24\64\1\u00c1\5\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00c4\1\u00c3",
            "\1\u00c7\4\uffff\1\u00c5\5\uffff\1\u00c6",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc\1\uffff\1\u00cd",
            "\1\u00cf\6\uffff\1\u00d0\5\uffff\1\u00ce",
            "\1\u00d1",
            "\1\u00d3\5\uffff\1\u00d2",
            "\1\u00d4",
            "\1\u00d5\7\uffff\1\u00d6",
            "\1\u00d8\2\uffff\1\u00d7",
            "\12\64\7\uffff\2\64\1\u00d9\27\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00db",
            "\1\u00dd\16\uffff\1\u00dc",
            "\1\u00de\5\uffff\1\u00df",
            "\12\64\7\uffff\2\64\1\u00e1\1\u00e0\26\64\4\uffff\1\64\1\uffff"+
            "\32\64",
            "\1\u00e3",
            "\1\u00e4",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\5\64\1\u00e6\24\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00e8",
            "\1\u00eb\1\u00e9\12\uffff\1\u00ea",
            "\1\u00ec",
            "",
            "",
            "\1\u00ed\1\uffff\1\u00ef\1\u00ee",
            "\1\u00f0\7\uffff\1\u00f2\4\uffff\1\u00f1",
            "\1\u00f4\1\uffff\1\u00f3\3\uffff\1\u00f5\6\uffff\1\u00f6",
            "\1\u00f7",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\3\64\1\u00fa\11\64\1\u00fd\1\64\1\u00fb\2\64"+
            "\1\u00f9\1\u00fc\6\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00ff",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0105\2\uffff\1\u0108\5\uffff\1\u0106\3\uffff\1\u0107\2"+
            "\uffff\1\u0104",
            "\1\u010a\1\u0109\2\uffff\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e\1\uffff\1\u010f",
            "\1\u0110",
            "\1\u0112\15\uffff\1\u0111",
            "\1\u0113",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0115\4\uffff\1\u0116",
            "\1\u0117\6\uffff\1\u0118",
            "\1\u0119",
            "\1\u011a\15\uffff\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e\3\uffff\1\u011f",
            "\1\u0121\5\uffff\1\u0120",
            "\1\u0122\1\u0126\3\uffff\1\u0123\1\u0124\1\uffff\1\u0125",
            "\1\u0128\15\uffff\1\u0127",
            "\1\u0129",
            "\1\u012a",
            "\1\u012d\15\uffff\1\u012c\2\uffff\1\u012b",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0136\1\u0137\1\uffff\1\u0134\4\uffff\1\u0132\2\uffff\1"+
            "\u0135\6\uffff\1\u0133",
            "\1\u0139\3\uffff\1\u0138",
            "\1\u013a",
            "\1\u013b\16\uffff\1\u013c",
            "\1\u013d\11\uffff\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0149\1\u0145\1\u014c\1\u0148\2\uffff\1\u014a\6\uffff\1"+
            "\u0147\1\uffff\1\u0146\2\uffff\1\u014d\2\uffff\1\u014b",
            "\1\u014f\12\uffff\1\u014e",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0157\12\uffff\1\u0153\1\u0154\1\u0155\3\uffff\1\u0156",
            "\1\u0159\5\uffff\1\u0158",
            "\1\u015a\11\uffff\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015f\17\uffff\1\u015e",
            "\1\u0160",
            "\1\u0162\14\uffff\1\u0161\3\uffff\1\u0163",
            "\1\u0164",
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
            "\47\u00a4\1\u00a6\64\u00a4\1\u00a5\uffa3\u00a4",
            "\0\u016a",
            "\1\61\4\uffff\1\60",
            "\42\u00a7\1\u00a9\71\u00a7\1\u00a8\uffa3\u00a7",
            "\0\u016c",
            "\1\61\4\uffff\1\60",
            "\12\u016d\7\uffff\6\u016d\32\uffff\6\u016d",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00af\1\uffff\12\u00ac\7\uffff\1\64\1\u00b2\2\64\1\u00b0"+
            "\1\64\1\u00b3\3\64\1\u00b3\1\u00ab\1\u00b3\5\64\1\u00ad\5\64"+
            "\1\u00ae\1\64\4\uffff\1\64\1\uffff\1\64\1\u00b3\2\64\1\u00b0"+
            "\1\64\1\u00b3\3\64\1\u00b3\1\64\1\u00b3\15\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\u0171\10\uffff\1\u0173\2\uffff\1\u0172\37\uffff\1\u0172",
            "\1\u0174\1\uffff\1\u0174\2\uffff\12\u0175",
            "",
            "\12\64\7\uffff\3\64\1\u0176\26\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0179",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u017b",
            "\1\u017d\2\uffff\1\u017c",
            "\1\u017e",
            "\1\u0180\3\uffff\1\u017f",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183\10\uffff\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "",
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
            "\1\u0196",
            "\1\u0197",
            "\12\64\7\uffff\14\64\1\u0198\15\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u019a",
            "\1\u019b",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u019d",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u019f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01a5",
            "\1\u01a6",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u01a8",
            "\12\64\7\uffff\4\64\1\u01a9\12\64\1\u01aa\12\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "",
            "\1\u01ac",
            "",
            "\1\u01ad",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7\11\uffff\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf\23\uffff\1\u01c0",
            "\12\64\7\uffff\4\64\1\u01c2\11\64\1\u01c1\13\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\u01c4",
            "",
            "\1\u01c5",
            "",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cc\3\uffff\1\u01cb",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01d0\22\uffff\1\u01cf",
            "\1\u01d1",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01d3\3\uffff\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e6\3\uffff\1\u01e5",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\12\64\7\uffff\22\64\1\u01ed\7\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f6\3\uffff\1\u01f4\13\uffff\1\u01f5",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01fb",
            "\1\u01fc",
            "\1\u01fe\1\uffff\1\u01fd",
            "\1\u01ff\3\uffff\1\u0200",
            "\1\u0201",
            "\1\u0202",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "\12\64\7\uffff\21\64\1\u0206\10\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\12\64\7\uffff\32\64\4\uffff\1\u0208\1\uffff\32\64",
            "\1\u020a",
            "\1\u020b",
            "\1\u020e\2\uffff\1\u020f\14\uffff\1\u020c\1\u020d",
            "\1\u0211\6\uffff\1\u0212\11\uffff\1\u0210",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a\12\uffff\1\u021b",
            "\1\u021c",
            "\1\u021d",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\1\u0222",
            "\12\64\7\uffff\22\64\1\u0223\7\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0226\6\uffff\1\u0225",
            "\1\u0227",
            "\1\u0228",
            "\1\u0229",
            "\1\u022b\10\uffff\1\u022a",
            "\1\u022c\2\uffff\1\u022d",
            "\1\u022f\20\uffff\1\u022e",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "\1\u0235",
            "\1\u0236",
            "\1\u0239\1\uffff\1\u0238\16\uffff\1\u0237",
            "\1\u023b\1\u023a",
            "\1\u023c",
            "\1\u023d",
            "\12\64\7\uffff\11\64\1\u023e\20\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "\1\u0245",
            "",
            "",
            "\47\u00a4\1\u00a6\64\u00a4\1\u00a5\uffa3\u00a4",
            "",
            "\42\u00a7\1\u00a9\71\u00a7\1\u00a8\uffa3\u00a7",
            "\12\u016d\7\uffff\6\u016d\24\64\4\uffff\1\64\1\uffff\6\u016d"+
            "\24\64",
            "",
            "",
            "",
            "\12\u0171\10\uffff\1\u0173\2\uffff\1\u0172\37\uffff\1\u0172",
            "\1\u0247\1\uffff\1\u0247\2\uffff\12\u0248",
            "",
            "\12\u0249",
            "\12\u0175\7\uffff\1\64\1\u024a\30\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u024b",
            "",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "\1\u0250\3\uffff\1\u024f",
            "\1\u0251",
            "\1\u0252",
            "\1\u0253",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0256",
            "\1\u0257",
            "\1\u0258",
            "\1\u0259",
            "\1\u025a",
            "\1\u025b",
            "\1\u025c",
            "\1\u025d",
            "\1\u025e",
            "\1\u025f",
            "\1\u0260",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0262",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0265",
            "\1\u0266",
            "\1\u0267",
            "\1\u0268",
            "\1\u0269",
            "\1\u026a",
            "",
            "\1\u026b",
            "\1\u026c",
            "",
            "\1\u026d",
            "",
            "\1\u026e",
            "",
            "\1\u026f",
            "\1\u0270",
            "\1\u0271",
            "",
            "\1\u0272",
            "\1\u0273",
            "",
            "\12\64\7\uffff\13\64\1\u0275\12\64\1\u0274\3\64\4\uffff\1\64"+
            "\1\uffff\32\64",
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
            "\1\u0280",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0283",
            "\1\u0284\7\uffff\1\u0285",
            "\12\64\7\uffff\22\64\1\u0286\7\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0289",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u028b",
            "\1\u028c",
            "\1\u028d",
            "\1\u028e",
            "\1\u028f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0291",
            "",
            "\1\u0292",
            "\1\u0293",
            "\1\u0294",
            "\1\u0295",
            "\1\u0296",
            "\12\64\7\uffff\21\64\1\u0297\10\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u0299",
            "\1\u029a",
            "\1\u029b",
            "\1\u029c",
            "\1\u029d",
            "\1\u02a0\7\uffff\1\u029e\10\uffff\1\u029f",
            "\1\u02a1",
            "\1\u02a2",
            "",
            "\12\64\7\uffff\1\64\1\u02a3\30\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\23\64\1\u02a5\6\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02a8",
            "\1\u02a9",
            "\1\u02aa",
            "\1\u02ab",
            "\1\u02ac",
            "\1\u02ad",
            "\1\u02ae",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02b0",
            "\1\u02b1",
            "\1\u02b2",
            "\1\u02b3",
            "\1\u02b4",
            "\1\u02b5",
            "\1\u02b6",
            "\1\u02b7",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02b9",
            "\12\64\7\uffff\10\64\1\u02ba\21\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u02bc",
            "\1\u02bd",
            "\1\u02be",
            "\1\u02bf",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\u02c2\1\uffff\32\64",
            "\1\u02c4",
            "\12\64\7\uffff\4\64\1\u02c5\25\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02c7",
            "\1\u02c8",
            "\1\u02c9",
            "\1\u02ca",
            "\1\u02cb",
            "\1\u02cc",
            "\1\u02cd",
            "",
            "\1\u02ce",
            "\1\u02cf",
            "\1\u02d0",
            "\1\u02d1",
            "\1\u02d2",
            "\1\u02d3",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02d5",
            "\1\u02d6",
            "\1\u02d7",
            "\1\u02d8",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u02da",
            "",
            "\1\u02db",
            "\1\u02dc",
            "\1\u02dd",
            "\1\u02de",
            "\1\u02df",
            "\1\u02e0",
            "\1\u02e1",
            "\1\u02e2",
            "\1\u02e3",
            "\1\u02e4",
            "\1\u02e5",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02e7",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02e9",
            "\1\u02ea",
            "\1\u02eb",
            "\1\u02ec",
            "\1\u02ed",
            "\1\u02ee",
            "\12\64\7\uffff\16\64\1\u02ef\3\64\1\u02f0\7\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\u02f2",
            "\1\u02f3",
            "\1\u02f4",
            "\1\u02f5",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u02f7",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u02f9",
            "\1\u02fa",
            "\1\u02fb",
            "\1\u02fc",
            "\1\u02fd",
            "\1\u02fe",
            "\1\u02ff",
            "\1\u0301\7\uffff\1\u0300",
            "\1\u0302",
            "\1\u0303",
            "\1\u0304",
            "\1\u0305",
            "\1\u0306",
            "\1\u0307",
            "\1\u0308",
            "\1\u0309",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u030c",
            "\1\u030d",
            "\1\u030e",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0311",
            "",
            "\1\u0312",
            "\1\u0313",
            "\1\u0314",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\u0248",
            "\12\u0248\10\uffff\1\u0173",
            "\12\u0249\10\uffff\1\u0173",
            "\1\u0176",
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
            "",
            "\1\u0321",
            "\1\u0322",
            "\1\u0323",
            "\12\64\7\uffff\22\64\1\u0324\7\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0327",
            "\1\u0328",
            "\1\u0329",
            "\1\u032a",
            "\1\u032b",
            "\1\u032c",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u032e",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0330",
            "\1\u0331",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0333",
            "\1\u0334",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0337",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u033a",
            "\1\u033b",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u033d",
            "\1\u033e",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0340",
            "\1\u0341",
            "\1\u0342",
            "\1\u0343",
            "\1\u0344",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u0347",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0349",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u034b",
            "",
            "\1\u034c",
            "\1\u034d",
            "\12\64\7\uffff\4\64\1\u034e\25\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0350",
            "\1\u0352\1\uffff\1\u0351",
            "",
            "\1\u0353\2\uffff\1\u0354",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0356",
            "\1\u0357",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0359",
            "\1\u035a",
            "",
            "\1\u035b",
            "\1\u035c",
            "\1\u035d",
            "\1\u035e",
            "\1\u035f",
            "\1\u0360",
            "\1\u0361",
            "\1\u0362",
            "\1\u0363",
            "\1\u0364",
            "\1\u0365",
            "",
            "\1\u0366",
            "",
            "",
            "\1\u0367",
            "\1\u0368",
            "\1\u0369",
            "\12\64\7\uffff\10\64\1\u036a\21\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u036d",
            "\1\u036e",
            "",
            "\1\u036f",
            "\1\u0370",
            "\1\u0371",
            "\1\u0372",
            "\1\u0373",
            "\1\u0374",
            "\1\u0375",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0378",
            "",
            "\1\u0379",
            "\1\u037a",
            "\1\u037b",
            "\12\64\7\uffff\17\64\1\u037c\12\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "",
            "\1\u037e",
            "",
            "\1\u037f",
            "\1\u0380",
            "",
            "\1\u0381",
            "\1\u0382",
            "\1\u0383",
            "\1\u0384",
            "\1\u0385",
            "\1\u0386",
            "\1\u0387",
            "\1\u0388",
            "\1\u0389",
            "\1\u038a",
            "\12\64\7\uffff\23\64\1\u038b\6\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u038e",
            "",
            "\1\u038f",
            "\1\u0390",
            "\1\u0391",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
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
            "\1\u039f",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03a2",
            "\1\u03a3",
            "\1\u03a4",
            "\1\u03a5",
            "\1\u03a6",
            "\1\u03a7",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u03a9",
            "\1\u03aa",
            "\1\u03ab",
            "\1\u03ac",
            "",
            "\1\u03ad",
            "",
            "\1\u03ae",
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
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03be",
            "",
            "",
            "\1\u03bf",
            "\1\u03c0",
            "\1\u03c1",
            "",
            "",
            "\1\u03c2",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03c4",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03c9",
            "\1\u03ca",
            "\1\u03cb",
            "\1\u03cc",
            "\1\u03cd",
            "\1\u03ce",
            "\1\u03cf",
            "\1\u03d0",
            "\1\u03d1",
            "\12\64\7\uffff\1\u03d2\31\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u03d4",
            "\1\u03d5",
            "\1\u03d6",
            "\1\u03d7",
            "\1\u03d8",
            "\1\u03d9",
            "",
            "\1\u03da",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03dc",
            "",
            "\12\64\7\uffff\23\64\1\u03dd\6\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03df",
            "",
            "",
            "\1\u03e0",
            "",
            "",
            "\1\u03e1",
            "\1\u03e2",
            "",
            "\1\u03e3",
            "\1\u03e4",
            "",
            "\1\u03e6\1\uffff\1\u03e5",
            "\1\u03e7",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03e9",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u03ec",
            "",
            "\1\u03ed",
            "\1\u03ee",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03f0",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03f2",
            "\1\u03f3",
            "\1\u03f4",
            "\1\u03f5",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u03f8",
            "\1\u03f9",
            "\1\u03fa",
            "\1\u03fb",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u03fd",
            "\1\u03fe",
            "\1\u03ff",
            "\1\u0400",
            "\1\u0401",
            "\1\u0402",
            "\1\u0403",
            "\1\u0404",
            "\1\u0405",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0407",
            "\1\u0408",
            "\1\u0409",
            "",
            "",
            "\1\u040a",
            "\1\u040b",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\22\64\1\u040e\7\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0411",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0413",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0417",
            "\1\u0418",
            "",
            "\1\u0419",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u041c",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u041f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0421",
            "\12\64\7\uffff\22\64\1\u0422\7\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0426",
            "\1\u0427",
            "",
            "",
            "\1\u0428",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u042a",
            "\1\u042b",
            "",
            "\1\u042c",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u042e",
            "\1\u042f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0431",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0433",
            "\1\u0434",
            "\1\u0435",
            "\1\u0436",
            "\1\u0437",
            "\1\u0438",
            "",
            "",
            "\1\u0439",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u043b",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u043e",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0441\4\uffff\1\u0442",
            "\1\u0443",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\22\64\1\u0446\7\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0448",
            "\1\u0449",
            "\1\u044a",
            "\1\u044b",
            "\1\u044c",
            "\1\u044d",
            "\1\u044e",
            "\1\u044f",
            "\1\u0450",
            "\1\u0451",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0454",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0456",
            "\1\u0457",
            "",
            "\1\u0458",
            "",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u045a",
            "\1\u045b",
            "\1\u045c",
            "\1\u045d",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u045f",
            "\1\u0460",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0462",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0464",
            "\1\u0465",
            "\1\u0466",
            "\1\u0467",
            "\1\u0468",
            "\1\u0469",
            "",
            "\1\u046a",
            "\1\u046b",
            "",
            "\1\u046c",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u046f",
            "\1\u0470",
            "\1\u0471",
            "\1\u0472",
            "\1\u0473",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u0476",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u047a",
            "\1\u047b",
            "\1\u047c",
            "\1\u047d",
            "",
            "",
            "\1\u047e",
            "\1\u047f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0481",
            "",
            "\1\u0482",
            "\1\u0483",
            "\1\u0484",
            "\1\u0485",
            "\1\u0486",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0488",
            "\1\u0489",
            "\1\u048a",
            "",
            "\1\u048b",
            "\1\u048c",
            "\1\u048d",
            "\1\u048e",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0492",
            "",
            "",
            "",
            "\1\u0493",
            "\1\u0494",
            "\1\u0495",
            "",
            "",
            "\1\u0496",
            "",
            "",
            "\1\u0497",
            "",
            "\1\u0498",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\1\u049a",
            "\1\u049b",
            "\1\u049c",
            "",
            "\1\u049d",
            "\1\u049e",
            "\1\u049f",
            "",
            "\1\u04a0",
            "\1\u04a1",
            "",
            "\1\u04a2",
            "",
            "\1\u04a3",
            "\1\u04a4",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04a6",
            "\1\u04a7",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u04ab",
            "",
            "",
            "\1\u04ac",
            "\1\u04ad",
            "\1\u04ae",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u04b0",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04b3",
            "\1\u04b4",
            "\1\u04b5",
            "\1\u04b6",
            "\1\u04b7",
            "\12\64\7\uffff\4\64\1\u04b8\15\64\1\u04b9\7\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04bf",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04c2",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04c5",
            "",
            "\1\u04c6",
            "",
            "\1\u04c7",
            "\1\u04c8",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04ca",
            "\1\u04cb",
            "\12\64\7\uffff\22\64\1\u04cc\7\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04ce",
            "\1\u04cf",
            "\1\u04d0",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04d2",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04d4",
            "\1\u04d5",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\1\u04d7",
            "\1\u04d8",
            "\1\u04d9",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04db",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u04dd",
            "\1\u04de",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04e1",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u04e4\17\uffff\1\u04e3",
            "\12\64\7\uffff\22\64\1\u04e5\7\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04e8",
            "\1\u04e9",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04eb",
            "",
            "",
            "",
            "\1\u04ec",
            "\1\u04ed",
            "\1\u04ee",
            "\1\u04ef",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04f1",
            "\1\u04f2",
            "",
            "\1\u04f3",
            "\1\u04f4",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04f6",
            "\1\u04f7",
            "\1\u04f8",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u04fb",
            "\1\u04fc",
            "\1\u04fd",
            "",
            "\1\u04fe",
            "\1\u04ff",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0501",
            "\1\u0502",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0504",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0507",
            "\1\u0508",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u050a",
            "\1\u050b",
            "",
            "",
            "",
            "",
            "",
            "\1\u050c",
            "",
            "",
            "\12\64\7\uffff\15\64\1\u050d\14\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0510",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0512",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0514",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0516",
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
            "\12\64\7\uffff\11\64\1\u051e\20\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "\1\u0520",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0522",
            "",
            "",
            "\1\u0523",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0525",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u0527",
            "\1\u0528",
            "",
            "",
            "\1\u0529",
            "\1\u052a",
            "\1\u052b",
            "\1\u052c",
            "",
            "\1\u052d",
            "\1\u052e",
            "\1\u052f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0533",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0535",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\4\64\1\u0538\15\64\1\u0537\7\64\4\uffff\1\64"+
            "\1\uffff\32\64",
            "\1\u053a",
            "",
            "\1\u053b",
            "\1\u053c",
            "",
            "\1\u053d",
            "",
            "",
            "\1\u053e",
            "\1\u053f",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0541",
            "\1\u0542",
            "\1\u0543",
            "",
            "",
            "\1\u0544",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0546",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
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
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0550",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
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
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u055d",
            "",
            "\1\u055e",
            "\1\u055f",
            "\1\u0560",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0562",
            "\1\u0563",
            "",
            "\1\u0564",
            "\1\u0565",
            "\1\u0566",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
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
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
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
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0579",
            "\1\u057a",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u057c",
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
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0588",
            "\1\u0589",
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
            "",
            "\1\u0594",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
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
            "\1\u0599",
            "",
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
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_362 = input.LA(1);

                        s = -1;
                        if ( (LA24_362=='\'') ) {s = 166;}

                        else if ( ((LA24_362 >= '\u0000' && LA24_362 <= '&')||(LA24_362 >= '(' && LA24_362 <= '[')||(LA24_362 >= ']' && LA24_362 <= '\uFFFF')) ) {s = 164;}

                        else if ( (LA24_362=='\\') ) {s = 165;}

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA24_164 = input.LA(1);

                        s = -1;
                        if ( (LA24_164=='\'') ) {s = 166;}

                        else if ( ((LA24_164 >= '\u0000' && LA24_164 <= '&')||(LA24_164 >= '(' && LA24_164 <= '[')||(LA24_164 >= ']' && LA24_164 <= '\uFFFF')) ) {s = 164;}

                        else if ( (LA24_164=='\\') ) {s = 165;}

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA24_168 = input.LA(1);

                        s = -1;
                        if ( ((LA24_168 >= '\u0000' && LA24_168 <= '\uFFFF')) ) {s = 364;}

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA24_165 = input.LA(1);

                        s = -1;
                        if ( ((LA24_165 >= '\u0000' && LA24_165 <= '\uFFFF')) ) {s = 362;}

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA24_364 = input.LA(1);

                        s = -1;
                        if ( (LA24_364=='\"') ) {s = 169;}

                        else if ( ((LA24_364 >= '\u0000' && LA24_364 <= '!')||(LA24_364 >= '#' && LA24_364 <= '[')||(LA24_364 >= ']' && LA24_364 <= '\uFFFF')) ) {s = 167;}

                        else if ( (LA24_364=='\\') ) {s = 168;}

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA24_167 = input.LA(1);

                        s = -1;
                        if ( (LA24_167=='\"') ) {s = 169;}

                        else if ( ((LA24_167 >= '\u0000' && LA24_167 <= '!')||(LA24_167 >= '#' && LA24_167 <= '[')||(LA24_167 >= ']' && LA24_167 <= '\uFFFF')) ) {s = 167;}

                        else if ( (LA24_167=='\\') ) {s = 168;}

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA24_49 = input.LA(1);

                        s = -1;
                        if ( ((LA24_49 >= '\u0000' && LA24_49 <= '!')||(LA24_49 >= '#' && LA24_49 <= '[')||(LA24_49 >= ']' && LA24_49 <= '\uFFFF')) ) {s = 167;}

                        else if ( (LA24_49=='\\') ) {s = 168;}

                        else if ( (LA24_49=='\"') ) {s = 169;}

                        if ( s>=0 ) return s;
                        break;

                    case 7 : 
                        int LA24_48 = input.LA(1);

                        s = -1;
                        if ( ((LA24_48 >= '\u0000' && LA24_48 <= '&')||(LA24_48 >= '(' && LA24_48 <= '[')||(LA24_48 >= ']' && LA24_48 <= '\uFFFF')) ) {s = 164;}

                        else if ( (LA24_48=='\\') ) {s = 165;}

                        else if ( (LA24_48=='\'') ) {s = 166;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}