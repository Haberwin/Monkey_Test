----- timezone:GMT
<6>[    0.000000] -(0)[0:swapper]Booting Linux on physical CPU 0x0
<6>[    0.000000] -(0)[0:swapper]Initializing cgroup subsys cpuset
<6>[    0.000000] -(0)[0:swapper]Initializing cgroup subsys cpu
<6>[    0.000000] -(0)[0:swapper]Initializing cgroup subsys cpuacct
<6>[    0.000000] -(0)[0:swapper]Initializing cgroup subsys schedtune
<5>[    0.000000] -(0)[0:swapper]Linux version 4.4.95+ (buildform02@buildform02) (gcc version 6.3.1 20170109 (Linaro GCC 6.3-2017.02) ) #1 SMP PREEMPT Wed Feb 6 02:21:08 CST 2019
<6>[    0.000000] -(0)[0:swapper]Boot CPU: AArch64 Processor [410fd034]
<5>[    0.000000] -(0)[0:swapper]mrdump_get_cb: mrdump_cbaddr=0x000000000010ea00, mrdump_cbsize=0x0000000000001600
<1>[    0.000000] -(0)[0:swapper][PHY layout]mblock-10-ccci   :   0x76000000 - 0x76bfffff (0xc00000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]mblock-8-ccci   :   0x72000000 - 0x720fffff (0x100000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]mblock-7-MCUPM-reserved   :   0x77ab0000 - 0x77abffff (0x10000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]mblock-6-SPM-reserved   :   0x77ac0000 - 0x77acffff (0x10000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]mblock-5-framebuffer   :   0x77ad0000 - 0x77ffffff (0x530000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]mblock-4-atf-log-reserved   :   0xbfe00000 - 0xbfe3ffff (0x40000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]mblock-3-atf-reserved   :   0x44600000 - 0x4463ffff (0x40000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]mblock-1-emi-reserved   :   0x7ffff000 - 0x7fffffff (0x1000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]consys-reserve-memory   :   0x77800000 - 0x779fffff (0x200000)
<6>[    0.000000] -(0)[0:swapper][CONNADP]reserve_memory_consys_fn: name: consys-reserve-memory, base: 0x77800000, size: 0x200000
<6>[    0.000000] -(0)[0:swapper]Reserved memory: initialized node consys-reserve-memory, compatible id mediatek,consys-reserve-memory
<6>[    0.000000] -(0)[0:swapper][dram_dummy_read_reserve_mem_of_init] dram_rank0_addr = 0x0000000061fff000, size = 0x1000
<6>[    0.000000] -(0)[0:swapper]Reserved memory: initialized node reserve-memory-dram_r0_dummy_read, compatible id reserve-memory-dram_r0_dummy_read
<6>[    0.000000] -(0)[0:swapper][dram_dummy_read_reserve_mem_of_init] dram_rank1_addr = 0x00000000bfdff000, size = 0x1000
<6>[    0.000000] -(0)[0:swapper]Reserved memory: initialized node reserve-memory-dram_r1_dummy_read, compatible id reserve-memory-dram_r1_dummy_read
<6>[    0.000000] -(0)[0:swapper][memblock]mediatek,ram_console: 0x44400000 - 0x44410000 (0x10000)
<6>[    0.000000] -(0)[0:swapper]Reserved memory: initialized node ram_console-reserved-memory@44400000, compatible id mediatek,ram_console
<6>[    0.000000] -(0)[0:swapper][memblock]mediatek,pstore: 0x44410000 - 0x444f0000 (0xe0000)
<6>[    0.000000] -(0)[0:swapper]Reserved memory: initialized node pstore-reserved-memory@44410000, compatible id mediatek,pstore
<6>[    0.000000] -(0)[0:swapper][memblock]mediatek,minirdump: 0x444f0000 - 0x44500000 (0x10000)
<6>[    0.000000] -(0)[0:swapper]Reserved memory: initialized node minirdump-reserved-memory@444f0000, compatible id mediatek,minirdump
<5>[    0.000000] -(0)[0:swapper] mrdump region start = 0x0000000044000000 size =0x0000000000080000 is reserved already
<5>[    0.000000] -(0)[0:swapper] mrdump region start = 0x000000004489ef00 size =0x0000000000001673 is reserved already
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0x40000000 - 0x445fffff (0x4600000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0x44640000 - 0x71ffffff (0x2d9c0000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0x72100000 - 0x75ffffff (0x3f00000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0x76c00000 - 0x777fffff (0xc00000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0x77a00000 - 0x77aaffff (0xb0000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0x78000000 - 0x7fffefff (0x7fff000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0x80000000 - 0xbfdfffff (0x3fe00000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0xbfe40000 - 0xbfffffff (0x1c0000)
<7>[    0.000000] -(0)[0:swapper]On node 0 totalpages: 518959
<7>[    0.000000] -(0)[0:swapper]  DMA zone: 8192 pages used for memmap
<7>[    0.000000] -(0)[0:swapper]  DMA zone: 0 pages reserved
<7>[    0.000000] -(0)[0:swapper]  DMA zone: 518959 pages, LIFO batch:31
<6>[    0.000000] -(0)[0:swapper]psci: probing for conduit method from DT.
<6>[    0.000000] -(0)[0:swapper]psci: PSCIv1.0 detected in firmware.
<6>[    0.000000] -(0)[0:swapper]psci: Using standard PSCI v0.2 function IDs
<6>[    0.000000] -(0)[0:swapper]psci: MIGRATE_INFO_TYPE not supported.
<6>[    0.000000] -(0)[0:swapper]psci: SMC Calling Convention v1.1
<6>[    0.000000] -(0)[0:swapper]PERCPU: Embedded 23 pages/cpu @ffffffc07ff1a000 s54552 r8192 d31464 u94208
<7>[    0.000000] -(0)[0:swapper]pcpu-alloc: s54552 r8192 d31464 u94208 alloc=23*4096
<7>[    0.000000] -(0)[0:swapper]pcpu-alloc: [0] 0 [0] 1 [0] 2 [0] 3 
<6>[    0.000000] -(0)[0:swapper]CPU features: enabling workaround for ARM errata 855873
<6>[    0.000000] -(0)[0:swapper]CPU features: enabling workaround for ARM erratum 845719
<6>[    0.000000] -(0)[0:swapper]CPU features: enabling workaround for ARM erratum 855872
<6>[    0.000000] -(0)[0:swapper]Built 1 zonelists in Zone order, mobility grouping on.  Total pages: 510767
<6>[    0.000000] -(0)[0:swapper][cpu_ntf] <00>ffffff800817a9bc (page_alloc_cpu_notify)
<5>[    0.000000] -(0)[0:swapper]Kernel command line: console=tty0 console=ttyMT0,921600n1 root=/dev/ram vmalloc=496M slub_max_order=0 slub_debug=OFZPU androidboot.hardware=mt6739 maxcpus=8 firmware_class.path=/vendor/firmware has_battery_removed=0 androidboot.verifiedbootstate=green bootopt=64S3,32N2,64N2 buildvariant=user androidboot.veritymode=enforcing androidboot.atm=disabled androidboot.meta_log_disable=0 printk.disable_uart=1 bootprof.pl_t=5505 bootprof.lk_t=1694 bootprof.logo_t=580 boot_reason=4 androidboot.serialno=19042B0005 proinfo_stress_test_enable=0 proinfo_enable_recovery_value=0 proinfo_charging_led_mode=1 androidboot.bootreason=wdt_by_pass_pwk motherboard_type=3 gpt=1 usb2jtag_mode=0 mrdump_ddrsv=yes mrdump_cb=0x10ea00,0x1600 mrdump_rsvmem=0x46000000,0x400000,0x44800000,0x9ef40,0x44000000,0x80000,0x4489ef00,0x1673
<6>[    0.000000] -(0)[0:swapper]PID hash table entries: 4096 (order: 3, 32768 bytes)
<6>[    0.000000] -(0)[0:swapper]Dentry cache hash table entries: 262144 (order: 9, 2097152 bytes)
<6>[    0.000000] -(0)[0:swapper]Inode-cache hash table entries: 131072 (order: 8, 1048576 bytes)
<6>[    0.000000] -(0)[0:swapper]software IO TLB [mem 0xbfed2000-0xbff12000] (0MB) mapped at [ffffffc07fed2000-ffffffc07ff11fff]
<6>[    0.000000] -(0)[0:swapper]Memory: 1744504K/2075836K available (10560K kernel code, 1504K rwdata, 4212K rodata, 4728K init, 3547K bss, 331332K reserved, 0K cma-reserved)
<5>[    0.000000] -(0)[0:swapper]Virtual kernel memory layout:
<5>[    0.000000]     modules : 0xffffff8000000000 - 0xffffff8008000000   (   128 MB)
<5>[    0.000000]     vmalloc : 0xffffff8008000000 - 0xffffffbdbfff0000   (   246 GB)
<5>[    0.000000]       .init : 0xffffff8008ef4000 - 0xffffff8009392000   (  4728 KB)
<5>[    0.000000]       .text : 0xffffff8008080000 - 0xffffff8008ad1000   ( 10564 KB)
<5>[    0.000000]     .rodata : 0xffffff8008ad1000 - 0xffffff8008ef4000   (  4236 KB)
<5>[    0.000000]       .data : 0xffffff8009392000 - 0xffffff800950a2e0   (  1505 KB)
<5>[    0.000000]     vmemmap : 0xffffffbdc0000000 - 0xffffffbfc0000000   (     8 GB maximum)
<5>[    0.000000]               0xffffffbdc0000000 - 0xffffffbdc2000000   (    32 MB actual)
<5>[    0.000000]     fixed   : 0xffffffbffe7fd000 - 0xffffffbffec00000   (  4108 KB)
<5>[    0.000000]     PCI I/O : 0xffffffbffee00000 - 0xffffffbfffe00000   (    16 MB)
<6>[    0.000000] -(0)[0:swapper][cpu_ntf] <00>ffffff80081b690c (slab_cpuup_callback)
<6>[    0.000000] -(0)[0:swapper]SLUB: HWalign=64, Order=0-0, MinObjects=0, CPUs=4, Nodes=1
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff80080e47dc (sched_ilb_notifier)
<4>[    0.000000] -(0)[0:swapper/0]Initializing HMP scheduler:
<6>[    0.000000] -(0)[0:swapper/0]Preemptible hierarchical RCU implementation.
<6>[    0.000000] -(0)[0:swapper/0]	Build-time adjustment of leaf fanout to 64.
<6>[    0.000000] -(0)[0:swapper/0]	RCU restricting CPUs from NR_CPUS=10 to nr_cpu_ids=4.
<6>[    0.000000] -(0)[0:swapper/0]RCU: Adjusting geometry for rcu_fanout_leaf=64, nr_cpu_ids=4
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff8008108d6c (rcu_cpu_notify)
<4>[    0.000000] -(0)[0:swapper/0]
<4>[    0.000000] -(0)[0:swapper/0]**********************************************************
<4>[    0.000000] -(0)[0:swapper/0]**   NOTICE NOTICE NOTICE NOTICE NOTICE NOTICE NOTICE   **
<4>[    0.000000] -(0)[0:swapper/0]**                                                      **
<4>[    0.000000] -(0)[0:swapper/0]** trace_printk() being used. Allocating extra memory.  **
<4>[    0.000000] -(0)[0:swapper/0]**                                                      **
<4>[    0.000000] -(0)[0:swapper/0]** This means that this is a DEBUG kernel and it is     **
<4>[    0.000000] -(0)[0:swapper/0]** unsafe for production use.                           **
<4>[    0.000000] -(0)[0:swapper/0]**                                                      **
<4>[    0.000000] -(0)[0:swapper/0]** If you see this message and you are not debugging    **
<4>[    0.000000] -(0)[0:swapper/0]** the kernel, report this immediately to your vendor!  **
<4>[    0.000000] -(0)[0:swapper/0]**                                                      **
<4>[    0.000000] -(0)[0:swapper/0]**   NOTICE NOTICE NOTICE NOTICE NOTICE NOTICE NOTICE   **
<4>[    0.000000] -(0)[0:swapper/0]**********************************************************
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff800832ff9c (radix_tree_callback)
<6>[    0.000000] -(0)[0:swapper/0]NR_IRQS:64 nr_irqs:64 0
<6>[    0.000000] -(0)[0:swapper/0]GIC: Using split EOI/Deactivate mode
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff8008358630 (gic_secondary_init)
<4>[    0.000000] -(0)[0:swapper/0]### gic-v3 init done. ###
<5>[    0.000000] -(0)[0:swapper/0]### IRQ SW mode not support ###
<5>[    0.000000] -(0)[0:swapper/0]### gic-v3 scheduled pm init done ###
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff800810ec6c (timer_cpu_notify)
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff8008110570 (hrtimer_cpu_notify)
<6>[    0.000000] -(0)[0:swapper/0]arch_timer_init:arch_timer_rate(0xc65d40),PHYS_SECURE_PPI=1,PHYS_NONSECURE_PPI=2,VIRT_PPI=3,HYP_PPI=4
<6>[    0.000000] -(0)[0:swapper/0]arch_timer_init:arch_timer_c3stop=1
<6>[    0.000000] -(0)[0:swapper/0]arch_timer_register:arch_timer_rate(0xc65d40),arch_timer_use_virtual=0
<6>[    0.000000] -(0)[0:swapper/0]arch_timer_register:request_percpu_irq PHYS_SECURE_PPI err=0
<6>[    0.000000] -(0)[0:swapper/0]arch_timer_register:request_percpu_irq PHYS_NONSECURE_PPI err=0
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff80088478dc (arch_timer_cpu_notify)
<6>[    0.000000] -(0)[0:swapper/0]Architected cp15 timer(s) running at 13.00MHz (phys).
<6>[    0.000000] -(0)[0:swapper/0]clocksource: arch_sys_counter: mask: 0xffffffffffffff max_cycles: 0x2ff89eacb, max_idle_ns: 440795202429 ns
<6>[    0.000000] -(0)[0:swapper/0]sched_clock: 56 bits at 13MHz, resolution 76ns, wraps every 4398046511101ns
<6>[    0.000194] -(0)[0:swapper/0][mtk_gpt] base=0xffffff800807c000, irq=5
<6>[    0.000206] -(0)[0:swapper/0][mtk_gpt] gpt1, base=0xffffff800807c010
<6>[    0.000214] -(0)[0:swapper/0][mtk_gpt] gpt2, base=0xffffff800807c020
<6>[    0.000221] -(0)[0:swapper/0][mtk_gpt] gpt3, base=0xffffff800807c030
<6>[    0.000229] -(0)[0:swapper/0][mtk_gpt] gpt4, base=0xffffff800807c040
<6>[    0.000236] -(0)[0:swapper/0][mtk_gpt] gpt5, base=0xffffff800807c050
<6>[    0.000243] -(0)[0:swapper/0][mtk_gpt] gpt6, base=0xffffff800807c060
<6>[    0.000281] -(0)[0:swapper/0][mtk_gpt] gpt1: clkdiv=1, cmp=128, hz=250, freq=32000
<6>[    0.000298] -(0)[0:swapper/0][mtk_gpt] acao clkevt, freq=32000
<6>[    0.000829] -(0)[0:swapper/0][cpu_ntf] <00>ffffff8008122994 (hotplug_cfd)
<6>[    0.001552]  (0)[0:swapper/0]console [ttyMT0] enabled
<3>[    0.001603]  (0)[0:swapper/0]ram_console: buffer start: 0xffffff800988cc00, size: 0x800
<3>[    0.001845]  (0)[0:swapper/0]pmic & external buck: 0xff
<3>[    0.001852]  (0)[0:swapper/0]ram_console: CPU notifier status: 18, 60, 0x0, 99591135
<3>[    0.001861]  (0)[0:swapper/0]ram_console: CPU HPS footprint: 831, 0x0, 11, 10662
<3>[    0.001870]  (0)[0:swapper/0]ram_console: last init function: 0xffffff8000c76bb8
<6>[    0.002024]  (0)[0:swapper/0]Calibrating delay loop (skipped), value calculated using timer frequency.. 26.00 BogoMIPS (lpj=52000)
<6>[    0.002033]  (0)[0:swapper/0]pid_max: default: 32768 minimum: 301
<6>[    0.002106]  (0)[0:swapper/0][cpu_ntf] <00>ffffff80081f1064 (buffer_cpu_notify)
<6>[    0.002120]  (0)[0:swapper/0]Security Framework initialized
<6>[    0.002131]  (0)[0:swapper/0]SELinux:  Initializing.
<7>[    0.002181]  (0)[0:swapper/0]SELinux:  Starting in permissive mode
<6>[    0.002214]  (0)[0:swapper/0]Mount-cache hash table entries: 4096 (order: 3, 32768 bytes)
<6>[    0.002225]  (0)[0:swapper/0]Mountpoint-cache hash table entries: 4096 (order: 3, 32768 bytes)
<6>[    0.002500]  (0)[0:swapper/0][cpu_ntf] <00>ffffff800817fcb8 (ratelimit_handler)
<6>[    0.002842]  (0)[0:swapper/0]Initializing cgroup subsys freezer
<6>[    0.002861]  (0)[0:swapper/0]Initializing cgroup subsys debug
<6>[    0.002902]  (0)[0:swapper/0][cpu_ntf] <00>ffffff80080a0000 (smpboot_thread_call)
<6>[    0.003039] -(0)[0:swapper/0]init_heavy_tlb start.
<4>[    0.003051] -(0)[0:swapper/0]init_heavy_tlb: cpu=0 thresh_l=2147483647 thresh_h=358 max_capaicy=1024
<4>[    0.003061] -(0)[0:swapper/0]init_heavy_tlb: cpu=1 thresh_l=2147483647 thresh_h=358 max_capaicy=1024
<4>[    0.003070] -(0)[0:swapper/0]init_heavy_tlb: cpu=2 thresh_l=2147483647 thresh_h=358 max_capaicy=1024
<4>[    0.003079] -(0)[0:swapper/0]init_heavy_tlb: cpu=3 thresh_l=2147483647 thresh_h=358 max_capaicy=1024
<6>[    0.003219]  (0)[1:swapper/0]ASID allocator initialised with 65536 entries
<6>[    0.003239]  (0)[1:swapper/0][cpu_ntf] <00>ffffff80080a509c (cpu_callback)
<6>[    0.003695]  (0)[1:swapper/0][cpu_ntf] <00>ffffff80080ba82c (workqueue_cpu_up_callback)
<6>[    0.003707]  (0)[1:swapper/0][cpu_ntf] <00>ffffff80080bab50 (workqueue_cpu_down_callback)
<6>[    0.015773]  (0)[1:swapper/0][cpu_ntf] <00>ffffff80080ce75c (migration_call)
<6>[    0.015789]  (0)[1:swapper/0][cpu_ntf] <00>ffffff80080cb3bc (sched_cpu_active)
<6>[    0.015798]  (0)[1:swapper/0][cpu_ntf] <00>ffffff80080cb388 (sched_cpu_inactive)
<6>[    0.019819]  (0)[1:swapper/0][cpu_ntf] <00>ffffff8008163c08 (hotplug_event_notify)
<6>[    0.023340]  (0)[1:swapper/0][cpu_ntf] <00>ffffff80083fe4ec (cpu_hotplug_cb_notifier)
<6>[    0.023361]  (0)[1:swapper/0]CPU Hotplug Low Power Notification
<3>[    0.023379]  (0)[1:swapper/0]BOOTPROF:        23.379076: ON
<1>[    0.023673]  (0)[1:swapper/0]init_get_max_DRAM_size done. phone_dram_sz: 0x80000000, kernel_mem_sz: 0x80000000
<3>[    0.023807]  (0)[1:swapper/0]tag_devinfo_data size:200, HRID size:4
<3>[    0.023819]  (0)[1:swapper/0][devinfo][SegCode] Segment Code=0x80
<5>[    0.023871]  (0)[1:swapper/0]log_store: sram header address 0xffffff8009890900.
<5>[    0.023881]  (0)[1:swapper/0]log_store printk log buff addr:0x41514dcc, size 0x80000. buff flag 0x427.
<5>[    0.023890]  (0)[1:swapper/0]sram_dram_buff sig 0x5678ef90
<5>[    0.023897]  (0)[1:swapper/0]sram_dram_buff flag 0x427
<5>[    0.023903]  (0)[1:swapper/0]sram_dram_buff add 0x7ff7f000
<5>[    0.023910]  (0)[1:swapper/0]sram_dram_buff size 0x40000
<5>[    0.023917]  (0)[1:swapper/0]sram_dram_buff offsize 0x20
<5>[    0.023924]  (0)[1:swapper/0]sram_dram_buff point 0x28668
<6>[    0.038590]  (0)[1:swapper/0]Brought up 4 CPUs
<6>[    0.038610]  (0)[1:swapper/0]SMP: Total of 4 processors activated.
<6>[    0.038619]  (0)[1:swapper/0]CPU features: detected feature: GIC system register CPU interface
<6>[    0.038632]  (0)[1:swapper/0]CPU: All CPU(s) started at EL2
<6>[    0.038663] -(0)[10:migration/0]alternatives: patching kernel code
<6>[    0.040819]  (0)[1:swapper/0][cpu_ntf] <00>ffffff80080c2d30 (sched_domains_numa_masks_update)
<6>[    0.040842]  (0)[1:swapper/0][cpu_ntf] <00>ffffff80080d3b08 (cpuset_cpu_active)
<6>[    0.040853]  (0)[1:swapper/0][cpu_ntf] <00>ffffff80080d3b74 (cpuset_cpu_inactive)
<6>[    0.040865]  (0)[1:swapper/0][cpu_ntf] <00>ffffff80080cc6c8 (hotplug_hrtick)
<6>[    0.041180]  (0)[1:swapper/0][cpu_ntf] <00>ffffff80083cb08c (device_hotplug_notifier)
<1>[    0.058322]  (0)[1:swapper/0][PHY layout]tee_reserved_mem   :   0xbfe00000 - 0xbfe3ffff (0x40000)
<6>[    0.058346]  (0)[1:swapper/0][DISP][DT][videolfb]isvideofb_parse_done = 0
<6>[    0.058363]  (0)[1:swapper/0][DISP][DT][videolfb] islcmfound = 1
<6>[    0.058370]  (0)[1:swapper/0][DISP][DT][videolfb] is_lcm_inited = 1
<6>[    0.058378]  (0)[1:swapper/0][DISP][DT][videolfb] fps        = 6124
<6>[    0.058385]  (0)[1:swapper/0][DISP][DT][videolfb] fb_base    = 0x77ad0000
<6>[    0.058392]  (0)[1:swapper/0][DISP][DT][videolfb] vram       = 0x530000 (5439488)
<6>[    0.058400]  (0)[1:swapper/0][DISP][DT][videolfb] lcmname    = jd9161_wvga_dsi_vdo
<6>[    0.058407]  (0)[1:swapper/0][DISP][DT][videolfb]isvideofb_parse_done = 1
<1>[    0.058414]  (0)[1:swapper/0][debug]available DRAM size = 0x80000000
<1>[    0.058414] [PHY layout]FB (dt) :  0x77ad0000 - 0x77ffffff  (0x530000)
<1>[    0.058592]  (0)[1:swapper/0]
<1>[    0.058592]  register_restart_handler- 0xffffff8009834bb0, Notify call: - 0xffffff80087eda08
<1>[    0.058606]  (0)[1:swapper/0]ARCH_RESET register mtk_restart_handler  ok!!!!
<6>[    0.059873]  (0)[1:swapper/0]clocksource: jiffies: mask: 0xffffffff max_cycles: 0xffffffff, max_idle_ns: 7645041785100000 ns
<6>[    0.059902]  (0)[1:swapper/0]futex hash table entries: 1024 (order: 5, 131072 bytes)
<6>[    0.060373]  (1)[1:swapper/0]pinctrl core: initialized pinctrl subsystem
<6>[    0.061107]  (1)[1:swapper/0]mtk_wdt_get_base_addr: compatible node found: toprgu
<6>[    0.061500]  (1)[1:swapper/0]NET: Registered protocol family 16
<6>[    0.062591]  (1)[1:swapper/0]ramoops: using module parameters
<3>[    0.062716]  (1)[1:swapper/0]ramoops: pstore:address is 0x44410000, size is 0xe0000, console_size is 0x40000, pmsg_size is 0x10000
<6>[    0.100186]  (1)[1:swapper/0]console [pstore-1] enabled
<6>[    0.100329]  (1)[1:swapper/0]pstore: Registered ramoops as persistent store backend
<6>[    0.100342]  (1)[1:swapper/0]ramoops: attached 0xe0000@0x44410000, ecc: 0/0
<3>[    0.100367]  (1)[1:swapper/0]BOOTPROF:       100.367461:probe: probe=platform_drv_probe drv=ramoops(ffffff80093df870)    37.639924ms
<3>[    0.100416]  (1)[1:swapper/0]BOOTPROF:       100.416307:initcall: ramoops_init    37.819539ms
<4>[    0.100977] -(2)[0:swapper/2]------------[ cut here ]------------
<4>[    0.100992] -(2)[0:swapper/2]WARNING: CPU: 2 PID: 0 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/pmic_wrap/mt6739/pwrap_hal_v1.c:1394 mt_pmic_wrap_irq+0x14c/0x17c()
<4>[    0.101016] -(2)[0:swapper/2]Modules linked in:
<4>[    0.101028] -(2)[0:swapper/2]CPU: 2 PID: 0 Comm: swapper/2 Not tainted 4.4.95+ #1
<4>[    0.101040] -(2)[0:swapper/2]Hardware name: MT6739CW (DT)
<4>[    0.101050] -(2)[0:swapper/2]Call trace:
<4>[    0.101058] -(2)[0:swapper/2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[    0.101075] -(2)[0:swapper/2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[    0.101087] -(2)[0:swapper/2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[    0.101102] -(2)[0:swapper/2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[    0.101116] -(2)[0:swapper/2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[    0.101129] -(2)[0:swapper/2][<ffffff80084c0cc8>] mt_pmic_wrap_irq+0x14c/0x17c
<4>[    0.101141] -(2)[0:swapper/2][<ffffff80080fcffc>] handle_irq_event_percpu+0xf0/0x1f4
<4>[    0.101155] -(2)[0:swapper/2][<ffffff80080fd148>] handle_irq_event+0x48/0x78
<4>[    0.101167] -(2)[0:swapper/2][<ffffff8008100a24>] handle_fasteoi_irq+0xc0/0x128
<6>[    0.101175]  (1)[1:swapper/0][DRAMC] dram info dram rank number = 2
<6>[    0.101180]  (1)[1:swapper/0][DRAMC] dram info dram rank0 base = 0x61fff000
<6>[    0.101187]  (1)[1:swapper/0][DRAMC] dram info dram rank1 base = 0xbfdff000
<6>[    0.101195]  (1)[1:swapper/0][DRAMC]find dt_scan_dram_info
<4>[    0.101207] -(2)[0:swapper/2][<ffffff80080fc520>] generic_handle_irq+0x18/0x2c
<4>[    0.101219] -(2)[0:swapper/2][<ffffff80080fc99c>] __handle_domain_irq+0x1f0/0x220
<4>[    0.101231] -(2)[0:swapper/2][<ffffff80080818d0>] gic_handle_irq+0xac/0x180
<6>[    0.101241]  (1)[1:swapper/0][EMI] dram_type(3)
<6>[    0.101245]  (1)[1:swapper/0][EMI] ch_num(2)
<6>[    0.101251]  (1)[1:swapper/0][EMI] rk_num(2)
<6>[    0.101264]  (1)[1:swapper/0][EMI] rank0_size(0x0)
<6>[    0.101269] -(2)[0:swapper/2][EMI] rank1_size(0x0)
<4>[    0.101261] -(2)[0:swapper/2]Exception stack(0xffffffc0321bbce0 to 0xffffffc0321bbe10)
<4>[    0.101276] -(2)[0:swapper/2]bce0: 0000004076fd8000 ffffff8008f70018 0000000000000000 0000000000000000
<4>[    0.101283] -(2)[0:swapper/2]bd00: 00000000000000c0 0100000000000000 000000000000001e 00000000001bf677
<4>[    0.101290] -(2)[0:swapper/2]bd20: ffffffc0321a6930 ffffffc0321bbe90 00000000000008d0 0000000000000400
<4>[    0.101297] -(2)[0:swapper/2]bd40: 0000000000017400 ffffffffffffffff ffffffffffffffff 0000000000000000
<4>[    0.101304] -(2)[0:swapper/2]bd60: 0000000006124ee7 0000000000000000 0000000000000000 ffffff8008f70000
<4>[    0.101311] -(2)[0:swapper/2]bd80: ffffff80094b8308 ffffff80094b8000 ffffff8008f70018 ffffff8008f70000
<4>[    0.101318] -(2)[0:swapper/2]bda0: ffffff8008f70018 0000000000000002 0000000041885000 ffffff8008081b40
<4>[    0.101326] -(2)[0:swapper/2]bdc0: 0000000000000000 ffffffc0321bbf10 ffffff8008085a28 ffffffc0321bbf10
<4>[    0.101333] -(2)[0:swapper/2]bde0: ffffff8008085a2c 0000000060000045 ffffffc07ff54100 ffffffc0321a65b8
<4>[    0.101338] -(2)[0:swapper/2]be00: ffffffffffffffff ffffffc0321a6000
<4>[    0.101343] -(2)[0:swapper/2][<ffffff8008084878>] el1_irq+0xb8/0x130
<4>[    0.101352] -(2)[0:swapper/2][<ffffff8008085a2c>] arch_cpu_idle+0x94/0x118
<4>[    0.101362] -(2)[0:swapper/2][<ffffff80080ea9f4>] default_idle_call+0x20/0x28
<4>[    0.101373] -(2)[0:swapper/2][<ffffff80080eacb0>] cpu_startup_entry+0x264/0x308
<4>[    0.101384] -(2)[0:swapper/2][<ffffff800808f4e0>] secondary_start_kernel+0x398/0x3dc
<4>[    0.101394] -(2)[0:swapper/2][<0000000040aca03c>] 0x40aca03c
<4>[    0.101415] -(2)[0:swapper/2]---[ end trace e335f74a8dfe3602 ]---
<6>[    0.101585]  (1)[1:swapper/0]mtk_wdt_init ok
<6>[    0.108866]  (1)[1:swapper/0]cpuidle: using governor menu
<6>[    0.116873]  (1)[1:swapper/0]cpuidle: using governor mtk_menu
<3>[    0.117449]  (1)[1:swapper/0]Power/swap IDLE BLOCKING INFO SETTING FAIL (type:3)
<6>[    0.118429]  (1)[1:swapper/0]vdso: 2 pages (1 code @ ffffff8008ad7000, 1 data @ ffffff8009399000)
<6>[    0.118466]  (1)[1:swapper/0]hw-breakpoint: found 6 breakpoint and 4 watchpoint registers.
<6>[    0.118641]  (1)[1:swapper/0]DMA: preallocated 256 KiB pool for atomic allocations
<5>[    0.118660]  (1)[1:swapper/0][Power/PPM] @ppm_main_data_init: cluster_num = 1
<5>[    0.118672]  (1)[1:swapper/0][Power/PPM] @ppm_main_data_init: ppm cluster 0 -> core_num = 4, cpu_id = 0
<5>[    0.118690]  (1)[1:swapper/0][Power/PPM] @ppm_main_data_init: done!
<5>[    0.118887]  (1)[1:swapper/0][Power/PPM] @ppm_main_pdrv_probe: ppm probe done!
<5>[    0.118934]  (1)[1:swapper/0][Power/PPM] ppm_profile_init done
<5>[    0.118944]  (1)[1:swapper/0][Power/PPM] ppm driver init done!
<4>[    0.119225]  (1)[1:swapper/0]### CIRQ init done. ###
<6>[    0.119286]  (1)[1:swapper/0][DEVAPC] kernel module init.
<6>[    0.119783]  (1)[1:swapper/0][DDP/ddp_drv]warn:Register the disp driver
<6>[    0.119822]  (1)[1:swapper/0][DDP/ddp_drv]warn:disp driver init done
<5>[    0.120369]  (1)[1:swapper/0]
<5>[    0.120369]  MTK_SIP_KERNEL_WDT - 0xffffff80087178ac
<5>[    0.120388]  (1)[1:swapper/0]
<5>[    0.120388]  atf_aee_debug_virt_addr = 0xffffff8009a88000
<5>[    0.125941]  (1)[1:swapper/0]mrdump_cblock_init: done.
<3>[    0.125997]  (1)[1:swapper/0]mrdump_platform_init: MT-RAMDUMP init failed, lk version  not matched.
<1>[    0.126041]  (1)[1:swapper/0]mrdump_wd_dram_reserved_mode: DDR Reserved Mode ready or not? (yes)
<6>[    0.126058]  (1)[1:swapper/0]mtk_wdt_swsysret_config: before set wdt_sys_val =8000
<6>[    0.126069]  (1)[1:swapper/0]mtk_wdt_swsysret_config: after set wdt_sys_val =8000,wdt_sys_val=88008000
<6>[    0.126081]  (1)[1:swapper/0]mtk_rgu_dram_reserved: MTK_WDT_MODE(0xdd)
<1>[    0.126091]  (1)[1:swapper/0]mrdump_wd_dram_reserved_mode: DDR reserved mode enabled
<6>[    0.126100]  (1)[1:swapper/0]mrdump_hw_init: init_done.
<5>[    0.126159]  (1)[1:swapper/0]mirdump: reserved 444f0000+3000->ffffff8009a93000
<4>[    0.131596]  (1)[1:swapper/0]irq: no irq domain found for /pinctrl@1000b000 !
<6>[    0.131844]  (1)[1:swapper/0]mtk pinctrl probe
<4>[    0.133127]  (1)[1:swapper/0]mtk_pctrl_init------ ok
<6>[    0.133463]  (1)[1:swapper/0]mtk wdt driver probe ..
<6>[    0.133488]  (1)[1:swapper/0]wdt_sspm_irq_id is not found
<6>[    0.133843]  (1)[1:swapper/0]failed to get interrupts in mrdump_ext_rst-eint node
<6>[    0.133853]  (1)[1:swapper/0]ext_debugkey_eint=-1
<6>[    0.136104]  (1)[1:swapper/0][DRAMC] module probe.
<6>[    0.136144]  (1)[1:swapper/0][DRAMC]get DRAMC_AO_CHA_BASE_ADDR @ ffffff8009aba000
<6>[    0.136154]  (1)[1:swapper/0][DRAMC]get DDRPHY_CHA_BASE_ADDR @ ffffff8009abe000
<6>[    0.136164]  (1)[1:swapper/0][DRAMC]get DRAMC_NAO_CHA_BASE_ADDR @ ffffff8009abc000
<6>[    0.136305]  (1)[1:swapper/0][DRAMC]get SLEEP_BASE_ADDR @ ffffff8009ac0000
<6>[    0.136315]  (1)[1:swapper/0][DRAMC Driver] dram type =1
<6>[    0.136329]  (1)[1:swapper/0][DRAMC Driver] Dram Data Rate = 1333
<6>[    0.136338]  (1)[1:swapper/0][DRAMC Driver] shuffle_status = 0
<6>[    0.136356]  (1)[1:swapper/0][DRAMC Driver] dram can support DFS
<6>[    0.137790]  (1)[1:swapper/0][DEVAPC] module probe.
<6>[    0.137821]  (1)[1:swapper/0][DEVAPC] PD_INFRA_ADDRESS: ffffff8009ac2000, IRQ: 222
<6>[    0.137908]  (1)[1:swapper/0][DEVAPC] INFRA VIO_MASK 0:0xffffffff, 1:0xffffffff, 2:0xffffffff, 3:0xffffffff, 
<6>[    0.137914]  (1)[1:swapper/0]4:0xffffffff, 5:0xffffffff, 6:0x7ffff, 7:0x0, 8:0x0, 9:0x0
<6>[    0.137932]  (1)[1:swapper/0][DEVAPC] INFRA VIO_STA 0:0x0, 1:0x0, 2:0x0, 3:0x0, 
<6>[    0.137937]  (1)[1:swapper/0]4:0x10000000, 5:0x0, 6:0x80, 7:0x0, 8:0x0, 9:0x0
<6>[    0.137951]  (1)[1:swapper/0][DEVAPC] Clear INFRA VIO_STA and unmask INFRA VIO_MASK...
<6>[    0.138044]  (1)[1:swapper/0][DEVAPC] INFRA VIO_MASK 0:0x0, 1:0x200, 2:0x0, 3:0x0, 
<6>[    0.138049]  (1)[1:swapper/0]4:0x0, 5:0x0, 6:0x7ff80, 7:0x0, 8:0x0, 9:0x0
<6>[    0.138066]  (1)[1:swapper/0][DEVAPC] INFRA VIO_STA 0:0x0, 1:0x0, 2:0x0, 3:0x0, 
<6>[    0.138071]  (1)[1:swapper/0]4:0x0, 5:0x0, 6:0x80, 7:0x0, 8:0x0, 9:0x0
<6>[    0.138084]  (1)[1:swapper/0][DEVAPC] initialize current aee trigger times.
<6>[    0.139771]  (1)[1:swapper/0][EMI] get irq of MPU(229), GCM(0), ELM(0)
<6>[    0.139804]  (1)[1:swapper/0][EMI] get CEN_EMI_BASE @ ffffff8009ac4000
<6>[    0.139815]  (1)[1:swapper/0][EMI] get CHA_EMI_BASE @ ffffff8009ac6000
<6>[    0.139824]  (1)[1:swapper/0][EMI] get EMI_MPU_BASE @ ffffff8009ac8000
<6>[    0.140028]  (1)[1:swapper/0]get INFRA_AO_BASE@ ffffff8009aca000
<6>[    0.140229]  (1)[1:swapper/0][EMI] fail to register elm_irq
<6>[    0.155932]  (1)[1:swapper/0][DISP]Set Option 0(DISP_OPT_USE_CMDQ) from (0) to (1)
<6>[    0.155959]  (1)[1:swapper/0][DISP]After set (DISP_OPT_USE_CMDQ) is (1)
<6>[    0.155972]  (1)[1:swapper/0][DISP]Set Option 1(DISP_OPT_USE_M4U) from (0) to (1)
<6>[    0.155985]  (1)[1:swapper/0][DISP]After set (DISP_OPT_USE_M4U) is (1)
<6>[    0.155999]  (1)[1:swapper/0][DISP]Set Option 9(DISP_OPT_DYNAMIC_SWITCH_UNDERFLOW_EN) from (0) to (0)
<6>[    0.156012]  (1)[1:swapper/0][DISP]After set (DISP_OPT_DYNAMIC_SWITCH_UNDERFLOW_EN) is (0)
<6>[    0.156025]  (1)[1:swapper/0][DISP]Set Option 8(DISP_OPT_OVL_WARM_RESET) from (0) to (0)
<6>[    0.156038]  (1)[1:swapper/0][DISP]After set (DISP_OPT_OVL_WARM_RESET) is (0)
<6>[    0.156051]  (1)[1:swapper/0][DISP]Set Option 10(DISP_OPT_SODI_SUPPORT) from (0) to (1)
<6>[    0.156064]  (1)[1:swapper/0][DISP]After set (DISP_OPT_SODI_SUPPORT) is (1)
<6>[    0.156077]  (1)[1:swapper/0][DISP]Set Option 11(DISP_OPT_IDLE_MGR) from (0) to (1)
<6>[    0.156090]  (1)[1:swapper/0][DISP]After set (DISP_OPT_IDLE_MGR) is (1)
<6>[    0.156102]  (1)[1:swapper/0][DISP]Set Option 12(DISP_OPT_IDLEMGR_SWTCH_DECOUPLE) from (0) to (1)
<6>[    0.156116]  (1)[1:swapper/0][DISP]After set (DISP_OPT_IDLEMGR_SWTCH_DECOUPLE) is (1)
<6>[    0.156128]  (1)[1:swapper/0][DISP]Set Option 14(DISP_OPT_SHARE_SRAM) from (0) to (1)
<6>[    0.156141]  (1)[1:swapper/0][DISP]After set (DISP_OPT_SHARE_SRAM) is (1)
<6>[    0.156154]  (1)[1:swapper/0][DISP]Set Option 17(DISP_OPT_IDLEMGR_DISABLE_ROUTINE_IRQ) from (0) to (1)
<6>[    0.156168]  (1)[1:swapper/0][DISP]After set (DISP_OPT_IDLEMGR_DISABLE_ROUTINE_IRQ) is (1)
<6>[    0.156181]  (1)[1:swapper/0][DISP]Set Option 13(DISP_OPT_IDLEMGR_ENTER_ULPS) from (0) to (0)
<6>[    0.156194]  (1)[1:swapper/0][DISP]After set (DISP_OPT_IDLEMGR_ENTER_ULPS) is (0)
<6>[    0.156206]  (1)[1:swapper/0][DISP]Set Option 15(DISP_OPT_DYNAMIC_SWITCH_MMSYSCLK) from (0) to (0)
<6>[    0.156219]  (1)[1:swapper/0][DISP]After set (DISP_OPT_DYNAMIC_SWITCH_MMSYSCLK) is (0)
<6>[    0.156233]  (1)[1:swapper/0][DISP]Set Option 16(DISP_OPT_DYNAMIC_RDMA_GOLDEN_SETTING) from (0) to (1)
<6>[    0.156246]  (1)[1:swapper/0][DISP]After set (DISP_OPT_DYNAMIC_RDMA_GOLDEN_SETTING) is (1)
<6>[    0.156259]  (1)[1:swapper/0][DISP]Set Option 18(DISP_OPT_MET_LOG) from (0) to (0)
<6>[    0.156272]  (1)[1:swapper/0][DISP]After set (DISP_OPT_MET_LOG) is (0)
<6>[    0.156285]  (1)[1:swapper/0][DISP]Set Option 25(DISP_OPT_PRESENT_FENCE) from (0) to (1)
<6>[    0.156298]  (1)[1:swapper/0][DISP]After set (DISP_OPT_PRESENT_FENCE) is (1)
<6>[    0.156311]  (1)[1:swapper/0][DISP]Set Option 20(DISP_OPT_NO_LCM_FOR_LOW_POWER_MEASUREMENT) from (0) to (0)
<6>[    0.156324]  (1)[1:swapper/0][DISP]After set (DISP_OPT_NO_LCM_FOR_LOW_POWER_MEASUREMENT) is (0)
<6>[    0.156337]  (1)[1:swapper/0][DISP]Set Option 19(DISP_OPT_DECOUPLE_MODE_USE_RGB565) from (0) to (0)
<6>[    0.156350]  (1)[1:swapper/0][DISP]After set (DISP_OPT_DECOUPLE_MODE_USE_RGB565) is (0)
<6>[    0.156363]  (1)[1:swapper/0][DISP]Set Option 22(DISP_OPT_BYPASS_PQ) from (0) to (0)
<6>[    0.156376]  (1)[1:swapper/0][DISP]After set (DISP_OPT_BYPASS_PQ) is (0)
<6>[    0.156389]  (1)[1:swapper/0][DISP]Set Option 28(DISP_OPT_MUTEX_EOF_EN_FOR_CMD_MODE) from (0) to (0)
<6>[    0.156403]  (1)[1:swapper/0][DISP]After set (DISP_OPT_MUTEX_EOF_EN_FOR_CMD_MODE) is (0)
<6>[    0.156416]  (1)[1:swapper/0][DISP]Set Option 23(DISP_OPT_ESD_CHECK_RECOVERY) from (0) to (1)
<6>[    0.156429]  (1)[1:swapper/0][DISP]After set (DISP_OPT_ESD_CHECK_RECOVERY) is (1)
<6>[    0.156442]  (1)[1:swapper/0][DISP]Set Option 24(DISP_OPT_ESD_CHECK_SWITCH) from (0) to (1)
<6>[    0.156455]  (1)[1:swapper/0][DISP]After set (DISP_OPT_ESD_CHECK_SWITCH) is (1)
<6>[    0.156468]  (1)[1:swapper/0][DISP]Set Option 30(DISP_OPT_BYPASS_OVL) from (0) to (1)
<6>[    0.156480]  (1)[1:swapper/0][DISP]After set (DISP_OPT_BYPASS_OVL) is (1)
<6>[    0.156494]  (1)[1:swapper/0][DISP]Set Option 31(DISP_OPT_FPS_CALC_WND) from (0) to (10)
<6>[    0.156507]  (1)[1:swapper/0][DISP]After set (DISP_OPT_FPS_CALC_WND) is (10)
<6>[    0.156520]  (1)[1:swapper/0][DISP]Set Option 32(DISP_OPT_SMART_OVL) from (0) to (0)
<6>[    0.156533]  (1)[1:swapper/0][DISP]After set (DISP_OPT_SMART_OVL) is (0)
<6>[    0.156545]  (1)[1:swapper/0][DISP]Set Option 33(DISP_OPT_DYNAMIC_DEBUG) from (0) to (0)
<6>[    0.156558]  (1)[1:swapper/0][DISP]After set (DISP_OPT_DYNAMIC_DEBUG) is (0)
<6>[    0.156571]  (1)[1:swapper/0][DISP]Set Option 36(DISP_OPT_HRT) from (0) to (1)
<6>[    0.156584]  (1)[1:swapper/0][DISP]After set (DISP_OPT_HRT) is (1)
<6>[    0.156597]  (1)[1:swapper/0][DISP]Set Option 38(DISP_OPT_CV_BYSUSPEND) from (0) to (0)
<6>[    0.156609]  (1)[1:swapper/0][DISP]After set (DISP_OPT_CV_BYSUSPEND) is (0)
<6>[    0.156622]  (1)[1:swapper/0][DISP]Set Option 39(DISP_OPT_DELAYED_TRIGGER) from (0) to (0)
<6>[    0.156635]  (1)[1:swapper/0][DISP]After set (DISP_OPT_DELAYED_TRIGGER) is (0)
<6>[    0.156648]  (1)[1:swapper/0][DISP]Set Option 40(DISP_OPT_SHADOW_REGISTER) from (0) to (1)
<6>[    0.156661]  (1)[1:swapper/0][DISP]After set (DISP_OPT_SHADOW_REGISTER) is (1)
<6>[    0.156674]  (1)[1:swapper/0][DISP]Set Option 41(DISP_OPT_SHADOW_MODE) from (0) to (2)
<6>[    0.156686]  (1)[1:swapper/0][DISP]After set (DISP_OPT_SHADOW_MODE) is (2)
<6>[    0.156699]  (1)[1:swapper/0][DISP]Set Option 42(DISP_OPT_OVL_EXT_LAYER) from (0) to (1)
<6>[    0.156712]  (1)[1:swapper/0][DISP]After set (DISP_OPT_OVL_EXT_LAYER) is (1)
<6>[    0.156725]  (1)[1:swapper/0][DISP]Set Option 43(DISP_OPT_REG_PARSER_RAW_DUMP) from (0) to (0)
<6>[    0.156738]  (1)[1:swapper/0][DISP]After set (DISP_OPT_REG_PARSER_RAW_DUMP) is (0)
<6>[    0.156751]  (1)[1:swapper/0][DISP]Set Option 44(DISP_OPT_AOD) from (0) to (0)
<6>[    0.156763]  (1)[1:swapper/0][DISP]After set (DISP_OPT_AOD) is (0)
<6>[    0.156775]  (1)[1:swapper/0][DISP]Set Option 45(DISP_OPT_RSZ) from (0) to (0)
<6>[    0.156788]  (1)[1:swapper/0][DISP]After set (DISP_OPT_RSZ) is (0)
<6>[    0.156800]  (1)[1:swapper/0][DISP]Set Option 46(DISP_OPT_DUAL_PIPE) from (0) to (0)
<6>[    0.156813]  (1)[1:swapper/0][DISP]After set (DISP_OPT_DUAL_PIPE) is (0)
<6>[    0.156826]  (1)[1:swapper/0][DISP]Set Option 47(DISP_OPT_ARR_PHASE_1) from (0) to (0)
<6>[    0.156838]  (1)[1:swapper/0][DISP]After set (DISP_OPT_ARR_PHASE_1) is (0)
<6>[    0.156851]  (1)[1:swapper/0][DISP]Set Option 48(DISP_OPT_GMO_OPTIMIZE) from (0) to (1)
<6>[    0.156864]  (1)[1:swapper/0][DISP]After set (DISP_OPT_GMO_OPTIMIZE) is (1)
<6>[    0.156877]  (1)[1:swapper/0][DISP]Set Option 49(DISP_OPT_MIRROR_MODE_FROCE_DISABLE_SODI) from (0) to (0)
<6>[    0.156890]  (1)[1:swapper/0][DISP]After set (DISP_OPT_MIRROR_MODE_FROCE_DISABLE_SODI) is (0)
<6>[    0.156901]  (1)[1:swapper/0][DDP/ddp_drv]warn:DT disp clk parse beign
<6>[    0.156912]  (1)[1:swapper/0][DDP/ddp_drv]warn:DISPSYS get clock CLK_MM_MTCMOS
<6>[    0.156939]  (1)[1:swapper/0][DDP/]warn:ddp_clk[0] ffffffc03f7d0500
<6>[    0.156952]  (1)[1:swapper/0][DDP/ddp_drv]warn:DISPSYS get clock CLK_MM_SMI_COMMON
<6>[    0.157067]  (1)[1:swapper/0][DDP/]warn:ddp_clk[1] ffffffc03f7d0600
<6>[    0.157079]  (1)[1:swapper/0][DDP/ddp_drv]warn:DISPSYS get clock CLK_MM_SMI_LARB0
<6>[    0.157170]  (1)[1:swapper/0][DDP/]warn:ddp_clk[2] ffffffc03f7d0700
<6>[    0.157185]  (1)[1:swapper/0][DDP/ddp_drv]warn:DISPSYS get clock CLK_MM_GALS_COMM0
<6>[    0.157256]  (1)[1:swapper/0][DDP/]warn:ddp_clk[3] ffffffc03f7d0800
<6>[    0.157268]  (1)[1:swapper/0][DDP/ddp_drv]warn:DISPSYS get clock CLK_MM_GALS_COMM1
<6>[    0.157353]  (1)[1:swapper/0][DDP/]warn:ddp_clk[4] ffffffc03f7d0900
<6>[    0.157365]  (1)[1:swapper/0][DDP/ddp_drv]warn:DISPSYS get clock CLK_MM_DISP_OVL0
<6>[    0.157466]  (1)[1:swapper/0][DDP/]warn:ddp_clk[5] ffffffc03f7d0a00
<6>[    0.157478]  (1)[1:swapper/0][DDP/ddp_drv]warn:DISPSYS get clock CLK_MM_DISP_RDMA0
<6>[    0.157595]  (1)[1:swapper/0][DDP/]warn:ddp_clk[6] ffffffc03f7d0b00
<6>[    0.157607]  (1)[1:swapper/0][DDP/ddp_drv]warn:DISPSYS get clock CLK_MM_DISP_WDMA0
<6>[    0.157740]  (1)[1:swapper/0][DDP/]warn:ddp_clk[7] ffffffc03f7d0c00
<6>[    0.157752]  (1)[1:swapper/0][DDP/ddp_drv]warn:DISPSYS get clock CLK_MM_DISP_COLOR0
<6>[    0.157902]  (1)[1:swapper/0][DDP/]warn:ddp_clk[8] ffffffc03f7d0d00
<6>[    0.157914]  (1)[1:swapper/0][DDP/ddp_drv]warn:DISPSYS get clock CLK_MM_DISP_CCORR0
<6>[    0.158080]  (1)[1:swapper/0][DDP/]warn:ddp_clk[9] ffffffc03f7d0e00
<6>[    0.158092]  (1)[1:swapper/0][DDP/ddp_drv]warn:DISPSYS get clock CLK_MM_DISP_AAL0
<6>[    0.158275]  (1)[1:swapper/0][DDP/]warn:ddp_clk[10] ffffffc03f7d0f00
<6>[    0.158287]  (1)[1:swapper/0][DDP/ddp_drv]warn:DISPSYS get clock CLK_MM_DISP_GAMMA0
<6>[    0.158492]  (1)[1:swapper/0][DDP/]warn:ddp_clk[11] ffffffc03f7d3000
<6>[    0.158504]  (1)[1:swapper/0][DDP/ddp_drv]warn:DISPSYS get clock CLK_MM_DISP_DITHER0
<6>[    0.158720]  (1)[1:swapper/0][DDP/]warn:ddp_clk[12] ffffffc03f7d3100
<6>[    0.158732]  (1)[1:swapper/0][DDP/ddp_drv]warn:DISPSYS get clock CLK_MM_DSI_MM_CLOCK
<6>[    0.158964]  (1)[1:swapper/0][DDP/]warn:ddp_clk[13] ffffffc03f7d3200
<6>[    0.158976]  (1)[1:swapper/0][DDP/ddp_drv]warn:DISPSYS get clock CLK_MM_DSI_INTERF
<6>[    0.159225]  (1)[1:swapper/0][DDP/]warn:ddp_clk[14] ffffffc03f7d3300
<6>[    0.159237]  (1)[1:swapper/0][DDP/ddp_drv]warn:DISPSYS get clock CLK_MM_F26M_HRT
<6>[    0.159502]  (1)[1:swapper/0][DDP/]warn:ddp_clk[15] ffffffc03f7d3400
<6>[    0.159514]  (1)[1:swapper/0][DDP/ddp_drv]warn:DISPSYS get clock MDP_WROT0
<6>[    0.159794]  (1)[1:swapper/0][DDP/]warn:ddp_clk[16] ffffffc03f7d3500
<6>[    0.159806]  (1)[1:swapper/0][DDP/ddp_drv]warn:DISPSYS get clock DISP_PWM
<6>[    0.160090]  (1)[1:swapper/0][DDP/]warn:ddp_clk[17] ffffffc03f7d3600
<6>[    0.160102]  (1)[1:swapper/0][DDP/ddp_drv]warn:DISPSYS get clock MUX_PWM
<6>[    0.160388]  (1)[1:swapper/0][DDP/]warn:ddp_clk[18] ffffffc03f7d3700
<6>[    0.160400]  (1)[1:swapper/0][DDP/ddp_drv]warn:DISPSYS get clock CLK26M
<6>[    0.160687]  (1)[1:swapper/0][DDP/]warn:ddp_clk[19] ffffffc03f7d3800
<6>[    0.160699]  (1)[1:swapper/0][DDP/ddp_drv]warn:DISPSYS get clock UNIVPLL2_D4
<6>[    0.160987]  (1)[1:swapper/0][DDP/]warn:ddp_clk[20] ffffffc03f7d3900
<6>[    0.160999]  (1)[1:swapper/0][DDP/ddp_drv]warn:DISPSYS get clock UNIVPLL2_D8
<6>[    0.161307]  (1)[1:swapper/0][DDP/]warn:ddp_clk[21] ffffffc03f7d3a00
<6>[    0.161320]  (1)[1:swapper/0][DDP/ddp_drv]warn:DISPSYS get clock UNIVPLL3_D8
<6>[    0.161612]  (1)[1:swapper/0][DDP/]warn:ddp_clk[22] ffffffc03f7d3b00
<6>[    0.161623]  (1)[1:swapper/0][DDP/ddp_drv]warn:DT disp clk parse end
<3>[    0.166675]  (1)[1:swapper/0]BOOTPROF:       166.673692:initcall: arm64_device_init    38.765077ms
<4>[    0.166712]  (1)[1:swapper/0][pid=1]g_mmdvfs_step_util init
<5>[    0.168589]  (1)[1:swapper/0][SMI]error: smi reg clk cb call fail
<5>[    0.168612]  (1)[1:swapper/0]AEE kernel warning: </home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/smi/mtk-smi.c:1110> error: smi reg clk cb call fail
<3>[    0.168997]  (1)[1:swapper/0]systracker probe
<3>[    0.169021]  (1)[1:swapper/0]of_iomap for systracker @ 0xffffff8009adc000
<3>[    0.169037]  (1)[1:swapper/0][systracker] bus_dbg_con is in infra_ao
<3>[    0.169065]  (1)[1:swapper/0]systracker_platform_probe_default:113: irq # 223
<3>[    0.187141]  (1)[1:swapper/0]BOOTPROF:       187.140076:initcall: param_sysfs_init    16.234923ms
<6>[    0.194085]  (1)[1:swapper/0][cpu_ntf] <00>ffffff80083137f0 (blk_cpu_notify)
<6>[    0.194121]  (1)[1:swapper/0][cpu_ntf] <00>ffffff8008313eb8 (blk_iopoll_cpu_notify)
<6>[    0.194142]  (1)[1:swapper/0][cpu_ntf] <00>ffffff8008319b18 (blk_mq_main_cpu_notify)
<6>[    0.194156]  (1)[1:swapper/0][cpu_ntf] <00>ffffff8008316fa0 (blk_mq_queue_reinit_notify)
<6>[    0.194872]  (0)[1:swapper/0][M4U] m4u_probe 2, of_iomap: 0xffffff8009ae2000, irq_num: 221, pDev: ffffffc03f737c10
<6>[    0.194975]  (0)[1:swapper/0][M4U] 4G DRAM Mode is: 0
<6>[    0.194986]  (0)[1:swapper/0][M4U] protect memory va=0xffffffc0323a5d00, pa=0x723a5d00.
<6>[    0.194997]  (0)[1:swapper/0][M4U] m4u_reg_init, ProtectPA = 0x723a5d00
<6>[    0.195342]  (0)[1:swapper/0][M4U] m4u write all port domain to 4
<6>[    0.195642]  (0)[1:swapper/0][M4U] m4u write all port domain to 4
<6>[    0.195883]  (0)[1:swapper/0][M4U] m4u write all port domain to 4
<6>[    0.195919]  (0)[1:swapper/0][M4U] m4u hw init id = 0, base address: 0xffffff8009ae2000, pgd_pa: 0x7f04c000
<6>[    0.195935]  (0)[1:swapper/0][M4U] m4u inorder setting: 0x0
<6>[    0.195948]  (0)[1:swapper/0][M4U] mau_start_monitor [0], start=0x0, end=0xfffff, write: 1, port_mask=0xffffffff, larb_mask=0xffffffff
<6>[    0.195965]  (0)[1:swapper/0][M4U] mau_start_monitor [1], start=0x0, end=0xfffff, write: 0, port_mask=0xffffffff, larb_mask=0xffffffff
<6>[    0.196055]  (0)[1:swapper/0][M4U] request_irq, irq_num=221
<5>[    0.196673]  (0)[1:swapper/0][CMDQ]Register 1 monitor task CB (cmdq_mdp_start_task_atomic_virtual,cmdq_mdp_finish_task_atomic_virtual)
<5>[    0.197134]  (0)[1:swapper/0][CMDQ][CMDQ] platform_dev dev:ffffffc03f758410 PA:0x0000000010228000 VA:ffffff8009af0000 irqId:234 irqSecId:235 clk gce:0xffffffc0323b0500 timer:0xffffffc0323b0600
<5>[    0.197155]  (0)[1:swapper/0][CMDQ]set dma mask result: 0
<5>[    0.197289]  (0)[1:swapper/0][CMDQ]DEV: VA ref(mmsys_config): 0xffffff8009af6000
<5>[    0.197341]  (0)[1:swapper/0][CMDQ]DEV: VA ref(mdp_rdma0): 0xffffff8009af8000
<5>[    0.197382]  (0)[1:swapper/0][CMDQ]DEV: VA ref(mdp_rsz0): 0xffffff8009afa000
<5>[    0.197423]  (0)[1:swapper/0][CMDQ]DEV: VA ref(mdp_rsz1): 0xffffff8009afc000
<5>[    0.197464]  (0)[1:swapper/0][CMDQ]DEV: VA ref(mdp_wdma0): 0xffffff8009afe000
<5>[    0.197504]  (0)[1:swapper/0][CMDQ]DEV: VA ref(mdp_wrot0): 0xffffff8009b00000
<5>[    0.197544]  (0)[1:swapper/0][CMDQ]DEV: VA ref(mdp_tdshp0): 0xffffff8009b02000
<5>[    0.197559]  (0)[1:swapper/0][CMDQ][ERR]DEV: cannot parse node name:venc
<5>[    0.199382]  (0)[1:swapper/0][CMDQ]DEV: PA ref(mm_mutex): start = 0x0000000014001000
<5>[    0.199406]  (0)[1:swapper/0][CMDQ]free CPR size:128 thread:16
<5>[    0.201029]  (1)[1:swapper/0][CMDQ]SRAM Chunk New-32bit unit: start: 0x0, count: 64, Name: Fake SPR
<5>[    0.201057]  (1)[1:swapper/0][CMDQ]CPR for thread allocated, thread:16 free:256
<5>[    0.201070]  (1)[1:swapper/0][CMDQ]SRAM Chunk New-32bit unit: start: 0x40, count: 10, Name: Delay CPR
<5>[    0.202493]  (1)[1:swapper/0][ccci0/util]opt_md2_support using default
<5>[    0.202618]  (1)[1:swapper/0][ccci0/util]opt_md5_support using default
<5>[    0.202718]  (1)[1:swapper/0][ccci0/util]opt_irat_support using default
<1>[    0.203232]  (1)[1:swapper/0][PHY layout]ccci_md0 at LK  :  0x62000000 - 0x69dfffff  (0x7e00000)
<6>[    0.209177]  (1)[1:swapper/0]Freeing modem memory: 29888K from phys 672d0000
<6>[    0.209201]  (1)[1:swapper/0]free_reserved_memory: 0x672d0000 ~ 0x69000000
<6>[    0.214952]  (1)[1:swapper/0]Freeing modem memory: 29056K from phys 64da0000
<6>[    0.214974]  (1)[1:swapper/0]free_reserved_memory: 0x64da0000 ~ 0x66a00000
<6>[    0.215626]  (1)[1:swapper/0]Freeing modem memory: 2496K from phys 63590000
<6>[    0.215637]  (1)[1:swapper/0]free_reserved_memory: 0x63590000 ~ 0x63800000
<6>[    0.215967]  (1)[1:swapper/0]Freeing modem memory: 832K from phys 63430000
<6>[    0.215976]  (1)[1:swapper/0]free_reserved_memory: 0x63430000 ~ 0x63500000
<6>[    0.216156]  (1)[1:swapper/0]Freeing modem memory: 64K from phys 67290000
<6>[    0.216166]  (1)[1:swapper/0]free_reserved_memory: 0x67290000 ~ 0x672a0000
<6>[    0.241775]  (1)[1:swapper/0]Freeing modem memory: 133120K from phys 69e00000
<6>[    0.241797]  (1)[1:swapper/0]free_reserved_memory: 0x69e00000 ~ 0x72000000
<1>[    0.242300]  (1)[1:swapper/0][PHY layout]ccci_share_mem at LK  :  0x72000000 - 0x720fffff  (0x100000)
<5>[    0.242374]  (1)[1:swapper/0][ccci0/util]Using default META MD setting[0][0]
<3>[    0.242764]  (1)[1:swapper/0]BOOTPROF:       242.764153:initcall: ccci_util_init    40.953846ms
<3>[    0.243675]  (1)[1:swapper/0][CONN-MD-DFT][I]conn_md_init:init message queue list succeed
<3>[    0.243694]  (1)[1:swapper/0][CONN-MD-DFT][I]conn_md_init:init active queue list succeed
<3>[    0.243706]  (1)[1:swapper/0][CONN-MD-DFT][I]conn_md_init:init user information list succeed
<3>[    0.243765]  (1)[1:swapper/0][CONN_MD_DMP][I]conn_md_dmp_init:alloc memory for msg log system done, size:0x00000430
<3>[    0.243777]  (1)[1:swapper/0][CONN-MD-DFT][I]conn_md_init:conn_md_dmp_init succeed
<3>[    0.243854]  (1)[1:swapper/0][CONN-MD-DFT][I]conn_md_init:create conn_md_thread succeed, wakeup it
<6>[    0.243882]  (1)[1:swapper/0]Init Richtek RegMap 1.1.13_G
<5>[    0.244206]  (1)[1:swapper/0]SCSI subsystem initialized
<6>[    0.244340]  (1)[1:swapper/0]usbcore: registered new interface driver usbfs
<6>[    0.244391]  (1)[1:swapper/0]usbcore: registered new interface driver hub
<6>[    0.244502]  (1)[1:swapper/0]usbcore: registered new device driver usb
<6>[    0.246199]  (1)[1:swapper/0]mt_charger_probe
<6>[    0.246492]  (1)[1:swapper/0]Advanced Linux Sound Architecture Driver Initialized.
<6>[    0.246921]  (1)[1:swapper/0][cpu_ntf] <00>ffffff8008938328 (dev_cpu_callback)
<4>[    0.247326]  (1)[1:swapper/0]------------[ cut here ]------------
<4>[    0.247338]  (1)[1:swapper/0]WARNING: CPU: 1 PID: 1 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/net/wireless/reg.c:523 regulatory_init+0xc8/0x164()
<4>[    0.247357]  (1)[1:swapper/0]db.txt is empty, you should update it...
<4>[    0.247362] Modules linked in: (1)[1:swapper/0]
<4>[    0.247381] -(1)[1:swapper/0]CPU: 1 PID: 1 Comm: swapper/0 Tainted: G        W       4.4.95+ #1
<4>[    0.247393] -(1)[1:swapper/0]Hardware name: MT6739CW (DT)
<4>[    0.247404] -(1)[1:swapper/0]Call trace:
<4>[    0.247411] -(1)[1:swapper/0][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[    0.247428] -(1)[1:swapper/0][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[    0.247441] -(1)[1:swapper/0][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[    0.247455] -(1)[1:swapper/0][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[    0.247470] -(1)[1:swapper/0][<ffffff800809fb14>] warn_slowpath_fmt+0x5c/0x7c
<4>[    0.247483] -(1)[1:swapper/0][<ffffff8008f4fd00>] regulatory_init+0xc8/0x164
<4>[    0.247495] -(1)[1:swapper/0][<ffffff8008f4fbbc>] cfg80211_init+0x70/0xec
<4>[    0.247506] -(1)[1:swapper/0][<ffffff8008081c88>] do_one_initcall+0x94/0x1e4
<4>[    0.247518] -(1)[1:swapper/0][<ffffff8008ef4c70>] kernel_init_freeable+0x228/0x22c
<4>[    0.247532] -(1)[1:swapper/0][<ffffff8008ac25d0>] kernel_init+0x10/0x104
<4>[    0.247546] -(1)[1:swapper/0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    0.247558]  (1)[1:swapper/0]---[ end trace e335f74a8dfe3603 ]---
<6>[    0.248823]  (3)[1:swapper/0][cpu_ntf] <00>ffffff80080f1e10 (cpu_hotplug_handler)
<6>[    0.248910]  (3)[1:swapper/0]clocksource: Switched to clocksource arch_sys_counter
<3>[    0.261287]  (1)[51:kworker/1:1]power_supply charger: driver failed to report `charge_type' property: -22
<3>[    0.278504]  (3)[1:swapper/0]BOOTPROF:       278.503692:initcall: event_trace_init    26.365538ms
<6>[    0.281968]  (3)[1:swapper/0][regulator_register] pass to register vs1, min_uV:1200000 max_uV:2200000
<6>[    0.282172]  (3)[1:swapper/0][regulator_register] pass to register vmodem, min_uV:500000 max_uV:1193750
<6>[    0.282353]  (3)[1:swapper/0][regulator_register] pass to register vcore, min_uV:518750 max_uV:1312500
<6>[    0.282537]  (3)[1:swapper/0][regulator_register] pass to register vproc, min_uV:518750 max_uV:1312500
<6>[    0.282718]  (3)[1:swapper/0][regulator_register] pass to register vpa, min_uV:500000 max_uV:3650000
<5>[    0.289439]  (3)[1:swapper/0][mt6357_get_auxadc_value] ch_idx = 2, channel = 3, bat_cur = 0, reg_val = 0x5f1, adc_result = 668
<6>[    0.289577]  (3)[1:swapper/0]****[mt6357_auxadc_init] DONE, BAT TEMP = 668, MTS_ADC = 0x39b9
<6>[    0.289863]  (3)[1:swapper/0]Get car_tune_value from DT: 1000
<6>[    0.289877]  (3)[1:swapper/0]Get r_fg_value from DT: 100
<6>[    0.289885]  (3)[1:swapper/0]Get default UNIT_FGCURRENT= 314331
<6>[    0.289897]  (3)[1:swapper/0][lbat_service_init]
<6>[    0.290042]  (3)[1:swapper/0][lbat_user_register] hv=3400, lv1=3250, lv2=3100
<5>[    0.290095]  (3)[1:swapper/0]AUXADC_LBAT_VOLT_MAX = 0x0, AUXADC_LBAT_VOLT_MIN = 0x9a1, RG_INT_EN_BAT_H = 0, RG_INT_EN_BAT_L = 1
<5>[    0.290122]  (3)[1:swapper/0]AUXADC_LBAT_EN_MAX = 0, AUXADC_LBAT_IRQ_EN_MAX = 0, AUXADC_LBAT_EN_MIN = 1, AUXADC_LBAT_IRQ_EN_MIN = 1
<5>[    0.290140]  (3)[1:swapper/0]AUXADC_LBAT_DEBT_MAX=10, AUXADC_LBAT_DEBT_MIN=0
<6>[    0.290150]  (3)[1:swapper/0][low_battery_protect_init] 3400 mV, 3250 mV, 3100 mV Done
<6>[    0.290194]  (3)[1:swapper/0]FG_CUR_HTH = 0xc8e4, FG_CUR_LTH = 0xbf18, RG_INT_EN_FG_CUR_H = 0, RG_INT_EN_FG_CUR_L = 1
<6>[    0.290206]  (3)[1:swapper/0][battery_oc_protect_init] 4670 mA, 5500 mA
<6>[    0.290215]  (3)[1:swapper/0][battery_oc_protect_init] Done
<6>[    0.290290]  (3)[1:swapper/0]Create bat_percent_notify_thread : done
<6>[    0.290368]  (3)[1:swapper/0]Create dlpt_notify_thread : done
<6>[    0.290392]  (3)[1:swapper/0]POWER_UVLO_VOLT_LEVEL = 2600, RG_UVLO_VTHL = 0x2
<6>[    0.290945]  (3)[1:swapper/0] pimix = 228
<5>[    0.290963]  (3)[1:swapper/0][MUSB]usb20_init 1671: usb20 init
<5>[    0.291544]  (3)[1:swapper/0][MUSB]mt_usb_probe 1588: init connection_work and idle_work
<5>[    0.291559]  (3)[1:swapper/0][MUSB]mt_usb_probe 1592: keep musb->power & mtk_usb_power in the samae value
<5>[    0.291678]  (3)[1:swapper/0][MUSB]mt_usb_probe 1626: USB probe done!
<5>[    0.291985]  (3)[1:swapper/0][MUSB]usb20_init 1686: usb20 init ret:0
<7>[    0.292012]  (3)[1:swapper/0][BLOCK_TAG] DRAM: 0x0000000040000000 - 0x00000000c0000000, size: 0x80000000
<3>[    0.292439]  (3)[1:swapper/0][ION]ion_init()
<3>[    0.292857]  (3)[1:swapper/0][ION]ion_drv_probe() heap_nr=9
<3>[    0.293041]  (3)[1:swapper/0]ion_heap_create: Heap type is disabled: 1
<3>[    0.293053]  (3)[1:swapper/0]ion_mtk_heap_create: error creating heap ion_system_contig_heap type 1 base 0 size 0
<3>[    0.293478]  (3)[1:swapper/0][ION]ion_sec_heap_create error: not support
<3>[    0.293493]  (3)[1:swapper/0]ion_mtk_heap_create: error creating heap ion_sec_heap type 13 base 0 size 0
<3>[    0.293505]  (3)[1:swapper/0][ION]ion_sec_heap_create error: not support
<3>[    0.293514]  (3)[1:swapper/0]ion_mtk_heap_create: error creating heap ion_sec_heap_prot type 13 base 0 size 0
<3>[    0.293525]  (3)[1:swapper/0][ION]ion_sec_heap_create error: not support
<3>[    0.293533]  (3)[1:swapper/0]ion_mtk_heap_create: error creating heap ion_sec_heap_2d_fr type 13 base 0 size 0
<3>[    0.293544]  (3)[1:swapper/0][ION]ion_sec_heap_create error: not support
<3>[    0.293553]  (3)[1:swapper/0]ion_mtk_heap_create: error creating heap ion_sec_heap_wfd type 13 base 0 size 0
<3>[    0.294002]  (3)[1:swapper/0][ION]ion_init fd register notifer fail
<6>[    0.294140]  (3)[1:swapper/0]NET: Registered protocol family 2
<6>[    0.294645]  (3)[1:swapper/0]TCP established hash table entries: 16384 (order: 5, 131072 bytes)
<6>[    0.294810]  (3)[1:swapper/0]TCP bind hash table entries: 16384 (order: 6, 262144 bytes)
<6>[    0.295089]  (3)[1:swapper/0]TCP: Hash tables configured (established 16384 bind 16384)
<6>[    0.295164]  (3)[1:swapper/0]UDP hash table entries: 1024 (order: 3, 32768 bytes)
<6>[    0.295227]  (3)[1:swapper/0]UDP-Lite hash table entries: 1024 (order: 3, 32768 bytes)
<6>[    0.295479]  (3)[1:swapper/0]NET: Registered protocol family 1
<6>[    0.296049]  (3)[1:swapper/0][Power/clkbuf]clk_buf_dump_dts_log: PMIC_CLK_BUF?_STATUS=2 1 1 2 0 0 0
<6>[    0.296066]  (3)[1:swapper/0][Power/clkbuf]clk_buf_dump_dts_log: PMIC_CLK_BUF?_DRV_CURR=-1 -1 -1 -1 -1 -1 -1
<6>[    0.296132]  (3)[1:swapper/0][Power/clkbuf]clk_buf_dump_clkbuf_log DCXO_CW00/02/11/13/14/15/16/20/top_spi_con1=0x4e1d 3aee 8000 98e9 82b5 a2aa 9455 11 0
<6>[    0.296169]  (3)[1:swapper/0][Power/clkbuf]clk_buf_ctrl_internal: id=2, onoff=1, DCXO_ENABLE=0x3, pwrap_dcxo_en_flag=0x3
<6>[    0.296425]  (3)[1:swapper/0]Unpacking initramfs...
<6>[    0.349252]  (3)[1:swapper/0]Freeing initrd memory: 1108K
<3>[    0.349295]  (3)[1:swapper/0]BOOTPROF:       349.295154:initcall: populate_rootfs    53.091231ms
<6>[    0.350418]  (3)[1:swapper/0][cpu_ntf] <00>ffffff8008883464 (cpu_pmu_notify)
<6>[    0.350463]  (3)[1:swapper/0]hw perfevents: enabled with armv8_pmuv3 PMU driver, 7 counters available
<6>[    0.353488]  (3)[1:swapper/0]audit: initializing netlink subsys (disabled)
<5>[    0.353570]  (3)[1:swapper/0]audit: type=2000 audit(0.348:1): initialized
<6>[    0.354003]  (3)[1:swapper/0][cpu_ntf] <00>ffffff8008185afc (cpu_callback)
<5>[    0.359522]  (3)[1:swapper/0]VFS: Disk quotas dquot_6.6.0
<6>[    0.359657]  (3)[1:swapper/0]VFS: Dquot-cache hash table entries: 512 (order 0, 4096 bytes)
<6>[    0.360829]  (3)[1:swapper/0]Registering sdcardfs 0.1
<6>[    0.361151]  (3)[1:swapper/0]fuse init (API version 7.23)
<7>[    0.361612]  (3)[1:swapper/0]SELinux:  Registering netfilter hooks
<6>[    0.365403]  (3)[1:swapper/0]io scheduler noop registered
<6>[    0.365434]  (3)[1:swapper/0]io scheduler deadline registered
<6>[    0.365664]  (3)[1:swapper/0]io scheduler cfq registered (default)
<6>[    0.365724]  (3)[1:swapper/0][cpu_ntf] <00>ffffff80083510e4 (percpu_counter_hotcpu_callback)
<6>[    0.367621]  (3)[1:swapper/0][drm] Initialized drm 1.1.0 20060810
<4>[    0.367764]  (3)[1:swapper/0]Unable to detect cache hierarchy from DT for CPU 0
<6>[    0.371306]  (3)[1:swapper/0]loop: module loaded
<6>[    0.371916]  (3)[1:swapper/0]zram: Added device: zram0
<6>[    0.371957]  (3)[1:swapper/0]Initialize EMI MPU.
<6>[    0.371968]  (3)[1:swapper/0][EMI MPU] EMI_MPUS = 0x0
<6>[    0.371977]  (3)[1:swapper/0][EMI MPU] EMI_MPUT = 0x0
<6>[    0.371985]  (3)[1:swapper/0][EMI MPU] EMI_MPUT_2ND = 0x0
<6>[    0.372366]  (3)[1:swapper/0][Power/gpufreq] @mt_gpufreq_init
<6>[    0.373235]  (3)[1:swapper/0][Power/gpufreq] @mt_gpufreq_pdrv_probe: I am 6739TW seg_code(80), fab_turbo(300000)
<3>[    0.373351]  (3)[1:swapper/0][Power/spower] 5/7/43/2/3/
<6>[    0.373384]  (3)[1:swapper/0][Power/gpufreq] setup gpufreqs table
<6>[    0.373396]  (3)[1:swapper/0][Power/gpufreq] @mt_setup_gpufreqs_table: g_cur_gpu_freq = 450000, g_cur_gpu_volt = 115000
<6>[    0.373411]  (3)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[0].gpufreq_khz = 570000
<6>[    0.373421]  (3)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[0].gpufreq_volt = 115000
<6>[    0.373430]  (3)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[0].gpufreq_power = 350
<6>[    0.373440]  (3)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[1].gpufreq_khz = 482500
<6>[    0.373450]  (3)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[1].gpufreq_volt = 111875
<6>[    0.373459]  (3)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[1].gpufreq_power = 276
<6>[    0.373469]  (3)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[2].gpufreq_khz = 395000
<6>[    0.373478]  (3)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[2].gpufreq_volt = 108750
<6>[    0.373487]  (3)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[2].gpufreq_power = 213
<6>[    0.373497]  (3)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[3].gpufreq_khz = 290000
<6>[    0.373506]  (3)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[3].gpufreq_volt = 105000
<6>[    0.373515]  (3)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[3].gpufreq_power = 144
<2>[    0.373735]  (3)[1:swapper/0][PBM] feature_en: 1, pbm_drv_done: 0
<6>[    0.373748]  (3)[1:swapper/0][Power/gpufreq] GPU current frequency = 570000KHz
<6>[    0.373761]  (3)[1:swapper/0][Power/gpufreq] Current Vproc = 1150mV
<6>[    0.373770]  (3)[1:swapper/0][Power/gpufreq] g_cur_gpu_freq = 570000, g_cur_gpu_volt = 115000
<6>[    0.373780]  (3)[1:swapper/0][Power/gpufreq] g_cur_gpu_idx = 0, g_cur_gpu_OPPidx = 0
<6>[    0.373922]  (3)[1:swapper/0][register_low_battery_notify] prio_val=2
<6>[    0.373935]  (3)[1:swapper/0][register_battery_percent_notify] prio_val=2
<6>[    0.373945]  (3)[1:swapper/0][register_battery_oc_notify] prio_val=2
<6>[    0.374226]  (3)[1:swapper/0][register_dlpt_notify] prio_val=0
<2>[    0.374312]  (3)[1:swapper/0][PBM] pbm_module_init : Done
<4>[    0.374356]  (3)[1:swapper/0]Power_gs: pmic_manual_dump array malloc done
<4>[    0.374369]  (3)[1:swapper/0]Power_gs: golden setting base_remap table malloc done
<4>[    0.374620] -(3)[1:swapper/0]------------[ cut here ]------------
<4>[    0.374631] -(3)[1:swapper/0]WARNING: CPU: 3 PID: 1 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/kernel/events/core.c:3348 perf_event_read_local+0xa0/0x14c()
<4>[    0.374654] -(3)[1:swapper/0]Modules linked in:
<4>[    0.374666] -(3)[1:swapper/0]CPU: 3 PID: 1 Comm: swapper/0 Tainted: G        W       4.4.95+ #1
<4>[    0.374678] -(3)[1:swapper/0]Hardware name: MT6739CW (DT)
<4>[    0.374689] -(3)[1:swapper/0]Call trace:
<4>[    0.374696] -(3)[1:swapper/0][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[    0.374713] -(3)[1:swapper/0][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[    0.374726] -(3)[1:swapper/0][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[    0.374740] -(3)[1:swapper/0][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[    0.374755] -(3)[1:swapper/0][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[    0.374768] -(3)[1:swapper/0][<ffffff800816a8f0>] perf_event_read_local+0xa0/0x14c
<4>[    0.374780] -(3)[1:swapper/0][<ffffff8008406bc0>] ppm_cpi_pmu_enable_locked+0x7c/0x128
<4>[    0.374795] -(3)[1:swapper/0][<ffffff8008406e3c>] ppm_cpi_pmu_probe_cpu+0x1d0/0x214
<4>[    0.374806] -(3)[1:swapper/0][<ffffff8008407388>] ppm_cpi_pmu_probe+0x8c/0xa4
<4>[    0.374819] -(3)[1:swapper/0][<ffffff8008f213e0>] ppm_cpi_init+0x58/0x104
<4>[    0.374831] -(3)[1:swapper/0][<ffffff8008081c88>] do_one_initcall+0x94/0x1e4
<4>[    0.374843] -(3)[1:swapper/0][<ffffff8008ef4c70>] kernel_init_freeable+0x228/0x22c
<4>[    0.374857] -(3)[1:swapper/0][<ffffff8008ac25d0>] kernel_init+0x10/0x104
<4>[    0.374869] -(3)[1:swapper/0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    0.374882] -(3)[1:swapper/0]---[ end trace e335f74a8dfe3604 ]---
<6>[    0.375094]  (3)[1:swapper/0][cpu_ntf] <00>ffffff8008406f58 (ppm_cpi_notifier)
<5>[    0.375114]  (3)[1:swapper/0][Power/PPM] @ppm_cpi_init: CPI done! enable = 1
<5>[    0.375142]  (3)[1:swapper/0][Power/PPM] @ppm_dlpt_policy_init: register PPM_POLICY_DLPT done!
<5>[    0.375170]  (3)[1:swapper/0][Power/PPM] @ppm_sysboost_policy_init: register PPM_POLICY_SYS_BOOST done!
<5>[    0.375190]  (3)[1:swapper/0][Power/PPM] @ppm_ptpod_policy_init: register PPM_POLICY_PTPOD done!
<6>[    0.375207]  (3)[1:swapper/0][register_battery_percent_notify] prio_val=1
<6>[    0.375217]  (3)[1:swapper/0][register_battery_oc_notify] prio_val=1
<6>[    0.375226]  (3)[1:swapper/0][register_low_battery_notify] prio_val=1
<5>[    0.375235]  (3)[1:swapper/0][Power/PPM] @ppm_pwrthro_policy_init: register PPM_POLICY_PWR_THRO done!
<5>[    0.375257]  (3)[1:swapper/0][Power/PPM] @ppm_thermal_policy_init: register PPM_POLICY_THERMAL done!
<5>[    0.375288]  (3)[1:swapper/0][Power/PPM] segment = 0x80
<5>[    0.375297]  (3)[1:swapper/0][Power/PPM] @ppm_userlimit_policy_init: register PPM_POLICY_USER_LIMIT done!
<5>[    0.375320]  (3)[1:swapper/0][Power/PPM] @ppm_forcelimit_policy_init: register PPM_POLICY_FORCE_LIMIT done!
<5>[    0.375344]  (3)[1:swapper/0][Power/PPM] @ppm_ut_policy_init: register PPM_POLICY_UT done!
<1>[    0.375469]  (3)[1:swapper/0]MT_SCHED: Init complete, device major number = 246
<6>[    0.375495]  (3)[1:swapper/0][cpu_ntf] <00>ffffff8008424b64 (sched_cpu_notify)
<6>[    0.376836]  (3)[1:swapper/0]11002000.apuart0: ttyMT0 at MMIO 0x0 (irq = 6, base_baud = 1625000) is a MTK UART
<6>[    0.377159]  (3)[1:swapper/0]11003000.apuart1: ttyMT1 at MMIO 0x0 (irq = 9, base_baud = 1625000) is a MTK UART
<4>[    0.378343]  (3)[1:swapper/0]pn553_dev_init
<4>[    0.379171]  (3)[1:swapper/0]pn553_platform_probe: &pdev=ffffffc03f7f2400
<4>[    0.379185]  (3)[1:swapper/0]pn553_platform_pinctrl_init
<4>[    0.379377]  (3)[1:swapper/0]pn553_platform_pinctrl_select
<4>[    0.379498]  (3)[1:swapper/0][bert] i2c_add_driver  ret = 0 
<4>[    0.379509]  (3)[1:swapper/0]pn553_dev_init success
<4>[    0.380494]  (3)[1:swapper/0][MT AUXADC_probe3] get device tree info : start !!
<4>[    0.380610]  (3)[1:swapper/0][AUXADC_AP] find node TEMPERATURE:0
<4>[    0.380621]  (3)[1:swapper/0][AUXADC_AP] find node TEMPERATURE1:1
<4>[    0.380631]  (3)[1:swapper/0][AUXADC_AP] find node ADC_FDD_RF_PARAMS_DYNAMIC_CUSTOM_CH:12
<4>[    0.380647]  (3)[1:swapper/0][MT AUXADC_AP] adc_channel_info_init : done !!
<3>[    0.380698]  (3)[1:swapper/0]proc_create auxadc_debug_proc_fops
<6>[    0.381881]  (3)[1:swapper/0][PWM] get PWM1-main clock, ffffffc031691200
<6>[    0.381913]  (3)[1:swapper/0][PWM] get PWM2-main clock, ffffffc031691300
<6>[    0.381933]  (3)[1:swapper/0][PWM] get PWM3-main clock, ffffffc031691400
<6>[    0.381954]  (3)[1:swapper/0][PWM] get PWM4-main clock, ffffffc031691500
<6>[    0.381977]  (3)[1:swapper/0][PWM] get PWM5-main clock, ffffffc031691600
<6>[    0.382002]  (3)[1:swapper/0][PWM] get PWM6-main clock, ffffffc031691700
<6>[    0.382029]  (3)[1:swapper/0][PWM] get PWM-HCLK-main clock, ffffffc031691800
<6>[    0.382057]  (3)[1:swapper/0][PWM] get PWM-main clock, ffffffc031691900
<4>[    0.382452]  (3)[1:swapper/0]stk3x1x_init Instk3x1x_init Out
<4>[    0.387340]  (3)[1:swapper/0][Accdet]accdet_mod_init begin!
<3>[    0.387631]  (3)[1:swapper/0]mediatek-pinctrl 1000b000.pinctrl: missing pins property in node pins_cmd_dat .
<6>[    0.387661]  (3)[1:swapper/0][mt_accdet_probe]probe start..
<6>[    0.387958]  (3)[1:swapper/0]input: ACCDET as /devices/virtual/input/input0
<6>[    0.388301]  (3)[1:swapper/0][mt_accdet_probe]CONFIG_ACCDET_SUPPORT_EINT0 opened!
<6>[    0.388319]  (3)[1:swapper/0][accdet_get_dts_data]Start..
<6>[    0.388636]  (3)[1:swapper/0][accdet_get_dts_data]mid-Key = 80, up_key = 220, down_key = 400
<6>[    0.388652]  (3)[1:swapper/0][accdet_get_dts_data]pwm_width=0x500, pwm_thresh=0x500, mic_mode=2, mic_vol=6
<6>[    0.388664]  (3)[1:swapper/0][accdet_get_dts_data] deb0=0x800,deb1=0x800,deb3=0x20,deb4=0x44
<6>[    0.389130]  (3)[1:swapper/0] efusevalue = 0xece5, accdet_auxadc_offset = -14
<6>[    0.389143]  (3)[1:swapper/0][mt_accdet_probe]probe done!
<4>[    0.390653]  (3)[1:swapper/0][Accdet]platform_driver_register done!
<4>[    0.390666]  (3)[1:swapper/0][Accdet]accdet_mod_init done!
<6>[    0.390692]  (3)[1:swapper/0]usb_function_register name=via_gps
<6>[    0.390708]  (3)[1:swapper/0]usb_function_register name=via_pcv
<6>[    0.390723]  (3)[1:swapper/0]usb_function_register name=via_atc
<6>[    0.390737]  (3)[1:swapper/0]usb_function_register name=via_ets
<6>[    0.390752]  (3)[1:swapper/0]usb_function_register name=via_modem
<5>[    0.390766]  (3)[1:swapper/0]C2K_USB_NOTE,<init 701>, rawbulk functions init.
<5>[    0.390796]  (3)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.390892]  (3)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.390978]  (3)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.391049]  (3)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.391127]  (3)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.391199]  (3)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.391276]  (3)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.391346]  (3)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.391431]  (3)[1:swapper/0]C2K_USB_NOTE,<rawbulk_init 1249>, rawbulk_init
<5>[    0.395615] -(3)[1:swapper/0]mtk_rtc_common: rtc_init
<5>[    0.396087] -(3)[1:swapper/0]mtk_rtc_hal: rtc_lpsd_restore_al_mask
<5>[    0.396882] -(3)[1:swapper/0]mtk_rtc_hal: 1st RTC_AL_MASK = 0x7f
<5>[    0.396974] -(3)[1:swapper/0]mtk_rtc_hal: 2nd RTC_AL_MASK = 0x10
<5>[    0.398688]  (3)[1:swapper/0]mtk_rtc_common: read al time = 1970/01/01 00:00:00 (0)
<6>[    0.400388]  (3)[1:swapper/0]mt-rtc mt-rtc: rtc core: registered mt-rtc as rtc0
<4>[    0.400452]  (3)[1:swapper/0][fg_27542_init] init start with i2c DTS[fg_27542_init] Success to register fg_27542 i2c driver.
<4>[    0.400856]  (3)[1:swapper/0]******** fg_27542_user_space_probe!! ********
<4>[    0.400880]  (3)[1:swapper/0]------------[ cut here ]------------
<4>[    0.400889]  (3)[1:swapper/0]WARNING: CPU: 3 PID: 1 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/base/core.c:595 device_create_file+0x88/0xac()
<4>[    0.400938]  (3)[1:swapper/0]Attribute chr_type: write permission without 'store'
<4>[    0.400950]  (3)[1:swapper/0]Modules linked in:
<4>[    0.400962] -(3)[1:swapper/0]CPU: 3 PID: 1 Comm: swapper/0 Tainted: G        W       4.4.95+ #1
<4>[    0.400974] -(3)[1:swapper/0]Hardware name: MT6739CW (DT)
<4>[    0.400984] -(3)[1:swapper/0]Call trace:
<4>[    0.400992] -(3)[1:swapper/0][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[    0.401010] -(3)[1:swapper/0][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[    0.401023] -(3)[1:swapper/0][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[    0.401037] -(3)[1:swapper/0][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[    0.401052] -(3)[1:swapper/0][<ffffff800809fb14>] warn_slowpath_fmt+0x5c/0x7c
<4>[    0.401064] -(3)[1:swapper/0][<ffffff80083c38f4>] device_create_file+0x88/0xac
<4>[    0.401076] -(3)[1:swapper/0][<ffffff8008469350>] fg_27542_user_space_probe+0x58/0x68
<4>[    0.401091] -(3)[1:swapper/0][<ffffff80083ca5f4>] platform_drv_probe+0x58/0xa8
<4>[    0.401107] -(3)[1:swapper/0][<ffffff80083c87ac>] driver_probe_device+0x280/0x430
<4>[    0.401120] -(3)[1:swapper/0][<ffffff80083c89a8>] __driver_attach+0x4c/0x90
<4>[    0.401133] -(3)[1:swapper/0][<ffffff80083c6864>] bus_for_each_dev+0xa0/0xb8
<4>[    0.401146] -(3)[1:swapper/0][<ffffff80083c80a4>] driver_attach+0x20/0x28
<4>[    0.401158] -(3)[1:swapper/0][<ffffff80083c7c54>] bus_add_driver+0x1f8/0x234
<4>[    0.401171] -(3)[1:swapper/0][<ffffff80083c94b0>] driver_register+0x98/0xd0
<4>[    0.401184] -(3)[1:swapper/0][<ffffff80083ca510>] __platform_driver_register+0x48/0x50
<4>[    0.401198] -(3)[1:swapper/0][<ffffff8008f258a0>] fg_27542_init+0x84/0x9c
<4>[    0.401210] -(3)[1:swapper/0][<ffffff8008081c88>] do_one_initcall+0x94/0x1e4
<4>[    0.401222] -(3)[1:swapper/0][<ffffff8008ef4c70>] kernel_init_freeable+0x228/0x22c
<4>[    0.401236] -(3)[1:swapper/0][<ffffff8008ac25d0>] kernel_init+0x10/0x104
<4>[    0.401249] -(3)[1:swapper/0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    0.401261]  (3)[1:swapper/0]---[ end trace e335f74a8dfe3605 ]---
<4>[    0.401309]  (3)[1:swapper/0]****[pcb_version_init] begin to register driver
<4>[    0.401670]  (3)[1:swapper/0]******** pcb_version_user_space_probe!! ********
<6>[    0.403139]  (3)[1:swapper/0]mtk_auxadc_intf_probe
<6>[    0.403218]  (3)[1:swapper/0]musb-hdrc: version 6.0, ?dma?, otg (peripheral+host)
<6>[    0.403710]  (3)[1:swapper/0]musb_probe mac=0xffffff8009fa0000, phy=0xffffff8009fc0000, irq=260
<5>[    0.403942] -(3)[1:swapper/0][MUSB]usb_dpidle_request 103: USB_DPIDLE_FORBIDDEN, skip_cnt<0>
<5>[    0.403974] -(3)[1:swapper/0][MUSB]usb_dpidle_request 96: USB_DPIDLE_ALLOWED, skip_cnt<0>
<5>[    0.404022]  (3)[1:swapper/0][MUSB]mt_usb_init 1353: mt_usb_init
<4>[    0.404226]  (3)[1:swapper/0]usb_phy_generic.0.auto supply vcc not found, using dummy regulator
<5>[    0.404369]  (3)[1:swapper/0][MUSB]mt_usb_init 1384: enable USB regulator
<5>[    0.404464]  (3)[1:swapper/0][MUSB]mt_usb_init 1395: musb platform init ff00
<5>[    0.404513]  (3)[1:swapper/0][MUSB]mt_usb_otg_init 820: host controlled by IDDIG
<5>[    0.405235]  (3)[1:swapper/0][MUSB]otg_iddig_probe 748: iddig_eint_num<0>
<5>[    0.405252]  (3)[1:swapper/0][MUSB]otg_iddig_probe 754: request EINT <0> fail, ret<-22>
<4>[    0.405272]  (3)[1:swapper/0]otg_iddig: probe of otg_iddig failed with error -22
<5>[    0.405426]  (3)[1:swapper/0][MUSB]mt_usb_enable 297: begin <0,0>,<1,0,0,0>
<5>[    0.416348]  (3)[1:swapper/0][MUSB]set_usb_phy_mode 437: force PHY to mode 1, 0x6c=3f2f
<5>[    0.416374]  (3)[1:swapper/0][MUSB]hs_slew_rate_cal 302: [USBPHY]slew calibration:FM_OUT =320,x=4300,value=4
<5>[    0.416392]  (3)[1:swapper/0][MUSB]usb_phy_recover 685: skip efuse setting temporary, RG_USB20_INTR_CAL=0x19
<5>[    0.416403]  (3)[1:swapper/0][MUSB]usb_phy_recover 694: usb recovery success
<5>[    0.416413]  (3)[1:swapper/0][MUSB]mt_usb_enable 326: end, <1,0,1,0>
<6>[    0.416879]  (3)[1:swapper/0]musb-hdrc musb-hdrc: MUSB HDRC host driver
<6>[    0.416945]  (3)[1:swapper/0]musb-hdrc musb-hdrc: new USB bus registered, assigned bus number 1
<6>[    0.416974]  (3)[1:swapper/0]usb usb1: usb_set_device_state 1->6
<6>[    0.416989]  (3)[1:swapper/0]usb usb1: usb_get_descriptor type=1 sz=18
<6>[    0.417049]  (3)[1:swapper/0]usb usb1: usb_get_descriptor type=2 sz=9
<6>[    0.417085]  (3)[1:swapper/0]usb usb1: usb_get_descriptor type=2 sz=25
<6>[    0.417529]  (3)[1:swapper/0]usb usb1: usb_set_device_state 6->7
<6>[    0.417638]  (3)[1:swapper/0]hub 1-0:1.0: USB hub found
<6>[    0.417687]  (3)[1:swapper/0]hub 1-0:1.0: 1 port detected
<5>[    0.417845] -(3)[1:swapper/0][MUSB]musb_hub_control 370: try to call musb_start in virthub
<5>[    0.418031]  (3)[1:swapper/0][MUSB]mt_usb_try_idle 282: b_idle inactive, for idle timer for 4 ms
<5>[    0.418045]  (3)[1:swapper/0][MUSB]musb_gadget_setup 2405: musb controller dma ops is non-null
<5>[    0.418202]  (3)[1:swapper/0][MUSB]mt_usb_disable 335: begin, <1,1>,<1,1,1,0>
<5>[    0.419039]  (3)[1:swapper/0][MUSB]set_usb_phy_mode 437: force PHY to mode 0, 0x6c=3f11
<5>[    0.419050]  (3)[1:swapper/0][MUSB]usb_phy_savecurrent 591: usb save current success
<5>[    0.419080]  (3)[1:swapper/0][MUSB]mt_usb_disable 345: end, <1,1,1,1>
<3>[    0.419157]  (3)[1:swapper/0]BOOTPROF:       419.157000:probe: probe=platform_drv_probe drv=musb-hdrc(ffffff800941d260)    15.450231ms
<3>[    0.419214]  (3)[1:swapper/0]BOOTPROF:       419.214769:initcall: musb_init    15.990769ms
<3>[    0.419673]  (3)[1:swapper/0]can't find compatible node
<4>[    0.420503]  (3)[1:swapper/0][BOOT_COMMON] [create_sysfs] No atag,meta found !
<6>[    0.420686]  (3)[1:swapper/0][DDP/IRQ]warn:disp_init_irq
<5>[    0.421213] -(1)[54:kworker/u8:2][MUSB]do_idle_work 237: otg_state b_idle to b_idle, is_active<0>
<6>[    0.421257]  (3)[1:swapper/0][DDP/ddp_drv]warn:DT, i=0, module=ovl0, map_addr=ffffff8009f9a000, map_irq=273, reg_pa=0x1400a000
<6>[    0.421566]  (3)[1:swapper/0][DDP/ddp_drv]warn:DT, i=7, module=rdma0, map_addr=ffffff8009f9c000, map_irq=274, reg_pa=0x1400b000
<6>[    0.421797]  (3)[1:swapper/0][DDP/ddp_drv]warn:DT, i=10, module=wdma0, map_addr=ffffff8009f9e000, map_irq=275, reg_pa=0x1400c000
<6>[    0.421993]  (3)[1:swapper/0][DDP/ddp_drv]warn:DT, i=14, module=color0, map_addr=ffffff8009fb2000, map_irq=276, reg_pa=0x1400d000
<6>[    0.422181]  (3)[1:swapper/0][DDP/ddp_drv]warn:DT, i=16, module=ccorr0, map_addr=ffffff8009fb4000, map_irq=277, reg_pa=0x1400e000
<6>[    0.422368]  (3)[1:swapper/0][DDP/ddp_drv]warn:DT, i=18, module=aal0, map_addr=ffffff8009fb6000, map_irq=278, reg_pa=0x1400f000
<6>[    0.422554]  (3)[1:swapper/0][DDP/ddp_drv]warn:DT, i=20, module=gamma0, map_addr=ffffff8009fb8000, map_irq=279, reg_pa=0x14010000
<6>[    0.422743]  (3)[1:swapper/0][DDP/ddp_drv]warn:DT, i=23, module=dither0, map_addr=ffffff8009fba000, map_irq=280, reg_pa=0x14011000
<6>[    0.422934]  (3)[1:swapper/0][DDP/ddp_drv]warn:DT, i=33, module=dbi0, map_addr=ffffff8009fbc000, map_irq=282, reg_pa=0x14013000
<6>[    0.423132]  (3)[1:swapper/0][DDP/ddp_drv]warn:DT, i=34, module=dsi0, map_addr=ffffff8009fbe000, map_irq=281, reg_pa=0x14012000
<6>[    0.423280]  (3)[1:swapper/0][DDP/ddp_drv]warn:DT, i=37, module=pwm0, map_addr=ffffff8009fd2000, map_irq=0, reg_pa=0x1100e000
<6>[    0.423460]  (3)[1:swapper/0][DDP/ddp_drv]warn:DT, i=39, module=config, map_addr=ffffff8009fd4000, map_irq=265, reg_pa=0x14000000
<6>[    0.423641]  (3)[1:swapper/0][DDP/ddp_drv]warn:DT, i=40, module=mutex, map_addr=ffffff8009fd6000, map_irq=266, reg_pa=0x14001000
<6>[    0.423817]  (3)[1:swapper/0][DDP/ddp_drv]warn:DT, i=41, module=sim_common, map_addr=ffffff8009fd8000, map_irq=0, reg_pa=0x14002000
<6>[    0.423999]  (3)[1:swapper/0][DDP/ddp_drv]warn:DT, i=42, module=smi_larb0, map_addr=ffffff8009fda000, map_irq=267, reg_pa=0x14003000
<6>[    0.424101]  (3)[1:swapper/0][DDP/ddp_drv]warn:DT, i=44, module=mipi0, map_addr=ffffff8009fdc000, map_irq=0, reg_pa=0x11c80000
<6>[    0.424121]  (3)[1:swapper/0][DDP/ddp_drv]warn:DT, i=0, module=ovl0, map_irq=273, hw_irq = 201
<6>[    0.424182]  (3)[1:swapper/0][DDP/ddp_drv]warn:irq enabled, module=ovl0, irq=273
<6>[    0.424200]  (3)[1:swapper/0][DDP/ddp_drv]warn:DT, i=7, module=rdma0, map_irq=274, hw_irq = 202
<6>[    0.424243]  (3)[1:swapper/0][DDP/ddp_drv]warn:irq enabled, module=rdma0, irq=274
<6>[    0.424258]  (3)[1:swapper/0][DDP/ddp_drv]warn:DT, i=10, module=wdma0, map_irq=275, hw_irq = 203
<6>[    0.424294]  (3)[1:swapper/0][DDP/ddp_drv]warn:irq enabled, module=wdma0, irq=275
<6>[    0.424309]  (3)[1:swapper/0][DDP/ddp_drv]warn:DT, i=16, module=ccorr0, map_irq=277, hw_irq = 205
<6>[    0.424346]  (3)[1:swapper/0][DDP/ddp_drv]warn:irq enabled, module=ccorr0, irq=277
<6>[    0.424361]  (3)[1:swapper/0][DDP/ddp_drv]warn:DT, i=18, module=aal0, map_irq=278, hw_irq = 206
<6>[    0.424395]  (3)[1:swapper/0][DDP/ddp_drv]warn:irq enabled, module=aal0, irq=278
<6>[    0.424412]  (3)[1:swapper/0][DDP/ddp_drv]warn:DT, i=33, module=dbi0, map_irq=282, hw_irq = 210
<6>[    0.424445]  (3)[1:swapper/0][DDP/ddp_drv]warn:irq enabled, module=dbi0, irq=282
<6>[    0.424459]  (3)[1:swapper/0][DDP/ddp_drv]warn:DT, i=34, module=dsi0, map_irq=281, hw_irq = 209
<6>[    0.424496]  (3)[1:swapper/0][DDP/ddp_drv]warn:irq enabled, module=dsi0, irq=281
<6>[    0.424512]  (3)[1:swapper/0][DDP/ddp_drv]warn:DT, i=40, module=mutex, map_irq=266, hw_irq = 194
<6>[    0.424546]  (3)[1:swapper/0][DDP/ddp_drv]warn:irq enabled, module=mutex, irq=266
<6>[    0.424561]  (3)[1:swapper/0][DDP/]warn:register m4u callback
<6>[    0.424589]  (3)[1:swapper/0][DISP]mtkfb_init Enter
<6>[    0.425475]  (3)[1:swapper/0][DISP]mtkfb_probe name [mtkfb]  = [(null)][ffffffc03f7bf410]
<6>[    0.425496]  (3)[1:swapper/0][DISP][DT][videolfb]isvideofb_parse_done = 1
<6>[    0.425759]  (3)[1:swapper/0][DISP]mtkfb_probe: fb_pa = 0x0000000077ad0000
<6>[    0.425907]  (3)[1:swapper/0][DISP][DT][videolfb]isvideofb_parse_done = 1
<6>[    0.425920]  (3)[1:swapper/0][DISP]mtkfb_find_lcm_driver, jd9161_wvga_dsi_vdo
<6>[    0.425934]  (3)[1:swapper/0][DISP]primary_display_init begin lcm=jd9161_wvga_dsi_vdo, inited=1
<6>[    0.425996]  (3)[1:swapper/0][DDP/IRQ]warn:register callback on 0
<6>[    0.426123]  (3)[1:swapper/0][DISP]state 1
<6>[    0.426138]  (3)[1:swapper/0][DISP]plcm_name=jd9161_wvga_dsi_vdo is_lcm_inited 1
<6>[    0.426161]  (3)[1:swapper/0][DISP][LCM] name: jd9161_wvga_dsi_vdo
<6>[    0.426173]  (3)[1:swapper/0][DISP][LCM] resolution: 480 x 800
<6>[    0.426185]  (3)[1:swapper/0][DISP][LCM] physical size: 52 x 86
<6>[    0.426196]  (3)[1:swapper/0][DISP][LCM] physical size: 52 x 86
<6>[    0.426207]  (3)[1:swapper/0][DISP][LCM] interface: unknown
<6>[    0.426217]  (3)[1:swapper/0][DISP][LCM] Type: DSI
<6>[    0.426227]  (3)[1:swapper/0][DISP][LCM] DSI Mode: SYNC_PULSE_VDO_MODE
<6>[    0.426238]  (3)[1:swapper/0][DISP][LCM] LANE_NUM: 2
<6>[    0.426252]  (3)[1:swapper/0][DISP][LCM] vact: 2, vbp: 12, vfp: 50, vact_line: 800, hact: 30, hbp: 95, hfp: 95, hblank: 0
<6>[    0.426269]  (3)[1:swapper/0][DISP][LCM] pll_select: 0, pll_div1: 0, pll_div2: 0, fbk_div: 0,fbk_sel: 0, rg_bir: 0
<6>[    0.426290]  (3)[1:swapper/0][DISP][LCM] rg_bic: 0, rg_bp: 0,PLL_CLOCK: 220, dsi_clock: 0, ssc_range: 0,ssc_disable: 0
<6>[    0.426298]  (3)[1:swapper/0][DISP][LCM]compatibility_for_nvk: 0, cont_clock: 0
<6>[    0.426314]  (3)[1:swapper/0][DISP][LCM] lcm_ext_te_enable: 0, noncont_clock: 1, noncont_clock_period: 1
<6>[    0.426326]  (3)[1:swapper/0][DISP]disp_lcm_probe SUCCESS
<6>[    0.426340]  (3)[1:swapper/0][DDP/ddp_path]warn:ddp_set_dst_module, scenario=primary_disp, dst_module=dsi0
<6>[    0.426354]  (3)[1:swapper/0][DDP/ddp_path]warn:ddp_set_dst_module, scenario=primary_rdma0_color0_disp, dst_module=dsi0
<6>[    0.426367]  (3)[1:swapper/0][DDP/ddp_path]warn:ddp_set_dst_module, scenario=primary_rdma0_disp, dst_module=dsi0
<6>[    0.426381]  (3)[1:swapper/0][DDP/ddp_path]warn:ddp_set_dst_module, scenario=primary_all, dst_module=dsi0
<6>[    0.426642]  (3)[1:swapper/0][DISP]dsi0 initializing _dsi_context
<6>[    0.427156]  (3)[1:swapper/0][DISP]MIPITX was alreay initialized
<6>[    0.427316]  (3)[1:swapper/0][DDP/]warn:CG0 0xfec00df0, CG1 0x3ffff
<6>[    0.427647]  (1)[148:init_decouple_b][DISP]init_decouple_buffers alloc gmo bufs done
<6>[    0.427910]  (3)[1:swapper/0][DISP]state 4
<5>[    0.428031]  (3)[1:swapper/0][CMDQ][ERR]SRAM count is out of memory, start:74, want:92, owner:DELAY_THREAD
<5>[    0.428046]  (3)[1:swapper/0][CMDQ]SRAM Chunk(0)-32bit unit: start: 0x0, count: 64, Name: Fake SPR
<5>[    0.428057]  (3)[1:swapper/0][CMDQ]SRAM Chunk(1)-32bit unit: start: 0x40, count: 10, Name: Delay CPR
<5>[    0.428067]  (3)[1:swapper/0][CMDQ][ERR]REC: create SRAM fail, block_size = 368
<5>[    0.428076]  (3)[1:swapper/0][CMDQ][ERR][DelayThread]create delay thread in sram failed, free:216 sram size:368
<5>[    0.428131]  (3)[1:swapper/0][CMDQ][DelayThread]create delay thread task in DRAM task size:296 sram size:216
<6>[    0.428304]  (3)[1:swapper/0][DISP]primary display START cmdq trigger loop finished
<6>[    0.428319]  (3)[1:swapper/0][DISP]state 5
<6>[    0.428342]  (3)[1:swapper/0][DDP/OVL]warn:ovl_roi:(480x800)
<6>[    0.429362]  (3)[1:swapper/0][DDP/DSI]warn:DSI_Set_VM_CMD
<6>[    0.429381]  (3)[1:swapper/0][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc03214faa0!
<6>[    0.429401]  (3)[1:swapper/0]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[    0.429412]  (3)[1:swapper/0]------------[ cut here ]------------
<4>[    0.429421]  (3)[1:swapper/0]WARNING: CPU: 3 PID: 1 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1694/0x2460()
<4>[    0.429447]  (3)[1:swapper/0]Modules linked in:
<4>[    0.429459] -(3)[1:swapper/0]CPU: 3 PID: 1 Comm: swapper/0 Tainted: G        W       4.4.95+ #1
<4>[    0.429471] -(3)[1:swapper/0]Hardware name: MT6739CW (DT)
<4>[    0.429481] -(3)[1:swapper/0]Call trace:
<4>[    0.429489] -(3)[1:swapper/0][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[    0.429507] -(3)[1:swapper/0][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[    0.429520] -(3)[1:swapper/0][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[    0.429535] -(3)[1:swapper/0][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[    0.429549] -(3)[1:swapper/0][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[    0.429563] -(3)[1:swapper/0][<ffffff8008550854>] ddp_dsi_config+0x1694/0x2460
<4>[    0.429575] -(3)[1:swapper/0][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[    0.429592] -(3)[1:swapper/0][<ffffff800858cb94>] primary_display_init+0x7f0/0xbfc
<4>[    0.429606] -(3)[1:swapper/0][<ffffff800857f444>] mtkfb_probe+0x16c/0x428
<4>[    0.429622] -(3)[1:swapper/0][<ffffff80083ca5f4>] platform_drv_probe+0x58/0xa8
<4>[    0.429638] -(3)[1:swapper/0][<ffffff80083c87ac>] driver_probe_device+0x280/0x430
<4>[    0.429651] -(3)[1:swapper/0][<ffffff80083c89a8>] __driver_attach+0x4c/0x90
<4>[    0.429664] -(3)[1:swapper/0][<ffffff80083c6864>] bus_for_each_dev+0xa0/0xb8
<4>[    0.429677] -(3)[1:swapper/0][<ffffff80083c80a4>] driver_attach+0x20/0x28
<4>[    0.429689] -(3)[1:swapper/0][<ffffff80083c7c54>] bus_add_driver+0x1f8/0x234
<4>[    0.429701] -(3)[1:swapper/0][<ffffff80083c94b0>] driver_register+0x98/0xd0
<4>[    0.429714] -(3)[1:swapper/0][<ffffff80083ca510>] __platform_driver_register+0x48/0x50
<4>[    0.429728] -(3)[1:swapper/0][<ffffff8008f2857c>] mtkfb_init+0x3c/0xb0
<4>[    0.429743] -(3)[1:swapper/0][<ffffff8008081c88>] do_one_initcall+0x94/0x1e4
<4>[    0.429755] -(3)[1:swapper/0][<ffffff8008ef4c70>] kernel_init_freeable+0x228/0x22c
<4>[    0.429769] -(3)[1:swapper/0][<ffffff8008ac25d0>] kernel_init+0x10/0x104
<4>[    0.429782] -(3)[1:swapper/0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    0.429794]  (3)[1:swapper/0]---[ end trace e335f74a8dfe3606 ]---
<5>[    0.429805]  (3)[1:swapper/0][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[    0.429815]  (3)[1:swapper/0][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[    0.429832]  (3)[1:swapper/0][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc03214faa8!
<6>[    0.429842]  (3)[1:swapper/0]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[    0.429854]  (3)[1:swapper/0]------------[ cut here ]------------
<4>[    0.429862]  (3)[1:swapper/0]WARNING: CPU: 3 PID: 1 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x16fc/0x2460()
<4>[    0.429879]  (3)[1:swapper/0]Modules linked in:
<4>[    0.429888] -(3)[1:swapper/0]CPU: 3 PID: 1 Comm: swapper/0 Tainted: G        W       4.4.95+ #1
<4>[    0.429900] -(3)[1:swapper/0]Hardware name: MT6739CW (DT)
<4>[    0.429908] -(3)[1:swapper/0]Call trace:
<4>[    0.429916] -(3)[1:swapper/0][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[    0.429928] -(3)[1:swapper/0][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[    0.429941] -(3)[1:swapper/0][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[    0.429953] -(3)[1:swapper/0][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[    0.429966] -(3)[1:swapper/0][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[    0.429980] -(3)[1:swapper/0][<ffffff80085508bc>] ddp_dsi_config+0x16fc/0x2460
<4>[    0.429991] -(3)[1:swapper/0][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[    0.430005] -(3)[1:swapper/0][<ffffff800858cb94>] primary_display_init+0x7f0/0xbfc
<4>[    0.430018] -(3)[1:swapper/0][<ffffff800857f444>] mtkfb_probe+0x16c/0x428
<4>[    0.430031] -(3)[1:swapper/0][<ffffff80083ca5f4>] platform_drv_probe+0x58/0xa8
<4>[    0.430044] -(3)[1:swapper/0][<ffffff80083c87ac>] driver_probe_device+0x280/0x430
<4>[    0.430057] -(3)[1:swapper/0][<ffffff80083c89a8>] __driver_attach+0x4c/0x90
<4>[    0.430070] -(3)[1:swapper/0][<ffffff80083c6864>] bus_for_each_dev+0xa0/0xb8
<4>[    0.430082] -(3)[1:swapper/0][<ffffff80083c80a4>] driver_attach+0x20/0x28
<4>[    0.430095] -(3)[1:swapper/0][<ffffff80083c7c54>] bus_add_driver+0x1f8/0x234
<4>[    0.430107] -(3)[1:swapper/0][<ffffff80083c94b0>] driver_register+0x98/0xd0
<4>[    0.430120] -(3)[1:swapper/0][<ffffff80083ca510>] __platform_driver_register+0x48/0x50
<4>[    0.430133] -(3)[1:swapper/0][<ffffff8008f2857c>] mtkfb_init+0x3c/0xb0
<4>[    0.430145] -(3)[1:swapper/0][<ffffff8008081c88>] do_one_initcall+0x94/0x1e4
<4>[    0.430157] -(3)[1:swapper/0][<ffffff8008ef4c70>] kernel_init_freeable+0x228/0x22c
<4>[    0.430169] -(3)[1:swapper/0][<ffffff8008ac25d0>] kernel_init+0x10/0x104
<4>[    0.430181] -(3)[1:swapper/0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    0.430192]  (3)[1:swapper/0]---[ end trace e335f74a8dfe3607 ]---
<5>[    0.430202]  (3)[1:swapper/0][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[    0.430212]  (3)[1:swapper/0][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[    0.430228]  (3)[1:swapper/0][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc03214fab0!
<6>[    0.430238]  (3)[1:swapper/0]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[    0.430249]  (3)[1:swapper/0]------------[ cut here ]------------
<4>[    0.430257]  (3)[1:swapper/0]WARNING: CPU: 3 PID: 1 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1764/0x2460()
<4>[    0.430275]  (3)[1:swapper/0]Modules linked in:
<4>[    0.430284] -(3)[1:swapper/0]CPU: 3 PID: 1 Comm: swapper/0 Tainted: G        W       4.4.95+ #1
<4>[    0.430296] -(3)[1:swapper/0]Hardware name: MT6739CW (DT)
<4>[    0.430304] -(3)[1:swapper/0]Call trace:
<4>[    0.430311] -(3)[1:swapper/0][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[    0.430325] -(3)[1:swapper/0][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[    0.430337] -(3)[1:swapper/0][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[    0.430350] -(3)[1:swapper/0][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[    0.430364] -(3)[1:swapper/0][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[    0.430377] -(3)[1:swapper/0][<ffffff8008550924>] ddp_dsi_config+0x1764/0x2460
<4>[    0.430389] -(3)[1:swapper/0][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[    0.430403] -(3)[1:swapper/0][<ffffff800858cb94>] primary_display_init+0x7f0/0xbfc
<4>[    0.430416] -(3)[1:swapper/0][<ffffff800857f444>] mtkfb_probe+0x16c/0x428
<4>[    0.430428] -(3)[1:swapper/0][<ffffff80083ca5f4>] platform_drv_probe+0x58/0xa8
<4>[    0.430442] -(3)[1:swapper/0][<ffffff80083c87ac>] driver_probe_device+0x280/0x430
<4>[    0.430455] -(3)[1:swapper/0][<ffffff80083c89a8>] __driver_attach+0x4c/0x90
<4>[    0.430467] -(3)[1:swapper/0][<ffffff80083c6864>] bus_for_each_dev+0xa0/0xb8
<4>[    0.430480] -(3)[1:swapper/0][<ffffff80083c80a4>] driver_attach+0x20/0x28
<4>[    0.430492] -(3)[1:swapper/0][<ffffff80083c7c54>] bus_add_driver+0x1f8/0x234
<4>[    0.430504] -(3)[1:swapper/0][<ffffff80083c94b0>] driver_register+0x98/0xd0
<4>[    0.430516] -(3)[1:swapper/0][<ffffff80083ca510>] __platform_driver_register+0x48/0x50
<4>[    0.430530] -(3)[1:swapper/0][<ffffff8008f2857c>] mtkfb_init+0x3c/0xb0
<4>[    0.430542] -(3)[1:swapper/0][<ffffff8008081c88>] do_one_initcall+0x94/0x1e4
<4>[    0.430554] -(3)[1:swapper/0][<ffffff8008ef4c70>] kernel_init_freeable+0x228/0x22c
<4>[    0.430566] -(3)[1:swapper/0][<ffffff8008ac25d0>] kernel_init+0x10/0x104
<4>[    0.430578] -(3)[1:swapper/0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    0.430590]  (3)[1:swapper/0]---[ end trace e335f74a8dfe3608 ]---
<5>[    0.430600]  (3)[1:swapper/0][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[    0.430610]  (3)[1:swapper/0][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[    0.430626]  (3)[1:swapper/0][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc03214fac0!
<6>[    0.430636]  (3)[1:swapper/0]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[    0.430648]  (3)[1:swapper/0]------------[ cut here ]------------
<4>[    0.430655]  (3)[1:swapper/0]WARNING: CPU: 3 PID: 1 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x17cc/0x2460()
<4>[    0.430672]  (3)[1:swapper/0]Modules linked in:
<4>[    0.430682] -(3)[1:swapper/0]CPU: 3 PID: 1 Comm: swapper/0 Tainted: G        W       4.4.95+ #1
<4>[    0.430693] -(3)[1:swapper/0]Hardware name: MT6739CW (DT)
<4>[    0.430702] -(3)[1:swapper/0]Call trace:
<4>[    0.430709] -(3)[1:swapper/0][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[    0.430722] -(3)[1:swapper/0][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[    0.430734] -(3)[1:swapper/0][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[    0.430747] -(3)[1:swapper/0][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[    0.430760] -(3)[1:swapper/0][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[    0.430773] -(3)[1:swapper/0][<ffffff800855098c>] ddp_dsi_config+0x17cc/0x2460
<4>[    0.430785] -(3)[1:swapper/0][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[    0.430798] -(3)[1:swapper/0][<ffffff800858cb94>] primary_display_init+0x7f0/0xbfc
<4>[    0.430811] -(3)[1:swapper/0][<ffffff800857f444>] mtkfb_probe+0x16c/0x428
<4>[    0.430824] -(3)[1:swapper/0][<ffffff80083ca5f4>] platform_drv_probe+0x58/0xa8
<4>[    0.430838] -(3)[1:swapper/0][<ffffff80083c87ac>] driver_probe_device+0x280/0x430
<4>[    0.430851] -(3)[1:swapper/0][<ffffff80083c89a8>] __driver_attach+0x4c/0x90
<4>[    0.430864] -(3)[1:swapper/0][<ffffff80083c6864>] bus_for_each_dev+0xa0/0xb8
<4>[    0.430875] -(3)[1:swapper/0][<ffffff80083c80a4>] driver_attach+0x20/0x28
<4>[    0.430887] -(3)[1:swapper/0][<ffffff80083c7c54>] bus_add_driver+0x1f8/0x234
<4>[    0.430900] -(3)[1:swapper/0][<ffffff80083c94b0>] driver_register+0x98/0xd0
<4>[    0.430912] -(3)[1:swapper/0][<ffffff80083ca510>] __platform_driver_register+0x48/0x50
<4>[    0.430926] -(3)[1:swapper/0][<ffffff8008f2857c>] mtkfb_init+0x3c/0xb0
<4>[    0.430938] -(3)[1:swapper/0][<ffffff8008081c88>] do_one_initcall+0x94/0x1e4
<4>[    0.430949] -(3)[1:swapper/0][<ffffff8008ef4c70>] kernel_init_freeable+0x228/0x22c
<4>[    0.430961] -(3)[1:swapper/0][<ffffff8008ac25d0>] kernel_init+0x10/0x104
<4>[    0.430972] -(3)[1:swapper/0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    0.430984]  (3)[1:swapper/0]---[ end trace e335f74a8dfe3609 ]---
<5>[    0.430995]  (3)[1:swapper/0][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[    0.431004]  (3)[1:swapper/0][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[    0.431019]  (3)[1:swapper/0][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc03214fac8!
<6>[    0.431030]  (3)[1:swapper/0]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[    0.431041]  (3)[1:swapper/0]------------[ cut here ]------------
<4>[    0.431049]  (3)[1:swapper/0]WARNING: CPU: 3 PID: 1 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1834/0x2460()
<4>[    0.431066]  (3)[1:swapper/0]Modules linked in:
<4>[    0.431076] -(3)[1:swapper/0]CPU: 3 PID: 1 Comm: swapper/0 Tainted: G        W       4.4.95+ #1
<4>[    0.431087] -(3)[1:swapper/0]Hardware name: MT6739CW (DT)
<4>[    0.431096] -(3)[1:swapper/0]Call trace:
<4>[    0.431103] -(3)[1:swapper/0][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[    0.431116] -(3)[1:swapper/0][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[    0.431129] -(3)[1:swapper/0][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[    0.431141] -(3)[1:swapper/0][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[    0.431154] -(3)[1:swapper/0][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[    0.431167] -(3)[1:swapper/0][<ffffff80085509f4>] ddp_dsi_config+0x1834/0x2460
<4>[    0.431179] -(3)[1:swapper/0][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[    0.431193] -(3)[1:swapper/0][<ffffff800858cb94>] primary_display_init+0x7f0/0xbfc
<4>[    0.431206] -(3)[1:swapper/0][<ffffff800857f444>] mtkfb_probe+0x16c/0x428
<4>[    0.431219] -(3)[1:swapper/0][<ffffff80083ca5f4>] platform_drv_probe+0x58/0xa8
<4>[    0.431233] -(3)[1:swapper/0][<ffffff80083c87ac>] driver_probe_device+0x280/0x430
<4>[    0.431245] -(3)[1:swapper/0][<ffffff80083c89a8>] __driver_attach+0x4c/0x90
<4>[    0.431258] -(3)[1:swapper/0][<ffffff80083c6864>] bus_for_each_dev+0xa0/0xb8
<4>[    0.431270] -(3)[1:swapper/0][<ffffff80083c80a4>] driver_attach+0x20/0x28
<4>[    0.431283] -(3)[1:swapper/0][<ffffff80083c7c54>] bus_add_driver+0x1f8/0x234
<4>[    0.431295] -(3)[1:swapper/0][<ffffff80083c94b0>] driver_register+0x98/0xd0
<4>[    0.431308] -(3)[1:swapper/0][<ffffff80083ca510>] __platform_driver_register+0x48/0x50
<4>[    0.431321] -(3)[1:swapper/0][<ffffff8008f2857c>] mtkfb_init+0x3c/0xb0
<4>[    0.431334] -(3)[1:swapper/0][<ffffff8008081c88>] do_one_initcall+0x94/0x1e4
<4>[    0.431345] -(3)[1:swapper/0][<ffffff8008ef4c70>] kernel_init_freeable+0x228/0x22c
<4>[    0.431358] -(3)[1:swapper/0][<ffffff8008ac25d0>] kernel_init+0x10/0x104
<4>[    0.431369] -(3)[1:swapper/0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    0.431382]  (3)[1:swapper/0]---[ end trace e335f74a8dfe360a ]---
<5>[    0.431392]  (3)[1:swapper/0][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[    0.431401]  (3)[1:swapper/0][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[    0.431417]  (3)[1:swapper/0][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc03214facc!
<6>[    0.431427]  (3)[1:swapper/0]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[    0.431438]  (3)[1:swapper/0]------------[ cut here ]------------
<4>[    0.431446]  (3)[1:swapper/0]WARNING: CPU: 3 PID: 1 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x189c/0x2460()
<4>[    0.431463]  (3)[1:swapper/0]Modules linked in:
<4>[    0.431473] -(3)[1:swapper/0]CPU: 3 PID: 1 Comm: swapper/0 Tainted: G        W       4.4.95+ #1
<4>[    0.431483] -(3)[1:swapper/0]Hardware name: MT6739CW (DT)
<4>[    0.431492] -(3)[1:swapper/0]Call trace:
<4>[    0.431499] -(3)[1:swapper/0][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[    0.431512] -(3)[1:swapper/0][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[    0.431525] -(3)[1:swapper/0][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[    0.431537] -(3)[1:swapper/0][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[    0.431551] -(3)[1:swapper/0][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[    0.431564] -(3)[1:swapper/0][<ffffff8008550a5c>] ddp_dsi_config+0x189c/0x2460
<4>[    0.431576] -(3)[1:swapper/0][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[    0.431590] -(3)[1:swapper/0][<ffffff800858cb94>] primary_display_init+0x7f0/0xbfc
<4>[    0.431603] -(3)[1:swapper/0][<ffffff800857f444>] mtkfb_probe+0x16c/0x428
<4>[    0.431616] -(3)[1:swapper/0][<ffffff80083ca5f4>] platform_drv_probe+0x58/0xa8
<4>[    0.431629] -(3)[1:swapper/0][<ffffff80083c87ac>] driver_probe_device+0x280/0x430
<4>[    0.431642] -(3)[1:swapper/0][<ffffff80083c89a8>] __driver_attach+0x4c/0x90
<4>[    0.431655] -(3)[1:swapper/0][<ffffff80083c6864>] bus_for_each_dev+0xa0/0xb8
<4>[    0.431667] -(3)[1:swapper/0][<ffffff80083c80a4>] driver_attach+0x20/0x28
<4>[    0.431680] -(3)[1:swapper/0][<ffffff80083c7c54>] bus_add_driver+0x1f8/0x234
<4>[    0.431692] -(3)[1:swapper/0][<ffffff80083c94b0>] driver_register+0x98/0xd0
<4>[    0.431705] -(3)[1:swapper/0][<ffffff80083ca510>] __platform_driver_register+0x48/0x50
<4>[    0.431718] -(3)[1:swapper/0][<ffffff8008f2857c>] mtkfb_init+0x3c/0xb0
<4>[    0.431730] -(3)[1:swapper/0][<ffffff8008081c88>] do_one_initcall+0x94/0x1e4
<4>[    0.431742] -(3)[1:swapper/0][<ffffff8008ef4c70>] kernel_init_freeable+0x228/0x22c
<4>[    0.431754] -(3)[1:swapper/0][<ffffff8008ac25d0>] kernel_init+0x10/0x104
<4>[    0.431765] -(3)[1:swapper/0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    0.431777]  (3)[1:swapper/0]---[ end trace e335f74a8dfe360b ]---
<5>[    0.431787]  (3)[1:swapper/0][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[    0.431797]  (3)[1:swapper/0][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[    0.431813]  (3)[1:swapper/0][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc03214fa88!
<6>[    0.431823]  (3)[1:swapper/0]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[    0.431834]  (3)[1:swapper/0]------------[ cut here ]------------
<4>[    0.431842]  (3)[1:swapper/0]WARNING: CPU: 3 PID: 1 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1904/0x2460()
<4>[    0.431858]  (3)[1:swapper/0]Modules linked in:
<4>[    0.431867] -(3)[1:swapper/0]CPU: 3 PID: 1 Comm: swapper/0 Tainted: G        W       4.4.95+ #1
<4>[    0.431879] -(3)[1:swapper/0]Hardware name: MT6739CW (DT)
<4>[    0.431887] -(3)[1:swapper/0]Call trace:
<4>[    0.431894] -(3)[1:swapper/0][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[    0.431907] -(3)[1:swapper/0][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[    0.431920] -(3)[1:swapper/0][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[    0.431933] -(3)[1:swapper/0][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[    0.431946] -(3)[1:swapper/0][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[    0.431959] -(3)[1:swapper/0][<ffffff8008550ac4>] ddp_dsi_config+0x1904/0x2460
<4>[    0.431971] -(3)[1:swapper/0][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[    0.431985] -(3)[1:swapper/0][<ffffff800858cb94>] primary_display_init+0x7f0/0xbfc
<4>[    0.431998] -(3)[1:swapper/0][<ffffff800857f444>] mtkfb_probe+0x16c/0x428
<4>[    0.432011] -(3)[1:swapper/0][<ffffff80083ca5f4>] platform_drv_probe+0x58/0xa8
<4>[    0.432024] -(3)[1:swapper/0][<ffffff80083c87ac>] driver_probe_device+0x280/0x430
<4>[    0.432037] -(3)[1:swapper/0][<ffffff80083c89a8>] __driver_attach+0x4c/0x90
<4>[    0.432049] -(3)[1:swapper/0][<ffffff80083c6864>] bus_for_each_dev+0xa0/0xb8
<4>[    0.432062] -(3)[1:swapper/0][<ffffff80083c80a4>] driver_attach+0x20/0x28
<4>[    0.432074] -(3)[1:swapper/0][<ffffff80083c7c54>] bus_add_driver+0x1f8/0x234
<4>[    0.432086] -(3)[1:swapper/0][<ffffff80083c94b0>] driver_register+0x98/0xd0
<4>[    0.432099] -(3)[1:swapper/0][<ffffff80083ca510>] __platform_driver_register+0x48/0x50
<4>[    0.432112] -(3)[1:swapper/0][<ffffff8008f2857c>] mtkfb_init+0x3c/0xb0
<4>[    0.432125] -(3)[1:swapper/0][<ffffff8008081c88>] do_one_initcall+0x94/0x1e4
<4>[    0.432136] -(3)[1:swapper/0][<ffffff8008ef4c70>] kernel_init_freeable+0x228/0x22c
<4>[    0.432148] -(3)[1:swapper/0][<ffffff8008ac25d0>] kernel_init+0x10/0x104
<4>[    0.432160] -(3)[1:swapper/0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    0.432172]  (3)[1:swapper/0]---[ end trace e335f74a8dfe360c ]---
<5>[    0.432183]  (3)[1:swapper/0][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[    0.432193]  (3)[1:swapper/0][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[    0.432209]  (3)[1:swapper/0][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc03214fa90!
<6>[    0.432219]  (3)[1:swapper/0]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[    0.432231]  (3)[1:swapper/0]------------[ cut here ]------------
<4>[    0.432238]  (3)[1:swapper/0]WARNING: CPU: 3 PID: 1 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x196c/0x2460()
<4>[    0.432255]  (3)[1:swapper/0]Modules linked in:
<4>[    0.432264] -(3)[1:swapper/0]CPU: 3 PID: 1 Comm: swapper/0 Tainted: G        W       4.4.95+ #1
<4>[    0.432276] -(3)[1:swapper/0]Hardware name: MT6739CW (DT)
<4>[    0.432284] -(3)[1:swapper/0]Call trace:
<4>[    0.432291] -(3)[1:swapper/0][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[    0.432305] -(3)[1:swapper/0][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[    0.432317] -(3)[1:swapper/0][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[    0.432330] -(3)[1:swapper/0][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[    0.432343] -(3)[1:swapper/0][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[    0.432356] -(3)[1:swapper/0][<ffffff8008550b2c>] ddp_dsi_config+0x196c/0x2460
<4>[    0.432368] -(3)[1:swapper/0][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[    0.432381] -(3)[1:swapper/0][<ffffff800858cb94>] primary_display_init+0x7f0/0xbfc
<4>[    0.432394] -(3)[1:swapper/0][<ffffff800857f444>] mtkfb_probe+0x16c/0x428
<4>[    0.432407] -(3)[1:swapper/0][<ffffff80083ca5f4>] platform_drv_probe+0x58/0xa8
<4>[    0.432421] -(3)[1:swapper/0][<ffffff80083c87ac>] driver_probe_device+0x280/0x430
<4>[    0.432433] -(3)[1:swapper/0][<ffffff80083c89a8>] __driver_attach+0x4c/0x90
<4>[    0.432446] -(3)[1:swapper/0][<ffffff80083c6864>] bus_for_each_dev+0xa0/0xb8
<4>[    0.432458] -(3)[1:swapper/0][<ffffff80083c80a4>] driver_attach+0x20/0x28
<4>[    0.432470] -(3)[1:swapper/0][<ffffff80083c7c54>] bus_add_driver+0x1f8/0x234
<4>[    0.432483] -(3)[1:swapper/0][<ffffff80083c94b0>] driver_register+0x98/0xd0
<4>[    0.432496] -(3)[1:swapper/0][<ffffff80083ca510>] __platform_driver_register+0x48/0x50
<4>[    0.432509] -(3)[1:swapper/0][<ffffff8008f2857c>] mtkfb_init+0x3c/0xb0
<4>[    0.432521] -(3)[1:swapper/0][<ffffff8008081c88>] do_one_initcall+0x94/0x1e4
<4>[    0.432533] -(3)[1:swapper/0][<ffffff8008ef4c70>] kernel_init_freeable+0x228/0x22c
<4>[    0.432545] -(3)[1:swapper/0][<ffffff8008ac25d0>] kernel_init+0x10/0x104
<4>[    0.432557] -(3)[1:swapper/0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    0.432569]  (3)[1:swapper/0]---[ end trace e335f74a8dfe360d ]---
<5>[    0.432579]  (3)[1:swapper/0][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[    0.432588]  (3)[1:swapper/0][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[    0.432603]  (3)[1:swapper/0][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc03214fa98!
<6>[    0.432614]  (3)[1:swapper/0]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[    0.432624]  (3)[1:swapper/0]------------[ cut here ]------------
<4>[    0.432632]  (3)[1:swapper/0]WARNING: CPU: 3 PID: 1 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x19d4/0x2460()
<4>[    0.432649]  (3)[1:swapper/0]Modules linked in:
<4>[    0.432658] -(3)[1:swapper/0]CPU: 3 PID: 1 Comm: swapper/0 Tainted: G        W       4.4.95+ #1
<4>[    0.432669] -(3)[1:swapper/0]Hardware name: MT6739CW (DT)
<4>[    0.432678] -(3)[1:swapper/0]Call trace:
<4>[    0.432685] -(3)[1:swapper/0][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[    0.432698] -(3)[1:swapper/0][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[    0.432711] -(3)[1:swapper/0][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[    0.432724] -(3)[1:swapper/0][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[    0.432737] -(3)[1:swapper/0][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[    0.432750] -(3)[1:swapper/0][<ffffff8008550b94>] ddp_dsi_config+0x19d4/0x2460
<4>[    0.432762] -(3)[1:swapper/0][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[    0.432776] -(3)[1:swapper/0][<ffffff800858cb94>] primary_display_init+0x7f0/0xbfc
<4>[    0.432788] -(3)[1:swapper/0][<ffffff800857f444>] mtkfb_probe+0x16c/0x428
<4>[    0.432801] -(3)[1:swapper/0][<ffffff80083ca5f4>] platform_drv_probe+0x58/0xa8
<4>[    0.432815] -(3)[1:swapper/0][<ffffff80083c87ac>] driver_probe_device+0x280/0x430
<4>[    0.432827] -(3)[1:swapper/0][<ffffff80083c89a8>] __driver_attach+0x4c/0x90
<4>[    0.432840] -(3)[1:swapper/0][<ffffff80083c6864>] bus_for_each_dev+0xa0/0xb8
<4>[    0.432853] -(3)[1:swapper/0][<ffffff80083c80a4>] driver_attach+0x20/0x28
<4>[    0.432865] -(3)[1:swapper/0][<ffffff80083c7c54>] bus_add_driver+0x1f8/0x234
<4>[    0.432878] -(3)[1:swapper/0][<ffffff80083c94b0>] driver_register+0x98/0xd0
<4>[    0.432890] -(3)[1:swapper/0][<ffffff80083ca510>] __platform_driver_register+0x48/0x50
<4>[    0.432904] -(3)[1:swapper/0][<ffffff8008f2857c>] mtkfb_init+0x3c/0xb0
<4>[    0.432916] -(3)[1:swapper/0][<ffffff8008081c88>] do_one_initcall+0x94/0x1e4
<4>[    0.432928] -(3)[1:swapper/0][<ffffff8008ef4c70>] kernel_init_freeable+0x228/0x22c
<4>[    0.432941] -(3)[1:swapper/0][<ffffff8008ac25d0>] kernel_init+0x10/0x104
<4>[    0.432952] -(3)[1:swapper/0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    0.433001]  (3)[1:swapper/0]---[ end trace e335f74a8dfe360e ]---
<5>[    0.433015]  (3)[1:swapper/0][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[    0.433025]  (3)[1:swapper/0][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[    0.433038]  (3)[1:swapper/0][DISP]===>v_a-v_b=0x2d13,HSTX_CKLP_WC=0x0
<6>[    0.433050]  (3)[1:swapper/0][DISP]===>v_b+v_c=0x1c8,HFP_WC=0x25
<6>[    0.433061]  (3)[1:swapper/0][DISP]===>Will Reconfig in order to fulfill LP clock lane per line
<6>[    0.433080]  (3)[1:swapper/0][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc03214fab8!
<6>[    0.433091]  (3)[1:swapper/0]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[    0.433103]  (3)[1:swapper/0]------------[ cut here ]------------
<4>[    0.433111]  (3)[1:swapper/0]WARNING: CPU: 3 PID: 1 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1b58/0x2460()
<4>[    0.433126]  (3)[1:swapper/0]Modules linked in:
<4>[    0.433136] -(3)[1:swapper/0]CPU: 3 PID: 1 Comm: swapper/0 Tainted: G        W       4.4.95+ #1
<4>[    0.433148] -(3)[1:swapper/0]Hardware name: MT6739CW (DT)
<4>[    0.433156] -(3)[1:swapper/0]Call trace:
<4>[    0.433164] -(3)[1:swapper/0][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[    0.433177] -(3)[1:swapper/0][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[    0.433189] -(3)[1:swapper/0][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[    0.433202] -(3)[1:swapper/0][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[    0.433216] -(3)[1:swapper/0][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[    0.433229] -(3)[1:swapper/0][<ffffff8008550d18>] ddp_dsi_config+0x1b58/0x2460
<4>[    0.433242] -(3)[1:swapper/0][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[    0.433255] -(3)[1:swapper/0][<ffffff800858cb94>] primary_display_init+0x7f0/0xbfc
<4>[    0.433268] -(3)[1:swapper/0][<ffffff800857f444>] mtkfb_probe+0x16c/0x428
<4>[    0.433281] -(3)[1:swapper/0][<ffffff80083ca5f4>] platform_drv_probe+0x58/0xa8
<4>[    0.433294] -(3)[1:swapper/0][<ffffff80083c87ac>] driver_probe_device+0x280/0x430
<4>[    0.433308] -(3)[1:swapper/0][<ffffff80083c89a8>] __driver_attach+0x4c/0x90
<4>[    0.433320] -(3)[1:swapper/0][<ffffff80083c6864>] bus_for_each_dev+0xa0/0xb8
<4>[    0.433332] -(3)[1:swapper/0][<ffffff80083c80a4>] driver_attach+0x20/0x28
<4>[    0.433344] -(3)[1:swapper/0][<ffffff80083c7c54>] bus_add_driver+0x1f8/0x234
<4>[    0.433357] -(3)[1:swapper/0][<ffffff80083c94b0>] driver_register+0x98/0xd0
<4>[    0.433370] -(3)[1:swapper/0][<ffffff80083ca510>] __platform_driver_register+0x48/0x50
<4>[    0.433383] -(3)[1:swapper/0][<ffffff8008f2857c>] mtkfb_init+0x3c/0xb0
<4>[    0.433396] -(3)[1:swapper/0][<ffffff8008081c88>] do_one_initcall+0x94/0x1e4
<4>[    0.433407] -(3)[1:swapper/0][<ffffff8008ef4c70>] kernel_init_freeable+0x228/0x22c
<4>[    0.433420] -(3)[1:swapper/0][<ffffff8008ac25d0>] kernel_init+0x10/0x104
<4>[    0.433431] -(3)[1:swapper/0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    0.433443]  (3)[1:swapper/0]---[ end trace e335f74a8dfe360f ]---
<5>[    0.433454]  (3)[1:swapper/0][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[    0.433463]  (3)[1:swapper/0][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[    0.433483]  (3)[1:swapper/0][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc03214fad0!
<6>[    0.433493]  (3)[1:swapper/0]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[    0.433505]  (3)[1:swapper/0]------------[ cut here ]------------
<4>[    0.433512]  (3)[1:swapper/0]WARNING: CPU: 3 PID: 1 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1cc4/0x2460()
<4>[    0.433530]  (3)[1:swapper/0]Modules linked in:
<4>[    0.433539] -(3)[1:swapper/0]CPU: 3 PID: 1 Comm: swapper/0 Tainted: G        W       4.4.95+ #1
<4>[    0.433550] -(3)[1:swapper/0]Hardware name: MT6739CW (DT)
<4>[    0.433558] -(3)[1:swapper/0]Call trace:
<4>[    0.433566] -(3)[1:swapper/0][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[    0.433579] -(3)[1:swapper/0][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[    0.433591] -(3)[1:swapper/0][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[    0.433604] -(3)[1:swapper/0][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[    0.433616] -(3)[1:swapper/0][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[    0.433630] -(3)[1:swapper/0][<ffffff8008550e84>] ddp_dsi_config+0x1cc4/0x2460
<4>[    0.433642] -(3)[1:swapper/0][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[    0.433655] -(3)[1:swapper/0][<ffffff800858cb94>] primary_display_init+0x7f0/0xbfc
<4>[    0.433668] -(3)[1:swapper/0][<ffffff800857f444>] mtkfb_probe+0x16c/0x428
<4>[    0.433681] -(3)[1:swapper/0][<ffffff80083ca5f4>] platform_drv_probe+0x58/0xa8
<4>[    0.433694] -(3)[1:swapper/0][<ffffff80083c87ac>] driver_probe_device+0x280/0x430
<4>[    0.433706] -(3)[1:swapper/0][<ffffff80083c89a8>] __driver_attach+0x4c/0x90
<4>[    0.433719] -(3)[1:swapper/0][<ffffff80083c6864>] bus_for_each_dev+0xa0/0xb8
<4>[    0.433731] -(3)[1:swapper/0][<ffffff80083c80a4>] driver_attach+0x20/0x28
<4>[    0.433744] -(3)[1:swapper/0][<ffffff80083c7c54>] bus_add_driver+0x1f8/0x234
<4>[    0.433756] -(3)[1:swapper/0][<ffffff80083c94b0>] driver_register+0x98/0xd0
<4>[    0.433769] -(3)[1:swapper/0][<ffffff80083ca510>] __platform_driver_register+0x48/0x50
<4>[    0.433782] -(3)[1:swapper/0][<ffffff8008f2857c>] mtkfb_init+0x3c/0xb0
<4>[    0.433794] -(3)[1:swapper/0][<ffffff8008081c88>] do_one_initcall+0x94/0x1e4
<4>[    0.433806] -(3)[1:swapper/0][<ffffff8008ef4c70>] kernel_init_freeable+0x228/0x22c
<4>[    0.433818] -(3)[1:swapper/0][<ffffff8008ac25d0>] kernel_init+0x10/0x104
<4>[    0.433829] -(3)[1:swapper/0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    0.433842]  (3)[1:swapper/0]---[ end trace e335f74a8dfe3610 ]---
<5>[    0.433852]  (3)[1:swapper/0][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[    0.433860]  (3)[1:swapper/0][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[    0.433873]  (3)[1:swapper/0][DISP]===>new HSTX_CKL_WC=0x4000, HFP_WC=0x250
<6>[    0.433911]  (3)[1:swapper/0][DISP]state 6
<6>[    0.433922]  (3)[1:swapper/0][DISP]primary_display_init->dpmgr_path_start
<3>[    0.434048]  (3)[1:swapper/0][GAMMA] disp_gamma_write_lut_reg: gamma table [0] not initialized
<3>[    0.434048] 
<6>[    0.434098]  (3)[1:swapper/0][DDP/DSI]warn:DSI_Send_ROI(0,0,480,800)Done!
<6>[    0.450919]  (3)[1:swapper/0][DISP]share SRAM success
<6>[    0.451049]  (3)[1:swapper/0][DISP]primary_display_init done
<6>[    0.451071]  (3)[1:swapper/0][DISP]MTK_FB_XRES=480, MTKFB_YRES=800, MTKFB_BPP=32, MTK_FB_PAGES=3, MTKFB_LINE=1920, MTKFB_SIZEV=4608000
<6>[    0.451089]  (3)[1:swapper/0][DISP][FB Driver] fbdev->fb_pa_base = 0x77ad0000, fbdev->fb_va_base = 0xffffff800a800000
<6>[    0.451111]  (3)[1:swapper/0][DISP]mtkfb_fbinfo_init var.xres=480,var.yres=800,var.xres_virtual=480,var.yres_virtual=2400
<6>[    0.451134]  (3)[1:swapper/0][DISP]AEE is not enabled, will disable layer 3
<5>[    0.451170]  (3)[1:swapper/0][VcoreFS] feature_en: 0, init_done: 0, kr: 0, opp: 3
<4>[    0.451181]  (3)[1:swapper/0][pid=1]Set vcore step failed: 3
<4>[    0.451203]  (3)[1:swapper/0][MMDVFS][pid=1]Fixed,set scen:(23,0x0) step:(3,3,0x0,0x0,0x0,0x800000),C(0,0,0x0,0),I(0,0),CLK:0
<6>[    0.451228]  (3)[1:swapper/0][DISP]primary display will switch from DIRECT_LINK to RDMA_MODE
<6>[    0.451347]  (3)[1:swapper/0][DISP]primary display is RDMA_MODE mode now
<6>[    0.451427]  (3)[1:swapper/0][DISP]
<6>[    0.451427] mtkfb_fbinfo_init done
<6>[    0.453534]  (3)[1:swapper/0][DISP]DAL_Init done
<6>[    0.453546]  (3)[1:swapper/0][DISP]register_framebuffer start...
<6>[    0.453720]  (3)[1:swapper/0][DISP]register_framebuffer done
<6>[    0.453733]  (3)[1:swapper/0][DISP][DT][videolfb]isvideofb_parse_done = 1
<6>[    0.453745]  (3)[1:swapper/0][DISP][DT][videolfb]isvideofb_parse_done = 1
<3>[    0.453933]  (3)[1:swapper/0][ION]ion_drv_create_heap: create heap: ion_fb_heap
<3>[    0.453963]  (3)[1:swapper/0]BOOTPROF:       453.963462:probe: probe=platform_drv_probe drv=mtkfb(ffffff8009423808)    28.484847ms
<6>[    0.454179]  (3)[1:swapper/0][DISP]mtkfb_init mmm
<6>[    0.454228]  (3)[1:swapper/0][DISP]mtkfb_init LEAVE
<3>[    0.454245]  (3)[1:swapper/0]BOOTPROF:       454.245385:initcall: mtkfb_init    29.651307ms
<6>[    0.454803]  (3)[1:swapper/0][DISP]Fence timeline idx: present = 8, output = 7
<6>[    0.454866]  (3)[1:swapper/0][DFRC] start to initialize fps policy
<6>[    0.454876]  (3)[1:swapper/0][DFRC] register fps policy device
<6>[    0.454977]  (3)[1:swapper/0][DFRC] register fps policy driver
<6>[    0.455345]  (3)[1:swapper/0][DFRC] dfrc_init_kernel_policy
<6>[    0.455362]  (3)[1:swapper/0][DFRC] reg_fps_policy: reg policy[3]
<6>[    0.455375]  (3)[1:swapper/0][DFRC] reg_fps_policy: reg policy[2]
<6>[    0.455387]  (3)[1:swapper/0][DFRC] reg_fps_policy: reg policy[4]
<6>[    0.455400]  (3)[1:swapper/0][DFRC] reg_fps_policy: reg policy[5]
<4>[    0.465436]  (3)[1:swapper/0]kd_camera_hw supply vcama_main2 not found, using dummy regulator
<4>[    0.465508]  (3)[1:swapper/0]kd_camera_hw supply vcamd_main2 not found, using dummy regulator
<4>[    0.465564]  (3)[1:swapper/0]kd_camera_hw supply vcamio_main2 not found, using dummy regulator
<4>[    0.465613]  (3)[1:swapper/0]kd_camera_hw supply vcama_sub2 not found, using dummy regulator
<4>[    0.465666]  (3)[1:swapper/0]kd_camera_hw supply vcamd_sub2 not found, using dummy regulator
<4>[    0.465714]  (3)[1:swapper/0]kd_camera_hw supply vcamio_sub2 not found, using dummy regulator
<3>[    0.466327]  (3)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcama_1
<3>[    0.466340]  (3)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcama_0
<3>[    0.466350]  (3)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcamd_1
<3>[    0.466360]  (3)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcamd_0
<3>[    0.466370]  (3)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcamio_1
<3>[    0.466380]  (3)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcamio_0
<3>[    0.466390]  (3)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcamaf_1
<3>[    0.466399]  (3)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcamaf_0
<3>[    0.466410]  (3)[1:swapper/0]gpio_init : pinctrl err, (null)
<3>[    0.466419]  (3)[1:swapper/0]gpio_init : pinctrl err, (null)
<3>[    0.466430]  (3)[1:swapper/0]gpio_init : pinctrl err, cam2_pnd1
<3>[    0.466439]  (3)[1:swapper/0]gpio_init : pinctrl err, cam2_pnd0
<3>[    0.466448]  (3)[1:swapper/0]gpio_init : pinctrl err, cam2_rst1
<3>[    0.466458]  (3)[1:swapper/0]gpio_init : pinctrl err, cam2_rst0
<3>[    0.466466]  (3)[1:swapper/0]gpio_init : pinctrl err, (null)
<3>[    0.466475]  (3)[1:swapper/0]gpio_init : pinctrl err, (null)
<3>[    0.466484]  (3)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_main2_vcamd_1
<3>[    0.466494]  (3)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_main2_vcamd_0
<3>[    0.466503]  (3)[1:swapper/0]gpio_init : pinctrl err, cam3_pnd1
<3>[    0.466513]  (3)[1:swapper/0]gpio_init : pinctrl err, cam3_pnd0
<3>[    0.466522]  (3)[1:swapper/0]gpio_init : pinctrl err, cam3_rst1
<3>[    0.466531]  (3)[1:swapper/0]gpio_init : pinctrl err, cam3_rst0
<3>[    0.466539]  (3)[1:swapper/0]gpio_init : pinctrl err, (null)
<3>[    0.466548]  (3)[1:swapper/0]gpio_init : pinctrl err, (null)
<3>[    0.466557]  (3)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_sub2_vcamd_1
<3>[    0.466567]  (3)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_sub2_vcamd_0
<3>[    0.466599]  (3)[1:swapper/0]mclk_init : pinctrl err, cam0_mclk_on
<3>[    0.466617]  (3)[1:swapper/0]mclk_init : pinctrl err, cam1_mclk_on
<3>[    0.466627]  (3)[1:swapper/0]mclk_init : pinctrl err, cam2_mclk_on
<3>[    0.466637]  (3)[1:swapper/0]mclk_init : pinctrl err, cam2_mclk_on
<3>[    0.466645]  (3)[1:swapper/0]mclk_init : pinctrl err, (null)
<3>[    0.466857]  (3)[1:swapper/0]CAM_CAL_DRV[EEPROM_drv_init] EEPROM_drv_init Start!
<3>[    0.466869]  (3)[1:swapper/0]CAM_CAL_DRV[EEPROM_chrdev_register] EEPROM_chrdev_register Start
<3>[    0.466984]  (3)[1:swapper/0]CAM_CAL_DRV[EEPROM_chrdev_register] EEPROM_chrdev_register End
<3>[    0.466995]  (3)[1:swapper/0]CAM_CAL_DRV[EEPROM_drv_init] EEPROM_drv_init End!
<6>[    0.468975]  (3)[1:swapper/0][register_low_battery_notify] prio_val=5
<6>[    0.468996]  (3)[1:swapper/0][register_battery_percent_notify] prio_val=5
<6>[    0.469006]  (3)[1:swapper/0][register_battery_oc_notify] prio_val=5
<4>[    0.469504]  (3)[1:swapper/0]flash_switch =429   flash_en = 481 
<6>[    0.469526]  (3)[1:swapper/0]flashlight: flashlight_dev_register_by_device_id: Register device (0,0,0)
<5>[    0.470226]  (3)[1:swapper/0][ccci1/mcd]gpio pinctrl is not ready yet, use workaround.
<6>[    0.480471]  (3)[1:swapper/0][ccci1/rpc]interrupts:  not found
<6>[    0.480499]  (3)[1:swapper/0][ccci1/rpc]debounce:  not found
<6>[    0.480514]  (3)[1:swapper/0][ccci1/rpc]interrupts:  not found
<6>[    0.480528]  (3)[1:swapper/0][ccci1/rpc]interrupts:  not found
<6>[    0.480542]  (3)[1:swapper/0][ccci1/rpc]sockettype:  not found
<6>[    0.480556]  (3)[1:swapper/0][ccci1/rpc]dedicated:  not found
<6>[    0.480571]  (3)[1:swapper/0][ccci1/rpc]src_pin:  not found
<6>[    0.480649]  (3)[1:swapper/0][ccci1/rpc]interrupts:  not found
<6>[    0.480663]  (3)[1:swapper/0][ccci1/rpc]debounce:  not found
<6>[    0.480677]  (3)[1:swapper/0][ccci1/rpc]interrupts:  not found
<6>[    0.480691]  (3)[1:swapper/0][ccci1/rpc]interrupts:  not found
<6>[    0.480705]  (3)[1:swapper/0][ccci1/rpc]sockettype:  not found
<6>[    0.480719]  (3)[1:swapper/0][ccci1/rpc]dedicated:  not found
<6>[    0.480733]  (3)[1:swapper/0][ccci1/rpc]src_pin:  not found
<6>[    0.480886]  (3)[1:swapper/0][ccci0/rpc]get_md_dtsi_val 1, mediatek,md_drdi_rf_set_idx -- 0xf0f0f0f
<5>[    0.481024]  (3)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    0.481070]  (3)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    0.481114]  (3)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    0.481157]  (3)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    0.481199]  (3)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    0.481242]  (3)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    0.481285]  (3)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    0.481328]  (3)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    0.481371]  (3)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    0.481414]  (3)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<3>[    0.482179]  (3)[1:swapper/0][CONN-MD-DFT][W]conn_md_add_user:uid (0x00000005) is added to user list successfully
<5>[    0.483009]  (3)[1:swapper/0][ccci1/sys]swtp_init can't find compatible node
<5>[    0.492344]  (3)[1:swapper/0][Thermal/TZ/BTS] mtkts_bts_prepare_table table_num=7
<5>[    0.492382]  (3)[1:swapper/0][Thermal/TZ/BTSMDPA] mtkts_btsmdpa_prepare_table table_num=7
<6>[    0.492414]  (3)[1:swapper/0][Thermal/TZ/CPU]tscpu_init
<6>[    0.492853]  (3)[1:swapper/0][Thermal/TZ/CPU]thermal_prob
<6>[    0.493450]  (3)[1:swapper/0][Thermal/TZ/CPU][calibration] temp0=0x3c81dfd, temp1=0x12150e86, temp2=0x855f887f
<6>[    0.493472]  (3)[1:swapper/0][Thermal/TZ/CPU][cal] g_adc_ge_t      = 519
<6>[    0.493481]  (3)[1:swapper/0][Thermal/TZ/CPU][cal] g_adc_oe_t      = 509
<6>[    0.493490]  (3)[1:swapper/0][Thermal/TZ/CPU][cal] g_degc_cali     = 60
<6>[    0.493499]  (3)[1:swapper/0][Thermal/TZ/CPU][cal] g_adc_cali_en_t = 1
<6>[    0.493508]  (3)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_slope       = 0
<6>[    0.493516]  (3)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_slope_sign  = 0
<6>[    0.493525]  (3)[1:swapper/0][Thermal/TZ/CPU][cal] g_id            = 0
<6>[    0.493533]  (3)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_vtsmcu1     = 134
<6>[    0.493542]  (3)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_vtsmcu2     = 135
<6>[    0.493551]  (3)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_vtsmcu3     = 133
<6>[    0.493559]  (3)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_vtsabb      = 127
<6>[    0.493569]  (3)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_ge         = 17
<6>[    0.493577]  (3)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_gain       = 10017
<6>[    0.493586]  (3)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_x_roomt0   = 8498
<6>[    0.493595]  (3)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_x_roomt1   = 8500
<6>[    0.493605]  (3)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_x_roomt2   = 8495
<6>[    0.493614]  (3)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_x_roomt3   = 8481
<5>[    0.493855] -(3)[1:swapper/0][Thermal/TZ/CPU]Driver is NOT ready to report valid temperatures
<6>[    0.494767]  (3)[1:swapper/0][Thermal/TZ/PMIC] [mtktspmic_init]
<6>[    0.494784]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug]  start
<6>[    0.494828]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6357_efuse: g_o_vts        = 1595
<6>[    0.494837]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6357_efuse: g_o_vts_2      = 1532
<6>[    0.494846]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6357_efuse: g_o_vts_3      = 1537
<6>[    0.494855]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6357_efuse: g_degc_cali    = 50
<6>[    0.494865]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6357_efuse: g_adc_cali_en  = 1
<6>[    0.494874]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6357_efuse: g_o_slope      = 0
<6>[    0.494883]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6357_efuse: g_o_slope_sign = 0
<6>[    0.494892]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6357_efuse: g_id		   = 0
<6>[    0.494901]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug]  end
<6>[    0.494909]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts        = 0x63b
<6>[    0.494918]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts_2      = 0x5fc
<6>[    0.494927]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts_3      = 0x601
<6>[    0.494936]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_degc_cali    = 0x32
<6>[    0.494945]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_adc_cali_en  = 0x1
<6>[    0.494954]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_slope      = 0x0
<6>[    0.494963]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_slope_sign = 0x0
<6>[    0.494971]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_id           = 0x0
<6>[    0.494980]  (3)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1681 INTERCEPT=441418, Vbe = -700000
<6>[    0.494992]  (3)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1863 INTERCEPT=386245, Vbe = -673000
<6>[    0.495004]  (3)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1863 INTERCEPT=387318, Vbe = -675000
<5>[    0.496776]  (3)[1:swapper/0][mt6357_get_auxadc_value] ch_idx = 5, channel = 4, reg_val = 0x62b, adc_result = 693
<6>[    0.497184]  (3)[1:swapper/0][W]mtk_wcn_cmb_stub_query_ctrl:Thermal query not registered
<3>[    0.497239]  (3)[1:swapper/0][Thermal/TZ/IMGS][mtk_imgs_init]
<6>[    0.499972]  (3)[1:swapper/0][Thermal/TZ/CPU]tscpu_bind binding OK, 3
<6>[    0.500375]  (3)[1:swapper/0][Thermal/TZ/CPU]tscpu_bind binding OK, 1
<6>[    0.500623]  (3)[1:swapper/0][Thermal/TZ/CPU]tscpu_bind binding OK, 2
<6>[    0.502799]  (3)[1:swapper/0][Thermal/TZ/CPU]tscpu_bind binding OK, 0
<3>[    0.502987]  (3)[1:swapper/0][Cooler_NR]mtk_cooler_NR_init 208
<3>[    0.503075]  (3)[1:swapper/0][Cooler_NR]mtk_cooler_NR_init 226
<6>[    0.503179]  (3)[1:swapper/0][Thermal/TZ/PMIC] [mt6357tsbuck1_init]
<6>[    0.503190]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug]  start
<6>[    0.503230]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6357_efuse: g_o_vts        = 1595
<6>[    0.503240]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6357_efuse: g_o_vts_2      = 1532
<6>[    0.503249]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6357_efuse: g_o_vts_3      = 1537
<6>[    0.503259]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6357_efuse: g_degc_cali    = 50
<6>[    0.503268]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6357_efuse: g_adc_cali_en  = 1
<6>[    0.503277]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6357_efuse: g_o_slope      = 0
<6>[    0.503286]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6357_efuse: g_o_slope_sign = 0
<6>[    0.503295]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6357_efuse: g_id		   = 0
<6>[    0.503304]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug]  end
<6>[    0.503312]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts        = 0x63b
<6>[    0.503321]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts_2      = 0x5fc
<6>[    0.503330]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts_3      = 0x601
<6>[    0.503339]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_degc_cali    = 0x32
<6>[    0.503348]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_adc_cali_en  = 0x1
<6>[    0.503356]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_slope      = 0x0
<6>[    0.503365]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_slope_sign = 0x0
<6>[    0.503373]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_id           = 0x0
<6>[    0.503382]  (3)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1681 INTERCEPT=441418, Vbe = -700000
<6>[    0.503393]  (3)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1863 INTERCEPT=386245, Vbe = -673000
<6>[    0.503405]  (3)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1863 INTERCEPT=387318, Vbe = -675000
<6>[    0.505319]  (3)[1:swapper/0][Thermal/TZ/PMIC] [mt6357tsbuck2_init]
<6>[    0.505331]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug]  start
<6>[    0.505374]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6357_efuse: g_o_vts        = 1595
<6>[    0.505383]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6357_efuse: g_o_vts_2      = 1532
<6>[    0.505392]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6357_efuse: g_o_vts_3      = 1537
<6>[    0.505402]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6357_efuse: g_degc_cali    = 50
<6>[    0.505411]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6357_efuse: g_adc_cali_en  = 1
<6>[    0.505420]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6357_efuse: g_o_slope      = 0
<6>[    0.505429]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6357_efuse: g_o_slope_sign = 0
<6>[    0.505438]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6357_efuse: g_id		   = 0
<6>[    0.505447]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug]  end
<6>[    0.505455]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts        = 0x63b
<6>[    0.505465]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts_2      = 0x5fc
<6>[    0.505474]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts_3      = 0x601
<6>[    0.505483]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_degc_cali    = 0x32
<6>[    0.505492]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_adc_cali_en  = 0x1
<6>[    0.505500]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_slope      = 0x0
<6>[    0.505508]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_slope_sign = 0x0
<6>[    0.505516]  (3)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_id           = 0x0
<6>[    0.505525]  (3)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1681 INTERCEPT=441418, Vbe = -700000
<6>[    0.505536]  (3)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1863 INTERCEPT=386245, Vbe = -673000
<6>[    0.505547]  (3)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1863 INTERCEPT=387318, Vbe = -675000
<5>[    0.508368]  (3)[1:swapper/0]mrdump_key:EINT disabled,no dws configuration found
<6>[    0.508427]  (3)[1:swapper/0]mrdump_sysfs_init: done.
<5>[    0.508629]  (3)[1:swapper/0]atf_log: inited
<5>[    0.508772]  (3)[1:swapper/0]ATF reserved memory: 0xbfe00000 - 0xbfe3ffff (0x40000)
<5>[    0.508800]  (3)[1:swapper/0]atf_buf_phy_ctl: 0xbfe00000
<5>[    0.508810]  (3)[1:swapper/0]atf_buf_len: 262144
<5>[    0.508818]  (3)[1:swapper/0]atf_buf_vir_ctl: ffffff800a6ca000
<5>[    0.508827]  (3)[1:swapper/0]atf_log_vir_addr: ffffff800a6e0100
<5>[    0.508836]  (3)[1:swapper/0]atf_log_len: 98048
<5>[    0.508872]  (3)[1:swapper/0]atf irq num 16.
<5>[    0.509125]  (3)[1:swapper/0]atf_time_sync: inited
<4>[    0.511658]  (3)[1:swapper/0]USB_BOOST, <test_loops(), 346> id<-1>, loops:100000, spent 0 sec, 1801 usec
<4>[    0.513505]  (3)[1:swapper/0]USB_BOOST, <test_loops(), 346> id<0>, loops:100000, spent 0 sec, 1824 usec
<4>[    0.515455]  (3)[1:swapper/0]USB_BOOST, <test_loops(), 346> id<1>, loops:100000, spent 0 sec, 1790 usec
<5>[    0.516950] -(1)[54:kworker/u8:2][MUSB]musb_hub_control 352: port status 00000100
<4>[    0.517379]  (3)[1:swapper/0]USB_BOOST, <test_loops(), 346> id<2>, loops:100000, spent 0 sec, 1824 usec
<4>[    0.517478]  (3)[1:swapper/0]USB_BOOST, <create_sys_fs(), 514> 
<4>[    0.517770]  (3)[1:swapper/0]USB_BOOST, <usb_boost_set_para_and_arg(), 146> para_range:<4>
<4>[    0.517783]  (3)[1:swapper/0]USB_BOOST, <usb_boost_set_para_and_arg(), 146> para_range:<4>
<4>[    0.517794]  (3)[1:swapper/0]USB_BOOST, <usb_boost_set_para_and_arg(), 146> para_range:<4>
<4>[    0.517804]  (3)[1:swapper/0]USB_BOOST, <usb_boost_set_para_and_arg(), 146> para_range:<4>
<4>[    0.517814]  (3)[1:swapper/0]USB_BOOST, <usb_boost_set_para_and_arg(), 146> para_range:<4>
<4>[    0.517824]  (3)[1:swapper/0]USB_BOOST, <usb_boost_set_para_and_arg(), 146> para_range:<4>
<4>[    0.517868]  (3)[1:swapper/0]===aw9523 driver version v1.0.0
<4>[    0.517911]  (3)[1:swapper/0]aw9523_i2c_init end 
<4>[    0.517925]  (3)[1:swapper/0]AW2013_init
<4>[    0.517970]  (3)[1:swapper/0]SLhall_mod_init begin!
<4>[    0.518116]  (3)[1:swapper/0]register slhall device
<4>[    0.518126]  (3)[1:swapper/0]platform_device_slhall_register done!
<4>[    0.518465]  (3)[1:swapper/0]SLhall_probe begin!
<6>[    0.518626]  (3)[1:swapper/0]input: scan-keys as /devices/virtual/input/input1
<4>[    0.518644]  (3)[1:swapper/0][hall]kpd_hall_dev register : success!!
<4>[    0.518707]  (3)[1:swapper/0]SLhall switch_dev_register OK! 
<4>[    0.518726]  (3)[1:swapper/0]SLhall_probe : SLhall_INIT
<4>[    0.519050]  (3)[1:swapper/0]SLhall_probe done!
<4>[    0.519095]  (3)[1:swapper/0]SLhall platform_driver_register done!
<4>[    0.519104]  (3)[1:swapper/0]SLhall_mod_init done!
<4>[    0.519126]  (3)[1:swapper/0]****[battery_swap_init] begin to register driver
<4>[    0.519601]  (3)[1:swapper/0][battery_swap_setup_eint]
<4>[    0.519860]  (3)[1:swapper/0]****mt_gpio_set_debounce,gpiopin=0, debounce=0*** 
<4>[    0.519904]  (3)[1:swapper/0]battery_swap_irq = 140
<4>[    0.519979]  (3)[1:swapper/0][battery_swap_irq]battery_swap set EINT finished, battery_swap_irq=140, batteryswapdebounce=0 
<6>[    0.520474]  (3)[1:swapper/0]factory_data_probe+++
<6>[    0.520577] factory_data_probe--- (3)[1:swapper/0]proinfo_probe+++(get proinfo_property = 0)
<4>[    0.521038]  (3)[1:swapper/0](set proinfo_property = 0)
<3>[    0.521062]  (3)[1:swapper/0][proinfo_probe]cmdline=console=tty0 console=ttyMT0,921600n1 root=/dev/ram vmalloc=496M slub_max_order=0 slub_debug=OFZPU androidboot.hardware=mt6739 maxcpus=8 firmware_class.path=/vendor/firmware has_battery_removed=0 androidboot.verifiedbootstate=green bootopt=64S3,32N2,64N2 buildvariant=user androidboot.veritymode=enforcing androidboot.atm=disabled androidboot.meta_log_disable=0 printk.disable_uart=1 bootprof.pl_t=5505 bootprof.lk_t=1694 bootprof.logo_t=580 boot_reason=4 androidboot.serialno=19042B0005 proinfo_stress_test_enable=0 proinfo_enable_recovery_value=0 proinfo_charging_led_mode=1 androidboot.bootreason=wdt_by_pass_pwk motherboard_type=3 gpt=1 usb2jtag_mode=0 mrdump_ddrsv=yes mrdump_cb=0x10ea00,0x1600 mrdump_rsvmem=0x46000000,0x400000,0x44800000,0x9ef40,0x44000000,0x80000,0x4489ef00,0x1673
<3>[    0.521110]  (3)[1:swapper/0][proinfo_get_property_by_cml2kernel]ret=0
<3>[    0.521138]  (3)[1:swapper/0][proinfo_get_property_by_cml2kernel]ret=0
<3>[    0.521170]  (3)[1:swapper/0][proinfo_get_property_by_cml2kernel]ret=3
<3>[    0.521197]  (3)[1:swapper/0][proinfo_get_property_by_cml2kernel]ret=1
<6>[    0.521269]  (0)[4:kworker/0:0]usb usb1: usb_set_device_state 7->8
<3>[    0.524133]  (3)[1:swapper/0][SPI-UT]: [spi_dev_init]:[589]SPI_DEV_INIT.
<6>[    0.525079]  (3)[1:swapper/0]tun: Universal TUN/TAP device driver, 1.6
<6>[    0.525096]  (3)[1:swapper/0]tun: (C) 1999-2004 Max Krasnyansky <maxk@qualcomm.com>
<6>[    0.525178]  (3)[1:swapper/0]PPP generic driver version 2.4.2
<6>[    0.525282]  (3)[1:swapper/0]PPP BSD Compression module registered
<6>[    0.525299]  (3)[1:swapper/0]PPP Deflate Compression module registered
<6>[    0.525328]  (3)[1:swapper/0]PPP MPPE Compression module registered
<6>[    0.525348]  (3)[1:swapper/0]NET: Registered protocol family 24
<6>[    0.525482]  (3)[1:swapper/0]usbcore: registered new interface driver usb-storage
<6>[    0.525534]  (3)[1:swapper/0]usbcore: registered new interface driver ums-alauda
<6>[    0.525580]  (3)[1:swapper/0]usbcore: registered new interface driver ums-cypress
<6>[    0.525623]  (3)[1:swapper/0]usbcore: registered new interface driver ums-datafab
<6>[    0.525667]  (3)[1:swapper/0]usbcore: registered new interface driver ums-freecom
<6>[    0.525713]  (3)[1:swapper/0]usbcore: registered new interface driver ums-isd200
<6>[    0.525758]  (3)[1:swapper/0]usbcore: registered new interface driver ums-jumpshot
<6>[    0.525805]  (3)[1:swapper/0]usbcore: registered new interface driver ums-karma
<6>[    0.525852]  (3)[1:swapper/0]usbcore: registered new interface driver ums-onetouch
<6>[    0.525896]  (3)[1:swapper/0]usbcore: registered new interface driver ums-sddr09
<6>[    0.525940]  (3)[1:swapper/0]usbcore: registered new interface driver ums-sddr55
<6>[    0.525984]  (3)[1:swapper/0]usbcore: registered new interface driver ums-usbat
<6>[    0.526076]  (3)[1:swapper/0]usbcore: registered new interface driver usbserial
<6>[    0.526126]  (3)[1:swapper/0]usbcore: registered new interface driver trancevibrator
<6>[    0.526195]  (3)[1:swapper/0]usb_function_register name=acm
<6>[    0.526224]  (3)[1:swapper/0]usb_function_register name=gser
<6>[    0.526499]  (3)[1:swapper/0]usb_function_register name=rndis
<6>[    0.526521]  (3)[1:swapper/0]usb_function_register name=mass_storage
<6>[    0.526536]  (3)[1:swapper/0]usb_function_register name=ffs
<6>[    0.526551]  (3)[1:swapper/0]usb_function_register name=midi
<6>[    0.526565]  (3)[1:swapper/0]usb_function_register name=hid
<6>[    0.526579]  (3)[1:swapper/0]usb_function_register name=mtp
<6>[    0.526594]  (3)[1:swapper/0]usb_function_register name=ptp
<6>[    0.526610]  (3)[1:swapper/0]usb_function_register name=audio_source
<6>[    0.526626]  (3)[1:swapper/0]usb_function_register name=accessory
<6>[    0.527461]  (3)[1:swapper/0]input: mtk-kpd as /devices/platform/10010000.kp/input/input2
<4>[    0.530413]  (3)[1:swapper/0][tpd_em_log] :register device successfully
<4>[    0.530441]  (3)[1:swapper/0]<<GTP-INF>>[tpd_driver_init:1031]  Goodix touch panel driver init.
<6>[    0.532065]  (3)[1:swapper/0]mtk-tpd: [tpd]use-tpd-button = 1
<6>[    0.532084]  (3)[1:swapper/0]mtk-tpd: [tpd]tpd-filter-enable = 1, pixel_density = 146
<6>[    0.532097]  (3)[1:swapper/0]mtk-tpd: tpd-rst-ext-gpio-num not found
<4>[    0.532363]  (3)[1:swapper/0]Mapp dma regs successfully.
<3>[    0.532377]  (3)[1:swapper/0] mt_i2c_init driver as platform device
<6>[    0.533318]  (3)[1:swapper/0][I2C] id : 0, freq : 400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    0.533459]  (3)[1:swapper/0]mt-i2c 11007000.i2c: i2c0 clock source ffffffc03001d800,clock src frequency 12480000
<6>[    0.533970]  (3)[1:swapper/0][I2C] id : 1, freq : 400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    0.534069]  (3)[1:swapper/0]mt-i2c 11008000.i2c: i2c1 clock source ffffffc03002b700,clock src frequency 12480000
<3>[    0.534519]  (3)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11008000/irq_nfc
<3>[    0.534536]  (3)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11008000/gsensor
<3>[    0.534630]  (3)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11008000/aw9523_keypad
<3>[    0.534646]  (3)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11008000/battery_swap
<4>[    0.534873]  (3)[1:swapper/0]aw9523_i2c_probe~~~~~
<6>[    0.534895]  (3)[1:swapper/0]aw9523_led 1-0058: aw9523_parse_dt: reset gpio provided ok
<3>[    0.534910]  (3)[1:swapper/0]aw9523_led 1-0058: aw9523_i2c_probe: rst request failed
<4>[    0.534927]  (3)[1:swapper/0]key_array[0][0]= 2
<4>[    0.534936]  (3)[1:swapper/0]key_array[1][0]= 3
<4>[    0.534944]  (3)[1:swapper/0]key_array[2][0]= 4
<4>[    0.534953]  (3)[1:swapper/0]key_array[3][0]= 5
<4>[    0.534962]  (3)[1:swapper/0]key_array[4][0]= 6
<4>[    0.534971]  (3)[1:swapper/0]key_array[0][1]= 7
<4>[    0.534979]  (3)[1:swapper/0]key_array[1][1]= 8
<4>[    0.534987]  (3)[1:swapper/0]key_array[2][1]= 9
<4>[    0.534996]  (3)[1:swapper/0]key_array[3][1]= 10
<4>[    0.535005]  (3)[1:swapper/0]key_array[4][1]= 11
<4>[    0.535014]  (3)[1:swapper/0]key_array[0][2]= 12
<4>[    0.535022]  (3)[1:swapper/0]key_array[1][2]= 52
<4>[    0.535031]  (3)[1:swapper/0]key_array[2][2]= 249
<4>[    0.535040]  (3)[1:swapper/0]key_array[3][2]= 172
<4>[    0.535049]  (3)[1:swapper/0]key_array[4][2]= 240
<4>[    0.535057]  (3)[1:swapper/0]key_array[0][3]= 158
<4>[    0.535066]  (3)[1:swapper/0]key_array[1][3]= 14
<4>[    0.535074]  (3)[1:swapper/0]key_array[2][3]= 15
<4>[    0.535083]  (3)[1:swapper/0]key_array[3][3]= 105
<4>[    0.535092]  (3)[1:swapper/0]key_array[4][3]= 103
<4>[    0.535100]  (3)[1:swapper/0]key_array[0][4]= 108
<4>[    0.535109]  (3)[1:swapper/0]key_array[1][4]= 106
<4>[    0.535118]  (3)[1:swapper/0]key_array[2][4]= 183
<4>[    0.535126]  (3)[1:swapper/0]key_array[3][4]= 184
<4>[    0.535135]  (3)[1:swapper/0]key_array[4][4]= 476
<4>[    0.535143]  (3)[1:swapper/0]key_array[0][5]= 28
<4>[    0.535151]  (3)[1:swapper/0]key_array[1][5]= 477
<6>[    0.535308]  (3)[1:swapper/0]input: AW9523 as /devices/virtual/input/input3
<6>[    0.535401]  (3)[1:swapper/0]aw9523_hw_reset enter
<6>[    0.549145]  (3)[1:swapper/0]aw9523_read_chipid aw9523 detected
<4>[    0.549312]  (3)[1:swapper/0]col_temp = 7f
<4>[    0.549322]  (3)[1:swapper/0]P0_X[0] = 7d
<4>[    0.549331]  (3)[1:swapper/0]P0_X[1] = 7b
<4>[    0.549339]  (3)[1:swapper/0]P0_X[2] = 77
<4>[    0.549347]  (3)[1:swapper/0]P0_X[3] = 6f
<4>[    0.549355]  (3)[1:swapper/0]P0_X[4] = 5f
<4>[    0.549363]  (3)[1:swapper/0]P0_X[5] = 3f
<4>[    0.549371]  (3)[1:swapper/0]P0_X[6] = 7e
<4>[    0.549380]  (3)[1:swapper/0]P0_X[7] = 7e
<4>[    0.549388]  (3)[1:swapper/0]line_temp = 1f
<4>[    0.549395]  (3)[1:swapper/0]P1_Y[0] = 1e
<4>[    0.549403]  (3)[1:swapper/0]P1_Y[1] = 1d
<4>[    0.549411]  (3)[1:swapper/0]P1_Y[2] = 1b
<4>[    0.549419]  (3)[1:swapper/0]P1_Y[3] = 17
<4>[    0.549427]  (3)[1:swapper/0]P1_Y[4] = f
<4>[    0.549435]  (3)[1:swapper/0]P1_Y[5] = 1e
<4>[    0.549443]  (3)[1:swapper/0]P1_Y[6] = 1e
<4>[    0.549451]  (3)[1:swapper/0]P1_Y[7] = 1e
<4>[    0.549459]  (3)[1:swapper/0]p0_kbd_used_temp = 7e
<4>[    0.549468]  (3)[1:swapper/0]p1_kbd_used_temp=1f
<4>[    0.550731]  (3)[1:swapper/0]keypad_setup_eint
<4>[    0.551050]  (3)[1:swapper/0][rfid]rfid set EINT finished, rfid_irq=39
<6>[    0.551082]  (3)[1:swapper/0]aw9523_i2c_probe probe completed successfully!
<3>[    0.551107]  (3)[1:swapper/0]BOOTPROF:       551.107462:probe: probe=i2c_device_probe drv=aw9523_led(ffffff80094532e0)    16.226923ms
<4>[    0.551533]  (3)[1:swapper/0]AW2013_probe start1--->.
<4>[    0.551545]  (3)[1:swapper/0]AW2013 Platform data does not exist
<4>[    0.551553]  (3)[1:swapper/0]breathled_i2c_probe !!
<4>[    0.551561]  (3)[1:swapper/0]client->addr = 69 !!
<4>[    0.551570]  (3)[1:swapper/0]AW2013_i2c_client->addr = 69 !!
<5>[    0.660948]  (1)[177:krtatm][Thermal/TZ/CPU]krtatm_thread c 33500 p 0 cl 2147483647 gl 2147483647 s 0
<4>[    0.705117]  (3)[1:swapper/0]breathled_find_aw2013 OK!!
<4>[    0.705130]  (3)[1:swapper/0]breathled test breath !!
<4>[    0.705457]  (3)[1:swapper/0]create proc entry breathled successAW2013 Initializing is done
<3>[    0.705483]  (3)[1:swapper/0]BOOTPROF:       705.483462:probe: probe=i2c_device_probe drv=leds-AW2013(ffffff8009453470)   153.943462ms
<3>[    0.705527]  (3)[1:swapper/0]BOOTPROF:       705.527078:probe: probe=platform_drv_probe drv=mt-i2c(ffffff8009469510)   171.562539ms
<6>[    0.705625]  (3)[1:swapper/0][I2C] id : 2, freq : 400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    0.705761]  (3)[1:swapper/0]mt-i2c 11009000.i2c: i2c2 clock source ffffffc030038980,clock src frequency 12480000
<6>[    0.706294]  (3)[1:swapper/0]MAINAF [AF_i2c_probe] Start
<6>[    0.706305]  (3)[1:swapper/0]MAINAF [Register_AF_CharDrv] Start
<6>[    0.706399]  (3)[1:swapper/0]MAINAF [Register_AF_CharDrv] End
<6>[    0.706410]  (3)[1:swapper/0]MAINAF [AFRegulatorCtrl] AFIOC_S_SETPOWERCTRL regulator_put           (null)
<4>[    0.706690]  (3)[1:swapper/0]MAINAF supply vcamaf not found, using dummy regulator
<6>[    0.706764]  (3)[1:swapper/0]MAINAF [AFRegulatorCtrl] [Init] regulator_get ffffffc03003d600
<6>[    0.706776]  (3)[1:swapper/0]MAINAF [AF_i2c_probe] Attached!!
<6>[    0.706852]  (3)[1:swapper/0][I2C] id : 3, freq : 400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    0.706980]  (3)[1:swapper/0]mt-i2c 1100f000.i2c: i2c3 clock source ffffffc03003de80,clock src frequency 12480000
<4>[    0.707314]  (3)[1:swapper/0]pn553_probe: start...
<4>[    0.707325]  (3)[1:swapper/0]pn553_probe: step02 is ok
<4>[    0.707335]  (3)[1:swapper/0]pn553_dev=ffffffc030040800
<4>[    0.707344]  (3)[1:swapper/0]pn553_probe: step03 is ok
<4>[    0.707417]  (3)[1:swapper/0]pn553_probe: step04 is ok
<4>[    0.707427]  (3)[1:swapper/0]pn553_probe: step05 is ok
<4>[    0.707795]  (3)[1:swapper/0]pn553_dev->irq_gpio = 14
<4>[    0.708001]  (3)[1:swapper/0]pn553 client->irq = 37
<4>[    0.708070]  (3)[1:swapper/0]pn553_probe: set EINT finished, client->irq=37
<4>[    0.708083]  (3)[1:swapper/0]pn553_disable_irq
<4>[    0.708093]  (3)[1:swapper/0]pn553_platform_pinctrl_select
<4>[    0.708118]  (3)[1:swapper/0]pn553_probe: step06 success
<6>[    0.708217]  (3)[1:swapper/0][I2C] id : 4, freq : 400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    0.708329]  (3)[1:swapper/0]mt-i2c 11011000.i2c: i2c4 clock source ffffffc030041d00,clock src frequency 12480000
<6>[    0.708759]  (3)[1:swapper/0][I2C] id : 5, freq : 50000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    0.708857]  (3)[1:swapper/0]mt-i2c 11016000.i2c: i2c5 clock source ffffffc030048a80,clock src frequency 12480000
<4>[    0.709313]  (3)[1:swapper/0][fg_27542_driver_probe] address=55
<4>[    0.724924]  (3)[1:swapper/0]fg_27542 :  255  255  tempreture =62803 
<4>[    0.740922]  (3)[1:swapper/0]fg_27542 :  251  14  battery_vol =3835 
<4>[    0.756922]  (3)[1:swapper/0]fg_27542 :	53	0	soc =53 
<4>[    0.772923]  (3)[1:swapper/0]fg_27542 :	0	0	battery_current =0 
<3>[    0.772951]  (3)[1:swapper/0]BOOTPROF:       772.950770:probe: probe=i2c_device_probe drv=fg_27542(ffffff8009411a50)    63.627308ms
<3>[    0.772985]  (3)[1:swapper/0]i2c i2c-5: Failed to register i2c client fuel_gadge at 0x55 (-16)
<3>[    0.773001]  (3)[1:swapper/0]i2c i2c-5: of_i2c: Failure registering /i2c@11016000/fuel_gadge@55
<3>[    0.773030]  (3)[1:swapper/0]BOOTPROF:       773.030462:probe: probe=platform_drv_probe drv=mt-i2c(ffffff8009469510)    64.274847ms
<3>[    0.773911]  (3)[1:swapper/0]BOOTPROF:       773.910693:initcall: mt_i2c_init   241.709769ms
<5>[    0.774050]  (3)[1:swapper/0]netlink_kernel_create protol= 26
<5>[    0.774062]  (3)[1:swapper/0]netlink_kernel_create ok
<5>[    0.774894]  (3)[1:swapper/0]******** battery_dts_probe!! ********
<5>[    0.775297]  (3)[1:swapper/0]bat_plug:1 chr:1 info:0x480e
<5>[    0.775322] -(3)[1:swapper/0]mtk_rtc_hal_common: rtc_spare_reg[0] = {5aa, 255, 8}
<5>[    0.775342]  (3)[1:swapper/0][fgauge_read_RTC_boot_status] rtc_invalid 0 plugout 1 plugout_time 31 spare3 0xa0
<5>[    0.775703]  (3)[1:swapper/0][fgauge_get_profile_id]Battery id=(0) en:0,0
<5>[    0.776023]  (3)[1:swapper/0][BAT_probe] power_supply_register Battery Success !!
<6>[    0.776045]  (3)[1:swapper/0][lbat_user_register] hv=3500, lv1=3450, lv2=3200
<5>[    0.776219]  (3)[1:swapper/0] fg_swocv_v = 38382 len 5 fg_swocv_v_tmp 38382 ptim_lk_v[38382]
<5>[    0.776250]  (3)[1:swapper/0] fg_swocv_i = 4238 len 2 fg_swocv_i_tmp 42 ptim_lk_i[42]
<5>[    0.776278]  (3)[1:swapper/0] shutdown_time = 0238 len 1 shutdown_time_tmp 0 pl_shutdown_time[0]
<5>[    0.776305]  (3)[1:swapper/0] boot_voltage = 0238 len 1 boot_voltage_tmp 0 pl_bat_vol[0]
<5>[    0.778882]  (1)[192:battery_thread][mt6357_get_auxadc_value] ch_idx = 0, channel = 0, reg_val = 0x5999, adc_result = 3779
<4>[    0.792931]  (3)[1:swapper/0]=====FG=====::  battery_current =0 
<3>[    0.792962]  (3)[1:swapper/0]BOOTPROF:       792.962232:probe: probe=platform_drv_probe drv=battery(ffffff800946a3a0)    17.777231ms
<3>[    0.793001]  (3)[1:swapper/0]BOOTPROF:       793.000924:probe: pdev=battery(ffffff800946a7b8)    18.089308ms
<5>[    0.793027]  (3)[1:swapper/0]read DISABLE_MTKBATTERY fail
<5>[    0.793036]  (3)[1:swapper/0][fgauge_get_profile_id]Battery id=(0) en:0,0
<5>[    0.793046]  (3)[1:swapper/0]fg_custom_init_from_dts
<5>[    0.793063]  (3)[1:swapper/0]Get MTK_CHR_EXIST failed
<5>[    0.793074]  (3)[1:swapper/0]Get PSEUDO1_IQ_OFFSET BAT0 failed
<5>[    0.793093]  (3)[1:swapper/0]Get PMIC_MIN_VOL failed
<5>[    0.793103]  (3)[1:swapper/0]Get POWERON_SYSTEM_IBOOT failed
<5>[    0.793112]  (3)[1:swapper/0]Get FGC_FGV_TH1 failed
<5>[    0.793121]  (3)[1:swapper/0]Get FGC_FGV_TH2 failed
<5>[    0.793131]  (3)[1:swapper/0]Get FGC_FGV_TH3 failed
<5>[    0.793140]  (3)[1:swapper/0]Get UISOC_UPDATE_T failed
<5>[    0.793149]  (3)[1:swapper/0]Get UIFULLLIMIT_EN failed
<5>[    0.793159]  (3)[1:swapper/0]Get MULTI_GAUGE0_EN failed
<5>[    0.793168]  (3)[1:swapper/0]Get SHUTDOWN_GAUGE0_VOLTAGE failed
<3>[    0.795233]  (3)[1:swapper/0]BOOTPROF:       795.232770:probe: probe=platform_drv_probe drv=battery-dts(ffffff800946a450)    20.335385ms
<5>[    0.795370]  (3)[1:swapper/0][battery_init] Initialization : DONE
<3>[    0.795388]  (3)[1:swapper/0]BOOTPROF:       795.388232:initcall: battery_init    21.354538ms
<4>[    0.796339]  (3)[1:swapper/0]bq2429x_init ~~~
<4>[    0.796456]  (3)[1:swapper/0]bq2429x_charger_probe  ~~~
<6>[    0.797426]  (3)[1:swapper/0][bq2429x]:bq2429x_charger_probe: charger device bq2429x detected, revision:0
<6>[    0.797439]  (3)[1:swapper/0][bq2429x]:bq2429x_parse_dt: bq2429x_parse_dt
<4>[    0.797451]  (3)[1:swapper/0][bq2429x]:bq2429x_parse_dt: bq2429x_parse_dt: no alias name
<6>[    0.802667]  (3)[1:swapper/0][bq2429x]:bq2429x_charger_probe: BQ2429X charger driver probe successfully
<6>[    0.802725]  (3)[1:swapper/0][bq2429x]:bq2429x_init: Success to register bq2429x i2c driver.
<6>[    0.802871]  (3)[1:swapper/0]device-mapper: uevent: version 1.0.3
<6>[    0.803074]  (3)[1:swapper/0]device-mapper: ioctl: 4.34.0-ioctl (2015-10-28) initialised: dm-devel@redhat.com
<6>[    0.804356]  (3)[1:swapper/0][msdc]DT probe msdc0!
<6>[    0.804443]  (3)[1:swapper/0][msdc]of_iomap for MSDC0 TOP base @ 0xffffff800a740000
<6>[    0.804480]  (3)[1:swapper/0][msdc][msdc0] get irq # 258
<4>[    0.804776]  (3)[1:swapper/0]11230000.msdc supply vqmmc not found, using dummy regulator
<6>[    0.805320]  (3)[1:swapper/0][msdc][msdc0] hclk:383999878Hz, clk_ctl:ffffffc030064900, hclk_ctl:ffffffc030064a00
<6>[    0.805729]  (3)[1:swapper/0][msdc]DT probe msdc1!
<6>[    0.805811]  (3)[1:swapper/0][msdc]of_iomap for MSDC1 TOP base @ 0xffffff800a780000
<6>[    0.805844]  (3)[1:swapper/0][msdc][msdc1] get irq # 259
<6>[    0.806363]  (3)[1:swapper/0][msdc][msdc1] hclk:191999939Hz, clk_ctl:ffffffc03009e480, hclk_ctl:ffffffc03009e580
<6>[    0.807243]  (0)[54:kworker/u8:2][msdc]msdc0 power on
<6>[    0.807480]  (3)[1:swapper/0]hidraw: raw HID events driver (C) Jiri Kosina
<6>[    0.808632]  (3)[1:swapper/0]usbcore: registered new interface driver usbhid
<6>[    0.808645]  (3)[1:swapper/0]usbhid: USB HID core driver
<6>[    0.808847]  (3)[1:swapper/0]ashmem: initialized
<6>[    0.808975]  (3)[1:swapper/0]lowmemorykiller: lowmem_init: successful to register misc device!
<4>[    0.808998]  (1)[192:battery_thread]=====FG=====::  battery_current =-298 
<5>[    0.809012]  (1)[192:battery_thread][mt6357_get_auxadc_value] ch_idx = 2, channel = 3, bat_cur = 298, reg_val = 0x5f1, adc_result = 668
<6>[    0.810418]  (3)[1:swapper/0]usbcore: registered new interface driver snd-usb-audio
<4>[    0.812177]  (3)[1:swapper/0]AW87319 PA Init
<4>[    0.812748]  (3)[1:swapper/0]AW87319_pa_probe start!
<4>[    0.812838]  (3)[1:swapper/0][AW87319_pa_probe] Success to init AW87319 pinctrl.
<4>[    0.812988]  (3)[1:swapper/0][AW87319_pa_probe] Success to register AW87319 i2c driver.
<4>[    0.814958]  (3)[1:swapper/0]mtk_btcvsd_tx_probe: dev name mt-soc-btcvsd-tx-pcm
<4>[    0.815358]  (3)[1:swapper/0]mtk_soc_capture_platform_init
<4>[    0.815723]  (3)[1:swapper/0]mtk_capture_probe
<4>[    0.815735]  (3)[1:swapper/0]mtk_capture_probe: dev name mt-soc-ul1-pcm
<4>[    0.816702]  (3)[1:swapper/0]mtk_soc_dl1_probe: dev name mt-soc-dl1-pcm
<4>[    0.818506]  (3)[1:swapper/0]AudDrv_GPIO_probe
<4>[    0.818856]  (3)[1:swapper/0]AudDrv_GPIO_probe(), extbuck_fan53526_exist = 0
<3>[    0.818870]  (3)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_clk_mosi_off fail -19
<3>[    0.818881]  (3)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_clk_mosi_on fail -19
<3>[    0.818893]  (3)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_dat_miso2_off fail -19
<3>[    0.818904]  (3)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_dat_miso2_on fail -19
<3>[    0.818914]  (3)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_dat_mosi2_off fail -19
<3>[    0.818924]  (3)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_dat_mosi2_on fail -19
<3>[    0.818935]  (3)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state vow_dat_miso_off fail -19
<3>[    0.818944]  (3)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state vow_dat_miso_on fail -19
<3>[    0.818954]  (3)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state vow_clk_miso_off fail -19
<3>[    0.818964]  (3)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state vow_clk_miso_on fail -19
<3>[    0.818974]  (3)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_smartpa_reset fail -19
<3>[    0.818984]  (3)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_smartpa_on fail -19
<3>[    0.818994]  (3)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_smartpa_off fail -19
<3>[    0.819004]  (3)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_tdm_mode0 fail -19
<3>[    0.819014]  (3)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_tdm_mode1 fail -19
<3>[    0.819024]  (3)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state audpmicclk-mode0 fail -19
<3>[    0.819034]  (3)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state audpmicclk-mode1 fail -19
<3>[    0.819044]  (3)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state audi2s1-mode0 fail -19
<3>[    0.819053]  (3)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state audi2s1-mode1 fail -19
<3>[    0.819065]  (3)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state extamp2-pullhigh fail -19
<3>[    0.819075]  (3)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state extamp2-pulllow fail -19
<3>[    0.819085]  (3)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state rcvspk-pullhigh fail -19
<3>[    0.819094]  (3)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state rcvspk-pulllow fail -19
<3>[    0.819105]  (3)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state hpdepop-pullhigh fail -19
<3>[    0.819114]  (3)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state hpdepop-pulllow fail -19
<3>[    0.819125]  (3)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_clk_mosi_pull_high fail -19
<3>[    0.819135]  (3)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_clk_mosi_pull_low fail -19
<3>[    0.819370]  (3)[1:swapper/0]Auddrv_Reg_map
<3>[    0.819619]  (3)[1:swapper/0][mt_idle_ntf] <00>ffffff8008912bf4 (audio_idle_notify_call)
<4>[    0.819663]  (3)[1:swapper/0]InitSramManager mBlocknum = 9 mAud_Sram_Manager.mSramLength = 36864 mAud_Sram_Manager.mBlockSize = 4096
<4>[    0.819712]  (3)[1:swapper/0][ge_mt_soc_pcm_dl1] afe_irq_number=262
<4>[    0.820138]  (3)[1:swapper/0]mtk_soc_dummy_platform_init
<4>[    0.820653]  (3)[1:swapper/0]mtk_dummy_probe
<4>[    0.820667]  (3)[1:swapper/0]mtk_dummy_probe: dev name mt-soc-dummy-pcm
<4>[    0.820991]  (3)[1:swapper/0]mtk_soc_routing_platform_init
<4>[    0.821497]  (3)[1:swapper/0]mtk_afe_routing_probe
<4>[    0.821511]  (3)[1:swapper/0]mtk_afe_routing_probe: dev name mt-soc-routing-pcm
<4>[    0.821801]  (3)[1:swapper/0]mtk_soc_capture2_platform_init
<4>[    0.822237]  (3)[1:swapper/0]mtk_capture2_probe
<4>[    0.822249]  (3)[1:swapper/0]mtk_capture2_probe: dev name mt-soc-ul2-pcm
<3>[    0.822923]  (3)[1:swapper/0]mtk_i2s2_adc2_probe: dev name mt-soc-i2s2_adc2-pcm
<4>[    0.822978]  (3)[1:swapper/0]mtk_soc_voice_platform_init()
<4>[    0.823345]  (3)[1:swapper/0]mtk_voice_probe(), dev name mt-soc-voicemd1
<4>[    0.823612]  (3)[1:swapper/0]mtk_soc_voice_md2_platform_init()
<4>[    0.823993]  (3)[1:swapper/0]mtk_voice_md2_probe(), dev name mt-soc-voicemd2
<4>[    0.824984]  (0)[4:kworker/0:0]fg_27542 :  196  11  tempreture =3012 
<4>[    0.825008]  (0)[4:kworker/0:0]=====FG=====: temperature:280 
<4>[    0.827341]  (3)[1:swapper/0]mtk_I2S0dl1_soc_platform_init
<4>[    0.827707]  (3)[1:swapper/0]mtk_I2S0dl1_probe: dev name mt-soc-i2s0dl1-pcm
<4>[    0.827934]  (3)[1:swapper/0]mtk_soc_i2s0_awb_platform_init
<4>[    0.828302]  (3)[1:swapper/0]mtk_i2s0_awb_probe
<4>[    0.828314]  (3)[1:swapper/0]mtk_i2s0_awb_probe: dev name mt-soc-i2s0awb-pcm
<4>[    0.828534]  (3)[1:swapper/0]mtk_soc_uldlloopback_platform_init
<4>[    0.828889]  (3)[1:swapper/0]mtk_uldlloopback_probe
<4>[    0.828940]  (3)[1:swapper/0]mtk_uldlloopback_probe: dev name mt-soc-uldlloopback-pcm
<4>[    0.829695]  (3)[1:swapper/0]mtk_soc_dl2_probe: dev name mt-soc-dl2-pcm
<4>[    0.830522]  (3)[1:swapper/0]mtk_mrgrx_soc_platform_init
<4>[    0.830877]  (3)[1:swapper/0]mtk_mrgrx_probe
<4>[    0.830890]  (3)[1:swapper/0]mtk_mrgrx_probe: dev name mt-soc-mrgrx-pcm
<4>[    0.831120]  (3)[1:swapper/0]mtk_soc_mrgrx_awb_platform_init
<4>[    0.831475]  (3)[1:swapper/0]mtk_mrgrx_awb_probe
<4>[    0.831486]  (3)[1:swapper/0]mtk_mrgrx_awb_probe: dev name mt-soc-mrgrx-awb-pcm
<4>[    0.831716]  (3)[1:swapper/0]mtk_fm_i2s_soc_platform_init
<4>[    0.832065]  (3)[1:swapper/0]mtk_fm_i2s_probe
<4>[    0.832076]  (3)[1:swapper/0]mtk_fm_i2s_probe: dev name mt-soc-fm-i2s-pcm
<4>[    0.832648]  (3)[1:swapper/0]mtk_fm_i2s_awb_probe: dev name mt-soc-fm-i2s-awb-pcm
<4>[    0.834253]  (3)[1:swapper/0]mtk_soc_bt_dai_platform_init
<4>[    0.834660]  (3)[1:swapper/0]mtk_bt_dai_probe
<4>[    0.834673]  (3)[1:swapper/0]mtk_bt_dai_probe: dev name mt-soc-voip-bt-in
<4>[    0.834907]  (3)[1:swapper/0]mtk_dai_stub_init:
<4>[    0.835302]  (3)[1:swapper/0]mtk_dai_stub_dev_probe  name mt_soc_dai_name
<4>[    0.835314]  (3)[1:swapper/0]mtk_dai_stub_dev_probe: dev name mt-soc-dai-driver
<4>[    0.835374]  (3)[1:swapper/0]mtk_dai_stub_dev_probe: rc  = 0
<4>[    0.835579]  (3)[1:swapper/0]mtk_routing_init:
<4>[    0.835971]  (3)[1:swapper/0]mtk_routing_dev_probe  name mt_soc_routing_dai_name
<4>[    0.835984]  (3)[1:swapper/0]mtk_routing_dev_probe: dev name Routing-Control
<4>[    0.836188]  (3)[1:swapper/0]mtk_dummy_codec_init:
<4>[    0.836573]  (3)[1:swapper/0]mtk_dummy_codec_dev_probe: dev name mt-soc-dummy-codec
<6>[    0.839058]  (3)[1:swapper/0]mtk-audio 11220000.audio: mtk_spk_update_dai_link(), mtk_spk_type 0
<6>[    0.839084]  (3)[1:swapper/0]mtk-audio 11220000.audio: mtk_spk_update_dai_link(), ext_Speaker_Multimedia, codec dai name = snd-soc-dummy-dai, codec name = snd-soc-dummy
<6>[    0.839887]  (3)[1:swapper/0]mt6357_codec_init_reg
<6>[    0.839983]  (3)[1:swapper/0]InitCodecDefault
<6>[    0.839992]  (3)[1:swapper/0]+read_efuse_hp_impedance_current_calibration()
<6>[    0.840285]  (3)[1:swapper/0]read_efuse_hp_impedance_current_calibration(), polling OTP_CON13 = 0x0
<4>[    0.841102]  (1)[192:battery_thread]=====FG=====::  battery_current =-298 
<6>[    0.841110]  (0)[54:kworker/u8:2][msdc]msdc0 -> !!! Set<400KHz> Source<383999KHz> -> sclk<399KHz> timing<0> mode<0> div<240> hs400_div_dis<0>
<5>[    0.841129]  (1)[192:battery_thread][mt6357_get_auxadc_value] ch_idx = 2, channel = 3, bat_cur = 298, reg_val = 0x5f1, adc_result = 668
<6>[    0.841324]  (3)[1:swapper/0]read_efuse_hp_impedance_current_calibration(), efuse = 0x81
<6>[    0.841351]  (3)[1:swapper/0]-read_efuse_hp_impedance_current_calibration(), efuse: -1
<4>[    0.841756]  (3)[1:swapper/0]mtk_voice_platform_probe()
<4>[    0.841801]  (3)[1:swapper/0]mtk_afe_uldlloopback_probe
<4>[    0.841883]  (3)[1:swapper/0]dummy_codec_probe()
<4>[    0.841963]  (3)[1:swapper/0]mtk_afe_mrgrx_probe
<4>[    0.842006]  (3)[1:swapper/0]mtk_afe_mrgrx_awb_probe
<4>[    0.842366]  (3)[1:swapper/0]mtk_asoc_bt_dai_probe
<4>[    0.842525]  (3)[1:swapper/0]mtk_afe_capture2_probe
<4>[    0.842582]  (3)[1:swapper/0]mtk_i2s0_dl1_awb_probe
<4>[    0.842617]  (3)[1:swapper/0]mtk_voice_md2_platform_probe()
<4>[    0.842647]  (3)[1:swapper/0]mtk_afe_routing_platform_probe
<4>[    0.842822]  (3)[1:swapper/0]mtk_afe_fm_i2s_probe
<4>[    0.842986]  (3)[1:swapper/0]mtk_asoc_pcm_btcvsd_tx_platform_probe
<4>[    0.843037]  (3)[1:swapper/0]mtk_i2s2_adc2_data_probe
<6>[    0.843331]  (3)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-tx-dai <-> mt-soc-dl1dai-driver mapping ok
<6>[    0.843425]  (3)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-rx-dai <-> mt-soc-ul1dai-driver mapping ok
<6>[    0.843560]  (3)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voicemd1-dai <-> mt-soc-voicemd1dai-driver mapping ok
<6>[    0.843684]  (3)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-uldlloopback-dai <-> mt-soc-uldlloopbackdai-driver mapping ok
<6>[    0.843779]  (3)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-i2s0-dummy-dai-codec <-> mt-soc-i2s0dai-driver mapping ok
<6>[    0.843904]  (3)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-mrgrx-dai-codec <-> mt-soc-mrgrxdai-driver mapping ok
<6>[    0.844032]  (3)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-mrgrx-dummy-dai-codec <-> mt-soc-mrgrxdai-driver mapping ok
<6>[    0.844124]  (3)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-I2s0tx-dai <-> mt-soc-i2s0dl1dai-driver mapping ok
<6>[    0.844216]  (3)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-deepbuffer-tx-dai <-> snd-soc-dummy-dai mapping ok
<6>[    0.844305]  (3)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-dl1awb-dai <-> mt-soc-dl1awbdai-driver mapping ok
<6>[    0.844400]  (3)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voicemd1-bt-dai <-> mt-soc-voicemd1-btdai-driver mapping ok
<6>[    0.844491]  (3)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voipcall-btout-dai <-> mt-soc-voipcall-btdai-out-driver mapping ok
<6>[    0.844585]  (3)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voipcall-btin-dai <-> mt-soc-voipcall-btdai-in-driver mapping ok
<6>[    0.844688]  (3)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-tdmrx-dai-codec <-> mt-soc-tdmrxdai-driver mapping ok
<6>[    0.844781]  (3)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-fmmrg2tx-dummy-dai-codec <-> mt-soc-fmmrgtxdai-driver mapping ok
<6>[    0.844872]  (3)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-rx-dai2 <-> mt-soc-ul2dai-driver mapping ok
<6>[    0.845024]  (3)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-i2s0awb-dai <-> mt-soc-i2s0awbdai-driver mapping ok
<6>[    0.845151]  (3)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voicemd2-dai <-> mt-soc-voicemd2dai-driver mapping ok
<6>[    0.845277]  (3)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-dummy-dai-codec <-> snd-soc-dummy-dai mapping ok
<6>[    0.845373]  (3)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voicemd2-bt-dai <-> mt-soc-voicemd2-btdai-driver mapping ok
<6>[    0.845466]  (3)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-hp-impedance-dai <-> mt-soc-hpimpedancedai-driver mapping ok
<6>[    0.845556]  (3)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-fm-i2s-dai-codec <-> mt-soc-fmi2S-driver mapping ok
<6>[    0.845653]  (3)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-fm-i2s-dummy-dai-codec <-> mt-soc-fmi2S-driver mapping ok
<6>[    0.845745]  (3)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-tx-dai2 <-> mt-soc-dl2dai-driver mapping ok
<6>[    0.845842]  (3)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-offload-dai <-> snd-soc-dummy-dai mapping ok
<6>[    0.845970]  (3)[1:swapper/0]mtk-audio 11220000.audio: snd-soc-dummy-dai <-> snd-soc-dummy-dai mapping ok
<6>[    0.846096]  (3)[1:swapper/0]mtk-audio 11220000.audio: snd-soc-dummy-dai <-> snd-soc-dummy-dai mapping ok
<6>[    0.846189]  (3)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-dummy-dai-codec <-> mt-soc-anc-record-dai-driver mapping ok
<6>[    0.846373]  (3)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voiceusb-dai <-> snd-soc-dummy-dai mapping ok
<6>[    0.846494]  (3)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voiceusb-echoref-dai <-> snd-soc-dummy-dai mapping ok
<6>[    0.846619]  (3)[1:swapper/0]mtk-audio 11220000.audio: snd-soc-dummy-dai <-> snd-soc-dummy-dai mapping ok
<6>[    0.846746]  (3)[1:swapper/0]mtk-audio 11220000.audio: snd-soc-dummy-dai <-> snd-soc-dummy-dai mapping ok
<6>[    0.846844]  (3)[1:swapper/0]mtk-audio 11220000.audio: snd-soc-dummy-dai <-> mt-soc-i2s2adc2dai-driver mapping ok
<4>[    0.847167]  (3)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create FM_I2S_Capture debugfs file
<4>[    0.847191]  (3)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create FM_I2S_Playback debugfs file
<4>[    0.847253]  (3)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create MRGRX_CAPTURE debugfs file
<4>[    0.847280]  (3)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create MRGRX_PLayback debugfs file
<4>[    0.847307]  (3)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create SCPVoice_PLayback debugfs file
<4>[    0.847339]  (3)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create I2S0_PLayback debugfs file
<4>[    0.847360]  (3)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create ULDL_Loopback debugfs file
<4>[    0.847387]  (3)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create Voice_MD2_PLayback debugfs file
<4>[    0.847410]  (3)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create Voice_MD1_PLayback debugfs file
<4>[    0.847507]  (3)[1:swapper/0]mt-soc-codec mt-soc-codec: ASoC: Failed to create MRGRX_PLayback debugfs file
<4>[    0.847542]  (3)[1:swapper/0]mt-soc-codec mt-soc-codec: ASoC: Failed to create ULDL_Loopback debugfs file
<4>[    0.847585]  (3)[1:swapper/0]mt-soc-codec mt-soc-codec: ASoC: Failed to create Voice_USB_EchoRef debugfs file
<4>[    0.847606]  (3)[1:swapper/0]mt-soc-codec mt-soc-codec: ASoC: Failed to create Voice_USB_PLayback debugfs file
<4>[    0.847627]  (3)[1:swapper/0]mt-soc-codec mt-soc-codec: ASoC: Failed to create Voice_MD2_PLayback debugfs file
<4>[    0.847648]  (3)[1:swapper/0]mt-soc-codec mt-soc-codec: ASoC: Failed to create Voice_MD1_PLayback debugfs file
<4>[    0.847729]  (3)[1:swapper/0]mt-soc-dummy-codec mt-soc-dummy-codec: ASoC: Failed to create MRGRX_PLayback debugfs file
<4>[    0.847755]  (3)[1:swapper/0]mt-soc-dummy-codec mt-soc-dummy-codec: ASoC: Failed to create MultiMedia_Routing debugfs file
<4>[    0.847808]  (3)[1:swapper/0]mt-soc-dummy-codec mt-soc-dummy-codec: ASoC: Failed to create MultiMedia_Routing debugfs file
<4>[    0.847839]  (3)[1:swapper/0]mt-soc-dummy-codec mt-soc-dummy-codec: ASoC: Failed to create Voice_MD2_PLayback debugfs file
<4>[    0.847860]  (3)[1:swapper/0]mt-soc-dummy-codec mt-soc-dummy-codec: ASoC: Failed to create Voice_MD1_PLayback debugfs file
<6>[    0.852158]  (3)[1:swapper/0]Mirror/redirect action on
<6>[    0.852215]  (3)[1:swapper/0]u32 classifier
<6>[    0.852224]  (3)[1:swapper/0]    Performance counters on
<6>[    0.852232]  (3)[1:swapper/0]    input device check on
<6>[    0.852240]  (3)[1:swapper/0]    Actions configured
<6>[    0.852279]  (3)[1:swapper/0]Netfilter messages via NETLINK v0.30.
<6>[    0.852353]  (3)[1:swapper/0]nf_conntrack version 0.5.0 (16384 buckets, 65536 max)
<6>[    0.852833]  (3)[1:swapper/0]ctnetlink v0.93: registering with nfnetlink.
<6>[    0.853476]  (3)[1:swapper/0]xt_time: kernel timezone is -0000
<6>[    0.853641]  (3)[1:swapper/0]ipip: IPv4 over IPv4 tunneling driver
<6>[    0.854298]  (3)[1:swapper/0]ip_tables: (C) 2000-2006 Netfilter Core Team
<6>[    0.854513]  (3)[1:swapper/0]arp_tables: (C) 2002 David S. Miller
<6>[    0.854594]  (3)[1:swapper/0]Initializing XFRM netlink socket
<6>[    0.855116]  (3)[1:swapper/0]NET: Registered protocol family 10
<5>[    0.857432]  (1)[51:kworker/1:1][msdc][msdc_command_resp_polling]: msdc0 CMD<52> MSDC_INT_CMDTMO Arg<0x00000c00>
<5>[    0.857956]  (1)[51:kworker/1:1][msdc][msdc_command_resp_polling]: msdc0 CMD<52> MSDC_INT_CMDTMO Arg<0x80000c08>
<6>[    0.858395]  (3)[1:swapper/0]mip6: Mobile IPv6
<6>[    0.858436]  (3)[1:swapper/0]ip6_tables: (C) 2000-2006 Netfilter Core Team
<6>[    0.858635]  (3)[1:swapper/0]sit: IPv6 over IPv4 tunneling driver
<6>[    0.859204]  (3)[1:swapper/0]NET: Registered protocol family 17
<6>[    0.859252]  (3)[1:swapper/0]NET: Registered protocol family 15
<6>[    0.859307]  (3)[1:swapper/0]bridge: automatic filtering via arp/ip/ip6tables has been deprecated. Update your scripts to load br_netfilter if you need this.
<5>[    0.859346]  (3)[1:swapper/0]Bridge firewalling registered
<6>[    0.859360]  (3)[1:swapper/0]8021q: 802.1Q VLAN Support v1.8
<6>[    0.860354]  (3)[1:swapper/0][cpu_ntf] <00>ffffff80080850d4 (fpsimd_cpu_hotplug_notifier)
<5>[    0.860394]  (3)[1:swapper/0]Registered cp15_barrier emulation handler
<5>[    0.860423]  (3)[1:swapper/0]Registered setend emulation handler
<6>[    0.860457]  (3)[1:swapper/0][cpu_ntf] <00>ffffff8008095b88 (insn_cpu_hotplug_notify)
<6>[    0.861697]  (3)[1:swapper/0][cpu_ntf] <00>ffffff80080fc098 (console_cpu_notify)
<6>[    0.861768]  (3)[1:swapper/0]registered taskstats version 1
<6>[    0.861839]  (1)[51:kworker/1:1]cma: cma usage create success.
<5>[    0.861936]  (1)[51:kworker/1:1][msdc][msdc_command_resp_polling]: msdc0 CMD<8> MSDC_INT_CMDTMO Arg<0x000001aa>
<6>[    0.862014]  (1)[51:kworker/1:1][msdc]msdc0 -> XXX CMD<8><0x1aa> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/1:1><0x33>
<5>[    0.862469]  (1)[51:kworker/1:1][msdc][msdc_command_resp_polling]: msdc0 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    0.862976]  (1)[51:kworker/1:1][msdc][msdc_command_resp_polling]: msdc0 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    0.863152]  (3)[1:swapper/0]Key type encrypted registered
<5>[    0.863478]  (1)[51:kworker/1:1][msdc][msdc_command_resp_polling]: msdc0 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    0.863981]  (1)[51:kworker/1:1][msdc][msdc_command_resp_polling]: msdc0 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    0.864486]  (1)[51:kworker/1:1][msdc][msdc_command_resp_polling]: msdc0 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    0.864852]  (3)[1:swapper/0][cpu_ntf] <00>ffffff800880789c (cpufreq_cpu_callback)
<6>[    0.864887]  (3)[1:swapper/0][cpu_ntf] <00>ffffff80083f2cd8 (_mt_cpufreq_cpu_CB)
<5>[    0.864937]  (3)[1:swapper/0][Power/PPM] DVFS table type = 1
<5>[    0.864947]  (3)[1:swapper/0][Power/PPM] DVFS table of cluster 0:
<5>[    0.864956]  (3)[1:swapper/0][Power/PPM] 0: 1495000 KHz
<5>[    0.864965]  (3)[1:swapper/0][Power/PPM] 1: 1378000 KHz
<5>[    0.864973]  (3)[1:swapper/0][Power/PPM] 2: 1274000 KHz
<5>[    0.864982]  (3)[1:swapper/0][Power/PPM] 3: 1170000 KHz
<5>[    0.864991]  (3)[1:swapper/0][Power/PPM] 4: 1105000 KHz
<5>[    0.864994]  (1)[51:kworker/1:1][msdc][msdc_command_resp_polling]: msdc0 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    0.865009]  (3)[1:swapper/0][Power/PPM] 5: 1053000 KHz
<5>[    0.865018]  (3)[1:swapper/0][Power/PPM] 6: 1001000 KHz
<5>[    0.865026]  (3)[1:swapper/0][Power/PPM] 7: 962000 KHz
<5>[    0.865035]  (3)[1:swapper/0][Power/PPM] 8: 910000 KHz
<5>[    0.865043]  (3)[1:swapper/0][Power/PPM] 9: 845000 KHz
<5>[    0.865052]  (3)[1:swapper/0][Power/PPM] 10: 702000 KHz
<5>[    0.865060]  (3)[1:swapper/0][Power/PPM] 11: 624000 KHz
<5>[    0.865068]  (3)[1:swapper/0][Power/PPM] 12: 546000 KHz
<5>[    0.865077]  (3)[1:swapper/0][Power/PPM] 13: 416000 KHz
<5>[    0.865085]  (3)[1:swapper/0][Power/PPM] 14: 338000 KHz
<5>[    0.865094]  (3)[1:swapper/0][Power/PPM] 15: 299000 KHz
<5>[    0.865494]  (1)[51:kworker/1:1][msdc][msdc_command_resp_polling]: msdc0 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    0.865999]  (1)[51:kworker/1:1][msdc][msdc_command_resp_polling]: msdc0 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    0.866051]  (2)[1:swapper/0][Power/PPM] (0x1)(-1)(0)(0-3)(7)(7)(4)(4) [(1)(7)(0)(-1)] 
<5>[    0.866723]  (2)[1:swapper/0][Power/PPM] (0x0)(-1)(0)(0-3)(15)(0)(4)(4) 
<6>[    0.867563]  (2)[1:swapper/0][HPS] hps_init
<6>[    0.867576]  (2)[1:swapper/0][HPS] hps_cpu_init
<6>[    0.867585]  (2)[1:swapper/0][HPS] [New algo.] hps_sys.cluster_num 1
<6>[    0.867596]  (2)[1:swapper/0][HPS] 0: func_id 3840, enabled 1
<6>[    0.867606]  (2)[1:swapper/0][HPS] 1: func_id 3841, enabled 1
<6>[    0.867615]  (2)[1:swapper/0][HPS] 2: func_id 3842, enabled 1
<6>[    0.868145]  (2)[1:swapper/0][HPS] hps_probe
<6>[    0.868210]  (2)[1:swapper/0][HPS] hps_core_init, setup_max_cpus ==> 8
<6>[    0.868345]  (0)[1:swapper/0][HPS] hps_task_start success, ptr: ffffffc0307f9000, pid: 214
<6>[    0.868351]  (2)[214:hps_main][HPS] hps_ctxt.init_state: 0
<6>[    0.868358]  (2)[214:hps_main][HPS] hps_ctxt.state: 0
<6>[    0.868366]  (2)[214:hps_main][HPS] hps_ctxt.enabled: 1
<6>[    0.868371]  (2)[214:hps_main][HPS] hps_ctxt.suspend_enabled: 1
<6>[    0.868377]  (2)[214:hps_main][HPS] hps_ctxt.is_hmp: 0
<6>[    0.868383]  (2)[214:hps_main][HPS] hps_ctxt.little_cpu_id_min: 0
<6>[    0.868388]  (2)[214:hps_main][HPS] hps_ctxt.little_cpu_id_max: 3
<6>[    0.868394]  (2)[214:hps_main][HPS] hps_ctxt.big_cpu_id_min: 4
<6>[    0.868400]  (2)[214:hps_main][HPS] hps_ctxt.big_cpu_id_max: 7
<6>[    0.868407]  (2)[214:hps_main]CPU request is 0x0
<5>[    0.868448]  (0)[1:swapper/0][Power/PPM] @ppm_lcmoff_policy_init: register PPM_POLICY_LCM_OFF done!
<5>[    0.868466]  (0)[1:swapper/0][Power/PPM] basic power table:
<5>[    0.868476]  (0)[1:swapper/0][Power/PPM] [0][0] = (328, 1024)
<5>[    0.868487]  (0)[1:swapper/0][Power/PPM] [0][1] = (287, 932)
<5>[    0.868497]  (0)[1:swapper/0][Power/PPM] [0][2] = (246, 841)
<5>[    0.868507]  (0)[1:swapper/0][Power/PPM] [0][3] = (213, 749)
<5>[    0.868517]  (0)[1:swapper/0][Power/PPM] [0][4] = (195, 708)
<5>[    0.868527]  (0)[1:swapper/0][Power/PPM] [0][5] = (184, 674)
<5>[    0.868536]  (0)[1:swapper/0][Power/PPM] [0][6] = (172, 641)
<5>[    0.868547]  (0)[1:swapper/0][Power/PPM] [0][7] = (161, 608)
<5>[    0.868556]  (0)[1:swapper/0][Power/PPM] [0][8] = (142, 549)
<5>[    0.868566]  (0)[1:swapper/0][Power/PPM] [0][9] = (126, 500)
<5>[    0.868576]  (0)[1:swapper/0][Power/PPM] [0][10] = (108, 450)
<5>[    0.868586]  (0)[1:swapper/0][Power/PPM] [0][11] = (93, 400)
<5>[    0.868596]  (0)[1:swapper/0][Power/PPM] [0][12] = (79, 350)
<5>[    0.868606]  (0)[1:swapper/0][Power/PPM] [0][13] = (57, 266)
<5>[    0.868616]  (0)[1:swapper/0][Power/PPM] [0][14] = (45, 216)
<5>[    0.868626]  (0)[1:swapper/0][Power/PPM] [0][15] = (40, 191)
<5>[    0.868636]  (0)[1:swapper/0][Power/PPM] [1][0] = (589, 2048)
<5>[    0.868645]  (0)[1:swapper/0][Power/PPM] [1][1] = (516, 1864)
<5>[    0.868655]  (0)[1:swapper/0][Power/PPM] [1][2] = (441, 1682)
<5>[    0.868664]  (0)[1:swapper/0][Power/PPM] [1][3] = (381, 1498)
<5>[    0.868674]  (0)[1:swapper/0][Power/PPM] [1][4] = (350, 1416)
<5>[    0.868684]  (0)[1:swapper/0][Power/PPM] [1][5] = (330, 1348)
<5>[    0.868694]  (0)[1:swapper/0][Power/PPM] [1][6] = (308, 1282)
<5>[    0.868704]  (0)[1:swapper/0][Power/PPM] [1][7] = (289, 1216)
<5>[    0.868713]  (0)[1:swapper/0][Power/PPM] [1][8] = (254, 1098)
<5>[    0.868723]  (0)[1:swapper/0][Power/PPM] [1][9] = (226, 1000)
<5>[    0.868732]  (0)[1:swapper/0][Power/PPM] [1][10] = (193, 900)
<5>[    0.868742]  (0)[1:swapper/0][Power/PPM] [1][11] = (167, 800)
<5>[    0.868752]  (0)[1:swapper/0][Power/PPM] [1][12] = (142, 700)
<5>[    0.868761]  (0)[1:swapper/0][Power/PPM] [1][13] = (102, 532)
<5>[    0.868771]  (0)[1:swapper/0][Power/PPM] [1][14] = (81, 432)
<5>[    0.868781]  (0)[1:swapper/0][Power/PPM] [1][15] = (72, 382)
<5>[    0.868790]  (0)[1:swapper/0][Power/PPM] [2][0] = (850, 3072)
<5>[    0.868800]  (0)[1:swapper/0][Power/PPM] [2][1] = (744, 2796)
<5>[    0.868810]  (0)[1:swapper/0][Power/PPM] [2][2] = (636, 2523)
<5>[    0.868820]  (0)[1:swapper/0][Power/PPM] [2][3] = (550, 2247)
<5>[    0.868829]  (0)[1:swapper/0][Power/PPM] [2][4] = (504, 2124)
<5>[    0.868839]  (0)[1:swapper/0][Power/PPM] [2][5] = (476, 2022)
<5>[    0.868848]  (0)[1:swapper/0][Power/PPM] [2][6] = (444, 1923)
<5>[    0.868858]  (0)[1:swapper/0][Power/PPM] [2][7] = (417, 1824)
<5>[    0.868880]  (0)[1:swapper/0][Power/PPM] [2][8] = (366, 1647)
<5>[    0.868890]  (0)[1:swapper/0][Power/PPM] [2][9] = (326, 1500)
<5>[    0.868941]  (0)[1:swapper/0][Power/PPM] [2][10] = (279, 1350)
<5>[    0.868952]  (0)[1:swapper/0][Power/PPM] [2][11] = (241, 1200)
<5>[    0.868962]  (0)[1:swapper/0][Power/PPM] [2][12] = (205, 1050)
<5>[    0.868971]  (0)[1:swapper/0][Power/PPM] [2][13] = (147, 798)
<5>[    0.868981]  (0)[1:swapper/0][Power/PPM] [2][14] = (117, 648)
<5>[    0.868991]  (0)[1:swapper/0][Power/PPM] [2][15] = (104, 573)
<5>[    0.869001]  (0)[1:swapper/0][Power/PPM] [3][0] = (1110, 4096)
<5>[    0.869010]  (0)[1:swapper/0][Power/PPM] [3][1] = (973, 3728)
<5>[    0.869020]  (0)[1:swapper/0][Power/PPM] [3][2] = (831, 3364)
<5>[    0.869029]  (0)[1:swapper/0][Power/PPM] [3][3] = (719, 2996)
<5>[    0.869039]  (0)[1:swapper/0][Power/PPM] [3][4] = (659, 2832)
<5>[    0.869049]  (0)[1:swapper/0][Power/PPM] [3][5] = (622, 2696)
<5>[    0.869059]  (0)[1:swapper/0][Power/PPM] [3][6] = (580, 2564)
<5>[    0.869068]  (0)[1:swapper/0][Power/PPM] [3][7] = (545, 2432)
<5>[    0.869077]  (0)[1:swapper/0][Power/PPM] [3][8] = (478, 2196)
<5>[    0.869087]  (0)[1:swapper/0][Power/PPM] [3][9] = (426, 2000)
<5>[    0.869097]  (0)[1:swapper/0][Power/PPM] [3][10] = (364, 1800)
<5>[    0.869107]  (0)[1:swapper/0][Power/PPM] [3][11] = (315, 1600)
<5>[    0.869116]  (0)[1:swapper/0][Power/PPM] [3][12] = (267, 1400)
<5>[    0.869126]  (0)[1:swapper/0][Power/PPM] [3][13] = (192, 1064)
<5>[    0.869136]  (0)[1:swapper/0][Power/PPM] [3][14] = (153, 864)
<5>[    0.869146]  (0)[1:swapper/0][Power/PPM] [3][15] = (136, 764)
<5>[    0.869155]  (0)[1:swapper/0][Power/PPM] COBRA init done!
<6>[    0.869170]  (0)[1:swapper/0][cpu_ntf] <00>ffffff800840b950 (ppm_cpu_hotplug_callback)
<5>[    0.869189]  (0)[1:swapper/0][Power/PPM] power data init done!
<6>[    0.869424]  (0)[1:swapper/0][SPM] pmic_ver 2
<6>[    0.869593]  (0)[1:swapper/0][SPM] spm_base = ffffff800a7fc000, sleep_reg_md_base = ffffff800a7fe000, spm_irq_0 = 215
<6>[    0.870046]  (0)[1:swapper/0][SPM] edge trigger irqs: 218, 232, 295
<6>[    0.870057]  (0)[1:swapper/0][SPM] dram_rank_num: 2
<6>[    0.870065]  (0)[1:swapper/0][SPM] dummy read addr: rank0: 0x61fff000, rank1: 0xbfdff000
<6>[    0.870075]  (0)[1:swapper/0][SPM] dummy read addr(4GB: 0): rank0: 0x61fff000, rank1: 0xbfdff000
<6>[    0.871257]  (0)[1:swapper/0]#@# spm_module_init(663) is_ext_buck_exist() 0x0
<5>[    0.871437]  (0)[1:swapper/0][VcoreFS] spm_dvfsrc_register_init: dvfsrc_base = ffffff800b348000
<5>[    0.871477]  (0)[1:swapper/0][VcoreFS] dram_issue: 0x0
<5>[    0.871503]  (0)[1:swapper/0][VcoreFS] curr_vcore_uv: 1150000, curr_ddr_khz: 1333000
<5>[    0.871515]  (0)[1:swapper/0][VcoreFS] opp 0: vcore_uv: 1150000, ddr_khz: 1344000
<5>[    0.871525]  (0)[1:swapper/0][VcoreFS] opp 1: vcore_uv: 1118750, ddr_khz: 1066000
<5>[    0.871534]  (0)[1:swapper/0][VcoreFS] opp 2: vcore_uv: 1087500, ddr_khz: 1066000
<5>[    0.871544]  (0)[1:swapper/0][VcoreFS] opp 3: vcore_uv: 1050000, ddr_khz: 1066000
<5>[    0.871574]  (0)[1:swapper/0][VcoreFS] spm_vcorefs_pwarp_cmd: atf
<5>[    0.871590]  (0)[1:swapper/0][VcoreFS] pcm_flag: 0x400
<5>[    0.872690]  (0)[1:swapper/0][VcoreFS] [spm_go_to_vcorefs] done
<5>[    0.872718]  (0)[1:swapper/0][VcoreFS] opp: 3, vcore: 1050000 <= 1150000, fddr: 1066000 <= 1333000 [O][O]
<5>[    0.872739] -(0)[1:swapper/0][VcoreFS] [spm_trigger_dvfs] fix: 0, opp: 3, vcore: 0xc000000, emi: 0x11001, md: 0x0
<5>[    0.872752]  (0)[1:swapper/0][VcoreFS] [vcorefs_late_init_dvfs] late_init_opp: 3, sw_opp: 3 (4)
<5>[    0.872764]  (0)[1:swapper/0][VcoreFS] [vcorefs_drv_init] done
<4>[    0.872773]  (0)[1:swapper/0][MMDVFS][pid=1]mmdvfs service is disabled for vcore calibration
<4>[    0.872782]  (0)[1:swapper/0][pid=1]mmdvfs_notify_prepare_action: 0
<4>[    0.872944]  (0)[4:kworker/0:0]=====FG=====::  soc =53 
<4>[    0.888930]  (0)[4:kworker/0:0]=====FG=====::  battery_current =-298 
<6>[    0.897823]  (1)[51:kworker/1:1]mmc0: MAN_BKOPS_EN bit is not set
<6>[    0.901479]  (1)[51:kworker/1:1][msdc]msdc0 -> !!! Set<200000KHz> Source<383999KHz> -> sclk<191999KHz> timing<9> mode<0> div<0> hs400_div_dis<0>
<6>[    0.902543]  (1)[51:kworker/1:1][AUTOK]eMMC HS200 Tune
<6>[    0.906605]  (1)[51:kworker/1:1][AUTOK]CMD 0 	 38 	 OOOOOOOOOOOOOOOOOOOXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
<6>[    0.909560]  (1)[51:kworker/1:1][AUTOK]CMD 1 	 43 	 XOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXOOOOOOOOOOOOOO
<6>[    0.909574]  (1)[51:kworker/1:1][AUTOK]Analysis Result: 1T = 50
<6>[    0.909620]  (1)[51:kworker/1:1][AUTOK]dev status 0x00000900
<6>[    0.914766]  (1)[51:kworker/1:1][AUTOK]DAT 0 	 36 	 OOOOOOOOOOOOOOOOOOOXXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
<6>[    0.919817]  (1)[51:kworker/1:1][AUTOK]DAT 1 	 40 	 XXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXXOOOOOOOOOOOOO
<6>[    0.919831]  (1)[51:kworker/1:1][AUTOK]Analysis Result: 1T = 52
<6>[    0.919874]  (1)[51:kworker/1:1][AUTOK]CMD [EDGE:0 CMD_FIFO_EDGE:0 DLY1:0 DLY2:0]
<6>[    0.919885]  (1)[51:kworker/1:1][AUTOK]DAT [RDAT_EDGE:0 RD_FIFO_EDGE:0 WD_FIFO_EDGE:0]
<6>[    0.919895]  (1)[51:kworker/1:1][AUTOK]DAT [LATCH_CK:0 DLY1:0 DLY2:0]
<6>[    0.919904]  (1)[51:kworker/1:1][AUTOK]DS  [DLY1:0 DLY2:0 DLY3:0]
<6>[    0.919914]  (1)[51:kworker/1:1][AUTOK]CLK TX  [0]
<6>[    0.919922]  (1)[51:kworker/1:1][AUTOK]CMD TX  [0]
<6>[    0.919930]  (1)[51:kworker/1:1][AUTOK]DAT TX  [D0:0 D1:0 D2:0 D3:0]
<6>[    0.919940]  (1)[51:kworker/1:1][AUTOK]DAT TX  [D4:0 D5:0 D6:0 D7:0]
<6>[    0.919953]  (1)[51:kworker/1:1][AUTOK][HS200]======Cost:17 ms======
<4>[    0.920928]  (0)[4:kworker/0:0]=====FG=====::	battery_current =-1 battery_vol_original=3810
<4>[    0.920942]  (0)[4:kworker/0:0]=====FG=====:: battery_vol =3810 
<6>[    0.921004]  (1)[51:kworker/1:1][msdc]msdc0 -> !!! Set<52000KHz> Source<383999KHz> -> sclk<47999KHz> timing<9> mode<0> div<2> hs400_div_dis<0>
<6>[    0.921236]  (1)[51:kworker/1:1][msdc]msdc0 -> !!! Set<200000KHz> Source<383999KHz> -> sclk<191999KHz> timing<10> mode<3> div<0> hs400_div_dis<1>
<6>[    0.922305]  (1)[51:kworker/1:1][AUTOK]eMMC HS400 Tune
<6>[    0.925028]  (1)[51:kworker/1:1][AUTOK]CMD 0 	 36 	 OOOOOOOOOOOOOOOOOOOOOXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
<6>[    0.926627]  (1)[51:kworker/1:1][AUTOK]CMD 1 	 43 	 XXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXOOOOOOOOOOOOO
<6>[    0.926638]  (1)[51:kworker/1:1][AUTOK]Analysis Result: 1T = 52
<6>[    0.926682]  (1)[51:kworker/1:1][AUTOK]device status 0x00000900
<6>[    0.928230]  (1)[51:kworker/1:1][AUTOK]DLY1/2 0 	 20 	 XXOOOOOOOOOOOOOOOOOOOOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
<6>[    0.928274]  (1)[51:kworker/1:1][AUTOK]CMD [EDGE:0 CMD_FIFO_EDGE:0 DLY1:0 DLY2:0]
<6>[    0.928283]  (1)[51:kworker/1:1][AUTOK]DAT [RDAT_EDGE:0 RD_FIFO_EDGE:0 WD_FIFO_EDGE:0]
<6>[    0.928292]  (1)[51:kworker/1:1][AUTOK]DAT [LATCH_CK:0 DLY1:0 DLY2:0]
<6>[    0.928300]  (1)[51:kworker/1:1][AUTOK]DS  [DLY1:11 DLY2:0 DLY3:12]
<6>[    0.928308]  (1)[51:kworker/1:1][AUTOK]CLK TX  [0]
<6>[    0.928315]  (1)[51:kworker/1:1][AUTOK]CMD TX  [0]
<6>[    0.928322]  (1)[51:kworker/1:1][AUTOK]DAT TX  [D0:0 D1:0 D2:0 D3:0]
<6>[    0.928331]  (1)[51:kworker/1:1][AUTOK]DAT TX  [D4:0 D5:0 D6:0 D7:0]
<6>[    0.928342]  (1)[51:kworker/1:1][AUTOK][HS400]======Cost:6 ms======
<5>[    0.928360]  (1)[51:kworker/1:1][msdc]msdc0:disable mmc retune
<6>[    0.928368]  (0)[1:swapper/0]emmc autok
<5>[    0.928458]  (0)[1:swapper/0][VcoreFS] [AUTOK] kicker: KIR_AUTOK_EMMC, opp: 0, dvfs_opp: 0, sw_opp: 3
<6>[    0.928460]  (1)[51:kworker/1:1]mmc0: new HS400 MMC card at address 0001
<5>[    0.928489]  (0)[1:swapper/0][VcoreFS] opp: 0, vcore: 1150000 <= 1150000, fddr: 1344000 <= 1333000 [O][O]
<5>[    0.930064] -(0)[1:swapper/0][VcoreFS] [spm_trigger_dvfs] fix: 1, opp: 0, vcore: 0x200000, emi: 0x101000, md: 0x0
<6>[    0.932172]  (0)[1:swapper/0][AUTOK]eMMC HS400 Tune
<6>[    0.933200]  (1)[51:kworker/1:1]mmcblk0: mmc0:0001 QE63MB 14.6 GiB 
<6>[    0.934931]  (0)[1:swapper/0][AUTOK]CMD 0 	 36 	 OOOOOOOOOOOOOOOOOOOOOOXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
<6>[    0.936542]  (0)[1:swapper/0][AUTOK]CMD 1 	 43 	 XXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXOOOOOOOOOOOOO
<6>[    0.936554]  (0)[1:swapper/0][AUTOK]Analysis Result: 1T = 52
<6>[    0.936598]  (0)[1:swapper/0][AUTOK]device status 0x00000900
<6>[    0.937562]  (1)[51:kworker/1:1]mmcblk0boot0: mmc0:0001 QE63MB partition 1 4.00 MiB
<6>[    0.937829]  (1)[51:kworker/1:1]mmcblk0boot1: mmc0:0001 QE63MB partition 2 4.00 MiB
<6>[    0.938186]  (0)[1:swapper/0][AUTOK]DLY1/2 0 	 20 	 XXOOOOOOOOOOOOOOOOOOOOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
<6>[    0.938237]  (0)[1:swapper/0][AUTOK]CMD [EDGE:0 CMD_FIFO_EDGE:0 DLY1:0 DLY2:0]
<6>[    0.938246]  (0)[1:swapper/0][AUTOK]DAT [RDAT_EDGE:0 RD_FIFO_EDGE:0 WD_FIFO_EDGE:0]
<6>[    0.938255]  (0)[1:swapper/0][AUTOK]DAT [LATCH_CK:0 DLY1:0 DLY2:0]
<6>[    0.938263]  (0)[1:swapper/0][AUTOK]DS  [DLY1:11 DLY2:0 DLY3:12]
<6>[    0.938271]  (0)[1:swapper/0][AUTOK]CLK TX  [0]
<6>[    0.938279]  (0)[1:swapper/0][AUTOK]CMD TX  [0]
<6>[    0.938286]  (0)[1:swapper/0][AUTOK]DAT TX  [D0:0 D1:0 D2:0 D3:0]
<6>[    0.938294]  (0)[1:swapper/0][AUTOK]DAT TX  [D4:0 D5:0 D6:0 D7:0]
<6>[    0.938306]  (0)[1:swapper/0][AUTOK][HS400]======Cost:6 ms======
<5>[    0.938317]  (0)[1:swapper/0][VcoreFS] [AUTOK] kicker: KIR_AUTOK_EMMC, opp: 1, dvfs_opp: 1, sw_opp: 0
<5>[    0.938338]  (0)[1:swapper/0][VcoreFS] opp: 1, vcore: 1118750 <= 1150000, fddr: 1066000 <= 1333000 [O][O]
<5>[    0.938359] -(0)[1:swapper/0][VcoreFS] [spm_trigger_dvfs] fix: 1, opp: 1, vcore: 0x200000, emi: 0x1000, md: 0x0
<6>[    0.939753]  (0)[1:swapper/0][AUTOK]eMMC HS400 Tune
<4>[    0.940981]  (0)[4:kworker/0:0]fg_27542 :  196  11  tempreture =3012 
<4>[    0.940994]  (0)[4:kworker/0:0]=====FG=====: temperature:280 
<6>[    0.942153]  (1)[51:kworker/1:1]mmcblk0rpmb: mmc0:0001 QE63MB partition 3 4.00 MiB
<6>[    0.942678]  (0)[1:swapper/0][AUTOK]CMD 0 	 38 	 OOOOOOOOOOOOOOOOOOOOXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
<6>[    0.944318]  (0)[1:swapper/0][AUTOK]CMD 1 	 41 	 XXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXOOOOOOOOOOOOOOOO
<6>[    0.944330]  (0)[1:swapper/0][AUTOK]Analysis Result: 1T = 48
<6>[    0.944378]  (0)[1:swapper/0][AUTOK]device status 0x00000900
<6>[    0.945916]  (0)[1:swapper/0][AUTOK]DLY1/2 0 	 19 	 XXOOOOOOOOOOOOOOOOOOOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
<6>[    0.945966]  (0)[1:swapper/0][AUTOK]CMD [EDGE:0 CMD_FIFO_EDGE:0 DLY1:0 DLY2:0]
<6>[    0.945975]  (0)[1:swapper/0][AUTOK]DAT [RDAT_EDGE:0 RD_FIFO_EDGE:0 WD_FIFO_EDGE:0]
<6>[    0.945983]  (0)[1:swapper/0][AUTOK]DAT [LATCH_CK:0 DLY1:0 DLY2:0]
<6>[    0.945992]  (0)[1:swapper/0][AUTOK]DS  [DLY1:11 DLY2:0 DLY3:12]
<6>[    0.946000]  (0)[1:swapper/0][AUTOK]CLK TX  [0]
<6>[    0.946007]  (0)[1:swapper/0][AUTOK]CMD TX  [0]
<6>[    0.946014]  (0)[1:swapper/0][AUTOK]DAT TX  [D0:0 D1:0 D2:0 D3:0]
<6>[    0.946022]  (0)[1:swapper/0][AUTOK]DAT TX  [D4:0 D5:0 D6:0 D7:0]
<6>[    0.946034]  (0)[1:swapper/0][AUTOK][HS400]======Cost:6 ms======
<5>[    0.946047]  (0)[1:swapper/0][VcoreFS] [AUTOK] kicker: KIR_AUTOK_EMMC, opp: 2, dvfs_opp: 2, sw_opp: 1
<5>[    0.946068]  (0)[1:swapper/0][VcoreFS] opp: 2, vcore: 1087500 <= 1118750, fddr: 1066000 <= 1066000 [O][O]
<5>[    0.946089] -(0)[1:swapper/0][VcoreFS] [spm_trigger_dvfs] fix: 1, opp: 2, vcore: 0x100000, emi: 0x1000, md: 0x0
<6>[    0.946407]  (0)[1:swapper/0][AUTOK]eMMC HS400 Tune
<6>[    0.949209]  (0)[1:swapper/0][AUTOK]CMD 0 	 40 	 OOOOOOOOOOOOOOOOOOXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
<6>[    0.950883]  (0)[1:swapper/0][AUTOK]CMD 1 	 39 	 XOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXOOOOOOOOOOOOOOOOOO
<6>[    0.950896]  (0)[1:swapper/0][AUTOK]Analysis Result: 1T = 46
<6>[    0.950939]  (0)[1:swapper/0][AUTOK]device status 0x00000900
<6>[    0.952393]  (0)[1:swapper/0][AUTOK]DLY1/2 0 	 18 	 XXOOOOOOOOOOOOOOOOOOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
<6>[    0.952436]  (0)[1:swapper/0][AUTOK]CMD [EDGE:0 CMD_FIFO_EDGE:0 DLY1:0 DLY2:0]
<6>[    0.952445]  (0)[1:swapper/0][AUTOK]DAT [RDAT_EDGE:0 RD_FIFO_EDGE:0 WD_FIFO_EDGE:0]
<6>[    0.952453]  (0)[1:swapper/0][AUTOK]DAT [LATCH_CK:0 DLY1:0 DLY2:0]
<6>[    0.952461]  (0)[1:swapper/0][AUTOK]DS  [DLY1:10 DLY2:0 DLY3:12]
<6>[    0.952469]  (0)[1:swapper/0][AUTOK]CLK TX  [0]
<6>[    0.952476]  (0)[1:swapper/0][AUTOK]CMD TX  [0]
<6>[    0.952483]  (0)[1:swapper/0][AUTOK]DAT TX  [D0:0 D1:0 D2:0 D3:0]
<6>[    0.952492]  (0)[1:swapper/0][AUTOK]DAT TX  [D4:0 D5:0 D6:0 D7:0]
<6>[    0.952503]  (0)[1:swapper/0][AUTOK][HS400]======Cost:6 ms======
<5>[    0.952512]  (0)[1:swapper/0][VcoreFS] [AUTOK] kicker: KIR_AUTOK_EMMC, opp: 3, dvfs_opp: 3, sw_opp: 2
<5>[    0.952530]  (0)[1:swapper/0][VcoreFS] opp: 3, vcore: 1050000 <= 1087500, fddr: 1066000 <= 1066000 [O][O]
<5>[    0.952552] -(0)[1:swapper/0][VcoreFS] [spm_trigger_dvfs] fix: 1, opp: 3, vcore: 0x0, emi: 0x1000, md: 0x0
<6>[    0.952871]  (0)[1:swapper/0][AUTOK]eMMC HS400 Tune
<6>[    0.955557]  (0)[1:swapper/0][AUTOK]CMD 0 	 39 	 OOOOOOOOOOOOOOOOOXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXX
<6>[    0.957301]  (0)[1:swapper/0][AUTOK]CMD 1 	 37 	 XOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXOOOOOOOOOOOOOOOOOOOOOO
<6>[    0.957314]  (0)[1:swapper/0][AUTOK]Analysis Result: 1T = 44
<6>[    0.957364]  (0)[1:swapper/0][AUTOK]device status 0x00000900
<6>[    0.958784]  (0)[1:swapper/0][AUTOK]DLY1/2 0 	 17 	 XXOOOOOOOOOOOOOOOOOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
<6>[    0.958828]  (0)[1:swapper/0][AUTOK]CMD [EDGE:0 CMD_FIFO_EDGE:0 DLY1:0 DLY2:0]
<6>[    0.958837]  (0)[1:swapper/0][AUTOK]DAT [RDAT_EDGE:0 RD_FIFO_EDGE:0 WD_FIFO_EDGE:0]
<6>[    0.958846]  (0)[1:swapper/0][AUTOK]DAT [LATCH_CK:0 DLY1:0 DLY2:0]
<6>[    0.958854]  (0)[1:swapper/0][AUTOK]DS  [DLY1:10 DLY2:0 DLY3:12]
<6>[    0.958862]  (0)[1:swapper/0][AUTOK]CLK TX  [0]
<6>[    0.958869]  (0)[1:swapper/0][AUTOK]CMD TX  [0]
<6>[    0.958876]  (0)[1:swapper/0][AUTOK]DAT TX  [D0:0 D1:0 D2:0 D3:0]
<6>[    0.958884]  (0)[1:swapper/0][AUTOK]DAT TX  [D4:0 D5:0 D6:0 D7:0]
<6>[    0.958896]  (0)[1:swapper/0][AUTOK][HS400]======Cost:6 ms======
<6>[    0.958906]  (0)[1:swapper/0][AUTOK]CMD 0 	 33 	 OOOOOOOOOOOOOOOOOXXXXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXX merge
<6>[    0.958918]  (0)[1:swapper/0][AUTOK]CMD 1 	 36 	 XXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXXXXXXOOOOOOOOOOOOO merge
<6>[    0.958929]  (0)[1:swapper/0][AUTOK]cmd edge = 1 cmd dly = 19 max win = 35
<6>[    0.958949]  (0)[1:swapper/0][AUTOK]dat dly = 0
<6>[    0.958957]  (0)[1:swapper/0][AUTOK]DLY1/2 	 17 	 XXOOOOOOOOOOOOOOOOOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX merge
<6>[    0.958973]  (0)[1:swapper/0][AUTOK]DS dly = 10
<6>[    0.958981]  (0)[1:swapper/0][AUTOK][merge]======Time Cost:0 ms======
<6>[    0.958989]  (0)[1:swapper/0][AUTOK]merge_value = 35
<6>[    0.958996]  (0)[1:swapper/0][AUTOK]merge_value = 16
<6>[    0.959035]  (0)[1:swapper/0][AUTOK]No need change para when dvfs
<5>[    0.959050]  (0)[1:swapper/0][VcoreFS] kicker: KIR_AUTOK_EMMC, opp: -1, dvfs_opp: 3, sw_opp: 3, kr opp: -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
<5>[    0.959062]  (0)[1:swapper/0][VcoreFS] [AUTOK] kicker: KIR_SYSFS, opp: 3, dvfs_opp: 3, sw_opp: 3
<5>[    0.959080]  (0)[1:swapper/0][VcoreFS] opp: 3, vcore: 1050000 <= 1050000, fddr: 1066000 <= 1066000 [O][O]
<5>[    0.959099] -(0)[1:swapper/0][VcoreFS] [spm_trigger_dvfs] fix: 0, opp: 3, vcore: 0x0, emi: 0x11001, md: 0x0
<5>[    0.959128]  (0)[1:swapper/0][VcoreFS] EMMC autok done: Yes
<6>[    0.959137]  (0)[1:swapper/0]sd autok
<5>[    0.959144]  (0)[1:swapper/0][VcoreFS] SD autok done: Yes
<5>[    0.959152]  (0)[1:swapper/0][VcoreFS] [spm_msdc_dvfs_setting] MSDC AUTOK FINISH
<4>[    0.959161]  (0)[1:swapper/0][MMDVFS][pid=1]mmdvfs service has been enabled
<4>[    0.959169]  (0)[1:swapper/0][pid=1]mmdvfs_notify_prepare_action: 1
<5>[    0.959178]  (0)[1:swapper/0][VcoreFS] SDIO autok done: Yes
<5>[    0.959186]  (0)[1:swapper/0][VcoreFS] [spm_vcorefs_init] DONE
<5>[    0.959195]  (0)[1:swapper/0][SPM] PWAKE_EN:1, PCMWDT_EN:1, BYPASS_SYSPWREQ:1
<3>[    0.959219]  (0)[1:swapper/0]BOOTPROF:       959.219386:initcall: mt_spm_init    90.003923ms
<6>[    0.959735]  (0)[1:swapper/0][Power/dcm] weak function of dcm_pre_init
<6>[    0.959757]  (0)[1:swapper/0][Power/dcm] [dcm_set_default]type:0x00000007, init_dcm_type=0x7, INIT_DCM_TYPE_BY_K=0x0
<6>[    0.959767]  (0)[1:swapper/0][Power/dcm] [     ARMCORE_DCM 0x00000001] current state:1 (0)
<6>[    0.959776]  (0)[1:swapper/0][Power/dcm] [      MCUSYS_DCM 0x00000002] current state:1 (0)
<6>[    0.959804]  (0)[1:swapper/0][Power/dcm] [       INFRA_DCM 0x00000004] current state:1 (0)
<6>[    0.959830]  (0)[1:swapper/0][Power/dcm] 
<6>[    0.959830] ******** dcm dump register *********
<6>[    0.959841]  (0)[1:swapper/0][Power/dcm] INFRA_BUS_DCM_CTRL            (0xffffff800b354070): 0x40ff4203
<6>[    0.959851]  (0)[1:swapper/0][Power/dcm] PERI_BUS_DCM_CTRL             (0xffffff800b354074): 0xb07f83e3
<6>[    0.959860]  (0)[1:swapper/0][Power/dcm] MEM_DCM_CTRL                  (0xffffff800b354078): 0x03e007be
<6>[    0.959870]  (0)[1:swapper/0][Power/dcm] DFS_MEM_DCM_CTRL              (0xffffff800b35407c): 0x00000000
<6>[    0.959879]  (0)[1:swapper/0][Power/dcm] P2P_RX_CLK_ON                 (0xffffff800b3540a0): 0x00000000
<6>[    0.959888]  (0)[1:swapper/0][Power/dcm] INFRA_TOPCKGEN_DCMCTL         (0xffffff800b356008): 0x00000004
<6>[    0.959897]  (0)[1:swapper/0][Power/dcm] DRAMC_DRAMC_PD_CTRL           (0xffffff800b35a1dc): 0xd365487a
<6>[    0.959907]  (0)[1:swapper/0][Power/dcm] L2C_SRAM_CTRL                 (0xffffff800b358648): 0x000c0081
<6>[    0.959915]  (0)[1:swapper/0][Power/dcm] CCI_CLK_CTRL                  (0xffffff800b358660): 0x00000117
<6>[    0.959924]  (0)[1:swapper/0][Power/dcm] BUS_FABRIC_DCM_CTRL           (0xffffff800b358668): 0x00040303
<6>[    0.959934]  (0)[1:swapper/0][Power/dcm] MCU_MISC_DCM_CTRL             (0xffffff800b35866c): 0x00000001
<6>[    0.959943]  (0)[1:swapper/0][Power/dcm] EMI_CONM                      (0xffffff800b35c060): 0x000006b0
<6>[    0.959952]  (0)[1:swapper/0][Power/dcm] EMI_CONN                      (0xffffff800b35c068): 0x00000000
<6>[    0.959961]  (0)[1:swapper/0][Power/dcm] CHN0_EMI_CHN_EMI_CONB         (0xffffff800b35e008): 0x00000040
<6>[    0.959988]  (0)[1:swapper/0][Power/dcm] weak function of dcm_set_hotplug_nb
<6>[    0.960178]  (0)[1:swapper/0][cpu_ntf] <00>ffffff800841e9e8 (mcdi_cpu_callback)
<6>[    0.960198]  (0)[1:swapper/0][cpu_ntf] <00>ffffff800841e9a0 (mcdi_cpu_callback_leave_hotplug)
<3>[    0.960288]  (0)[1:swapper/0]set_mcdi_s_state = 5
<6>[    0.960381]  (0)[1:swapper/0][cpu_ntf] <00>ffffff8008420e1c (cpu_hotplug_handler)
<6>[    0.960576]  (0)[1:swapper/0]sched_hint_init: failed to set sched_fifo
<3>[    0.960865]  (0)[1:swapper/0][ALS/PS] stk3x1x_i2c_probe: driver version: 3.9.2 20170630
<4>[    0.960951]  (0)[1:swapper/0]client->addr======48
<3>[    0.960964]  (0)[1:swapper/0][ALS/PS] stk3x1x_i2c_probe: enable PS interrupt
<3>[    0.961176]  (1)[1:swapper/0][ALS/PS] stk3x1x_init_client: In
<3>[    0.961195]  (1)[1:swapper/0][ALS/PS] stk3x1x_write_sw_reset: In
<6>[    0.961442]  (1)[51:kworker/1:1] mmcblk0: p1 p2 p3 p4 p5 p6 p7 p8 p9 p10 p11 p12 p13 p14 p15 p16 p17 p18 p19 p20 p21 p22 p23 p24 p25 p26 p27 p28 p29 p30 p31 p32 p33 p34 p35 p36
<3>[    0.964562]  (1)[51:kworker/1:1]BOOTPROF:       964.560924:probe: probe=mmc_bus_probe drv=mmcblk(ffffff8009475850)    35.829693ms
<3>[    0.981174]  (1)[1:swapper/0][ALS/PS] stk3x1x_read_id: PID=0x12, VID=0xc3
<3>[    0.985939]  (1)[1:swapper/0][ALS/PS] stk3x1x_otp_read_byte_data: 0x25=0x0
<3>[    0.986092]  (1)[1:swapper/0][ALS/PS] stk3x1x_read_id: p_wv_r_bd_with_co = 0x2
<3>[    0.986100]  (1)[1:swapper/0][ALS/PS] stk3x1x_read_id: p_1x_r_bd_with_co = 0x6
<3>[    0.986106]  (1)[1:swapper/0][ALS/PS] stk3x1x_read_id: p_19_r_bc = 0x0
<3>[    0.986201]  (1)[1:swapper/0][ALS/PS] stk3x1x_setup_eint 3060 : Cannot find alsps pinctrl default!
<3>[    0.986230]  (1)[1:swapper/0][ALS/PS] ints[0] = 0, ints[1] = 0!!
<3>[    0.986255]  (1)[1:swapper/0][ALS/PS] stk3x1x_obj->irq = 24
<3>[    0.987762]  (1)[1:swapper/0][ALS/PS] stk3x1x_i2c_probe: state_val=0x0, psctrl_val=0x30, alsctrl_val=0x38, ledctrl_val=0xff, wait_val=0x7, int_val=0x1
<3>[    0.987777]  (1)[1:swapper/0][ALS/PS] stk3x1x_i2c_probe() OK!
<3>[    0.987783]  (1)[1:swapper/0][ALS/PS] stk3x1x_i2c_probe: OK
<3>[    0.987801]  (1)[1:swapper/0]BOOTPROF:       987.801232:probe: probe=i2c_device_probe drv=stk3x1x(ffffff800940e7e0)    26.957615ms
<3>[    0.987885]  (1)[1:swapper/0]BOOTPROF:       987.885694:initcall: alsps_init    27.224769ms
<6>[    0.988281]  (0)[1:swapper/0]i2c i2c-1: addr: 26, transfer ACK error
<6>[    0.988297]  (0)[1:swapper/0]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    0.988304]  (0)[1:swapper/0]I2C structure:
<3>[    0.988304] [I2C]Clk=12480000,Id=1,Op=3,Irq_stat=2,Total_len=1
<3>[    0.988304] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=1,speed=400000
<3>[    0.988304] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    0.988321]  (0)[1:swapper/0]base address 0xffffff800a6dc000
<6>[    0.988333]  (0)[1:swapper/0]I2C register:
<6>[    0.988333] [I2C]SLAVE_ADDR=4c,INTR_MASK=0,INTR_STAT=1,CONTROL=3a,TRANSFER_LEN=1
<6>[    0.988333] [I2C]TRANSAC_LEN=2,DELAY_LEN=2,TIMING=204,LTIMING=11,START=0,FIFO_STAT=1
<6>[    0.988333] [I2C]IO_CONFIG=1f3,HS=0,DCM_EN=e,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=1
<6>[    0.988350]  (0)[1:swapper/0]before enable DMA register(0x0):
<6>[    0.988350] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    0.988350] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    0.988350] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=0
<6>[    0.988350] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    0.988369]  (0)[1:swapper/0]DMA register(0xffffff800a6de180):
<6>[    0.988369] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    0.988369] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    0.988369] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=2
<6>[    0.988369] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    0.988387]  (0)[1:swapper/0]i2c_dump_info ------------------------------------------
<3>[    0.988395]  (0)[1:swapper/0]i2c i2c-1: last transfer info:
<3>[    0.988402]  (0)[1:swapper/0]i2c i2c-1: [00] [    0.988276] SLAVE_ADDR=4c,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    0.988412]  (0)[1:swapper/0]i2c i2c-1: [01] [    0.987438] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    0.988423]  (0)[1:swapper/0]i2c i2c-1: [02] [    0.987297] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    0.988433]  (0)[1:swapper/0]i2c i2c-1: [03] [    0.987156] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    0.988444]  (0)[1:swapper/0]i2c i2c-1: [04] [    0.987011] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    0.988454]  (0)[1:swapper/0]i2c i2c-1: [05] [    0.986870] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    0.988464]  (0)[1:swapper/0]i2c i2c-1: [06] [    0.986729] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    0.988475]  (0)[1:swapper/0]i2c i2c-1: [07] [    0.986588] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    0.988485]  (0)[1:swapper/0]i2c i2c-1: [08] [    0.986443] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    0.988495]  (0)[1:swapper/0]i2c i2c-1: [09] [    0.986084] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<6>[    0.993609]  (0)[1:swapper/0]i2c i2c-1: addr: 26, transfer ACK error
<6>[    0.993618]  (0)[1:swapper/0]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    0.993624]  (0)[1:swapper/0]I2C structure:
<3>[    0.993624] [I2C]Clk=12480000,Id=1,Op=3,Irq_stat=2,Total_len=1
<3>[    0.993624] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=1,speed=400000
<3>[    0.993624] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    0.993639]  (0)[1:swapper/0]base address 0xffffff800a6dc000
<6>[    0.993651]  (0)[1:swapper/0]I2C register:
<6>[    0.993651] [I2C]SLAVE_ADDR=4c,INTR_MASK=0,INTR_STAT=1,CONTROL=3a,TRANSFER_LEN=1
<6>[    0.993651] [I2C]TRANSAC_LEN=2,DELAY_LEN=2,TIMING=204,LTIMING=11,START=0,FIFO_STAT=1
<6>[    0.993651] [I2C]IO_CONFIG=1f3,HS=0,DCM_EN=e,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=1
<6>[    0.993667]  (0)[1:swapper/0]before enable DMA register(0x0):
<6>[    0.993667] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    0.993667] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    0.993667] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=0
<6>[    0.993667] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    0.993687]  (0)[1:swapper/0]DMA register(0xffffff800a6de180):
<6>[    0.993687] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    0.993687] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    0.993687] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=2
<6>[    0.993687] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    0.993704]  (0)[1:swapper/0]i2c_dump_info ------------------------------------------
<3>[    0.993711]  (0)[1:swapper/0]i2c i2c-1: last transfer info:
<3>[    0.993718]  (0)[1:swapper/0]i2c i2c-1: [00] [    0.993606] SLAVE_ADDR=4c,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    0.993728]  (0)[1:swapper/0]i2c i2c-1: [01] [    0.988276] SLAVE_ADDR=4c,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    0.993738]  (0)[1:swapper/0]i2c i2c-1: [02] [    0.987438] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    0.993748]  (0)[1:swapper/0]i2c i2c-1: [03] [    0.987297] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    0.993758]  (0)[1:swapper/0]i2c i2c-1: [04] [    0.987156] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    0.993768]  (0)[1:swapper/0]i2c i2c-1: [05] [    0.987011] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    0.993778]  (0)[1:swapper/0]i2c i2c-1: [06] [    0.986870] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    0.993789]  (0)[1:swapper/0]i2c i2c-1: [07] [    0.986729] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    0.993798]  (0)[1:swapper/0]i2c i2c-1: [08] [    0.986588] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    0.993808]  (0)[1:swapper/0]i2c i2c-1: [09] [    0.986443] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<6>[    0.998915]  (0)[1:swapper/0]i2c i2c-1: addr: 26, transfer ACK error
<6>[    0.998924]  (0)[1:swapper/0]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    0.998929]  (0)[1:swapper/0]I2C structure:
<3>[    0.998929] [I2C]Clk=12480000,Id=1,Op=3,Irq_stat=2,Total_len=1
<3>[    0.998929] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=1,speed=400000
<3>[    0.998929] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    0.998945]  (0)[1:swapper/0]base address 0xffffff800a6dc000
<6>[    0.998956]  (0)[1:swapper/0]I2C register:
<6>[    0.998956] [I2C]SLAVE_ADDR=4c,INTR_MASK=0,INTR_STAT=1,CONTROL=3a,TRANSFER_LEN=1
<6>[    0.998956] [I2C]TRANSAC_LEN=2,DELAY_LEN=2,TIMING=204,LTIMING=11,START=0,FIFO_STAT=1
<6>[    0.998956] [I2C]IO_CONFIG=1f3,HS=0,DCM_EN=e,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=1
<6>[    0.998973]  (0)[1:swapper/0]before enable DMA register(0x0):
<6>[    0.998973] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    0.998973] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    0.998973] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=0
<6>[    0.998973] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    0.998992]  (0)[1:swapper/0]DMA register(0xffffff800a6de180):
<6>[    0.998992] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    0.998992] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    0.998992] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=2
<6>[    0.998992] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    0.999008]  (0)[1:swapper/0]i2c_dump_info ------------------------------------------
<3>[    0.999014]  (0)[1:swapper/0]i2c i2c-1: last transfer info:
<3>[    0.999021]  (0)[1:swapper/0]i2c i2c-1: [00] [    0.998913] SLAVE_ADDR=4c,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    0.999032]  (0)[1:swapper/0]i2c i2c-1: [01] [    0.993606] SLAVE_ADDR=4c,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    0.999042]  (0)[1:swapper/0]i2c i2c-1: [02] [    0.988276] SLAVE_ADDR=4c,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    0.999052]  (0)[1:swapper/0]i2c i2c-1: [03] [    0.987438] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    0.999062]  (0)[1:swapper/0]i2c i2c-1: [04] [    0.987297] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    0.999073]  (0)[1:swapper/0]i2c i2c-1: [05] [    0.987156] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    0.999083]  (0)[1:swapper/0]i2c i2c-1: [06] [    0.987011] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    0.999093]  (0)[1:swapper/0]i2c i2c-1: [07] [    0.986870] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    0.999103]  (0)[1:swapper/0]i2c i2c-1: [08] [    0.986729] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    0.999114]  (0)[1:swapper/0]i2c i2c-1: [09] [    0.986588] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<6>[    1.004220]  (0)[1:swapper/0]i2c i2c-1: addr: 26, transfer ACK error
<6>[    1.004228]  (0)[1:swapper/0]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    1.004234]  (0)[1:swapper/0]I2C structure:
<3>[    1.004234] [I2C]Clk=12480000,Id=1,Op=3,Irq_stat=2,Total_len=1
<3>[    1.004234] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=1,speed=400000
<3>[    1.004234] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    1.004248]  (0)[1:swapper/0]base address 0xffffff800a6dc000
<6>[    1.004259]  (0)[1:swapper/0]I2C register:
<6>[    1.004259] [I2C]SLAVE_ADDR=4c,INTR_MASK=0,INTR_STAT=1,CONTROL=3a,TRANSFER_LEN=1
<6>[    1.004259] [I2C]TRANSAC_LEN=2,DELAY_LEN=2,TIMING=204,LTIMING=11,START=0,FIFO_STAT=1
<6>[    1.004259] [I2C]IO_CONFIG=1f3,HS=0,DCM_EN=e,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=1
<6>[    1.004276]  (0)[1:swapper/0]before enable DMA register(0x0):
<6>[    1.004276] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.004276] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.004276] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=0
<6>[    1.004276] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.004295]  (0)[1:swapper/0]DMA register(0xffffff800a6de180):
<6>[    1.004295] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.004295] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.004295] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=2
<6>[    1.004295] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.004312]  (0)[1:swapper/0]i2c_dump_info ------------------------------------------
<3>[    1.004319]  (0)[1:swapper/0]i2c i2c-1: last transfer info:
<3>[    1.004326]  (0)[1:swapper/0]i2c i2c-1: [00] [    1.004218] SLAVE_ADDR=4c,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.004336]  (0)[1:swapper/0]i2c i2c-1: [01] [    0.998913] SLAVE_ADDR=4c,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.004346]  (0)[1:swapper/0]i2c i2c-1: [02] [    0.993606] SLAVE_ADDR=4c,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.004356]  (0)[1:swapper/0]i2c i2c-1: [03] [    0.988276] SLAVE_ADDR=4c,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.004366]  (0)[1:swapper/0]i2c i2c-1: [04] [    0.987438] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.004376]  (0)[1:swapper/0]i2c i2c-1: [05] [    0.987297] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.004386]  (0)[1:swapper/0]i2c i2c-1: [06] [    0.987156] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.004395]  (0)[1:swapper/0]i2c i2c-1: [07] [    0.987011] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.004406]  (0)[1:swapper/0]i2c i2c-1: [08] [    0.986870] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.004416]  (0)[1:swapper/0]i2c i2c-1: [09] [    0.986729] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<6>[    1.009521]  (0)[1:swapper/0]i2c i2c-1: addr: 26, transfer ACK error
<6>[    1.009529]  (0)[1:swapper/0]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    1.009534]  (0)[1:swapper/0]I2C structure:
<3>[    1.009534] [I2C]Clk=12480000,Id=1,Op=3,Irq_stat=2,Total_len=1
<3>[    1.009534] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=1,speed=400000
<3>[    1.009534] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    1.009550]  (0)[1:swapper/0]base address 0xffffff800a6dc000
<6>[    1.009561]  (0)[1:swapper/0]I2C register:
<6>[    1.009561] [I2C]SLAVE_ADDR=4c,INTR_MASK=0,INTR_STAT=1,CONTROL=3a,TRANSFER_LEN=1
<6>[    1.009561] [I2C]TRANSAC_LEN=2,DELAY_LEN=2,TIMING=204,LTIMING=11,START=0,FIFO_STAT=1
<6>[    1.009561] [I2C]IO_CONFIG=1f3,HS=0,DCM_EN=e,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=1
<6>[    1.009578]  (0)[1:swapper/0]before enable DMA register(0x0):
<6>[    1.009578] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.009578] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.009578] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=0
<6>[    1.009578] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.009595]  (0)[1:swapper/0]DMA register(0xffffff800a6de180):
<6>[    1.009595] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.009595] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.009595] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=2
<6>[    1.009595] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.009612]  (0)[1:swapper/0]i2c_dump_info ------------------------------------------
<3>[    1.009619]  (0)[1:swapper/0]i2c i2c-1: last transfer info:
<3>[    1.009626]  (0)[1:swapper/0]i2c i2c-1: [00] [    1.009519] SLAVE_ADDR=4c,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.009636]  (0)[1:swapper/0]i2c i2c-1: [01] [    1.004218] SLAVE_ADDR=4c,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.009647]  (0)[1:swapper/0]i2c i2c-1: [02] [    0.998913] SLAVE_ADDR=4c,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.009657]  (0)[1:swapper/0]i2c i2c-1: [03] [    0.993606] SLAVE_ADDR=4c,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.009667]  (0)[1:swapper/0]i2c i2c-1: [04] [    0.988276] SLAVE_ADDR=4c,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.009677]  (0)[1:swapper/0]i2c i2c-1: [05] [    0.987438] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.009687]  (0)[1:swapper/0]i2c i2c-1: [06] [    0.987297] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.009698]  (0)[1:swapper/0]i2c i2c-1: [07] [    0.987156] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.009708]  (0)[1:swapper/0]i2c i2c-1: [08] [    0.987011] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.009718]  (0)[1:swapper/0]i2c i2c-1: [09] [    0.986870] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<6>[    1.014821]  (0)[1:swapper/0]i2c i2c-1: addr: 26, transfer ACK error
<6>[    1.014829]  (0)[1:swapper/0]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    1.014835]  (0)[1:swapper/0]I2C structure:
<3>[    1.014835] [I2C]Clk=12480000,Id=1,Op=3,Irq_stat=2,Total_len=1
<3>[    1.014835] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=1,speed=400000
<3>[    1.014835] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    1.014850]  (0)[1:swapper/0]base address 0xffffff800a6dc000
<6>[    1.014861]  (0)[1:swapper/0]I2C register:
<6>[    1.014861] [I2C]SLAVE_ADDR=4c,INTR_MASK=0,INTR_STAT=1,CONTROL=3a,TRANSFER_LEN=1
<6>[    1.014861] [I2C]TRANSAC_LEN=2,DELAY_LEN=2,TIMING=204,LTIMING=11,START=0,FIFO_STAT=1
<6>[    1.014861] [I2C]IO_CONFIG=1f3,HS=0,DCM_EN=e,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=1
<6>[    1.014876]  (0)[1:swapper/0]before enable DMA register(0x0):
<6>[    1.014876] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.014876] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.014876] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=0
<6>[    1.014876] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.014896]  (0)[1:swapper/0]DMA register(0xffffff800a6de180):
<6>[    1.014896] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.014896] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.014896] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=2
<6>[    1.014896] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.014913]  (0)[1:swapper/0]i2c_dump_info ------------------------------------------
<3>[    1.014920]  (0)[1:swapper/0]i2c i2c-1: last transfer info:
<3>[    1.014927]  (0)[1:swapper/0]i2c i2c-1: [00] [    1.014819] SLAVE_ADDR=4c,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.014937]  (0)[1:swapper/0]i2c i2c-1: [01] [    1.009519] SLAVE_ADDR=4c,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.014946]  (0)[1:swapper/0]i2c i2c-1: [02] [    1.004218] SLAVE_ADDR=4c,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.014957]  (0)[1:swapper/0]i2c i2c-1: [03] [    0.998913] SLAVE_ADDR=4c,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.014967]  (0)[1:swapper/0]i2c i2c-1: [04] [    0.993606] SLAVE_ADDR=4c,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.014977]  (0)[1:swapper/0]i2c i2c-1: [05] [    0.988276] SLAVE_ADDR=4c,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.014987]  (0)[1:swapper/0]i2c i2c-1: [06] [    0.987438] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.014997]  (0)[1:swapper/0]i2c i2c-1: [07] [    0.987297] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.015007]  (0)[1:swapper/0]i2c i2c-1: [08] [    0.987156] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.015017]  (0)[1:swapper/0]i2c i2c-1: [09] [    0.987011] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<6>[    1.015122]  (0)[1:swapper/0]i2c i2c-1: addr: 27, transfer ACK error
<6>[    1.015130]  (0)[1:swapper/0]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    1.015136]  (0)[1:swapper/0]I2C structure:
<3>[    1.015136] [I2C]Clk=12480000,Id=1,Op=3,Irq_stat=2,Total_len=1
<3>[    1.015136] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=1,speed=400000
<3>[    1.015136] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    1.015151]  (0)[1:swapper/0]base address 0xffffff800a6dc000
<6>[    1.015163]  (0)[1:swapper/0]I2C register:
<6>[    1.015163] [I2C]SLAVE_ADDR=4e,INTR_MASK=0,INTR_STAT=1,CONTROL=3a,TRANSFER_LEN=1
<6>[    1.015163] [I2C]TRANSAC_LEN=2,DELAY_LEN=2,TIMING=204,LTIMING=11,START=0,FIFO_STAT=1
<6>[    1.015163] [I2C]IO_CONFIG=1f3,HS=0,DCM_EN=e,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=1
<6>[    1.015179]  (0)[1:swapper/0]before enable DMA register(0x0):
<6>[    1.015179] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.015179] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.015179] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=0
<6>[    1.015179] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.015198]  (0)[1:swapper/0]DMA register(0xffffff800a6de180):
<6>[    1.015198] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.015198] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.015198] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=2
<6>[    1.015198] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.015215]  (0)[1:swapper/0]i2c_dump_info ------------------------------------------
<3>[    1.015222]  (0)[1:swapper/0]i2c i2c-1: last transfer info:
<3>[    1.015229]  (0)[1:swapper/0]i2c i2c-1: [00] [    1.015120] SLAVE_ADDR=4e,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.015239]  (0)[1:swapper/0]i2c i2c-1: [01] [    1.014819] SLAVE_ADDR=4c,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.015249]  (0)[1:swapper/0]i2c i2c-1: [02] [    1.009519] SLAVE_ADDR=4c,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.015259]  (0)[1:swapper/0]i2c i2c-1: [03] [    1.004218] SLAVE_ADDR=4c,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.015270]  (0)[1:swapper/0]i2c i2c-1: [04] [    0.998913] SLAVE_ADDR=4c,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.015280]  (0)[1:swapper/0]i2c i2c-1: [05] [    0.993606] SLAVE_ADDR=4c,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.015290]  (0)[1:swapper/0]i2c i2c-1: [06] [    0.988276] SLAVE_ADDR=4c,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.015300]  (0)[1:swapper/0]i2c i2c-1: [07] [    0.987438] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.015310]  (0)[1:swapper/0]i2c i2c-1: [08] [    0.987297] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.015320]  (0)[1:swapper/0]i2c i2c-1: [09] [    0.987156] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<4>[    1.015346]  (0)[1:swapper/0][MIR3DA] Can't find Mir3da gsensor!!
<3>[    1.015352]  (0)[1:swapper/0][MIR3DA] chip init failed !
<3>[    1.015352] 
<3>[    1.015359]  (0)[1:swapper/0][MIR3DA] mir3da_probe: err = 0
<3>[    1.015359] 
<3>[    1.015376]  (0)[1:swapper/0]BOOTPROF:      1015.376309:probe: probe=i2c_device_probe drv=mir3da(ffffff800940ef58)    27.203230ms
<3>[    1.015466]  (0)[1:swapper/0]<ACCELEROMETER> acc_probe 775 : acc real driver init fail
<3>[    1.015475]  (0)[1:swapper/0]<ACCELEROMETER> acc_probe 789 : ----accel_probe fail !!!
<3>[    1.015482]  (0)[1:swapper/0]<ACCELEROMETER> acc_init 814 : failed to register acc driver
<3>[    1.015494]  (0)[1:swapper/0]BOOTPROF:      1015.493771:initcall: acc_init    27.542693ms
<5>[    1.015515] -(0)[1:swapper/0]mtk_rtc_hal_common: RTC_IRQ_EN = 0xc, RTC_PDN1 = 0x0
<5>[    1.015522] -(0)[1:swapper/0]mtk_rtc_hal_common: rtc_spare_reg[12] = {5b8, 1, 6}
<5>[    1.015532]  (0)[1:swapper/0]mtk_rtc_common: There is no Crystal
<6>[    1.015744]  (0)[1:swapper/0][DDP/ddp_drv]warn:disp driver(1) disp_late begin
<6>[    1.015752]  (0)[1:swapper/0][DDP/ddp_drv]warn:disp driver(1) disp_late end
<3>[    1.019396]  (1)[1:swapper/0]PVR_K:  1: irq_res = 0x108
<3>[    1.019416]  (1)[1:swapper/0]PVR_K:  1: reg_res = 0x13000000, 0x80000
<3>[    1.019757]  (1)[1:swapper/0]PVR_K:  1: RGXGetBVNCConfig: Reverting to compile time BVNC 22.49.21.16
<6>[    1.020222]  (1)[1:swapper/0][drm] Initialized pvr 1.9.4893595 20110701 on minor 0
<5>[    1.021887]  (1)[1:swapper/0]log store:sram_dram_buff addr 0x7ff7f000, size 0x40000.
<1>[    1.021986]  (1)[1:swapper/0][PHY layout]log_store_mem   :   0x7ff7f000 - 0x7ffbefff (0x40000)
<5>[    1.021997]  (1)[1:swapper/0]log_store: log buff 0xffffff800bc41000, sig 0xcdab3412
<5>[    1.022004]  (1)[1:swapper/0]buff_size 0x40000
<5>[    1.022009]  (1)[1:swapper/0]pl off 0x20, sz 0x25cb
<5>[    1.022015]  (1)[1:swapper/0]lk off 0x25eb, sz 0x2609d
<5>[    1.022021]  (1)[1:swapper/0]flag p 0xc, l 0xc
<3>[    1.022037]  (1)[1:swapper/0]memory-ssvp: [INIT FAIL]: cma is not inited
<3>[    1.022048]  (1)[1:swapper/0]memory-ssvp: SSVP sanity fail
<2>[    1.022152]  (1)[1:swapper/0][SOC FBC]Start to init FBC driver
<2>[    1.023584]  (1)[1:swapper/0][SOC FBC]init FBC driver done
<4>[    1.024482]  (1)[1:swapper/0][Thermal/TC/bcct]mtkcooler_bcct_late_init
<4>[    1.024950]  (1)[1:swapper/0][Thermal/TC/bcct]mtkcooler_bcct_pdrv_probe
<6>[    1.025134]  (2)[54:kworker/u8:2]mtk-tpd: MediaTek touch panel driver init
<6>[    1.026343]  (2)[54:kworker/u8:2]mtk-tpd: enter tpd_probe, 523
<3>[    1.026454]  (2)[54:kworker/u8:2]Lomen 0
<6>[    1.026463]  (2)[54:kworker/u8:2]mtk-tpd: [tpd -1] mt_tpd_pinctrl+++++++++++++++++
<3>[    1.026469]  (2)[54:kworker/u8:2]Lomen 0.1
<3>[    1.026607]  (2)[54:kworker/u8:2]Lomen 0.2
<3>[    1.026617]  (2)[54:kworker/u8:2]mtk-tpd touch: fwq Cannot find touch pinctrl default -19!
<6>[    1.026627]  (2)[54:kworker/u8:2]mtk-tpd: [tpd-1] mt_tpd_pinctrl----------
<3>[    1.026633]  (2)[54:kworker/u8:2]Lomen 1
<4>[    1.026647]  (2)[54:kworker/u8:2]<<GTP-INF>>[tpd_local_init:917]  Device Tree get regulator!
<6>[    1.026768]  (1)[1:swapper/0]mt-rtc mt-rtc: setting system clock to 2019-02-13 05:19:22 UTC (1550035162)
<4>[    1.026894]  (2)[54:kworker/u8:2] tpd_i2c_probe start.
<4>[    1.027024]  (2)[54:kworker/u8:2]<<GTP-INF>>[tpd_i2c_probe:608] tpd_i2c_probe start.wait_event_interruptible
<6>[    1.027024]  (0)[236:tpd_probe]mtk-tpd: [tpd]tpd_gpio_output pin = 0, level = 0
<6>[    1.027059]  (0)[236:tpd_probe]mtk-tpd: [tpd]tpd_gpio_output pin = 1, level = 0
<4>[    1.040959]  (0)[236:tpd_probe]<<GTP-DBG>>[gt1x_power_switch:432]Power switch on!
<4>[    1.040971]  (0)[236:tpd_probe]<<GTP-INF>>[gt1x_reset_guitar:871] GTP RESET!
<6>[    1.040978]  (0)[236:tpd_probe]mtk-tpd: [tpd]tpd_gpio_output pin = 0, level = 0
<6>[    1.041003]  (0)[236:tpd_probe]mtk-tpd: [tpd]tpd_gpio_output pin = 1, level = 0
<3>[    1.047962]  (1)[200:kworker/u8:3][ALS/PS] stk_tune_zero_get_ps_data: ps #0=138
<6>[    1.048934]  (0)[236:tpd_probe]mtk-tpd: [tpd]tpd_gpio_output pin = 0, level = 1
<6>[    1.068920]  (1)[236:tpd_probe]mtk-tpd: [tpd]tpd_gpio_output pin = 1, level = 0
<3>[    1.107940]  (1)[200:kworker/u8:3][ALS/PS] stk_tune_zero_get_ps_data: ps #1=139
<6>[    1.124933]  (0)[236:tpd_probe]mtk-tpd: [tpd]tpd_gpio_as_int
<4>[    1.124963]  (0)[236:tpd_probe]<<GTP-DBG>>[gt1x_set_reset_status:761]Set reset status.
<4>[    1.125399]  (2)[54:kworker/u8:2]<<GTP-INF>>[tpd_i2c_probe:610] tpd_i2c_probe end.wait_event_interruptible
<4>[    1.138407]  (2)[54:kworker/u8:2]<<GTP-INF>>[gt1x_read_version:946] IC VERSION:GT5688_000119(Patch)_0100(Mask)_00(SensorID)
<4>[    1.138475]  (2)[54:kworker/u8:2] tpd_i2c_probe end.
<3>[    1.138535]  (2)[54:kworker/u8:2]BOOTPROF:      1138.534617:probe: probe=i2c_device_probe drv=gt1x(ffffff8009468178)   111.617155ms
<4>[    1.138817]  (2)[54:kworker/u8:2]<<GTP-INF>>[tpd_local_init:976] end tpd_local_init, 976
<4>[    1.138817] 
<6>[    1.138861]  (2)[54:kworker/u8:2]mtk-tpd: [mtk-tpd]tpd_probe, tpd_driver_name=gt1x
<6>[    1.139255]  (2)[54:kworker/u8:2]mtk-tpd: Cap touch panel driver
<6>[    1.139759]  (2)[54:kworker/u8:2]input: mtk-tpd as /devices/virtual/input/input4
<6>[    1.140429]  (2)[54:kworker/u8:2]input: tp-kpd as /devices/virtual/input/input5
<3>[    1.140728]  (2)[54:kworker/u8:2]BOOTPROF:      1140.726848:probe: probe=platform_drv_probe drv=mtk-tpd(ffffff8009467900)   114.355385ms
<5>[    1.141111]  (0)[1:swapper/0]mtk_charger_probe: starts
<5>[    1.141155]  (0)[1:swapper/0]mtk_charger_parse_dt: starts
<5>[    1.141190]  (0)[1:swapper/0]found SwitchCharging
<5>[    1.141223]  (0)[1:swapper/0]Found primary charger [bq2429x]
<5>[    1.142027]  (0)[1:swapper/0]use default PE_ICHG_LEAVE_THRESHOLD:1000
<5>[    1.142130]  (0)[1:swapper/0]use default pe40_single_charger_input_current:3000
<5>[    1.142167]  (0)[1:swapper/0]use default pe40_single_charger_current:3000
<5>[    1.142203]  (0)[1:swapper/0]use default pe40_dual_charger_input_current:3000
<5>[    1.142250]  (0)[1:swapper/0]use default pe40_dual_charger_chg1_current:2000
<5>[    1.142285]  (0)[1:swapper/0]use default pe40_dual_charger_chg2_current:2000
<5>[    1.142325]  (0)[1:swapper/0]use default pe40_stop_battery_soc:2000
<5>[    1.142396]  (0)[1:swapper/0]algorithm name:SwitchCharging
<5>[    1.142923]  (1)[1:swapper/0]get PD dev fail
<3>[    1.143556]  (1)[1:swapper/0]BOOTPROF:      1143.555386:initcall: mtk_charger_init   116.742308ms
<6>[    1.144274]  (3)[54:kworker/u8:2][wdk] bind thread 240 to cpu 0
<6>[    1.144567]  (3)[54:kworker/u8:2][wdk] bind thread 241 to cpu 1
<6>[    1.144871]  (3)[54:kworker/u8:2][wdk] bind thread 242 to cpu 2
<6>[    1.145333]  (0)[54:kworker/u8:2][wdk] bind thread 243 to cpu 3
<6>[    1.145389]  (0)[54:kworker/u8:2][wdk] WDT start kicker done CPU_NR=4
<6>[    1.145469]  (0)[54:kworker/u8:2][cpu_ntf] <00>ffffff80087ecdfc (wk_cpu_callback)
<6>[    1.145512]  (0)[54:kworker/u8:2][wdk]init_wk done late_initcall cpus_kick_bit=0xf -----
<4>[    1.157023]  (0)[238:charger_thread]=====FG=====::  battery_current =-298 
<4>[    1.161415]  (2)[236:tpd_probe]<<GTP-INF>>[gt1x_get_chip_type:990] Chip Type: GT2X
<3>[    1.167295]  (1)[1:swapper/0]BOOTPROF:      1167.293771:initcall: clk_debug_init    21.210461ms
<6>[    1.167368]  (1)[1:swapper/0]schedtune: init normalization constants...
<6>[    1.167379]  (1)[1:swapper/0]schedtune: CLUSTER[0-3]      min_pwr:     0 max_pwr: 96277
<6>[    1.167387]  (1)[1:swapper/0]schedtune: CPU[0]            min_pwr:     0 max_pwr: 306666
<6>[    1.167394]  (1)[1:swapper/0]schedtune: CPU[1]            min_pwr:     0 max_pwr: 306666
<6>[    1.167401]  (1)[1:swapper/0]schedtune: CPU[2]            min_pwr:     0 max_pwr: 306666
<6>[    1.167408]  (1)[1:swapper/0]schedtune: CPU[3]            min_pwr:     0 max_pwr: 306666
<6>[    1.167415]  (1)[1:swapper/0]schedtune: SYSTEM            min_pwr:     0 max_pwr: 1322941
<6>[    1.167422]  (1)[1:swapper/0]schedtune: using normalization constants mul: 2513499034 sh1: 1 sh2: 20
<6>[    1.167429]  (1)[1:swapper/0]schedtune: verify normalization constants...
<6>[    1.167434]  (1)[1:swapper/0]schedtune: max_pwr/2^0: 1322941 => norm_pwr:  1024
<6>[    1.167441]  (1)[1:swapper/0]schedtune: max_pwr/2^1: 661470 => norm_pwr:   511
<6>[    1.167471]  (1)[1:swapper/0]schedtune: max_pwr/2^2: 330735 => norm_pwr:   255
<6>[    1.167479]  (1)[1:swapper/0]schedtune: max_pwr/2^3: 165367 => norm_pwr:   127
<6>[    1.167485]  (1)[1:swapper/0]schedtune: max_pwr/2^4: 82683 => norm_pwr:    63
<6>[    1.167491]  (1)[1:swapper/0]schedtune: max_pwr/2^5: 41341 => norm_pwr:    31
<6>[    1.167497]  (1)[1:swapper/0]schedtune: configured to support 5 boost groups
<6>[    1.167521]  (1)[1:swapper/0]vs1: disabling
<3>[    1.167528]  (1)[1:swapper/0]vs1: couldn't disable: -1
<6>[    1.167539]  (1)[1:swapper/0]vmodem: disabling
<3>[    1.167545]  (1)[1:swapper/0]vmodem: couldn't disable: -1
<6>[    1.167556]  (1)[1:swapper/0]vcore: disabling
<3>[    1.167561]  (1)[1:swapper/0]vcore: couldn't disable: -1
<6>[    1.167572]  (1)[1:swapper/0]vproc: disabling
<3>[    1.167578]  (1)[1:swapper/0]vproc: couldn't disable: -1
<6>[    1.167599]  (1)[1:swapper/0]vxo22: disabling
<3>[    1.167605]  (1)[1:swapper/0]vxo22: couldn't disable: -1
<6>[    1.167677]  (1)[1:swapper/0]vsram_others: disabling
<3>[    1.167684]  (1)[1:swapper/0]vsram_others: couldn't disable: -1
<6>[    1.167695]  (1)[1:swapper/0]vaux18: disabling
<3>[    1.167701]  (1)[1:swapper/0]vaux18: couldn't disable: -1
<6>[    1.167712]  (1)[1:swapper/0]vaud28: disabling
<6>[    1.167718]  (1)[1:swapper/0]ldo vaud28 disable
<3>[    1.167723]  (1)[1:swapper/0]vaud28: couldn't disable: -1
<6>[    1.167734]  (1)[1:swapper/0]vio28: disabling
<3>[    1.167740]  (1)[1:swapper/0]vio28: couldn't disable: -1
<6>[    1.167752]  (1)[1:swapper/0]vio18: disabling
<3>[    1.167758]  (1)[1:swapper/0]vio18: couldn't disable: -1
<6>[    1.167769]  (1)[1:swapper/0]vdram: disabling
<3>[    1.167776]  (1)[1:swapper/0]vdram: couldn't disable: -1
<6>[    1.167834]  (1)[1:swapper/0]ALSA device list:
<6>[    1.167840]  (1)[1:swapper/0]  #0: mt-snd-card
<3>[    1.167964]  (0)[54:kworker/u8:2][ALS/PS] stk_tune_zero_get_ps_data: ps #2=139
<6>[    1.169816]  (1)[1:swapper/0]Freeing unused kernel memory: 4728K
<3>[    1.169893]  (1)[1:swapper/0]BOOTPROF:      1169.892925:Kernel_init_done
<14>[    1.172759]  (0)[1:init]init: init first stage started!
<4>[    1.172944]  (2)[238:charger_thread]=====FG=====::  battery_current =-298 
<14>[    1.173074]  (0)[1:init]init: Using Android DT directory /proc/device-tree/firmware/android/
<4>[    1.173661]  (3)[236:tpd_probe]<<GTP-INF>>[gt1x_read_version:946] IC VERSION:GT5688_000119(Patch)_0100(Mask)_00(SensorID)
<4>[    1.173684]  (3)[236:tpd_probe]<<GTP-DBG>>[gt1x_init_panel:622]Config groups length:239,0,0,0,0,0
<4>[    1.173693]  (3)[236:tpd_probe]<<GTP-INF>>[gt1x_init_panel:632] Config group0 used, length:239
<4>[    1.173701]  (3)[236:tpd_probe]<<GTP-INF>>[gt1x_init_panel:683] X_MAX=480,Y_MAX=800,TRIGGER=0x01,WAKEUP_LEVEL=0
<4>[    1.173709]  (3)[236:tpd_probe]<<GTP-DBG>>[gt1x_send_cfg:558]Driver send config, length:239
<4>[    1.173717]  (3)[236:tpd_probe]<<GTP-DBG>>[gt1x_send_cfg:568]Config checksum: 0xFF2C
<5>[    1.210275]  (2)[238:charger_thread]Vbat=3751,Ibat=298,I=232,VChr=0,T=24,Soc=0:0,CT:0:0 hv:1 pd:0:0
<5>[    1.215293]  (2)[238:charger_thread]tmp:24 (jeita:0 sm:0 cv:0 en:0) (sm:1) en:1 c:0 s:0 ov:0 0 1
<5>[    1.215317]  (2)[238:charger_thread]_charger_manager_enable_charging: dev:charger idx:0 en:1
<5>[    1.215325]  (2)[238:charger_thread]_charger_manager_enable_charging: dev:charger idx:0 en:1 cnt:0
<3>[    1.228011]  (2)[54:kworker/u8:2][ALS/PS] stk_tune_zero_get_ps_data: ps #3=141
<3>[    1.230576]  (0)[1:init]power_supply charger: driver failed to report `charge_type' property: -22
<4>[    1.268918]  (2)[1:init]=====FG=====::  soc =53 
<4>[    1.285091]  (2)[1:init]=====FG=====::  battery_current =-298 
<3>[    1.287924]  (2)[54:kworker/u8:2][ALS/PS] stk_tune_zero_get_ps_data: ps #4=141
<3>[    1.288792]  (2)[54:kworker/u8:2][ALS/PS] stk_ps_tune_zero_final: set HT=199,LT=169
<4>[    1.294210] -(1)[199:dc_trim_thread]mt6357_get_auxadc_value: 63 callbacks suppressed
<5>[    1.294216]  (1)[199:dc_trim_thread][mt6357_get_auxadc_value] ch_idx = 9, channel = 9, reg_val = 0x6a32, adc_result = 27186
<5>[    1.298848]  (1)[199:dc_trim_thread][mt6357_get_auxadc_value] ch_idx = 9, channel = 9, reg_val = 0x6a32, adc_result = 27186
<5>[    1.303547]  (1)[199:dc_trim_thread][mt6357_get_auxadc_value] ch_idx = 9, channel = 9, reg_val = 0x6a31, adc_result = 27185
<4>[    1.316913]  (2)[1:init]=====FG=====::	battery_current =-1 battery_vol_original=3810
<4>[    1.316923]  (2)[1:init]=====FG=====:: battery_vol =3810 
<4>[    1.332920]  (2)[1:init]fg_27542 :  196  11  tempreture =3012 
<4>[    1.332930]  (2)[1:init]=====FG=====: temperature:280 
<5>[    1.378389]  (0)[199:dc_trim_thread][mt6357_get_auxadc_value] ch_idx = 9, channel = 9, reg_val = 0x6a14, adc_result = 27156
<5>[    1.383142]  (0)[199:dc_trim_thread][mt6357_get_auxadc_value] ch_idx = 9, channel = 9, reg_val = 0x6a10, adc_result = 27152
<4>[    1.388977]  (0)[236:tpd_probe]<<GTP-DBG>>[gt1x_send_cfg:578]Send config successfully!
<4>[    1.389161]  (3)[236:tpd_probe]<<GTP-INF>>[gt1x_init_debug_node:98] Created proc entry /proc/gt1x_debug.
<4>[    1.389178]  (3)[236:tpd_probe]<<GTP-INF>>[gt1x_init_tool_node:89] Alloc memory size:512.
<4>[    1.389194]  (3)[236:tpd_probe]<<GTP-INF>>[gt1x_init_tool_node:99] Created proc entry /proc/gmnode040495.
<6>[    1.389274]  (3)[236:tpd_probe]mtk-tpd: [tpd]tpd_gpio_as_int
<4>[    1.445019]  (3)[236:tpd_probe]<<GTP-INF>>[tpd_irq_registration:468] Device Tree Tpd_irq_registration!
<4>[    1.446148]  (3)[236:tpd_probe]gpiod_set_debounce: invalid GPIO
<4>[    1.446197]  (3)[236:tpd_probe]<<GTP-INF>>[tpd_irq_registration:476] Device gt1x_int_type = 1!
<4>[    1.446264]  (3)[236:tpd_probe]<<GTP-INF>>[tpd_irq_registration:500] irq:29, debounce:0-0:
<4>[    1.446906]  (0)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1413]Additional Int Pulse.
<4>[    1.446924]  (0)[248:mtk-tpd]--lan-- ret = 0.
<4>[    1.449898]  (0)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1413]Additional Int Pulse.
<4>[    1.449921]  (0)[248:mtk-tpd]--lan-- ret = 0.
<4>[    1.456921]  (0)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1413]Additional Int Pulse.
<4>[    1.456946]  (0)[248:mtk-tpd]--lan-- ret = 0.
<6>[    1.564993]  (1)[51:kworker/1:1][msdc]cache(0x6BC000~0x794000, usrdata(0xB98000~0x1D16FDF)
<14>[    1.755248]  (2)[1:init]init: [libfs_mgr]Enabling dm-verity for system (mode 2)
<14>[    1.755308]  (2)[1:init]init: [libfs_mgr]loading verity table: '1 /dev/block/platform/bootdevice/by-name/system /dev/block/platform/bootdevice/by-name/system 4096 4096 645127 645127 sha256 8225c6214e69ddb58b1972eb29a3b2c452a8b283b62fcb2cae12977915ff51a2 aee087a5be3b982978c923f566a94613496b417f2af592639bc80d141e34dfe7 10 restart_on_corruption use_fec_from_device /dev/block/platform/bootdevice/by-name/system fec_start 650217 fec_blocks 650217 fec_roots 2 ignore_zero_blocks'
<6>[    1.761544]  (0)[1:init]EXT4-fs (dm-0): mounted filesystem with ordered data mode. Opts: (null)
<14>[    1.761653]  (0)[1:init]init: [libfs_mgr]__mount(source=/dev/block/dm-0,target=/system,type=ext4)=0: Success
<14>[    1.967905]  (1)[1:init]init: [libfs_mgr]Enabling dm-verity for vendor (mode 2)
<14>[    1.967960]  (1)[1:init]init: [libfs_mgr]loading verity table: '1 /dev/block/platform/bootdevice/by-name/vendor /dev/block/platform/bootdevice/by-name/vendor 4096 4096 139096 139096 sha256 97b60d052125d94a24b40a99a5beaab95ecaebf4a71a5287fc549b9e8202a631 aee087a5be3b982978c923f566a94613496b417f2af592639bc80d141e34dfe7 10 restart_on_corruption use_fec_from_device /dev/block/platform/bootdevice/by-name/vendor fec_start 140201 fec_blocks 140201 fec_roots 2 ignore_zero_blocks'
<6>[    1.974487]  (3)[1:init]EXT4-fs (dm-1): mounted filesystem with ordered data mode. Opts: (null)
<14>[    1.974592]  (3)[1:init]init: [libfs_mgr]__mount(source=/dev/block/dm-1,target=/vendor,type=ext4)=0: Success
<14>[    1.974821]  (3)[1:init]init: Skipped setting INIT_AVB_VERSION (not in recovery mode)
<14>[    1.974844]  (3)[1:init]init: Loading SELinux policy
<7>[    1.994193]  (2)[1:init]SELinux: 8192 avtab hash slots, 24815 rules.
<7>[    2.010262]  (2)[1:init]SELinux: 8192 avtab hash slots, 24815 rules.
<7>[    2.010298]  (2)[1:init]SELinux:  1 users, 4 roles, 2023 types, 0 bools, 1 sens, 1024 cats
<7>[    2.010305]  (2)[1:init]SELinux:  92 classes, 24815 rules
<7>[    2.014112]  (2)[1:init]SELinux:  Completing initialization.
<7>[    2.014130]  (2)[1:init]SELinux:  Setting up existing superblocks.
<5>[    2.070912]  (2)[1:init]audit: type=1403 audit(1550035163.770:2): policy loaded auid=4294967295 ses=4294967295
<14>[    2.071144]  (2)[1:init]selinux: SELinux: Loaded policy from /vendor/etc/selinux/precompiled_sepolicy
<14>[    2.071144] 
<5>[    2.071335]  (2)[1:init]audit: type=1404 audit(1550035163.770:3): enforcing=1 old_enforcing=0 auid=4294967295 ses=4294967295
<14>[    2.091590]  (2)[1:init]selinux: SELinux: Loaded file_contexts
<14>[    2.091590] 
<5>[    2.092972]  (0)[1:init]random: init: uninitialized urandom read (40 bytes read, 27 bits of entropy available)
<14>[    2.093957]  (0)[1:init]init: init second stage started!
<14>[    2.104764]  (0)[1:init]init: Using Android DT directory /proc/device-tree/firmware/android/
<11>[    2.105858]  (0)[1:init]init: property_set("ro.boot.hardware", "mt6739") failed: property already set
<11>[    2.105961]  (0)[1:init]init: property_set("ro.boot.serialno", "19042B0005") failed: property already set
<14>[    2.110768]  (0)[1:init]selinux: SELinux: Loaded file_contexts
<14>[    2.110768] 
<14>[    2.112468]  (0)[1:init]selinux: SELinux: Loaded property_contexts from /system/etc/selinux/plat_property_contexts & /vendor/etc/selinux/nonplat_property_contexts.
<14>[    2.112468] 
<14>[    2.112507]  (0)[1:init]init: Running restorecon...
<11>[    2.131368]  (0)[1:init]init: waitid failed: No child processes
<14>[    2.132084]  (0)[1:init]init: PropSet [security.perf_harden]=[1] Done
<14>[    2.132248]  (0)[1:init]init: PropSet [persist.sys.usb.config]=[none] Done
<12>[    2.132311]  (0)[1:init]init: Couldn't load property file: Unable to open '/odm/default.prop': No such file or directory: No such file or directory
<14>[    2.132940]  (0)[1:init]init: PropSet [dalvik.vm.image-dex2oat-Xms]=[64m] Done
<14>[    2.133001]  (0)[1:init]init: PropSet [dalvik.vm.image-dex2oat-Xmx]=[64m] Done
<14>[    2.133027]  (0)[1:init]init: PropSet [dalvik.vm.dex2oat-Xms]=[64m] Done
<14>[    2.133052]  (0)[1:init]init: PropSet [dalvik.vm.dex2oat-Xmx]=[512m] Done
<14>[    2.133086]  (0)[1:init]init: PropSet [dalvik.vm.usejit]=[true] Done
<14>[    2.133112]  (0)[1:init]init: PropSet [dalvik.vm.usejitprofiles]=[true] Done
<14>[    2.133139]  (0)[1:init]init: PropSet [dalvik.vm.dexopt.secondary]=[true] Done
<14>[    2.133165]  (0)[1:init]init: PropSet [dalvik.vm.appimageformat]=[lz4] Done
<14>[    2.133192]  (0)[1:init]init: PropSet [pm.dexopt.first-boot]=[quicken] Done
<14>[    2.133218]  (0)[1:init]init: PropSet [pm.dexopt.boot]=[verify] Done
<14>[    2.133244]  (0)[1:init]init: PropSet [pm.dexopt.install]=[quicken] Done
<14>[    2.133270]  (0)[1:init]init: PropSet [pm.dexopt.bg-dexopt]=[speed-profile] Done
<14>[    2.133296]  (0)[1:init]init: PropSet [pm.dexopt.ab-ota]=[speed-profile] Done
<14>[    2.133322]  (0)[1:init]init: PropSet [pm.dexopt.inactive]=[verify] Done
<14>[    2.133348]  (0)[1:init]init: PropSet [pm.dexopt.shared]=[speed] Done
<14>[    2.133376]  (0)[1:init]init: PropSet [debug.atrace.tags.enableflags]=[0] Done
<14>[    2.133401]  (0)[1:init]init: PropSet [persist.service.acm.enable]=[0] Done
<14>[    2.133447]  (0)[1:init]init: PropSet [persist.sys.usb.config]=[mtp] Done
<14>[    2.133486]  (0)[1:init]init: PropSet [camera.disable_zsl_mode]=[1] Done
<14>[    2.134177]  (0)[1:init]init: Created socket '/dev/socket/property_service', mode 666, user 0, group 0
<14>[    2.134278]  (0)[1:init]init: PropSet [sys.usb.controller]=[musb-hdrc] Done
<14>[    2.134361]  (0)[1:init]init: Parsing file /init.rc...
<14>[    2.134593]  (0)[1:init]init: Added '/init.environ.rc' to import list
<14>[    2.134620]  (0)[1:init]init: Added '/init.usb.rc' to import list
<14>[    2.134659]  (0)[1:init]init: Added '/init.mt6739.rc' to import list
<14>[    2.134683]  (0)[1:init]init: Added '/vendor/etc/init/hw/init.mt6739.rc' to import list
<14>[    2.134699]  (0)[1:init]init: Added '/init.usb.configfs.rc' to import list
<14>[    2.134722]  (0)[1:init]init: Added '/init.zygote64_32.rc' to import list
<14>[    2.135990]  (0)[1:init]init: Parsing file /init.environ.rc...
<14>[    2.136140]  (0)[1:init]init: Parsing file /init.usb.rc...
<14>[    2.136544]  (0)[1:init]init: Parsing file /init.mt6739.rc...
<11>[    2.136580]  (0)[1:init]init: Unable to open '/init.mt6739.rc': No such file or directory
<11>[    2.136605]  (0)[1:init]init: /init.rc: 9: Could not import file '/init.mt6739.rc': No such file or directory
<14>[    2.137543]  (0)[1:init]init: Parsing file /vendor/etc/init/hw/init.mt6739.rc...
<14>[    2.138708]  (0)[1:init]init: Added '/vendor/etc/init/hw/init.connectivity.rc' to import list
<14>[    2.138760]  (0)[1:init]init: Added '/vendor/etc/init/hw/init.project.rc' to import list
<14>[    2.138777]  (0)[1:init]init: Added '/FWUpgradeInit.rc' to import list
<14>[    2.138801]  (0)[1:init]init: Added '/vendor/etc/init/hw/init.aee.rc' to import list
<14>[    2.138823]  (0)[1:init]init: Added '/vendor/etc/init/hw/init.fon.rc' to import list
<14>[    2.138846]  (0)[1:init]init: Added '/vendor/etc/init/hw/init.ril.rc' to import list
<14>[    2.138869]  (0)[1:init]init: Added '/vendor/etc/init/hw/init.volte.rc' to import list
<14>[    2.138891]  (0)[1:init]init: Added '/vendor/etc/init/hw/init.mal.rc' to import list
<14>[    2.138913]  (0)[1:init]init: Added '/vendor/etc/init/hw/init.epdg.rc' to import list
<14>[    2.138936]  (0)[1:init]init: Added '/vendor/etc/init/hw/init.sensor_1_0.rc' to import list
<14>[    2.138959]  (0)[1:init]init: Added '/vendor/etc/init/hw/init.mt6739.usb.rc' to import list
<14>[    2.138980]  (0)[1:init]init: Added '/vendor/etc/init/hw/init.ago.rc' to import list
<14>[    2.139003]  (0)[1:init]init: Added '/vendor/etc/init/hw/init.modem.rc' to import list
<11>[    2.139181]  (0)[1:init]init: /vendor/etc/init/hw/init.mt6739.rc: 98: invalid keyword 'makedir'
<11>[    2.139204]  (0)[1:init]init: /vendor/etc/init/hw/init.mt6739.rc: 101: invalid keyword 'makedir'
<11>[    2.139474]  (0)[1:init]init: /vendor/etc/init/hw/init.mt6739.rc: 304: invalid keyword 'mknod'
<11>[    2.139718]  (0)[1:init]init: /vendor/etc/init/hw/init.mt6739.rc: 438: invalid keyword 'mknod'
<11>[    2.139744]  (0)[1:init]init: /vendor/etc/init/hw/init.mt6739.rc: 445: invalid keyword 'mknod'
<11>[    2.140628]  (0)[1:init]init: /vendor/etc/init/hw/init.mt6739.rc: 907: invalid keyword 'setprop'
<11>[    2.140655]  (0)[1:init]init: /vendor/etc/init/hw/init.mt6739.rc: 908: invalid keyword 'setprop'
<11>[    2.140677]  (0)[1:init]init: /vendor/etc/init/hw/init.mt6739.rc: 909: invalid keyword 'setprop'
<11>[    2.140697]  (0)[1:init]init: /vendor/etc/init/hw/init.mt6739.rc: 910: invalid keyword 'setprop'
<11>[    2.140718]  (0)[1:init]init: /vendor/etc/init/hw/init.mt6739.rc: 911: invalid keyword 'setprop'
<11>[    2.140739]  (0)[1:init]init: /vendor/etc/init/hw/init.mt6739.rc: 912: invalid keyword 'setprop'
<11>[    2.140760]  (0)[1:init]init: /vendor/etc/init/hw/init.mt6739.rc: 913: invalid keyword 'setprop'
<11>[    2.140781]  (0)[1:init]init: /vendor/etc/init/hw/init.mt6739.rc: 914: invalid keyword 'setprop'
<11>[    2.140802]  (0)[1:init]init: /vendor/etc/init/hw/init.mt6739.rc: 915: invalid keyword 'setprop'
<11>[    2.140823]  (0)[1:init]init: /vendor/etc/init/hw/init.mt6739.rc: 916: invalid keyword 'setprop'
<11>[    2.140844]  (0)[1:init]init: /vendor/etc/init/hw/init.mt6739.rc: 918: invalid keyword 'setprop'
<11>[    2.141570]  (0)[1:init]init: /vendor/etc/init/hw/init.mt6739.rc: 1203: invalid keyword 'chomd'
<11>[    2.141661]  (0)[1:init]init: /vendor/etc/init/hw/init.mt6739.rc: 1245: invalid keyword 'chgrp'
<14>[    2.141866]  (0)[1:init]init: Parsing file /vendor/etc/init/hw/init.connectivity.rc...
<14>[    2.142685]  (0)[1:init]init: Parsing file /vendor/etc/init/hw/init.project.rc...
<14>[    2.143230]  (0)[1:init]init: Parsing file /FWUpgradeInit.rc...
<11>[    2.143287]  (0)[1:init]init: Unable to open '/FWUpgradeInit.rc': No such file or directory
<11>[    2.143312]  (0)[1:init]init: /init.rc: 5: Could not import file '/FWUpgradeInit.rc': No such file or directory
<14>[    2.143404]  (0)[1:init]init: Parsing file /vendor/etc/init/hw/init.aee.rc...
<14>[    2.143923]  (0)[1:init]init: Added '/init.preload.rc' to import list
<14>[    2.143985]  (0)[1:init]init: Parsing file /init.preload.rc...
<11>[    2.144025]  (0)[1:init]init: Unable to open '/init.preload.rc': No such file or directory
<11>[    2.144048]  (0)[1:init]init: /init.rc: 51: Could not import file '/init.preload.rc': No such file or directory
<14>[    2.144089]  (0)[1:init]init: Parsing file /vendor/etc/init/hw/init.fon.rc...
<11>[    2.144115]  (0)[1:init]init: Unable to open '/vendor/etc/init/hw/init.fon.rc': No such file or directory
<11>[    2.144133]  (0)[1:init]init: /init.rc: 7: Could not import file '/vendor/etc/init/hw/init.fon.rc': No such file or directory
<14>[    2.144159]  (0)[1:init]init: Parsing file /vendor/etc/init/hw/init.ril.rc...
<11>[    2.144183]  (0)[1:init]init: Unable to open '/vendor/etc/init/hw/init.ril.rc': No such file or directory
<11>[    2.144201]  (0)[1:init]init: /init.rc: 8: Could not import file '/vendor/etc/init/hw/init.ril.rc': No such file or directory
<14>[    2.144227]  (0)[1:init]init: Parsing file /vendor/etc/init/hw/init.volte.rc...
<11>[    2.144251]  (0)[1:init]init: Unable to open '/vendor/etc/init/hw/init.volte.rc': No such file or directory
<11>[    2.144276]  (0)[1:init]init: /init.rc: 9: Could not import file '/vendor/etc/init/hw/init.volte.rc': No such file or directory
<14>[    2.144302]  (0)[1:init]init: Parsing file /vendor/etc/init/hw/init.mal.rc...
<11>[    2.144326]  (0)[1:init]init: Unable to open '/vendor/etc/init/hw/init.mal.rc': No such file or directory
<11>[    2.144345]  (0)[1:init]init: /init.rc: 10: Could not import file '/vendor/etc/init/hw/init.mal.rc': No such file or directory
<14>[    2.144370]  (0)[1:init]init: Parsing file /vendor/etc/init/hw/init.epdg.rc...
<11>[    2.144394]  (0)[1:init]init: Unable to open '/vendor/etc/init/hw/init.epdg.rc': No such file or directory
<11>[    2.144412]  (0)[1:init]init: /init.rc: 11: Could not import file '/vendor/etc/init/hw/init.epdg.rc': No such file or directory
<14>[    2.144481]  (0)[1:init]init: Parsing file /vendor/etc/init/hw/init.sensor_1_0.rc...
<14>[    2.145567]  (0)[1:init]init: Parsing file /vendor/etc/init/hw/init.mt6739.usb.rc...
<14>[    2.150268]  (0)[1:init]init: Parsing file /vendor/etc/init/hw/init.ago.rc...
<14>[    2.150897]  (0)[1:init]init: Parsing file /vendor/etc/init/hw/init.modem.rc...
<11>[    2.151648]  (0)[1:init]init: /vendor/etc/init/hw/init.modem.rc: 105: ignored duplicate definition of service 'pppd_gprs'
<14>[    2.151755]  (0)[1:init]init: Parsing file /init.usb.configfs.rc...
<14>[    2.152299]  (0)[1:init]init: Parsing file /init.zygote64_32.rc...
<14>[    2.152597]  (0)[1:init]init: Parsing directory /system/etc/init...
<14>[    2.153249]  (0)[1:init]init: Parsing file /system/etc/init/aee_aed.rc...
<14>[    2.153793]  (0)[1:init]init: Parsing file /system/etc/init/aee_aed64.rc...
<14>[    2.154269]  (0)[1:init]init: Parsing file /system/etc/init/android.hidl.allocator@1.0-service.rc...
<14>[    2.154733]  (0)[1:init]init: Parsing file /system/etc/init/atcid.rc...
<14>[    2.155273]  (0)[1:init]init: Parsing file /system/etc/init/atrace.rc...
<14>[    2.156273]  (0)[1:init]init: Parsing file /system/etc/init/audiocmdservice_atci.rc...
<14>[    2.156817]  (0)[1:init]init: Parsing file /system/etc/init/audioserver.rc...
<14>[    2.157411]  (0)[1:init]init: Parsing file /system/etc/init/batterywarning.rc...
<14>[    2.157924]  (0)[1:init]init: Parsing file /system/etc/init/bootanim.rc...
<14>[    2.158411]  (0)[1:init]init: Parsing file /system/etc/init/bootlogoupdater.rc...
<14>[    2.158878]  (0)[1:init]init: Parsing file /system/etc/init/bootstat.rc...
<14>[    2.159497]  (0)[1:init]init: Parsing file /system/etc/init/cameraserver.rc...
<14>[    2.160017]  (0)[1:init]init: Parsing file /system/etc/init/drmserver.rc...
<14>[    2.160518]  (0)[1:init]init: Parsing file /system/etc/init/dumpstate.rc...
<14>[    2.161068]  (0)[1:init]init: Parsing file /system/etc/init/emdlogger1.rc...
<14>[    2.161590]  (0)[1:init]init: Parsing file /system/etc/init/emdlogger2.rc...
<14>[    2.162099]  (0)[1:init]init: Parsing file /system/etc/init/emdlogger3.rc...
<14>[    2.162600]  (0)[1:init]init: Parsing file /system/etc/init/emdlogger5.rc...
<14>[    2.163092]  (0)[1:init]init: Parsing file /system/etc/init/gatekeeperd.rc...
<14>[    2.163559]  (0)[1:init]init: Parsing file /system/etc/init/ged_srv.rc...
<14>[    2.164108]  (0)[1:init]init: Parsing file /system/etc/init/hwservicemanager.rc...
<14>[    2.164619]  (0)[1:init]init: Parsing file /system/etc/init/init.thermald.rc...
<14>[    2.165123]  (0)[1:init]init: Parsing file /system/etc/init/init.vtservice.rc...
<14>[    2.165712]  (0)[1:init]init: Parsing file /system/etc/init/installd.rc...
<14>[    2.166489]  (0)[1:init]init: Parsing file /system/etc/init/keystore.rc...
<14>[    2.167031]  (0)[1:init]init: Parsing file /system/etc/init/kpoc_charger.rc...
<14>[    2.167521]  (0)[1:init]init: Parsing file /system/etc/init/lmkd.rc...
<14>[    2.168012]  (0)[1:init]init: Parsing file /system/etc/init/logd.rc...
<14>[    2.168568]  (0)[1:init]init: Parsing file /system/etc/init/md_monitor.rc...
<14>[    2.169133]  (2)[1:init]init: Parsing file /system/etc/init/mdlogger.rc...
<14>[    2.169679]  (2)[1:init]init: Parsing file /system/etc/init/mdnsd.rc...
<14>[    2.170208]  (2)[1:init]init: Parsing file /system/etc/init/mediadrmserver.rc...
<14>[    2.170698]  (2)[1:init]init: Parsing file /system/etc/init/mediaextractor.rc...
<14>[    2.171193]  (2)[1:init]init: Parsing file /system/etc/init/mediametrics.rc...
<14>[    2.171673]  (2)[1:init]init: Parsing file /system/etc/init/mediaserver.rc...
<14>[    2.172185]  (2)[1:init]init: Parsing file /system/etc/init/met_log_d.rc...
<14>[    2.172643]  (2)[1:init]init: Parsing file /system/etc/init/mobile_log_d.rc...
<14>[    2.173239]  (2)[1:init]init: Parsing file /system/etc/init/mtpd.rc...
<14>[    2.173793]  (2)[1:init]init: Parsing file /system/etc/init/netd.rc...
<14>[    2.174334]  (2)[1:init]init: Parsing file /system/etc/init/netdiag.rc...
<14>[    2.174867]  (2)[1:init]init: Parsing file /system/etc/init/ppl_agent.rc...
<14>[    2.175354]  (2)[1:init]init: Parsing file /system/etc/init/program_binary_service.rc...
<14>[    2.175835]  (2)[1:init]init: Parsing file /system/etc/init/racoon.rc...
<14>[    2.176330]  (2)[1:init]init: Parsing file /system/etc/init/servicemanager.rc...
<14>[    2.176838]  (2)[1:init]init: Parsing file /system/etc/init/sn.rc...
<14>[    2.177411]  (2)[1:init]init: Parsing file /system/etc/init/storaged.rc...
<14>[    2.177907]  (2)[1:init]init: Parsing file /system/etc/init/storagemanagerd.rc...
<14>[    2.178423]  (2)[1:init]init: Parsing file /system/etc/init/surfaceflinger.rc...
<14>[    2.179014]  (2)[1:init]init: Parsing file /system/etc/init/terserver.rc...
<11>[    2.179482]  (2)[1:init]init: /system/etc/init/terserver.rc: 4: ignored duplicate definition of service 'terservice'
<14>[    2.179521]  (2)[1:init]init: Parsing file /system/etc/init/thermalindicator.rc...
<14>[    2.179983]  (2)[1:init]init: Parsing file /system/etc/init/thermalservice.rc...
<14>[    2.180442]  (2)[1:init]init: Parsing file /system/etc/init/tombstoned.rc...
<14>[    2.180982]  (2)[1:init]init: Parsing file /system/etc/init/uncrypt.rc...
<14>[    2.181556]  (2)[1:init]init: Parsing file /system/etc/init/vdc.rc...
<14>[    2.182040]  (2)[1:init]init: Parsing file /system/etc/init/vold.rc...
<14>[    2.182548]  (2)[1:init]init: Parsing file /system/etc/init/webview_zygote32.rc...
<14>[    2.183062]  (2)[1:init]init: Parsing file /system/etc/init/webview_zygote64.rc...
<14>[    2.183626]  (2)[1:init]init: Parsing file /system/etc/init/wifi-events.rc...
<14>[    2.184210]  (2)[1:init]init: Parsing file /system/etc/init/wificond.rc...
<14>[    2.184767]  (2)[1:init]init: Parsing directory /vendor/etc/init...
<14>[    2.185049]  (2)[1:init]init: Parsing file /vendor/etc/init/aee_aedv.rc...
<14>[    2.185639]  (2)[1:init]init: Parsing file /vendor/etc/init/aee_aedv64.rc...
<14>[    2.186146]  (2)[1:init]init: Parsing file /vendor/etc/init/android.hardware.audio@2.0-service-mediatek.rc...
<14>[    2.186693]  (2)[1:init]init: Parsing file /vendor/etc/init/android.hardware.bluetooth@1.0-service-mediatek.rc...
<14>[    2.187231]  (2)[1:init]init: Parsing file /vendor/etc/init/android.hardware.broadcastradio@1.1-service.rc...
<14>[    2.187710]  (2)[1:init]init: Parsing file /vendor/etc/init/android.hardware.cas@1.0-service.rc...
<14>[    2.188189]  (2)[1:init]init: Parsing file /vendor/etc/init/android.hardware.configstore@1.0-service.rc...
<14>[    2.188671]  (2)[1:init]init: Parsing file /vendor/etc/init/android.hardware.drm@1.0-service.rc...
<14>[    2.189250]  (2)[1:init]init: Parsing file /vendor/etc/init/android.hardware.drm@1.0-service.widevine.rc...
<14>[    2.189778]  (2)[1:init]init: Parsing file /vendor/etc/init/android.hardware.gatekeeper@1.0-service.rc...
<14>[    2.190274]  (2)[1:init]init: Parsing file /vendor/etc/init/android.hardware.graphics.allocator@2.0-service.rc...
<14>[    2.190762]  (2)[1:init]init: Parsing file /vendor/etc/init/android.hardware.graphics.composer@2.1-service.rc...
<14>[    2.191255]  (2)[1:init]init: Parsing file /vendor/etc/init/android.hardware.keymaster@3.0-service.rc...
<14>[    2.191748]  (2)[1:init]init: Parsing file /vendor/etc/init/android.hardware.light@2.0-service-mediatek.rc...
<14>[    2.192272]  (2)[1:init]init: Parsing file /vendor/etc/init/android.hardware.media.omx@1.0-service.rc...
<14>[    2.192802]  (2)[1:init]init: Parsing file /vendor/etc/init/android.hardware.memtrack@1.0-service.rc...
<14>[    2.193360]  (2)[1:init]init: Parsing file /vendor/etc/init/android.hardware.sensors@1.0-service-mediatek.rc...
<14>[    2.193864]  (2)[1:init]init: Parsing file /vendor/etc/init/android.hardware.thermal@1.0-service.rc...
<14>[    2.194344]  (2)[1:init]init: Parsing file /vendor/etc/init/android.hardware.vibrator@1.0-service.rc...
<14>[    2.194824]  (2)[1:init]init: Parsing file /vendor/etc/init/android.hardware.wifi@1.0-service.rc...
<14>[    2.195301]  (2)[1:init]init: Parsing file /vendor/etc/init/camerahalserver.rc...
<14>[    2.195813]  (2)[1:init]init: Parsing file /vendor/etc/init/fuelgauged_init.rc...
<11>[    2.196265]  (2)[1:init]init: /vendor/etc/init/fuelgauged_init.rc: 1: ignored duplicate definition of service 'fuelgauged'
<14>[    2.196302]  (2)[1:init]init: Parsing file /vendor/etc/init/fuelgauged_nvram_init.rc...
<14>[    2.196757]  (2)[1:init]init: Parsing file /vendor/etc/init/gsm0710muxd.rc...
<14>[    2.197339]  (2)[1:init]init: Parsing file /vendor/etc/init/hostapd.android.rc...
<14>[    2.197883]  (2)[1:init]init: Parsing file /vendor/etc/init/init.bip.rc...
<14>[    2.198456]  (2)[1:init]init: Parsing file /vendor/etc/init/init.bt_drv.rc...
<14>[    2.198907]  (2)[1:init]init: Parsing file /vendor/etc/init/init.cccifsd.rc...
<11>[    2.199362]  (2)[1:init]init: /vendor/etc/init/init.cccifsd.rc: 15: ignored duplicate definition of service 'ccci_fsd'
<11>[    2.199404]  (2)[1:init]init: /vendor/etc/init/init.cccifsd.rc: 21: ignored duplicate definition of service 'ccci3_fsd'
<14>[    2.199425]  (2)[1:init]init: Parsing file /vendor/etc/init/init.cccimdinit.rc...
<11>[    2.199878]  (2)[1:init]init: /vendor/etc/init/init.cccimdinit.rc: 21: ignored duplicate definition of service 'ccci_mdinit'
<11>[    2.199918]  (2)[1:init]init: /vendor/etc/init/init.cccimdinit.rc: 27: ignored duplicate definition of service 'ccci3_mdinit'
<14>[    2.199938]  (2)[1:init]init: Parsing file /vendor/etc/init/init.cccirpcd.rc...
<11>[    2.200358]  (2)[1:init]init: /vendor/etc/init/init.cccirpcd.rc: 2: ignored duplicate definition of service 'ccci_rpcd'
<14>[    2.200393]  (2)[1:init]init: Parsing file /vendor/etc/init/init.gps_drv.rc...
<14>[    2.200820]  (2)[1:init]init: Parsing file /vendor/etc/init/init.md_apps.rc...
<14>[    2.201313]  (2)[1:init]init: Parsing file /vendor/etc/init/init.thermal.rc...
<14>[    2.201842]  (2)[1:init]init: Parsing file /vendor/etc/init/init.thermal_manager.rc...
<14>[    2.202350]  (2)[1:init]init: Parsing file /vendor/etc/init/init.thermalloadalgod.rc...
<11>[    2.202786]  (2)[1:init]init: /vendor/etc/init/init.thermalloadalgod.rc: 1: ignored duplicate definition of service 'thermalloadalgod'
<14>[    2.202824]  (2)[1:init]init: Parsing file /vendor/etc/init/init.volte_imcb.rc...
<14>[    2.203321]  (2)[1:init]init: Parsing file /vendor/etc/init/init.volte_imsm_93.rc...
<14>[    2.203950]  (2)[1:init]init: Parsing file /vendor/etc/init/init.volte_stack.rc...
<14>[    2.204471]  (2)[1:init]init: Parsing file /vendor/etc/init/init.volte_ua.rc...
<14>[    2.205020]  (2)[1:init]init: Parsing file /vendor/etc/init/init.vtservice.rc...
<11>[    2.205503]  (2)[1:init]init: /vendor/etc/init/init.vtservice.rc: 3: ignored duplicate definition of service 'vtservice'
<11>[    2.205549]  (2)[1:init]init: /vendor/etc/init/init.vtservice.rc: 9: ignored duplicate definition of service 'vtservice_hidl'
<14>[    2.205573]  (2)[1:init]init: Parsing file /vendor/etc/init/init.wfca.rc...
<14>[    2.206075]  (2)[1:init]init: Parsing file /vendor/etc/init/init.wlan_drv.rc...
<14>[    2.206530]  (2)[1:init]init: Parsing file /vendor/etc/init/init.wmt_drv.rc...
<14>[    2.206966]  (2)[1:init]init: Parsing file /vendor/etc/init/init.wod.rc...
<14>[    2.207570]  (2)[1:init]init: Parsing file /vendor/etc/init/init_connectivity.rc...
<14>[    2.208170]  (2)[1:init]init: Parsing file /vendor/etc/init/ipsec_mon.rc...
<14>[    2.208680]  (2)[1:init]init: Parsing file /vendor/etc/init/lbs_hidl_service.rc...
<14>[    2.209243]  (2)[1:init]init: Parsing file /vendor/etc/init/md_ctrl.rc...
<11>[    2.209740]  (2)[1:init]init: /vendor/etc/init/md_ctrl.rc: 13: ignored duplicate definition of service 'stop_modem'
<11>[    2.209780]  (2)[1:init]init: /vendor/etc/init/md_ctrl.rc: 18: ignored duplicate definition of service 'start_modem'
<14>[    2.209800]  (2)[1:init]init: Parsing file /vendor/etc/init/mtk_agpsd.rc...
<14>[    2.210363]  (2)[1:init]init: Parsing file /vendor/etc/init/muxreport.rc...
<14>[    2.210881]  (2)[1:init]init: Parsing file /vendor/etc/init/netdagent.rc...
<14>[    2.211376]  (2)[1:init]init: Parsing file /vendor/etc/init/nvram_agent_binder.rc...
<14>[    2.211864]  (2)[1:init]init: Parsing file /vendor/etc/init/nvram_daemon.rc...
<14>[    2.212359]  (2)[1:init]init: Parsing file /vendor/etc/init/rild.rc...
<14>[    2.212982]  (2)[1:init]init: Parsing file /vendor/etc/init/statusd.rc...
<14>[    2.213627]  (2)[1:init]init: Parsing file /vendor/etc/init/sysenv_daemon.rc...
<14>[    2.214151]  (2)[1:init]init: Parsing file /vendor/etc/init/vendor.mediatek.hardware.dfps@1.0-service.rc...
<14>[    2.214656]  (2)[1:init]init: Parsing file /vendor/etc/init/vendor.mediatek.hardware.gnss@1.1-service.rc...
<14>[    2.215158]  (2)[1:init]init: Parsing file /vendor/etc/init/vendor.mediatek.hardware.mtkcodecservice@1.1-service.rc...
<14>[    2.215654]  (2)[1:init]init: Parsing file /vendor/etc/init/vendor.mediatek.hardware.power@1.1-service.rc...
<14>[    2.216508]  (2)[1:init]init: Parsing file /vendor/etc/init/vendor.mediatek.hardware.pq@2.0-service.rc...
<14>[    2.217105]  (1)[1:init]init: Parsing file /vendor/etc/init/vendor.nxp.nxpnfc@1.0-service.rc...
<14>[    2.217658]  (1)[1:init]init: Parsing file /vendor/etc/init/vndservicemanager.rc...
<14>[    2.218188]  (1)[1:init]init: Parsing file /vendor/etc/init/wifi2agps.rc...
<14>[    2.218735]  (1)[1:init]init: Parsing file /odm/etc/init...
<11>[    2.218790]  (1)[1:init]init: Unable to open '/odm/etc/init': No such file or directory
<14>[    2.218944]  (1)[1:init]init: processing action (early-init) from (/init.rc:14)
<14>[    2.223621]  (1)[1:init]init: starting service 'ueventd'...
<14>[    2.224784]  (1)[1:init]init: processing action (early-init) from (/vendor/etc/init/hw/init.mt6739.rc:21)
<5>[    2.224993]  (1)[1:init][Power/PPM] @ppm_userlimit_min_cpu_freq_proc_write: Invalid cluster id: 1
<11>[    2.225227]  (1)[1:init]init: Unable to open '/proc/ppm/policy/userlimit_min_cpu_core': No such file or directory
<3>[    2.225327]  (1)[1:init]BOOTPROF:      2225.327158:INIT:early-init
<14>[    2.225652]  (1)[1:init]init: processing action (early-init) from (/vendor/etc/init/hw/init.mt6739.usb.rc:1)
<5>[    2.225774]  (3)[272:ueventd]random: ueventd: uninitialized urandom read (40 bytes read, 31 bits of entropy available)
<14>[    2.225818]  (1)[1:init]init: processing action (early-init) from (/vendor/etc/init/hw/init.modem.rc:7)
<14>[    2.226508]  (1)[1:init]init: PropSet [net.perf.tether.rps]=[0f] Done
<14>[    2.226563]  (1)[1:init]init: PropSet [net.perf.rps.default]=[ff] Done
<14>[    2.226602]  (1)[1:init]init: PropSet [net.perf.tether.cpu.core]=[4,4,0,0] Done
<14>[    2.226640]  (1)[1:init]init: PropSet [net.perf.tether.cpu.freq]=[1183000,1638000,0,0] Done
<14>[    2.226676]  (1)[1:init]init: PropSet [net.perf.internal.cpu.core]=[4,4,0,0] Done
<14>[    2.226713]  (1)[1:init]init: PropSet [net.perf.internal.cpu.freq]=[-1,-1,-1,-1] Done
<14>[    2.226765]  (1)[1:init]init: processing action (wait_for_coldboot_done) from (<Builtin Action>:0)
<14>[    2.227752]  (3)[272:ueventd]ueventd: ueventd started!
<14>[    2.227819]  (3)[272:ueventd]ueventd: Parsing file /ueventd.rc...
<14>[    2.230186]  (1)[272:ueventd]ueventd: Parsing file /vendor/ueventd.rc...
<14>[    2.232467]  (1)[272:ueventd]ueventd: Parsing file /odm/ueventd.rc...
<11>[    2.232527]  (1)[272:ueventd]ueventd: Unable to open '/odm/ueventd.rc': No such file or directory
<14>[    2.232677]  (1)[272:ueventd]ueventd: Parsing file /ueventd.mt6739.rc...
<11>[    2.232707]  (1)[272:ueventd]ueventd: Unable to open '/ueventd.mt6739.rc': No such file or directory
<14>[    2.237492]  (1)[272:ueventd]selinux: SELinux: Loaded file_contexts
<14>[    2.237492] 
<3>[    2.289566]  (1)[272:ueventd]power_supply charger: driver failed to report `charge_type' property: -22
<4>[    2.304641] -(0)[199:dc_trim_thread]mt6357_get_auxadc_value: 107 callbacks suppressed
<5>[    2.304654]  (0)[199:dc_trim_thread][mt6357_get_auxadc_value] ch_idx = 9, channel = 9, reg_val = 0x6a37, adc_result = 27191
<5>[    2.309265]  (2)[199:dc_trim_thread][mt6357_get_auxadc_value] ch_idx = 9, channel = 9, reg_val = 0x6a34, adc_result = 27188
<5>[    2.313987]  (2)[199:dc_trim_thread][mt6357_get_auxadc_value] ch_idx = 9, channel = 9, reg_val = 0x6a35, adc_result = 27189
<4>[    2.329212]  (1)[272:ueventd]=====FG=====::  soc =53 
<4>[    2.344916]  (1)[272:ueventd]=====FG=====::  battery_current =-373 
<4>[    2.376920]  (1)[272:ueventd]=====FG=====::	battery_current =-373 battery_vol_original=3809
<4>[    2.376936]  (1)[272:ueventd]=====FG=====:: battery_vol =3846 
<5>[    2.388729]  (2)[199:dc_trim_thread][mt6357_get_auxadc_value] ch_idx = 9, channel = 9, reg_val = 0x6a0b, adc_result = 27147
<4>[    2.392968]  (1)[272:ueventd]fg_27542 :  196  11  tempreture =3012 
<4>[    2.392978]  (1)[272:ueventd]=====FG=====: temperature:280 
<5>[    2.393452]  (2)[199:dc_trim_thread][mt6357_get_auxadc_value] ch_idx = 9, channel = 9, reg_val = 0x6a0f, adc_result = 27151
<14>[    2.430983]  (1)[272:ueventd]selinux: SELinux: Loaded file_contexts
<14>[    2.430983] 
<14>[    2.956578]  (1)[272:ueventd]ueventd: Coldboot took 0.718 seconds
<14>[    2.957336]  (0)[1:init]init: Command 'wait_for_coldboot_done' action=wait_for_coldboot_done (<Builtin Action>:0) returned 0 took 730ms.
<14>[    2.957433]  (0)[1:init]init: processing action (mix_hwrng_into_linux_rng) from (<Builtin Action>:0)
<11>[    2.957492]  (0)[1:init]init: /dev/hw_random not found
<14>[    2.957536]  (0)[1:init]init: processing action (set_mmap_rnd_bits) from (<Builtin Action>:0)
<14>[    2.958258]  (0)[1:init]init: processing action (set_kptr_restrict) from (<Builtin Action>:0)
<14>[    2.958469]  (0)[1:init]init: processing action (keychord_init) from (<Builtin Action>:0)
<11>[    2.958542]  (0)[1:init]init: could not open /dev/keychord: No such file or directory
<14>[    2.958589]  (0)[1:init]init: processing action (console_init) from (<Builtin Action>:0)
<14>[    2.958681]  (0)[1:init]init: processing action (init) from (/init.rc:44)
<11>[    2.958934]  (0)[1:init]init: Unable to open '/default.prop': Too many symbolic links encountered
<11>[    2.974600]  (0)[1:init]init: Unable to open '/proc/sys/kernel/hung_task_timeout_secs': No such file or directory
<11>[    2.974655]  (0)[1:init]init: Unable to open '/proc/cpu/alignment': No such file or directory
<5>[    2.987907]  (0)[1:init]Registered swp emulation handler
<11>[    2.988095]  (0)[1:init]init: Unable to open '/sys/class/leds/vibrator/trigger': No such file or directory
<14>[    2.988134]  (0)[1:init]init: processing action (init) from (/init.environ.rc:2)
<14>[    2.988227]  (0)[1:init]init: processing action (init) from (/vendor/etc/init/hw/init.mt6739.rc:28)
<14>[    2.992147]  (0)[1:init]init: processing action (init) from (/vendor/etc/init/hw/init.mt6739.rc:1259)
<14>[    2.992711]  (0)[1:init]init: processing action (init) from (/vendor/etc/init/hw/init.project.rc:3)
<14>[    2.994018]  (0)[1:init]init: processing action (init) from (/vendor/etc/init/hw/init.aee.rc:42)
<14>[    2.994160]  (0)[1:init]init: processing action (init) from (/vendor/etc/init/hw/init.ago.rc:3)
<14>[    2.994342]  (0)[1:init]init: processing action (mix_hwrng_into_linux_rng) from (<Builtin Action>:0)
<11>[    2.994379]  (0)[1:init]init: /dev/hw_random not found
<14>[    2.994442]  (0)[1:init]init: processing action (late-init) from (/init.rc:280)
<14>[    2.994506]  (0)[1:init]init: processing action (late-init) from (/vendor/etc/init/hw/init.mt6739.rc:71)
<3>[    2.994583]  (0)[1:init]BOOTPROF:      2994.581929:INIT:late-init
<14>[    2.994827]  (0)[1:init]init: processing action (queue_property_triggers) from (<Builtin Action>:0)
<14>[    2.994926]  (0)[1:init]init: processing action (fs) from (/vendor/etc/init/hw/init.mt6739.rc:96)
<3>[    2.994993]  (0)[1:init]BOOTPROF:      2994.992622:INIT:Mount_START
<11>[    2.997310]  (0)[1:init]init: cannot find '/system/bin/mntl_link', disabling 'exec 1 (/system/bin/mntl_link)': No such file or directory
<11>[    2.997351]  (0)[1:init]init: Could not start exec service
<14>[    2.999827]  (1)[277:init]init: [libfs_mgr]Invalid ext4 magic:0x3d2b on '/dev/block/platform/bootdevice/by-name/userdata'
<11>[    2.999944]  (1)[277:init]init: [libfs_mgr]mount_with_alternatives(): skipping mount, invalid ext4, mountpoint=/data rec[2].fs_type=ext4
<11>[    3.000412]  (1)[277:init]init: [libfs_mgr]fs_mgr_mount_all(): possibly an encryptable blkdev /dev/block/platform/bootdevice/by-name/userdata for mount /data type ext4
<14>[    3.001162]  (1)[277:init]init: [libfs_mgr]superblock s_max_mnt_count:10,/dev/block/platform/bootdevice/by-name/cache
<4>[    3.001598]  (1)[277:init]EXT4-fs (mmcblk0p33): Ignoring removed nomblk_io_submit option
<6>[    3.003082]  (0)[277:init]EXT4-fs (mmcblk0p33): mounted filesystem with ordered data mode. Opts: errors=remount-ro,nomblk_io_submit
<14>[    3.003326]  (0)[277:init]init: [libfs_mgr]check_fs(): mount(/dev/block/platform/bootdevice/by-name/cache,/cache,ext4)=0: Success
<14>[    3.004299]  (0)[277:init]init: [libfs_mgr]check_fs(): unmount(/cache) succeeded
<14>[    3.004557]  (0)[277:init]init: [libfs_mgr]Running /system/bin/e2fsck on /dev/block/platform/bootdevice/by-name/cache
<5>[    3.016661]  (2)[280:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 39 bits of entropy available)
<5>[    3.069030]  (2)[280:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 39 bits of entropy available)
<14>[    3.082634]  (1)[277:init]e2fsck: e2fsck 1.43.3 (04-Sep-2016)
<14>[    3.082634] 
<14>[    3.082680]  (1)[277:init]e2fsck: cache: clean, 14/27648 files, 3570/110592 blocks (check in 5 mounts)
<14>[    3.082680] 
<6>[    3.084768]  (1)[277:init]EXT4-fs (mmcblk0p33): mounted filesystem with ordered data mode. Opts: noauto_da_alloc,discard
<14>[    3.085020]  (1)[277:init]init: [libfs_mgr]__mount(source=/dev/block/platform/bootdevice/by-name/cache,target=/cache,type=ext4)=0: Success
<14>[    3.085726]  (1)[277:init]init: [libfs_mgr]superblock s_max_mnt_count:65535,/dev/block/platform/bootdevice/by-name/protect1
<4>[    3.086170]  (1)[277:init]EXT4-fs (mmcblk0p10): Ignoring removed nomblk_io_submit option
<6>[    3.087560]  (1)[277:init]EXT4-fs (mmcblk0p10): mounted filesystem with ordered data mode. Opts: errors=remount-ro,nomblk_io_submit
<14>[    3.087972]  (1)[277:init]init: [libfs_mgr]check_fs(): mount(/dev/block/platform/bootdevice/by-name/protect1,/vendor/protect_f,ext4)=0: Success
<14>[    3.089030]  (1)[277:init]init: [libfs_mgr]check_fs(): unmount(/vendor/protect_f) succeeded
<14>[    3.089099]  (1)[277:init]init: [libfs_mgr]Running /system/bin/e2fsck on /dev/block/platform/bootdevice/by-name/protect1
<5>[    3.091012]  (2)[285:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 40 bits of entropy available)
<5>[    3.103023]  (2)[285:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 40 bits of entropy available)
<14>[    3.110034]  (1)[277:init]e2fsck: e2fsck 1.43.3 (04-Sep-2016)
<14>[    3.110034] 
<14>[    3.110079]  (1)[277:init]e2fsck: /dev/block/platform/bootdevice/by-name/protect1: clean, 18/2048 files, 1114/2048 blocks
<14>[    3.110079] 
<6>[    3.112194]  (2)[277:init]EXT4-fs (mmcblk0p10): mounted filesystem with ordered data mode. Opts: noauto_da_alloc,commit=1,nodelalloc
<14>[    3.112586]  (2)[277:init]init: [libfs_mgr]__mount(source=/dev/block/platform/bootdevice/by-name/protect1,target=/vendor/protect_f,type=ext4)=0: Success
<14>[    3.113283]  (2)[277:init]init: [libfs_mgr]superblock s_max_mnt_count:65535,/dev/block/platform/bootdevice/by-name/protect2
<4>[    3.113741]  (2)[277:init]EXT4-fs (mmcblk0p11): Ignoring removed nomblk_io_submit option
<6>[    3.115140]  (1)[277:init]EXT4-fs (mmcblk0p11): mounted filesystem with ordered data mode. Opts: errors=remount-ro,nomblk_io_submit
<14>[    3.115559]  (1)[277:init]init: [libfs_mgr]check_fs(): mount(/dev/block/platform/bootdevice/by-name/protect2,/vendor/protect_s,ext4)=0: Success
<14>[    3.116611]  (1)[277:init]init: [libfs_mgr]check_fs(): unmount(/vendor/protect_s) succeeded
<14>[    3.116682]  (1)[277:init]init: [libfs_mgr]Running /system/bin/e2fsck on /dev/block/platform/bootdevice/by-name/protect2
<5>[    3.118661]  (3)[290:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 40 bits of entropy available)
<5>[    3.130625]  (3)[290:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 41 bits of entropy available)
<14>[    3.137330]  (1)[277:init]e2fsck: e2fsck 1.43.3 (04-Sep-2016)
<14>[    3.137330] 
<14>[    3.137374]  (1)[277:init]e2fsck: /dev/block/platform/bootdevice/by-name/protect2: clean, 16/2432 files, 1123/2423 blocks
<14>[    3.137374] 
<6>[    3.139417]  (1)[277:init]EXT4-fs (mmcblk0p11): mounted filesystem with ordered data mode. Opts: noauto_da_alloc,commit=1,nodelalloc
<14>[    3.139803]  (1)[277:init]init: [libfs_mgr]__mount(source=/dev/block/platform/bootdevice/by-name/protect2,target=/vendor/protect_s,type=ext4)=0: Success
<14>[    3.140461]  (1)[277:init]init: [libfs_mgr]superblock s_max_mnt_count:65535,/dev/block/platform/bootdevice/by-name/nvdata
<4>[    3.140923]  (1)[277:init]EXT4-fs (mmcblk0p7): Ignoring removed nomblk_io_submit option
<6>[    3.142806]  (1)[277:init]EXT4-fs (mmcblk0p7): mounted filesystem with ordered data mode. Opts: errors=remount-ro,nomblk_io_submit
<14>[    3.143237]  (1)[277:init]init: [libfs_mgr]check_fs(): mount(/dev/block/platform/bootdevice/by-name/nvdata,/vendor/nvdata,ext4)=0: Success
<14>[    3.144272]  (1)[277:init]init: [libfs_mgr]check_fs(): unmount(/vendor/nvdata) succeeded
<14>[    3.144339]  (1)[277:init]init: [libfs_mgr]Running /system/bin/e2fsck on /dev/block/platform/bootdevice/by-name/nvdata
<5>[    3.146285]  (2)[295:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 41 bits of entropy available)
<5>[    3.158361]  (2)[295:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 41 bits of entropy available)
<14>[    3.164952]  (1)[277:init]e2fsck: e2fsck 1.43.3 (04-Sep-2016)
<14>[    3.164952] 
<14>[    3.165004]  (1)[277:init]e2fsck: /dev/block/platform/bootdevice/by-name/nvdata: clean, 398/8192 files, 1988/8192 blocks
<14>[    3.165004] 
<6>[    3.167579]  (1)[277:init]EXT4-fs (mmcblk0p7): mounted filesystem with ordered data mode. Opts: noauto_da_alloc,discard
<14>[    3.167968]  (1)[277:init]init: [libfs_mgr]__mount(source=/dev/block/platform/bootdevice/by-name/nvdata,target=/vendor/nvdata,type=ext4)=0: Success
<14>[    3.168623]  (1)[277:init]init: [libfs_mgr]superblock s_max_mnt_count:65535,/dev/block/platform/bootdevice/by-name/nvcfg
<4>[    3.169093]  (1)[277:init]EXT4-fs (mmcblk0p6): Ignoring removed nomblk_io_submit option
<6>[    3.170475]  (1)[277:init]EXT4-fs (mmcblk0p6): mounted filesystem with ordered data mode. Opts: errors=remount-ro,nomblk_io_submit
<14>[    3.170891]  (1)[277:init]init: [libfs_mgr]check_fs(): mount(/dev/block/platform/bootdevice/by-name/nvcfg,/vendor/nvcfg,ext4)=0: Success
<14>[    3.171907]  (1)[277:init]init: [libfs_mgr]check_fs(): unmount(/vendor/nvcfg) succeeded
<14>[    3.171972]  (1)[277:init]init: [libfs_mgr]Running /system/bin/e2fsck on /dev/block/platform/bootdevice/by-name/nvcfg
<14>[    3.192675]  (3)[277:init]e2fsck: e2fsck 1.43.3 (04-Sep-2016)
<14>[    3.192675] 
<14>[    3.192720]  (3)[277:init]e2fsck: /dev/block/platform/bootdevice/by-name/nvcfg: clean, 16/2048 files, 1105/2048 blocks
<14>[    3.192720] 
<6>[    3.194846]  (3)[277:init]EXT4-fs (mmcblk0p6): mounted filesystem with ordered data mode. Opts: noauto_da_alloc,commit=1,nodelalloc
<14>[    3.195232]  (3)[277:init]init: [libfs_mgr]__mount(source=/dev/block/platform/bootdevice/by-name/nvcfg,target=/vendor/nvcfg,type=ext4)=0: Success
<14>[    3.195879]  (3)[277:init]init: [libfs_mgr]superblock s_max_mnt_count:10,/dev/block/platform/bootdevice/by-name/ipsm
<4>[    3.196299]  (3)[277:init]EXT4-fs (mmcblk0p34): Ignoring removed nomblk_io_submit option
<6>[    3.197739]  (1)[277:init]EXT4-fs (mmcblk0p34): mounted filesystem with ordered data mode. Opts: errors=remount-ro,nomblk_io_submit
<14>[    3.197912]  (1)[277:init]init: [libfs_mgr]check_fs(): mount(/dev/block/platform/bootdevice/by-name/ipsm,/ipsm,ext4)=0: Success
<14>[    3.198948]  (1)[277:init]init: [libfs_mgr]check_fs(): unmount(/ipsm) succeeded
<14>[    3.199016]  (1)[277:init]init: [libfs_mgr]Running /system/bin/e2fsck on /dev/block/platform/bootdevice/by-name/ipsm
<14>[    3.221915]  (3)[277:init]e2fsck: e2fsck 1.43.3 (04-Sep-2016)
<14>[    3.221915] 
<14>[    3.221959]  (3)[277:init]e2fsck: ipsm: clean, 17/131072 files, 17200/524288 blocks
<14>[    3.221959] 
<6>[    3.224050]  (3)[277:init]EXT4-fs (mmcblk0p34): mounted filesystem with ordered data mode. Opts: noauto_da_alloc,discard
<14>[    3.224205]  (3)[277:init]init: [libfs_mgr]__mount(source=/dev/block/platform/bootdevice/by-name/ipsm,target=/ipsm,type=ext4)=0: Success
<14>[    3.225214]  (0)[1:init]init: Parsing file /odm/etc/init...
<11>[    3.225280]  (0)[1:init]init: Unable to open '/odm/etc/init': No such file or directory
<14>[    3.225356]  (0)[1:init]init: Command 'mount_all /vendor/etc/fstab.mt6739' action=fs (/vendor/etc/init/hw/init.mt6739.rc:107) returned 2 took 227ms.
<14>[    3.226672]  (0)[1:init]init: starting service 'exec 2 (/system/bin/tune2fs -O has_journal -u 10010 -r 4096 /dev/block/platform/bootdevice/by-name/userdata)'...
<14>[    3.227657]  (0)[1:init]init: SVC_EXEC pid 308 (uid 0 gid 0+0 context default) started; waiting...
<14>[    3.248371]  (0)[1:init]init: Service 'exec 2 (/system/bin/tune2fs -O has_journal -u 10010 -r 4096 /dev/block/platform/bootdevice/by-name/userdata)' (pid 308) killed by signal 1 waiting took 0.022000 seconds
<3>[    3.248762]  (0)[1:init]BOOTPROF:      3248.761622:INIT:Mount_END
<6>[    3.250710]  (0)[1:init]zram0: detected capacity change from 0 to 1073741824
<14>[    3.279861]  (2)[1:init]mkswap: Swapspace size: 1048572k, UUID=688206bf-bffd-4035-9e0f-8680f1bb062c
<6>[    3.280809]  (2)[1:init]Adding 1048572k swap on /dev/block/zram0.  Priority:-1 extents:1 across:1048572k SS
<14>[    3.281053]  (2)[1:init]init: processing action (fs) from (/vendor/etc/init/hw/init.mt6739.rc:114)
<14>[    3.281185]  (2)[1:init]init: processing action (fs) from (/system/etc/init/logd.rc:18)
<14>[    3.281834]  (2)[1:init]init: processing action (fs) from (/system/etc/init/wifi-events.rc:17)
<14>[    3.281922]  (2)[1:init]init: PropSet [sys.wifitracing.started]=[0] Done
<14>[    3.281991]  (2)[1:init]init: processing action (post-fs) from (/init.rc:313)
<14>[    3.283038]  (2)[1:init]init: PropSet [persist.sys.language]=[zh] Done
<14>[    3.283090]  (2)[1:init]init: PropSet [persist.sys.country]=[CN] Done
<14>[    3.283120]  (2)[1:init]init: PropSet [persist.sys.localevar]=[] Done
<14>[    3.283150]  (2)[1:init]init: PropSet [persist.sys.timezone]=[Asia/Shanghai] Done
<14>[    3.283213]  (2)[1:init]init: PropSet [rild.libpath]=[mtk-ril.so] Done
<14>[    3.283240]  (2)[1:init]init: PropSet [rild.libargs]=[-d /dev/ttyC0] Done
<14>[    3.283265]  (2)[1:init]init: PropSet [wifi.interface]=[wlan0] Done
<14>[    3.283311]  (2)[1:init]init: PropSet [mediatek.wlan.ctia]=[0] Done
<14>[    3.283339]  (2)[1:init]init: PropSet [wifi.tethering.interface]=[ap0] Done
<14>[    3.283374]  (2)[1:init]init: PropSet [wifi.direct.interface]=[p2p0] Done
<14>[    3.283412]  (2)[1:init]init: PropSet [sys.ipo.pwrdncap]=[2] Done
<14>[    3.283504]  (2)[1:init]init: PropSet [qemu.hw.mainkeys]=[0] Done
<14>[    3.283582]  (2)[1:init]init: PropSet [sys.ipo.disable]=[1] Done
<14>[    3.283620]  (2)[1:init]init: PropSet [persist.sys.dalvik.vm.lib.2]=[libart.so] Done
<14>[    3.283649]  (2)[1:init]init: PropSet [dalvik.vm.isa.arm64.variant]=[cortex-a53] Done
<14>[    3.283677]  (2)[1:init]init: PropSet [dalvik.vm.isa.arm64.features]=[default] Done
<14>[    3.283704]  (2)[1:init]init: PropSet [dalvik.vm.isa.arm.variant]=[cortex-a53] Done
<14>[    3.283731]  (2)[1:init]init: PropSet [dalvik.vm.isa.arm.features]=[default] Done
<14>[    3.283756]  (2)[1:init]init: PropSet [net.bt.name]=[Android] Done
<14>[    3.283783]  (2)[1:init]init: PropSet [dalvik.vm.stack-trace-dir]=[/data/anr] Done
<12>[    3.283864]  (2)[1:init]init: Couldn't load property file: Unable to open '/odm/build.prop': No such file or directory: No such file or directory
<14>[    3.284854]  (2)[1:init]init: PropSet [persist.radio.default.sim]=[0] Done
<14>[    3.284950]  (2)[1:init]init: PropSet [persist.radio.erlvt.on]=[1] Done
<14>[    3.284986]  (2)[1:init]init: PropSet [media.settings.xml]=[/vendor/etc/media_profiles.xml] Done
<14>[    3.285013]  (2)[1:init]init: PropSet [ril.specific.sm_cause]=[0] Done
<14>[    3.285038]  (2)[1:init]init: PropSet [bgw.current3gband]=[0] Done
<14>[    3.285063]  (2)[1:init]init: PropSet [ril.external.md]=[0] Done
<11>[    3.285108]  (2)[1:init]init: property_set("ro.opengles.version", "196610") failed: property already set
<14>[    3.285134]  (2)[1:init]init: PropSet [persist.radio.fd.counter]=[150] Done
<14>[    3.285161]  (2)[1:init]init: PropSet [persist.radio.fd.off.counter]=[50] Done
<14>[    3.285188]  (2)[1:init]init: PropSet [persist.radio.fd.r8.counter]=[150] Done
<14>[    3.285214]  (2)[1:init]init: PropSet [persist.radio.fd.off.r8.counter]=[50] Done
<14>[    3.285240]  (2)[1:init]init: PropSet [drm.service.enabled]=[true] Done
<14>[    3.285264]  (2)[1:init]init: PropSet [fmradio.driver.enable]=[0] Done
<14>[    3.285302]  (2)[1:init]init: PropSet [mtk.eccci.c2k]=[enabled] Done
<14>[    3.285327]  (2)[1:init]init: PropSet [ril.first.md]=[1] Done
<14>[    3.285355]  (2)[1:init]init: PropSet [ril.flightmode.poweroffMD]=[0] Done
<14>[    3.285380]  (2)[1:init]init: PropSet [ril.telephony.mode]=[0] Done
<14>[    3.285408]  (2)[1:init]init: PropSet [dalvik.vm.mtk-stack-trace-file]=[/data/anr/mtk_traces.txt] Done
<14>[    3.285433]  (2)[1:init]init: PropSet [mediatek.wlan.chip]=[CONSYS_MT6739] Done
<14>[    3.285459]  (2)[1:init]init: PropSet [mediatek.wlan.module.postfix]=[_consys_mt6739] Done
<14>[    3.285485]  (2)[1:init]init: PropSet [ril.read.imsi]=[1] Done
<14>[    3.285512]  (2)[1:init]init: PropSet [ril.radiooff.poweroffMD]=[0] Done
<14>[    3.285622]  (2)[1:init]init: PropSet [camera.mdp.dre.enable]=[0] Done
<14>[    3.285647]  (2)[1:init]init: PropSet [camera.mdp.cz.enable]=[0] Done
<14>[    3.285715]  (2)[1:init]init: PropSet [bt.profiles.avrcp.multiPlayer.enable]=[0] Done
<14>[    3.285746]  (2)[1:init]init: PropSet [persist.radio.multisim.config]=[ss] Done
<14>[    3.286045]  (2)[1:init]init: PropSet [persist.radio.flashless.fsm]=[0] Done
<14>[    3.286072]  (2)[1:init]init: PropSet [persist.radio.flashless.fsm_cst]=[0] Done
<14>[    3.286099]  (2)[1:init]init: PropSet [persist.radio.flashless.fsm_rw]=[0] Done
<14>[    3.286238]  (2)[1:init]init: PropSet [telephony.lteOnCdmaDevice]=[1] Done
<14>[    3.286422]  (2)[1:init]init: PropSet [persist.sys.pms_sys_removable]=[1] Done
<14>[    3.286610]  (2)[1:init]init: PropSet [persist.service.acm.enable]=[0] Done
<14>[    3.286631]  (2)[1:init]init: PropSet [persist.vzw_device_type]=[0] Done
<14>[    3.286662]  (2)[1:init]init: PropSet [persist.mtk_ims_support]=[1] Done
<14>[    3.286692]  (2)[1:init]init: PropSet [persist.mtk_dynamic_ims_switch]=[1] Done
<14>[    3.286730]  (2)[1:init]init: PropSet [persist.mtk_mims_support]=[1] Done
<14>[    3.286751]  (2)[1:init]init: PropSet [persist.mtk_wfc_support]=[1] Done
<14>[    3.286771]  (2)[1:init]init: PropSet [persist.mtk_volte_support]=[1] Done
<14>[    3.286792]  (2)[1:init]init: PropSet [persist.mtk.volte.enable]=[1] Done
<14>[    3.286811]  (2)[1:init]init: PropSet [persist.mtk_vilte_support]=[1] Done
<14>[    3.286830]  (2)[1:init]init: PropSet [persist.mtk_viwifi_support]=[1] Done
<14>[    3.286850]  (2)[1:init]init: PropSet [persist.mtk_ussi_support]=[1] Done
<14>[    3.286875]  (2)[1:init]init: PropSet [wfd.dummy.enable]=[1] Done
<14>[    3.286900]  (2)[1:init]init: PropSet [wfd.iframesize.level]=[0] Done
<14>[    3.286926]  (2)[1:init]init: PropSet [persist.mtk.wcn.coredump.mode]=[0] Done
<14>[    3.286952]  (2)[1:init]init: PropSet [persist.mtk.wcn.combo.chipid]=[-1] Done
<14>[    3.286979]  (2)[1:init]init: PropSet [persist.mtk.wcn.patch.version]=[-1] Done
<14>[    3.287004]  (2)[1:init]init: PropSet [persist.mtk.wcn.dynamic.dump]=[0] Done
<14>[    3.287029]  (2)[1:init]init: PropSet [service.wcn.driver.ready]=[no] Done
<14>[    3.287059]  (2)[1:init]init: PropSet [persist.mtk.connsys.poweron.ctl]=[0] Done
<14>[    3.287091]  (2)[1:init]init: PropSet [persist.mtk_epdg_support]=[1] Done
<14>[    3.287129]  (2)[1:init]init: PropSet [persist.radio.mobile.data]=[0,0] Done
<14>[    3.287162]  (2)[1:init]init: PropSet [persist.meta.dumpdata]=[0] Done
<14>[    3.287201]  (2)[1:init]init: PropSet [dalvik.vm.heapgrowthlimit]=[128m] Done
<14>[    3.287225]  (2)[1:init]init: PropSet [dalvik.vm.heapsize]=[256m] Done
<14>[    3.287244]  (2)[1:init]init: PropSet [persist.radio.mtk_dsbp_support]=[1] Done
<14>[    3.287273]  (2)[1:init]init: PropSet [persist.mtk_ct_volte_support]=[1] Done
<14>[    3.287300]  (2)[1:init]init: PropSet [persist.radio.mtk_ps2_rat]=[L/W/G] Done
<14>[    3.287325]  (2)[1:init]init: PropSet [persist.radio.mtk_ps3_rat]=[G] Done
<11>[    3.288751]  (2)[1:init]init: property_set("persist,log.tag.SuppServHelper", "I") failed: bad name
<14>[    3.289740]  (2)[1:init]init: PropSet [mtk.vdec.waitkeyframeforplay]=[1] Done
<14>[    3.289790]  (2)[1:init]init: PropSet [persist.mtk.datashaping.support]=[1] Done
<14>[    3.289821]  (2)[1:init]init: PropSet [persist.datashaping.alarmgroup]=[1] Done
<14>[    3.289851]  (2)[1:init]init: PropSet [persist.duraspeed.support]=[1] Done
<14>[    3.289881]  (2)[1:init]init: PropSet [persist.duraspeed.app.on]=[1] Done
<14>[    3.289922]  (2)[1:init]init: PropSet [debug.sf.disable_backpressure]=[1] Done
<14>[    3.290109]  (2)[1:init]init: PropSet [Build.BRAND]=[MTK] Done
<14>[    3.290140]  (2)[1:init]init: PropSet [persist.radio.lte.chip]=[0] Done
<12>[    3.290218]  (2)[1:init]init: Couldn't load property file: Unable to open '/factory/factory.prop': No such file or directory: No such file or directory
<6>[    3.292416]  (2)[1:init][E][Factory Data](_factory_update_revision): FACTORY_VAL(1,revision)=150
<6>[    3.292443]  (2)[1:init][I][Factory Data](_factory_update_revision): Factory Data is REV3 - wrapper size 10 - data_size 196
<6>[    3.292457]  (2)[1:init][I][Factory Data](factory_data_check_crc32): CRC32 check passed!
<6>[    3.292465]  (2)[1:init][I][Factory Data](factory_data_check_crc32): CRC32 check passed!
<6>[    3.292471]  (2)[1:init][I][Factory Data](read_factory_partition): OK
<14>[    3.293221]  (2)[1:init]init: huang0123 The file is exited !
<14>[    3.293590]  (2)[1:init]init: huang0123 factroyValue.length = 8, protectValue.length = 8, defaultValue.length = 8
<14>[    3.293619]  (2)[1:init]init: huang0123 factroyValue = 3A621OCC, protectValue = 3A6210CC, defaultValue = 3A621OCC
<14>[    3.293636]  (2)[1:init]init: huang0123 same = 1
<14>[    3.293713]  (2)[1:init]init: initSystemInfo extpart_value = [3A621OCC], wifionly_value = [3]
<14>[    3.294091]  (2)[1:init]init: huang0123 checkAndWriteAssemblyDateFile The file is exited !
<14>[    3.294391]  (2)[1:init]init: huang0123 factroyValue.length = 8, protectValue.length = 8, defaultValue.length = 8
<14>[    3.294419]  (2)[1:init]init: huang0123 factroyValue = 20190211, protectValue = 20190211, defaultValue = 20181016
<14>[    3.294438]  (2)[1:init]init: huang0123 checkAndWriteAssemblyDateFile same = 1
<14>[    3.295029]  (2)[1:init]init: starting service 'logd'...
<14>[    3.296581]  (2)[1:init]init: starting service 'servicemanager'...
<14>[    3.296712]  (0)[310:init]init: Created socket '/dev/socket/logd', mode 666, user 1036, group 1036
<14>[    3.297683]  (0)[310:init]init: Created socket '/dev/socket/logdr', mode 666, user 1036, group 1036
<14>[    3.298377]  (2)[1:init]init: starting service 'hwservicemanager'...
<14>[    3.298664]  (0)[310:init]init: Created socket '/dev/socket/logdw', mode 222, user 1036, group 1036
<14>[    3.298841]  (0)[310:init]init: Opened file '/proc/kmsg', flags 0
<14>[    3.298901]  (0)[310:init]init: Opened file '/dev/kmsg', flags 1
<14>[    3.300863]  (0)[1:init]init: starting service 'vndservicemanager'...
<4>[    3.315726] -(1)[199:dc_trim_thread]mt6357_get_auxadc_value: 93 callbacks suppressed
<5>[    3.315742]  (1)[199:dc_trim_thread][mt6357_get_auxadc_value] ch_idx = 9, channel = 9, reg_val = 0x6a36, adc_result = 27190
<5>[    3.320465]  (2)[199:dc_trim_thread][mt6357_get_auxadc_value] ch_idx = 9, channel = 9, reg_val = 0x6a35, adc_result = 27189
<5>[    3.325146]  (3)[199:dc_trim_thread][mt6357_get_auxadc_value] ch_idx = 9, channel = 9, reg_val = 0x6a35, adc_result = 27189
<14>[    3.353068]  (0)[1:init]selinux: SELinux: Skipping restorecon_recursive(/cache)
<14>[    3.353068] 
<38>[    3.353294]  (3)[310:logd]logd.auditd: start
<14>[    3.365470]  (2)[1:init]selinux: SELinux: Skipping restorecon_recursive(/ipsm)
<14>[    3.365470] 
<14>[    3.366204]  (2)[1:init]init: processing action (post-fs) from (/vendor/etc/init/hw/init.mt6739.rc:118)
<3>[    3.366342]  (2)[1:init]BOOTPROF:      3366.341315:INIT:post-fs
<14>[    3.367530]  (2)[1:init]init: processing action (post-fs) from (/vendor/etc/init/hw/init.aee.rc:12)
<14>[    3.368111]  (2)[1:init]init: starting service 'aee_aed'...
<14>[    3.369921]  (2)[1:init]init: starting service 'aee_aed64'...
<14>[    3.371870]  (2)[1:init]init: starting service 'aee_aedv'...
<14>[    3.373874]  (2)[1:init]init: starting service 'aee_aedv64'...
<14>[    3.375257]  (2)[1:init]init: processing action (post-fs) from (/vendor/etc/init/hw/init.mt6739.usb.rc:4)
<14>[    3.375368]  (2)[1:init]init: PropSet [sys.usb.vid]=[0x0E8D] Done
<6>[    3.378331]  (2)[1:init]gadgets_make name=g1
<6>[    3.380325]  (2)[1:init]function_make name=accessory.gs2
<6>[    3.381135]  (2)[1:init]function_make name=audio_source.gs3
<6>[    3.381815]  (2)[1:init]function_make name=ffs.adb
<6>[    3.381855]  (2)[1:init]file system registered
<6>[    3.382332]  (2)[1:init]function_make name=mtp.gs0
<5>[    3.385676]  (2)[199:dc_trim_thread][mt6357_get_auxadc_value] ch_idx = 9, channel = 9, reg_val = 0x6a53, adc_result = 27219
<6>[    3.387012]  (1)[1:init]interf_grp_compatible_id_store ext_compat_id=MTP
<6>[    3.387514]  (1)[1:init]function_make name=ptp.gs1
<6>[    3.388087]  (1)[1:init]function_make name=rndis.gs4
<4>[    3.388144]  (1)[1:init]using random self ethernet address
<4>[    3.388153]  (1)[1:init]using random host ethernet address
<6>[    3.388687]  (1)[1:init]function_make name=midi.gs5
<6>[    3.389474]  (1)[1:init]function_make name=acm.gs0
<6>[    3.389616]  (1)[1:init]acm_alloc_instance opts->port_num=0
<6>[    3.390121]  (1)[1:init]function_make name=acm.gs1
<6>[    3.390253]  (1)[1:init]acm_alloc_instance opts->port_num=1
<6>[    3.390757]  (1)[1:init]function_make name=acm.gs2
<6>[    3.390905]  (1)[1:init]acm_alloc_instance opts->port_num=2
<6>[    3.391441]  (1)[1:init]function_make name=acm.gs3
<6>[    3.391588]  (1)[1:init]acm_alloc_instance opts->port_num=3
<5>[    3.392125]  (3)[199:dc_trim_thread][mt6357_get_auxadc_value] ch_idx = 9, channel = 9, reg_val = 0x6a57, adc_result = 27223
<6>[    3.392127]  (1)[1:init]function_make name=mass_storage.usb0
<6>[    3.392157]  (1)[1:init]Mass Storage Function, version: 2009/09/11
<6>[    3.392161]  (1)[1:init]LUN: removable file: (no medium)
<6>[    3.392694]  (1)[1:init]function_make name=hid.gs0
<6>[    3.393390]  (1)[1:init]function_make name=via_modem.gs0
<6>[    3.393930]  (1)[1:init]function_make name=via_ets.gs0
<6>[    3.394501]  (1)[1:init]function_make name=via_atc.gs0
<6>[    3.395034]  (1)[1:init]config_desc_make name=b.1
<6>[    3.395836]  (1)[1:init]os_desc_b_vendor_code_store Vendor Code=1
<14>[    3.396515]  (1)[1:init]init: processing action (post-fs) from (/system/etc/init/atrace.rc:3)
<7>[    3.400593]  (1)[1:init][ftrace]tracing_on is toggled to 0
<11>[    3.400682]  (1)[1:init]init: Unable to open '/sys/kernel/tracing/tracing_on': No such file or directory
<14>[    3.401075]  (1)[1:init]init: processing action (late-fs) from (/init.rc:385)
<14>[    3.402958]  (0)[1:init]init: starting service 'keymaster-3-0'...
<14>[    3.404425]  (0)[1:init]init: processing action (post-fs-data) from (/init.rc:393)
<14>[    3.406155]  (0)[1:init]init: starting service 'vold'...
<11>[    3.410165]  (0)[1:init]init: Unable to open '/data/system/entropy.dat': No such file or directory
<14>[    3.411331]  (3)[326:init]init: Created socket '/dev/socket/vold', mode 660, user 0, group 1009
<14>[    3.412400]  (3)[326:init]init: Created socket '/dev/socket/cryptd', mode 660, user 0, group 1009
<11>[    3.412414]  (0)[1:init]init: Unable to open '/data/misc/recovery/ro.build.fingerprint': No such file or directory
<11>[    3.413636]  (0)[1:init]init: Unable to open '/data/misc/recovery/proc/version': No such file or directory
<6>[    3.417840]  (3)[312:hwservicemanage]binder: 312:312 ioctl 620a 0 returned -22
<14>[    3.420122]  (0)[1:init]init: PropSet [hwservicemanager.ready]=[true] Done
<14>[    3.436285]  (0)[1:init]init: PropSet [persist.mtk.aee.mode]=[4] Done
<14>[    3.438499]  (0)[1:init]init: PropSet [persist.aee.core.dump]=[disable] Done
<14>[    3.439771]  (0)[1:init]init: PropSet [persist.aee.core.direct]=[disable] Done
<14>[    3.441164]  (0)[1:init]init: PropSet [persist.aee.fatal_db.count]=[4] Done
<14>[    3.442883]  (0)[1:init]init: PropSet [persist.aee.db.count]=[4] Done
<14>[    3.444432]  (0)[1:init]init: PropSet [debug.mtk.aee.status64]=[free] Done
<14>[    3.476181]  (0)[1:init]init: PropSet [debug.mtk.aee.vstatus64]=[free] Done
<14>[    3.485808]  (0)[1:init]init: starting service 'exec 3 (/system/bin/vdc --wait cryptfs init_user0)'...
<14>[    3.486955]  (0)[1:init]init: SVC_EXEC pid 328 (uid 0 gid 0+0 context default) started; waiting...
<6>[    3.503887]  (2)[199:dc_trim_thread][accdet_init]start --->
<6>[    3.506952]  (2)[199:dc_trim_thread][accdet_init_once] sw mode setting,old Accdet_con24:0xc018, AUDENC_ANA_CON6:0x0
<6>[    3.506995]  (2)[199:dc_trim_thread][accdet_init_once] sw mode setting,new Accdet_con24:0xc018, AUDENC_ANA_CON6:0x0
<6>[    3.507002]  (2)[199:dc_trim_thread][accdet_init_once]-0 ACCDET_INIT0_ONCE done--->
<6>[    3.507034]  (2)[199:dc_trim_thread][accdet_init_once] ACCDET_INIT1_ONCE done--->
<14>[    3.525154]  (1)[1:init]init: PropSet [debug.mtk.aee.vstatus64]=[free] Done
<14>[    3.526769]  (1)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[free] Done
<14>[    3.527287]  (1)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[free] Done
<14>[    3.528298]  (2)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[dumping] Done
<14>[    3.528593]  (2)[1:init]init: PropSet [debug.mtk.aee.status64]=[free] Done
<4>[    3.530114]  (1)[329:aee_aedv][KL_ENV]cann't find name=forceencrypt_config
<14>[    3.530266]  (2)[1:init]init: PropSet [debug.mtk.aee.status]=[free] Done
<4>[    3.533841]  (1)[329:aee_aedv][KL_ENV]cann't find name=forceencrypt_config
<14>[    3.536509]  (0)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[free] Done
<14>[    3.556385]  (0)[1:init]init: PropSet [vold.has_adoptable]=[1] Done
<14>[    3.556816]  (1)[1:init]init: PropSet [vold.has_quota]=[1] Done
<14>[    3.565098]  (2)[1:init]init: Service 'exec 3 (/system/bin/vdc --wait cryptfs init_user0)' (pid 328) exited with status 0 waiting took 0.079000 seconds
<14>[    3.601528]  (2)[1:init]init: starting service 'exec 4 (/system/bin/tzdatacheck /system/usr/share/zoneinfo /data/misc/zoneinfo)'...
<14>[    3.602564]  (2)[1:init]init: SVC_EXEC pid 333 (uid 1000 gid 1000+0 context default) started; waiting...
<14>[    3.618493]  (2)[1:init]init: Service 'exec 4 (/system/bin/tzdatacheck /system/usr/share/zoneinfo /data/misc/zoneinfo)' (pid 333) exited with status 0 waiting took 0.017000 seconds
<14>[    3.618674]  (2)[1:init]init: processing action (post-fs-data) from (/init.usb.rc:6)
<14>[    3.620734]  (2)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.mt6739.rc:150)
<3>[    3.620873]  (2)[1:init]BOOTPROF:      3620.871777:INIT:post-fs-data
<14>[    3.621922]  (2)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/nvcfg)
<14>[    3.621922] 
<14>[    3.624230]  (2)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/nvdata)
<14>[    3.624230] 
<14>[    3.645748]  (2)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.connectivity.rc:3)
<14>[    3.650394]  (2)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.project.rc:7)
<14>[    3.650807]  (2)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.aee.rc:1)
<14>[    3.655678]  (2)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.sensor_1_0.rc:2)
<14>[    3.659300]  (2)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.modem.rc:21)
<3>[    3.659434]  (2)[1:init]BOOTPROF:      3659.433008:post-fs-data: on modem start
<14>[    3.662322]  (2)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/protect_f)
<14>[    3.662322] 
<14>[    3.662418]  (2)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/protect_s)
<14>[    3.662418] 
<14>[    3.662503]  (2)[1:init]init: PropSet [vold.post_fs_data_done]=[1] Done
<14>[    3.662538]  (2)[1:init]init: processing action (post-fs-data) from (/system/etc/init/bootstat.rc:3)
<14>[    3.663951]  (2)[1:init]init: processing action (post-fs-data) from (/system/etc/init/mobile_log_d.rc:1)
<14>[    3.665152]  (2)[1:init]init: processing action (post-fs-data) from (/system/etc/init/sn.rc:1)
<14>[    3.665611]  (2)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/android.hardware.audio@2.0-service-mediatek.rc:1)
<14>[    3.666168]  (2)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hostapd.android.rc:9)
<14>[    3.666775]  (2)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/init.cccifsd.rc:5)
<14>[    3.666872]  (2)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/protect_f)
<14>[    3.666872] 
<14>[    3.666938]  (2)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/protect_s)
<14>[    3.666938] 
<14>[    3.666974]  (2)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/init.cccimdinit.rc:4)
<14>[    3.669543]  (2)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/init.wod.rc:1)
<14>[    3.672402]  (2)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/mtk_agpsd.rc:1)
<14>[    3.673071]  (2)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/statusd.rc:1)
<14>[    3.673768]  (2)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/vendor.mediatek.hardware.power@1.1-service.rc:1)
<14>[    3.678768]  (2)[1:init]init: processing action (load_persist_props_action) from (/init.rc:270)
<14>[    3.679276]  (2)[1:init]init: starting service 'logd-reinit'...
<14>[    3.680559]  (2)[1:init]init: processing action (firmware_mounts_complete) from (/init.rc:276)
<14>[    3.680775]  (2)[1:init]init: processing action (early-boot) from (/system/etc/init/installd.rc:5)
<30>[    3.700941]  (3)[314:logd.daemon]logd.daemon: reinit
<14>[    3.702384]  (2)[1:init]init: PropSet [log.tag]=[I] Done
<31>[    3.702517]  (3)[314:logd.daemon]logd: logd no log reader, set log level to INFO!
<14>[    3.703044]  (2)[1:init]init: Service 'logd-reinit' (pid 334) exited with status 0
<14>[    3.725904]  (2)[1:init]init: processing action (boot) from (/init.rc:576)
<11>[    3.726792]  (2)[1:init]init: Unable to open '/proc/sys/vm/min_free_order_shift': No such file or directory
<14>[    3.729818]  (2)[1:init]init: PropSet [net.tcp.default_init_rwnd]=[60] Done
<14>[    3.731113]  (2)[1:init]init: starting service 'hidl_memory'...
<14>[    3.732965]  (2)[1:init]init: starting service 'vtservice_hidl'...
<14>[    3.734920]  (2)[1:init]init: starting service 'audio-hal-2-0'...
<14>[    3.735233]  (3)[336:init]init: Created socket '/dev/socket/volte_vt', mode 660, user 0, group 1000
<14>[    3.737409]  (2)[1:init]init: starting service 'bluetooth-1-0'...
<14>[    3.739558]  (2)[1:init]init: starting service 'broadcastradio-hal'...
<14>[    3.741773]  (2)[1:init]init: starting service 'cas-hal-1-0'...
<14>[    3.744021]  (2)[1:init]init: starting service 'configstore-hal-1-0'...
<14>[    3.746214]  (2)[1:init]init: starting service 'drm-hal-1-0'...
<14>[    3.748513]  (2)[1:init]init: starting service 'drm-widevine-hal-1-0'...
<14>[    3.750947]  (2)[1:init]init: starting service 'gatekeeper-1-0'...
<14>[    3.753193]  (2)[1:init]init: starting service 'gralloc-2-0'...
<14>[    3.755453]  (2)[1:init]init: starting service 'hwcomposer-2-1'...
<14>[    3.757758]  (2)[1:init]init: starting service 'light-hal-2-0'...
<14>[    3.759928]  (2)[1:init]init: starting service 'memtrack-hal-1-0'...
<14>[    3.762213]  (2)[1:init]init: starting service 'thermal-hal-1-0'...
<14>[    3.764303]  (2)[1:init]init: starting service 'vibrator-1-0'...
<14>[    3.766690]  (2)[1:init]init: starting service 'wifi_hal_legacy'...
<14>[    3.769184]  (2)[1:init]init: starting service 'dfps-1-0'...
<14>[    3.771333]  (2)[1:init]init: starting service 'mtkcodecservice-1-1'...
<14>[    3.773459]  (2)[1:init]init: starting service 'power-hal-1-1'...
<14>[    3.775637]  (2)[1:init]init: starting service 'nxpnfc_hal_svc'...
<14>[    3.778347]  (2)[1:init]init: starting service 'healthd'...
<11>[    3.779794]  (2)[1:init]init: cannot find '/vendor/bin/spm_loader', disabling 'spm_script': No such file or directory
<14>[    3.780659]  (2)[1:init]init: starting service 'ccci_fsd'...
<14>[    3.783093]  (2)[1:init]init: starting service 'ccci_mdinit'...
<14>[    3.784823]  (2)[1:init]init: starting service 'ccci3_fsd'...
<14>[    3.788311]  (2)[1:init]init: starting service 'ccci3_mdinit'...
<14>[    3.790723]  (2)[1:init]init: starting service 'ccci_rpcd'...
<11>[    3.792321]  (2)[1:init]init: cannot find '/vendor/bin/terservice', disabling 'terservice': No such file or directory
<14>[    3.795417]  (2)[1:init]init: starting service 'bootlogoupdater'...
<14>[    3.797609]  (2)[1:init]init: starting service 'lmkd'...
<14>[    3.800007]  (2)[1:init]init: starting service 'surfaceflinger'...
<14>[    3.803779]  (2)[1:init]init: starting service 'thermalservice'...
<14>[    3.806339]  (2)[1:init]init: starting service 'wfca'...
<14>[    3.809048]  (2)[1:init]init: starting service 'wmt_loader'...
<14>[    3.811400]  (2)[1:init]init: starting service 'wmt_launcher'...
<14>[    3.814142]  (2)[366:init]init: Created socket '/dev/socket/wfca', mode 660, user 0, group 1000
<14>[    3.815675]  (2)[366:init]init: Created socket '/dev/socket/wfca_rds', mode 660, user 0, group 1000
<14>[    3.826594]  (3)[363:init]init: Created socket '/dev/socket/lmkd', mode 660, user 1000, group 1000
<14>[    3.826804]  (2)[1:init]init: starting service 'statusd'...
<14>[    3.828270]  (2)[1:init]init: processing action (boot) from (/init.usb.rc:25)
<14>[    3.828389]  (2)[1:init]init: PropSet [sys.usb.configfs]=[0] Done
<14>[    3.828500]  (2)[1:init]init: processing action (persist.sys.usb.config=* && boot) from (/init.usb.rc:106)
<14>[    3.828560]  (2)[1:init]init: PropSet [sys.usb.config]=[mtp] Done
<14>[    3.828604]  (2)[1:init]init: processing action (boot) from (/vendor/etc/init/hw/init.mt6739.rc:596)
<3>[    3.828739]  (2)[1:init]BOOTPROF:      3828.738470:INIT:boot
<11>[    3.855160]  (0)[364:init]init: Failed to bind socket 'pdx/system/vr/display/client': No such file or directory
<14>[    3.868365]  (2)[1:init]init: processing action (boot) from (/vendor/etc/init/hw/init.mt6739.usb.rc:41)
<14>[    3.868446]  (2)[1:init]init: PropSet [sys.usb.configfs]=[1] Done
<14>[    3.868493]  (2)[1:init]init: PropSet [sys.usb.controller]=[musb-hdrc] Done
<14>[    3.868528]  (2)[1:init]init: PropSet [sys.usb.acm_cnt]=[0] Done
<14>[    3.868592]  (2)[1:init]init: PropSet [sys.usb.acm_port0]=[] Done
<14>[    3.868628]  (2)[1:init]init: PropSet [sys.usb.acm_port1]=[] Done
<14>[    3.868660]  (2)[1:init]init: PropSet [sys.usb.temp]=[] Done
<14>[    3.868693]  (2)[1:init]init: PropSet [sys.usb.acm_enable]=[0] Done
<14>[    3.868724]  (2)[1:init]init: PropSet [sys.usb.clear]=[boot] Done
<6>[    3.868880]  (2)[1:init]Store => 0xf0
<6>[    3.868890]  (2)[1:init]Set CPU[4] On
<6>[    3.869438]  (2)[1:init]Set CPU[5] On
<6>[    3.869461]  (2)[1:init]Set CPU[6] On
<6>[    3.869467]  (2)[1:init]Set CPU[7] On
<14>[    3.875174]  (1)[369:init]init: Created socket '/dev/socket/rild-via', mode 660, user 1001, group 1001
<14>[    3.876748]  (1)[369:init]init: Created socket '/dev/socket/msap_c2k_socket1', mode 660, user 1001, group 1001
<14>[    3.879322]  (2)[1:init]init: processing action (boot) from (/system/etc/init/bootstat.rc:57)
<14>[    3.879420]  (2)[1:init]init: PropSet [sys.logbootcomplete]=[1] Done
<14>[    3.879467]  (2)[1:init]init: processing action (boot) from (/system/etc/init/dumpstate.rc:1)
<14>[    3.879681]  (2)[1:init]init: processing action (boot) from (/system/etc/init/ged_srv.rc:12)
<14>[    3.880161]  (2)[1:init]init: processing action (boot) from (/system/etc/init/netdiag.rc:5)
<14>[    3.886554]  (2)[1:init]init: processing action (boot) from (/vendor/etc/init/init.md_apps.rc:1)
<14>[    3.886744]  (2)[1:init]init: processing action (boot) from (/vendor/etc/init/init.wmt_drv.rc:1)
<14>[    3.890340]  (1)[369:init]init: Created socket '/dev/socket/msap_c2k_socket2', mode 660, user 1001, group 1001
<14>[    3.891714]  (1)[369:init]init: Created socket '/dev/socket/msap_c2k_socket3', mode 660, user 1001, group 1001
<14>[    3.893555]  (1)[369:init]init: Created socket '/dev/socket/msap_c2k_socket4', mode 660, user 1001, group 1001
<14>[    3.894535]  (1)[369:init]init: Created socket '/dev/socket/rpc', mode 660, user 1001, group 1001
<14>[    3.905312]  (1)[369:init]init: Created socket '/dev/socket/rildc-debug', mode 660, user 1001, group 1000
<14>[    3.906763]  (1)[369:init]init: Created socket '/dev/socket/rild-atci-c2k', mode 660, user 1001, group 1000
<14>[    3.907716]  (1)[369:init]init: Created socket '/dev/socket/statusd', mode 660, user 1001, group 1001
<11>[    3.909113]  (2)[364:init]init: Failed to bind socket 'pdx/system/vr/display/manager': No such file or directory
<11>[    3.910150]  (2)[364:init]init: Failed to bind socket 'pdx/system/vr/display/vsync': No such file or directory
<6>[    3.932096]  (1)[366:wfca][ccci1/chr]port ccci_imsa open with flag 20002 by wfca
<12>[    3.993218]  (1)[356:healthd]healthd: unable to get HAL interface, using defaults
<5>[    3.995263] -(1)[356:healthd]alarmtimer_enqueue, 63990368153
<12>[    3.996679]  (1)[356:healthd]healthd: BatteryFullChargePath not found
<12>[    3.996709]  (1)[356:healthd]healthd: BatteryCycleCountPath not found
<4>[    4.017003]  (1)[356:healthd]=====FG=====::  soc =53 
<6>[    4.044813]  (0)[361:ccci_rpcd][ccci1/chr]port ccci_rpc open with flag 20002 by ccci_rpcd
<4>[    4.053001]  (3)[356:healthd]=====FG=====::	battery_current =-498 battery_vol_original=3809
<4>[    4.053029]  (3)[356:healthd]=====FG=====:: battery_vol =3858 
<3>[    4.066321]  (3)[360:ccci_mdinit]BOOTPROF:      4066.319932:ccci_md3: md_init srv start
<4>[    4.069467]  (2)[356:healthd]=====FG=====::  battery_current =-498 
<6>[    4.072486]  (1)[357:ccci_fsd][ccci1/chr]port ccci_fs open with flag 20002 by ccci_fsd
<3>[    4.083856]  (0)[358:ccci_mdinit]BOOTPROF:      4083.854778:ccci_md1: md_init srv start
<4>[    4.085012]  (1)[356:healthd]fg_27542 :  196  11  tempreture =3012 
<4>[    4.085045]  (1)[356:healthd]=====FG=====: temperature:280 
<3>[    4.086804]  (0)[358:ccci_mdinit]BOOTPROF:      4086.803009:ccci_md1: init
<12>[    4.101774]  (3)[356:healthd]healthd: battery l=53 v=3858 t=28.0 h=2 st=3 c=-498 chg=
<5>[    4.101814] -(3)[356:healthd]alarmtimer_enqueue, 604096920153
<3>[    4.138545]  (0)[342:android.hardwar]Dump cpuinfo
<6>[    4.157691]  (3)[352:vendor.mediatek][DFRC] dfrc_reset_state
<6>[    4.157780]  (0)[158:dfrc_make_polic][DFRC] adjust vsync: [0|0|0] -> [-1|0|0]
<3>[    4.202671]  (3)[1:init][SDIO-DETECT][I]sdio_detect_init:sdio_register_driver() ret=0
<3>[    4.203023]  (3)[1:init][WMT-DETECT][I]wmt_detect_driver_init:driver(major 154) installed success
<14>[    4.203358]  (3)[1:init]init: Command 'insmod /vendor/lib/modules/wmt_drv.ko' action=boot (/vendor/etc/init/init.wmt_drv.rc:2) returned 0 took 316ms.
<14>[    4.204118]  (3)[1:init]init: PropSet [mtk.md1.status]=[init] Done
<14>[    4.205321]  (3)[1:init]init: processing action (enable_property_trigger) from (<Builtin Action>:0)
<14>[    4.205982]  (3)[1:init]init: Service 'ccci3_mdinit' (pid 360) exited with status 0
<14>[    4.207900]  (3)[1:init]init: processing action (security.perf_harden=1) from (/init.rc:724)
<14>[    4.208246]  (3)[1:init]init: processing action (sys.usb.acm_cnt=0 && sys.usb.config=mtp && sys.usb.configfs=1) from (/vendor/etc/init/hw/init.mt6739.usb.rc:169)
<14>[    4.208346]  (3)[1:init]init: PropSet [sys.usb.pid]=[0x2008] Done
<14>[    4.208414]  (3)[1:init]init: processing action (sys.usb.acm_enable=0 && sys.usb.config=mtp && sys.usb.configfs=1) from (/vendor/etc/init/hw/init.mt6739.usb.rc:192)
<6>[    4.208832]  (3)[1:init]os_desc_use_store Use OS DESC
<6>[    4.209998]  (3)[1:init]config_usb_cfg_link b.1<-->mtp.gs0
<6>[    4.210022]  (3)[1:init]usb_get_function usb_function_driver name=mtp
<6>[    4.210031]  (3)[1:init]usb_get_function usb_function name=mtp
<6>[    4.210225]  (3)[1:init]gadget_dev_desc_UDC_store write musb-hdrc
<6>[    4.210251]  (3)[1:init]usb_udc_attach_driver musb-hdrc musb-hdrc
<6>[    4.210261]  (3)[1:init]udc musb-hdrc: registering UDC driver [g1]
<6>[    4.210269]  (3)[1:init]configfs_composite_bind
<6>[    4.210277]  (3)[1:init]composite_dev_prepare ffffffc02c355480
<6>[    4.210306]  (3)[1:init]configfs-gadget gadget: adding 'mtp'/ffffffc02c4f6c00 to config 'b'/ffffffc02d281100
<6>[    4.210346]  (3)[1:init]allocate RX=49152 Tx=49152
<6>[    4.210354]  (3)[1:init]composite_os_desc_req_prepare ffffffc02bd78700
<5>[    4.210362]  (3)[1:init][MUSB]musb_gadget_start 2445: musb_gadget_start
<5>[    4.210458]  (3)[1:init][MUSB]musb_gadget_pullup 2230: is_on=1, softconnect=0 ++
<5>[    4.210471] -(3)[1:init][MUSB]musb_gadget_pullup 2243: is_on=1, softconnect=0 ++
<5>[    4.210480] -(3)[1:init][MUSB]set_usb_rdy 2204: set usb_rdy, wake up bat
<5>[    4.210487] -(3)[1:init][MUSB]musb_gadget_pullup 2259: issue connect_rescue_work on is_ready begin, delay_time:8000 ms
<5>[    4.210496] -(3)[1:init][MUSB]musb_gadget_pullup 2261: issue connect_rescue_work on is_ready end, delay_time:8000 ms
<5>[    4.210504] -(3)[1:init][MUSB]musb_pullup 2152: MUSB: gadget pull up 1 start, musb->power:0
<5>[    4.210511] -(3)[1:init][MUSB]musb_pullup 2174: MUSB: gadget pull up 1 end
<3>[    4.210633]  (3)[1:init]BOOTPROF:      4210.632932:USB ready
<14>[    4.210848]  (3)[1:init]init: PropSet [sys.usb.state]=[mtp] Done
<14>[    4.211020]  (3)[1:init]init: processing action (defaultcrypto) from (/system/etc/init/vdc.rc:2)
<14>[    4.211633]  (3)[1:init]init: starting service 'exec 5 (/system/bin/vdc --wait cryptfs mountdefaultencrypted)'...
<14>[    4.213167]  (3)[1:init]init: SVC_EXEC pid 373 (uid 0 gid 0+0 context default) started; waiting...
<4>[    4.240052]  (1)[345:android.hardwar]pvrsrvkm 13000000.mfg_auckland: Direct firmware load for rgx.fw.signed.22.49.21.16 failed with error -2
<4>[    4.240080]  (1)[345:android.hardwar]pvrsrvkm 13000000.mfg_auckland: Falling back to user helper
<14>[    4.244082]  (1)[376:ueventd]ueventd: firmware: loading 'rgx.fw.signed.22.49.21.16' for '/devices/platform/13000000.mfg_auckland/firmware/rgx.fw.signed.22.49.21.16'
<14>[    4.244666]  (3)[1:init]init: Service 'exec 5 (/system/bin/vdc --wait cryptfs mountdefaultencrypted)' (pid 373) exited with status 0 waiting took 0.033000 seconds
<11>[    4.248163]  (0)[376:ueventd]ueventd: firmware: could not find firmware for rgx.fw.signed.22.49.21.16
<14>[    4.248344]  (0)[376:ueventd]ueventd: loading /devices/platform/13000000.mfg_auckland/firmware/rgx.fw.signed.22.49.21.16 took 6ms
<4>[    4.248586]  (1)[345:android.hardwar]pvrsrvkm 13000000.mfg_auckland: Direct firmware load for rgx.fw.signed.22.49p.21.16 failed with error -2
<4>[    4.248612]  (1)[345:android.hardwar]pvrsrvkm 13000000.mfg_auckland: Falling back to user helper
<3>[    4.250936]  (0)[377:vold]BOOTPROF:      4250.935240:vold:decrypt_master_key:START
<14>[    4.252178]  (0)[378:ueventd]ueventd: firmware: loading 'rgx.fw.signed.22.49p.21.16' for '/devices/platform/13000000.mfg_auckland/firmware/rgx.fw.signed.22.49p.21.16'
<11>[    4.253116]  (0)[378:ueventd]ueventd: firmware: could not find firmware for rgx.fw.signed.22.49p.21.16
<14>[    4.253262]  (0)[378:ueventd]ueventd: loading /devices/platform/13000000.mfg_auckland/firmware/rgx.fw.signed.22.49p.21.16 took 1ms
<3>[    4.273140]  (0)[367:wmt_loader][WMT-DETECT][I]wmt_detect_open:open major 154 minor 0 (pid 367)
<3>[    4.273354]  (0)[367:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:cmd (-2147191034),arg(92)
<3>[    4.273373]  (0)[367:wmt_loader][WMT-DETECT][I]wmt_detect_ext_chip_pwr_on:combo chip is not supported
<3>[    4.273422]  (0)[367:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:cmd (-2147191037),arg(0)
<4>[    4.273433]  (0)[367:wmt_loader][WMT-PLAT][I]wmt_plat_get_soc_chipid:current SOC chip:0x6739
<14>[    4.274680]  (3)[1:init]init: PropSet [persist.mtk.wcn.combo.chipid]=[0x6739] Done
<3>[    4.276434]  (3)[367:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:cmd (1074034433),arg(26425)
<3>[    4.276462]  (3)[367:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:chipid(26425)
<4>[    4.276470]  (3)[367:wmt_loader]set current consys chipid (0x6739)
<3>[    4.276478]  (3)[367:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:cmd (-2147191035),arg(26425)
<3>[    4.276582]  (3)[367:wmt_loader][SDIO-DETECT][I]sdio_detect_exit:sdio_unregister_driver
<3>[    4.276601]  (3)[367:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:cmd (-2147191036),arg(26425)
<3>[    4.276608]  (3)[367:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:kernel object mode
<4>[    4.276617]  (3)[367:wmt_loader][HIF-SDIO][I]hif_sdio_init:start!
<4>[    4.283938]  (3)[367:wmt_loader][STPDbg]stp_dbg_init: stp-dbg init
<4>[    4.284952]  (3)[367:wmt_loader][STPDbg]stp_dbg_core_dump_init: create coredump object OK!
<4>[    4.284994]  (3)[367:wmt_loader][HIF-SDIO][I]WMT_init:driver(major 190) installed
<4>[    4.300485]  (3)[367:wmt_loader][WMT-CONF][I]wmt_conf_parse_pair:cfg(coex_wmt_ant_mode) val(2) NUM_WMTCFG_FIELDS = 54 cmdline_motherboard_type = 3
<4>[    4.300512]  (3)[367:wmt_loader][WMT-CONF][I]wmt_conf_parse_pair:cfg(coex_wmt_ant_mode_ex) val(1) NUM_WMTCFG_FIELDS = 54 cmdline_motherboard_type = 3
<4>[    4.300522]  (3)[367:wmt_loader][WMT-CONF][I]wmt_conf_parse_pair:cfg(wmt_gps_lna_pin) val(0) NUM_WMTCFG_FIELDS = 54 cmdline_motherboard_type = 3
<4>[    4.300534]  (3)[367:wmt_loader][WMT-CONF][I]wmt_conf_parse_pair:cfg(wmt_gps_lna_enable) val(0) NUM_WMTCFG_FIELDS = 54 cmdline_motherboard_type = 3
<4>[    4.300545]  (3)[367:wmt_loader][WMT-CONF][I]wmt_conf_parse_pair:cfg(co_clock_flag) val(1) NUM_WMTCFG_FIELDS = 54 cmdline_motherboard_type = 3
<4>[    4.301088]  (3)[367:wmt_loader][HIF-SDIO][I]wmt_lib_init:set pwr on seq par to hw conf
<4>[    4.301115]  (3)[367:wmt_loader][HIF-SDIO][I]wmt_lib_init:ldo(0)rst(0)on(0)off(0)rtc(0)
<6>[    4.301142]  (3)[367:wmt_loader][I]wmt_export_platform_bridge_register:
<4>[    4.303086]  (3)[367:wmt_loader][WMT-CONSYS-HW][I]consys_emi_mpu_set_region_protection:setting MPU for EMI share memory
<4>[    4.303124]  (3)[367:wmt_loader][WMT-CONSYS-HW][I]consys_emi_set_remapping_reg:CONSYS_EMI_MAPPING dump in restore cb(0x000023bc)
<4>[    4.303144]  (3)[367:wmt_loader][WMT-CONSYS-HW][I]mtk_wmt_probe:EMI mapping OK virtual(0xffffff800ef80000) physical(0x0x0000000077800000)
<4>[    4.303967]  (3)[367:wmt_loader][WMT-CONSYS-HW][I]mtk_wmt_probe:GPS LNA gpio pin number:137, pinmux:0x00008900.
<3>[    4.307621]  (3)[367:wmt_loader][CONN-MD-DFT][W]conn_md_add_user:uid (0x80000003) is added to user list successfully
<3>[    4.307966]  (3)[367:wmt_loader][WMT-DETECT][I]wmt_detect_close:close major 154 minor 0 (pid 367)
<14>[    4.308792]  (3)[1:init]init: PropSet [service.wcn.driver.ready]=[yes] Done
<14>[    4.310365]  (3)[1:init]init: processing action (service.wcn.driver.ready=yes) from (/vendor/etc/init/init.bt_drv.rc:2)
<6>[    4.313416]  (3)[1:init][MTK-BT] BT_init: mtk_stp_bt_chrdev driver(major 192) installed
<14>[    4.313575]  (3)[1:init]init: processing action (service.wcn.driver.ready=yes) from (/vendor/etc/init/init.gps_drv.rc:3)
<4>[    4.319472]  (2)[1:init]mtk_stp_GPS_chrdev driver(major 191) installed.
<14>[    4.319764]  (2)[1:init]init: Service 'wmt_loader' (pid 367) exited with status 0
<14>[    4.320099]  (2)[1:init]init: PropSet [gps_drv.ko]=[1] Done
<14>[    4.320194]  (2)[1:init]init: processing action (service.wcn.driver.ready=yes) from (/vendor/etc/init/init.wlan_drv.rc:3)
<4>[    4.321527]  (2)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:wmtd thread starts
<6>[    4.326776]  (1)[1:init][MTK-WIFI] WIFI_init: mtk_wmt_wifi_chrdev driver(major 153) installed
<14>[    4.329399]  (1)[1:init]init: PropSet [sys.boot.reason]=[0] Done
<6>[    4.416581]  (2)[1:init][wlan]initWlan:(INIT INFO) initWlan
<6>[    4.417042]  (2)[1:init][wlan]createWirelessDevice:(INIT INFO) Create wireless device success
<6>[    4.417925]  (2)[1:init][wlan]HifAhbPltmProbe:(INIT INFO) HifAhbPltmProbe
<6>[    4.417949]  (2)[1:init][wlan]HifAhbPltmProbe:(INIT INFO) mtk_wcn_wmt_wlan_reg
<4>[    4.417957]  (2)[1:init][HIF-SDIO][I]mtk_wcn_wmt_wlan_reg:wmt wlan cb register
<14>[    4.418417]  (2)[1:init]init: Command 'insmod /vendor/lib/modules/wlan_drv_${ro.wlan.gen}.ko' action=service.wcn.driver.ready=yes (/vendor/etc/init/init.wlan_drv.rc:5) returned 0 took 88ms.
<14>[    4.419185]  (2)[1:init]init: PropSet [debug.sf.hwc_pid]=[346] Done
<14>[    4.419327]  (2)[1:init]init: processing action (persist.mtk.wcn.coredump.mode=* && service.wcn.driver.ready=yes) from (/vendor/etc/init/init_connectivity.rc:26)
<4>[    4.419522]  (2)[1:init][WMT-DEV][I]wmt_dbg_write:write parameter len = 6
<4>[    4.419522] 
<4>[    4.419533] [WMT-DEV][I]wmt_dbg_write:write parameter data = 0x15 0
<4>[    4.419533] 
 (2)[1:init][WMT-DEV][I]wmt_dbg_write:y = 0x00000000
<4>[    4.419549] 
<4>[    4.419553] [WMT-DEV][I]wmt_dbg_write:x(0x00000015), y(0x00000000), z(0x0000000a)
<4>[    4.419553] 
<4>[    4.419564]  (2)[1:init][STP] mtk_wcn_stp_coredump_flag_ctrl:[I] disable coredump function.
<6>[    4.431260]  (3)[362:boot_logo_updat][DISP]AEE is not enabled, will disable layer 3
<6>[    4.437273]  (3)[362:boot_logo_updat]mtk-tpd: tpd_fb_notifier_callback
<14>[    4.441401]  (2)[1:init]init: Service 'bootlogoupdater' (pid 362) exited with status 0
<4>[    4.528939]  (3)[198:kworker/3:2]Scanner_setup_eint
<4>[    4.528969]  (3)[198:kworker/3:2]Scanner_Close******** 
<4>[    4.528976]  (3)[198:kworker/3:2] @@@kpd_send_Scanner_key_msg slid=1!!
<4>[    4.529328] -(2)[0:swapper/2]Scanner_cur_gpio_state = 0 
<4>[    4.529353] -(2)[0:swapper/2]Scanner_Open******** 
<4>[    4.529362] -(2)[0:swapper/2][Scanner]Scanner set EINT finished, Scanner_irq=25
<4>[    4.529360] -(2)[0:swapper/2] @@@kpd_send_Scanner_key_msg slid=0!!
<4>[    4.529361]  (3)[198:kworker/3:2]Scanner_right_setup_eint
<4>[    4.529373]  (3)[198:kworker/3:2]Scanner_right_Close******** 
<4>[    4.529376]  (3)[198:kworker/3:2] @@@kpd_send_Scanner_right_key_msg slid=1!!
<4>[    4.529389] -(2)[0:swapper/2]------------[ cut here ]------------
<4>[    4.529395] -(2)[0:swapper/2]WARNING: CPU: 2 PID: 0 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/kernel/irq/manage.c:513 __enable_irq+0x4c/0x7c()
<4>[    4.529413] -(2)[0:swapper/2]Unbalanced enable for IRQ 25
<4>[    4.529420] -(2)[0:swapper/2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[    4.529457] -(2)[0:swapper/2]CPU: 2 PID: 0 Comm: swapper/2 Tainted: G        W  O    4.4.95+ #1
<4>[    4.529465] -(2)[0:swapper/2]Hardware name: MT6739CW (DT)
<4>[    4.529473] -(2)[0:swapper/2]Call trace:
<4>[    4.529477] -(2)[0:swapper/2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[    4.529489] -(2)[0:swapper/2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[    4.529498] -(2)[0:swapper/2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[    4.529508] -(2)[0:swapper/2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[    4.529518] -(2)[0:swapper/2][<ffffff800809fb14>] warn_slowpath_fmt+0x5c/0x7c
<4>[    4.529526] -(2)[0:swapper/2][<ffffff80080fe9fc>] __enable_irq+0x4c/0x7c
<4>[    4.529535] -(2)[0:swapper/2][<ffffff80080feabc>] enable_irq+0x90/0xa4
<4>[    4.529542] -(2)[0:swapper/2][<ffffff800872a174>] Scanner_eint_func+0xc8/0x118
<4>[    4.529552] -(2)[0:swapper/2][<ffffff80080fcffc>] handle_irq_event_percpu+0xf0/0x1f4
<4>[    4.529560] -(2)[0:swapper/2][<ffffff80080fd148>] handle_irq_event+0x48/0x78
<4>[    4.529567] -(2)[0:swapper/2][<ffffff8008100940>] handle_level_irq+0xe4/0x108
<4>[    4.529576] -(2)[0:swapper/2][<ffffff80080fc520>] generic_handle_irq+0x18/0x2c
<4>[    4.529584] -(2)[0:swapper/2][<ffffff8008360038>] mtk_eint_irq_handler+0x2c0/0x2cc
<4>[    4.529593] -(2)[0:swapper/2][<ffffff80080fc520>] generic_handle_irq+0x18/0x2c
<4>[    4.529601] -(2)[0:swapper/2][<ffffff80080fc99c>] __handle_domain_irq+0x1f0/0x220
<4>[    4.529609] -(2)[0:swapper/2][<ffffff80080818d0>] gic_handle_irq+0xac/0x180
<4>[    4.529617] -(2)[0:swapper/2]Exception stack(0xffffffc0321bbca0 to 0xffffffc0321bbdd0)
<4>[    4.529627] -(2)[0:swapper/2]bca0: 0000004076fd8000 00000000ffffffff ffffffc07ff54100 ffffffc07ff54100
<4>[    4.529635] -(2)[0:swapper/2]bcc0: 00ffffffffffffff 00000000098976a4 0000000000000888 00000000002851bc
<4>[    4.529643] -(2)[0:swapper/2]bce0: ffffffc0321a6930 ffffffc0321bbe90 00000000000008d0 0000000000000400
<4>[    4.529651] -(2)[0:swapper/2]bd00: 0000000000008400 000000000a16da57 00000000fa83b2da 0000000000000000
<4>[    4.529659] -(2)[0:swapper/2]bd20: ffffff800812b278 0000000000000000 0000000000000000 000000010dad430f
<4>[    4.529667] -(2)[0:swapper/2]bd40: 0000000000000000 ffffffc03005a000 0000000000000000 ffffff8009473af8
<4>[    4.529676] -(2)[0:swapper/2]bd60: 0000000000000000 000000010da7d6d6 ffffff80094b8308 ffffff8008081b40
<4>[    4.529684] -(2)[0:swapper/2]bd80: 0000000000000000 ffffffc0321bbed0 ffffff800880e2b0 ffffffc0321bbed0
<4>[    4.529692] -(2)[0:swapper/2]bda0: ffffff800880e2f0 0000000060000145 ffffff80095c92e8 0000000000000002
<4>[    4.529699] -(2)[0:swapper/2]bdc0: ffffffffffffffff 00000000000001c0
<4>[    4.529712] -(2)[0:swapper/2][Scanner_right]Scanner set EINT finished, Scanner_right_irq=145
<4>[    4.529707] -(2)[0:swapper/2][<ffffff8008084878>] el1_irq+0xb8/0x130
<4>[    4.529720] -(2)[0:swapper/2][<ffffff800880e2f0>] cpuidle_enter_state+0x200/0x250
<4>[    4.529730] -(2)[0:swapper/2][<ffffff800880e378>] cpuidle_enter+0x18/0x20
<4>[    4.529738] -(2)[0:swapper/2][<ffffff80080eaa44>] call_cpuidle+0x48/0x50
<4>[    4.529748] -(2)[0:swapper/2][<ffffff80080ead44>] cpu_startup_entry+0x2f8/0x308
<4>[    4.529756] -(2)[0:swapper/2][<ffffff800808f4e0>] secondary_start_kernel+0x398/0x3dc
<4>[    4.529765] -(2)[0:swapper/2][<0000000040aca03c>] 0x40aca03c
<4>[    4.529773] -(2)[0:swapper/2]---[ end trace e335f74a8dfe3612 ]---
<4>[    4.529785] -(2)[0:swapper/2]Scanner_right_cur_gpio_state = 0 
<4>[    4.529792] -(2)[0:swapper/2]Scanner_right_Open******** 
<4>[    4.529798] -(2)[0:swapper/2] @@@kpd_send_Scanner_right_key_msg slid=0!!
<4>[    4.529806] -(2)[0:swapper/2]------------[ cut here ]------------
<4>[    4.529812] -(2)[0:swapper/2]WARNING: CPU: 2 PID: 0 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/kernel/irq/manage.c:513 __enable_irq+0x4c/0x7c()
<4>[    4.529823] -(2)[0:swapper/2]Unbalanced enable for IRQ 145
<4>[    4.529829] -(2)[0:swapper/2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[    4.529862] -(2)[0:swapper/2]CPU: 2 PID: 0 Comm: swapper/2 Tainted: G        W  O    4.4.95+ #1
<4>[    4.529870] -(2)[0:swapper/2]Hardware name: MT6739CW (DT)
<4>[    4.529876] -(2)[0:swapper/2]Call trace:
<4>[    4.529881] -(2)[0:swapper/2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[    4.529889] -(2)[0:swapper/2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[    4.529898] -(2)[0:swapper/2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[    4.529907] -(2)[0:swapper/2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[    4.529916] -(2)[0:swapper/2][<ffffff800809fb14>] warn_slowpath_fmt+0x5c/0x7c
<4>[    4.529924] -(2)[0:swapper/2][<ffffff80080fe9fc>] __enable_irq+0x4c/0x7c
<4>[    4.529932] -(2)[0:swapper/2][<ffffff80080feabc>] enable_irq+0x90/0xa4
<4>[    4.529939] -(2)[0:swapper/2][<ffffff800872a614>] Scanner_right_eint_func+0xc8/0x118
<4>[    4.529948] -(2)[0:swapper/2][<ffffff80080fcffc>] handle_irq_event_percpu+0xf0/0x1f4
<4>[    4.529956] -(2)[0:swapper/2][<ffffff80080fd148>] handle_irq_event+0x48/0x78
<4>[    4.529963] -(2)[0:swapper/2][<ffffff8008100940>] handle_level_irq+0xe4/0x108
<4>[    4.529971] -(2)[0:swapper/2][<ffffff80080fc520>] generic_handle_irq+0x18/0x2c
<4>[    4.529979] -(2)[0:swapper/2][<ffffff8008360038>] mtk_eint_irq_handler+0x2c0/0x2cc
<4>[    4.529987] -(2)[0:swapper/2][<ffffff80080fc520>] generic_handle_irq+0x18/0x2c
<4>[    4.529995] -(2)[0:swapper/2][<ffffff80080fc99c>] __handle_domain_irq+0x1f0/0x220
<4>[    4.530002] -(2)[0:swapper/2][<ffffff80080818d0>] gic_handle_irq+0xac/0x180
<4>[    4.530010] -(2)[0:swapper/2]Exception stack(0xffffffc0321bbca0 to 0xffffffc0321bbdd0)
<4>[    4.530019] -(2)[0:swapper/2]bca0: 0000004076fd8000 00000000ffffffff ffffffc07ff54100 ffffffc07ff54100
<4>[    4.530027] -(2)[0:swapper/2]bcc0: 00ffffffffffffff 00000000098976a4 0000000000000888 00000000002851bc
<4>[    4.530035] -(2)[0:swapper/2]bce0: ffffffc0321a6930 ffffffc0321bbe90 00000000000008d0 0000000000000400
<4>[    4.530043] -(2)[0:swapper/2]bd00: 0000000000008400 000000000a16da57 00000000fa83b2da 0000000000000000
<4>[    4.530051] -(2)[0:swapper/2]bd20: ffffff800812b278 0000000000000000 0000000000000000 000000010dad430f
<4>[    4.530059] -(2)[0:swapper/2]bd40: 0000000000000000 ffffffc03005a000 0000000000000000 ffffff8009473af8
<4>[    4.530067] -(2)[0:swapper/2]bd60: 0000000000000000 000000010da7d6d6 ffffff80094b8308 ffffff8008081b40
<4>[    4.530075] -(2)[0:swapper/2]bd80: 0000000000000000 ffffffc0321bbed0 ffffff800880e2b0 ffffffc0321bbed0
<4>[    4.530083] -(2)[0:swapper/2]bda0: ffffff800880e2f0 0000000060000145 ffffff80095c92e8 0000000000000002
<4>[    4.530090] -(2)[0:swapper/2]bdc0: ffffffffffffffff 00000000000001c0
<4>[    4.530096] -(2)[0:swapper/2][<ffffff8008084878>] el1_irq+0xb8/0x130
<4>[    4.530103] -(2)[0:swapper/2][<ffffff800880e2f0>] cpuidle_enter_state+0x200/0x250
<4>[    4.530112] -(2)[0:swapper/2][<ffffff800880e378>] cpuidle_enter+0x18/0x20
<4>[    4.530120] -(2)[0:swapper/2][<ffffff80080eaa44>] call_cpuidle+0x48/0x50
<4>[    4.530129] -(2)[0:swapper/2][<ffffff80080ead44>] cpu_startup_entry+0x2f8/0x308
<4>[    4.530137] -(2)[0:swapper/2][<ffffff800808f4e0>] secondary_start_kernel+0x398/0x3dc
<4>[    4.530146] -(2)[0:swapper/2][<0000000040aca03c>] 0x40aca03c
<4>[    4.530153] -(2)[0:swapper/2]---[ end trace e335f74a8dfe3613 ]---
<4>[    4.549989]  (3)[368:wmt_launcher][HIF-SDIO][I]WMT_open:major 190 minor 0 (pid 368)
<4>[    4.550011]  (3)[368:wmt_launcher][HIF-SDIO][I]WMT_open:1st call
<4>[    4.550181]  (3)[368:wmt_launcher][HIF-SDIO][I]WMT_unlocked_ioctl:luncher set STP mode success!
<4>[    4.550199]  (1)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b77490):0-1-2,0,0,2
<4>[    4.550203]  (3)[368:wmt_launcher][STP] mtk_wcn_stp_set_wmt_last_close:[I] set wmt_last_close flag (0)
<3>[    4.550215]  (1)[384:mtk_wmtd][WMT-CORE][E]opfunc_hif_conf(1042):WMT-CORE: WMT HIF info added
<14>[    4.551366]  (1)[1:init]init: PropSet [service.wcn.formeta.ready]=[yes] Done
<11>[    4.730328]  (2)[1:init]init: property_set("ro.sf.lcd_density", "240") failed: property already set
<3>[    4.824200]  (0)[377:vold]BOOTPROF:      4824.198857:vold:decrypt_master_key:END
<14>[    4.878157]  (2)[1:init]init: PropSet [service.sf.present_timestamp]=[1] Done
<6>[    4.879704]  (0)[398:HwBinder:346_1]mtk-tpd: tpd_fb_notifier_callback
<6>[    4.879723]  (0)[398:HwBinder:346_1][DISP][FB Driver] enter late_resume
<6>[    4.879728]  (0)[398:HwBinder:346_1][DISP]primary_display_resume begin
<6>[    4.879732]  (0)[398:HwBinder:346_1][DISP]primary display path is already resume, skip
<6>[    4.879746]  (0)[398:HwBinder:346_1][DISP]skip_update:0
<6>[    4.879751]  (0)[398:HwBinder:346_1][DISP][FB Driver] leave late_resume
<6>[    4.879761]  (0)[398:HwBinder:346_1][DISP]AOD check: succeed to set FB power mode FB_SUSPEND to FB_RESUME
<14>[    4.880464]  (2)[1:init]init: PropSet [service.bootanim.exit]=[0] Done
<14>[    4.882835]  (1)[1:init]init: [PropSet]: pid:364 uid:1000 gid:1003 ctl.start, bootanim
<14>[    4.883429]  (1)[1:init]init: starting service 'bootanim'...
<3>[    4.885104]  (2)[424:SurfaceFlinger:]BOOTPROF:      4885.102703:BOOT_Animation:START
<5>[    4.912959]  (0)[398:HwBinder:346_1][Power/PPM] @ppm_lcmoff_switch: onoff = 1
<6>[    4.912972]  (0)[398:HwBinder:346_1]mtk-tpd: tpd_fb_notifier_callback
<6>[    4.912975]  (0)[398:HwBinder:346_1]mtk-tpd: fb_notify(blank=0)
<6>[    4.912978]  (0)[398:HwBinder:346_1]mtk-tpd: LCD ON Notify
<4>[    4.912984]  (0)[398:HwBinder:346_1][HIF-SDIO][W]wmt_fb_notifier_callback:@@@@@@@@@@wmt enter UNBLANK @@@@@@@@@@@@@@
<4>[    4.913277]  (0)[4:kworker/0:0][HIF-SDIO][I]mtk_wcn_wmt_func_ctrl:wmt-exp: OPID(3) type(9) start
<4>[    4.913305]  (0)[4:kworker/0:0][STP] mtk_wcn_stp_psm_disable:[W] STP Not Ready, Dont do Sleep/Wakeup
<4>[    4.913356]  (2)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b775c8):3-0-9,0,0,0
<4>[    4.913375]  (2)[384:mtk_wmtd][WMT-CONSYS-HW][I]mtk_wcn_consys_hw_pwr_on:CONSYS-HW-PWR-ON, start
<4>[    4.913384]  (2)[384:mtk_wmtd][WMT-CONSYS-HW][W]mtk_wcn_consys_hw_reg_ctrl:CONSYS-HW-REG-CTRL(0x00000001),start
<6>[    4.913441]  (2)[384:mtk_wmtd]ldo vcn33_bt enable
<6>[    4.913781]  (1)[404:VSyncThread_0][DISP]not found session info for session_id:0x00010000,insert ffffff800961aec0 to array index:0
<4>[    4.914039]  (1)[384:mtk_wmtd][WMT-CONSYS-HW][I]mtk_wcn_consys_hw_reg_ctrl:co clock type(1),turn on clk buf
<4>[    4.914472]  (1)[384:mtk_wmtd][WMT-CONSYS-HW][I]consys_hw_vcn28_ctrl:turn on vcn28 for fm/gps usage in co-clock mode
<4>[    4.914495]  (1)[384:mtk_wmtd][WMT-CONSYS-HW][I]mtk_wcn_consys_hw_efuse_paldo_ctrl:turn on vcn28 for efuse usage in co-clock mode
<3>[    4.914531]  (3)[384:mtk_wmtd][WMT-CONSYS-HW][E]polling_consys_chipid(652):Read CONSYS chipId(0x00000000)
<4>[    4.936966]  (3)[384:mtk_wmtd][WMT-CONSYS-HW][I]polling_consys_chipid:retry(8)consys chipId(0x00000699)
<4>[    4.960936]  (1)[384:mtk_wmtd][WMT-CONSYS-HW][W]mtk_wcn_consys_hw_reg_ctrl:CONSYS-HW-REG-CTRL(0x00000001),finish
<4>[    4.960967]  (1)[384:mtk_wmtd][WMT-PLAT][W]wmt_plat_soc_gps_sync_ctrl:host gps sync pin not defined!!!
<4>[    4.961019]  (1)[384:mtk_wmtd][WMT-PLAT][W]wmt_plat_soc_i2s_ctrl:host i2s pin not defined!!!
<4>[    4.961063]  (1)[384:mtk_wmtd][WMT-CONSYS-HW][I]consys_read_irq_info_from_dts:get irq id(294) and irq trigger flag(8) from DT
<4>[    4.961119]  (1)[384:mtk_wmtd][WMT-CONSYS-HW][I]mtk_wcn_consys_hw_pwr_on:CONSYS-HW-PWR-ON, finish(0)
<4>[    4.961847]  (1)[384:mtk_wmtd][WMT-CORE][I]wmt_core_hw_check:get hwcode (chip id) (0x699)
<4>[    4.963632]  (1)[384:mtk_wmtd][WMT-IC][W]mtk_wcn_soc_ver_check:0x699: ic info: SOC_CONSYS.E1 (0x8a00/0x8a00, WMTHWVER:0, patch_ext:_e1)
<14>[    4.987200]  (3)[1:init]init: PropSet [persist.mtk.wcn.patch.version]=[20181022143423a] Done
<14>[    4.990798]  (1)[1:init]init: PropSet [persist.mtk.wcn.patch.version]=[20181022143423a] Done
<4>[    4.997683]  (2)[384:mtk_wmtd][WMT-IC][I]mtk_wcn_soc_patch_dwn:[Patch]BuiltTime = 20181022143423a, HVer = 0x8a00, SVer = 0x8a00, PhVer = 0x00fa,Platform = 1746
<3>[    5.377354]  (0)[377:vold]BOOTPROF:      5377.353627:vold:cryptfs_restart_internal:START
<4>[    5.379929]  (2)[377:vold]EXT4-fs (dm-2): Ignoring removed nomblk_io_submit option
<6>[    5.383600]  (2)[377:vold]EXT4-fs (dm-2): mounted filesystem with ordered data mode. Opts: errors=remount-ro,nomblk_io_submit
<4>[    5.403079]  (0)[384:mtk_wmtd][WMT-IC][W]mtk_wcn_soc_patch_dwn:wmt_core: patch dwn:0 frag(320, 724) ok
<14>[    5.420684]  (0)[377:vold]e2fsck: e2fsck 1.43.3 (04-Sep-2016)
<14>[    5.420684] 
<14>[    5.420740]  (0)[377:vold]e2fsck: data: clean, 5390/573440 files, 184776/2293243 blocks (check in 5 mounts)
<14>[    5.420740] 
<6>[    5.425325]  (1)[377:vold]EXT4-fs (dm-2): mounted filesystem with ordered data mode. Opts: noauto_da_alloc,errors=panic
<14>[    5.426401]  (2)[1:init]init: PropSet [vold.post_fs_data_done]=[0] Done
<5>[    5.427523] -(2)[1:init]random: nonblocking pool is initialized
<14>[    5.428471]  (0)[1:init]init: PropSet [vold.decrypt]=[trigger_post_fs_data] Done
<14>[    5.429963]  (0)[1:init]init: processing action (vold.decrypt=trigger_post_fs_data) from (/init.rc:690)
<14>[    5.430083]  (0)[1:init]init: processing action (vold.decrypt=trigger_post_fs_data) from (/vendor/etc/init/hw/init.mt6739.rc:870)
<3>[    5.430172]  (0)[1:init]BOOTPROF:      5430.170858:INIT:vold.decrypt=trigger_post_fs_data
<14>[    5.430305]  (0)[1:init]init: processing action (post-fs-data) from (/init.rc:393)
<14>[    5.532299]  (2)[1:init]init: starting service 'exec 6 (/system/bin/vdc --wait cryptfs init_user0)'...
<14>[    5.533567]  (2)[1:init]init: SVC_EXEC pid 439 (uid 0 gid 0+0 context default) started; waiting...
<14>[    5.553072]  (2)[1:init]init: Service 'exec 6 (/system/bin/vdc --wait cryptfs init_user0)' (pid 439) exited with status 0 waiting took 0.020000 seconds
<14>[    5.553866]  (2)[1:init]selinux: SELinux: Skipping restorecon_recursive(/data)
<14>[    5.553866] 
<14>[    5.554448]  (2)[1:init]init: starting service 'exec 7 (/system/bin/tzdatacheck /system/usr/share/zoneinfo /data/misc/zoneinfo)'...
<14>[    5.555565]  (2)[1:init]init: SVC_EXEC pid 440 (uid 1000 gid 1000+0 context default) started; waiting...
<14>[    5.570886]  (0)[1:init]init: Service 'exec 7 (/system/bin/tzdatacheck /system/usr/share/zoneinfo /data/misc/zoneinfo)' (pid 440) exited with status 0 waiting took 0.016000 seconds
<14>[    5.571132]  (0)[1:init]init: processing action (post-fs-data) from (/init.usb.rc:6)
<14>[    5.574031]  (0)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.mt6739.rc:150)
<3>[    5.574124]  (0)[1:init]BOOTPROF:      5574.124012:INIT:post-fs-data
<14>[    5.575110]  (0)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/nvcfg)
<14>[    5.575110] 
<14>[    5.577483]  (0)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/nvdata)
<14>[    5.577483] 
<14>[    5.609184]  (1)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.connectivity.rc:3)
<14>[    5.615630]  (2)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.project.rc:7)
<14>[    5.616039]  (2)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.aee.rc:1)
<4>[    5.623538]  (0)[384:mtk_wmtd][WMT-IC][W]mtk_wcn_soc_patch_dwn:wmt_core: patch dwn:0 frag(180, 891) ok
<14>[    5.624055]  (2)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.sensor_1_0.rc:2)
<14>[    5.627507]  (2)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.modem.rc:21)
<3>[    5.627583]  (2)[1:init]BOOTPROF:      5627.582320:post-fs-data: on modem start
<14>[    5.631721]  (2)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/protect_f)
<14>[    5.631721] 
<14>[    5.631824]  (2)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/protect_s)
<14>[    5.631824] 
<14>[    5.631955]  (2)[1:init]init: PropSet [vold.post_fs_data_done]=[1] Done
<14>[    5.632001]  (2)[1:init]init: processing action (post-fs-data) from (/system/etc/init/bootstat.rc:3)
<14>[    5.633179]  (2)[1:init]init: PropSet [vold.decrypt]=[trigger_load_persist_props] Done
<14>[    5.634202]  (2)[1:init]init: PropSet [vold.decrypt]=[trigger_restart_framework] Done
<14>[    5.635462]  (2)[1:init]init: processing action (init.svc.bootanim=running && ro.crypto.type=block && post-fs-data) from (/system/etc/init/bootstat.rc:44)
<14>[    5.636166]  (2)[1:init]init: starting service 'exec 8 (/system/bin/bootstat -r post_decrypt_time_elapsed)'...
<14>[    5.637430]  (2)[1:init]init: SVC_EXEC pid 441 (uid 1000 gid 1007+0 context default) started; waiting...
<4>[    5.650323]  (2)[384:mtk_wmtd][WMT-IC][I]mtk_wcn_soc_sw_init:bt_tssi_from_wifi=0, bt_tssi_target=0
<4>[    5.650349]  (2)[384:mtk_wmtd][WMT-IC][I]wmt_stp_init_epa:epa_mode:0x1
<14>[    5.654784]  (2)[1:init]init: Service 'exec 8 (/system/bin/bootstat -r post_decrypt_time_elapsed)' (pid 441) exited with status 0 waiting took 0.019000 seconds
<14>[    5.655028]  (2)[1:init]init: processing action (post-fs-data) from (/system/etc/init/mobile_log_d.rc:1)
<14>[    5.657424]  (3)[1:init]init: processing action (post-fs-data) from (/system/etc/init/sn.rc:1)
<14>[    5.657767]  (3)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/android.hardware.audio@2.0-service-mediatek.rc:1)
<14>[    5.658372]  (3)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hostapd.android.rc:9)
<14>[    5.658950]  (3)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/init.cccifsd.rc:5)
<14>[    5.659120]  (3)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/protect_f)
<14>[    5.659120] 
<14>[    5.659204]  (3)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/protect_s)
<14>[    5.659204] 
<14>[    5.659244]  (3)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/init.cccimdinit.rc:4)
<14>[    5.662055]  (3)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/init.wod.rc:1)
<14>[    5.665999]  (3)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/mtk_agpsd.rc:1)
<14>[    5.667203]  (3)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/statusd.rc:1)
<14>[    5.668620]  (3)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/vendor.mediatek.hardware.power@1.1-service.rc:1)
<14>[    5.675561]  (3)[1:init]init: processing action (vold.decrypt=trigger_load_persist_props) from (/init.rc:685)
<14>[    5.690273]  (3)[1:init]init: PropSet [persist.sys.pq.mdp.color.idx]=[0] Done
<14>[    5.694100]  (3)[1:init]init: PropSet [persist.sys.pq.adl.idx]=[0] Done
<14>[    5.697670]  (3)[1:init]init: PropSet [persist.sys.pq.iso.shp.en]=[2] Done
<14>[    5.702921]  (3)[1:init]init: PropSet [persist.sys.pq.ultrares.en]=[2] Done
<14>[    5.706871]  (3)[1:init]init: PropSet [persist.sys.pq.mdp.color.dbg]=[1] Done
<14>[    5.710868]  (2)[1:init]init: PropSet [persist.sys.pq.log.en]=[0] Done
<14>[    5.715427]  (0)[1:init]init: PropSet [persist.atm.mdmode]=[normal] Done
<14>[    5.721071]  (0)[1:init]init: PropSet [persist.sys.pq.hdr.en]=[1] Done
<14>[    5.725089]  (1)[1:init]init: PropSet [persist.sys.pq.mdp.ccorr.en]=[2] Done
<14>[    5.730066]  (3)[1:init]init: PropSet [persist.sys.pq.mdp.dre.en]=[2] Done
<14>[    5.735366]  (3)[1:init]init: PropSet [persist.sys.bluelight.default]=[128] Done
<14>[    5.739305]  (3)[1:init]init: PropSet [persist.sys.pq.shp.idx]=[2] Done
<14>[    5.744978]  (1)[1:init]init: PropSet [persist.sys.locale]=[zh-CN] Done
<14>[    5.749579]  (1)[1:init]init: PropSet [persist.sys.language]=[] Done
<14>[    5.751834]  (1)[1:init]init: PropSet [persist.sys.country]=[] Done
<14>[    5.754143]  (1)[1:init]init: PropSet [persist.sys.localevar]=[] Done
<14>[    5.759867]  (1)[1:init]init: PropSet [persist.sys.dalvik.vm.lib.2]=[libart.so] Done
<14>[    5.765454]  (3)[1:init]init: PropSet [persist.radio.sim.opid]=[0] Done
<14>[    5.770123]  (3)[1:init]init: PropSet [persist.radio.simswitch]=[1] Done
<14>[    5.773956]  (1)[1:init]init: PropSet [persist.radio.lastsim1_iccid]=[null] Done
<14>[    5.778363]  (3)[1:init]init: PropSet [persist.radio.c_capability_slot]=[1] Done
<14>[    5.784050]  (0)[1:init]init: PropSet [persist.radio.raf1]=[225786] Done
<14>[    5.789138]  (3)[1:init]init: PropSet [persist.radio.last_iccid_sim1]=[N/A] Done
<14>[    5.793710]  (1)[1:init]init: PropSet [persist.radio.rilj_nw_type1]=[-1] Done
<14>[    5.798024]  (0)[1:init]init: PropSet [persist.sys.usb.config]=[adb] Done
<14>[    5.801715]  (1)[1:init]init: PropSet [persist.sys.webview.vmsize]=[125701040] Done
<4>[    5.804120]  (2)[0:swapper/2]Power/swap DP: No enter --- SODI3: No enter --- SODI: No enter --- 
<14>[    5.805817]  (0)[1:init]init: PropSet [persist.radio.airplane.mode.on]=[false] Done
<14>[    5.812408]  (1)[1:init]init: PropSet [persist.radio.cellular_ps_reg]=[0] Done
<6>[    5.814590]  (2)[271:kworker/u8:4]ldo vmch enable
<6>[    5.814836]  (0)[271:kworker/u8:4]ldo vmc enable
<6>[    5.815038]  (1)[271:kworker/u8:4][msdc]msdc1 power on
<14>[    5.818071]  (0)[1:init]init: PropSet [persist.radio.volte_state]=[1] Done
<14>[    5.824436]  (2)[1:init]init: PropSet [persist.radio.sim.mode]=[1] Done
<14>[    5.828559]  (2)[1:init]init: PropSet [persist.radio.data.iccid]=[] Done
<14>[    5.831902]  (2)[1:init]init: PropSet [persist.service.stk.shutdown]=[0] Done
<14>[    5.836746]  (2)[1:init]init: PropSet [persist.netd.stable_secret]=[7a33:721f:52b9:6f6a:f5:e1d7::] Done
<6>[    5.841173]  (1)[271:kworker/u8:4][msdc]msdc1 -> !!! Set<260KHz> Source<191999KHz> -> sclk<259KHz> timing<0> mode<0> div<185> hs400_div_dis<0>
<14>[    5.841338]  (0)[1:init]init: PropSet [persist.radio.airplane_mode_on]=[0] Done
<6>[    5.842362]  (1)[271:kworker/u8:4][msdc]msdc1 -> !!! Set<400KHz> Source<191999KHz> -> sclk<399KHz> timing<0> mode<0> div<120> hs400_div_dis<0>
<14>[    5.846597]  (0)[1:init]init: PropSet [persist.sys.bootpackage]=[2] Done
<14>[    5.851614]  (0)[1:init]init: PropSet [persist.net.wifi_priority]=[true] Done
<11>[    5.852278]  (2)[1:init]init: property_set("ro.persistent_properties.ready", "true") failed: property already set
<14>[    5.852346]  (2)[1:init]init: Command 'load_persist_props' action=vold.decrypt=trigger_load_persist_props (/init.rc:686) returned 0 took 176ms.
<14>[    5.852840]  (2)[1:init]init: starting service 'logd-reinit'...
<14>[    5.854157]  (2)[1:init]init: processing action (vold.decrypt=trigger_load_persist_props) from (/vendor/etc/init/hw/init.aee.rc:18)
<14>[    5.854269]  (2)[1:init]init: Sending signal 9 to service 'aee_aedv' (pid 321) process group...
<6>[    5.857041]  (0)[429:kworker/0:2][msdc]msdc1 -> Card insert<1> Block bad card<0>, mrq<          (null)> claimed<0> pwrcnt<0> <- msdc_ops_get_cd() : L<4522> PID<kworker/0:2><0x1ad>
<5>[    5.857515]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<52> MSDC_INT_CMDTMO Arg<0x00000c00>
<5>[    5.858022]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<52> MSDC_INT_CMDTMO Arg<0x80000c08>
<14>[    5.859877]  (2)[1:init]init: Successfully killed process cgroup uid 0 pid 321 in 5ms
<14>[    5.860330]  (2)[1:init]init: Service 'aee_aedv' (pid 321) killed by signal 9
<14>[    5.860697]  (2)[1:init]init: Sending signal 9 to service 'aee_aedv64' (pid 322) process group...
<14>[    5.866412]  (2)[1:init]init: Successfully killed process cgroup uid 0 pid 322 in 5ms
<14>[    5.866708]  (2)[1:init]init: Service 'aee_aedv64' (pid 322) killed by signal 9
<14>[    5.866990]  (2)[1:init]init: Sending signal 9 to service 'aee_aed' (pid 319) process group...
<5>[    5.872265]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<8> MSDC_INT_CMDTMO Arg<0x000001aa>
<6>[    5.872348]  (0)[429:kworker/0:2][msdc]msdc1 -> XXX CMD<8><0x1aa> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/0:2><0x1ad>
<14>[    5.872555]  (2)[1:init]init: Successfully killed process cgroup uid 0 pid 319 in 5ms
<5>[    5.872794]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<14>[    5.872839]  (2)[1:init]init: Service 'aee_aed' (pid 319) killed by signal 9
<5>[    5.873298]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<14>[    5.873325]  (2)[1:init]init: Sending signal 9 to service 'aee_aed64' (pid 320) process group...
<5>[    5.873815]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    5.874314]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    5.874817]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    5.874890]  (0)[429:kworker/0:2][msdc]msdc1 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/0:2><0x1ad>
<5>[    5.875331]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    5.875400]  (0)[429:kworker/0:2][msdc]msdc1 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/0:2><0x1ad>
<5>[    5.875841]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    5.875909]  (0)[429:kworker/0:2][msdc]msdc1 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/0:2><0x1ad>
<30>[    5.876267]  (1)[314:logd.daemon]logd.daemon: reinit
<5>[    5.876349]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    5.876412]  (0)[429:kworker/0:2][msdc]msdc1 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/0:2><0x1ad>
<5>[    5.876856]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<1> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    5.876984]  (0)[429:kworker/0:2][msdc]msdc1 -> XXX CMD<1><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/0:2><0x1ad>
<6>[    5.877120]  (0)[429:kworker/0:2]ldo vmch disable
<6>[    5.877146]  (0)[429:kworker/0:2]ldo vmc disable
<6>[    5.877157]  (0)[429:kworker/0:2][msdc]msdc1 power off
<14>[    5.879008]  (1)[1:init]init: Successfully killed process cgroup uid 0 pid 320 in 5ms
<14>[    5.879292]  (1)[1:init]init: Service 'aee_aed64' (pid 320) killed by signal 9
<14>[    5.879524]  (1)[1:init]init: Service 'logd-reinit' (pid 445) exited with status 0
<14>[    5.881165]  (1)[1:init]init: processing action (vold.decrypt=trigger_restart_framework) from (/init.rc:698)
<11>[    5.881247]  (1)[1:init]init: ExecStart(update_verifier): Service not found
<14>[    5.881534]  (1)[1:init]init: PropSet [log.tag]=[I] Done
<11>[    5.881680]  (1)[1:init]init: cannot find '/system/bin/install-recovery.sh', disabling 'flash_recovery': No such file or directory
<11>[    5.881726]  (1)[1:init]init: cannot find '/system/bin/cmmbsp', disabling 'cmmb': No such file or directory
<11>[    5.881766]  (1)[1:init]init: cannot find '/vendor/bin/msensord', disabling 'msensord': No such file or directory
<14>[    5.882475]  (1)[1:init]init: starting service 'thermalloadalgod'...
<14>[    5.884539]  (1)[1:init]init: starting service 'fuelgauged'...
<31>[    5.885057]  (1)[314:logd.daemon]logd: logd no log reader, set log level to INFO!
<11>[    5.886092]  (1)[1:init]init: cannot find '/vendor/bin/poad', disabling 'poad': No such file or directory
<11>[    5.886226]  (1)[1:init]init: cannot find '/system/vendor/bin/goodixfingerprintd', disabling 'goodixfpd': No such file or directory
<11>[    5.886295]  (1)[1:init]init: cannot find '/system/bin/fingerprintd', disabling 'fingerprintd': No such file or directory
<14>[    5.887090]  (1)[1:init]init: starting service 'mnld'...
<11>[    5.888334]  (1)[1:init]init: cannot find '/vendor/bin/permission_check', disabling 'permission_check': No such file or directory
<14>[    5.889350]  (1)[1:init]init: starting service 'zygote'...
<6>[    5.889378]  (0)[429:kworker/0:2]ldo vmch enable
<6>[    5.889602]  (0)[429:kworker/0:2]ldo vmc enable
<6>[    5.889798]  (0)[429:kworker/0:2][msdc]msdc1 power on
<14>[    5.891181]  (1)[1:init]init: starting service 'zygote_secondary'...
<14>[    5.893378]  (1)[1:init]init: starting service 'audioserver'...
<14>[    5.895373]  (1)[1:init]init: starting service 'batterywarning'...
<14>[    5.897556]  (1)[1:init]init: starting service 'cameraserver'...
<14>[    5.898781]  (2)[448:init]init: Created socket '/dev/socket/mnld', mode 660, user 1021, group 1000
<14>[    5.899698]  (1)[1:init]init: starting service 'drm'...
<14>[    5.902113]  (1)[1:init]init: starting service 'thermald'...
<14>[    5.904342]  (1)[1:init]init: starting service 'vtservice'...
<14>[    5.907242]  (1)[1:init]init: starting service 'installd'...
<14>[    5.909530]  (1)[1:init]init: starting service 'keystore'...
<14>[    5.911868]  (1)[1:init]init: starting service 'mediadrm'...
<6>[    5.913219]  (0)[429:kworker/0:2][msdc]msdc1 -> !!! Set<260KHz> Source<191999KHz> -> sclk<259KHz> timing<0> mode<0> div<185> hs400_div_dis<0>
<14>[    5.914054]  (1)[1:init]init: starting service 'mediaextractor'...
<6>[    5.914459]  (0)[429:kworker/0:2][msdc]msdc1 -> !!! Set<300KHz> Source<191999KHz> -> sclk<299KHz> timing<0> mode<0> div<160> hs400_div_dis<0>
<14>[    5.916433]  (1)[1:init]init: starting service 'mediametrics'...
<14>[    5.918479]  (2)[449:init]init: Created socket '/dev/socket/zygote', mode 660, user 0, group 1000
<14>[    5.918479]  (1)[1:init]init: starting service 'media'...
<14>[    5.920054]  (2)[450:init]init: Created socket '/dev/socket/zygote_secondary', mode 660, user 0, group 1000
<14>[    5.920876]  (1)[1:init]init: starting service 'met_log_d'...
<14>[    5.923332]  (1)[1:init]init: starting service 'mobile_log_d'...
<11>[    5.925573]  (2)[453:init]init: couldn't write 453 to /dev/cpuset/camera-daemon/tasks: No such file or directory
<14>[    5.925933]  (1)[1:init]init: starting service 'netd'...
<14>[    5.928404]  (1)[1:init]init: starting service 'netdiag'...
<5>[    5.929570]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<52> MSDC_INT_CMDTMO Arg<0x00000c00>
<5>[    5.930259]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<52> MSDC_INT_CMDTMO Arg<0x80000c08>
<14>[    5.930827]  (1)[1:init]init: starting service 'PPLAgent'...
<14>[    5.933006]  (1)[1:init]init: starting service 'storaged'...
<14>[    5.935221]  (1)[1:init]init: starting service 'wificond'...
<14>[    5.937439]  (1)[1:init]init: starting service 'mediacodec'...
<14>[    5.939969]  (1)[1:init]init: starting service 'sensors-hal-1-0'...
<14>[    5.942266]  (1)[1:init]init: starting service 'camerahalserver'...
<14>[    5.945005]  (1)[1:init]init: starting service 'fuelgauged_nvram'...
<14>[    5.947298]  (1)[1:init]init: starting service 'thermal'...
<5>[    5.949519]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<8> MSDC_INT_CMDTMO Arg<0x000001aa>
<6>[    5.949620]  (0)[429:kworker/0:2][msdc]msdc1 -> XXX CMD<8><0x1aa> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/0:2><0x1ad>
<14>[    5.949862]  (1)[1:init]init: starting service 'thermal_manager'...
<5>[    5.950215]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    5.950882]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    5.951541]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<14>[    5.952044]  (1)[1:init]init: starting service 'ipsec_mon'...
<5>[    5.952202]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    5.953853]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    5.953961]  (0)[429:kworker/0:2][msdc]msdc1 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/0:2><0x1ad>
<5>[    5.954553]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<14>[    5.954565]  (1)[1:init]init: starting service 'lbs_hidl_service'...
<6>[    5.954639]  (0)[429:kworker/0:2][msdc]msdc1 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/0:2><0x1ad>
<5>[    5.955225]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    5.955320]  (0)[429:kworker/0:2][msdc]msdc1 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/0:2><0x1ad>
<5>[    5.955905]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    5.955989]  (0)[429:kworker/0:2][msdc]msdc1 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/0:2><0x1ad>
<5>[    5.956575]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<1> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    5.956669]  (0)[429:kworker/0:2][msdc]msdc1 -> XXX CMD<1><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/0:2><0x1ad>
<6>[    5.956703]  (0)[429:kworker/0:2]ldo vmch disable
<6>[    5.956720]  (0)[429:kworker/0:2]ldo vmc disable
<6>[    5.956732]  (0)[429:kworker/0:2][msdc]msdc1 power off
<14>[    5.956819]  (1)[1:init]init: starting service 'agpsd'...
<14>[    5.959374]  (1)[1:init]init: starting service 'NvRAMAgent'...
<14>[    5.961783]  (1)[1:init]init: starting service 'nvram_daemon'...
<14>[    5.964410]  (1)[1:init]init: starting service 'sysenv_daemon'...
<14>[    5.966813]  (1)[1:init]init: starting service 'gnss_service'...
<6>[    5.969576]  (0)[429:kworker/0:2]ldo vmch enable
<14>[    5.970040]  (1)[1:init]init: starting service 'pq-2-0'...
<6>[    5.970340]  (0)[429:kworker/0:2]ldo vmc enable
<6>[    5.971043]  (0)[429:kworker/0:2][msdc]msdc1 power on
<14>[    5.972874]  (1)[1:init]init: starting service 'wifi2agps'...
<14>[    5.974277]  (1)[1:init]init: Command 'class_start main' action=vold.decrypt=trigger_restart_framework (/init.rc:701) returned 0 took 92ms.
<14>[    5.975371]  (1)[1:init]init: starting service 'gatekeeperd'...
<4>[    5.975703]  (2)[384:mtk_wmtd][WMT-CONSYS-HW][I]consys_hw_vcn28_ctrl:turn off vcn28 for fm/gps usage in co-clock mode
<4>[    5.975730]  (2)[384:mtk_wmtd][WMT-CONSYS-HW][I]mtk_wcn_consys_hw_efuse_paldo_ctrl:turn off vcn28 for efuse usage in co-clock mode
<4>[    5.975741]  (2)[384:mtk_wmtd][WMT-IC][I]wmt_stp_init_coex:ctrl GET_WMT_CONF ok(0xffffff8000b76ba8)
<4>[    5.976018]  (2)[384:mtk_wmtd][WMT-IC][I]mtk_wcn_soc_sw_init:co-clock enabled.
<4>[    5.976708]  (2)[384:mtk_wmtd][STP] mtk_wcn_stp_psm_enable:[W] STP Not Ready, Dont do Sleep/Wakeup
<4>[    5.976743]  (2)[384:mtk_wmtd][WMT-CORE][I]wmt_core_dump_func_state:[AF FUNC ON]status(b:0 f:0 g:0 w:0 lpbk:2 coredump:0 wmt:2 ant:0 sd1:0 sd2:0 stp:0)
<4>[    5.976805]  (2)[380:mtk_stp_psm][STP-PSM] [I]_stp_psm_proc: pOp(ffffff8000b74630):1
<4>[    5.976809]  (0)[4:kworker/0:0][HIF-SDIO][I]mtk_wcn_wmt_func_ctrl:OPID(3) type(9) ok
<14>[    5.978310]  (1)[1:init]init: starting service 'program_binary'...
<14>[    5.980699]  (1)[1:init]init: starting service 'sn'...
<14>[    5.983139]  (1)[1:init]init: starting service 'tombstoned'...
<14>[    5.986216]  (1)[1:init]init: starting service 'netdagent'...
<14>[    5.987701]  (1)[1:init]init: processing action (vold.decrypt=trigger_restart_framework) from (/vendor/etc/init/hw/init.mt6739.rc:881)
<3>[    5.987834]  (1)[1:init]BOOTPROF:      5987.833167:INIT:vold.decrypt=trigger_restart_framework
<14>[    5.989279]  (1)[1:init]init: starting service 'start_modem'...
<11>[    5.990926]  (1)[1:init]init: cannot find '/vendor/bin/msensord', disabling 'msensord': No such file or directory
<11>[    5.991081]  (1)[1:init]init: cannot find '/vendor/bin/permission_check', disabling 'permission_check': No such file or directory
<14>[    5.991195]  (1)[1:init]init: processing action (vold.decrypt=trigger_restart_framework) from (/vendor/etc/init/hw/init.mt6739.rc:1243)
<14>[    5.991438]  (1)[1:init]init: processing action (vold.decrypt=trigger_restart_framework) from (/vendor/etc/init/md_ctrl.rc:7)
<14>[    5.991512]  (1)[1:init]init: processing action (vold.decrypt=trigger_restart_framework) from (/vendor/etc/init/sysenv_daemon.rc:4)
<6>[    5.993090] -(0)[0:swapper/0]mcdi cpu: 0, 0, 0, 0, cluster : 0, pause = 0, multi core = 0, residency = 0, last core = 0, avail cpu = 000f, cluster = 0001, enabled = 1, max_s_state = 5, system_idle_hint = 00000000
<6>[    5.993090] 
<6>[    5.997218]  (0)[429:kworker/0:2][msdc]msdc1 -> !!! Set<260KHz> Source<191999KHz> -> sclk<259KHz> timing<0> mode<0> div<185> hs400_div_dis<0>
<4>[    6.001006]  (2)[380:mtk_stp_psm][STP-PSM] [I]_stp_psm_proc: pOp(ffffff8000b74768):0
<4>[    6.001070]  (2)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b77700):7-0-0,ffffff8000ae0e50,0,0
<5>[    6.013640]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<52> MSDC_INT_CMDTMO Arg<0x00000c00>
<5>[    6.014418]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<52> MSDC_INT_CMDTMO Arg<0x80000c08>
<5>[    6.030311]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<8> MSDC_INT_CMDTMO Arg<0x000001aa>
<6>[    6.030451]  (0)[429:kworker/0:2][msdc]msdc1 -> XXX CMD<8><0x1aa> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/0:2><0x1ad>
<5>[    6.031500]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    6.032278]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    6.034992]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    6.035774]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    6.036544]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    6.036645]  (0)[429:kworker/0:2][msdc]msdc1 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/0:2><0x1ad>
<5>[    6.037320]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    6.037434]  (0)[429:kworker/0:2][msdc]msdc1 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/0:2><0x1ad>
<5>[    6.048297]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    6.048417]  (0)[429:kworker/0:2][msdc]msdc1 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/0:2><0x1ad>
<5>[    6.049094]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    6.049204]  (0)[429:kworker/0:2][msdc]msdc1 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/0:2><0x1ad>
<5>[    6.050038]  (0)[429:kworker/0:2][msdc][msdc_command_resp_polling]: msdc1 CMD<1> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    6.050151]  (0)[429:kworker/0:2][msdc]msdc1 -> XXX CMD<1><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/0:2><0x1ad>
<6>[    6.050185]  (0)[429:kworker/0:2]ldo vmch disable
<6>[    6.050201]  (0)[429:kworker/0:2]ldo vmc disable
<6>[    6.050215]  (0)[429:kworker/0:2][msdc]msdc1 power off
<5>[    6.050221]  (0)[429:kworker/0:2][msdc][msdc_set_power_mode]: msdc1 power off at clk 260000hz set block_bad_card = 1
<14>[    6.055901]  (0)[465:init]init: Created socket '/dev/socket/netd', mode 660, user 0, group 1000
<11>[    6.061950]  (0)[472:init]init: couldn't write 472 to /dev/cpuset/camera-daemon/tasks: No such file or directory
<14>[    6.070663]  (0)[465:init]init: Created socket '/dev/socket/dnsproxyd', mode 660, user 0, group 3003
<14>[    6.071905]  (0)[465:init]init: Created socket '/dev/socket/mdns', mode 660, user 0, group 1000
<14>[    6.072836]  (0)[465:init]init: Created socket '/dev/socket/fwmarkd', mode 660, user 0, group 3003
<14>[    6.140874]  (3)[479:init]init: Created socket '/dev/socket/agpsd', mode 660, user 1021, group 1000
<14>[    6.141956]  (3)[479:init]init: Created socket '/dev/socket/agpsd2', mode 660, user 1021, group 3003
<14>[    6.142717]  (3)[479:init]init: Created socket '/dev/socket/agpsd3', mode 660, user 1021, group 3003
<14>[    6.145852]  (3)[489:init]init: Created socket '/dev/socket/tombstoned_crash', mode 666, user 1000, group 1000
<14>[    6.146783]  (3)[489:init]init: Created socket '/dev/socket/tombstoned_intercept', mode 666, user 1000, group 1000
<14>[    6.147654]  (3)[489:init]init: Created socket '/dev/socket/tombstoned_java_trace', mode 666, user 1000, group 1000
<14>[    6.180523]  (1)[1:init]init: PropSet [vold.encryption.type]=[default] Done
<5>[    6.486621]  (0)[447:fuelgauged][fg_res] FG_DAEMON_CMD_SET_DAEMON_PID = 447 (first launch)
<4>[    6.501850] -(1)[447:fuelgauged]mt6357_get_auxadc_value: 12 callbacks suppressed
<4>[    6.521429]  (0)[447:fuelgauged]=====FG=====::  battery_current =-524 
<5>[    6.521455]  (0)[447:fuelgauged][mt6357_get_auxadc_value] ch_idx = 2, channel = 3, bat_cur = 524, reg_val = 0x5f1, adc_result = 668
<4>[    6.545012]  (3)[447:fuelgauged]=====FG=====::  battery_current =-524 
<5>[    6.545039]  (3)[447:fuelgauged][mt6357_get_auxadc_value] ch_idx = 2, channel = 3, bat_cur = 524, reg_val = 0x5f1, adc_result = 668
<4>[    6.565031]  (3)[447:fuelgauged]=====FG=====::  battery_current =-524 
<5>[    6.565058]  (3)[447:fuelgauged][mt6357_get_auxadc_value] ch_idx = 2, channel = 3, bat_cur = 524, reg_val = 0x5f1, adc_result = 668
<5>[    6.565402]  (3)[447:fuelgauged]MTK_FG: [fg_compensate_battery_voltage_from_low] h_percent=[10023,9913],high=91,fg_volt_withIR=34353 > ori_voltage=34000
<5>[    6.565484]  (3)[447:fuelgauged]MTK_FG: [fg_compensate_battery_voltage_from_low]fg_volt=35202,91,IR=-1196,orig_v:34000,+IR=34006,percent=9983,
<4>[    6.580964]  (3)[447:fuelgauged]=====FG=====::  battery_current =-524 
<5>[    6.580993]  (3)[447:fuelgauged][mt6357_get_auxadc_value] ch_idx = 2, channel = 3, bat_cur = 524, reg_val = 0x5f1, adc_result = 668
<5>[    6.581327]  (3)[447:fuelgauged]MTK_FG: [fg_compensate_battery_voltage_from_low] h_percent=[10023,9913],high=91,fg_volt_withIR=34353 > ori_voltage=34000
<5>[    6.581430]  (3)[447:fuelgauged]MTK_FG: [fg_compensate_battery_voltage_from_low]fg_volt=35202,91,IR=-1196,orig_v:34000,+IR=34006,percent=9983,
<4>[    6.596993]  (3)[447:fuelgauged]=====FG=====::  battery_current =-524 
<5>[    6.597021]  (3)[447:fuelgauged][mt6357_get_auxadc_value] ch_idx = 2, channel = 3, bat_cur = 524, reg_val = 0x5f1, adc_result = 668
<14>[    6.634187]  (1)[1:init]init: PropSet [net.ims.ipsec.version]=[2.0] Done
<3>[    6.637110]  (3)[377:vold]BOOTPROF:      6637.109630:vold:cryptfs_restart_internal:END
<14>[    6.662234]  (0)[1:init]init: PropSet [debug.met.running]=[0] Done
<14>[    6.669663]  (0)[1:init]init: PropSet [debug.met_log_d.version]=[V6.0.0] Done
<3>[    6.670837]  (2)[449:zygote64]BOOTPROF:      6670.836092:boot_progress_start
<14>[    6.671732]  (0)[1:init]init: PropSet [debug.met_log_d.user]=[shell] Done
<11>[    6.708175]  (3)[474:fuelgauged_nvra]NVRAM: fgauge_nvram: service.nvram_init=
<6>[    6.716003]  (3)[466:netdiag]capability: warning: `netdiag' uses 32-bit capabilities (legacy support in use)
<14>[    6.726436]  (3)[1:init]init: PropSet [debug.mtklog.netlog.Running]=[0] Done
<14>[    6.807542]  (3)[1:init]init: PropSet [debug.pq.shp.en]=[2] Done
<14>[    6.809875]  (3)[1:init]init: PropSet [debug.pq.dshp.en]=[2] Done
<3>[    6.823128]  (1)[482:sysenv_daemon]ENV_USER_INIT!
<5>[    6.852205]  (2)[476:thermal_manager][Thermal/TZ/BTS] mtkts_bts_prepare_table table_num=7
<5>[    6.852355]  (2)[476:thermal_manager][Thermal/TZ/BTSMDPA] mtkts_btsmdpa_prepare_table table_num=7
<6>[    6.852541]  (2)[476:thermal_manager][Thermal/TZ/CPU]tscpu_write_atm_setting input 0 2000 10 15 1 750 0 240 0
<6>[    6.852560]  (2)[476:thermal_manager][Thermal/TZ/CPU]tscpu_write_dtm_setting applied 0 2000 10 15 1 750 1111 240 351
<6>[    6.852642]  (2)[476:thermal_manager][Thermal/TZ/CPU]tscpu_write_atm_setting input 1 1000 10 15 1 540 0 150 0
<6>[    6.852660]  (2)[476:thermal_manager][Thermal/TZ/CPU]tscpu_write_dtm_setting applied 1 1000 10 15 1 540 1111 150 351
<6>[    6.852742]  (2)[476:thermal_manager][Thermal/TZ/CPU]tscpu_write_atm_setting input 2 500 25 25 1 380 0 150 0
<6>[    6.852755]  (2)[476:thermal_manager][Thermal/TZ/CPU]tscpu_write_dtm_setting applied 2 500 25 25 1 380 1111 150 351
<6>[    6.856208]  (2)[476:thermal_manager][Thermal/TZ/CPU]tscpu_write_ctm input 2 85000 70000 53000 55000 75000 63000 482500 7500 393000 6000 500 500 13500 -1
<6>[    6.857817]  (2)[476:thermal_manager][Thermal/TZ/CPU]tscpu_unbind unbinding OK
<6>[    6.857887]  (2)[476:thermal_manager][Thermal/TZ/CPU]tscpu_unbind unbinding OK
<6>[    6.857904]  (2)[476:thermal_manager][Thermal/TZ/CPU]tscpu_unbind unbinding OK
<6>[    6.857924]  (2)[476:thermal_manager][Thermal/TZ/CPU]tscpu_unbind unbinding OK
<6>[    6.859141]  (2)[476:thermal_manager][Thermal/TZ/CPU]tscpu_bind binding OK, 0
<6>[    6.859221]  (2)[476:thermal_manager][Thermal/TZ/CPU]tscpu_bind binding OK, 4
<6>[    6.859246]  (2)[476:thermal_manager][Thermal/TZ/CPU]tscpu_bind binding OK, 3
<6>[    6.859266]  (2)[476:thermal_manager][Thermal/TZ/CPU]tscpu_bind binding OK, 2
<6>[    6.859325]  (2)[476:thermal_manager][Thermal/TZ/CPU]tscpu_bind binding OK, 1
<14>[    6.861433]  (2)[468:init]init: Opened file '/d/mmc0/mmc0:0001/ext_csd', flags 0
<4>[    6.893527]  (2)[380:mtk_stp_psm][STP-PSM] [I]_stp_psm_proc: pOp(ffffff8000b748a0):1
<4>[    6.893636]  (2)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b77970):7-0-2,ffffff8000ae0e50,0,0
<4>[    6.893678]  (2)[476:thermal_manager][STP-PSM] [I]_stp_psm_do_wait: STP is waiting state for ACT, i=1, state = 3
<4>[    6.916986]  (2)[476:thermal_manager][STP-PSM] [I]_stp_psm_do_wait: +Total waits for ACT takes 23307 usec
<4>[    6.917046]  (3)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b77838):15-0-1,0,0,0
<4>[    6.917972]  (3)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b77aa8):15-0-2,0,0,0
<4>[    6.919218]  (0)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b77be0):15-0-3,0,0,0
<4>[    6.920405]  (2)[476:thermal_manager][HIF-SDIO][I]wmt_dev_tm_temp_query:[Thermal] current_temp = 0x1b
<4>[    6.921482]  (2)[476:thermal_manager][Thermal/TC/bcct]chrlmt_set_limit ffffff80096f5ea8 -1 -1 5000
<4>[    6.921506]  (3)[438:kworker/u9:4][Thermal/TC/bcct]chrlmt_set_limit_handler -1 -1
<5>[    6.921513]  (3)[438:kworker/u9:4]charger_manager_set_input_current_limit: dev:mtk-cooler-bcct idx:0 en:-1
<5>[    6.921525]  (3)[438:kworker/u9:4]force:0 thermal:-1,-1 pe4:-1,-1,0 setting:0 0 type:0 usb_unlimited:0 usbif:0 usbsm:0 aicl:-1
<4>[    6.944972]  (2)[380:mtk_stp_psm][STP-PSM] [I]_stp_psm_proc: pOp(ffffff8000b74ff0):0
<4>[    6.945042]  (2)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b77d18):7-0-0,ffffff8000ae0e50,0,0
<3>[    6.957132]  (3)[479:mtk_agpsd]Dump cpuinfo
<4>[    6.960991]  (0)[438:kworker/u9:4]=====FG=====::	battery_current =-641 battery_vol_original=3787
<4>[    6.961020]  (0)[438:kworker/u9:4]=====FG=====:: battery_vol =3851 
<36>[    6.965564]  (0)[323:logd.auditd]type=1400 audit(1550035168.666:4): avc: denied { read } for pid=468 comm="storaged" path="/sys/kernel/debug/mmc0/mmc0:0001/ext_csd" dev="debugfs" ino=1067 scontext=u:r:storaged:s0 tcontext=u:object_r:debugfs_mmc:s0 tclass=file permissive=0
<4>[    6.977017]  (0)[438:kworker/u9:4]=====FG=====::  soc =53 
<4>[    6.993015]  (0)[438:kworker/u9:4]=====FG=====::  battery_current =-641 
<4>[    7.008995]  (2)[438:kworker/u9:4]fg_27542 :  196  11  tempreture =3012 
<4>[    7.009023]  (2)[438:kworker/u9:4]=====FG=====: temperature:280 
<4>[    7.025058]  (0)[438:kworker/u9:4]DLCP bat_vol=3851,  temperature=280  
<4>[    7.025083]  (0)[438:kworker/u9:4] ===CC_value from battery temprature=2000000
<4>[    7.025090]  (0)[438:kworker/u9:4]charger type:0 
<4>[    7.025095]  (0)[438:kworker/u9:4]DLCP ccurrent from charge type        = 0
<4>[    7.025101]  (0)[438:kworker/u9:4]DLCP ccurrent from battery temprature = 2000000
<4>[    7.025108]  (0)[438:kworker/u9:4]bq2429x_set_input_current_limit curr=0
<4>[    7.026896]  (0)[438:kworker/u9:4]yqj ~~~~bq2429x_set_ichg curr=0 
<4>[    7.026920]  (0)[438:kworker/u9:4]bq2429x_set_chargecurrent curr=512
<5>[    7.028723]  (0)[438:kworker/u9:4]charger_manager_set_charging_current_limit: dev:mtk-cooler-bcct idx:0 en:-1
<5>[    7.028751]  (0)[438:kworker/u9:4]force:0 thermal:-1,-1 pe4:-1,-1,0 setting:0 0 type:0 usb_unlimited:0 usbif:0 usbsm:0 aicl:-1
<4>[    7.061019]  (3)[438:kworker/u9:4]=====FG=====::	battery_current =-641 battery_vol_original=3787
<4>[    7.061055]  (3)[438:kworker/u9:4]=====FG=====:: battery_vol =3851 
<4>[    7.077018]  (0)[438:kworker/u9:4]=====FG=====::  soc =53 
<4>[    7.093017]  (0)[438:kworker/u9:4]=====FG=====::  battery_current =-641 
<4>[    7.109005]  (0)[438:kworker/u9:4]fg_27542 :  196  11  tempreture =3012 
<4>[    7.109034]  (0)[438:kworker/u9:4]=====FG=====: temperature:280 
<4>[    7.124992]  (3)[238:charger_thread]=====FG=====::  battery_current =-641 
<4>[    7.140969]  (3)[238:charger_thread]=====FG=====::  battery_current =-641 
<5>[    7.152142]  (2)[238:charger_thread][MTS_ADC] OLD = 0x39b9, NOW = 0x398f, CNT = 0
<4>[    7.156989]  (3)[438:kworker/u9:4]DLCP bat_vol=3851,  temperature=280  
<4>[    7.157018]  (3)[438:kworker/u9:4] ===CC_value from battery temprature=2000000
<4>[    7.157025]  (3)[438:kworker/u9:4]charger type:0 
<4>[    7.157030]  (3)[438:kworker/u9:4]DLCP ccurrent from charge type        = 0
<4>[    7.157036]  (3)[438:kworker/u9:4]DLCP ccurrent from battery temprature = 2000000
<4>[    7.157043]  (3)[438:kworker/u9:4]bq2429x_set_input_current_limit curr=0
<4>[    7.158876]  (3)[438:kworker/u9:4]yqj ~~~~bq2429x_set_ichg curr=0 
<4>[    7.158904]  (3)[438:kworker/u9:4]bq2429x_set_chargecurrent curr=512
<5>[    7.159184]  (3)[238:charger_thread]Vbat=3696,Ibat=641,I=517,VChr=0,T=24,Soc=0:0,CT:0:0 hv:1 pd:0:0
<6>[    7.160684]  (0)[438:kworker/u9:4][charger_manager_enable_high_voltage_charging] already set: 0 1
<5>[    7.164245]  (0)[238:charger_thread]tmp:24 (jeita:0 sm:0 cv:0 en:0) (sm:1) en:1 c:0 s:0 ov:0 1 1
<14>[    7.176498]  (3)[1:init]init: PropSet [persist.sys.pq.mdp.color.idx]=[0] Done
<14>[    7.179296]  (3)[1:init]init: PropSet [service.nvram_init]=[Ready] Done
<4>[    7.180977]  (0)[238:charger_thread]=====FG=====::  battery_current =-641 
<14>[    7.181862]  (3)[1:init]init: Service 'thermal_manager' (pid 476) exited with status 0
<14>[    7.204469]  (0)[1:init]init: PropSet [debug.MB.running]=[0] Done
<14>[    7.207258]  (0)[1:init]init: [PropSet]: pid:469 uid:1010 gid:1010 ctl.stop, wpa_supplicant
<3>[    7.209184]  (3)[358:ccci_mdinit]BOOTPROF:      7209.183170:ccci_md1: decpyt ready
<6>[    7.209299]  (3)[358:ccci_mdinit][ccci1/fsm]monitor node open by ccci_mdinit
<6>[    7.209787]  (3)[358:ccci_mdinit][ccci1/chr]port ccci_ipc_5 open with flag 20002 by ccci_mdinit
<4>[    7.211696]  (0)[238:charger_thread]=====FG=====::  battery_current =-641 
<5>[    7.224766]  (3)[238:charger_thread]Vbat=3710,Ibat=641,I=285,VChr=0,T=24,Soc=0:0,CT:0:0 hv:1 pd:0:0
<5>[    7.234129]  (2)[238:charger_thread]tmp:24 (jeita:0 sm:0 cv:0 en:0) (sm:1) en:1 c:0 s:0 ov:0 1 1
<3>[    7.287770]  (3)[448:mnld]Dump cpuinfo
<14>[    7.437481]  (3)[1:init]init: PropSet [persist.sys.pq.adl.idx]=[0] Done
<14>[    7.439253]  (3)[1:init]init: [PropSet]: pid:469 uid:1010 gid:1010 ctl.stop, hostapd
<6>[    7.485923]  (0)[358:ccci_mdinit][ccci1/fsm]CCCI_IOC_RELOAD_MD_TYPE: 0x5a00003f
<3>[    7.486016]  (0)[358:ccci_mdinit]BOOTPROF:      7486.016478:ccci_md1: reset
<5>[    7.529677]  (2)[447:fuelgauged]MTK_FG: [GM3_data] soc:3566 fg_c_soc:2811 fg_v_soc:3566 ui_soc:3175 vc_diff:-755 vc_mode 0 VBAT 37870 T:[25 V 25 C 24] D0_C 10000 D0_V 9738 CAR[c:-19990 v:-17260] Q:[27965 27965 27805 27805] aging 10000 bat_cycle 0 Trk[0(0):0:0] UI[1:0] Chr[1:9583:0] pseudo1 -92  DC_ratio 100 dodinit[8][0] Iavg:-900,dis[0 0 0]
<5>[    7.529867]  (2)[447:fuelgauged][fg_res] FG_DAEMON_CMD_GET_NVRAM_FAIL_STATUS = 0
<4>[    7.532534] -(2)[447:fuelgauged]mt6357_get_auxadc_value: 20 callbacks suppressed
<6>[    7.538260]  (0)[554:ccci_mdinit][ccci1/ipc]Update fail
<14>[    7.546418]  (2)[1:init]init: PropSet [persist.sys.pq.iso.shp.en]=[2] Done
<14>[    7.548333]  (2)[1:init]init: PropSet [debug.MB.realpath]=[/data/log_temp/boot/] Done
<4>[    7.548980]  (2)[447:fuelgauged]=====FG=====::  battery_current =-641 
<5>[    7.549005]  (2)[447:fuelgauged][mt6357_get_auxadc_value] ch_idx = 2, channel = 3, bat_cur = 641, reg_val = 0x5f1, adc_result = 668
<5>[    7.549323] -(2)[447:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[0] = {5aa, 255, 8}
<5>[    7.549353] -(2)[447:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[0] = {5aa, 255, 8}
<5>[    7.549432] -(2)[447:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[0] = {5aa, 255, 8}
<5>[    7.549442]  (2)[447:fuelgauged][fgauge_read_RTC_boot_status] spare3 0xa0 0xa0
<14>[    7.556767]  (2)[1:init]init: PropSet [mtk.md1.status]=[reset] Done
<6>[    7.557230]  (3)[358:ccci_mdinit][ccci1/fsm]CCCI_IOC_GET_MD_TYPE: 12!
<14>[    7.562560]  (2)[1:init]init: processing action (mtk.md1.status=reset) from (/vendor/etc/init/hw/init.mt6739.rc:1237)
<4>[    7.568992]  (3)[447:fuelgauged]=====FG=====::  battery_current =-641 
<5>[    7.569020]  (3)[447:fuelgauged][mt6357_get_auxadc_value] ch_idx = 2, channel = 3, bat_cur = 641, reg_val = 0x5f1, adc_result = 668
<5>[    7.569226]  (3)[447:fuelgauged][read_hw_ocv_6357_power_on_rdy] 0x5721 pon_rdy 0
<5>[    7.569248]  (3)[447:fuelgauged]charger_manager_get_zcv zcv:0 ret:-524
<5>[    7.569272]  (3)[447:fuelgauged][read_hw_ocv] g_fg_is_charger_exist 1 _hw_ocv_chgin_rdy 0
<5>[    7.569279]  (3)[447:fuelgauged][read_hw_ocv] _hw_ocv 42915 _sw_ocv 38378 now_thr 300
<5>[    7.569286]  (3)[447:fuelgauged][read_hw_ocv] _hw_ocv 38378 _hw_ocv_src 1 _prev_hw_ocv 42915 _prev_hw_ocv_src 3 _flag_unreliable 0
<5>[    7.569469]  (3)[447:fuelgauged][read_boot_battery_plug_out_status] rtc_invalid 0 plugout 1 bat_plug_out_time 31 sp3:0xa0 pl:1 1
<5>[    7.569720]  (3)[447:fuelgauged][read_boot_battery_plug_out_status] rtc_invalid 0 plugout 1 bat_plug_out_time 31 sp3:0xa0 pl:1 1
<5>[    7.569792] -(3)[447:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[0] = {5aa, 255, 8}
<5>[    7.570046]  (3)[447:fuelgauged]MTK_FG: dod_init_relocation_flow: hwVersion:1000 pl_charger:1 swocv_oldocv_diff:800
<5>[    7.570199]  (3)[447:fuelgauged]MTK_FG: dod_init_swocv_oldocv_comparing: hwVersion:1000 pl_charger:1 swocv_oldocv_diff:800
<6>[    7.582508]  (2)[519:mtk_agpsd][ccci1/chr]port ttyC2 open with flag 20802 by mtk_agpsd
<6>[    7.582799]  (2)[519:mtk_agpsd][ccci1/chr]write error done on ttyC2, l=16 r=-19
<4>[    7.588984]  (3)[447:fuelgauged]=====FG=====::  battery_current =-641 
<5>[    7.589012]  (3)[447:fuelgauged][mt6357_get_auxadc_value] ch_idx = 2, channel = 3, bat_cur = 641, reg_val = 0x5f1, adc_result = 668
<6>[    7.592664]  (2)[519:mtk_agpsd][ccci1/chr]write error done on ttyC2, l=44 r=-19
<14>[    7.594001]  (2)[1:init]init: PropSet [persist.atm.mdmode]=[normal] Done
<14>[    7.595379]  (2)[1:init]init: processing action (mtk.md1.status=reset) from (/vendor/etc/init/init.bip.rc:7)
<6>[    7.615179]  (2)[519:mtk_agpsd][ccci1/chr]write error done on ttyC2, l=44 r=-19
<3>[    7.615221]  (0)[462:mediaserver]Dump cpuinfo
<3>[    7.653935]  (1)[450:app_process32]Dump cpuinfo
<14>[    7.693197]  (2)[1:init]init: PropSet [persist.sys.pq.ultrares.en]=[2] Done
<14>[    7.693381]  (2)[1:init]init: processing action (mtk.md1.status=reset) from (/vendor/etc/init/init.volte_imsm_93.rc:12)
<14>[    7.694331]  (2)[1:init]init: PropSet [ftrace.buffer.log]=[bsp] Done
<14>[    7.695027]  (2)[1:init]init: PropSet [ril.active.md]=[12] Done
<14>[    7.695398]  (2)[1:init]init: processing action (mtk.md1.status=reset) from (/vendor/etc/init/init.wod.rc:20)
<14>[    7.732571]  (2)[1:init]init: processing action (ftrace.buffer.log=bsp) from (/system/etc/init/mobile_log_d.rc:24)
<5>[    7.744229] -(3)[447:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[0] = {5aa, 255, 8}
<5>[    7.744263] -(3)[447:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[0] = {5aa, 255, 8}
<5>[    7.744674]  (3)[447:fuelgauged][fg_res] FG_DAEMON_CMD_SET_BATTERY_CYCLE_THRESHOLD = 27805
<14>[    7.745438]  (2)[1:init]init: starting service 'bsplogstart'...
<5>[    7.747724]  (3)[447:fuelgauged][fg_res] FG_DAEMON_CMD_SET_FG_BAT_INT1_GAP = 139 car:-12
<5>[    7.750830]  (3)[447:fuelgauged][fg_res][fg_bat_int2] FG_DAEMON_CMD_SET_FG_BAT_INT2_HT_GAP = 126
<5>[    7.757092]  (3)[447:fuelgauged][fg_res][fg_bat_int2] FG_DAEMON_CMD_SET_FG_BAT_INT2_LT_GAP = 156
<14>[    7.764053]  (2)[1:init]init: PropSet [persist.sys.pq.mdp.color.dbg]=[1] Done
<14>[    7.789470]  (2)[1:init]init: [PropSet]: pid:358 uid:1000 gid:1001 ctl.start, ccci_fsd
<3>[    7.789816]  (3)[358:ccci_mdinit]BOOTPROF:      7789.814479:ccci_md1: bootup
<14>[    7.797499]  (2)[1:init]init: PropSet [persist.sys.pq.log.en]=[0] Done
<14>[    7.799328]  (2)[1:init]init: PropSet [mtk.md1.status]=[bootup] Done
<6>[    7.800545]  (2)[358:ccci_mdinit][ccci1/chr]port ccci_ccb_ctrl open with flag 20002 by ccci_mdinit
<6>[    7.800588]  (2)[358:ccci_mdinit][ccci1/shm]ccb_configs_len: 20
<6>[    7.800756]  (2)[358:ccci_mdinit][ccci1/shm]find ccb port ccci_ccb_dhl for user1!
<6>[    7.800802]  (2)[358:ccci_mdinit][ccci1/chr]remap control addr:0x72018000 len:4096  map-len:4096
<6>[    7.800819]  (2)[358:ccci_mdinit][ccci1/chr]remap succeed 72018, 0x72018000 -> 0xebae2000
<4>[    7.800984]  (3)[447:fuelgauged]=====FG=====::  battery_current =-646 
<5>[    7.801000]  (3)[447:fuelgauged][mt6357_get_auxadc_value] ch_idx = 2, channel = 3, bat_cur = 646, reg_val = 0x5f1, adc_result = 668
<6>[    7.801323]  (2)[358:ccci_mdinit][ccci1/chr]port ccci_ccb_ctrl close rx_len=0 empty=1, clear_cnt=0, drop=0
<6>[    7.801347]  (2)[358:ccci_mdinit][ccci1/pot]critical user check: 0x1
<6>[    7.801431]  (2)[358:ccci_mdinit][ccci1/chr]port ccci_ccb_ctrl open with flag 20002 by ccci_mdinit
<6>[    7.801459]  (2)[358:ccci_mdinit][ccci1/shm]ccb_configs_len: 20
<6>[    7.801513]  (2)[358:ccci_mdinit][ccci1/shm]find ccb port ccci_ccb_md_monitor for user2!
<6>[    7.801555]  (2)[358:ccci_mdinit][ccci1/chr]remap control addr:0x72018000 len:4096  map-len:4096
<6>[    7.801570]  (2)[358:ccci_mdinit][ccci1/chr]remap succeed 72018, 0x72018000 -> 0xebae2000
<6>[    7.801648]  (2)[358:ccci_mdinit][ccci1/chr]port ccci_ccb_ctrl close rx_len=0 empty=1, clear_cnt=0, drop=0
<6>[    7.801672]  (2)[358:ccci_mdinit][ccci1/pot]critical user check: 0x1
<6>[    7.801747]  (2)[358:ccci_mdinit][ccci1/chr]port ccci_ccb_ctrl open with flag 20002 by ccci_mdinit
<6>[    7.801772]  (2)[358:ccci_mdinit][ccci1/shm]ccb_configs_len: 20
<6>[    7.801825]  (2)[358:ccci_mdinit][ccci1/shm]find ccb port ccci_ccb_meta for user3!
<6>[    7.801869]  (2)[358:ccci_mdinit][ccci1/chr]remap control addr:0x72018000 len:4096  map-len:4096
<6>[    7.801881]  (2)[358:ccci_mdinit][ccci1/chr]remap succeed 72018, 0x72018000 -> 0xebae2000
<6>[    7.801953]  (2)[358:ccci_mdinit][ccci1/chr]port ccci_ccb_ctrl close rx_len=0 empty=1, clear_cnt=0, drop=0
<6>[    7.801975]  (2)[358:ccci_mdinit][ccci1/pot]critical user check: 0x1
<6>[    7.802013]  (2)[358:ccci_mdinit][ccci1/fsm]MD start ioctl called by ccci_mdinit
<6>[    7.802035]  (2)[358:ccci_mdinit][ccci1/fsm]command 1 is appended 1 from ccci_fsm_ioctl
<6>[    7.802083]  (2)[162:ccci_fsm1][ccci1/fsm]command 1 process
<6>[    7.802099]  (2)[162:ccci_fsm1][ccci1/pot]ready to reset MD in normal mode
<5>[    7.802119]  (2)[162:ccci_fsm1][VcoreFS] kicker: KIR_APCCCI, opp: 0, dvfs_opp: 0, sw_opp: 3, kr opp: -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, -1, -1, -1, 
<5>[    7.802145]  (2)[162:ccci_fsm1][VcoreFS] opp: 0, vcore: 1150000 <= 1150000, fddr: 1344000 <= 1333000 [O][O]
<5>[    7.802162] -(2)[162:ccci_fsm1][VcoreFS] [spm_trigger_dvfs] fix: 0, opp: 0, vcore: 0xc200000, emi: 0x111001, md: 0x0
<6>[    7.802178]  (2)[162:ccci_fsm1][ccci1/fsm]md_state change from 0 to 2
<4>[    7.817009]  (2)[447:fuelgauged]=====FG=====::  battery_current =-646 
<5>[    7.817036]  (2)[447:fuelgauged][mt6357_get_auxadc_value] ch_idx = 2, channel = 3, bat_cur = 646, reg_val = 0x5f1, adc_result = 668
<5>[    7.817669]  (2)[447:fuelgauged][fg_res] FG_DAEMON_CMD_SET_KERNEL_SOC = 3567 36 2812 3567 2808 3567, type:4
<14>[    7.820313]  (2)[1:init]init: PropSet [persist.sys.pq.hdr.en]=[1] Done
<14>[    7.823582]  (2)[1:init]init: PropSet [debug.pq.adl.dbg]=[0] Done
<4>[    7.832988]  (3)[447:fuelgauged]=====FG=====::  soc =53 
<14>[    7.834163]  (2)[1:init]init: PropSet [debug.pq.hdr.dbg]=[0] Done
<5>[    7.842138]  (1)[447:fuelgauged][fg_res] FG_DAEMON_CMD_SET_CON0_SOC = 3617
<5>[    7.842265]  (1)[447:fuelgauged]MTK_FG: [FGADC_intr_end][INTR_Initialize]soc:3567 fg_c_soc:2808 fg_v_soc:3567 ui_soc:3175 vc_diff:-759 vc_mode 0 VBAT 38382 T:[24 V 24 C 24] D0_C 2812 D0_V 3567 Q:[27805 27805 27805 27805] aging 10000 bat_cycle 0 Trk[0:0:0] UI[0:0] Chr[0:0:0] pseudo1 0 DC_ratio 100
<14>[    7.856376]  (2)[1:init]init: PropSet [persist.sys.pq.mdp.ccorr.en]=[2] Done
<4>[    7.857626]  (1)[51:kworker/1:1]fg_27542 :  196  11  tempreture =3012 
<4>[    7.857650]  (1)[51:kworker/1:1]=====FG=====: temperature:280 
<14>[    7.867297]  (2)[1:init]init: PropSet [persist.sys.pq.mdp.dre.en]=[2] Done
<14>[    7.869758]  (2)[1:init]init: PropSet [debug.pq.dre.dbg]=[0] Done
<14>[    7.871636]  (2)[1:init]init: PropSet [debug.pq.acaltm.dbg]=[0] Done
<14>[    7.884636]  (2)[1:init]init: PropSet [debug.pq.dredriver.dbg]=[0] Done
<4>[    7.888972]  (1)[51:kworker/1:1]fg_27542 :  196  11  tempreture =3012 
<4>[    7.889002]  (1)[51:kworker/1:1]=====FG=====: temperature:280 
<14>[    7.898452]  (2)[1:init]init: PropSet [debug.pq.dre.demowin.x]=[536805376] Done
<14>[    7.901027]  (2)[1:init]init: PropSet [debug.pq.dredriver.blk]=[0] Done
<14>[    7.909147]  (2)[1:init]init: PropSet [debug.pq.dre.isp.tuning]=[0] Done
<4>[    7.921080]  (1)[51:kworker/1:1]=====FG=====::  soc =53 
<14>[    7.922043]  (2)[1:init]init: PropSet [debug.pq.cz.isp.tuning]=[0] Done
<4>[    7.937168]  (1)[51:kworker/1:1]=====FG=====::  battery_current =-646 
<4>[    7.969038]  (1)[51:kworker/1:1]=====FG=====::	battery_current =-646 battery_vol_original=3777
<4>[    7.969066]  (1)[51:kworker/1:1]=====FG=====:: battery_vol =3841 
<14>[    7.977591]  (1)[1:init]init: PropSet [persist.sys.bluelight.default]=[128] Done
<4>[    7.985936]  (1)[51:kworker/1:1]fg_27542 :  196  11  tempreture =3012 
<4>[    7.985972]  (1)[51:kworker/1:1]=====FG=====: temperature:280 
<14>[    7.996723]  (1)[1:init]init: PropSet [persist.sys.pq.shp.idx]=[2] Done
<4>[    8.017006]  (2)[356:healthd]=====FG=====::  soc =53 
<6>[    8.039489]  (2)[162:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800b428000, buf_size=213032,buflen=213032,rx_size=81920,tx_size=131072,ctr_len=40
<6>[    8.039703]  (2)[162:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800b428000)=0xee0000ee ee0000ee
<6>[    8.039715]  (2)[162:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800b45c024)=0xff0000ff ff0000ff
<6>[    8.039726]  (2)[162:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800b428008
<4>[    8.048999]  (1)[356:healthd]=====FG=====::	battery_current =-646 battery_vol_original=3777
<4>[    8.049027]  (1)[356:healthd]=====FG=====:: battery_vol =3841 
<6>[    8.053386]  (2)[162:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800b45c028, buf_size=122920,buflen=122920,rx_size=81920,tx_size=40960,ctr_len=40
<6>[    8.053573]  (2)[162:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800b45c028)=0xee0000ee ee0000ee
<6>[    8.053588]  (2)[162:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800b47a04c)=0xff0000ff ff0000ff
<6>[    8.053600]  (2)[162:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800b45c030
<14>[    8.061939]  (1)[1:init]init: PropSet [debug.MB.realpath]=[/data/log_temp/boot/] Done
<4>[    8.065012]  (2)[356:healthd]=====FG=====::  battery_current =-646 
<6>[    8.066298]  (2)[162:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800b47a050, buf_size=49192,buflen=49192,rx_size=40960,tx_size=8192,ctr_len=40
<6>[    8.066375]  (2)[162:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800b47a050)=0xee0000ee ee0000ee
<6>[    8.066387]  (2)[162:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800b486074)=0xff0000ff ff0000ff
<6>[    8.066398]  (2)[162:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800b47a058
<3>[    8.077750]  (3)[454:drmserver]Dump cpuinfo
<6>[    8.078235]  (0)[162:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800b486078, buf_size=122920,buflen=122920,rx_size=81920,tx_size=40960,ctr_len=40
<6>[    8.078380]  (0)[162:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800b486078)=0xee0000ee ee0000ee
<6>[    8.078392]  (0)[162:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800b4a409c)=0xff0000ff ff0000ff
<6>[    8.078403]  (0)[162:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800b486080
<4>[    8.081021]  (0)[356:healthd]fg_27542 :  196  11  tempreture =3012 
<4>[    8.081044]  (0)[356:healthd]=====FG=====: temperature:280 
<6>[    8.097200]  (0)[162:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800b4a40a0, buf_size=41000,buflen=41000,rx_size=20480,tx_size=20480,ctr_len=40
<6>[    8.097265]  (0)[162:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800b4a40a0)=0xee0000ee ee0000ee
<6>[    8.097277]  (0)[162:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800b4ae0c4)=0xff0000ff ff0000ff
<6>[    8.097288]  (0)[162:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800b4a40a8
<12>[    8.097674]  (2)[356:healthd]healthd: battery l=53 v=3841 t=28.0 h=2 st=3 c=-646 chg=
<6>[    8.105110]  (0)[162:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800b4ae0c8, buf_size=41000,buflen=41000,rx_size=20480,tx_size=20480,ctr_len=40
<6>[    8.105176]  (0)[162:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800b4ae0c8)=0xee0000ee ee0000ee
<6>[    8.105188]  (0)[162:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800b4b80ec)=0xff0000ff ff0000ff
<6>[    8.105199]  (0)[162:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800b4ae0d0
<6>[    8.113148]  (0)[162:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800b4b80f0, buf_size=131112,buflen=131112,rx_size=65536,tx_size=65536,ctr_len=40
<6>[    8.113302]  (0)[162:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800b4b80f0)=0xee0000ee ee0000ee
<6>[    8.113314]  (0)[162:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800b4d8114)=0xff0000ff ff0000ff
<6>[    8.113325]  (0)[162:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800b4b80f8
<6>[    8.131466]  (0)[162:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800b4d8118, buf_size=40,buflen=40,rx_size=0,tx_size=0,ctr_len=40
<6>[    8.131492]  (0)[162:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800b4d8118)=0xee0000ee ee0000ee
<6>[    8.131503]  (0)[162:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800b4d813c)=0xff0000ff ff0000ff
<6>[    8.131514]  (0)[162:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800b4d8120
<6>[    8.149133]  (2)[162:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800b4d8400, buf_size=24616,buflen=24616,rx_size=12288,tx_size=12288,ctr_len=40
<6>[    8.149194]  (2)[162:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800b4d8400)=0xee0000ee ee0000ee
<6>[    8.149207]  (2)[162:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800b4de424)=0xff0000ff ff0000ff
<6>[    8.149218]  (2)[162:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800b4d8408
<6>[    8.149230]  (2)[162:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800b4de428, buf_size=65576,buflen=65576,rx_size=32768,tx_size=32768,ctr_len=40
<6>[    8.149312]  (2)[162:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800b4de428)=0xee0000ee ee0000ee
<6>[    8.149323]  (2)[162:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800b4ee44c)=0xff0000ff ff0000ff
<6>[    8.149334]  (2)[162:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800b4de430
<6>[    8.149345]  (2)[162:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800b4ee450, buf_size=16424,buflen=16424,rx_size=8192,tx_size=8192,ctr_len=40
<6>[    8.149377]  (2)[162:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800b4ee450)=0xee0000ee ee0000ee
<6>[    8.149388]  (2)[162:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800b4f2474)=0xff0000ff ff0000ff
<6>[    8.149399]  (2)[162:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800b4ee458
<6>[    8.149409]  (2)[162:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800b4f2478, buf_size=40,buflen=40,rx_size=0,tx_size=0,ctr_len=40
<6>[    8.149422]  (2)[162:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800b4f2478)=0xee0000ee ee0000ee
<6>[    8.149433]  (2)[162:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800b4f249c)=0xff0000ff ff0000ff
<6>[    8.149443]  (2)[162:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800b4f2480
<6>[    8.149454]  (2)[162:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800b4f24a0, buf_size=40,buflen=40,rx_size=0,tx_size=0,ctr_len=40
<6>[    8.149466]  (2)[162:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800b4f24a0)=0xee0000ee ee0000ee
<6>[    8.149477]  (2)[162:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800b4f24c4)=0xff0000ff ff0000ff
<6>[    8.149487]  (2)[162:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800b4f24a8
<6>[    8.149498]  (2)[162:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800b4f24c8, buf_size=40,buflen=40,rx_size=0,tx_size=0,ctr_len=40
<6>[    8.149510]  (2)[162:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800b4f24c8)=0xee0000ee ee0000ee
<6>[    8.149521]  (2)[162:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800b4f24ec)=0xff0000ff ff0000ff
<6>[    8.149531]  (2)[162:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800b4f24d0
<6>[    8.149542]  (2)[162:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800b4f24f0, buf_size=16424,buflen=16424,rx_size=8192,tx_size=8192,ctr_len=40
<6>[    8.149570]  (2)[162:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800b4f24f0)=0xee0000ee ee0000ee
<6>[    8.149581]  (2)[162:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800b4f6514)=0xff0000ff ff0000ff
<6>[    8.149591]  (2)[162:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800b4f24f8
<6>[    8.149602]  (2)[162:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800b4f6518, buf_size=40,buflen=40,rx_size=0,tx_size=0,ctr_len=40
<6>[    8.149614]  (2)[162:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800b4f6518)=0xee0000ee ee0000ee
<6>[    8.149625]  (2)[162:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800b4f653c)=0xff0000ff ff0000ff
<6>[    8.149635]  (2)[162:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800b4f6520
<6>[    8.150194]  (2)[162:ccci_fsm1][ccci1/mcd]ccci_set_clk_cg: on=1
<6>[    8.151399]  (2)[162:ccci_fsm1][ccci1/cif]md_ccif_sram_reset
<6>[    8.151449]  (2)[162:ccci_fsm1][ccci1/cif]md_ccif_switch_ringbuf
<6>[    8.151467]  (2)[162:ccci_fsm1][ccci1/cif]md_ccif_reset_queue
<6>[    8.151482]  (2)[162:ccci_fsm1][ccci1/cif]md_ccif_switch_ringbuf
<6>[    8.151492]  (2)[162:ccci_fsm1][ccci1/cif]md_ccif_reset_queue
<3>[    8.151582]  (2)[162:ccci_fsm1]vmd1_pmic_setting_on vcore vosel = 0x65, da_vosel = 0x65
<5>[    8.151883]  (2)[162:ccci_fsm1][VcoreFS] mdsrclkena_control (1)(0xc200000)
<6>[    8.173123]  (2)[162:ccci_fsm1][ccci1/cldma]cldma_reset from md_cd_start
<6>[    8.173154]  (2)[162:ccci_fsm1][ccci1/cldma]cldma_start from md_cd_start
<7>[    8.177111]  (2)[638:sh][ftrace]event 'signal_deliver' is enabled
<7>[    8.177145]  (2)[638:sh][ftrace]event 'signal_generate' is enabled
<4>[    8.219556]  (0)[617:HwBinder:337_1]mtk_pcm_dl1_hardware.buffer_bytes_max = 36864 mPlaybackDramState = 0
<4>[    8.219801]  (0)[617:HwBinder:337_1]mtk_soc_pcm_dl1_close
<4>[    8.220543]  (0)[617:HwBinder:337_1]mtk_capture_pcm_close
<4>[    8.226014]  (0)[617:HwBinder:337_1]mtk_voice_pcm_open(), stream(0)
<4>[    8.227304]  (0)[617:HwBinder:337_1]mtk_voice_close(), stream(0)
<4>[    8.227375]  (0)[617:HwBinder:337_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[    8.227385]  (0)[617:HwBinder:337_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<3>[    8.227446]  (0)[617:HwBinder:337_1][AudioError] , user count < 0
<3>[    8.227455]  (0)[617:HwBinder:337_1][AudioError] , user count < 0
<4>[    8.228152]  (0)[617:HwBinder:337_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[    8.228185]  (0)[617:HwBinder:337_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<4>[    8.232201]  (0)[617:HwBinder:337_1]mtk_voice_pcm_open(), stream(1)
<4>[    8.232290]  (0)[617:HwBinder:337_1]mtk_voice_close(), stream(1)
<4>[    8.233716]  (0)[617:HwBinder:337_1]mtk_uldlloopback_open runtime rate = 0 channels = 0
<4>[    8.234248]  (0)[617:HwBinder:337_1]mtk_uldlloopbackpcm_close
<3>[    8.234281]  (0)[617:HwBinder:337_1][AudioError] , user count < 0
<4>[    8.234769]  (0)[617:HwBinder:337_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[    8.234792]  (0)[617:HwBinder:337_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<3>[    8.234802]  (0)[617:HwBinder:337_1][AudioError] , user count < 0
<4>[    8.234817]  (0)[617:HwBinder:337_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[    8.234823]  (0)[617:HwBinder:337_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<4>[    8.235119]  (0)[617:HwBinder:337_1]mtk_uldlloopback_open runtime rate = 0 channels = 0
<4>[    8.235195]  (0)[617:HwBinder:337_1]mtk_uldlloopbackpcm_close
<3>[    8.235204]  (0)[617:HwBinder:337_1]mtk_uldlloopbackpcm_close  with SNDRV_PCM_STREAM_CAPTURE
<6>[    8.236595]  (1)[51:kworker/1:1][ccci1/cif]md_ccif_sram_rx_work:dk_pkg=ffffff800a69e100, md_featrue=ffffff800a69e110
<6>[    8.236676]  (1)[51:kworker/1:1][ccci1/cif]md_ccif_sram_rx_work:ccci_port_recv_skb ret=0
<6>[    8.236830]  (0)[170:ccci_ctrl][ccci1/fsm]control message 0x0,0x5555FFFF
<6>[    8.236871]  (0)[170:ccci_ctrl][ccci1/fsm]event 1 is appended from ccci_fsm_recv_control_packet
<4>[    8.241120]  (0)[617:HwBinder:337_1]mtk_pcm_mrgrx_open
<4>[    8.241147]  (0)[617:HwBinder:337_1]mtk_pcm_mrgrx_open runtime rate = 0 channels = 0 substream->pcm->device = 5
<4>[    8.241155]  (0)[617:HwBinder:337_1]mtk_pcm_mrgrx_open return
<4>[    8.241229]  (0)[617:HwBinder:337_1]mtk_pcm_mrgrx_close
<3>[    8.241241]  (0)[617:HwBinder:337_1][AudioError] , user count < 0
<4>[    8.241248]  (0)[617:HwBinder:337_1][AudioWarn] GeneralSampleRateTransform() sampleRate(0) is invalid, use 44.1kHz!!!
<4>[    8.241255]  (0)[617:HwBinder:337_1]SetMrgI2SEnable bEnable = 0
<3>[    8.241262]  (0)[617:HwBinder:337_1][AudioError] , user count < 0
<4>[    8.241274]  (0)[617:HwBinder:337_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[    8.241282]  (0)[617:HwBinder:337_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<4>[    8.241440]  (0)[617:HwBinder:337_1]mtk_pcm_mrgrx_open
<4>[    8.241462]  (0)[617:HwBinder:337_1]mtk_pcm_mrgrx_open runtime rate = 0 channels = 0 substream->pcm->device = 5
<4>[    8.241469]  (0)[617:HwBinder:337_1]mtk_pcm_mrgrx_open return
<4>[    8.241519]  (0)[617:HwBinder:337_1]mtk_pcm_mrgrx_close
<3>[    8.241528]  (0)[617:HwBinder:337_1][AudioError] , user count < 0
<4>[    8.241534]  (0)[617:HwBinder:337_1][AudioWarn] GeneralSampleRateTransform() sampleRate(0) is invalid, use 44.1kHz!!!
<4>[    8.241541]  (0)[617:HwBinder:337_1]SetMrgI2SEnable bEnable = 0
<3>[    8.241548]  (0)[617:HwBinder:337_1][AudioError] , user count < 0
<4>[    8.241559]  (0)[617:HwBinder:337_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[    8.241566]  (0)[617:HwBinder:337_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<4>[    8.243750]  (0)[617:HwBinder:337_1]mtk_mrgrx_awb_pcm_open
<4>[    8.243776]  (0)[617:HwBinder:337_1]mtk_mrgrx_awb_pcm_open runtime rate = 0 channels = 0
<3>[    8.243788]  (0)[617:HwBinder:337_1]mt-soc-mrgrx-awb-pcm mt-soc-mrgrx-awb-pcm: ASoC: can't open platform mt-soc-mrgrx-awb-pcm: -1
<6>[    8.245001] -(0)[162:ccci_fsm1][ccci1/fsm]md_state change from 2 to 3
<5>[    8.245052] -(0)[162:ccci_fsm1]mtk_rtc_hal_common: rtc_spare_reg[12] = {5b8, 1, 6}
<6>[    8.245243] -(0)[162:ccci_fsm1][ccci1/mcd]md_boot_stats len 0
<6>[    8.245255] -(0)[162:ccci_fsm1][ccci1/mcd]md_boot_stats0:0x54430007
<6>[    8.245265] -(0)[162:ccci_fsm1][ccci1/mcd]md_boot_stats1:0x53320000
<6>[    8.245284] -(0)[162:ccci_fsm1][ccci1/fsm]event 1 is completed by fsm_main_thread
<2>[    8.245348]  (0)[162:ccci_fsm1][PBM] AP2MD1 section level, 2G: 0x15cefe0(0x15cefe0), 3G: 0xc84696(0xc84696), 
<2>[    8.245352]  (0)[162:ccci_fsm1][PBM] 4G_upL1: 0xc74675(0xc74675), TDD: 0xd84a75(0xd84a75), addr: 0xffffff800b40ff58
<2>[    8.245363]  (0)[162:ccci_fsm1][PBM] C2K section level, C2K: 0xd8d2b7(0xd8d2b7), addr: 0xffffff800b40ff58
<2>[    8.245369]  (0)[162:ccci_fsm1][PBM] MD section level init, MD1: 1
<6>[    8.245384]  (0)[162:ccci_fsm1][ccci1/fsm]send runtime data 0
<4>[    8.245534]  (0)[617:HwBinder:337_1]mtk_mrgrx_awb_pcm_open
<4>[    8.245552]  (0)[617:HwBinder:337_1]mtk_mrgrx_awb_pcm_open runtime rate = 0 channels = 0
<4>[    8.245558]  (0)[617:HwBinder:337_1]SNDRV_PCM_STREAM_CAPTURE
<4>[    8.245601]  (0)[617:HwBinder:337_1]mtk_mrgrx_awb_pcm_open return
<4>[    8.249238]  (0)[617:HwBinder:337_1]mtk_pcm_I2S0dl1_open: mtk_I2S0dl1_hardware.buffer_bytes_max = 147456 mPlaybackDramState = 0
<4>[    8.249373]  (0)[617:HwBinder:337_1]mtk_pcm_I2S0dl1_close
<4>[    8.253676]  (0)[617:HwBinder:337_1]mtk_voice_bt_pcm_open(), stream(0)
<4>[    8.253773]  (0)[617:HwBinder:337_1]mtk_voice_bt_close(), stream(0)
<3>[    8.253787]  (0)[617:HwBinder:337_1][AudioError] , user count < 0
<4>[    8.254919]  (0)[617:HwBinder:337_1]mtk_bt_dai_pcm_open, stream 1
<4>[    8.256189]  (0)[617:HwBinder:337_1]mtk_bt_dai_pcm_open return
<4>[    8.262868]  (0)[617:HwBinder:337_1]mtk_I2S0dl1_hardware.buffer_bytes_max = 36864 mPlaybackDramState = 0
<4>[    8.263117]  (0)[617:HwBinder:337_1]mtk_capture2_pcm_open
<4>[    8.263139]  (0)[617:HwBinder:337_1]runtime->hw->rates = 0x40001ffe
<4>[    8.263139]  
<4>[    8.263143]  (0)[617:HwBinder:337_1]mtk_capture2_pcm_open runtime rate = 0 channels = 0
<4>[    8.263152]  (0)[617:HwBinder:337_1]SNDRV_PCM_STREAM_CAPTURE mtkalsa_capture_constraints
<4>[    8.263158]  (0)[617:HwBinder:337_1]mtk_capture2_pcm_open return
<4>[    8.263202]  (0)[617:HwBinder:337_1]mtk_capture2_pcm_close
<4>[    8.265111]  (0)[617:HwBinder:337_1]mtk_i2s0_awb_pcm_open
<4>[    8.265233]  (0)[617:HwBinder:337_1]mtk_i2s0_awb_pcm_open runtime rate = 0 channels = 0
<4>[    8.265246]  (0)[617:HwBinder:337_1]SNDRV_PCM_STREAM_CAPTURE
<4>[    8.265251]  (0)[617:HwBinder:337_1]mtk_i2s0_awb_pcm_open return
<4>[    8.270022]  (0)[617:HwBinder:337_1]mtk_voice_md2_pcm_open(), stream(0)
<4>[    8.270201]  (0)[617:HwBinder:337_1]mtk_voice_md2_close(), stream(0)
<4>[    8.270251]  (0)[617:HwBinder:337_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[    8.270262]  (0)[617:HwBinder:337_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<3>[    8.270273]  (0)[617:HwBinder:337_1][AudioError] , user count < 0
<3>[    8.270279]  (0)[617:HwBinder:337_1][AudioError] , user count < 0
<4>[    8.271721]  (0)[617:HwBinder:337_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[    8.271750]  (0)[617:HwBinder:337_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<4>[    8.271995]  (0)[617:HwBinder:337_1]mtk_voice_md2_pcm_open(), stream(1)
<4>[    8.272431]  (0)[617:HwBinder:337_1]mtk_voice_md2_close(), stream(1)
<7>[    8.273356]  (2)[644:sh][ftrace]event 'sched_fork_time' is enabled
<4>[    8.274887]  (0)[617:HwBinder:337_1]mtk_routing_pcm_open
<4>[    8.274916]  (0)[617:HwBinder:337_1]mtk_routing_pcm_open runtime rate = 0 channels = 0
<4>[    8.274923]  (0)[617:HwBinder:337_1]mtk_routing_pcm_open return
<4>[    8.275100]  (0)[617:HwBinder:337_1]mtk_routing_pcm_open
<4>[    8.275123]  (0)[617:HwBinder:337_1]mtk_routing_pcm_open runtime rate = 0 channels = 0
<4>[    8.275133]  (0)[617:HwBinder:337_1]mtk_routing_pcm_open return
<4>[    8.277346]  (0)[617:HwBinder:337_1]mtk_voice_md2_bt_pcm_open(), stream(0)
<4>[    8.277454]  (0)[617:HwBinder:337_1]mtk_voice_md2_bt_close(), stream(0)
<3>[    8.277467]  (0)[617:HwBinder:337_1][AudioError] , user count < 0
<4>[    8.287663]  (0)[617:HwBinder:337_1]mtk_pcm_fm_i2s_open
<4>[    8.287689]  (0)[617:HwBinder:337_1]mtk_pcm_fm_i2s_open return
<4>[    8.287742]  (0)[617:HwBinder:337_1]mtk_pcm_fm_i2s_close rate = 0
<3>[    8.287751]  (0)[617:HwBinder:337_1][AudioError] , user count < 0
<4>[    8.287761]  (0)[617:HwBinder:337_1][AudioWarn] GeneralSampleRateTransform() sampleRate(0) is invalid, use 44.1kHz!!!
<4>[    8.287773]  (0)[617:HwBinder:337_1]setConnsysI2SInEnable(), enable = 0
<3>[    8.287777]  (0)[617:HwBinder:337_1][AudioError] , user count < 0
<4>[    8.287789]  (0)[617:HwBinder:337_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[    8.287796]  (0)[617:HwBinder:337_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<4>[    8.287970]  (0)[617:HwBinder:337_1]mtk_fm_i2s_awb_pcm_open
<4>[    8.288075]  (0)[617:HwBinder:337_1]mtk_fm_i2s_awb_pcm_open return
<4>[    8.289598]  (0)[617:HwBinder:337_1]+Set_BTCVSD_State, state=16
<4>[    8.289707]  (0)[617:HwBinder:337_1]+Set_BTCVSD_State, state=16
<4>[    8.290912]  (0)[617:HwBinder:337_1]mtk_pcm_btcvsd_tx_open
<4>[    8.291004]  (0)[617:HwBinder:337_1]mtk_pcm_btcvsd_tx_close
<4>[    8.291012]  (0)[617:HwBinder:337_1]+Set_BTCVSD_State, state=0
<4>[    8.291096]  (0)[617:HwBinder:337_1]mtk_pcm_btcvsd_tx_open
<4>[    8.291141]  (0)[617:HwBinder:337_1]mtk_pcm_btcvsd_tx_close
<4>[    8.291148]  (0)[617:HwBinder:337_1]+Set_BTCVSD_State, state=0
<4>[    8.296650]  (0)[617:HwBinder:337_1]mtk_i2s2_adc2_pcm_open
<4>[    8.303278]  (0)[617:HwBinder:337_1]mtk_voice_usb_open()
<4>[    8.303307]  (0)[617:HwBinder:337_1]mtk_voice_usb_open(), return
<4>[    8.303380]  (0)[617:HwBinder:337_1]mtk_voice_usb_close(), stream 0, prepare 0
<4>[    8.303553]  (0)[617:HwBinder:337_1]mtk_voice_usb_open()
<4>[    8.303574]  (0)[617:HwBinder:337_1]mtk_voice_usb_open(), return
<4>[    8.303634]  (0)[617:HwBinder:337_1]mtk_voice_usb_close(), stream 1, prepare 0
<4>[    8.305674]  (0)[617:HwBinder:337_1]mtk_usb_echoref_open()
<4>[    8.305700]  (0)[617:HwBinder:337_1]mtk_usb_echoref_open(), return
<4>[    8.305765]  (0)[617:HwBinder:337_1]mtk_usb_echoref_close(), stream 0, prepare 0
<4>[    8.314282]  (0)[617:HwBinder:337_1]mtk_i2s2_adc2_pcm_open
<7>[    8.340015]  (2)[646:sh][ftrace]event 'sched_process_exit' is enabled
<14>[    8.370723]  (3)[1:init]init: starting service 'aee_aed'...
<14>[    8.382669]  (3)[1:init]init: starting service 'aee_aed64'...
<6>[    8.388968]  (2)[473:kworker/2:2]usb_state<DISCONNECTED>
<14>[    8.398056]  (3)[1:init]init: starting service 'aee_aedv'...
<14>[    8.414466]  (3)[1:init]init: starting service 'aee_aedv64'...
<14>[    8.485153]  (3)[1:init]init: Service 'bsplogstart' (pid 607) exited with status 0
<6>[    8.537709]  (0)[164:ccci_rpc_k][ccci0/rpc]get_md_dtsi_val 1, mediatek,md_product_name_model_id -- 0xf0f0f0f
<14>[    8.584865]  (3)[1:init]init: PropSet [debug.mtk.aee.status64]=[free] Done
<31>[    8.590701]  (0)[315:logd.reader]logd: logdr: UID=1000 GID=1000 PID=464 b tail=0 logMask=1f pid=0 start=0ns timeout=0ns
<14>[    8.593925]  (0)[1:init]init: PropSet [debug.MB.running]=[1] Done
<14>[    8.597228]  (0)[1:init]init: PropSet [debug.MB.prdebug]=[1] Done
<14>[    8.598843]  (0)[1:init]init: processing action (debug.MB.prdebug=1) from (/system/etc/init/mobile_log_d.rc:31)
<14>[    8.652243]  (0)[1:init]init: Command 'write /sys/kernel/debug/dynamic_debug/control file *mediatek* +p' action=debug.MB.prdebug=1 (/system/etc/init/mobile_log_d.rc:32) returned 0 took 53ms.
<14>[    8.680990]  (0)[1:init]init: PropSet [log.tag]=[M] Done
<31>[    8.681219]  (2)[658:logd.reader.per]logd: logd first log reader, set log level to M!
<31>[    8.681249]  (2)[658:logd.reader.per]logd: logd.reader.per thread start.
<6>[    8.695018]  (3)[170:ccci_ctrl][ccci1/fsm]control message 0x0,0x0
<6>[    8.695056]  (3)[170:ccci_ctrl][ccci1/fsm]event 4 is appended from ccci_fsm_recv_control_packet
<6>[    8.705098] -(3)[162:ccci_fsm1][ccci1/fsm]md_state change from 3 to 4
<6>[    8.705170] -(3)[162:ccci_fsm1][ccci1/fsm]event 4 is completed by fsm_main_thread
<5>[    8.705196]  (3)[162:ccci_fsm1][VcoreFS] kicker: KIR_APCCCI, opp: -1, dvfs_opp: 3, sw_opp: 0, kr opp: -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
<5>[    8.705219]  (3)[162:ccci_fsm1][VcoreFS] opp: 3, vcore: 1050000 <= 1150000, fddr: 1066000 <= 1333000 [O][O]
<5>[    8.705238] -(3)[162:ccci_fsm1][VcoreFS] [spm_trigger_dvfs] fix: 0, opp: 3, vcore: 0xc000000, emi: 0x11001, md: 0x0
<6>[    8.705256]  (3)[162:ccci_fsm1][ccci1/fsm]command 1 is completed 1 by fsm_main_thread
<3>[    8.705352]  (3)[358:ccci_mdinit]BOOTPROF:      8705.351481:ccci_md1: ready
<36>[    8.792590]  (0)[323:logd.auditd]type=1400 audit(1550035168.666:4): avc: denied { read } for pid=468 comm="storaged" path="/sys/kernel/debug/mmc0/mmc0:0001/ext_csd" dev="debugfs" ino=1067 scontext=u:r:storaged:s0 tcontext=u:object_r:debugfs_mmc:s0 tclass=file permissive=0
<36>[    8.792630]  (0)[323:logd.auditd]type=1400 audit(1550035170.490:5): avc: denied { getattr } for pid=661 comm="aee" path="/sys/devices/virtual/BOOT/BOOT/boot/boot_mode" dev="sysfs" ino=3650 scontext=u:r:mobile_log_d:s0 tcontext=u:object_r:sysfs:s0 tclass=file permissive=0
<14>[    8.806270]  (0)[1:init]init: Command 'write /sys/kernel/debug/dynamic_debug/control file *gpu* -p' action=debug.MB.prdebug=1 (/system/etc/init/mobile_log_d.rc:33) returned 0 took 125ms.
<14>[    8.810409]  (0)[1:init]init: PropSet [debug.mtk.aee.status64]=[free] Done
<14>[    8.836363]  (0)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[free] Done
<14>[    8.844282]  (0)[1:init]init: PropSet [debug.mtk.aee.vstatus64]=[free] Done
<14>[    8.846194]  (0)[1:init]init: PropSet [mtk.md1.status]=[ready] Done
<14>[    8.857857]  (0)[1:init]init: processing action (mtk.md1.status=ready) from (/vendor/etc/init/init.bip.rc:4)
<14>[    8.865988]  (0)[1:init]init: starting service 'bip'...
<14>[    8.873872]  (0)[1:init]init: PropSet [debug.mtk.aee.status]=[free] Done
<14>[    8.874046]  (0)[1:init]init: processing action (mtk.md1.status=ready) from (/vendor/etc/init/init.volte_imsm_93.rc:5)
<14>[    8.874940]  (0)[1:init]init: starting service 'volte_imsm_93'...
<14>[    8.881214]  (0)[667:init]init: Created socket '/dev/socket/bip', mode 660, user 0, group 1000
<14>[    8.882761]  (0)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[free] Done
<14>[    8.884159]  (0)[1:init]init: starting service 'volte_stack'...
<36>[    8.894221]  (0)[323:logd.auditd]type=1400 audit(1550035170.490:5): avc: denied { getattr } for pid=661 comm="aee" path="/sys/devices/virtual/BOOT/BOOT/boot/boot_mode" dev="sysfs" ino=3650 scontext=u:r:mobile_log_d:s0 tcontext=u:object_r:sysfs:s0 tclass=file permissive=0
<36>[    8.894258]  (0)[323:logd.auditd]type=1400 audit(1550035170.594:6): avc: denied { search } for pid=496 comm="program_binary_" name="clients" dev="debugfs" ino=6880 scontext=u:r:program_binary:s0 tcontext=u:object_r:debugfs_ion:s0 tclass=dir permissive=0
<3>[    8.895447]  (0)[496:program_binary_]Failed to create client debugfs at /ion/clients/496-0
<36>[    8.895723]  (2)[323:logd.auditd]type=1400 audit(1550035170.594:6): avc: denied { search } for pid=496 comm="program_binary_" name="clients" dev="debugfs" ino=6880 scontext=u:r:program_binary:s0 tcontext=u:object_r:debugfs_ion:s0 tclass=dir permissive=0
<36>[    8.895760]  (2)[323:logd.auditd]type=1400 audit(1550035170.594:7): avc: denied { ioctl } for pid=496 comm="program_binary_" path="/dev/ion" dev="tmpfs" ino=7405 ioctlcmd=4906 scontext=u:r:program_binary:s0 tcontext=u:object_r:ion_device:s0 tclass=chr_file permissive=0
<14>[    8.917825]  (0)[1:init]init: [PropSet]: pid:358 uid:1000 gid:1001 ctl.start, emdlogger1
<14>[    8.919292]  (0)[1:init]init: starting service 'emdlogger1'...
<14>[    8.926134]  (0)[669:init]init: Created socket '/dev/socket/volte_stack', mode 660, user 0, group 1000
<14>[    8.940246]  (0)[1:init]init: starting service 'volte_ua'...
<6>[    8.950955]  (0)[366:wfca][ccci1/chr]port ccci_imsa close rx_len=0 empty=1, clear_cnt=0, drop=0
<6>[    8.950991]  (0)[366:wfca][ccci1/pot]critical user check: 0x1
<6>[    8.951076]  (0)[366:wfca][ccci1/chr]port ccci_imsa open with flag 20002 by wfca
<14>[    8.953696]  (0)[1:init]init: PropSet [debug.mtk.aee.status]=[free] Done
<14>[    8.959962]  (0)[1:init]init: starting service 'volte_imcb'...
<14>[    8.963886]  (0)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[dumping] Done
<7>[    8.966074]  (0)[678:aee_aedv][KL_ENV]get env name=forceencrypt_config
<4>[    8.966096]  (0)[678:aee_aedv][KL_ENV]cann't find name=forceencrypt_config
<7>[    8.969996]  (1)[678:aee_aedv][KL_ENV]get env name=forceencrypt_config
<4>[    8.970019]  (1)[678:aee_aedv][KL_ENV]cann't find name=forceencrypt_config
<14>[    8.979548]  (3)[673:init]init: Created socket '/dev/socket/volte_ua', mode 660, user 0, group 1000
<14>[    9.002771]  (3)[677:init]init: Created socket '/dev/socket/volte_imsa1', mode 660, user 0, group 1001
<14>[    9.004320]  (3)[677:init]init: Created socket '/dev/socket/volte_imsa2', mode 660, user 0, group 1001
<36>[    9.028716]  (0)[323:logd.auditd]type=1400 audit(1550035170.594:7): avc: denied { ioctl } for pid=496 comm="program_binary_" path="/dev/ion" dev="tmpfs" ino=7405 ioctlcmd=4906 scontext=u:r:program_binary:s0 tcontext=u:object_r:ion_device:s0 tclass=chr_file permissive=0
<36>[    9.028755]  (0)[323:logd.auditd]type=1400 audit(1550035170.726:8): avc: denied { call } for pid=496 comm="program_binary_" scontext=u:r:program_binary:s0 tcontext=u:r:hwservicemanager:s0 tclass=binder permissive=0
<6>[    9.029372]  (0)[496:program_binary_]binder: 496:496 transaction failed 29201/-1, size 204-32 line 2959
<6>[    9.032413]  (0)[667:bip][ccci1/chr]port ccci_bip open with flag 20002 by bip
<14>[    9.036764]  (3)[677:init]init: Created socket '/dev/socket/volte_ut', mode 660, user 0, group 1001
<3>[    9.040353]  (2)[449:main]BOOTPROF:      9040.351944:Zygote:Preload Start
<36>[    9.072716]  (3)[323:logd.auditd]type=1400 audit(1550035170.726:8): avc: denied { call } for pid=496 comm="program_binary_" scontext=u:r:program_binary:s0 tcontext=u:r:hwservicemanager:s0 tclass=binder permissive=0
<36>[    9.072752]  (3)[323:logd.auditd]type=1400 audit(1550035170.770:9): avc: denied { read } for pid=667 comm="bip" name="u:object_r:net_dns_prop:s0" dev="tmpfs" ino=148 scontext=u:r:bip:s0 tcontext=u:object_r:net_dns_prop:s0 tclass=file permissive=0
<6>[    9.190267]  (3)[518:mtk_agpsd][ccci1/chr]port ccci_c2k_agps open with flag 20902 by mtk_agpsd
<5>[    9.222182] -(1)[677:volte_imcb]alarmtimer_enqueue, 109217286845
<5>[    9.222213] -(1)[677:volte_imcb]alarmtimer_enqueue, 9217320076
<7>[    9.224309]  (2)[617:HwBinder:337_1]Speaker_Amp_Set() value = 0
<7>[    9.224309]  
<7>[    9.224322] Headset_Speaker_Amp_Set() gain = 0
<7>[    9.224322]  <7>[    9.224345]  (2)[617:HwBinder:337_1]Ext_Speaker_Amp_Change OFF+
<3>[    9.224351]  (2)[617:HwBinder:337_1]msg I2C_write_reg AW87319_pa_client is NULL
<7>[    9.233492]  (2)[617:HwBinder:337_1]Ext_Speaker_Amp_Change OFF-
<7>[    9.233559]  (2)[617:HwBinder:337_1]Receiver_Speaker_Switch_Set()
<7>[    9.233609]  (2)[617:HwBinder:337_1]TurnOnADcPowerACC ADCType = 13 enable = 0
<7>[    9.233691]  (2)[617:HwBinder:337_1]TopCkCount <0 =-1
<7>[    9.233691]  
<7>[    9.233695]  (2)[617:HwBinder:337_1]ClsqEnable count <0
<7>[    9.233707]  (2)[617:HwBinder:337_1]NvRegCount <0 =-1
<7>[    9.233707]  
<7>[    9.233710]  (2)[617:HwBinder:337_1]audck_buf_Count count < 0
<7>[    9.233730]  (2)[617:HwBinder:337_1]TurnOnADcPowerACC ADCType = 14 enable = 0
<7>[    9.233805]  (2)[617:HwBinder:337_1]TopCkCount <0 =-1
<7>[    9.233805]  
<7>[    9.233807]  (2)[617:HwBinder:337_1]ClsqEnable count <0
<7>[    9.233819]  (2)[617:HwBinder:337_1]NvRegCount <0 =-1
<7>[    9.233819]  
<7>[    9.233821]  (2)[617:HwBinder:337_1]audck_buf_Count count < 0
<7>[    9.234155]  (2)[617:HwBinder:337_1]pmic_dctrim_control_get(), dctrim_calibrated = 2
<6>[    9.356840]  (2)[617:HwBinder:337_1][ccci1/chr]port ccci_aud open with flag 20002 by HwBinder:337_1
<3>[    9.369738]  (3)[669:volte_stack]Dump cpuinfo
<6>[    9.373419]  (2)[617:HwBinder:337_1][ccci1/chr]port ccci_raw_audio open with flag 20002 by HwBinder:337_1
<6>[    9.373466]  (2)[617:HwBinder:337_1][ccci1/shm]smem_port->addr_phy=7201b000
<6>[    9.373625]  (2)[617:HwBinder:337_1][ccci1/chr]remap addr:0x7201b000 len:53248  map-len:53248
<3>[    9.388284]  (1)[450:main]BOOTPROF:      9388.282406:Zygote:Preload End
<6>[    9.456756]  (0)[668:volte_imsm_93][ccci1/chr]port ccci_imsm open with flag 20102 by volte_imsm_93
<6>[    9.529900]  (0)[677:volte_imcb][ccci1/chr]port ccci_imsc open with flag 20002 by volte_imcb
<7>[    9.858121]  (2)[472:camerahalserver][ISP]- E. UserCount: 0.
<7>[    9.858386] [ISP]- X. Ret: 0. UserCount: 1.<7>[    9.858524]  (2)[472:camerahalserver][imgsensor]imgsensor_clk_enable_all_cg
<7>[    9.858578]  (2)[472:camerahalserver][imgsensor]imgsensor_open 1
<7>[    9.869436]  (2)[472:camerahalserver][imgsensor]imgsensor_open 2
<7>[    9.870009]  (2)[472:camerahalserver][imgsensor]psensor_list_with_end s5k4h7_mipi_raw n5600_yuv imx386_mipi_raw ,pDTS_sensors null
<7>[    9.870043]  (2)[472:camerahalserver][imgsensor]sensor_idx 0, power 1 curr_sensor_name s5k4h7_mipi_raw
<7>[    9.870052]  (2)[472:camerahalserver][imgsensor]sensor_idx = 0, pin=7, pin_state_on=11, hw_id =2(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[    9.870085]  (2)[472:camerahalserver][imgsensor]sensor_idx = 0, pin=1, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[    9.870105]  (2)[472:camerahalserver][imgsensor]sensor_idx = 0, pin=2, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[    9.870119]  (2)[472:camerahalserver][imgsensor]sensor_idx = 0, pin=3, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<6>[    9.870161]  (2)[472:camerahalserver]ldo vcama enable
<7>[    9.871607]  (2)[472:camerahalserver][imgsensor]sensor_idx = 0, pin=4, pin_state_on=3, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<6>[    9.871655]  (2)[472:camerahalserver]ldo vcamd enable
<7>[    9.873082]  (2)[472:camerahalserver][imgsensor]sensor_idx = 0, pin=5, pin_state_on=7, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<6>[    9.873111]  (2)[472:camerahalserver]ldo vcamio enable
<7>[    9.874565]  (2)[472:camerahalserver][imgsensor]sensor_idx = 0, pin=6, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[    9.880364]  (2)[472:camerahalserver][imgsensor]sensor_idx = 0, pin=2, pin_state_on=11, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[    9.882421]  (2)[472:camerahalserver][imgsensor]sensor_idx = 0, pin=1, pin_state_on=11, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<6>[    9.944968]  (2)[472:camerahalserver]i2c i2c-2: addr: 10, transfer ACK error
<3>[    9.945026]  (2)[472:camerahalserver]I2C read failed (0x0)! speed(0=400) (0x0)
<6>[    9.945105]  (2)[472:camerahalserver]i2c i2c-2: addr: 10, transfer ACK error
<3>[    9.945134]  (2)[472:camerahalserver]I2C read failed (0x0)! speed(0=400) (0x0)
<4>[    9.945142]  (2)[472:camerahalserver]abc[get_imgsensor_id] Read sensor id fail, write id: 0x20, sensor id = 0x0
<4>[    9.945562]  (2)[472:camerahalserver]abc[get_imgsensor_id] i2c write id: 0x5a, sensor id: 0x487b
<7>[    9.945590]  (2)[472:camerahalserver][imgsensor] Sensor found ID = 0x487b
<7>[    9.945599]  (2)[472:camerahalserver][imgsensor]sensor_idx 0, power 0 curr_sensor_name s5k4h7_mipi_raw
<14>[    9.973266]  (3)[1:init]init: Command 'wait /only_for_timeout 1' action=mtk.md1.status=ready (/vendor/etc/init/init.volte_imsm_93.rc:10) returned -1 took 1009ms.
<14>[    9.974391]  (3)[1:init]init: [PropSet]: pid:358 uid:1000 gid:1001 ctl.start, gsm0710muxd
<14>[    9.975734]  (3)[1:init]init: starting service 'gsm0710muxd'...
<14>[    9.978898]  (3)[1:init]init: processing action (mtk.md1.status=ready && persist.mtk_epdg_support=1) from (/vendor/etc/init/init.wod.rc:16)
<14>[    9.979059]  (3)[1:init]init: PropSet [ril.epdg.interface.ctrl]=[1] Done
<7>[   10.000076]  (2)[472:camerahalserver][imgsensor][regulator]6 is enabled
<14>[   10.002120]  (0)[1:init]init: PropSet [debug.mtk.aee.status64]=[free] Done
<7>[   10.004873]  (3)[472:camerahalserver][imgsensor][regulator]5 is enabled
<6>[   10.004944]  (3)[472:camerahalserver]ldo vcamio disable
<7>[   10.006478]  (3)[472:camerahalserver][imgsensor][regulator]4 is enabled
<6>[   10.006505]  (3)[472:camerahalserver]ldo vcamd disable
<7>[   10.011204]  (3)[472:camerahalserver][imgsensor][regulator]3 is enabled
<6>[   10.011264]  (3)[472:camerahalserver]ldo vcama disable
<7>[   10.011358]  (3)[472:camerahalserver][imgsensor][CheckIsAlive]Profile = 141316 us
<7>[   10.011369]  (3)[472:camerahalserver][imgsensor][imgsensor_set_driver] :[0][1][s5k4h7_mipi_raw]
<7>[   10.011728]  (3)[472:camerahalserver][imgsensor][CAMERA SENSOR] CAOMPAT_KDIMGSENSORIOC_X_GETINFO2
<7>[   10.011761]  (3)[472:camerahalserver][imgsensor][adopt_CAMERA_HW_GetInfo2]Entry0
<4>[   10.011781]  (3)[472:camerahalserver]abc[get_info] scenario_id = 0
<4>[   10.011795]  (3)[472:camerahalserver]abc[get_info] scenario_id = 1
<4>[   10.011801]  (3)[472:camerahalserver]abc[get_info] scenario_id = 2
<4>[   10.011808]  (3)[472:camerahalserver]abc[get_info] scenario_id = 3
<4>[   10.011814]  (3)[472:camerahalserver]abc[get_info] scenario_id = 4
<4>[   10.011822]  (3)[472:camerahalserver]abc[get_info] scenario_id = 5
<4>[   10.011829]  (3)[472:camerahalserver]abc[get_info] scenario_id = 6
<4>[   10.011835]  (3)[472:camerahalserver]abc[get_info] scenario_id = 7
<4>[   10.011841]  (3)[472:camerahalserver]abc[get_info] scenario_id = 8
<4>[   10.011847]  (3)[472:camerahalserver]abc[get_info] scenario_id = 9
<4>[   10.011854]  (3)[472:camerahalserver]abc[get_resolution] E
<7>[   10.011860]  (3)[472:camerahalserver][imgsensor][CAMERA_HW][Pre]w=0x660, h = 0x4c8
<7>[   10.011867]  (3)[472:camerahalserver][imgsensor][CAMERA_HW][Full]w=0xcc0, h = 0x990
<7>[   10.011872]  (3)[472:camerahalserver][imgsensor][CAMERA_HW][VD]w=0xcc0, h = 0x72c
<4>[   10.012065]  (3)[472:camerahalserver]abc[get_default_framerate_by_scenario] scenario_id = 0
<4>[   10.012107]  (3)[472:camerahalserver]abc[get_default_framerate_by_scenario] scenario_id = 1
<4>[   10.012119]  (3)[472:camerahalserver]abc[get_default_framerate_by_scenario] scenario_id = 2
<4>[   10.012130]  (3)[472:camerahalserver]abc[get_default_framerate_by_scenario] scenario_id = 3
<4>[   10.012141]  (3)[472:camerahalserver]abc[get_default_framerate_by_scenario] scenario_id = 4
<4>[   10.012152]  (3)[472:camerahalserver]abc[get_default_framerate_by_scenario] scenario_id = 5
<4>[   10.012162]  (3)[472:camerahalserver]abc[get_default_framerate_by_scenario] scenario_id = 6
<4>[   10.012173]  (3)[472:camerahalserver]abc[get_default_framerate_by_scenario] scenario_id = 7
<4>[   10.012183]  (3)[472:camerahalserver]abc[get_default_framerate_by_scenario] scenario_id = 8
<4>[   10.012194]  (3)[472:camerahalserver]abc[get_default_framerate_by_scenario] scenario_id = 9
<14>[   10.012558]  (0)[1:init]init: starting service 'epdg_wod'...
<14>[   10.019893]  (0)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[free] Done
<14>[   10.039641]  (1)[729:init]init: Created socket '/dev/socket/wod_action', mode 660, user 0, group 1000
<14>[   10.041403]  (1)[729:init]init: Created socket '/dev/socket/wod_sim', mode 660, user 0, group 1000
<14>[   10.087633]  (0)[1:init]init: PropSet [debug.mdlogger.Running]=[0] Done
<14>[   10.097339]  (0)[1:init]init: PropSet [af.speech.shm_init]=[1] Done
<14>[   10.108349]  (0)[1:init]init: PropSet [debug.mdlogger.log2sd.path]=[internal_sd] Done
<7>[   10.114755]  (3)[472:camerahalserver][imgsensor]sensor_idx 1, power 1 curr_sensor_name s5k4h7_mipi_raw
<7>[   10.114804]  (3)[472:camerahalserver][imgsensor]sensor_idx = 1, pin=7, pin_state_on=11, hw_id =2(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   10.114828]  (3)[472:camerahalserver][imgsensor]sensor_idx = 1, pin=1, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   10.114844]  (3)[472:camerahalserver][imgsensor]sensor_idx = 1, pin=2, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   10.114857]  (3)[472:camerahalserver][imgsensor]sensor_idx = 1, pin=3, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<6>[   10.114894]  (3)[472:camerahalserver]ldo vcama enable
<7>[   10.116449]  (3)[472:camerahalserver][imgsensor]sensor_idx = 1, pin=4, pin_state_on=3, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<6>[   10.116509]  (3)[472:camerahalserver]ldo vcamd enable
<14>[   10.117189]  (0)[1:init]init: PropSet [af.modem_1.epof]=[0] Done
<7>[   10.120569]  (3)[472:camerahalserver][imgsensor]sensor_idx = 1, pin=5, pin_state_on=7, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<6>[   10.120612]  (3)[472:camerahalserver]ldo vcamio enable
<7>[   10.122155]  (3)[472:camerahalserver][imgsensor]sensor_idx = 1, pin=6, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<3>[   10.122188]  (3)[472:camerahalserver][regulator]fail to regulator_set_voltage, powertype:6 powerId:2800000
<7>[   10.123201]  (3)[472:camerahalserver][imgsensor]sensor_idx = 1, pin=2, pin_state_on=11, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<14>[   10.123804]  (0)[1:init]init: PropSet [debug.mdl.run.folder]=[] Done
<7>[   10.126607]  (3)[472:camerahalserver][imgsensor]sensor_idx = 1, pin=1, pin_state_on=11, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<14>[   10.136949]  (0)[1:init]init: PropSet [debug.mdl.EE.folder]=[] Done
<14>[   10.138906]  (0)[1:init]init: PropSet [debug.pullmdlog]=[] Done
<14>[   10.141223]  (0)[1:init]init: PropSet [debug.mdl.EE.done]=[] Done
<6>[   10.141761]  (2)[671:emdlogger1][ccci1/chr]port ccci_ccb_dhl open with flag 20002 by emdlogger1
<6>[   10.141797]  (2)[671:emdlogger1][ccci1/shm]smem_port->addr_phy=76000000
<6>[   10.141918]  (2)[671:emdlogger1][ccci1/chr]remap addr:0x76000000 len:2097152  map-len:2097152
<6>[   10.141989]  (2)[671:emdlogger1][ccci1/chr]port ccci_ccb_ctrl open with flag 20002 by emdlogger1
<6>[   10.142007]  (2)[671:emdlogger1][ccci1/shm]ccb_configs_len: 20
<6>[   10.142099]  (2)[671:emdlogger1][ccci1/shm]find ccb port ccci_ccb_dhl for user1!
<6>[   10.142148]  (2)[671:emdlogger1][ccci1/chr]remap control addr:0x72018000 len:4096  map-len:4096
<6>[   10.142163]  (2)[671:emdlogger1][ccci1/chr]remap succeed 72018, 0x72018000 -> 0x78fae89000
<6>[   10.142874]  (2)[671:emdlogger1][ccci1/chr]port ccci_raw_dhl open with flag 20002 by emdlogger1
<6>[   10.142907]  (2)[671:emdlogger1][ccci1/shm]smem_port->addr_phy=76200000
<6>[   10.143001]  (2)[671:emdlogger1][ccci1/chr]remap addr:0x76200000 len:10485760  map-len:10485760
<4>[   10.177034]  (0)[472:camerahalserver]S5K4H7 get_imgsensor_id ismaincamera flag so return Fail 
<7>[   10.177064]  (0)[472:camerahalserver][imgsensor]Fail to get sensor ID ffffffff
<7>[   10.177072]  (0)[472:camerahalserver][imgsensor]ERROR:imgsensor_check_is_alive(), No imgsensor alive
<7>[   10.177078]  (0)[472:camerahalserver][imgsensor]sensor_idx 1, power 0 curr_sensor_name s5k4h7_mipi_raw
<14>[   10.185528]  (0)[1:init]init: PropSet [ril.muxreport.run]=[0] Done
<14>[   10.194006]  (0)[1:init]init: PropSet [ril.mux.ee.md1]=[0] Done
<6>[   10.197525]  (0)[727:gsm0710muxd][ccci1/chr]port ttyC0 open with flag 20902 by gsm0710muxd
<7>[   10.236054]  (0)[472:camerahalserver][imgsensor][regulator]6 is enabled
<7>[   10.241035]  (0)[472:camerahalserver][imgsensor][regulator]5 is enabled
<6>[   10.241064]  (0)[472:camerahalserver]ldo vcamio disable
<7>[   10.242160]  (0)[472:camerahalserver][imgsensor][regulator]4 is enabled
<6>[   10.242183]  (0)[472:camerahalserver]ldo vcamd disable
<7>[   10.243206]  (0)[472:camerahalserver][imgsensor][regulator]3 is enabled
<6>[   10.243216]  (0)[472:camerahalserver]ldo vcama disable
<7>[   10.243274]  (0)[472:camerahalserver][imgsensor][CheckIsAlive]Profile = 128521 us
<4>[   10.243303]  (0)[472:camerahalserver][n5600_proc]reate proc entry success!
<7>[   10.243313]  (0)[472:camerahalserver][imgsensor]sensor_idx 1, power 1 curr_sensor_name n5600_yuv
<7>[   10.243328]  (0)[472:camerahalserver][imgsensor]sensor_idx = 1, pin=7, pin_state_on=11, hw_id =2(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   10.243341]  (0)[472:camerahalserver][imgsensor]sensor_idx = 1, pin=5, pin_state_on=7, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<6>[   10.243359]  (0)[472:camerahalserver]ldo vcamio enable
<7>[   10.246334]  (0)[472:camerahalserver][imgsensor]sensor_idx = 1, pin=3, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<6>[   10.246374]  (0)[472:camerahalserver]ldo vcama enable
<7>[   10.247019]  (0)[472:camerahalserver][imgsensor]sensor_idx = 1, pin=4, pin_state_on=3, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<6>[   10.247049]  (0)[472:camerahalserver]ldo vcamd enable
<7>[   10.248550]  (0)[472:camerahalserver][imgsensor]sensor_idx = 1, pin=6, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<3>[   10.248580]  (0)[472:camerahalserver][regulator]fail to regulator_set_voltage, powertype:6 powerId:2800000
<7>[   10.250595]  (0)[472:camerahalserver][imgsensor]sensor_idx = 1, pin=1, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   10.250649]  (0)[472:camerahalserver][imgsensor]sensor_idx = 1, pin=1, pin_state_on=11, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   10.250666]  (0)[472:camerahalserver][imgsensor]sensor_idx = 1, pin=2, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   10.250679]  (0)[472:camerahalserver][imgsensor]sensor_idx = 1, pin=2, pin_state_on=11, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<6>[   10.271984]  (3)[671:emdlogger1][ccci1/chr]port ccci_raw_dhl close rx_len=0 empty=1, clear_cnt=0, drop=0
<6>[   10.272022]  (3)[671:emdlogger1][ccci1/pot]critical user check: 0x7
<6>[   10.272186]  (3)[671:emdlogger1][ccci1/chr]port ccci_ccb_dhl close rx_len=0 empty=1, clear_cnt=0, drop=0
<6>[   10.272219]  (3)[671:emdlogger1][ccci1/pot]critical user check: 0x3
<6>[   10.272327]  (3)[671:emdlogger1][ccci1/chr]port ccci_ccb_ctrl close rx_len=0 empty=1, clear_cnt=0, drop=0
<6>[   10.272355]  (3)[671:emdlogger1][ccci1/pot]critical user check: 0x3
<4>[   10.281203]  (0)[472:camerahalserver][n5600_hsm] N5600FeatureControl id 3041
<4>[   10.281232]  (0)[472:camerahalserver]yyyyy=== [n5600_yuv]: [n5600_hsm_ioctl]N5600GetSensorID
<4>[   10.283233]  (3)[472:camerahalserver]yyyyy=== [n5600_yuv]: [n5600_hsm_ioctl]N5600 Sensor Read ID = 701
<7>[   10.283265]  (3)[472:camerahalserver][imgsensor] Sensor found ID = 0x701
<7>[   10.283277]  (3)[472:camerahalserver][imgsensor]sensor_idx 1, power 0 curr_sensor_name n5600_yuv
<7>[   10.291430]  (3)[472:camerahalserver][imgsensor][regulator]6 is enabled
<7>[   10.291463]  (3)[472:camerahalserver][imgsensor][regulator]4 is enabled
<6>[   10.291470]  (3)[472:camerahalserver]ldo vcamd disable
<7>[   10.291492]  (3)[472:camerahalserver][imgsensor][regulator]3 is enabled
<6>[   10.291497]  (3)[472:camerahalserver]ldo vcama disable
<7>[   10.291513]  (3)[472:camerahalserver][imgsensor][regulator]5 is enabled
<6>[   10.291518]  (3)[472:camerahalserver]ldo vcamio disable
<7>[   10.291568]  (3)[472:camerahalserver][imgsensor][CheckIsAlive]Profile = 48255 us
<7>[   10.291576]  (3)[472:camerahalserver][imgsensor][imgsensor_set_driver] :[1][2][n5600_yuv]
<4>[   10.291585]  (3)[472:camerahalserver][n5600_hsm] N5600FeatureControl id 3107
<4>[   10.292141]  (3)[472:camerahalserver][n5600_hsm_ioctl] N5600FeatureControl id 3107
<4>[   10.292164]  (3)[472:camerahalserver]yyyyy=== hsm_ioctl cmd = 3107, HSM_IIC_READ_MIPI = 3222165198 
<4>[   10.292172]  (3)[472:camerahalserver]yyyyy=== default  enter 
<7>[   10.292334]  (3)[472:camerahalserver][imgsensor][CAMERA SENSOR] CAOMPAT_KDIMGSENSORIOC_X_GETINFO2
<7>[   10.292354]  (3)[472:camerahalserver][imgsensor][adopt_CAMERA_HW_GetInfo2]Entry1
<4>[   10.292367]  (3)[472:camerahalserver]yyyyy=== [n5600_yuv]: N5600GetInfo 
<4>[   10.292376]  (3)[472:camerahalserver]yyyyy=== [n5600_yuv]: N5600GetInfo 
<4>[   10.292383]  (3)[472:camerahalserver]yyyyy=== [n5600_yuv]: N5600GetInfo 
<4>[   10.292389]  (3)[472:camerahalserver]yyyyy=== [n5600_yuv]: N5600GetInfo 
<4>[   10.292394]  (3)[472:camerahalserver]yyyyy=== [n5600_yuv]: N5600GetInfo 
<4>[   10.292401]  (3)[472:camerahalserver]yyyyy=== [n5600_yuv]: N5600GetInfo 
<4>[   10.292407]  (3)[472:camerahalserver]yyyyy=== [n5600_yuv]: N5600GetInfo 
<4>[   10.292412]  (3)[472:camerahalserver]yyyyy=== [n5600_yuv]: N5600GetInfo 
<4>[   10.292418]  (3)[472:camerahalserver]yyyyy=== [n5600_yuv]: N5600GetInfo 
<4>[   10.292424]  (3)[472:camerahalserver]yyyyy=== [n5600_yuv]: N5600GetInfo 
<7>[   10.292431]  (3)[472:camerahalserver][imgsensor][CAMERA_HW][Pre]w=0x1a0, h = 0x280
<7>[   10.292437]  (3)[472:camerahalserver][imgsensor][CAMERA_HW][Full]w=0x1a0, h = 0x280
<7>[   10.292442]  (3)[472:camerahalserver][imgsensor][CAMERA_HW][VD]w=0x1a0, h = 0x280
<4>[   10.292597]  (3)[472:camerahalserver][n5600_hsm] N5600FeatureControl id 3059
<4>[   10.292612]  (3)[472:camerahalserver][n5600_hsm_ioctl] N5600FeatureControl id 3059
<4>[   10.292619]  (3)[472:camerahalserver]yyyyy=== hsm_ioctl cmd = 3059, HSM_IIC_READ_MIPI = 3222165198 
<4>[   10.292626]  (3)[472:camerahalserver]yyyyy=== default  enter 
<4>[   10.292638]  (3)[472:camerahalserver][n5600_hsm] N5600FeatureControl id 3059
<4>[   10.292645]  (3)[472:camerahalserver][n5600_hsm_ioctl] N5600FeatureControl id 3059
<4>[   10.292651]  (3)[472:camerahalserver]yyyyy=== hsm_ioctl cmd = 3059, HSM_IIC_READ_MIPI = 3222165198 
<4>[   10.292657]  (3)[472:camerahalserver]yyyyy=== default  enter 
<4>[   10.292667]  (3)[472:camerahalserver][n5600_hsm] N5600FeatureControl id 3059
<4>[   10.292673]  (3)[472:camerahalserver][n5600_hsm_ioctl] N5600FeatureControl id 3059
<4>[   10.292679]  (3)[472:camerahalserver]yyyyy=== hsm_ioctl cmd = 3059, HSM_IIC_READ_MIPI = 3222165198 
<4>[   10.292686]  (3)[472:camerahalserver]yyyyy=== default  enter 
<4>[   10.292695]  (3)[472:camerahalserver][n5600_hsm] N5600FeatureControl id 3059
<4>[   10.292701]  (3)[472:camerahalserver][n5600_hsm_ioctl] N5600FeatureControl id 3059
<4>[   10.292707]  (3)[472:camerahalserver]yyyyy=== hsm_ioctl cmd = 3059, HSM_IIC_READ_MIPI = 3222165198 
<4>[   10.292713]  (3)[472:camerahalserver]yyyyy=== default  enter 
<4>[   10.292722]  (3)[472:camerahalserver][n5600_hsm] N5600FeatureControl id 3059
<4>[   10.292728]  (3)[472:camerahalserver][n5600_hsm_ioctl] N5600FeatureControl id 3059
<4>[   10.292734]  (3)[472:camerahalserver]yyyyy=== hsm_ioctl cmd = 3059, HSM_IIC_READ_MIPI = 3222165198 
<4>[   10.292740]  (3)[472:camerahalserver]yyyyy=== default  enter 
<4>[   10.292749]  (3)[472:camerahalserver][n5600_hsm] N5600FeatureControl id 3059
<4>[   10.292756]  (3)[472:camerahalserver][n5600_hsm_ioctl] N5600FeatureControl id 3059
<4>[   10.292761]  (3)[472:camerahalserver]yyyyy=== hsm_ioctl cmd = 3059, HSM_IIC_READ_MIPI = 3222165198 
<4>[   10.292768]  (3)[472:camerahalserver]yyyyy=== default  enter 
<4>[   10.292778]  (3)[472:camerahalserver][n5600_hsm] N5600FeatureControl id 3059
<4>[   10.292784]  (3)[472:camerahalserver][n5600_hsm_ioctl] N5600FeatureControl id 3059
<4>[   10.292790]  (3)[472:camerahalserver]yyyyy=== hsm_ioctl cmd = 3059, HSM_IIC_READ_MIPI = 3222165198 
<4>[   10.292796]  (3)[472:camerahalserver]yyyyy=== default  enter 
<4>[   10.292805]  (3)[472:camerahalserver][n5600_hsm] N5600FeatureControl id 3059
<4>[   10.292811]  (3)[472:camerahalserver][n5600_hsm_ioctl] N5600FeatureControl id 3059
<4>[   10.292817]  (3)[472:camerahalserver]yyyyy=== hsm_ioctl cmd = 3059, HSM_IIC_READ_MIPI = 3222165198 
<4>[   10.292824]  (3)[472:camerahalserver]yyyyy=== default  enter 
<4>[   10.292833]  (3)[472:camerahalserver][n5600_hsm] N5600FeatureControl id 3059
<4>[   10.292839]  (3)[472:camerahalserver][n5600_hsm_ioctl] N5600FeatureControl id 3059
<4>[   10.292845]  (3)[472:camerahalserver]yyyyy=== hsm_ioctl cmd = 3059, HSM_IIC_READ_MIPI = 3222165198 
<4>[   10.292851]  (3)[472:camerahalserver]yyyyy=== default  enter 
<4>[   10.292861]  (3)[472:camerahalserver][n5600_hsm] N5600FeatureControl id 3059
<4>[   10.292867]  (3)[472:camerahalserver][n5600_hsm_ioctl] N5600FeatureControl id 3059
<4>[   10.292873]  (3)[472:camerahalserver]yyyyy=== hsm_ioctl cmd = 3059, HSM_IIC_READ_MIPI = 3222165198 
<4>[   10.292879]  (3)[472:camerahalserver]yyyyy=== default  enter 
<14>[   10.314834]  (1)[1:init]init: [PropSet]: pid:727 uid:0 gid:1001 ctl.stop, ril-daemon
<11>[   10.314912]  (1)[1:init]init: no such service 'ril-daemon'
<14>[   10.315713]  (2)[1:init]init: PropSet [ril.mtk]=[1] Done
<14>[   10.317335]  (2)[1:init]init: processing action (ril.mtk=1) from (/vendor/etc/init/rild.rc:12)
<14>[   10.318915]  (2)[1:init]init: starting service 'ril-daemon-mtk'...
<14>[   10.333992]  (0)[764:init]init: Created socket '/dev/socket/sap_uim_socket1', mode 660, user 1002, group 1002
<14>[   10.346621]  (0)[764:init]init: Created socket '/dev/socket/rild-oem', mode 660, user 1001, group 1000
<14>[   10.348354]  (0)[764:init]init: Created socket '/dev/socket/volte_imsvt1', mode 660, user 0, group 1001
<7>[   10.353686]  (1)[472:camerahalserver][ISP]- E. UserCount: 1.
<7>[   10.353809] [ISP]- X. UserCount: 0.<7>[   10.353841]  (1)[472:camerahalserver][imgsensor]imgsensor_release 1
<7>[   10.354016]  (1)[472:camerahalserver][imgsensor]imgsensor_clk_disable_all
<7>[   10.354128]  (1)[472:camerahalserver][imgsensor]imgsensor_release 0
<4>[   10.437913] -(2)[0:swapper/2]MCDI bootup check: PASS
<5>[   10.491534]  (3)[374:vendor.mediatek][Power/PPM] (0x40)(-1)(0)(0-3)(0)(0)(4)(4) 
<6>[   10.492015]  (3)[214:hps_main]CPU request is 0xf
<3>[   10.500815]  (0)[472:camerahalserver][ION] error: cache_map_vm_struct is NULL, retry
<7>[   10.503315]  (0)[472:camerahalserver][ISP]- E. UserCount: 0.
<7>[   10.503553] [ISP]- X. Ret: 0. UserCount: 1. (0)[472:camerahalserver][ISP]- E. UserCount: 1.
<7>[   10.505029] [ISP]- X. Ret: 0. UserCount: 2. (3)[770:initCamdevice][ISP]- E. UserCount: 2.
<7>[   10.526196] [ISP]- X. Ret: 0. UserCount: 3.<7>[   10.526248]  (3)[770:initCamdevice][imgsensor]imgsensor_clk_enable_all_cg
<7>[   10.526304]  (3)[770:initCamdevice][imgsensor]imgsensor_open 1
<7>[   10.528278]  (3)[770:initCamdevice][imgsensor]imgsensor_open 2
<7>[   10.530267]  (1)[770:initCamdevice][imgsensor]sensor_idx 0, power 1 curr_sensor_name s5k4h7_mipi_raw
<7>[   10.530299]  (1)[770:initCamdevice][imgsensor]sensor_idx = 0, pin=7, pin_state_on=11, hw_id =2(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   10.530345]  (1)[770:initCamdevice][imgsensor]sensor_idx = 0, pin=1, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   10.530370]  (1)[770:initCamdevice][imgsensor]sensor_idx = 0, pin=2, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   10.530385]  (1)[770:initCamdevice][imgsensor]sensor_idx = 0, pin=3, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<6>[   10.530403]  (1)[770:initCamdevice]ldo vcama enable
<7>[   10.531947]  (3)[770:initCamdevice][imgsensor]sensor_idx = 0, pin=4, pin_state_on=3, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<6>[   10.531988]  (3)[770:initCamdevice]ldo vcamd enable
<7>[   10.533689]  (3)[770:initCamdevice][imgsensor]sensor_idx = 0, pin=5, pin_state_on=7, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<6>[   10.533741]  (3)[770:initCamdevice]ldo vcamio enable
<7>[   10.535373]  (3)[770:initCamdevice][imgsensor]sensor_idx = 0, pin=6, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   10.539930]  (3)[770:initCamdevice][imgsensor]sensor_idx = 0, pin=2, pin_state_on=11, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   10.544596]  (3)[770:initCamdevice][imgsensor]sensor_idx = 0, pin=1, pin_state_on=11, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<3>[   10.640673]  (2)[449:main]BOOTPROF:     10640.671794:Zygote:Preload 4715 classes in 1347ms
<7>[   10.686882]  (1)[770:initCamdevice][imgsensor][kdCISModulePowerOn]Profile = 156615 us
<6>[   10.687058]  (1)[770:initCamdevice]i2c i2c-2: addr: 10, transfer ACK error
<3>[   10.687093]  (1)[770:initCamdevice]I2C read failed (0x0)! speed(0=400) (0x0)
<6>[   10.687431]  (2)[770:initCamdevice]i2c i2c-2: addr: 10, transfer ACK error
<3>[   10.687470]  (2)[770:initCamdevice]I2C read failed (0x0)! speed(0=400) (0x0)
<4>[   10.687478]  (2)[770:initCamdevice]abc[open] Read sensor id fail, write id: 0x20, sensor id = 0x0
<6>[   10.687996]  (2)[770:initCamdevice]i2c i2c-2: addr: 10, transfer ACK error
<3>[   10.688046]  (2)[770:initCamdevice]I2C read failed (0x0)! speed(0=400) (0x0)
<6>[   10.688433]  (2)[770:initCamdevice]i2c i2c-2: addr: 10, transfer ACK error
<3>[   10.688480]  (2)[770:initCamdevice]I2C read failed (0x0)! speed(0=400) (0x0)
<4>[   10.688488]  (2)[770:initCamdevice]abc[open] Read sensor id fail, write id: 0x20, sensor id = 0x0
<4>[   10.693391]  (2)[770:initCamdevice]abc[open] i2c write id: 0x5a, sensor id: 0x487b
<4>[   10.693422]  (2)[770:initCamdevice][OTP] enter S5K4H7Y_otp_update
<5>[   10.775854]  (2)[192:battery_thread][read_boot_battery_plug_out_status] rtc_invalid 0 plugout 1 bat_plug_out_time 31 sp3:0xa0 pl:1 1
<3>[   10.787962]  (3)[456:vtservice]Dump cpuinfo
<3>[   10.790858]  (0)[472:camerahalserver]CAM_CAL_DRV[EEPROM_drv_open] EEPROM_drv_open start
<3>[   10.794210]  (0)[472:camerahalserver]CAM_CAL_DRV[EEPROM_drv_ioctl] CAM_CALIOC_G_READ start! offset=1, length=4
<3>[   10.794411]  (0)[472:camerahalserver]CAM_CAL_DRV[EEPROM_drv_open] EEPROM_drv_open start
<4>[   10.797063]  (1)[192:battery_thread]=====FG=====::  battery_current =-695 
<4>[   10.800498] -(1)[192:battery_thread]mt6357_get_auxadc_value: 4 callbacks suppressed
<5>[   10.800513]  (1)[192:battery_thread][mt6357_get_auxadc_value] ch_idx = 0, channel = 0, reg_val = 0x57b3, adc_result = 3699
<5>[   10.802139]  (3)[192:battery_thread][mt6357_get_auxadc_value] ch_idx = 1, channel = 2, reg_val = 0x0, adc_result = 0
<4>[   10.812050]  (3)[770:initCamdevice]hujl@debug:Module ID: 0x00, page:1
<4>[   10.812077]  (3)[770:initCamdevice][OTP] enter get_otp_flag
<4>[   10.817071]  (0)[192:battery_thread]=====FG=====::  battery_current =-695 
<5>[   10.817097]  (0)[192:battery_thread][mt6357_get_auxadc_value] ch_idx = 2, channel = 3, bat_cur = 695, reg_val = 0x5f1, adc_result = 668
<5>[   10.817293]  (0)[192:battery_thread]car[-18,127,-151,114,-168] c:0 -695 vbat:3699 vbus:0 soc:36 53 gm3:0 0 0 0
<5>[   10.817322]  (0)[192:battery_thread]tmp:24 65535 65535 hcar2:126 lcar2:156 time:10 sw_iavg:0 0 0 nafg_m:0 0 0
<4>[   10.817498]  (0)[192:battery_thread]=====+++++222backup battery voltage = 0
<5>[   10.817520]  (0)[192:battery_thread][Thermal/TZ/BTSMDPA] mtkts_btsmdpa_prepare_table table_num=6
<5>[   10.817876]  (3)[447:fuelgauged]MTK_FG: get_kernel_cmd:1 0
<4>[   10.819101]  (0)[192:battery_thread]hehai yyy 0x05 reg_data = 0xA0
<4>[   10.819940]  (1)[192:battery_thread]hehai yyy 0x03 reg_data = 0x40
<5>[   10.821099]  (0)[447:fuelgauged][mt6357_get_auxadc_value] ch_idx = 0, channel = 0, reg_val = 0x5755, adc_result = 3684
<4>[   10.836981]  (1)[447:fuelgauged]=====FG=====::  battery_current =-695 
<5>[   10.837016]  (1)[447:fuelgauged][mt6357_get_auxadc_value] ch_idx = 2, channel = 3, bat_cur = 695, reg_val = 0x5f1, adc_result = 668
<5>[   10.837568]  (1)[447:fuelgauged]MTK_FG: [dod_init_result]HW(38378, 4427) SW(38378, 4427) OLD(38054, 3566) VBAT(38382, 4437) OldCAR(c:-19990 v:-17260) con0(3600)
<5>[   10.837568] [dod_init_result]NVRAM_ready 1 Embedded 0 plug_out 1 is_hwocv_unreliable 0 rtc_invalid 0 rtc_ui_soc 3200 two_sec_reboot 0 old_data.ui_soc 3175, nv_fail(0)
<5>[   10.837568] [dod_init_result]T_new 24 T_old 25 T_d0 24 shutdown_time 0 pmic_shutdown_time 1800 plugout_time 31 plugout_time_th 32 swocv_oldocv_diff_emb 1000
<5>[   10.837568] [dod_init_result] <1> 37812 38054 3175 0 0 0 0
<5>[   10.837568] [dod_init_result] fg_c_d0(37812, 2812) fg_v_d0(38054, 3567) ui_d0_soc 3175 ui_soc_opt 0 car_v:0 _car:0
<5>[   10.837568] [dod_init_result] force_vc_mode 0 vc_mode 0 d0_sel 0
<5>[   10.837568] [dod_init1] swocv:38378 4427 hwocv:38378 4427 tmp:24 embedded:0 bat_plugout:1 chr:0 hwocvR:0 vbat:38382 i:42 r:2280 
<5>[   10.837568] [dod_init1] mode:0 fgc_ocv:37812:2812 fgv_ocv:38054:3567 soc:3567,2808,3567 uisoc:-10000
<5>[   10.837568] 
<5>[   10.837869]  (1)[447:fuelgauged]MTK_FG: {FGADC}soc:3567 fg_c_soc:2808 fg_v_soc:3567 ui_soc:3175 vc_diff:-759 vc_mode 0 VBAT 36840 T:[24 V 24 C 24] D0_C 2812 D0_V 3567 CAR[c:-12 v:0]Q:[27805 27805 27805 27805] aging 10000 bat_cycle 0 Trk[0:0:0] UI[0:0] Chr[0:0:0] pseudo1 0 DC_ratio 100 vboot:35202 35202 dod_init[1]
<4>[   10.840316] -(2)[0:swapper/2]Power/swap DP: No enter --- SODI3: No enter --- SODI: No enter --- 
<4>[   10.892462]  (3)[770:initCamdevice]abc[get_otp_flag] cyxotp_flag = 4abc[get_otp_flag] cyx0A30 = 0
<4>[   10.893524]  (3)[770:initCamdevice]abc[get_otp_flag] cyxaf_inf = 220
<4>[   10.893548]  (3)[770:initCamdevice]abc[get_otp_flag] cyxaf_mac = 345
<4>[   10.893555]  (3)[770:initCamdevice]abc[get_otp_flag] group1 is valiad
<4>[   10.893772] abc[get_otp_flag] cyxaddr = 0xa05,cyxotp_info[0] = 35
<4>[   10.893772] ,abc[get_otp_flag] cyxaddr = 0xa06,cyxotp_info[1] = 19
<4>[   10.893772] ,abc[get_otp_flag] cyxaddr = 0xa07,cyxotp_info[2] = 1
<4>[   10.893772] ,abc[get_otp_flag] cyxaddr = 0xa08,cyxotp_info[3] = 17
<4>[   10.893772] ,abc[get_otp_flag] cyxaddr = 0xa09,cyxotp_info[4] = 0
<4>[   10.893772] ,abc[get_otp_flag] cyxaddr = 0xa0a,cyxotp_info[5] = 0
<4>[   10.893772] ,abc[get_otp_flag] cyxaddr = 0xa0b,cyxotp_info[6] = 0
<4>[   10.893772] ,abc[get_otp_flag] cyxaddr = 0xa0c,cyxotp_info[7] = 256
<4>[   10.893772] ,abc[get_otp_flag] cyxaddr = 0xa0d,cyxotp_info[8] = 41
<4>[   10.893772] ,abc[get_otp_flag] cyxaddr = 0xa0e,cyxotp_info[9] = 256
<4>[   10.893772] ,abc[get_otp_flag] cyxaddr = 0xa0f,cyxotp_info[10] = 38
<4>[   10.893772] ,abc[get_otp_flag] cyxaddr = 0xa10,cyxotp_info[11] = 512
<4>[   10.893772] ,abc[get_otp_flag] cyxaddr = 0xa11,cyxotp_info[12] = 1
<4>[   10.893772] ,abc[get_otp_flag] cyxaddr = 0xa12,cyxotp_info[13] = 1
 (1)[770:initCamdevice]abc[get_otp_flag] cyxaddr = 0xa14,cyxotp_info[15] = 1
<4>[   10.910106] ,abc[get_otp_flag] cyxaddr = 0xa15,cyxotp_info[16] = 36
<4>[   10.910106] ,abc[get_otp_flag] cyxaddr = 0xa16,cyxotp_info[17] = 2
<4>[   10.910106] ,abc[get_otp_flag] cyxaddr = 0xa17,cyxotp_info[18] = 1
<4>[   10.910106] ,abc[get_otp_flag] cyx_addr_value_sum = 1259
<4>[   10.911017]  (2)[770:initCamdevice]abc[get_otp_flag] cyx_checksum = 239
<4>[   10.911045]  (2)[770:initCamdevice]abc[get_otp_flag] module otp check correct!
<4>[   10.911268]  (2)[770:initCamdevice][OTP] enter otp_wb_update
<4>[   10.911292]  (2)[770:initCamdevice][OTP] enter get_otp_wb
<4>[   10.975497]  (2)[770:initCamdevice]hujl@debug:current_rg=0x129
<4>[   10.975925]  (2)[770:initCamdevice]hujl@debug:current_bg=0x126
<4>[   10.976129]  (0)[770:initCamdevice]abc[otp_wb_update] cYXr_ratio=529
<4>[   10.976151]  (0)[770:initCamdevice]abc[otp_wb_update] cYXb_ratio=529
<4>[   10.976158]  (0)[770:initCamdevice][OTP] enter wb_gain_set
<4>[   10.977850]  (0)[770:initCamdevice]hujl@debug:S5K4H7Y_otp_update successful!
<7>[   10.982620]  (0)[770:initCamdevice][imgsensor][SensorOpen]Profile = 452353 us
<4>[   10.982627]  (2)[472:camerahalserver]abc[feature_control] SENSOR_SET_SENSOR_IHDR LE=0, SE=7808, Gain=0
<4>[   10.982682]  (2)[472:camerahalserver]abc[feature_control] SENSOR_SET_SENSOR_IHDR LE=1, SE=26368, Gain=16384
<4>[   10.982699]  (2)[472:camerahalserver]abc[feature_control] SENSOR_SET_SENSOR_IHDR LE=2, SE=26368, Gain=16384
<4>[   10.982712]  (2)[472:camerahalserver]abc[feature_control] SENSOR_SET_SENSOR_IHDR LE=3, SE=26368, Gain=16384
<4>[   10.982724]  (2)[472:camerahalserver]abc[feature_control] SENSOR_SET_SENSOR_IHDR LE=4, SE=26368, Gain=16384
<7>[   10.995483]  (2)[472:camerahalserver]flashlight: flashlight_open: Open(0,0,0)
<7>[   10.995557]  (2)[472:camerahalserver]flashlight: _flashlight_ioctl: FLASH_IOC_GET_PART_ID(0,0,0): 1
<7>[   10.995574]  (2)[472:camerahalserver]flashlight: flashlight_release: Release(0,0,0)
<6>[   11.010383] -(1)[0:swapper/1]mcdi cpu: 0, 0, 2, 0, cluster : 0, pause = 0, multi core = 0, residency = 0, last core = 0, avail cpu = 000f, cluster = 0001, enabled = 1, max_s_state = 5, system_idle_hint = 00000000
<6>[   11.010383] 
<7>[   11.050192]  (3)[768:HwBinder:472_2][ISP]- E. UserCount: 3.
<7>[   11.050212] [ISP]- X. UserCount: 2. (3)[768:HwBinder:472_2][ISP]- E. UserCount: 2.
<7>[   11.059888] [ISP]- X. UserCount: 1. (3)[768:HwBinder:472_2]abc[close] E
<7>[   11.060391]  (3)[768:HwBinder:472_2][imgsensor]sensor_idx 0, power 0 curr_sensor_name s5k4h7_mipi_raw
<3>[   11.106084]  (2)[449:main]BOOTPROF:     11106.083026:Zygote:Preload 64 obtain resources in 82ms
<7>[   11.118098]  (1)[768:HwBinder:472_2][imgsensor][regulator]6 is enabled
<3>[   11.118770]  (2)[449:main]BOOTPROF:     11118.769102:Zygote:Preload 41 resources in 12ms
<7>[   11.124971]  (1)[768:HwBinder:472_2][imgsensor][regulator]5 is enabled
<6>[   11.125004]  (1)[768:HwBinder:472_2]ldo vcamio disable
<7>[   11.126314]  (1)[768:HwBinder:472_2][imgsensor][regulator]4 is enabled
<6>[   11.126336]  (1)[768:HwBinder:472_2]ldo vcamd disable
<7>[   11.127359]  (1)[768:HwBinder:472_2][imgsensor][regulator]3 is enabled
<6>[   11.127367]  (1)[768:HwBinder:472_2]ldo vcama disable
<7>[   11.130594]  (0)[768:HwBinder:472_2][imgsensor]imgsensor_release 1
<7>[   11.131457]  (0)[768:HwBinder:472_2][ISP]- E. UserCount: 1.
<7>[   11.131507] [ISP]- X. UserCount: 0.<7>[   11.131530]  (0)[768:HwBinder:472_2][imgsensor]imgsensor_clk_disable_all
<7>[   11.131614]  (0)[768:HwBinder:472_2][imgsensor]imgsensor_release 0
<5>[   11.133782]  (1)[374:vendor.mediatek][Power/PPM] (0x0)(-1)(0)(0-3)(15)(0)(4)(4) 
<5>[   11.145940]  (3)[374:vendor.mediatek][Power/PPM] (0x40)(-1)(0)(0-3)(0)(0)(4)(4) 
<7>[   11.153819]  (3)[802:initCamdevice][ISP]- E. UserCount: 0.
<7>[   11.154060] [ISP]- X. Ret: 0. UserCount: 1.<7>[   11.154125]  (3)[802:initCamdevice][imgsensor]imgsensor_clk_enable_all_cg
<7>[   11.154174]  (3)[802:initCamdevice][imgsensor]imgsensor_open 1
<7>[   11.154819]  (3)[802:initCamdevice][imgsensor]imgsensor_open 2
<4>[   11.156980]  (1)[238:charger_thread]=====FG=====::  battery_current =-695 
<7>[   11.158905]  (3)[802:initCamdevice][imgsensor]sensor_idx 1, power 1 curr_sensor_name n5600_yuv
<7>[   11.158948]  (3)[802:initCamdevice][imgsensor]sensor_idx = 1, pin=7, pin_state_on=11, hw_id =2(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   11.158976]  (3)[802:initCamdevice][imgsensor]sensor_idx = 1, pin=5, pin_state_on=7, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<6>[   11.158994]  (3)[802:initCamdevice]ldo vcamio enable
<7>[   11.159929]  (1)[802:initCamdevice][imgsensor]sensor_idx = 1, pin=3, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<6>[   11.159962]  (1)[802:initCamdevice]ldo vcama enable
<7>[   11.160414]  (3)[802:initCamdevice][imgsensor]sensor_idx = 1, pin=4, pin_state_on=3, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<6>[   11.160449]  (3)[802:initCamdevice]ldo vcamd enable
<7>[   11.160878]  (3)[802:initCamdevice][imgsensor]sensor_idx = 1, pin=6, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<3>[   11.160941]  (3)[802:initCamdevice][regulator]fail to regulator_set_voltage, powertype:6 powerId:2800000
<7>[   11.162958]  (3)[802:initCamdevice][imgsensor]sensor_idx = 1, pin=1, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   11.163003]  (3)[802:initCamdevice][imgsensor]sensor_idx = 1, pin=1, pin_state_on=11, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   11.163017]  (3)[802:initCamdevice][imgsensor]sensor_idx = 1, pin=2, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   11.163030]  (3)[802:initCamdevice][imgsensor]sensor_idx = 1, pin=2, pin_state_on=11, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<4>[   11.173082]  (1)[238:charger_thread]=====FG=====::  battery_current =-695 
<7>[   11.181954]  (3)[802:initCamdevice][imgsensor][kdCISModulePowerOn]Profile = 23048 us
<4>[   11.181979]  (3)[802:initCamdevice]yyyyy=== [n5600_yuv]: [n5600_hsm_ioctl]N5600Open_start 
<5>[   11.185976]  (0)[238:charger_thread]Vbat=3703,Ibat=695,I=571,VChr=0,T=24,Soc=36:53,CT:0:0 hv:1 pd:0:0
<4>[   11.188016]  (1)[802:initCamdevice]yyyyy=== [n5600_yuv]: Read Sensor Reg 0x13 0xff
<5>[   11.190955]  (1)[238:charger_thread]tmp:24 (jeita:0 sm:0 cv:0 en:0) (sm:1) en:1 c:0 s:0 ov:0 1 1
<4>[   11.213124]  (3)[802:initCamdevice]N5600_Sensor_Driver_Init
<4>[   11.213147]  (3)[802:initCamdevice]yyyyy=== [n5600_yuv]: N5600Open_end 
<7>[   11.213158]  (3)[802:initCamdevice][imgsensor][SensorOpen]Profile = 54253 us
<7>[   11.213400]  (3)[802:initCamdevice][ISP]- E. UserCount: 1.
<7>[   11.213419] [ISP]- X. Ret: 0. UserCount: 2.<7>[   11.232609]  (1)[472:camerahalserver]flashlight: flashlight_open: Open(0,0,0)
<6>[   11.232648]  (1)[472:camerahalserver]flashlight: _flashlight_ioctl: Find no flashlight device
<7>[   11.232668]  (1)[472:camerahalserver]flashlight: flashlight_release: Release(0,0,0)
<7>[   11.232691]  (1)[472:camerahalserver]flashlight: flashlight_open: Open(0,0,0)
<6>[   11.232702]  (1)[472:camerahalserver]flashlight: _flashlight_ioctl: Find no flashlight device
<6>[   11.232712]  (1)[472:camerahalserver]flashlight: _flashlight_ioctl: Find no flashlight device
<7>[   11.232722]  (1)[472:camerahalserver]flashlight: flashlight_release: Release(0,0,0)
<4>[   11.232751]  (1)[472:camerahalserver][n5600_hsm] N5600FeatureControl id 3048
<4>[   11.232760]  (1)[472:camerahalserver]GET_EV_AWB_REF3048
<4>[   11.246192]  (1)[472:camerahalserver][n5600_hsm] N5600FeatureControl id 3060
<4>[   11.246221]  (1)[472:camerahalserver][n5600_hsm_ioctl] N5600FeatureControl id 3060
<4>[   11.246228]  (1)[472:camerahalserver]yyyyy=== hsm_ioctl cmd = 3060, HSM_IIC_READ_MIPI = 3222165198 
<4>[   11.246235]  (1)[472:camerahalserver]yyyyy=== default  enter 
<4>[   11.246252]  (1)[472:camerahalserver][n5600_hsm] N5600FeatureControl id 3050
<4>[   11.246258]  (1)[472:camerahalserver][n5600_hsm_ioctl] N5600FeatureControl id 3050
<4>[   11.246264]  (1)[472:camerahalserver]yyyyy=== hsm_ioctl cmd = 3050, HSM_IIC_READ_MIPI = 3222165198 
<4>[   11.246270]  (1)[472:camerahalserver]yyyyy=== default  enter 
<4>[   11.246280]  (1)[472:camerahalserver][n5600_hsm] N5600FeatureControl id 3051
<4>[   11.246286]  (1)[472:camerahalserver][n5600_hsm_ioctl] N5600FeatureControl id 3051
<4>[   11.246292]  (1)[472:camerahalserver]yyyyy=== hsm_ioctl cmd = 3051, HSM_IIC_READ_MIPI = 3222165198 
<4>[   11.246298]  (1)[472:camerahalserver]yyyyy=== default  enter 
<7>[   11.246775]  (1)[472:camerahalserver]flashlight: flashlight_open: Open(0,0,0)
<6>[   11.247279]  (1)[472:camerahalserver]flashlight: _flashlight_ioctl: Find no flashlight device
<7>[   11.251289]  (1)[472:camerahalserver]flashlight: flashlight_release: Release(0,0,0)
<7>[   11.277227]  (3)[768:HwBinder:472_2][ISP]- E. UserCount: 2.
<7>[   11.277255] [ISP]- X. UserCount: 1. (3)[768:HwBinder:472_2]yyyyy=== [n5600_yuv]: N5600Close
<7>[   11.277563]  (3)[768:HwBinder:472_2][imgsensor]sensor_idx 1, power 0 curr_sensor_name n5600_yuv
<6>[   11.285104]  (0)[729:epdg_wod][ccci1/chr]port ccci_woa open with flag 20002 by epdg_wod
<7>[   11.285119]  (3)[768:HwBinder:472_2][imgsensor][regulator]6 is enabled
<7>[   11.285133]  (3)[768:HwBinder:472_2][imgsensor][regulator]4 is enabled
<6>[   11.285141]  (3)[768:HwBinder:472_2]ldo vcamd disable
<7>[   11.285159]  (3)[768:HwBinder:472_2][imgsensor][regulator]3 is enabled
<6>[   11.285165]  (3)[768:HwBinder:472_2]ldo vcama disable
<7>[   11.285180]  (3)[768:HwBinder:472_2][imgsensor][regulator]5 is enabled
<6>[   11.285186]  (3)[768:HwBinder:472_2]ldo vcamio disable
<7>[   11.287636]  (0)[768:HwBinder:472_2][imgsensor]imgsensor_release 1
<7>[   11.288655]  (0)[768:HwBinder:472_2][ISP]- E. UserCount: 1.
<7>[   11.288708] [ISP]- X. UserCount: 0.<7>[   11.288733]  (0)[768:HwBinder:472_2][imgsensor]imgsensor_clk_disable_all
<7>[   11.288816]  (0)[768:HwBinder:472_2][imgsensor]imgsensor_release 0
<5>[   11.293214]  (0)[374:vendor.mediatek][Power/PPM] (0x0)(-1)(0)(0-3)(15)(0)(4)(4) 
<6>[   11.338787]  (2)[456:vtservice][ccci1/chr]port ccci_imsdc open with flag 20002 by vtservice
<3>[   11.408445]  (0)[449:main]BOOTPROF:     11408.444026:Zygote:Preload End
<14>[   11.607687]  (0)[1:init]init: PropSet [ril.ecclist]=[] Done
<14>[   11.609513]  (0)[1:init]init: PropSet [ril.cdma.card.omh]=[-1] Done
<14>[   11.611279]  (0)[1:init]init: PropSet [ril.cdma.ecclist]=[] Done
<14>[   11.622719]  (1)[1:init]init: PropSet [persist.radio.sim.opid]=[0] Done
<14>[   11.655596]  (1)[1:init]init: PropSet [persist.radio.simswitch]=[1] Done
<14>[   11.658622]  (1)[1:init]init: PropSet [ril.simswitch.no_reset_support]=[1] Done
<14>[   11.664556]  (0)[1:init]init: PropSet [ril.simswitch.tpluswsupport]=[1] Done
<14>[   11.672881]  (1)[1:init]init: PropSet [ril.nw.worldmode.keep_3g_mode]=[0] Done
<3>[   11.679031]  (2)[824:system_server]BOOTPROF:     11679.029488:Android:SysServerInit_START
<14>[   11.689132]  (1)[1:init]init: PropSet [persist.sys.dalvik.vm.lib.2]=[libart.so] Done
<14>[   11.691427]  (1)[1:init]init: PropSet [ril.nw.signalstrength.lte.1]=[2147483647,214748364] Done
<6>[   11.694937]  (1)[164:ccci_rpc_k][ccci1/rpc][Error]Unknown Operation ID (0x0000400A)
<14>[   11.695418]  (0)[1:init]init: PropSet [ril.apc.support]=[1] Done
<11>[   11.708440]  (3)[474:fuelgauged_nvra]NVRAM: [FG_DM_read_NVRAM] LID 76, size 24
<6>[   11.717286]  (1)[879:RfxSender_5][ccci1/chr]port ccci_ss_xcap open with flag 20002 by RfxSender_5
<11>[   11.718692]  (3)[474:fuelgauged_nvra]NVRAM: read NVRAM, rec_size 24, rec_num 1
<11>[   11.718734]  (3)[474:fuelgauged_nvra]NVRAM: FG read NVRam ok, fg_nvram_fd == 6 
<11>[   11.719658]  (3)[474:fuelgauged_nvra]NVRAM: FG Close NVRam fd ok, fg_nvram_fd == 6 
<11>[   11.719702]  (3)[474:fuelgauged_nvra]NVRAM: FG NVRam (24 * 1) : 
<11>[   11.721346]  (0)[474:fuelgauged_nvra]NVRAM: dsp_dev : /dev/stpfgd
<11>[   11.721380]  (0)[474:fuelgauged_nvra]NVRAM: nvram_car_tune_value : 119
<11>[   11.721398]  (0)[474:fuelgauged_nvra]NVRAM: fgauge_nvram read from nvram success [119]
<11>[   11.722149]  (0)[474:fuelgauged_nvra]NVRAM: write_car_tune_file write success [8] isvalid:0 2048
<11>[   11.722186]  (0)[474:fuelgauged_nvra]NVRAM: cali car tune 119, invalid
<14>[   11.724168]  (0)[1:init]init: Service 'fuelgauged_nvram' (pid 474) exited with status 0
<6>[   11.749058]  (2)[855:RfxSender_3][ccci1/chr]port ccci_ioctl1 open with flag 20802 by RfxSender_3
<6>[   11.749113]  (2)[855:RfxSender_3][ccci1/fsm]CCCI_IOC_GET_MD_TYPE: 12!
<6>[   11.749179]  (2)[855:RfxSender_3][ccci1/chr]port ccci_ioctl1 close rx_len=0 empty=1, clear_cnt=0, drop=0
<6>[   11.749206]  (2)[855:RfxSender_3][ccci1/pot]critical user check: 0x3
<14>[   11.750222]  (1)[1:init]init: PropSet [ril.active.md]=[12] Done
<14>[   11.755818]  (3)[1:init]init: PropSet [ril.nw.worldmode.activemode]=[1] Done
<4>[   11.812939]  (3)[356:healthd]=====FG=====::  soc =52 
<4>[   11.848978]  (2)[356:healthd]=====FG=====::	battery_current =-663 battery_vol_original=3774
<4>[   11.849007]  (2)[356:healthd]=====FG=====:: battery_vol =3840 
<4>[   11.864948]  (2)[356:healthd]=====FG=====::  battery_current =-663 
<4>[   11.878575] -(0)[271:kworker/u8:4]mt6357_get_auxadc_value: 9 callbacks suppressed
<5>[   11.878588]  (0)[271:kworker/u8:4][mt6357_get_auxadc_value] ch_idx = 5, channel = 4, reg_val = 0x61f, adc_result = 688
<4>[   11.880956]  (2)[356:healthd]fg_27542 :  197  11  tempreture =3013 
<4>[   11.880979]  (2)[356:healthd]=====FG=====: temperature:281 
<12>[   11.897433]  (2)[356:healthd]healthd: battery l=52 v=3840 t=28.1 h=2 st=3 c=-663 chg=
<4>[   11.912947]  (1)[271:kworker/u8:4]=====FG=====::  battery_current =-663 
<5>[   11.912974]  (1)[271:kworker/u8:4][mt6357_get_auxadc_value] ch_idx = 2, channel = 3, bat_cur = 663, reg_val = 0x5f1, adc_result = 668
<4>[   11.924984]  (2)[200:kworker/u8:3][STP-PSM] [I]_stp_psm_do_wait: STP is waiting state for ACT, i=1, state = 2
<4>[   11.924991]  (3)[380:mtk_stp_psm][STP-PSM] [I]_stp_psm_proc: pOp(ffffff8000b75128):1
<4>[   11.925048]  (2)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b77f88):7-0-2,ffffff8000ae0e50,0,0
<4>[   11.948987]  (0)[200:kworker/u8:3][STP-PSM] [I]_stp_psm_do_wait: +Total waits for ACT takes 24003 usec
<4>[   11.949048]  (1)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b77e50):15-0-1,0,0,0
<4>[   11.950060]  (3)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b780c0):15-0-2,0,0,0
<4>[   11.951241]  (3)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b781f8):15-0-3,0,0,0
<4>[   11.952461]  (0)[200:kworker/u8:3][HIF-SDIO][I]wmt_dev_tm_temp_query:[Thermal] current_temp = 0x1b
<4>[   11.976972]  (1)[380:mtk_stp_psm][STP-PSM] [I]_stp_psm_proc: pOp(ffffff8000b75878):0
<4>[   11.977033]  (2)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b78330):7-0-0,ffffff8000ae0e50,0,0
<5>[   12.228977]  (3)[198:kworker/3:2][MUSB]do_connect_rescue_work 2219: do_connect_rescue_work, issue connection work
<5>[   12.229005]  (3)[198:kworker/3:2][MUSB]mt_usb_connect 534: issue work
<5>[   12.229023]  (3)[198:kworker/3:2][MUSB]mt_usb_connect 536: [MUSB] USB connect
<5>[   12.229031]  (0)[200:kworker/u8:3][MUSB]do_connection_work 466: is_host<0>, power<0>
<5>[   12.229056]  (0)[200:kworker/u8:3][MUSB]usb_cable_connected 674: usb_cable_connected vbus_exist=0 type=0
<5>[   12.229065]  (0)[200:kworker/u8:3][MUSB]usb_cable_connected 684: usb_cable_connected, connected:0, cable_mode:1
<5>[   12.229073] -(0)[200:kworker/u8:3][MUSB]do_connection_work 513: do nothing, usb_in:0, power:0
<7>[   12.249029]  (0)[60:cfinteractive]mt_fh_hal_general_pll_dfs, [Pll_ID]:0 [current dds(CON1)]:0xe6000, [target dds]:802816
<7>[   12.257061] mt_fh_hal_general_pll_dfs, [Pll_ID]:0 [current dds(CON1)]:0xc4000, [target dds]:942080<6>[   12.409684]  (1)[164:ccci_rpc_k][ccci1/rpc][Error]Unknown Operation ID (0x0000400A)
<14>[   12.411983]  (2)[1:init]init: PropSet [sys.rescue_boot_count]=[1] Done
<14>[   12.421024]  (3)[1:init]init: PropSet [ril.ipo.radiooff]=[0] Done
<14>[   12.426724]  (1)[1:init]init: PropSet [ril.mux.report.case]=[0] Done
<14>[   12.453064]  (1)[1:init]init: PropSet [sys.ipowin.done]=[1] Done
<7>[   12.456030]  (1)[347:light@2.0-servi][LED][BL] Set Backlight directly T:12.456,L:102 map:102    
<4>[   12.456054]  (1)[347:light@2.0-servi][PWM] disp_pwm_set_backlight_cmdq(id = 0x1, level_1024 = 409), old = -1
<7>[   12.456078]  (1)[347:light@2.0-servi][PWM] disp_pwm_set_enabled: PWN_EN (by CPU) = 0x1
<4>[   12.456086]  (1)[347:light@2.0-servi][PWM] backlight is on (409), ddp_pwm power:(1), pwm id: (0)
<6>[   12.461388]  (1)[867:RfxSender_8][ccci1/chr]port ccci_ioctl1 open with flag 20802 by RfxSender_8
<6>[   12.461425]  (1)[867:RfxSender_8][ccci1/fsm]EFUN set to 0
<6>[   12.461463]  (1)[867:RfxSender_8][ccci1/chr]port ccci_ioctl1 close rx_len=0 empty=1, clear_cnt=0, drop=0
<6>[   12.461486]  (1)[867:RfxSender_8][ccci1/pot]critical user check: 0x3
<14>[   12.467504]  (2)[1:init]init: PropSet [ril.ecclist]=[] Done
<14>[   12.469889]  (2)[1:init]init: PropSet [ril.cdma.ecclist]=[] Done
<14>[   12.472001]  (2)[1:init]init: PropSet [ril.iccid.sim1]=[N/A] Done
<14>[   12.474036]  (2)[1:init]init: PropSet [ril.ecc.service.category.list]=[] Done
<14>[   12.476312]  (2)[1:init]init: PropSet [ril.cdma.card.type.1]=[255] Done
<14>[   12.484011]  (0)[1:init]init: PropSet [persist.radio.lastsim1_iccid]=[null] Done
<14>[   12.492781]  (0)[1:init]init: PropSet [persist.radio.c_capability_slot]=[1] Done
<3>[   12.500180]  (2)[824:system_server]BOOTPROF:     12500.179721:Android:PackageManagerService_Start
<14>[   12.501972]  (1)[1:init]init: PropSet [persist.radio.raf1]=[225786] Done
<14>[   12.509589]  (3)[1:init]init: PropSet [persist.radio.last_iccid_sim1]=[N/A] Done
<14>[   12.514948]  (3)[1:init]init: PropSet [persist.radio.rilj_nw_type1]=[-1] Done
<3>[   12.756213]  (2)[824:system_server]BOOTPROF:     12756.212183:Android:PMS_scan_START
<3>[   12.785688]  (2)[824:system_server]BOOTPROF:     12785.687106:Android:PMS_scan_data:/vendor/overlay
<3>[   12.801599]  (1)[824:system_server]BOOTPROF:     12801.597260:Android:PMS_scan_data:/system/framework
<3>[   12.846146]  (3)[824:system_server]BOOTPROF:     12846.143799:Android:PMS_scan_data:/vendor/framework
<36>[   12.846616]  (1)[323:logd.auditd]type=1400 audit(1550035170.774:10): avc: denied { read } for pid=667 comm="bip" name="u:object_r:net_dns_prop:s0" dev="tmpfs" ino=148 scontext=u:r:bip:s0 tcontext=u:object_r:net_dns_prop:s0 tclass=file permissive=0
<36>[   12.846649]  (1)[323:logd.auditd]type=1400 audit(1550035174.546:11): avc: denied { search } for pid=824 comm="system_server" name="framework" dev="dm-1" ino=651 scontext=u:r:system_server:s0 tcontext=u:object_r:vendor_framework_file:s0 tclass=dir permissive=0
<3>[   12.847045]  (3)[824:system_server]BOOTPROF:     12847.044491:Android:PMS_scan_data:/system/priv-app
<3>[   12.982963]  (1)[824:system_server]BOOTPROF:     12982.961568:Android:PMS_scan_data:/system/app
<3>[   13.184869]  (3)[824:system_server]BOOTPROF:     13184.867338:Android:PMS_scan_data:/vendor/app
<3>[   13.208825]  (3)[824:system_server]BOOTPROF:     13208.823800:Android:PMS_scan_data:/system/plugin
<3>[   13.236277]  (3)[824:system_server]BOOTPROF:     13236.276261:Android:PMS_scan_END
<3>[   13.252199]  (3)[824:system_server]BOOTPROF:     13252.197338:PMS:reconcileAppsDataLI
<6>[   13.396998]  (2)[473:kworker/2:2]usb_state<DISCONNECTED>
<3>[   13.770300]  (2)[824:system_server]BOOTPROF:     13770.299416:Android:PMS_READY
<7>[   13.961744]  (1)[936:HwBinder:471_1]<ALS/PS> als_store_active buf=4,0
<7>[   13.961773]  (1)[936:HwBinder:471_1]<ALS/PS>  als_store_active done
<7>[   13.962179]  (1)[936:HwBinder:471_1]<ALS/PS> ps_store_active buf=0
<7>[   13.962209]  (1)[936:HwBinder:471_1]<ALS/PS>  ps_store_active done
<4>[   13.981004]  (3)[356:healthd]=====FG=====::  soc =52 
<4>[   14.017021]  (1)[356:healthd]=====FG=====::	battery_current =-374 battery_vol_original=3799
<4>[   14.017055]  (1)[356:healthd]=====FG=====:: battery_vol =3836 
<4>[   14.032990]  (2)[356:healthd]=====FG=====::  battery_current =-374 
<4>[   14.049104]  (2)[356:healthd]fg_27542 :  197  11  tempreture =3013 
<4>[   14.049133]  (2)[356:healthd]=====FG=====: temperature:281 
<12>[   14.065523]  (2)[356:healthd]healthd: battery l=52 v=3836 t=28.1 h=2 st=3 c=-374 chg=
<7>[   14.294746]  (0)[350:vibrator@1.0-se]vibrator_enable: no timer existed, cust timer: 25(ms), value: 0, shutdown: 0
<5>[   14.336077]  (0)[824:system_server]alarm_dev: alarm 3 set 38.292000000
<6>[   14.344645]  (1)[824:system_server]AEEIOCTL_RT_MON_Kick ( 0)
<6>[   14.345283]  (1)[824:system_server][Hang_Detect] hang_detect disabled
<14>[   14.612389]  (3)[1:init]init: PropSet [sys.sysctl.extra_free_kbytes]=[4500] Done
<14>[   14.614195]  (3)[1:init]init: processing action (sys.sysctl.extra_free_kbytes=*) from (/init.rc:714)
<14>[   14.804615]  (0)[1:init]init: PropSet [sys.oem_unlock_allowed]=[0] Done
<3>[   15.001046]  (0)[368:wmt_launcher][WMT-PLAT][E]wmt_plat_set_dbg_mode(1799):fw dbg mode register value(0x00000000)
<3>[   15.330971]  (0)[450:main]BOOTPROF:     15330.967882:Zygote:Preload 4715 classes in 1094ms
<3>[   15.579051]  (0)[450:main]BOOTPROF:     15579.049344:Zygote:Preload 64 obtain resources in 102ms
<3>[   15.596875]  (0)[450:main]BOOTPROF:     15596.872959:Zygote:Preload 41 resources in 17ms
<14>[   15.790238]  (2)[1:init]init: PropSet [af.recovery.mic_mute_on]=[0] Done
<4>[   15.844961]  (1)[0:swapper/1]Power/swap DP: No enter --- SODI3: No enter --- SODI: No enter --- 
<6>[   15.883044]  (3)[824:system_server]state_show DISCONNECTED
<6>[   15.884375]  (3)[824:system_server]acc_open
<6>[   15.884428]  (3)[824:system_server]acc_release
<6>[   16.016914] -(3)[0:swapper/3]mcdi cpu: 279, 365, 423, 413, cluster : 0, pause = 0, multi core = 0, residency = 0, last core = 0, avail cpu = 000f, cluster = 0001, enabled = 1, max_s_state = 5, system_idle_hint = 00000000
<6>[   16.016914] 
<6>[   16.018365]  (3)[982:mtk_agpsd][ccci1/chr]port ccci_c2k_agps close rx_len=0 empty=1, clear_cnt=0, drop=0
<6>[   16.018409]  (3)[982:mtk_agpsd][ccci1/pot]critical user check: 0x3
<6>[   16.026289]  (3)[982:mtk_agpsd][ccci1/chr]port ccci_c2k_agps open with flag 20902 by mtk_agpsd
<7>[   16.302869]  (2)[452:batterywarning][Battery] show_BatteryNotify: 0
<14>[   16.407450]  (0)[1:init]init: PropSet [sys.retaildemo.enabled]=[0] Done
<7>[   16.423553]  (1)[471:sensors@1.0-ser]<ALS/PS> als_store_batch 4,0,200000000,0
<7>[   16.423590]  (1)[471:sensors@1.0-ser]<ALS/PS> als_store_batch done
<7>[   16.424236]  (1)[471:sensors@1.0-ser]<ALS/PS> als_store_active buf=4,1
<7>[   16.424267]  (1)[471:sensors@1.0-ser]<ALS/PS> ALSPS als_power on
<3>[   16.424273]  (1)[471:sensors@1.0-ser][ALS/PS] stk3x1x_obj als enable value = 1
<3>[   16.424286]  (1)[471:sensors@1.0-ser][ALS/PS] stk3x1x_enable_als: enable=1
<7>[   16.424519]  (1)[471:sensors@1.0-ser]<ALS/PS> als turn on als_power done
<7>[   16.424541]  (1)[471:sensors@1.0-ser]<ALS/PS> ALSPS als_power on done
<7>[   16.424548]  (1)[471:sensors@1.0-ser]<ALS/PS> ALSPS set batch
<7>[   16.424553]  (1)[471:sensors@1.0-ser]<ALS/PS> als set ODR, fifo latency done
<7>[   16.424561]  (1)[471:sensors@1.0-ser]<ALS/PS> als set polling delay 200 ms
<7>[   16.424567]  (1)[471:sensors@1.0-ser]<ALS/PS> ALSPS batch done
<7>[   16.424572]  (1)[471:sensors@1.0-ser]<ALS/PS>  als_store_active done
<3>[   16.447268]  (2)[824:system_server]BOOTPROF:     16447.265346:AMS:systemReady
<3>[   16.458980]  (2)[824:system_server]BOOTPROF:     16458.978731:AMS:AMS_READY
<14>[   16.461710]  (0)[1:init]init: PropSet [debug.force_rtl]=[0] Done
<14>[   16.496023]  (1)[1:init]init: PropSet [media.wfd.video-format]=[5] Done
<14>[   16.498802]  (1)[1:init]init: PropSet [media.wfd.portrait]=[0] Done
<14>[   16.501335]  (1)[1:init]init: PropSet [wlan.wfd.security.image]=[1] Done
<14>[   16.619706]  (0)[1:init]init: PropSet [debug.mtk.aee.status64]=[free] Done
<14>[   16.622707]  (0)[1:init]init: PropSet [debug.mtk.aee.status64]=[dumping] Done
<14>[   16.629233]  (2)[1:init]init: PropSet [debug.mtk.aee.status64]=[free] Done
<3>[   16.632576]  (0)[824:system_server]BOOTPROF:     16632.575500:AP_Init:[service]:[com.google.android.inputmethod.pinyin]:[com.google.android.inputmethod.pinyin/.PinyinIME]:pid:996
<6>[   16.647533] -(0)[1001:UsbService host]usb usb1: usb_set_device_state 8->7
<5>[   16.647589] -(0)[1001:UsbService host][MUSB]musb_hub_control 352: port status 00000100
<6>[   16.649973]  (3)[1001:UsbService host]usb usb1: usb_set_device_state 7->8
<3>[   16.677701]  (1)[824:system_server]BOOTPROF:     16677.700039:AP_Init:[service]:[com.android.systemui]:[com.android.systemui/.SystemUIService]:pid:1012:(PersistAP)
<14>[   16.697864]  (2)[1:init]init: PropSet [persist.sys.webview.vmsize]=[125701040] Done
<14>[   16.706536]  (2)[1:init]init: PropSet [net.qtaguid_enabled]=[1] Done
<6>[   16.734714]  (1)[1018:sdcard]sdcardfs version 2.0
<6>[   16.734748]  (1)[1018:sdcard]sdcardfs: dev_name -> /data/media
<6>[   16.734755]  (1)[1018:sdcard]sdcardfs: options -> fsuid=1023,fsgid=1023,multiuser,derive_gid,mask=6,userid=0,gid=1015
<6>[   16.734762]  (1)[1018:sdcard]sdcardfs: mnt -> ffffffc01b14caa0
<6>[   16.734860]  (1)[1018:sdcard]sdcardfs: mounted on top of /data/media type ext4
<6>[   16.736460]  (1)[1018:sdcard]Remount options were mask=23,gid=9997 for vfsmnt ffffffc0070b1e20.
<6>[   16.736505]  (1)[1018:sdcard]sdcardfs : options - debug:1
<6>[   16.736512]  (1)[1018:sdcard]sdcardfs : options - gid:9997
<6>[   16.736518]  (1)[1018:sdcard]sdcardfs : options - mask:23
<6>[   16.737061]  (1)[1018:sdcard]Remount options were mask=7,gid=9997 for vfsmnt ffffffc00b6638e0.
<6>[   16.737098]  (1)[1018:sdcard]sdcardfs : options - debug:1
<6>[   16.737106]  (1)[1018:sdcard]sdcardfs : options - gid:9997
<6>[   16.737112]  (1)[1018:sdcard]sdcardfs : options - mask:7
<6>[   16.787759]  (0)[1031:sdcard]sdcardfs version 2.0
<6>[   16.787797]  (0)[1031:sdcard]sdcardfs: dev_name -> /ipsm/media
<6>[   16.787804]  (0)[1031:sdcard]sdcardfs: options -> fsuid=1023,fsgid=1023,derive_gid,mask=6,userid=0,gid=1015
<6>[   16.787813]  (0)[1031:sdcard]sdcardfs: mnt -> ffffffc0124c1aa0
<6>[   16.787941]  (0)[1031:sdcard]sdcardfs: mounted on top of /ipsm/media type ext4
<6>[   16.788366]  (0)[1031:sdcard]Remount options were mask=23,gid=9997 for vfsmnt ffffffc00b655e20.
<6>[   16.788410]  (0)[1031:sdcard]sdcardfs : options - debug:1
<6>[   16.788418]  (0)[1031:sdcard]sdcardfs : options - gid:9997
<6>[   16.788424]  (0)[1031:sdcard]sdcardfs : options - mask:23
<6>[   16.788666]  (0)[1031:sdcard]Remount options were mask=7,gid=9997 for vfsmnt ffffffc0070948e0.
<6>[   16.788707]  (0)[1031:sdcard]sdcardfs : options - debug:1
<6>[   16.788714]  (0)[1031:sdcard]sdcardfs : options - gid:9997
<6>[   16.788720]  (0)[1031:sdcard]sdcardfs : options - mask:7
<3>[   16.804813]  (2)[935:system-server-i]BOOTPROF:     16804.811962:AP_Init:[]:[WebViewLoader-armeabi-v7a]:pid:1035
<3>[   16.833431]  (0)[935:system-server-i]BOOTPROF:     16833.428962:AP_Init:[]:[WebViewLoader-arm64-v8a]:pid:1045
<14>[   16.840803]  (1)[1:init]init: [PropSet]: pid:824 uid:1000 gid:1000 ctl.start, webview_zygote32
<14>[   16.843195]  (1)[1:init]init: starting service 'webview_zygote32'...
<14>[   16.850551]  (3)[1059:init]init: Created socket '/dev/socket/webview_zygote', mode 660, user 1053, group 1000
<6>[   16.865346]  (2)[351:android.hardwar][MTK-WIFI] WIFI_open: major 153 minor 0 (pid 351)
<6>[   16.865400]  (2)[351:android.hardwar][MTK-WIFI] WIFI_write: WIFI_write 1
<4>[   16.865416]  (2)[351:android.hardwar][HIF-SDIO][I]mtk_wcn_wmt_func_ctrl:wmt-exp: OPID(3) type(3) start
<4>[   16.865465]  (2)[351:android.hardwar][STP-PSM] [I]_stp_psm_do_wait: STP is waiting state for ACT, i=1, state = 2
<4>[   16.865570]  (2)[380:mtk_stp_psm][STP-PSM] [I]_stp_psm_proc: pOp(ffffff8000b74630):1
<4>[   16.865941]  (2)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b785a0):7-0-2,ffffff8000ae0e50,0,0
<3>[   16.877397]  (3)[824:system_server]BOOTPROF:     16877.395193:SystemServer:NetworkStatsService systemReady
<5>[   16.886763]  (3)[924:kworker/u8:6][mt6357_get_auxadc_value] ch_idx = 5, channel = 4, reg_val = 0x61f, adc_result = 688
<4>[   16.889036]  (1)[351:android.hardwar][STP-PSM] [I]_stp_psm_do_wait: +Total waits for ACT takes 23569 usec
<4>[   16.889117]  (1)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b78468):3-0-3,0,0,0
<3>[   16.889135]  (1)[384:mtk_wmtd][WMT-CORE][E]opfunc_func_on(1237):not implemented yet hifType: 0x2, unspecified wifi_hif
<4>[   16.889146]  (1)[384:mtk_wmtd][WMT-FUNC][W]wmt_func_wifi_on:WMT-FUNC: wmt wlan func on before wlan probe
<6>[   16.889154]  (1)[384:mtk_wmtd][wlan]HifAhbProbe:(INIT INFO) HifAhbProbe()
<6>[   16.889432]  (1)[384:mtk_wmtd][wlan]wlanNetCreate:(INIT INFO) net_device prDev(0xffffffc035c70000) allocated ifindex=0
<6>[   16.889479]  (1)[384:mtk_wmtd][wlan]glSetHifInfo:(INIT INFO) [WiFi/HIF] ChipID=0x6755, HifInfo->HifRegBaseAddr=0xffffff800d072000, HifInfo->McuRegBaseAddr=0xffffff800d074000
<6>[   16.889667]  (1)[384:mtk_wmtd][wlan]HifPdmaInit:(INIT INFO) [wlan] MPU region 21, 0x77800000 - 0x77880000
<6>[   16.890454]  (1)[384:mtk_wmtd][wlan]glBusSetIrq:(INIT INFO) WIFI-OF: get wifi irq(263)
<6>[   16.891014]  (1)[384:mtk_wmtd][wlan]wlanFwFileCfg:(INIT INFO) jwq.d restore default driver cfg value
<36>[   16.891925]  (0)[323:logd.auditd]type=1400 audit(1550035174.546:12): avc: denied { search } for pid=824 comm="system_server" name="framework" dev="dm-1" ino=651 scontext=u:r:system_server:s0 tcontext=u:object_r:vendor_framework_file:s0 tclass=dir permissive=0
<36>[   16.891976]  (0)[323:logd.auditd]type=1400 audit(1550035178.590:13): avc: denied { dac_override } for pid=384 comm="mtk_wmtd" capability=1 scontext=u:r:kernel:s0 tcontext=u:r:kernel:s0 tclass=capability permissive=0
<36>[   16.892558]  (0)[323:logd.auditd]type=1400 audit(1550035178.590:13): avc: denied { dac_override } for pid=384 comm="mtk_wmtd" capability=1 scontext=u:r:kernel:s0 tcontext=u:r:kernel:s0 tclass=capability permissive=0
<36>[   16.893257]  (0)[323:logd.auditd]type=1400 audit(1550035178.590:14): avc: denied { dac_read_search } for pid=384 comm="mtk_wmtd" capability=2 scontext=u:r:kernel:s0 tcontext=u:r:kernel:s0 tclass=capability permissive=0
<6>[   16.894135]  (3)[384:mtk_wmtd][wlan]wlanFwFileCfg:(INIT INFO) read wifi_fw.cfg :/data/system/wifi_fw.cfg
<6>[   16.894193]  (3)[384:mtk_wmtd][wlan]wlanFwCfgParse2Drv:(INIT INFO) jwq.d set gEnableDFSScan:0 
<6>[   16.894206]  (3)[384:mtk_wmtd][wlan]fillListFromValueStr:(INIT INFO) jwq.d set gNeighborScanChannelList:2,3,5,36,40,48,64,108,120,136,140,153,161 
<6>[   16.894224]  (3)[384:mtk_wmtd][wlan]wlanFwCfgParse2Drv:(INIT INFO) jwq.d gPucBandChannelList ptr:ffffff800d092000 size:14 
<6>[   16.894235]  (3)[384:mtk_wmtd][wlan]wlanFwCfgParse2Drv:(INIT INFO) jwq.d set gEnableOperatingChannels:0 
<6>[   16.894244]  (3)[384:mtk_wmtd][wlan]wlanFwCfgParse2Drv:(INIT INFO) jwq.d set gRoamRSSIDiff:10 
<6>[   16.894252]  (3)[384:mtk_wmtd][wlan]wlanFwCfgParse2Drv:(INIT INFO) jwq.d set gEnable11h:1 
<6>[   16.894260]  (3)[384:mtk_wmtd][wlan]wlanFwCfgParse2Drv:(INIT INFO) jwq.d set gPHYConfig:1 
<6>[   16.894268]  (3)[384:mtk_wmtd][wlan]fillListFromValueStr:(INIT INFO) jwq.d set gOperatingChannelList:null 
<6>[   16.894276]  (3)[384:mtk_wmtd][wlan]wlanFwCfgParse2Drv:(INIT INFO) jwq.d gPucOperatingChannelList ptr:          (null) size:0 
<6>[   16.894291]  (3)[384:mtk_wmtd][wlan]wlanFwCfgParse2Drv:(INIT INFO) jwq.d wlanCfgInit configBuf:5G_support n
<6>[   16.894291] country CN
<6>[   16.894291]  len:24 
<6>[   16.894341]  (2)[384:mtk_wmtd][wlan]wlanProbe:(INIT INFO) FW File Cfg init done!
<4>[   16.896058]  (2)[384:mtk_wmtd]------------[ cut here ]------------
<4>[   16.896085]  (2)[384:mtk_wmtd]WARNING: CPU: 2 PID: 384 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/lib/vsprintf.c:1845 vsnprintf+0x74/0x51c()
<4>[   16.896107]  (2)[384:mtk_wmtd]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   16.896147] -(2)[384:mtk_wmtd]CPU: 2 PID: 384 Comm: mtk_wmtd Tainted: G        W  O    4.4.95+ #1
<4>[   16.896156] -(2)[384:mtk_wmtd]Hardware name: MT6739CW (DT)
<4>[   16.896164] -(2)[384:mtk_wmtd]Call trace:
<4>[   16.896177] -(2)[384:mtk_wmtd][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   16.896194] -(2)[384:mtk_wmtd][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   16.896203] -(2)[384:mtk_wmtd][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   16.896215] -(2)[384:mtk_wmtd][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   16.896226] -(2)[384:mtk_wmtd][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   16.896235] -(2)[384:mtk_wmtd][<ffffff8008336964>] vsnprintf+0x74/0x51c
<4>[   16.896245] -(2)[384:mtk_wmtd][<ffffff8008336f64>] snprintf+0x60/0x80
<4>[   16.896254] -(2)[384:mtk_wmtd][<ffffff8000c3a148>] dumpMemory8IEOneLine+0x100/0x178 [wlan_drv_gen2]
<4>[   16.896899] -(2)[384:mtk_wmtd][<ffffff8000c75680>] wlanSubModInit+0x770/0x1128 [wlan_drv_gen2]
<4>[   16.897631] -(2)[384:mtk_wmtd][<ffffff8000c9b464>] kalP2PReachMaxClients+0x3b4/0x4c0 [wlan_drv_gen2]
<4>[   16.898332] -(2)[384:mtk_wmtd][<ffffff8000ae75d0>] wmt_func_wifi_ctrl+0x290/0x648 [wmt_drv]
<4>[   16.898650] -(2)[384:mtk_wmtd][<ffffff8000aec7a0>] wmt_core_reg_rw_raw+0xe88/0x11c0 [wmt_drv]
<4>[   16.898960] -(2)[384:mtk_wmtd][<ffffff8000ae9a70>] wmt_core_opid_handler+0x20/0x50 [wmt_drv]
<4>[   16.899248] -(2)[384:mtk_wmtd][<ffffff8000ae9af8>] wmt_core_opid+0x58/0x78 [wmt_drv]
<4>[   16.899535] -(2)[384:mtk_wmtd][<ffffff8000af6d8c>] wmt_lib_set_current_op+0x2ac/0x340 [wmt_drv]
<4>[   16.899858] -(2)[384:mtk_wmtd][<ffffff80080be9f0>] kthread+0xf0/0xf8
<4>[   16.899876] -(2)[384:mtk_wmtd][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[   16.900492]  (2)[384:mtk_wmtd]---[ end trace e335f74a8dfe3614 ]---
<6>[   16.900550] [wlan][52:65:67:49:6e:66],Len:952:[b0,35,0b,71,32,7e,00,00,00,00,00,00,00,00,2c,2c,00,00,25,25,25,25,25,25,25,25,25,25,25,24,25,25,25,25,25,24,22,22,22,22,22,22,22,22,22,20,20,20,22,22,22,20,20,20,00,00,00,00,00,00,00,00,00,00,01,20,18,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,01,01,01,26,1e,1a,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,01,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,<7>[   16.903274]  (2)[6:kworker/u8:0][charger_manager_get_charger_temperature] No cable in, skip it
<6>[   16.911240]  (3)[384:mtk_wmtd][wlan]kalFirmwareImageMapping:(INIT INFO) FW WIFI_RAM_CODE_6755: request done [0]
<6>[   16.911325]  (3)[384:mtk_wmtd][wlan]nicAllocateAdapterMemory:(NIC INFO) Allocating 4096 bytes for COMMON MGMT MEMORY POOL.
<6>[   16.911521]  (3)[384:mtk_wmtd][wlan]nicAllocateAdapterMemory:(NIC INFO) Allocating 431600 bytes for SW_RFB_T.
<6>[   16.911610]  (3)[384:mtk_wmtd][wlan]nicAllocateAdapterMemory:(NIC INFO) Allocating 491520 bytes for MSDU_INFO_T.
<6>[   16.929645]  (3)[384:mtk_wmtd][wlan]wlanAdapterStart:(INIT INFO) <wifi> Start to download firmware, time=4294684220
<6>[   16.929692]  (3)[924:kworker/u8:6][wlan]wlanDumpMcuChipId:(INIT INFO) Offset:0x8, Value:0x00000699 
<4>[   16.933139]  (3)[924:kworker/u8:6]=====FG=====::  battery_current =-431 
<5>[   16.933179]  (3)[924:kworker/u8:6][mt6357_get_auxadc_value] ch_idx = 2, channel = 3, bat_cur = 431, reg_val = 0x5f1, adc_result = 668
<3>[   17.002969]  (0)[824:system_server]BOOTPROF:     17002.967040:SystemServer:ConnectivityService systemReady
<3>[   17.021116]  (0)[824:system_server]BOOTPROF:     17021.114886:SystemServer:NetworkPolicyManagerServ systemReady
<6>[   17.027237]  (1)[1083:watchdog]AEEIOCTL_RT_MON_Kick ( 300)
<6>[   17.029296]  (1)[1083:watchdog][Hang_Detect] hang_detect enabled 10
<5>[   17.070179]  (0)[824:system_server]alarm_dev: alarm 2 set 49238.307000000
<5>[   17.070219] -(0)[824:system_server]alarmtimer_enqueue, 49238307000000
<5>[   17.070748]  (0)[824:system_server]alarm_dev: alarm 3 set 16.858000000
<5>[   17.070881]  (0)[824:system_server]alarm_dev: alarm 2 set 76.081000000
<5>[   17.070903] -(0)[824:system_server]alarmtimer_enqueue, 76081000000
<5>[   17.070917]  (0)[824:system_server]alarm_dev: alarm 3 set 38.292000000
<6>[   17.199378]  (1)[384:mtk_wmtd][wlan]wlanAdapterStart:(INIT INFO) <wifi> Download FW done, total cnt11=219 spend time=268
<6>[   17.199428]  (1)[384:mtk_wmtd][wlan]wlanAdapterStart:(INIT INFO) <wifi> send Wi-Fi Start command
<4>[   17.211565]  (0)[382:mtk_stp_btm][STP-BTM] [I]_stp_btm_proc: pOp(ffffff8000b8b1a8):9
<4>[   17.245772]  (1)[384:mtk_wmtd][STPDbg]stp_dbg_set_wifiver: wifiver(65710b01)
<6>[   17.245805]  (1)[384:mtk_wmtd][wlan]wlanQueryNicCapability:(INIT INFO) <wifi> ProductID: 0x6571 FwVer: 0xb01.74 DriVer:11_70_20170324_1_TC10
<6>[   17.247587]  (1)[384:mtk_wmtd][wlan]wlanUpdateNetworkAddress:(INIT INFO) Using host-supplied MAC address
<6>[   17.247631]  (1)[384:mtk_wmtd][wlan]kalIndicateStatusAndComplete:(AIS INFO) [wifi] wlan%d netif_carrier_off
<6>[   17.247907]  (1)[384:mtk_wmtd][wlan]scnInit:(SCN INFO) ->scnInit()
<6>[   17.248165]  (1)[384:mtk_wmtd][wlan]wlanLoadManufactureData:(INIT INFO) current NVRAMSize :1024 and extend Size:1024
<6>[   17.248215]  (1)[384:mtk_wmtd][wlan]wlanLoadManufactureData:(INIT INFO) HW_Dis(0), TxPwrValid(1)
<6>[   17.248228]  (1)[384:mtk_wmtd][wlan]wlanLoadManufactureData:(INIT INFO) NVRAM 5G Enable(1) SW_En(0) HW_Dis(0) CountryCode(0x43 0x4e)
<6>[   17.248251]  (1)[384:mtk_wmtd][wlan]rlmDomainSendPwrLimitCmd:(RLM INFO) Domain: ValidCC =CN, ChNum=41
<6>[   17.248268]  (1)[384:mtk_wmtd][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d operating channels enable:0 size:0 channels:0
<6>[   17.248277]  (1)[384:mtk_wmtd][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:52
<6>[   17.248284]  (1)[384:mtk_wmtd][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:56
<6>[   17.248290]  (1)[384:mtk_wmtd][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:60
<6>[   17.248297]  (1)[384:mtk_wmtd][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:64
<6>[   17.248303]  (1)[384:mtk_wmtd][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:100
<6>[   17.248310]  (1)[384:mtk_wmtd][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:104
<6>[   17.248316]  (1)[384:mtk_wmtd][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:108
<6>[   17.248323]  (1)[384:mtk_wmtd][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:112
<6>[   17.248329]  (1)[384:mtk_wmtd][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:116
<6>[   17.248335]  (1)[384:mtk_wmtd][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:120
<6>[   17.248342]  (1)[384:mtk_wmtd][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:124
<6>[   17.248348]  (1)[384:mtk_wmtd][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:128
<6>[   17.248354]  (1)[384:mtk_wmtd][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:132
<6>[   17.248361]  (1)[384:mtk_wmtd][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:136
<6>[   17.248367]  (1)[384:mtk_wmtd][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:140
<6>[   17.263576]  (3)[1113:tx_thread][wlan]tx_thread:(INIT INFO) tx_thread starts running...
<6>[   17.269056]  (3)[1113:tx_thread][wlan]wlanProcessCommandQueue:(TX INFO) No TC4 resource to send cmd, CID=0x31, SEQ=229, CMD type=1, OID=0
<6>[   17.275644]  (0)[1113:tx_thread][wlan]wlanProcessCommandQueue:(TX INFO) No TC4 resource to send cmd, CID=0x13, SEQ=232, CMD type=1, OID=0
<6>[   17.278117]  (0)[1113:tx_thread][wlan]wlanProcessCommandQueue:(TX INFO) No TC4 resource to send cmd, CID=0x36, SEQ=233, CMD type=1, OID=0
<6>[   17.278294]  (0)[1113:tx_thread][wlan]wlanProcessCommandQueue:(TX INFO) No TC4 resource to send cmd, CID=0xc1, SEQ=235, CMD type=1, OID=1
<4>[   17.279451]  (0)[382:mtk_stp_btm][STP-BTM] [I]_stp_btm_proc: pOp(ffffff8000b8b2e0):9
<6>[   17.279744]  (1)[384:mtk_wmtd][wlan]wlanProbe:(INIT INFO) MAC address: b0:35:0b:71:32:7e 
<6>[   17.279848]  (1)[384:mtk_wmtd][wlan]wlanFwFileCfg:(INIT INFO) read wifi_fw.cfg :/data/system/wifi_fw.cfg
<6>[   17.279933]  (1)[384:mtk_wmtd][wlan]wlanProbe:(INIT INFO) FW File Cfg done!
<6>[   17.282037]  (1)[384:mtk_wmtd][MTK-WIFI] register_set_p2p_mode_handler: (pid 384) register set p2p mode handler ffffff8000c73d08
<4>[   17.282132]  (1)[384:mtk_wmtd][WMT-FUNC][W]wmt_func_wifi_on:WMT-FUNC: wmt call wlan probe ok
<4>[   17.282149]  (1)[384:mtk_wmtd][WMT-CORE][I]wmt_core_dump_func_state:[AF FUNC ON]status(b:0 f:0 g:0 w:2 lpbk:2 coredump:0 wmt:2 ant:0 sd1:0 sd2:0 stp:0)
<4>[   17.284112]  (0)[351:android.hardwar][HIF-SDIO][I]mtk_wcn_wmt_func_ctrl:OPID(3) type(3) ok
<6>[   17.284143]  (0)[351:android.hardwar][MTK-WIFI] WIFI_write: WMT turn on WIFI success!
<4>[   17.284161]  (1)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b786d8):15-0-1,0,0,0
<6>[   17.284174]  (0)[351:android.hardwar][MTK-WIFI] WIFI_close: major 153 minor 0 (pid 351)
<4>[   17.287355]  (1)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b775c8):15-0-2,0,0,0
<14>[   17.287454]  (0)[1:init]init: PropSet [wlan.driver.status]=[ok] Done
<4>[   17.289209]  (1)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b77700):15-0-3,0,0,0
<4>[   17.289653]  (0)[6:kworker/u8:0][HIF-SDIO][I]wmt_dev_tm_temp_query:[Thermal] current_temp = 0x1b
<4>[   17.289765]  (1)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b77490):26-0-ffffff8000b76540,35,0,0
<6>[   17.290095]  (0)[351:android.hardwar][MTK-WIFI] WIFI_open: major 153 minor 0 (pid 351)
<6>[   17.290136]  (0)[351:android.hardwar][MTK-WIFI] WIFI_write: WIFI_write STA
<6>[   17.290148]  (0)[351:android.hardwar][wlan]set_p2p_mode_handler:(INIT INFO) 1 0
<6>[   17.290257]  (0)[1113:tx_thread][wlan]wlanReadFwInfoFromEmi:(RX WARN) Invalid PreIdx, reset PreIdx to 33
<6>[   17.290272]  (0)[1113:tx_thread][wlan]nicRxProcessEventPacket:(RX INFO) [F-L]Recv EvtDrvnLog FwCust:1 DriverSupport:9 Eng:0 ln:33
<6>[   17.290272] 
<6>[   17.290298]  (0)[1113:tx_thread][wlan]wlanoidSetP2pMode:(P2P INFO) Set P2P enable ffffffc02c1efcf0 [1] mode[0]
<6>[   17.290545]  (0)[1113:tx_thread][wlan]rlmActivateNetwork:(RLM INFO) rlm: active=0, Type=1, Src=0, SrcVal=0
<6>[   17.290571]  (0)[1113:tx_thread][wlan]p2pFsmStateTransition:(P2P STATE) [22] TRANSITION: [0] -> [0]
<6>[   17.290772]  (0)[351:android.hardwar][wlan]p2pInit:(P2P INFO) dev name=p2p0
<4>[   17.293054]  (1)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b77970):26-0-ffffff8000b76540,3f,0,0
<4>[   17.294044]  (1)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b77838):26-0-ffffff8000b76540,42,0,0
<4>[   17.295404]  (1)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b77aa8):26-0-ffffff8000b76540,3e,0,0
<6>[   17.296242]  (0)[351:android.hardwar][MTK-WIFI] WIFI_write: Set wlan mode 0 --> 2
<6>[   17.297169]  (0)[351:android.hardwar][MTK-WIFI] WIFI_close: major 153 minor 0 (pid 351)
<6>[   17.297709]  (0)[1113:tx_thread][wlan]wlanoidSetPacketFilter:(REQ INFO) [MC debug] u4PacketFilter=a, IsSuspend=0
<6>[   17.297754]  (0)[1113:tx_thread][wlan]wlanoidSetCurrentPacketFilter:(REQ INFO) [MC debug] u4OsPacketFilter=a
<6>[   17.299161]  (0)[1113:tx_thread][wlan]wlanoidSet802dot11PowerSaveProfile:(OID INFO) Set Wi-Fi PS mode to CAM (0)
<6>[   17.299385]  (0)[351:android.hardwar]IPv6: ADDRCONF(NETDEV_UP): wlan0: link is not ready
<6>[   17.301647]  (0)[1113:tx_thread][wlan]wlanoidSetPacketFilter:(REQ INFO) [MC debug] u4PacketFilter=a, IsSuspend=0
<6>[   17.301685]  (0)[1113:tx_thread][wlan]wlanoidSetCurrentPacketFilter:(REQ INFO) [MC debug] u4OsPacketFilter=a
<4>[   17.321011]  (2)[380:mtk_stp_psm][STP-PSM] [I]_stp_psm_proc: pOp(ffffff8000b74630):0
<4>[   17.321086]  (1)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b77be0):7-0-0,ffffff8000ae0e50,0,0
<3>[   17.408453]  (0)[824:system_server]BOOTPROF:     17408.450810:SystemServer:PhaseThirdPartyAppsCanStart
<6>[   17.412310]  (2)[1113:tx_thread][wlan]wlanoidSetPacketFilter:(REQ INFO) [MC debug] u4PacketFilter=a, IsSuspend=0
<6>[   17.412348]  (2)[1113:tx_thread][wlan]wlanoidSetCurrentPacketFilter:(REQ INFO) [MC debug] u4OsPacketFilter=a
<14>[   17.416954]  (0)[1:init]init: [PropSet]: pid:469 uid:1010 gid:1010 ctl.start, wpa_supplicant
<14>[   17.419098]  (0)[1:init]init: starting service 'wpa_supplicant'...
<14>[   17.435642]  (3)[1131:init]init: Created socket '/dev/socket/wpa_wlan0', mode 660, user 1010, group 1010
<3>[   17.451013]  (3)[824:system_server]BOOTPROF:     17451.011964:AP_Init:[added application]:[com.mediatek.ims]:[com.mediatek.ims]:pid:1133:(PersistAP)
<3>[   17.490341]  (3)[824:system_server]BOOTPROF:     17490.339733:AP_Init:[added application]:[com.android.phone]:[com.android.phone]:pid:1142:(PersistAP)
<5>[   17.652881]  (3)[374:vendor.mediatek][Power/PPM] (0x40)(-1)(0)(0-3)(0)(0)(4)(4) 
<7>[   17.655761]  (3)[374:vendor.mediatek][Boost Controller]kicker:0, boost:1100, final:1100, current:1100
<7>[   17.655955] FBT:exit game mode<6>[   17.677930]  (1)[1131:wpa_supplicant][wlan]mtk_cfg80211_flush_pmksa:(REQ INFO) --> mtk_cfg80211_flush_pmksa()
<3>[   17.678054]  (0)[824:system_server]BOOTPROF:     17678.053349:AP_Init:[activity]:[com.android.settings]:[com.android.settings/.FallbackHome]:pid:1174
<6>[   17.712299]  (2)[1131:wpa_supplicant][wlan]mtk_p2p_cfg80211_change_iface:(P2P INFO) mtk_p2p_cfg80211_change_iface. type: 2
<6>[   17.712393]  (1)[1113:tx_thread][wlan]nicUpdateBss:(NIC INFO) nicUpdateBss eNetworkTypeIdx: 1
<6>[   17.712610]  (1)[1113:tx_thread][wlan]wlanoidSetPacketFilter:(REQ INFO) [MC debug] u4PacketFilter=4000000a, IsSuspend=0
<6>[   17.713826]  (1)[1113:tx_thread][wlan]qmHandleEventBssAbsencePresence:(QM INFO) NAF=1,0,0
<6>[   17.718371]  (2)[1131:wpa_supplicant][wlan]mtk_p2p_cfg80211_set_power_mgmt:(P2P INFO) mtk_p2p_cfg80211_set_power_mgmt ps=0.
<6>[   17.720086]  (2)[1131:wpa_supplicant]IPv6: ADDRCONF(NETDEV_UP): p2p0: link is not ready
<3>[   17.738066]  (0)[824:system_server]Dump cpuinfo
<3>[   17.744445]  (0)[824:system_server]BOOTPROF:     17744.444195:Android:SysServerInit_END
<3>[   17.783037]  (3)[1059:webview_zygote3]Dump cpuinfo
<14>[   17.827109]  (1)[1:init]init: Service 'nvram_daemon' (pid 481) exited with status 0
<6>[   17.906851]  (1)[1113:tx_thread][wlan]wlanoidSetPacketFilter:(REQ INFO) [MC debug] u4PacketFilter=4000000a, IsSuspend=0
<6>[   17.923468]  (1)[1113:tx_thread][wlan]wlanoidSetPacketFilter:(REQ INFO) [MC debug] u4PacketFilter=4000000e, IsSuspend=0
<6>[   17.926326]  (0)[1113:tx_thread][wlan]wlanoidSetPacketFilter:(REQ INFO) [MC debug] u4PacketFilter=4000000a, IsSuspend=0
<6>[   17.935039]  (1)[1113:tx_thread][wlan]wlanoidSetPacketFilter:(REQ INFO) [MC debug] u4PacketFilter=4000000e, IsSuspend=0
<6>[   17.937434]  (1)[1131:wpa_supplicant][wlan]wlanHandleSystemResume:(INIT INFO) ************wlan System Resume.
<6>[   17.938980]  (1)[1131:wpa_supplicant][wlan]wlanHandleSystemResume:(INIT INFO) ip is not avalible.
<6>[   17.939019]  (1)[1131:wpa_supplicant][wlan]wlanHandleSystemResume:(INIT INFO) Query BSS result: 1 0 0, IP: 0.0.0.0, rStatus: 3221225473
<6>[   17.939257]  (0)[1131:wpa_supplicant][wlan]p2pHandleSystemResume:(P2P INFO) ip is not available.
<6>[   17.939400]  (0)[1131:wpa_supplicant][wlan]wlanDoIOCTL:(INIT INFO) wlanDoIOCTL Cmd= 0x89f1
<6>[   17.939424]  (0)[1131:wpa_supplicant][wlan]priv_support_driver_cmd:(REQ INFO) priv_support_driver_cmd: driver cmd "SETSUSPENDMODE 0" on wlan0
<6>[   17.940324]  (1)[1113:tx_thread][wlan]wlanoidSet802dot11PowerSaveProfile:(OID INFO) Set Wi-Fi PS mode to FAST PS (2)
<7>[   18.244985]  (2)[374:vendor.mediatek][Boost Controller]kicker:0, boost:1100, final:1100, current:1100
<7>[   18.245702] FBT:exit game mode<3>[   18.252759]  (1)[883:ActivityManager]BOOTPROF:     18252.757196:AMS:ENABLE_SCREEN
<5>[   18.254946]  (1)[374:vendor.mediatek][Power/PPM] (0x0)(-1)(0)(0-3)(15)(0)(4)(4) 
<7>[   18.256805]  (0)[890:android.display][Boost Controller]kicker:0, boost:0, final:0, current:0
<3>[   18.258178]  (0)[890:android.display]BOOTPROF:     18258.176119:AP_Launch: com.android.settings/.FallbackHome 582ms
<36>[   18.328785]  (0)[323:logd.auditd]type=1400 audit(1550035178.590:14): avc: denied { dac_read_search } for pid=384 comm="mtk_wmtd" capability=2 scontext=u:r:kernel:s0 tcontext=u:r:kernel:s0 tclass=capability permissive=0
<36>[   18.328835]  (0)[323:logd.auditd]type=1400 audit(1550035180.026:15): avc: denied { read } for pid=1059 comm="main" name="uptime" dev="proc" ino=4026532061 scontext=u:r:webview_zygote:s0 tcontext=u:object_r:proc:s0 tclass=file permissive=0
<6>[   18.405017]  (2)[473:kworker/2:2]usb_state<DISCONNECTED>
<14>[   18.582546]  (0)[1:init]init: PropSet [af.recovery.mic_mute_on]=[0] Done
<14>[   18.985530]  (1)[1:init]init: PropSet [persist.radio.airplane.mode.on]=[false] Done
<3>[   19.233991]  (2)[883:ActivityManager]BOOTPROF:     19233.989737:AP_Init:[broadcast]:[com.mediatek.ppl]:[com.mediatek.ppl/.PplReceiver]:pid:1353
<14>[   19.368192]  (1)[1:init]init: PropSet [persist.radio.cellular_ps_reg]=[0] Done
<3>[   19.425572]  (3)[1188:Binder:824_8]BOOTPROF:     19425.569507:AP_Init:[broadcast]:[com.android.cellbroadcastreceiver]:[com.android.cellbroadcastreceiver/.CellBroadcastReceiver]:pid:1376
<5>[   19.825567]  (3)[374:vendor.mediatek][Power/PPM] (0x40)(-1)(0)(0-3)(0)(0)(4)(4) 
<7>[   19.828387]  (3)[1414:initCamdevice][ISP]- E. UserCount: 0.
<7>[   19.828687] [ISP]- X. Ret: 0. UserCount: 1.<7>[   19.828839]  (3)[1414:initCamdevice][imgsensor]imgsensor_clk_enable_all_cg
<7>[   19.828978]  (3)[1414:initCamdevice][imgsensor]imgsensor_open 1
<7>[   19.831568]  (2)[768:HwBinder:472_2][ISP]- E. UserCount: 1.
<7>[   19.831594] [ISP]- X. Ret: 0. UserCount: 2.<7>[   19.831862]  (3)[1414:initCamdevice][imgsensor]imgsensor_open 2
<7>[   19.832371]  (2)[768:HwBinder:472_2][ISP]- E. UserCount: 2.
<7>[   19.832396] [ISP]- X. Ret: 0. UserCount: 3.<7>[   19.833535]  (0)[1414:initCamdevice][imgsensor]sensor_idx 0, power 1 curr_sensor_name s5k4h7_mipi_raw
<7>[   19.833578]  (0)[1414:initCamdevice][imgsensor]sensor_idx = 0, pin=7, pin_state_on=11, hw_id =2(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   19.833640]  (0)[1414:initCamdevice][imgsensor]sensor_idx = 0, pin=1, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   19.833666]  (0)[1414:initCamdevice][imgsensor]sensor_idx = 0, pin=2, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   19.833683]  (0)[1414:initCamdevice][imgsensor]sensor_idx = 0, pin=3, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<6>[   19.833708]  (0)[1414:initCamdevice]ldo vcama enable
<7>[   19.842051]  (0)[1414:initCamdevice][imgsensor]sensor_idx = 0, pin=4, pin_state_on=3, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<6>[   19.842102]  (0)[1414:initCamdevice]ldo vcamd enable
<7>[   19.844143]  (0)[1414:initCamdevice][imgsensor]sensor_idx = 0, pin=5, pin_state_on=7, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<6>[   19.844211]  (0)[1414:initCamdevice]ldo vcamio enable
<7>[   19.846864]  (0)[1414:initCamdevice][imgsensor]sensor_idx = 0, pin=6, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   19.849510]  (0)[1414:initCamdevice][imgsensor]sensor_idx = 0, pin=2, pin_state_on=11, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   19.852486]  (0)[1414:initCamdevice][imgsensor]sensor_idx = 0, pin=1, pin_state_on=11, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   19.895632]  (0)[1414:initCamdevice][imgsensor][kdCISModulePowerOn]Profile = 62099 us
<6>[   19.898803]  (0)[1414:initCamdevice]i2c i2c-2: addr: 10, transfer ACK error
<3>[   19.898867]  (0)[1414:initCamdevice]I2C read failed (0x0)! speed(0=400) (0x0)
<6>[   19.899663]  (0)[1414:initCamdevice]i2c i2c-2: addr: 10, transfer ACK error
<3>[   19.899717]  (0)[1414:initCamdevice]I2C read failed (0x0)! speed(0=400) (0x0)
<4>[   19.899727]  (0)[1414:initCamdevice]abc[open] Read sensor id fail, write id: 0x20, sensor id = 0x0
<6>[   19.902443]  (0)[1414:initCamdevice]i2c i2c-2: addr: 10, transfer ACK error
<3>[   19.902511]  (0)[1414:initCamdevice]I2C read failed (0x0)! speed(0=400) (0x0)
<6>[   19.903134]  (0)[1414:initCamdevice]i2c i2c-2: addr: 10, transfer ACK error
<3>[   19.903206]  (0)[1414:initCamdevice]I2C read failed (0x0)! speed(0=400) (0x0)
<4>[   19.903217]  (0)[1414:initCamdevice]abc[open] Read sensor id fail, write id: 0x20, sensor id = 0x0
<4>[   19.903723]  (0)[1414:initCamdevice]abc[open] i2c write id: 0x5a, sensor id: 0x487b
<4>[   19.903759]  (0)[1414:initCamdevice][OTP] enter S5K4H7Y_otp_update
<4>[   19.991684]  (2)[1414:initCamdevice]hujl@debug:Module ID: 0x00, page:1
<4>[   19.991721]  (2)[1414:initCamdevice][OTP] enter get_otp_flag
<4>[   20.062355]  (2)[1414:initCamdevice]abc[get_otp_flag] cyxotp_flag = 4abc[get_otp_flag] cyx0A30 = 0
<4>[   20.064352]  (2)[1414:initCamdevice]abc[get_otp_flag] cyxaf_inf = 1244
<4>[   20.064385]  (2)[1414:initCamdevice]abc[get_otp_flag] cyxaf_mac = 345
<4>[   20.064392]  (2)[1414:initCamdevice]abc[get_otp_flag] group1 is valiad
<4>[   20.064654] abc[get_otp_flag] cyxaddr = 0xa05,cyxotp_info[0] = 35
<4>[   20.064654] ,abc[get_otp_flag] cyxaddr = 0xa06,cyxotp_info[1] = 19
<4>[   20.064654] ,abc[get_otp_flag] cyxaddr = 0xa07,cyxotp_info[2] = 1
<4>[   20.064654] ,abc[get_otp_flag] cyxaddr = 0xa08,cyxotp_info[3] = 17
<4>[   20.064654] ,abc[get_otp_flag] cyxaddr = 0xa09,cyxotp_info[4] = 0
<4>[   20.064654] ,abc[get_otp_flag] cyxaddr = 0xa0a,cyxotp_info[5] = 0
<4>[   20.064654] ,abc[get_otp_flag] cyxaddr = 0xa0b,cyxotp_info[6] = 0
<4>[   20.064654] ,abc[get_otp_flag] cyxaddr = 0xa0c,cyxotp_info[7] = 256
<4>[   20.064654] ,abc[get_otp_flag] cyxaddr = 0xa0d,cyxotp_info[8] = 41
<4>[   20.064654] ,abc[get_otp_flag] cyxaddr = 0xa0e,cyxotp_info[9] = 256
<4>[   20.064654] ,abc[get_otp_flag] cyxaddr = 0xa0f,cyxotp_info[10] = 38
<4>[   20.064654] ,abc[get_otp_flag] cyxaddr = 0xa10,cyxotp_info[11] = 512
<4>[   20.064654] ,abc[get_otp_flag] cyxaddr = 0xa11,cyxotp_info[12] = 1
<4>[   20.064654] ,abc[get_otp_flag] cyxaddr = 0xa12,cyxotp_info[13] = 1
 (2)[1414:initCamdevice]abc[get_otp_flag] cyxaddr = 0xa14,cyxotp_info[15] = 1
<4>[   20.071256] ,abc[get_otp_flag] cyxaddr = 0xa15,cyxotp_info[16] = 36
<4>[   20.071256] ,abc[get_otp_flag] cyxaddr = 0xa16,cyxotp_info[17] = 2
<4>[   20.071256] ,abc[get_otp_flag] cyxaddr = 0xa17,cyxotp_info[18] = 1
<4>[   20.071256] ,abc[get_otp_flag] cyx_addr_value_sum = 1259
<4>[   20.072245]  (2)[1414:initCamdevice]abc[get_otp_flag] cyx_checksum = 239
<4>[   20.072281]  (2)[1414:initCamdevice]abc[get_otp_flag] module otp check correct!
<4>[   20.072483]  (2)[1414:initCamdevice][OTP] enter otp_wb_update
<4>[   20.072511]  (2)[1414:initCamdevice][OTP] enter get_otp_wb
<4>[   20.135624]  (1)[1414:initCamdevice]hujl@debug:current_rg=0x129
<4>[   20.140662]  (2)[1414:initCamdevice]hujl@debug:current_bg=0x126
<4>[   20.140980]  (2)[1414:initCamdevice]abc[otp_wb_update] cYXr_ratio=529
<4>[   20.141010]  (2)[1414:initCamdevice]abc[otp_wb_update] cYXb_ratio=529
<4>[   20.141017]  (2)[1414:initCamdevice][OTP] enter wb_gain_set
<4>[   20.141965]  (3)[1414:initCamdevice]hujl@debug:S5K4H7Y_otp_update successful!
<7>[   20.149129]  (3)[1414:initCamdevice][imgsensor][SensorOpen]Profile = 315596 us
<7>[   20.164091]  (0)[768:HwBinder:472_2][ISP]- E. UserCount: 3.
<7>[   20.164120] [ISP]- X. UserCount: 2. (0)[768:HwBinder:472_2][ISP]- E. UserCount: 2.
<7>[   20.175638] [ISP]- X. UserCount: 1. (0)[768:HwBinder:472_2]abc[close] E
<7>[   20.176010]  (0)[768:HwBinder:472_2][imgsensor]sensor_idx 0, power 0 curr_sensor_name s5k4h7_mipi_raw
<7>[   20.206193]  (2)[768:HwBinder:472_2][imgsensor][regulator]6 is enabled
<7>[   20.207249]  (2)[768:HwBinder:472_2][imgsensor][regulator]5 is enabled
<6>[   20.207263]  (2)[768:HwBinder:472_2]ldo vcamio disable
<7>[   20.208286]  (2)[768:HwBinder:472_2][imgsensor][regulator]4 is enabled
<6>[   20.208295]  (2)[768:HwBinder:472_2]ldo vcamd disable
<7>[   20.209318]  (2)[768:HwBinder:472_2][imgsensor][regulator]3 is enabled
<6>[   20.209339]  (2)[768:HwBinder:472_2]ldo vcama disable
<7>[   20.209883]  (2)[768:HwBinder:472_2][imgsensor]imgsensor_release 1
<7>[   20.210132]  (2)[768:HwBinder:472_2][ISP]- E. UserCount: 1.
<7>[   20.210183] [ISP]- X. UserCount: 0.<7>[   20.210206]  (2)[768:HwBinder:472_2][imgsensor]imgsensor_clk_disable_all
<7>[   20.210295]  (2)[768:HwBinder:472_2][imgsensor]imgsensor_release 0
<5>[   20.212380]  (1)[374:vendor.mediatek][Power/PPM] (0x0)(-1)(0)(0-3)(15)(0)(4)(4) 
<14>[   20.262559]  (3)[1:init]init: PropSet [persist.radio.cellular_ps_reg]=[0] Done
<14>[   20.312764]  (3)[1:init]init: PropSet [persist.radio.sim.mode]=[1] Done
<14>[   20.327718]  (2)[1:init]init: PropSet [persist.radio.volte_state]=[1] Done
<6>[   20.331878]  (1)[867:RfxSender_8][ccci1/chr]port ccci_ioctl1 open with flag 20802 by RfxSender_8
<6>[   20.331925]  (1)[867:RfxSender_8][ccci1/fsm]EFUN set to 1
<6>[   20.331982]  (1)[867:RfxSender_8][ccci1/chr]port ccci_ioctl1 close rx_len=0 empty=1, clear_cnt=0, drop=0
<6>[   20.332007]  (1)[867:RfxSender_8][ccci1/pot]critical user check: 0x3
<3>[   20.347570]  (1)[50:conn-md-thread][CONN-MD-DFT][I]conn_md_log_print_msg:send message to Modem, 17.211 17.296
<4>[   20.347634]  (1)[50:conn-md-thread][STP-PSM] [I]_stp_psm_do_wait: STP is waiting state for ACT, i=1, state = 2
<4>[   20.347663]  (1)[380:mtk_stp_psm][STP-PSM] [I]_stp_psm_proc: pOp(ffffff8000b74768):1
<4>[   20.347740]  (1)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b77f88):7-0-2,ffffff8000ae0e50,0,0
<14>[   20.351060]  (0)[1:init]init: PropSet [persist.radio.sim.mode]=[1] Done
<14>[   20.363885]  (2)[1:init]init: PropSet [persist.radio.volte_state]=[1] Done
<4>[   20.369017]  (3)[50:conn-md-thread][STP-PSM] [I]_stp_psm_do_wait: +Total waits for ACT takes 21383 usec
<4>[   20.369093]  (3)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b77d18):26-0-ffffff8000b76540,41,0,0
<4>[   20.370105]  (2)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b77e50):26-0-ffffff8000b76540,35,0,0
<4>[   20.372478]  (2)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b780c0):26-0-ffffff8000b76540,41,0,0
<14>[   20.372654]  (3)[1:init]init: PropSet [ril.md_changed_apn_class.iccid0]=[] Done
<4>[   20.373469]  (3)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b781f8):26-0-ffffff8000b76540,35,0,0
<14>[   20.378465]  (3)[1:init]init: PropSet [cdma.operator.sid]=[0] Done
<4>[   20.379264]  (0)[382:mtk_stp_btm][STP-BTM] [I]_stp_btm_proc: pOp(ffffff8000b8b418):9
<4>[   20.379517]  (0)[382:mtk_stp_btm][STP-BTM] [I]_stp_btm_proc: pOp(ffffff8000b8b688):9
<4>[   20.379768]  (0)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b78330):26-0-ffffff8000b76540,3f,0,0
<14>[   20.380960]  (3)[1:init]init: PropSet [ril.md_changed_apn_class0]=[] Done
<4>[   20.386503]  (3)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b785a0):26-0-ffffff8000b76540,41,0,0
<4>[   20.387011]  (0)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b78468):26-0-ffffff8000b76540,35,0,0
<3>[   20.389048]  (1)[382:mtk_stp_btm][WMT-DFT][E]wmt_idc_msg_to_lte_handing(213):there is no coex data in stp buffer
<4>[   20.389126]  (1)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b786d8):26-0-ffffff8000b76540,3f,0,0
<4>[   20.389994]  (1)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b775c8):26-0-ffffff8000b76540,42,0,0
<6>[   20.390118]  (1)[1113:tx_thread][wlan]nicRxProcessEventPacket:(RX INFO) [F-L][430] #T#3182# Ver:0xB.1.74 CS[1,1] DIS 0x0 AC 0x117F BCN[0, 0, 0, 0, 0x0, 0x0] RCPI [255, 255, 255, 255], ROAM [0, 0, 0, 0, 255, 0, 255, 0] TXPara[0x0, 0x0, 0x31330000, 0x0, 0x0,0x0, 0x18181818, 0x82000, 0x12000000, I: (0, 0), C: (0, 0), W: 3144589 CHP: (255, 255) ], TxBASz 0, RxBASz 0  Gamemode 0 Mem 64 Dg 0, 0, 0, 0, 0, 0, Kd:0 TP(T:0 R:0)Kbps, BTOn 0, Suspend=0 Hotspot=0, TestMode 0, EB 0 <BCM>0x0(0000000) 220 4 106 110 00000000
<6>[   20.390118] 
<6>[   20.390331]  (1)[1113:tx_thread][wlan]wlanReadFwInfoFromEmi:(RX INFO) >>Addr:0xffffffc0072b2488 CurIdx:1122,PreIdx:33!
<4>[   20.390363]  (1)[1113:tx_thread][HIF-SDIO][I]wmt_lib_get_fwinfor_from_emi:vir addr(0xffffff800ef80421)
<6>[   20.390958]  (1)[1113:tx_thread][wlan]wlanDumpFwInforPrintBuff:(RX INFO) [CONNSYS][WIFI]#0#0#<INIT>EasyDbg set 115 CMD_EDCCA_THRESHOLD =0x0
<6>[   20.390988]  (1)[1113:tx_thread][wlan]wlanDumpFwInforPrintBuff:(RX INFO) [CONNSYS][WIFI]#3#1#WF Ready Init
<6>[   20.390995]  (1)[1113:tx_thread][wlan]wlanDumpFwInforPrintBuff:(RX INFO) [CONNSYS][WIFI]#33#2#<RXM>Send EID:0x9 Seq:221 Len:20
<6>[   20.391003]  (1)[1113:tx_thread][wlan]wlanDumpFwInforPrintBuff:(RX INFO) [CONNSYS][WIFI]#38#3#<RXM>Send EID:0x2 Seq:222 Len:40
<6>[   20.391010]  (1)[1113:tx_thread][wlan]wlanDumpFwInforPrintBuff:(RX INFO) [CONNSYS][WIFI]#39#4#<RXM>Send EID:0x1F Seq:223 Len:272
<6>[   20.391017]  (1)[1113:tx_thread][wlan]wlanDumpFwInforPrintBuff:(RX INFO) [CONNSYS][WIFI]#40#5#<RXM>Send EID:0x1F Seq:224 Len:272
<6>[   20.391024]  (1)[1113:tx_thread][wlan]wlanDumpFwInforPrintBuff:(RX INFO) [CONNSYS][WIFI]#71#6#WF Ready CalNo5G
<6>[   20.391031]  (1)[1113:tx_thread][wlan]wlanDumpFwInforPrintBuff:(RX INFO) [CONNSYS][WIFI]#72#7#<RXM>Send EID:0x9 Seq:235 Len:20
<6>[   20.391038]  (1)[1113:tx_thread][wlan]wlanDumpFwInforPrintBuff:(RX INFO) [CONNSYS][WIFI]#85#8#[MAC]  OWN MAC En : 1 
<6>[   20.391047]  (1)[1113:tx_thread][wlan]wlanDumpFwInforPrintBuff:(RX INFO) [CONNSYS][WIFI]#85#9#IdcMdB220 4 106 110 0 0 0 0,0 0 0 
<4>[   20.391056]  (1)[1113:tx_thread][HIF-SDIO][I]wmt_lib_get_fwinfor_from_emi:vir addr(0xffffff800ef80621)
<6>[   20.391130]  (1)[1113:tx_thread][wlan]wlanDumpFwInforPrintBuff:(RX INFO) 0,0 0 0 0,0 0 0 0,0 0 0 0
<6>[   20.391137]  (1)[1113:tx_thread][wlan]wlanDumpFwInforPrintBuff:(RX INFO) [CONNSYS][WIFI]IdcSMW2C 0x3F
<6>[   20.391143]  (1)[1113:tx_thread][wlan]wlanDumpFwInforPrintBuff:(RX INFO) [CONNSYS][WIFI]IdcSMW2C 0x3E
<6>[   20.391150]  (1)[1113:tx_thread][wlan]wlanDumpFwInforPrintBuff:(RX INFO) [CONNSYS][WIFI]IdcSMW2C 0x3E220 4 106 110 0 0 0 0,0 0 0 0,0 0 0 0,0 0 0 0,0 0 0 0
<6>[   20.391157]  (1)[1113:tx_thread][wlan]wlanDumpFwInforPrintBuff:(RX INFO) [CONNSYS][WIFI]#506#11#<SCN>bssUpdateBssInfo(),(1, 0, 1, 0, 1, 0)update
<6>[   20.391164]  (1)[1113:tx_thread][wlan]wlanDumpFwInforPrintBuff:(RX INFO) [CONNSYS][WIFI]#731#12#<RXM>Send EID:0xF9 Seq:2 Len:20
<6>[   20.391172]  (1)[1113:tx_thread][wlan]wlanDumpFwInforPrintBuff:(RX INFO) [CONNSYS][WIFI]#3166#13#IdcMdB220 4 106 110 0 0 0 0,0 0 0 0,0 0 0 0,0 0 0 0,0 0 0 0
<6>[   20.391179]  (1)[1113:tx_thread][wlan]wlanDumpFwInforPrintBuff:(RX INFO) [CONNSYS][WIFI]IdcSMW2C 0x35
<6>[   20.391186]  (1)[1113:tx_thread][wlan]wlanDumpFwInforPrintBuff:(RX INFO) [CONNSYS][WIFI]Idc wmt_on_off_event LTE:1
<6>[   20.391192]  (1)[1113:tx_thread][wlan]wlanDumpFwInforPrintBuff:(RX INFO) [CONNSYS][WIFI]IdcSC2M 0x31 (1,0,0)
<6>[   20.391200]  (1)[1113:tx_thread][wlan]wlanDumpFwInforPrintBuff:(RX INFO) [CONNSYS][WIFI]IdcSC2M 0x32(
<4>[   20.391204]  (1)[1113:tx_thread][HIF-SDIO][I]wmt_lib_get_fwinfor_from_emi:vir addr(0xffffff800ef80821)
<6>[   20.391286]  (1)[1113:tx_thread][wlan]wlanDumpFwInforPrintBuff:(RX INFO) 0 0 0 0)
<6>[   20.391292]  (1)[1113:tx_thread][wlan]wlanDumpFwInforPrintBuff:(RX INFO) [CONNSYS][WIFI]IdcSC2M 0x3A
<6>[   20.391302]  (1)[1113:tx_thread][wlan]wlanDumpFwInforPrintBuff:(RX INFO) [CONNSYS][WIFI]IdcSC2M 0x33
<6>[   20.391307] [wlan]wlanDumpFwInforPrintBuff:(RX INFO) <4>[   20.391316]  (1)[1113:tx_thread][HIF-SDIO][I]wmt_lib_get_fwinfor_from_emi:vir addr(0xffffff800ef80800)
<6>[   20.391323]  (1)[1113:tx_thread][wlan]wlanDumpFwInforPrintBuff:(RX INFO) 0,0)
<6>[   20.391330]  (1)[1113:tx_thread][wlan]wlanDumpFwInforPrintBuff:(RX INFO) [CONNSYS][WIFI]IdcSC2M 0x32(0 0 0 0)
<6>[   20.391337]  (2)[1:init][wlan]wlanDumpFwInforPrintBuff:(RX INFO) [CONNSYS][WIFI]IdcSC2M 
<14>[   20.408707]  (2)[1:init]init: PropSet [cdma.prl.version0]=[302] Done
<4>[   20.421741]  (3)[380:mtk_stp_psm][STP-PSM] [I]_stp_psm_proc: pOp(ffffff8000b74c48):0
<14>[   20.442183]  (2)[1:init]init: PropSet [ril.imsi.status.sim1]=[0] Done
<14>[   20.458510]  (1)[1:init]init: PropSet [persist.radio.data.iccid]=[] Done
<14>[   20.466037]  (1)[1:init]init: PropSet [net.lte.ims.data.enabled0]=[true] Done
<6>[   20.469789]  (0)[867:RfxSender_8][ccci1/chr]port ccci_ioctl1 open with flag 20802 by RfxSender_8
<6>[   20.469826]  (0)[867:RfxSender_8][ccci1/fsm]EFUN set to 1
<6>[   20.469868]  (0)[867:RfxSender_8][ccci1/chr]port ccci_ioctl1 close rx_len=0 empty=1, clear_cnt=0, drop=0
<6>[   20.469890]  (0)[867:RfxSender_8][ccci1/pot]critical user check: 0x3
<14>[   20.478768]  (1)[1:init]init: PropSet [persist.radio.volte_state]=[1] Done
<14>[   20.613816]  (1)[1:init]init: PropSet [persist.radio.sim.mode]=[1] Done
<14>[   20.779174]  (3)[1:init]init: PropSet [persist.radio.sim.mode]=[1] Done
<4>[   20.860872] -(1)[0:swapper/1]Power/swap DP: No enter --- SODI3: No enter --- SODI: No enter --- 
<14>[   20.897915]  (1)[1:init]init: PropSet [persist.radio.sim.mode]=[1] Done
<14>[   20.905732]  (1)[1:init]init: PropSet [ril.imsi.status.sim1]=[0] Done
<6>[   21.023643] -(0)[0:swapper/0]mcdi cpu: 30, 57, 39, 39, cluster : 0, pause = 0, multi core = 0, residency = 0, last core = 0, avail cpu = 000f, cluster = 0001, enabled = 1, max_s_state = 5, system_idle_hint = 00000000
<6>[   21.023643] 
<7>[   21.144970]  (0)[240:wdtk-0][wdk-c] cpu=0,lbit=0x3,cbit=0xf,3,1,1145509463,[21144957742]
<7>[   21.145005]  (0)[240:wdtk-0][thread:240][RT:21144998280] 2019-02-13 05:19:42.848680 UTC;android time 2019-02-13 13:19:42.848680
<7>[   21.149003]  (2)[242:wdtk-2][wdk-c] cpu=2,lbit=0x7,cbit=0xf,3,1,1145509463,[21148989665]
<4>[   21.149006]  (3)[243:wdtk-3][wdk-k] cpu=3,lbit=0xf,cbit=0xf,3,1,1145509463,[21149001049]
<7>[   21.156982]  (1)[241:wdtk-1][wdk-c] cpu=1,lbit=0x2,cbit=0xf,3,1,1145509463,[21156974357]
<5>[   21.213440]  (3)[374:vendor.mediatek][Power/PPM] (0x40)(-1)(0)(0-3)(0)(0)(4)(4) 
<7>[   21.218426]  (3)[1450:initCamdevice][ISP]- E. UserCount: 0.
<7>[   21.218692] [ISP]- X. Ret: 0. UserCount: 1.<7>[   21.218811]  (3)[1450:initCamdevice][imgsensor]imgsensor_clk_enable_all_cg
<7>[   21.218869]  (3)[1450:initCamdevice][imgsensor]imgsensor_open 1
<7>[   21.220033]  (3)[1450:initCamdevice][imgsensor]imgsensor_open 2
<7>[   21.221480]  (3)[1450:initCamdevice][imgsensor]sensor_idx 1, power 1 curr_sensor_name n5600_yuv
<7>[   21.221538]  (3)[1450:initCamdevice][imgsensor]sensor_idx = 1, pin=7, pin_state_on=11, hw_id =2(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   21.221566]  (3)[1450:initCamdevice][imgsensor]sensor_idx = 1, pin=5, pin_state_on=7, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<6>[   21.221586]  (3)[1450:initCamdevice]ldo vcamio enable
<7>[   21.222016]  (3)[1450:initCamdevice][imgsensor]sensor_idx = 1, pin=3, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<6>[   21.222050]  (3)[1450:initCamdevice]ldo vcama enable
<7>[   21.222520]  (3)[1450:initCamdevice][imgsensor]sensor_idx = 1, pin=4, pin_state_on=3, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<6>[   21.222550]  (3)[1450:initCamdevice]ldo vcamd enable
<7>[   21.222994]  (3)[1450:initCamdevice][imgsensor]sensor_idx = 1, pin=6, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<3>[   21.223020]  (3)[1450:initCamdevice][regulator]fail to regulator_set_voltage, powertype:6 powerId:2800000
<7>[   21.225244]  (3)[1450:initCamdevice][imgsensor]sensor_idx = 1, pin=1, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   21.225297]  (3)[1450:initCamdevice][imgsensor]sensor_idx = 1, pin=1, pin_state_on=11, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   21.225313]  (3)[1450:initCamdevice][imgsensor]sensor_idx = 1, pin=2, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   21.225326]  (3)[1450:initCamdevice][imgsensor]sensor_idx = 1, pin=2, pin_state_on=11, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   21.241297]  (1)[1450:initCamdevice][imgsensor][kdCISModulePowerOn]Profile = 19818 us
<4>[   21.241323]  (1)[1450:initCamdevice]yyyyy=== [n5600_yuv]: [n5600_hsm_ioctl]N5600Open_start 
<4>[   21.241571]  (3)[1450:initCamdevice]yyyyy=== [n5600_yuv]: Read Sensor Reg 0x13 0xff
<4>[   21.251822]  (3)[1450:initCamdevice]N5600_Sensor_Driver_Init
<4>[   21.251848]  (3)[1450:initCamdevice]yyyyy=== [n5600_yuv]: N5600Open_end 
<7>[   21.251857]  (3)[1450:initCamdevice][imgsensor][SensorOpen]Profile = 30378 us
<7>[   21.252100]  (3)[1450:initCamdevice][ISP]- E. UserCount: 1.
<7>[   21.252121] [ISP]- X. Ret: 0. UserCount: 2.<7>[   21.266737]  (2)[768:HwBinder:472_2]flashlight: flashlight_open: Open(0,0,0)
<6>[   21.266779]  (2)[768:HwBinder:472_2]flashlight: _flashlight_ioctl: Find no flashlight device
<7>[   21.266802]  (2)[768:HwBinder:472_2]flashlight: flashlight_release: Release(0,0,0)
<7>[   21.266841]  (2)[768:HwBinder:472_2]flashlight: flashlight_open: Open(0,0,0)
<6>[   21.266853]  (2)[768:HwBinder:472_2]flashlight: _flashlight_ioctl: Find no flashlight device
<6>[   21.266864]  (2)[768:HwBinder:472_2]flashlight: _flashlight_ioctl: Find no flashlight device
<7>[   21.266873]  (2)[768:HwBinder:472_2]flashlight: flashlight_release: Release(0,0,0)
<4>[   21.266902]  (2)[768:HwBinder:472_2][n5600_hsm] N5600FeatureControl id 3048
<4>[   21.266910]  (2)[768:HwBinder:472_2]GET_EV_AWB_REF3048
<4>[   21.269416]  (3)[768:HwBinder:472_2][n5600_hsm] N5600FeatureControl id 3060
<4>[   21.269448]  (3)[768:HwBinder:472_2][n5600_hsm_ioctl] N5600FeatureControl id 3060
<4>[   21.269455]  (3)[768:HwBinder:472_2]yyyyy=== hsm_ioctl cmd = 3060, HSM_IIC_READ_MIPI = 3222165198 
<4>[   21.269462]  (3)[768:HwBinder:472_2]yyyyy=== default  enter 
<4>[   21.269480]  (3)[768:HwBinder:472_2][n5600_hsm] N5600FeatureControl id 3050
<4>[   21.269487]  (3)[768:HwBinder:472_2][n5600_hsm_ioctl] N5600FeatureControl id 3050
<4>[   21.269493]  (3)[768:HwBinder:472_2]yyyyy=== hsm_ioctl cmd = 3050, HSM_IIC_READ_MIPI = 3222165198 
<4>[   21.269500]  (3)[768:HwBinder:472_2]yyyyy=== default  enter 
<4>[   21.269510]  (3)[768:HwBinder:472_2][n5600_hsm] N5600FeatureControl id 3051
<4>[   21.269516]  (3)[768:HwBinder:472_2][n5600_hsm_ioctl] N5600FeatureControl id 3051
<4>[   21.269522]  (3)[768:HwBinder:472_2]yyyyy=== hsm_ioctl cmd = 3051, HSM_IIC_READ_MIPI = 3222165198 
<4>[   21.269528]  (3)[768:HwBinder:472_2]yyyyy=== default  enter 
<7>[   21.301087]  (0)[768:HwBinder:472_2][ISP]- E. UserCount: 2.
<7>[   21.301116] [ISP]- X. UserCount: 1. (0)[768:HwBinder:472_2]yyyyy=== [n5600_yuv]: N5600Close
<7>[   21.301423]  (0)[768:HwBinder:472_2][imgsensor]sensor_idx 1, power 0 curr_sensor_name n5600_yuv
<7>[   21.308478]  (0)[768:HwBinder:472_2][imgsensor][regulator]6 is enabled
<7>[   21.308510]  (0)[768:HwBinder:472_2][imgsensor][regulator]4 is enabled
<6>[   21.308518]  (0)[768:HwBinder:472_2]ldo vcamd disable
<7>[   21.308538]  (0)[768:HwBinder:472_2][imgsensor][regulator]3 is enabled
<6>[   21.308544]  (0)[768:HwBinder:472_2]ldo vcama disable
<7>[   21.308560]  (0)[768:HwBinder:472_2][imgsensor][regulator]5 is enabled
<6>[   21.308566]  (0)[768:HwBinder:472_2]ldo vcamio disable
<7>[   21.309951]  (3)[768:HwBinder:472_2][imgsensor]imgsensor_release 1
<7>[   21.310344]  (3)[768:HwBinder:472_2][ISP]- E. UserCount: 1.
<7>[   21.310414] [ISP]- X. UserCount: 0.<7>[   21.310446]  (3)[768:HwBinder:472_2][imgsensor]imgsensor_clk_disable_all
<7>[   21.310550]  (3)[768:HwBinder:472_2][imgsensor]imgsensor_release 0
<5>[   21.313856]  (0)[374:vendor.mediatek][Power/PPM] (0x0)(-1)(0)(0-3)(15)(0)(4)(4) 
<36>[   21.338506]  (2)[323:logd.auditd]type=1400 audit(1550035180.026:15): avc: denied { read } for pid=1059 comm="main" name="uptime" dev="proc" ino=4026532061 scontext=u:r:webview_zygote:s0 tcontext=u:object_r:proc:s0 tclass=file permissive=0
<36>[   21.338553]  (2)[323:logd.auditd]type=1400 audit(1550035183.038:16): avc: denied { read } for pid=456 comm=494D4342206D73672068616E646C65 name="u:object_r:mtk_em_video_log_vdec_prop:s0" dev="tmpfs" ino=99 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_vdec_prop:s0 tclass=file permissive=0
<3>[   21.339574]  (0)[814:IMCB msg handle]vcodec_open pid = 814, Driver_Open_Count 1
<5>[   21.343561]  (1)[814:IMCB msg handle][VcoreFS] kicker: KIR_MM, opp: 0, dvfs_opp: 0, sw_opp: 3, kr opp: 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
<5>[   21.343604]  (1)[814:IMCB msg handle][VcoreFS] opp: 0, vcore: 1150000 <= 1050000, fddr: 1344000 <= 1066000 [O][O]
<5>[   21.343624] -(1)[814:IMCB msg handle][VcoreFS] [spm_trigger_dvfs] fix: 0, opp: 0, vcore: 0xc200000, emi: 0x111001, md: 0x0
<4>[   21.345718]  (1)[814:IMCB msg handle][MMDVFS][pid=456]Fixed,set scen:(20,0x0) step:(0,0,0x100000,0x0,0x0,0x800200),C(0,0,0x0,0),I(0,0),CLK:0
<7>[   21.345813]  (1)[814:IMCB msg handle][SMI][pid=456][SMI_PROFILE]=SMI_BWC_SCEN_VENC
<3>[   21.347015]  (1)[814:IMCB msg handle]vcodec_open pid = 814, Driver_Open_Count 2
<36>[   21.353883]  (1)[323:logd.auditd]type=1400 audit(1550035183.038:16): avc: denied { read } for pid=456 comm=494D4342206D73672068616E646C65 name="u:object_r:mtk_em_video_log_vdec_prop:s0" dev="tmpfs" ino=99 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_vdec_prop:s0 tclass=file permissive=0
<36>[   21.353925]  (1)[323:logd.auditd]type=1400 audit(1550035183.054:17): avc: denied { read } for pid=456 comm=494D4342206D73672068616E646C65 name="u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=101 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
<7>[   21.354968]  (0)[814:IMCB msg handle][SMI][pid=456][SMI_PROFILE]=SMI_BWC_SCEN_NORMAL
<3>[   21.355781]  (0)[814:IMCB msg handle]vcodec_open pid = 814, Driver_Open_Count 1
<7>[   21.356273]  (0)[814:IMCB msg handle][SMI][pid=456][SMI_PROFILE]=SMI_BWC_SCEN_VENC
<3>[   21.356769]  (0)[814:IMCB msg handle]vcodec_open pid = 814, Driver_Open_Count 2
<7>[   21.363923]  (0)[814:IMCB msg handle][SMI][pid=456][SMI_PROFILE]=SMI_BWC_SCEN_NORMAL
<3>[   21.365547]  (0)[814:IMCB msg handle]vcodec_open pid = 814, Driver_Open_Count 1
<7>[   21.366073]  (0)[814:IMCB msg handle][SMI][pid=456][SMI_PROFILE]=SMI_BWC_SCEN_VENC
<3>[   21.366623]  (0)[814:IMCB msg handle]vcodec_open pid = 814, Driver_Open_Count 2
<7>[   21.372705]  (3)[814:IMCB msg handle][SMI][pid=456][SMI_PROFILE]=SMI_BWC_SCEN_NORMAL
<3>[   21.373586]  (3)[814:IMCB msg handle]vcodec_open pid = 814, Driver_Open_Count 1
<7>[   21.374058]  (3)[814:IMCB msg handle][SMI][pid=456][SMI_PROFILE]=SMI_BWC_SCEN_VENC
<3>[   21.374519]  (3)[814:IMCB msg handle]vcodec_open pid = 814, Driver_Open_Count 2
<7>[   21.379226]  (3)[814:IMCB msg handle][SMI][pid=456][SMI_PROFILE]=SMI_BWC_SCEN_NORMAL
<7>[   21.638333]  (1)[936:HwBinder:471_1]<ALS/PS> ps_store_batch 7,0,20000000,0
<7>[   21.638364]  (1)[936:HwBinder:471_1]<ALS/PS> ps_store_batch done: 0
<7>[   21.638828]  (1)[936:HwBinder:471_1]<ALS/PS> ps_store_active buf=1
<7>[   21.638853]  (1)[936:HwBinder:471_1]<ALS/PS> PS ps_power on
<3>[   21.638859]  (1)[936:HwBinder:471_1][ALS/PS] stk3x1x_obj als enable value = 1
<4>[   21.638870]  (1)[936:HwBinder:471_1]stk3x1x_enable_ps: enable=1
<3>[   21.639548]  (2)[936:HwBinder:471_1][ALS/PS] stk3x1x_enable_ps_set_thd:in reg, HT=199, LT=169
<3>[   21.639573]  (2)[936:HwBinder:471_1][ALS/PS] stk3x1x_enable_ps_set_thd:in driver, HT=199, LT=169
<5>[   21.649400]  (2)[936:HwBinder:471_1][ALS/PS] [ps_report_interrupt_data]:value=1
<5>[   21.649430]  (2)[936:HwBinder:471_1][ALS/PS]ps_data_report! 1, 3
<3>[   21.649451]  (2)[936:HwBinder:471_1][ALS/PS] stk_ps_report:ps raw 0x89 -> value 0x1 
<7>[   21.649460]  (2)[936:HwBinder:471_1]<ALS/PS> ps turn on ps_power done
<7>[   21.649466]  (2)[936:HwBinder:471_1]<ALS/PS> PS ps_power on done
<7>[   21.649471]  (2)[936:HwBinder:471_1]<ALS/PS> PS set batch
<7>[   21.649476]  (2)[936:HwBinder:471_1]<ALS/PS> ps set ODR, fifo latency done
<5>[   21.649481]  (2)[936:HwBinder:471_1][ALS/PS]ps_data_report! 1, 3
<7>[   21.649488]  (2)[936:HwBinder:471_1]<ALS/PS> PS batch done
<7>[   21.649493]  (2)[936:HwBinder:471_1]<ALS/PS>  ps_store_active done
<3>[   21.700536]  (3)[926:kworker/u8:7][ALS/PS] stk_ps_tune_zero_func_fae: update psa: psa=137,psi=65535
<3>[   21.700565]  (3)[926:kworker/u8:7][ALS/PS] stk_ps_tune_zero_func_fae: update psi: psa=137,psi=137
<3>[   21.760472]  (0)[924:kworker/u8:6][ALS/PS] stk_ps_tune_zero_func_fae: update psa: psa=139,psi=137
<14>[   21.813884]  (3)[1:init]init: PropSet [ril.ecc.service.category.list]=[] Done
<5>[   21.894590]  (1)[924:kworker/u8:6][mt6357_get_auxadc_value] ch_idx = 5, channel = 4, reg_val = 0x61a, adc_result = 686
<6>[   21.910961]  (2)[1131:wpa_supplicant][wlan]wlanDoIOCTL:(INIT INFO) wlanDoIOCTL Cmd= 0x8b0c
<6>[   21.911112]  (2)[1113:tx_thread][wlan]rlmDomainSendPwrLimitCmd:(RLM INFO) Domain: ValidCC =CN, ChNum=41
<6>[   21.911145]  (2)[1113:tx_thread][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d operating channels enable:0 size:0 channels:0
<6>[   21.911156]  (2)[1113:tx_thread][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:52
<6>[   21.911163]  (2)[1113:tx_thread][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:56
<6>[   21.911169]  (2)[1113:tx_thread][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:60
<6>[   21.911175]  (2)[1113:tx_thread][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:64
<6>[   21.911182]  (2)[1113:tx_thread][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:100
<6>[   21.911189]  (2)[1113:tx_thread][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:104
<6>[   21.911195]  (2)[1113:tx_thread][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:108
<6>[   21.911201]  (2)[1113:tx_thread][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:112
<6>[   21.911207]  (2)[1113:tx_thread][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:116
<6>[   21.911214]  (2)[1113:tx_thread][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:120
<6>[   21.911220]  (2)[1113:tx_thread][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:124
<6>[   21.911227]  (2)[1113:tx_thread][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:128
<6>[   21.911232]  (2)[1113:tx_thread][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:132
<6>[   21.911239]  (2)[1113:tx_thread][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:136
<6>[   21.911245]  (2)[1113:tx_thread][wlan]wlanUpdateChannelTable:(INIT INFO) jwq.d disable dfs channel:140
<4>[   21.961904]  (2)[327:kworker/u8:5]=====FG=====::  battery_current =-579 
<5>[   21.961933]  (2)[327:kworker/u8:5][mt6357_get_auxadc_value] ch_idx = 2, channel = 3, bat_cur = 579, reg_val = 0x5f1, adc_result = 668
<14>[   22.167690]  (2)[1:init]init: PropSet [service.bootanim.exit]=[1] Done
<6>[   22.216222]  (0)[515:disp_queue_P0][DISP]primary display will switch from RDMA_MODE to DIRECT_LINK
<6>[   22.216331]  (0)[515:disp_queue_P0][DDP/OVL]warn:ovl_roi:(480x800)
<7>[   22.216744]  (0)[515:disp_queue_P0][PWM] TOPCKGEN node exist
<7>[   22.216761]  (0)[515:disp_queue_P0][PWM] clk_req=0 clkid=19
<7>[   22.216774]  (0)[515:disp_queue_P0][PWM] PWM_MUX 81040300->81040300
<6>[   22.217006]  (0)[515:disp_queue_P0][DDP/DSI]warn:DSI_Set_VM_CMD
<6>[   22.217023]  (0)[515:disp_queue_P0][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc035c0f9f0!
<6>[   22.217039]  (0)[515:disp_queue_P0]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   22.217048]  (0)[515:disp_queue_P0]------------[ cut here ]------------
<4>[   22.217054]  (0)[515:disp_queue_P0]WARNING: CPU: 0 PID: 515 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1694/0x2460()
<4>[   22.217075]  (0)[515:disp_queue_P0]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   22.217114] -(0)[515:disp_queue_P0]CPU: 0 PID: 515 Comm: disp_queue_P0 Tainted: G        W  O    4.4.95+ #1
<4>[   22.217122] -(0)[515:disp_queue_P0]Hardware name: MT6739CW (DT)
<4>[   22.217130] -(0)[515:disp_queue_P0]Call trace:
<4>[   22.217135] -(0)[515:disp_queue_P0][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   22.217157] -(0)[515:disp_queue_P0][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   22.217169] -(0)[515:disp_queue_P0][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   22.217182] -(0)[515:disp_queue_P0][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   22.217193] -(0)[515:disp_queue_P0][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   22.217204] -(0)[515:disp_queue_P0][<ffffff8008550854>] ddp_dsi_config+0x1694/0x2460
<4>[   22.217216] -(0)[515:disp_queue_P0][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   22.217230] -(0)[515:disp_queue_P0][<ffffff80088934bc>] rdma_mode_switch_to_DL+0x158/0x1cc
<4>[   22.217241] -(0)[515:disp_queue_P0][<ffffff800858c0c0>] do_primary_display_switch_mode+0x458/0x508
<4>[   22.217254] -(0)[515:disp_queue_P0][<ffffff80085908bc>] _config_ovl_input+0x3a0/0xa80
<4>[   22.217264] -(0)[515:disp_queue_P0][<ffffff800859124c>] primary_frame_cfg_input+0x2b0/0x480
<4>[   22.217275] -(0)[515:disp_queue_P0][<ffffff8008593148>] primary_display_frame_cfg+0x5c/0x370
<4>[   22.217285] -(0)[515:disp_queue_P0][<ffffff8008598f88>] do_frame_config+0x1c/0x38
<4>[   22.217299] -(0)[515:disp_queue_P0][<ffffff80085a6ee8>] fence_wait_worker_func+0x204/0x2b8
<4>[   22.217308] -(0)[515:disp_queue_P0][<ffffff80080be9f0>] kthread+0xf0/0xf8
<4>[   22.217320] -(0)[515:disp_queue_P0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[   22.217333]  (0)[515:disp_queue_P0]---[ end trace e335f74a8dfe3615 ]---
<5>[   22.217348]  (0)[515:disp_queue_P0][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   22.217358]  (0)[515:disp_queue_P0][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   22.217374]  (0)[515:disp_queue_P0][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc035c0f9f8!
<6>[   22.217382]  (0)[515:disp_queue_P0]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   22.217393]  (0)[515:disp_queue_P0]------------[ cut here ]------------
<4>[   22.217401]  (0)[515:disp_queue_P0]WARNING: CPU: 0 PID: 515 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x16fc/0x2460()
<4>[   22.217416]  (0)[515:disp_queue_P0]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   22.217463] -(0)[515:disp_queue_P0]CPU: 0 PID: 515 Comm: disp_queue_P0 Tainted: G        W  O    4.4.95+ #1
<4>[   22.217472] -(0)[515:disp_queue_P0]Hardware name: MT6739CW (DT)
<4>[   22.217481] -(0)[515:disp_queue_P0]Call trace:
<4>[   22.217486] -(0)[515:disp_queue_P0][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   22.217497] -(0)[515:disp_queue_P0][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   22.217508] -(0)[515:disp_queue_P0][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   22.217518] -(0)[515:disp_queue_P0][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   22.217531] -(0)[515:disp_queue_P0][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   22.217541] -(0)[515:disp_queue_P0][<ffffff80085508bc>] ddp_dsi_config+0x16fc/0x2460
<4>[   22.217550] -(0)[515:disp_queue_P0][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   22.217563] -(0)[515:disp_queue_P0][<ffffff80088934bc>] rdma_mode_switch_to_DL+0x158/0x1cc
<4>[   22.217571] -(0)[515:disp_queue_P0][<ffffff800858c0c0>] do_primary_display_switch_mode+0x458/0x508
<4>[   22.217582] -(0)[515:disp_queue_P0][<ffffff80085908bc>] _config_ovl_input+0x3a0/0xa80
<4>[   22.217594] -(0)[515:disp_queue_P0][<ffffff800859124c>] primary_frame_cfg_input+0x2b0/0x480
<4>[   22.217603] -(0)[515:disp_queue_P0][<ffffff8008593148>] primary_display_frame_cfg+0x5c/0x370
<4>[   22.217615] -(0)[515:disp_queue_P0][<ffffff8008598f88>] do_frame_config+0x1c/0x38
<4>[   22.217624] -(0)[515:disp_queue_P0][<ffffff80085a6ee8>] fence_wait_worker_func+0x204/0x2b8
<4>[   22.217635] -(0)[515:disp_queue_P0][<ffffff80080be9f0>] kthread+0xf0/0xf8
<4>[   22.217646] -(0)[515:disp_queue_P0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[   22.217656]  (0)[515:disp_queue_P0]---[ end trace e335f74a8dfe3616 ]---
<5>[   22.217667]  (0)[515:disp_queue_P0][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   22.217679]  (0)[515:disp_queue_P0][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   22.217692]  (0)[515:disp_queue_P0][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc035c0fa00!
<6>[   22.217703]  (0)[515:disp_queue_P0]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   22.217712]  (0)[515:disp_queue_P0]------------[ cut here ]------------
<4>[   22.217719]  (0)[515:disp_queue_P0]WARNING: CPU: 0 PID: 515 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1764/0x2460()
<4>[   22.217735]  (0)[515:disp_queue_P0]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   22.217782] -(0)[515:disp_queue_P0]CPU: 0 PID: 515 Comm: disp_queue_P0 Tainted: G        W  O    4.4.95+ #1
<4>[   22.217793] -(0)[515:disp_queue_P0]Hardware name: MT6739CW (DT)
<4>[   22.217799] -(0)[515:disp_queue_P0]Call trace:
<4>[   22.217807] -(0)[515:disp_queue_P0][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   22.217818] -(0)[515:disp_queue_P0][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   22.217827] -(0)[515:disp_queue_P0][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   22.217839] -(0)[515:disp_queue_P0][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   22.217848] -(0)[515:disp_queue_P0][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   22.217858] -(0)[515:disp_queue_P0][<ffffff8008550924>] ddp_dsi_config+0x1764/0x2460
<4>[   22.217868] -(0)[515:disp_queue_P0][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   22.217878] -(0)[515:disp_queue_P0][<ffffff80088934bc>] rdma_mode_switch_to_DL+0x158/0x1cc
<4>[   22.217890] -(0)[515:disp_queue_P0][<ffffff800858c0c0>] do_primary_display_switch_mode+0x458/0x508
<4>[   22.217901] -(0)[515:disp_queue_P0][<ffffff80085908bc>] _config_ovl_input+0x3a0/0xa80
<4>[   22.217910] -(0)[515:disp_queue_P0][<ffffff800859124c>] primary_frame_cfg_input+0x2b0/0x480
<4>[   22.217922] -(0)[515:disp_queue_P0][<ffffff8008593148>] primary_display_frame_cfg+0x5c/0x370
<4>[   22.217931] -(0)[515:disp_queue_P0][<ffffff8008598f88>] do_frame_config+0x1c/0x38
<4>[   22.217939] -(0)[515:disp_queue_P0][<ffffff80085a6ee8>] fence_wait_worker_func+0x204/0x2b8
<4>[   22.217948] -(0)[515:disp_queue_P0][<ffffff80080be9f0>] kthread+0xf0/0xf8
<4>[   22.217957] -(0)[515:disp_queue_P0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[   22.217965]  (0)[515:disp_queue_P0]---[ end trace e335f74a8dfe3617 ]---
<5>[   22.217974]  (0)[515:disp_queue_P0][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   22.217982]  (0)[515:disp_queue_P0][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   22.217996]  (0)[515:disp_queue_P0][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc035c0fa10!
<6>[   22.218005]  (0)[515:disp_queue_P0]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   22.218014]  (0)[515:disp_queue_P0]------------[ cut here ]------------
<4>[   22.218020]  (0)[515:disp_queue_P0]WARNING: CPU: 0 PID: 515 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x17cc/0x2460()
<4>[   22.218034]  (0)[515:disp_queue_P0]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   22.218073] -(0)[515:disp_queue_P0]CPU: 0 PID: 515 Comm: disp_queue_P0 Tainted: G        W  O    4.4.95+ #1
<4>[   22.218082] -(0)[515:disp_queue_P0]Hardware name: MT6739CW (DT)
<4>[   22.218090] -(0)[515:disp_queue_P0]Call trace:
<4>[   22.218095] -(0)[515:disp_queue_P0][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   22.218108] -(0)[515:disp_queue_P0][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   22.218117] -(0)[515:disp_queue_P0][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   22.218130] -(0)[515:disp_queue_P0][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   22.218140] -(0)[515:disp_queue_P0][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   22.218150] -(0)[515:disp_queue_P0][<ffffff800855098c>] ddp_dsi_config+0x17cc/0x2460
<4>[   22.218159] -(0)[515:disp_queue_P0][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   22.218171] -(0)[515:disp_queue_P0][<ffffff80088934bc>] rdma_mode_switch_to_DL+0x158/0x1cc
<4>[   22.218182] -(0)[515:disp_queue_P0][<ffffff800858c0c0>] do_primary_display_switch_mode+0x458/0x508
<4>[   22.218195] -(0)[515:disp_queue_P0][<ffffff80085908bc>] _config_ovl_input+0x3a0/0xa80
<4>[   22.218205] -(0)[515:disp_queue_P0][<ffffff800859124c>] primary_frame_cfg_input+0x2b0/0x480
<4>[   22.218213] -(0)[515:disp_queue_P0][<ffffff8008593148>] primary_display_frame_cfg+0x5c/0x370
<4>[   22.218223] -(0)[515:disp_queue_P0][<ffffff8008598f88>] do_frame_config+0x1c/0x38
<4>[   22.218232] -(0)[515:disp_queue_P0][<ffffff80085a6ee8>] fence_wait_worker_func+0x204/0x2b8
<4>[   22.218243] -(0)[515:disp_queue_P0][<ffffff80080be9f0>] kthread+0xf0/0xf8
<4>[   22.218252] -(0)[515:disp_queue_P0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[   22.218261]  (0)[515:disp_queue_P0]---[ end trace e335f74a8dfe3618 ]---
<5>[   22.218280]  (0)[515:disp_queue_P0][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   22.218290]  (0)[515:disp_queue_P0][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   22.218303]  (0)[515:disp_queue_P0][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc035c0fa18!
<6>[   22.218314]  (0)[515:disp_queue_P0]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   22.218323]  (0)[515:disp_queue_P0]------------[ cut here ]------------
<4>[   22.218330]  (0)[515:disp_queue_P0]WARNING: CPU: 0 PID: 515 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1834/0x2460()
<4>[   22.218344]  (0)[515:disp_queue_P0]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   22.218395] -(0)[515:disp_queue_P0]CPU: 0 PID: 515 Comm: disp_queue_P0 Tainted: G        W  O    4.4.95+ #1
<4>[   22.218404] -(0)[515:disp_queue_P0]Hardware name: MT6739CW (DT)
<4>[   22.218414] -(0)[515:disp_queue_P0]Call trace:
<4>[   22.218421] -(0)[515:disp_queue_P0][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   22.218433] -(0)[515:disp_queue_P0][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   22.218446] -(0)[515:disp_queue_P0][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   22.218456] -(0)[515:disp_queue_P0][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   22.218470] -(0)[515:disp_queue_P0][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   22.218480] -(0)[515:disp_queue_P0][<ffffff80085509f4>] ddp_dsi_config+0x1834/0x2460
<4>[   22.218488] -(0)[515:disp_queue_P0][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   22.218499] -(0)[515:disp_queue_P0][<ffffff80088934bc>] rdma_mode_switch_to_DL+0x158/0x1cc
<4>[   22.218511] -(0)[515:disp_queue_P0][<ffffff800858c0c0>] do_primary_display_switch_mode+0x458/0x508
<4>[   22.218522] -(0)[515:disp_queue_P0][<ffffff80085908bc>] _config_ovl_input+0x3a0/0xa80
<4>[   22.218533] -(0)[515:disp_queue_P0][<ffffff800859124c>] primary_frame_cfg_input+0x2b0/0x480
<4>[   22.218544] -(0)[515:disp_queue_P0][<ffffff8008593148>] primary_display_frame_cfg+0x5c/0x370
<4>[   22.218554] -(0)[515:disp_queue_P0][<ffffff8008598f88>] do_frame_config+0x1c/0x38
<4>[   22.218565] -(0)[515:disp_queue_P0][<ffffff80085a6ee8>] fence_wait_worker_func+0x204/0x2b8
<4>[   22.218577] -(0)[515:disp_queue_P0][<ffffff80080be9f0>] kthread+0xf0/0xf8
<4>[   22.218587] -(0)[515:disp_queue_P0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[   22.218599]  (0)[515:disp_queue_P0]---[ end trace e335f74a8dfe3619 ]---
<5>[   22.218609]  (0)[515:disp_queue_P0][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   22.218621]  (0)[515:disp_queue_P0][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   22.218636]  (0)[515:disp_queue_P0][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc035c0fa1c!
<6>[   22.218646]  (0)[515:disp_queue_P0]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   22.218656]  (0)[515:disp_queue_P0]------------[ cut here ]------------
<4>[   22.218662]  (0)[515:disp_queue_P0]WARNING: CPU: 0 PID: 515 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x189c/0x2460()
<4>[   22.218676]  (0)[515:disp_queue_P0]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   22.218725] -(0)[515:disp_queue_P0]CPU: 0 PID: 515 Comm: disp_queue_P0 Tainted: G        W  O    4.4.95+ #1
<4>[   22.218737] -(0)[515:disp_queue_P0]Hardware name: MT6739CW (DT)
<4>[   22.218744] -(0)[515:disp_queue_P0]Call trace:
<4>[   22.218751] -(0)[515:disp_queue_P0][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   22.218765] -(0)[515:disp_queue_P0][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   22.218775] -(0)[515:disp_queue_P0][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   22.218787] -(0)[515:disp_queue_P0][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   22.218799] -(0)[515:disp_queue_P0][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   22.218810] -(0)[515:disp_queue_P0][<ffffff8008550a5c>] ddp_dsi_config+0x189c/0x2460
<4>[   22.218822] -(0)[515:disp_queue_P0][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   22.218832] -(0)[515:disp_queue_P0][<ffffff80088934bc>] rdma_mode_switch_to_DL+0x158/0x1cc
<4>[   22.218845] -(0)[515:disp_queue_P0][<ffffff800858c0c0>] do_primary_display_switch_mode+0x458/0x508
<4>[   22.218857] -(0)[515:disp_queue_P0][<ffffff80085908bc>] _config_ovl_input+0x3a0/0xa80
<4>[   22.218869] -(0)[515:disp_queue_P0][<ffffff800859124c>] primary_frame_cfg_input+0x2b0/0x480
<4>[   22.218880] -(0)[515:disp_queue_P0][<ffffff8008593148>] primary_display_frame_cfg+0x5c/0x370
<4>[   22.218890] -(0)[515:disp_queue_P0][<ffffff8008598f88>] do_frame_config+0x1c/0x38
<4>[   22.218902] -(0)[515:disp_queue_P0][<ffffff80085a6ee8>] fence_wait_worker_func+0x204/0x2b8
<4>[   22.218912] -(0)[515:disp_queue_P0][<ffffff80080be9f0>] kthread+0xf0/0xf8
<4>[   22.218925] -(0)[515:disp_queue_P0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[   22.218936]  (0)[515:disp_queue_P0]---[ end trace e335f74a8dfe361a ]---
<5>[   22.218948]  (0)[515:disp_queue_P0][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   22.218957]  (0)[515:disp_queue_P0][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   22.218975]  (0)[515:disp_queue_P0][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc035c0f9d8!
<6>[   22.218984]  (0)[515:disp_queue_P0]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   22.218994]  (0)[515:disp_queue_P0]------------[ cut here ]------------
<4>[   22.218999]  (0)[515:disp_queue_P0]WARNING: CPU: 0 PID: 515 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1904/0x2460()
<4>[   22.219017]  (0)[515:disp_queue_P0]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   22.219063] -(0)[515:disp_queue_P0]CPU: 0 PID: 515 Comm: disp_queue_P0 Tainted: G        W  O    4.4.95+ #1
<4>[   22.219077] -(0)[515:disp_queue_P0]Hardware name: MT6739CW (DT)
<4>[   22.219086] -(0)[515:disp_queue_P0]Call trace:
<4>[   22.219091] -(0)[515:disp_queue_P0][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   22.219103] -(0)[515:disp_queue_P0][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   22.219114] -(0)[515:disp_queue_P0][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   22.219127] -(0)[515:disp_queue_P0][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   22.219139] -(0)[515:disp_queue_P0][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   22.219148] -(0)[515:disp_queue_P0][<ffffff8008550ac4>] ddp_dsi_config+0x1904/0x2460
<4>[   22.219159] -(0)[515:disp_queue_P0][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   22.219172] -(0)[515:disp_queue_P0][<ffffff80088934bc>] rdma_mode_switch_to_DL+0x158/0x1cc
<4>[   22.219182] -(0)[515:disp_queue_P0][<ffffff800858c0c0>] do_primary_display_switch_mode+0x458/0x508
<4>[   22.219195] -(0)[515:disp_queue_P0][<ffffff80085908bc>] _config_ovl_input+0x3a0/0xa80
<4>[   22.219206] -(0)[515:disp_queue_P0][<ffffff800859124c>] primary_frame_cfg_input+0x2b0/0x480
<4>[   22.219216] -(0)[515:disp_queue_P0][<ffffff8008593148>] primary_display_frame_cfg+0x5c/0x370
<4>[   22.219228] -(0)[515:disp_queue_P0][<ffffff8008598f88>] do_frame_config+0x1c/0x38
<4>[   22.219237] -(0)[515:disp_queue_P0][<ffffff80085a6ee8>] fence_wait_worker_func+0x204/0x2b8
<4>[   22.219250] -(0)[515:disp_queue_P0][<ffffff80080be9f0>] kthread+0xf0/0xf8
<4>[   22.219261] -(0)[515:disp_queue_P0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[   22.219270]  (0)[515:disp_queue_P0]---[ end trace e335f74a8dfe361b ]---
<5>[   22.219283]  (0)[515:disp_queue_P0][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   22.219291]  (0)[515:disp_queue_P0][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   22.219308]  (0)[515:disp_queue_P0][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc035c0f9e0!
<6>[   22.219320]  (0)[515:disp_queue_P0]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   22.219328]  (0)[515:disp_queue_P0]------------[ cut here ]------------
<4>[   22.219337]  (0)[515:disp_queue_P0]WARNING: CPU: 0 PID: 515 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x196c/0x2460()
<4>[   22.219351]  (0)[515:disp_queue_P0]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   22.219397] -(0)[515:disp_queue_P0]CPU: 0 PID: 515 Comm: disp_queue_P0 Tainted: G        W  O    4.4.95+ #1
<4>[   22.219409] -(0)[515:disp_queue_P0]Hardware name: MT6739CW (DT)
<4>[   22.219418] -(0)[515:disp_queue_P0]Call trace:
<4>[   22.219426] -(0)[515:disp_queue_P0][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   22.219439] -(0)[515:disp_queue_P0][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   22.219447] -(0)[515:disp_queue_P0][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   22.219460] -(0)[515:disp_queue_P0][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   22.219472] -(0)[515:disp_queue_P0][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   22.219482] -(0)[515:disp_queue_P0][<ffffff8008550b2c>] ddp_dsi_config+0x196c/0x2460
<4>[   22.219493] -(0)[515:disp_queue_P0][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   22.219505] -(0)[515:disp_queue_P0][<ffffff80088934bc>] rdma_mode_switch_to_DL+0x158/0x1cc
<4>[   22.219515] -(0)[515:disp_queue_P0][<ffffff800858c0c0>] do_primary_display_switch_mode+0x458/0x508
<4>[   22.219527] -(0)[515:disp_queue_P0][<ffffff80085908bc>] _config_ovl_input+0x3a0/0xa80
<4>[   22.219539] -(0)[515:disp_queue_P0][<ffffff800859124c>] primary_frame_cfg_input+0x2b0/0x480
<4>[   22.219548] -(0)[515:disp_queue_P0][<ffffff8008593148>] primary_display_frame_cfg+0x5c/0x370
<4>[   22.219560] -(0)[515:disp_queue_P0][<ffffff8008598f88>] do_frame_config+0x1c/0x38
<4>[   22.219570] -(0)[515:disp_queue_P0][<ffffff80085a6ee8>] fence_wait_worker_func+0x204/0x2b8
<4>[   22.219581] -(0)[515:disp_queue_P0][<ffffff80080be9f0>] kthread+0xf0/0xf8
<4>[   22.219593] -(0)[515:disp_queue_P0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[   22.219604]  (0)[515:disp_queue_P0]---[ end trace e335f74a8dfe361c ]---
<5>[   22.219616]  (0)[515:disp_queue_P0][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   22.219626]  (0)[515:disp_queue_P0][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   22.219640]  (0)[515:disp_queue_P0][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc035c0f9e8!
<6>[   22.219650]  (0)[515:disp_queue_P0]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   22.219660]  (0)[515:disp_queue_P0]------------[ cut here ]------------
<4>[   22.219666]  (0)[515:disp_queue_P0]WARNING: CPU: 0 PID: 515 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x19d4/0x2460()
<4>[   22.219681]  (0)[515:disp_queue_P0]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   22.219730] -(0)[515:disp_queue_P0]CPU: 0 PID: 515 Comm: disp_queue_P0 Tainted: G        W  O    4.4.95+ #1
<4>[   22.219740] -(0)[515:disp_queue_P0]Hardware name: MT6739CW (DT)
<4>[   22.219749] -(0)[515:disp_queue_P0]Call trace:
<4>[   22.219754] -(0)[515:disp_queue_P0][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   22.219765] -(0)[515:disp_queue_P0][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   22.219776] -(0)[515:disp_queue_P0][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   22.219791] -(0)[515:disp_queue_P0][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   22.219801] -(0)[515:disp_queue_P0][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   22.219813] -(0)[515:disp_queue_P0][<ffffff8008550b94>] ddp_dsi_config+0x19d4/0x2460
<4>[   22.219822] -(0)[515:disp_queue_P0][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   22.219836] -(0)[515:disp_queue_P0][<ffffff80088934bc>] rdma_mode_switch_to_DL+0x158/0x1cc
<4>[   22.219846] -(0)[515:disp_queue_P0][<ffffff800858c0c0>] do_primary_display_switch_mode+0x458/0x508
<4>[   22.219858] -(0)[515:disp_queue_P0][<ffffff80085908bc>] _config_ovl_input+0x3a0/0xa80
<4>[   22.219870] -(0)[515:disp_queue_P0][<ffffff800859124c>] primary_frame_cfg_input+0x2b0/0x480
<4>[   22.219879] -(0)[515:disp_queue_P0][<ffffff8008593148>] primary_display_frame_cfg+0x5c/0x370
<4>[   22.219891] -(0)[515:disp_queue_P0][<ffffff8008598f88>] do_frame_config+0x1c/0x38
<4>[   22.219904] -(0)[515:disp_queue_P0][<ffffff80085a6ee8>] fence_wait_worker_func+0x204/0x2b8
<4>[   22.219915] -(0)[515:disp_queue_P0][<ffffff80080be9f0>] kthread+0xf0/0xf8
<4>[   22.219927] -(0)[515:disp_queue_P0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[   22.219936]  (0)[515:disp_queue_P0]---[ end trace e335f74a8dfe361d ]---
<5>[   22.219949]  (0)[515:disp_queue_P0][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   22.219957]  (0)[515:disp_queue_P0][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   22.219971]  (0)[515:disp_queue_P0][DISP]===>v_a-v_b=0x191f,HSTX_CKLP_WC=0xffffffc0
<6>[   22.219979]  (0)[515:disp_queue_P0][DISP]===>v_b+v_c=0x326,HFP_WC=0x25
<6>[   22.219990]  (0)[515:disp_queue_P0][DISP]===>Will Reconfig in order to fulfill LP clock lane per line
<6>[   22.220006]  (0)[515:disp_queue_P0][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc035c0fa08!
<6>[   22.220016]  (0)[515:disp_queue_P0]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   22.220028]  (0)[515:disp_queue_P0]------------[ cut here ]------------
<4>[   22.220035]  (0)[515:disp_queue_P0]WARNING: CPU: 0 PID: 515 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1b58/0x2460()
<4>[   22.220051]  (0)[515:disp_queue_P0]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   22.220091] -(0)[515:disp_queue_P0]CPU: 0 PID: 515 Comm: disp_queue_P0 Tainted: G        W  O    4.4.95+ #1
<4>[   22.220100] -(0)[515:disp_queue_P0]Hardware name: MT6739CW (DT)
<4>[   22.220106] -(0)[515:disp_queue_P0]Call trace:
<4>[   22.220111] -(0)[515:disp_queue_P0][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   22.220121] -(0)[515:disp_queue_P0][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   22.220130] -(0)[515:disp_queue_P0][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   22.220140] -(0)[515:disp_queue_P0][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   22.220151] -(0)[515:disp_queue_P0][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   22.220160] -(0)[515:disp_queue_P0][<ffffff8008550d18>] ddp_dsi_config+0x1b58/0x2460
<4>[   22.220168] -(0)[515:disp_queue_P0][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   22.220179] -(0)[515:disp_queue_P0][<ffffff80088934bc>] rdma_mode_switch_to_DL+0x158/0x1cc
<4>[   22.220189] -(0)[515:disp_queue_P0][<ffffff800858c0c0>] do_primary_display_switch_mode+0x458/0x508
<4>[   22.220198] -(0)[515:disp_queue_P0][<ffffff80085908bc>] _config_ovl_input+0x3a0/0xa80
<4>[   22.220208] -(0)[515:disp_queue_P0][<ffffff800859124c>] primary_frame_cfg_input+0x2b0/0x480
<4>[   22.220217] -(0)[515:disp_queue_P0][<ffffff8008593148>] primary_display_frame_cfg+0x5c/0x370
<4>[   22.220227] -(0)[515:disp_queue_P0][<ffffff8008598f88>] do_frame_config+0x1c/0x38
<4>[   22.220235] -(0)[515:disp_queue_P0][<ffffff80085a6ee8>] fence_wait_worker_func+0x204/0x2b8
<4>[   22.220245] -(0)[515:disp_queue_P0][<ffffff80080be9f0>] kthread+0xf0/0xf8
<4>[   22.220255] -(0)[515:disp_queue_P0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[   22.220264]  (0)[515:disp_queue_P0]---[ end trace e335f74a8dfe361e ]---
<5>[   22.220274]  (0)[515:disp_queue_P0][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   22.220282]  (0)[515:disp_queue_P0][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   22.220301]  (0)[515:disp_queue_P0][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc035c0fa20!
<6>[   22.220310]  (0)[515:disp_queue_P0]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   22.220335]  (0)[515:disp_queue_P0]------------[ cut here ]------------
<4>[   22.220346]  (0)[515:disp_queue_P0]WARNING: CPU: 0 PID: 515 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1cc4/0x2460()
<4>[   22.220362]  (0)[515:disp_queue_P0]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   22.220399] -(0)[515:disp_queue_P0]CPU: 0 PID: 515 Comm: disp_queue_P0 Tainted: G        W  O    4.4.95+ #1
<4>[   22.220407] -(0)[515:disp_queue_P0]Hardware name: MT6739CW (DT)
<4>[   22.220415] -(0)[515:disp_queue_P0]Call trace:
<4>[   22.220420] -(0)[515:disp_queue_P0][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   22.220430] -(0)[515:disp_queue_P0][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   22.220438] -(0)[515:disp_queue_P0][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   22.220449] -(0)[515:disp_queue_P0][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   22.220459] -(0)[515:disp_queue_P0][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   22.220468] -(0)[515:disp_queue_P0][<ffffff8008550e84>] ddp_dsi_config+0x1cc4/0x2460
<4>[   22.220476] -(0)[515:disp_queue_P0][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   22.220486] -(0)[515:disp_queue_P0][<ffffff80088934bc>] rdma_mode_switch_to_DL+0x158/0x1cc
<4>[   22.220495] -(0)[515:disp_queue_P0][<ffffff800858c0c0>] do_primary_display_switch_mode+0x458/0x508
<4>[   22.220506] -(0)[515:disp_queue_P0][<ffffff80085908bc>] _config_ovl_input+0x3a0/0xa80
<4>[   22.220516] -(0)[515:disp_queue_P0][<ffffff800859124c>] primary_frame_cfg_input+0x2b0/0x480
<4>[   22.220525] -(0)[515:disp_queue_P0][<ffffff8008593148>] primary_display_frame_cfg+0x5c/0x370
<4>[   22.220534] -(0)[515:disp_queue_P0][<ffffff8008598f88>] do_frame_config+0x1c/0x38
<4>[   22.220543] -(0)[515:disp_queue_P0][<ffffff80085a6ee8>] fence_wait_worker_func+0x204/0x2b8
<4>[   22.220554] -(0)[515:disp_queue_P0][<ffffff80080be9f0>] kthread+0xf0/0xf8
<4>[   22.220563] -(0)[515:disp_queue_P0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[   22.220572]  (0)[515:disp_queue_P0]---[ end trace e335f74a8dfe361f ]---
<5>[   22.220585]  (0)[515:disp_queue_P0][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   22.220593]  (0)[515:disp_queue_P0][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   22.220604]  (0)[515:disp_queue_P0][DISP]===>new HSTX_CKL_WC=0x4000, HFP_WC=0x250
<6>[   22.220640]  (0)[515:disp_queue_P0][DISP]primary display is DIRECT_LINK mode now
<14>[   22.232130]  (1)[1:init]init: Service 'bootanim' (pid 427) exited with status 0
<14>[   22.262504]  (0)[1:init]init: PropSet [service.bootanim.exit]=[1] Done
<3>[   22.264335]  (1)[387:Binder:364_1]BOOTPROF:     22264.334283:BOOT_Animation:END
<3>[   22.264370]  (1)[387:Binder:364_1]BOOTPROF:     22264.369744: OFF
<5>[   22.264378]  (1)[387:Binder:364_1]log_store: sram_dram_buff flag 0x423, reboot count 0, 0.
<14>[   22.275334]  (0)[1:init]init: PropSet [sys.usb.config]=[none] Done
<14>[   22.276716]  (0)[1:init]init: processing action (sys.usb.config=none && sys.usb.configfs=1) from (/vendor/etc/init/hw/init.mt6739.usb.rc:97)
<14>[   22.277340]  (0)[1:init]init: PropSet [sys.boot_completed]=[1] Done
<5>[   22.277645]  (0)[1:init][MUSB]mt_usb_store_saving_mode 922: old=0 new=0
<14>[   22.277762]  (0)[1:init]init: processing action (sys.usb.config=none && sys.usb.configfs=1) from (/init.usb.configfs.rc:1)
<6>[   22.277865]  (0)[1:init]gadget_dev_desc_UDC_store write none
<6>[   22.277880]  (0)[1:init]unregister_gadget
<5>[   22.278020]  (0)[1:init][MUSB]musb_gadget_pullup 2230: is_on=0, softconnect=1 ++
<5>[   22.278044] -(0)[1:init][MUSB]musb_gadget_pullup 2243: is_on=0, softconnect=1 ++
<5>[   22.278052] -(0)[1:init][MUSB]musb_pullup 2152: MUSB: gadget pull up 0 start, musb->power:0
<5>[   22.278060] -(0)[1:init][MUSB]musb_pullup 2174: MUSB: gadget pull up 0 end
<6>[   22.278622]  (0)[1:init]android_disconnect
<5>[   22.278692]  (0)[1:init]android_disconnect, skip work
<6>[   22.278702] -(0)[1:init]configfs-gadget gadget: [COM]composite_disconnect: reassign the complete function!!
<6>[   22.278713]  (0)[1:init]configfs_composite_unbind
<6>[   22.278719]  (0)[1:init]purge_configs_funcs
<3>[   22.278726]  (0)[1:init]configfs-gadget gadget: unbind function 'mtp'/ffffffc02c4f6c00
<6>[   22.278757]  (0)[1:init]composite_dev_cleanup os_desc_req[0]=ffffffc02bd78700 cdev->req[0]=ffffffc02c355480
<5>[   22.278783]  (0)[1:init][MUSB]musb_gadget_stop 2545: musb_gadget_stop
<5>[   22.278797] -(0)[1:init][MUSB]mt_usb_try_idle 282: (null) inactive, for idle timer for 4 ms
<14>[   22.279297]  (0)[1:init]init: PropSet [dev.bootcomplete]=[1] Done
<14>[   22.279564]  (0)[1:init]init: PropSet [sys.usb.ffs.ready]=[0] Done
<14>[   22.279663]  (0)[1:init]init: PropSet [sys.usb.ffs.mtp.ready]=[0] Done
<6>[   22.280071]  (0)[1:init]config_usb_cfg_unlink b.1<-/->mtp.gs0
<6>[   22.280223]  (0)[1:init]function_drop name=rndis.gs4
<6>[   22.280241]  (0)[1:init]usb_put_function_instance fd name=rndis
<14>[   22.280381]  (0)[1:init]init: PropSet [sys.usb.state]=[none] Done
<5>[   22.281084] -(0)[53:kworker/u8:1][MUSB]do_idle_work 237: otg_state (null) to (null), is_active<0>
<14>[   22.283022]  (0)[1:init]init: processing action (sys.boot_completed=1) from (/init.rc:708)
<14>[   22.283175]  (0)[1:init]init: processing action (sys.boot_completed=1) from (/vendor/etc/init/hw/init.mt6739.rc:938)
<14>[   22.285604]  (0)[1:init]init: starting service 'ged_srv'...
<14>[   22.287706]  (0)[1:init]init: PropSet [sys.user.0.ce_available]=[true] Done
<14>[   22.287926]  (0)[1:init]init: processing action (sys.boot_completed=1) from (/vendor/etc/init/hw/init.mt6739.rc:942)
<7>[   22.292123]  (0)[926:kworker/u8:7][LED][BL] Set Backlight directly T:22.292,L:105 map:105    
<4>[   22.293015]  (0)[926:kworker/u8:7][HIF-SDIO][I]wmt_dev_tra_poll:**poll_during_time = 4294689584 > 3000, during_count = 1052 > 200, query
<4>[   22.293077]  (0)[926:kworker/u8:7][STP-PSM] [I]_stp_psm_do_wait: STP is waiting state for ACT, i=1, state = 2
<6>[   22.293119]  (0)[1113:tx_thread][wlan]rlmDeactivateNetwork:(RLM INFO) rlmDeactivateNetwork, Type = 1, Src = 0, Active = 1, SrcVal= 0
<4>[   22.293234]  (0)[380:mtk_stp_psm][STP-PSM] [I]_stp_psm_proc: pOp(ffffff8000b74d80):1
<4>[   22.293302] -(0)[384:mtk_wmtd]wmtd_thread: 2 callbacks suppressed
<4>[   22.293312]  (0)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b77838):7-0-2,ffffff8000ae0e50,0,0
<6>[   22.294926]  (0)[1113:tx_thread][wlan]qmHandleEventBssAbsencePresence:(QM INFO) NAF=1,0,0
<7>[   22.316263]  (0)[926:kworker/u8:7]mt_fh_hal_general_pll_dfs, [Pll_ID]:0 [current dds(CON1)]:0xe6000, [target dds]:630784
<4>[   22.317254]  (0)[926:kworker/u8:7][STP-PSM] [I]_stp_psm_do_wait: +Total waits for ACT takes 24176 usec
<7>[   22.317362]  (3)[1:init]mt_fh_hal_general_pll_dfs, [Pll_ID]:0 [current dds(CON1)]:0x9a000, [target dds]:942080
<5>[   22.317426]  (3)[1:init][Power/PPM] @ppm_userlimit_min_cpu_freq_proc_write: Invalid cluster id: 1
<4>[   22.317539]  (0)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b77970):15-0-1,0,0,0
<11>[   22.317683]  (3)[1:init]init: Unable to open '/proc/ppm/policy/userlimit_min_cpu_core': No such file or directory
<14>[   22.317775]  (3)[1:init]init: processing action (sys.boot_completed=1) from (/vendor/etc/init/hw/init.aee.rc:47)
<14>[   22.318813]  (3)[1:init]init: starting service 'aee-reinit'...
<4>[   22.319369]  (0)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b77aa8):15-0-2,0,0,0
<4>[   22.319945]  (0)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b77be0):15-0-3,0,0,0
<4>[   22.320318]  (0)[926:kworker/u8:7][HIF-SDIO][I]wmt_dev_tm_temp_query:[Thermal] current_temp = 0x1b
<14>[   22.321700]  (3)[1:init]init: starting service 'aeev-reinit'...
<14>[   22.323465]  (3)[1:init]init: processing action (sys.boot_completed=1 && sys.logbootcomplete=1) from (/system/etc/init/bootstat.rc:66)
<14>[   22.324452]  (3)[1:init]init: starting service 'exec 9 (/system/bin/bootstat --record_boot_complete)'...
<14>[   22.326152]  (3)[1:init]init: SVC_EXEC pid 1473 (uid 1000 gid 1007+0 context default) started; waiting...
<14>[   22.326997]  (3)[1:init]init: PropSet [sys.usb.config]=[adb] Done
<4>[   22.345188]  (3)[380:mtk_stp_psm][STP-PSM] [I]_stp_psm_proc: pOp(ffffff8000b754d0):0
<4>[   22.345283]  (3)[384:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000b77f88):7-0-0,ffffff8000ae0e50,0,0
<14>[   22.361109]  (3)[1:init]init: Service 'exec 9 (/system/bin/bootstat --record_boot_complete)' (pid 1473) exited with status 0 waiting took 0.037000 seconds
<14>[   22.363223]  (3)[1:init]init: starting service 'exec 10 (/system/bin/bootstat --record_boot_reason)'...
<14>[   22.364649]  (3)[1:init]init: SVC_EXEC pid 1475 (uid 1000 gid 1007+0 context default) started; waiting...
<7>[   22.384233]  (3)[1:init][LED][BL] Set Backlight directly T:22.311,L:109 map:109    T:22.329,L:112 map:112    T:22.345,L:115 map:115    T:22.364,L:119 map:119    T:22.384,L:122 map:122    
<14>[   22.399563]  (3)[1:init]init: Service 'exec 10 (/system/bin/bootstat --record_boot_reason)' (pid 1475) exited with status 0 waiting took 0.036000 seconds
<14>[   22.402642]  (3)[1:init]init: starting service 'exec 11 (/system/bin/bootstat --record_time_since_factory_reset)'...
<7>[   22.402891]  (2)[347:light@2.0-servi][PWM] (latest= 8):   409( 174, 159)  421( 183, 995)  437( 184,  15)  449( 184,  33)  461( 184,  48)  477( 184,  68)  489( 184,  87)  505( 184, 106)
<14>[   22.404368]  (3)[1:init]init: SVC_EXEC pid 1476 (uid 1000 gid 1007+0 context default) started; waiting...
<36>[   22.415003]  (2)[323:logd.auditd]type=1400 audit(1550035183.078:20): avc: denied { read } for pid=456 comm=494D4342206D73672068616E646C65 name="u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=101 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0 duplicate messages suppressed
<36>[   22.415050]  (2)[323:logd.auditd]type=1400 audit(1550035184.114:21): avc: denied { getattr } for pid=1012 comm="ndroid.systemui" path="/data/user_de/0/com.mediatek.ppl" dev="dm-2" ino=114810 scontext=u:r:platform_app:s0:c512,c768 tcontext=u:object_r:system_app_data_file:s0 tclass=dir permissive=0
<14>[   22.443708]  (2)[1:init]init: Service 'exec 11 (/system/bin/bootstat --record_time_since_factory_reset)' (pid 1476) exited with status 0 waiting took 0.043000 seconds
<14>[   22.445337]  (2)[1:init]init: starting service 'exec 12 (/system/bin/bootstat -l)'...
<14>[   22.446707]  (2)[1:init]init: SVC_EXEC pid 1482 (uid 1000 gid 1007+0 context default) started; waiting...
<14>[   22.447933]  (0)[1:init]init: PropSet [debug.mtk.aee.status]=[free] Done
<14>[   22.450387]  (2)[1:init]init: PropSet [debug.mtk.aee.status64]=[free] Done
<14>[   22.453412]  (3)[1:init]init: Service 'aee-reinit' (pid 1471) exited with status 0
<14>[   22.455097]  (0)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[free] Done
<14>[   22.460613]  (2)[1:init]init: PropSet [debug.mtk.aee.vstatus64]=[free] Done
<14>[   22.463232]  (2)[1:init]init: Service 'aeev-reinit' (pid 1472) exited with status 0
<14>[   22.476535]  (2)[1:init]init: Service 'exec 12 (/system/bin/bootstat -l)' (pid 1482) exited with status 0 waiting took 0.031000 seconds
<14>[   22.477026]  (2)[1:init]init: processing action (sys.boot_completed=1) from (/system/etc/init/ged_srv.rc:2)
<14>[   22.477180]  (2)[1:init]init: processing action (sys.boot_completed=1 && sys.wifitracing.started=0) from (/system/etc/init/wifi-events.rc:20)
<7>[   22.484376]  (2)[1:init][LED][BL] Set Backlight directly T:22.402,L:126 map:126    T:22.425,L:129 map:129    T:22.441,L:133 map:133    T:22.458,L:135 map:135    T:22.484,L:140 map:140    
<7>[   22.516206]  (2)[1:init][ftrace]tracing_on is toggled to 0
<7>[   22.529184]  (3)[1:init][ftrace]event 'cfg80211_gtk_rekey_notify' is enabled
<7>[   22.529262]  (3)[1:init][ftrace]event 'rdev_add_key' is enabled
<7>[   22.529303]  (3)[1:init][ftrace]event 'rdev_assoc' is enabled
<7>[   22.529342]  (3)[1:init][ftrace]event 'rdev_auth' is enabled
<7>[   22.529380]  (3)[1:init][ftrace]event 'rdev_connect' is enabled
<7>[   22.529418]  (3)[1:init][ftrace]event 'rdev_set_default_key' is enabled
<7>[   22.529457]  (3)[1:init][ftrace]event 'rdev_set_default_mgmt_key' is enabled
<7>[   22.529495]  (3)[1:init][ftrace]event 'rdev_set_rekey_data' is enabled
<7>[   22.545294]  (1)[1:init][ftrace]event 'net_dev_queue' is enabled
<7>[   22.545368]  (1)[1:init][ftrace]event 'net_dev_xmit' is enabled
<7>[   22.545409]  (1)[1:init][ftrace]event 'netif_rx' is enabled
<7>[   22.545447]  (1)[1:init][ftrace]event 'netif_receive_skb' is enabled
<14>[   22.545798]  (1)[1:init]init: PropSet [sys.wifitracing.started]=[1] Done
<14>[   22.548645]  (1)[1:init]init: processing action (init.svc.adbd=stopped) from (/init.usb.configfs.rc:15)
<14>[   22.548713]  (1)[1:init]init: PropSet [sys.usb.ffs.ready]=[0] Done
<14>[   22.564184]  (1)[1:init]init: processing action (sys.usb.acm_cnt=0 && sys.usb.config=adb && sys.usb.configfs=1) from (/vendor/etc/init/hw/init.mt6739.usb.rc:137)
<14>[   22.564259]  (1)[1:init]init: PropSet [sys.usb.pid]=[0x201C] Done
<14>[   22.564323]  (1)[1:init]init: processing action (sys.usb.config=adb && sys.usb.configfs=1) from (/init.usb.configfs.rc:18)
<14>[   22.565036]  (1)[1:init]init: starting service 'adbd'...
<14>[   22.567889]  (3)[1486:init]init: Created socket '/dev/socket/adbd', mode 660, user 1000, group 1000
<7>[   22.572881]  (3)[347:light@2.0-servi][PWM] (latest= 8):   518( 184, 128)  534( 184, 144)  542( 184, 162)  562( 184, 188)  578( 184, 209)  594( 184, 231)  610( 184, 254)  626( 184, 276)
<6>[   22.588981]  (2)[1487:usb ffs open]read descriptors
<4>[   22.589014]  (2)[1487:usb ffs open]skip os descriptor, os_descs_count:1, len:35 all to 0
<6>[   22.589029]  (2)[1487:usb ffs open]read strings
<14>[   22.589825]  (1)[1:init]init: PropSet [sys.usb.ffs.ready]=[1] Done
<14>[   22.591372]  (1)[1:init]init: processing action (sys.usb.acm_enable=0 && sys.usb.config=adb && sys.usb.configfs=1 && sys.usb.ffs.ready=1) from (/vendor/etc/init/hw/init.mt6739.usb.rc:160)
<6>[   22.591789]  (1)[1:init]config_usb_cfg_link b.1<-->ffs.adb
<6>[   22.591813]  (1)[1:init]usb_get_function usb_function_driver name=ffs
<6>[   22.591822]  (1)[1:init]usb_get_function usb_function name=Function FS Gadget
<6>[   22.591927]  (1)[1:init]gadget_dev_desc_UDC_store write musb-hdrc
<6>[   22.591938]  (1)[1:init]usb_udc_attach_driver musb-hdrc musb-hdrc
<6>[   22.591949]  (1)[1:init]udc musb-hdrc: registering UDC driver [g1]
<6>[   22.591957]  (1)[1:init]configfs_composite_bind
<6>[   22.591966]  (1)[1:init]composite_dev_prepare ffffffc04784ca00
<6>[   22.591992]  (1)[1:init]configfs-gadget gadget: adding 'Function FS Gadget'/ffffffc046157038 to config 'b'/ffffffc02d281100
<6>[   22.592015]  (1)[1:init]composite_os_desc_req_prepare ffffffc04784c380
<5>[   22.592023]  (1)[1:init][MUSB]musb_gadget_start 2445: musb_gadget_start
<5>[   22.592222]  (1)[1:init][MUSB]musb_gadget_pullup 2230: is_on=1, softconnect=0 ++
<5>[   22.592235] -(1)[1:init][MUSB]musb_gadget_pullup 2243: is_on=1, softconnect=0 ++
<5>[   22.592243] -(1)[1:init][MUSB]musb_pullup 2152: MUSB: gadget pull up 1 start, musb->power:0
<5>[   22.592250] -(1)[1:init][MUSB]musb_pullup 2174: MUSB: gadget pull up 1 end
<14>[   22.592571]  (1)[1:init]init: PropSet [sys.usb.state]=[adb] Done
<14>[   22.592696]  (1)[1:init]init: processing action (sys.usb.config=adb && sys.usb.configfs=1 && sys.usb.ffs.ready=1) from (/init.usb.configfs.rc:21)
<6>[   22.593125]  (1)[1:init]gadget_dev_desc_UDC_store write musb-hdrc
<11>[   22.593228]  (1)[1:init]init: Unable to write to '/config/usb_gadget/g1/UDC': Device or resource busy
<14>[   22.593355]  (1)[1:init]init: PropSet [sys.usb.state]=[adb] Done
<6>[   22.593491]  (2)[149:disp_idlemgr][DISP][disp_lowpower]_vdo_mode_enter_idle
<6>[   22.593510]  (2)[149:disp_idlemgr][DISP]primary display will switch from DIRECT_LINK to DECOUPLE
<7>[   22.595340]  (2)[149:disp_idlemgr][LED][BL] Set Backlight directly T:22.505,L:144 map:144    T:22.527,L:148 map:148    T:22.550,L:152 map:152    T:22.572,L:156 map:156    T:22.595,L:160 map:160    
<6>[   22.603288]  (2)[149:disp_idlemgr][DISP]dl_to_dc capture:Flush wait wdma sof
<6>[   22.624445]  (2)[149:disp_idlemgr][DDP/OVL]warn:ovl_roi:(480x800)
<6>[   22.624551]  (2)[149:disp_idlemgr][DISP]primary display is DECOUPLE mode now
<7>[   22.797343]  (2)[1470:kschedfreq:0]mt_fh_hal_general_pll_dfs, [Pll_ID]:0 [current dds(CON1)]:0xe6000, [target dds]:802816
<7>[   22.800938] mt_fh_hal_general_pll_dfs, [Pll_ID]:0 [current dds(CON1)]:0xc4000, [target dds]:868352 (1)[513:HwBinder:346_2]mt_fh_hal_general_pll_dfs, [Pll_ID]:0 [current dds(CON1)]:0xd4000, [target dds]:942080
<6>[   22.818851]  (1)[513:HwBinder:346_2][DISP][disp_lowpower]_vdo_mode_leave_idle
<6>[   22.819030]  (1)[513:HwBinder:346_2][DISP]primary display will switch from DECOUPLE to DIRECT_LINK
<6>[   22.819346]  (0)[513:HwBinder:346_2][DDP/OVL]warn:ovl_roi:(480x800)
<7>[   22.819798]  (0)[513:HwBinder:346_2][PWM] TOPCKGEN node exist
<7>[   22.819815]  (0)[513:HwBinder:346_2][PWM] clk_req=0 clkid=19
<7>[   22.819830]  (0)[513:HwBinder:346_2][PWM] PWM_MUX 81040300->81040300
<6>[   22.820007]  (0)[513:HwBinder:346_2][DDP/DSI]warn:DSI_Set_VM_CMD
<6>[   22.820024]  (0)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba30!
<6>[   22.820040]  (0)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   22.820049]  (0)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   22.820055]  (0)[513:HwBinder:346_2]WARNING: CPU: 0 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1694/0x2460()
<4>[   22.820077]  (0)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   22.820116] -(0)[513:HwBinder:346_2]CPU: 0 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   22.820125] -(0)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   22.820132] -(0)[513:HwBinder:346_2]Call trace:
<4>[   22.820137] -(0)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   22.820151] -(0)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   22.820159] -(0)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   22.820170] -(0)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   22.820180] -(0)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   22.820189] -(0)[513:HwBinder:346_2][<ffffff8008550854>] ddp_dsi_config+0x1694/0x2460
<4>[   22.820199] -(0)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   22.820211] -(0)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   22.820221] -(0)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   22.820233] -(0)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   22.820242] -(0)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   22.820251] -(0)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   22.820258] -(0)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   22.820267] -(0)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   22.820277] -(0)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   22.820286] -(0)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   22.820294] -(0)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   22.820306] -(0)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   22.820315] -(0)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   22.820324]  (0)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3620 ]---
<5>[   22.820338]  (0)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   22.820348]  (0)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   22.820364]  (0)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba38!
<6>[   22.820372]  (0)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   22.820379]  (0)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   22.820385]  (0)[513:HwBinder:346_2]WARNING: CPU: 0 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x16fc/0x2460()
<4>[   22.820398]  (0)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   22.820435] -(0)[513:HwBinder:346_2]CPU: 0 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   22.820444] -(0)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   22.820451] -(0)[513:HwBinder:346_2]Call trace:
<4>[   22.820456] -(0)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   22.820467] -(0)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   22.820475] -(0)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   22.820485] -(0)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   22.820495] -(0)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   22.820504] -(0)[513:HwBinder:346_2][<ffffff80085508bc>] ddp_dsi_config+0x16fc/0x2460
<4>[   22.820513] -(0)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   22.820524] -(0)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   22.820533] -(0)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   22.820544] -(0)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   22.820553] -(0)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   22.820561] -(0)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   22.820570] -(0)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   22.820579] -(0)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   22.820588] -(0)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   22.820597] -(0)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   22.820606] -(0)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   22.820618] -(0)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   22.820627] -(0)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   22.820636]  (0)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3621 ]---
<5>[   22.820648]  (0)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   22.820656]  (0)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   22.820671]  (0)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba40!
<6>[   22.820679]  (0)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   22.820687]  (0)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   22.820693]  (0)[513:HwBinder:346_2]WARNING: CPU: 0 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1764/0x2460()
<4>[   22.820707]  (0)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   22.820741] -(0)[513:HwBinder:346_2]CPU: 0 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   22.820750] -(0)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   22.820757] -(0)[513:HwBinder:346_2]Call trace:
<4>[   22.820762] -(0)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   22.820773] -(0)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   22.820781] -(0)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   22.820793] -(0)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   22.820806] -(0)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   22.820814] -(0)[513:HwBinder:346_2][<ffffff8008550924>] ddp_dsi_config+0x1764/0x2460
<4>[   22.820822] -(0)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   22.820833] -(0)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   22.820842] -(0)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   22.820852] -(0)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   22.820860] -(0)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   22.820869] -(0)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   22.820877] -(0)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   22.820886] -(0)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   22.820895] -(0)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   22.820904] -(0)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   22.820913] -(0)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   22.820925] -(0)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   22.820934] -(0)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   22.821013]  (0)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3622 ]---
<5>[   22.821040]  (0)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   22.821048]  (0)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   22.821063]  (0)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba50!
<6>[   22.821070]  (0)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   22.821078]  (0)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   22.821084]  (0)[513:HwBinder:346_2]WARNING: CPU: 0 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x17cc/0x2460()
<4>[   22.821099]  (0)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   22.821136] -(0)[513:HwBinder:346_2]CPU: 0 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   22.821144] -(0)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   22.821151] -(0)[513:HwBinder:346_2]Call trace:
<4>[   22.821157] -(0)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   22.821175] -(0)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   22.821187] -(0)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   22.821198] -(0)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   22.821208] -(0)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   22.821218] -(0)[513:HwBinder:346_2][<ffffff800855098c>] ddp_dsi_config+0x17cc/0x2460
<4>[   22.821228] -(0)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   22.821238] -(0)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   22.821250] -(0)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   22.821263] -(0)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   22.821272] -(0)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   22.821282] -(0)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   22.821293] -(0)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   22.821304] -(0)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   22.821313] -(0)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   22.821325] -(0)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   22.821334] -(0)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   22.821348] -(0)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   22.821361] -(0)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   22.821370]  (0)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3623 ]---
<5>[   22.821383]  (0)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   22.821393]  (0)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   22.821412]  (0)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba58!
<6>[   22.821423]  (0)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   22.821431]  (0)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   22.821440]  (0)[513:HwBinder:346_2]WARNING: CPU: 0 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1834/0x2460()
<4>[   22.821458]  (0)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   22.821506] -(0)[513:HwBinder:346_2]CPU: 0 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   22.821515] -(0)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   22.821526] -(0)[513:HwBinder:346_2]Call trace:
<4>[   22.821533] -(0)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   22.821545] -(0)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   22.821554] -(0)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   22.821567] -(0)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   22.821579] -(0)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   22.821589] -(0)[513:HwBinder:346_2][<ffffff80085509f4>] ddp_dsi_config+0x1834/0x2460
<4>[   22.821600] -(0)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   22.821610] -(0)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   22.821623] -(0)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   22.821633] -(0)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   22.821643] -(0)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   22.821653] -(0)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   22.821662] -(0)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   22.821674] -(0)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   22.821685] -(0)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   22.821696] -(0)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   22.821706] -(0)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   22.821718] -(0)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   22.821729] -(0)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   22.821739]  (0)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3624 ]---
<5>[   22.821750]  (0)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   22.821763]  (0)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   22.821776]  (0)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba5c!
<6>[   22.821785]  (0)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   22.821795]  (0)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   22.821803]  (0)[513:HwBinder:346_2]WARNING: CPU: 0 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x189c/0x2460()
<4>[   22.821818]  (0)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   22.821863] -(0)[513:HwBinder:346_2]CPU: 0 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   22.821873] -(0)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   22.821882] -(0)[513:HwBinder:346_2]Call trace:
<4>[   22.821887] -(0)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   22.821898] -(0)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   22.821910] -(0)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   22.821920] -(0)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   22.821931] -(0)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   22.821942] -(0)[513:HwBinder:346_2][<ffffff8008550a5c>] ddp_dsi_config+0x189c/0x2460
<4>[   22.821951] -(0)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   22.821963] -(0)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   22.821974] -(0)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   22.821985] -(0)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   22.821996] -(0)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   22.822005] -(0)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   22.822017] -(0)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   22.822027] -(0)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   22.822038] -(0)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   22.822049] -(0)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   22.822058] -(0)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   22.822070] -(0)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   22.822079] -(0)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   22.822091]  (0)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3625 ]---
<5>[   22.822100]  (0)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   22.822111]  (0)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   22.822127]  (0)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba18!
<6>[   22.822136]  (0)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   22.822146]  (0)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   22.822153]  (0)[513:HwBinder:346_2]WARNING: CPU: 0 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1904/0x2460()
<4>[   22.822170]  (0)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   22.822216] -(0)[513:HwBinder:346_2]CPU: 0 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   22.822227] -(0)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   22.822235] -(0)[513:HwBinder:346_2]Call trace:
<4>[   22.822244] -(0)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   22.822254] -(0)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   22.822266] -(0)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   22.822278] -(0)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   22.822288] -(0)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   22.822298] -(0)[513:HwBinder:346_2][<ffffff8008550ac4>] ddp_dsi_config+0x1904/0x2460
<4>[   22.822309] -(0)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   22.822319] -(0)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   22.822330] -(0)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   22.822342] -(0)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   22.822350] -(0)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   22.822362] -(0)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   22.822372] -(0)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   22.822381] -(0)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   22.822392] -(0)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   22.822402] -(0)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   22.822412] -(0)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   22.822425] -(0)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   22.822434] -(0)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   22.822445]  (0)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3626 ]---
<5>[   22.822457]  (0)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   22.822468]  (0)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   22.822482]  (0)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba20!
<6>[   22.822490]  (0)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   22.822500]  (0)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   22.822505]  (0)[513:HwBinder:346_2]WARNING: CPU: 0 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x196c/0x2460()
<4>[   22.822522]  (0)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   22.822567] -(0)[513:HwBinder:346_2]CPU: 0 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   22.822576] -(0)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   22.822587] -(0)[513:HwBinder:346_2]Call trace:
<4>[   22.822592] -(0)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   22.822603] -(0)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   22.822616] -(0)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   22.822626] -(0)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   22.822639] -(0)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   22.822648] -(0)[513:HwBinder:346_2][<ffffff8008550b2c>] ddp_dsi_config+0x196c/0x2460
<4>[   22.822659] -(0)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   22.822671] -(0)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   22.822683] -(0)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   22.822695] -(0)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   22.822707] -(0)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   22.822717] -(0)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   22.822726] -(0)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   22.822738] -(0)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   22.822747] -(0)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   22.822758] -(0)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   22.822769] -(0)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   22.822780] -(0)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   22.822791] -(0)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   22.822799]  (0)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3627 ]---
<5>[   22.822812]  (0)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   22.822819]  (0)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   22.822836]  (0)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba28!
<6>[   22.822845]  (0)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   22.822855]  (0)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   22.822863]  (0)[513:HwBinder:346_2]WARNING: CPU: 0 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x19d4/0x2460()
<4>[   22.822878]  (0)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   22.822929] -(0)[513:HwBinder:346_2]CPU: 0 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   22.822937] -(0)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   22.822949] -(0)[513:HwBinder:346_2]Call trace:
<4>[   22.822955] -(0)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   22.822966] -(0)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   22.822977] -(0)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   22.822987] -(0)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   22.822999] -(0)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   22.823010] -(0)[513:HwBinder:346_2][<ffffff8008550b94>] ddp_dsi_config+0x19d4/0x2460
<4>[   22.823019] -(0)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   22.823032] -(0)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   22.823042] -(0)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   22.823055] -(0)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   22.823065] -(0)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   22.823075] -(0)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   22.823086] -(0)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   22.823094] -(0)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   22.823106] -(0)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   22.823117] -(0)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   22.823125] -(0)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   22.823139] -(0)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   22.823150] -(0)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   22.823159]  (0)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3628 ]---
<5>[   22.823173]  (0)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   22.823180]  (0)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   22.823193]  (0)[513:HwBinder:346_2][DISP]===>v_a-v_b=0x18e3,HSTX_CKLP_WC=0xffffffc0
<6>[   22.823201]  (0)[513:HwBinder:346_2][DISP]===>v_b+v_c=0x3a4,HFP_WC=0x25
<6>[   22.823212]  (0)[513:HwBinder:346_2][DISP]===>Will Reconfig in order to fulfill LP clock lane per line
<6>[   22.823227]  (0)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba48!
<6>[   22.823236]  (0)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   22.823246]  (0)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   22.823255]  (0)[513:HwBinder:346_2]WARNING: CPU: 0 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1b58/0x2460()
<4>[   22.823270]  (0)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   22.823316] -(0)[513:HwBinder:346_2]CPU: 0 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   22.823326] -(0)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   22.823334] -(0)[513:HwBinder:346_2]Call trace:
<4>[   22.823340] -(0)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   22.823351] -(0)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   22.823362] -(0)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   22.823373] -(0)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   22.823384] -(0)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   22.823395] -(0)[513:HwBinder:346_2][<ffffff8008550d18>] ddp_dsi_config+0x1b58/0x2460
<4>[   22.823403] -(0)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   22.823414] -(0)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   22.823426] -(0)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   22.823436] -(0)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   22.823447] -(0)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   22.823458] -(0)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   22.823467] -(0)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   22.823478] -(0)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   22.823487] -(0)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   22.823498] -(0)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   22.823509] -(0)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   22.823520] -(0)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   22.823532] -(0)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   22.823541]  (0)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3629 ]---
<5>[   22.823553]  (0)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   22.823561]  (0)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   22.823580]  (0)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba60!
<6>[   22.823591]  (0)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   22.823601]  (0)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   22.823610]  (0)[513:HwBinder:346_2]WARNING: CPU: 0 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1cc4/0x2460()
<4>[   22.823626]  (0)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   22.823672] -(0)[513:HwBinder:346_2]CPU: 0 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   22.823681] -(0)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   22.823692] -(0)[513:HwBinder:346_2]Call trace:
<4>[   22.823699] -(0)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   22.823712] -(0)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   22.823723] -(0)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   22.823732] -(0)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   22.823745] -(0)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   22.823754] -(0)[513:HwBinder:346_2][<ffffff8008550e84>] ddp_dsi_config+0x1cc4/0x2460
<4>[   22.823763] -(0)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   22.823776] -(0)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   22.823787] -(0)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   22.823802] -(0)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   22.823810] -(0)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   22.823819] -(0)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   22.823830] -(0)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   22.823838] -(0)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   22.823848] -(0)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   22.823859] -(0)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   22.823867] -(0)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   22.823878] -(0)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   22.823890] -(0)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   22.823898]  (0)[513:HwBinder:346_2]---[ end trace e335f74a8dfe362a ]---
<5>[   22.823908]  (0)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   22.823917]  (0)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   22.823928]  (0)[513:HwBinder:346_2][DISP]===>new HSTX_CKL_WC=0x4000, HFP_WC=0x250
<6>[   22.824101]  (0)[513:HwBinder:346_2][DISP]primary display is DIRECT_LINK mode now
<6>[   22.876409]  (1)[351:android.hardwar][wlan]mtk_cfg80211_vendor_get_roaming_capabilities:(REQ INFO) Get roaming capabilities: max black/whitelist=16/8
<6>[   22.880806]  (1)[351:android.hardwar][wlan]mtk_cfg80211_vendor_config_roaming:(REQ INFO) Receives roaming blacklist & whitelist with data_len=16
<6>[   22.880882]  (1)[1113:tx_thread][wlan]wlanoidConfigRoaming:(REQ INFO) Get the number of blacklist=0
<6>[   22.880964]  (1)[1113:tx_thread][wlan]aisRefreshFWKBlacklist:(AIS INFO) Refresh all the BSSes' fgIsInFWKBlacklist to FALSE
<5>[   22.898970]  (1)[962:WifiStateMachin]alarm_dev: alarm 2 set 42.893000000
<5>[   22.899002] -(1)[962:WifiStateMachin]alarmtimer_enqueue, 42893000000
<6>[   22.901010]  (1)[469:wificond][wlan]mtk_cfg80211_scan:(REQ INFO) mtk_cfg80211_scan(), n_ssids=1, num_ssid=(1=>0), wildcard=0x1
<6>[   22.901200]  (3)[1113:tx_thread][wlan]wlanoidGetChannelInfo:(OID INFO) Partial Scan: set channel i=13
<6>[   22.901236]  (3)[1113:tx_thread][wlan]aisFsmSteps:(AIS STATE) [13] TRANSITION: [0] -> [2]
<6>[   22.901255]  (3)[1113:tx_thread][wlan]rlmActivateNetwork:(RLM INFO) rlm: active=0, Type=0, Src=2, SrcVal=2
<6>[   22.901309]  (3)[1113:tx_thread][wlan]scnFsmSteps:(SCN STATE) [19] TRANSITION: [0] -> [1]
<6>[   22.901332]  (0)[967:WifiScanningSer][wlan]scnSendScanReqV2:(SCN INFO) ScanReqV3: ScanType=1, SSIDType=1, Num=0, ChannelType=4, Num=13
<5>[   22.903759]  (0)[967:WifiScanningSer]alarm_dev: alarm 2 set 38.292000000
<5>[   22.903798] -(0)[967:WifiScanningSer]alarmtimer_enqueue, 38292000000
<3>[   22.905487]  (0)[327:kworker/u8:5][ALS/PS] stk_ps_tune_zero_func_fae: update psa: psa=140,psi=137
<6>[   22.912295]  (2)[1113:tx_thread][wlan]nicTxCmd:(TX INFO) ucCmdSeqNum =10, ucCID =4
<6>[   22.914199]  (0)[1113:tx_thread][wlan]nicRxProcessEventPacket:(RX INFO) [F-L][433] #T#5701# Ver:0xB.1.74 CS[1,1] DIS 0x0 AC 0x107F BCN[0, 0, 0, 0, 0x0, 0x4000] RCPI [255, 255, 255, 255], ROAM [0, 0, 0, 0, 255, 0, 255, 0] TXPara[0x0, 0x0, 0x31330000, 0x0, 0x0,0x0, 0x18181818, 0x82000, 0x12000000, I: (0, 0), C: (0, 0), W: 1906079 CHP: (255, 255) ], TxBASz 0, RxBASz 0  Gamemode 0 Mem 64 Dg 0, 0, 0, 0, 0, 0, Kd:0 TP(T:0 R:0)Kbps, BTOn 0, Suspend=0 Hotspot=0, TestMode 0, EB 0 <BCM>0x0(0000000) 220 4 106 110 10000000
<6>[   22.914199] 
<6>[   22.914238]  (0)[1113:tx_thread][wlan]nicRxProcessEventPacket:(RX INFO) [F-L]FW receive Scan Cmd V3!! SeqNum 1, NT 0, ScanType 1, ChDT 0,  ChType 4, ChNum 13 , SSIDType 1, SSIDNum 0
<6>[   22.914238] 
<6>[   22.914377]  (0)[1113:tx_thread][wlan]nicRxProcessEventPacket:(RX INFO) [F-L](1) SCAN_STATE_SCAN_START, ScanType 4, PscnFlag 0x0, PscnEn 0
<6>[   22.914377] 
<7>[   23.126318]  (2)[1470:kschedfreq:0]mt_fh_hal_general_pll_dfs, [Pll_ID]:0 [current dds(CON1)]:0xe6000, [target dds]:868352
<7>[   23.127399] mt_fh_hal_general_pll_dfs, [Pll_ID]:0 [current dds(CON1)]:0xd4000, [target dds]:942080<6>[   23.237917]  (2)[149:disp_idlemgr][DISP][disp_lowpower]_vdo_mode_enter_idle
<6>[   23.237947]  (2)[149:disp_idlemgr][DISP]primary display will switch from DIRECT_LINK to DECOUPLE
<6>[   23.247788]  (1)[149:disp_idlemgr][DISP]dl_to_dc capture:Flush wait wdma sof
<6>[   23.269841]  (0)[149:disp_idlemgr][DDP/OVL]warn:ovl_roi:(480x800)
<6>[   23.269961]  (0)[149:disp_idlemgr][DISP]primary display is DECOUPLE mode now
<6>[   23.270165]  (2)[513:HwBinder:346_2][DISP][disp_lowpower]_vdo_mode_leave_idle
<6>[   23.270303]  (2)[513:HwBinder:346_2][DISP]primary display will switch from DECOUPLE to DIRECT_LINK
<6>[   23.270547]  (2)[513:HwBinder:346_2][DDP/OVL]warn:ovl_roi:(480x800)
<7>[   23.271029]  (2)[513:HwBinder:346_2][PWM] TOPCKGEN node exist
<7>[   23.271054]  (2)[513:HwBinder:346_2][PWM] clk_req=0 clkid=19
<7>[   23.271067]  (2)[513:HwBinder:346_2][PWM] PWM_MUX 81040300->81040300
<6>[   23.271202]  (2)[513:HwBinder:346_2][DDP/DSI]warn:DSI_Set_VM_CMD
<6>[   23.271215]  (2)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba30!
<6>[   23.271227]  (2)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   23.271236]  (2)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   23.271243]  (2)[513:HwBinder:346_2]WARNING: CPU: 2 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1694/0x2460()
<4>[   23.271262]  (2)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   23.271300] -(2)[513:HwBinder:346_2]CPU: 2 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   23.271308] -(2)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   23.271316] -(2)[513:HwBinder:346_2]Call trace:
<4>[   23.271321] -(2)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   23.271335] -(2)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   23.271344] -(2)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   23.271355] -(2)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   23.271365] -(2)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   23.271374] -(2)[513:HwBinder:346_2][<ffffff8008550854>] ddp_dsi_config+0x1694/0x2460
<4>[   23.271383] -(2)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   23.271394] -(2)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   23.271404] -(2)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   23.271415] -(2)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   23.271424] -(2)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   23.271433] -(2)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   23.271441] -(2)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   23.271450] -(2)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   23.271459] -(2)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   23.271468] -(2)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   23.271477] -(2)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   23.271488] -(2)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   23.271497] -(2)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   23.271506]  (2)[513:HwBinder:346_2]---[ end trace e335f74a8dfe362b ]---
<5>[   23.271518]  (2)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   23.271526]  (2)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   23.271541]  (2)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba38!
<6>[   23.271549]  (2)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   23.271557]  (2)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   23.271563]  (2)[513:HwBinder:346_2]WARNING: CPU: 2 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x16fc/0x2460()
<4>[   23.271576]  (2)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   23.271611] -(2)[513:HwBinder:346_2]CPU: 2 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   23.271620] -(2)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   23.271626] -(2)[513:HwBinder:346_2]Call trace:
<4>[   23.271632] -(2)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   23.271642] -(2)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   23.271651] -(2)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   23.271663] -(2)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   23.271673] -(2)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   23.271681] -(2)[513:HwBinder:346_2][<ffffff80085508bc>] ddp_dsi_config+0x16fc/0x2460
<4>[   23.271690] -(2)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   23.271700] -(2)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   23.271710] -(2)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   23.271720] -(2)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   23.271728] -(2)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   23.271736] -(2)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   23.271744] -(2)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   23.271753] -(2)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   23.271762] -(2)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   23.271771] -(2)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   23.271778] -(2)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   23.271788] -(2)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   23.271797] -(2)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   23.271805]  (2)[513:HwBinder:346_2]---[ end trace e335f74a8dfe362c ]---
<5>[   23.271815]  (2)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   23.271823]  (2)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   23.271837]  (2)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba40!
<6>[   23.271845]  (2)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   23.271853]  (2)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   23.271859]  (2)[513:HwBinder:346_2]WARNING: CPU: 2 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1764/0x2460()
<4>[   23.271872]  (2)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   23.271906] -(2)[513:HwBinder:346_2]CPU: 2 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   23.271914] -(2)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   23.271921] -(2)[513:HwBinder:346_2]Call trace:
<4>[   23.271926] -(2)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   23.271936] -(2)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   23.271945] -(2)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   23.271954] -(2)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   23.271964] -(2)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   23.271973] -(2)[513:HwBinder:346_2][<ffffff8008550924>] ddp_dsi_config+0x1764/0x2460
<4>[   23.271981] -(2)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   23.271991] -(2)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   23.272001] -(2)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   23.272011] -(2)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   23.272020] -(2)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   23.272028] -(2)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   23.272036] -(2)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   23.272045] -(2)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   23.272053] -(2)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   23.272061] -(2)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   23.272070] -(2)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   23.272080] -(2)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   23.272089] -(2)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   23.272098]  (2)[513:HwBinder:346_2]---[ end trace e335f74a8dfe362d ]---
<5>[   23.272107]  (2)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   23.272114]  (2)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   23.272128]  (2)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba50!
<6>[   23.272136]  (2)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   23.272144]  (2)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   23.272150]  (2)[513:HwBinder:346_2]WARNING: CPU: 2 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x17cc/0x2460()
<4>[   23.272163]  (2)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   23.272199] -(2)[513:HwBinder:346_2]CPU: 2 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   23.272207] -(2)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   23.272213] -(2)[513:HwBinder:346_2]Call trace:
<4>[   23.272219] -(2)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   23.272230] -(2)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   23.272238] -(2)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   23.272248] -(2)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   23.272257] -(2)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   23.272266] -(2)[513:HwBinder:346_2][<ffffff800855098c>] ddp_dsi_config+0x17cc/0x2460
<4>[   23.272274] -(2)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   23.272284] -(2)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   23.272293] -(2)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   23.272303] -(2)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   23.272311] -(2)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   23.272320] -(2)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   23.272328] -(2)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   23.272337] -(2)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   23.272346] -(2)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   23.272354] -(2)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   23.272363] -(2)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   23.272373] -(2)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   23.272382] -(2)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   23.272391]  (2)[513:HwBinder:346_2]---[ end trace e335f74a8dfe362e ]---
<5>[   23.272400]  (2)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   23.272408]  (2)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   23.272421]  (2)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba58!
<6>[   23.272430]  (2)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   23.272438]  (2)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   23.272444]  (2)[513:HwBinder:346_2]WARNING: CPU: 2 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1834/0x2460()
<4>[   23.272457]  (2)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   23.272491] -(2)[513:HwBinder:346_2]CPU: 2 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   23.272499] -(2)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   23.272505] -(2)[513:HwBinder:346_2]Call trace:
<4>[   23.272511] -(2)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   23.272520] -(2)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   23.272529] -(2)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   23.272538] -(2)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   23.272547] -(2)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   23.272556] -(2)[513:HwBinder:346_2][<ffffff80085509f4>] ddp_dsi_config+0x1834/0x2460
<4>[   23.272564] -(2)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   23.272574] -(2)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   23.272583] -(2)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   23.272593] -(2)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   23.272601] -(2)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   23.272610] -(2)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   23.272618] -(2)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   23.272627] -(2)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   23.272636] -(2)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   23.272644] -(2)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   23.272653] -(2)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   23.272664] -(2)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   23.272674] -(2)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   23.272683]  (2)[513:HwBinder:346_2]---[ end trace e335f74a8dfe362f ]---
<5>[   23.272692]  (2)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   23.272700]  (2)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   23.272713]  (2)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba5c!
<6>[   23.272722]  (2)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   23.272730]  (2)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   23.272736]  (2)[513:HwBinder:346_2]WARNING: CPU: 2 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x189c/0x2460()
<4>[   23.272749]  (2)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   23.272784] -(2)[513:HwBinder:346_2]CPU: 2 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   23.272792] -(2)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   23.272799] -(2)[513:HwBinder:346_2]Call trace:
<4>[   23.272804] -(2)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   23.272815] -(2)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   23.272824] -(2)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   23.272835] -(2)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   23.272844] -(2)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   23.272853] -(2)[513:HwBinder:346_2][<ffffff8008550a5c>] ddp_dsi_config+0x189c/0x2460
<4>[   23.272861] -(2)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   23.272871] -(2)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   23.272880] -(2)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   23.272889] -(2)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   23.272897] -(2)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   23.272906] -(2)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   23.272914] -(2)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   23.272923] -(2)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   23.272933] -(2)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   23.272942] -(2)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   23.272950] -(2)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   23.272960] -(2)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   23.272969] -(2)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   23.273013]  (2)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3630 ]---
<5>[   23.273041]  (2)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   23.273051]  (2)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   23.273066]  (2)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba18!
<6>[   23.273075]  (2)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   23.273084]  (2)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   23.273092]  (2)[513:HwBinder:346_2]WARNING: CPU: 2 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1904/0x2460()
<4>[   23.273111]  (2)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   23.273160] -(2)[513:HwBinder:346_2]CPU: 2 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   23.273169] -(2)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   23.273180] -(2)[513:HwBinder:346_2]Call trace:
<4>[   23.273185] -(2)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   23.273199] -(2)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   23.273211] -(2)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   23.273224] -(2)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   23.273234] -(2)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   23.273245] -(2)[513:HwBinder:346_2][<ffffff8008550ac4>] ddp_dsi_config+0x1904/0x2460
<4>[   23.273256] -(2)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   23.273268] -(2)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   23.273281] -(2)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   23.273293] -(2)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   23.273304] -(2)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   23.273315] -(2)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   23.273324] -(2)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   23.273335] -(2)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   23.273344] -(2)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   23.273356] -(2)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   23.273367] -(2)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   23.273380] -(2)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   23.273391] -(2)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   23.273402]  (2)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3631 ]---
<5>[   23.273417]  (2)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   23.273430]  (2)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   23.273444]  (2)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba20!
<6>[   23.273453]  (2)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   23.273465]  (2)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   23.273471]  (2)[513:HwBinder:346_2]WARNING: CPU: 2 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x196c/0x2460()
<4>[   23.273485]  (2)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   23.273533] -(2)[513:HwBinder:346_2]CPU: 2 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   23.273543] -(2)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   23.273552] -(2)[513:HwBinder:346_2]Call trace:
<4>[   23.273559] -(2)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   23.273571] -(2)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   23.273581] -(2)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   23.273592] -(2)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   23.273603] -(2)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   23.273617] -(2)[513:HwBinder:346_2][<ffffff8008550b2c>] ddp_dsi_config+0x196c/0x2460
<4>[   23.273625] -(2)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   23.273637] -(2)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   23.273646] -(2)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   23.273657] -(2)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   23.273668] -(2)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   23.273677] -(2)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   23.273687] -(2)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   23.273699] -(2)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   23.273708] -(2)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   23.273720] -(2)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   23.273730] -(2)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   23.273745] -(2)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   23.273755] -(2)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   23.273765]  (2)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3632 ]---
<5>[   23.273777]  (2)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   23.273788]  (2)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   23.273808]  (2)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba28!
<6>[   23.273818]  (2)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   23.273830]  (2)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   23.273836]  (2)[513:HwBinder:346_2]WARNING: CPU: 2 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x19d4/0x2460()
<4>[   23.273851]  (2)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   23.273898] -(2)[513:HwBinder:346_2]CPU: 2 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   23.273907] -(2)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   23.273916] -(2)[513:HwBinder:346_2]Call trace:
<4>[   23.273921] -(2)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   23.273934] -(2)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   23.273947] -(2)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   23.273958] -(2)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   23.273970] -(2)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   23.273981] -(2)[513:HwBinder:346_2][<ffffff8008550b94>] ddp_dsi_config+0x19d4/0x2460
<4>[   23.273990] -(2)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   23.274003] -(2)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   23.274013] -(2)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   23.274024] -(2)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   23.274035] -(2)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   23.274045] -(2)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   23.274056] -(2)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   23.274067] -(2)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   23.274076] -(2)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   23.274088] -(2)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   23.274096] -(2)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   23.274107] -(2)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   23.274116] -(2)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   23.274126]  (2)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3633 ]---
<5>[   23.274137]  (2)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   23.274145]  (2)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   23.274155]  (2)[513:HwBinder:346_2][DISP]===>v_a-v_b=0x18e3,HSTX_CKLP_WC=0xffffffc0
<6>[   23.274165]  (2)[513:HwBinder:346_2][DISP]===>v_b+v_c=0x3a4,HFP_WC=0x25
<6>[   23.274172]  (2)[513:HwBinder:346_2][DISP]===>Will Reconfig in order to fulfill LP clock lane per line
<6>[   23.274188]  (2)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba48!
<6>[   23.274200]  (2)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   23.274210]  (2)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   23.274217]  (2)[513:HwBinder:346_2]WARNING: CPU: 2 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1b58/0x2460()
<4>[   23.274232]  (2)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   23.274279] -(2)[513:HwBinder:346_2]CPU: 2 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   23.274291] -(2)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   23.274298] -(2)[513:HwBinder:346_2]Call trace:
<4>[   23.274307] -(2)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   23.274318] -(2)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   23.274332] -(2)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   23.274343] -(2)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   23.274354] -(2)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   23.274366] -(2)[513:HwBinder:346_2][<ffffff8008550d18>] ddp_dsi_config+0x1b58/0x2460
<4>[   23.274374] -(2)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   23.274387] -(2)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   23.274398] -(2)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   23.274410] -(2)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   23.274421] -(2)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   23.274430] -(2)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   23.274441] -(2)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   23.274449] -(2)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   23.274462] -(2)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   23.274472] -(2)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   23.274482] -(2)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   23.274494] -(2)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   23.274503] -(2)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   23.274515]  (2)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3634 ]---
<5>[   23.274523]  (2)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   23.274534]  (2)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   23.274551]  (2)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba60!
<6>[   23.274560]  (2)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   23.274572]  (2)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   23.274580]  (2)[513:HwBinder:346_2]WARNING: CPU: 2 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1cc4/0x2460()
<4>[   23.274595]  (2)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   23.274640] -(2)[513:HwBinder:346_2]CPU: 2 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   23.274650] -(2)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   23.274659] -(2)[513:HwBinder:346_2]Call trace:
<4>[   23.274664] -(2)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   23.274675] -(2)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   23.274688] -(2)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   23.274698] -(2)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   23.274711] -(2)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   23.274720] -(2)[513:HwBinder:346_2][<ffffff8008550e84>] ddp_dsi_config+0x1cc4/0x2460
<4>[   23.274731] -(2)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   23.274743] -(2)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   23.274756] -(2)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   23.274768] -(2)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   23.274779] -(2)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   23.274788] -(2)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   23.274796] -(2)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   23.274805] -(2)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   23.274817] -(2)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   23.274825] -(2)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   23.274836] -(2)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   23.274848] -(2)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   23.274858] -(2)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   23.274870]  (2)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3635 ]---
<5>[   23.274879]  (2)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   23.274889]  (2)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   23.274901]  (2)[513:HwBinder:346_2][DISP]===>new HSTX_CKL_WC=0x4000, HFP_WC=0x250
<6>[   23.275006]  (2)[513:HwBinder:346_2][DISP]primary display is DIRECT_LINK mode now
<5>[   23.386392]  (1)[374:vendor.mediatek][Power/PPM] (0x40)(-1)(0)(0-3)(0)(0)(4)(4) 
<7>[   23.387017]  (1)[374:vendor.mediatek][Boost Controller]kicker:0, boost:1100, final:1100, current:1100
<7>[   23.387223] FBT:exit game mode<5>[   23.398090]  (0)[374:vendor.mediatek][Power/PPM] (0x0)(-1)(0)(0-3)(15)(0)(4)(4) 
<7>[   23.398808]  (0)[374:vendor.mediatek][Boost Controller]kicker:0, boost:0, final:0, current:0
<7>[   23.399106] FBT:exit game mode<6>[   23.411059]  (1)[1113:tx_thread][wlan]wlanReadFwInfoFromEmi:(RX INFO) >>Addr:0xffffffc004fd5e08 CurIdx:1360,PreIdx:1122!
<4>[   23.411095]  (1)[1113:tx_thread][HIF-SDIO][I]wmt_lib_get_fwinfor_from_emi:vir addr(0xffffff800ef80862)
<6>[   23.411134]  (1)[1113:tx_thread][wlan]wlanDumpFwInforPrintBuff:(RX INFO) [CONNSYS][WIFI]#3185#14#IdcMdB220 4 106 110 0 0 0 0,0 0 0 0,0 0 0 0,0 0 0 0,0 0 0 0
<6>[   23.411142]  (1)[1113:tx_thread][wlan]wlanDumpFwInforPrintBuff:(RX INFO) [CONNSYS][WIFI]#3187#15#Idc l:1 m:0 wp:0 lp:0 0 wf:0 0 0 0
<6>[   23.411149]  (1)[1113:tx_thread][wlan]wlanDumpFwInforPrintBuff:(RX INFO) [CONNSYS][WIFI]#5086#16#[MAC]  OWN MAC Dis : 0 
<6>[   23.411158]  (2)[473:kworker/2:2][wlan]wlanDumpFwInforPrintBuff:(RX INFO) [CONNSYS][WIFI]#5703#17#[MAC]  OWN MAC En : 1 
<6>[   23.413153]  (2)[473:kworker/2:2]usb_state<DISCONNECTED>
<14>[   23.533361]  (2)[1:init]init: PropSet [persist.radio.sim.mode]=[1] Done
<14>[   23.546641]  (2)[1:init]init: PropSet [ril.imsi.status.sim1]=[0] Done
<6>[   23.588236]  (2)[1113:tx_thread][wlan]scnFsmGenerateScanDoneMsg:(SCN INFO) Rcv Scan Done, NetIdx 0, Obss 0, Status 0, Seq 1 ,STA MAC:[b0:35:0b:71:32:7e] FwVer: 0xb01.74 DriVer:11_70_20170324_1_TC10
<6>[   23.588279]  (2)[1113:tx_thread][wlan]scnFsmSteps:(SCN STATE) [19] TRANSITION: [1] -> [0]
<6>[   23.588290]  (2)[1113:tx_thread][wlan]nicRxProcessEventPacket:(RX INFO) [F-L](1) [SCAN]: TotalChNum 13, ToDriver 11, Bcn 11, ProbeRsp 14, [1,19],[2,6],[3,4],[4,0],[5,0],[6,2],[7,0],[8,0],[9,4],[10,3],[11,10],[12,4],[13,2],
<6>[   23.588290] 
<6>[   23.588318]  (2)[1113:tx_thread][wlan]wlanCheckConnectedAP:(SCN WARN) disconnect state, no need to report!
<6>[   23.588328]  (2)[1113:tx_thread][wlan]scanLogEssResult:(SCN INFO) Total:10/11; Internet; zsb; TP702; maidu_office; Xiaomi_Ruan; Test; maidu_meeting_2g; office1_2.4GHz; dlink; Guest_2.4GHz; ; ; ; ; ; 
<6>[   23.588561]  (2)[1113:tx_thread][wlan]aisFsmSteps:(AIS STATE) [13] TRANSITION: [2] -> [0]
<6>[   23.588588]  (2)[1113:tx_thread][wlan]aisFsmGetNextRequest:(AIS INFO) aisFsmGetNextRequest
<6>[   23.588597]  (2)[1113:tx_thread][wlan]rlmDeactivateNetwork:(RLM INFO) rlmDeactivateNetwork, Type = 0, Src = 3, Active = 1, SrcVal= 0
<5>[   23.596720]  (0)[967:WifiScanningSer]alarm_dev: alarm 2 set 42.893000000
<5>[   23.596757] -(0)[967:WifiScanningSer]alarmtimer_enqueue, 42893000000
<6>[   23.597585]  (1)[1113:tx_thread][wlan]qmHandleEventBssAbsencePresence:(QM INFO) NAF=0,0,0
<6>[   23.689027]  (1)[149:disp_idlemgr][DISP][disp_lowpower]_vdo_mode_enter_idle
<6>[   23.689058]  (1)[149:disp_idlemgr][DISP]primary display will switch from DIRECT_LINK to DECOUPLE
<6>[   23.691976]  (1)[149:disp_idlemgr][DISP]dl_to_dc capture:Flush wait wdma sof
<6>[   23.714192]  (2)[149:disp_idlemgr][DDP/OVL]warn:ovl_roi:(480x800)
<6>[   23.714308]  (2)[149:disp_idlemgr][DISP]primary display is DECOUPLE mode now
<6>[   24.009700]  (0)[513:HwBinder:346_2][DISP][disp_lowpower]_vdo_mode_leave_idle
<6>[   24.009984]  (0)[513:HwBinder:346_2][DISP]primary display will switch from DECOUPLE to DIRECT_LINK
<6>[   24.010260]  (0)[513:HwBinder:346_2][DDP/OVL]warn:ovl_roi:(480x800)
<7>[   24.010683]  (0)[513:HwBinder:346_2][PWM] TOPCKGEN node exist
<7>[   24.010700]  (0)[513:HwBinder:346_2][PWM] clk_req=0 clkid=19
<7>[   24.010714]  (0)[513:HwBinder:346_2][PWM] PWM_MUX 81040300->81040300
<6>[   24.010847]  (0)[513:HwBinder:346_2][DDP/DSI]warn:DSI_Set_VM_CMD
<6>[   24.010859]  (0)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba30!
<6>[   24.010872]  (0)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   24.010881]  (0)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   24.010887]  (0)[513:HwBinder:346_2]WARNING: CPU: 0 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1694/0x2460()
<4>[   24.010906]  (0)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   24.010944] -(0)[513:HwBinder:346_2]CPU: 0 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   24.010953] -(0)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   24.010960] -(0)[513:HwBinder:346_2]Call trace:
<4>[   24.010966] -(0)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   24.010979] -(0)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   24.010988] -(0)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   24.010998] -(0)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   24.011008] -(0)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   24.011017] -(0)[513:HwBinder:346_2][<ffffff8008550854>] ddp_dsi_config+0x1694/0x2460
<4>[   24.011025] -(0)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   24.011037] -(0)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   24.011048] -(0)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   24.011058] -(0)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   24.011067] -(0)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   24.011076] -(0)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   24.011083] -(0)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   24.011092] -(0)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   24.011101] -(0)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   24.011110] -(0)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   24.011118] -(0)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   24.011130] -(0)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   24.011139] -(0)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   24.011147]  (0)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3636 ]---
<5>[   24.011156]  (0)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   24.011164]  (0)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   24.011176]  (0)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba38!
<6>[   24.011183]  (0)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   24.011190]  (0)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   24.011196]  (0)[513:HwBinder:346_2]WARNING: CPU: 0 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x16fc/0x2460()
<4>[   24.011207]  (0)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   24.011240] -(0)[513:HwBinder:346_2]CPU: 0 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   24.011248] -(0)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   24.011253] -(0)[513:HwBinder:346_2]Call trace:
<4>[   24.011259] -(0)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   24.011269] -(0)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   24.011277] -(0)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   24.011288] -(0)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   24.011298] -(0)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   24.011307] -(0)[513:HwBinder:346_2][<ffffff80085508bc>] ddp_dsi_config+0x16fc/0x2460
<4>[   24.011316] -(0)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   24.011326] -(0)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   24.011336] -(0)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   24.011345] -(0)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   24.011353] -(0)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   24.011362] -(0)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   24.011370] -(0)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   24.011379] -(0)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   24.011388] -(0)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   24.011397] -(0)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   24.011405] -(0)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   24.011415] -(0)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   24.011424] -(0)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   24.011433]  (0)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3637 ]---
<5>[   24.011442]  (0)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   24.011450]  (0)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   24.011463]  (0)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba40!
<6>[   24.011471]  (0)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   24.011479]  (0)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   24.011484]  (0)[513:HwBinder:346_2]WARNING: CPU: 0 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1764/0x2460()
<4>[   24.011497]  (0)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   24.011531] -(0)[513:HwBinder:346_2]CPU: 0 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   24.011539] -(0)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   24.011545] -(0)[513:HwBinder:346_2]Call trace:
<4>[   24.011550] -(0)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   24.011560] -(0)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   24.011568] -(0)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   24.011578] -(0)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   24.011588] -(0)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   24.011596] -(0)[513:HwBinder:346_2][<ffffff8008550924>] ddp_dsi_config+0x1764/0x2460
<4>[   24.011604] -(0)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   24.011614] -(0)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   24.011623] -(0)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   24.011632] -(0)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   24.011639] -(0)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   24.011648] -(0)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   24.011656] -(0)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   24.011665] -(0)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   24.011673] -(0)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   24.011682] -(0)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   24.011690] -(0)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   24.011700] -(0)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   24.011709] -(0)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   24.011717]  (0)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3638 ]---
<5>[   24.011726]  (0)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   24.011734]  (0)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   24.011747]  (0)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba50!
<6>[   24.011754]  (0)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   24.011762]  (0)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   24.011767]  (0)[513:HwBinder:346_2]WARNING: CPU: 0 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x17cc/0x2460()
<4>[   24.011780]  (0)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   24.011812] -(0)[513:HwBinder:346_2]CPU: 0 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   24.011821] -(0)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   24.011827] -(0)[513:HwBinder:346_2]Call trace:
<4>[   24.011832] -(0)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   24.011841] -(0)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   24.011849] -(0)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   24.011858] -(0)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   24.011867] -(0)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   24.011876] -(0)[513:HwBinder:346_2][<ffffff800855098c>] ddp_dsi_config+0x17cc/0x2460
<4>[   24.011885] -(0)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   24.011894] -(0)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   24.011903] -(0)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   24.011913] -(0)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   24.011921] -(0)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   24.011929] -(0)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   24.011937] -(0)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   24.011946] -(0)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   24.011954] -(0)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   24.011963] -(0)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   24.011971] -(0)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   24.011980] -(0)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   24.011988] -(0)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   24.011997]  (0)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3639 ]---
<5>[   24.012006]  (0)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   24.012013]  (0)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   24.012024]  (0)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba58!
<6>[   24.012032]  (0)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   24.012040]  (0)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   24.012045]  (0)[513:HwBinder:346_2]WARNING: CPU: 0 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1834/0x2460()
<4>[   24.012057]  (0)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   24.012088] -(0)[513:HwBinder:346_2]CPU: 0 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   24.012097] -(0)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   24.012103] -(0)[513:HwBinder:346_2]Call trace:
<4>[   24.012108] -(0)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   24.012117] -(0)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   24.012126] -(0)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   24.012134] -(0)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   24.012143] -(0)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   24.012152] -(0)[513:HwBinder:346_2][<ffffff80085509f4>] ddp_dsi_config+0x1834/0x2460
<4>[   24.012160] -(0)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   24.012170] -(0)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   24.012179] -(0)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   24.012188] -(0)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   24.012196] -(0)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   24.012204] -(0)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   24.012211] -(0)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   24.012220] -(0)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   24.012228] -(0)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   24.012237] -(0)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   24.012245] -(0)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   24.012255] -(0)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   24.012264] -(0)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   24.012272]  (0)[513:HwBinder:346_2]---[ end trace e335f74a8dfe363a ]---
<5>[   24.012281]  (0)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   24.012289]  (0)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   24.012301]  (0)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba5c!
<6>[   24.012308]  (0)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   24.012316]  (0)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   24.012321]  (0)[513:HwBinder:346_2]WARNING: CPU: 0 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x189c/0x2460()
<4>[   24.012333]  (0)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   24.012366] -(0)[513:HwBinder:346_2]CPU: 0 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   24.012375] -(0)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   24.012380] -(0)[513:HwBinder:346_2]Call trace:
<4>[   24.012385] -(0)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   24.012395] -(0)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   24.012403] -(0)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   24.012413] -(0)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   24.012422] -(0)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   24.012431] -(0)[513:HwBinder:346_2][<ffffff8008550a5c>] ddp_dsi_config+0x189c/0x2460
<4>[   24.012439] -(0)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   24.012449] -(0)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   24.012458] -(0)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   24.012467] -(0)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   24.012475] -(0)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   24.012484] -(0)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   24.012492] -(0)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   24.012501] -(0)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   24.012509] -(0)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   24.012518] -(0)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   24.012526] -(0)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   24.012537] -(0)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   24.012546] -(0)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   24.012554]  (0)[513:HwBinder:346_2]---[ end trace e335f74a8dfe363b ]---
<5>[   24.012563]  (0)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   24.012571]  (0)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   24.012585]  (0)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba18!
<6>[   24.012593]  (0)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   24.012601]  (0)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   24.012607]  (0)[513:HwBinder:346_2]WARNING: CPU: 0 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1904/0x2460()
<4>[   24.012620]  (0)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   24.012654] -(0)[513:HwBinder:346_2]CPU: 0 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   24.012662] -(0)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   24.012668] -(0)[513:HwBinder:346_2]Call trace:
<4>[   24.012673] -(0)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   24.012683] -(0)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   24.012691] -(0)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   24.012701] -(0)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   24.012710] -(0)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   24.012719] -(0)[513:HwBinder:346_2][<ffffff8008550ac4>] ddp_dsi_config+0x1904/0x2460
<4>[   24.012727] -(0)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   24.012737] -(0)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   24.012746] -(0)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   24.012755] -(0)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   24.012764] -(0)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   24.012772] -(0)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   24.012781] -(0)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   24.012789] -(0)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   24.012798] -(0)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   24.012807] -(0)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   24.012815] -(0)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   24.012826] -(0)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   24.012835] -(0)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   24.012844]  (0)[513:HwBinder:346_2]---[ end trace e335f74a8dfe363c ]---
<5>[   24.012853]  (0)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   24.012862]  (0)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   24.012875]  (0)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba20!
<6>[   24.012883]  (0)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   24.012891]  (0)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   24.012979]  (0)[513:HwBinder:346_2]WARNING: CPU: 0 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x196c/0x2460()
<4>[   24.012998]  (0)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   24.013044] -(0)[513:HwBinder:346_2]CPU: 0 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   24.013054] -(0)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   24.013064] -(0)[513:HwBinder:346_2]Call trace:
<4>[   24.013071] -(0)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   24.013083] -(0)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   24.013093] -(0)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   24.013105] -(0)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   24.013116] -(0)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   24.013125] -(0)[513:HwBinder:346_2][<ffffff8008550b2c>] ddp_dsi_config+0x196c/0x2460
<4>[   24.013137] -(0)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   24.013148] -(0)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   24.013161] -(0)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   24.013171] -(0)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   24.013183] -(0)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   24.013192] -(0)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   24.013205] -(0)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   24.013215] -(0)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   24.013227] -(0)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   24.013237] -(0)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   24.013247] -(0)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   24.013260] -(0)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   24.013269] -(0)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   24.013281]  (0)[513:HwBinder:346_2]---[ end trace e335f74a8dfe363d ]---
<5>[   24.013294]  (0)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   24.013305]  (0)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   24.013318]  (0)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba28!
<6>[   24.013331]  (0)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   24.013341]  (0)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   24.013347]  (0)[513:HwBinder:346_2]WARNING: CPU: 0 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x19d4/0x2460()
<4>[   24.013359]  (0)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   24.013405] -(0)[513:HwBinder:346_2]CPU: 0 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   24.013414] -(0)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   24.013423] -(0)[513:HwBinder:346_2]Call trace:
<4>[   24.013428] -(0)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   24.013439] -(0)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   24.013450] -(0)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   24.013460] -(0)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   24.013470] -(0)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   24.013482] -(0)[513:HwBinder:346_2][<ffffff8008550b94>] ddp_dsi_config+0x19d4/0x2460
<4>[   24.013490] -(0)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   24.013504] -(0)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   24.013514] -(0)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   24.013526] -(0)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   24.013534] -(0)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   24.013546] -(0)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   24.013554] -(0)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   24.013564] -(0)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   24.013576] -(0)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   24.013586] -(0)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   24.013595] -(0)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   24.013608] -(0)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   24.013617] -(0)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   24.013628]  (0)[513:HwBinder:346_2]---[ end trace e335f74a8dfe363e ]---
<5>[   24.013641]  (0)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   24.013649]  (0)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   24.013661]  (0)[513:HwBinder:346_2][DISP]===>v_a-v_b=0x18e3,HSTX_CKLP_WC=0xffffffc0
<6>[   24.013671]  (0)[513:HwBinder:346_2][DISP]===>v_b+v_c=0x3a4,HFP_WC=0x25
<6>[   24.013680]  (0)[513:HwBinder:346_2][DISP]===>Will Reconfig in order to fulfill LP clock lane per line
<6>[   24.013696]  (0)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba48!
<6>[   24.013705]  (0)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   24.013717]  (0)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   24.013724]  (0)[513:HwBinder:346_2]WARNING: CPU: 0 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1b58/0x2460()
<4>[   24.013739]  (0)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   24.013781] -(0)[513:HwBinder:346_2]CPU: 0 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   24.013793] -(0)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   24.013799] -(0)[513:HwBinder:346_2]Call trace:
<4>[   24.013805] -(0)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   24.013818] -(0)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   24.013826] -(0)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   24.013839] -(0)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   24.013850] -(0)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   24.013860] -(0)[513:HwBinder:346_2][<ffffff8008550d18>] ddp_dsi_config+0x1b58/0x2460
<4>[   24.013871] -(0)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   24.013880] -(0)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   24.013890] -(0)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   24.013902] -(0)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   24.013911] -(0)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   24.013922] -(0)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   24.013931] -(0)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   24.013942] -(0)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   24.013953] -(0)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   24.013963] -(0)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   24.013972] -(0)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   24.013985] -(0)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   24.013993] -(0)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   24.014006]  (0)[513:HwBinder:346_2]---[ end trace e335f74a8dfe363f ]---
<5>[   24.014015]  (0)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   24.014024]  (0)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   24.014040]  (0)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba60!
<6>[   24.014052]  (0)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   24.014062]  (0)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   24.014068]  (0)[513:HwBinder:346_2]WARNING: CPU: 0 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1cc4/0x2460()
<4>[   24.014082]  (0)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   24.014126] -(0)[513:HwBinder:346_2]CPU: 0 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   24.014135] -(0)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   24.014144] -(0)[513:HwBinder:346_2]Call trace:
<4>[   24.014149] -(0)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   24.014160] -(0)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   24.014171] -(0)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   24.014181] -(0)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   24.014191] -(0)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   24.014202] -(0)[513:HwBinder:346_2][<ffffff8008550e84>] ddp_dsi_config+0x1cc4/0x2460
<4>[   24.014210] -(0)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   24.014224] -(0)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   24.014234] -(0)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   24.014244] -(0)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   24.014255] -(0)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   24.014266] -(0)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   24.014275] -(0)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   24.014287] -(0)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   24.014296] -(0)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   24.014307] -(0)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   24.014316] -(0)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   24.014329] -(0)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   24.014338] -(0)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   24.014349]  (0)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3640 ]---
<5>[   24.014358]  (0)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   24.014366]  (0)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   24.014379]  (0)[513:HwBinder:346_2][DISP]===>new HSTX_CKL_WC=0x4000, HFP_WC=0x250
<6>[   24.014486]  (0)[513:HwBinder:346_2][DISP]primary display is DIRECT_LINK mode now
<5>[   24.019289]  (1)[374:vendor.mediatek][Power/PPM] (0x40)(-1)(0)(0-3)(0)(0)(4)(4) 
<7>[   24.049594]  (3)[1677:initCamdevice][ISP]- E. UserCount: 0.
<7>[   24.049851] [ISP]- X. Ret: 0. UserCount: 1.<7>[   24.049967]  (3)[1677:initCamdevice][imgsensor]imgsensor_clk_enable_all_cg
<7>[   24.050024]  (3)[1677:initCamdevice][imgsensor]imgsensor_open 1
<7>[   24.050706]  (3)[1677:initCamdevice][imgsensor]imgsensor_open 2
<7>[   24.051864]  (3)[1677:initCamdevice][imgsensor]sensor_idx 1, power 1 curr_sensor_name n5600_yuv
<7>[   24.051909]  (3)[1677:initCamdevice][imgsensor]sensor_idx = 1, pin=7, pin_state_on=11, hw_id =2(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   24.051936]  (3)[1677:initCamdevice][imgsensor]sensor_idx = 1, pin=5, pin_state_on=7, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<6>[   24.051955]  (3)[1677:initCamdevice]ldo vcamio enable
<7>[   24.052423]  (0)[1677:initCamdevice][imgsensor]sensor_idx = 1, pin=3, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<6>[   24.052462]  (0)[1677:initCamdevice]ldo vcama enable
<7>[   24.052958]  (0)[1677:initCamdevice][imgsensor]sensor_idx = 1, pin=4, pin_state_on=3, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<6>[   24.052999]  (0)[1677:initCamdevice]ldo vcamd enable
<7>[   24.053456]  (3)[1677:initCamdevice][imgsensor]sensor_idx = 1, pin=6, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<3>[   24.053486]  (3)[1677:initCamdevice][regulator]fail to regulator_set_voltage, powertype:6 powerId:2800000
<7>[   24.062219]  (3)[1677:initCamdevice][imgsensor]sensor_idx = 1, pin=1, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   24.062279]  (3)[1677:initCamdevice][imgsensor]sensor_idx = 1, pin=1, pin_state_on=11, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   24.063073]  (3)[1677:initCamdevice][imgsensor]sensor_idx = 1, pin=2, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   24.063116]  (3)[1677:initCamdevice][imgsensor]sensor_idx = 1, pin=2, pin_state_on=11, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO 3:mclk)
<7>[   24.101427]  (3)[1677:initCamdevice][imgsensor][kdCISModulePowerOn]Profile = 49563 us
<4>[   24.101479]  (3)[1677:initCamdevice]yyyyy=== [n5600_yuv]: [n5600_hsm_ioctl]N5600Open_start 
<4>[   24.109173]  (3)[1677:initCamdevice]yyyyy=== [n5600_yuv]: Read Sensor Reg 0x13 0xff
<4>[   24.124837]  (3)[1677:initCamdevice]N5600_Sensor_Driver_Init
<4>[   24.124865]  (3)[1677:initCamdevice]yyyyy=== [n5600_yuv]: N5600Open_end 
<7>[   24.124874]  (3)[1677:initCamdevice][imgsensor][SensorOpen]Profile = 73012 us
<7>[   24.125318]  (3)[1677:initCamdevice][ISP]- E. UserCount: 1.
<7>[   24.125340] [ISP]- X. Ret: 0. UserCount: 2.<7>[   24.181229]  (3)[768:HwBinder:472_2]flashlight: flashlight_open: Open(0,0,0)
<6>[   24.181270]  (3)[768:HwBinder:472_2]flashlight: _flashlight_ioctl: Find no flashlight device
<7>[   24.181290]  (3)[768:HwBinder:472_2]flashlight: flashlight_release: Release(0,0,0)
<7>[   24.181332]  (3)[768:HwBinder:472_2]flashlight: flashlight_open: Open(0,0,0)
<6>[   24.181347]  (3)[768:HwBinder:472_2]flashlight: _flashlight_ioctl: Find no flashlight device
<6>[   24.181359]  (3)[768:HwBinder:472_2]flashlight: _flashlight_ioctl: Find no flashlight device
<7>[   24.181370]  (3)[768:HwBinder:472_2]flashlight: flashlight_release: Release(0,0,0)
<4>[   24.181401]  (3)[768:HwBinder:472_2][n5600_hsm] N5600FeatureControl id 3048
<4>[   24.181410]  (3)[768:HwBinder:472_2]GET_EV_AWB_REF3048
<4>[   24.183360]  (3)[768:HwBinder:472_2][n5600_hsm] N5600FeatureControl id 3060
<4>[   24.183388]  (3)[768:HwBinder:472_2][n5600_hsm_ioctl] N5600FeatureControl id 3060
<4>[   24.183394]  (3)[768:HwBinder:472_2]yyyyy=== hsm_ioctl cmd = 3060, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.183402]  (3)[768:HwBinder:472_2]yyyyy=== default  enter 
<4>[   24.183419]  (3)[768:HwBinder:472_2][n5600_hsm] N5600FeatureControl id 3050
<4>[   24.183430]  (3)[768:HwBinder:472_2][n5600_hsm_ioctl] N5600FeatureControl id 3050
<4>[   24.183438]  (3)[768:HwBinder:472_2]yyyyy=== hsm_ioctl cmd = 3050, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.183447]  (3)[768:HwBinder:472_2]yyyyy=== default  enter 
<4>[   24.183457]  (3)[768:HwBinder:472_2][n5600_hsm] N5600FeatureControl id 3051
<4>[   24.183463]  (3)[768:HwBinder:472_2][n5600_hsm_ioctl] N5600FeatureControl id 3051
<4>[   24.183470]  (3)[768:HwBinder:472_2]yyyyy=== hsm_ioctl cmd = 3051, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.183476]  (3)[768:HwBinder:472_2]yyyyy=== default  enter 
<7>[   24.194202]  (3)[1666:Thread-3][imgsensor]imgsensor_open 3
<4>[   24.194753]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1070836032
<4>[   24.194785]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1070836032
<4>[   24.194792]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1070836032, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.222092]  (0)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1073588533
<4>[   24.222672]  (0)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1073588533
<4>[   24.222684]  (0)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1073588533, HSM_IIC_READ_MIPI = 3222165198 
<7>[   24.222691]  (0)[1666:Thread-3]yyyyy === [hsm_imager] mt_hsm_s_power [n5600_hsm_ioctl]mt_hsm_s_power en=1  
<7>[   24.222691] 
<7>[   24.222699]  (0)[1666:Thread-3]yyyyy === [hsm_imager] mt_hsm_s_power yyyyy===[n5600_hsm_ioctl]mt_hsm_s_power power on###########
<7>[   24.222699] 
<4>[   24.238030]  (2)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1073588537
<4>[   24.238056]  (2)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1073588537
<4>[   24.238063]  (2)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1073588537, HSM_IIC_READ_MIPI = 3222165198 
<7>[   24.238071]  (2)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_set 3 (gpio: 365, ENGINE_RESET), value: 0
<4>[   24.238078]  (2)[1666:Thread-3]yyyyy=== ngpio=365, value=0  
<4>[   24.238440]  (2)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1073588536
<4>[   24.238466]  (2)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1073588536
<4>[   24.238473]  (2)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1073588536, HSM_IIC_READ_MIPI = 3222165198 
<7>[   24.238480]  (2)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_get 3 (gpio: 365, ENGINE_RESET), value: 0
<7>[   24.238487]  (2)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_get [n5600_hsm_ioctl] gpio_get, gpio_id=ENGINE_RESET, value=0
<7>[   24.238487] 
<4>[   24.238953]  (2)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1073588537
<4>[   24.238980]  (2)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1073588537
<4>[   24.238987]  (2)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1073588537, HSM_IIC_READ_MIPI = 3222165198 
<7>[   24.238995]  (2)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_set 0 (gpio: 366, POWER_ENABLE), value: 1
<4>[   24.239001]  (2)[1666:Thread-3]yyyyy=== ngpio=366, value=1  
<4>[   24.239562]  (2)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1073588536
<4>[   24.239592]  (2)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1073588536
<4>[   24.239598]  (2)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1073588536, HSM_IIC_READ_MIPI = 3222165198 
<7>[   24.239607]  (2)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_get 0 (gpio: 366, POWER_ENABLE), value: 1
<7>[   24.239614]  (2)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_get [n5600_hsm_ioctl] gpio_get, gpio_id=POWER_ENABLE, value=1
<7>[   24.239614] 
<6>[   24.257573]  (1)[1685:SoundPoolThread]binder: 1507:1685 transaction failed 29201/-1, size 108-8 line 3179
<36>[   24.258001]  (1)[323:logd.auditd]type=1400 audit(1550035184.114:21): avc: denied { getattr } for pid=1012 comm="ndroid.systemui" path="/data/user_de/0/com.mediatek.ppl" dev="dm-2" ino=114810 scontext=u:r:platform_app:s0:c512,c768 tcontext=u:object_r:system_app_data_file:s0 tclass=dir permissive=0
<36>[   24.258048]  (1)[323:logd.auditd]type=1400 audit(1550035185.958:22): avc: denied { read } for pid=1507 comm="SoundPoolThread" path="/vendor/app/NfcNci/NfcNci.apk" dev="dm-1" ino=28 scontext=u:r:drmserver:s0 tcontext=u:object_r:vendor_app_file:s0 tclass=file permissive=0
<6>[   24.261402]  (1)[1685:SoundPoolThread]binder: 1507:1685 transaction failed 29201/-1, size 108-8 line 3179
<7>[   24.266058]  (2)[1666:Thread-3]mt_fh_hal_general_pll_dfs, [Pll_ID]:3 [current dds(CON1)]:0xb2762, [target dds]:1436751
<4>[   24.270558]  (2)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802098
<4>[   24.270588]  (2)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802098
<4>[   24.270595]  (2)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802098, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.270602]  (2)[1666:Thread-3]yyyyy=== HSM_IIC_READ_MIPI enter 
<4>[   24.270608]  (2)[1666:Thread-3]yyyyy=== hsm_iReadRegI2C_MIPI to device 0E address 0000 len 2 
<4>[   24.271968]  (2)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.271996]  (2)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.272003]  (2)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.272011]  (2)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.272017]  (2)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 0200 len 2 
<4>[   24.273324]  (2)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.273352]  (2)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.273359]  (2)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.273367]  (2)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.273373]  (2)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 0200 len 2 
<4>[   24.274825]  (2)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.274853]  (2)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.274860]  (2)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.274868]  (2)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.274874]  (2)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 1600 len 2 
<4>[   24.276887]  (0)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.276959]  (0)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.276967]  (0)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.276975]  (0)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.276981]  (0)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 1800 len 2 
<7>[   24.289465]  (0)[1666:Thread-3]mt_fh_hal_general_pll_dfs, [Pll_ID]:3 [current dds(CON1)]:0x15ec4f, [target dds]:1216197
<4>[   24.291669]  (0)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.291699]  (0)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.291706]  (0)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.291713]  (0)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.291719]  (0)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 1800 len 2 
<4>[   24.303464]  (0)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.303485]  (0)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.303492]  (0)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.303500]  (0)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.303506]  (0)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 0600 len 2 
<4>[   24.307060]  (0)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.307084]  (0)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.307091]  (0)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.307099]  (0)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.307105]  (0)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 0800 len 2 
<7>[   24.320528]  (0)[1666:Thread-3]mt_fh_hal_general_pll_dfs, [Pll_ID]:3 [current dds(CON1)]:0x128ec5, [target dds]:995643
<4>[   24.324317]  (0)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.324350]  (0)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.324357]  (0)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.324365]  (0)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.324371]  (0)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 2200 len 2 
<4>[   24.345803]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.345834]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.345841]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.345849]  (1)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.345855]  (1)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 4001 len 4 
<4>[   24.363482]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.363508]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.363515]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.363523]  (3)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.363530]  (3)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 4401 len 4 
<4>[   24.381495]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.381520]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.381527]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.381535]  (3)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.381541]  (3)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 4801 len 4 
<4>[   24.393946]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.393971]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.393978]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.393986]  (3)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.393992]  (3)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 4C01 len 4 
<4>[   24.412113]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.412135]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.412143]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.412150]  (3)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.412156]  (3)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 5001 len 4 
<4>[   24.415628]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.415654]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.415661]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.415668]  (3)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.415674]  (3)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 1002 len 4 
<4>[   24.422265]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.422292]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.422299]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.422307]  (3)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.422313]  (3)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 1402 len 4 
<4>[   24.424317]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.424347]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.424354]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.424362]  (3)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.424368]  (3)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 1802 len 4 
<4>[   24.425907]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.425932]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.425939]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.425947]  (3)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.425953]  (3)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 1C02 len 4 
<4>[   24.427652]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.427679]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.427686]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.427693]  (3)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.427699]  (3)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 2002 len 4 
<4>[   24.429254]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.429282]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.429289]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.429297]  (3)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.429303]  (3)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 2402 len 4 
<4>[   24.440170]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.440196]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.440203]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.440211]  (3)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.440217]  (3)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 2802 len 4 
<4>[   24.442080]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.442107]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.442114]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.442122]  (3)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.442129]  (3)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 2C02 len 4 
<4>[   24.451322]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.451349]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.451356]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.451363]  (3)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.451369]  (3)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 3002 len 4 
<4>[   24.468813]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.468837]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.468844]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.488786]  (3)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.488798]  (3)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 3402 len 4 
<4>[   24.496588]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.496615]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.496622]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.496629]  (3)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.496635]  (3)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 3802 len 4 
<4>[   24.506128]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.506158]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.506166]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.506173]  (3)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.506905]  (3)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 0402 len 4 
<4>[   24.508642]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.508672]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.508679]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.508687]  (3)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.508694]  (3)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 1805 len 4 
<4>[   24.510531]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.510561]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.510568]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.510576]  (3)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.510582]  (3)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 0005 len 4 
<4>[   24.517830]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.517857]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.517864]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.517872]  (3)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.517878]  (3)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 0400 len 2 
<4>[   24.519376]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.519405]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.519412]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.519420]  (3)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.519426]  (3)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 3200 len 2 
<4>[   24.540346]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.540372]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.540380]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.540387]  (3)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.540394]  (3)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 0400 len 2 
<4>[   24.541687]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.541710]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.541717]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.541725]  (3)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.541731]  (3)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 3200 len 2 
<4>[   24.542457]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1073588537
<4>[   24.542488]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1073588537
<4>[   24.542495]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1073588537, HSM_IIC_READ_MIPI = 3222165198 
<7>[   24.542503]  (3)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_set 3 (gpio: 365, ENGINE_RESET), value: 0
<4>[   24.542510]  (3)[1666:Thread-3]yyyyy=== ngpio=365, value=0  
<4>[   24.543257]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1073588536
<4>[   24.543286]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1073588536
<4>[   24.543340]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1073588536, HSM_IIC_READ_MIPI = 3222165198 
<7>[   24.543350]  (3)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_get 3 (gpio: 365, ENGINE_RESET), value: 0
<7>[   24.543358]  (3)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_get [n5600_hsm_ioctl] gpio_get, gpio_id=ENGINE_RESET, value=0
<7>[   24.543358] 
<4>[   24.543755]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1073588537
<4>[   24.543782]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1073588537
<4>[   24.543789]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1073588537, HSM_IIC_READ_MIPI = 3222165198 
<7>[   24.543797]  (3)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_set 0 (gpio: 366, POWER_ENABLE), value: 1
<4>[   24.543804]  (3)[1666:Thread-3]yyyyy=== ngpio=366, value=1  
<4>[   24.544196]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1073588536
<4>[   24.544219]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1073588536
<4>[   24.544226]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1073588536, HSM_IIC_READ_MIPI = 3222165198 
<7>[   24.544234]  (3)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_get 0 (gpio: 366, POWER_ENABLE), value: 1
<7>[   24.544241]  (3)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_get [n5600_hsm_ioctl] gpio_get, gpio_id=POWER_ENABLE, value=1
<7>[   24.544241] 
<4>[   24.597580]  (1)[355:nxpnfc@1.0-serv]pn553_dev_open:pn553_dev=ffffffc030040800
<7>[   24.597605]  (1)[355:nxpnfc@1.0-serv]pn553 pn553_dev_open : 10,55
<4>[   24.597681]  (1)[355:nxpnfc@1.0-serv]pn553_dev_unlocked_ioctl:cmd=1074063617, arg=0, pn553_dev=ffffffc030040800
<4>[   24.597699]  (1)[355:nxpnfc@1.0-serv]pn553 pn553_dev_unlocked_ioctl power off
<4>[   24.597706]  (1)[355:nxpnfc@1.0-serv]pn553_platform_pinctrl_select
<4>[   24.597746]  (1)[355:nxpnfc@1.0-serv]pn553_platform_pinctrl_select
<4>[   24.655470]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072998717
<4>[   24.655502]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072998717
<4>[   24.655511]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072998717, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.655519]  (3)[1666:Thread-3]yyyyy=== HSM_IIC_READ 
<4>[   24.655526]  (3)[1666:Thread-3]yyyyy=== hsm_iReadRegI2C to device 40 address 0000 len 64 
<4>[   24.655601]  (0)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(209,786)[16]
<4>[   24.655680]  (0)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.656166]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1073588537
<4>[   24.656190]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1073588537
<4>[   24.656197]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1073588537, HSM_IIC_READ_MIPI = 3222165198 
<7>[   24.656205]  (3)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_set 3 (gpio: 365, ENGINE_RESET), value: 1
<4>[   24.656212]  (3)[1666:Thread-3]yyyyy=== ngpio=365, value=1  
<4>[   24.656580]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1073588536
<4>[   24.656609]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1073588536
<4>[   24.656617]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1073588536, HSM_IIC_READ_MIPI = 3222165198 
<7>[   24.656624]  (3)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_get 3 (gpio: 365, ENGINE_RESET), value: 1
<7>[   24.656631]  (3)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_get [n5600_hsm_ioctl] gpio_get, gpio_id=ENGINE_RESET, value=1
<7>[   24.656631] 
<4>[   24.657136]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1073588537
<4>[   24.657161]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1073588537
<4>[   24.657169]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1073588537, HSM_IIC_READ_MIPI = 3222165198 
<7>[   24.657176]  (3)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_set 0 (gpio: 366, POWER_ENABLE), value: 0
<4>[   24.657184]  (3)[1666:Thread-3]yyyyy=== ngpio=366, value=0  
<4>[   24.657565]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1073588536
<4>[   24.657593]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1073588536
<4>[   24.657601]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1073588536, HSM_IIC_READ_MIPI = 3222165198 
<7>[   24.657609]  (3)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_get 0 (gpio: 366, POWER_ENABLE), value: 0
<7>[   24.657615]  (3)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_get [n5600_hsm_ioctl] gpio_get, gpio_id=POWER_ENABLE, value=0
<7>[   24.657615] 
<4>[   24.658094]  (3)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1073588533
<4>[   24.658124]  (3)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1073588533
<4>[   24.658131]  (3)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1073588533, HSM_IIC_READ_MIPI = 3222165198 
<7>[   24.658139]  (3)[1666:Thread-3]yyyyy === [hsm_imager] mt_hsm_s_power [n5600_hsm_ioctl]mt_hsm_s_power en=0  
<7>[   24.658139] 
<7>[   24.658147]  (3)[1666:Thread-3]yyyyy === [hsm_imager] mt_hsm_s_power yyyyy===[n5600_hsm_ioctl]mt_hsm_s_power power off############
<7>[   24.658147] 
<4>[   24.662646]  (0)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(209,786)[16]
<4>[   24.662733]  (0)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.663239]  (0)[355:nxpnfc@1.0-serv]pn553_dev_unlocked_ioctl:cmd=1074063617, arg=1, pn553_dev=ffffffc030040800
<4>[   24.663272]  (0)[355:nxpnfc@1.0-serv]pn553 pn553_dev_unlocked_ioctl power on
<4>[   24.663279]  (0)[355:nxpnfc@1.0-serv]pn553_platform_pinctrl_select
<4>[   24.663316]  (0)[355:nxpnfc@1.0-serv]pn553_platform_pinctrl_select
<4>[   24.669674]  (0)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(209,786)[16]
<4>[   24.669761]  (0)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.676755]  (1)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(209,786)[16]
<4>[   24.676833]  (1)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.680976]  (3)[1720:nxpnfc@1.0-serv]pn553_dev_read
<4>[   24.681001]  (3)[1720:nxpnfc@1.0-serv]pn553 pn553_dev_read : reading 3 bytes.
<4>[   24.681010]  (3)[1720:nxpnfc@1.0-serv]pn553_enable_irq
<4>[   24.682710]  (3)[1721:nxpnfc@1.0-serv]pn553_dev_write
<4>[   24.684053]  (0)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(209,786)[16]
<4>[   24.684116]  (0)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.684749]  (2)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1073588533
<4>[   24.684788]  (2)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1073588533
<4>[   24.684795]  (2)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1073588533, HSM_IIC_READ_MIPI = 3222165198 
<7>[   24.684804]  (2)[1666:Thread-3]yyyyy === [hsm_imager] mt_hsm_s_power [n5600_hsm_ioctl]mt_hsm_s_power en=1  
<7>[   24.684804] 
<7>[   24.684812]  (2)[1666:Thread-3]yyyyy === [hsm_imager] mt_hsm_s_power yyyyy===[n5600_hsm_ioctl]mt_hsm_s_power power on###########
<7>[   24.684812] 
<4>[   24.690803]  (0)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(209,786)[16]
<4>[   24.690881]  (0)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.693969]  (1)[1721:nxpnfc@1.0-serv]pn553 pn553_dev_write : writing 4 bytes.
<4>[   24.696504] -(1)[1057:Binder:824_5]pn553_dev_irq_handler()
<4>[   24.696534] -(1)[1057:Binder:824_5]pn553_disable_irq
<4>[   24.697807]  (0)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(209,779)[16]
<4>[   24.697890]  (0)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.699263]  (2)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1073588537
<4>[   24.699293]  (2)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1073588537
<4>[   24.699301]  (2)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1073588537, HSM_IIC_READ_MIPI = 3222165198 
<7>[   24.699309]  (2)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_set 3 (gpio: 365, ENGINE_RESET), value: 0
<4>[   24.699316]  (2)[1666:Thread-3]yyyyy=== ngpio=365, value=0  
<4>[   24.699827]  (2)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1073588536
<4>[   24.699856]  (2)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1073588536
<4>[   24.699863]  (2)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1073588536, HSM_IIC_READ_MIPI = 3222165198 
<7>[   24.699871]  (2)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_get 3 (gpio: 365, ENGINE_RESET), value: 0
<7>[   24.699878]  (2)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_get [n5600_hsm_ioctl] gpio_get, gpio_id=ENGINE_RESET, value=0
<7>[   24.699878] 
<4>[   24.700298]  (2)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1073588537
<4>[   24.700326]  (2)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1073588537
<4>[   24.700333]  (2)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1073588537, HSM_IIC_READ_MIPI = 3222165198 
<7>[   24.700341]  (2)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_set 0 (gpio: 366, POWER_ENABLE), value: 1
<4>[   24.700348]  (2)[1666:Thread-3]yyyyy=== ngpio=366, value=1  
<4>[   24.700705]  (2)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1073588536
<4>[   24.700730]  (2)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1073588536
<4>[   24.700737]  (2)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1073588536, HSM_IIC_READ_MIPI = 3222165198 
<7>[   24.700745]  (2)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_get 0 (gpio: 366, POWER_ENABLE), value: 1
<7>[   24.700752]  (2)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_get [n5600_hsm_ioctl] gpio_get, gpio_id=POWER_ENABLE, value=1
<7>[   24.700752] 
<4>[   24.701647]  (0)[1720:nxpnfc@1.0-serv]pn553 IFD->PC:
<4>[   24.701683]  (0)[1720:nxpnfc@1.0-serv]pn553_dev_read
<4>[   24.701693]  (0)[1720:nxpnfc@1.0-serv]pn553 pn553_dev_read : reading 3 bytes.
<4>[   24.701701]  (0)[1720:nxpnfc@1.0-serv]pn553_enable_irq
<4>[   24.701718] -(1)[1615:Binder:1596_1]pn553_dev_irq_handler()
<4>[   24.701731] -(1)[1615:Binder:1596_1]pn553_disable_irq
<4>[   24.701965]  (0)[1720:nxpnfc@1.0-serv]pn553 IFD->PC:
<4>[   24.705062]  (1)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(208,766)[16]
<4>[   24.705122]  (1)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.706003]  (2)[1720:nxpnfc@1.0-serv]pn553_dev_read
<4>[   24.706034]  (2)[1720:nxpnfc@1.0-serv]pn553 pn553_dev_read : reading 3 bytes.
<4>[   24.706044]  (2)[1720:nxpnfc@1.0-serv]pn553_enable_irq
<4>[   24.708195]  (2)[1721:nxpnfc@1.0-serv]pn553_dev_write
<4>[   24.712114]  (3)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(208,749)[16]
<4>[   24.712184]  (3)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.715234]  (0)[1721:nxpnfc@1.0-serv]pn553 pn553_dev_write : writing 3 bytes.
<4>[   24.715650] -(1)[1012:ndroid.systemui]pn553_dev_irq_handler()
<4>[   24.715678] -(1)[1012:ndroid.systemui]pn553_disable_irq
<4>[   24.715904]  (2)[1720:nxpnfc@1.0-serv]pn553 IFD->PC:
<4>[   24.715938]  (2)[1720:nxpnfc@1.0-serv]pn553_dev_read
<4>[   24.715946]  (2)[1720:nxpnfc@1.0-serv]pn553 pn553_dev_read : reading 25 bytes.
<4>[   24.715955]  (2)[1720:nxpnfc@1.0-serv]pn553_enable_irq
<4>[   24.715971] -(3)[1171:HwBinder:470_4]pn553_dev_irq_handler()
<4>[   24.715980] -(3)[1171:HwBinder:470_4]pn553_disable_irq
<4>[   24.717483]  (2)[1720:nxpnfc@1.0-serv]pn553 IFD->PC:
<4>[   24.719181]  (2)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(208,734)[16]
<4>[   24.719232]  (2)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.720397]  (2)[1720:nxpnfc@1.0-serv]pn553_dev_read
<4>[   24.720426]  (2)[1720:nxpnfc@1.0-serv]pn553 pn553_dev_read : reading 3 bytes.
<4>[   24.720435]  (2)[1720:nxpnfc@1.0-serv]pn553_enable_irq
<4>[   24.722982]  (2)[1721:nxpnfc@1.0-serv]pn553_dev_write
<4>[   24.726388]  (0)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(209,720)[16]
<4>[   24.726469]  (0)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.729149]  (2)[1721:nxpnfc@1.0-serv]pn553 pn553_dev_write : writing 4 bytes.
<4>[   24.732093] -(1)[1012:ndroid.systemui]pn553_dev_irq_handler()
<4>[   24.732125] -(1)[1012:ndroid.systemui]pn553_disable_irq
<4>[   24.732131]  (2)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802098
<4>[   24.732136]  (2)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802098
<4>[   24.732141]  (2)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802098, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.732146]  (2)[1666:Thread-3]yyyyy=== HSM_IIC_READ_MIPI enter 
<4>[   24.732150]  (2)[1666:Thread-3]yyyyy=== hsm_iReadRegI2C_MIPI to device 0E address 0000 len 2 
<4>[   24.732724]  (2)[1720:nxpnfc@1.0-serv]pn553 IFD->PC:
<4>[   24.732765]  (2)[1720:nxpnfc@1.0-serv]pn553_dev_read
<4>[   24.732775]  (2)[1720:nxpnfc@1.0-serv]pn553 pn553_dev_read : reading 3 bytes.
<4>[   24.732783]  (2)[1720:nxpnfc@1.0-serv]pn553_enable_irq
<4>[   24.732802] -(1)[1012:ndroid.systemui]pn553_dev_irq_handler()
<4>[   24.732812] -(1)[1012:ndroid.systemui]pn553_disable_irq
<4>[   24.733341]  (0)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(210,705)[16]
<4>[   24.733419]  (0)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.734781]  (2)[1720:nxpnfc@1.0-serv]pn553 IFD->PC:
<4>[   24.736657]  (2)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.736690]  (2)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.736697]  (2)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.736705]  (2)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.736711]  (2)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 0200 len 2 
<4>[   24.736744]  (0)[1720:nxpnfc@1.0-serv]pn553_dev_read
<4>[   24.736757]  (0)[1720:nxpnfc@1.0-serv]pn553 pn553_dev_read : reading 3 bytes.
<4>[   24.736766]  (0)[1720:nxpnfc@1.0-serv]pn553_enable_irq
<4>[   24.740357]  (0)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(212,690)[16]
<4>[   24.740417]  (0)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.746288]  (1)[1721:nxpnfc@1.0-serv]pn553_dev_write
<4>[   24.746522]  (2)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.746551]  (2)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.746559]  (2)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.746566]  (2)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.746572]  (2)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 0200 len 2 
<4>[   24.747349]  (2)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(215,675)[16]
<4>[   24.747422]  (2)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.752974]  (3)[1721:nxpnfc@1.0-serv]pn553 pn553_dev_write : writing 3 bytes.
<4>[   24.753387] -(3)[1709:OMXCallbackDisp]pn553_dev_irq_handler()
<4>[   24.753416] -(3)[1709:OMXCallbackDisp]pn553_disable_irq
<4>[   24.754043]  (0)[1720:nxpnfc@1.0-serv]pn553 IFD->PC:
<4>[   24.754079]  (0)[1720:nxpnfc@1.0-serv]pn553_dev_read
<4>[   24.754088]  (0)[1720:nxpnfc@1.0-serv]pn553 pn553_dev_read : reading 25 bytes.
<4>[   24.754096]  (0)[1720:nxpnfc@1.0-serv]pn553_enable_irq
<4>[   24.754112] -(3)[316:logd.writer]pn553_dev_irq_handler()
<4>[   24.754123] -(3)[316:logd.writer]pn553_disable_irq
<4>[   24.754222]  (1)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(218,661)[16]
<4>[   24.754290]  (1)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.754907]  (0)[1720:nxpnfc@1.0-serv]pn553 IFD->PC:
<4>[   24.761239]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.761268]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.761275]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.761283]  (1)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.761289]  (1)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 1600 len 2 
<4>[   24.761417]  (2)[1720:nxpnfc@1.0-serv]pn553_dev_read
<4>[   24.761443]  (2)[1720:nxpnfc@1.0-serv]pn553 pn553_dev_read : reading 3 bytes.
<4>[   24.761452]  (2)[1720:nxpnfc@1.0-serv]pn553_enable_irq
<4>[   24.761665]  (0)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(221,646)[16]
<4>[   24.761712]  (0)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.767083]  (3)[1721:nxpnfc@1.0-serv]pn553_dev_write
<4>[   24.768593]  (0)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(225,633)[16]
<4>[   24.768668]  (0)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.774204]  (3)[1721:nxpnfc@1.0-serv]pn553 pn553_dev_write : writing 3 bytes.
<4>[   24.774625] -(0)[1479:Thread-2]pn553_dev_irq_handler()
<4>[   24.774652] -(0)[1479:Thread-2]pn553_disable_irq
<4>[   24.775576]  (0)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(228,620)[16]
<4>[   24.775672]  (0)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.776403]  (2)[1720:nxpnfc@1.0-serv]pn553 IFD->PC:
<4>[   24.776448]  (2)[1720:nxpnfc@1.0-serv]pn553_dev_read
<4>[   24.776458]  (2)[1720:nxpnfc@1.0-serv]pn553 pn553_dev_read : reading 5 bytes.
<4>[   24.776467]  (2)[1720:nxpnfc@1.0-serv]pn553_enable_irq
<4>[   24.776486] -(2)[1720:nxpnfc@1.0-serv]pn553_dev_irq_handler()
<4>[   24.776493] -(2)[1720:nxpnfc@1.0-serv]pn553_disable_irq
<4>[   24.778789]  (0)[1720:nxpnfc@1.0-serv]pn553 IFD->PC:
<4>[   24.779377]  (3)[1721:nxpnfc@1.0-serv]pn553_dev_write
<4>[   24.779394]  (2)[1720:nxpnfc@1.0-serv]pn553_dev_read
<4>[   24.779402]  (2)[1720:nxpnfc@1.0-serv]pn553 pn553_dev_read : reading 3 bytes.
<4>[   24.779406]  (2)[1720:nxpnfc@1.0-serv]pn553_enable_irq
<4>[   24.782772]  (3)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(232,608)[16]
<4>[   24.782854]  (3)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.785384]  (3)[1721:nxpnfc@1.0-serv]pn553 pn553_dev_write : writing 4 bytes.
<4>[   24.785834] -(1)[1012:ndroid.systemui]pn553_dev_irq_handler()
<4>[   24.785861] -(1)[1012:ndroid.systemui]pn553_disable_irq
<4>[   24.787475]  (0)[1720:nxpnfc@1.0-serv]pn553 IFD->PC:
<4>[   24.787511]  (0)[1720:nxpnfc@1.0-serv]pn553_dev_read
<4>[   24.787520]  (0)[1720:nxpnfc@1.0-serv]pn553 pn553_dev_read : reading 1 bytes.
<4>[   24.787529]  (0)[1720:nxpnfc@1.0-serv]pn553_enable_irq
<4>[   24.787549] -(3)[1698:sAsyncHandlerTh]pn553_dev_irq_handler()
<4>[   24.787560] -(3)[1698:sAsyncHandlerTh]pn553_disable_irq
<4>[   24.787719]  (2)[1720:nxpnfc@1.0-serv]pn553 IFD->PC:
<4>[   24.788156]  (2)[1720:nxpnfc@1.0-serv]pn553_dev_read
<4>[   24.788186]  (2)[1720:nxpnfc@1.0-serv]pn553 pn553_dev_read : reading 3 bytes.
<4>[   24.788195]  (2)[1720:nxpnfc@1.0-serv]pn553_enable_irq
<4>[   24.789605]  (0)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(237,595)[16]
<4>[   24.789659]  (0)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.790326]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.790356]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.790363]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.790370]  (1)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.790376]  (1)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 1800 len 2 
<4>[   24.791692]  (3)[1721:nxpnfc@1.0-serv]pn553_dev_write
<4>[   24.791834]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.791857]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.791864]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.791872]  (1)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.791878]  (1)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 1800 len 2 
<4>[   24.796999]  (3)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(243,582)[16]
<4>[   24.797004]  (0)[1721:nxpnfc@1.0-serv]pn553 pn553_dev_write : writing 10 bytes.
<4>[   24.797059]  (3)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.797764] -(1)[659:mobile_log_d.rd]pn553_dev_irq_handler()
<4>[   24.797789] -(1)[659:mobile_log_d.rd]pn553_disable_irq
<4>[   24.798034]  (2)[1720:nxpnfc@1.0-serv]pn553 IFD->PC:
<4>[   24.798065]  (2)[1720:nxpnfc@1.0-serv]pn553_dev_read
<4>[   24.798073]  (2)[1720:nxpnfc@1.0-serv]pn553 pn553_dev_read : reading 14 bytes.
<4>[   24.798080]  (2)[1720:nxpnfc@1.0-serv]pn553_enable_irq
<4>[   24.798096] -(3)[1721:nxpnfc@1.0-serv]pn553_dev_irq_handler()
<4>[   24.798106] -(3)[1721:nxpnfc@1.0-serv]pn553_disable_irq
<4>[   24.798606]  (2)[1720:nxpnfc@1.0-serv]pn553 IFD->PC:
<4>[   24.798959]  (2)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.798985]  (2)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.798991]  (2)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.798999]  (2)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.799005]  (2)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 0600 len 2 
<4>[   24.801459]  (3)[1720:nxpnfc@1.0-serv]pn553_dev_read
<4>[   24.801490]  (3)[1720:nxpnfc@1.0-serv]pn553 pn553_dev_read : reading 3 bytes.
<4>[   24.801499]  (3)[1720:nxpnfc@1.0-serv]pn553_enable_irq
<4>[   24.801927]  (3)[1721:nxpnfc@1.0-serv]pn553_dev_write
<4>[   24.803886]  (2)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(249,569)[16]
<4>[   24.803960]  (2)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.805942]  (2)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.805975]  (2)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.805983]  (2)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.805991]  (2)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.805997]  (2)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 0800 len 2 
<4>[   24.809118]  (3)[1721:nxpnfc@1.0-serv]pn553 pn553_dev_write : writing 8 bytes.
<4>[   24.811122]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.811155]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.811162]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.811169]  (1)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.811176]  (1)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 2200 len 2 
<4>[   24.811752]  (0)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(255,556)[16]
<4>[   24.811809]  (0)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.812779] -(1)[659:mobile_log_d.rd]pn553_dev_irq_handler()
<4>[   24.812804] -(1)[659:mobile_log_d.rd]pn553_disable_irq
<4>[   24.813401]  (2)[1720:nxpnfc@1.0-serv]pn553 IFD->PC:
<4>[   24.813435]  (2)[1720:nxpnfc@1.0-serv]pn553_dev_read
<4>[   24.813444]  (2)[1720:nxpnfc@1.0-serv]pn553 pn553_dev_read : reading 2 bytes.
<4>[   24.813453]  (2)[1720:nxpnfc@1.0-serv]pn553_enable_irq
<4>[   24.813469] -(3)[1003:Jit thread pool]pn553_dev_irq_handler()
<4>[   24.813482] -(3)[1003:Jit thread pool]pn553_disable_irq
<4>[   24.813680]  (2)[1720:nxpnfc@1.0-serv]pn553 IFD->PC:
<4>[   24.814163]  (2)[1720:nxpnfc@1.0-serv]pn553_dev_read
<4>[   24.814165]  (3)[1721:nxpnfc@1.0-serv]pn553_dev_write
<4>[   24.814189]  (2)[1720:nxpnfc@1.0-serv]pn553 pn553_dev_read : reading 3 bytes.
<4>[   24.814197]  (2)[1720:nxpnfc@1.0-serv]pn553_enable_irq
<4>[   24.818084]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.818115]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.818122]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.818129]  (1)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.818135]  (1)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 4001 len 4 
<4>[   24.819132]  (0)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(262,546)[16]
<4>[   24.819206]  (0)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.821003]  (3)[1721:nxpnfc@1.0-serv]pn553 pn553_dev_write : writing 15 bytes.
<4>[   24.821113]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.821138]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.821145]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.821153]  (1)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.821159]  (1)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 4401 len 4 
<4>[   24.821829] -(1)[659:mobile_log_d.rd]pn553_dev_irq_handler()
<4>[   24.821853] -(1)[659:mobile_log_d.rd]pn553_disable_irq
<4>[   24.822111]  (2)[1720:nxpnfc@1.0-serv]pn553 IFD->PC:
<4>[   24.822138]  (2)[1720:nxpnfc@1.0-serv]pn553_dev_read
<4>[   24.822145]  (2)[1720:nxpnfc@1.0-serv]pn553 pn553_dev_read : reading 2 bytes.
<4>[   24.822153]  (2)[1720:nxpnfc@1.0-serv]pn553_enable_irq
<4>[   24.822168] -(0)[1636:Worker-1]pn553_dev_irq_handler()
<4>[   24.822179] -(0)[1636:Worker-1]pn553_disable_irq
<4>[   24.822450]  (2)[1720:nxpnfc@1.0-serv]pn553 IFD->PC:
<4>[   24.825204]  (3)[1721:nxpnfc@1.0-serv]pn553_dev_write
<4>[   24.825223]  (2)[1720:nxpnfc@1.0-serv]pn553_dev_read
<4>[   24.825228]  (2)[1720:nxpnfc@1.0-serv]pn553 pn553_dev_read : reading 3 bytes.
<4>[   24.825234]  (2)[1720:nxpnfc@1.0-serv]pn553_enable_irq
<4>[   24.826156]  (3)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(270,536)[16]
<4>[   24.826210]  (3)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.828330]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.828353]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.828360]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.828368]  (1)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.828374]  (1)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 4801 len 4 
<4>[   24.830212]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.830239]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.830246]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.830254]  (1)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.830260]  (1)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 4C01 len 4 
<4>[   24.832831]  (1)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(276,526)[16]
<4>[   24.832976]  (1)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.833109]  (3)[1721:nxpnfc@1.0-serv]pn553 pn553_dev_write : writing 15 bytes.
<4>[   24.833924] -(3)[1721:nxpnfc@1.0-serv]pn553_dev_irq_handler()
<4>[   24.833950] -(3)[1721:nxpnfc@1.0-serv]pn553_disable_irq
<4>[   24.834224]  (2)[1720:nxpnfc@1.0-serv]pn553 IFD->PC:
<4>[   24.834254]  (2)[1720:nxpnfc@1.0-serv]pn553_dev_read
<4>[   24.834262]  (2)[1720:nxpnfc@1.0-serv]pn553 pn553_dev_read : reading 2 bytes.
<4>[   24.834269]  (2)[1720:nxpnfc@1.0-serv]pn553_enable_irq
<4>[   24.834284] -(1)[1666:Thread-3]pn553_dev_irq_handler()
<4>[   24.834293] -(1)[1666:Thread-3]pn553_disable_irq
<4>[   24.834467]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.834488]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.834494]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.834502]  (1)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.834508]  (1)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 5001 len 4 
<4>[   24.835790]  (2)[1720:nxpnfc@1.0-serv]pn553 IFD->PC:
<4>[   24.836512]  (2)[1720:nxpnfc@1.0-serv]pn553_dev_read
<4>[   24.836531]  (2)[1720:nxpnfc@1.0-serv]pn553 pn553_dev_read : reading 3 bytes.
<4>[   24.836539]  (2)[1720:nxpnfc@1.0-serv]pn553_enable_irq
<4>[   24.840335]  (3)[1721:nxpnfc@1.0-serv]pn553_dev_write
<4>[   24.840486]  (1)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(282,516)[16]
<4>[   24.840552]  (1)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.841015]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.841043]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.841050]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.841058]  (1)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.841064]  (1)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 1002 len 4 
<4>[   24.842933]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.842962]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.842969]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.842977]  (1)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.842983]  (1)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 1402 len 4 
<4>[   24.844432]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.844460]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.844468]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.844475]  (1)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.844481]  (1)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 1802 len 4 
<4>[   24.845009]  (3)[1721:nxpnfc@1.0-serv]pn553 pn553_dev_write : writing 8 bytes.
<4>[   24.845685] -(2)[1685:SoundPoolThread]pn553_dev_irq_handler()
<4>[   24.845710] -(2)[1685:SoundPoolThread]pn553_disable_irq
<4>[   24.846064]  (2)[1720:nxpnfc@1.0-serv]pn553 IFD->PC:
<4>[   24.846097]  (2)[1720:nxpnfc@1.0-serv]pn553_dev_read
<4>[   24.846105]  (2)[1720:nxpnfc@1.0-serv]pn553 pn553_dev_read : reading 2 bytes.
<4>[   24.846113]  (2)[1720:nxpnfc@1.0-serv]pn553_enable_irq
<4>[   24.846130] -(0)[1636:Worker-1]pn553_dev_irq_handler()
<4>[   24.846140] -(0)[1636:Worker-1]pn553_disable_irq
<4>[   24.846319]  (2)[1720:nxpnfc@1.0-serv]pn553 IFD->PC:
<4>[   24.846508]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.846532]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.846540]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.846547]  (1)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.846553]  (1)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 1C02 len 4 
<4>[   24.847604]  (0)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(288,508)[16]
<4>[   24.847669]  (0)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.848888]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.848984]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.848994]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.849002]  (1)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.849008]  (1)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 2002 len 4 
<4>[   24.849232]  (2)[1720:nxpnfc@1.0-serv]pn553_dev_read
<4>[   24.849256]  (2)[1720:nxpnfc@1.0-serv]pn553 pn553_dev_read : reading 3 bytes.
<4>[   24.849265]  (2)[1720:nxpnfc@1.0-serv]pn553_enable_irq
<4>[   24.849546]  (3)[1721:nxpnfc@1.0-serv]pn553_dev_write
<6>[   24.851771]  (2)[1685:SoundPoolThread]binder: 1507:1685 transaction failed 29201/-1, size 108-8 line 3179
<4>[   24.853080]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.853109]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.853116]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.853123]  (1)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.853129]  (1)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 2402 len 4 
<4>[   24.853259]  (0)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(293,503)[16]
<4>[   24.853330]  (0)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.856967]  (3)[1721:nxpnfc@1.0-serv]pn553 pn553_dev_write : writing 18 bytes.
<4>[   24.857864] -(0)[996:utmethod.pinyin]pn553_dev_irq_handler()
<4>[   24.857890] -(0)[996:utmethod.pinyin]pn553_disable_irq
<4>[   24.859060]  (0)[1720:nxpnfc@1.0-serv]pn553 IFD->PC:
<4>[   24.859092]  (0)[1720:nxpnfc@1.0-serv]pn553_dev_read
<4>[   24.859101]  (0)[1720:nxpnfc@1.0-serv]pn553 pn553_dev_read : reading 2 bytes.
<4>[   24.859110]  (0)[1720:nxpnfc@1.0-serv]pn553_enable_irq
<4>[   24.859124] -(3)[316:logd.writer]pn553_dev_irq_handler()
<4>[   24.859135] -(3)[316:logd.writer]pn553_disable_irq
<4>[   24.860448]  (2)[1720:nxpnfc@1.0-serv]pn553 IFD->PC:
<4>[   24.860513]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.860530]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.860538]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.860545]  (1)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.860552]  (1)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 2802 len 4 
<4>[   24.861071]  (3)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(299,498)[16]
<4>[   24.861124]  (3)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.862102]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.862131]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.862138]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.862146]  (1)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.862152]  (1)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 2C02 len 4 
<4>[   24.862286]  (2)[1720:nxpnfc@1.0-serv]pn553_dev_read
<4>[   24.862311]  (2)[1720:nxpnfc@1.0-serv]pn553 pn553_dev_read : reading 3 bytes.
<4>[   24.862320]  (2)[1720:nxpnfc@1.0-serv]pn553_enable_irq
<4>[   24.862452]  (3)[1721:nxpnfc@1.0-serv]pn553_dev_write
<4>[   24.867801]  (1)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(307,492)[16]
<4>[   24.867885]  (1)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.869019]  (3)[1721:nxpnfc@1.0-serv]pn553 pn553_dev_write : writing 243 bytes.
<6>[   24.869425]  (3)[1685:SoundPoolThread]binder: 1507:1685 transaction failed 29201/-1, size 108-8 line 3179
<4>[   24.869456]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.869467]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.869474]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.869482]  (1)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.869488]  (1)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 3002 len 4 
<4>[   24.870945]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.870975]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.870982]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.870990]  (1)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.870996]  (1)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 3402 len 4 
<4>[   24.873082]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.873113]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.873121]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.873128]  (1)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.873135]  (1)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 3802 len 4 
<4>[   24.874081]  (3)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(318,487)[16]
<4>[   24.874151]  (3)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.875264]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.875291]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.875298]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.875305]  (1)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.875311]  (1)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 0402 len 4 
<4>[   24.878157]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.878184]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.878191]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.878199]  (1)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.878205]  (1)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 1805 len 4 
<4>[   24.879428]  (0)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1371](0)(329,481)[16]
<4>[   24.879493]  (0)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.880550]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.880579]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.880587]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.880594]  (1)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.880601]  (1)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 0005 len 4 
<4>[   24.883205]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.883235]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.883243]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.883250]  (1)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.883256]  (1)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 0400 len 2 
<4>[   24.886382]  (1)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1397]Released Touch.
<4>[   24.886471]  (1)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.887487]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.887515]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.887522]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.887529]  (1)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.887535]  (1)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 3200 len 2 
<4>[   24.893421]  (1)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1413]Additional Int Pulse.
<4>[   24.893452]  (1)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.900435]  (0)[248:mtk-tpd]<<GTP-DBG>>[gt1x_touch_event_handler:1413]Additional Int Pulse.
<4>[   24.900468]  (0)[248:mtk-tpd]--lan-- ret = 0.
<4>[   24.904649]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.904674]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.904681]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.904688]  (1)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.904695]  (1)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 0400 len 2 
<4>[   24.907070]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1072802099
<4>[   24.907098]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1072802099
<4>[   24.907105]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1072802099, HSM_IIC_READ_MIPI = 3222165198 
<4>[   24.907113]  (1)[1666:Thread-3]yyyyy=== HSM_IIC_WRITE_MIPI enter 
<4>[   24.907119]  (1)[1666:Thread-3] yyyyy=== hsm_iWriteRegI2C_MIPI to device 0E address 3200 len 2 
<4>[   24.909245]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1073588537
<4>[   24.909276]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1073588537
<4>[   24.909283]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1073588537, HSM_IIC_READ_MIPI = 3222165198 
<7>[   24.909291]  (1)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_set 3 (gpio: 365, ENGINE_RESET), value: 0
<4>[   24.909298]  (1)[1666:Thread-3]yyyyy=== ngpio=365, value=0  
<4>[   24.909831]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1073588536
<4>[   24.909859]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1073588536
<4>[   24.909865]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1073588536, HSM_IIC_READ_MIPI = 3222165198 
<7>[   24.909873]  (1)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_get 3 (gpio: 365, ENGINE_RESET), value: 0
<7>[   24.909880]  (1)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_get [n5600_hsm_ioctl] gpio_get, gpio_id=ENGINE_RESET, value=0
<7>[   24.909880] 
<4>[   24.910404]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1073588537
<4>[   24.910432]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1073588537
<4>[   24.910439]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1073588537, HSM_IIC_READ_MIPI = 3222165198 
<7>[   24.910446]  (1)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_set 0 (gpio: 366, POWER_ENABLE), value: 1
<4>[   24.910453]  (1)[1666:Thread-3]yyyyy=== ngpio=366, value=1  
<4>[   24.910962]  (1)[1666:Thread-3][n5600_hsm] N5600FeatureControl id -1073588536
<4>[   24.910989]  (1)[1666:Thread-3][n5600_hsm_ioctl] N5600FeatureControl id -1073588536
<4>[   24.910995]  (1)[1666:Thread-3]yyyyy=== hsm_ioctl cmd = -1073588536, HSM_IIC_READ_MIPI = 3222165198 
<7>[   24.911003]  (1)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_get 0 (gpio: 366, POWER_ENABLE), value: 1
<7>[   24.911010]  (1)[1666:Thread-3]yyyyy === [hsm_imager] hsm_gpio_get [n5600_hsm_ioctl] gpio_get, gpio_id=POWER_ENABLE, value=1
<7>[   24.911010] 
<6>[   24.948985]  (1)[149:disp_idlemgr][DISP][disp_lowpower]_vdo_mode_enter_idle
<6>[   24.949011]  (1)[149:disp_idlemgr][DISP]primary display will switch from DIRECT_LINK to DECOUPLE
<4>[   24.952665] -(1)[660:mobile_log_d.wr]pn553_dev_irq_handler()
<4>[   24.952692] -(1)[660:mobile_log_d.wr]pn553_disable_irq
<4>[   24.953247]  (1)[1720:nxpnfc@1.0-serv]pn553 IFD->PC:
<4>[   24.953284]  (1)[1720:nxpnfc@1.0-serv]pn553_dev_read
<4>[   24.953294]  (1)[1720:nxpnfc@1.0-serv]pn553 pn553_dev_read : reading 2 bytes.
<4>[   24.953301]  (1)[1720:nxpnfc@1.0-serv]pn553_enable_irq
<4>[   24.953318] -(1)[1720:nxpnfc@1.0-serv]pn553_dev_irq_handler()
<4>[   24.953324] -(1)[1720:nxpnfc@1.0-serv]pn553_disable_irq
<4>[   24.953684]  (3)[1720:nxpnfc@1.0-serv]pn553 IFD->PC:
<4>[   24.954328]  (3)[1720:nxpnfc@1.0-serv]pn553_dev_read
<4>[   24.954353]  (3)[1720:nxpnfc@1.0-serv]pn553 pn553_dev_read : reading 3 bytes.
<4>[   24.954361]  (3)[1720:nxpnfc@1.0-serv]pn553_enable_irq
<4>[   24.954441]  (3)[1721:nxpnfc@1.0-serv]pn553_dev_write
<6>[   24.954441]  (0)[149:disp_idlemgr][DISP]dl_to_dc capture:Flush wait wdma sof
<4>[   24.962348]  (3)[1721:nxpnfc@1.0-serv]pn553 pn553_dev_write : writing 217 bytes.
<4>[   24.968275] -(3)[1719:NDK MediaCodec_]pn553_dev_irq_handler()
<4>[   24.968305] -(3)[1719:NDK MediaCodec_]pn553_disable_irq
<6>[   24.976475]  (1)[149:disp_idlemgr][DDP/OVL]warn:ovl_roi:(480x800)
<6>[   24.976567]  (1)[149:disp_idlemgr][DISP]primary display is DECOUPLE mode now
<6>[   24.976709]  (2)[513:HwBinder:346_2][DISP][disp_lowpower]_vdo_mode_leave_idle
<6>[   24.976828]  (2)[513:HwBinder:346_2][DISP]primary display will switch from DECOUPLE to DIRECT_LINK
<6>[   24.977140]  (2)[513:HwBinder:346_2][DDP/OVL]warn:ovl_roi:(480x800)
<7>[   24.977576]  (2)[513:HwBinder:346_2][PWM] TOPCKGEN node exist
<7>[   24.977594]  (2)[513:HwBinder:346_2][PWM] clk_req=0 clkid=19
<7>[   24.977609]  (2)[513:HwBinder:346_2][PWM] PWM_MUX 81040300->81040300
<6>[   24.977746]  (2)[513:HwBinder:346_2][DDP/DSI]warn:DSI_Set_VM_CMD
<6>[   24.977759]  (2)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba30!
<6>[   24.977773]  (2)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   24.977781]  (2)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   24.977787]  (2)[513:HwBinder:346_2]WARNING: CPU: 2 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1694/0x2460()
<4>[   24.977808]  (2)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   24.977846] -(2)[513:HwBinder:346_2]CPU: 2 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   24.977855] -(2)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   24.977862] -(2)[513:HwBinder:346_2]Call trace:
<4>[   24.977868] -(2)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   24.977881] -(2)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   24.977890] -(2)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   24.977901] -(2)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   24.977911] -(2)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   24.977920] -(2)[513:HwBinder:346_2][<ffffff8008550854>] ddp_dsi_config+0x1694/0x2460
<4>[   24.977929] -(2)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   24.977939] -(2)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   24.977949] -(2)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   24.977960] -(2)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   24.977969] -(2)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   24.977977] -(2)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   24.977985] -(2)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   24.977994] -(2)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   24.978003] -(2)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   24.978012] -(2)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   24.978020] -(2)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   24.978031] -(2)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   24.978040] -(2)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   24.978049]  (2)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3641 ]---
<5>[   24.978060]  (2)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   24.978069]  (2)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   24.978083]  (2)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba38!
<6>[   24.978090]  (2)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   24.978097]  (2)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   24.978103]  (2)[513:HwBinder:346_2]WARNING: CPU: 2 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x16fc/0x2460()
<4>[   24.978115]  (2)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   24.978149] -(2)[513:HwBinder:346_2]CPU: 2 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   24.978157] -(2)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   24.978163] -(2)[513:HwBinder:346_2]Call trace:
<4>[   24.978168] -(2)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   24.978179] -(2)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   24.978188] -(2)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   24.978198] -(2)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   24.978208] -(2)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   24.978216] -(2)[513:HwBinder:346_2][<ffffff80085508bc>] ddp_dsi_config+0x16fc/0x2460
<4>[   24.978225] -(2)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   24.978235] -(2)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   24.978245] -(2)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   24.978256] -(2)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   24.978264] -(2)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   24.978273] -(2)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   24.978281] -(2)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   24.978290] -(2)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   24.978300] -(2)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   24.978308] -(2)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   24.978317] -(2)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   24.978327] -(2)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   24.978336] -(2)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   24.978346]  (2)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3642 ]---
<5>[   24.978357]  (2)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   24.978365]  (2)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   24.978379]  (2)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba40!
<6>[   24.978387]  (2)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   24.978395]  (2)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   24.978401]  (2)[513:HwBinder:346_2]WARNING: CPU: 2 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1764/0x2460()
<4>[   24.978415]  (2)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   24.978450] -(2)[513:HwBinder:346_2]CPU: 2 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   24.978458] -(2)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   24.978465] -(2)[513:HwBinder:346_2]Call trace:
<4>[   24.978470] -(2)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   24.978481] -(2)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   24.978489] -(2)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   24.978499] -(2)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   24.978508] -(2)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   24.978517] -(2)[513:HwBinder:346_2][<ffffff8008550924>] ddp_dsi_config+0x1764/0x2460
<4>[   24.978525] -(2)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   24.978534] -(2)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   24.978544] -(2)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   24.978554] -(2)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   24.978563] -(2)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   24.978571] -(2)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   24.978580] -(2)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   24.978588] -(2)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   24.978598] -(2)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   24.978607] -(2)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   24.978615] -(2)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   24.978625] -(2)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   24.978634] -(2)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   24.978643]  (2)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3643 ]---
<5>[   24.978654]  (2)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   24.978662]  (2)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   24.978675]  (2)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba50!
<6>[   24.978684]  (2)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   24.978692]  (2)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   24.978697]  (2)[513:HwBinder:346_2]WARNING: CPU: 2 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x17cc/0x2460()
<4>[   24.978710]  (2)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   24.978745] -(2)[513:HwBinder:346_2]CPU: 2 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   24.978753] -(2)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   24.978760] -(2)[513:HwBinder:346_2]Call trace:
<4>[   24.978765] -(2)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   24.978776] -(2)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   24.978784] -(2)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   24.978793] -(2)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   24.978803] -(2)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   24.978812] -(2)[513:HwBinder:346_2][<ffffff800855098c>] ddp_dsi_config+0x17cc/0x2460
<4>[   24.978820] -(2)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   24.978830] -(2)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   24.978840] -(2)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   24.978851] -(2)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   24.978859] -(2)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   24.978867] -(2)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   24.978875] -(2)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   24.978884] -(2)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   24.978892] -(2)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   24.978901] -(2)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   24.978909] -(2)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   24.978919] -(2)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   24.978928] -(2)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   24.978936]  (2)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3644 ]---
<5>[   24.978947]  (2)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   24.978955]  (2)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   24.978969]  (2)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba58!
<6>[   24.978977]  (2)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   24.978985]  (2)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   24.978991]  (2)[513:HwBinder:346_2]WARNING: CPU: 2 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1834/0x2460()
<4>[   24.979003]  (2)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   24.979037] -(2)[513:HwBinder:346_2]CPU: 2 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   24.979045] -(2)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   24.979051] -(2)[513:HwBinder:346_2]Call trace:
<4>[   24.979056] -(2)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   24.979067] -(2)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   24.979075] -(2)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   24.979085] -(2)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   24.979094] -(2)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   24.979103] -(2)[513:HwBinder:346_2][<ffffff80085509f4>] ddp_dsi_config+0x1834/0x2460
<4>[   24.979111] -(2)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   24.979122] -(2)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   24.979131] -(2)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   24.979141] -(2)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   24.979150] -(2)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   24.979158] -(2)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   24.979165] -(2)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   24.979174] -(2)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   24.979183] -(2)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   24.979192] -(2)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   24.979200] -(2)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   24.979212] -(2)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   24.979221] -(2)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   24.979230]  (2)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3645 ]---
<5>[   24.979240]  (2)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   24.979248]  (2)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   24.979262]  (2)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba5c!
<6>[   24.979269]  (2)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   24.979277]  (2)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   24.979282]  (2)[513:HwBinder:346_2]WARNING: CPU: 2 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x189c/0x2460()
<4>[   24.979294]  (2)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   24.979328] -(2)[513:HwBinder:346_2]CPU: 2 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   24.979337] -(2)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   24.979343] -(2)[513:HwBinder:346_2]Call trace:
<4>[   24.979348] -(2)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   24.979358] -(2)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   24.979367] -(2)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   24.979377] -(2)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   24.979386] -(2)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   24.979395] -(2)[513:HwBinder:346_2][<ffffff8008550a5c>] ddp_dsi_config+0x189c/0x2460
<4>[   24.979404] -(2)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   24.979414] -(2)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   24.979424] -(2)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   24.979433] -(2)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   24.979442] -(2)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   24.979450] -(2)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   24.979458] -(2)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   24.979467] -(2)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   24.979476] -(2)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   24.979485] -(2)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   24.979493] -(2)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   24.979505] -(2)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   24.979514] -(2)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   24.979523]  (2)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3646 ]---
<5>[   24.979533]  (2)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   24.979541]  (2)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   24.979555]  (2)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba18!
<6>[   24.979564]  (2)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   24.979572]  (2)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   24.979577]  (2)[513:HwBinder:346_2]WARNING: CPU: 2 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1904/0x2460()
<4>[   24.979592]  (2)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   24.979627] -(2)[513:HwBinder:346_2]CPU: 2 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   24.979635] -(2)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   24.979642] -(2)[513:HwBinder:346_2]Call trace:
<4>[   24.979647] -(2)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   24.979658] -(2)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   24.979667] -(2)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   24.979678] -(2)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   24.979687] -(2)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   24.979696] -(2)[513:HwBinder:346_2][<ffffff8008550ac4>] ddp_dsi_config+0x1904/0x2460
<4>[   24.979704] -(2)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   24.979714] -(2)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   24.979724] -(2)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   24.979734] -(2)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   24.979743] -(2)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   24.979752] -(2)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   24.979760] -(2)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   24.979769] -(2)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   24.979778] -(2)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   24.979786] -(2)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   24.979794] -(2)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   24.979806] -(2)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   24.979815] -(2)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   24.979823]  (2)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3647 ]---
<5>[   24.979833]  (2)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   24.979842]  (2)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   24.979858]  (2)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba20!
<6>[   24.979865]  (2)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   24.979874]  (2)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   24.979879]  (2)[513:HwBinder:346_2]WARNING: CPU: 2 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x196c/0x2460()
<4>[   24.979893]  (2)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   24.979928] -(2)[513:HwBinder:346_2]CPU: 2 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   24.979937] -(2)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   24.979943] -(2)[513:HwBinder:346_2]Call trace:
<4>[   24.979948] -(2)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   24.979959] -(2)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   24.979967] -(2)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   24.979979] -(2)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   24.979989] -(2)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   24.979998] -(2)[513:HwBinder:346_2][<ffffff8008550b2c>] ddp_dsi_config+0x196c/0x2460
<4>[   24.980007] -(2)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   24.980018] -(2)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   24.980027] -(2)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   24.980037] -(2)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   24.980046] -(2)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   24.980054] -(2)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   24.980063] -(2)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   24.980072] -(2)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   24.980081] -(2)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   24.980089] -(2)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   24.980097] -(2)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   24.980109] -(2)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   24.980118] -(2)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   24.980127]  (2)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3648 ]---
<5>[   24.980138]  (2)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   24.980147]  (2)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   24.980160]  (2)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba28!
<6>[   24.980168]  (2)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   24.980176]  (2)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   24.980182]  (2)[513:HwBinder:346_2]WARNING: CPU: 2 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x19d4/0x2460()
<4>[   24.980195]  (2)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   24.980231] -(2)[513:HwBinder:346_2]CPU: 2 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   24.980240] -(2)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   24.980246] -(2)[513:HwBinder:346_2]Call trace:
<4>[   24.980251] -(2)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   24.980262] -(2)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   24.980271] -(2)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   24.980281] -(2)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   24.980291] -(2)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   24.980300] -(2)[513:HwBinder:346_2][<ffffff8008550b94>] ddp_dsi_config+0x19d4/0x2460
<4>[   24.980308] -(2)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   24.980320] -(2)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   24.980330] -(2)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   24.980340] -(2)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   24.980349] -(2)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   24.980357] -(2)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   24.980365] -(2)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   24.980373] -(2)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   24.980383] -(2)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   24.980391] -(2)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   24.980399] -(2)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   24.980412] -(2)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   24.980420] -(2)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   24.980429]  (2)[513:HwBinder:346_2]---[ end trace e335f74a8dfe3649 ]---
<5>[   24.980440]  (2)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   24.980448]  (2)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   24.980458]  (2)[513:HwBinder:346_2][DISP]===>v_a-v_b=0x18e3,HSTX_CKLP_WC=0xffffffc0
<6>[   24.980466]  (2)[513:HwBinder:346_2][DISP]===>v_b+v_c=0x3a4,HFP_WC=0x25
<6>[   24.980474]  (2)[513:HwBinder:346_2][DISP]===>Will Reconfig in order to fulfill LP clock lane per line
<6>[   24.980490]  (2)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba48!
<6>[   24.980498]  (2)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   24.980507]  (2)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   24.980513]  (2)[513:HwBinder:346_2]WARNING: CPU: 2 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1b58/0x2460()
<4>[   24.980527]  (2)[513:HwBinder:346_2]Modules linked in: wlan_drv_gen2 ffffff8000c3a000           (null) 1343389 0 (O) wmt_chrdev_wifi ffffff8000c33000           (null) 9110 0 (O) gps_drv ffffff8000c25000           (null) 43218 0 (O) bt_drv ffffff8000c1d000           (null) 15941 0 (O) wmt_drv ffffff8000ad5000           (null) 1135862 0 (O) fpsgo ffffff8000ad1000           (null) 2624 0 (O)
<4>[   24.980563] -(2)[513:HwBinder:346_2]CPU: 2 PID: 513 Comm: HwBinder:346_2 Tainted: G        W  O    4.4.95+ #1
<4>[   24.980572] -(2)[513:HwBinder:346_2]Hardware name: MT6739CW (DT)
<4>[   24.980578] -(2)[513:HwBinder:346_2]Call trace:
<4>[   24.980583] -(2)[513:HwBinder:346_2][<ffffff8008089b80>] dump_backtrace+0x0/0x218
<4>[   24.980595] -(2)[513:HwBinder:346_2][<ffffff8008089dac>] show_stack+0x14/0x1c
<4>[   24.980604] -(2)[513:HwBinder:346_2][<ffffff800832a390>] dump_stack+0x98/0xc0
<4>[   24.980613] -(2)[513:HwBinder:346_2][<ffffff800809fa90>] warn_slowpath_common+0xac/0xd4
<4>[   24.980624] -(2)[513:HwBinder:346_2][<ffffff800809fbc4>] warn_slowpath_null+0x18/0x20
<4>[   24.980633] -(2)[513:HwBinder:346_2][<ffffff8008550d18>] ddp_dsi_config+0x1b58/0x2460
<4>[   24.980641] -(2)[513:HwBinder:346_2][<ffffff8008572b08>] dpmgr_path_config+0x174/0x1e8
<4>[   24.980651] -(2)[513:HwBinder:346_2][<ffffff80088930d4>] DC_switch_to_DL_fast+0x188/0x418
<4>[   24.980661] -(2)[513:HwBinder:346_2][<ffffff800858bdf8>] do_primary_display_switch_mode+0x190/0x508
<4>[   24.980673] -(2)[513:HwBinder:346_2][<ffffff8008595fc0>] _vdo_mode_leave_idle+0x158/0x1ac
<4>[   24.980681] -(2)[513:HwBinder:346_2][<ffffff8008596028>] primary_display_idlemgr_leave_idle_nolock+0x14/0x24
<4>[   24.980690] -(2)[513:HwBinder:346_2][<ffffff80085960cc>] primary_display_idlemgr_kick+0x94/0xfc
<4>[   24.980699] -(2)[513:HwBinder:346_2][<ffffff800858c1b0>] primary_display_switch_mode+0x40/0x130
<4>[   24.980708] -(2)[513:HwBinder:346_2][<ffffff800859bed4>] set_session_mode+0x2c/0x78
<4>[   24.980717] -(2)[513:HwBinder:346_2][<ffffff800859bff4>] _ioctl_set_session_mode+0xd4/0xe4
<4>[   24.980725] -(2)[513:HwBinder:346_2][<ffffff800859c420>] mtk_disp_mgr_ioctl+0x41c/0x5e0
<4>[   24.980734] -(2)[513:HwBinder:346_2][<ffffff80081d0b00>] do_vfs_ioctl+0x610/0x634
<4>[   24.980745] -(2)[513:HwBinder:346_2][<ffffff80081d0b80>] SyS_ioctl+0x5c/0x8c
<4>[   24.980753] -(2)[513:HwBinder:346_2][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[   24.980792]  (2)[513:HwBinder:346_2]---[ end trace e335f74a8dfe364a ]---
<5>[   24.980814]  (2)[513:HwBinder:346_2][CMDQ][ERR]unrecognized subsys, physAddr:0x00000000
<5>[   24.980823]  (2)[513:HwBinder:346_2][CMDQ][ERR]REC: Unsupported memory base address 0x00000000
<6>[   24.980840]  (2)[513:HwBinder:346_2][DISP][disp_addr_convert #186]ERROR:DDP/can not find reg addr for va=0xffffffc036feba60!
<6>[   24.980849]  (2)[513:HwBinder:346_2]DDP ASSERT FAILED /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h, 187
<4>[   24.980857]  (2)[513:HwBinder:346_2]------------[ cut here ]------------
<4>[   24.980863]  (2)[513:HwBinder:346_2]WARNING: CPU: 2 PID: 513 at /home/buildform02/jenkins/workspace/WK_vq405_oreo_dev/kernel-4.4/drivers/misc/mediatek/video/mt6739/dispsys/ddp_reg.h:187 ddp_dsi_config+0x1cc4/0x2460()
