import static org.junit.Assert.*;

import org.junit.Test;

public class MensagemTeste {

	@Test
	public void test() {
		MensagemPadrao msg = new MensagemPadrao();
		assertEquals("Bem vindos, todos vocês", msg.geraMensagem());
	}

}
