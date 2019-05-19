/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package dev.blachut.svelte.lang;

import java.util.*;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static dev.blachut.svelte.lang.psi.SvelteTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Svelte.flex</tt>
 */
public class _SvelteLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int VERBATIM_COMMENT = 2;
  public static final int VERBATIM_HTML = 4;
  public static final int HTML_TAG = 6;
  public static final int TAG_STRING = 8;
  public static final int SVELTE_INTERPOLATION = 10;
  public static final int SVELTE_TAG_PRE = 12;
  public static final int SVELTE_TAG = 14;
  public static final int SVELTE_TAG_PAREN_AWARE = 16;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8, 8
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\5\1\22\0\1\1\1\3\1\36\1\17\3\0\1\35\1\31\1\32\2\0\1\30\1\4\1\0\1\21"+
    "\12\27\1\20\1\0\1\2\1\0\1\34\2\0\32\27\6\0\1\23\1\27\1\6\1\27\1\15\1\22\1"+
    "\27\1\24\1\10\2\27\1\14\1\27\1\26\1\27\1\11\1\27\1\7\1\5\1\12\2\27\1\25\1"+
    "\27\1\13\1\27\1\16\1\0\1\33\7\0\1\1\32\0\1\1\337\0\1\1\177\0\13\1\35\0\2\1"+
    "\5\0\1\1\57\0\1\1\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\4\2\1\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\6\16"+
    "\1\17\3\12\1\20\1\21\1\22\3\0\1\23\1\24"+
    "\1\25\2\0\1\16\1\26\4\16\1\27\1\0\1\30"+
    "\4\0\5\16\1\0\1\31\4\0\1\16\1\32\1\33"+
    "\1\34\1\16\1\35\4\0\1\36\1\37\1\0\1\40"+
    "\3\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[86];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\37\0\76\0\135\0\174\0\233\0\272\0\331"+
    "\0\370\0\u0117\0\u0136\0\u0155\0\u0174\0\u0193\0\u01b2\0\u0117"+
    "\0\u0117\0\u0117\0\u0117\0\u0117\0\u0117\0\u0117\0\u0117\0\u01d1"+
    "\0\u01f0\0\u020f\0\u022e\0\u024d\0\u026c\0\u028b\0\u02aa\0\u02c9"+
    "\0\u02e8\0\u0307\0\u0117\0\u0117\0\u0117\0\u0326\0\u0345\0\u0174"+
    "\0\u0117\0\u0117\0\u0117\0\u0364\0\u0383\0\u03a2\0\u01f0\0\u03c1"+
    "\0\u03e0\0\u03ff\0\u041e\0\u0117\0\u043d\0\u0117\0\u045c\0\u047b"+
    "\0\u049a\0\u04b9\0\u04d8\0\u04f7\0\u0516\0\u0535\0\u0554\0\u0573"+
    "\0\u0117\0\u0592\0\u05b1\0\u05d0\0\u05ef\0\u060e\0\u01f0\0\u01f0"+
    "\0\u01f0\0\u062d\0\u0117\0\u064c\0\u066b\0\u068a\0\u06a9\0\u01f0"+
    "\0\u01f0\0\u06c8\0\u0117\0\u06e7\0\u0706\0\u0725";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[86];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\12\1\13\1\14\13\12\1\15\24\12\1\16\34\12"+
    "\1\17\70\12\1\20\1\21\1\22\35\12\1\23\1\24"+
    "\16\25\1\26\14\25\1\27\3\25\1\12\1\30\3\12"+
    "\1\31\1\32\1\31\1\33\1\31\1\34\2\31\1\35"+
    "\4\12\1\31\1\36\4\31\7\12\1\25\1\37\6\25"+
    "\1\40\1\25\1\41\3\25\1\26\4\25\1\42\4\25"+
    "\1\43\2\25\1\27\4\25\1\37\6\25\1\40\1\25"+
    "\1\41\3\25\1\26\4\25\1\42\4\25\1\43\1\44"+
    "\1\45\1\27\3\25\40\0\1\13\40\0\1\46\1\0"+
    "\1\47\32\0\1\50\15\0\1\51\1\52\1\53\21\0"+
    "\1\54\53\0\1\55\16\0\1\30\42\0\11\31\4\0"+
    "\6\31\14\0\11\31\4\0\1\31\1\56\4\31\14\0"+
    "\11\31\4\0\1\57\5\31\14\0\11\31\4\0\2\31"+
    "\1\60\3\31\14\0\7\31\1\61\1\31\4\0\1\31"+
    "\1\62\4\31\14\0\11\31\4\0\3\31\1\63\2\31"+
    "\10\0\1\37\57\0\1\64\40\0\1\65\17\0\1\66"+
    "\35\0\1\67\40\0\1\70\3\0\1\71\60\0\1\20"+
    "\7\0\1\72\36\0\5\31\1\73\3\31\4\0\6\31"+
    "\14\0\10\31\1\74\4\0\6\31\14\0\1\75\10\31"+
    "\4\0\6\31\14\0\1\31\1\76\7\31\4\0\6\31"+
    "\14\0\11\31\4\0\1\31\1\77\4\31\24\0\1\100"+
    "\25\0\1\101\41\0\1\102\42\0\1\103\31\0\1\104"+
    "\3\0\1\105\31\0\1\31\1\106\7\31\4\0\6\31"+
    "\14\0\11\31\4\0\4\31\1\107\1\31\14\0\10\31"+
    "\1\110\4\0\6\31\14\0\11\31\4\0\2\31\1\111"+
    "\3\31\14\0\3\31\1\112\5\31\4\0\6\31\35\0"+
    "\1\113\20\0\1\114\42\0\1\115\31\0\1\116\42\0"+
    "\1\117\30\0\11\31\4\0\2\31\1\120\3\31\14\0"+
    "\5\31\1\121\3\31\4\0\6\31\20\0\1\122\42\0"+
    "\1\123\31\0\1\124\42\0\1\125\34\0\1\123\35\0"+
    "\1\126\42\0\1\54\33\0\1\54\24\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1860];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\11\0\1\11\5\1\10\11\13\1\3\11\3\0\3\11"+
    "\2\0\6\1\1\11\1\0\1\11\4\0\5\1\1\0"+
    "\1\11\4\0\5\1\1\11\4\0\2\1\1\0\1\11"+
    "\3\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[86];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private char quote;
  private int leftBraceCount;
  private int leftParenCount;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _SvelteLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
      leftBraceCount = 0;
  leftParenCount = 0;

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return HTML_FRAGMENT;
            } 
            // fall through
          case 33: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 34: break;
          case 3: 
            { yybegin(HTML_TAG); return HTML_FRAGMENT;
            } 
            // fall through
          case 35: break;
          case 4: 
            { yybegin(SVELTE_INTERPOLATION); return START_MUSTACHE;
            } 
            // fall through
          case 36: break;
          case 5: 
            { yybegin(YYINITIAL); return HTML_FRAGMENT;
            } 
            // fall through
          case 37: break;
          case 6: 
            { yybegin(TAG_STRING); quote = '\''; return HTML_FRAGMENT;
            } 
            // fall through
          case 38: break;
          case 7: 
            { yybegin(TAG_STRING); quote = '"'; return HTML_FRAGMENT;
            } 
            // fall through
          case 39: break;
          case 8: 
            { if (quote == '\'') yybegin(HTML_TAG); return HTML_FRAGMENT;
            } 
            // fall through
          case 40: break;
          case 9: 
            { if (quote == '"') yybegin(HTML_TAG); return HTML_FRAGMENT;
            } 
            // fall through
          case 41: break;
          case 10: 
            { return CODE_FRAGMENT;
            } 
            // fall through
          case 42: break;
          case 11: 
            { leftBraceCount += 1; return CODE_FRAGMENT;
            } 
            // fall through
          case 43: break;
          case 12: 
            { if (leftBraceCount == 0) { yybegin(YYINITIAL); return END_MUSTACHE; } else { leftBraceCount -= 1; return CODE_FRAGMENT; }
            } 
            // fall through
          case 44: break;
          case 13: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 45: break;
          case 14: 
            { yybegin(SVELTE_TAG); return BAD_CHARACTER;
            } 
            // fall through
          case 46: break;
          case 15: 
            { if (leftBraceCount == 0) { return WHITE_SPACE; } else { return CODE_FRAGMENT; }
            } 
            // fall through
          case 47: break;
          case 16: 
            { if (leftBraceCount == 0) { return COMMA; } else { return CODE_FRAGMENT; }
            } 
            // fall through
          case 48: break;
          case 17: 
            { leftParenCount += 1; if (leftParenCount == 1) { return START_PAREN; } else { return CODE_FRAGMENT; }
            } 
            // fall through
          case 49: break;
          case 18: 
            { leftParenCount -= 1; if (leftParenCount == 0) { return END_PAREN; } else { return CODE_FRAGMENT; }
            } 
            // fall through
          case 50: break;
          case 19: 
            { yybegin(SVELTE_TAG_PRE); return START_OPENING_MUSTACHE;
            } 
            // fall through
          case 51: break;
          case 20: 
            { yybegin(SVELTE_TAG_PRE); return START_INNER_MUSTACHE;
            } 
            // fall through
          case 52: break;
          case 21: 
            { yybegin(SVELTE_TAG_PRE); return START_CLOSING_MUSTACHE;
            } 
            // fall through
          case 53: break;
          case 22: 
            { yybegin(SVELTE_TAG); return IF;
            } 
            // fall through
          case 54: break;
          case 23: 
            { return IF;
            } 
            // fall through
          case 55: break;
          case 24: 
            { yybegin(SVELTE_TAG_PAREN_AWARE); return AS;
            } 
            // fall through
          case 56: break;
          case 25: 
            { yybegin(VERBATIM_COMMENT); return HTML_FRAGMENT;
            } 
            // fall through
          case 57: break;
          case 26: 
            { yybegin(SVELTE_TAG); return THEN;
            } 
            // fall through
          case 58: break;
          case 27: 
            { yybegin(SVELTE_TAG); return ELSE;
            } 
            // fall through
          case 59: break;
          case 28: 
            { yybegin(SVELTE_TAG); return EACH;
            } 
            // fall through
          case 60: break;
          case 29: 
            { return THEN;
            } 
            // fall through
          case 61: break;
          case 30: 
            { yybegin(SVELTE_TAG); return CATCH;
            } 
            // fall through
          case 62: break;
          case 31: 
            { yybegin(SVELTE_TAG); return AWAIT;
            } 
            // fall through
          case 63: break;
          case 32: 
            { yybegin(VERBATIM_HTML); return HTML_FRAGMENT;
            } 
            // fall through
          case 64: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
