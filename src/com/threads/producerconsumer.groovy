package com.threads

import java.util.concurrent.BlockingQueue
import java.util.concurrent.LinkedBlockingQueue

BlockingQueue sharedqueue = new LinkedBlockingQueue()

Thread.start('push') { 
	10.times { 
		try {
			println "${Thread.currentThread().name}\t: ${it}"
			sharedqueue << it
			sleep 100
		}catch(InterruptedException e){
			
		}
	}
}


Thread.start('pop') { 
	for(i in 9..0) {
		sleep 200
		println "${Thread.currentThread().name}\t: ${sharedqueue.take()}"
	}
}
