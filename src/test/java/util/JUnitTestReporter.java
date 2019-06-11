package util;

import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class JUnitTestReporter {

	@Rule
	public TestRule watcher = new TestWatcher() {

		@Override
		public Statement apply(Statement base, Description desc) {
			return super.apply(base, desc);
		}

		@Override
		protected void succeeded(Description desc) {
			System.out.println(desc.getDisplayName() + " Teste sucedido.");
		}

		@Override
		protected void failed(Throwable e, Description desc) {
			System.out.println(desc.getDisplayName() + " Teste falhou.");
		}
	};
}
