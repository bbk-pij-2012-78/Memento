package code;

public class Originator {
	private Integer state;
	
	public Originator(Integer initialValue) {
		this.state = initialValue;
	}
	
	public Integer whatNext(){
		state = state + 5;
		return state;
	}
	
	public Memento saveToMemento() {
		return new Memento(state);
	}
	
	public void restoreFromMemento(Memento memento) {
		state = memento.getSavedState();
	}
	
	public static class Memento {
		private final Integer state;
		private Memento(Integer state2) {
			state = state2;
		}
		private Integer getSavedState() {
			return state;
		}
	}
}