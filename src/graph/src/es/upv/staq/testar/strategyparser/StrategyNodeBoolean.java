package es.upv.staq.testar.strategyparser;

import java.util.ArrayList;

import es.upv.staq.testar.algorithms.StateManager;

public abstract class StrategyNodeBoolean extends StrategyNode {
	public StrategyNodeBoolean(ArrayList<StrategyNode> children) {
		super(children);
	}

	public abstract boolean getValue(StateManager state);

}
