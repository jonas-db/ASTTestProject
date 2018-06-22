trait SomeTrait {}
trait SomeTraitAswell {
    def m = ()
}

class Traiter(val i: Int) extends SomeTrait with SomeTraitAswell {

}