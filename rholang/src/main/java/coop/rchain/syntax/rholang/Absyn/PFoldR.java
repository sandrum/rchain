package coop.rchain.syntax.rholang.Absyn; // Java Package generated by the BNF Converter.

public class PFoldR extends Proc {
  public final Bind bind_1, bind_2;
  public final Proc proc_;
  public PFoldR(Bind p1, Bind p2, Proc p3) { bind_1 = p1; bind_2 = p2; proc_ = p3; }

  public <R,A> R accept(coop.rchain.syntax.rholang.Absyn.Proc.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof coop.rchain.syntax.rholang.Absyn.PFoldR) {
      coop.rchain.syntax.rholang.Absyn.PFoldR x = (coop.rchain.syntax.rholang.Absyn.PFoldR)o;
      return this.bind_1.equals(x.bind_1) && this.bind_2.equals(x.bind_2) && this.proc_.equals(x.proc_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.bind_1.hashCode())+this.bind_2.hashCode())+this.proc_.hashCode();
  }


}