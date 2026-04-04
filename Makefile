all: zoo custarray linear trees

zoo:
	$(MAKE) -C zoo

custarray:
	$(MAKE) -C CustArray

linear: 
	$(MAKE) -C Linear 

trees:
	$(MAKE) -C Trees

run-custarray:
	$(MAKE) -C CustArray run

run-linear:
	$(MAKE) -C Linear run

run-trees:
	$(MAKE) -C Trees run
	
clean:
	$(MAKE) -C zoo clean
	$(MAKE) -C CustArray clean
	$(MAKE) -C Linear clean
	$(MAKE) -C Trees clean

.PHONY: all zoo custarray linear trees run-custarray run-linear run-trees clean


