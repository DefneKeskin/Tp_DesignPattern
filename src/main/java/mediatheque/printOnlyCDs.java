package mediatheque;

public class printOnlyCDs
    implements ItemVisitor {
	public printOnlyCDs() {
	}

	// Imprimer un Book en HTML
	public void visit(Book item) {
	}

	// Imprimer un CD en HTML
	public void visit(CD item) {
        System.out.println(item); 
	}

	
}