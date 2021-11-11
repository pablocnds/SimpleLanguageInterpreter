package interpreter;

import java_cup.runtime.*;

import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.lang.Math;
import java.util.*;

import interpreter.*;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20141204 (SVN rev 60) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\115\000\002\002\003\000\002\002\004\000\002\002" +
    "\003\000\002\006\002\000\002\003\004\000\002\003\003" +
    "\000\002\004\003\000\002\004\003\000\002\004\003\000" +
    "\002\004\003\000\002\004\003\000\002\004\005\000\002" +
    "\011\014\000\002\010\007\000\002\013\005\000\002\013" +
    "\004\000\002\005\003\000\002\005\003\000\002\005\003" +
    "\000\002\005\003\000\002\005\003\000\002\007\004\000" +
    "\002\015\006\000\002\015\004\000\002\015\004\000\002" +
    "\015\006\000\002\014\003\000\002\014\003\000\002\014" +
    "\003\000\002\014\003\000\002\012\006\000\002\012\004" +
    "\000\002\017\004\000\002\017\004\000\002\017\004\000" +
    "\002\020\005\000\002\020\007\000\002\020\005\000\002" +
    "\022\005\000\002\022\003\000\002\023\003\000\002\023" +
    "\003\000\002\024\007\000\002\024\011\000\002\025\006" +
    "\000\002\016\003\000\002\026\005\000\002\026\003\000" +
    "\002\030\005\000\002\030\003\000\002\027\004\000\002" +
    "\027\003\000\002\031\003\000\002\032\005\000\002\032" +
    "\003\000\002\033\005\000\002\033\003\000\002\035\003" +
    "\000\002\035\005\000\002\036\003\000\002\036\003\000" +
    "\002\036\003\000\002\036\003\000\002\036\003\000\002" +
    "\036\005\000\002\021\006\000\002\037\003\000\002\037" +
    "\003\000\002\040\003\000\002\040\003\000\002\040\003" +
    "\000\002\040\003\000\002\040\003\000\002\041\003\000" +
    "\002\041\003\000\002\042\003\000\002\042\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\201\000\044\002\ufffe\006\040\010\044\020\015\030" +
    "\023\034\042\036\041\040\030\041\034\042\020\043\006" +
    "\044\016\045\012\046\017\047\026\050\007\051\033\001" +
    "\002\000\056\004\uffd4\006\uffd4\007\uffd4\010\uffd4\013\uffd4" +
    "\020\uffd4\021\202\022\200\030\uffd4\031\uffd4\034\uffd4\036" +
    "\uffd4\040\uffd4\041\uffd4\042\uffd4\043\uffd4\044\uffd4\045\uffd4" +
    "\046\uffd4\047\uffd4\050\uffd4\051\uffd4\001\002\000\054\002" +
    "\ufffa\006\ufffa\010\ufffa\011\ufffa\020\ufffa\030\ufffa\032\ufffa" +
    "\033\ufffa\034\ufffa\035\ufffa\036\ufffa\040\ufffa\041\ufffa\042" +
    "\ufffa\043\ufffa\044\ufffa\045\ufffa\046\ufffa\047\ufffa\050\ufffa" +
    "\051\ufffa\001\002\000\004\051\uffe4\001\002\000\100\004" +
    "\uffc3\006\uffc3\007\uffc3\010\uffc3\013\uffc3\014\uffc3\015\uffc3" +
    "\016\uffc3\017\uffc3\020\uffc3\021\uffc3\022\uffc3\023\uffc3\024" +
    "\uffc3\025\uffc3\026\uffc3\027\uffc3\030\uffc3\031\uffc3\034\uffc3" +
    "\036\uffc3\040\uffc3\041\uffc3\042\uffc3\043\uffc3\044\uffc3\045" +
    "\uffc3\046\uffc3\047\uffc3\050\uffc3\051\uffc3\001\002\000\004" +
    "\004\177\001\002\000\004\002\176\001\002\000\100\004" +
    "\uffc6\006\uffc6\007\uffc6\010\uffc6\013\uffc6\014\uffc6\015\uffc6" +
    "\016\uffc6\017\uffc6\020\uffc6\021\uffc6\022\uffc6\023\uffc6\024" +
    "\uffc6\025\uffc6\026\uffc6\027\uffc6\030\uffc6\031\uffc6\034\uffc6" +
    "\036\uffc6\040\uffc6\041\uffc6\042\uffc6\043\uffc6\044\uffc6\045" +
    "\uffc6\046\uffc6\047\uffc6\050\uffc6\051\uffc6\001\002\000\054" +
    "\002\ufff8\006\ufff8\010\ufff8\011\ufff8\020\ufff8\030\ufff8\032" +
    "\ufff8\033\ufff8\034\ufff8\035\ufff8\036\ufff8\040\ufff8\041\ufff8" +
    "\042\ufff8\043\ufff8\044\ufff8\045\ufff8\046\ufff8\047\ufff8\050" +
    "\ufff8\051\ufff8\001\002\000\004\051\172\001\002\000\016" +
    "\006\040\045\012\046\017\047\026\050\007\051\060\001" +
    "\002\000\004\051\161\001\002\000\100\004\uffc5\006\uffc5" +
    "\007\uffc5\010\uffc5\013\uffc5\014\uffc5\015\uffc5\016\uffc5\017" +
    "\uffc5\020\uffc5\021\uffc5\022\uffc5\023\uffc5\024\uffc5\025\uffc5" +
    "\026\uffc5\027\uffc5\030\uffc5\031\uffc5\034\uffc5\036\uffc5\040" +
    "\uffc5\041\uffc5\042\uffc5\043\uffc5\044\uffc5\045\uffc5\046\uffc5" +
    "\047\uffc5\050\uffc5\051\uffc5\001\002\000\004\051\uffe5\001" +
    "\002\000\004\004\160\001\002\000\100\004\uffc9\006\uffc9" +
    "\007\uffc9\010\uffc9\013\uffc9\014\uffc9\015\uffc9\016\uffc9\017" +
    "\uffc9\020\uffc9\021\uffc9\022\uffc9\023\uffc9\024\uffc9\025\uffc9" +
    "\026\uffc9\027\uffc9\030\uffc9\031\uffc9\034\uffc9\036\uffc9\040" +
    "\uffc9\041\uffc9\042\uffc9\043\uffc9\044\uffc9\045\uffc9\046\uffc9" +
    "\047\uffc9\050\uffc9\051\uffc9\001\002\000\020\006\040\020" +
    "\015\045\012\046\017\047\026\050\007\051\060\001\002" +
    "\000\054\002\uffd8\006\uffd8\010\uffd8\011\uffd8\020\uffd8\030" +
    "\uffd8\032\uffd8\033\uffd8\034\uffd8\035\uffd8\036\uffd8\040\uffd8" +
    "\041\uffd8\042\uffd8\043\uffd8\044\uffd8\045\uffd8\046\uffd8\047" +
    "\uffd8\050\uffd8\051\uffd8\001\002\000\100\004\uffcb\006\uffcb" +
    "\007\uffcb\010\uffcb\013\uffcb\014\uffcb\015\uffcb\016\147\017" +
    "\145\020\uffcb\021\uffcb\022\uffcb\023\uffcb\024\uffcb\025\uffcb" +
    "\026\uffcb\027\uffcb\030\uffcb\031\uffcb\034\uffcb\036\uffcb\040" +
    "\uffcb\041\uffcb\042\uffcb\043\uffcb\044\uffcb\045\uffcb\046\uffcb" +
    "\047\uffcb\050\uffcb\051\uffcb\001\002\000\100\004\uffc4\006" +
    "\uffc4\007\uffc4\010\uffc4\013\uffc4\014\uffc4\015\uffc4\016\uffc4" +
    "\017\uffc4\020\uffc4\021\uffc4\022\uffc4\023\uffc4\024\uffc4\025" +
    "\uffc4\026\uffc4\027\uffc4\030\uffc4\031\uffc4\034\uffc4\036\uffc4" +
    "\040\uffc4\041\uffc4\042\uffc4\043\uffc4\044\uffc4\045\uffc4\046" +
    "\uffc4\047\uffc4\050\uffc4\051\uffc4\001\002\000\074\004\uffcd" +
    "\006\uffcd\007\uffcd\010\uffcd\013\uffcd\014\141\015\142\020" +
    "\uffcd\021\uffcd\022\uffcd\023\uffcd\024\uffcd\025\uffcd\026\uffcd" +
    "\027\uffcd\030\uffcd\031\uffcd\034\uffcd\036\uffcd\040\uffcd\041" +
    "\uffcd\042\uffcd\043\uffcd\044\uffcd\045\uffcd\046\uffcd\047\uffcd" +
    "\050\uffcd\051\uffcd\001\002\000\004\051\uffe7\001\002\000" +
    "\004\004\140\001\002\000\056\004\uffd2\006\uffd2\007\uffd2" +
    "\010\uffd2\013\uffd2\020\uffd2\021\uffd2\022\uffd2\030\uffd2\031" +
    "\uffd2\034\uffd2\036\uffd2\040\uffd2\041\uffd2\042\uffd2\043\uffd2" +
    "\044\uffd2\045\uffd2\046\uffd2\047\uffd2\050\uffd2\051\uffd2\001" +
    "\002\000\042\004\uffc2\005\124\006\122\012\123\014\uffc2" +
    "\015\uffc2\016\uffc2\017\uffc2\021\uffc2\022\uffc2\023\uffc2\024" +
    "\uffc2\025\uffc2\026\uffc2\027\uffc2\051\121\001\002\000\004" +
    "\051\uffe6\001\002\000\054\002\uffd9\006\uffd9\010\uffd9\011" +
    "\uffd9\020\uffd9\030\uffd9\032\uffd9\033\uffd9\034\uffd9\035\uffd9" +
    "\036\uffd9\040\uffd9\041\uffd9\042\uffd9\043\uffd9\044\uffd9\045" +
    "\uffd9\046\uffd9\047\uffd9\050\uffd9\051\uffd9\001\002\000\070" +
    "\004\uffd0\006\uffd0\007\uffd0\010\uffd0\013\uffd0\020\uffd0\021" +
    "\uffd0\022\uffd0\023\115\024\114\025\112\026\113\027\116" +
    "\030\uffd0\031\uffd0\034\uffd0\036\uffd0\040\uffd0\041\uffd0\042" +
    "\uffd0\043\uffd0\044\uffd0\045\uffd0\046\uffd0\047\uffd0\050\uffd0" +
    "\051\uffd0\001\002\000\070\004\uffce\006\uffce\007\uffce\010" +
    "\uffce\013\uffce\020\uffce\021\uffce\022\uffce\023\uffce\024\uffce" +
    "\025\uffce\026\uffce\027\uffce\030\uffce\031\uffce\034\uffce\036" +
    "\uffce\040\uffce\041\uffce\042\uffce\043\uffce\044\uffce\045\uffce" +
    "\046\uffce\047\uffce\050\uffce\051\uffce\001\002\000\020\006" +
    "\040\020\015\045\012\046\017\047\026\050\007\051\060" +
    "\001\002\000\004\051\066\001\002\000\020\006\040\020" +
    "\015\045\012\046\017\047\026\050\007\051\060\001\002" +
    "\000\100\004\uffc8\006\uffc8\007\uffc8\010\uffc8\013\uffc8\014" +
    "\uffc8\015\uffc8\016\uffc8\017\uffc8\020\uffc8\021\uffc8\022\uffc8" +
    "\023\uffc8\024\uffc8\025\uffc8\026\uffc8\027\uffc8\030\uffc8\031" +
    "\uffc8\034\uffc8\036\uffc8\040\uffc8\041\uffc8\042\uffc8\043\uffc8" +
    "\044\uffc8\045\uffc8\046\uffc8\047\uffc8\050\uffc8\051\uffc8\001" +
    "\002\000\042\006\040\010\044\020\015\030\023\034\042" +
    "\036\041\040\030\041\034\042\020\043\006\044\016\045" +
    "\012\046\017\047\026\050\007\051\033\001\002\000\054" +
    "\002\ufffc\006\ufffc\010\ufffc\011\ufffc\020\ufffc\030\ufffc\032" +
    "\ufffc\033\ufffc\034\ufffc\035\ufffc\036\ufffc\040\ufffc\041\ufffc" +
    "\042\ufffc\043\ufffc\044\ufffc\045\ufffc\046\ufffc\047\ufffc\050" +
    "\ufffc\051\ufffc\001\002\000\054\002\ufff7\006\ufff7\010\ufff7" +
    "\011\ufff7\020\ufff7\030\ufff7\032\ufff7\033\ufff7\034\ufff7\035" +
    "\ufff7\036\ufff7\040\ufff7\041\ufff7\042\ufff7\043\ufff7\044\ufff7" +
    "\045\ufff7\046\ufff7\047\ufff7\050\ufff7\051\ufff7\001\002\000" +
    "\004\002\uffff\001\002\000\004\004\055\001\002\000\054" +
    "\002\ufff9\006\ufff9\010\ufff9\011\ufff9\020\ufff9\030\ufff9\032" +
    "\ufff9\033\ufff9\034\ufff9\035\ufff9\036\ufff9\040\ufff9\041\ufff9" +
    "\042\ufff9\043\ufff9\044\ufff9\045\ufff9\046\ufff9\047\ufff9\050" +
    "\ufff9\051\ufff9\001\002\000\054\002\ufffb\006\ufffb\010\ufffb" +
    "\011\ufffb\020\ufffb\030\ufffb\032\ufffb\033\ufffb\034\ufffb\035" +
    "\ufffb\036\ufffb\040\ufffb\041\ufffb\042\ufffb\043\ufffb\044\ufffb" +
    "\045\ufffb\046\ufffb\047\ufffb\050\ufffb\051\ufffb\001\002\000" +
    "\044\002\001\006\040\010\044\020\015\030\023\034\042" +
    "\036\041\040\030\041\034\042\020\043\006\044\016\045" +
    "\012\046\017\047\026\050\007\051\033\001\002\000\054" +
    "\002\ufffd\006\ufffd\010\ufffd\011\ufffd\020\ufffd\030\ufffd\032" +
    "\ufffd\033\ufffd\034\ufffd\035\ufffd\036\ufffd\040\ufffd\041\ufffd" +
    "\042\ufffd\043\ufffd\044\ufffd\045\ufffd\046\ufffd\047\ufffd\050" +
    "\ufffd\051\ufffd\001\002\000\054\002\uffe1\006\uffe1\010\uffe1" +
    "\011\uffe1\020\uffe1\030\uffe1\032\uffe1\033\uffe1\034\uffe1\035" +
    "\uffe1\036\uffe1\040\uffe1\041\uffe1\042\uffe1\043\uffe1\044\uffe1" +
    "\045\uffe1\046\uffe1\047\uffe1\050\uffe1\051\uffe1\001\002\000" +
    "\044\006\040\010\044\011\057\020\015\030\023\034\042" +
    "\036\041\040\030\041\034\042\020\043\006\044\016\045" +
    "\012\046\017\047\026\050\007\051\033\001\002\000\054" +
    "\002\ufff6\006\ufff6\010\ufff6\011\ufff6\020\ufff6\030\ufff6\032" +
    "\ufff6\033\ufff6\034\ufff6\035\ufff6\036\ufff6\040\ufff6\041\ufff6" +
    "\042\ufff6\043\ufff6\044\ufff6\045\ufff6\046\ufff6\047\ufff6\050" +
    "\ufff6\051\ufff6\001\002\000\102\004\uffc2\006\uffc2\007\uffc2" +
    "\010\uffc2\012\064\013\uffc2\014\uffc2\015\uffc2\016\uffc2\017" +
    "\uffc2\020\uffc2\021\uffc2\022\uffc2\023\uffc2\024\uffc2\025\uffc2" +
    "\026\uffc2\027\uffc2\030\uffc2\031\uffc2\034\uffc2\036\uffc2\040" +
    "\uffc2\041\uffc2\042\uffc2\043\uffc2\044\uffc2\045\uffc2\046\uffc2" +
    "\047\uffc2\050\uffc2\051\uffc2\001\002\000\042\006\040\010" +
    "\044\020\015\030\023\034\042\036\041\040\030\041\034" +
    "\042\020\043\006\044\016\045\012\046\017\047\026\050" +
    "\007\051\033\001\002\000\044\006\040\010\044\020\015" +
    "\030\023\034\042\035\063\036\041\040\030\041\034\042" +
    "\020\043\006\044\016\045\012\046\017\047\026\050\007" +
    "\051\033\001\002\000\054\002\uffd5\006\uffd5\010\uffd5\011" +
    "\uffd5\020\uffd5\030\uffd5\032\uffd5\033\uffd5\034\uffd5\035\uffd5" +
    "\036\uffd5\040\uffd5\041\uffd5\042\uffd5\043\uffd5\044\uffd5\045" +
    "\uffd5\046\uffd5\047\uffd5\050\uffd5\051\uffd5\001\002\000\004" +
    "\051\065\001\002\000\100\004\uffc1\006\uffc1\007\uffc1\010" +
    "\uffc1\013\uffc1\014\uffc1\015\uffc1\016\uffc1\017\uffc1\020\uffc1" +
    "\021\uffc1\022\uffc1\023\uffc1\024\uffc1\025\uffc1\026\uffc1\027" +
    "\uffc1\030\uffc1\031\uffc1\034\uffc1\036\uffc1\040\uffc1\041\uffc1" +
    "\042\uffc1\043\uffc1\044\uffc1\045\uffc1\046\uffc1\047\uffc1\050" +
    "\uffc1\051\uffc1\001\002\000\004\006\067\001\002\000\014" +
    "\040\070\041\071\042\074\043\076\044\072\001\002\000" +
    "\006\010\ufff1\051\ufff1\001\002\000\006\010\ufff0\051\ufff0" +
    "\001\002\000\006\010\uffed\051\uffed\001\002\000\004\051" +
    "\105\001\002\000\006\010\uffef\051\uffef\001\002\000\004" +
    "\007\077\001\002\000\006\010\uffee\051\uffee\001\002\000" +
    "\004\037\100\001\002\000\014\040\070\041\071\042\074" +
    "\043\076\044\072\001\002\000\004\010\102\001\002\000" +
    "\042\006\040\010\044\020\015\030\023\034\042\036\041" +
    "\040\030\041\034\042\020\043\006\044\016\045\012\046" +
    "\017\047\026\050\007\051\033\001\002\000\044\006\040" +
    "\010\044\011\104\020\015\030\023\034\042\036\041\040" +
    "\030\041\034\042\020\043\006\044\016\045\012\046\017" +
    "\047\026\050\007\051\033\001\002\000\054\002\ufff5\006" +
    "\ufff5\010\ufff5\011\ufff5\020\ufff5\030\ufff5\032\ufff5\033\ufff5" +
    "\034\ufff5\035\ufff5\036\ufff5\040\ufff5\041\ufff5\042\ufff5\043" +
    "\ufff5\044\ufff5\045\ufff5\046\ufff5\047\ufff5\050\ufff5\051\ufff5" +
    "\001\002\000\006\007\uffe2\013\106\001\002\000\014\040" +
    "\070\041\071\042\074\043\076\044\072\001\002\000\004" +
    "\007\uffe3\001\002\000\004\007\111\001\002\000\100\004" +
    "\uffc7\006\uffc7\007\uffc7\010\uffc7\013\uffc7\014\uffc7\015\uffc7" +
    "\016\uffc7\017\uffc7\020\uffc7\021\uffc7\022\uffc7\023\uffc7\024" +
    "\uffc7\025\uffc7\026\uffc7\027\uffc7\030\uffc7\031\uffc7\034\uffc7" +
    "\036\uffc7\040\uffc7\041\uffc7\042\uffc7\043\uffc7\044\uffc7\045" +
    "\uffc7\046\uffc7\047\uffc7\050\uffc7\051\uffc7\001\002\000\020" +
    "\006\uffb9\020\uffb9\045\uffb9\046\uffb9\047\uffb9\050\uffb9\051" +
    "\uffb9\001\002\000\020\006\uffbc\020\uffbc\045\uffbc\046\uffbc" +
    "\047\uffbc\050\uffbc\051\uffbc\001\002\000\020\006\uffbb\020" +
    "\uffbb\045\uffbb\046\uffbb\047\uffbb\050\uffbb\051\uffbb\001\002" +
    "\000\020\006\uffbd\020\uffbd\045\uffbd\046\uffbd\047\uffbd\050" +
    "\uffbd\051\uffbd\001\002\000\020\006\uffba\020\uffba\045\uffba" +
    "\046\uffba\047\uffba\050\uffba\051\uffba\001\002\000\020\006" +
    "\040\020\015\045\012\046\017\047\026\050\007\051\060" +
    "\001\002\000\056\004\uffd1\006\uffd1\007\uffd1\010\uffd1\013" +
    "\uffd1\020\uffd1\021\uffd1\022\uffd1\030\uffd1\031\uffd1\034\uffd1" +
    "\036\uffd1\040\uffd1\041\uffd1\042\uffd1\043\uffd1\044\uffd1\045" +
    "\uffd1\046\uffd1\047\uffd1\050\uffd1\051\uffd1\001\002\000\004" +
    "\004\uffe9\001\002\000\020\006\040\020\015\045\012\046" +
    "\017\047\026\050\007\051\060\001\002\000\004\051\130" +
    "\001\002\000\020\006\040\020\015\045\012\046\017\047" +
    "\026\050\007\051\125\001\002\000\036\004\uffc2\006\122" +
    "\012\064\014\uffc2\015\uffc2\016\uffc2\017\uffc2\021\uffc2\022" +
    "\uffc2\023\uffc2\024\uffc2\025\uffc2\026\uffc2\027\uffc2\001\002" +
    "\000\004\004\uffde\001\002\000\004\004\uffdc\001\002\000" +
    "\034\004\uffc1\005\131\014\uffc1\015\uffc1\016\uffc1\017\uffc1" +
    "\021\uffc1\022\uffc1\023\uffc1\024\uffc1\025\uffc1\026\uffc1\027" +
    "\uffc1\001\002\000\020\006\040\020\015\045\012\046\017" +
    "\047\026\050\007\051\060\001\002\000\004\004\uffdd\001" +
    "\002\000\006\007\136\013\135\001\002\000\006\007\uffda" +
    "\013\uffda\001\002\000\020\006\040\020\015\045\012\046" +
    "\017\047\026\050\007\051\060\001\002\000\004\004\uffc0" +
    "\001\002\000\006\007\uffdb\013\uffdb\001\002\000\054\002" +
    "\uffe0\006\uffe0\010\uffe0\011\uffe0\020\uffe0\030\uffe0\032\uffe0" +
    "\033\uffe0\034\uffe0\035\uffe0\036\uffe0\040\uffe0\041\uffe0\042" +
    "\uffe0\043\uffe0\044\uffe0\045\uffe0\046\uffe0\047\uffe0\050\uffe0" +
    "\051\uffe0\001\002\000\016\006\uffb8\045\uffb8\046\uffb8\047" +
    "\uffb8\050\uffb8\051\uffb8\001\002\000\016\006\uffb7\045\uffb7" +
    "\046\uffb7\047\uffb7\050\uffb7\051\uffb7\001\002\000\016\006" +
    "\040\045\012\046\017\047\026\050\007\051\060\001\002" +
    "\000\100\004\uffcc\006\uffcc\007\uffcc\010\uffcc\013\uffcc\014" +
    "\uffcc\015\uffcc\016\147\017\145\020\uffcc\021\uffcc\022\uffcc" +
    "\023\uffcc\024\uffcc\025\uffcc\026\uffcc\027\uffcc\030\uffcc\031" +
    "\uffcc\034\uffcc\036\uffcc\040\uffcc\041\uffcc\042\uffcc\043\uffcc" +
    "\044\uffcc\045\uffcc\046\uffcc\047\uffcc\050\uffcc\051\uffcc\001" +
    "\002\000\016\006\uffb6\045\uffb6\046\uffb6\047\uffb6\050\uffb6" +
    "\051\uffb6\001\002\000\016\006\040\045\012\046\017\047" +
    "\026\050\007\051\060\001\002\000\016\006\uffb5\045\uffb5" +
    "\046\uffb5\047\uffb5\050\uffb5\051\uffb5\001\002\000\100\004" +
    "\uffca\006\uffca\007\uffca\010\uffca\013\uffca\014\uffca\015\uffca" +
    "\016\uffca\017\uffca\020\uffca\021\uffca\022\uffca\023\uffca\024" +
    "\uffca\025\uffca\026\uffca\027\uffca\030\uffca\031\uffca\034\uffca" +
    "\036\uffca\040\uffca\041\uffca\042\uffca\043\uffca\044\uffca\045" +
    "\uffca\046\uffca\047\uffca\050\uffca\051\uffca\001\002\000\004" +
    "\031\152\001\002\000\042\006\040\010\044\020\015\030" +
    "\023\034\042\036\041\040\030\041\034\042\020\043\006" +
    "\044\016\045\012\046\017\047\026\050\007\051\033\001" +
    "\002\000\046\006\040\010\044\020\015\030\023\032\155" +
    "\033\154\034\042\036\041\040\030\041\034\042\020\043" +
    "\006\044\016\045\012\046\017\047\026\050\007\051\033" +
    "\001\002\000\054\002\uffd7\006\uffd7\010\uffd7\011\uffd7\020" +
    "\uffd7\030\uffd7\032\uffd7\033\uffd7\034\uffd7\035\uffd7\036\uffd7" +
    "\040\uffd7\041\uffd7\042\uffd7\043\uffd7\044\uffd7\045\uffd7\046" +
    "\uffd7\047\uffd7\050\uffd7\051\uffd7\001\002\000\042\006\040" +
    "\010\044\020\015\030\023\034\042\036\041\040\030\041" +
    "\034\042\020\043\006\044\016\045\012\046\017\047\026" +
    "\050\007\051\033\001\002\000\044\006\040\010\044\020" +
    "\015\030\023\033\157\034\042\036\041\040\030\041\034" +
    "\042\020\043\006\044\016\045\012\046\017\047\026\050" +
    "\007\051\033\001\002\000\054\002\uffd6\006\uffd6\010\uffd6" +
    "\011\uffd6\020\uffd6\030\uffd6\032\uffd6\033\uffd6\034\uffd6\035" +
    "\uffd6\036\uffd6\040\uffd6\041\uffd6\042\uffd6\043\uffd6\044\uffd6" +
    "\045\uffd6\046\uffd6\047\uffd6\050\uffd6\051\uffd6\001\002\000" +
    "\054\002\uffdf\006\uffdf\010\uffdf\011\uffdf\020\uffdf\030\uffdf" +
    "\032\uffdf\033\uffdf\034\uffdf\035\uffdf\036\uffdf\040\uffdf\041" +
    "\uffdf\042\uffdf\043\uffdf\044\uffdf\045\uffdf\046\uffdf\047\uffdf" +
    "\050\uffdf\051\uffdf\001\002\000\004\010\162\001\002\000" +
    "\014\040\030\041\034\042\020\043\006\051\164\001\002" +
    "\000\004\004\167\001\002\000\004\051\121\001\002\000" +
    "\004\011\166\001\002\000\054\002\ufff4\006\ufff4\010\ufff4" +
    "\011\ufff4\020\ufff4\030\ufff4\032\ufff4\033\ufff4\034\ufff4\035" +
    "\ufff4\036\ufff4\040\ufff4\041\ufff4\042\ufff4\043\ufff4\044\ufff4" +
    "\045\ufff4\046\ufff4\047\ufff4\050\ufff4\051\ufff4\001\002\000" +
    "\016\011\ufff2\040\030\041\034\042\020\043\006\051\164" +
    "\001\002\000\004\011\ufff3\001\002\000\070\004\uffcf\006" +
    "\uffcf\007\uffcf\010\uffcf\013\uffcf\020\uffcf\021\uffcf\022\uffcf" +
    "\023\uffcf\024\uffcf\025\uffcf\026\uffcf\027\uffcf\030\uffcf\031" +
    "\uffcf\034\uffcf\036\uffcf\040\uffcf\041\uffcf\042\uffcf\043\uffcf" +
    "\044\uffcf\045\uffcf\046\uffcf\047\uffcf\050\uffcf\051\uffcf\001" +
    "\002\000\006\004\uffea\005\173\001\002\000\020\006\040" +
    "\020\015\045\012\046\017\047\026\050\007\051\125\001" +
    "\002\000\004\004\uffeb\001\002\000\004\004\uffe8\001\002" +
    "\000\004\002\000\001\002\000\054\002\uffec\006\uffec\010" +
    "\uffec\011\uffec\020\uffec\030\uffec\032\uffec\033\uffec\034\uffec" +
    "\035\uffec\036\uffec\040\uffec\041\uffec\042\uffec\043\uffec\044" +
    "\uffec\045\uffec\046\uffec\047\uffec\050\uffec\051\uffec\001\002" +
    "\000\020\006\uffbf\020\uffbf\045\uffbf\046\uffbf\047\uffbf\050" +
    "\uffbf\051\uffbf\001\002\000\020\006\040\020\015\045\012" +
    "\046\017\047\026\050\007\051\060\001\002\000\020\006" +
    "\uffbe\020\uffbe\045\uffbe\046\uffbe\047\uffbe\050\uffbe\051\uffbe" +
    "\001\002\000\056\004\uffd3\006\uffd3\007\uffd3\010\uffd3\013" +
    "\uffd3\020\uffd3\021\uffd3\022\uffd3\030\uffd3\031\uffd3\034\uffd3" +
    "\036\uffd3\040\uffd3\041\uffd3\042\uffd3\043\uffd3\044\uffd3\045" +
    "\uffd3\046\uffd3\047\uffd3\050\uffd3\051\uffd3\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\201\000\062\002\010\003\052\004\044\006\046\007" +
    "\051\010\045\011\012\014\013\015\007\016\030\017\004" +
    "\020\047\021\020\023\050\024\034\025\023\026\003\027" +
    "\035\030\031\031\036\032\026\033\024\035\021\036\042" +
    "\001\001\000\004\037\200\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\014\031\170\032\026\033\024\035\021\036\042" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\024\016\150" +
    "\026\003\027\035\030\031\031\036\032\026\033\024\035" +
    "\021\036\042\001\001\000\002\001\001\000\004\042\145" +
    "\001\001\000\002\001\001\000\004\041\142\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\040" +
    "\116\001\001\000\002\001\001\000\024\016\107\026\003" +
    "\027\035\030\031\031\036\032\026\033\024\035\021\036" +
    "\042\001\001\000\002\001\001\000\024\016\060\026\003" +
    "\027\035\030\031\031\036\032\026\033\024\035\021\036" +
    "\042\001\001\000\002\001\001\000\056\003\055\004\044" +
    "\007\051\010\045\011\012\014\013\015\007\016\030\017" +
    "\004\020\047\021\020\023\050\024\034\025\023\026\003" +
    "\027\035\030\031\031\036\032\026\033\024\035\021\036" +
    "\042\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\054\004\053\007\051\010\045\011\012\014\013" +
    "\015\007\016\030\017\004\020\047\021\020\023\050\024" +
    "\034\025\023\026\003\027\035\030\031\031\036\032\026" +
    "\033\024\035\021\036\042\001\001\000\002\001\001\000" +
    "\002\001\001\000\054\004\053\007\051\010\045\011\012" +
    "\014\013\015\007\016\030\017\004\020\047\021\020\023" +
    "\050\024\034\025\023\026\003\027\035\030\031\031\036" +
    "\032\026\033\024\035\021\036\042\001\001\000\002\001" +
    "\001\000\002\001\001\000\056\003\061\004\044\007\051" +
    "\010\045\011\012\014\013\015\007\016\030\017\004\020" +
    "\047\021\020\023\050\024\034\025\023\026\003\027\035" +
    "\030\031\031\036\032\026\033\024\035\021\036\042\001" +
    "\001\000\054\004\053\007\051\010\045\011\012\014\013" +
    "\015\007\016\030\017\004\020\047\021\020\023\050\024" +
    "\034\025\023\026\003\027\035\030\031\031\036\032\026" +
    "\033\024\035\021\036\042\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\005\072\012\074\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\005\100\001\001\000\002\001\001\000\056\003\102" +
    "\004\044\007\051\010\045\011\012\014\013\015\007\016" +
    "\030\017\004\020\047\021\020\023\050\024\034\025\023" +
    "\026\003\027\035\030\031\031\036\032\026\033\024\035" +
    "\021\036\042\001\001\000\054\004\053\007\051\010\045" +
    "\011\012\014\013\015\007\016\030\017\004\020\047\021" +
    "\020\023\050\024\034\025\023\026\003\027\035\030\031" +
    "\031\036\032\026\033\024\035\021\036\042\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\005\072\012\106" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\016\027\117\031" +
    "\036\032\026\033\024\035\021\036\042\001\001\000\002" +
    "\001\001\000\002\001\001\000\026\016\133\022\132\026" +
    "\003\027\035\030\031\031\036\032\026\033\024\035\021" +
    "\036\042\001\001\000\002\001\001\000\026\016\125\021" +
    "\126\026\003\027\035\030\031\031\036\032\026\033\024" +
    "\035\021\036\042\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\024\016\131" +
    "\026\003\027\035\030\031\031\036\032\026\033\024\035" +
    "\021\036\042\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\024\016\136\026\003\027\035\030" +
    "\031\031\036\032\026\033\024\035\021\036\042\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\010\033\143\035\021" +
    "\036\042\001\001\000\004\042\145\001\001\000\002\001" +
    "\001\000\006\035\147\036\042\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\056\003\152\004" +
    "\044\007\051\010\045\011\012\014\013\015\007\016\030" +
    "\017\004\020\047\021\020\023\050\024\034\025\023\026" +
    "\003\027\035\030\031\031\036\032\026\033\024\035\021" +
    "\036\042\001\001\000\054\004\053\007\051\010\045\011" +
    "\012\014\013\015\007\016\030\017\004\020\047\021\020" +
    "\023\050\024\034\025\023\026\003\027\035\030\031\031" +
    "\036\032\026\033\024\035\021\036\042\001\001\000\002" +
    "\001\001\000\056\003\155\004\044\007\051\010\045\011" +
    "\012\014\013\015\007\016\030\017\004\020\047\021\020" +
    "\023\050\024\034\025\023\026\003\027\035\030\031\031" +
    "\036\032\026\033\024\035\021\036\042\001\001\000\054" +
    "\004\053\007\051\010\045\011\012\014\013\015\007\016" +
    "\030\017\004\020\047\021\020\023\050\024\034\025\023" +
    "\026\003\027\035\030\031\031\036\032\026\033\024\035" +
    "\021\036\042\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\010\013\164\014\013\015\162\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\010\013\167\014\013\015\162\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\026\016\173\021\174\026\003\027\035\030\031\031" +
    "\036\032\026\033\024\035\021\036\042\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\020\027\035\030\202\031\036" +
    "\032\026\033\024\035\021\036\042\001\001\000\002\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {
//@@CUPDBG1

  ComplexSymbolFactory f = new ComplexSymbolFactory();
  symbolFactory = f;
  File file = new File("input.txt");
  FileInputStream fis = null;
  try {
    fis = new FileInputStream(file);
  } catch (IOException e) {
    e.printStackTrace();
  } 
  lexer = new Lexer(f,fis);

    }

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
//@@CUPDBG2
 return lexer.next_token(); 
    }

//@@CUPDBG0

  enum OpType { 
    ADD, SUB, MUL, DIV, EQ, NEQ, GT, GE, LT, LE, OR, AND, NOT 
  }

  protected Lexer lexer;
  TypeList symbols = new TypeList();
  boolean isPrintable = true;


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // programa ::= blq_sentencias 
            {
              Object RESULT =null;
		//@@CUPDBG3
	System.out.println("-- CODE END --");	
															if (isPrintable) symbols.printVarList();
														
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("programa",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= programa EOF 
            {
              Object RESULT =null;
		Location start_valxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location start_valxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // programa ::= lambda 
            {
              Object RESULT =null;
		//@@CUPDBG4
	System.out.println("-- CODE END --");	
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("programa",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // lambda ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lambda",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // blq_sentencias ::= blq_sentencias sentencia 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("blq_sentencias",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // blq_sentencias ::= sentencia 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("blq_sentencias",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // sentencia ::= sent_decl 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sentencia",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // sentencia ::= sent_uso 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sentencia",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // sentencia ::= sent_flujo 
            {
              Object RESULT =null;
		//@@CUPDBG5
 isPrintable = false; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sentencia",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // sentencia ::= def_funcion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sentencia",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // sentencia ::= decl_struct 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sentencia",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // sentencia ::= IZQLLAVE blq_sentencias DERLLAVE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sentencia",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // def_funcion ::= FUNC IDENT IZQPAREN lista_args DERPAREN RETORNO tipos IZQLLAVE blq_sentencias DERLLAVE 
            {
              Object RESULT =null;
		Location ixleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).xleft;
		Location ixright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).xright;
		String i = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-8)).value;
		//@@CUPDBG6
	if (!symbols.newFunc(i)) report_error("[ERROR]Declaracion de simbolo \"" + i + "\" duplicada\n", null);	
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("def_funcion",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-9)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // decl_struct ::= DCLSTRUCT IDENT IZQLLAVE lista_decl DERLLAVE 
            {
              Object RESULT =null;
		Location ixleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).xleft;
		Location ixright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).xright;
		String i = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		Location lxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location lxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		ArrayList<SubSt> l = (ArrayList<SubSt>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		//@@CUPDBG7
	if (!symbols.newStruct(i)) report_error("[ERROR] Declaracion de simbolo \"" + i + "\" duplicada\n", null);	
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("decl_struct",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // lista_decl ::= decl_var SEMI lista_decl 
            {
              ArrayList<SubSt> RESULT =null;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xright;
		SubSt e = (SubSt)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Location lxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location lxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		ArrayList<SubSt> l = (ArrayList<SubSt>)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG8
	l.add(e); RESULT = l;	
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lista_decl",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // lista_decl ::= decl_var SEMI 
            {
              ArrayList<SubSt> RESULT =null;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		SubSt e = (SubSt)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		//@@CUPDBG9
	ArrayList<SubSt> list = new ArrayList<SubSt>();
														list.add(e);
														RESULT = list;
													
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lista_decl",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // tipos ::= DCLENTERO 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("tipos",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // tipos ::= DCLREAL 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("tipos",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // tipos ::= DCLBOOL 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("tipos",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // tipos ::= DCLCHAR 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("tipos",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // tipos ::= DCLSTRUCT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("tipos",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // sent_decl ::= decl_var SEMI 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sent_decl",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // decl_var ::= tipo_var IDENT ASSIGN expresion 
            {
              SubSt RESULT =null;
		Location txleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).xleft;
		Location txright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).xright;
		Type t = (Type)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		Location ixleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xleft;
		Location ixright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xright;
		String i = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Variable e = (Variable)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG10
	
					SubSt x = new SubSt(i, e.type);
					RESULT = x;
					if ( ! TypeList.checkConversion(e.type, t) ) { if ( !symbols.newVar(i, t, 0) ) report_error("[ERROR]Declaracion de simbolo \"" + i + "\" duplicada\n", null);
						report_error("[ERROR] Conversión de variables no soportada: " + e.type + " a " + t + "\n", null);
					}
					else if ( !symbols.newVar(i, t, e.value) ) report_error("[ERROR] Declaracion de simbolo \"" + i + "\" duplicada\n", null);
					RESULT = x;
				
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("decl_var",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // decl_var ::= tipo_var IDENT 
            {
              SubSt RESULT =null;
		Location txleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location txright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		Type t = (Type)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		Location ixleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location ixright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		String i = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG11
	if ( !symbols.newVar(i, t, 0) ) report_error("[ERROR] Declaracion de simbolo \"" + i + "\" duplicada\n", null);	
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("decl_var",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // decl_var ::= IDENT IDENT 
            {
              SubSt RESULT =null;
		//@@CUPDBG12
		
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("decl_var",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // decl_var ::= tipo_var IDENT ASSIGN uso_funcion 
            {
              SubSt RESULT =null;
		Location txleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).xleft;
		Location txright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).xright;
		Type t = (Type)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		Location ixleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xleft;
		Location ixright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xright;
		String i = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Location fxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location fxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Object f = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG13
		
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("decl_var",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // tipo_var ::= DCLENTERO 
            {
              Type RESULT =null;
		//@@CUPDBG14
	RESULT = Type.INT;		
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("tipo_var",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // tipo_var ::= DCLREAL 
            {
              Type RESULT =null;
		//@@CUPDBG15
	RESULT = Type.FLOAT;	
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("tipo_var",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // tipo_var ::= DCLBOOL 
            {
              Type RESULT =null;
		//@@CUPDBG16
	RESULT = Type.BOOL;		
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("tipo_var",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // tipo_var ::= DCLCHAR 
            {
              Type RESULT =null;
		//@@CUPDBG17
	RESULT = Type.CHAR;		
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("tipo_var",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // lista_args ::= tipos IDENT COMA lista_args 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lista_args",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // lista_args ::= tipos IDENT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lista_args",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // sent_uso ::= asignacion SEMI 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sent_uso",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // sent_uso ::= expresion SEMI 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sent_uso",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // sent_uso ::= uso_funcion SEMI 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sent_uso",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // asignacion ::= IDENT ASSIGN expresion 
            {
              Object RESULT =null;
		Location ixleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xleft;
		Location ixright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xright;
		String i = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Variable e = (Variable)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG18
	if ( ! symbols.varExists(i) ) report_error("[ERROR] Variable " + i + "no existe\n", null);
														else {
															if ( ! TypeList.checkConversion(e.type, symbols.getType(i)) ) {
																report_error("[ERROR] Conversión de variables no soportada: " + e.type + " a " + symbols.getType(i) + "\n", null);
															}
															else symbols.updateVar(i, e.value);	
														}
													
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("asignacion",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // asignacion ::= IDENT DOT IDENT ASSIGN expresion 
            {
              Object RESULT =null;
		Location ixleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).xleft;
		Location ixright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).xright;
		String i = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		//@@CUPDBG19
	if (!symbols.structExists(i)) report_error("[ERROR] La estructura : " + i + " no existe\n", null);	
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("asignacion",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // asignacion ::= IDENT ASSIGN uso_funcion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("asignacion",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // lista_expr ::= lista_expr COMA expresion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lista_expr",16, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // lista_expr ::= expresion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lista_expr",16, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // sent_flujo ::= condicional 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sent_flujo",17, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // sent_flujo ::= bucle 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sent_flujo",17, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // condicional ::= IF expresion THEN blq_sentencias ENDIF 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("condicional",18, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // condicional ::= IF expresion THEN blq_sentencias ELSE blq_sentencias ENDIF 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("condicional",18, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // bucle ::= WHILE expresion blq_sentencias ENDWHILE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("bucle",19, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // expresion ::= expr_log 
            {
              Variable RESULT =null;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Variable e = (Variable)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG20
	RESULT = e;	
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // expr_log ::= expr_log op_log expr_comp 
            {
              Variable RESULT =null;
		Location e1xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xleft;
		Location e1xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xright;
		Variable e1 = (Variable)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Location oxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location oxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		OpType o = (OpType)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		Location e2xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location e2xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Variable e2 = (Variable)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG21
	Type nx = Type.ERROR;
														if ( e1.type != e2.type ) { // Comprueba igualdad de tipo e intenta convertir si no
															if (TypeList.checkConversion(e1.type, e2.type)) nx = e2.type;
															else if (TypeList.checkConversion(e2.type, e1.type)) nx = e1.type;
															else report_error("[ERROR] Operación no soportada: " + e1.type + " " + o + " " + e2.type + "\n", null);
														}
														else nx = e1.type;
														if ( nx != Type.ERROR ) {
															RESULT = Variable.operate(e1, e2, Type.BOOL, o);
														}
													
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_log",20, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // expr_log ::= expr_comp 
            {
              Variable RESULT =null;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Variable e = (Variable)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG22
	RESULT = e;	
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_log",20, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // expr_comp ::= expr_not op_comp expr_not 
            {
              Variable RESULT =null;
		Location e1xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xleft;
		Location e1xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xright;
		Variable e1 = (Variable)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Location oxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location oxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		OpType o = (OpType)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		Location e2xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location e2xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Variable e2 = (Variable)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG23
	Type nx = Type.ERROR;
														if ( e1.type != e2.type ) { // Comprueba igualdad de tipo e intenta convertir si no
															if (TypeList.checkConversion(e1.type, e2.type)) nx = e2.type;
															else if (TypeList.checkConversion(e2.type, e1.type)) nx = e1.type;
															else report_error("[ERROR] Operación no soportada: " + e1.type + " " + o + " " + e2.type + "\n", null);
														}
														else nx = e1.type;
														if ( nx != Type.ERROR ) {
															RESULT = Variable.operate(e1, e2, Type.BOOL, o);
														}
													
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_comp",22, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // expr_comp ::= expr_not 
            {
              Variable RESULT =null;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Variable e = (Variable)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG24
	RESULT = e;	
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_comp",22, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // expr_not ::= NOT expr_arit 
            {
              Variable RESULT =null;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Variable e = (Variable)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG25
	if ( e.type != Type.BOOL ) { // Comprueba operacion compatible
													report_error("[ERROR] Operación no soportada: NOT " + e.type + "\n", null);
												}else {
													if ( e.getAsBoolean() ) e.value = 0;
													else e.value = 1;
													RESULT = e;
												}
											
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_not",21, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 51: // expr_not ::= expr_arit 
            {
              Variable RESULT =null;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Variable e = (Variable)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG26
	RESULT = e;	
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_not",21, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 52: // expr_arit ::= expr_a_h 
            {
              Variable RESULT =null;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Variable e = (Variable)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG27
	RESULT = e;	
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_arit",23, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 53: // expr_a_h ::= expr_a_h op_a_h expr_a_m 
            {
              Variable RESULT =null;
		Location e1xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xleft;
		Location e1xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xright;
		Variable e1 = (Variable)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Location oxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location oxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		OpType o = (OpType)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		Location e2xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location e2xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Variable e2 = (Variable)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG28
	Type nx = Type.ERROR;
														if ( e1.type != e2.type ) { // Comprueba igualdad de tipo e intenta convertir si no
															if (TypeList.checkConversion(e1.type, e2.type)) nx = e2.type;
															else if (TypeList.checkConversion(e2.type, e1.type)) nx = e1.type;
															else report_error("[ERROR] Operación no soportada: " + e1.type + " " + o + " " + e2.type + "\n", null);
														}
														else nx = e1.type;
														if ( nx != Type.ERROR ) {
															RESULT = Variable.operate(e1, e2, nx, o);
														}
													
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_a_h",24, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 54: // expr_a_h ::= expr_a_m 
            {
              Variable RESULT =null;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Variable e = (Variable)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG29
	RESULT = e;	
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_a_h",24, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 55: // expr_a_m ::= expr_a_m op_a_m expr_unit 
            {
              Variable RESULT =null;
		Location e1xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xleft;
		Location e1xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xright;
		Variable e1 = (Variable)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Location oxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location oxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		OpType o = (OpType)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		Location e2xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location e2xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Variable e2 = (Variable)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG30
	Type nx = Type.ERROR;
														if ( e1.type != e2.type ) { // Comprueba igualdad de tipo e intenta convertir si no
															if (TypeList.checkConversion(e1.type, e2.type)) nx = e2.type;
															else if (TypeList.checkConversion(e2.type, e1.type)) nx = e1.type;
															else report_error("[ERROR] Operación no soportada: " + e1.type + " " + o + " " + e2.type + "\n", null);
														}
														else nx = e1.type;
														if ( nx != Type.ERROR ) {
															RESULT = Variable.operate(e1, e2, nx, o);
														}
													
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_a_m",25, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 56: // expr_a_m ::= expr_unit 
            {
              Variable RESULT =null;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Variable e = (Variable)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG31
	RESULT = e;	
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_a_m",25, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 57: // expr_unit ::= value 
            {
              Variable RESULT =null;
		Location vxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location vxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Variable v = (Variable)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG32
	RESULT = v;	
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_unit",27, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 58: // expr_unit ::= IZQPAREN expresion DERPAREN 
            {
              Variable RESULT =null;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		Variable e = (Variable)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		//@@CUPDBG33
	RESULT = e;	
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_unit",27, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 59: // value ::= ENTERO 
            {
              Variable RESULT =null;
		Location vxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location vxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Integer v = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG34
	RESULT = new Variable(Type.INT, (int)v);		
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("value",28, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 60: // value ::= FP 
            {
              Variable RESULT =null;
		Location vxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location vxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Float v = (Float)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG35
	RESULT = new Variable(Type.FLOAT, (float)v);	
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("value",28, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 61: // value ::= BOOLEAN 
            {
              Variable RESULT =null;
		Location vxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location vxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Boolean v = (Boolean)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG36
	int val; if (v==true) val=1; else val = 0;
												RESULT = new Variable(Type.BOOL, val);
											
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("value",28, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 62: // value ::= CHAR 
            {
              Variable RESULT =null;
		Location vxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location vxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		char v = (char)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG37
	RESULT = new Variable(Type.CHAR, (byte)v);		
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("value",28, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 63: // value ::= IDENT 
            {
              Variable RESULT =null;
		Location ixleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location ixright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		String i = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG38
	RESULT = new Variable(Type.ERROR, 0);
												if (!symbols.varExists(i)) report_error("[ERROR] La estructura : " + i + " no existe\n", null);	
												else RESULT = new Variable(symbols.getType(i), symbols.getValue(i));
											
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("value",28, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 64: // value ::= IDENT DOT IDENT 
            {
              Variable RESULT =null;
		Location i1xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xleft;
		Location i1xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xright;
		String i1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Location i2xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location i2xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		String i2 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG39
	if (!symbols.structExists(i1)) report_error("[ERROR] La estructura : " + i1 + " no existe\n", null);
												RESULT = new Variable(Type.ERROR, 0); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("value",28, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 65: // uso_funcion ::= IDENT IZQPAREN lista_expr DERPAREN 
            {
              Object RESULT =null;
		Location fxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).xleft;
		Location fxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).xright;
		String f = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		Location lxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location lxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		Object l = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		//@@CUPDBG40
 // Lista tipos l == lista tipos f 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("uso_funcion",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 66: // op_log ::= AND 
            {
              OpType RESULT =null;
		//@@CUPDBG41
 RESULT = OpType.AND; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("op_log",29, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 67: // op_log ::= OR 
            {
              OpType RESULT =null;
		//@@CUPDBG42
 RESULT = OpType.OR; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("op_log",29, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 68: // op_comp ::= EQUALTO 
            {
              OpType RESULT =null;
		//@@CUPDBG43
 RESULT = OpType.EQ; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("op_comp",30, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 69: // op_comp ::= LESSER 
            {
              OpType RESULT =null;
		//@@CUPDBG44
 RESULT = OpType.LT; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("op_comp",30, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 70: // op_comp ::= GREATER 
            {
              OpType RESULT =null;
		//@@CUPDBG45
 RESULT = OpType.GT; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("op_comp",30, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 71: // op_comp ::= LESSEREQ 
            {
              OpType RESULT =null;
		//@@CUPDBG46
 RESULT = OpType.LE; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("op_comp",30, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 72: // op_comp ::= GREATEREQ 
            {
              OpType RESULT =null;
		//@@CUPDBG47
 RESULT = OpType.GE; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("op_comp",30, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 73: // op_a_h ::= PLUS 
            {
              OpType RESULT =null;
		//@@CUPDBG48
 RESULT = OpType.ADD; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("op_a_h",31, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 74: // op_a_h ::= MINUS 
            {
              OpType RESULT =null;
		//@@CUPDBG49
 RESULT = OpType.SUB; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("op_a_h",31, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 75: // op_a_m ::= MULT 
            {
              OpType RESULT =null;
		//@@CUPDBG50
 RESULT = OpType.MUL; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("op_a_m",32, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 76: // op_a_m ::= DIV 
            {
              OpType RESULT =null;
		//@@CUPDBG51
 RESULT = OpType.DIV; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("op_a_m",32, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
