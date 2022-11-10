package mediatheque;

public class printOnlyBooks
    implements ItemVisitor {
	public printOnlyBooks() {
	}

	// Imprimer un Book en HTML
	public void visit(Book item) {
      
        System.out.println(item); 
	}

	// Imprimer un CD en HTML
	public void visit(CD item) {

	}

	
}
