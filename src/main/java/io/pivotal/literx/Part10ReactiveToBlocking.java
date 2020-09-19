package io.pivotal.literx;

import io.pivotal.literx.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Learn how to turn Reactive API to blocking one.
 *
 * @author Sebastien Deleuze
 */
public class Part10ReactiveToBlocking {

//========================================================================================

	// todo return the user contained in that mono
	User monoToValue(Mono<User> mono) {
		return mono.block();
	}

//========================================================================================

	// TODO Return the users contained in that Flux
	Iterable<User> fluxToValues(Flux<User> flux) {
		return flux.toIterable();
		// return flux.buffer().blockLast(); // 나의 답
	}

}
