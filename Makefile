all: zoo custarray

zoo:
	$(MAKE) -C zoo

custarray:
	$(MAKE) -C CustArray

run-custarray:
	$(MAKE) -C CustArray run

clean:
	$(MAKE) -C zoo clean
	$(MAKE) -C CustArray clean

.PHONY: all zoo custarray clean