package rholang.parsing.rholang1.Absyn; // Java Package generated by the BNF Converter.

public class CString extends Collect {
  public final String string_;
  public CString(String p1) { string_ = p1; }

  public <R,A> R accept(rholang.parsing.rholang1.Absyn.Collect.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof rholang.parsing.rholang1.Absyn.CString) {
      rholang.parsing.rholang1.Absyn.CString x = (rholang.parsing.rholang1.Absyn.CString)o;
      return this.string_.equals(x.string_);
    }
    return false;
  }

  public int hashCode() {
    return this.string_.hashCode();
  }


}
