all: zoo custarray linear

zoo:
	$(MAKE) -C zoo

custarray:
	$(MAKE) -C CustArray

linear: 
	$(MAKE) -C Linear 

run-custarray:
	$(MAKE) -C CustArray run

run-linear:
	$(MAKE) -C Linear run
	
clean:
	$(MAKE) -C zoo clean
	$(MAKE) -C CustArray clean
	$(MAKE) -C Linear clean

.PHONY: all zoo custarray linear run-custarray run-linear clean


