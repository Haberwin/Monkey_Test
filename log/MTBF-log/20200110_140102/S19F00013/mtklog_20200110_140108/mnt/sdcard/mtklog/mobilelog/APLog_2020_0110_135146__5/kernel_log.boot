----- timezone:GMT
<6>[    0.000000] -(0)[0:swapper]Booting Linux on physical CPU 0x0
<6>[    0.000000] -(0)[0:swapper]Initializing cgroup subsys cpuset
<6>[    0.000000] -(0)[0:swapper]Initializing cgroup subsys cpu
<6>[    0.000000] -(0)[0:swapper]Initializing cgroup subsys cpuacct
<6>[    0.000000] -(0)[0:swapper]Initializing cgroup subsys schedtune
<5>[    0.000000] -(0)[0:swapper]Linux version 4.4.95+ (jenkins@blqsrv820) (gcc version 6.3.1 20170109 (Linaro GCC 6.3-2017.02) ) #2 SMP PREEMPT Fri Dec 27 10:20:58 CET 2019
<6>[    0.000000] -(0)[0:swapper]Boot CPU: AArch64 Processor [410fd034]
<5>[    0.000000] -(0)[0:swapper]mrdump_get_cb: mrdump_cbaddr=0x000000000011e000, mrdump_cbsize=0x0000000000002000
<1>[    0.000000] -(0)[0:swapper][PHY layout]mblock-9-ccci   :   0x7c000000 - 0x7d5fffff (0x1600000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]mblock-7-ccci   :   0x80000000 - 0x800fffff (0x100000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]mblock-6-SPM-reserved   :   0x77ff0000 - 0x77ffffff (0x10000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]mblock-5-framebuffer   :   0x7f220000 - 0x7feaffff (0xc90000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]mblock-4-tee-reserved   :   0xeeb00000 - 0xeff3ffff (0x1440000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]mblock-3-SPM-reserved   :   0x7feb0000 - 0x7febffff (0x10000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]mblock-2-SSPM-reserved   :   0x7fec0000 - 0x7ff7ffff (0xc0000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]atf-reserved-memory@44610000   :   0x54600000 - 0x5463ffff (0x40000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]reserve-memory-sspm_share   :   0x9ff80000 - 0x9fffffff (0x80000)
<6>[    0.000000] -(0)[0:swapper]Reserved memory: initialized node reserve-memory-sspm_share, compatible id mediatek,reserve-memory-sspm_share
<6>[    0.000000] -(0)[0:swapper]Reserved memory: failed to allocate memory for node 'zone-movable-cma-memory'
<3>[    0.000000] -(0)[0:swapper][dram_dummy_read_reserve_mem_of_init] dram_rank0_addr = 0x0000000077fef000, size = 0x1000
<6>[    0.000000] -(0)[0:swapper]Reserved memory: initialized node reserve-memory-dram_r0_dummy_read, compatible id reserve-memory-dram_r0_dummy_read
<1>[    0.000000] -(0)[0:swapper][PHY layout]consys-reserve-memory   :   0xafe00000 - 0xafffffff (0x200000)
<6>[    0.000000] -(0)[0:swapper][CONNADP]reserve_memory_consys_fn: name: consys-reserve-memory, base: 0xafe00000, size: 0x200000
<6>[    0.000000] -(0)[0:swapper]Reserved memory: initialized node consys-reserve-memory, compatible id mediatek,consys-reserve-memory
<3>[    0.000000] -(0)[0:swapper][dram_dummy_read_reserve_mem_of_init] dram_rank1_addr = 0x00000000eeaff000, size = 0x1000
<6>[    0.000000] -(0)[0:swapper]Reserved memory: initialized node reserve-memory-dram_r1_dummy_read, compatible id reserve-memory-dram_r1_dummy_read
<6>[    0.000000] -(0)[0:swapper][memblock]mediatek,pstore: 0x54410000 - 0x544f0000 (0xe0000)
<6>[    0.000000] -(0)[0:swapper]Reserved memory: initialized node pstore-reserved-memory@54410000, compatible id mediatek,pstore
<6>[    0.000000] -(0)[0:swapper][memblock]mediatek,minirdump: 0x544f0000 - 0x54500000 (0x10000)
<6>[    0.000000] -(0)[0:swapper]Reserved memory: initialized node minirdump-reserved-memory@544f0000, compatible id mediatek,minirdump
<5>[    0.000000] -(0)[0:swapper] mrdump region start = 0x0000000054000000 size =0x0000000000080000 is reserved already
<5>[    0.000000] -(0)[0:swapper] mrdump region start = 0x000000004489da80 size =0x0000000000001697 is reserved already
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0x40000000 - 0x545fffff (0x14600000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0x54640000 - 0x77feffff (0x239b0000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0x78000000 - 0x7bffffff (0x4000000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0x7d600000 - 0x7f21ffff (0x1c20000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0x7ff80000 - 0x7fffffff (0x80000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0x80100000 - 0x9ff7ffff (0x1fe80000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0xa0000000 - 0xafdfffff (0xfe00000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0xb0000000 - 0xeeafffff (0x3eb00000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0xeff40000 - 0xffffffff (0x100c0000)
<7>[    0.000000] -(0)[0:swapper]On node 0 totalpages: 771216
<7>[    0.000000] -(0)[0:swapper]  DMA zone: 12288 pages used for memmap
<7>[    0.000000] -(0)[0:swapper]  DMA zone: 0 pages reserved
<7>[    0.000000] -(0)[0:swapper]  DMA zone: 771216 pages, LIFO batch:31
<6>[    0.000000] -(0)[0:swapper]psci: probing for conduit method from DT.
<6>[    0.000000] -(0)[0:swapper]psci: PSCIv1.0 detected in firmware.
<6>[    0.000000] -(0)[0:swapper]psci: Using standard PSCI v0.2 function IDs
<6>[    0.000000] -(0)[0:swapper]psci: Trusted OS migration not required
<6>[    0.000000] -(0)[0:swapper]psci: SMC Calling Convention v1.1
<6>[    0.000000] -(0)[0:swapper]PERCPU: Embedded 23 pages/cpu @ffffffc0bfe7c000 s54680 r8192 d31336 u94208
<7>[    0.000000] -(0)[0:swapper]pcpu-alloc: s54680 r8192 d31336 u94208 alloc=23*4096
<7>[    0.000000] -(0)[0:swapper]pcpu-alloc: [0] 0 [0] 1 [0] 2 [0] 3 [0] 4 [0] 5 [0] 6 [0] 7 
<6>[    0.000000] -(0)[0:swapper]CPU features: enabling workaround for ARM errata 855873
<6>[    0.000000] -(0)[0:swapper]CPU features: enabling workaround for ARM erratum 845719
<6>[    0.000000] -(0)[0:swapper]CPU features: enabling workaround for ARM erratum 855872
<6>[    0.000000] -(0)[0:swapper]Built 1 zonelists in Zone order, mobility grouping on.  Total pages: 758928
<6>[    0.000000] -(0)[0:swapper][cpu_ntf] <00>ffffff8008198188 (page_alloc_cpu_notify)
<5>[    0.000000] Kernel command line: console=tty0 console=ttyMT0,921600n1 root=/dev/ram vmalloc=496M slub_max_order=0 slub_debug=OFZPU androidboot.hardware=mt6763 maxcpus=8 firmware_class.path=/vendor/firmware has_battery_removed=0 androidboot.verifiedbootstate=orange bootopt=64S3,32N2,64N2 buildvariant=user androidboot.veritymode=enforcing androidboot.atm=disabled androidboot.meta_log_disable=0 printk.disable_uart=0 bootprof.pl_t=4633 bootprof.lk_t=7367 bootprof.logo_t=1226 boot_reason=4 androidboot.serialno=S19F00013 androidboot.secureboot=49 androidboot.specialid=0 dlconfig_tof_offset=0 dlconfig_tof_x_talk=0 config_data_tof_offset_cali_flag=0 config_data_tof_xtalk_cali_flag=0 config_data_cp_index=0 config_data_charge_current=0 config_data_charge_termination_current=0 config_data_charge_voltage=0 config_data_recharge_threshold=0 config_data_precharge_current=0 config_data_pid_target_temperature=0 config_data_battery_profile_id=0 cmdline_power_on_flag=1 power_key_flag=0 power_on_threshold=<6>[    0.000000] -(0)[0:swapper]PID hash table entries: 4096 (order: 3, 32768 bytes)
<6>[    0.000000] -(0)[0:swapper]Dentry cache hash table entries: 524288 (order: 10, 4194304 bytes)
<6>[    0.000000] -(0)[0:swapper]Inode-cache hash table entries: 262144 (order: 9, 2097152 bytes)
<6>[    0.000000] -(0)[0:swapper]software IO TLB [mem 0xffe33000-0xffe73000] (0MB) mapped at [ffffffc0bfe33000-ffffffc0bfe72fff]
<6>[    0.000000] -(0)[0:swapper]Memory: 2729796K/3084864K available (11960K kernel code, 1714K rwdata, 4688K rodata, 5152K init, 4633K bss, 355068K reserved, 0K cma-reserved)
<5>[    0.000000] -(0)[0:swapper]Virtual kernel memory layout:
<5>[    0.000000]     modules : 0xffffff8000000000 - 0xffffff8008000000   (   128 MB)
<5>[    0.000000]     vmalloc : 0xffffff8008000000 - 0xffffffbdbfff0000   (   246 GB)
<5>[    0.000000]       .init : 0xffffff80090c9000 - 0xffffff80095d1000   (  5152 KB)
<5>[    0.000000]       .text : 0xffffff8008080000 - 0xffffff8008c2f000   ( 11964 KB)
<5>[    0.000000]     .rodata : 0xffffff8008c2f000 - 0xffffff80090c9000   (  4712 KB)
<5>[    0.000000]       .data : 0xffffff80095d1000 - 0xffffff800977db08   (  1715 KB)
<5>[    0.000000]     vmemmap : 0xffffffbdc0000000 - 0xffffffbfc0000000   (     8 GB maximum)
<5>[    0.000000]               0xffffffbdc0000000 - 0xffffffbdc3000000   (    48 MB actual)
<5>[    0.000000]     fixed   : 0xffffffbffe7fd000 - 0xffffffbffec00000   (  4108 KB)
<5>[    0.000000]     PCI I/O : 0xffffffbffee00000 - 0xffffffbfffe00000   (    16 MB)
<6>[    0.000000] -(0)[0:swapper][cpu_ntf] <00>ffffff80081d70b0 (slab_cpuup_callback)
<6>[    0.000000] -(0)[0:swapper]SLUB: HWalign=64, Order=0-0, MinObjects=0, CPUs=8, Nodes=1
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff80080eecd8 (sched_ilb_notifier)
<4>[    0.000000] -(0)[0:swapper/0]Initializing HMP scheduler:
<6>[    0.000000] -(0)[0:swapper/0]Preemptible hierarchical RCU implementation.
<6>[    0.000000] -(0)[0:swapper/0]	Build-time adjustment of leaf fanout to 64.
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff8008115b40 (rcu_cpu_notify)
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
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff8008366fc0 (radix_tree_callback)
<6>[    0.000000] -(0)[0:swapper/0]NR_IRQS:64 nr_irqs:64 0
<6>[    0.000000] -(0)[0:swapper/0]GIC: Using split EOI/Deactivate mode
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff8008392118 (gic_secondary_init)
<4>[    0.000000] -(0)[0:swapper/0]### gic-v3 init done. ###
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff80084564e0 (gic_sched_hotplug_callback)
<5>[    0.000000] -(0)[0:swapper/0]### gic-v3 scheduled pm init done ###
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff800811eae8 (timer_cpu_notify)
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff8008120670 (hrtimer_cpu_notify)
<3>[    0.000000] -(0)[0:swapper/0]mtk_infracfg_ao_init: infra mfg debug: 050000f2
<6>[    0.000000] -(0)[0:swapper/0]arch_timer_init:arch_timer_rate(0xc65d40),PHYS_SECURE_PPI=1,PHYS_NONSECURE_PPI=2,VIRT_PPI=3,HYP_PPI=4
<6>[    0.000000] -(0)[0:swapper/0]arch_timer_init:arch_timer_c3stop=1
<6>[    0.000000] -(0)[0:swapper/0]arch_timer_register:arch_timer_rate(0xc65d40),arch_timer_use_virtual=0
<6>[    0.000000] -(0)[0:swapper/0]arch_timer_register:request_percpu_irq PHYS_SECURE_PPI err=0
<6>[    0.000000] -(0)[0:swapper/0]arch_timer_register:request_percpu_irq PHYS_NONSECURE_PPI err=0
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff800895d000 (arch_timer_cpu_notify)
<6>[    0.000000] -(0)[0:swapper/0]Architected cp15 timer(s) running at 13.00MHz (phys).
<6>[    0.000000] -(0)[0:swapper/0]clocksource: arch_sys_counter: mask: 0xffffffffffffff max_cycles: 0x2ff89eacb, max_idle_ns: 440795202429 ns
<6>[    0.000000] -(0)[0:swapper/0]sched_clock: 56 bits at 13MHz, resolution 76ns, wraps every 4398046511101ns
<6>[    0.000054] -(0)[0:swapper/0][mtk_gpt] base=0xffffff8009c0e000, irq=5
<6>[    0.000066] -(0)[0:swapper/0][mtk_gpt] gpt1, base=0xffffff8009c0e010
<6>[    0.000074] -(0)[0:swapper/0][mtk_gpt] gpt2, base=0xffffff8009c0e020
<6>[    0.000082] -(0)[0:swapper/0][mtk_gpt] gpt3, base=0xffffff8009c0e030
<6>[    0.000090] -(0)[0:swapper/0][mtk_gpt] gpt4, base=0xffffff8009c0e040
<6>[    0.000097] -(0)[0:swapper/0][mtk_gpt] gpt5, base=0xffffff8009c0e050
<6>[    0.000105] -(0)[0:swapper/0][mtk_gpt] gpt6, base=0xffffff8009c0e060
<6>[    0.000143] -(0)[0:swapper/0][mtk_gpt] gpt1: clkdiv=1, cmp=128, hz=250, freq=32000
<6>[    0.000161] -(0)[0:swapper/0][mtk_gpt] acao clkevt, freq=32000
<6>[    0.001135] -(0)[0:swapper/0][cpu_ntf] <00>ffffff8008135700 (hotplug_cfd)
<6>[    0.134896] .(0)[0:swapper/0]console [ttyMT0] enabled
<3>[    0.135596] .(0)[0:swapper/0]ram_console: buffer start: 0xffffff8009c16000, size: 0x800
<3>[    0.136858] .(0)[0:swapper/0]pmic & external buck: 0xff
<3>[    0.137530] .(0)[0:swapper/0]ram_console: CPU notifier status: 18, 65, 0x0, 39469538884
<3>[    0.138561] .(0)[0:swapper/0]ram_console: CPU HPS footprint: 1545, 0x0, 11, 3818
<3>[    0.139522] .(0)[0:swapper/0]ram_console: last init function: 0xffffff8000dee090
<6>[    0.140602] .(0)[0:swapper/0]Calibrating delay loop (skipped), value calculated using timer frequency.. 26.00 BogoMIPS (lpj=52000)
<6>[    0.141868] .(0)[0:swapper/0]pid_max: default: 32768 minimum: 301
<6>[    0.142724] .(0)[0:swapper/0][cpu_ntf] <00>ffffff80082193a8 (buffer_cpu_notify)
<6>[    0.143670] .(0)[0:swapper/0]Security Framework initialized
<6>[    0.144390] .(0)[0:swapper/0]SELinux:  Initializing.
<7>[    0.145078] .(0)[0:swapper/0]SELinux:  Starting in permissive mode
<6>[    0.145121] .(0)[0:swapper/0]Mount-cache hash table entries: 8192 (order: 4, 65536 bytes)
<6>[    0.146168] .(0)[0:swapper/0]Mountpoint-cache hash table entries: 8192 (order: 4, 65536 bytes)
<6>[    0.147579] .(0)[0:swapper/0][cpu_ntf] <00>ffffff800819e0a8 (ratelimit_handler)
<6>[    0.148843] .(0)[0:swapper/0]Initializing cgroup subsys freezer
<6>[    0.149615] .(0)[0:swapper/0]Initializing cgroup subsys debug
<6>[    0.150386] .(0)[0:swapper/0][cpu_ntf] <00>ffffff80080a21c8 (smpboot_thread_call)
<6>[    0.151472] -(0)[0:swapper/0]init_heavy_tlb start.
<4>[    0.152097] -(0)[0:swapper/0]init_heavy_tlb: cpu=0 thresh_l=2147483647 thresh_h=250 max_capaicy=716
<4>[    0.153253] -(0)[0:swapper/0]init_heavy_tlb: cpu=1 thresh_l=2147483647 thresh_h=250 max_capaicy=716
<4>[    0.154413] -(0)[0:swapper/0]init_heavy_tlb: cpu=2 thresh_l=2147483647 thresh_h=250 max_capaicy=716
<4>[    0.155574] -(0)[0:swapper/0]init_heavy_tlb: cpu=3 thresh_l=2147483647 thresh_h=250 max_capaicy=716
<4>[    0.156735] -(0)[0:swapper/0]init_heavy_tlb: cpu=4 thresh_l=250 thresh_h=2147483647 max_capaicy=1024
<4>[    0.157906] -(0)[0:swapper/0]init_heavy_tlb: cpu=5 thresh_l=250 thresh_h=2147483647 max_capaicy=1024
<4>[    0.159077] -(0)[0:swapper/0]init_heavy_tlb: cpu=6 thresh_l=250 thresh_h=2147483647 max_capaicy=1024
<4>[    0.160249] -(0)[0:swapper/0]init_heavy_tlb: cpu=7 thresh_l=250 thresh_h=2147483647 max_capaicy=1024
<6>[    0.161573] .(0)[1:swapper/0]ASID allocator initialised with 65536 entries
<6>[    0.162464] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080a7918 (cpu_callback)
<6>[    0.165486] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080bf1b8 (workqueue_cpu_up_callback)
<6>[    0.166513] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080bf510 (workqueue_cpu_down_callback)
<6>[    0.177563] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080d64f8 (migration_call)
<6>[    0.178472] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080d1950 (sched_cpu_active)
<6>[    0.179402] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080d1918 (sched_cpu_inactive)
<6>[    0.181591] .(0)[1:swapper/0][cpu_ntf] <00>ffffff800817e6f0 (hotplug_event_notify)
<6>[    0.187108] .(0)[1:swapper/0][cpu_ntf] <00>ffffff800841d300 (cpu_hotplug_cb_notifier)
<6>[    0.188126] .(0)[1:swapper/0]CPU Hotplug Low Power Notification
<3>[    0.188903] .(0)[1:swapper/0]BOOTPROF:       188.902999: ON
<1>[    0.190115] .(0)[1:swapper/0]init_get_max_DRAM_size done. phone_dram_sz: 0xc0000000, kernel_mem_sz: 0xc0000000
<3>[    0.191455] .(0)[1:swapper/0]tag_devinfo_data size:200, HRID size:4
<3>[    0.192259] .(0)[1:swapper/0][devinfo][SegCode] Segment Code=0x11
<5>[    0.193088] .(0)[1:swapper/0]log_store: sram header address 0xffffff8009c18f00.
<5>[    0.194036] .(0)[1:swapper/0]log_store printk log buff addr:0x41787cc4, size 0x80000. buff flag 0x427.
<5>[    0.195221] .(0)[1:swapper/0]sram_dram_buff sig 0x5678ef90
<5>[    0.195937] .(0)[1:swapper/0]sram_dram_buff flag 0x427
<5>[    0.196609] .(0)[1:swapper/0]sram_dram_buff add 0x7ff80000
<5>[    0.197325] .(0)[1:swapper/0]sram_dram_buff size 0x40000
<5>[    0.198019] .(0)[1:swapper/0]sram_dram_buff offsize 0x20
<5>[    0.198725] .(0)[1:swapper/0]sram_dram_buff point 0x29fbf
<6>[    0.221576] .(0)[1:swapper/0]Brought up 8 CPUs
<6>[    0.222161] .(0)[1:swapper/0]SMP: Total of 8 processors activated.
<6>[    0.222983] .(0)[1:swapper/0]CPU features: detected feature: GIC system register CPU interface
<6>[    0.224087] .(0)[1:swapper/0]CPU: All CPU(s) started at EL2
<6>[    0.224865] -(0)[10:migration/0]alternatives: patching kernel code
<6>[    0.228779] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080c8cb8 (sched_domains_numa_masks_update)
<6>[    0.229875] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080daf30 (cpuset_cpu_active)
<6>[    0.230815] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080dafa8 (cpuset_cpu_inactive)
<6>[    0.231781] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080d2ec0 (hotplug_hrtick)
<6>[    0.233022] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80083dea78 (device_hotplug_notifier)
<1>[    0.260238] .(0)[1:swapper/0][PHY layout]tee_reserved_mem   :   0xeff00000 - 0xeff3ffff (0x40000)
<1>[    0.261416] .(0)[1:swapper/0][debug]available DRAM size = 0xc0000000
<1>[    0.261416] [PHY layout]FB (dt) :  0x7f220000 - 0x7feaffff  (0xc90000)
<1>[    0.263257] .(0)[1:swapper/0]
<1>[    0.263257]  register_restart_handler- 0xffffff8009bb6fd0, Notify call: - 0xffffff80088f4698
<1>[    0.264740] .(0)[1:swapper/0]ARCH_RESET register mtk_restart_handler  ok!!!!
<6>[    0.267573] .(0)[1:swapper/0]clocksource: jiffies: mask: 0xffffffff max_cycles: 0xffffffff, max_idle_ns: 7645041785100000 ns
<6>[    0.269014] .(0)[1:swapper/0]futex hash table entries: 2048 (order: 6, 262144 bytes)
<6>[    0.270555] .(1)[1:swapper/0]pinctrl core: initialized pinctrl subsystem
<4>[    0.271910] .(1)[1:swapper/0][PLAT DBG INFO] 0xd8a3: 0x11d80c(ffffff8009c1a80c), 64
<4>[    0.272912] .(1)[1:swapper/0][PLAT DBG INFO] 0xe31c: 0x11d84c(ffffff8009c1c84c), 16
<4>[    0.273892] .(1)[1:swapper/0][PLAT DBG INFO] 0x0: 0x0(          (null)), 0
<6>[    0.275150] .(1)[1:swapper/0]mtk_wdt_get_base_addr: compatible node found: toprgu
<6>[    0.276466] .(1)[1:swapper/0]NET: Registered protocol family 16
<6>[    0.278906] .(1)[1:swapper/0]ramoops: using module parameters
<3>[    0.279742] .(1)[1:swapper/0]ramoops: pstore:address is 0x54410000, size is 0xe0000, console_size is 0x40000, pmsg_size is 0x10000
<6>[    0.347953] .(4)[1:swapper/0]console [pstore-1] enabled
<6>[    0.348732] .(4)[1:swapper/0]pstore: Registered ramoops as persistent store backend
<6>[    0.349709] .(4)[1:swapper/0]ramoops: attached 0xe0000@0x54410000, ecc: 0/0
<3>[    0.350622] .(4)[1:swapper/0]BOOTPROF:       350.621692:probe: probe=platform_drv_probe drv=ramoops(ffffff800961f198)    70.868692ms
<3>[    0.352157] .(4)[1:swapper/0]BOOTPROF:       352.157077:initcall: ramoops_init    73.246923ms
<6>[    0.353621] .(4)[1:swapper/0][EMI] dram_type(1)
<6>[    0.354206] .(4)[1:swapper/0][EMI] ch_num(1)
<6>[    0.354770] .(4)[1:swapper/0][EMI] rk_num(2)
<6>[    0.355336] .(4)[1:swapper/0][EMI] rank0_size(0x10)
<6>[    0.355735] [EMI] rank1_size(0x8)<4>[    0.356325] .(4)[1:swapper/0]PWRAP reg: 0xffffff8009d96000,  irq: 12
<4>[    0.357203] -(1)[0:swapper/1]------------[ cut here ]------------
<3>[    0.357442] .(4)[1:swapper/0][DRAMC] dram info dram rank number = 2
<3>[    0.357447] .(4)[1:swapper/0][DRAMC] dram info dram rank0 base = 0x77fef000
<3>[    0.357449] .(4)[1:swapper/0][DRAMC] dram info dram rank1 base = 0xeeaff000
<3>[    0.357454] .(4)[1:swapper/0][DRAMC]find dt_scan_dram_info
<6>[    0.357576] .(4)[1:swapper/0]mtk_wdt_init ok
<4>[    0.361883] -(1)[0:swapper/1]WARNING: CPU: 1 PID: 0 at /data/jenkins/workspace/dl35_oreo/kernel-4.4/drivers/misc/mediatek/pmic_wrap/mt6763/pwrap_hal.c:1485 mt_pmic_wrap_irq+0x118/0x1a0()
<4>[    0.363992] -(1)[0:swapper/1]Modules linked in:
<4>[    0.364371] -(1)[0:swapper/1]CPU: 1 PID: 0 Comm: swapper/1 Not tainted 4.4.95+ #2
<4>[    0.365334] -(1)[0:swapper/1]Hardware name: MT6763V/B (DT)
<4>[    0.366052] -(1)[0:swapper/1]Call trace:
<4>[    0.366571] -(1)[0:swapper/1][<ffffff800808a298>] dump_backtrace+0x0/0x228
<4>[    0.367461] -(1)[0:swapper/1][<ffffff800808a4d4>] show_stack+0x14/0x20
<4>[    0.368307] -(1)[0:swapper/1][<ffffff8008360870>] dump_stack+0xa0/0xc0
<4>[    0.369153] -(1)[0:swapper/1][<ffffff80080a1bc4>] warn_slowpath_common+0x9c/0xd8
<4>[    0.370107] -(1)[0:swapper/1][<ffffff80080a1d10>] warn_slowpath_null+0x18/0x20
<4>[    0.371040] -(1)[0:swapper/1][<ffffff8008534168>] mt_pmic_wrap_irq+0x118/0x1a0
<4>[    0.371973] -(1)[0:swapper/1][<ffffff800810ab5c>] handle_irq_event_percpu+0x6c/0x250
<4>[    0.372971] -(1)[0:swapper/1][<ffffff800810ad88>] handle_irq_event+0x48/0x78
<4>[    0.373881] -(1)[0:swapper/1][<ffffff800810e9b8>] handle_fasteoi_irq+0xb8/0x1b0
<4>[    0.374825] -(1)[0:swapper/1][<ffffff8008109fbc>] generic_handle_irq+0x24/0x38
<4>[    0.375757] -(1)[0:swapper/1][<ffffff800810a304>] __handle_domain_irq+0xac/0x280
<4>[    0.376712] -(1)[0:swapper/1][<ffffff8008081960>] gic_handle_irq+0xe8/0x19c
<4>[    0.377613] -(1)[0:swapper/1]Exception stack(0xffffffc0401c3ce0 to 0xffffffc0401c3e10)
<4>[    0.378636] -(1)[0:swapper/1]3ce0: ffffff800914c018 0000000000000000 00000040b6d47000 0000000000000000
<4>[    0.379828] -(1)[0:swapper/1]3d00: 00000040b6d47000 00000000000001c0 00000000fffedb44 0000000000000000
<4>[    0.381021] -(1)[0:swapper/1]3d20: ffffffc0401b2930 ffffffc0401c3e80 00000000000008d0 0000000000000001
<4>[    0.382214] -(1)[0:swapper/1]3d40: 0000000000000002 0000000000000270 ffffff80097092f0 ffffff8009709390
<4>[    0.383407] -(1)[0:swapper/1]3d60: 0000000000000007 0000000000000001 ffffff80097092f0 ffffff8009712ac8
<4>[    0.384601] -(1)[0:swapper/1]3d80: ffffff8009712000 ffffff800914c000 ffffff800914c018 ffffff80095dbf58
<4>[    0.385794] -(1)[0:swapper/1]3da0: 0000000000000000 0000000000000000 ffffff80091517e0 ffffffc0401b2000
<4>[    0.386987] -(1)[0:swapper/1]3dc0: ffffff8008c36000 ffffffc0401c3f10 ffffff8008085a24 ffffffc0401c3f10
<4>[    0.388180] -(1)[0:swapper/1]3de0: ffffff8008085a28 0000000060000145 ffffffc0401b2000 ffffff80080ee520
<4>[    0.389372] -(1)[0:swapper/1]3e00: ffffffffffffffff ffffff8008c24890
<4>[    0.390194] -(1)[0:swapper/1][<ffffff8008084878>] el1_irq+0xb8/0x130
<4>[    0.391018] -(1)[0:swapper/1][<ffffff8008085a28>] arch_cpu_idle+0x38/0x138
<4>[    0.391908] -(1)[0:swapper/1][<ffffff80080f5e44>] cpu_startup_entry+0x1dc/0x358
<4>[    0.392852] -(1)[0:swapper/1][<ffffff8008090254>] secondary_start_kernel+0x24c/0x400
<4>[    0.393849] -(1)[0:swapper/1][<0000000040c2903c>] 0x40c2903c
<4>[    0.394594] -(1)[0:swapper/1]---[ end trace 8cfa91f0817a7c6e ]---
<6>[    0.401394] .(4)[1:swapper/0]cpuidle: using governor menu
<3>[    0.402094] .(4)[1:swapper/0]BOOTPROF:       402.094615:initcall: init_menu    44.506384ms
<6>[    0.409438] .(4)[1:swapper/0]cpuidle: using governor mtk_menu
<3>[    0.410935] .(4)[1:swapper/0]Power/swap IDLE BLOCKING INFO SETTING FAIL (type:3)
<6>[    0.412963] .(4)[1:swapper/0]vdso: 2 pages (1 code @ ffffff8008c35000, 1 data @ ffffff80095d9000)
<6>[    0.414133] .(4)[1:swapper/0]hw-breakpoint: found 6 breakpoint and 4 watchpoint registers.
<6>[    0.415348] .(4)[1:swapper/0]DMA: preallocated 256 KiB pool for atomic allocations
<4>[    0.416437] .(4)[1:swapper/0][EIC] no built in eint hw deb property
<4>[    0.417242] .(4)[1:swapper/0][EIC] builtin_mapping: spec=11, len=21
<4>[    0.418056] .(4)[1:swapper/0][EIC] debtime_setting: entry=10, spec=0, len=20
<5>[    0.419496] .(4)[1:swapper/0][Power/PPM] @ppm_main_data_init: cluster_num = 2
<5>[    0.420409] .(4)[1:swapper/0][Power/PPM] @ppm_main_data_init: ppm cluster 0 -> core_num = 4, cpu_id = 0
<5>[    0.421613] .(4)[1:swapper/0][Power/PPM] @ppm_main_data_init: ppm cluster 1 -> core_num = 4, cpu_id = 4
<5>[    0.422819] .(4)[1:swapper/0][Power/PPM] @ppm_main_data_init: done!
<5>[    0.423760] .(4)[1:swapper/0][Power/PPM] @ppm_main_pdrv_probe: ppm probe done!
<5>[    0.424704] .(4)[1:swapper/0][Power/PPM] ppm_profile_init done
<5>[    0.425452] .(4)[1:swapper/0][Power/PPM] ppm driver init done!
<4>[    0.426379] .(4)[1:swapper/0]### CIRQ init done. ###
<4>[    0.427427] .(4)[1:swapper/0][DISP]init_log_buffer success
<5>[    0.428354] .(4)[1:swapper/0]
<5>[    0.428354]  MTK_SIP_KERNEL_WDT - 0xffffff80087d9d70
<5>[    0.429400] .(4)[1:swapper/0]
<5>[    0.429400]  atf_aee_debug_virt_addr = 0xffffff8009df0000
<5>[    0.433166] .(4)[1:swapper/0]mrdump_cblock_init: done.
<3>[    0.433880] .(4)[1:swapper/0]mrdump_platform_init: MT-RAMDUMP init failed, lk version  not matched.
<1>[    0.435054] .(4)[1:swapper/0]mrdump_wd_dram_reserved_mode: DDR Reserved Mode ready or not? (yes)
<6>[    0.436175] .(4)[1:swapper/0]mtk_wdt_swsysret_config: before set wdt_sys_val =8000
<6>[    0.437200] .(4)[1:swapper/0]mtk_wdt_swsysret_config: after set wdt_sys_val =8000,wdt_sys_val=88008000
<6>[    0.438394] .(4)[1:swapper/0]mtk_rgu_dram_reserved: MTK_WDT_MODE(0xdd)
<1>[    0.439238] .(4)[1:swapper/0]mrdump_wd_dram_reserved_mode: DDR reserved mode enabled
<6>[    0.440243] .(4)[1:swapper/0]mrdump_hw_init: init_done.
<5>[    0.440960] .(4)[1:swapper/0]mirdump: reserved 544f0000+3000->ffffff8009dfb000
<4>[    0.447627] .(4)[1:swapper/0]mt6763 pinctrl probe
<4>[    0.448620] .(4)[1:swapper/0]mtk_pctrl_init------ ok
<6>[    0.449606] .(4)[1:swapper/0]mtk wdt driver probe ..
<6>[    0.450853] .(4)[1:swapper/0]ext_debugkey_eint=-1
<6>[    0.454243] .(4)[1:swapper/0][EMI] module probe.
<6>[    0.454978] .(4)[1:swapper/0][EMI DBG] INFRACFG_BASE@ ffffff8009e20000
<6>[    0.455840] .(4)[1:swapper/0][EMI DBG] INFRA_AO_BASE@ ffffff8009e22000
<6>[    0.456726] .(4)[1:swapper/0][EMI DBG] PERICFG_BASE@ ffffff8009e24000
<6>[    0.457550] .(4)[1:swapper/0][EMI] get CEN_EMI_BASE @ ffffff8009e18000
<6>[    0.458396] .(4)[1:swapper/0][EMI] get EMI_MPU_BASE @ ffffff8009e1a000
<6>[    0.459242] .(4)[1:swapper/0][EMI] get CH0_EMI_BASE @ ffffff8009e1c000
<6>[    0.460087] .(4)[1:swapper/0][EMI] get CH1_EMI_BASE @ ffffff8009e1e000
<6>[    0.460962] .(4)[1:swapper/0][MPU] initialize EMI MPU
<6>[    0.461627] .(4)[1:swapper/0][MPU] get MPU IRQ: 47
<7>[    0.465382] .(4)[1:swapper/0][DRAMC] module probe.
<4>[    0.465433] .(4)[1:swapper/0][DRAMC]get DRAMC_AO_CHA_BASE_ADDR @ ffffff8009e28000
<4>[    0.466387] .(4)[1:swapper/0][DRAMC]get DRAMC_AO_CHB_BASE_ADDR @ ffffff8009e2c000
<4>[    0.467352] .(4)[1:swapper/0][DRAMC]get DDRPHY_AO_CHA_BASE_ADDR @ ffffff8009e34000
<4>[    0.468328] .(4)[1:swapper/0][DRAMC]get DDRPHY_AO_CHB_BASE_ADDR @ ffffff8009e38000
<4>[    0.469322] .(4)[1:swapper/0][DRAMC]get DRAMC_NAO_CHA_BASE_ADDR @ ffffff8009e30000
<4>[    0.470287] .(4)[1:swapper/0][DRAMC]get DRAMC_NAO_CHB_BASE_ADDR @ ffffff8009e32000
<4>[    0.471263] .(4)[1:swapper/0][DRAMC]get DDRPHY_NAO_CHA_BASE_ADDR @ ffffff80083e0528
<4>[    0.472250] .(4)[1:swapper/0][DRAMC]get DDRPHY_NAO_CHB_BASE_ADDR @ ffffffc04015ba80
<4>[    0.473355] .(4)[1:swapper/0][DRAMC]get SLEEP_BASE_ADDR @ ffffff8009e3c000
<6>[    0.474306] .(4)[1:swapper/0][DRAMC]get SYS_TIMER_BASE_ADDR @ ffffff8009e3e000
<3>[    0.475227] .(4)[1:swapper/0][DRAMC Driver] dram type =1
<3>[    0.475921] .(4)[1:swapper/0][DRAMC Driver] Channel num =1
<3>[    0.476637] .(4)[1:swapper/0][DRAMC Driver] cbt mode =0
<3>[    0.477322] .(4)[1:swapper/0][DRAMC Driver] Dram Data Rate = 1866
<3>[    0.478128] .(4)[1:swapper/0][DRAMC Driver] shuffle_status = 0
<3>[    0.478883] .(4)[1:swapper/0][DRAMC Driver] dram can support DFS
<6>[    0.480354] .(4)[1:swapper/0]SSPM is ready to service IPI
<4>[    0.485686] .(4)[1:swapper/0]disp driver(1) disp_probe begin
<4>[    0.495399] .(4)[1:swapper/0]disp driver(1) disp_probe end
<3>[    0.519593] .(4)[1:swapper/0]BOOTPROF:       519.592462:initcall: arm64_device_init    75.863000ms
<4>[    0.520750] .(4)[1:swapper/0][pid=1]g_mmdvfs_step_util init with lp3
<4>[    0.521564] .(4)[1:swapper/0][pid=1]g_mmdvfs_step_util init
<3>[    0.524965] .(4)[1:swapper/0]systracker probe
<3>[    0.525538] .(4)[1:swapper/0]of_iomap for systracker @ 0xffffff8009e64000
<3>[    0.526411] .(4)[1:swapper/0][systracker] bus_dbg_con is in infra
<3>[    0.527235] .(4)[1:swapper/0]systracker_platform_probe_default:113: irq # 52
<6>[    0.547853] .(4)[1:swapper/0][cpu_ntf] <00>ffffff8008347730 (blk_cpu_notify)
<6>[    0.548772] .(4)[1:swapper/0][cpu_ntf] <00>ffffff8008347fa0 (blk_iopoll_cpu_notify)
<6>[    0.549757] .(4)[1:swapper/0][cpu_ntf] <00>ffffff800834e618 (blk_mq_main_cpu_notify)
<6>[    0.550749] .(4)[1:swapper/0][cpu_ntf] <00>ffffff800834b5d8 (blk_mq_queue_reinit_notify)
<6>[    0.552286] .(4)[1:swapper/0]mcdi_sysram_base = ffffff8009e68000
<4>[    0.554348] .(4)[1:swapper/0][M4U] mau_start_monitor [0], start=0x0, end=0xfffff, write: 1, port_mask=0xffffffff, larb_mask=0xffffffff
<4>[    0.555915] .(4)[1:swapper/0][M4U] mau_start_monitor [1], start=0x0, end=0xfffff, write: 0, port_mask=0xffffffff, larb_mask=0xffffffff
<4>[    0.558414] .(4)[1:swapper/0]MMP: mmprofile_enable(): enable: 1
<4>[    0.559183] .(4)[1:swapper/0]MMP: mmprofile_force_start(): start: 1
<6>[    0.564905] .(4)[1:swapper/0]mt6370_init (2.0.1_MTK): initializing...
<6>[    0.565838] .(4)[1:swapper/0]usb_type_c node found...
<6>[    0.566521] .(4)[1:swapper/0]tcpc_class_init (2.0.8_MTK)
<6>[    0.567205] .(4)[1:swapper/0]SVDM supported mode [0]: name = DisplayPort, svid = 0xff01
<6>[    0.568248] .(4)[1:swapper/0]SVDM supported mode [1]: name = Direct Charge, svid = 0x29cf
<6>[    0.569289] .(4)[1:swapper/0]dpm_check_supported_modes : found "disorder"...
<6>[    0.570212] .(4)[1:swapper/0]TCPC class init OK
<6>[    0.570803] .(4)[1:swapper/0]pd_dbg_info_init
<5>[    0.571479] .(4)[1:swapper/0][CMDQ]Register 1 monitor task CB (cmdq_mdp_start_task_atomic_virtual,cmdq_mdp_finish_task_atomic_virtual)
<5>[    0.573420] .(4)[1:swapper/0][CMDQ][CMDQ] platform_dev dev:ffffffc05f764410 PA:0x0000000010238000 VA:ffffff8009e82000 irqId:60 irqSecId:61 clk gce:0xffffffc05f0fbf00 timer:0xffffffc05e41f000
<5>[    0.575563] .(4)[1:swapper/0][CMDQ]set dma mask result: 0
<5>[    0.576314] .(4)[1:swapper/0][CMDQ]DEV: VA ref(mmsys_config): 0xffffff8009e84000
<5>[    0.577302] .(4)[1:swapper/0][CMDQ]DEV: VA ref(mdp_rdma0): 0xffffff8009e86000
<5>[    0.578236] .(4)[1:swapper/0][CMDQ]DEV: VA ref(mdp_rsz0): 0xffffff8009e88000
<5>[    0.579157] .(4)[1:swapper/0][CMDQ]DEV: VA ref(mdp_rsz1): 0xffffff8009e8a000
<5>[    0.580079] .(4)[1:swapper/0][CMDQ]DEV: VA ref(mdp_wdma0): 0xffffff8009e8c000
<5>[    0.581011] .(4)[1:swapper/0][CMDQ]DEV: VA ref(mdp_wrot0): 0xffffff8009e8e000
<5>[    0.581963] .(4)[1:swapper/0][CMDQ]DEV: VA ref(mdp_tdshp0): 0xffffff8009e90000
<5>[    0.582908] .(4)[1:swapper/0][CMDQ]DEV: VA ref(disp_color0): 0xffffff8009e92000
<5>[    0.583869] .(4)[1:swapper/0][CMDQ]DEV: VA ref(venc): 0xffffff8009e94000
<5>[    0.586283] .(4)[1:swapper/0][CMDQ]DEV: PA ref(mm_mutex): start = 0x0000000014016000
<5>[    0.587280] .(4)[1:swapper/0][CMDQ]free CPR size:544 thread:16
<5>[    0.589634] .(4)[1:swapper/0][CMDQ]SRAM Chunk New-32bit unit: start: 0x0, count: 64, Name: Fake SPR
<5>[    0.590799] .(4)[1:swapper/0][CMDQ]CPR for thread allocated, thread:16 free:1920
<5>[    0.591744] .(4)[1:swapper/0][CMDQ]SRAM Chunk New-32bit unit: start: 0x40, count: 10, Name: Delay CPR
<4>[    0.592925] .(4)[1:swapper/0]MMP: mmprofile_enable(): enable: 1
<4>[    0.593718] .(4)[1:swapper/0]MMP: mmprofile_force_start(): start: 1
<3>[    0.594687] .(4)[1:swapper/0]BOOTPROF:       594.686077:probe: probe=platform_drv_probe drv=mtk_cmdq(ffffff80096727d0)    21.362539ms
<3>[    0.597047] .(4)[1:swapper/0]BOOTPROF:       597.047385:initcall: cmdq_init    25.567384ms
<5>[    0.600538] .(4)[1:swapper/0][ccci0/util]opt_md2_support using default
<5>[    0.601477] .(4)[1:swapper/0][ccci0/util]opt_md5_support using default
<5>[    0.602400] .(4)[1:swapper/0][ccci0/util]opt_irat_support using default
<1>[    0.603709] .(4)[1:swapper/0][PHY layout]ccci_md0 at LK  :  0xb0000000 - 0xbf7fffff  (0xf800000)
<6>[    0.630941] .(4)[1:swapper/0]Freeing modem memory: 175936K from phys b3c30000
<6>[    0.631863] .(4)[1:swapper/0]free_reserved_memory: 0xb3c30000 ~ 0xbe800000
<6>[    0.633134] .(4)[1:swapper/0]Freeing modem memory: 1408K from phys b16a0000
<6>[    0.634024] .(4)[1:swapper/0]free_reserved_memory: 0xb16a0000 ~ 0xb1800000
<6>[    0.635115] .(4)[1:swapper/0]Freeing modem memory: 320K from phys b15b0000
<6>[    0.635992] .(4)[1:swapper/0]free_reserved_memory: 0xb15b0000 ~ 0xb1600000
<6>[    0.637059] .(4)[1:swapper/0]Freeing modem memory: 64K from phys b3bd0000
<6>[    0.637926] .(4)[1:swapper/0]free_reserved_memory: 0xb3bd0000 ~ 0xb3be0000
<6>[    0.638983] .(4)[1:swapper/0]Freeing modem memory: 64K from phys b3bf0000
<6>[    0.639850] .(4)[1:swapper/0]free_reserved_memory: 0xb3bf0000 ~ 0xb3c00000
<6>[    0.642115] .(4)[1:swapper/0]Freeing modem memory: 8192K from phys bf800000
<6>[    0.643004] .(4)[1:swapper/0]free_reserved_memory: 0xbf800000 ~ 0xc0000000
<1>[    0.644381] .(4)[1:swapper/0][PHY layout]ccci_share_mem at LK  :  0x80000000 - 0x800fffff  (0x100000)
<5>[    0.645618] .(4)[1:swapper/0][ccci0/util]Using default META MD setting[0][0]
<3>[    0.646800] .(4)[1:swapper/0]BOOTPROF:       646.800154:initcall: ccci_util_init    46.835462ms
<3>[    0.648623] .(4)[1:swapper/0][CONN-MD-DFT][I]conn_md_init:init message queue list succeed
<3>[    0.649687] .(4)[1:swapper/0][CONN-MD-DFT][I]conn_md_init:init active queue list succeed
<3>[    0.650718] .(4)[1:swapper/0][CONN-MD-DFT][I]conn_md_init:init user information list succeed
<3>[    0.651850] .(4)[1:swapper/0][CONN_MD_DMP][I]conn_md_dmp_init:alloc memory for msg log system done, size:0x00000430
<3>[    0.653173] .(4)[1:swapper/0][CONN-MD-DFT][I]conn_md_init:conn_md_dmp_init succeed
<3>[    0.654247] .(4)[1:swapper/0][CONN-MD-DFT][I]conn_md_init:create conn_md_thread succeed, wakeup it
<6>[    0.655397] .(4)[1:swapper/0]Init Richtek RegMap 1.1.13_G
<5>[    0.656339] .(4)[1:swapper/0]SCSI subsystem initialized
<6>[    0.657170] .(4)[1:swapper/0]usbcore: registered new interface driver usbfs
<6>[    0.658092] .(4)[1:swapper/0]usbcore: registered new interface driver hub
<6>[    0.659103] .(4)[1:swapper/0]usbcore: registered new device driver usb
<6>[    0.662174] .(4)[1:swapper/0]mt_charger_probe
<6>[    0.662932] .(4)[1:swapper/0]Advanced Linux Sound Architecture Driver Initialized.
<6>[    0.664291] .(4)[1:swapper/0][cpu_ntf] <00>ffffff8008a6f7a0 (dev_cpu_callback)
<4>[    0.665503] .(4)[1:swapper/0]------------[ cut here ]------------
<4>[    0.666285] .(4)[1:swapper/0]WARNING: CPU: 4 PID: 1 at /data/jenkins/workspace/dl35_oreo/kernel-4.4/net/wireless/reg.c:523 regulatory_init+0xb0/0x174()
<4>[    0.668027] .(4)[1:swapper/0]db.txt is empty, you should update it...
<4>[    0.668608] Modules linked in:.(4)[1:swapper/0]
<4>[    0.669229] -(4)[1:swapper/0]CPU: 4 PID: 1 Comm: swapper/0 Tainted: G        W       4.4.95+ #2
<4>[    0.670344] -(4)[1:swapper/0]Hardware name: MT6763V/B (DT)
<4>[    0.671061] -(4)[1:swapper/0]Call trace:
<4>[    0.671580] -(4)[1:swapper/0][<ffffff800808a298>] dump_backtrace+0x0/0x228
<4>[    0.672470] -(4)[1:swapper/0][<ffffff800808a4d4>] show_stack+0x14/0x20
<4>[    0.673316] -(4)[1:swapper/0][<ffffff8008360870>] dump_stack+0xa0/0xc0
<4>[    0.674162] -(4)[1:swapper/0][<ffffff80080a1bc4>] warn_slowpath_common+0x9c/0xd8
<4>[    0.675116] -(4)[1:swapper/0][<ffffff80080a1c5c>] warn_slowpath_fmt+0x5c/0x80
<4>[    0.676038] -(4)[1:swapper/0][<ffffff8009129e1c>] regulatory_init+0xb0/0x174
<4>[    0.676949] -(4)[1:swapper/0][<ffffff8009129cec>] cfg80211_init+0x74/0xf4
<4>[    0.677827] -(4)[1:swapper/0][<ffffff8008081d48>] do_one_initcall+0xd8/0x208
<4>[    0.678739] -(4)[1:swapper/0][<ffffff80090c9bcc>] kernel_init_freeable+0x188/0x234
<4>[    0.679715] -(4)[1:swapper/0][<ffffff8008c21a68>] kernel_init+0x10/0x108
<4>[    0.680582] -(4)[1:swapper/0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    0.681493] .(4)[1:swapper/0]---[ end trace 8cfa91f0817a7c6f ]---
<6>[    0.681602] .(1)[6:kworker/u16:0]power_supply usb: power_supply_changed
<6>[    0.681627] .(1)[6:kworker/u16:0]power_supply ac: power_supply_changed
<6>[    0.681637] .(1)[6:kworker/u16:0]power_supply charger: power_supply_changed
<3>[    0.681791] .(1)[13:kworker/1:0]power_supply charger: driver failed to report `charge_type' property: -22
<3>[    0.686279] .(5)[1:swapper/0]BOOTPROF:       686.278847:initcall: cfg80211_init    20.952769ms
<6>[    0.688604] .(5)[1:swapper/0]clocksource: Switched to clocksource arch_sys_counter
<3>[    0.711030] .(5)[1:swapper/0]BOOTPROF:       711.028693:initcall: event_trace_init    19.334769ms
<6>[    0.714119] .(5)[1:swapper/0][Power/cpufreq] (0, 1, 0)
<6>[    0.714833] .(5)[1:swapper/0][Power/cpufreq] DVFS - @(Record)cpuhvfs_pvt_tbl_create----->(ffffff8009eeec10)
<6>[    0.721329] .(5)[1:swapper/0][regulator_register] pass to register vs1, min_uV:1200000 max_uV:2787500
<6>[    0.722643] .(5)[1:swapper/0][regulator_register] pass to register vmodem, min_uV:500000 max_uV:1293750
<6>[    0.723967] .(5)[1:swapper/0][regulator_register] pass to register vcore, min_uV:500000 max_uV:1293750
<6>[    0.725292] .(5)[1:swapper/0][regulator_register] pass to register vproc, min_uV:500000 max_uV:1293750
<6>[    0.726597] .(5)[1:swapper/0][regulator_register] pass to register vs2, min_uV:1200000 max_uV:2787500
<6>[    0.727895] .(5)[1:swapper/0][regulator_register] pass to register vpa, min_uV:500000 max_uV:3650000
<6>[    0.736707] .(5)[1:swapper/0]****[mt6356_auxadc_init] BAT TEMP = 817, MTS_ADC = 0x41de
<3>[    0.737731] .(5)[1:swapper/0][mt_idle_ntf] <00>ffffff80085175e0 (pmic_auxadc_notify_call)
<3>[    0.740132] .(5)[1:swapper/0]BOOTPROF:       740.131693:probe: probe=platform_drv_probe drv=mt-pmic(ffffff8009660df0)    23.617231ms
<3>[    0.741692] .(5)[1:swapper/0]BOOTPROF:       741.692155:initcall: pmic_mt_init    25.587462ms
<5>[    0.742805] .(5)[1:swapper/0] pimix = 170
<5>[    0.743330] .(5)[1:swapper/0][MUSB]usb20_init 1801: usb20 init
<5>[    0.744550] .(5)[1:swapper/0][MUSB]mt_usb_probe 1705: init connection_work
<5>[    0.745442] .(5)[1:swapper/0][MUSB]mt_usb_probe 1708: keep musb->power & mtk_usb_power in the samae value
<5>[    0.746728] .(5)[1:swapper/0][MUSB]mt_usb_probe 1736: USB probe done!
<6>[    0.747553] .(5)[1:swapper/0][D][Factory Ext Data](_factory_ext_set_callback): (id=4)+
<6>[    0.748572] .(5)[1:swapper/0][D][Factory Ext Data](_get_factory_ext_item_impl): (id=4)+
<6>[    0.749617] .(5)[1:swapper/0][D][Factory Ext Data](_factory_ext_set_callback): (id=5)+
<6>[    0.750625] .(5)[1:swapper/0][D][Factory Ext Data](_get_factory_ext_item_impl): (id=5)+
<6>[    0.751656] .(5)[1:swapper/0][D][Factory Ext Data](_factory_ext_set_callback): (id=6)+
<6>[    0.752683] .(5)[1:swapper/0][D][Factory Ext Data](_get_factory_ext_item_impl): (id=6)+
<5>[    0.754468] .(5)[1:swapper/0][MUSB]usb20_init 1816: usb20 init ret:0
<7>[    0.755293] .(5)[1:swapper/0][BLOCK_TAG] DRAM: 0x0000000040000000 - 0x0000000100000000, size: 0xc0000000
<3>[    0.755760] .(5)[1:swapper/0][ION]ion_init()
<3>[    0.756811] .(5)[1:swapper/0][ION]ion_drv_probe() heap_nr=9
<3>[    0.757607] .(5)[1:swapper/0]ion_heap_create: Heap type is disabled: 1
<3>[    0.758443] .(5)[1:swapper/0]ion_mtk_heap_create: error creating heap ion_system_contig_heap type 1 base 0 size 0
<3>[    0.760159] .(5)[1:swapper/0][ION]ion_sec_heap_create error: not support
<3>[    0.761030] .(5)[1:swapper/0]ion_mtk_heap_create: error creating heap ion_sec_heap type 13 base 0 size 0
<3>[    0.762235] .(5)[1:swapper/0][ION]ion_sec_heap_create error: not support
<3>[    0.763102] .(5)[1:swapper/0]ion_mtk_heap_create: error creating heap ion_sec_heap_prot type 13 base 0 size 0
<3>[    0.764372] .(5)[1:swapper/0][ION]ion_sec_heap_create error: not support
<3>[    0.765248] .(5)[1:swapper/0]ion_mtk_heap_create: error creating heap ion_sec_heap_2d_fr type 13 base 0 size 0
<3>[    0.766519] .(5)[1:swapper/0][ION]ion_sec_heap_create error: not support
<3>[    0.767387] .(5)[1:swapper/0]ion_mtk_heap_create: error creating heap ion_sec_heap_wfd type 13 base 0 size 0
<4>[    0.769034] .(5)[1:swapper/0]MMP: mmprofile_enable(): enable: 1
<4>[    0.769817] .(5)[1:swapper/0]MMP: mmprofile_force_start(): start: 1
<3>[    0.770637] .(5)[1:swapper/0][ION]ion_init fd register notifer fail
<3>[    0.771444] .(5)[1:swapper/0]BOOTPROF:       771.443924:initcall: ion_init    15.679538ms
<6>[    0.772610] .(5)[1:swapper/0]NET: Registered protocol family 2
<6>[    0.773752] .(5)[1:swapper/0]TCP established hash table entries: 32768 (order: 6, 262144 bytes)
<6>[    0.775049] .(5)[1:swapper/0]TCP bind hash table entries: 32768 (order: 7, 524288 bytes)
<6>[    0.776480] .(5)[1:swapper/0]TCP: Hash tables configured (established 32768 bind 32768)
<6>[    0.777590] .(5)[1:swapper/0]UDP hash table entries: 2048 (order: 4, 65536 bytes)
<6>[    0.778616] .(5)[1:swapper/0]UDP-Lite hash table entries: 2048 (order: 4, 65536 bytes)
<6>[    0.779864] .(5)[1:swapper/0]NET: Registered protocol family 1
<6>[    0.781407] .(5)[1:swapper/0][Power/clkbuf]clk_buf_dump_dts_log: PMIC_CLK_BUF?_STATUS=2 1 1 2 0 0 1
<6>[    0.782560] .(5)[1:swapper/0][Power/clkbuf]clk_buf_dump_dts_log: PMIC_CLK_BUF?_DRV_CURR=-1 -1 -1 -1 -1 -1 -1
<6>[    0.783856] .(5)[1:swapper/0][Power/clkbuf]clk_buf_dump_clkbuf_log DCXO_CW00=0x4e1d, CW02=0x3aee, CW11=0xb800, CW14=0x82b5, CW16=0x9455, top_spi_con1=0x0
<6>[    0.785671] .(5)[1:swapper/0][Power/clkbuf]clk_buf_ctrl_internal: id=6, onoff=0
<6>[    0.786662] .(5)[1:swapper/0][Power/clkbuf]clk_buf_ctrl_internal: id=2, onoff=0, DCXO_ENABLE=0x2, pwrap_dcxo_en_flag=0x2
<6>[    0.788239] .(5)[1:swapper/0]Unpacking initramfs...
<6>[    0.826366] .(5)[1:swapper/0]Freeing initrd memory: 1104K
<3>[    0.827089] .(5)[1:swapper/0]BOOTPROF:       827.088847:initcall: populate_rootfs    39.030692ms
<4>[    0.828227] .(5)[1:swapper/0]TrustKernel TEE Driver initialization
<6>[    0.829108] .(5)[1:swapper/0]platform is bL: 1
<6>[    0.830032] .(5)[1:swapper/0][cpu_ntf] <00>ffffff800878ba10 (tee_cpu_callback)
<4>[    0.832273] .(5)[1:swapper/0]tkcoreos-rev: 0.8.7-gp
<4>[    0.833095] .(5)[1:swapper/0][TKCORE] [    0.000000]: <0>INF TKCore:init_teecore:98: teecore: init ctors
<4>[    0.833095] [    0.000000]: <0>INF TKCore:init_teecore:102: teecore: init time source
<4>[    0.833095] [    5.226186]: <0>INF TKCore:init_teecore:106: teecore: init calls
<4>[    0.833095] [    5.227001]: <0>DBG TKCore:call_initcalls:5
<6>[    0.833117] .(5)[1:swapper/0]tkcore_log_irq: 20
<6>[    0.833196] .(5)[1:swapper/0]TKCore misc: Register the misc device "tkcoredrv" (id=0,minor=61)
<6>[    0.834506] .(5)[1:swapper/0][cpu_ntf] <00>ffffff80089a1b60 (cpu_pmu_notify)
<6>[    0.836157] .(5)[1:swapper/0]hw perfevents: enabled with armv8_pmuv3 PMU driver, 7 counters available
<6>[    0.839540] .(5)[1:swapper/0]audit: initializing netlink subsys (disabled)
<5>[    0.839601] .(5)[1:swapper/0]audit: type=2000 audit(0.792:1): initialized
<6>[    0.839917] .(5)[1:swapper/0][cpu_ntf] <00>ffffff80081a46c0 (cpu_callback)
<4>[    0.842644] [TKCORE] 8: service addr: 0xf00002a0
<4>[    0.842644] [    5.227882]: <0>DBG TKCore:call_initcalls:58: service addr: 0xf00002a4
<4>[    0.842644] [    5.228835]: <0>DBG TKCore:thread_enable_vfp:1311: Enable VFP in kernel with no context and IRQ disabled
<4>[    0.842644] [    5.230104]: <0>DBG TKCore:call_initcalls:<5>[    0.844047] .(5)[1:swapper/0]VFS: Disk quotas dquot_6.6.0
<6>[    0.844139] .(5)[1:swapper/0]VFS: Dquot-cache hash table entries: 512 (order 0, 4096 bytes)
<6>[    0.845131] .(5)[1:swapper/0]Registering sdcardfs 0.1
<6>[    0.845320] .(5)[1:swapper/0]fuse init (API version 7.23)
<7>[    0.845628] .(5)[1:swapper/0]SELinux:  Registering netfilter hooks
<4>[    0.849491] .(5)[1:swapper/0][TKCORE] 58: service addr: 0xf00002a8
<4>[    0.849491] [    5.231044]: <0>DBG TKCore:call_initcalls:58: service addr: 0xf00002ac
<4>[    0.849491] [    5.231931]: <0>INF TKCore:spi_init:936: spi_init setup SPI driver
<4>[    0.849491] [    5.232768]: <0>DBG TKCore:call_initcalls:58: service addr: 0xf00002b0
<4>[    0.849491] [    5.2
<6>[    0.849498] .(5)[1:swapper/0]io scheduler noop registered
<6>[    0.849509] .(5)[1:swapper/0]io scheduler deadline registered
<6>[    0.849640] .(5)[1:swapper/0]io scheduler cfq registered (default)
<6>[    0.849677] .(5)[1:swapper/0][cpu_ntf] <00>ffffff800838ac88 (percpu_counter_hotcpu_callback)
<4>[    0.853263] .(5)[1:swapper/0]Unable to detect cache hierarchy from DT for CPU 0
<6>[    0.856178] .(5)[1:swapper/0]loop: module loaded
<6>[    0.856612] .(5)[1:swapper/0]zram: Added device: zram0
<4>[    0.856630] .(5)[1:swapper/0][Power/gpufreq] @mt_gpufreq_init
<4>[    0.857403] .(5)[1:swapper/0][Power/gpufreq] @mt_gpufreq_pdrv_probe: I am 6763 (10)
<3>[    0.857512] .(5)[1:swapper/0][Power/spower] 8/66/33/26/18/9/12/
<4>[    0.857523] .(5)[1:swapper/0][Power/gpufreq] setup gpufreqs table
<4>[    0.857528] .(5)[1:swapper/0][Power/gpufreq] @mt_setup_gpufreqs_table: g_cur_gpu_freq = 950000, g_cur_gpu_volt = 90000
<4>[    0.857534] .(5)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[0].gpufreq_khz = 700000
<4>[    0.857537] .(5)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[0].gpufreq_volt = 80000
<4>[    0.857540] .(5)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[0].gpufreq_power = 575
<4>[    0.857543] .(5)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[1].gpufreq_khz = 530000
<4>[    0.857545] .(5)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[1].gpufreq_volt = 70000
<4>[    0.857548] .(5)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[1].gpufreq_power = 331
<2>[    0.857796] .(5)[1:swapper/0][PBM] feature_en: 1, pbm_drv_done: 0
<4>[    0.857802] .(5)[1:swapper/0][Power/gpufreq] GPU current frequency = 700000KHz
<4>[    0.857808] .(5)[1:swapper/0][Power/gpufreq] Current Vproc = 800mV
<4>[    0.857811] .(5)[1:swapper/0][Power/gpufreq] g_cur_gpu_freq = 700000, g_cur_gpu_volt = 80000
<4>[    0.857814] .(5)[1:swapper/0][Power/gpufreq] g_cur_gpu_idx = 0, g_cur_gpu_OPPidx = 0
<6>[    0.857903] .(5)[1:swapper/0][register_low_battery_notify] prio_val=2
<6>[    0.857907] .(5)[1:swapper/0][register_battery_percent_notify] prio_val=2
<6>[    0.857911] .(5)[1:swapper/0][register_battery_oc_notify] prio_val=2
<6>[    0.859282] .(5)[1:swapper/0][Power/cpufreq] (0, 1, 0)
<6>[    0.859306] .(5)[1:swapper/0][register_dlpt_notify] prio_val=0
<2>[    0.859389] .(5)[1:swapper/0][PBM] pbm_module_init : Done
<4>[    0.859418] .(5)[1:swapper/0]Power_gs: pmic_manual_dump array malloc done
<4>[    0.859424] .(5)[1:swapper/0]Power_gs: golden setting base_remap table malloc done
<4>[    0.864853] -(5)[1:swapper/0]------------[ cut here ]------------
<4>[    0.864856] -(5)[1:swapper/0]WARNING: CPU: 5 PID: 1 at /data/jenkins/workspace/dl35_oreo/kernel-4.4/kernel/events/core.c:3348 perf_event_read_local+0x180/0x190()
<4>[    0.864868] Modules linked in:-(5)[1:swapper/0]
<4>[    0.864880] -(5)[1:swapper/0]CPU: 5 PID: 1 Comm: swapper/0 Tainted: G        W       4.4.95+ #2
<4>[    0.864885] -(5)[1:swapper/0]Hardware name: MT6763V/B (DT)
<4>[    0.864889] -(5)[1:swapper/0]Call trace:
<4>[    0.864891] -(5)[1:swapper/0][<ffffff800808a298>] dump_backtrace+0x0/0x228
<4>[    0.864901] -(5)[1:swapper/0][<ffffff800808a4d4>] show_stack+0x14/0x20
<4>[    0.864905] -(5)[1:swapper/0][<ffffff8008360870>] dump_stack+0xa0/0xc0
<4>[    0.864913] -(5)[1:swapper/0][<ffffff80080a1bc4>] warn_slowpath_common+0x9c/0xd8
<4>[    0.864920] -(5)[1:swapper/0][<ffffff80080a1d10>] warn_slowpath_null+0x18/0x20
<4>[    0.864925] -(5)[1:swapper/0][<ffffff8008187fb8>] perf_event_read_local+0x180/0x190
<4>[    0.864930] -(5)[1:swapper/0][<ffffff8008426884>] ppm_cpi_pmu_enable_locked+0x7c/0x140
<4>[    0.864936] -(5)[1:swapper/0][<ffffff8008426a14>] ppm_cpi_pmu_probe_cpu+0xcc/0x260
<4>[    0.864941] -(5)[1:swapper/0][<ffffff8008426f80>] ppm_cpi_pmu_probe+0x50/0xa0
<4>[    0.864946] -(5)[1:swapper/0][<ffffff80090f7140>] ppm_cpi_init+0x9c/0x108
<4>[    0.864950] -(5)[1:swapper/0][<ffffff8008081d48>] do_one_initcall+0xd8/0x208
<4>[    0.864955] -(5)[1:swapper/0][<ffffff80090c9bcc>] kernel_init_freeable+0x188/0x234
<4>[    0.864961] -(5)[1:swapper/0][<ffffff8008c21a68>] kernel_init+0x10/0x108
<4>[    0.864967] -(5)[1:swapper/0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    0.864972] -(5)[1:swapper/0]---[ end trace 8cfa91f0817a7c70 ]---
<6>[    0.869383] .(5)[1:swapper/0][cpu_ntf] <00>ffffff8008426c80 (ppm_cpi_notifier)
<5>[    0.869395] .(5)[1:swapper/0][Power/PPM] @ppm_cpi_init: CPI done! enable = 1
<5>[    0.869411] .(5)[1:swapper/0][Power/PPM] @ppm_dlpt_policy_init: register PPM_POLICY_DLPT done!
<5>[    0.869427] .(5)[1:swapper/0][Power/PPM] @ppm_sysboost_policy_init: register PPM_POLICY_SYS_BOOST done!
<5>[    0.869436] .(5)[1:swapper/0][Power/PPM] @ppm_ptpod_policy_init: register PPM_POLICY_PTPOD done!
<6>[    0.869444] .(5)[1:swapper/0][register_battery_percent_notify] prio_val=1
<6>[    0.869447] .(5)[1:swapper/0][register_battery_oc_notify] prio_val=1
<6>[    0.869450] .(5)[1:swapper/0][register_low_battery_notify] prio_val=1
<5>[    0.869452] .(5)[1:swapper/0][Power/PPM] @ppm_pwrthro_policy_init: register PPM_POLICY_PWR_THRO done!
<5>[    0.869467] .(5)[1:swapper/0][Power/PPM] @ppm_thermal_policy_init: register PPM_POLICY_THERMAL done!
<5>[    0.869484] .(5)[1:swapper/0][Power/PPM] @ppm_userlimit_policy_init: register PPM_POLICY_USER_LIMIT done!
<5>[    0.869493] .(5)[1:swapper/0][Power/PPM] @ppm_forcelimit_policy_init: register PPM_POLICY_FORCE_LIMIT done!
<5>[    0.869506] .(5)[1:swapper/0][Power/PPM] @ppm_ut_policy_init: register PPM_POLICY_UT done!
<1>[    0.869598] .(5)[1:swapper/0]MT_SCHED: Init complete, device major number = 246
<6>[    0.869613] .(5)[1:swapper/0][cpu_ntf] <00>ffffff800844b660 (sched_cpu_notify)
<6>[    0.870601] .(5)[1:swapper/0]11002000.apuart0: ttyMT0 at MMIO 0x0 (irq = 6, base_baud = 1625000) is a MTK UART
<6>[    0.870789] .(5)[1:swapper/0]11003000.apuart1: ttyMT1 at MMIO 0x0 (irq = 9, base_baud = 1625000) is a MTK UART
<4>[    0.872888] .(5)[1:swapper/0]pn548_dev_init
<4>[    0.873351] .(5)[1:swapper/0]pn548_platform_probe: &pdev=ffffffc05f790c00
<4>[    0.873355] .(5)[1:swapper/0]pn548_platform_pinctrl_init
<4>[    0.873472] .(5)[1:swapper/0]pn548_platform_pinctrl_select
<4>[    0.874076] .(5)[1:swapper/0][bert] i2c_add_driver  ret = 0 
<4>[    0.874079] .(5)[1:swapper/0]pn548_dev_init success
<4>[    0.874884] .(5)[1:swapper/0][MT AUXADC_probe3] get device tree info : start !!
<4>[    0.874965] .(5)[1:swapper/0][AUXADC_AP] find node TEMPERATURE:0
<4>[    0.874969] .(5)[1:swapper/0][AUXADC_AP] find node TEMPERATURE1:1
<4>[    0.874972] .(5)[1:swapper/0][AUXADC_AP] find node ADC_FDD_RF_PARAMS_DYNAMIC_CUSTOM_CH:2
<4>[    0.874980] .(5)[1:swapper/0][AUXADC_AP] find node BOARD_ID:3
<4>[    0.874983] .(5)[1:swapper/0][AUXADC_AP] find node BOARD_ID_2:4
<4>[    0.874986] .(5)[1:swapper/0][MT AUXADC_AP] adc_channel_info_init : done !!
<3>[    0.875018] .(5)[1:swapper/0]proc_create auxadc_debug_proc_fops
<3>[    0.876259] .(5)[1:swapper/0][PWM] get PWM1-main clock, ffffffc05d9dab00
<3>[    0.876270] .(5)[1:swapper/0][PWM] get PWM2-main clock, ffffffc05d9dac00
<3>[    0.876281] .(5)[1:swapper/0][PWM] get PWM3-main clock, ffffffc05d9dad00
<3>[    0.876293] .(5)[1:swapper/0][PWM] get PWM4-main clock, ffffffc05d9dae00
<3>[    0.876307] .(5)[1:swapper/0][PWM] get PWM-HCLK-main clock, ffffffc05d9daf00
<3>[    0.876321] .(5)[1:swapper/0][PWM] get PWM-main clock, ffffffc05da80680
<4>[    0.877025] stk3x1x_init Instk3x1x_init Out.(5)[1:swapper/0][Gsensor] bma2xx_init
<3>[    0.883042] .(5)[1:swapper/0][PMIC] [pmic_register_interrupt_callback] register callback conflict intNo=154
<4>[    0.883094] .(5)[1:swapper/0][Accdet]accdet_mod_init begin!
<6>[    0.883880] .(5)[1:swapper/0][mt_accdet_probe]probe start..
<6>[    0.884081] .(5)[1:swapper/0]input: ACCDET as /devices/virtual/input/input0
<6>[    0.884404] .(5)[1:swapper/0][mt_accdet_probe]CONFIG_ACCDET_SUPPORT_EINT1 opened!
<6>[    0.884407] [accdet_get_dts_data]Start..<6>[    0.885478] .(5)[1:swapper/0][accdet_get_dts_data]mid-Key = 80, up_key = 220, down_key = 400
<6>[    0.885483] .(5)[1:swapper/0][accdet_get_dts_data]pwm_width=0x500, pwm_thresh=0x500, mic_mode=2, mic_vol=6
<6>[    0.885487] .(5)[1:swapper/0][accdet_get_dts_data] deb0=0x800,deb1=0x800,deb3=0x20,deb4=0x44
<6>[    0.885492] .(5)[1:swapper/0][mt_accdet_probe]probe done!
<4>[    0.886914] .(5)[1:swapper/0][Accdet]platform_driver_register done!
<4>[    0.886917] .(5)[1:swapper/0][Accdet]accdet_mod_init done!
<6>[    0.886931] .(5)[1:swapper/0]usb_function_register name=via_gps
<6>[    0.886939] .(5)[1:swapper/0]usb_function_register name=via_pcv
<6>[    0.886945] .(5)[1:swapper/0]usb_function_register name=via_atc
<6>[    0.886952] .(5)[1:swapper/0]usb_function_register name=via_ets
<6>[    0.886958] .(5)[1:swapper/0]usb_function_register name=via_modem
<5>[    0.886964] .(5)[1:swapper/0]C2K_USB_NOTE,<init 701>, rawbulk functions init.
<5>[    0.886979] .(5)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.887050] .(5)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.887103] .(5)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.887153] .(5)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.887201] .(5)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.887253] .(5)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.887302] .(5)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.887351] .(5)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.887405] .(5)[1:swapper/0]C2K_USB_NOTE,<rawbulk_init 1249>, rawbulk_init
<5>[    0.891640] mtk_rtc_common: rtc_init<5>[    0.893830] .(5)[1:swapper/0]mtk_rtc_common: read al time = 2020/01/10 01:07:00 (0)
<6>[    0.895475] .(5)[1:swapper/0]mt-rtc mt-rtc: rtc core: registered mt-rtc as rtc0
<4>[    0.895525] [fg_27542_init] init start with i2c DTS.(5)[1:swapper/0][fg_27542_init] Success to register fg_27542 i2c driver.
<4>[    0.895915] .(5)[1:swapper/0]******** fg_27542_user_space_probe!! ********
<4>[    0.895999] .(5)[1:swapper/0]
<4>[    0.895999]  manufactureA_init,  Major: 243 Minor: 0
<4>[    0.896057] .(5)[1:swapper/0]
<4>[    0.896057]  manufactureB_init,  Major: 242 Minor: 0
<4>[    0.896065] [wlc_51025_init] init start with i2c DTS.(5)[1:swapper/0][wlc_51025_init] Success to register wlc_51025 i2c driver.
<4>[    0.896412] .(5)[1:swapper/0]******** wlc_51025_user_space_probe!! ********
<4>[    0.896788] .(5)[1:swapper/0]******** mcp_6442_user_space_probe!! ********
<4>[    0.896822] .(5)[1:swapper/0]****[pcb_version_init] begin to register driver
<4>[    0.897128] .(5)[1:swapper/0]******** pcb_version_user_space_probe!! ********
<3>[    0.897174] .(5)[1:swapper/0][MT6311] Kernel driver not support for SSPM
<5>[    0.897177] .(5)[1:swapper/0][MT6311] MT6311 not exist!, user space driver not probe
<3>[    0.897448] .(5)[1:swapper/0]mt6356_gauge_probe: starts
<3>[    0.897452] .(5)[1:swapper/0]mt6356_parse_dt: starts
<6>[    0.898218] .(5)[1:swapper/0]mtk_auxadc_intf_probe
<6>[    0.901985] .(5)[1:swapper/0]musb-hdrc: version 6.0, ?dma?, otg (peripheral+host)
<6>[    0.902575] .(5)[1:swapper/0]musb_probe mac=0xffffff800a3e0000, phy=0xffffff800b120000, irq=94
<5>[    0.902716] -(5)[1:swapper/0][MUSB]usb_6763_dpidle_request 120: USB_DPIDLE_FORBIDDEN, skip_cnt<0>
<5>[    0.902769] -(5)[1:swapper/0][MUSB]usb_6763_dpidle_request 113: USB_DPIDLE_ALLOWED, skip_cnt<0>
<4>[    0.902956] .(5)[1:swapper/0]usb_phy_generic.0.auto supply vcc not found, using dummy regulator
<5>[    0.903172] .(5)[1:swapper/0][MUSB]mt_usb_otg_init 784: host controlled by TYPEC
<5>[    0.903375] .(2)[69:kworker/u16:2][MUSB]do_register_otg_work 59: get type_c_port0 fail
<5>[    0.903410] .(5)[1:swapper/0][MUSB]mt_usb_enable 300: begin <0,0>,<1,0,0,0>
<5>[    0.914359] .(5)[1:swapper/0][MUSB]set_usb_phy_mode 425: force PHY to mode 1, 0x6c=3f2f
<5>[    0.914384] .(5)[1:swapper/0][MUSB]usb_phy_recover 685: apply efuse setting, RG_USB20_INTR_CAL=0x15
<5>[    0.914967] .(5)[1:swapper/0][MUSB]usb_phy_recover 695: usb recovery success
<5>[    0.914971] .(5)[1:swapper/0][MUSB]mt_usb_enable 324: end, <1,0,1,0>
<6>[    0.915346] .(5)[1:swapper/0]musb-hdrc musb-hdrc: MUSB HDRC host driver
<6>[    0.915366] .(5)[1:swapper/0]musb-hdrc musb-hdrc: new USB bus registered, assigned bus number 1
<6>[    0.915382] .(5)[1:swapper/0]usb usb1: usb_set_device_state 1->6
<6>[    0.915391] .(5)[1:swapper/0]usb usb1: usb_get_descriptor type=1 sz=18
<6>[    0.915434] .(5)[1:swapper/0]usb usb1: usb_get_descriptor type=2 sz=9
<6>[    0.915455] .(5)[1:swapper/0]usb usb1: usb_get_descriptor type=2 sz=25
<6>[    0.915774] .(5)[1:swapper/0]usb usb1: usb_set_device_state 6->7
<6>[    0.915845] .(5)[1:swapper/0]hub 1-0:1.0: USB hub found
<6>[    0.915871] .(5)[1:swapper/0]hub 1-0:1.0: 1 port detected
<5>[    0.915976] -(5)[1:swapper/0][MUSB]musb_hub_control 370: try to call musb_start in virthub
<5>[    0.916106] .(5)[1:swapper/0][MUSB]mt_usb_try_idle 285: b_idle inactive, for idle timer for 4 ms
<5>[    0.916111] .(5)[1:swapper/0][MUSB]musb_gadget_setup 2405: musb controller dma ops is non-null
<5>[    0.916222] .(5)[1:swapper/0][MUSB]mt_usb_disable 333: begin, <1,1>,<1,1,1,0>
<5>[    0.917053] .(5)[1:swapper/0][MUSB]set_usb_phy_mode 425: force PHY to mode 0, 0x6c=3f11
<5>[    0.917070] .(5)[1:swapper/0][MUSB]usb_phy_savecurrent 591: usb save current success
<5>[    0.917074] .(5)[1:swapper/0][MUSB]mt_usb_disable 339: end, <1,1,1,1>
<3>[    0.917154] .(5)[1:swapper/0]BOOTPROF:       917.154309:initcall: musb_init    15.160000ms
<3>[    0.917755] .(5)[1:swapper/0]can't find compatible node
<4>[    0.918754] .(5)[1:swapper/0][BOOT_COMMON] [create_sysfs] No atag,meta found !
<4>[    0.918879] .(5)[1:swapper/0]disp driver(1) disp_probe_1 begin
<5>[    0.920608] -(5)[0:swapper/5][MUSB]musb_do_idle 251: otg_state b_idle to b_idle, is_active<0>
<4>[    0.921834] .(4)[1:swapper/0]disp driver(1) disp_probe_1 end
<4>[    0.922427] .(4)[1:swapper/0]MMP: mmprofile_enable(): enable: 1
<4>[    0.922912] .(4)[1:swapper/0]MMP: mmprofile_force_start(): start: 1
<5>[    0.925568] .(5)[1:swapper/0][CMDQ]SRAM Chunk New-32bit unit: start: 0x4a, count: 92, Name: DELAY_THREAD
<5>[    0.925582] .(5)[1:swapper/0][CMDQ]overwrite delay function with cpr_offset = 74
<5>[    0.925586] .(5)[1:swapper/0][CMDQ]======REC 0xffffff800b3fa000 command buffer:
<3>[    0.925593] .(5)[1:swapper/0]ffffff800b3fa000: 80008001 200001e5 fffdb7ff 02000000
<3>[    0.925599] .(5)[1:swapper/0]ffffff800b3fa010: 102380d0 a0800000 00024800 91800000
<3>[    0.925604] .(5)[1:swapper/0]ffffff800b3fa020: ffffffff a0800002 ffffffff a080801c
<3>[    0.925609] .(5)[1:swapper/0]ffffff800b3fa030: 80410000 b1430050 00388040 a0e20001
<3>[    0.925614] .(5)[1:swapper/0]ffffff800b3fa040: 00018041 b1650028 80010000 200001e6
<3>[    0.925619] .(5)[1:swapper/0]ffffff800b3fa050: 00000000 a0808041 801c0000 a0c18042
<3>[    0.925624] .(5)[1:swapper/0]ffffff800b3fa060: 00010001 b1000020 80410001 a0e20000
<3>[    0.925629] .(5)[1:swapper/0]ffffff800b3fa070: 00000002 b1620010 00000000 a0c10002
<3>[    0.925634] .(5)[1:swapper/0]ffffff800b3fa080: 80440000 b1430050 00388043 a0e20001
<3>[    0.925639] .(5)[1:swapper/0]ffffff800b3fa090: 00018044 b1650028 80010000 200001e7
<3>[    0.925644] .(5)[1:swapper/0]ffffff800b3fa0a0: 00000000 a0808044 801c0000 a0c18045
<3>[    0.925650] .(5)[1:swapper/0]ffffff800b3fa0b0: 00010001 b1000020 80440001 a0e20000
<3>[    0.925654] .(5)[1:swapper/0]ffffff800b3fa0c0: 00000002 b1620010 00000000 a0c10002
<3>[    0.925659] .(5)[1:swapper/0]ffffff800b3fa0d0: 80470000 b1430050 00388046 a0e20001
<3>[    0.925664] .(5)[1:swapper/0]ffffff800b3fa0e0: 00018047 b1650028 80010000 200001e8
<3>[    0.925671] .(5)[1:swapper/0]ffffff800b3fa0f0: 00000000 a0808047 801c0000 a0c18048
<3>[    0.925676] .(5)[1:swapper/0]ffffff800b3fa100: 00010001 b1000020 80470001 a0e20000
<3>[    0.925681] .(5)[1:swapper/0]ffffff800b3fa110: 00000002 b1620010 00000000 a0c10002
<3>[    0.925686] .(5)[1:swapper/0]ffffff800b3fa120: 0002801c b1610030 fffdb7ff 02000000
<3>[    0.925691] .(5)[1:swapper/0]ffffff800b3fa130: 102380d0 a0800000 00000000 91800000
<3>[    0.925696] .(5)[1:swapper/0]ffffff800b3fa140: 200001e5 a080804b 00010001 b1000010
<3>[    0.925701] .(5)[1:swapper/0]ffffff800b3fa150: 200003cd a080804b 804b0000 a0c10003
<3>[    0.925706] .(5)[1:swapper/0]ffffff800b3fa160: 00000000 40000000 fffffe98 10000000
<5>[    0.925708] .(5)[1:swapper/0][CMDQ]======REC 0xffffff800b3fa000 command buffer END
<5>[    0.925712] .(5)[1:swapper/0][CMDQ]REC 0xffffff800b3fa000 command buffer TRANSLATED:
<5>[    0.925725] .(5)[1:swapper/0][CMDQ]Wait And Clear Event: CMDQ_SYNC_TOKEN_TIMER
<5>[    0.925729] .(5)[1:swapper/0][CMDQ]Set MASK: 0xfffdb7ff
<5>[    0.925733] .(5)[1:swapper/0][CMDQ]LOGIC: Reg0 = 0x102380d0
<5>[    0.925739] .(5)[1:swapper/0][CMDQ]WRITE_S with mask: 0x00024800, Reg0, use_mask=1
<5>[    0.925742] .(5)[1:swapper/0][CMDQ]LOGIC: Reg2 = 0xffffffff
<5>[    0.925746] .(5)[1:swapper/0][CMDQ]LOGIC: Reg32796 = 0xffffffff
<5>[    0.925752] .(5)[1:swapper/0][CMDQ]JUMP_C related: if (Reg32833 <= 0) jump +80
<5>[    0.925757] .(5)[1:swapper/0][CMDQ]LOGIC: Reg1 = Reg56 - Reg32832
<5>[    0.925761] .(5)[1:swapper/0][CMDQ]JUMP_C related: if (Reg1 < Reg32833) jump +40
<5>[    0.925768] .(5)[1:swapper/0][CMDQ]Set Event: CMDQ_SYNC_TOKEN_DELAY_SET0
<5>[    0.925772] .(5)[1:swapper/0][CMDQ]LOGIC: Reg32833 = 0x00000000
<5>[    0.925776] .(5)[1:swapper/0][CMDQ]LOGIC: Reg32834 = Reg32796 + 0
<5>[    0.925780] .(5)[1:swapper/0][CMDQ]JUMP_C related: if (1 == 1) jump +32
<5>[    0.925785] .(5)[1:swapper/0][CMDQ]LOGIC: Reg0 = Reg32833 - Reg1
<5>[    0.925789] .(5)[1:swapper/0][CMDQ]JUMP_C related: if (Reg0 >= Reg2) jump +16
<5>[    0.925793] .(5)[1:swapper/0][CMDQ]LOGIC: Reg2 = Reg0 + 0
<5>[    0.925797] .(5)[1:swapper/0][CMDQ]JUMP_C related: if (Reg32836 <= 0) jump +80
<5>[    0.925801] .(5)[1:swapper/0][CMDQ]LOGIC: Reg1 = Reg56 - Reg32835
<5>[    0.925805] .(5)[1:swapper/0][CMDQ]JUMP_C related: if (Reg1 < Reg32836) jump +40
<5>[    0.925812] .(5)[1:swapper/0][CMDQ]Set Event: CMDQ_SYNC_TOKEN_DELAY_SET1
<5>[    0.925816] .(5)[1:swapper/0][CMDQ]LOGIC: Reg32836 = 0x00000000
<5>[    0.925820] .(5)[1:swapper/0][CMDQ]LOGIC: Reg32837 = Reg32796 + 0
<5>[    0.925824] .(5)[1:swapper/0][CMDQ]JUMP_C related: if (1 == 1) jump +32
<5>[    0.925828] .(5)[1:swapper/0][CMDQ]LOGIC: Reg0 = Reg32836 - Reg1
<5>[    0.925832] .(5)[1:swapper/0][CMDQ]JUMP_C related: if (Reg0 >= Reg2) jump +16
<5>[    0.925836] .(5)[1:swapper/0][CMDQ]LOGIC: Reg2 = Reg0 + 0
<5>[    0.925841] .(5)[1:swapper/0][CMDQ]JUMP_C related: if (Reg32839 <= 0) jump +80
<5>[    0.925845] .(5)[1:swapper/0][CMDQ]LOGIC: Reg1 = Reg56 - Reg32838
<5>[    0.925849] .(5)[1:swapper/0][CMDQ]JUMP_C related: if (Reg1 < Reg32839) jump +40
<5>[    0.925856] .(5)[1:swapper/0][CMDQ]Set Event: CMDQ_SYNC_TOKEN_DELAY_SET2
<5>[    0.925861] .(5)[1:swapper/0][CMDQ]LOGIC: Reg32839 = 0x00000000
<5>[    0.925865] .(5)[1:swapper/0][CMDQ]LOGIC: Reg32840 = Reg32796 + 0
<5>[    0.925869] .(5)[1:swapper/0][CMDQ]JUMP_C related: if (1 == 1) jump +32
<5>[    0.925873] .(5)[1:swapper/0][CMDQ]LOGIC: Reg0 = Reg32839 - Reg1
<5>[    0.925877] .(5)[1:swapper/0][CMDQ]JUMP_C related: if (Reg0 >= Reg2) jump +16
<5>[    0.925883] .(5)[1:swapper/0][CMDQ]LOGIC: Reg2 = Reg0 + 0
<5>[    0.925888] .(5)[1:swapper/0][CMDQ]JUMP_C related: if (Reg2 != Reg32796) jump +48
<5>[    0.925891] .(5)[1:swapper/0][CMDQ]Set MASK: 0xfffdb7ff
<5>[    0.925894] .(5)[1:swapper/0][CMDQ]LOGIC: Reg0 = 0x102380d0
<5>[    0.925898] .(5)[1:swapper/0][CMDQ]WRITE_S with mask: 0x00000000, Reg0, use_mask=1
<5>[    0.925902] .(5)[1:swapper/0][CMDQ]LOGIC: Reg32843 = 0x200001e5
<5>[    0.925906] .(5)[1:swapper/0][CMDQ]JUMP_C related: if (1 == 1) jump +16
<5>[    0.925910] .(5)[1:swapper/0][CMDQ]LOGIC: Reg32843 = 0x200003cd
<5>[    0.925914] .(5)[1:swapper/0][CMDQ]LOGIC: Reg3 = Reg32843 + 0
<5>[    0.925919] .(5)[1:swapper/0][CMDQ]MARKER: sync_no_suspnd=0no_suspnd=0, no_inc=0, m=0, m_en=0, prefetch=0, irq=0
<5>[    0.925922] .(5)[1:swapper/0][CMDQ]JUMP(relative): -360
<5>[    0.925926] .(5)[1:swapper/0][CMDQ]======REC 0xffffff800b3fa000 command END
<5>[    0.925949] .(5)[1:swapper/0][CMDQ][DelayThread]sram task size:368 free:1880
<5>[    0.925956] .(5)[1:swapper/0][CMDQ][DelayThread]create delay thread task in SRAM task size:368 sram size:1880
<4>[    0.926964] .(4)[170:init_decouple_b]init_decouple_buffers done
<3>[    0.928219] .(5)[1:swapper/0][GAMMA] disp_gamma_write_lut_reg: gamma table [0] not initialized
<3>[    0.928219] 
<5>[    1.012654] -(4)[6:kworker/u16:0][MUSB]musb_hub_control 352: port status 00000100
<6>[    1.012784] .(5)[85:kworker/5:1]usb usb1: usb_set_device_state 7->8
<4>[    1.082402] .(5)[1:swapper/0][TKCORE] 33654]: <0>MSG TKCore:start_devapc:210: DEVAPC already inited in ATF
<4>[    1.082402] [    5.234573]: <0>INF TKCore:init_teecore:109: teecore inits done
<4>[    1.082402] [    5.237911]: <0>INF TKCore:parse_cert:531: projectid: 1749
<4>[    1.082402] [    5.238694]: <0>MSG TKCore:htfat_early_init:1004: Veri
<3>[    1.082612] .(5)[1:swapper/0][ION]ion_drv_create_heap: create heap: ion_fb_heap
<3>[    1.082640] .(5)[1:swapper/0]BOOTPROF:      1082.639848:probe: probe=platform_drv_probe drv=mtkfb(ffffff800967b6d8)   160.436077ms
<3>[    1.083634] .(0)[1:swapper/0]BOOTPROF:      1083.633925:initcall: mtkfb_init   161.772155ms
<6>[    1.084729] .(1)[1:swapper/0][DFRC] start to initialize fps policy
<6>[    1.084734] .(1)[1:swapper/0][DFRC] register fps policy device
<6>[    1.084857] .(1)[1:swapper/0][DFRC] register fps policy driver
<6>[    1.085382] .(1)[1:swapper/0][DFRC] dfrc_init_kernel_policy
<6>[    1.085391] .(1)[1:swapper/0][DFRC] reg_fps_policy: reg policy[3]
<6>[    1.085398] .(1)[1:swapper/0][DFRC] reg_fps_policy: reg policy[2]
<6>[    1.085405] .(1)[1:swapper/0][DFRC] reg_fps_policy: reg policy[4]
<6>[    1.085411] .(1)[1:swapper/0][DFRC] reg_fps_policy: reg policy[5]
<1>[    1.089429] .(1)[1:swapper/0][MALI] Alloc mtk_config
<6>[    1.090016] .(1)[1:swapper/0]mali 13040000.mali: Continuing without Mali regulator control
<6>[    1.090027] .(1)[1:swapper/0]mali 13040000.mali: Continuing without Mali clock control
<6>[    1.090570] .(1)[1:swapper/0]mali 13040000.mali: GPU identified as 0x0 arch 6.0.10 r0p0 status 2
<6>[    1.092305] .(0)[1:swapper/0]mali 13040000.mali: Probed as mali0
<6>[    1.095490] [ISP][ISP_Init] - E.<6>[    1.096954] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.096979] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=1, devnode(imgsys), map_addr=0xffffff800bea6000
<6>[    1.096989] .(0)[1:swapper/0][ISP][ISP_probe] No IRQ!!: nr_isp_devs=1, devnode(imgsys), irq=0
<6>[    1.096994] .(0)[1:swapper/0][ISP][ISP_RegCharDev] - E.
<6>[    1.097002] .(0)[1:swapper/0][ISP][ISP_RegCharDev] - X.
<6>[    1.097846] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.097889] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.097901] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=2, devnode(dip1), map_addr=0xffffff800bea8000
<6>[    1.097925] .(0)[1:swapper/0][ISP][ISP_probe] No corresponding ISR!!: nr_isp_devs=2, devnode(dip1), irq=129
<6>[    1.097931] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.098029] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.098080] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=3, devnode(camsys), map_addr=0xffffff800beac000
<6>[    1.098087] .(0)[1:swapper/0][ISP][ISP_probe] No IRQ!!: nr_isp_devs=3, devnode(camsys), irq=0
<6>[    1.098091] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.098128] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.098139] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=4, devnode(cam1), map_addr=0xffffff800beae000
<6>[    1.098154] .(0)[1:swapper/0][ISP][ISP_probe] No corresponding ISR!!: nr_isp_devs=4, devnode(cam1), irq=132
<6>[    1.098159] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.098189] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.098199] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=5, devnode(cam2), map_addr=0xffffff800beb0000
<6>[    1.098251] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=5, devnode(cam2), irq=133, ISR: cam2
<6>[    1.098256] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.098292] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.098304] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=6, devnode(cam3), map_addr=0xffffff800beb2000
<6>[    1.098345] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=6, devnode(cam3), irq=134, ISR: cam3
<6>[    1.098350] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.098406] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.098417] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=7, devnode(camsv1), map_addr=0xffffff800beb4000
<6>[    1.098455] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=7, devnode(camsv1), irq=137, ISR: camsv1
<6>[    1.098460] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.098492] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.098502] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=8, devnode(camsv2), map_addr=0xffffff800beb6000
<6>[    1.098540] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=8, devnode(camsv2), irq=138, ISR: camsv2
<6>[    1.098545] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.098576] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.098586] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=9, devnode(camsv3), map_addr=0xffffff800beb8000
<6>[    1.098627] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=9, devnode(camsv3), irq=139, ISR: camsv3
<6>[    1.098632] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.098663] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.098674] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=10, devnode(camsv4), map_addr=0xffffff800beba000
<6>[    1.098711] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=10, devnode(camsv4), irq=140, ISR: camsv4
<6>[    1.098717] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.098748] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.098762] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=11, devnode(camsv5), map_addr=0xffffff800bebc000
<6>[    1.098769] .(0)[1:swapper/0][ISP][ISP_probe] No IRQ!!: nr_isp_devs=11, devnode(camsv5), irq=0
<6>[    1.098773] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.098804] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.098814] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=12, devnode(camsv6), map_addr=0xffffff800bebe000
<6>[    1.098821] .(0)[1:swapper/0][ISP][ISP_probe] No IRQ!!: nr_isp_devs=12, devnode(camsv6), irq=0
<6>[    1.098825] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.100255] .(0)[1:swapper/0][ISP][ISP_Init] Finding SMI_LARB compatible: mediatek,smi_larb0
<6>[    1.100555] .(0)[1:swapper/0][ISP][ISP_Init] SMI_LARB0_BASE: ffffff800bec0000
<6>[    1.100562] .(0)[1:swapper/0][ISP][ISP_Init] Finding SMI_LARB compatible: mediatek,smi_larb1
<6>[    1.100790] .(0)[1:swapper/0][ISP][ISP_Init] SMI_LARB1_BASE: ffffff800bec2000
<6>[    1.100796] .(0)[1:swapper/0][ISP][ISP_Init] Finding SMI_LARB compatible: mediatek,smi_larb2
<6>[    1.100992] .(0)[1:swapper/0][ISP][ISP_Init] SMI_LARB2_BASE: ffffff800bec4000
<6>[    1.100998] .(0)[1:swapper/0][ISP][ISP_Init] Finding SMI_LARB compatible: mediatek,smi_larb3
<6>[    1.101180] .(0)[1:swapper/0][ISP][ISP_Init] SMI_LARB3_BASE: ffffff800bec6000
<6>[    1.101185] .(0)[1:swapper/0][ISP][ISP_Init] Finding SMI_LARB compatible: mediatek,smi_larb4
<3>[    1.101644] .(0)[1:swapper/0][ISP][ISP_Init] find mediatek,smi_larb4 node failed!!!
<6>[    1.101649] .(0)[1:swapper/0][ISP][ISP_Init] Finding SMI_LARB compatible: mediatek,smi_larb5
<3>[    1.101992] .(0)[1:swapper/0][ISP][ISP_Init] find mediatek,smi_larb5 node failed!!!
<6>[    1.101997] .(0)[1:swapper/0][ISP][ISP_Init] Finding SMI_LARB compatible: mediatek,smi_larb6
<3>[    1.102317] .(0)[1:swapper/0][ISP][ISP_Init] find mediatek,smi_larb6 node failed!!!
<6>[    1.102322] .(0)[1:swapper/0][ISP][ISP_Init] Finding SMI_LARB compatible: mediatek,smi_larb7
<3>[    1.102643] .(0)[1:swapper/0][ISP][ISP_Init] find mediatek,smi_larb7 node failed!!!
<6>[    1.102844] .(0)[1:swapper/0][ISP][ISP_Init] ISP_SENINF0_BASE: ffffff800bec8000
<6>[    1.103044] .(0)[1:swapper/0][ISP][ISP_Init] ISP_SENINF1_BASE: ffffff800beca000
<6>[    1.103243] .(0)[1:swapper/0][ISP][ISP_Init] ISP_SENINF2_BASE: ffffff800becc000
<6>[    1.103443] .(0)[1:swapper/0][ISP][ISP_Init] ISP_SENINF3_BASE: ffffff800bece000
<6>[    1.103532] .(0)[1:swapper/0][ISP][ISP_Init] CLOCK_CELL_BASE: ffffff800bed0000
<6>[    1.103686] .(0)[1:swapper/0][ISP][ISP_Init] ISP_MMSYS_CONFIG_BASE: ffffff800bed2000
<6>[    1.103865] [ISP][ISP_Init] register isp callback for MDP[ISP][ISP_Init] register isp callback for GCE[ISP][ISP_Init] init m_LastMNum[ISP][ISP_Init] - X. Ret: 0.<6>[    1.105698] .(0)[1:swapper/0]FDVT [FDVT_probe] FDVT PROBE!!!
<6>[    1.105717] .(0)[1:swapper/0]FDVT [FDVT_probe] DT, i=0, map_addr=0xffffff800bed6000
<6>[    1.105779] .(0)[1:swapper/0]FDVT [FDVT_probe] DT, i=0, map_irq=130
<4>[    1.108570] .(0)[1:swapper/0]kd_camera_hw supply vcamd_sub not found, using dummy regulator
<4>[    1.108792] .(0)[1:swapper/0]kd_camera_hw supply vcamd_main2 not found, using dummy regulator
<4>[    1.108910] .(0)[1:swapper/0]kd_camera_hw supply vcama_sub2 not found, using dummy regulator
<4>[    1.108961] .(0)[1:swapper/0]kd_camera_hw supply vcamd_sub2 not found, using dummy regulator
<4>[    1.109011] .(0)[1:swapper/0]kd_camera_hw supply vcamio_sub2 not found, using dummy regulator
<3>[    1.109729] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcama_1
<3>[    1.109736] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcama_0
<3>[    1.109740] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcamd_1
<3>[    1.109745] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcamd_0
<3>[    1.109749] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcamio_1
<3>[    1.109754] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcamio_0
<3>[    1.109758] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcamaf_1
<3>[    1.109762] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcamaf_0
<3>[    1.109773] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_main2_vcamd_1
<3>[    1.109777] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_main2_vcamd_0
<3>[    1.109782] .(0)[1:swapper/0]gpio_init : pinctrl err, cam3_pnd1
<3>[    1.109786] .(0)[1:swapper/0]gpio_init : pinctrl err, cam3_pnd0
<3>[    1.109791] .(0)[1:swapper/0]gpio_init : pinctrl err, cam3_rst1
<3>[    1.109795] .(0)[1:swapper/0]gpio_init : pinctrl err, cam3_rst0
<3>[    1.109799] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_sub2_vcamd_1
<3>[    1.109804] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_sub2_vcamd_0
<3>[    1.109808] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_mipi_switch_en_1
<3>[    1.109812] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_mipi_switch_en_0
<3>[    1.109816] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_mipi_switch_sel_1
<3>[    1.109821] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_mipi_switch_sel_0
<3>[    1.109845] .(0)[1:swapper/0]mclk_init : pinctrl err, cam0_mclk_on
<3>[    1.109858] .(0)[1:swapper/0]mclk_init : pinctrl err, cam1_mclk_on
<3>[    1.109866] .(0)[1:swapper/0]mclk_init : pinctrl err, (null)
<3>[    1.109870] .(0)[1:swapper/0]mclk_init : pinctrl err, (null)
<6>[    1.113593] .(0)[1:swapper/0][register_low_battery_notify] prio_val=5
<6>[    1.113600] .(0)[1:swapper/0][register_battery_percent_notify] prio_val=5
<6>[    1.113605] .(0)[1:swapper/0][register_battery_oc_notify] prio_val=5
<6>[    1.114926] .(1)[1:swapper/0][ccu][ccu_probe] ccu probe cuccess...
<5>[    1.115979] .(1)[1:swapper/0][ccci1/mcd]gpio pinctrl is not ready yet, use workaround.
<6>[    1.127117] .(1)[1:swapper/0][ccci0/rpc]get_md_dtsi_val 1, mediatek,md_drdi_rf_set_idx -- 0xf0f0f0f
<5>[    1.127276] .(1)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    1.127325] .(1)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    1.127372] .(1)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    1.127419] .(1)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    1.127467] .(1)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    1.127514] .(1)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    1.127561] .(1)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    1.127609] .(1)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    1.127656] .(1)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<3>[    1.128389] .(1)[1:swapper/0][CONN-MD-DFT][W]conn_md_add_user:uid (0x00000005) is added to user list successfully
<5>[    1.129429] .(1)[1:swapper/0][ccci1/sys]swtp_init can't find compatible node
<3>[    1.131314] .(1)[1:swapper/0]BOOTPROF:      1131.313848:initcall: modem_cd_init    15.785230ms
<5>[    1.135581] .(0)[1:swapper/0][Thermal/TZ/BTS] mtkts_bts_prepare_table table_num=7
<5>[    1.135602] .(0)[1:swapper/0][Thermal/TZ/BTSMDPA] mtkts_btsmdpa_prepare_table table_num=7
<4>[    1.135629] .(0)[1:swapper/0][Thermal/TZ/CPU]tscpu_init
<4>[    1.136037] .(0)[1:swapper/0][Thermal/TZ/CPU]thermal_prob
<3>[    1.136680] .(0)[1:swapper/0][calibration] temp0=0xa5dea18a, temp1=0x31b855b, temp2=0xbfe1f000
<3>[    1.136689] .(0)[1:swapper/0][lvts_cal] 0: 0x0, 1: 0x0, 2: 0x0
<4>[    1.136694] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] g_adc_ge_t      = 663
<4>[    1.136697] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] g_adc_oe_t      = 490
<4>[    1.136701] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] g_degc_cali     = 45
<4>[    1.136705] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] g_adc_cali_en_t = 1
<4>[    1.136708] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_slope       = 0
<4>[    1.136711] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_slope_sign  = 0
<4>[    1.136715] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] g_id            = 0
<4>[    1.136718] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_vtsmcu1     = 397
<4>[    1.136722] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_vtsmcu2     = 389
<4>[    1.136725] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_vtsmcu3     = 394
<4>[    1.136729] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_vtsmcu4     = 383
<4>[    1.136732] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_vtsmcu5     = 384
<4>[    1.136736] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_vtsabb      = 391
<4>[    1.136739] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] lvts_count1_b30c=  0
<4>[    1.136742] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] lvts_count2_b30c=  0
<4>[    1.136746] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] lvts_count3_b30c=  0
<4>[    1.136749] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] lvts_golden_temp1= 0
<4>[    1.136753] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] lvts_golden_temp2= 0
<4>[    1.136756] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] lvts_golden_temp3= 0
<4>[    1.136760] .(0)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_ge         = 368
<4>[    1.136763] .(0)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_gain       = 10368
<4>[    1.136767] .(0)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_x_roomt0   = 8874
<4>[    1.136771] .(0)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_x_roomt1   = 8856
<4>[    1.136774] .(0)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_x_roomt2   = 8867
<4>[    1.136778] .(0)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_x_roomt3   = 8841
<4>[    1.136782] .(0)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_x_roomt4   = 8843
<4>[    1.136785] .(0)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_x_roomt5   = 8860
<4>[    1.137057] -(0)[1:swapper/0][Thermal/TZ/CPU]Driver is NOT ready to report valid temperatures
<6>[    1.138340] .(0)[1:swapper/0][Thermal/TZ/PMIC] [mtktspmic_init]
<6>[    1.138345] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug]  start
<6>[    1.138380] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_vts        = 1601
<6>[    1.138384] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_vts_2      = 1581
<6>[    1.138388] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_vts_3      = 1584
<6>[    1.138391] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_degc_cali    = 48
<6>[    1.138395] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_adc_cali_en  = 1
<6>[    1.138398] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_slope      = 0
<6>[    1.138402] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_slope_sign = 0
<6>[    1.138406] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_id		   = 0
<6>[    1.138409] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug]  end
<6>[    1.138412] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts        = 0x641
<6>[    1.138416] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts_2      = 0x62d
<6>[    1.138419] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts_3      = 0x630
<6>[    1.138423] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_degc_cali    = 0x30
<6>[    1.138426] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_adc_cali_en  = 0x1
<6>[    1.138430] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_slope      = 0x0
<6>[    1.138433] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_slope_sign = 0x0
<6>[    1.138437] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_id           = 0x0
<6>[    1.138440] .(0)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1681 INTERCEPT=442203, Vbe = -703000
<6>[    1.138446] .(0)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1863 INTERCEPT=396517, Vbe = -694000
<6>[    1.138451] .(0)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1863 INTERCEPT=397590, Vbe = -696000
<6>[    1.140579] .(0)[1:swapper/0][W]mtk_wcn_cmb_stub_query_ctrl:Thermal query not registered
<3>[    1.140655] .(0)[1:swapper/0][Thermal/TZ/IMGS][mtk_imgs_init]
<4>[    1.143428] .(1)[1:swapper/0][Thermal/TZ/CPU]tscpu_bind binding OK, 3
<4>[    1.143815] .(1)[1:swapper/0][Thermal/TZ/CPU]tscpu_bind binding OK, 1
<4>[    1.144062] .(1)[1:swapper/0][Thermal/TZ/CPU]tscpu_bind binding OK, 2
<4>[    1.146247] .(1)[1:swapper/0][Thermal/TZ/CPU]tscpu_bind binding OK, 0
<3>[    1.146418] .(1)[1:swapper/0][Cooler_NR]mtk_cooler_NR_init 208
<3>[    1.146500] .(1)[1:swapper/0][Cooler_NR]mtk_cooler_NR_init 226
<6>[    1.146587] .(1)[1:swapper/0][Thermal/TZ/PMIC] [mt6356tsbuck1_init]
<6>[    1.146591] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug]  start
<6>[    1.146626] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_vts        = 1601
<6>[    1.146630] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_vts_2      = 1581
<6>[    1.146634] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_vts_3      = 1584
<6>[    1.146637] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_degc_cali    = 48
<6>[    1.146641] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_adc_cali_en  = 1
<6>[    1.146645] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_slope      = 0
<6>[    1.146648] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_slope_sign = 0
<6>[    1.146651] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_id		   = 0
<6>[    1.146655] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug]  end
<6>[    1.146658] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts        = 0x641
<6>[    1.146661] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts_2      = 0x62d
<6>[    1.146665] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts_3      = 0x630
<6>[    1.146668] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_degc_cali    = 0x30
<6>[    1.146672] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_adc_cali_en  = 0x1
<6>[    1.146675] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_slope      = 0x0
<6>[    1.146679] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_slope_sign = 0x0
<6>[    1.146682] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_id           = 0x0
<6>[    1.146686] .(1)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1681 INTERCEPT=442203, Vbe = -703000
<6>[    1.146691] .(1)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1863 INTERCEPT=396517, Vbe = -694000
<6>[    1.146696] .(1)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1863 INTERCEPT=397590, Vbe = -696000
<6>[    1.148571] .(1)[1:swapper/0][Thermal/TZ/PMIC] [mt6356tsbuck2_init]
<6>[    1.148576] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug]  start
<6>[    1.148624] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_vts        = 1601
<6>[    1.148629] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_vts_2      = 1581
<6>[    1.148633] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_vts_3      = 1584
<6>[    1.148636] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_degc_cali    = 48
<6>[    1.148640] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_adc_cali_en  = 1
<6>[    1.148643] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_slope      = 0
<6>[    1.148646] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_slope_sign = 0
<6>[    1.148650] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_id		   = 0
<6>[    1.148653] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug]  end
<6>[    1.148656] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts        = 0x641
<6>[    1.148659] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts_2      = 0x62d
<6>[    1.148663] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts_3      = 0x630
<6>[    1.148666] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_degc_cali    = 0x30
<6>[    1.148669] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_adc_cali_en  = 0x1
<6>[    1.148673] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_slope      = 0x0
<6>[    1.148676] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_slope_sign = 0x0
<6>[    1.148679] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_id           = 0x0
<6>[    1.148683] .(1)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1681 INTERCEPT=442203, Vbe = -703000
<6>[    1.148688] .(1)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1863 INTERCEPT=396517, Vbe = -694000
<6>[    1.148693] .(1)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1863 INTERCEPT=397590, Vbe = -696000
<5>[    1.151805] .(2)[1:swapper/0]mrdump_key_init:MRDUMP_KEY node mediatek, mrdump_ext_rst-eint is not exist
<5>[    1.151805] MRDUMP_KEY is disabled
<6>[    1.151851] .(2)[1:swapper/0]mrdump_sysfs_init: done.
<5>[    1.152058] atf_log: inited<5>[    1.152327] .(2)[1:swapper/0]ATF reserved memory: 0xeff00000 - 0xeff3ffff (0x40000)
<5>[    1.152347] .(2)[1:swapper/0]atf_buf_phy_ctl: 0xeff00000
<5>[    1.152351] .(2)[1:swapper/0]atf_buf_len: 262144
<5>[    1.152355] .(2)[1:swapper/0]atf_buf_vir_ctl: ffffff800bf0e000
<5>[    1.152358] .(2)[1:swapper/0]atf_log_vir_addr: ffffff800bf20100
<5>[    1.152362] .(2)[1:swapper/0]atf_log_len: 81664
<5>[    1.152398] .(2)[1:swapper/0]atf irq num 21.
<5>[    1.152541] atf_time_sync: inited<6>[    1.153778] .(2)[1:swapper/0]SSPM platform service is ready
<4>[    1.154758] .(2)[1:swapper/0]USB_BOOST, <test_loops(), 346> id<-1>, loops:100000, spent 0 sec, 962 usec
<4>[    1.155898] .(2)[1:swapper/0]USB_BOOST, <test_loops(), 346> id<0>, loops:100000, spent 0 sec, 1132 usec
<4>[    1.157198] .(2)[1:swapper/0]USB_BOOST, <test_loops(), 346> id<1>, loops:100000, spent 0 sec, 1150 usec
<4>[    1.158435] .(2)[1:swapper/0]USB_BOOST, <test_loops(), 346> id<2>, loops:100000, spent 0 sec, 1132 usec
<4>[    1.158537] .(2)[1:swapper/0]USB_BOOST, <create_sys_fs(), 514> 
<4>[    1.158805] .(2)[1:swapper/0]USB_BOOST, <usb_boost_set_para_and_arg(), 146> para_range:<4>
<4>[    1.158810] .(2)[1:swapper/0]USB_BOOST, <usb_boost_set_para_and_arg(), 146> para_range:<4>
<4>[    1.158815] .(2)[1:swapper/0]USB_BOOST, <usb_boost_set_para_and_arg(), 146> para_range:<4>
<4>[    1.158819] .(2)[1:swapper/0]USB_BOOST, <usb_boost_set_para_and_arg(), 146> para_range:<4>
<4>[    1.158824] .(2)[1:swapper/0]USB_BOOST, <usb_boost_set_para_and_arg(), 146> para_range:<4>
<4>[    1.158828] .(2)[1:swapper/0]USB_BOOST, <usb_boost_set_para_and_arg(), 146> para_range:<4>
<4>[    1.158862] .(2)[1:swapper/0]SLhall_mod_init begin!
<4>[    1.159033] .(2)[1:swapper/0]register slhall device
<4>[    1.159037] .(2)[1:swapper/0]platform_device_slhall_register done!
<4>[    1.159525] .(2)[1:swapper/0]SLhall_probe begin!
<6>[    1.159687] .(2)[1:swapper/0]input: scan-keys as /devices/virtual/input/input1
<4>[    1.159698] .(2)[1:swapper/0][hall]kpd_hall_dev register : success!!
<4>[    1.159756] .(2)[1:swapper/0]SLhall switch_dev_register OK! 
<4>[    1.159782] .(2)[1:swapper/0]SLhall_probe : SLhall_INIT
<4>[    1.160092] .(2)[1:swapper/0]SLhall_probe done!
<4>[    1.160120] .(2)[1:swapper/0]SLhall platform_driver_register done!
<4>[    1.160123] .(2)[1:swapper/0]SLhall_mod_init done!
<3>[    1.160590] .(2)[1:swapper/0]sys_timer 10017000.sys_timer: invalid resource
<6>[    1.160616] .(2)[1:swapper/0]unable to ioremap sysram base, might be disabled
<6>[    1.160621] .(2)[1:swapper/0]mult=161319385, shift=21, maxsec=5000
<6>[    1.160629] .(2)[1:swapper/0]enabled: 1, support_sysram: 0
<4>[    1.161549] .(2)[1:swapper/0]===aw9523 driver version v1.0.0
<4>[    1.161592] .(2)[1:swapper/0]aw9523_i2c_init end 
<4>[    1.162220] .(2)[1:swapper/0]stm32 Initialization : DONE !!
<6>[    1.162642] factory_data_probe+++factory_data_probe---wakeup_management_probe+++wakeup_management_probe---config_data_probe+++<6>[    1.163969] .(2)[1:swapper/0][E][Factory Data](jprkernel_config_read_from_storage): filp_open fail, error code: -2
<6>[    1.163975] .(2)[1:swapper/0][E][Factory Data](read_config_partition): Error
<6>[    1.163979] [E][Factory Data](jprkernel_config_fatal_error_handler): CONFIG DATA FATAL ERROR!<6>[    1.163982] .(2)[1:swapper/0][E][Factory Data](_get_config_item): read_config_partition Error
<6>[    1.163986] .(2)[1:swapper/0][E][Factory Data](_get_config_item): Error
<6>[    1.163989] .(2)[1:swapper/0][E][Factory Data](_config_get_value): [id=21,index=0] Item is NULL
<6>[    1.163994] .(2)[1:swapper/0]config_data_probe--- value=-128 
<3>[    1.163997] [config_data_probe]cmdline=console=tty0 console=ttyMT0,921600n1 root=/dev/ram vmalloc=496M slub_max_order=0 slub_debug=OFZPU androidboot.hardware=mt6763 maxcpus=8 firmware_class.path=/vendor/firmware has_battery_removed=0 androidboot.verifiedbootstate=orange bootopt=64S3,32N2,64N2 buildvariant=user androidboot.veritymode=enforcing androidboot.atm=disabled androidboot.meta_log_disable=0 printk.disable_uart=0 bootprof.pl_t=4633 bootprof.lk_t=7367 bootprof.logo_t=1226 boot_reason=4 androidboot.serialno=S19F00013 androidboot.secureboot=49 androidboot.specialid=0 dlconfig_tof_offset=0 dlconfig_tof_x_talk=0 config_data_tof_offset_cali_flag=0 config_data_tof_xtalk_cali_flag=0 config_data_cp_index=0 config_data_charge_current=0 config_data_charge_termination_current=0 config_data_charge_voltage=0 config_data_recharge_threshold=0 config_data_precharge_current=0 config_data_pid_target_temperature=0 config_data_battery_profile_id=0 cmdline_power_on_flag=1 power_key_flag=0 power_on_thre<3>[    1.164029] .(2)[1:swapper/0]cmdline_tof_offset=0
<3>[    1.164052] .(2)[1:swapper/0]cmdline_tof_x_talk=0
<4>[    1.164185] .(2)[1:swapper/0]cmdline_tof_offset_flag = 0 ,cmdline_tof_x_talk_flag = 0
<4>[    1.164221] .(2)[1:swapper/0][func_nv_uint2int] ret=0
<4>[    1.164224] .(2)[1:swapper/0]g_audio_check_test.value = 0 
<4>[    1.164264] .(2)[1:swapper/0]g_smart_reset = 0 
<4>[    1.164301] .(2)[1:swapper/0]cmdline_offset_cali_auxiliary = 0 
<4>[    1.164337] .(2)[1:swapper/0]cmdline_xtalk_cali_auxiliary = 0 
<4>[    1.164373] .(2)[1:swapper/0]cmdline_pos_or_neg_num = 0 
<4>[    1.164411] .(2)[1:swapper/0]proinfo_stress_test_enable.value = 0 
<4>[    1.164414] hehai xxx get_cali_val_from_partition_after_reboot cmdline_offset_cali_auxiliary = 0 ,cmdline_xtalk_cali_auxiliary = 0factory_ext_data_probe+++factory_ext_data_probe---<6>[    1.165765] -(1)[0:swapper/1][DEVAPC] INFRA VIO_STA 0:0x0 1:0x0 2:0x80000000 3:0x0 4:0x0 5:0x0 6:0x0 7:0x0 8:0x0 9:0x4100
<6>[    1.165776] -(1)[0:swapper/1][DEVAPC] VIO_SHIFT_STA: 0x20
<6>[    1.165783] -(1)[0:swapper/1][DEVAPC] Syncing INFRA DBG0 & DBG1 (5, 0)
<6>[    1.165787] -(1)[0:swapper/1][DEVAPC] Syncing INFRA DBG0 & DBG1 (5, 1)
<6>[    1.165792] -(1)[0:swapper/1][DEVAPC] Sync INFRA DBG0 & DBG1 (5) SUCCESS
<6>[    1.165797] -(1)[0:swapper/1][DEVAPC] Violation(Infra,R ) - Process:swapper/1, PID:0, Vio Addr:0x1100a018 (High:0x0), Bus ID:0xa3, Dom ID:0x0
<6>[    1.165837] -(1)[0:swapper/1][DEVAPC] Access Violation Slave: PERISYS_SPI0 (infra index=95)
<6>[    1.165922] .(2)[1:swapper/0]mt-spi 1100a000.spi: master is unqueued, this is deprecated
<6>[    1.166182] .(2)[1:swapper/0]mt-spi 11010000.spi: master is unqueued, this is deprecated
<6>[    1.166430] .(2)[1:swapper/0]mt-spi 11012000.spi: master is unqueued, this is deprecated
<6>[    1.166675] .(2)[1:swapper/0]mt-spi 11013000.spi: master is unqueued, this is deprecated
<6>[    1.166919] .(2)[1:swapper/0]mt-spi 11018000.spi: master is unqueued, this is deprecated
<6>[    1.167163] .(2)[1:swapper/0]mt-spi 11019000.spi: master is unqueued, this is deprecated
<6>[    1.169751] .(2)[1:swapper/0]tun: Universal TUN/TAP device driver, 1.6
<6>[    1.169757] .(2)[1:swapper/0]tun: (C) 1999-2004 Max Krasnyansky <maxk@qualcomm.com>
<6>[    1.169835] .(2)[1:swapper/0]PPP generic driver version 2.4.2
<6>[    1.169936] .(2)[1:swapper/0]PPP BSD Compression module registered
<6>[    1.169946] .(2)[1:swapper/0]PPP Deflate Compression module registered
<6>[    1.169970] .(2)[1:swapper/0]PPP MPPE Compression module registered
<6>[    1.169985] .(2)[1:swapper/0]NET: Registered protocol family 24
<6>[    1.170095] .(2)[1:swapper/0]usbcore: registered new interface driver rtl8150
<6>[    1.170144] .(2)[1:swapper/0]usbcore: registered new interface driver r8152
<6>[    1.170188] .(2)[1:swapper/0]usbcore: registered new interface driver lan78xx
<6>[    1.170262] .(2)[1:swapper/0]usbcore: registered new interface driver usb-storage
<6>[    1.170302] .(2)[1:swapper/0]usbcore: registered new interface driver ums-alauda
<6>[    1.170341] .(2)[1:swapper/0]usbcore: registered new interface driver ums-cypress
<6>[    1.170380] .(2)[1:swapper/0]usbcore: registered new interface driver ums-datafab
<6>[    1.170418] .(2)[1:swapper/0]usbcore: registered new interface driver ums-freecom
<6>[    1.170460] .(2)[1:swapper/0]usbcore: registered new interface driver ums-isd200
<6>[    1.170498] .(2)[1:swapper/0]usbcore: registered new interface driver ums-jumpshot
<6>[    1.170536] .(2)[1:swapper/0]usbcore: registered new interface driver ums-karma
<6>[    1.170575] .(2)[1:swapper/0]usbcore: registered new interface driver ums-onetouch
<6>[    1.170615] .(2)[1:swapper/0]usbcore: registered new interface driver ums-sddr09
<6>[    1.170654] .(2)[1:swapper/0]usbcore: registered new interface driver ums-sddr55
<6>[    1.170692] .(2)[1:swapper/0]usbcore: registered new interface driver ums-usbat
<6>[    1.170736] .(2)[1:swapper/0]usbcore: registered new interface driver trancevibrator
<6>[    1.170799] .(2)[1:swapper/0]usb_function_register name=acm
<6>[    1.170827] .(2)[1:swapper/0]usb_function_register name=gser
<6>[    1.171095] .(2)[1:swapper/0]usb_function_register name=rndis
<6>[    1.171107] .(2)[1:swapper/0]usb_function_register name=mass_storage
<6>[    1.171116] .(2)[1:swapper/0]usb_function_register name=ffs
<6>[    1.171126] .(2)[1:swapper/0]usb_function_register name=midi
<6>[    1.171136] .(2)[1:swapper/0]usb_function_register name=hid
<6>[    1.171146] .(2)[1:swapper/0]usb_function_register name=mtp
<6>[    1.171155] .(2)[1:swapper/0]usb_function_register name=ptp
<6>[    1.171165] .(2)[1:swapper/0]usb_function_register name=audio_source
<6>[    1.171174] .(2)[1:swapper/0]usb_function_register name=accessory
<6>[    1.172110] .(2)[1:swapper/0]input: mtk-kpd as /devices/platform/10010000.kp/input/input2
<4>[    1.175592] .(2)[1:swapper/0][tpd_em_log] :register device successfully
<4>[    1.175604] .(2)[1:swapper/0]<<GTP-INF>>[tpd_driver_init:1088]  Goodix touch panel driver init.
<6>[    1.177335] .(2)[1:swapper/0]mtk-tpd: [tpd]use-tpd-button = 1
<6>[    1.177350] .(2)[1:swapper/0]mtk-tpd: [tpd]tpd-filter-enable = 1, pixel_density = 146
<6>[    1.177358] .(2)[1:swapper/0]mtk-tpd: tpd-rst-ext-gpio-num not found
<3>[    1.177439] .(2)[1:swapper/0]stmvl53l0x_init: Enter
<3>[    1.177444] .(2)[1:swapper/0]stmvl53l0x_init_i2c: Enter
<3>[    1.177484] .(2)[1:swapper/0]stmvl53l0x_init_i2c: End with rc:0
<3>[    1.177488] .(2)[1:swapper/0]stmvl53l0x_init: End
<4>[    1.177672] .(2)[1:swapper/0]Mapp dma regs successfully.
<3>[    1.177676] .(2)[1:swapper/0] mt_i2c_init driver as platform device
<6>[    1.178507] .(2)[1:swapper/0][I2C] id : 0, freq : 400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.178627] .(2)[1:swapper/0]mt-i2c 11007000.i2c: i2c0 clock source ffffffc05c293700,clock src frequency 13650000
<4>[    1.179046] .(2)[1:swapper/0]Map cg regs successfully.
<6>[    1.179101] .(2)[1:swapper/0][I2C] id : 1, freq : 400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.179197] .(2)[1:swapper/0]mt-i2c 11014000.i2c: i2c1 clock source ffffffc05c2a0500,clock src frequency 13650000
<3>[    1.179751] .(2)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11014000/irq_nfc
<3>[    1.179761] .(2)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11014000/hall_3
<3>[    1.179770] .(2)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11014000/mhall
<3>[    1.179778] .(2)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11014000/hall_2
<3>[    1.179786] .(2)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11014000/hall_1
<3>[    1.179793] .(2)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11014000/hall_4
<3>[    1.179801] .(2)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11014000/low_g
<3>[    1.179808] .(2)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11014000/wc_pmode
<3>[    1.179816] .(2)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11014000/tx_wlc
<3>[    1.180022] .(2)[1:swapper/0]stmvl53l0x_probe: Enter
<3>[    1.180029] .(2)[1:swapper/0]stmvl53l0x_parse_vdd: Enter
<4>[    1.180072] .(2)[1:swapper/0]1-0029 supply vdd not found, using dummy regulator
<3>[    1.180120] .(2)[1:swapper/0]stmvl53l0x_parse_vdd: End
<3>[    1.180124] .(2)[1:swapper/0]stmvl53l0x_setup: Enter
<3>[    1.180261] .(6)[213:STM-VL53L0]stmvl53l0x_poll_thread(818) : Starting Polling thread
<6>[    1.180386] .(5)[1:swapper/0]input: STM VL53L0 proximity sensor as /devices/virtual/input/input3
<3>[    1.180500] .(5)[1:swapper/0]stmvl53l0x_setup: Misc device registration name:1-0029
<3>[    1.180549] .(5)[1:swapper/0]stmvl53l0x_setup: support ver. 1.0.5 enabled
<3>[    1.180552] stmvl53l0x_setup: End<3>[    1.180554] .(5)[1:swapper/0]stmvl53l0x_probe: End
<4>[    1.180991] .(5)[1:swapper/0]aw9523_i2c_probe~~~~~
<6>[    1.181006] .(5)[1:swapper/0]aw9523_led 1-0059: aw9523_parse_dt: reset gpio provided ok
<3>[    1.181014] .(5)[1:swapper/0]aw9523_led 1-0059: aw9523_i2c_probe: rst request failed
<6>[    1.181017] .(5)[1:swapper/0]aw9523_hw_reset enter
<6>[    1.196828] .(0)[1:swapper/0]aw9523_read_chipid aw9523 detected
<4>[    1.196835] .(0)[1:swapper/0][bswap_led_red_on] level=0
<6>[    1.198823] .(0)[1:swapper/0]aw9523_i2c_probe probe completed successfully!
<3>[    1.198844] .(0)[1:swapper/0]BOOTPROF:      1198.844079:probe: probe=i2c_device_probe drv=aw9523_led(ffffff80096a4758)    17.843538ms
<3>[    1.198887] .(0)[1:swapper/0]BOOTPROF:      1198.886848:probe: probe=platform_drv_probe drv=mt-i2c(ffffff80096c01d0)    19.789077ms
<6>[    1.198950] .(0)[1:swapper/0][I2C] id : 2, freq : 400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.199056] .(0)[1:swapper/0]mt-i2c 11015000.i2c: i2c2 clock source ffffffc05c1c1d00,clock src frequency 13650000
<4>[    1.199341] .(0)[1:swapper/0][fg_27542_driver_probe] address=55
<4>[    1.200845] .(0)[1:swapper/0]fg_27542 is_sealed sealed = 1 
<4>[    1.257151] .(0)[1:swapper/0]factory info data: data[0]=d3 data[1]=2 
<4>[    1.257657] .(0)[1:swapper/0]factory info data: data[2]=12 data[3]=6 
<4>[    1.258161] .(0)[1:swapper/0]factory info data: data[4]=0 data[5]=0 
<4>[    1.259195] .(0)[1:swapper/0]factory info data: data[6]=1 data[7]=32 
<4>[    1.259719] .(0)[1:swapper/0]factory info data: data[8]=30 data[9]=31 
<4>[    1.260224] .(0)[1:swapper/0]factory info data: data[10]=38 data[11]=30 
<4>[    1.260732] .(0)[1:swapper/0]factory info data: data[12]=36 data[13]=32 
<4>[    1.262124] .(0)[1:swapper/0]factory info data: data[14]=31 data[15]=30 
<4>[    1.262647] .(0)[1:swapper/0]factory info data: data[16]=30 data[17]=38 
<4>[    1.263154] .(0)[1:swapper/0]factory info data: data[18]=33 data[19]=53 
<4>[    1.263662] .(0)[1:swapper/0]factory info data: data[20]=43 data[21]=55 
<4>[    1.265002] .(0)[1:swapper/0]factory info data: data[22]=49 data[23]=44 
<4>[    1.265530] .(0)[1:swapper/0]factory info data: data[24]=0 data[25]=0 
<4>[    1.266044] .(0)[1:swapper/0]factory info data: data[26]=0 data[27]=f 
<4>[    1.266554] .(0)[1:swapper/0]factory info data: data[28]=8c data[29]=0 
<4>[    1.268383] .(0)[1:swapper/0]factory info data: data[30]=0 data[31]=0 
<4>[    1.269137] .(0)[1:swapper/0]random message:69 
<4>[    1.269527] .(0)[1:swapper/0]random message:ee 
<4>[    1.269933] .(0)[1:swapper/0]random message:c8 
<4>[    1.270333] .(0)[1:swapper/0]random message:10 
<4>[    1.271331] .(0)[1:swapper/0]random message:59 
<4>[    1.271688] .(0)[1:swapper/0]random message:e3 
<4>[    1.272011] .(0)[1:swapper/0]random message:e1 
<4>[    1.272333] .(0)[1:swapper/0]random message:79 
<4>[    1.272743] .(0)[1:swapper/0]random message:6a 
<4>[    1.273145] .(0)[1:swapper/0]random message:a4 
<4>[    1.273460] .(0)[1:swapper/0]random message:68 
<4>[    1.273780] .(0)[1:swapper/0]random message:5b 
<4>[    1.274792] .(0)[1:swapper/0]random message:4e 
<4>[    1.275149] .(0)[1:swapper/0]random message:1f 
<4>[    1.275557] .(0)[1:swapper/0]random message:b1 
<4>[    1.275964] .(0)[1:swapper/0]random message:44 
<4>[    1.276368] .(0)[1:swapper/0]random message:f8 
<4>[    1.276773] .(0)[1:swapper/0]random message:17 
<4>[    1.277175] .(0)[1:swapper/0]random message:4d 
<4>[    1.277497] .(0)[1:swapper/0]random message:a9 
<4>[    1.304641] .(0)[202:krtatm][Thermal/TZ/CPU]krtatm_thread c 26000 p 0 cl 2147483647 gl 2147483647 s 0
<4>[    1.382938] .(0)[1:swapper/0]data[0]: 30 
<4>[    1.382943] .(0)[1:swapper/0]data[1]: da 
<4>[    1.382947] .(0)[1:swapper/0]data[2]: f1 
<4>[    1.382950] .(0)[1:swapper/0]data[3]: 83 
<4>[    1.382954] .(0)[1:swapper/0]data[4]: 25 
<4>[    1.382957] .(0)[1:swapper/0]data[5]: d0 
<4>[    1.382960] .(0)[1:swapper/0]data[6]: 1c 
<4>[    1.382964] .(0)[1:swapper/0]data[7]: c7 
<4>[    1.382967] .(0)[1:swapper/0]data[8]: 1d 
<4>[    1.382970] .(0)[1:swapper/0]data[9]: 69 
<4>[    1.382974] .(0)[1:swapper/0]data[10]: 29 
<4>[    1.382977] .(0)[1:swapper/0]data[11]: 0 
<4>[    1.382981] .(0)[1:swapper/0]data[12]: 12 
<4>[    1.382984] .(0)[1:swapper/0]data[13]: ee 
<4>[    1.382987] .(0)[1:swapper/0]data[14]: 8d 
<4>[    1.382991] .(0)[1:swapper/0]data[15]: 94 
<4>[    1.383002] .(0)[1:swapper/0]result: ad5694a1, 948dee12, 29691d, c71cd025, 83f1da30 
<4>[    1.383008] .(0)[1:swapper/0]SHA-1 check passed
<4>[    1.383011] .(0)[1:swapper/0]fg_27542 fg_27542_driver_probe eeprom_rev:2 
<3>[    1.383138] .(1)[1:swapper/0]BOOTPROF:      1383.137541:probe: probe=i2c_device_probe drv=fg_27542(ffffff800965f240)   183.788462ms
<4>[    1.383255] .(1)[1:swapper/0][mcp_6442_driver_probe] address=2c
<4>[    1.383467] .(1)[1:swapper/0]mcp reg[0xcc] val = 0x00 0x00
<4>[    1.396621] .(1)[1:swapper/0]******** mcp_6442_user_space_probe!! version=0 ********
<4>[    1.396812] .(1)[1:swapper/0]mcp reg[0x8c] val = 0x00 0x25
<4>[    1.412799] .(1)[1:swapper/0]mcp reg[0x2c] val = 0x00 0x16
<4>[    1.432792] .(1)[1:swapper/0]mcp reg[0x3c] val = 0x00 0x17
<4>[    1.448807] .(1)[1:swapper/0]mcp reg[0x6c] val = 0x00 0x07
<4>[    1.464812] .(1)[1:swapper/0]mcp reg[0x7c] val = 0x00 0x08
<4>[    1.480805] .(1)[1:swapper/0]mcp reg[0x9c] val = 0x00 0x70
<4>[    1.496625] .(1)[1:swapper/0]mcp_6442 :  112  112  37  37  22  23  7  8 
<3>[    1.496641] .(1)[1:swapper/0]BOOTPROF:      1496.640849:probe: probe=i2c_device_probe drv=mcp_6442(ffffff800965fc88)   113.381462ms
<6>[    1.496865] .(1)[1:swapper/0]MAINAF [AF_i2c_probe] Start
<6>[    1.496870] .(1)[1:swapper/0]MAINAF [Register_AF_CharDrv] Start
<6>[    1.496957] .(1)[1:swapper/0]MAINAF [Register_AF_CharDrv] End
<6>[    1.496962] .(1)[1:swapper/0]MAINAF [AFRegulatorCtrl] AFIOC_S_SETPOWERCTRL regulator_put           (null)
<4>[    1.497274] .(1)[1:swapper/0]MAINAF supply vcamaf not found, using dummy regulator
<6>[    1.497329] .(1)[1:swapper/0]MAINAF [AFRegulatorCtrl] [Init] regulator_get ffffffc05c20cb80
<6>[    1.497335] .(1)[1:swapper/0]MAINAF [AF_i2c_probe] Attached!!
<4>[    1.497554] .(1)[1:swapper/0][wlc_51025_driver_probe] address=6c
<6>[    1.497838] .(2)[1:swapper/0]i2c i2c-2: addr: 6c, transfer ACK error
<6>[    1.497846] .(2)[1:swapper/0]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    1.497850] .(2)[1:swapper/0]I2C structure:
<3>[    1.497850] [I2C]Clk=13650000,Id=2,Op=1,Irq_stat=2,Total_len=1
<3>[    1.497850] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=0,speed=400000
<3>[    1.497850] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    1.497861] .(2)[1:swapper/0]base address 0xffffff800bf46000
<6>[    1.497871] .(2)[1:swapper/0]I2C register:
<6>[    1.497871] [I2C]SLAVE_ADDR=d8,INTR_MASK=0,INTR_STAT=1,CONTROL=28,TRANSFER_LEN=1
<6>[    1.497871] [I2C]TRANSAC_LEN=1,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[    1.497871] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=2
<6>[    1.497882] .(2)[1:swapper/0]before enable DMA register(0xffffff800bf48400):
<6>[    1.497882] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.497882] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.497882] [I2C]TX_LEN=0,RX_LEN=10,INT_BUF_SIZE=0,DEBUG_STATUS=0
<6>[    1.497882] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.497897] .(2)[1:swapper/0]DMA register(0xffffff800bf48400):
<6>[    1.497897] [I2C]INT_FLAG=2,INT_EN=0,EN=0,RST=0,
<6>[    1.497897] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=9c1c5010
<6>[    1.497897] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=10101000
<6>[    1.497897] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.497908] .(2)[1:swapper/0]i2c_dump_info ------------------------------------------
<3>[    1.497913] .(2)[1:swapper/0]i2c i2c-2: last transfer info:
<3>[    1.497918] .(2)[1:swapper/0]i2c i2c-2: [00] [    1.497834] SLAVE_ADDR=d8,INTR_STAT=2,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.497928] .(2)[1:swapper/0]i2c i2c-2: [01] [    1.480798] SLAVE_ADDR=58,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1320,DEBUGSTAT=300, tmo=500
<3>[    1.497938] .(2)[1:swapper/0]i2c i2c-2: [02] [    1.464806] SLAVE_ADDR=58,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1320,DEBUGSTAT=300, tmo=500
<3>[    1.497947] .(2)[1:swapper/0]i2c i2c-2: [03] [    1.448799] SLAVE_ADDR=58,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1320,DEBUGSTAT=300, tmo=500
<3>[    1.497956] .(2)[1:swapper/0]i2c i2c-2: [04] [    1.432785] SLAVE_ADDR=58,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1320,DEBUGSTAT=300, tmo=499
<3>[    1.497966] .(2)[1:swapper/0]i2c i2c-2: [05] [    1.412793] SLAVE_ADDR=58,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1320,DEBUGSTAT=300, tmo=500
<3>[    1.497975] .(2)[1:swapper/0]i2c i2c-2: [06] [    1.396804] SLAVE_ADDR=58,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1320,DEBUGSTAT=300, tmo=500
<3>[    1.497984] .(2)[1:swapper/0]i2c i2c-2: [07] [    1.383460] SLAVE_ADDR=58,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1320,DEBUGSTAT=300, tmo=500
<3>[    1.497993] .(2)[1:swapper/0]i2c i2c-2: [08] [    1.382932] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=32c,FIFO_STAT=1,DEBUGSTAT=300, tmo=500
<3>[    1.498002] .(2)[1:swapper/0]i2c i2c-2: [09] [    1.380820] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<4>[    1.498042] .(2)[1:swapper/0]wlc_51025 :  0  0  
<4>[    1.498738] .(2)[1:swapper/0][Hall]wlc_51025_driver_probe can't find compatible node
<3>[    1.498780] .(2)[1:swapper/0]BOOTPROF:      1498.779772:probe: probe=platform_drv_probe drv=mt-i2c(ffffff80096c01d0)   299.831923ms
<6>[    1.498851] .(2)[1:swapper/0][I2C] id : 5, freq : 3400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.498983] .(2)[1:swapper/0]mt-i2c 1100f000.i2c: i2c5 clock source ffffffc05c2a6e80,clock src frequency 13650000
<3>[    1.499679] .(2)[1:swapper/0]mt6370_pmu 5-0034: find mt6370_pmu_dts node
<6>[    1.499699] .(2)[1:swapper/0]regmap_device_register: name = mt6370_pmu
<6>[    1.499743] .(2)[1:swapper/0] rt_regmap_mt6370_pmu: rt register cache data init
<6>[    1.499770] .(2)[1:swapper/0] rt_regmap_mt6370_pmu: cache cata init successfully
<6>[    1.508146] .(2)[1:swapper/0]mt6370_pmu_core mt6370_pmu_core: mt6370_pmu_core_probe successfully
<6>[    1.508346] .(2)[1:swapper/0]mt6370_pmu_charger_probe: (1.1.24_MTK)
<6>[    1.508355] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt_parse_dt
<3>[    1.508364] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt_parse_dt: no chg alias name
<3>[    1.508371] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt_parse_dt: no ls alias name
<3>[    1.508391] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_pmu_charger_probe: get usb switch failed
<6>[    1.508401] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_chg_init_setting
<6>[    1.508407] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_select_input_current_limit: select input current limit = 2
<6>[    1.513579] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_enable_ilim: en = 0
<6>[    1.515735] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: __mt6370_set_mivr: mivr = 4400000 (0x05)
<4>[    1.515900] .(2)[1:swapper/0]DLCP __mt6370_set_cv       = 4350000
<4>[    1.516404] .(2)[1:swapper/0]DLCP __mt6370_set_ieoc      = 150000
<6>[    1.516688] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: __mt6370_enable_te: en = 1
<6>[    1.516854] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_set_fast_charge_timer: timer = 12 (0x04)
<6>[    1.517026] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_set_dc_wdt: wdt = 4000ms(0x06)
<6>[    1.517209] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: __mt6370_enable_safety_timer: en = 1
<6>[    1.517374] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_enable_wdt: en = 0
<6>[    1.517541] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_disable_warm_cool_jeita
<6>[    1.518119] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_enable_hz: en = 0
<6>[    1.518298] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_set_ircmp_resistor: resistor = 25000 (0x01)
<6>[    1.518465] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_set_ircmp_vclamp: vclamp = 32000 (0x01)
<6>[    1.518633] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: __mt6370_enable_chgdet_flow: en = 0
<6>[    1.518833] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_chg_sw_workaround
<6>[    1.519310] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_chg_sw_workaround: zcv = (0x00, 0x00, 0mV)
<6>[    1.521288] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_pmu_charger_probe successfully
<6>[    1.521469] .(2)[1:swapper/0]mt6370_pmu_fled_probe (1.0.2_MTK) id = 0
<6>[    1.521475] .(2)[1:swapper/0]mt6370_fled_parse_dt start
<6>[    1.521479] .(2)[1:swapper/0]mt6370_fled_parse_dt use torch cur 300000
<6>[    1.521648] .(2)[1:swapper/0]mt6370_fled_parse_dt use strobe cur 1200000
<6>[    1.521817] .(2)[1:swapper/0]mt6370_fled_parse_dt use strobe timeout 2400
<6>[    1.522566] .(2)[1:swapper/0]mt6370_pmu_fled_probe flash name = mt-flash-led1
<6>[    1.522660] .(2)[1:swapper/0]rt-flash-led:rtfled_probe() line-388: Richtek FlashLED Driver is probing
<4>[    1.522668] .(2)[1:swapper/0]rt-flash-led:rtfled_check_hal_implement() line-374: check_hal_implemented have NULL item.
<6>[    1.522765] .(2)[1:swapper/0]rt-flash-led:rtfled_probe() line-406: Richtek FlashLED Driver initialized successfully
<6>[    1.523301] .(2)[1:swapper/0]mt6370_pmu_fled mt6370_pmu_fled.0: mt6370 fled inited
<6>[    1.523308] .(2)[1:swapper/0]mt6370_pmu_fled mt6370_pmu_fled.0: mt6370_pmu_fled_probe successfully
<6>[    1.523479] .(2)[1:swapper/0]mt6370_pmu_fled_probe (1.0.2_MTK) id = 1
<6>[    1.523484] .(2)[1:swapper/0]mt6370_fled_parse_dt start
<6>[    1.523488] .(2)[1:swapper/0]mt6370_fled_parse_dt use torch cur 200000
<6>[    1.523992] .(2)[1:swapper/0]mt6370_fled_parse_dt use strobe cur 1000000
<6>[    1.524173] .(2)[1:swapper/0]mt6370_fled_parse_dt use strobe timeout 1200
<6>[    1.524266] .(2)[1:swapper/0]mt6370_pmu_fled_probe flash name = mt-flash-led2
<6>[    1.524362] .(2)[1:swapper/0]rt-flash-led:rtfled_probe() line-388: Richtek FlashLED Driver is probing
<4>[    1.524368] .(2)[1:swapper/0]rt-flash-led:rtfled_check_hal_implement() line-374: check_hal_implemented have NULL item.
<6>[    1.524453] .(2)[1:swapper/0]rt-flash-led:rtfled_probe() line-406: Richtek FlashLED Driver initialized successfully
<6>[    1.524464] .(2)[1:swapper/0]mt6370_pmu_fled mt6370_pmu_fled.1: mt6370_pmu_fled_probe successfully
<6>[    1.524658] .(2)[1:swapper/0]mt6370_pmu_ldo mt6370_pmu_ldo: regulator_name = irtx_ldo, min_uV = 1600000, max_uV = 4000000
<6>[    1.525142] .(2)[1:swapper/0]mt6370_pmu_ldo mt6370_pmu_ldo: mt6370_pmu_ldo_probe successfully
<6>[    1.531015] .(2)[1:swapper/0]mt6370_pmu_rgbled mt6370_pmu_rgbled: mt6370_pmu_rgbled_probe successfully
<6>[    1.532308] .(2)[1:swapper/0]rt-flash-led:rtfled_probe() line-388: Richtek FlashLED Driver is probing
<6>[    1.532399] .(2)[1:swapper/0]rt-flash-led:rtfled_probe() line-406: Richtek FlashLED Driver initialized successfully
<6>[    1.532524] .(2)[1:swapper/0]mt6370_pmu_bled mt6370_pmu_bled: mt6370_pmu_bled_probe successfully
<6>[    1.532790] .(2)[1:swapper/0]mt6370_pmu 5-0034: mt6370_pmu_probe successfully
<3>[    1.532810] .(2)[1:swapper/0]BOOTPROF:      1532.810233:probe: probe=i2c_device_probe drv=mt6370_pmu(ffffff800966cb08)    33.484231ms
<6>[    1.533025] .(2)[1:swapper/0]mt6370_i2c_probe
<6>[    1.533031] .(2)[1:swapper/0]I2C functionality : OK...
<6>[    1.538091] .(0)[45:pd_dbg_info]///PD dbg info 145d
<4>[    1.538098] <    1.538>0
<4>[    1.538098] <    1.538>pd_dbg_info : t2-t1 = 15
<4>[    1.538098] <    1.538>1
<4>[    1.538098] <    1.538>pd_dbg_info : t2-t1 = 2
<4>[    1.538098] <    1.538>2
<4>[    1.538098] <    1.538>pd_dbg_.(0)[45:pd_dbg_info]info : t2-t1 = 1
<6>[    1.538119] .(2)[1:swapper/0]0
<6>[    1.538123] .(2)[1:swapper/0]pr_info : t2-t1 = 4
<6>[    1.538127] .(2)[1:swapper/0]1
<6>[    1.538130] .(2)[1:swapper/0]pr_info : t2-t1 = 3
<6>[    1.538133] .(2)[1:swapper/0]2
<6>[    1.538136] .(2)[1:swapper/0]pr_info : t2-t1 = 2
<6>[    1.538139] .(2)[1:swapper/0]3
<6>[    1.538142] .(2)[1:swapper/0]pr_info : t2-t1 = 3
<6>[    1.538145] .(2)[1:swapper/0]4
<6>[    1.538148] .(2)[1:swapper/0]pr_info : t2-t1 = 2
<6>[    1.538151] .(2)[1:swapper/0]5
<6>[    1.538154] .(2)[1:swapper/0]pr_info : t2-t1 = 3
<6>[    1.538157] .(2)[1:swapper/0]6
<6>[    1.538161] .(2)[1:swapper/0]pr_info : t2-t1 = 3
<6>[    1.538164] .(2)[1:swapper/0]7
<6>[    1.538167] .(2)[1:swapper/0]pr_info : t2-t1 = 2
<6>[    1.538170] .(2)[1:swapper/0]8
<6>[    1.538173] .(2)[1:swapper/0]pr_info : t2-t1 = 2
<6>[    1.538176] .(2)[1:swapper/0]9
<6>[    1.538179] .(2)[1:swapper/0]pr_info : t2-t1 = 2
<6>[    1.538183] .(2)[1:swapper/0]mt_parse_dt
<6>[    1.538542] .(2)[1:swapper/0]mt6370_chipID = 0x2486
<6>[    1.538550] .(2)[1:swapper/0]regmap_device_register: name = mt6370-4e
<6>[    1.538598] .(2)[1:swapper/0] rt_regmap_mt6370-4e: rt register cache data init
<6>[    1.538611] .(2)[1:swapper/0] rt_regmap_mt6370-4e: cache cata init successfully
<6>[    1.538872] .(2)[1:swapper/0]tcpc_device_register register tcpc device (type_c_port0)
<6>[    1.538983] .(2)[1:swapper/0]PD Timer number = 57
<6>[    1.539104] .(2)[1:swapper/0]tcpci_timer_init : init OK
<6>[    1.539109] .(2)[1:swapper/0]pd_parse_pdata
<6>[    1.539212] .(2)[1:swapper/0]pd_parse_pdata src pdo data =
<6>[    1.539216] .(2)[1:swapper/0]pd_parse_pdata 0: 0x00019032
<6>[    1.539222] .(2)[1:swapper/0]pd_parse_pdata snk pdo data =
<6>[    1.539226] .(2)[1:swapper/0]pd_parse_pdata 0: 0x000190c8
<6>[    1.539230] .(2)[1:swapper/0]pd_parse_pdata 1: 0xc0761e3c
<6>[    1.539236] .(2)[1:swapper/0]pd_parse_pdata id vdos data =
<6>[    1.539239] .(2)[1:swapper/0]pd_parse_pdata 0: 0xd10029cf
<6>[    1.539243] .(2)[1:swapper/0]pd_parse_pdata 1: 0x00000000
<6>[    1.539247] .(2)[1:swapper/0]pd_parse_pdata 2: 0x00010000
<6>[    1.539252] .(2)[1:swapper/0]pd_parse_pdata charging_policy = 33
<6>[    1.539256] .(2)[1:swapper/0]pd_parse_pdata_bats Battery NR = 1
<6>[    1.539268] .(2)[1:swapper/0]pd_parse_pdata_bats fix_bat_info[0].mfrs_info.vid = 0x29cf, 					    .mfrs_info.pid = 0x1711, 					    .mfrs_string = bat1, 					    .bat_design_cap = 3000
<6>[    1.539276] .(2)[1:swapper/0]pd_parse_pdata_countries Country NR = 0
<6>[    1.539281] .(2)[1:swapper/0]pd_parse_log_src_cap_ext vid = 0x29cf, pid = 0x1711, xid = 0x0, 		fw_ver = 0x2, hw_ver = 0x1
<6>[    1.539287] .(2)[1:swapper/0]pd_parse_log_src_cap_ext voltage_regulation = 0, hold_time_ms = 0, compliance = 0x0, 		touch_current = 0x0, peak_current = 0 0 0
<6>[    1.539294] .(2)[1:swapper/0]pd_parse_log_src_cap_ext touch_temp = 0, source_inputs = 0x0, 		batteries = 0x0, source_pdp = 0x2
<6>[    1.539300] .(2)[1:swapper/0]pd_parse_pdata_mfrs VID = 0x29cf, PID = 0x5081
<6>[    1.539306] .(2)[1:swapper/0]pd_parse_pdata_mfrs PD mfrs_string = RichtekTCPC
<6>[    1.539379] .(2)[1:swapper/0]dpm_caps: local_dr_power
<6>[    1.539383] .(2)[1:swapper/0]dpm_caps: local_dr_data
<6>[    1.539388] .(2)[1:swapper/0]dpm_caps: local_ext_power
<6>[    1.539391] .(2)[1:swapper/0]dpm_caps: local_usb_comm
<6>[    1.539395] .(2)[1:swapper/0]dpm_caps: local_usb_suspend
<6>[    1.539399] .(2)[1:swapper/0]dpm_caps: local_high_cap
<6>[    1.539403] .(2)[1:swapper/0]dpm_caps: local_give_back
<6>[    1.539406] .(2)[1:swapper/0]dpm_caps: local_no_suspend
<6>[    1.539410] .(2)[1:swapper/0]dpm_caps: local_vconn_supply
<6>[    1.539414] .(2)[1:swapper/0]dpm_caps: attemp_discover_cable_dfp
<6>[    1.539418] .(2)[1:swapper/0]dpm_caps: attemp_enter_dp_mode
<6>[    1.539421] .(2)[1:swapper/0]dpm_caps: attemp_discover_cable
<6>[    1.539425] .(2)[1:swapper/0]dpm_caps: attemp_discover_id
<6>[    1.539429] .(2)[1:swapper/0]dpm_caps: pr_reject_as_source
<6>[    1.539433] .(2)[1:swapper/0]dpm_caps: pr_reject_as_sink
<6>[    1.539436] .(2)[1:swapper/0]dpm_caps: pr_check_gp_source
<6>[    1.539440] .(2)[1:swapper/0]dpm_caps: pr_check_gp_sink
<6>[    1.539444] .(2)[1:swapper/0]dpm_caps: dr_reject_as_dfp
<6>[    1.539448] .(2)[1:swapper/0]dpm_caps: dr_reject_as_ufp
<6>[    1.539452] .(2)[1:swapper/0]dpm_caps = 0x0010e18b
<3>[    1.539524] .(2)[1:swapper/0]dp_parse_svid_data get displayport data fail
<6>[    1.539845] .(2)[1:swapper/0]usb_type_c 5-004e: PD_REV30
<6>[    1.540036] .(2)[1:swapper/0]mt6370_init_alert name = type_c_port0, gpio = 389
<6>[    1.540076] .(2)[1:swapper/0]mt6370_init_alert : IRQ number = 713
<6>[    1.540179] .(2)[1:swapper/0]IRQF_NO_THREAD Test
<6>[    1.540226] .(2)[1:swapper/0]mt6370_i2c_probe probe OK!
<3>[    1.540276] .(2)[1:swapper/0]BOOTPROF:      1540.276310:probe: probe=platform_drv_probe drv=mt-i2c(ffffff80096c01d0)    41.427307ms
<6>[    1.540351] .(2)[1:swapper/0][I2C] id : 3, freq : 400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.540474] .(2)[1:swapper/0]mt-i2c 11011000.i2c: i2c3 clock source ffffffc05c2fbe80,clock src frequency 13650000
<4>[    1.540828] .(2)[1:swapper/0]pn548_probe: start...
<4>[    1.540833] .(2)[1:swapper/0]pn548_probe: step02 is ok
<4>[    1.540837] .(2)[1:swapper/0]pn548_dev=ffffffc05c2ff500
<4>[    1.540840] .(2)[1:swapper/0]pn548_probe: step03 is ok
<4>[    1.540911] .(2)[1:swapper/0]pn548_probe: step04 is ok
<4>[    1.540916] .(2)[1:swapper/0]pn548_probe: step05 is ok
<4>[    1.541226] .(2)[1:swapper/0]pn548_dev->irq_gpio = 26
<4>[    1.541391] .(2)[1:swapper/0]pn548 client->irq = 699
<4>[    1.541424] .(2)[1:swapper/0]pn548_probe: set EINT finished, client->irq=699
<4>[    1.541429] .(2)[1:swapper/0]pn548_disable_irq
<4>[    1.541434] .(2)[1:swapper/0]pn548_platform_pinctrl_select
<4>[    1.541458] .(2)[1:swapper/0]pn548_probe: step06 success
<6>[    1.541530] .(2)[1:swapper/0][I2C] id : 4, freq : 400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.541635] .(2)[1:swapper/0]mt-i2c 11017000.i2c: i2c4 clock source ffffffc05c300d00,clock src frequency 13650000
<6>[    1.542145] .(2)[1:swapper/0]MAINAF [AFRegulatorCtrl] AFIOC_S_SETPOWERCTRL regulator_put ffffffc05c20cb80
<4>[    1.542367] .(2)[1:swapper/0]fx16408 probe 
<4>[    1.542492] .(2)[1:swapper/0]STM32 Device is awake: 0x5c
<4>[    1.542573] .(2)[1:swapper/0]stm32_i2c: probe of 4-005c failed with error -1
<6>[    1.542639] .(2)[1:swapper/0][I2C] id : 6, freq : 3400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.542726] .(2)[1:swapper/0]mt-i2c 11005000.i2c: i2c6 clock source ffffffc05c33f980,clock src frequency 13650000
<6>[    1.543048] .(2)[1:swapper/0][I2C] id : 7, freq : 400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.543135] .(2)[1:swapper/0]mt-i2c 11008000.i2c: i2c7 clock source ffffffc05c344700,clock src frequency 13650000
<6>[    1.543342] .(2)[1:swapper/0][I2C] id : 8, freq : 400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.543432] .(2)[1:swapper/0]mt-i2c 11009000.i2c: i2c8 clock source ffffffc05c347200,clock src frequency 13650000
<6>[    1.543832] .(2)[1:swapper/0][I2C] id : 9, freq : 400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.543922] .(2)[1:swapper/0]mt-i2c 11016000.i2c: i2c9 clock source ffffffc05c34c200,clock src frequency 13650000
<3>[    1.546553] .(2)[1:swapper/0]BOOTPROF:      1546.552157:initcall: mt_i2c_init   369.040001ms
<5>[    1.546722] .(2)[1:swapper/0]netlink_kernel_create protol= 26
<5>[    1.546727] .(2)[1:swapper/0]netlink_kernel_create ok
<5>[    1.548134] .(2)[1:swapper/0]******** battery_dts_probe!! ********
<5>[    1.548536] .(2)[1:swapper/0]mtk_rtc_hal_common: rtc_spare_reg[14] = {a24, 255, 8}
<5>[    1.548546] -(2)[1:swapper/0]mtk_rtc_hal_common: rtc_spare_reg[0] = {a2a, 255, 8}
<5>[    1.548555] .(2)[1:swapper/0][fgauge_read_RTC_boot_status] rtc_invalid 0 plugout 0 plugout_time 0 spare3 0xe4 spare0 0x60 hw_id 0x5640
<5>[    1.549003] .(2)[1:swapper/0][fgauge_get_profile_id]Battery id=(0) en:0,0
<5>[    1.549408] .(2)[1:swapper/0][BAT_probe] power_supply_register Battery Success !!
<5>[    1.549991] .(2)[1:swapper/0] fg_swocv_v = 43202 len 5 fg_swocv_v_tmp 43202 ptim_lk_v[43202]
<5>[    1.550015] .(2)[1:swapper/0] fg_swocv_i = -620 len 2 fg_swocv_i_tmp -6 ptim_lk_i[-6]
<5>[    1.550037] .(2)[1:swapper/0] shutdown_time = 0620 len 1 shutdown_time_tmp 0 pl_shutdown_time[0]
<5>[    1.550058] .(2)[1:swapper/0] boot_voltage = 4310 len 4 boot_voltage_tmp 4310 pl_bat_vol[4310]
<4>[    1.551137] .(2)[1:swapper/0]=====FG===== AC   = 0
<5>[    1.551153] .(2)[1:swapper/0]read DISABLE_MTKBATTERY fail
<5>[    1.551158] .(2)[1:swapper/0][fgauge_get_profile_id]Battery id=(0) en:0,0
<5>[    1.551162] .(2)[1:swapper/0]fg_custom_init_from_dts
<5>[    1.551173] .(2)[1:swapper/0]Get MTK_CHR_EXIST failed
<5>[    1.551179] .(2)[1:swapper/0]Get PSEUDO1_IQ_OFFSET BAT0 failed
<5>[    1.551192] .(2)[1:swapper/0]Get PMIC_MIN_VOL failed
<5>[    1.551197] .(2)[1:swapper/0]Get POWERON_SYSTEM_IBOOT failed
<5>[    1.551201] .(2)[1:swapper/0]Get FGC_FGV_TH1 failed
<5>[    1.551205] .(2)[1:swapper/0]Get FGC_FGV_TH2 failed
<5>[    1.551209] .(2)[1:swapper/0]Get FGC_FGV_TH3 failed
<5>[    1.551214] .(2)[1:swapper/0]Get UISOC_UPDATE_T failed
<5>[    1.551218] .(2)[1:swapper/0]Get UIFULLLIMIT_EN failed
<5>[    1.551223] .(2)[1:swapper/0]Get MULTI_GAUGE0_EN failed
<5>[    1.551227] .(2)[1:swapper/0]Get SHUTDOWN_GAUGE0_VOLTAGE failed
<4>[    1.551673] .(1)[222:battery_thread]=====FG===== AC   = 0
<3>[    1.553367] [config_data_dump_to_cp]cmdline=console=tty0 console=ttyMT0,921600n1 root=/dev/ram vmalloc=496M slub_max_order=0 slub_debug=OFZPU androidboot.hardware=mt6763 maxcpus=8 firmware_class.path=/vendor/firmware has_battery_removed=0 androidboot.verifiedbootstate=orange bootopt=64S3,32N2,64N2 buildvariant=user androidboot.veritymode=enforcing androidboot.atm=disabled androidboot.meta_log_disable=0 printk.disable_uart=0 bootprof.pl_t=4633 bootprof.lk_t=7367 bootprof.logo_t=1226 boot_reason=4 androidboot.serialno=S19F00013 androidboot.secureboot=49 androidboot.specialid=0 dlconfig_tof_offset=0 dlconfig_tof_x_talk=0 config_data_tof_offset_cali_flag=0 config_data_tof_xtalk_cali_flag=0 config_data_cp_index=0 config_data_charge_current=0 config_data_charge_termination_current=0 config_data_charge_voltage=0 config_data_recharge_threshold=0 config_data_precharge_current=0 config_data_pid_target_temperature=0 config_data_battery_profile_id=0 cmdline_power_on_flag=1 power_key_flag=0 power_on<3>[    1.553403] .(2)[1:swapper/0][config_data_get_value_by_name_from_cmdline]rt_value=0
<5>[    1.553407] .(2)[1:swapper/0][battery_init] Initialization : DONE
<4>[    1.553789] .(1)[222:battery_thread]temp_now=223, temp_last=250 
<4>[    1.553796] .(1)[222:battery_thread]=====FG===== TEMP = 223
<4>[    1.554889] .(2)[222:battery_thread]=====FG===== VOLT = 4324
<4>[    1.554895] .(2)[222:battery_thread]=====FG===== actural VOLT = 4324
<6>[    1.554977] .(0)[1:swapper/0]device-mapper: uevent: version 1.0.3
<6>[    1.555178] .(0)[1:swapper/0]device-mapper: ioctl: 4.34.0-ioctl (2015-10-28) initialised: dm-devel@redhat.com
<6>[    1.556781] .(1)[1:swapper/0][msdc]DT probe msdc0!
<6>[    1.556863] .(1)[1:swapper/0][msdc][msdc0] get irq # 16
<4>[    1.557147] .(1)[1:swapper/0]11230000.msdc supply vqmmc not found, using dummy regulator
<6>[    1.557771] .(1)[1:swapper/0][msdc][msdc0] hclk:371999833, clk_ctl:ffffffc05c37d280, hclk_ctl:ffffffc05c37d380
<6>[    1.558182] .(1)[1:swapper/0][msdc]DT probe msdc1!
<6>[    1.558238] .(1)[1:swapper/0]mtk-msdc 11240000.msdc: Got CD GPIO
<6>[    1.558300] .(1)[1:swapper/0][msdc][msdc1] get irq # 17
<6>[    1.558789] .(1)[1:swapper/0][msdc][msdc1] hclk:185999916, clk_ctl:ffffffc05c37df00, hclk_ctl:ffffffc05c381000
<6>[    1.559188] .(1)[1:swapper/0][msdc]DT probe msdc2!
<6>[    1.559242] .(1)[1:swapper/0][msdc][msdc2] get irq # 18
<4>[    1.559301] .(1)[1:swapper/0]11250000.msdc supply vmmc not found, using dummy regulator
<6>[    1.559359] .(0)[6:kworker/u16:0][msdc]msdc0: pin state init (0)
<4>[    1.559360] .(1)[1:swapper/0]11250000.msdc supply vqmmc not found, using dummy regulator
<6>[    1.559478] .(0)[6:kworker/u16:0][msdc]msdc0 power on
<6>[    1.559505] .(1)[1:swapper/0][msdc][msdc2] hclk:185999916, clk_ctl:ffffffc05c381a80, hclk_ctl:ffffffc05c381b80
<6>[    1.559788] .(1)[1:swapper/0][I]mtk_wcn_cmb_sdio_request_eirq:enter
<6>[    1.560342] .(1)[1:swapper/0][I]mtk_wcn_cmb_sdio_request_eirq:exit
<6>[    1.562274] .(1)[1:swapper/0]hidraw: raw HID events driver (C) Jiri Kosina
<6>[    1.563372] .(1)[1:swapper/0]usbcore: registered new interface driver usbhid
<6>[    1.563378] .(1)[1:swapper/0]usbhid: USB HID core driver
<6>[    1.563590] .(1)[1:swapper/0]ashmem: initialized
<6>[    1.563659] .(1)[1:swapper/0]lowmemorykiller: lowmem_init: successful to register misc device!
<6>[    1.564633] .(1)[45:pd_dbg_info]///PD dbg info 369d
<6>[    1.564637] .(3)[69:kworker/u16:2]power_supply battery: power_supply_changed
<4>[    1.564640] <    1.538>3
<4>[    1.564640] <    1.538>pd_dbg_info : t2-t1 = 3
<4>[    1.564640] <    1.538>4
<4>[    1.564640] <    1.538>pd_dbg_info : t2-t1 = 1
<4>[    1.564640] <    1.538>5
<4>[    1.564640] <    1.538>pd_dbg_info : t2-t1 = 1
<4>[    1.564648] <    1.538>6
<4>[    1.564648] <    1.538>pd_dbg_info : t2-t1 = 1
<4>[    1.564648] <    1.538>7
<4>[    1.564648] <    1.538>pd_dbg_info : t2-t1 = 1
<4>[    1.564648] <    1.538>8
<4>[    1.564648] <  .(1)[45:pd_dbg_info]  1.538>pd_dbg_info : t2-t1 = 1
<4>[    1.564650] <    1.538>9
<4>[    1.564650] <    1.538>pd_dbg_info : t2-t1 = 1
<4>[    1.564650] <    1.539>TCPC-PE:pd_core_init
<6>[    1.565255] .(2)[1:swapper/0]usbcore: registered new interface driver snd-usb-audio
<6>[    1.566733] .(2)[1:swapper/0]rt5509_driver_init
<4>[    1.570750] .(3)[21:kworker/3:0]temp_now=223, temp_last=223 
<4>[    1.570759] .(3)[21:kworker/3:0]=====FG===== TEMP = 223
<4>[    1.570879] .(2)[1:swapper/0]mtk_btcvsd_tx_probe: dev name mt-soc-btcvsd-tx-pcm
<6>[    1.571130] .(2)[1:swapper/0]speaker_amp 1-0034: mtk_spk_i2c_probe()
<6>[    1.571136] .(2)[1:swapper/0]+rt5509_i2c_probe
<6>[    1.571379] .(2)[1:swapper/0]i2c i2c-1: addr: 34, transfer ACK error
<6>[    1.571387] .(2)[1:swapper/0]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    1.571390] .(2)[1:swapper/0]I2C structure:
<3>[    1.571390] [I2C]Clk=13650000,Id=1,Op=3,Irq_stat=3,Total_len=1
<3>[    1.571390] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=1,speed=400000
<3>[    1.571390] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    1.571401] .(2)[1:swapper/0]base address 0xffffff800bf40000
<6>[    1.571411] .(2)[1:swapper/0]I2C register:
<6>[    1.571411] [I2C]SLAVE_ADDR=68,INTR_MASK=0,INTR_STAT=0,CONTROL=3a,TRANSFER_LEN=1
<6>[    1.571411] [I2C]TRANSAC_LEN=2,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[    1.571411] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=1
<6>[    1.571422] .(2)[1:swapper/0]before enable DMA register(0x0):
<6>[    1.571422] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.571422] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.571422] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=0
<6>[    1.571422] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.571437] .(2)[1:swapper/0]DMA register(0xffffff800bf42380):
<6>[    1.571437] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.571437] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.571437] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=2
<6>[    1.571437] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.571446] .(2)[1:swapper/0]i2c_dump_info ------------------------------------------
<3>[    1.571452] .(2)[1:swapper/0]i2c i2c-1: last transfer info:
<3>[    1.571457] .(2)[1:swapper/0]i2c i2c-1: [00] [    1.571376] SLAVE_ADDR=68,INTR_STAT=3,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.571467] .(2)[1:swapper/0]i2c i2c-1: [01] [    1.198818] SLAVE_ADDR=b2,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.571477] .(2)[1:swapper/0]i2c i2c-1: [02] [    1.198694] SLAVE_ADDR=b2,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.571486] .(2)[1:swapper/0]i2c i2c-1: [03] [    1.198573] SLAVE_ADDR=b2,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.571495] .(2)[1:swapper/0]i2c i2c-1: [04] [    1.197675] SLAVE_ADDR=b2,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.571504] .(2)[1:swapper/0]i2c i2c-1: [05] [    1.197557] SLAVE_ADDR=b2,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1210,DEBUGSTAT=300, tmo=500
<3>[    1.571514] .(2)[1:swapper/0]i2c i2c-1: [06] [    1.197406] SLAVE_ADDR=b2,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.571523] .(2)[1:swapper/0]i2c i2c-1: [07] [    1.197286] SLAVE_ADDR=b2,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1210,DEBUGSTAT=300, tmo=500
<3>[    1.571532] .(2)[1:swapper/0]i2c i2c-1: [08] [    1.197130] SLAVE_ADDR=b2,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.571541] .(2)[1:swapper/0]i2c i2c-1: [09] [    1.196997] SLAVE_ADDR=b2,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1210,DEBUGSTAT=300, tmo=500
<3>[    1.571565] .(2)[1:swapper/0]speaker_amp 1-0034: power on fail 1
<3>[    1.571572] .(2)[1:swapper/0]speaker_amp 1-0034: error -121
<4>[    1.571587] .(2)[1:swapper/0]speaker_amp: probe of 1-0034 failed with error -121
<4>[    1.571707] .(2)[1:swapper/0]mtk_soc_capture_platform_init
<4>[    1.572065] .(3)[21:kworker/3:0]=====FG===== SOC  = 100
<4>[    1.572693] .(2)[1:swapper/0]mtk_capture_probe
<4>[    1.572699] .(2)[1:swapper/0]mtk_capture_probe: dev name mt-soc-ul1-pcm
<4>[    1.573382] .(3)[21:kworker/3:0]=====FG===== AC   = 0
<4>[    1.573657] .(2)[1:swapper/0]mtk_soc_dl1_probe: dev name mt-soc-dl1-pcm
<4>[    1.575479] .(3)[21:kworker/3:0]=====FG===== VOLT = 4324
<4>[    1.575485] .(3)[21:kworker/3:0]=====FG===== actural VOLT = 4324
<4>[    1.576281] .(3)[21:kworker/3:0]temp_now=223, temp_last=223 
<4>[    1.576287] .(3)[21:kworker/3:0]=====FG===== TEMP = 223
<4>[    1.576861] .(2)[1:swapper/0]AudDrv_GPIO_probe
<4>[    1.577229] .(2)[1:swapper/0]AudDrv_GPIO_probe(), extbuck_fan53526_exist = 0
<4>[    1.577235] .(3)[21:kworker/3:0]=====FG===== SOC  = 100
<3>[    1.577235] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_clk_mosi_off fail -19
<3>[    1.577245] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_clk_mosi_on fail -19
<3>[    1.577251] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_dat_miso2_off fail -19
<3>[    1.577256] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_dat_miso2_on fail -19
<3>[    1.577261] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_dat_mosi2_off fail -19
<3>[    1.577265] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_dat_mosi2_on fail -19
<3>[    1.577270] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state vow_dat_miso_off fail -19
<3>[    1.577274] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state vow_dat_miso_on fail -19
<3>[    1.577279] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state vow_clk_miso_off fail -19
<3>[    1.577283] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state vow_clk_miso_on fail -19
<3>[    1.577288] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_smartpa_reset fail -19
<3>[    1.577292] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_smartpa_on fail -19
<3>[    1.577297] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_smartpa_off fail -19
<3>[    1.577301] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_tdm_mode0 fail -19
<3>[    1.577306] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_tdm_mode1 fail -19
<3>[    1.577310] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state audpmicclk-mode0 fail -19
<3>[    1.577315] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state audpmicclk-mode1 fail -19
<3>[    1.577319] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state audi2s1-mode0 fail -19
<3>[    1.577323] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state audi2s1-mode1 fail -19
<3>[    1.577329] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state extamp2-pullhigh fail -19
<3>[    1.577333] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state extamp2-pulllow fail -19
<3>[    1.577338] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state rcvspk-pullhigh fail -19
<3>[    1.577342] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state rcvspk-pulllow fail -19
<3>[    1.577346] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state hpdepop-pullhigh fail -19
<3>[    1.577351] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state hpdepop-pulllow fail -19
<3>[    1.577355] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_clk_mosi_pull_high fail -19
<3>[    1.577360] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_clk_mosi_pull_low fail -19
<3>[    1.577596] .(2)[1:swapper/0]Auddrv_Reg_map
<3>[    1.577892] .(2)[1:swapper/0][mt_idle_ntf] <00>ffffff8008a44e00 (audio_idle_notify_call)
<4>[    1.577933] .(2)[1:swapper/0]InitSramManager mBlocknum = 12 mAud_Sram_Manager.mSramLength = 49152 mAud_Sram_Manager.mBlockSize = 4096
<4>[    1.577944] .(2)[1:swapper/0]EnableI2SDivPower, bEnable = 0, Diveder_name 0
<4>[    1.577950] .(2)[1:swapper/0]EnableI2SDivPower, bEnable = 0, Diveder_name 1
<4>[    1.577955] .(2)[1:swapper/0]EnableI2SDivPower, bEnable = 0, Diveder_name 2
<4>[    1.577960] .(2)[1:swapper/0]EnableI2SDivPower, bEnable = 0, Diveder_name 3
<4>[    1.577965] .(2)[1:swapper/0]EnableI2SDivPower, bEnable = 0, Diveder_name 4
<4>[    1.577970] .(2)[1:swapper/0]EnableI2SDivPower, bEnable = 0, Diveder_name 5
<4>[    1.577975] .(2)[1:swapper/0]EnableI2SDivPower, bEnable = 0, Diveder_name 6
<4>[    1.577980] .(2)[1:swapper/0]EnableI2SDivPower, bEnable = 0, Diveder_name 7
<4>[    1.577985] .(2)[1:swapper/0]init_afe_ops
<4>[    1.578010] .(2)[1:swapper/0][ge_mt_soc_pcm_dl1] afe_irq_number=95
<4>[    1.578384] .(3)[21:kworker/3:0]bq27542_set_commands cmd = 0x12, val = 3892 
<4>[    1.578987] .(2)[1:swapper/0]mtk_soc_dummy_platform_init
<4>[    1.579521] .(3)[21:kworker/3:0]bq27542_set_commands cmd = 0x3c, val = 3850 
<4>[    1.580009] .(2)[1:swapper/0]mtk_dummy_probe
<4>[    1.580017] .(2)[1:swapper/0]mtk_dummy_probe: dev name mt-soc-dummy-pcm
<4>[    1.580150] .(2)[1:swapper/0]mtk_soc_routing_platform_init
<4>[    1.580859] .(3)[21:kworker/3:0]bq27542_set_commands cmd = 0xc, val = 4004 
<4>[    1.581054] .(2)[1:swapper/0]mtk_afe_routing_probe
<4>[    1.581060] .(2)[1:swapper/0]mtk_afe_routing_probe: dev name mt-soc-routing-pcm
<4>[    1.581196] .(2)[1:swapper/0]mtk_soc_capture2_platform_init
<4>[    1.582043] .(2)[1:swapper/0]mtk_capture2_probe
<4>[    1.582048] .(2)[1:swapper/0]mtk_capture2_probe: dev name mt-soc-ul2-pcm
<3>[    1.582779] .(2)[1:swapper/0]mtk_i2s2_adc2_probe: dev name mt-soc-i2s2_adc2-pcm
<4>[    1.582816] .(2)[1:swapper/0]mtk_soc_voice_platform_init()
<4>[    1.583575] .(2)[1:swapper/0]mtk_voice_probe(), dev name mt-soc-voicemd1
<4>[    1.583722] .(2)[1:swapper/0]mtk_soc_voice_md2_platform_init()
<4>[    1.584467] .(2)[1:swapper/0]mtk_voice_md2_probe(), dev name mt-soc-voicemd2
<6>[    1.584806] .(0)[6:kworker/u16:0][msdc]msdc0 -> !!! Set<400KHz> Source<371999KHz> -> sclk<399KHz> timing<0> mode<0> div<233> hs400_div_dis<0>
<4>[    1.589073] .(2)[1:swapper/0]mtk_I2S0dl1_soc_platform_init
<4>[    1.589812] .(2)[1:swapper/0]mtk_I2S0dl1_probe: dev name mt-soc-i2s0dl1-pcm
<4>[    1.589943] .(2)[1:swapper/0]mtk_soc_i2s0_awb_platform_init
<4>[    1.590705] .(2)[1:swapper/0]mtk_i2s0_awb_probe
<4>[    1.590711] .(2)[1:swapper/0]mtk_i2s0_awb_probe: dev name mt-soc-i2s0awb-pcm
<4>[    1.590831] .(2)[1:swapper/0]mtk_soc_uldlloopback_platform_init
<4>[    1.591553] .(2)[1:swapper/0]mtk_uldlloopback_probe
<4>[    1.591558] .(2)[1:swapper/0]mtk_uldlloopback_probe: dev name mt-soc-uldlloopback-pcm
<4>[    1.592436] .(2)[1:swapper/0]mtk_soc_dl2_probe: dev name mt-soc-dl2-pcm
<4>[    1.593469] .(2)[1:swapper/0]mtk_mrgrx_soc_platform_init
<4>[    1.594220] .(2)[1:swapper/0]mtk_mrgrx_probe
<4>[    1.594226] .(2)[1:swapper/0]mtk_mrgrx_probe: dev name mt-soc-mrgrx-pcm
<4>[    1.594363] .(2)[1:swapper/0]mtk_soc_mrgrx_awb_platform_init
<4>[    1.595090] .(2)[1:swapper/0]mtk_mrgrx_awb_probe
<4>[    1.595095] .(2)[1:swapper/0]mtk_mrgrx_awb_probe: dev name mt-soc-mrgrx-awb-pcm
<4>[    1.595226] .(2)[1:swapper/0]mtk_fm_i2s_soc_platform_init
<4>[    1.595945] .(2)[1:swapper/0]mtk_fm_i2s_probe
<4>[    1.595951] .(2)[1:swapper/0]mtk_fm_i2s_probe: dev name mt-soc-fm-i2s-pcm
<4>[    1.596836] .(2)[1:swapper/0]mtk_fm_i2s_awb_probe: dev name mt-soc-fm-i2s-awb-pcm
<4>[    1.598678] .(2)[1:swapper/0]mtk_soc_bt_dai_platform_init
<4>[    1.599412] .(2)[1:swapper/0]mtk_bt_dai_probe
<4>[    1.599417] .(2)[1:swapper/0]mtk_bt_dai_probe: dev name mt-soc-voip-bt-in
<4>[    1.599539] .(2)[1:swapper/0]mtk_dai_stub_init:
<4>[    1.600284] .(2)[1:swapper/0]mtk_dai_stub_dev_probe  name mt_soc_dai_name
<4>[    1.600290] .(2)[1:swapper/0]mtk_dai_stub_dev_probe: dev name mt-soc-dai-driver
<4>[    1.600350] .(2)[1:swapper/0]mtk_dai_stub_dev_probe: rc  = 0
<4>[    1.600452] .(2)[1:swapper/0]mtk_routing_init:
<5>[    1.601256] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<52> MSDC_INT_CMDTMO Arg<0x00000c00>
<4>[    1.601384] .(2)[1:swapper/0]mtk_routing_dev_probe  name mt_soc_routing_dai_name
<4>[    1.601391] .(2)[1:swapper/0]mtk_routing_dev_probe: dev name Routing-Control
<4>[    1.601540] .(2)[1:swapper/0]mtk_dummy_codec_init:
<5>[    1.601764] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<52> MSDC_INT_CMDTMO Arg<0x80000c08>
<4>[    1.602411] .(2)[1:swapper/0]mtk_dummy_codec_dev_probe: dev name mt-soc-dummy-codec
<6>[    1.605565] .(2)[1:swapper/0]mtk-audio 11220000.audio: mtk_spk_update_dai_link(), mtk_spk_type 0
<6>[    1.605575] .(2)[1:swapper/0]mtk-audio 11220000.audio: mtk_spk_update_dai_link(), ext_Speaker_Multimedia, codec dai name = snd-soc-dummy-dai, codec name = snd-soc-dummy
<5>[    1.605732] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<8> MSDC_INT_CMDTMO Arg<0x000001aa>
<6>[    1.605799] .(0)[4:kworker/0:0][msdc]msdc0 -> XXX CMD<8><0x1aa> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/0:0><0x4>
<5>[    1.606246] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    1.606739] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    1.607235] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    1.607731] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<4>[    1.608011] .(7)[1:swapper/0]mtk_voice_platform_probe()
<4>[    1.608034] .(7)[1:swapper/0]mtk_afe_uldlloopback_probe
<4>[    1.608090] .(7)[1:swapper/0]dummy_codec_probe()
<4>[    1.608140] .(7)[1:swapper/0]mtk_afe_mrgrx_probe
<4>[    1.608165] .(7)[1:swapper/0]mtk_afe_mrgrx_awb_probe
<5>[    1.608232] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<4>[    1.608509] .(7)[1:swapper/0]mtk_asoc_bt_dai_probe
<4>[    1.608575] .(7)[1:swapper/0]mtk_afe_capture2_probe
<4>[    1.608628] .(7)[1:swapper/0]mtk_i2s0_dl1_awb_probe
<4>[    1.608649] .(7)[1:swapper/0]mtk_voice_md2_platform_probe()
<4>[    1.608665] .(7)[1:swapper/0]mtk_afe_routing_platform_probe
<5>[    1.608726] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<4>[    1.608788] .(7)[1:swapper/0]mtk_afe_fm_i2s_probe
<4>[    1.608900] .(7)[1:swapper/0]mtk_asoc_pcm_btcvsd_tx_platform_probe
<4>[    1.608933] .(7)[1:swapper/0]mtk_i2s2_adc2_data_probe
<6>[    1.609133] .(7)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-tx-dai <-> mt-soc-dl1dai-driver mapping ok
<6>[    1.609200] .(7)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-rx-dai <-> mt-soc-ul1dai-driver mapping ok
<5>[    1.609222] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.609293] .(7)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voicemd1-dai <-> mt-soc-voicemd1dai-driver mapping ok
<6>[    1.609388] .(7)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-uldlloopback-dai <-> mt-soc-uldlloopbackdai-driver mapping ok
<6>[    1.609460] .(7)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-i2s0-dummy-dai-codec <-> mt-soc-i2s0dai-driver mapping ok
<6>[    1.609551] .(7)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-mrgrx-dai-codec <-> mt-soc-mrgrxdai-driver mapping ok
<6>[    1.609647] .(7)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-mrgrx-dummy-dai-codec <-> mt-soc-mrgrxdai-driver mapping ok
<6>[    1.609714] .(7)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-I2s0tx-dai <-> mt-soc-i2s0dl1dai-driver mapping ok
<5>[    1.609718] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.609782] .(7)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-deepbuffer-tx-dai <-> snd-soc-dummy-dai mapping ok
<6>[    1.609850] .(7)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-dl1awb-dai <-> mt-soc-dl1awbdai-driver mapping ok
<6>[    1.609914] .(7)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voicemd1-bt-dai <-> mt-soc-voicemd1-btdai-driver mapping ok
<6>[    1.609980] .(7)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voipcall-btout-dai <-> mt-soc-voipcall-btdai-out-driver mapping ok
<6>[    1.610048] .(7)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voipcall-btin-dai <-> mt-soc-voipcall-btdai-in-driver mapping ok
<6>[    1.610113] .(7)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-tdmrx-dai-codec <-> mt-soc-tdmrxdai-driver mapping ok
<6>[    1.610182] .(7)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-fmmrg2tx-dummy-dai-codec <-> mt-soc-fmmrgtxdai-driver mapping ok
<6>[    1.610250] .(7)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-rx-dai2 <-> mt-soc-ul2dai-driver mapping ok
<6>[    1.610315] .(7)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-i2s0awb-dai <-> mt-soc-i2s0awbdai-driver mapping ok
<6>[    1.610408] .(7)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voicemd2-dai <-> mt-soc-voicemd2dai-driver mapping ok
<6>[    1.610506] .(7)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-dummy-dai-codec <-> snd-soc-dummy-dai mapping ok
<6>[    1.610570] .(7)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voicemd2-bt-dai <-> mt-soc-voicemd2-btdai-driver mapping ok
<6>[    1.610635] .(7)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-hp-impedance-dai <-> mt-soc-hpimpedancedai-driver mapping ok
<6>[    1.610704] .(7)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-fm-i2s-dai-codec <-> mt-soc-fmi2S-driver mapping ok
<6>[    1.610771] .(7)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-fm-i2s-dummy-dai-codec <-> mt-soc-fmi2S-driver mapping ok
<6>[    1.610841] .(7)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-tx-dai2 <-> mt-soc-dl2dai-driver mapping ok
<6>[    1.610910] .(7)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-offload-dai <-> snd-soc-dummy-dai mapping ok
<6>[    1.611002] .(7)[1:swapper/0]mtk-audio 11220000.audio: snd-soc-dummy-dai <-> snd-soc-dummy-dai mapping ok
<6>[    1.611096] .(7)[1:swapper/0]mtk-audio 11220000.audio: snd-soc-dummy-dai <-> snd-soc-dummy-dai mapping ok
<6>[    1.611166] .(7)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-dummy-dai-codec <-> mt-soc-anc-record-dai-driver mapping ok
<6>[    1.611302] .(7)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voiceusb-dai <-> snd-soc-dummy-dai mapping ok
<6>[    1.611392] .(7)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voiceusb-echoref-dai <-> snd-soc-dummy-dai mapping ok
<6>[    1.611488] .(7)[1:swapper/0]mtk-audio 11220000.audio: snd-soc-dummy-dai <-> snd-soc-dummy-dai mapping ok
<6>[    1.611586] .(7)[1:swapper/0]mtk-audio 11220000.audio: snd-soc-dummy-dai <-> snd-soc-dummy-dai mapping ok
<6>[    1.611654] .(7)[1:swapper/0]mtk-audio 11220000.audio: snd-soc-dummy-dai <-> mt-soc-i2s2adc2dai-driver mapping ok
<4>[    1.611866] .(7)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create FM_I2S_Capture debugfs file
<4>[    1.611877] .(7)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create FM_I2S_Playback debugfs file
<4>[    1.611918] .(7)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create MRGRX_CAPTURE debugfs file
<4>[    1.611933] .(7)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create MRGRX_PLayback debugfs file
<4>[    1.611947] .(7)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create SCPVoice_PLayback debugfs file
<4>[    1.611963] .(7)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create I2S0_PLayback debugfs file
<4>[    1.611973] .(7)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create ULDL_Loopback debugfs file
<4>[    1.611986] .(7)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create Voice_MD2_PLayback debugfs file
<4>[    1.611996] .(7)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create Voice_MD1_PLayback debugfs file
<4>[    1.612060] .(7)[1:swapper/0]mt-soc-codec mt-soc-codec: ASoC: Failed to create MRGRX_PLayback debugfs file
<4>[    1.612077] .(7)[1:swapper/0]mt-soc-codec mt-soc-codec: ASoC: Failed to create ULDL_Loopback debugfs file
<4>[    1.612101] .(7)[1:swapper/0]mt-soc-codec mt-soc-codec: ASoC: Failed to create Voice_USB_EchoRef debugfs file
<4>[    1.612110] .(7)[1:swapper/0]mt-soc-codec mt-soc-codec: ASoC: Failed to create Voice_USB_PLayback debugfs file
<4>[    1.612120] .(7)[1:swapper/0]mt-soc-codec mt-soc-codec: ASoC: Failed to create Voice_MD2_PLayback debugfs file
<4>[    1.612130] .(7)[1:swapper/0]mt-soc-codec mt-soc-codec: ASoC: Failed to create Voice_MD1_PLayback debugfs file
<4>[    1.612184] .(7)[1:swapper/0]mt-soc-dummy-codec mt-soc-dummy-codec: ASoC: Failed to create MRGRX_PLayback debugfs file
<4>[    1.612197] .(7)[1:swapper/0]mt-soc-dummy-codec mt-soc-dummy-codec: ASoC: Failed to create MultiMedia_Routing debugfs file
<4>[    1.612231] .(7)[1:swapper/0]mt-soc-dummy-codec mt-soc-dummy-codec: ASoC: Failed to create MultiMedia_Routing debugfs file
<4>[    1.612248] .(7)[1:swapper/0]mt-soc-dummy-codec mt-soc-dummy-codec: ASoC: Failed to create Voice_MD2_PLayback debugfs file
<4>[    1.612257] .(7)[1:swapper/0]mt-soc-dummy-codec mt-soc-dummy-codec: ASoC: Failed to create Voice_MD1_PLayback debugfs file
<6>[    1.617593] .(6)[1:swapper/0]Mirror/redirect action on
<6>[    1.617615] .(6)[1:swapper/0]u32 classifier
<6>[    1.617618] .(6)[1:swapper/0]    Performance counters on
<6>[    1.617620] .(6)[1:swapper/0]    input device check on
<6>[    1.617622] .(6)[1:swapper/0]    Actions configured
<6>[    1.617637] .(6)[1:swapper/0]Netfilter messages via NETLINK v0.30.
<6>[    1.617679] .(6)[1:swapper/0]nf_conntrack version 0.5.0 (16384 buckets, 65536 max)
<6>[    1.618045] .(6)[1:swapper/0]ctnetlink v0.93: registering with nfnetlink.
<6>[    1.618485] .(6)[1:swapper/0]xt_time: kernel timezone is -0000
<6>[    1.618578] .(6)[1:swapper/0]ipip: IPv4 over IPv4 tunneling driver
<6>[    1.619061] .(6)[1:swapper/0]ip_tables: (C) 2000-2006 Netfilter Core Team
<6>[    1.619211] .(6)[1:swapper/0]arp_tables: (C) 2002 David S. Miller
<6>[    1.619266] .(6)[1:swapper/0]Initializing XFRM netlink socket
<6>[    1.619638] .(6)[1:swapper/0]NET: Registered protocol family 10
<6>[    1.622009] .(6)[1:swapper/0]mip6: Mobile IPv6
<6>[    1.622033] .(6)[1:swapper/0]ip6_tables: (C) 2000-2006 Netfilter Core Team
<6>[    1.622189] .(6)[1:swapper/0]sit: IPv6 over IPv4 tunneling driver
<6>[    1.622597] .(6)[1:swapper/0]NET: Registered protocol family 17
<6>[    1.622623] .(6)[1:swapper/0]NET: Registered protocol family 15
<6>[    1.622653] .(6)[1:swapper/0]bridge: automatic filtering via arp/ip/ip6tables has been deprecated. Update your scripts to load br_netfilter if you need this.
<5>[    1.622676] .(6)[1:swapper/0]Bridge firewalling registered
<6>[    1.622683] .(6)[1:swapper/0]8021q: 802.1Q VLAN Support v1.8
<6>[    1.623808] .(6)[1:swapper/0][cpu_ntf] <00>ffffff80080850d8 (fpsimd_cpu_hotplug_notifier)
<5>[    1.623898] .(6)[1:swapper/0]Registered cp15_barrier emulation handler
<5>[    1.625297] .(6)[1:swapper/0]Registered setend emulation handler
<6>[    1.625304] .(6)[1:swapper/0][cpu_ntf] <00>ffffff8008097260 (insn_cpu_hotplug_notify)
<6>[    1.625363] .(6)[1:swapper/0][cpu_ntf] <00>ffffff80080fe980 (cpu_hotplug_handler)
<6>[    1.626184] .(6)[1:swapper/0][cpu_ntf] <00>ffffff8008109b18 (console_cpu_notify)
<6>[    1.626218] .(6)[1:swapper/0]registered taskstats version 1
<6>[    1.626261] cma: cma usage create success.<6>[    1.627829] .(6)[1:swapper/0][Power/cpufreq] (0, 1, 0)
<6>[    1.628025] .(6)[1:swapper/0][Power/cpufreq] (0, 1, 0)
<6>[    1.628822] .(2)[6:kworker/u16:0][msdc]msdc2 -> !!! Set<400KHz> Source<185999KHz> -> sclk<397KHz> timing<0> mode<0> div<117> hs400_div_dis<0>
<6>[    1.629291] .(6)[1:swapper/0][Power/cpufreq] (0, 1, 0)
<6>[    1.630050] .(6)[1:swapper/0][cpu_ntf] <00>ffffff80089115b8 (cpufreq_cpu_callback)
<6>[    1.630063] .(6)[1:swapper/0][cpu_ntf] <00>ffffff800840db80 (_mt_cpufreq_cpu_CB)
<5>[    1.630068] .(6)[1:swapper/0][Power/PPM] DVFS table type = 0
<5>[    1.630069] .(6)[1:swapper/0][Power/PPM] DVFS table of cluster 0:
<5>[    1.630071] .(6)[1:swapper/0][Power/PPM] 0: 1508000 KHz
<5>[    1.630073] .(6)[1:swapper/0][Power/PPM] 1: 1482000 KHz
<5>[    1.630075] .(6)[1:swapper/0][Power/PPM] 2: 1430000 KHz
<5>[    1.630076] .(6)[1:swapper/0][Power/PPM] 3: 1404000 KHz
<5>[    1.630078] .(6)[1:swapper/0][Power/PPM] 4: 1365000 KHz
<5>[    1.630080] .(6)[1:swapper/0][Power/PPM] 5: 1300000 KHz
<5>[    1.630081] .(6)[1:swapper/0][Power/PPM] 6: 1235000 KHz
<5>[    1.630083] .(6)[1:swapper/0][Power/PPM] 7: 1183000 KHz
<5>[    1.630084] .(6)[1:swapper/0][Power/PPM] 8: 1105000 KHz
<5>[    1.630086] .(6)[1:swapper/0][Power/PPM] 9: 1001000 KHz
<5>[    1.630088] .(6)[1:swapper/0][Power/PPM] 10: 884000 KHz
<5>[    1.630089] .(6)[1:swapper/0][Power/PPM] 11: 793000 KHz
<5>[    1.630091] .(6)[1:swapper/0][Power/PPM] 12: 715000 KHz
<5>[    1.630093] .(6)[1:swapper/0][Power/PPM] 13: 624000 KHz
<5>[    1.630094] .(6)[1:swapper/0][Power/PPM] 14: 481000 KHz
<5>[    1.630096] .(6)[1:swapper/0][Power/PPM] 15: 338000 KHz
<5>[    1.630099] .(6)[1:swapper/0][Power/PPM] DVFS table type = 0
<5>[    1.630101] .(6)[1:swapper/0][Power/PPM] DVFS table of cluster 1:
<5>[    1.630103] .(6)[1:swapper/0][Power/PPM] 0: 2002000 KHz
<5>[    1.630108] .(6)[1:swapper/0][Power/PPM] 1: 1976000 KHz
<5>[    1.630109] .(6)[1:swapper/0][Power/PPM] 2: 1937000 KHz
<5>[    1.630111] .(6)[1:swapper/0][Power/PPM] 3: 1911000 KHz
<5>[    1.630112] .(6)[1:swapper/0][Power/PPM] 4: 1859000 KHz
<5>[    1.630114] .(6)[1:swapper/0][Power/PPM] 5: 1807000 KHz
<5>[    1.630116] .(6)[1:swapper/0][Power/PPM] 6: 1742000 KHz
<5>[    1.630117] .(6)[1:swapper/0][Power/PPM] 7: 1690000 KHz
<5>[    1.630119] .(6)[1:swapper/0][Power/PPM] 8: 1586000 KHz
<5>[    1.630120] .(6)[1:swapper/0][Power/PPM] 9: 1456000 KHz
<5>[    1.630122] .(6)[1:swapper/0][Power/PPM] 10: 1287000 KHz
<5>[    1.630124] .(6)[1:swapper/0][Power/PPM] 11: 1170000 KHz
<5>[    1.630125] .(6)[1:swapper/0][Power/PPM] 12: 1040000 KHz
<5>[    1.630127] .(6)[1:swapper/0][Power/PPM] 13: 910000 KHz
<5>[    1.630129] .(6)[1:swapper/0][Power/PPM] 14: 715000 KHz
<5>[    1.630130] .(6)[1:swapper/0][Power/PPM] 15: 520000 KHz
<4>[    1.630818] .(6)[1:swapper/0][Power/gpufreq] mt_gpufreq disabled by ptpod
<5>[    1.630964] .(6)[1:swapper/0][Power/PPM] (0x1)(-1)(0)(0-7)(10)(10)(4)(4) [(1)(10)(0)(-1)] (10)(10)(4)(4) [(1)(10)(0)(-1)] 
<4>[    1.633346] .(6)[1:swapper/0][Power/gpufreq] mt_gpufreq enabled by ptpod
<5>[    1.633357] .(6)[1:swapper/0][Power/PPM] (0x0)(-1)(0)(0-7)(15)(0)(4)(4) (15)(0)(4)(4) 
<6>[    1.635599] .(6)[1:swapper/0][HPS] hps_init
<6>[    1.635601] .(6)[1:swapper/0][HPS] hps_cpu_init
<6>[    1.635603] .(6)[1:swapper/0][HPS] [New algo.] hps_sys.cluster_num 2
<6>[    1.635608] .(6)[1:swapper/0][HPS] 0: func_id 3840, enabled 1
<6>[    1.635611] .(6)[1:swapper/0][HPS] 1: func_id 3841, enabled 1
<6>[    1.635613] .(6)[1:swapper/0][HPS] 2: func_id 3842, enabled 1
<6>[    1.636123] .(6)[1:swapper/0][HPS] hps_probe
<6>[    1.636151] .(6)[1:swapper/0][HPS] hps_core_init, setup_max_cpus ==> 8
<6>[    1.636228] .(6)[1:swapper/0][HPS] hps_task_start success, ptr: ffffffc05c32a000, pid: 244
<6>[    1.636237] .(1)[244:hps_main][HPS] hps_ctxt.init_state: 1
<6>[    1.636241] .(1)[244:hps_main][HPS] hps_ctxt.state: 0
<5>[    1.636242] .(6)[1:swapper/0][Power/PPM] @ppm_lcmoff_policy_init: register PPM_POLICY_LCM_OFF done!
<6>[    1.636243] .(1)[244:hps_main][HPS] hps_ctxt.enabled: 1
<6>[    1.636248] .(1)[244:hps_main][HPS] hps_ctxt.suspend_enabled: 1
<6>[    1.636251] .(1)[244:hps_main][HPS] hps_ctxt.is_hmp: 0
<6>[    1.636253] .(1)[244:hps_main][HPS] hps_ctxt.little_cpu_id_min: 0
<6>[    1.636255] .(1)[244:hps_main][HPS] hps_ctxt.little_cpu_id_max: 3
<6>[    1.636257] .(1)[244:hps_main][HPS] hps_ctxt.big_cpu_id_min: 4
<6>[    1.636259] .(1)[244:hps_main][HPS] hps_ctxt.big_cpu_id_max: 7
<6>[    1.636262] .(1)[244:hps_main]CPU request is 0x0
<5>[    1.636284] .(6)[1:swapper/0][Power/PPM] COBRA init done!
<6>[    1.636291] .(6)[1:swapper/0][cpu_ntf] <00>ffffff800842c260 (ppm_cpu_hotplug_callback)
<5>[    1.636299] .(6)[1:swapper/0][Power/PPM] power data init done!
<6>[    1.636985] .(6)[1:swapper/0][SPM] spm_base = ffffff800d5fe000, sleep_reg_md_base = ffffff800d71c000, spm_irq_0 = 36
<6>[    1.637296] .(6)[1:swapper/0][SPM] edge trigger irqs: 0, 25, 40, 149, 0, 44, 0
<6>[    1.637346] .(6)[1:swapper/0]#@# __spm_check_dram_type(538) __spmfw_idx 0x2
<6>[    1.638445] .(6)[1:swapper/0]#@# spm_module_init(663) is_ext_buck_exist() 0x0
<5>[    1.638546] .(6)[1:swapper/0][VcoreFS] spm_dvfsrc_register_init: dvfsrc_base = ffffff800d71e000
<5>[    1.638559] .(6)[1:swapper/0][VcoreFS] dram_issue: 0x0
<5>[    1.638570] .(6)[1:swapper/0][VcoreFS] curr_vcore_uv: 793750, curr_ddr_khz: 1866000
<5>[    1.638574] .(6)[1:swapper/0][VcoreFS] opp 0: vcore_uv: 793750, ddr_khz: 1866000
<5>[    1.638576] .(6)[1:swapper/0][VcoreFS] opp 1: vcore_uv: 793750, ddr_khz: 1600000
<5>[    1.638578] .(6)[1:swapper/0][VcoreFS] opp 2: vcore_uv: 725000, ddr_khz: 1600000
<5>[    1.638580] .(6)[1:swapper/0][VcoreFS] opp 3: vcore_uv: 725000, ddr_khz: 1200000
<5>[    1.638603] .(6)[1:swapper/0][VcoreFS] spm_vcorefs_pwarp_cmd: sspm
<5>[    1.638614] .(6)[1:swapper/0][VcoreFS] pcm_flag: 0x400
<6>[    1.640226] -(6)[1:swapper/0][SPM] IRQ0 HANDLER SHOULD NOT BE EXECUTED (0x10)
<5>[    1.640230] .(6)[1:swapper/0][VcoreFS] [spm_go_to_vcorefs] done
<5>[    1.640246] .(6)[1:swapper/0][VcoreFS] opp: 3, vcore: 725000 <= 793750, fddr: 1200000 <= 1866000 [O][O]
<5>[    1.640260] -(6)[1:swapper/0][VcoreFS] [spm_trigger_dvfs] fix: 0, opp: 3, vcore: 0x10000, emi: 0x90299, md: 0x0
<5>[    1.640264] .(6)[1:swapper/0][VcoreFS] [vcorefs_late_init_dvfs] late_init_opp: 3, sw_opp: 3 (4)
<5>[    1.640267] .(6)[1:swapper/0][VcoreFS] [vcorefs_drv_init] done
<4>[    1.640269] .(6)[1:swapper/0][MMDVFS][pid=1]mmdvfs service is disabled for vcore calibration
<4>[    1.640271] .(6)[1:swapper/0][pid=1]mmdvfs_notify_prepare_action: 0
<6>[    1.641736] .(0)[4:kworker/0:0]mmc0: MAN_BKOPS_EN bit is not set
<3>[    1.641743] .(0)[4:kworker/0:0][CQ] card support CMDQ
<3>[    1.641745] .(0)[4:kworker/0:0][CQ] cmdq depth 16
<6>[    1.646105] .(0)[4:kworker/0:0][msdc]msdc0 -> !!! Set<200000KHz> Source<371999KHz> -> sclk<185999KHz> timing<9> mode<0> div<0> hs400_div_dis<0>
<6>[    1.647155] .(0)[4:kworker/0:0][AUTOK]eMMC HS200 Tune
<5>[    1.649065] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<52> MSDC_INT_CMDTMO Arg<0x00000c00>
<5>[    1.649558] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<52> MSDC_INT_CMDTMO Arg<0x80000c08>
<6>[    1.650962] .(0)[4:kworker/0:0][AUTOK]CMD 0 	 31 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOO
<5>[    1.653508] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<8> MSDC_INT_CMDTMO Arg<0x000001aa>
<6>[    1.653542] .(0)[4:kworker/0:0][AUTOK]CMD 1 	 50 	 OXXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXX
<6>[    1.653548] .(0)[4:kworker/0:0][AUTOK]Analysis Result: 1T = 60
<6>[    1.653590] .(0)[4:kworker/0:0][AUTOK]dev status 0x00000900
<5>[    1.654004] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.654063] .(2)[229:kworker/2:2][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe5>
<5>[    1.654497] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.654560] .(2)[229:kworker/2:2][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe5>
<5>[    1.654993] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.655051] .(2)[229:kworker/2:2][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe5>
<5>[    1.655486] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.655549] .(2)[229:kworker/2:2][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe5>
<5>[    1.655984] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.656047] .(2)[229:kworker/2:2][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe5>
<5>[    1.656482] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.656546] .(2)[229:kworker/2:2][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe5>
<5>[    1.656981] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.657044] .(2)[229:kworker/2:2][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe5>
<5>[    1.657479] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.657542] .(2)[229:kworker/2:2][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe5>
<5>[    1.657977] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<1> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.658040] .(2)[229:kworker/2:2][msdc]msdc2 -> XXX CMD<1><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe5>
<6>[    1.658483] .(0)[4:kworker/0:0][AUTOK]DAT 0 	 33 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOO
<6>[    1.663002] .(0)[4:kworker/0:0][AUTOK]DAT 1 	 49 	 OXXXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXX
<6>[    1.663007] .(0)[4:kworker/0:0][AUTOK]Analysis Result: 1T = 62
<6>[    1.663045] .(0)[4:kworker/0:0][AUTOK]CMD [EDGE:0 CMD_FIFO_EDGE:0 DLY1:5 DLY2:0]
<6>[    1.663048] .(0)[4:kworker/0:0][AUTOK]DAT [RDAT_EDGE:0 RD_FIFO_EDGE:0 WD_FIFO_EDGE:0]
<6>[    1.663051] .(0)[4:kworker/0:0][AUTOK]DAT [LATCH_CK:0 DLY1:5 DLY2:0]
<6>[    1.663053] .(0)[4:kworker/0:0][AUTOK]DS  [DLY1:0 DLY2:0 DLY3:0]
<6>[    1.663056] .(0)[4:kworker/0:0][AUTOK]CLK TX  [0]
<6>[    1.663058] .(0)[4:kworker/0:0][AUTOK]CMD TX  [0]
<6>[    1.663060] .(0)[4:kworker/0:0][AUTOK]DAT TX  [D0:0 D1:0 D2:0 D3:0]
<6>[    1.663063] .(0)[4:kworker/0:0][AUTOK]DAT TX  [D4:0 D5:0 D6:0 D7:0]
<6>[    1.663068] .(0)[4:kworker/0:0][AUTOK][HS200]======Cost:15 ms======
<6>[    1.664106] .(0)[4:kworker/0:0][msdc]msdc0 -> !!! Set<52000KHz> Source<371999KHz> -> sclk<46499KHz> timing<9> mode<0> div<2> hs400_div_dis<0>
<6>[    1.667072] .(0)[4:kworker/0:0][msdc]msdc0 -> !!! Set<200000KHz> Source<371999KHz> -> sclk<185999KHz> timing<10> mode<3> div<0> hs400_div_dis<1>
<6>[    1.668130] .(0)[4:kworker/0:0][AUTOK]eMMC HS400 Tune
<6>[    1.670644] .(0)[4:kworker/0:0][AUTOK]CMD 0 	 33 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOO
<6>[    1.672035] .(0)[4:kworker/0:0][AUTOK]CMD 1 	 51 	 OOXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXX
<6>[    1.672039] .(0)[4:kworker/0:0][AUTOK]Analysis Result: 1T = 62
<6>[    1.672078] .(0)[4:kworker/0:0][AUTOK]device status 0x00000900
<6>[    1.672081] .(0)[4:kworker/0:0][AUTOK]CQ not enabled
<6>[    1.673850] .(0)[4:kworker/0:0][AUTOK]DLY1/2 0 	 24 	 XOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
<6>[    1.673890] .(0)[4:kworker/0:0][AUTOK]CMD [EDGE:0 CMD_FIFO_EDGE:0 DLY1:5 DLY2:0]
<6>[    1.673893] .(0)[4:kworker/0:0][AUTOK]DAT [RDAT_EDGE:0 RD_FIFO_EDGE:0 WD_FIFO_EDGE:0]
<6>[    1.673895] .(0)[4:kworker/0:0][AUTOK]DAT [LATCH_CK:0 DLY1:0 DLY2:0]
<6>[    1.673898] .(0)[4:kworker/0:0][AUTOK]DS  [DLY1:12 DLY2:0 DLY3:20]
<6>[    1.673900] .(0)[4:kworker/0:0][AUTOK]CLK TX  [0]
<6>[    1.673902] .(0)[4:kworker/0:0][AUTOK]CMD TX  [0]
<6>[    1.673904] .(0)[4:kworker/0:0][AUTOK]DAT TX  [D0:0 D1:0 D2:0 D3:0]
<6>[    1.673907] .(0)[4:kworker/0:0][AUTOK]DAT TX  [D4:0 D5:0 D6:0 D7:0]
<6>[    1.673912] .(0)[4:kworker/0:0][AUTOK][HS400]======Cost:5 ms======
<5>[    1.673920] .(0)[4:kworker/0:0][msdc]msdc0:disable mmc retune
<6>[    1.673944] .(6)[1:swapper/0]emmc autok
<5>[    1.674237] .(1)[1:swapper/0][VcoreFS] [AUTOK] kicker: KIR_AUTOK_EMMC, opp: 0, dvfs_opp: 0, sw_opp: 3
<5>[    1.674250] .(1)[1:swapper/0][VcoreFS] opp: 0, vcore: 793750 <= 725000, fddr: 1866000 <= 1200000 [O][O]
<5>[    1.674268] -(1)[1:swapper/0][VcoreFS] [spm_trigger_dvfs] fix: 1, opp: 0, vcore: 0x110000, emi: 0x200000, md: 0x0
<6>[    1.674312] .(0)[4:kworker/0:0]mmc0: new HS400 MMC card at address 0001
<6>[    1.674373] .(1)[1:swapper/0][AUTOK]eMMC HS400 Tune
<3>[    1.674565] .(0)[245:exe_cq][CQ] start cmdq thread
<6>[    1.674783] .(0)[4:kworker/0:0]mmcblk0: mmc0:0001 GD6BMB 29.1 GiB 
<6>[    1.675036] .(0)[4:kworker/0:0]mmcblk0boot0: mmc0:0001 GD6BMB partition 1 4.00 MiB
<6>[    1.676851] .(1)[1:swapper/0][AUTOK]CMD 0 	 37 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXXXXXOOOOOOOOOOOOOOO
<6>[    1.678256] .(1)[1:swapper/0][AUTOK]CMD 1 	 50 	 OOOXXXXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
<6>[    1.678262] .(1)[1:swapper/0][AUTOK]Analysis Result: 1T = 68
<6>[    1.678302] .(1)[1:swapper/0][AUTOK]device status 0x00000900
<6>[    1.678304] .(1)[1:swapper/0][AUTOK]CQ not enabled
<6>[    1.679315] .(0)[4:kworker/0:0]mmcblk0boot1: mmc0:0001 GD6BMB partition 2 4.00 MiB
<6>[    1.679570] .(0)[4:kworker/0:0]mmcblk0rpmb: mmc0:0001 GD6BMB partition 3 4.00 MiB
<6>[    1.680365] .(1)[1:swapper/0][AUTOK]DLY1/2 0 	 28 	 XOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
<6>[    1.680406] .(1)[1:swapper/0][AUTOK]CMD [EDGE:0 CMD_FIFO_EDGE:0 DLY1:8 DLY2:0]
<6>[    1.680409] .(1)[1:swapper/0][AUTOK]DAT [RDAT_EDGE:0 RD_FIFO_EDGE:0 WD_FIFO_EDGE:0]
<6>[    1.680411] .(1)[1:swapper/0][AUTOK]DAT [LATCH_CK:0 DLY1:0 DLY2:0]
<6>[    1.680414] .(1)[1:swapper/0][AUTOK]DS  [DLY1:14 DLY2:0 DLY3:20]
<6>[    1.680416] .(1)[1:swapper/0][AUTOK]CLK TX  [0]
<6>[    1.680418] .(1)[1:swapper/0][AUTOK]CMD TX  [0]
<6>[    1.680420] .(1)[1:swapper/0][AUTOK]DAT TX  [D0:0 D1:0 D2:0 D3:0]
<6>[    1.680423] .(1)[1:swapper/0][AUTOK]DAT TX  [D4:0 D5:0 D6:0 D7:0]
<6>[    1.680429] .(1)[1:swapper/0][AUTOK][HS400]======Cost:6 ms======
<5>[    1.680436] .(1)[1:swapper/0][VcoreFS] [AUTOK] kicker: KIR_AUTOK_EMMC, opp: 1, dvfs_opp: 1, sw_opp: 0
<5>[    1.680445] .(1)[1:swapper/0][VcoreFS] opp: 1, vcore: 793750 <= 793750, fddr: 1600000 <= 1866000 [O][O]
<5>[    1.680461] -(1)[1:swapper/0][VcoreFS] [spm_trigger_dvfs] fix: 1, opp: 1, vcore: 0x110000, emi: 0x100000, md: 0x0
<6>[    1.680507] .(1)[1:swapper/0]skip duplicated vcore autok
<5>[    1.680510] .(1)[1:swapper/0][VcoreFS] [AUTOK] kicker: KIR_AUTOK_EMMC, opp: 2, dvfs_opp: 2, sw_opp: 1
<5>[    1.680517] .(1)[1:swapper/0][VcoreFS] opp: 2, vcore: 725000 <= 793750, fddr: 1600000 <= 1600000 [O][O]
<5>[    1.680532] -(1)[1:swapper/0][VcoreFS] [spm_trigger_dvfs] fix: 1, opp: 2, vcore: 0x10000, emi: 0x100000, md: 0x0
<6>[    1.680563] .(1)[1:swapper/0][AUTOK]eMMC HS400 Tune
<6>[    1.683108] .(1)[1:swapper/0][AUTOK]CMD 0 	 32 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOO
<6>[    1.684503] .(1)[1:swapper/0][AUTOK]CMD 1 	 51 	 OOXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXX
<6>[    1.684507] .(1)[1:swapper/0][AUTOK]Analysis Result: 1T = 62
<6>[    1.684546] .(1)[1:swapper/0][AUTOK]device status 0x00000900
<6>[    1.684549] .(1)[1:swapper/0][AUTOK]CQ not enabled
<6>[    1.686371] .(1)[1:swapper/0][AUTOK]DLY1/2 0 	 24 	 XOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
<6>[    1.686409] .(1)[1:swapper/0][AUTOK]CMD [EDGE:0 CMD_FIFO_EDGE:0 DLY1:5 DLY2:0]
<6>[    1.686412] .(1)[1:swapper/0][AUTOK]DAT [RDAT_EDGE:0 RD_FIFO_EDGE:0 WD_FIFO_EDGE:0]
<6>[    1.686415] .(1)[1:swapper/0][AUTOK]DAT [LATCH_CK:0 DLY1:0 DLY2:0]
<6>[    1.686417] .(1)[1:swapper/0][AUTOK]DS  [DLY1:12 DLY2:0 DLY3:20]
<6>[    1.686419] .(1)[1:swapper/0][AUTOK]CLK TX  [0]
<6>[    1.686421] .(1)[1:swapper/0][AUTOK]CMD TX  [0]
<6>[    1.686423] .(1)[1:swapper/0][AUTOK]DAT TX  [D0:0 D1:0 D2:0 D3:0]
<6>[    1.686426] .(1)[1:swapper/0][AUTOK]DAT TX  [D4:0 D5:0 D6:0 D7:0]
<6>[    1.686431] .(1)[1:swapper/0][AUTOK][HS400]======Cost:5 ms======
<5>[    1.686434] .(1)[1:swapper/0][VcoreFS] [AUTOK] kicker: KIR_AUTOK_EMMC, opp: 3, dvfs_opp: 3, sw_opp: 2
<5>[    1.686442] .(1)[1:swapper/0][VcoreFS] opp: 3, vcore: 725000 <= 725000, fddr: 1200000 <= 1600000 [O][O]
<5>[    1.686456] -(1)[1:swapper/0][VcoreFS] [spm_trigger_dvfs] fix: 1, opp: 3, vcore: 0x10000, emi: 0x0, md: 0x0
<6>[    1.686503] .(1)[1:swapper/0]skip duplicated vcore autok
<6>[    1.686507] .(1)[1:swapper/0][AUTOK]CMD 0 	 32 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXXXXXXXXXXOOOOOOOOOOOOOOO merge
<6>[    1.686512] .(1)[1:swapper/0][AUTOK]CMD 1 	 47 	 OOXXXXXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXX merge
<6>[    1.686515] .(1)[1:swapper/0][AUTOK]cmd edge = 1 cmd dly = 37 max win = 46
<6>[    1.686530] .(1)[1:swapper/0][AUTOK]dat dly = 0
<6>[    1.686533] .(1)[1:swapper/0][AUTOK]DLY1/2 	 24 	 XOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX merge
<6>[    1.686543] .(1)[1:swapper/0][AUTOK]DS dly = 12
<6>[    1.686545] .(1)[1:swapper/0][AUTOK][merge]======Time Cost:0 ms======
<6>[    1.686547] .(1)[1:swapper/0][AUTOK]merge_value = 46
<6>[    1.686550] .(1)[1:swapper/0][AUTOK]merge_value = 23
<6>[    1.686587] .(1)[1:swapper/0][AUTOK]No need change para when dvfs
<5>[    1.686594] .(1)[1:swapper/0][VcoreFS] kicker: KIR_AUTOK_EMMC, opp: -1, dvfs_opp: 3, sw_opp: 3, kr opp: -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
<5>[    1.686598] .(1)[1:swapper/0][VcoreFS] [AUTOK] kicker: KIR_SYSFS, opp: 3, dvfs_opp: 3, sw_opp: 3
<5>[    1.686606] .(1)[1:swapper/0][VcoreFS] opp: 3, vcore: 725000 <= 725000, fddr: 1200000 <= 1200000 [O][O]
<5>[    1.686620] -(1)[1:swapper/0][VcoreFS] [spm_trigger_dvfs] fix: 0, opp: 3, vcore: 0x10000, emi: 0x90299, md: 0x0
<5>[    1.686633] .(1)[1:swapper/0][VcoreFS] EMMC autok done: Yes
<6>[    1.686636] .(1)[1:swapper/0]sd autok
<5>[    1.686638] .(1)[1:swapper/0][VcoreFS] SD autok done: Yes
<5>[    1.686641] .(1)[1:swapper/0][VcoreFS] SDIO autok done: Yes
<5>[    1.686643] .(1)[1:swapper/0][VcoreFS] [spm_vcorefs_init] DONE
<5>[    1.686647] .(1)[1:swapper/0][SPM] PWAKE_EN:1, PCMWDT_EN:1, BYPASS_SYSPWREQ:1
<3>[    1.686677] .(1)[1:swapper/0]BOOTPROF:      1686.676926:initcall: mt_spm_init    50.349462ms
<5>[    1.686730] .(3)[247:mmcqd/0]mmc0: set cmdq on
<6>[    1.686874] .(1)[1:swapper/0][Power/dcm] weak function of dcm_pre_init
<6>[    1.686878] .(1)[1:swapper/0][Power/dcm] [dcm_set_default]type:0x00000b87, init_dcm_type=0xb87, INIT_DCM_TYPE_BY_K=0x0
<6>[    1.686882] .(1)[1:swapper/0][Power/dcm] [     ARMCORE_DCM 0x00000001] current state:1 (0)
<6>[    1.686886] .(1)[1:swapper/0][Power/dcm] [      MCUSYS_DCM 0x00000002] current state:1 (0)
<6>[    1.686889] .(1)[1:swapper/0][Power/dcm] [       INFRA_DCM 0x00000004] current state:1 (0)
<6>[    1.686893] .(1)[1:swapper/0][Power/dcm] [       STALL_DCM 0x00000080] current state:1 (0)
<6>[    1.686896] .(1)[1:swapper/0][Power/dcm] [    BIG_CORE_DCM 0x00000100] current state:1 (0)
<6>[    1.686899] .(1)[1:swapper/0][Power/dcm] [    GIC_SYNC_DCM 0x00000200] current state:1 (0)
<6>[    1.686902] .(1)[1:swapper/0][Power/dcm] [         RGU_DCM 0x00000800] current state:1 (0)
<6>[    1.686911] .(1)[1:swapper/0][Power/dcm] 
<6>[    1.686911] ******** dcm dump register *********
<6>[    1.686914] .(1)[1:swapper/0][Power/dcm] MP0_CPUCFG_MP0_RGU_DCM_CONFIG (0xffffff800d72c088): 0x00000001
<6>[    1.686917] .(1)[1:swapper/0][Power/dcm] MP1_CPUCFG_MP1_RGU_DCM_CONFIG (0xffffff800d72c288): 0x00000001
<6>[    1.686921] .(1)[1:swapper/0][Power/dcm] L2C_SRAM_CTRL                 (0xffffff800d72c648): 0x000c0081
<6>[    1.686924] .(1)[1:swapper/0][Power/dcm] CCI_CLK_CTRL                  (0xffffff800d72c660): 0x00000117
<6>[    1.686927] .(1)[1:swapper/0][Power/dcm] BUS_FABRIC_DCM_CTRL           (0xffffff800d72c668): 0x00cd1ff3
<6>[    1.686930] .(1)[1:swapper/0][Power/dcm] MCU_MISC_DCM_CTRL             (0xffffff800d72c66c): 0x00000003
<6>[    1.686933] .(1)[1:swapper/0][Power/dcm] CCI_ADB400_DCM_CONFIG         (0xffffff800d72c740): 0x00000067
<6>[    1.686936] .(1)[1:swapper/0][Power/dcm] SYNC_DCM_CONFIG               (0xffffff800d72c744): 0x02976643
<6>[    1.686940] .(1)[1:swapper/0][Power/dcm] SYNC_DCM_CLUSTER_CONFIG       (0xffffff800d72c74c): 0x063f8f8f
<6>[    1.686943] .(1)[1:swapper/0][Power/dcm] MP_GIC_RGU_SYNC_DCM           (0xffffff800d72c758): 0x00000003
<6>[    1.686946] .(1)[1:swapper/0][Power/dcm] MP0_PLL_DIVIDER_CFG           (0xffffff800d72c7a0): 0x03110aff
<6>[    1.686949] .(1)[1:swapper/0][Power/dcm] MP1_PLL_DIVIDER_CFG           (0xffffff800d72c7a4): 0x03110aff
<6>[    1.686952] .(1)[1:swapper/0][Power/dcm] BUS_PLL_DIVIDER_CFG           (0xffffff800d72c7c0): 0x03100aff
<6>[    1.686955] .(1)[1:swapper/0][Power/dcm] MCSIA_DCM_EN                  (0xffffff800d72cb60): 0xffff0000
<6>[    1.686958] .(1)[1:swapper/0][Power/dcm] INFRA_BUS_DCM_CTRL            (0xffffff800d72a070): 0x40ff0603
<6>[    1.686961] .(1)[1:swapper/0][Power/dcm] PERI_BUS_DCM_CTRL             (0xffffff800d72a074): 0x747f83e3
<6>[    1.686964] .(1)[1:swapper/0][Power/dcm] MEM_DCM_CTRL                  (0xffffff800d72a078): 0x09af07c0
<6>[    1.686967] .(1)[1:swapper/0][Power/dcm] P2P_RX_CLK_ON                 (0xffffff800d72a0a0): 0x00000000
<6>[    1.686970] .(1)[1:swapper/0][Power/dcm] EMI_CONM                      (0xffffff8009e18060): 0x000005ff
<6>[    1.686973] .(1)[1:swapper/0][Power/dcm] EMI_CONN                      (0xffffff8009e18068): 0x00000000
<6>[    1.686977] .(1)[1:swapper/0][Power/dcm] CHN0_EMI_CHN_EMI_CONB         (0xffffff8009e1c008): 0x00ff2048
<6>[    1.686980] .(1)[1:swapper/0][Power/dcm] CHN1_EMI_CHN_EMI_CONB         (0xffffff8009e1e008): 0x00ff2048
<6>[    1.686983] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP1_DRAMC_PD_CTRL  (0xffffff8009e28038): 0xc0000107
<6>[    1.686986] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP1_CLKAR          (0xffffff8009e2803c): 0x02040000
<6>[    1.686989] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP1_DRAMC_PD_CTRL  (0xffffff8009e2c038): 0xc0000007
<6>[    1.686992] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP1_CLKAR          (0xffffff8009e2c03c): 0x02040000
<6>[    1.686995] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_MISC_CG_CTRL0  (0xffffff8009e34284): 0x00000110
<6>[    1.686998] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_MISC_CG_CTRL2  (0xffffff8009e3428c): 0x806003be
<6>[    1.687001] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_MISC_CTRL3     (0xffffff8009e342a8): 0x11351135
<6>[    1.687004] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU1_B0_DQ8    (0xffffff8009e34c20): 0x00007fff
<6>[    1.687007] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU1_B1_DQ8    (0xffffff8009e34ca0): 0x00207fff
<6>[    1.687011] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU1_CA_CMD8   (0xffffff8009e34d20): 0x00007fff
<6>[    1.687014] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU2_B0_DQ8    (0xffffff8009e35120): 0x00007fff
<6>[    1.687017] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU2_B1_DQ8    (0xffffff8009e351a0): 0x00207fff
<6>[    1.687020] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU2_CA_CMD8   (0xffffff8009e35220): 0x00007fff
<6>[    1.687024] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU3_B0_DQ8    (0xffffff8009e35620): 0x00007fff
<6>[    1.687027] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU3_B1_DQ8    (0xffffff8009e356a0): 0x00207fff
<6>[    1.687030] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU3_CA_CMD8   (0xffffff8009e35720): 0x00007fff
<6>[    1.687033] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU4_B0_DQ8    (0xffffff8009e35b20): 0x00000000
<6>[    1.687036] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU4_B1_DQ8    (0xffffff8009e35ba0): 0x00000000
<6>[    1.687039] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU4_CA_CMD8   (0xffffff8009e35c20): 0x00000000
<6>[    1.687043] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_MISC_CG_CTRL0  (0xffffff8009e38284): 0x00100010
<6>[    1.687046] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_MISC_CG_CTRL2  (0xffffff8009e3828c): 0x806003be
<6>[    1.687049] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_MISC_CTRL3     (0xffffff8009e382a8): 0x11351135
<6>[    1.687052] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU1_B0_DQ8    (0xffffff8009e38c20): 0x00207fff
<6>[    1.687055] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU1_B1_DQ8    (0xffffff8009e38ca0): 0x00207fff
<6>[    1.687058] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU1_CA_CMD8   (0xffffff8009e38d20): 0x00207fff
<6>[    1.687061] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU2_B0_DQ8    (0xffffff8009e39120): 0x00207fff
<6>[    1.687064] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU2_B1_DQ8    (0xffffff8009e391a0): 0x00207fff
<6>[    1.687068] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU2_CA_CMD8   (0xffffff8009e39220): 0x00207fff
<6>[    1.687071] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU3_B0_DQ8    (0xffffff8009e39620): 0x00207fff
<6>[    1.687074] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU3_B1_DQ8    (0xffffff8009e396a0): 0x00207fff
<6>[    1.687077] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU3_CA_CMD8   (0xffffff8009e39720): 0x00207fff
<6>[    1.687080] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU4_B0_DQ8    (0xffffff8009e39b20): 0x00000000
<6>[    1.687083] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU4_B1_DQ8    (0xffffff8009e39ba0): 0x00000000
<6>[    1.687086] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU4_CA_CMD8   (0xffffff8009e39c20): 0x00000000
<6>[    1.687103] .(1)[1:swapper/0][cpu_ntf] <00>ffffff800843f9e8 (dcm_hotplug_nc)
<4>[    1.687123] .(1)[1:swapper/0]mcdi_init
<6>[    1.687128] .(1)[1:swapper/0][cpu_ntf] <00>ffffff8008443348 (mcdi_cpu_callback)
<6>[    1.687132] .(1)[1:swapper/0][cpu_ntf] <00>ffffff80084432d0 (mcdi_cpu_callback_leave_hotplug)
<3>[    1.687173] .(1)[1:swapper/0]set_mcdi_s_state = 5
<5>[    1.687229] .(1)[1:swapper/0][Power/cpufreq] is_lp3 = 1
<6>[    1.687290] .(1)[1:swapper/0][cpu_ntf] <00>ffffff80084474d8 (cpu_hotplug_handler)
<6>[    1.687441] .(2)[1:swapper/0]sched_hint_init: failed to set sched_fifo
<3>[    1.687715] .(5)[1:swapper/0][ALS/PS] stk3x1x_i2c_probe: driver version: 3.9.2 20170630
<4>[    1.687729] .(5)[1:swapper/0]client->addr======48
<4>[    1.687731] .(5)[1:swapper/0]client->addr======48
<3>[    1.687866] .(1)[1:swapper/0][ALS/PS] stk3x1x_init_client: In
<3>[    1.687871] .(1)[1:swapper/0][ALS/PS] stk3x1x_write_sw_reset: In
<6>[    1.694713] .(0)[4:kworker/0:0] mmcblk0: p1 p2 p3 p4 p5 p6 p7 p8 p9 p10 p11 p12 p13 p14 p15 p16 p17 p18 p19 p20 p21 p22 p23 p24 p25 p26 p27 p28 p29 p30 p31 p32 p33 p34 p35 p36 p37 p38
<6>[    1.696849] .(2)[229:kworker/2:2][msdc]msdc2 -> !!! Set<300KHz> Source<185999KHz> -> sclk<299KHz> timing<0> mode<0> div<155> hs400_div_dis<0>
<3>[    1.697900] .(0)[4:kworker/0:0]BOOTPROF:      1697.899926:probe: probe=mmc_bus_probe drv=mmcblk(ffffff80096ccf70)    23.413769ms
<3>[    1.708821] .(1)[1:swapper/0][ALS/PS] stk3x1x_read_id: PID=0x15, VID=0xca
<3>[    1.716007] .(1)[1:swapper/0][ALS/PS] stk3x1x_otp_read_byte_data: 0x25=0x0
<5>[    1.717185] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<52> MSDC_INT_CMDTMO Arg<0x00000c00>
<3>[    1.717318] .(1)[1:swapper/0][ALS/PS] stk3x1x_read_id: p_wv_r_bd_with_co = 0x0
<3>[    1.717322] .(1)[1:swapper/0][ALS/PS] stk3x1x_read_id: p_1x_r_bd_with_co = 0x0
<3>[    1.717325] .(1)[1:swapper/0][ALS/PS] stk3x1x_read_id: p_19_r_bc = 0x0
<5>[    1.717841] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<52> MSDC_INT_CMDTMO Arg<0x80000c08>
<3>[    1.721968] .(1)[1:swapper/0][ALS/PS] stk3x1x_i2c_probe: state_val=0x0, psctrl_val=0x31, alsctrl_val=0x39, ledctrl_val=0xff, wait_val=0xf, int_val=0x1
<3>[    1.721974] .(1)[1:swapper/0][ALS/PS] stk3x1x_i2c_probe() OK!
<3>[    1.721976] .(1)[1:swapper/0][ALS/PS] stk3x1x_i2c_probe: OK
<3>[    1.721991] .(1)[1:swapper/0]BOOTPROF:      1721.990542:probe: probe=i2c_device_probe drv=stk3x1x(ffffff800965ac98)    34.272462ms
<5>[    1.722098] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<8> MSDC_INT_CMDTMO Arg<0x000001aa>
<3>[    1.722110] .(1)[1:swapper/0]BOOTPROF:      1722.110388:initcall: alsps_init    34.602231ms
<4>[    1.722360] .(3)[1:swapper/0][Gsensor] gsensor_local_init
<4>[    1.722435] .(3)[1:swapper/0][Gsensor] bma2xx_i2c_probe
<4>[    1.722444] .(3)[1:swapper/0][Gsensor] bma2xx_init_client
<5>[    1.722748] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.722829] .(2)[229:kworker/2:2][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe5>
<6>[    1.723072] .(3)[1:swapper/0]i2c i2c-1: addr: 18, transfer ACK error
<6>[    1.723078] .(3)[1:swapper/0]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    1.723081] .(3)[1:swapper/0]I2C structure:
<3>[    1.723081] [I2C]Clk=13650000,Id=1,Op=3,Irq_stat=3,Total_len=1
<3>[    1.723081] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=1,speed=400000
<3>[    1.723081] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    1.723088] .(3)[1:swapper/0]base address 0xffffff800bf40000
<6>[    1.723097] .(3)[1:swapper/0]I2C register:
<6>[    1.723097] [I2C]SLAVE_ADDR=30,INTR_MASK=0,INTR_STAT=0,CONTROL=3a,TRANSFER_LEN=1
<6>[    1.723097] [I2C]TRANSAC_LEN=2,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[    1.723097] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=1
<6>[    1.723104] .(3)[1:swapper/0]before enable DMA register(0x0):
<6>[    1.723104] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.723104] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.723104] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=0
<6>[    1.723104] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.723114] .(3)[1:swapper/0]DMA register(0xffffff800bf42380):
<6>[    1.723114] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.723114] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.723114] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=2
<6>[    1.723114] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.723120] .(3)[1:swapper/0]i2c_dump_info ------------------------------------------
<3>[    1.723124] .(3)[1:swapper/0]i2c i2c-1: last transfer info:
<3>[    1.723127] .(3)[1:swapper/0]i2c i2c-1: [00] [    1.723068] SLAVE_ADDR=30,INTR_STAT=3,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.723133] .(3)[1:swapper/0]i2c i2c-1: [01] [    1.721602] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.723138] .(3)[1:swapper/0]i2c i2c-1: [02] [    1.720960] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.723144] .(3)[1:swapper/0]i2c i2c-1: [03] [    1.720852] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=499
<3>[    1.723149] .(3)[1:swapper/0]i2c i2c-1: [04] [    1.719873] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.723155] .(3)[1:swapper/0]i2c i2c-1: [05] [    1.719766] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.723160] .(3)[1:swapper/0]i2c i2c-1: [06] [    1.718561] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.723166] .(3)[1:swapper/0]i2c i2c-1: [07] [    1.718454] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.723171] .(3)[1:swapper/0]i2c i2c-1: [08] [    1.717435] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.723177] .(3)[1:swapper/0]i2c i2c-1: [09] [    1.717315] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=499
<4>[    1.723194] .(3)[1:swapper/0][Gsensor] bma_i2c_read_block 572 : i2c_transfer error: (0 ffffffc04015bab8 1) -121
<4>[    1.723199] [Gsensor] BMA2XX_CheckDeviceID 1139 : BMA2XX_CheckDeviceID -1 failt!
<4>[    1.723199]  .(3)[1:swapper/0][Gsensor] bma2xx_i2c_probe 2680 : bma2xx_device init cilent fail time: 0
<4>[    1.723205] .(3)[1:swapper/0][Gsensor] bma2xx_init_client
<5>[    1.723415] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.723498] .(2)[229:kworker/2:2][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe5>
<6>[    1.724044] .(3)[1:swapper/0]i2c i2c-1: addr: 18, transfer ACK error
<6>[    1.724048] .(3)[1:swapper/0]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    1.724050] .(3)[1:swapper/0]I2C structure:
<3>[    1.724050] [I2C]Clk=13650000,Id=1,Op=3,Irq_stat=3,Total_len=1
<3>[    1.724050] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=1,speed=400000
<3>[    1.724050] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    1.724056] .(3)[1:swapper/0]base address 0xffffff800bf40000
<6>[    1.724065] .(3)[1:swapper/0]I2C register:
<6>[    1.724065] [I2C]SLAVE_ADDR=30,INTR_MASK=0,INTR_STAT=0,CONTROL=3a,TRANSFER_LEN=1
<6>[    1.724065] [I2C]TRANSAC_LEN=2,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[    1.724065] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=1
<6>[    1.724071] .(3)[1:swapper/0]before enable DMA register(0x0):
<6>[    1.724071] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.724071] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.724071] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=0
<6>[    1.724071] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<5>[    1.724071] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.724080] .(3)[1:swapper/0]DMA register(0xffffff800bf42380):
<6>[    1.724080] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.724080] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.724080] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=2
<6>[    1.724080] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.724086] .(3)[1:swapper/0]i2c_dump_info ------------------------------------------
<3>[    1.724089] .(3)[1:swapper/0]i2c i2c-1: last transfer info:
<3>[    1.724092] .(3)[1:swapper/0]i2c i2c-1: [00] [    1.724043] SLAVE_ADDR=30,INTR_STAT=3,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.724098] .(3)[1:swapper/0]i2c i2c-1: [01] [    1.723068] SLAVE_ADDR=30,INTR_STAT=3,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.724103] .(3)[1:swapper/0]i2c i2c-1: [02] [    1.721602] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.724109] .(3)[1:swapper/0]i2c i2c-1: [03] [    1.720960] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.724114] .(3)[1:swapper/0]i2c i2c-1: [04] [    1.720852] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=499
<3>[    1.724120] .(3)[1:swapper/0]i2c i2c-1: [05] [    1.719873] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.724125] .(3)[1:swapper/0]i2c i2c-1: [06] [    1.719766] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.724131] .(3)[1:swapper/0]i2c i2c-1: [07] [    1.718561] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.724136] .(3)[1:swapper/0]i2c i2c-1: [08] [    1.718454] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.724142] .(3)[1:swapper/0]i2c i2c-1: [09] [    1.717435] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<4>[    1.724158] .(3)[1:swapper/0][Gsensor] bma_i2c_read_block 572 : i2c_transfer error: (0 ffffffc04015bab8 1) -121
<6>[    1.724158] .(2)[229:kworker/2:2][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe5>
<4>[    1.724162] [Gsensor] BMA2XX_CheckDeviceID 1139 : BMA2XX_CheckDeviceID -1 failt!
<4>[    1.724162]  .(3)[1:swapper/0][Gsensor] bma2xx_i2c_probe 2680 : bma2xx_device init cilent fail time: 1
<4>[    1.724170] .(3)[1:swapper/0][Gsensor] bma2xx_init_client
<6>[    1.724238] .(3)[1:swapper/0]i2c i2c-1: addr: 18, transfer ACK error
<6>[    1.724242] .(3)[1:swapper/0]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    1.724244] .(3)[1:swapper/0]I2C structure:
<3>[    1.724244] [I2C]Clk=13650000,Id=1,Op=3,Irq_stat=3,Total_len=1
<3>[    1.724244] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=1,speed=400000
<3>[    1.724244] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    1.724250] .(3)[1:swapper/0]base address 0xffffff800bf40000
<6>[    1.724259] .(3)[1:swapper/0]I2C register:
<6>[    1.724259] [I2C]SLAVE_ADDR=30,INTR_MASK=0,INTR_STAT=0,CONTROL=3a,TRANSFER_LEN=1
<6>[    1.724259] [I2C]TRANSAC_LEN=2,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[    1.724259] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=1
<6>[    1.724265] .(3)[1:swapper/0]before enable DMA register(0x0):
<6>[    1.724265] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.724265] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.724265] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=0
<6>[    1.724265] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.724275] .(3)[1:swapper/0]DMA register(0xffffff800bf42380):
<6>[    1.724275] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.724275] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.724275] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=2
<6>[    1.724275] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.724281] .(3)[1:swapper/0]i2c_dump_info ------------------------------------------
<3>[    1.724284] .(3)[1:swapper/0]i2c i2c-1: last transfer info:
<3>[    1.724287] .(3)[1:swapper/0]i2c i2c-1: [00] [    1.724237] SLAVE_ADDR=30,INTR_STAT=3,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.724292] .(3)[1:swapper/0]i2c i2c-1: [01] [    1.724043] SLAVE_ADDR=30,INTR_STAT=3,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.724298] .(3)[1:swapper/0]i2c i2c-1: [02] [    1.723068] SLAVE_ADDR=30,INTR_STAT=3,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.724303] .(3)[1:swapper/0]i2c i2c-1: [03] [    1.721602] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.724309] .(3)[1:swapper/0]i2c i2c-1: [04] [    1.720960] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.724315] .(3)[1:swapper/0]i2c i2c-1: [05] [    1.720852] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=499
<3>[    1.724320] .(3)[1:swapper/0]i2c i2c-1: [06] [    1.719873] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.724326] .(3)[1:swapper/0]i2c i2c-1: [07] [    1.719766] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.724331] .(3)[1:swapper/0]i2c i2c-1: [08] [    1.718561] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.724337] .(3)[1:swapper/0]i2c i2c-1: [09] [    1.718454] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<4>[    1.724353] .(3)[1:swapper/0][Gsensor] bma_i2c_read_block 572 : i2c_transfer error: (0 ffffffc04015bab8 1) -121
<4>[    1.724357] [Gsensor] BMA2XX_CheckDeviceID 1139 : BMA2XX_CheckDeviceID -1 failt!
<4>[    1.724357]  .(3)[1:swapper/0][Gsensor] bma2xx_i2c_probe 2680 : bma2xx_device init cilent fail time: 2
<4>[    1.724362] .(3)[1:swapper/0][Gsensor] bma2xx_i2c_probe 2771 : bma2xx_i2c_probe: err = -1
<4>[    1.724374] .(3)[1:swapper/0]BMA2XX: probe of 1-0018 failed with error -1
<6>[    1.724604] .(3)[1:swapper/0]input: low_g as /devices/virtual/input/input4
<4>[    1.724665] .(3)[1:swapper/0][hall]kpd_low_g_dev register : success!!
<5>[    1.724731] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.724808] .(2)[229:kworker/2:2][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe5>
<3>[    1.724814] .(3)[1:swapper/0][Gsensor] bmi160_acc_i2c_probe: is begin.
<5>[    1.725395] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.725479] .(2)[229:kworker/2:2][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe5>
<5>[    1.726052] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.726128] .(2)[229:kworker/2:2][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe5>
<5>[    1.726701] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.726778] .(2)[229:kworker/2:2][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe5>
<5>[    1.727351] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.727428] .(2)[229:kworker/2:2][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe5>
<5>[    1.728005] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<1> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.728089] .(2)[229:kworker/2:2][msdc]msdc2 -> XXX CMD<1><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe5>
<4>[    1.737993] -(0)[231:dc_trim_thread]mt6356_get_auxadc_value: 23 callbacks suppressed
<3>[    1.756609] .(3)[1:swapper/0][Gsensor] check chip id d3 successfully.
<6>[    1.764847] .(2)[229:kworker/2:2][msdc]msdc2 -> !!! Set<260KHz> Source<185999KHz> -> sclk<259KHz> timing<0> mode<0> div<179> hs400_div_dis<0>
<5>[    1.781268] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<52> MSDC_INT_CMDTMO Arg<0x00000c00>
<5>[    1.782018] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<52> MSDC_INT_CMDTMO Arg<0x80000c08>
<3>[    1.782307] .(0)[6:kworker/u16:0][ALS/PS] stk_tune_zero_get_ps_data: ps #0=39
<5>[    1.786472] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<8> MSDC_INT_CMDTMO Arg<0x000001aa>
<5>[    1.787223] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.787308] .(2)[229:kworker/2:2][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe5>
<5>[    1.787966] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.788058] .(2)[229:kworker/2:2][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe5>
<5>[    1.788716] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.788809] .(2)[229:kworker/2:2][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe5>
<5>[    1.789467] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.789560] .(2)[229:kworker/2:2][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe5>
<5>[    1.790221] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.790310] .(2)[229:kworker/2:2][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe5>
<3>[    1.790627] .(3)[1:swapper/0][Gsensor] set bandwidth = 9 ok.
<5>[    1.790968] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.791061] .(2)[229:kworker/2:2][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe5>
<5>[    1.791723] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.791812] .(2)[229:kworker/2:2][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe5>
<5>[    1.792473] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.792562] .(2)[229:kworker/2:2][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe5>
<5>[    1.793224] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<1> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.793313] .(2)[229:kworker/2:2][msdc]msdc2 -> XXX CMD<1><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe5>
<3>[    1.814627] .(3)[1:swapper/0][Gsensor] [bmi160_acc_set_osr4] acc_bmp = 0, acc_us = 0 ok.
<3>[    1.834625] .(3)[1:swapper/0][Gsensor] bmi160_acc_set_data_range(0x5)
<3>[    1.840609] .(3)[1:swapper/0][Gsensor] bmi160_acc_set_resolution: 8192
<3>[    1.843432] .(1)[6:kworker/u16:0][ALS/PS] stk_tune_zero_get_ps_data: ps #1=40
<3>[    1.866622] .(3)[1:swapper/0][Gsensor] bmi160 set interrupt enable = 0 ok.
<5>[    1.900646] .(1)[6:kworker/u16:0][MUSB]do_register_otg_work 75: register OTG <ffffffc05c310018> ok
<3>[    1.902716] .(3)[1:swapper/0][Gsensor] set power mode enable = 0 ok!
<3>[    1.902725] .(1)[6:kworker/u16:0][ALS/PS] stk_tune_zero_get_ps_data: ps #2=40
<3>[    1.902731] .(3)[1:swapper/0][Gsensor] bmi160 acc init OK.
<3>[    1.964652] .(1)[6:kworker/u16:0][ALS/PS] stk_tune_zero_get_ps_data: ps #3=40
<4>[    2.008686] .(3)[1:swapper/0]0x51,reg_data[0]=8
<4>[    2.016674] .(3)[1:swapper/0]0x5c,reg_data[0]=129
<3>[    2.022860] .(1)[6:kworker/u16:0][ALS/PS] stk_tune_zero_get_ps_data: ps #4=40
<4>[    2.024688] .(3)[1:swapper/0]0x5a,reg_data[0]=7
<3>[    2.027070] .(1)[6:kworker/u16:0][ALS/PS] stk_ps_tune_zero_final: set HT=64,LT=54
<4>[    2.032687] .(3)[1:swapper/0]0x5b,reg_data[0]=48
<4>[    2.040674] .(3)[1:swapper/0]0x53,reg_data[0]=9
<4>[    2.048675] .(3)[1:swapper/0]0x55,reg_data[0]=1
<3>[    2.048688] .(3)[1:swapper/0][Gsensor] bmi160_acc_i2c_probe: is ok.
<3>[    2.048732] .(3)[1:swapper/0]BOOTPROF:      2048.731619:probe: probe=i2c_device_probe drv=bmi160_acc(ffffff800965bdf0)   324.232155ms
<3>[    2.049002] .(3)[1:swapper/0][Gsensor] bmi160 acc local init.
<3>[    2.049031] .(3)[1:swapper/0]BOOTPROF:      2049.030389:initcall: acc_init   326.851616ms
<4>[    2.049700] .(3)[1:swapper/0]guozhiliang BMG160 addr=68
<4>[    2.050679] .(3)[1:swapper/0]unknown gyroscope
<4>[    2.050691] .(3)[1:swapper/0]get chip type failed, err = -1
<4>[    2.050702] .(3)[1:swapper/0]err = -1
<4>[    2.050731] .(3)[1:swapper/0]bmg160: probe of 1-0068 failed with error -1
<6>[    2.197662] .(0)[231:dc_trim_thread][accdet_init]start --->
<6>[    2.200728] .(0)[231:dc_trim_thread][accdet_init_once]-0 ACCDET_INIT0_ONCE done--->
<6>[    2.200778] .(0)[231:dc_trim_thread][accdet_init_once] ACCDET_INIT1_ONCE done--->
<6>[    2.200792] .(0)[231:dc_trim_thread][accdet_efuse]efuse=0xf1fc,adc_offset=-2 mv
<3>[    2.213341] .(0)[1:swapper/0]BOOTPROF:      2213.339927:probe: probe=i2c_device_probe drv=bmi160_gyro(ffffff800965c280)   162.326001ms
<3>[    2.213571] .(0)[1:swapper/0]BOOTPROF:      2213.570235:initcall: gyro_init   164.496538ms
<4>[    2.214172] .(2)[1:swapper/0]<<-MMC3630X INFO->> mmc3630x_i2c_probe: enter probe,driver version=V80.97.01.10
<4>[    2.214172] 
<4>[    2.214195] .(2)[1:swapper/0]<<-MMC3630X INFO->> direction =4
<4>[    2.214195] 
<4>[    2.229466] .(2)[1:swapper/0]<<-MMC3630X INFO->> [mmc3630x] product_id[0] = 10
<4>[    2.229466] 
<4>[    2.233247] .(2)[1:swapper/0]<<-MMC3630X INFO->> memsic otp matrix = 1000 994 1244
<4>[    2.233247] 
<4>[    2.254261] .(2)[1:swapper/0]<<-MMC3630X INFO->> mmc3630X IIC probe successful !
<3>[    2.254294] .(2)[1:swapper/0]BOOTPROF:      2254.294004:probe: probe=i2c_device_probe drv=mmc3630x(ffffff800965c7b8)    40.113923ms
<3>[    2.254520] .(2)[1:swapper/0]BOOTPROF:      2254.519774:initcall: mag_init    40.903846ms
<5>[    2.254560] -(2)[1:swapper/0]mtk_rtc_hal_common: RTC_IRQ_EN = 0xc, RTC_PDN1 = 0x200
<5>[    2.254574] -(2)[1:swapper/0]mtk_rtc_hal_common: rtc_spare_reg[12] = {a38, 1, 6}
<5>[    2.254591] .(2)[1:swapper/0]mtk_rtc_common: There is no Crystal
<5>[    2.254848] .(2)[229:kworker/2:2][MUSB]usb20_check_vbus_on 136: vbus_on<0>
<4>[    2.254896] .(2)[229:kworker/2:2]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<3>[    2.254917] .(2)[229:kworker/2:2]do_charger_detect charger IN
<3>[    2.255045] .(2)[1:swapper/0]memory-lowpower: memory-lowpower cma is not inited
<3>[    2.258472] .(2)[1:swapper/0][DRAMC] calibration time optimized
<6>[    2.261418] .(2)[1:swapper/0]flashlights_mt6370: mt6370_parse_dt: Parse no dt, node.
<6>[    2.261873] .(2)[1:swapper/0]flashlight: flashlight_dev_register: flashlights-mt6370 0 0 0
<6>[    2.261895] .(2)[1:swapper/0]flashlight: flashlight_dev_register: flashlights-mt6370 0 1 0
<5>[    2.263365] .(2)[1:swapper/0]log store:sram_dram_buff addr 0x7ff80000, size 0x40000.
<1>[    2.263620] .(2)[1:swapper/0][PHY layout]log_store_mem   :   0x7ff80000 - 0x7ffbffff (0x40000)
<5>[    2.263642] .(2)[1:swapper/0]log_store: log buff 0xffffff800d780000, sig 0xcdab3412
<5>[    2.263653] .(2)[1:swapper/0]buff_size 0x40000
<5>[    2.263662] .(2)[1:swapper/0]pl off 0x20, sz 0x30fa
<5>[    2.263671] .(2)[1:swapper/0]lk off 0x311a, sz 0x26ec5
<5>[    2.263681] .(2)[1:swapper/0]flag p 0xc, l 0xc
<3>[    2.263726] .(2)[1:swapper/0]memory-ssvp: [INIT FAIL]: cma is not inited
<3>[    2.263748] .(2)[1:swapper/0]memory-ssvp: SSVP sanity fail
<2>[    2.269210] .(2)[1:swapper/0][SOC FBC]Start to init FBC driver
<2>[    2.274301] .(2)[1:swapper/0][SOC FBC]init FBC driver done
<4>[    2.277145] .(2)[1:swapper/0][Thermal/TC/bcct]mtkcooler_bcct_late_init
<4>[    2.278314] .(2)[1:swapper/0][Thermal/TC/bcct]mtkcooler_bcct_pdrv_probe
<6>[    2.278684] .(0)[6:kworker/u16:0]mtk-tpd: MediaTek touch panel driver init
<6>[    2.280581] .(2)[1:swapper/0]mt-rtc mt-rtc: setting system clock to 2020-01-10 05:51:24 UTC (1578635484)
<6>[    2.281127] .(0)[6:kworker/u16:0]mtk-tpd: enter tpd_probe, 523
<3>[    2.281266] .(0)[6:kworker/u16:0]Lomen 0
<6>[    2.281273] .(0)[6:kworker/u16:0]mtk-tpd: [tpd -1] mt_tpd_pinctrl+++++++++++++++++
<3>[    2.281280] .(0)[6:kworker/u16:0]Lomen 0.1
<3>[    2.281620] .(0)[6:kworker/u16:0]Lomen 0.2
<3>[    2.281632] .(0)[6:kworker/u16:0]mtk-tpd touch: fwq Cannot find touch pinctrl default -19!
<6>[    2.281646] .(0)[6:kworker/u16:0]mtk-tpd: [tpd-1] mt_tpd_pinctrl----------
<3>[    2.281653] .(0)[6:kworker/u16:0]Lomen 1
<4>[    2.281676] .(0)[6:kworker/u16:0]<<GTP-INF>>[tpd_local_init:974]  Device Tree get regulator!
<4>[    2.282180] .(0)[6:kworker/u16:0] tpd_i2c_probe start.
<4>[    2.282269] .(0)[6:kworker/u16:0]glove_mode->0 
<4>[    2.282528] .(1)[6:kworker/u16:0]<<GTP-INF>>[tpd_i2c_probe:662] tpd_i2c_probe start.wait_event_interruptible
<6>[    2.282533] .(0)[264:tpd_probe]mtk-tpd: [tpd]tpd_gpio_output pin = 0, level = 0
<6>[    2.282584] .(0)[264:tpd_probe]mtk-tpd: [tpd]tpd_gpio_output pin = 1, level = 0
<4>[    2.296665] .(0)[264:tpd_probe]<<GTP-INF>>[gt1x_reset_guitar:908] GTP RESET!
<6>[    2.296678] .(0)[264:tpd_probe]mtk-tpd: [tpd]tpd_gpio_output pin = 0, level = 0
<6>[    2.296700] .(0)[264:tpd_probe]mtk-tpd: [tpd]tpd_gpio_output pin = 1, level = 0
<6>[    2.304644] .(0)[264:tpd_probe]mtk-tpd: [tpd]tpd_gpio_output pin = 0, level = 1
<6>[    2.324662] .(0)[264:tpd_probe]mtk-tpd: [tpd]tpd_gpio_output pin = 1, level = 0
<6>[    2.380665] .(0)[264:tpd_probe]mtk-tpd: [tpd]tpd_gpio_as_int
<4>[    2.381160] .(1)[6:kworker/u16:0]<<GTP-INF>>[tpd_i2c_probe:664] tpd_i2c_probe end.wait_event_interruptible
<4>[    2.401777] .(1)[6:kworker/u16:0]<<GTP-INF>>[gt1x_read_version:983] IC VERSION:GT5688_000204(Patch)_0100(Mask)_00(SensorID)
<4>[    2.401800] .(1)[6:kworker/u16:0] tpd_i2c_probe end.
<3>[    2.401829] .(1)[6:kworker/u16:0]BOOTPROF:      2401.828774:probe: probe=i2c_device_probe drv=gt1x(ffffff80096be420)   119.636693ms
<4>[    2.402063] .(1)[6:kworker/u16:0]<<GTP-INF>>[tpd_local_init:1033] end tpd_local_init, 1033
<4>[    2.402063] 
<6>[    2.402074] .(1)[6:kworker/u16:0]mtk-tpd: [mtk-tpd]tpd_probe, tpd_driver_name=gt1x
<6>[    2.402318] .(0)[6:kworker/u16:0]mtk-tpd: Cap touch panel driver
<6>[    2.402620] .(0)[6:kworker/u16:0]input: mtk-tpd as /devices/virtual/input/input5
<6>[    2.403030] .(0)[6:kworker/u16:0]input: tp-kpd as /devices/virtual/input/input6
<3>[    2.403198] .(0)[6:kworker/u16:0]BOOTPROF:      2403.197159:probe: probe=platform_drv_probe drv=mtk-tpd(ffffff80096bdc50)   122.057462ms
<5>[    2.403357] .(1)[1:swapper/0]mtk_charger_probe: starts
<5>[    2.403370] .(1)[1:swapper/0]mtk_charger_parse_dt: starts
<5>[    2.403387] .(1)[1:swapper/0]found SwitchCharging
<5>[    2.403401] .(1)[1:swapper/0]Found primary charger [mt6370_chg]
<5>[    2.403827] .(1)[1:swapper/0]use default PE_ICHG_LEAVE_THRESHOLD:1000
<5>[    2.403875] .(1)[1:swapper/0]use default pe40_single_charger_input_current:3000
<5>[    2.403886] .(1)[1:swapper/0]use default pe40_single_charger_current:3000
<5>[    2.403898] .(1)[1:swapper/0]use default pe40_dual_charger_input_current:3000
<5>[    2.403909] .(1)[1:swapper/0]use default pe40_dual_charger_chg1_current:2000
<5>[    2.403921] .(1)[1:swapper/0]use default pe40_dual_charger_chg2_current:2000
<5>[    2.403933] .(1)[1:swapper/0]use default pe40_stop_battery_soc:2000
<5>[    2.404018] .(1)[1:swapper/0]use default MAX_CHARGING_TIME:43200
<5>[    2.404025] .(1)[1:swapper/0]algorithm name:SwitchCharging
<5>[    2.404581] .(1)[266:charger_thread][charger_routine_thread]flags=0,1 
<4>[    2.404646] .(1)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<3>[    2.405004] .(3)[1:swapper/0]BOOTPROF:      2405.004082:initcall: mtk_charger_init   124.343154ms
<6>[    2.409681] .(3)[234:kworker/u16:5][wdk] bind thread 268 to cpu 0
<6>[    2.409958] .(0)[234:kworker/u16:5][wdk] bind thread 269 to cpu 1
<6>[    2.410207] .(3)[234:kworker/u16:5][wdk] bind thread 270 to cpu 2
<6>[    2.410440] .(3)[234:kworker/u16:5][wdk] bind thread 271 to cpu 3
<6>[    2.410662] .(3)[234:kworker/u16:5][wdk] bind thread 272 to cpu 4
<6>[    2.410883] .(3)[234:kworker/u16:5][wdk] bind thread 273 to cpu 5
<6>[    2.411106] .(3)[234:kworker/u16:5][wdk] bind thread 274 to cpu 6
<6>[    2.411321] .(3)[234:kworker/u16:5][wdk] bind thread 275 to cpu 7
<6>[    2.411343] .(3)[234:kworker/u16:5][wdk] WDT start kicker done CPU_NR=8
<6>[    2.411401] .(3)[234:kworker/u16:5][cpu_ntf] <00>ffffff80088f3818 (wk_cpu_callback)
<6>[    2.411427] .(3)[234:kworker/u16:5][wdk]init_wk done late_initcall cpus_kick_bit=0xff -----
<4>[    2.412950] .(0)[264:tpd_probe]<<GTP-ERR>>[gt1x_init:2525] Check subsystem not pass[0xAA].
<4>[    2.428956] .(0)[264:tpd_probe]<<GTP-INF>>[gt1x_get_chip_type:1027] Chip Type: GT2X
<3>[    2.433062] .(1)[1:swapper/0]BOOTPROF:      2433.061313:initcall: clk_debug_init    26.118385ms
<6>[    2.433178] .(1)[1:swapper/0]schedtune: init normalization constants...
<6>[    2.433194] .(1)[1:swapper/0]schedtune: CLUSTER[0-3]      min_pwr:     0 max_pwr: 56129
<6>[    2.433206] .(1)[1:swapper/0]schedtune: CPU[0]            min_pwr:     0 max_pwr: 151946
<6>[    2.433215] .(1)[1:swapper/0]schedtune: CPU[1]            min_pwr:     0 max_pwr: 151946
<6>[    2.433225] .(1)[1:swapper/0]schedtune: CPU[2]            min_pwr:     0 max_pwr: 151946
<6>[    2.433234] .(1)[1:swapper/0]schedtune: CPU[3]            min_pwr:     0 max_pwr: 151946
<6>[    2.433246] .(1)[1:swapper/0]schedtune: CLUSTER[4-7]      min_pwr:     0 max_pwr: 197933
<6>[    2.433255] .(1)[1:swapper/0]schedtune: CPU[4]            min_pwr:     0 max_pwr: 388889
<6>[    2.433264] .(1)[1:swapper/0]schedtune: CPU[5]            min_pwr:     0 max_pwr: 388889
<6>[    2.433274] .(1)[1:swapper/0]schedtune: CPU[6]            min_pwr:     0 max_pwr: 388889
<6>[    2.433283] .(1)[1:swapper/0]schedtune: CPU[7]            min_pwr:     0 max_pwr: 349038
<6>[    2.433294] .(1)[1:swapper/0]schedtune: SYSTEM            min_pwr:     0 max_pwr: 2377551
<6>[    2.433303] .(1)[1:swapper/0]schedtune: using normalization constants mul: 3281904246 sh1: 1 sh2: 21
<6>[    2.433311] .(1)[1:swapper/0]schedtune: verify normalization constants...
<6>[    2.433317] .(1)[1:swapper/0]schedtune: max_pwr/2^0: 2377551 => norm_pwr:  1024
<6>[    2.433325] .(1)[1:swapper/0]schedtune: max_pwr/2^1: 1188775 => norm_pwr:   511
<6>[    2.433333] .(1)[1:swapper/0]schedtune: max_pwr/2^2: 594387 => norm_pwr:   255
<6>[    2.433341] .(1)[1:swapper/0]schedtune: max_pwr/2^3: 297193 => norm_pwr:   127
<6>[    2.433348] .(1)[1:swapper/0]schedtune: max_pwr/2^4: 148596 => norm_pwr:    63
<6>[    2.433356] .(1)[1:swapper/0]schedtune: max_pwr/2^5: 74298 => norm_pwr:    31
<6>[    2.433365] .(1)[1:swapper/0]schedtune: configured to support 5 boost groups
<6>[    2.433402] .(1)[1:swapper/0]vs1: disabling
<3>[    2.433411] .(1)[1:swapper/0]vs1: couldn't disable: -1
<6>[    2.433425] .(1)[1:swapper/0]vmodem: disabling
<3>[    2.433432] .(1)[1:swapper/0]vmodem: couldn't disable: -1
<6>[    2.433445] .(1)[1:swapper/0]vcore: disabling
<3>[    2.433452] .(1)[1:swapper/0]vcore: couldn't disable: -1
<6>[    2.433466] .(1)[1:swapper/0]vproc: disabling
<3>[    2.433472] .(1)[1:swapper/0]vproc: couldn't disable: -1
<6>[    2.433486] .(1)[1:swapper/0]vs2: disabling
<3>[    2.433493] .(1)[1:swapper/0]vs2: couldn't disable: -1
<6>[    2.433537] .(1)[1:swapper/0]vcamio: disabling
<3>[    2.433544] .(1)[1:swapper/0]vcamio: couldn't disable: -1
<6>[    2.433586] .(1)[1:swapper/0]vaux18: disabling
<3>[    2.433593] .(1)[1:swapper/0]vaux18: couldn't disable: -1
<6>[    2.433621] .(1)[1:swapper/0]vsram_others: disabling
<3>[    2.433628] .(1)[1:swapper/0]vsram_others: couldn't disable: -1
<6>[    2.433651] .(1)[1:swapper/0]vxo22: disabling
<3>[    2.433657] .(1)[1:swapper/0]vxo22: couldn't disable: -1
<6>[    2.433680] .(1)[1:swapper/0]vio28: disabling
<3>[    2.433687] .(1)[1:swapper/0]vio28: couldn't disable: -1
<6>[    2.433704] .(1)[1:swapper/0]vio18: disabling
<3>[    2.433710] .(1)[1:swapper/0]vio18: couldn't disable: -1
<6>[    2.433745] .(1)[1:swapper/0]vbif28: disabling
<3>[    2.433752] .(1)[1:swapper/0]vbif28: couldn't disable: -1
<6>[    2.433772] .(1)[1:swapper/0]vdram: disabling
<3>[    2.433779] .(1)[1:swapper/0]vdram: couldn't disable: -1
<6>[    2.433800] .(1)[1:swapper/0]vaud28: disabling
<3>[    2.433807] .(1)[1:swapper/0]vaud28: couldn't disable: -1
<6>[    2.435916] .(1)[1:swapper/0]rt_pd_manager_probe (1.0.5_MTK)
<6>[    2.435927] .(1)[1:swapper/0]rt_pd_manager_probe KPOC(0)
<6>[    2.435957] .(1)[1:swapper/0]rt_pd_manager_probe OK!!
<6>[    2.436214] .(1)[1:swapper/0]__tcpc_class_complete_work = type_c_port0
<6>[    2.436275] .(1)[1:swapper/0]ALSA device list:
<6>[    2.436282] .(1)[1:swapper/0]  #0: mt-snd-card
<4>[    2.441353] .(0)[264:tpd_probe]<<GTP-INF>>[gt1x_read_version:983] IC VERSION:GT5688_000204(Patch)_0100(Mask)_00(SensorID)
<4>[    2.441372] .(0)[264:tpd_probe]<<GTP-INF>>[gt1x_init_panel:654] Config group0 used, length:239
<4>[    2.441383] .(0)[264:tpd_probe]<<GTP-INF>>[gt1x_init_panel:711] X_MAX=720,Y_MAX=1280,TRIGGER=0x01,WAKEUP_LEVEL=1
<6>[    2.447740] .(2)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_get_adc_vbus: VBUS = 4975mV
<4>[    2.447755] .(2)[266:charger_thread]sg_detect_typec_charge_ovp,1363,4975000,0 
<4>[    2.448704] .(2)[266:charger_thread]=====FG===== AC   = 0
<4>[    2.450281] .(2)[266:charger_thread]=====FG===== AC   = 0
<3>[    2.460645] .(2)[229:kworker/2:2]CDP, block
<4>[    2.533461] .(2)[266:charger_thread]lifetime: data[0]=1 
<4>[    2.533472] .(2)[266:charger_thread]lifetime: data[1]=df 
<4>[    2.533479] .(2)[266:charger_thread]lifetime: data[2]=ff 
<4>[    2.533486] .(2)[266:charger_thread]lifetime: data[3]=40 
<4>[    2.533492] .(2)[266:charger_thread]lifetime: data[4]=11 
<4>[    2.533498] .(2)[266:charger_thread]lifetime: data[5]=45 
<4>[    2.533505] .(2)[266:charger_thread]lifetime: data[6]=a 
<4>[    2.533511] .(2)[266:charger_thread]lifetime: data[7]=fc 
<4>[    2.533517] .(2)[266:charger_thread]lifetime: data[8]=8 
<4>[    2.533524] .(2)[266:charger_thread]lifetime: data[9]=68 
<4>[    2.533530] .(2)[266:charger_thread]lifetime: data[10]=f7 
<4>[    2.533536] .(2)[266:charger_thread]lifetime: data[11]=18 
<4>[    2.535168] .(2)[266:charger_thread]=====FG-MTK===== bat_vol=4353
<5>[    2.538571] .(2)[266:charger_thread]Vbat=4353,Ibat=0,I=0,VChr=4740,T=25,Soc=0:0,CT:0:0 hv:1 pd:0:0
<5>[    2.538590] .(2)[266:charger_thread][mtk_is_charger_on]info->chr_type=0 
<6>[    2.539802] .(2)[266:charger_thread]i2c i2c-2: addr: 6c, transfer ACK error
<6>[    2.539815] .(2)[266:charger_thread]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    2.539823] .(2)[266:charger_thread]I2C structure:
<3>[    2.539823] [I2C]Clk=13650000,Id=2,Op=1,Irq_stat=3,Total_len=1
<3>[    2.539823] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=0,speed=400000
<3>[    2.539823] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    2.539842] .(2)[266:charger_thread]base address 0xffffff800bf46000
<6>[    2.539856] .(2)[266:charger_thread]I2C register:
<6>[    2.539856] [I2C]SLAVE_ADDR=d8,INTR_MASK=0,INTR_STAT=0,CONTROL=28,TRANSFER_LEN=1
<6>[    2.539856] [I2C]TRANSAC_LEN=1,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[    2.539856] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=2
<6>[    2.539876] .(2)[266:charger_thread]before enable DMA register(0xffffff800bf48400):
<6>[    2.539876] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    2.539876] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    2.539876] [I2C]TX_LEN=0,RX_LEN=c,INT_BUF_SIZE=0,DEBUG_STATUS=c0c0c00
<6>[    2.539876] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    2.539899] .(2)[266:charger_thread]DMA register(0xffffff800bf48400):
<6>[    2.539899] [I2C]INT_FLAG=2,INT_EN=0,EN=0,RST=0,
<6>[    2.539899] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=9c1c500c
<6>[    2.539899] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=c0c0c00
<6>[    2.539899] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    2.539918] .(2)[266:charger_thread]i2c_dump_info ------------------------------------------
<3>[    2.539927] .(2)[266:charger_thread]i2c i2c-2: last transfer info:
<3>[    2.539937] .(2)[266:charger_thread]i2c i2c-2: [00] [    2.539797] SLAVE_ADDR=d8,INTR_STAT=3,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    2.539955] .(2)[266:charger_thread]i2c i2c-2: [01] [    2.533450] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=32c,FIFO_STAT=cc01,DEBUGSTAT=300, tmo=499
<3>[    2.539972] .(2)[266:charger_thread]i2c i2c-2: [02] [    2.531781] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    2.539990] .(2)[266:charger_thread]i2c i2c-2: [03] [    2.530113] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    2.540007] .(2)[266:charger_thread]i2c i2c-2: [04] [    2.492919] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=32c,FIFO_STAT=cc01,DEBUGSTAT=300, tmo=499
<3>[    2.540024] .(2)[266:charger_thread]i2c i2c-2: [05] [    2.489958] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    2.540041] .(2)[266:charger_thread]i2c i2c-2: [06] [    2.488961] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    2.540058] .(2)[266:charger_thread]i2c i2c-2: [07] [    2.452707] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=32c,FIFO_STAT=cc01,DEBUGSTAT=300, tmo=499
<3>[    2.540075] .(2)[266:charger_thread]i2c i2c-2: [08] [    2.450996] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    2.540092] .(2)[266:charger_thread]i2c i2c-2: [09] [    2.450658] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<4>[    2.540126] .(2)[266:charger_thread][wlc_do_10s_debounce]status=0
<4>[    2.540134] .(2)[266:charger_thread][wlc_do_10s_debounce] gpio5_state =1 zero_jiffies=0 to10s_jiffies=4294892920 valley_jiffies=0 topeak_jiffies=0 
<4>[    2.544438] .(2)[266:charger_thread]temp_now=223, temp_last=223 
<4>[    2.544449] .(2)[266:charger_thread]=====FG===== TEMP = 223
<5>[    2.544456] .(2)[266:charger_thread]charger_check_status
<5>[    2.594226] .(2)[266:charger_thread][mtk_chg_check_vbus]charger_update_data(4730000 mV) 
<5>[    2.594239] .(2)[266:charger_thread]charger_check_status tmp:22 (jeita:0 sm:0 cv:0 en:0) (sm:1) charging:1 cmd_discharging:0 safety_timeout:0 vbusov_stat:0 can_charging:0, charging:1
<5>[    2.594257] .(2)[266:charger_thread]_charger_manager_enable_charging: dev:charger idx:0 en:1
<5>[    2.594267] .(2)[266:charger_thread]_charger_manager_enable_charging: dev:charger idx:0 en:1 cnt:0
<5>[    2.598691] .(2)[266:charger_thread][mtk_battery_notify_OVP_check] OVP_VBUS value=0 chr_type=0 rg cc1=0 cc2=0
<5>[    2.600290] .(2)[266:charger_thread][mtk_battery_notify_OVP_check]charger_vol(4730 mV) 
<4>[    2.684756] .(1)[264:tpd_probe]<<GTP-INF>>[gt1x_init_debug_node:107] Created proc entry /proc/gt1x_debug.
<4>[    2.684763] .(1)[264:tpd_probe]<<GTP-INF>>[gt1x_init_tool_node:89] Alloc memory size:512.
<4>[    2.684777] .(1)[264:tpd_probe]<<GTP-INF>>[gt1x_init_tool_node:99] Created proc entry /proc/gmnode040495.
<6>[    2.684850] .(0)[264:tpd_probe]mtk-tpd: [tpd]tpd_gpio_as_int
<4>[    2.740617] .(0)[264:tpd_probe]<<GTP-INF>>[tpd_irq_registration:478] Device Tree Tpd_irq_registration!
<4>[    2.741753] .(0)[264:tpd_probe]gpiod_set_debounce: invalid GPIO
<4>[    2.741804] .(0)[264:tpd_probe]<<GTP-INF>>[tpd_irq_registration:486] Device gt1x_int_type = 1!
<4>[    2.741850] .(0)[264:tpd_probe]<<GTP-INF>>[tpd_irq_registration:507] irq:673, debounce:1-0:
<4>[    2.741856] -(0)[264:tpd_probe]------------[ cut here ]------------
<4>[    2.741858] -(0)[264:tpd_probe]WARNING: CPU: 0 PID: 264 at /data/jenkins/workspace/dl35_oreo/kernel-4.4/kernel/irq/manage.c:513 __enable_irq+0x44/0x80()
<4>[    2.741873] -(0)[264:tpd_probe]Unbalanced enable for IRQ 673
<4>[    2.741876] Modules linked in:-(0)[264:tpd_probe]
<4>[    2.741882] -(0)[264:tpd_probe]CPU: 0 PID: 264 Comm: tpd_probe Tainted: G        W       4.4.95+ #2
<4>[    2.741887] -(0)[264:tpd_probe]Hardware name: MT6763V/B (DT)
<4>[    2.741891] -(0)[264:tpd_probe]Call trace:
<4>[    2.741893] -(0)[264:tpd_probe][<ffffff800808a298>] dump_backtrace+0x0/0x228
<4>[    2.741903] -(0)[264:tpd_probe][<ffffff800808a4d4>] show_stack+0x14/0x20
<4>[    2.741907] -(0)[264:tpd_probe][<ffffff8008360870>] dump_stack+0xa0/0xc0
<4>[    2.741915] -(0)[264:tpd_probe][<ffffff80080a1bc4>] warn_slowpath_common+0x9c/0xd8
<4>[    2.741923] -(0)[264:tpd_probe][<ffffff80080a1c5c>] warn_slowpath_fmt+0x5c/0x80
<4>[    2.741927] -(0)[264:tpd_probe][<ffffff800810c894>] __enable_irq+0x44/0x80
<4>[    2.741931] -(0)[264:tpd_probe][<ffffff800810c91c>] enable_irq+0x4c/0xa8
<4>[    2.741935] -(0)[264:tpd_probe][<ffffff80088ae2ac>] gt1x_irq_enable+0x3c/0x60
<4>[    2.741944] -(0)[264:tpd_probe][<ffffff80088ae478>] tpd_registration+0x1a8/0x2a0
<4>[    2.741949] -(0)[264:tpd_probe][<ffffff80080c3fbc>] kthread+0xec/0x100
<4>[    2.741955] -(0)[264:tpd_probe][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    2.741960] -(0)[264:tpd_probe]---[ end trace 8cfa91f0817a7c72 ]---
<4>[    2.750990] .(1)[277:mtk-tpd]--lan-- ret = 0.
<4>[    2.763406] .(1)[277:mtk-tpd]--lan-- ret = 0.
<4>[    2.774148] .(1)[277:mtk-tpd]--lan-- ret = 0.
<4>[    2.795182] .(1)[1:swapper/0][TKCORE] fy partition-0
<4>[    2.795182] [    5.240016]: <0>MSG TKCore:htfat_early_init:1004: Verify partition-1
<4>[    2.795182] [    5.241321]: <0>MSG TKCore:htfat_early_init:1018: Initialize partition for the 3(+) times
<4>[    2.795182] [    5.242428]: <0>MSG TKCore:htfat_early_init:1032: HTFAT FS active_id = 0
<6>[    2.797218] .(1)[1:swapper/0]Freeing unused kernel memory: 5152K
<3>[    2.797292] .(1)[1:swapper/0]BOOTPROF:      2797.292160:Kernel_init_done
<4>[    2.799881] [TKCORE] 
<4>[    2.799881] [    5.243682]: <0>INF TKCore:htfat_init:163: HTFAT initialized Done
<4>[    2.799881] [    5.244515]: <0>INF TKCore:init_primary_helper:233: Primary CPU switching to normal world boot
<4>[    2.799881] [    5.245673]: <0>MSG TKCore:dump_tee_boot_params:135: tee_boot_params.magic: 0x545349.(1)[1:init][TKCORE] 58
<4>[    2.803588] [    5.246739]: <0>MSG TKCore:dump_tee_boot_params:136: tee_boot_params.length: 0xa8
<4>[    2.803588] [    5.247749]: <0>MSG TKCore:dump_tee_boot_params:137: tee_boot_params.version : 0x10003
<4>[    2.803588] [    5.248813]: <0>DBG TKCore:dump_tee_boot_params:140: tee_boot_params.uart_[TKCORE] base: 0x11002000
<4>[    2.803588] [    5.249934]: <0>DBG TKCore:dump_tee_boot_params:141: tee_boot_params.total_number_spi: 352
<4>[    2.803588] [    5.251053]: <0>DBG TKCore:dump_tee_boot_params:142: tee_boot_params.ssiq_number: 328
<4>[    2.803588] [    5.252107]: <0>DBG TKCore:dump_tee_boot_params:143:
<14>[    2.813879] .(1)[1:init]init: init first stage started!
<14>[    2.814592] .(1)[1:init]init: dlroot====before call DoFirstStageMount.
<14>[    2.815737] .(1)[1:init]init: Using Android DT directory /proc/device-tree/firmware/android/
<6>[    2.832742] .(1)[70:kworker/1:1][msdc]cache(0x858000~0x930000, usrdata(0x930000~0x3A29FDF)
<3>[    2.886410] .(1)[1:init]power_supply charger: driver failed to report `charge_type' property: -22
<4>[    2.925084] .(6)[1:init]=====FG===== SOC  = 100
<4>[    2.926431] .(6)[1:init]=====FG===== AC   = 0
<4>[    2.928088] .(6)[1:init]=====FG===== VOLT = 4324
<4>[    2.928712] .(6)[1:init]=====FG===== actural VOLT = 4324
<4>[    2.929944] .(6)[1:init]temp_now=223, temp_last=223 
<4>[    2.930581] .(6)[1:init]=====FG===== TEMP = 223
<4>[    2.931735] .(6)[1:init]=====FG===== SOC  = 100
<4>[    2.932870] .(6)[1:init]bq27542_set_commands cmd = 0x12, val = 3892 
<4>[    2.934225] .(6)[1:init]bq27542_set_commands cmd = 0x3c, val = 3850 
<4>[    2.935579] .(6)[1:init]bq27542_set_commands cmd = 0xc, val = 4004 
<14>[    2.942816] .(6)[1:init]init: dlroot===is_device_secure ====, benableroot:0
<12>[    3.333504] .(0)[280:init]fec: <280> warning: __ecc_read: RS block 11603968: decoding failed
<14>[    3.343175] .(1)[1:init]init: [libfs_mgr]Enabling dm-verity for system (mode 2)
<14>[    3.344309] .(1)[1:init]init: [libfs_mgr]loading verity table: '1 /dev/block/platform/bootdevice/by-name/system /dev/block/platform/bootdevice/by-name/system 4096 4096 774155 774155 sha256 49dbfd96347034480a68d5af41b5b5e73807b833fc0dc001ac6e7959e8efadd2 aee087a5be3b982978c923f566a94613496b417f2af592639bc80d141e34dfe7 10 restart_on_corruption use_fec_from_device /dev/block/platform/bootdevice/by-name/system fec_start 780261 fec_blocks 780261 fec_roots 2 ignore_zero_blocks'
<6>[    3.364729] .(2)[1:init]EXT4-fs (dm-0): mounted filesystem with ordered data mode. Opts: (null)
<14>[    3.366051] .(2)[1:init]init: [libfs_mgr]__mount(source=/dev/block/dm-0,target=/system,type=ext4)=0: Success
<14>[    3.367918] .(2)[1:init]init: dlroot===is_device_secure ====, benableroot:0
<6>[    3.432616] .(1)[70:kworker/1:1]tcpc_init_work force start
<6>[    3.435282] .(0)[45:pd_dbg_info]///PD dbg info 42d
<4>[    3.435920] .(0)[45:pd_dbg_info]<    3.435>TCPC-TYPEC:typec_init: TrySNK
<6>[    3.438271] .(1)[70:kworker/1:1]tcpc_device_irq_enable : tcpc irq enable OK!
<6>[    3.439672] .(1)[220:type_c_port0]pd_tcp_notifier_call attach wait sink
<4>[    3.440547] .(1)[220:type_c_port0]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<5>[    3.441857] .(1)[220:type_c_port0]tcpc_check_ovp_out_of_charger
<5>[    3.442616] .(1)[220:type_c_port0]wake_up_charger
<6>[    3.460630] .(1)[45:pd_dbg_info]///PD dbg info 198d
<4>[    3.461287] .(1)[45:pd_dbg_info]<    3.435>TCPC-TYPEC:PowerOffCharge
<4>[    3.461287] <    3.435>TCPC-TYPEC:** Unattached.SNK
<4>[    3.461287] <    3.439>TCPC-TYPEC:[CC_Alert] 5/0
<4>[    3.461287] <    3.440>TCPC-TYPEC:** AttachWait.SNK
<4>[    3.461287] <    3.440>TCPC-TYPEC:[CC_Status2] 5/0
<12>[    3.541178] .(0)[293:init]fec: <293> warning: __ecc_read: RS block 2215936: decoding failed
<14>[    3.546295] .(2)[1:init]init: [libfs_mgr]Enabling dm-verity for vendor (mode 2)
<14>[    3.547299] .(2)[1:init]init: [libfs_mgr]loading verity table: '1 /dev/block/platform/bootdevice/by-name/vendor /dev/block/platform/bootdevice/by-name/vendor 4096 4096 165305 165305 sha256 fc8be3b2b1f80d5066d28c5bd5f4f01782524d312dcfbe2c51f7b0f974648613 aee087a5be3b982978c923f566a94613496b417f2af592639bc80d141e34dfe7 10 restart_on_corruption use_fec_from_device /dev/block/platform/bootdevice/by-name/vendor fec_start 166617 fec_blocks 166617 fec_roots 2 ignore_zero_blocks'
<6>[    3.560064] .(3)[1:init]EXT4-fs (dm-1): mounted filesystem with ordered data mode. Opts: (null)
<6>[    3.560588] .(0)[45:pd_dbg_info]///PD dbg info 78d
<4>[    3.560630] .(0)[45:pd_dbg_info]<    3.560>TCPC-TYPEC:[CC_Change] 5/0
<4>[    3.560630] <    3.560>TCPC-TYPEC:** Attached.SNK
<6>[    3.561023] .(1)[218:tcpc_timer_type]pd_tcp_notifier_call sink vbus 5000mv 150ma type(1)
<5>[    3.561121] .(1)[218:tcpc_timer_type]charger_manager_enable_power_path: power path is already en = 1
<5>[    3.561151] .(1)[218:tcpc_timer_type]PD charger event:14 5
<6>[    3.561157] .(1)[218:tcpc_timer_type]pd_tcp_notifier_call USB Plug in, pol = 0
<14>[    3.567308] .(3)[1:init]init: [libfs_mgr]__mount(source=/dev/block/dm-1,target=/vendor,type=ext4)=0: Success
<14>[    3.568776] .(3)[1:init]init: Skipped setting INIT_AVB_VERSION (not in recovery mode)
<14>[    3.569790] .(3)[1:init]init: Loading SELinux policy
<6>[    3.584664] .(0)[45:pd_dbg_info]///PD dbg info 118d
<4>[    3.585326] .(0)[45:pd_dbg_info]<    3.561>TCPC-TYPEC:[CC_Status] 5/0
<4>[    3.585326] <    3.561>TCPC-TYPEC:Attached-> SINK
<4>[    3.585326] <    3.561>TCPC-TCPC:usb_port_attached
<7>[    3.596050] .(2)[1:init]SELinux: 8192 avtab hash slots, 24948 rules.
<4>[    3.600351] .(5)[266:charger_thread]TempToCurrent no charge on
<5>[    3.601126] .(5)[266:charger_thread][charger_routine_thread]flags=0,1 
<4>[    3.601982] .(5)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<7>[    3.614845] .(2)[1:init]SELinux: 8192 avtab hash slots, 24948 rules.
<7>[    3.614887] .(2)[1:init]SELinux:  1 users, 4 roles, 2069 types, 0 bools, 1 sens, 1024 cats
<7>[    3.614897] .(2)[1:init]SELinux:  92 classes, 24948 rules
<7>[    3.620118] .(2)[1:init]SELinux:  Completing initialization.
<7>[    3.620130] .(2)[1:init]SELinux:  Setting up existing superblocks.
<6>[    3.682329] .(0)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_get_adc_vbus: VBUS = 4975mV
<4>[    3.683611] .(0)[266:charger_thread]sg_detect_typec_charge_ovp,1363,4975000,0 
<4>[    3.685334] .(0)[266:charger_thread]=====FG===== AC   = 0
<4>[    3.686790] .(0)[266:charger_thread]=====FG===== AC   = 0
<5>[    3.702458] .(4)[1:init]audit: type=1403 audit(1578635485.465:2): policy loaded auid=4294967295 ses=4294967295
<14>[    3.704209] .(4)[1:init]selinux: SELinux: Loaded policy from /vendor/etc/selinux/precompiled_sepolicy
<14>[    3.704209] 
<14>[    3.706536] .(4)[1:init]init: dlroot===selinux_is_enforcing, secureboot_status_from_cmdline, bEnableroot:0
<5>[    3.707890] .(4)[1:init]audit: type=1404 audit(1578635485.469:3): enforcing=1 old_enforcing=0 auid=4294967295 ses=4294967295
<14>[    3.739471] .(4)[1:init]selinux: SELinux: Loaded file_contexts
<14>[    3.739471] 
<5>[    3.741960] .(5)[1:init]random: init: uninitialized urandom read (40 bytes read, 43 bits of entropy available)
<14>[    3.744220] .(5)[1:init]init: init second stage started!
<14>[    3.755291] .(5)[1:init]init: Using Android DT directory /proc/device-tree/firmware/android/
<11>[    3.757409] .(5)[1:init]init: property_set("ro.boot.hardware", "mt6763") failed: property already set
<14>[    3.758599] .(5)[1:init]init: dlroo=== import_kernel_nv=== property_set key [hardware , mt6763]
<14>[    3.759761] .(5)[1:init]init: dlroo=== import_kernel_nv=== property_set key [verifiedbootstate , orange]
<14>[    3.761044] .(5)[1:init]init: dlroo=== import_kernel_nv=== property_set key [veritymode , enforcing]
<14>[    3.762234] .(5)[1:init]init: dlroo=== import_kernel_nv=== property_set key [atm , disabled]
<14>[    3.763330] .(5)[1:init]init: dlroo=== import_kernel_nv=== property_set key [meta_log_disable , 0]
<11>[    3.764491] .(5)[1:init]init: property_set("ro.boot.serialno", "S19F00013") failed: property already set
<14>[    3.765733] .(5)[1:init]init: dlroo=== import_kernel_nv=== property_set key [serialno , S19F00013]
<14>[    3.766894] .(5)[1:init]init: dlroo=== import_kernel_nv=== property_set key [secureboot , 49]
<14>[    3.767998] .(5)[1:init]init: dlroo=== import_kernel_nv=== property_set key [specialid , 0]
<14>[    3.769120] .(5)[1:init]init: dlroo=== import_kernel_nv=== property_set key [bootreason , wdt_by_pass_pwk]
<14>[    3.770384] .(5)[1:init]init: dlroo===export_kernel_boot_props=== property_set [ro.serialno , S19F00013]   default:
<14>[    3.771731] .(5)[1:init]init: dlroo===export_kernel_boot_props=== property_set [ro.bootmode , normal]   default:unknown
<14>[    3.773139] .(5)[1:init]init: dlroo===export_kernel_boot_props=== property_set [ro.baseband , ]   default:unknown
<14>[    3.774465] .(5)[1:init]init: dlroo===export_kernel_boot_props=== property_set [ro.bootloader , ]   default:unknown
<14>[    3.775811] .(5)[1:init]init: dlroo===export_kernel_boot_props=== property_set [ro.hardware , mt6763]   default:unknown
<14>[    3.777230] .(5)[1:init]init: dlroo===export_kernel_boot_props=== property_set [ro.revision , ]   default:0
<14>[    3.778503] .(5)[1:init]init: dlroo===export_kernel_boot_props=== property_set [ro.secureboot , 49]   default:0
<14>[    3.779807] .(5)[1:init]init: dlroo===export_kernel_boot_props=== property_set [ro.specialid , 0]   default:0
<14>[    3.781101] .(5)[1:init]init: dlroo===export_kernel_boot_props=== property_set [gsm.serial , S19F00013]   default:
<14>[    3.786780] .(5)[1:init]selinux: SELinux: Loaded file_contexts
<14>[    3.786780] 
<14>[    3.789358] .(5)[1:init]selinux: SELinux: Loaded property_contexts from /system/etc/selinux/plat_property_contexts & /vendor/etc/selinux/nonplat_property_contexts.
<14>[    3.789358] 
<14>[    3.791443] .(5)[1:init]init: Running restorecon...
<4>[    3.796633] .(1)[266:charger_thread]lifetime: data[0]=df 
<4>[    3.797360] .(1)[266:charger_thread]lifetime: data[1]=ff 
<4>[    3.798062] .(1)[266:charger_thread]lifetime: data[2]=40 
<4>[    3.798767] .(1)[266:charger_thread]lifetime: data[3]=11 
<4>[    3.799472] .(1)[266:charger_thread]lifetime: data[4]=45 
<4>[    3.800177] .(1)[266:charger_thread]lifetime: data[5]=a 
<4>[    3.800888] .(1)[266:charger_thread]lifetime: data[6]=fc 
<4>[    3.801581] .(1)[266:charger_thread]lifetime: data[7]=8 
<4>[    3.802275] .(1)[266:charger_thread]lifetime: data[8]=68 
<4>[    3.802980] .(1)[266:charger_thread]lifetime: data[9]=f7 
<4>[    3.803685] .(1)[266:charger_thread]lifetime: data[10]=18 
<4>[    3.804401] .(1)[266:charger_thread]lifetime: data[11]=0 
<11>[    3.804711] .(5)[1:init]init: waitid failed: No child processes
<14>[    3.804788] .(5)[1:init]init: dlroot == [ro.secureboot]: 49
<14>[    3.804801] .(5)[1:init]init: dlroot=== secure boot is enabled or unknown, load standard deault prop .
<14>[    3.806049] .(5)[1:init]init: PropSet [security.perf_harden]=[1] Done
<14>[    3.806168] .(5)[1:init]init: PropSet [persist.sys.usb.config]=[none] Done
<12>[    3.806201] .(5)[1:init]init: Couldn't load property file: Unable to open '/odm/default.prop': No such file or directory: No such file or directory
<14>[    3.806710] .(5)[1:init]init: PropSet [dalvik.vm.image-dex2oat-Xms]=[64m] Done
<14>[    3.806732] .(5)[1:init]init: PropSet [dalvik.vm.image-dex2oat-Xmx]=[64m] Done
<14>[    3.806748] .(5)[1:init]init: PropSet [dalvik.vm.dex2oat-Xms]=[64m] Done
<14>[    3.806765] .(5)[1:init]init: PropSet [dalvik.vm.dex2oat-Xmx]=[512m] Done
<14>[    3.806791] .(5)[1:init]init: PropSet [dalvik.vm.usejit]=[true] Done
<14>[    3.806809] .(5)[1:init]init: PropSet [dalvik.vm.usejitprofiles]=[true] Done
<14>[    3.806828] .(5)[1:init]init: PropSet [dalvik.vm.dexopt.secondary]=[true] Done
<14>[    3.806847] .(5)[1:init]init: PropSet [dalvik.vm.appimageformat]=[lz4] Done
<14>[    3.806865] .(5)[1:init]init: PropSet [pm.dexopt.first-boot]=[quicken] Done
<14>[    3.806883] .(5)[1:init]init: PropSet [pm.dexopt.boot]=[verify] Done
<14>[    3.806901] .(5)[1:init]init: PropSet [pm.dexopt.install]=[quicken] Done
<14>[    3.806919] .(5)[1:init]init: PropSet [pm.dexopt.bg-dexopt]=[speed-profile] Done
<14>[    3.806937] .(5)[1:init]init: PropSet [pm.dexopt.ab-ota]=[speed-profile] Done
<14>[    3.806955] .(5)[1:init]init: PropSet [pm.dexopt.inactive]=[verify] Done
<14>[    3.806972] .(5)[1:init]init: PropSet [pm.dexopt.shared]=[speed] Done
<14>[    3.806993] .(5)[1:init]init: PropSet [debug.atrace.tags.enableflags]=[0] Done
<14>[    3.807010] .(5)[1:init]init: PropSet [persist.service.acm.enable]=[0] Done
<14>[    3.807046] .(5)[1:init]init: PropSet [persist.sys.usb.config]=[mtp] Done
<14>[    3.807076] .(5)[1:init]init: PropSet [camera.disable_zsl_mode]=[1] Done
<14>[    3.807674] .(5)[1:init]init: Created socket '/dev/socket/property_service', mode 666, user 0, group 0
<14>[    3.807745] .(5)[1:init]init: PropSet [sys.usb.controller]=[musb-hdrc] Done
<14>[    3.807800] .(5)[1:init]init: dlroot === ParseConfig init.rc 
<14>[    3.807830] .(5)[1:init]init: Parsing file /init.rc...
<14>[    3.808048] .(5)[1:init]init: Added '/init.environ.rc' to import list
<14>[    3.808060] .(5)[1:init]init: Added '/init.usb.rc' to import list
<14>[    3.808083] .(5)[1:init]init: Added '/init.mt6763.rc' to import list
<14>[    3.808099] .(5)[1:init]init: Added '/vendor/etc/init/hw/init.mt6763.rc' to import list
<14>[    3.808108] .(5)[1:init]init: Added '/init.usb.configfs.rc' to import list
<14>[    3.808124] .(5)[1:init]init: Added '/init.zygote64_32.rc' to import list
<14>[    3.809293] .(5)[1:init]init: Parsing file /init.environ.rc...
<14>[    3.809398] .(5)[1:init]init: Parsing file /init.usb.rc...
<14>[    3.809733] .(5)[1:init]init: Parsing file /init.mt6763.rc...
<11>[    3.809754] .(5)[1:init]init: Unable to open '/init.mt6763.rc': No such file or directory
<11>[    3.809772] .(5)[1:init]init: /init.rc: 9: Could not import file '/init.mt6763.rc': No such file or directory
<14>[    3.812255] .(5)[1:init]init: Parsing file /vendor/etc/init/hw/init.mt6763.rc...
<14>[    3.814664] .(5)[1:init]init: Added '/vendor/etc/init/hw/init.connectivity.rc' to import list
<14>[    3.814678] .(5)[1:init]init: Added '/vendor/etc/init/hw/init.mt6763.usb.rc' to import list
<14>[    3.814689] .(5)[1:init]init: Added '/vendor/etc/init/hw/init.project.rc' to import list
<14>[    3.814698] .(5)[1:init]init: Added '/FWUpgradeInit.rc' to import list
<14>[    3.814708] .(5)[1:init]init: Added '/vendor/etc/init/hw/init.aee.rc' to import list
<14>[    3.814725] .(5)[1:init]init: Added '/vendor/etc/init/hw/init.volte.rc' to import list
<14>[    3.814740] .(5)[1:init]init: Added '/vendor/etc/init/hw/init.mal.rc' to import list
<14>[    3.814755] .(5)[1:init]init: Added '/vendor/etc/init/hw/init.sensor_1_0.rc' to import list
<14>[    3.814770] .(5)[1:init]init: Added '/vendor/etc/init/hw/init.modem.rc' to import list
<11>[    3.814938] .(5)[1:init]init: /vendor/etc/init/hw/init.mt6763.rc: 104: invalid keyword 'makedir'
<11>[    3.814952] .(5)[1:init]init: /vendor/etc/init/hw/init.mt6763.rc: 105: invalid keyword 'makedir'
<11>[    3.814965] .(5)[1:init]init: /vendor/etc/init/hw/init.mt6763.rc: 109: invalid keyword 'makedir'
<11>[    3.815196] .(5)[1:init]init: /vendor/etc/init/hw/init.mt6763.rc: 316: invalid keyword 'mknod'
<11>[    3.815396] .(5)[1:init]init: /vendor/etc/init/hw/init.mt6763.rc: 453: invalid keyword 'mknod'
<11>[    3.815412] .(5)[1:init]init: /vendor/etc/init/hw/init.mt6763.rc: 460: invalid keyword 'mknod'
<14>[    3.816803] .(5)[1:init]init: Parsing file /vendor/etc/init/hw/init.connectivity.rc...
<14>[    3.818043] .(5)[1:init]init: Parsing file /vendor/etc/init/hw/init.mt6763.usb.rc...
<14>[    3.823513] .(5)[1:init]init: Parsing file /vendor/etc/init/hw/init.project.rc...
<14>[    3.824921] .(5)[1:init]init: Added '/vendor/etc/init/hw/init.datalogic.rc' to import list
<14>[    3.825187] .(5)[1:init]init: Parsing file /vendor/etc/init/hw/init.datalogic.rc...
<14>[    3.825901] .(5)[1:init]init: Parsing file /FWUpgradeInit.rc...
<11>[    3.825924] .(5)[1:init]init: Unable to open '/FWUpgradeInit.rc': No such file or directory
<11>[    3.825942] .(5)[1:init]init: /init.rc: 6: Could not import file '/FWUpgradeInit.rc': No such file or directory
<14>[    3.825975] .(5)[1:init]init: Parsing file /vendor/etc/init/hw/init.aee.rc...
<14>[    3.826799] .(5)[1:init]init: Added '/init.preload.rc' to import list
<14>[    3.826815] .(5)[1:init]init: Parsing file /init.preload.rc...
<11>[    3.826833] .(5)[1:init]init: Unable to open '/init.preload.rc': No such file or directory
<11>[    3.826845] .(5)[1:init]init: /init.rc: 51: Could not import file '/init.preload.rc': No such file or directory
<14>[    3.826863] .(5)[1:init]init: Parsing file /vendor/etc/init/hw/init.volte.rc...
<11>[    3.826879] .(5)[1:init]init: Unable to open '/vendor/etc/init/hw/init.volte.rc': No such file or directory
<11>[    3.826891] .(5)[1:init]init: /init.rc: 8: Could not import file '/vendor/etc/init/hw/init.volte.rc': No such file or directory
<14>[    3.826907] .(5)[1:init]init: Parsing file /vendor/etc/init/hw/init.mal.rc...
<11>[    3.826926] .(5)[1:init]init: Unable to open '/vendor/etc/init/hw/init.mal.rc': No such file or directory
<11>[    3.826936] .(5)[1:init]init: /init.rc: 9: Could not import file '/vendor/etc/init/hw/init.mal.rc': No such file or directory
<14>[    3.826978] .(5)[1:init]init: Parsing file /vendor/etc/init/hw/init.sensor_1_0.rc...
<14>[    3.827999] .(5)[1:init]init: Parsing file /vendor/etc/init/hw/init.modem.rc...
<14>[    3.828543] .(5)[1:init]init: Parsing file /init.usb.configfs.rc...
<14>[    3.829032] .(5)[1:init]init: Parsing file /init.zygote64_32.rc...
<14>[    3.829228] .(5)[1:init]init: Parsing directory /system/etc/init...
<14>[    3.830664] .(5)[1:init]init: Parsing file /system/etc/init/aal.rc...
<14>[    3.831977] .(5)[1:init]init: Parsing file /system/etc/init/aee_aed.rc...
<14>[    3.832854] .(5)[1:init]init: Parsing file /system/etc/init/aee_aed64.rc...
<14>[    3.833613] .(5)[1:init]init: Parsing file /system/etc/init/android.hidl.allocator@1.0-service.rc...
<14>[    3.834434] .(5)[1:init]init: Parsing file /system/etc/init/atcid.rc...
<14>[    3.835519] .(5)[1:init]init: Parsing file /system/etc/init/atrace.rc...
<14>[    3.836787] .(5)[1:init]init: Parsing file /system/etc/init/audiocmdservice_atci.rc...
<14>[    3.838019] .(5)[1:init]init: Parsing file /system/etc/init/audioserver.rc...
<14>[    3.838763] .(5)[1:init]init: Parsing file /system/etc/init/batterywarning.rc...
<14>[    3.839463] .(5)[1:init]init: Parsing file /system/etc/init/bootanim.rc...
<14>[    3.840517] .(5)[1:init]init: Parsing file /system/etc/init/bootlogoupdater.rc...
<14>[    3.840802] .(5)[1:init]init: Parsing file /system/etc/init/bootstat.rc...
<14>[    3.841209] .(5)[1:init]init: Parsing file /system/etc/init/cameraserver.rc...
<14>[    3.841554] .(5)[1:init]init: Parsing file /system/etc/init/drmserver.rc...
<14>[    3.842754] .(5)[1:init]init: Parsing file /system/etc/init/dumpstate.rc...
<14>[    3.843952] .(0)[1:init]init: Parsing file /system/etc/init/emdlogger1.rc...
<14>[    3.844947] .(3)[1:init]init: Parsing file /system/etc/init/emdlogger3.rc...
<14>[    3.845976] .(3)[1:init]init: Parsing file /system/etc/init/gatekeeperd.rc...
<14>[    3.846806] .(0)[1:init]init: Parsing file /system/etc/init/ged_srv.rc...
<14>[    3.847846] .(3)[1:init]init: Parsing file /system/etc/init/hwservicemanager.rc...
<14>[    3.848875] .(2)[1:init]init: Parsing file /system/etc/init/init.thermald.rc...
<14>[    3.849835] .(3)[1:init]init: Parsing file /system/etc/init/init.vtservice.rc...
<14>[    3.851009] .(0)[1:init]init: Parsing file /system/etc/init/installd.rc...
<14>[    3.852158] .(2)[1:init]init: Parsing file /system/etc/init/keystore.rc...
<14>[    3.853074] .(3)[1:init]init: Parsing file /system/etc/init/kpoc_charger.rc...
<14>[    3.854199] .(2)[1:init]init: Parsing file /system/etc/init/lmkd.rc...
<14>[    3.855331] .(3)[1:init]init: Parsing file /system/etc/init/logd.rc...
<14>[    3.856499] .(0)[1:init]init: Parsing file /system/etc/init/md_monitor.rc...
<14>[    3.857172] .(3)[1:init]init: Parsing file /system/etc/init/mdlogger.rc...
<14>[    3.857494] .(2)[1:init]init: Parsing file /system/etc/init/mdnsd.rc...
<14>[    3.858676] .(3)[1:init]init: Parsing file /system/etc/init/mediadrmserver.rc...
<14>[    3.859721] .(0)[1:init]init: Parsing file /system/etc/init/mediaextractor.rc...
<14>[    3.860725] .(0)[1:init]init: Parsing file /system/etc/init/mediametrics.rc...
<14>[    3.861662] .(3)[1:init]init: Parsing file /system/etc/init/mediaserver.rc...
<14>[    3.862755] .(2)[1:init]init: Parsing file /system/etc/init/met_log_d.rc...
<14>[    3.863700] .(0)[1:init]init: Parsing file /system/etc/init/mobile_log_d.rc...
<14>[    3.864560] .(3)[1:init]init: Parsing file /system/etc/init/mtk_advcamserver.rc...
<14>[    3.864904] .(0)[1:init]init: Parsing file /system/etc/init/mtpd.rc...
<14>[    3.865230] .(3)[1:init]init: Parsing file /system/etc/init/netd.rc...
<14>[    3.865560] .(2)[1:init]init: Parsing file /system/etc/init/netdiag.rc...
<14>[    3.866891] .(3)[1:init]init: Parsing file /system/etc/init/ppl_agent.rc...
<14>[    3.867774] .(0)[1:init]init: Parsing file /system/etc/init/program_binary_service.rc...
<14>[    3.868633] .(3)[1:init]init: Parsing file /system/etc/init/racoon.rc...
<14>[    3.868947] .(2)[1:init]init: Parsing file /system/etc/init/servicemanager.rc...
<14>[    3.869264] .(3)[1:init]init: Parsing file /system/etc/init/sn.rc...
<14>[    3.870480] .(0)[1:init]init: Parsing file /system/etc/init/storaged.rc...
<14>[    3.871751] .(3)[1:init]init: Parsing file /system/etc/init/storagemanagerd.rc...
<14>[    3.872797] .(2)[1:init]init: Parsing file /system/etc/init/surfaceflinger.rc...
<14>[    3.873994] .(3)[1:init]init: Parsing file /system/etc/init/terserver.rc...
<14>[    3.875420] .(2)[1:init]init: Parsing file /system/etc/init/thermalindicator.rc...
<14>[    3.876368] .(3)[1:init]init: Parsing file /system/etc/init/thermalservice.rc...
<14>[    3.877555] .(0)[1:init]init: Parsing file /system/etc/init/tombstoned.rc...
<14>[    3.879058] .(3)[1:init]init: Parsing file /system/etc/init/uncrypt.rc...
<14>[    3.880067] .(2)[1:init]init: Parsing file /system/etc/init/vdc.rc...
<14>[    3.880995] .(3)[1:init]init: Parsing file /system/etc/init/vold.rc...
<14>[    3.881458] .(6)[1:init]init: Parsing file /system/etc/init/webview_zygote32.rc...
<14>[    3.882675] .(6)[1:init]init: Parsing file /system/etc/init/webview_zygote64.rc...
<14>[    3.883474] .(6)[1:init]init: Parsing file /system/etc/init/wifi-events.rc...
<14>[    3.884393] .(6)[1:init]init: Parsing file /system/etc/init/wificond.rc...
<14>[    3.884825] .(6)[1:init]init: Parsing directory /vendor/etc/init...
<14>[    3.884994] .(6)[1:init]init: Parsing file /vendor/etc/init/aee_aedv.rc...
<14>[    3.886128] .(6)[1:init]init: Parsing file /vendor/etc/init/aee_aedv64.rc...
<14>[    3.887287] .(6)[1:init]init: Parsing file /vendor/etc/init/android.hardware.audio@2.0-service-mediatek.rc...
<14>[    3.888191] .(6)[1:init]init: Parsing file /vendor/etc/init/android.hardware.bluetooth@1.0-service-mediatek.rc...
<14>[    3.889079] .(6)[1:init]init: Parsing file /vendor/etc/init/android.hardware.broadcastradio@1.1-service.rc...
<14>[    3.890063] .(6)[1:init]init: Parsing file /vendor/etc/init/android.hardware.cas@1.0-service.rc...
<14>[    3.891003] .(6)[1:init]init: Parsing file /vendor/etc/init/android.hardware.configstore@1.0-service.rc...
<14>[    3.891364] .(6)[1:init]init: Parsing file /vendor/etc/init/android.hardware.drm@1.0-service.rc...
<14>[    3.891727] .(6)[1:init]init: Parsing file /vendor/etc/init/android.hardware.drm@1.0-service.widevine.rc...
<14>[    3.892853] .(6)[1:init]init: Parsing file /vendor/etc/init/android.hardware.gatekeeper@1.0-service.rc...
<14>[    3.893829] .(6)[1:init]init: Parsing file /vendor/etc/init/android.hardware.graphics.allocator@2.0-service.rc...
<14>[    3.894744] .(6)[1:init]init: Parsing file /vendor/etc/init/android.hardware.graphics.composer@2.1-service.rc...
<14>[    3.895676] .(6)[1:init]init: Parsing file /vendor/etc/init/android.hardware.keymaster@3.0-service.rc...
<14>[    3.896588] .(6)[1:init]init: Parsing file /vendor/etc/init/android.hardware.light@2.0-service-mediatek.rc...
<14>[    3.896983] .(6)[1:init]init: Parsing file /vendor/etc/init/android.hardware.media.omx@1.0-service.rc...
<14>[    3.897427] .(6)[1:init]init: Parsing file /vendor/etc/init/android.hardware.memtrack@1.0-service.rc...
<14>[    3.898407] .(6)[1:init]init: Parsing file /vendor/etc/init/android.hardware.sensors@1.0-service-mediatek.rc...
<14>[    3.899324] .(6)[1:init]init: Parsing file /vendor/etc/init/android.hardware.thermal@1.0-service.rc...
<14>[    3.900253] .(6)[1:init]init: Parsing file /vendor/etc/init/android.hardware.vibrator@1.0-service.rc...
<14>[    3.901147] .(6)[1:init]init: Parsing file /vendor/etc/init/android.hardware.wifi@1.0-service.rc...
<14>[    3.902150] .(6)[1:init]init: Parsing file /vendor/etc/init/camerahalserver.rc...
<14>[    3.903135] .(6)[1:init]init: Parsing file /vendor/etc/init/fuelgauged_init.rc...
<14>[    3.904060] .(6)[1:init]init: Parsing file /vendor/etc/init/fuelgauged_nvram_init.rc...
<14>[    3.904980] .(6)[1:init]init: Parsing file /vendor/etc/init/gsm0710muxd.rc...
<14>[    3.905890] .(6)[1:init]init: Parsing file /vendor/etc/init/hostapd.android.rc...
<14>[    3.906881] .(6)[1:init]init: Parsing file /vendor/etc/init/init.bip.rc...
<14>[    3.907736] .(6)[1:init]init: Parsing file /vendor/etc/init/init.bt_drv.rc...
<14>[    3.908519] .(6)[1:init]init: Parsing file /vendor/etc/init/init.cccifsd.rc...
<14>[    3.908937] .(6)[1:init]init: Parsing file /vendor/etc/init/init.cccimdinit.rc...
<14>[    3.909389] .(6)[1:init]init: Parsing file /vendor/etc/init/init.cccirpcd.rc...
<14>[    3.910349] .(6)[1:init]init: Parsing file /vendor/etc/init/init.gps_drv.rc...
<14>[    3.911200] .(6)[1:init]init: Parsing file /vendor/etc/init/init.md_apps.rc...
<14>[    3.912156] .(6)[1:init]init: Parsing file /vendor/etc/init/init.thermal.rc...
<14>[    3.913322] .(6)[1:init]init: Parsing file /vendor/etc/init/init.thermal_manager.rc...
<14>[    3.915193] .(6)[1:init]init: Parsing file /vendor/etc/init/init.thermalloadalgod.rc...
<14>[    3.917034] .(6)[1:init]init: Parsing file /vendor/etc/init/init.volte_imcb.rc...
<14>[    3.918974] .(6)[1:init]init: Parsing file /vendor/etc/init/init.volte_imsm_93.rc...
<14>[    3.920955] .(6)[1:init]init: Parsing file /vendor/etc/init/init.volte_stack.rc...
<14>[    3.922612] .(6)[1:init]init: Parsing file /vendor/etc/init/init.volte_ua.rc...
<14>[    3.924452] .(6)[1:init]init: Parsing file /vendor/etc/init/init.vtservice.rc...
<11>[    3.926016] .(6)[1:init]init: /vendor/etc/init/init.vtservice.rc: 3: ignored duplicate definition of service 'vtservice'
<11>[    3.926062] .(6)[1:init]init: /vendor/etc/init/init.vtservice.rc: 9: ignored duplicate definition of service 'vtservice_hidl'
<14>[    3.926096] .(6)[1:init]init: Parsing file /vendor/etc/init/init.wfca.rc...
<14>[    3.927087] .(6)[1:init]init: Parsing file /vendor/etc/init/init.wlan_drv.rc...
<14>[    3.927948] .(6)[1:init]init: Parsing file /vendor/etc/init/init.wmt_drv.rc...
<14>[    3.928856] .(6)[1:init]init: Parsing file /vendor/etc/init/init.wod.rc...
<14>[    3.929680] .(6)[1:init]init: Parsing file /vendor/etc/init/init_connectivity.rc...
<14>[    3.930998] .(6)[1:init]init: Parsing file /vendor/etc/init/ipsec_mon.rc...
<14>[    3.932714] .(6)[1:init]init: Parsing file /vendor/etc/init/lbs_hidl_service.rc...
<14>[    3.934367] .(6)[1:init]init: Parsing file /vendor/etc/init/md_ctrl.rc...
<14>[    3.935382] .(6)[1:init]init: Parsing file /vendor/etc/init/mtk_agpsd.rc...
<14>[    3.936403] .(6)[1:init]init: Parsing file /vendor/etc/init/muxreport.rc...
<14>[    3.937316] .(6)[1:init]init: Parsing file /vendor/etc/init/netdagent.rc...
<14>[    3.938167] .(6)[1:init]init: Parsing file /vendor/etc/init/nvram_agent_binder.rc...
<14>[    3.938961] .(6)[1:init]init: Parsing file /vendor/etc/init/nvram_daemon.rc...
<14>[    3.939880] .(6)[1:init]init: Parsing file /vendor/etc/init/rild.rc...
<14>[    3.941016] .(6)[1:init]init: Parsing file /vendor/etc/init/statusd.rc...
<14>[    3.942207] .(6)[1:init]init: Parsing file /vendor/etc/init/sysenv_daemon.rc...
<14>[    3.943436] .(6)[1:init]init: Parsing file /vendor/etc/init/trustkernel.rc...
<14>[    3.944868] .(6)[1:init]init: Parsing file /vendor/etc/init/vendor.mediatek.hardware.dfps@1.0-service.rc...
<14>[    3.945908] .(6)[1:init]init: Parsing file /vendor/etc/init/vendor.mediatek.hardware.gnss@1.1-service.rc...
<14>[    3.947092] .(6)[1:init]init: Parsing file /vendor/etc/init/vendor.mediatek.hardware.keymaster_attestation@1.1-service.rc...
<14>[    3.949513] .(6)[1:init]init: Parsing file /vendor/etc/init/vendor.mediatek.hardware.mtkcodecservice@1.1-service.rc...
<14>[    3.950764] .(6)[1:init]init: Parsing file /vendor/etc/init/vendor.mediatek.hardware.power@1.1-service.rc...
<14>[    3.952696] .(6)[1:init]init: Parsing file /vendor/etc/init/vendor.mediatek.hardware.pq@2.0-service.rc...
<14>[    3.954613] .(6)[1:init]init: Parsing file /vendor/etc/init/vendor.nxp.nxpnfc@1.0-service.rc...
<14>[    3.955878] .(6)[1:init]init: Parsing file /vendor/etc/init/vndservicemanager.rc...
<14>[    3.957141] .(6)[1:init]init: Parsing file /vendor/etc/init/wifi2agps.rc...
<14>[    3.958422] .(6)[1:init]init: Parsing file /odm/etc/init...
<11>[    3.958470] .(6)[1:init]init: Unable to open '/odm/etc/init': No such file or directory
<14>[    3.958750] .(6)[1:init]init: processing action (early-init) from (/init.rc:14)
<14>[    3.965863] .(6)[1:init]init: starting service 'ueventd'...
<14>[    3.967596] .(6)[1:init]init: processing action (early-init) from (/vendor/etc/init/hw/init.mt6763.rc:16)
<3>[    3.967754] .(6)[1:init]BOOTPROF:      3967.752547:INIT:early-init
<5>[    3.967957] .(6)[1:init][Power/PPM] (0x40)(-1)(0)(0-7)(15)(0)(4)(4) (0)(0)(4)(4) 
<6>[    3.968023] .(4)[244:hps_main]CPU request is 0xff
<5>[    3.968149] .(6)[1:init][Power/PPM] (0x40)(-1)(0)(0-7)(0)(0)(4)(4) (0)(0)(4)(4) 
<5>[    3.968326] .(6)[1:init][VcoreFS] vcore_debug: cmd: KIR_BOOTUP, val: 0
<5>[    3.968336] .(6)[1:init][VcoreFS] vcore_debug: cmd: KIR_BOOTUP, val: 0
<5>[    3.968344] .(6)[1:init][VcoreFS] MSDC AUTOK NOT FINISH
<14>[    3.968788] .(6)[1:init]init: processing action (early-init) from (/vendor/etc/init/hw/init.mt6763.usb.rc:1)
<14>[    3.968914] .(6)[1:init]init: processing action (early-init) from (/vendor/etc/init/hw/init.modem.rc:7)
<5>[    3.969040] .(5)[306:ueventd]random: ueventd: uninitialized urandom read (40 bytes read, 47 bits of entropy available)
<14>[    3.969203] .(6)[1:init]init: PropSet [net.perf.rps.default]=[0f] Done
<14>[    3.969229] .(6)[1:init]init: PropSet [net.perf.tether.rps]=[0f] Done
<14>[    3.969255] .(6)[1:init]init: PropSet [net.perf.tether.cpu.core]=[4,4,0,0] Done
<14>[    3.969279] .(6)[1:init]init: PropSet [net.perf.tether.cpu.freq]=[1183000,1638000,0,0] Done
<14>[    3.969300] .(6)[1:init]init: PropSet [net.perf.internal.rps]=[0f] Done
<14>[    3.969324] .(6)[1:init]init: PropSet [net.perf.internal.cpu.core]=[4,4,0,0] Done
<14>[    3.969349] .(6)[1:init]init: PropSet [net.perf.internal.cpu.freq]=[-1,-1,-1,-1] Done
<14>[    3.969381] .(6)[1:init]init: processing action (wait_for_coldboot_done) from (<Builtin Action>:0)
<14>[    3.970712] .(5)[306:ueventd]ueventd: ueventd started!
<14>[    3.970758] .(5)[306:ueventd]ueventd: Parsing file /ueventd.rc...
<14>[    3.974717] .(5)[306:ueventd]ueventd: Parsing file /vendor/ueventd.rc...
<14>[    3.976953] .(6)[306:ueventd]ueventd: Parsing file /odm/ueventd.rc...
<11>[    3.976982] .(6)[306:ueventd]ueventd: Unable to open '/odm/ueventd.rc': No such file or directory
<14>[    3.977140] .(6)[306:ueventd]ueventd: Parsing file /ueventd.mt6763.rc...
<11>[    3.977159] .(6)[306:ueventd]ueventd: Unable to open '/ueventd.mt6763.rc': No such file or directory
<14>[    3.980923] .(6)[306:ueventd]selinux: SELinux: Loaded file_contexts
<14>[    3.980923] 
<3>[    4.030313] .(6)[306:ueventd]power_supply charger: driver failed to report `charge_type' property: -22
<4>[    4.043558] -(4)[266:charger_thread]mt6356_get_auxadc_value: 83 callbacks suppressed
<4>[    4.043567] .(4)[266:charger_thread]=====FG-MTK===== bat_vol=4339
<4>[    4.049323] .(4)[266:charger_thread]=====FG===== AC   = 0
<5>[    4.050225] .(4)[266:charger_thread]Vbat=4339,Ibat=0,I=0,VChr=4730,T=25,Soc=0:0,CT:0:0 hv:1 pd:0:0
<5>[    4.051406] .(4)[266:charger_thread][mtk_is_charger_on]info->chr_type=0 
<6>[    4.052350] .(4)[266:charger_thread]i2c i2c-2: addr: 6c, transfer ACK error
<6>[    4.053255] .(4)[266:charger_thread]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    4.054327] .(4)[266:charger_thread]I2C structure:
<3>[    4.054327] [I2C]Clk=13650000,Id=2,Op=1,Irq_stat=2,Total_len=1
<3>[    4.054327] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=0,speed=400000
<3>[    4.054327] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    4.057530] .(4)[266:charger_thread]base address 0xffffff800bf46000
<6>[    4.058338] .(4)[266:charger_thread]I2C register:
<6>[    4.058338] [I2C]SLAVE_ADDR=d8,INTR_MASK=0,INTR_STAT=1,CONTROL=28,TRANSFER_LEN=1
<6>[    4.058338] [I2C]TRANSAC_LEN=1,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[    4.058338] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=2
<6>[    4.061967] .(4)[266:charger_thread]before enable DMA register(0xffffff800bf48400):
<6>[    4.061967] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    4.061967] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    4.061967] [I2C]TX_LEN=0,RX_LEN=c,INT_BUF_SIZE=0,DEBUG_STATUS=c0c0c00
<6>[    4.061967] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    4.065826] .(4)[266:charger_thread]DMA register(0xffffff800bf48400):
<6>[    4.065826] [I2C]INT_FLAG=2,INT_EN=0,EN=0,RST=0,
<6>[    4.065826] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=9c1c500c
<6>[    4.065826] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=c0c0c00
<6>[    4.065826] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    4.069599] .(4)[266:charger_thread]i2c_dump_info ------------------------------------------
<3>[    4.070674] .(4)[266:charger_thread]i2c i2c-2: last transfer info:
<3>[    4.071473] .(4)[266:charger_thread]i2c i2c-2: [00] [    4.052346] SLAVE_ADDR=d8,INTR_STAT=2,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    4.073126] .(4)[266:charger_thread]i2c i2c-2: [01] [    4.049317] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[    4.074721] .(4)[266:charger_thread]i2c i2c-2: [02] [    4.048971] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    4.076337] .(4)[266:charger_thread]i2c i2c-2: [03] [    3.764483] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=32c,FIFO_STAT=cc01,DEBUGSTAT=300, tmo=500
<3>[    4.077974] .(4)[266:charger_thread]i2c i2c-2: [04] [    3.762222] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    4.079590] .(4)[266:charger_thread]i2c i2c-2: [05] [    3.761006] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    4.081208] .(4)[266:charger_thread]i2c i2c-2: [06] [    3.726974] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=32c,FIFO_STAT=cc01,DEBUGSTAT=300, tmo=500
<3>[    4.082824] .(4)[266:charger_thread]i2c i2c-2: [07] [    3.725354] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    4.084440] .(4)[266:charger_thread]i2c i2c-2: [08] [    3.725012] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    4.086065] .(4)[266:charger_thread]i2c i2c-2: [09] [    3.689830] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=32c,FIFO_STAT=cc01,DEBUGSTAT=300, tmo=499
<4>[    4.087715] .(4)[266:charger_thread][wlc_do_10s_debounce]status=0
<4>[    4.088535] .(4)[266:charger_thread][wlc_do_10s_debounce] gpio5_state =1 zero_jiffies=0 to10s_jiffies=4294893307 valley_jiffies=0 topeak_jiffies=0 
<4>[    4.088952] .(0)[306:ueventd]=====FG===== SOC  = 100
<4>[    4.089733] .(0)[306:ueventd]=====FG===== AC   = 0
<4>[    4.091876] .(0)[306:ueventd]=====FG===== VOLT = 4324
<4>[    4.092531] .(0)[306:ueventd]=====FG===== actural VOLT = 4324
<4>[    4.093857] .(4)[266:charger_thread]=====FG===== AC   = 0
<4>[    4.094969] .(0)[306:ueventd]temp_now=223, temp_last=223 
<4>[    4.095674] .(0)[306:ueventd]=====FG===== TEMP = 223
<4>[    4.096335] .(4)[266:charger_thread]temp_now=223, temp_last=223 
<4>[    4.097122] .(4)[266:charger_thread]=====FG===== TEMP = 223
<5>[    4.097841] .(4)[266:charger_thread]charger_check_status
<4>[    4.097854] .(0)[306:ueventd]=====FG===== SOC  = 100
<4>[    4.098922] .(0)[306:ueventd]bq27542_set_commands cmd = 0x12, val = 3892 
<4>[    4.100078] .(0)[306:ueventd]bq27542_set_commands cmd = 0x3c, val = 3850 
<4>[    4.101530] .(0)[306:ueventd]bq27542_set_commands cmd = 0xc, val = 4004 
<14>[    4.133220] .(0)[306:ueventd]selinux: SELinux: Loaded file_contexts
<14>[    4.133220] 
<5>[    4.166799] .(2)[266:charger_thread][mtk_chg_check_vbus]charger_update_data(4730000 mV) 
<5>[    4.167863] .(2)[266:charger_thread]charger_check_status tmp:22 (jeita:0 sm:0 cv:0 en:0) (sm:1) charging:1 cmd_discharging:0 safety_timeout:0 vbusov_stat:0 can_charging:1, charging:1
<5>[    4.172181] .(3)[266:charger_thread][mtk_battery_notify_OVP_check] OVP_VBUS value=0 chr_type=0 rg cc1=5 cc2=0
<5>[    4.175289] .(7)[266:charger_thread][mtk_battery_notify_OVP_check]charger_vol(4730 mV) 
<3>[    4.540620] .(2)[229:kworker/2:2]CDP, timeout
<4>[    4.596628] -(2)[229:kworker/2:2]usb_6763_dpidle_request: 5 callbacks suppressed
<5>[    4.596634] -(2)[229:kworker/2:2][MUSB]usb_6763_dpidle_request 120: USB_DPIDLE_FORBIDDEN, skip_cnt<5>
<4>[    4.598865] -(2)[229:kworker/2:2]usb_6763_dpidle_request: 5 callbacks suppressed
<5>[    4.598868] -(2)[229:kworker/2:2][MUSB]usb_6763_dpidle_request 113: USB_DPIDLE_ALLOWED, skip_cnt<5>
<5>[    4.600985] .(2)[229:kworker/2:2][MUSB]Charger_Detect_Init 729: Charger_Detect_Init
<14>[    4.628269] .(4)[306:ueventd]ueventd: Coldboot took 0.647 seconds
<14>[    4.637869] .(1)[1:init]init: Command 'wait_for_coldboot_done' action=wait_for_coldboot_done (<Builtin Action>:0) returned 0 took 668ms.
<14>[    4.639512] .(1)[1:init]init: processing action (mix_hwrng_into_linux_rng) from (<Builtin Action>:0)
<11>[    4.640723] .(1)[1:init]init: /dev/hw_random not found
<14>[    4.641419] .(1)[1:init]init: processing action (set_mmap_rnd_bits) from (<Builtin Action>:0)
<14>[    4.643193] .(1)[1:init]init: processing action (set_kptr_restrict) from (<Builtin Action>:0)
<14>[    4.644435] .(1)[1:init]init: processing action (keychord_init) from (<Builtin Action>:0)
<11>[    4.645555] .(1)[1:init]init: could not open /dev/keychord: No such file or directory
<14>[    4.646583] .(1)[1:init]init: processing action (console_init) from (<Builtin Action>:0)
<14>[    4.647745] .(1)[1:init]init: processing action (init) from (/init.rc:44)
<11>[    4.648904] .(1)[1:init]init: Unable to open '/default.prop': Too many symbolic links encountered
<11>[    4.661256] .(1)[1:init]init: Unable to open '/proc/sys/kernel/hung_task_timeout_secs': No such file or directory
<11>[    4.662601] .(1)[1:init]init: Unable to open '/proc/cpu/alignment': No such file or directory
<5>[    4.676712] .(1)[1:init]Registered swp emulation handler
<11>[    4.677582] .(1)[1:init]init: Unable to open '/sys/class/leds/vibrator/trigger': No such file or directory
<14>[    4.679365] .(1)[1:init]init: processing action (init) from (/init.environ.rc:2)
<14>[    4.680408] .(1)[1:init]init: processing action (init) from (/vendor/etc/init/hw/init.mt6763.rc:25)
<11>[    4.684989] .(1)[1:init]init: Unable to open '/dev/cpuctl/bg_non_interactive/cpu.rt_runtime_us': No such file or directory
<14>[    4.686433] .(1)[1:init]init: processing action (init) from (/vendor/etc/init/hw/init.mt6763.rc:1148)
<14>[    4.688152] .(1)[1:init]init: processing action (init) from (/vendor/etc/init/hw/init.project.rc:5)
<14>[    4.690665] .(1)[1:init]init: processing action (init) from (/vendor/etc/init/hw/init.datalogic.rc:3)
<6>[    4.692724] .(1)[1:init][D][Factory Data](property_reload): id = 0 
<6>[    4.693539] .(1)[1:init][D][Factory Data](jprkernel_read_from_storage): +
<6>[    4.695200] .(0)[1:init][D][Factory Data](_factory_update_revision): +
<6>[    4.696041] .(0)[1:init][I][Factory Data](_factory_update_revision): Factory Data is REV3 - wrapper size 37 - data_size 304
<6>[    4.697482] .(0)[1:init][D][Factory Data](check_valid_data): +
<6>[    4.698229] .(0)[1:init][D][Factory Data](factory_data_check_crc32): +
<6>[    4.699082] .(0)[1:init][D][Factory Data](factory_data_check_crc32): factory_data: computed crc = 9270c0a5
<6>[    4.700312] .(0)[1:init][I][Factory Data](factory_data_check_crc32): CRC32 check passed!
<6>[    4.701364] .(0)[1:init][D][Factory Data](check_valid_data): OK
<6>[    4.702140] .(0)[1:init][D][Factory Data](check_valid_data): +
<6>[    4.702886] .(0)[1:init][D][Factory Data](factory_data_check_crc32): +
<6>[    4.703734] .(0)[1:init][D][Factory Data](factory_data_check_crc32): factory_data: computed crc = 9270c0a5
<6>[    4.704977] .(0)[1:init][I][Factory Data](factory_data_check_crc32): CRC32 check passed!
<6>[    4.706010] .(0)[1:init][D][Factory Data](check_valid_data): OK
<6>[    4.706780] .(0)[1:init][I][Factory Data](_factory_read_partition): OK
<6>[    4.707786] .(0)[1:init][D][Factory Ext Data](property_reload): id = 0 
<6>[    4.708646] .(0)[1:init][D][Factory Ext Data](kernel_read_from_storage): +
<6>[    4.710078] .(0)[1:init][D][Factory Ext Data](_factory_ext_update_revision): +
<6>[    4.711001] .(0)[1:init][I][Factory Ext Data](_factory_ext_update_revision): Factory Data is REV0 - wrapper size 7 - data_size 16
<6>[    4.712486] .(0)[1:init][D][Factory Ext Data](check_valid_data): +
<6>[    4.713303] .(0)[1:init][D][Factory Ext Data](factory_ext_data_check_crc32): +
<6>[    4.714226] .(0)[1:init][D][Factory Ext Data](factory_ext_data_check_crc32): factory_ext_data: computed crc = ecbb4b55
<6>[    4.715590] .(0)[1:init][I][Factory Ext Data](factory_ext_data_check_crc32): CRC32 check passed!
<6>[    4.716726] .(0)[1:init][D][Factory Ext Data](check_valid_data): OK
<6>[    4.717532] .(0)[1:init][D][Factory Ext Data](check_valid_data): +
<6>[    4.718333] .(0)[1:init][D][Factory Ext Data](factory_ext_data_check_crc32): +
<6>[    4.719266] .(0)[1:init][D][Factory Ext Data](factory_ext_data_check_crc32): factory_ext_data: computed crc = ecbb4b55
<6>[    4.720654] .(0)[1:init][I][Factory Ext Data](factory_ext_data_check_crc32): CRC32 check passed!
<6>[    4.721770] .(0)[1:init][D][Factory Ext Data](check_valid_data): OK
<6>[    4.722583] .(0)[1:init][I][Factory Ext Data](_factory_ext_read_partition): OK
<6>[    4.723516] .(0)[1:init][D][Factory Ext Data](_factory_ext_trigger_callbacks): 
<5>[    4.724461] .(0)[1:init][MUSB]factory_ext_callback_usb_data_lock 643: factory_ext_callback_usb_data_lock (id=4d, gn_boot_reason=4)
<6>[    4.725965] .(0)[1:init][D][Factory Ext Data](dl_factory_ext_callback_parse_int): -
<5>[    4.726944] .(0)[1:init][MUSB]factory_ext_callback_usb_data_lock 651: factory_ext_callback_usb_data_lock (g_factory_ext_is_usb_data_lock=0)
<5>[    4.728539] .(0)[1:init][MUSB]factory_ext_callback_usb_charge_lock 673: factory_ext_callback_usb_charge_lock (id=5d, gn_boot_reason=4)
<6>[    4.730085] .(0)[1:init][D][Factory Ext Data](dl_factory_ext_callback_parse_int): -
<5>[    4.731065] .(0)[1:init][MUSB]factory_ext_callback_usb_charge_lock 691: factory_ext_callback_usb_charge_lock (g_factory_ext_is_usb_charge_lock=0)
<5>[    4.732736] .(0)[1:init][MUSB]factory_ext_callback 636: factory_ext_callback (id=6d)
<14>[    4.734090] .(0)[1:init]init: processing action (init) from (/vendor/etc/init/hw/init.aee.rc:42)
<14>[    4.735385] .(0)[1:init]init: processing action (mix_hwrng_into_linux_rng) from (<Builtin Action>:0)
<11>[    4.736571] .(0)[1:init]init: /dev/hw_random not found
<14>[    4.737324] .(0)[1:init]init: processing action (late-init) from (/init.rc:301)
<14>[    4.738312] .(0)[1:init]init: processing action (late-init) from (/vendor/etc/init/hw/init.mt6763.rc:66)
<3>[    4.739620] .(0)[1:init]BOOTPROF:      4739.619933:INIT:late-init
<14>[    4.740670] .(0)[1:init]init: processing action (queue_property_triggers) from (<Builtin Action>:0)
<14>[    4.741979] .(4)[1:init]init: processing action (fs) from (/vendor/etc/init/hw/init.mt6763.rc:101)
<3>[    4.743189] .(4)[1:init]BOOTPROF:      4743.188780:INIT:Mount_START
<14>[    4.746877] .(6)[315:init]init: [libfs_mgr]Invalid ext4 magic:0x75cc on '/dev/block/platform/bootdevice/by-name/userdata'
<11>[    4.748340] .(6)[315:init]init: [libfs_mgr]mount_with_alternatives(): skipping mount, invalid ext4, mountpoint=/data rec[2].fs_type=ext4
<11>[    4.750679] .(6)[315:init]init: [libfs_mgr]fs_mgr_mount_all(): possibly an encryptable blkdev /dev/block/platform/bootdevice/by-name/userdata for mount /data type ext4
<14>[    4.753471] .(6)[315:init]init: [libfs_mgr]superblock s_max_mnt_count:10,/dev/block/platform/bootdevice/by-name/cache
<4>[    4.755458] .(6)[315:init]EXT4-fs (mmcblk0p35): Ignoring removed nomblk_io_submit option
<6>[    4.758433] .(6)[315:init]EXT4-fs (mmcblk0p35): mounted filesystem with ordered data mode. Opts: errors=remount-ro,nomblk_io_submit
<14>[    4.760179] .(6)[315:init]init: [libfs_mgr]check_fs(): mount(/dev/block/platform/bootdevice/by-name/cache,/cache,ext4)=0: Success
<14>[    4.762587] .(6)[315:init]init: [libfs_mgr]check_fs(): unmount(/cache) succeeded
<14>[    4.765479] .(6)[315:init]init: [libfs_mgr]Running /system/bin/e2fsck on /dev/block/platform/bootdevice/by-name/cache
<5>[    4.778767] .(5)[318:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 53 bits of entropy available)
<5>[    4.832929] .(4)[318:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 55 bits of entropy available)
<14>[    4.847656] .(6)[315:init]e2fsck: e2fsck 1.43.3 (04-Sep-2016)
<14>[    4.847656] 
<14>[    4.848673] .(6)[315:init]e2fsck: cache: clean, 14/27648 files, 3570/110592 blocks (check in 4 mounts)
<14>[    4.848673] 
<6>[    4.852451] .(6)[315:init]EXT4-fs (mmcblk0p35): mounted filesystem with ordered data mode. Opts: noauto_da_alloc,discard
<5>[    4.852888] .(2)[229:kworker/2:2][MUSB]Charger_Detect_Release 762: Charger_Detect_Release
<3>[    4.852893] .(2)[229:kworker/2:2]charger type: 2, Charging USB Host
<3>[    4.852896] .(2)[229:kworker/2:2]chrdet_inform_psy_changed: online = 1, charger type = 2
<3>[    4.852906] .(2)[229:kworker/2:2]chrdet_inform_psy_changed g_factory_ext_is_usb_charge_lock is 0 !!!
<3>[    4.852906] 
<6>[    4.852904] .(2)[229:kworker/2:2]mt_charger_set_property
<6>[    4.852908] .(2)[229:kworker/2:2]mt_charger_set_property
<3>[    4.852911] .(2)[229:kworker/2:2]dump_charger_name: charger type: 2, Charging USB Host
<5>[    4.852915] .(2)[229:kworker/2:2][MUSB]mt_usb_connect 517: issue work
<5>[    4.852928] .(2)[229:kworker/2:2][MUSB]mt_usb_connect 519: [MUSB] USB connect
<5>[    4.852932] .(2)[229:kworker/2:2]mtk_charger_int_handler
<5>[    4.852934] .(2)[229:kworker/2:2]wake_up_charger
<5>[    4.852938] .(4)[6:kworker/u16:0][MUSB]do_connection_work 430: !is_ready, retrigger after 50 ms, is_host<0>, power<0>, skip_cnt<0>
<5>[    4.852941] .(2)[229:kworker/2:2]battery_callback:1
<4>[    4.856621] .(2)[229:kworker/2:2]temp_now=223, temp_last=223 
<4>[    4.856626] .(2)[229:kworker/2:2]=====FG===== TEMP = 223
<4>[    4.859241] .(2)[229:kworker/2:2]=====FG===== VOLT = 4319
<4>[    4.859245] .(2)[229:kworker/2:2]=====FG===== actural VOLT = 4319
<6>[    4.859252] .(2)[229:kworker/2:2]power_supply battery: power_supply_changed
<6>[    4.859263] .(2)[229:kworker/2:2]power_supply ac: power_supply_changed
<6>[    4.859270] .(2)[229:kworker/2:2]power_supply usb: power_supply_changed
<4>[    4.860609] .(2)[229:kworker/2:2]temp_now=223, temp_last=223 
<4>[    4.860613] .(2)[229:kworker/2:2]=====FG===== TEMP = 223
<4>[    4.861157] .(2)[229:kworker/2:2]temp_now=223, temp_last=223 
<4>[    4.861160] .(2)[229:kworker/2:2]=====FG===== TEMP = 223
<4>[    4.862393] .(2)[229:kworker/2:2]=====FG===== SOC  = 100
<4>[    4.863694] .(2)[229:kworker/2:2]=====FG===== AC   = -6
<4>[    4.865833] .(2)[229:kworker/2:2]=====FG===== VOLT = 4319
<4>[    4.865837] .(2)[229:kworker/2:2]=====FG===== actural VOLT = 4319
<4>[    4.866581] .(2)[229:kworker/2:2]temp_now=223, temp_last=223 
<4>[    4.866585] .(2)[229:kworker/2:2]=====FG===== TEMP = 223
<4>[    4.867275] .(2)[229:kworker/2:2]=====FG===== SOC  = 100
<4>[    4.867979] .(2)[229:kworker/2:2]bq27542_set_commands cmd = 0x12, val = 3892 
<4>[    4.868778] .(2)[229:kworker/2:2]bq27542_set_commands cmd = 0x3c, val = 3850 
<4>[    4.870041] .(2)[229:kworker/2:2]bq27542_set_commands cmd = 0xc, val = 4004 
<14>[    4.882251] .(6)[315:init]init: [libfs_mgr]__mount(source=/dev/block/platform/bootdevice/by-name/cache,target=/cache,type=ext4)=0: Success
<14>[    4.884835] .(6)[315:init]init: [libfs_mgr]superblock s_max_mnt_count:65535,/dev/block/platform/bootdevice/by-name/protect1
<4>[    4.886992] .(6)[315:init]EXT4-fs (mmcblk0p13): Ignoring removed nomblk_io_submit option
<6>[    4.889994] .(6)[315:init]EXT4-fs (mmcblk0p13): mounted filesystem with ordered data mode. Opts: errors=remount-ro,nomblk_io_submit
<14>[    4.892221] .(6)[315:init]init: [libfs_mgr]check_fs(): mount(/dev/block/platform/bootdevice/by-name/protect1,/vendor/protect_f,ext4)=0: Success
<14>[    4.894721] .(6)[315:init]init: [libfs_mgr]check_fs(): unmount(/vendor/protect_f) succeeded
<14>[    4.895816] .(6)[315:init]init: [libfs_mgr]Running /system/bin/e2fsck on /dev/block/platform/bootdevice/by-name/protect1
<5>[    4.899276] .(5)[323:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 56 bits of entropy available)
<5>[    4.904660] .(4)[6:kworker/u16:0][MUSB]do_connection_work 430: !is_ready, retrigger after 50 ms, is_host<0>, power<0>, skip_cnt<0>
<5>[    4.910590] .(5)[323:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 56 bits of entropy available)
<14>[    4.918505] .(5)[315:init]e2fsck: e2fsck 1.43.3 (04-Sep-2016)
<14>[    4.918505] 
<14>[    4.919490] .(5)[315:init]e2fsck: /dev/block/platform/bootdevice/by-name/protect1: clean, 165/2048 files, 1268/2048 blocks
<14>[    4.919490] 
<6>[    4.923916] .(4)[315:init]EXT4-fs (mmcblk0p13): mounted filesystem with ordered data mode. Opts: noauto_da_alloc,commit=1,nodelalloc
<14>[    4.926144] .(4)[315:init]init: [libfs_mgr]__mount(source=/dev/block/platform/bootdevice/by-name/protect1,target=/vendor/protect_f,type=ext4)=0: Success
<14>[    4.928758] .(4)[315:init]init: [libfs_mgr]superblock s_max_mnt_count:65535,/dev/block/platform/bootdevice/by-name/protect2
<4>[    4.930906] .(4)[315:init]EXT4-fs (mmcblk0p14): Ignoring removed nomblk_io_submit option
<6>[    4.933721] .(4)[315:init]EXT4-fs (mmcblk0p14): mounted filesystem with ordered data mode. Opts: errors=remount-ro,nomblk_io_submit
<14>[    4.935941] .(4)[315:init]init: [libfs_mgr]check_fs(): mount(/dev/block/platform/bootdevice/by-name/protect2,/vendor/protect_s,ext4)=0: Success
<14>[    4.938511] .(4)[315:init]init: [libfs_mgr]check_fs(): unmount(/vendor/protect_s) succeeded
<14>[    4.939607] .(4)[315:init]init: [libfs_mgr]Running /system/bin/e2fsck on /dev/block/platform/bootdevice/by-name/protect2
<5>[    4.943049] .(6)[328:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 57 bits of entropy available)
<5>[    4.954279] .(6)[328:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 57 bits of entropy available)
<5>[    4.956802] .(5)[6:kworker/u16:0][MUSB]do_connection_work 430: !is_ready, retrigger after 50 ms, is_host<0>, power<0>, skip_cnt<0>
<14>[    4.962152] .(4)[315:init]e2fsck: e2fsck 1.43.3 (04-Sep-2016)
<14>[    4.962152] 
<14>[    4.963138] .(4)[315:init]e2fsck: /dev/block/platform/bootdevice/by-name/protect2: clean, 16/3200 files, 1147/3191 blocks
<14>[    4.963138] 
<6>[    4.967230] .(5)[315:init]EXT4-fs (mmcblk0p14): mounted filesystem with ordered data mode. Opts: noauto_da_alloc,commit=1,nodelalloc
<14>[    4.969451] .(5)[315:init]init: [libfs_mgr]__mount(source=/dev/block/platform/bootdevice/by-name/protect2,target=/vendor/protect_s,type=ext4)=0: Success
<14>[    4.972085] .(5)[315:init]init: [libfs_mgr]superblock s_max_mnt_count:65535,/dev/block/platform/bootdevice/by-name/nvdata
<4>[    4.974209] .(5)[315:init]EXT4-fs (mmcblk0p11): Ignoring removed nomblk_io_submit option
<6>[    4.977862] .(5)[315:init]EXT4-fs (mmcblk0p11): mounted filesystem with ordered data mode. Opts: errors=remount-ro,nomblk_io_submit
<14>[    4.980083] .(5)[315:init]init: [libfs_mgr]check_fs(): mount(/dev/block/platform/bootdevice/by-name/nvdata,/vendor/nvdata,ext4)=0: Success
<14>[    4.982579] .(5)[315:init]init: [libfs_mgr]check_fs(): unmount(/vendor/nvdata) succeeded
<14>[    4.983646] .(5)[315:init]init: [libfs_mgr]Running /system/bin/e2fsck on /dev/block/platform/bootdevice/by-name/nvdata
<5>[    4.987114] .(6)[333:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 57 bits of entropy available)
<5>[    4.998397] .(6)[333:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 57 bits of entropy available)
<14>[    5.006246] .(6)[315:init]e2fsck: e2fsck 1.43.3 (04-Sep-2016)
<14>[    5.006246] 
<14>[    5.007232] .(6)[315:init]e2fsck: /dev/block/platform/bootdevice/by-name/nvdata: clean, 422/16384 files, 2126/16384 blocks
<14>[    5.007232] 
<6>[    5.012156] .(6)[315:init]EXT4-fs (mmcblk0p11): mounted filesystem with ordered data mode. Opts: noauto_da_alloc,discard
<14>[    5.014204] .(6)[315:init]init: [libfs_mgr]__mount(source=/dev/block/platform/bootdevice/by-name/nvdata,target=/vendor/nvdata,type=ext4)=0: Success
<14>[    5.016792] .(6)[315:init]init: [libfs_mgr]superblock s_max_mnt_count:65535,/dev/block/platform/bootdevice/by-name/nvcfg
<4>[    5.018891] .(6)[315:init]EXT4-fs (mmcblk0p10): Ignoring removed nomblk_io_submit option
<6>[    5.021799] .(6)[315:init]EXT4-fs (mmcblk0p10): mounted filesystem with ordered data mode. Opts: errors=remount-ro,nomblk_io_submit
<14>[    5.024035] .(6)[315:init]init: [libfs_mgr]check_fs(): mount(/dev/block/platform/bootdevice/by-name/nvcfg,/vendor/nvcfg,ext4)=0: Success
<14>[    5.026502] .(6)[315:init]init: [libfs_mgr]check_fs(): unmount(/vendor/nvcfg) succeeded
<14>[    5.027557] .(6)[315:init]init: [libfs_mgr]Running /system/bin/e2fsck on /dev/block/platform/bootdevice/by-name/nvcfg
<14>[    5.047290] .(5)[315:init]e2fsck: e2fsck 1.43.3 (04-Sep-2016)
<14>[    5.047290] 
<14>[    5.048277] .(5)[315:init]e2fsck: /dev/block/platform/bootdevice/by-name/nvcfg: clean, 18/8192 files, 1300/8192 blocks
<14>[    5.048277] 
<6>[    5.052365] .(4)[315:init]EXT4-fs (mmcblk0p10): mounted filesystem with ordered data mode. Opts: noauto_da_alloc,commit=1,nodelalloc
<14>[    5.054594] .(4)[315:init]init: [libfs_mgr]__mount(source=/dev/block/platform/bootdevice/by-name/nvcfg,target=/vendor/nvcfg,type=ext4)=0: Success
<14>[    5.057104] .(4)[315:init]init: [libfs_mgr]superblock s_max_mnt_count:10,/dev/block/platform/bootdevice/by-name/enterprise
<4>[    5.059186] .(4)[315:init]EXT4-fs (mmcblk0p7): Ignoring removed nomblk_io_submit option
<4>[    5.062900] .(5)[315:init]EXT4-fs (mmcblk0p7): warning: maximal mount count reached, running e2fsck is recommended
<6>[    5.064849] .(5)[315:init]EXT4-fs (mmcblk0p7): mounted filesystem with ordered data mode. Opts: errors=remount-ro,nomblk_io_submit
<14>[    5.066606] .(5)[315:init]init: [libfs_mgr]check_fs(): mount(/dev/block/platform/bootdevice/by-name/enterprise,/enterprise,ext4)=0: Success
<14>[    5.069136] .(5)[315:init]init: [libfs_mgr]check_fs(): unmount(/enterprise) succeeded
<14>[    5.070173] .(5)[315:init]init: [libfs_mgr]Running /system/bin/e2fsck on /dev/block/platform/bootdevice/by-name/enterprise
<5>[    5.086853] .(6)[343:e2fsck]audit: type=1400 audit(1578635486.849:4): avc:  denied  { read } for  pid=343 comm="e2fsck" name="mmcblk0p7" dev="tmpfs" ino=8486 scontext=u:r:fsck:s0 tcontext=u:object_r:frp_block_device:s0 tclass=blk_file permissive=0
<5>[    5.089732] .(6)[343:e2fsck]audit: type=1400 audit(1578635486.853:5): avc:  denied  { read write } for  pid=343 comm="e2fsck" name="mmcblk0p7" dev="tmpfs" ino=8486 scontext=u:r:fsck:s0 tcontext=u:object_r:frp_block_device:s0 tclass=blk_file permissive=0
<14>[    5.093612] .(5)[315:init]e2fsck: e2fsck 1.43.3 (04-Sep-2016)
<14>[    5.093612] 
<14>[    5.094593] .(5)[315:init]e2fsck: /system/bin/e2fsck: Permission denied while trying to open /dev/block/platform/bootdevice/by-name/enterprise
<14>[    5.094593] 
<14>[    5.096428] .(5)[315:init]e2fsck: 
<14>[    5.096428] 
<14>[    5.097129] .(5)[315:init]e2fsck: You must have r/w access to the filesystem or be root
<14>[    5.097129] 
<14>[    5.098385] .(5)[315:init]e2fsck: e2fsck terminated by exit(8)
<14>[    5.098385] 
<14>[    5.099527] .(5)[315:init]init: [libfs_mgr]e2fsck returned status 0x800
<4>[    5.103469] .(5)[315:init]EXT4-fs (mmcblk0p7): warning: maximal mount count reached, running e2fsck is recommended
<6>[    5.105451] .(5)[315:init]EXT4-fs (mmcblk0p7): mounted filesystem with ordered data mode. Opts: noauto_da_alloc,discard
<14>[    5.106948] .(5)[315:init]init: [libfs_mgr]__mount(source=/dev/block/platform/bootdevice/by-name/enterprise,target=/enterprise,type=ext4)=0: Success
<14>[    5.109655] .(4)[1:init]init: Parsing file /odm/etc/init...
<11>[    5.110409] .(4)[1:init]init: Unable to open '/odm/etc/init': No such file or directory
<14>[    5.111493] .(4)[1:init]init: Command 'mount_all /vendor/etc/fstab.mt6763' action=fs (/vendor/etc/init/hw/init.mt6763.rc:113) returned 2 took 367ms.
<14>[    5.115147] .(5)[1:init]init: starting service 'exec 1 (/system/bin/tune2fs -O has_journal -u 10010 -r 4096 /dev/block/platform/bootdevice/by-name/userdata)'...
<14>[    5.118050] .(5)[1:init]init: SVC_EXEC pid 346 (uid 0 gid 0+0 context default) started; waiting...
<14>[    5.138149] .(5)[1:init]init: Service 'exec 1 (/system/bin/tune2fs -O has_journal -u 10010 -r 4096 /dev/block/platform/bootdevice/by-name/userdata)' (pid 346) killed by signal 1 waiting took 0.024000 seconds
<3>[    5.140924] .(5)[1:init]BOOTPROF:      5140.923627:INIT:Mount_END
<6>[    5.143228] .(5)[1:init]zram0: detected capacity change from 0 to 1073741824
<4>[    5.160641] .(2)[229:kworker/2:2][SLhall]SLhall_setup_eint
<4>[    5.161356] .(2)[229:kworker/2:2]****Close******** 
<4>[    5.163342] .(2)[229:kworker/2:2]****mt_gpio_set_debounce,gpiopin=5, debounce=0*** 
<4>[    5.164420] .(2)[229:kworker/2:2][Hall]Hall set EINT finished, hall_irq=677, halldebounce=0 
<4>[    5.165513] -(2)[229:kworker/2:2]------------[ cut here ]------------
<4>[    5.166336] -(2)[229:kworker/2:2]WARNING: CPU: 2 PID: 229 at /data/jenkins/workspace/dl35_oreo/kernel-4.4/kernel/irq/manage.c:605 irq_set_irq_wake+0x100/0x140()
<4>[    5.168160] -(2)[229:kworker/2:2]Unbalanced IRQ 677 wake disable
<4>[    5.168942] -(2)[229:kworker/2:2]Modules linked in: fpsgo ffffff8000c2f000           (null) 2624 0 (O)
<4>[    5.169876] -(2)[229:kworker/2:2]CPU: 2 PID: 229 Comm: kworker/2:2 Tainted: G        W  O    4.4.95+ #2
<4>[    5.171078] -(2)[229:kworker/2:2]Hardware name: MT6763V/B (DT)
<4>[    5.171849] -(2)[229:kworker/2:2]Workqueue: hall_delay hall_delay_func
<4>[    5.172424] -(2)[229:kworker/2:2]Call trace:
<4>[    5.172986] -(2)[229:kworker/2:2][<ffffff800808a298>] dump_backtrace+0x0/0x228
<4>[    5.173920] -(2)[229:kworker/2:2][<ffffff800808a4d4>] show_stack+0x14/0x20
<4>[    5.174808] -(2)[229:kworker/2:2][<ffffff8008360870>] dump_stack+0xa0/0xc0
<4>[    5.175698] -(2)[229:kworker/2:2][<ffffff80080a1bc4>] warn_slowpath_common+0x9c/0xd8
<4>[    5.176696] -(2)[229:kworker/2:2][<ffffff80080a1c5c>] warn_slowpath_fmt+0x5c/0x80
<4>[    5.177661] -(2)[229:kworker/2:2][<ffffff800810b5b0>] irq_set_irq_wake+0x100/0x140
<4>[    5.178637] -(2)[229:kworker/2:2][<ffffff80087eccdc>] hall_delay_func+0x18c/0xa58
<4>[    5.179602] -(2)[229:kworker/2:2][<ffffff80080bda10>] process_one_work+0x1d0/0x468
<4>[    5.180579] -(2)[229:kworker/2:2][<ffffff80080bddd8>] worker_thread+0x130/0x4e0
<4>[    5.181522] -(2)[229:kworker/2:2][<ffffff80080c3fbc>] kthread+0xec/0x100
<4>[    5.182390] -(2)[229:kworker/2:2][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    5.183312] -(2)[229:kworker/2:2]---[ end trace 8cfa91f0817a7c73 ]---
<4>[    5.184167] .(2)[229:kworker/2:2]Scanner_setup_eint
<4>[    5.184225] -(5)[347:mkswap]hall for switching 10W of WLC ===****far away******** 
<4>[    5.184231] -(5)[347:mkswap] ~~~kpd_send_wlcoff_msg slid=1!!
<4>[    5.184243] -(5)[347:mkswap] ~~~kpd_send_wlcoff_msg slid=0!!
<4>[    5.184256] -(5)[347:mkswap][EINT]Warn!EINT:5 run too long,s:5165514704,e:5184254858,total:18740154
<4>[    5.184259] .(6)[69:kworker/u16:2]****Open******** 
<4>[    5.184263] .(6)[69:kworker/u16:2][wc_rect_en] state=1
<4>[    5.184291] .(5)[85:kworker/5:1]charger thread chr_type diff with pmic chr_type 
<6>[    5.184299] .(5)[85:kworker/5:1]power_supply ac: power_supply_changed
<14>[    5.190874] .(4)[1:init]mkswap: Swapspace size: 1048572k, UUID=7641082d-5cc7-4ee4-af60-dc9e78a7f2f5
<6>[    5.191890] .(4)[1:init]Adding 1048572k swap on /dev/block/zram0.  Priority:-1 extents:1 across:1048572k SS
<14>[    5.192042] .(4)[1:init]init: processing action (fs) from (/vendor/etc/init/hw/init.mt6763.rc:121)
<4>[    5.192400] .(7)[266:charger_thread]TempToCurrent no charge on
<5>[    5.192407] .(7)[266:charger_thread][charger_routine_thread]flags=0,1 
<4>[    5.192432] .(7)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<7>[    5.194381] .(6)[1:init]ISO 9660 Extensions: RRIP_1991A
<14>[    5.194715] .(6)[1:init]init: processing action (fs) from (/vendor/etc/init/hw/init.project.rc:10)
<14>[    5.195577] .(6)[1:init]init: processing action (fs) from (/system/etc/init/logd.rc:18)
<14>[    5.196177] .(6)[1:init]init: processing action (fs) from (/system/etc/init/wifi-events.rc:17)
<14>[    5.196260] .(6)[1:init]init: PropSet [sys.wifitracing.started]=[0] Done
<14>[    5.196336] .(6)[1:init]init: processing action (post-fs) from (/init.rc:334)
<14>[    5.198608] .(6)[1:init]init: PropSet [rild.libpath]=[mtk-ril.so] Done
<14>[    5.198633] .(6)[1:init]init: PropSet [rild.libargs]=[-d /dev/ttyC0] Done
<14>[    5.198650] .(6)[1:init]init: PropSet [wifi.interface]=[wlan0] Done
<14>[    5.198684] .(6)[1:init]init: PropSet [mediatek.wlan.ctia]=[0] Done
<14>[    5.198703] .(6)[1:init]init: PropSet [wifi.tethering.interface]=[ap0] Done
<14>[    5.198727] .(6)[1:init]init: PropSet [wifi.direct.interface]=[p2p0] Done
<14>[    5.198796] .(6)[1:init]init: PropSet [sys.ipo.pwrdncap]=[2] Done
<14>[    5.198870] .(6)[1:init]init: PropSet [qemu.hw.mainkeys]=[1] Done
<14>[    5.198930] .(6)[1:init]init: PropSet [sys.ipo.disable]=[1] Done
<14>[    5.198946] .(6)[1:init]init: PropSet [net.hostname]=[MEMOR10] Done
<14>[    5.198973] .(6)[1:init]init: PropSet [persist.sys.dalvik.vm.lib.2]=[libart.so] Done
<14>[    5.198993] .(6)[1:init]init: PropSet [dalvik.vm.isa.arm64.variant]=[cortex-a53] Done
<14>[    5.199010] .(6)[1:init]init: PropSet [dalvik.vm.isa.arm64.features]=[default] Done
<14>[    5.199028] .(6)[1:init]init: PropSet [dalvik.vm.isa.arm.variant]=[cortex-a53] Done
<14>[    5.199045] .(6)[1:init]init: PropSet [dalvik.vm.isa.arm.features]=[default] Done
<14>[    5.199061] .(6)[1:init]init: PropSet [net.bt.name]=[Android] Done
<14>[    5.199079] .(6)[1:init]init: PropSet [dalvik.vm.stack-trace-dir]=[/data/anr] Done
<12>[    5.199137] .(6)[1:init]init: Couldn't load property file: Unable to open '/odm/build.prop': No such file or directory: No such file or directory
<14>[    5.200555] .(6)[1:init]init: PropSet [persist.sys.timezone]=[Asia/Shanghai] Done
<14>[    5.200648] .(6)[1:init]init: PropSet [persist.radio.default.sim]=[0] Done
<14>[    5.200669] .(6)[1:init]init: PropSet [persist.radio.erlvt.on]=[1] Done
<14>[    5.200685] .(6)[1:init]init: PropSet [camera.mdp.cz.enable]=[1] Done
<14>[    5.200701] .(6)[1:init]init: PropSet [ril.specific.sm_cause]=[0] Done
<14>[    5.200716] .(6)[1:init]init: PropSet [bgw.current3gband]=[0] Done
<14>[    5.200732] .(6)[1:init]init: PropSet [ril.external.md]=[0] Done
<11>[    5.200765] .(6)[1:init]init: property_set("ro.opengles.version", "196610") failed: property already set
<14>[    5.200781] .(6)[1:init]init: PropSet [persist.radio.fd.counter]=[150] Done
<14>[    5.200798] .(6)[1:init]init: PropSet [persist.radio.fd.off.counter]=[50] Done
<14>[    5.200815] .(6)[1:init]init: PropSet [persist.radio.fd.r8.counter]=[150] Done
<14>[    5.200832] .(6)[1:init]init: PropSet [persist.radio.fd.off.r8.counter]=[50] Done
<14>[    5.200848] .(6)[1:init]init: PropSet [drm.service.enabled]=[true] Done
<14>[    5.200863] .(6)[1:init]init: PropSet [fmradio.driver.enable]=[0] Done
<14>[    5.200889] .(6)[1:init]init: PropSet [mtk.eccci.c2k]=[enabled] Done
<14>[    5.200905] .(6)[1:init]init: PropSet [ril.first.md]=[1] Done
<14>[    5.200923] .(6)[1:init]init: PropSet [ril.flightmode.poweroffMD]=[1] Done
<14>[    5.200939] .(6)[1:init]init: PropSet [ril.telephony.mode]=[0] Done
<14>[    5.200957] .(6)[1:init]init: PropSet [dalvik.vm.mtk-stack-trace-file]=[/data/anr/mtk_traces.txt] Done
<14>[    5.200974] .(6)[1:init]init: PropSet [mediatek.wlan.chip]=[CONSYS_MT6763] Done
<14>[    5.200991] .(6)[1:init]init: PropSet [mediatek.wlan.module.postfix]=[_consys_mt6763] Done
<14>[    5.201007] .(6)[1:init]init: PropSet [ril.read.imsi]=[1] Done
<14>[    5.201024] .(6)[1:init]init: PropSet [ril.radiooff.poweroffMD]=[0] Done
<14>[    5.201065] .(6)[1:init]init: PropSet [media.settings.xml]=[/vendor/etc/media_profiles.xml] Done
<14>[    5.201119] .(6)[1:init]init: PropSet [camera.mdp.dre.enable]=[0] Done
<14>[    5.201167] .(6)[1:init]init: PropSet [bt.profiles.avrcp.multiPlayer.enable]=[0] Done
<14>[    5.201198] .(6)[1:init]init: PropSet [persist.radio.multisim.config]=[ss] Done
<14>[    5.201458] .(6)[1:init]init: PropSet [persist.radio.flashless.fsm]=[0] Done
<14>[    5.201476] .(6)[1:init]init: PropSet [persist.radio.flashless.fsm_cst]=[0] Done
<14>[    5.201493] .(6)[1:init]init: PropSet [persist.radio.flashless.fsm_rw]=[0] Done
<14>[    5.201612] .(6)[1:init]init: PropSet [telephony.lteOnCdmaDevice]=[1] Done
<14>[    5.201772] .(6)[1:init]init: PropSet [persist.sys.pms_sys_removable]=[1] Done
<14>[    5.201976] .(6)[1:init]init: PropSet [persist.service.acm.enable]=[0] Done
<14>[    5.201989] .(6)[1:init]init: PropSet [persist.vzw_device_type]=[0] Done
<14>[    5.202010] .(6)[1:init]init: PropSet [persist.mtk_ims_support]=[1] Done
<14>[    5.202030] .(6)[1:init]init: PropSet [persist.mtk_dynamic_ims_switch]=[1] Done
<14>[    5.202049] .(6)[1:init]init: PropSet [persist.mtk_mims_support]=[1] Done
<14>[    5.202061] .(6)[1:init]init: PropSet [persist.mtk_wfc_support]=[1] Done
<14>[    5.202071] .(6)[1:init]init: PropSet [persist.mtk_volte_support]=[1] Done
<14>[    5.202084] .(6)[1:init]init: PropSet [persist.mtk.volte.enable]=[1] Done
<14>[    5.202095] .(6)[1:init]init: PropSet [persist.mtk_vilte_support]=[0] Done
<14>[    5.202106] .(6)[1:init]init: PropSet [persist.mtk_viwifi_support]=[1] Done
<14>[    5.202116] .(6)[1:init]init: PropSet [persist.mtk_ussi_support]=[1] Done
<14>[    5.202132] .(6)[1:init]init: PropSet [wfd.dummy.enable]=[1] Done
<14>[    5.202147] .(6)[1:init]init: PropSet [wfd.iframesize.level]=[0] Done
<14>[    5.202164] .(6)[1:init]init: PropSet [persist.mtk.wcn.coredump.mode]=[0] Done
<14>[    5.202180] .(6)[1:init]init: PropSet [persist.mtk.wcn.combo.chipid]=[-1] Done
<14>[    5.202196] .(6)[1:init]init: PropSet [persist.mtk.wcn.patch.version]=[-1] Done
<14>[    5.202211] .(6)[1:init]init: PropSet [persist.mtk.wcn.dynamic.dump]=[0] Done
<14>[    5.202228] .(6)[1:init]init: PropSet [service.wcn.driver.ready]=[no] Done
<14>[    5.202248] .(6)[1:init]init: PropSet [persist.mtk.connsys.poweron.ctl]=[0] Done
<14>[    5.202268] .(6)[1:init]init: PropSet [persist.mtk_epdg_support]=[1] Done
<14>[    5.202294] .(6)[1:init]init: PropSet [persist.radio.mobile.data]=[0,0] Done
<14>[    5.202315] .(6)[1:init]init: PropSet [persist.meta.dumpdata]=[0] Done
<14>[    5.202342] .(6)[1:init]init: PropSet [dalvik.vm.heapgrowthlimit]=[128m] Done
<14>[    5.202357] .(6)[1:init]init: PropSet [dalvik.vm.heapsize]=[256m] Done
<14>[    5.202369] .(6)[1:init]init: PropSet [persist.radio.mtk_dsbp_support]=[1] Done
<14>[    5.202388] .(6)[1:init]init: PropSet [persist.mtk_ct_volte_support]=[1] Done
<14>[    5.202404] .(6)[1:init]init: PropSet [persist.radio.mtk_ps2_rat]=[L/W/G] Done
<14>[    5.202420] .(6)[1:init]init: PropSet [persist.radio.mtk_ps3_rat]=[G] Done
<11>[    5.203498] .(6)[1:init]init: property_set("persist,log.tag.SuppServHelper", "I") failed: bad name
<14>[    5.204206] .(6)[1:init]init: PropSet [mtk.vdec.waitkeyframeforplay]=[1] Done
<14>[    5.204236] .(6)[1:init]init: PropSet [persist.mtk.datashaping.support]=[1] Done
<14>[    5.204256] .(6)[1:init]init: PropSet [persist.datashaping.alarmgroup]=[1] Done
<14>[    5.204280] .(6)[1:init]init: PropSet [persist.duraspeed.support]=[1] Done
<14>[    5.204327] .(6)[1:init]init: PropSet [debug.sf.disable_backpressure]=[1] Done
<14>[    5.204456] .(6)[1:init]init: PropSet [Build.BRAND]=[MTK] Done
<14>[    5.204476] .(6)[1:init]init: PropSet [persist.radio.lte.chip]=[0] Done
<12>[    5.204573] .(6)[1:init]init: Couldn't load property file: Unable to open '/factory/factory.prop': No such file or directory: No such file or directory
<14>[    5.207238] .(4)[1:init]init: starting service 'logd'...
<14>[    5.208809] .(4)[1:init]init: starting service 'servicemanager'...
<14>[    5.209011] .(5)[349:init]init: Created socket '/dev/socket/logd', mode 666, user 1036, group 1036
<14>[    5.209570] .(5)[349:init]init: Created socket '/dev/socket/logdr', mode 666, user 1036, group 1036
<14>[    5.210226] .(5)[349:init]init: Created socket '/dev/socket/logdw', mode 222, user 1036, group 1036
<14>[    5.210347] .(5)[349:init]init: Opened file '/proc/kmsg', flags 0
<14>[    5.210373] .(5)[349:init]init: Opened file '/dev/kmsg', flags 1
<14>[    5.210408] .(4)[1:init]init: starting service 'hwservicemanager'...
<14>[    5.212915] .(6)[1:init]init: starting service 'vndservicemanager'...
<6>[    5.240658] .(5)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_get_adc_vbus: VBUS = 4975mV
<4>[    5.240668] .(5)[266:charger_thread]sg_detect_typec_charge_ovp,1363,4975000,0 
<4>[    5.241467] .(5)[266:charger_thread]=====FG===== AC   = -6
<4>[    5.243059] .(5)[266:charger_thread]=====FG===== AC   = -6
<38>[    5.251720] .(4)[349:logd]logd.auditd: start
<14>[    5.256102] .(7)[1:init]selinux: SELinux: Skipping restorecon_recursive(/cache)
<14>[    5.256102] 
<14>[    5.271471] .(5)[1:init]selinux: SELinux: Skipping restorecon_recursive(/enterprise)
<14>[    5.271471] 
<14>[    5.273035] .(5)[1:init]init: processing action (post-fs) from (/vendor/etc/init/hw/init.mt6763.rc:125)
<3>[    5.273203] .(5)[1:init]BOOTPROF:      5273.201704:INIT:post-fs
<14>[    5.274181] .(5)[1:init]init: processing action (post-fs) from (/vendor/etc/init/hw/init.mt6763.usb.rc:4)
<14>[    5.274311] .(5)[1:init]init: PropSet [sys.usb.vid]=[0x0E8D] Done
<6>[    5.277043] .(5)[1:init]gadgets_make name=g1
<6>[    5.278685] .(5)[1:init]function_make name=accessory.gs2
<6>[    5.279401] .(5)[1:init]function_make name=audio_source.gs3
<6>[    5.279986] .(5)[1:init]function_make name=ffs.adb
<6>[    5.280023] .(5)[1:init]file system registered
<6>[    5.280501] .(5)[1:init]function_make name=mtp.gs0
<6>[    5.281201] .(6)[1:init]interf_grp_compatible_id_store ext_compat_id=MTP
<6>[    5.281613] .(6)[1:init]function_make name=ptp.gs1
<6>[    5.282198] .(6)[1:init]function_make name=rndis.gs4
<4>[    5.282247] .(6)[1:init]using random self ethernet address
<4>[    5.282251] .(6)[1:init]using random host ethernet address
<6>[    5.282794] .(6)[1:init]function_make name=midi.gs5
<6>[    5.283386] .(6)[1:init]function_make name=acm.gs0
<6>[    5.283486] .(6)[1:init]acm_alloc_instance opts->port_num=0
<6>[    5.283894] .(6)[1:init]function_make name=acm.gs1
<6>[    5.283970] .(6)[1:init]acm_alloc_instance opts->port_num=1
<6>[    5.284336] .(6)[1:init]function_make name=acm.gs2
<6>[    5.284403] .(6)[1:init]acm_alloc_instance opts->port_num=2
<6>[    5.284797] .(6)[1:init]function_make name=acm.gs3
<6>[    5.284888] .(6)[1:init]acm_alloc_instance opts->port_num=3
<6>[    5.285320] .(6)[1:init]function_make name=mass_storage.usb0
<6>[    5.285340] .(6)[1:init]Mass Storage Function, version: 2009/09/11
<6>[    5.285344] .(6)[1:init]LUN: removable file: (no medium)
<6>[    5.285840] .(6)[1:init]function_make name=hid.gs0
<6>[    5.286525] .(6)[1:init]function_make name=via_modem.gs0
<6>[    5.287065] .(6)[1:init]function_make name=via_ets.gs0
<6>[    5.287491] .(6)[1:init]function_make name=via_atc.gs0
<6>[    5.287865] .(6)[1:init]config_desc_make name=b.1
<6>[    5.288351] .(6)[1:init]os_desc_b_vendor_code_store Vendor Code=1
<14>[    5.288951] .(6)[1:init]init: processing action (post-fs) from (/vendor/etc/init/hw/init.datalogic.rc:42)
<14>[    5.289110] .(6)[1:init]init: processing action (post-fs) from (/vendor/etc/init/hw/init.aee.rc:12)
<14>[    5.289482] .(6)[1:init]init: starting service 'aee_aed'...
<14>[    5.291326] .(7)[1:init]init: starting service 'aee_aed64'...
<14>[    5.293377] .(4)[1:init]init: starting service 'aee_aedv'...
<14>[    5.295273] .(6)[1:init]init: starting service 'aee_aedv64'...
<14>[    5.296817] .(6)[1:init]init: processing action (post-fs) from (/system/etc/init/atrace.rc:3)
<7>[    5.299547] .(6)[1:init][ftrace]tracing_on is toggled to 0
<11>[    5.299625] .(6)[1:init]init: Unable to open '/sys/kernel/tracing/tracing_on': No such file or directory
<14>[    5.299740] .(6)[1:init]init: processing action (post-fs) from (/vendor/etc/init/trustkernel.rc:1)
<3>[    5.299829] .(6)[1:init]BOOTPROF:      5299.828935:tkcore: prep SYSTA
<14>[    5.302248] .(4)[1:init]init: starting service 'teed'...
<14>[    5.303670] .(4)[1:init]init: processing action (late-fs) from (/init.rc:412)
<14>[    5.305223] .(6)[1:init]init: starting service 'keymaster-3-0'...
<14>[    5.306627] .(6)[1:init]init: processing action (post-fs-data) from (/init.rc:420)
<14>[    5.307990] .(6)[1:init]init: starting service 'vold'...
<11>[    5.311723] .(6)[1:init]init: Unable to open '/data/system/entropy.dat': No such file or directory
<11>[    5.314145] .(6)[1:init]init: Unable to open '/data/misc/recovery/ro.build.fingerprint': No such file or directory
<11>[    5.315267] .(6)[1:init]init: Unable to open '/data/misc/recovery/proc/version': No such file or directory
<14>[    5.315470] .(4)[367:init]init: Created socket '/dev/socket/vold', mode 660, user 0, group 1009
<14>[    5.316179] .(4)[367:init]init: Created socket '/dev/socket/cryptd', mode 660, user 0, group 1009
<6>[    5.333252] .(4)[351:hwservicemanage]binder: 351:351 ioctl 620a 7ffaa4c110 returned -22
<14>[    5.335089] .(6)[1:init]init: PropSet [hwservicemanager.ready]=[true] Done
<14>[    5.336714] .(6)[1:init]init: PropSet [persist.mtk.aee.mode]=[4] Done
<14>[    5.338290] .(6)[1:init]init: PropSet [persist.aee.core.dump]=[disable] Done
<14>[    5.339475] .(6)[1:init]init: PropSet [persist.aee.core.direct]=[disable] Done
<14>[    5.341143] .(6)[1:init]init: PropSet [persist.aee.fatal_db.count]=[4] Done
<14>[    5.342384] .(6)[1:init]init: PropSet [persist.aee.db.count]=[4] Done
<14>[    5.343872] .(6)[1:init]init: PropSet [debug.mtk.aee.status64]=[free] Done
<4>[    5.351479] .(2)[229:kworker/2:2]Scanner_Close******** 
<4>[    5.352160] .(2)[229:kworker/2:2] @@@kpd_send_Scanner_key_msg slid=1!!
<4>[    5.354473] .(2)[229:kworker/2:2]****mt_gpio_set_debounce,gpiopin=12, debounce=10000*** 
<14>[    5.355691] .(6)[1:init]init: PropSet [debug.mtk.aee.vstatus64]=[free] Done
<4>[    5.355716] -(6)[1:init]Scanner_cur_gpio_state = 0 
<4>[    5.355750] .(2)[229:kworker/2:2][Scanner]Scanner set EINT finished, Scanner_irq=684, Scannerdebounce=10000 
<4>[    5.355759] .(2)[229:kworker/2:2]Buttonup_setup_eint
<4>[    5.355769] .(2)[229:kworker/2:2]****Close******** 
<4>[    5.355773] .(2)[229:kworker/2:2] $$$kpd_send_old_slid_msg slid=0!!
<4>[    5.356111] .(2)[229:kworker/2:2]****mt_gpio_set_debounce,gpiopin=71, debounce=0*** 
<4>[    5.356180] .(2)[229:kworker/2:2][Buttonup]Buttonup set EINT finished, Buttonup_irq=743, Buttonupdebounce=0 
<4>[    5.356185] .(2)[229:kworker/2:2][SLhall]SLhall_setup_eint
<4>[    5.356190] .(2)[229:kworker/2:2]****Close******** 
<4>[    5.356192] .(2)[229:kworker/2:2] ===kpd_send_old_slid_msg slid=1!!
<4>[    5.356672] .(0)[266:charger_thread]lifetime: data[0]=df 
<4>[    5.356680] .(0)[266:charger_thread]lifetime: data[1]=ff 
<4>[    5.356683] .(0)[266:charger_thread]lifetime: data[2]=40 
<4>[    5.356685] .(0)[266:charger_thread]lifetime: data[3]=11 
<4>[    5.356687] .(0)[266:charger_thread]lifetime: data[4]=45 
<4>[    5.356689] .(0)[266:charger_thread]lifetime: data[5]=a 
<4>[    5.356691] .(0)[266:charger_thread]lifetime: data[6]=fc 
<4>[    5.356693] .(0)[266:charger_thread]lifetime: data[7]=8 
<4>[    5.356695] .(0)[266:charger_thread]lifetime: data[8]=68 
<4>[    5.356697] .(0)[266:charger_thread]lifetime: data[9]=f7 
<4>[    5.356699] .(0)[266:charger_thread]lifetime: data[10]=18 
<4>[    5.356702] .(0)[266:charger_thread]lifetime: data[11]=0 
<4>[    5.357334] .(2)[229:kworker/2:2]****mt_gpio_set_debounce,gpiopin=2, debounce=0*** 
<4>[    5.357504] .(2)[229:kworker/2:2][Hall]Hall set EINT finished, hall_irq=677, halldebounce=0 
<4>[    5.357512] .(2)[229:kworker/2:2]Scanner_right_setup_eint
<4>[    5.357520] .(2)[229:kworker/2:2]Scanner_right_Close******** 
<4>[    5.357523] .(2)[229:kworker/2:2] @@@kpd_send_Scanner_right_key_msg slid=1!!
<4>[    5.358307] -(4)[266:charger_thread]mt6356_get_auxadc_value: 4 callbacks suppressed
<4>[    5.358340] .(4)[266:charger_thread]=====FG-MTK===== bat_vol=4300
<36>[    5.358791] .(3)[362:logd.auditd]type=1400 audit(1578635487.121:6): avc: denied { write } for pid=365 comm="teed" name="/" dev="tmpfs" ino=10342 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<4>[    5.358848] .(2)[229:kworker/2:2]****mt_gpio_set_debounce,gpiopin=6, debounce=10000*** 
<4>[    5.359002] .(2)[229:kworker/2:2][Scanner]Scanner set EINT finished, Scanner_right_irq=678, Scannerrightdebounce=10000 
<4>[    5.359008] .(2)[229:kworker/2:2][wc_pmode]wc_pmode_setup_eint
<4>[    5.359019] .(2)[229:kworker/2:2]****Close******** 
<4>[    5.360369] .(2)[229:kworker/2:2]****mt_gpio_set_debounce,gpiopin=9, debounce=0*** 
<4>[    5.360472] .(2)[229:kworker/2:2][wc_pmode]wc_pmode set EINT finished, hall_irq=681, halldebounce=0 
<4>[    5.360479] -(2)[229:kworker/2:2]------------[ cut here ]------------
<4>[    5.360482] -(2)[229:kworker/2:2]WARNING: CPU: 2 PID: 229 at /data/jenkins/workspace/dl35_oreo/kernel-4.4/kernel/irq/manage.c:605 irq_set_irq_wake+0x100/0x140()
<4>[    5.360500] -(2)[229:kworker/2:2]Unbalanced IRQ 681 wake disable
<4>[    5.360511] -(2)[229:kworker/2:2]Modules linked in: fpsgo ffffff8000c2f000           (null) 2624 0 (O)
<4>[    5.360515] -(2)[229:kworker/2:2]CPU: 2 PID: 229 Comm: kworker/2:2 Tainted: G        W  O    4.4.95+ #2
<4>[    5.360519] -(2)[229:kworker/2:2]Hardware name: MT6763V/B (DT)
<4>[    5.360538] -(2)[229:kworker/2:2]Workqueue: hall_delay hall_delay_func
<4>[    5.360540] -(2)[229:kworker/2:2]Call trace:
<4>[    5.360542] -(2)[229:kworker/2:2][<ffffff800808a298>] dump_backtrace+0x0/0x228
<4>[    5.360552] -(2)[229:kworker/2:2][<ffffff800808a4d4>] show_stack+0x14/0x20
<4>[    5.360557] -(2)[229:kworker/2:2][<ffffff8008360870>] dump_stack+0xa0/0xc0
<4>[    5.360565] -(2)[229:kworker/2:2][<ffffff80080a1bc4>] warn_slowpath_common+0x9c/0xd8
<4>[    5.360572] -(2)[229:kworker/2:2][<ffffff80080a1c5c>] warn_slowpath_fmt+0x5c/0x80
<4>[    5.360577] -(2)[229:kworker/2:2][<ffffff800810b5b0>] irq_set_irq_wake+0x100/0x140
<4>[    5.360580] -(2)[229:kworker/2:2][<ffffff80087ed2ec>] hall_delay_func+0x79c/0xa58
<4>[    5.360585] -(2)[229:kworker/2:2][<ffffff80080bda10>] process_one_work+0x1d0/0x468
<4>[    5.360593] -(2)[229:kworker/2:2][<ffffff80080bddd8>] worker_thread+0x130/0x4e0
<4>[    5.360597] -(2)[229:kworker/2:2][<ffffff80080c3fbc>] kthread+0xec/0x100
<4>[    5.360604] -(2)[229:kworker/2:2][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    5.360609] -(2)[229:kworker/2:2]---[ end trace 8cfa91f0817a7c74 ]---
<4>[    5.362420] .(5)[266:charger_thread]=====FG===== AC   = -6
<5>[    5.362663] .(5)[266:charger_thread]Vbat=4300,Ibat=6,I=0,VChr=4730,T=25,Soc=0:0,CT:2:0 hv:1 pd:0:0
<5>[    5.362668] .(5)[266:charger_thread][mtk_is_charger_on]info->chr_type=0 
<5>[    5.362672] .(5)[266:charger_thread]mtk_charger_plug_in plug in, type:2
<5>[    5.362676] .(5)[266:charger_thread]battery_callback:1
<4>[    5.365266] .(1)[266:charger_thread]=====FG===== AC   = -6
<4>[    5.367593] .(5)[266:charger_thread]temp_now=223, temp_last=223 
<4>[    5.367605] .(5)[266:charger_thread]=====FG===== TEMP = 223
<4>[    5.368768] .(2)[266:charger_thread]=====FG===== VOLT = 4319
<4>[    5.368779] .(2)[266:charger_thread]=====FG===== actural VOLT = 4319
<6>[    5.368790] .(2)[266:charger_thread]power_supply battery: power_supply_changed
<6>[    5.368818] .(2)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_plug_in
<6>[    5.368825] .(2)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_enable_wdt: en = 1
<4>[    5.369025] .(2)[266:charger_thread]DLCP mt6370_enable_charging :1 
<4>[    5.369448] .(2)[229:kworker/2:2]temp_now=223, temp_last=223 
<4>[    5.369453] .(2)[229:kworker/2:2]=====FG===== TEMP = 223
<4>[    5.370101] .(2)[229:kworker/2:2]temp_now=223, temp_last=223 
<4>[    5.370108] .(2)[229:kworker/2:2]=====FG===== TEMP = 223
<4>[    5.370735] .(2)[229:kworker/2:2]=====FG===== SOC  = 100
<4>[    5.371619] .(2)[229:kworker/2:2]=====FG===== AC   = -6
<4>[    5.372171] .(7)[266:charger_thread]temp_now=223, temp_last=223 
<4>[    5.372177] .(7)[266:charger_thread]=====FG===== TEMP = 223
<5>[    5.372180] .(7)[266:charger_thread]charger_check_status
<4>[    5.375798] .(2)[229:kworker/2:2]=====FG===== VOLT = 4319
<4>[    5.375809] .(2)[229:kworker/2:2]=====FG===== actural VOLT = 4319
<4>[    5.376422] .(2)[229:kworker/2:2]temp_now=223, temp_last=223 
<4>[    5.376428] .(2)[229:kworker/2:2]=====FG===== TEMP = 223
<4>[    5.377054] .(2)[229:kworker/2:2]=====FG===== SOC  = 100
<4>[    5.377595] .(2)[229:kworker/2:2]bq27542_set_commands cmd = 0x12, val = 3892 
<4>[    5.378143] .(2)[229:kworker/2:2]bq27542_set_commands cmd = 0x3c, val = 3850 
<4>[    5.378780] .(2)[229:kworker/2:2]bq27542_set_commands cmd = 0xc, val = 4004 
<4>[    5.432310] -(6)[1:init]Scanner left key release up******** 
<4>[    5.433039] -(6)[1:init] @@@kpd_send_Scanner_key_msg slid=0!!
<4>[    5.433802] -(6)[1:init][EINT]Warn!EINT:12 run too long,s:5355709319,e:5433801012,total:78091693
<4>[    5.434948] -(1)[0:swapper/1]hall for pistol ===****far away******** 
<4>[    5.434998] -(6)[32:ksoftirqd/6]Latch****Close******** 
<4>[    5.435001] -(6)[32:ksoftirqd/6] $$$kpd_send_old_slid_msg slid=0!!
<4>[    5.437272] -(1)[0:swapper/1] ===kpd_send_old_slid_msg slid=0!!
<4>[    5.438052] -(1)[0:swapper/1][EINT]Warn!EINT:2 run too long,s:5434939550,e:5438050474,total:3110924
<5>[    5.438107] .(5)[266:charger_thread][mtk_chg_check_vbus]charger_update_data(4730000 mV) 
<5>[    5.439696] .(5)[266:charger_thread][BATTERY] bat_auth 1 gpio53_state =1
<5>[    5.439702] .(5)[266:charger_thread]charger_check_status tmp:22 (jeita:0 sm:0 cv:0 en:0) (sm:1) charging:1 cmd_discharging:0 safety_timeout:0 vbusov_stat:0 can_charging:1, charging:1
<4>[    5.442054] .(5)[266:charger_thread]random message:24 
<4>[    5.442449] .(5)[266:charger_thread]random message:91 
<4>[    5.442851] .(5)[266:charger_thread]random message:74 
<4>[    5.443166] .(5)[266:charger_thread]random message:22 
<4>[    5.443492] .(5)[266:charger_thread]random message:ba 
<4>[    5.443810] .(5)[266:charger_thread]random message:8 
<4>[    5.444131] .(5)[266:charger_thread]random message:b7 
<4>[    5.444454] .(5)[266:charger_thread]random message:97 
<4>[    5.444778] .(5)[266:charger_thread]random message:e 
<4>[    5.445096] .(5)[266:charger_thread]random message:1b 
<4>[    5.445417] .(5)[266:charger_thread]random message:ca 
<4>[    5.445739] .(5)[266:charger_thread]random message:7b 
<4>[    5.446060] .(5)[266:charger_thread]random message:9e 
<4>[    5.446382] .(5)[266:charger_thread]random message:74 
<4>[    5.446707] .(5)[266:charger_thread]random message:e2 
<4>[    5.447024] .(5)[266:charger_thread]random message:68 
<4>[    5.447348] .(5)[266:charger_thread]random message:9a 
<4>[    5.447667] .(5)[266:charger_thread]random message:a7 
<4>[    5.447985] .(5)[266:charger_thread]random message:bd 
<4>[    5.448307] .(5)[266:charger_thread]random message:56 
<14>[    5.449910] .(6)[1:init]init: starting service 'exec 2 (/system/bin/vdc --wait cryptfs init_user0)'...
<14>[    5.450920] .(6)[1:init]init: SVC_EXEC pid 368 (uid 0 gid 0+0 context default) started; waiting...
<4>[    5.458955] -(1)[0:swapper/1]Scanner_right_cur_gpio_state = 0 
<4>[    5.459713] -(1)[0:swapper/1]Scanner right key release up******** 
<4>[    5.460514] -(1)[0:swapper/1] @@@kpd_send_Scanner_right_key_msg slid=0!!
<4>[    5.461388] -(1)[0:swapper/1]appear eint for closing otg when WLC ****High******** 
<36>[    5.467659] .(7)[362:logd.auditd]type=1400 audit(1578635487.121:11): avc: denied { write } for pid=365 comm="teed" name="/" dev="tmpfs" ino=10342 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0 duplicate messages suppressed
<36>[    5.470906] .(7)[362:logd.auditd]type=1400 audit(1578635487.229:12): avc: denied { write } for pid=365 comm="tkearlyinit" name="/" dev="tmpfs" ino=10342 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<36>[    5.494188] .(5)[362:logd.auditd]type=1400 audit(1578635487.257:13): avc: denied { write } for pid=365 comm="tkearlyinit" name="/" dev="tmpfs" ino=10342 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<36>[    5.496897] .(5)[362:logd.auditd]type=1400 audit(1578635487.257:14): avc: denied { write } for pid=365 comm="teed" name="/" dev="tmpfs" ino=10342 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<36>[    5.499955] .(5)[362:logd.auditd]type=1400 audit(1578635487.257:19): avc: denied { write } for pid=365 comm="teed" name="/" dev="tmpfs" ino=10342 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0 duplicate messages suppressed
<36>[    5.503857] .(6)[362:logd.auditd]type=1400 audit(1578635487.257:20): avc: denied { write } for pid=365 comm="tkuinit" name="/" dev="tmpfs" ino=10342 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<4>[    5.504636] .(2)[229:kworker/2:2]tx_close_wlc_setup_eint
<4>[    5.504654] .(2)[229:kworker/2:2]****High******** 
<4>[    5.504978] .(2)[229:kworker/2:2]****mt_gpio_set_debounce,gpiopin=86, debounce=128000*** 
<4>[    5.505078] .(2)[229:kworker/2:2][tx_close_wlc]tx_close_wlc set EINT finished, tx_close_wlc_irq=758, tx_close_wlcdebounce=128000 
<14>[    5.516029] .(7)[1:init]init: PropSet [vold.has_adoptable]=[1] Done
<14>[    5.517357] .(5)[1:init]init: PropSet [vold.has_quota]=[1] Done
<14>[    5.529032] .(6)[1:init]init: Service 'exec 2 (/system/bin/vdc --wait cryptfs init_user0)' (pid 368) exited with status 0 waiting took 0.079000 seconds
<36>[    5.547850] .(7)[362:logd.auditd]type=1400 audit(1578635487.257:21): avc: denied { write } for pid=365 comm="tkuinit" name="/" dev="tmpfs" ino=10342 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<14>[    5.550421] .(6)[1:init]init: PropSet [debug.mtk.aee.status64]=[free] Done
<14>[    5.551361] .(6)[1:init]init: starting service 'exec 3 (/system/bin/tzdatacheck /system/usr/share/zoneinfo /data/misc/zoneinfo)'...
<14>[    5.552563] .(6)[1:init]init: SVC_EXEC pid 375 (uid 1000 gid 1000+0 context default) started; waiting...
<14>[    5.552928] .(6)[1:init]init: PropSet [debug.mtk.aee.vstatus64]=[free] Done
<14>[    5.553152] .(6)[1:init]init: PropSet [debug.mtk.aee.status]=[free] Done
<14>[    5.554439] .(5)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[free] Done
<14>[    5.554709] .(5)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[free] Done
<14>[    5.555471] .(5)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[dumping] Done
<4>[    5.556948] .(1)[376:aee_aedv][KL_ENV]cann't find name=forceencrypt_config
<36>[    5.559850] .(7)[362:logd.auditd]type=1400 audit(1578635487.309:22): avc: denied { write } for pid=365 comm="teed" name="/" dev="tmpfs" ino=10342 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<4>[    5.563221] .(7)[266:charger_thread]data[0]: ec 
<4>[    5.563845] .(7)[266:charger_thread]data[1]: d1 
<4>[    5.564444] .(7)[266:charger_thread]data[2]: 83 
<4>[    5.564939] .(1)[376:aee_aedv][KL_ENV]cann't find name=forceencrypt_config
<4>[    5.565958] .(7)[266:charger_thread]data[3]: 3d 
<4>[    5.566562] .(7)[266:charger_thread]data[4]: 5f 
<4>[    5.567170] .(7)[266:charger_thread]data[5]: f9 
<4>[    5.567777] .(7)[266:charger_thread]data[6]: ae 
<4>[    5.568384] .(7)[266:charger_thread]data[7]: 54 
<4>[    5.569160] .(7)[266:charger_thread]data[8]: 1c 
<4>[    5.569792] .(7)[266:charger_thread]data[9]: 5e 
<4>[    5.570393] .(7)[266:charger_thread]data[10]: 28 
<4>[    5.571016] .(7)[266:charger_thread]data[11]: 87 
<14>[    5.571319] .(5)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[free] Done
<4>[    5.572521] .(7)[266:charger_thread]data[12]: a1 
<4>[    5.573215] .(7)[266:charger_thread]data[13]: 93 
<4>[    5.573831] .(7)[266:charger_thread]data[14]: 52 
<4>[    5.574447] .(7)[266:charger_thread]data[15]: 7e 
<4>[    5.575070] .(7)[266:charger_thread]result: 9157e84c, 7e5293a1, 87285e1c, 54aef95f, 3d83d1ec 
<4>[    5.576161] .(7)[266:charger_thread]SHA-1 check passed
<5>[    5.576860] .(7)[266:charger_thread]mtk_switch_charging_run [1 0], timer=0
<14>[    5.579989] .(7)[1:init]init: Service 'exec 3 (/system/bin/tzdatacheck /system/usr/share/zoneinfo /data/misc/zoneinfo)' (pid 375) exited with status 0 waiting took 0.029000 seconds
<14>[    5.582351] .(7)[1:init]init: processing action (post-fs-data) from (/init.usb.rc:6)
<14>[    5.585656] .(7)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.mt6763.rc:157)
<3>[    5.587031] .(7)[1:init]BOOTPROF:      5587.029705:INIT:post-fs-data
<11>[    5.588213] .(7)[1:init]init: Unable to open '/sys/block/sdc/queue/iostats': No such file or directory
<11>[    5.589532] .(7)[1:init]init: Unable to open '/sys/block/sdc/queue/read_ahead_kb': No such file or directory
<11>[    5.590849] .(7)[1:init]init: Unable to open '/sys/block/sdc/queue/nr_requests': No such file or directory
<14>[    5.592574] .(7)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/nvcfg)
<14>[    5.592574] 
<14>[    5.597768] .(5)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/nvdata)
<14>[    5.597768] 
<14>[    5.617736] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.connectivity.rc:3)
<14>[    5.622753] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.project.rc:15)
<14>[    5.625710] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.aee.rc:1)
<5>[    5.627453] .(4)[266:charger_thread]pe40_ready:0 hv:1 thermal:-1,-1 tmp:25,39,16 pps:0 en:0 ibus:0 80
<5>[    5.628724] .(4)[266:charger_thread]mtk_pe20_start_algorithm: stop, PE+20 is not connected
<5>[    5.629794] .(4)[266:charger_thread]mtk_pe_start_algorithm: stop, PE+ is not connected
<14>[    5.630695] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.sensor_1_0.rc:2)
<5>[    5.633694] .(4)[266:charger_thread]mtk_pe_start_algorithm: vchr_org = 5000, vchr_after = 4730, delta = -270
<14>[    5.633939] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.modem.rc:19)
<3>[    5.634015] .(5)[1:init]BOOTPROF:      5634.014012:post-fs-data: on modem start
<14>[    5.634112] .(5)[1:init]init: PropSet [vold.post_fs_data_done]=[1] Done
<14>[    5.634131] .(5)[1:init]init: processing action (post-fs-data) from (/system/etc/init/bootstat.rc:3)
<14>[    5.635437] .(5)[1:init]init: processing action (post-fs-data) from (/system/etc/init/mobile_log_d.rc:1)
<14>[    5.636208] .(5)[1:init]init: processing action (post-fs-data) from (/system/etc/init/sn.rc:1)
<14>[    5.636551] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/android.hardware.audio@2.0-service-mediatek.rc:1)
<14>[    5.637388] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hostapd.android.rc:9)
<14>[    5.637784] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/init.cccifsd.rc:5)
<14>[    5.637888] .(5)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/protect_f)
<14>[    5.637888] 
<14>[    5.637943] .(5)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/protect_s)
<14>[    5.637943] 
<14>[    5.637962] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/init.cccimdinit.rc:4)
<14>[    5.639946] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/init.wod.rc:1)
<14>[    5.642379] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/mtk_agpsd.rc:1)
<14>[    5.642870] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/statusd.rc:1)
<14>[    5.643265] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/trustkernel.rc:7)
<3>[    5.643338] .(5)[1:init]BOOTPROF:      5643.337859:tkcore: prep SFS
<3>[    5.643873] .(5)[1:init]BOOTPROF:      5643.871551:tkcore: prep PP
<3>[    5.645704] .(7)[1:init]BOOTPROF:      5645.702474:tkcore: prep SPTA
<14>[    5.646478] .(7)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/vendor.mediatek.hardware.power@1.1-service.rc:1)
<14>[    5.650048] .(7)[1:init]init: processing action (load_persist_props_action) from (/init.rc:291)
<14>[    5.650461] .(7)[1:init]init: starting service 'logd-reinit'...
<14>[    5.651738] .(7)[1:init]init: processing action (firmware_mounts_complete) from (/init.rc:297)
<14>[    5.651905] .(7)[1:init]init: processing action (early-boot) from (/system/etc/init/installd.rc:5)
<4>[    5.662502] .(4)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    5.663847] .(4)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    5.665229] .(4)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    5.666803] .(4)[266:charger_thread][mtk_switch_charging_multi_power_supply_check]hall_1_eint_occur=1 mtk_charger_hall_1_eint=1
<4>[    5.668675] .(4)[266:charger_thread]cc1=5 cc2=0
<6>[    5.669290] .(4)[266:charger_thread]power_supply ac: power_supply_changed
<30>[    5.669890] .(5)[353:logd.daemon]logd.daemon: reinit
<14>[    5.670787] .(7)[1:init]init: PropSet [log.tag]=[I] Done
<6>[    5.671544] .(4)[266:charger_thread]power_supply usb: power_supply_changed
<31>[    5.671884] .(5)[353:logd.daemon]logd: logd no log reader, set log level to INFO!
<14>[    5.672191] .(7)[1:init]init: Service 'logd-reinit' (pid 377) exited with status 0
<4>[    5.674304] .(4)[266:charger_thread]temp_now=223, temp_last=223 
<14>[    5.674763] .(7)[1:init]init: processing action (boot) from (/init.rc:603)
<11>[    5.675583] .(7)[1:init]init: Unable to open '/proc/sys/vm/min_free_order_shift': No such file or directory
<4>[    5.677256] .(4)[266:charger_thread]=====FG===== TEMP = 223
<14>[    5.678175] .(7)[1:init]init: PropSet [net.tcp.default_init_rwnd]=[60] Done
<4>[    5.679688] .(4)[266:charger_thread]=====FG===== VOLT = 4319
<4>[    5.680450] .(4)[266:charger_thread]=====FG===== actural VOLT = 4319
<14>[    5.681121] .(5)[1:init]init: starting service 'hidl_memory'...
<4>[    5.682735] .(4)[266:charger_thread]=====FG===== AC   = -6
<14>[    5.682768] .(5)[1:init]init: starting service 'vtservice_hidl'...
<14>[    5.684710] .(5)[1:init]init: starting service 'audio-hal-2-0'...
<4>[    5.685594] .(4)[266:charger_thread]=====FG===== SOC  = 100
<4>[    5.687023] .(4)[266:charger_thread]=====FG===== SOH  = 100
<14>[    5.687468] .(5)[1:init]init: starting service 'bluetooth-1-0'...
<4>[    5.688584] .(4)[266:charger_thread]DLCP bat_vol=4319,  temperature=223  
<14>[    5.689483] .(5)[1:init]init: starting service 'broadcastradio-hal'...
<4>[    5.690352] .(4)[266:charger_thread] ===CC_value from battery temprature=2000000
<4>[    5.691307] .(4)[266:charger_thread]DLCP __mt6370_set_ieoc      = 150000
<14>[    5.691504] .(5)[1:init]init: starting service 'cas-hal-1-0'...
<4>[    5.693279] .(4)[266:charger_thread]DLCP mt6370_set_vrech       = 300
<14>[    5.693670] .(5)[1:init]init: starting service 'configstore-hal-1-0'...
<4>[    5.695451] .(4)[266:charger_thread]DLCP mt6370_get_vrech       = 300
<14>[    5.695550] .(5)[1:init]init: starting service 'drm-hal-1-0'...
<4>[    5.697093] .(4)[266:charger_thread]DLCP read cv              = 4350000
<14>[    5.697439] .(7)[379:init]init: Created socket '/dev/socket/volte_vt', mode 660, user 0, group 1000
<14>[    5.697439] .(5)[1:init]init: starting service 'drm-widevine-hal-1-0'...
<14>[    5.699307] .(5)[1:init]init: starting service 'gatekeeper-1-0'...
<4>[    5.700799] .(4)[266:charger_thread]DLCP read eoc             = 150000
<14>[    5.701299] .(5)[1:init]init: starting service 'gralloc-2-0'...
<4>[    5.702435] .(4)[266:charger_thread]DLCP read recharge        = 300
<14>[    5.703216] .(5)[1:init]init: starting service 'hwcomposer-2-1'...
<4>[    5.704051] .(4)[266:charger_thread]DLCP Target Temp          = 410
<4>[    5.704875] .(4)[266:charger_thread]DLCP Charge Current       = 2000
<14>[    5.705304] .(5)[1:init]init: starting service 'light-hal-2-0'...
<4>[    5.706490] .(4)[266:charger_thread]DLPID 
<4>[    5.707032] .(4)[266:charger_thread]DLPID +++++++++++++++++ PID Start +++++++++++++++++++++ 
<14>[    5.707906] .(5)[1:init]init: starting service 'memtrack-hal-1-0'...
<4>[    5.708955] .(4)[266:charger_thread]DLPID PID Target Temp = 410 
<4>[    5.709738] .(4)[266:charger_thread]DLPID Battery Temp    = 223 
<14>[    5.710119] .(5)[1:init]init: starting service 'thermal-hal-1-0'...
<4>[    5.711350] .(4)[266:charger_thread]DLPID TEMP DIFF       = 93 
<4>[    5.712124] .(4)[266:charger_thread]DLPID PID KI          = 5000 
<14>[    5.712191] .(5)[1:init]init: starting service 'vibrator-1-0'...
<4>[    5.714170] .(4)[266:charger_thread]DLPID CC MAX          = 2000000 
<4>[    5.715048] .(4)[266:charger_thread]DLPID PID Current     = 500000 
<4>[    5.715868] .(4)[266:charger_thread]DLCP ccurrent from charge type        = 500000
<4>[    5.716874] .(4)[266:charger_thread]DLCP ccurrent from battery temprature = 2000000
<14>[    5.717294] .(5)[1:init]init: starting service 'wifi_hal_legacy'...
<4>[    5.718702] .(4)[266:charger_thread]DLCP ccurrent from PID algorithm      = 500000
<14>[    5.719135] .(5)[1:init]init: starting service 'dfps-1-0'...
<4>[    5.720449] .(4)[266:charger_thread]DLCP ccurrent from DLPL               = 2000000
<14>[    5.721391] .(5)[1:init]init: starting service 'mtkcodecservice-1-1'...
<4>[    5.723016] .(4)[266:charger_thread]DLCP set input current:500000 
<14>[    5.723345] .(5)[1:init]init: starting service 'power-hal-1-1'...
<4>[    5.725306] .(4)[266:charger_thread]DLCP set charge current: 500000 
<14>[    5.725385] .(5)[1:init]init: starting service 'nxpnfc_hal_svc'...
<14>[    5.727104] .(5)[1:init]init: starting service 'healthd'...
<4>[    5.728681] .(4)[266:charger_thread]DLCP __mt6370_set_ieoc      = 250000
<11>[    5.730609] .(5)[1:init]init: cannot find '/vendor/bin/spm_loader', disabling 'spm_script': No such file or directory
<4>[    5.732070] .(0)[266:charger_thread]DLCP mt6370_enable_charging :1 
<11>[    5.732085] .(5)[1:init]init: cannot find '/system/bin/datalogic_hw', disabling 'datalogic-hw': No such file or directory
<14>[    5.732950] .(5)[1:init]init: starting service 'lmkd'...
<14>[    5.734911] .(5)[1:init]init: starting service 'surfaceflinger'...
<14>[    5.734911] .(7)[400:init]init: Created socket '/dev/socket/lmkd', mode 660, user 1000, group 1000
<4>[    5.736693] .(3)[21:kworker/3:0][low_g]low_g_setup_eint
<4>[    5.736729] .(3)[21:kworker/3:0]111111  cur_gpio_state_low_g= 1
<4>[    5.736737] .(3)[21:kworker/3:0]****Open******** 
<4>[    5.736739] .(3)[21:kworker/3:0]hehai ~~~kpd_send_old_slid_msg_low_g slid=0!!
<11>[    5.736826] .(7)[1:init]init: service terservice does not have a SELinux domain defined
<11>[    5.737107] .(5)[401:init]init: Failed to bind socket 'pdx/system/vr/display/client': No such file or directory
<4>[    5.737137] .(3)[21:kworker/3:0]****mt_gpio_set_debounce,gpiopin=4, debounce=0*** 
<4>[    5.737287] .(3)[21:kworker/3:0][Hall]Hall set EINT finished, hall_irq=0, halldebounce=0 
<14>[    5.737340] .(7)[1:init]init: starting service 'thermalservice'...
<11>[    5.737652] .(5)[401:init]init: Failed to bind socket 'pdx/system/vr/display/manager': No such file or directory
<11>[    5.738234] .(5)[401:init]init: Failed to bind socket 'pdx/system/vr/display/vsync': No such file or directory
<14>[    5.739228] .(7)[1:init]init: starting service 'fuelgauged'...
<14>[    5.740985] .(7)[1:init]init: starting service 'ccci_fsd'...
<14>[    5.742681] .(7)[1:init]init: starting service 'ccci3_fsd'...
<14>[    5.744424] .(7)[1:init]init: starting service 'ccci_mdinit'...
<14>[    5.748862] .(6)[1:init]init: starting service 'ccci3_mdinit'...
<14>[    5.750839] .(6)[1:init]init: starting service 'ccci_rpcd'...
<4>[    5.753006] .(3)[266:charger_thread]DLCP charger_dev_set_constant_voltage       = 4350000
<4>[    5.754083] .(3)[266:charger_thread]DLCP __mt6370_set_cv       = 4350000
<14>[    5.754558] .(0)[1:init]init: starting service 'wfca'...
<14>[    5.756881] .(2)[1:init]init: starting service 'wmt_loader'...
<4>[    5.757146] .(0)[266:charger_thread]DLCP mt6370_enable_charging :1 
<14>[    5.760542] .(2)[1:init]init: starting service 'wmt_launcher'...
<14>[    5.762591] .(4)[409:init]init: Created socket '/dev/socket/wfca', mode 660, user 0, group 1000
<14>[    5.763464] .(2)[1:init]init: starting service 'statusd'...
<14>[    5.765855] .(3)[1:init]init: processing action (boot) from (/init.usb.rc:25)
<14>[    5.766100] .(4)[409:init]init: Created socket '/dev/socket/wfca_rds', mode 660, user 0, group 1000
<14>[    5.768097] .(3)[1:init]init: PropSet [sys.usb.configfs]=[0] Done
<14>[    5.768446] .(4)[412:init]init: Created socket '/dev/socket/rild-via', mode 660, user 1001, group 1001
<14>[    5.769815] .(4)[412:init]init: Created socket '/dev/socket/msap_c2k_socket1', mode 660, user 1001, group 1001
<14>[    5.771359] .(4)[412:init]init: Created socket '/dev/socket/msap_c2k_socket2', mode 660, user 1001, group 1001
<14>[    5.772487] .(4)[412:init]init: Created socket '/dev/socket/msap_c2k_socket3', mode 660, user 1001, group 1001
<14>[    5.777096] .(6)[1:init]init: processing action (persist.sys.usb.config=* && boot) from (/init.usb.rc:106)
<14>[    5.779239] .(6)[1:init]init: PropSet [sys.usb.config]=[mtp] Done
<14>[    5.780909] .(6)[1:init]init: processing action (boot) from (/vendor/etc/init/hw/init.mt6763.rc:616)
<3>[    5.782497] .(6)[1:init]BOOTPROF:      5782.495782:INIT:boot
<14>[    5.787526] .(4)[412:init]init: Created socket '/dev/socket/msap_c2k_socket4', mode 660, user 1001, group 1001
<5>[    5.802784] .(4)[403:fuelgauged][fg_res] FG_DAEMON_CMD_SET_DAEMON_PID = 403 (first launch)
<14>[    5.804575] .(4)[412:init]init: Created socket '/dev/socket/rpc', mode 660, user 1001, group 1001
<14>[    5.810844] .(4)[412:init]init: Created socket '/dev/socket/rildc-debug', mode 660, user 1001, group 1000
<14>[    5.811399] .(6)[1:init]init: processing action (boot) from (/vendor/etc/init/hw/init.mt6763.rc:1102)
<14>[    5.811807] .(6)[1:init]init: PropSet [persist.radio.reset_on_switch]=[false] Done
<14>[    5.811889] .(6)[1:init]init: PropSet [rild.mark_switchuser]=[0] Done
<14>[    5.811915] .(6)[1:init]init: processing action (boot) from (/vendor/etc/init/hw/init.mt6763.usb.rc:41)
<14>[    5.811934] .(6)[1:init]init: PropSet [sys.usb.configfs]=[1] Done
<14>[    5.811955] .(6)[1:init]init: PropSet [sys.usb.controller]=[musb-hdrc] Done
<14>[    5.811976] .(6)[1:init]init: PropSet [sys.usb.acm_cnt]=[0] Done
<14>[    5.811997] .(6)[1:init]init: PropSet [sys.usb.acm_port0]=[] Done
<14>[    5.812018] .(6)[1:init]init: PropSet [sys.usb.acm_port1]=[] Done
<14>[    5.812061] .(6)[1:init]init: PropSet [sys.usb.temp]=[] Done
<14>[    5.812083] .(6)[1:init]init: PropSet [sys.usb.acm_enable]=[0] Done
<14>[    5.812103] .(6)[1:init]init: PropSet [sys.usb.clear]=[boot] Done
<6>[    5.812197] .(6)[1:init]Store => 0xf0
<6>[    5.812201] .(6)[1:init]Set CPU[4] On
<6>[    5.812202] .(6)[1:init]Set CPU[5] On
<6>[    5.812204] .(6)[1:init]Set CPU[6] On
<6>[    5.812205] .(6)[1:init]Set CPU[7] On
<5>[    5.813277] .(1)[403:fuelgauged]MTK_FG: [fg_compensate_battery_voltage_from_low] h_percent=[9904,9795],high=91,fg_volt_withIR=34353 > ori_voltage=34000
<5>[    5.813373] .(1)[403:fuelgauged]MTK_FG: [fg_compensate_battery_voltage_from_low]fg_volt=35204,91,IR=-1196,orig_v:34000,+IR=34008,percent=9864,
<5>[    5.815507] .(1)[403:fuelgauged]MTK_FG: [fg_compensate_battery_voltage_from_low] h_percent=[9855,9747],high=92,fg_volt_withIR=34050 > ori_voltage=34000
<5>[    5.815559] .(1)[403:fuelgauged]MTK_FG: [fg_compensate_battery_voltage_from_low]fg_volt=35119,92,IR=-1117,orig_v:34000,+IR=34002,percent=9765,
<14>[    5.829275] .(6)[1:init]init: processing action (boot) from (/system/etc/init/bootstat.rc:57)
<14>[    5.829369] .(6)[1:init]init: PropSet [sys.logbootcomplete]=[1] Done
<14>[    5.829401] .(6)[1:init]init: processing action (boot) from (/system/etc/init/dumpstate.rc:1)
<14>[    5.829594] .(6)[1:init]init: processing action (boot) from (/system/etc/init/ged_srv.rc:12)
<14>[    5.829881] .(6)[1:init]init: processing action (boot) from (/system/etc/init/netdiag.rc:5)
<14>[    5.831992] .(6)[1:init]init: processing action (boot) from (/vendor/etc/init/init.md_apps.rc:1)
<14>[    5.832214] .(6)[1:init]init: processing action (boot) from (/vendor/etc/init/init.wmt_drv.rc:1)
<6>[    5.847540] .(7)[409:wfca][ccci1/chr]port ccci_imsa open with flag 20002 by wfca
<5>[    5.856796] .(6)[403:fuelgauged]MTK_FG: [GM3_data] soc:9997 fg_c_soc:9997 fg_v_soc:9950 ui_soc:10000 vc_diff:47 vc_mode 1 VBAT 43310 T:[25 V 25 C 25] D0_C 10000 D0_V 10000 CAR[c:-11 v:-140] Q:[27966 27966 27966 27966] aging 10000 bat_cycle 1 Trk[0(-184):0:0] UI[1:1] Chr[1:9997:10067] pseudo1 0  DC_ratio 100 dodinit[9][0] Iavg:-187,dis[0 0 0]
<3>[    5.862470] .(1)[406:ccci_mdinit]BOOTPROF:      5862.468705:ccci_md1: md_init srv start
<5>[    5.864882] .(6)[403:fuelgauged][fg_res] FG_DAEMON_CMD_GET_NVRAM_FAIL_STATUS = 0
<3>[    5.868725] .(1)[406:ccci_mdinit]BOOTPROF:      5868.724398:ccci_md1: init
<5>[    5.870976] .(6)[403:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[14] = {a24, 255, 8}
<5>[    5.872055] -(6)[403:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[0] = {a2a, 255, 8}
<5>[    5.873193] .(6)[403:fuelgauged][fgauge_read_RTC_boot_status] rtc_invalid 0 plugout 0 plugout_time 0 spare3 0xe4 spare0 0x60 hw_id 0x5640
<5>[    5.874912] .(6)[403:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[14] = {a24, 255, 8}
<5>[    5.876000] .(6)[403:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[14] = {a24, 255, 8}
<6>[    5.878448] .(1)[404:ccci_fsd][ccci1/chr]port ccci_fs open with flag 20002 by ccci_fsd
<6>[    5.880577] .(7)[408:ccci_rpcd][ccci1/chr]port ccci_rpc open with flag 20002 by ccci_rpcd
<3>[    5.882191] .(3)[407:ccci_mdinit]BOOTPROF:      5882.190244:ccci_md3: md_init srv start
<12>[    5.887791] .(5)[399:healthd]healthd: unable to get HAL interface, using defaults
<6>[    5.891052] .(1)[395:vendor.mediatek][DFRC] dfrc_reset_state
<5>[    5.891307] -(0)[399:healthd]alarmtimer_enqueue, 65846714076
<6>[    5.892670] .(0)[182:dfrc_make_polic][DFRC] adjust vsync: [0|0|0] -> [-1|0|0]
<5>[    5.893884] .(1)[403:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[14] = {a24, 255, 8}
<12>[    5.894371] .(0)[399:healthd]healthd: BatteryCycleCountPath not found
<5>[    5.895808] .(1)[403:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[14] = {a24, 255, 8}
<4>[    5.896699] -(3)[358:kworker/u16:6]do_connection_work: 17 callbacks suppressed
<5>[    5.896717] .(3)[358:kworker/u16:6][MUSB]do_connection_work 430: !is_ready, retrigger after 50 ms, is_host<0>, power<0>, skip_cnt<17>
<4>[    5.897110] .(6)[399:healthd]=====FG===== SOC  = 100
<4>[    5.899421] .(5)[399:healthd]=====FG===== VOLT = 4319
<4>[    5.899429] .(5)[399:healthd]=====FG===== actural VOLT = 4319
<5>[    5.901514] -(1)[403:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[0] = {a2a, 255, 8}
<5>[    5.902638] -(1)[403:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[0] = {a2a, 255, 8}
<5>[    5.903757] -(1)[403:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[0] = {a2a, 255, 8}
<5>[    5.909256] .(5)[403:fuelgauged][fgauge_read_RTC_boot_status] spare0 0x60 0x20, spare3 0xe4 0xe4
<14>[    5.910645] .(2)[412:init]init: Created socket '/dev/socket/rild-atci-c2k', mode 660, user 1001, group 1000
<4>[    5.911508] .(3)[399:healthd]=====FG===== AC   = -6
<5>[    5.912568] .(7)[403:fuelgauged][read_hw_ocv_6356_power_on_rdy] pwron_SWCHR_rdy 0
<6>[    5.912650] .(7)[403:fuelgauged]mt6370_pmu_charger mt6370_pmu_charger: mt6370_get_zcv: zcv = 0mV
<5>[    5.912658] .(7)[403:fuelgauged]charger_manager_get_zcv zcv:0 ret:0
<5>[    5.912702] .(7)[403:fuelgauged][read_hw_ocv] g_fg_is_charger_exist 1 _hw_ocv_chgin_rdy 0 pl:1 1
<5>[    5.912705] .(7)[403:fuelgauged][read_hw_ocv] _hw_ocv 35966 _sw_ocv 43209 now_thr 300
<5>[    5.912707] .(7)[403:fuelgauged][read_hw_ocv] _hw_ocv 43209 _hw_ocv_src 1 _prev_hw_ocv 35966 _prev_hw_ocv_src 3 _flag_unreliable 0
<5>[    5.912879] .(7)[403:fuelgauged][read_boot_battery_plug_out_status] rtc_invalid 0 plugout 0 bat_plug_out_time 0 sp0:0x60 sp3:0xe4 1 1
<4>[    5.913146] .(5)[399:healthd]bq27542_set_commands cmd = 0x12, val = 3892 
<5>[    5.913179] .(7)[403:fuelgauged][read_boot_battery_plug_out_status] rtc_invalid 0 plugout 0 bat_plug_out_time 0 sp0:0x60 sp3:0xe4 1 1
<5>[    5.913233] -(7)[403:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[0] = {a2a, 255, 8}
<4>[    5.914836] .(4)[399:healthd]temp_now=223, temp_last=223 
<4>[    5.914847] .(4)[399:healthd]=====FG===== TEMP = 223
<4>[    5.916530] .(6)[403:fuelgauged]=====FG-MTK===== bat_vol=4269
<6>[    5.917439] .(0)[399:healthd]i2c i2c-2: addr: 6c, transfer ACK error
<6>[    5.917453] .(0)[399:healthd]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    5.917456] .(0)[399:healthd]I2C structure:
<3>[    5.917456] [I2C]Clk=13650000,Id=2,Op=1,Irq_stat=2,Total_len=1
<3>[    5.917456] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=0,speed=400000
<3>[    5.917456] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    5.917463] .(0)[399:healthd]base address 0xffffff800bf46000
<6>[    5.917472] .(0)[399:healthd]I2C register:
<6>[    5.917472] [I2C]SLAVE_ADDR=d8,INTR_MASK=0,INTR_STAT=1,CONTROL=28,TRANSFER_LEN=1
<6>[    5.917472] [I2C]TRANSAC_LEN=1,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[    5.917472] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=2
<6>[    5.917479] .(0)[399:healthd]before enable DMA register(0xffffff800bf48400):
<6>[    5.917479] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    5.917479] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    5.917479] [I2C]TX_LEN=0,RX_LEN=10,INT_BUF_SIZE=0,DEBUG_STATUS=c0c0c00
<6>[    5.917479] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    5.917489] .(0)[399:healthd]DMA register(0xffffff800bf48400):
<6>[    5.917489] [I2C]INT_FLAG=2,INT_EN=0,EN=0,RST=0,
<6>[    5.917489] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=9c1c5010
<6>[    5.917489] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=10101000
<6>[    5.917489] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    5.917496] .(0)[399:healthd]i2c_dump_info ------------------------------------------
<3>[    5.917500] .(0)[399:healthd]i2c i2c-2: last transfer info:
<3>[    5.917503] .(0)[399:healthd]i2c i2c-2: [00] [    5.917432] SLAVE_ADDR=d8,INTR_STAT=2,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    5.917509] .(0)[399:healthd]i2c i2c-2: [01] [    5.914811] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[    5.917515] .(0)[399:healthd]i2c i2c-2: [02] [    5.913646] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    5.917521] .(0)[399:healthd]i2c i2c-2: [03] [    5.913126] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[    5.917526] .(0)[399:healthd]i2c i2c-2: [04] [    5.912721] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=499
<3>[    5.917532] .(0)[399:healthd]i2c i2c-2: [05] [    5.911498] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[    5.917538] .(0)[399:healthd]i2c i2c-2: [06] [    5.911106] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    5.917543] .(0)[399:healthd]i2c i2c-2: [07] [    5.899398] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[    5.917575] .(0)[399:healthd]i2c i2c-2: [08] [    5.898023] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    5.917581] .(0)[399:healthd]i2c i2c-2: [09] [    5.897841] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<4>[    5.917616] .(0)[399:healthd][wlc_do_10s_debounce]status=0
<4>[    5.917619] .(0)[399:healthd][wlc_do_10s_debounce] gpio5_state =1 zero_jiffies=0 to10s_jiffies=4294893765 valley_jiffies=0 topeak_jiffies=0 
<12>[    5.917895] .(0)[399:healthd]healthd: battery l=100 v=4319 t=22.3 h=2 st=2 c=-6 fc=3892000 chg=u
<5>[    5.918721] .(5)[403:fuelgauged]MTK_FG: [dod_init_result]ocv[boot:43203 final:43372 diff:169] thr[10000 10000 10000] tmp[now 24 5] v[lk_v:43202 cur:42690] lk_i:-6 lk_r:1700,i*r:1,old_soc:9997
<3>[    5.929298] .(6)[1:init][SDIO-DETECT][I]sdio_detect_init:sdio_register_driver() ret=0
<3>[    5.932866] .(6)[1:init][WMT-DETECT][E]wmt_detect_probe(235):platform name: odm:mediatek,connectivity-combo
<3>[    5.933944] .(6)[1:init]wmt_gpio: gpio init start!
<3>[    5.933956] .(6)[1:init]wmt_gpio:set GPIO_COMBO_URXD_PIN to GPIO_PULL_DIS fail, is NULL!
<3>[    5.933959] .(6)[1:init]wmt_gpio:set GPIO_COMBO_UTXD_PIN to GPIO_PULL_DIS fail, is NULL!
<3>[    5.933985] .(6)[1:init]wmt_gpio:set GPIO_COMBO_PMU_EN_PIN to GPIO_PULL_DIS done!
<3>[    5.934001] .(6)[1:init]wmt_gpio:set GPIO_COMBO_PMU_EN_PIN out to 0: 0!
<3>[    5.934009] .(6)[1:init]wmt_gpio:set GPIO_COMBO_RST_PIN to GPIO_PULL_DIS done!
<3>[    5.934014] .(6)[1:init]wmt_gpio:set GPIO_COMBO_RST_PIN out to 0: 0!
<3>[    5.934022] .(6)[1:init]wmt_gpio:set GPIO_WIFI_EINT_PIN to GPIO_IN_PULLUP done!
<3>[    5.934028] .(6)[1:init]wmt_gpio:set GPIO_PCM_DAICLK_PIN to GPIO_PULL_DIS done!
<3>[    5.934035] .(6)[1:init]wmt_gpio:set GPIO_PCM_DAIPCMIN_PIN to GPIO_PULL_DIS done!
<3>[    5.934042] .(6)[1:init]wmt_gpio:set GPIO_PCM_DAIPCMOUT_PIN to GPIO_PULL_DIS done!
<3>[    5.934050] .(6)[1:init]wmt_gpio:set GPIO_PCM_DAISYNC_PIN to GPIO_PULL_DIS done!
<4>[    5.934052] .(6)[1:init]wmt_gpio:it may not be 6632 project, GPIO_CHIP_DEEP_SLEEP_PIN no need config!
<4>[    5.934054] .(6)[1:init]wmt_gpio:it may not be 6632 project, GPIO_CHIP_WAKE_UP_PIN no need config!
<3>[    5.934056] .(6)[1:init]wmt_gpio: gpio init done!
<3>[    5.934419] .(6)[1:init][WMT-DETECT][I]wmt_detect_driver_init:driver(major 154) installed success
<14>[    5.934656] .(6)[1:init]init: Command 'insmod /vendor/lib/modules/wmt_drv.ko' action=boot (/vendor/etc/init/init.wmt_drv.rc:2) returned 0 took 102ms.
<14>[    5.935784] .(6)[1:init]init: PropSet [mtk.md1.status]=[init] Done
<14>[    5.935943] .(6)[1:init]init: processing action (enable_property_trigger) from (<Builtin Action>:0)
<14>[    5.936818] .(6)[1:init]init: Service 'ccci3_mdinit' (pid 407) exited with status 0
<14>[    5.938531] .(6)[1:init]init: processing action (security.perf_harden=1) from (/init.rc:761)
<14>[    5.938823] .(6)[1:init]init: processing action (ro.debuggable=0) from (/init.rc:796)
<5>[    5.948677] .(0)[68:kworker/u16:1][MUSB]do_connection_work 430: !is_ready, retrigger after 50 ms, is_host<0>, power<0>, skip_cnt<0>
<5>[    5.954212] -(1)[403:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[0] = {a2a, 255, 8}
<5>[    5.954237] -(1)[403:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[0] = {a2a, 255, 8}
<5>[    5.954719] .(1)[403:fuelgauged][fg_res] FG_DAEMON_CMD_SET_BATTERY_CYCLE_THRESHOLD = 27803
<5>[    5.958190] .(4)[403:fuelgauged][fg_res] FG_DAEMON_CMD_SET_FG_BAT_INT1_GAP = 139 car:-9
<5>[    5.960176] .(4)[403:fuelgauged][fg_res][fg_bat_int2] FG_DAEMON_CMD_SET_FG_BAT_INT2_HT_GAP = 278
<5>[    5.962110] .(4)[403:fuelgauged][fg_res][fg_bat_int2] FG_DAEMON_CMD_SET_FG_BAT_INT2_LT_GAP = 138
<5>[    5.968793] .(4)[403:fuelgauged][FGADC_intr_end][FG_INTR_INIT][read_fg_hw_info] curr_1 -2134 curr_2 -675 Iavg 75 sign 0 car -9 ncar -14437 time 3446
<5>[    5.968921] .(4)[403:fuelgauged][fg_res] FG_DAEMON_CMD_SET_KERNEL_SOC = 9951 100 10000 9951 9997 9951, type:4
<4>[    5.969863] .(0)[403:fuelgauged]=====FG===== SOC  = 100
<5>[    5.969877] .(0)[403:fuelgauged][bmd_ctrl_cmd_from_user]FG_status.ui_soc=100,fg_soc=100 
<4>[    5.973648] .(0)[403:fuelgauged]temp_now=223, temp_last=223 
<4>[    5.973660] .(0)[403:fuelgauged]=====FG===== TEMP = 223
<4>[    5.974751] .(4)[403:fuelgauged]=====FG===== VOLT = 4319
<4>[    5.974761] .(4)[403:fuelgauged]=====FG===== actural VOLT = 4319
<6>[    5.974769] .(4)[403:fuelgauged]power_supply battery: power_supply_changed
<5>[    5.974984] .(4)[403:fuelgauged][fg_res] FG_DAEMON_CMD_SET_CON0_SOC = 10047
<5>[    5.975101] .(4)[403:fuelgauged]MTK_FG: [FGADC_intr_end][INTR_Initialize]soc:9997 fg_c_soc:9997 fg_v_soc:9951 ui_soc:10000 vc_diff:46 vc_mode 1 VBAT 43202 T:[25 V 24 C 25] D0_C 10000 D0_V 9951 Q:[27803 27803 27966 27966] aging 10000 bat_cycle 1 Trk[0:0:0] UI[1:0] Chr[1:9997:0] pseudo1 0 DC_ratio 100
<4>[    5.975384] .(4)[71:kworker/4:1]temp_now=223, temp_last=223 
<4>[    5.975387] .(4)[71:kworker/4:1]=====FG===== TEMP = 223
<4>[    5.975912] .(4)[71:kworker/4:1]temp_now=223, temp_last=223 
<4>[    5.975914] .(4)[71:kworker/4:1]=====FG===== TEMP = 223
<6>[    5.976321] .(7)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: ICHG = 500mA, AICR = 500mA, MIVR = 4400mV, IEOC = 250mA, CV = 4350mV
<6>[    5.976332] .(7)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: VSYS = 4260mV, VBAT = 4275mV, IBAT = 0mA, IBUS = 400mA, VBUS = 4975mV
<6>[    5.976336] .(7)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: CHG_EN = 1, CHG_STATUS = progress, CHG_STAT = 0xA0
<6>[    5.976340] .(7)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: CHG_CTRL1 = 0x10, CHG_CTRL2 = 0x1B
<5>[    5.976348] .(7)[266:charger_thread][charger_routine_thread]flags=0,1 
<4>[    5.976373] .(7)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    5.977386] .(4)[71:kworker/4:1]=====FG===== SOC  = 100
<4>[    5.978776] .(4)[71:kworker/4:1]=====FG===== AC   = -6
<4>[    5.980306] .(4)[71:kworker/4:1]=====FG===== VOLT = 4319
<4>[    5.980318] .(4)[71:kworker/4:1]=====FG===== actural VOLT = 4319
<4>[    5.980933] .(4)[71:kworker/4:1]temp_now=223, temp_last=223 
<4>[    5.980942] .(4)[71:kworker/4:1]=====FG===== TEMP = 223
<3>[    5.981135] .(5)[385:android.hardwar]Dump cpuinfo
<4>[    5.982684] .(4)[71:kworker/4:1]=====FG===== SOC  = 100
<4>[    5.983236] .(4)[71:kworker/4:1]bq27542_set_commands cmd = 0x12, val = 3892 
<4>[    5.983868] .(4)[71:kworker/4:1]bq27542_set_commands cmd = 0x3c, val = 3850 
<4>[    5.984402] .(4)[71:kworker/4:1]bq27542_set_commands cmd = 0xc, val = 4004 
<4>[    5.985689] .(4)[399:healthd]=====FG===== SOC  = 100
<4>[    5.987781] .(5)[399:healthd]=====FG===== VOLT = 4319
<4>[    5.987794] .(5)[399:healthd]=====FG===== actural VOLT = 4319
<4>[    5.989152] .(5)[399:healthd]=====FG===== AC   = -6
<4>[    5.989843] .(5)[399:healthd]bq27542_set_commands cmd = 0x12, val = 3892 
<4>[    5.991261] .(4)[399:healthd]temp_now=223, temp_last=223 
<4>[    5.991277] .(4)[399:healthd]=====FG===== TEMP = 223
<6>[    5.992379] .(0)[399:healthd]i2c i2c-2: addr: 6c, transfer ACK error
<6>[    5.992394] .(0)[399:healthd]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    5.992398] .(0)[399:healthd]I2C structure:
<3>[    5.992398] [I2C]Clk=13650000,Id=2,Op=1,Irq_stat=3,Total_len=1
<3>[    5.992398] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=0,speed=400000
<3>[    5.992398] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    5.992405] .(0)[399:healthd]base address 0xffffff800bf46000
<6>[    5.992415] .(0)[399:healthd]I2C register:
<6>[    5.992415] [I2C]SLAVE_ADDR=d8,INTR_MASK=0,INTR_STAT=0,CONTROL=28,TRANSFER_LEN=1
<6>[    5.992415] [I2C]TRANSAC_LEN=1,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[    5.992415] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=2
<6>[    5.992422] .(0)[399:healthd]before enable DMA register(0xffffff800bf48400):
<6>[    5.992422] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    5.992422] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    5.992422] [I2C]TX_LEN=0,RX_LEN=10,INT_BUF_SIZE=0,DEBUG_STATUS=c0c0c00
<6>[    5.992422] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    5.992433] .(0)[399:healthd]DMA register(0xffffff800bf48400):
<6>[    5.992433] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    5.992433] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    5.992433] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=0
<6>[    5.992433] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    5.992439] .(0)[399:healthd]i2c_dump_info ------------------------------------------
<3>[    5.992444] .(0)[399:healthd]i2c i2c-2: last transfer info:
<3>[    5.992447] .(0)[399:healthd]i2c i2c-2: [00] [    5.992370] SLAVE_ADDR=d8,INTR_STAT=3,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    5.992453] .(0)[399:healthd]i2c i2c-2: [01] [    5.991253] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[    5.992459] .(0)[399:healthd]i2c i2c-2: [02] [    5.990859] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    5.992465] .(0)[399:healthd]i2c i2c-2: [03] [    5.989836] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[    5.992470] .(0)[399:healthd]i2c i2c-2: [04] [    5.989491] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    5.992476] .(0)[399:healthd]i2c i2c-2: [05] [    5.989144] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[    5.992481] .(0)[399:healthd]i2c i2c-2: [06] [    5.988757] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=499
<3>[    5.992487] .(0)[399:healthd]i2c i2c-2: [07] [    5.987770] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[    5.992493] .(0)[399:healthd]i2c i2c-2: [08] [    5.987188] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    5.992498] .(0)[399:healthd]i2c i2c-2: [09] [    5.987002] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<4>[    5.992533] .(0)[399:healthd][wlc_do_10s_debounce]status=0
<4>[    5.992537] .(0)[399:healthd][wlc_do_10s_debounce] gpio5_state =1 zero_jiffies=0 to10s_jiffies=4294893783 valley_jiffies=0 topeak_jiffies=0 
<12>[    5.992911] .(0)[399:healthd]healthd: battery l=100 v=4319 t=22.3 h=2 st=2 c=-6 fc=3892000 chg=u
<5>[    6.000676] .(3)[69:kworker/u16:2][MUSB]do_connection_work 430: !is_ready, retrigger after 50 ms, is_host<0>, power<0>, skip_cnt<0>
<6>[    6.018433] .(5)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_get_adc_vbus: VBUS = 4975mV
<4>[    6.018449] .(5)[266:charger_thread]sg_detect_typec_charge_ovp,1363,4975000,0 
<4>[    6.020303] .(5)[266:charger_thread]=====FG===== AC   = -6
<4>[    6.021075] .(5)[266:charger_thread]=====FG===== AC   = -6
<14>[    6.080166] .(7)[412:init]init: Created socket '/dev/socket/statusd', mode 660, user 1001, group 1001
<14>[    6.080762] .(6)[1:init]init: starting service 'console'...
<14>[    6.082080] .(6)[1:init]init: Command 'start console' action=ro.debuggable=0 (/init.rc:800) returned 0 took 142ms.
<14>[    6.082640] .(6)[1:init]init: PropSet [debug.sf.hwc_pid]=[389] Done
<14>[    6.082718] .(6)[1:init]init: processing action (ro.mtk_emmc_support=1) from (/vendor/etc/init/hw/init.mt6763.rc:889)
<14>[    6.083001] .(6)[1:init]init: processing action (sys.usb.acm_cnt=0 && sys.usb.config=mtp && sys.usb.configfs=1) from (/vendor/etc/init/hw/init.mt6763.usb.rc:169)
<14>[    6.083035] .(6)[1:init]init: PropSet [sys.usb.pid]=[0x2008] Done
<14>[    6.083055] .(6)[1:init]init: processing action (sys.usb.acm_enable=0 && sys.usb.config=mtp && sys.usb.configfs=1) from (/vendor/etc/init/hw/init.mt6763.usb.rc:192)
<6>[    6.083263] .(6)[1:init]os_desc_use_store Use OS DESC
<6>[    6.083385] .(6)[1:init]config_usb_cfg_link b.1<-->mtp.gs0
<6>[    6.083391] .(6)[1:init]usb_get_function usb_function_driver name=mtp
<6>[    6.083395] .(6)[1:init]usb_get_function usb_function name=mtp
<6>[    6.083436] .(6)[1:init]gadget_dev_desc_UDC_store write musb-hdrc
<6>[    6.083441] .(6)[1:init]usb_udc_attach_driver musb-hdrc musb-hdrc
<6>[    6.083448] .(6)[1:init]udc musb-hdrc: registering UDC driver [g1]
<6>[    6.083453] .(6)[1:init]configfs_composite_bind
<6>[    6.083461] .(6)[1:init]composite_dev_prepare ffffffc057b02600
<6>[    6.083492] .(6)[1:init]configfs-gadget gadget: adding 'mtp'/ffffffc0578cf000 to config 'b'/ffffffc057992100
<6>[    6.083526] .(6)[1:init]allocate RX=49152 Tx=49152
<6>[    6.083529] .(6)[1:init]composite_os_desc_req_prepare ffffffc055814480
<5>[    6.083535] .(6)[1:init][MUSB]musb_gadget_start 2445: musb_gadget_start
<5>[    6.083603] .(6)[1:init][MUSB]musb_gadget_pullup 2230: is_on=1, softconnect=0 ++
<5>[    6.083606] -(6)[1:init][MUSB]musb_gadget_pullup 2243: is_on=1, softconnect=0 ++
<5>[    6.083610] -(6)[1:init][MUSB]set_usb_rdy 2204: set usb_rdy, wake up bat
<5>[    6.083613] -(6)[1:init][MUSB]musb_gadget_pullup 2259: issue connect_rescue_work on is_ready begin, delay_time:8000 ms
<5>[    6.083616] -(6)[1:init][MUSB]musb_gadget_pullup 2261: issue connect_rescue_work on is_ready end, delay_time:8000 ms
<5>[    6.083619] -(6)[1:init][MUSB]musb_pullup 2152: MUSB: gadget pull up 1 start, musb->power:0
<5>[    6.083622] -(6)[1:init][MUSB]musb_pullup 2174: MUSB: gadget pull up 1 end
<3>[    6.083734] .(6)[1:init]BOOTPROF:      6083.733860:USB ready
<14>[    6.083807] .(6)[1:init]init: PropSet [sys.usb.state]=[mtp] Done
<14>[    6.083904] .(6)[1:init]init: processing action (defaultcrypto) from (/system/etc/init/vdc.rc:2)
<14>[    6.084550] .(6)[1:init]init: starting service 'exec 4 (/system/bin/vdc --wait cryptfs mountdefaultencrypted)'...
<14>[    6.085774] .(6)[1:init]init: SVC_EXEC pid 426 (uid 0 gid 0+0 context default) started; waiting...
<3>[    6.095793] .(0)[410:wmt_loader][WMT-DETECT][I]wmt_detect_open:open major 154 minor 0 (pid 410)
<3>[    6.096035] .(0)[410:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:cmd (-2147191034),arg(92)
<3>[    6.096042] .(0)[410:wmt_loader][WMT-DETECT][I]wmt_detect_ext_chip_pwr_on:++
<3>[    6.096046] .(0)[410:wmt_loader][WMT-DETECT][I]wmt_detect_dump_pin_conf:LDO(GPIO-1), PMU(GPIO370), PMUV28(GPIO-1)
<4>[    6.096052] .(0)[410:wmt_loader]------------[ cut here ]------------
<4>[    6.096054] .(0)[410:wmt_loader]WARNING: CPU: 0 PID: 410 at /data/jenkins/workspace/dl35_oreo/kernel-4.4/drivers/gpio/gpiolib.c:85 gpio_to_desc+0xdc/0xf0()
<4>[    6.096070] .(0)[410:wmt_loader]invalid GPIO -1
<4>[    6.096083] .(0)[410:wmt_loader]Modules linked in: wmt_drv ffffff8000c33000           (null) 1162215 0 (O) fpsgo ffffff8000c2f000           (null) 2624 0 (O)
<4>[    6.096086] -(0)[410:wmt_loader]CPU: 0 PID: 410 Comm: wmt_loader Tainted: G        W  O    4.4.95+ #2
<4>[    6.096091] -(0)[410:wmt_loader]Hardware name: MT6763V/B (DT)
<4>[    6.096096] -(0)[410:wmt_loader]Call trace:
<4>[    6.096098] -(0)[410:wmt_loader][<ffffff800808a298>] dump_backtrace+0x0/0x228
<4>[    6.096109] -(0)[410:wmt_loader][<ffffff800808a4d4>] show_stack+0x14/0x20
<4>[    6.096113] -(0)[410:wmt_loader][<ffffff8008360870>] dump_stack+0xa0/0xc0
<4>[    6.096121] -(0)[410:wmt_loader][<ffffff80080a1bc4>] warn_slowpath_common+0x9c/0xd8
<4>[    6.096127] -(0)[410:wmt_loader][<ffffff80080a1c5c>] warn_slowpath_fmt+0x5c/0x80
<4>[    6.096132] -(0)[410:wmt_loader][<ffffff80083a039c>] gpio_to_desc+0xdc/0xf0
<4>[    6.096135] -(0)[410:wmt_loader][<ffffff8000c33564>] wmt_detect_chip_pwr_ctrl+0x2ac/0x398 [wmt_drv]
<4>[    6.096407] -(0)[410:wmt_loader][<ffffff8000c33920>] wmt_detect_ext_chip_pwr_on+0x20/0x78 [wmt_drv]
<4>[    6.096613] -(0)[410:wmt_loader][<ffffff8000c33d34>] wmt_detect_ext_chip_detect+0x35c/0x500 [wmt_drv]
<4>[    6.096798] -(0)[410:wmt_loader][<ffffff80081f5184>] do_vfs_ioctl+0x384/0x688
<4>[    6.096809] -(0)[410:wmt_loader][<ffffff80081f5514>] SyS_ioctl+0x8c/0xa0
<4>[    6.096813] -(0)[410:wmt_loader][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[    6.096875] .(0)[410:wmt_loader]---[ end trace 8cfa91f0817a7c75 ]---
<3>[    6.096886] .(0)[410:wmt_loader][WMT-DETECT][I]wmt_detect_dump_pin_conf:RST(GPIO369), BGF_EINT(GPIO-1), BGF_EINT_NUM(-22)
<3>[    6.096906] .(0)[410:wmt_loader][WMT-DETECT][I]wmt_detect_dump_pin_conf:WIFI_EINT(GPIO371), WIFI_EINT_NUM(695)
<3>[    6.096910] .(0)[410:wmt_loader]wmt_gpio:set GPIO_COMBO_URXD_PIN to GPIO_PULL_DIS fail, is NULL!
<3>[    6.096937] .(0)[410:wmt_loader][WMT-DETECT][I]wmt_detect_chip_pwr_on:wmt_gpio:set GPIO_COMBO_PMU_EN_PIN to GPIO_PULL_DIS done!
<3>[    6.096953] .(0)[410:wmt_loader][WMT-DETECT][I]_wmt_detect_output_low:WMT-DETECT: set GPIO90 to output 0
<3>[    6.096963] .(0)[410:wmt_loader][WMT-DETECT][I]wmt_detect_chip_pwr_on:wmt_gpio:set GPIO_COMBO_RST_PIN to GPIO_PULL_DIS done!
<3>[    6.096969] .(0)[410:wmt_loader][WMT-DETECT][I]_wmt_detect_output_low:WMT-DETECT: set GPIO89 to output 0
<14>[    6.101415] .(0)[1:init]init: Service 'exec 4 (/system/bin/vdc --wait cryptfs mountdefaultencrypted)' (pid 426) exited with status 0 waiting took 0.017000 seconds
<3>[    6.103800] .(1)[427:vold]BOOTPROF:      6103.798321:vold:decrypt_master_key:START
<3>[    6.103914] .(1)[427:vold]BOOTPROF:      6103.913860:vold:scrypt_keymaster:START
<5>[    6.108651] .(2)[68:kworker/u16:1][MUSB]do_connection_work 459: is_host<0>, power<0>
<5>[    6.108677] .(2)[68:kworker/u16:1][MUSB]usb_cable_connected 747: usb_cable_connected vbus_exist=1 type=2
<5>[    6.108681] .(2)[68:kworker/u16:1][MUSB]usb_cable_connected 768: usb_cable_connected, connected:1, cable_mode:1, usb_data_lock:0
<5>[    6.108691] -(2)[68:kworker/u16:1][MUSB]do_connection_work 484: lock
<5>[    6.108694] -(2)[68:kworker/u16:1][MUSB]musb_start 1295: start, is_host=0 is_active=0
<5>[    6.108699] -(2)[68:kworker/u16:1][MUSB]mt_usb_enable 300: begin <0,0>,<2,1,1,1>
<4>[    6.108709] -(2)[68:kworker/u16:1]usb_6763_dpidle_request: 1 callbacks suppressed
<5>[    6.108714] -(2)[68:kworker/u16:1][MUSB]usb_6763_dpidle_request 120: USB_DPIDLE_FORBIDDEN, skip_cnt<1>
<4>[    6.108776] -(2)[68:kworker/u16:1]usb_6763_dpidle_request: 1 callbacks suppressed
<5>[    6.108779] -(2)[68:kworker/u16:1][MUSB]usb_6763_dpidle_request 113: USB_DPIDLE_ALLOWED, skip_cnt<1>
<5>[    6.119703] -(2)[68:kworker/u16:1][MUSB]set_usb_phy_mode 425: force PHY to mode 1, 0x6c=3f2f
<5>[    6.119735] -(2)[68:kworker/u16:1][MUSB]usb_phy_recover 685: apply efuse setting, RG_USB20_INTR_CAL=0x15
<5>[    6.119742] -(2)[68:kworker/u16:1][MUSB]usb_phy_recover 695: usb recovery success
<5>[    6.119746] -(2)[68:kworker/u16:1][MUSB]mt_usb_enable 324: end, <2,1,2,1>
<5>[    6.119754] -(2)[68:kworker/u16:1][MUSB]musb_start 1335: set ignore babble MUSB_ULPI_REG_DATA=81
<5>[    6.119758] -(2)[68:kworker/u16:1][MUSB]musb_start 1343: add softconn
<4>[    6.136662] .(2)[266:charger_thread]lifetime: data[0]=df 
<4>[    6.136683] .(2)[266:charger_thread]lifetime: data[1]=ff 
<4>[    6.136686] .(2)[266:charger_thread]lifetime: data[2]=40 
<4>[    6.136688] .(2)[266:charger_thread]lifetime: data[3]=11 
<4>[    6.136691] .(2)[266:charger_thread]lifetime: data[4]=45 
<4>[    6.136693] .(2)[266:charger_thread]lifetime: data[5]=a 
<4>[    6.136695] .(2)[266:charger_thread]lifetime: data[6]=fc 
<4>[    6.136697] .(2)[266:charger_thread]lifetime: data[7]=8 
<4>[    6.136699] .(2)[266:charger_thread]lifetime: data[8]=68 
<4>[    6.136702] .(2)[266:charger_thread]lifetime: data[9]=f7 
<4>[    6.136704] .(2)[266:charger_thread]lifetime: data[10]=18 
<4>[    6.136706] .(2)[266:charger_thread]lifetime: data[11]=0 
<4>[    6.138366] .(2)[266:charger_thread]=====FG-MTK===== bat_vol=4293
<5>[    6.141835] .(2)[266:charger_thread]Vbat=4293,Ibat=6,I=0,VChr=4730,T=25,Soc=100:100,CT:2:2 hv:1 pd:0:0
<5>[    6.141851] .(2)[266:charger_thread][mtk_is_charger_on]info->chr_type=2 
<4>[    6.144517] .(2)[266:charger_thread]temp_now=223, temp_last=223 
<4>[    6.144521] .(2)[266:charger_thread]=====FG===== TEMP = 223
<5>[    6.144524] .(2)[266:charger_thread]charger_check_status
<11>[    6.181710] .(2)[425:init]init: setpgid failed for console: Operation not permitted
<5>[    6.188004] .(4)[266:charger_thread][mtk_chg_check_vbus]charger_update_data(4730000 mV) 
<5>[    6.190684] .(4)[266:charger_thread][BATTERY] bat_auth 1 gpio53_state =1
<5>[    6.191554] .(4)[266:charger_thread]charger_check_status tmp:22 (jeita:0 sm:0 cv:0 en:0) (sm:1) charging:1 cmd_discharging:0 safety_timeout:0 vbusov_stat:0 can_charging:1, charging:1
<5>[    6.195310] .(0)[266:charger_thread]mtk_switch_charging_run [1 0], timer=0
<5>[    6.200661] .(0)[410:wmt_loader]mtk_rtc_common: rtc_gpio_enable_32k, user = 9
<5>[    6.201781] -(0)[410:wmt_loader]mtk_rtc_hal: RTC_GPIO user 9 enable = 1 32k (0x200), RTC_CON = 487
<5>[    6.238338] .(1)[266:charger_thread]pe40_ready:0 hv:1 thermal:-1,-1 tmp:25,39,16 pps:0 en:0 ibus:0 80
<5>[    6.239548] .(1)[266:charger_thread]mtk_pe20_start_algorithm: stop, PE+20 is not connected
<5>[    6.240635] .(1)[266:charger_thread]mtk_pe_start_algorithm: stop, PE+ is not connected
<5>[    6.243223] .(1)[266:charger_thread]mtk_pe_start_algorithm: vchr_org = 5000, vchr_after = 4730, delta = -270
<4>[    6.244642] .(1)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    6.245960] .(1)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    6.247283] .(1)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    6.248789] .(1)[266:charger_thread][mtk_switch_charging_multi_power_supply_check]hall_1_eint_occur=0 mtk_charger_hall_1_eint=0
<4>[    6.250903] .(1)[266:charger_thread]temp_now=223, temp_last=223 
<4>[    6.251698] .(1)[266:charger_thread]=====FG===== TEMP = 223
<4>[    6.253599] .(1)[266:charger_thread]=====FG===== VOLT = 4319
<4>[    6.254325] .(1)[266:charger_thread]=====FG===== actural VOLT = 4319
<4>[    6.255691] .(1)[266:charger_thread]=====FG===== AC   = -6
<4>[    6.256955] .(1)[266:charger_thread]=====FG===== SOC  = 100
<4>[    6.258220] .(1)[266:charger_thread]=====FG===== SOH  = 100
<4>[    6.258939] .(1)[266:charger_thread]DLCP bat_vol=4319,  temperature=223  
<4>[    6.259816] .(1)[266:charger_thread] ===CC_value from battery temprature=2000000
<4>[    6.260797] .(1)[266:charger_thread]DLCP __mt6370_set_ieoc      = 150000
<4>[    6.261918] .(1)[266:charger_thread]DLCP mt6370_set_vrech       = 300
<4>[    6.263119] .(1)[266:charger_thread]DLCP mt6370_get_vrech       = 300
<4>[    6.263943] .(1)[266:charger_thread]DLCP read cv              = 4350000
<4>[    6.264812] .(1)[266:charger_thread]DLCP read eoc             = 250000
<4>[    6.265646] .(1)[266:charger_thread]DLCP read recharge        = 300
<4>[    6.266459] .(1)[266:charger_thread]DLCP Target Temp          = 410
<4>[    6.267302] .(1)[266:charger_thread]DLCP Charge Current       = 2000
<4>[    6.268116] .(1)[266:charger_thread]DLPID 
<4>[    6.268671] .(1)[266:charger_thread]DLPID +++++++++++++++++ PID Start +++++++++++++++++++++ 
<4>[    6.269763] .(1)[266:charger_thread]DLPID PID Target Temp = 410 
<4>[    6.270552] .(1)[266:charger_thread]DLPID Battery Temp    = 223 
<4>[    6.271332] .(1)[266:charger_thread]DLPID TEMP DIFF       = 140 
<4>[    6.272113] .(1)[266:charger_thread]DLPID PID KI          = 5000 
<4>[    6.272916] .(1)[266:charger_thread]DLPID CC MAX          = 2000000 
<4>[    6.273730] .(1)[266:charger_thread]DLPID PID Current     = 1200000 
<5>[    6.274565] -(1)[266:charger_thread][MUSB]musb_stage0_irq 1166: musb_stage0_irq:1166 MUSB_INTR_RESET (b_idle)
<5>[    6.274574] -(1)[266:charger_thread]QMU_WARN,<musb_disable_q_all 308>, disable_q_all
<5>[    6.274586] -(1)[266:charger_thread][BATTERY] BAT_SetUSBState Success! Set 1
<4>[    6.277824] .(1)[266:charger_thread]DLCP ccurrent from charge type        = 500000
<4>[    6.278801] .(1)[266:charger_thread]DLCP ccurrent from battery temprature = 2000000
<4>[    6.279787] .(1)[266:charger_thread]DLCP ccurrent from PID algorithm      = 1200000
<4>[    6.280786] .(1)[266:charger_thread]DLCP ccurrent from DLPL               = 2000000
<4>[    6.281764] .(1)[266:charger_thread]DLCP set input current:500000 
<4>[    6.282775] .(1)[266:charger_thread]DLCP set charge current: 500000 
<4>[    6.284176] .(1)[266:charger_thread]DLCP mt6370_enable_charging :1 
<4>[    6.285142] .(1)[266:charger_thread]DLCP charger_dev_set_constant_voltage       = 4350000
<4>[    6.286208] .(1)[266:charger_thread]DLCP __mt6370_set_cv       = 4350000
<4>[    6.287224] .(1)[266:charger_thread]DLCP mt6370_enable_charging :1 
<4>[    6.312646] [TKCORE]  tee_boot_params.flags: 0
<4>[    6.312646] [    5.253071]: <0>MSG TKCore:dump_tee_boot_params:147: rpmb_key_programmed: 1
<4>[    6.312646] [   18.259651]: <4>DBG TKCore:tee_ta_init_static_ta_session:1852:  Run tee_user_init.ta : 4dd88ba0-4c11-5669-dd-c3-26-24-bf-84-a4-e0
<4>[    6.312646] [   18.363861]: <[TKCORE] 4>DBG TKCore:tee_ta_open_session:1988: [TA 4dd88ba0: 0] init session
<4>[    6.312646] [   18.365051]: <4>DBG TKCore:invoke_command:398: cmd_id=2820 nParamTypes=0x2
<4>[    6.312646] [   18.366340]: <4>DBG TKCore:invoke_command:398: cmd_id=2821 nParamTypes=0x2
<4>[    6.312646] [   18.390561]: <4>DBG TKCore:[TKCORE] invoke_command:398: cmd_id=2822 nParamTypes=0x0
<4>[    6.312646] [   18.391562]: <4>DBG TKCore:invoke_command:398: cmd_id=2820 nParamTypes=0x2
<4>[    6.312646] [   18.395350]: <4>DBG TKCore:tee_ta_init_static_ta_session:1852:  Run tee_user_init.ta : 4dd88ba0-4c11-5669-dd-c3-26-24-bf-84-a4[TKCORE] -e0
<4>[    6.321487] [   18.411759]: <4>DBG TKCore:tee_ta_open_session:1988: [TA 4dd88ba0: 0] init session
<4>[    6.321487] [   18.413014]: <4>DBG TKCore:invoke_command:398: cmd_id=0 nParamTypes=0x555
<4>[    6.321487] [   18.414883]: <4>ERR TKCore:tee_rpmb_get_dev_info:1035: send rpmb command failed with <3>[    6.321509] .(1)[410:wmt_loader][WMT-DETECT][I]_wmt_detect_output_high:WMT-DETECT: set GPIO90 to output 1
<4>[    6.326233] [TKCORE] 0xffff0009
<4>[    6.326233] [   18.416923]: <4>ERR TKCore:tee_rpmb_init:1165: Failed to retrieve rpmb device info with 0xffff0009
<4>[    6.326233] [   18.421342]: <4>ERR TKCore:init_truststore:132: Init rpmb device failed with 0xffff0009
<4>[    6.326233] [   18.422414]: <4>INF TKCore:init_truststore:239: [TKCORE] Candidate truststore: PROTECT
<4>[    6.326233] [   18.423365]: <4>MSG TKCore:truststore_source_init_with_type:124: Init truststore with type=3
<4>[    6.326233] [   18.425517]: <4>INF TKCore:sdrpmb_reserved_region_init:2954: SDRPMB Reserved region Prepared
<4>[    6.326233] [   18.426745]: <4>INF TKCore:ini[TKCORE] t_truststore:251: PROTECT Setup ... Done
<4>[    6.326233] [   18.427645]: <4>INF TKCore:license_init:1948: Check secondary external certificate
<4>[    6.326233] [   18.431443]: <4>INF TKCore:get_pubk:652: KeyID = 0
<4>[    6.326233] [   18.437253]: <4>INF TKCore:license_init:1950: Load Secondary cert succe[TKCORE] ss
<4>[    6.335116] [   18.438170]: <4>INF TKCore:license_init:1983: VERIFY_STATE: 1 TRIAL_STATE: 1
<4>[    6.335116] [   18.439477]: <4>DBG TKCore:tee_ta_init_static_ta_session:1852:  Run tee_user_init.ta : 4dd88ba0-4c11-5669-dd-c3-26-24-bf-84-a4-e0
<4>[    6.335116] [   18.441093]: <4>DBG TKCore:tee_ta_op.(4)[1:init][TKCORE] en_session:1988: [TA 4dd88ba0: 0] init session
<4>[    6.338669] [   18.442304]: <4>DBG TKCore:invoke_command:398: cmd_id=2561 nParamTypes=0x67
<4>[    6.338669] [   18.456468]: <4>DBG TKCore:elf_load_body:450: Set TLS offset for TA: 0x24b9f4
<4>[    6.338669] [   18.463663]: <4>DBG TKCore:tee_ta_load:1170: [TKCORE] Loaded TA at 0xf0200000
<4>[    6.338669] [   18.478329]: <4>DBG TKCore:tee_ta_load:1171: ELF load address 0x200000
<4>[    6.338669] [   18.479217]: <4>DBG TKCore:tee_ta_init_session_with_signed_ta:1882:       dyn TA : 9ef77781-7bd5-4e39-96-5f-20-f6-f2-11-f4-6b
<4>[    6.338669] [   18.484020]: <4>DBG TKCor[TKCORE] e:tee_ta_open_session:1988: [TA 9ef77781: 0] init session
<4>[    6.338669] [   18.485161]: <4>ERR KEYMASTER:judge_rpmb:93: TEE_RPMB_MakeFileSystem return 0xf0100003
<4>[    6.338669] [   18.492044]: <4>INF KEYMASTER:key_store_init:147: no RPMB for ksk
<4>[    6.338669] [   18.494838]: <4>INF KEYMASTER:TA_In
<11>[    6.347254] .(4)[1:init]init: property_set("ro.sf.lcd_density", "300") failed: property already set
<4>[    6.348662] [TKCORE] vokeCommandEntryPoint:1363: TA_InvokeCommandEntryPoint nCommandID 0x19 pSessionContext 0x0 nParamTypes 0x53
<4>[    6.348662] [   18.496621]: <4>INF KEYMASTER:TA_InvokeCommandEntryPoint:1378: configure
<4>[    6.348662] [   18.754881]: <4>DBG TKCore:elf_load_body:450: Set TLS offset for TA:.(0)[410:wmt_loader][TKCORE]  0x2130b4
<4>[    6.352152] [   18.756040]: <4>DBG TKCore:tee_ta_load:1170: Loaded TA at 0xf0291000
<4>[    6.352152] [   18.776968]: <4>DBG TKCore:tee_ta_load:1171: ELF load address 0x200000
<4>[    6.352152] [   18.778002]: <4>DBG TKCore:tee_ta_init_session_with_signed_ta:1882:       dyn TA : 02662e8e-e126
<3>[    6.356665] .(0)[410:wmt_loader][WMT-DETECT][I]_wmt_detect_output_high:WMT-DETECT: set GPIO89 to output 1
<5>[    6.363436] .(4)[71:kworker/4:1][MUSB]usb_cable_connected 747: usb_cable_connected vbus_exist=1 type=2
<5>[    6.364670] .(4)[71:kworker/4:1][MUSB]usb_cable_connected 768: usb_cable_connected, connected:1, cable_mode:1, usb_data_lock:0
<6>[    6.366225] .(4)[71:kworker/4:1]android_work: sent uevent USB_STATE=CONNECTED
<6>[    6.378299] -(6)[388:allocator@2.0-s]configfs-gadget gadget: [ratelimit]non-core control reqc0.01 v0000 i0004 l16
<6>[    6.379759] -(5)[427:vold]configfs-gadget gadget: [ratelimit]non-core control reqc0.01 v0000 i0004 l40
<4>[    6.392634] .(0)[410:wmt_loader]mtk_wcn_cmb_sdio_off (1)
<6>[    6.393855] .(0)[410:wmt_loader][msdc]msdc2 -> MSDC Device Request Suspend
<4>[    6.394472] .(0)[410:wmt_loader]mtk_wcn_cmb_sdio_on (1)
<6>[    6.420815] .(1)[410:wmt_loader][msdc]msdc2 -> !!! Set<400KHz> Source<185999KHz> -> sclk<397KHz> timing<0> mode<0> div<117> hs400_div_dis<0>
<5>[    6.437212] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<52> MSDC_INT_CMDTMO Arg<0x00000c00>
<6>[    6.438556] .(0)[410:wmt_loader][msdc]msdc2 -> MSDC Device Request Resume
<3>[    6.438547] .(0)[410:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:cmd (-2147191038),arg(0)
<3>[    6.438559] .(0)[410:wmt_loader][WMT-DETECT][I]wmt_detect_ext_chip_detect:++
<5>[    6.442049] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<52> MSDC_INT_CMDTMO Arg<0x80000c08>
<5>[    6.447303] .(2)[229:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<8> MSDC_INT_CMDTMO Arg<0x000001aa>
<6>[    6.450574] .(2)[229:kworker/2:2][msdc]msdc2: card is busy!
<3>[    6.464726] .(1)[410:wmt_loader][WMT-DETECT][E]wmt_detect_read_ext_cmb_status(216):WMT-DETECT: WIFI_EINT input status:1
<3>[    6.466131] .(1)[410:wmt_loader][WMT-DETECT][I]wmt_detect_ext_chip_detect:external combo chip detected
<6>[    6.480863] .(2)[229:kworker/2:2][msdc]msdc2 -> !!! Set<400KHz> Source<185999KHz> -> sclk<397KHz> timing<0> mode<0> div<117> hs400_div_dis<0>
<6>[    6.498561] .(3)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: ICHG = 500mA, AICR = 500mA, MIVR = 4400mV, IEOC = 250mA, CV = 4350mV
<6>[    6.498997] .(2)[229:kworker/2:2][msdc]msdc2 -> !!! Set<200000KHz> Source<185999KHz> -> sclk<185999KHz> timing<6> mode<1> div<0> hs400_div_dis<0>
<6>[    6.500027] .(2)[229:kworker/2:2][AUTOK]SDIO SDR104 Tune
<6>[    6.500031] .(2)[229:kworker/2:2]DVFS ready
<5>[    6.500037] .(2)[229:kworker/2:2][VcoreFS] [AUTOK] kicker: KIR_AUTOK_SDIO, opp: 0, dvfs_opp: 0, sw_opp: 3
<5>[    6.500052] .(2)[229:kworker/2:2][VcoreFS] opp: 0, vcore: 793750 <= 725000, fddr: 1866000 <= 1200000 [O][O]
<5>[    6.500073] -(2)[229:kworker/2:2][VcoreFS] [spm_trigger_dvfs] fix: 1, opp: 0, vcore: 0x110000, emi: 0x200000, md: 0x0
<6>[    6.503489] .(2)[229:kworker/2:2][AUTOK]CMD 0 	 64 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
<6>[    6.505805] .(2)[229:kworker/2:2][AUTOK]CMD 1 	 41 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXOOOOOOOOOOOOOOOOOOOOOO
<6>[    6.505821] .(2)[229:kworker/2:2][AUTOK]Warning: 1T > 84
<6>[    6.505824] .(2)[229:kworker/2:2][AUTOK]Analysis Result: 1T = 84
<6>[    6.508920] .(2)[229:kworker/2:2][AUTOK]DAT 0 	 54 	 OOOOOXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
<6>[    6.511951] .(2)[229:kworker/2:2][AUTOK]DAT 1 	 38 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXOOOOOOOOOOOOOOOOOOOO
<6>[    6.511956] .(2)[229:kworker/2:2][AUTOK]Analysis Result: 1T = 66
<6>[    6.511974] .(2)[229:kworker/2:2][AUTOK]CMD [EDGE:0 CMD_FIFO_EDGE:0 DLY1:31 DLY2:9]
<6>[    6.511977] .(2)[229:kworker/2:2][AUTOK]DAT [RDAT_EDGE:0 RD_FIFO_EDGE:1 WD_FIFO_EDGE:1]
<6>[    6.511979] .(2)[229:kworker/2:2][AUTOK]DAT [LATCH_CK:0 DLY1:7 DLY2:0]
<6>[    6.511982] .(2)[229:kworker/2:2][AUTOK]DS  [DLY1:0 DLY2:0 DLY3:0]
<6>[    6.511985] .(2)[229:kworker/2:2][AUTOK]CLK TX  [0]
<6>[    6.511987] .(2)[229:kworker/2:2][AUTOK]CMD TX  [0]
<6>[    6.511989] .(2)[229:kworker/2:2][AUTOK]DAT TX  [D0:0 D1:0 D2:0 D3:0]
<6>[    6.511995] .(2)[229:kworker/2:2][AUTOK]======Cost:11 ms======
<5>[    6.512001] .(2)[229:kworker/2:2][VcoreFS] [AUTOK] kicker: KIR_AUTOK_SDIO, opp: 1, dvfs_opp: 1, sw_opp: 0
<5>[    6.512013] .(2)[229:kworker/2:2][VcoreFS] opp: 1, vcore: 793750 <= 793750, fddr: 1600000 <= 1866000 [O][O]
<5>[    6.512030] -(2)[229:kworker/2:2][VcoreFS] [spm_trigger_dvfs] fix: 1, opp: 1, vcore: 0x110000, emi: 0x100000, md: 0x0
<6>[    6.512075] .(2)[229:kworker/2:2]skip duplicated vcore autok
<5>[    6.512078] .(2)[229:kworker/2:2][VcoreFS] [AUTOK] kicker: KIR_AUTOK_SDIO, opp: 2, dvfs_opp: 2, sw_opp: 1
<5>[    6.512088] .(2)[229:kworker/2:2][VcoreFS] opp: 2, vcore: 725000 <= 793750, fddr: 1600000 <= 1600000 [O][O]
<5>[    6.512103] -(2)[229:kworker/2:2][VcoreFS] [spm_trigger_dvfs] fix: 1, opp: 2, vcore: 0x10000, emi: 0x100000, md: 0x0
<6>[    6.515341] .(2)[229:kworker/2:2][AUTOK]CMD 0 	 56 	 OOOOXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXX
<6>[    6.517616] .(2)[229:kworker/2:2][AUTOK]CMD 1 	 33 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
<6>[    6.517626] .(2)[229:kworker/2:2][AUTOK]Analysis Result: 1T = 58
<6>[    6.520531] .(2)[229:kworker/2:2][AUTOK]DAT 0 	 52 	 OXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXX
<6>[    6.523675] .(2)[229:kworker/2:2][AUTOK]DAT 1 	 31 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOO
<6>[    6.523685] .(2)[229:kworker/2:2][AUTOK]Analysis Result: 1T = 58
<6>[    6.523705] .(2)[229:kworker/2:2][AUTOK]CMD [EDGE:1 CMD_FIFO_EDGE:0 DLY1:4 DLY2:0]
<6>[    6.523709] .(2)[229:kworker/2:2][AUTOK]DAT [RDAT_EDGE:0 RD_FIFO_EDGE:1 WD_FIFO_EDGE:1]
<6>[    6.523712] .(2)[229:kworker/2:2][AUTOK]DAT [LATCH_CK:0 DLY1:3 DLY2:0]
<6>[    6.523714] .(2)[229:kworker/2:2][AUTOK]DS  [DLY1:0 DLY2:0 DLY3:0]
<6>[    6.523717] .(2)[229:kworker/2:2][AUTOK]CLK TX  [0]
<6>[    6.523718] .(2)[229:kworker/2:2][AUTOK]CMD TX  [0]
<6>[    6.523720] .(2)[229:kworker/2:2][AUTOK]DAT TX  [D0:0 D1:0 D2:0 D3:0]
<6>[    6.523727] .(2)[229:kworker/2:2][AUTOK]======Cost:11 ms======
<5>[    6.523733] .(2)[229:kworker/2:2][VcoreFS] [AUTOK] kicker: KIR_AUTOK_SDIO, opp: 3, dvfs_opp: 3, sw_opp: 2
<5>[    6.523751] .(2)[229:kworker/2:2][VcoreFS] opp: 3, vcore: 725000 <= 725000, fddr: 1200000 <= 1600000 [O][O]
<5>[    6.523769] -(2)[229:kworker/2:2][VcoreFS] [spm_trigger_dvfs] fix: 1, opp: 3, vcore: 0x10000, emi: 0x0, md: 0x0
<6>[    6.523815] .(2)[229:kworker/2:2]skip duplicated vcore autok
<6>[    6.523821] .(2)[229:kworker/2:2][AUTOK]CMD 0 	 56 	 OOOOXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXX merge
<6>[    6.523827] .(2)[229:kworker/2:2][AUTOK]CMD 1 	 33 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXOOOOOOXOOOOOOOOOOOOOOOOOOOOOO merge
<6>[    6.523830] .(2)[229:kworker/2:2][AUTOK]cmd edge = 0 cmd dly = 33 max win = 55
<6>[    6.523837] .(2)[229:kworker/2:2][AUTOK]DAT 0 	 49 	 OXXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXX merge
<6>[    6.523841] .(2)[229:kworker/2:2][AUTOK]DAT 1 	 31 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXOOXXXXXXOOOOOOOOOOOOOOOOOOOO merge
<6>[    6.523845] .(2)[229:kworker/2:2][AUTOK]dat edge = 0 dat dly = 34 max win = 48
<6>[    6.523852] .(2)[229:kworker/2:2][AUTOK][merge]======Time Cost:0 ms======
<6>[    6.523855] .(2)[229:kworker/2:2][AUTOK]merge_window = 55
<6>[    6.523857] .(2)[229:kworker/2:2][AUTOK]merge_window = 48
<6>[    6.523871] .(2)[229:kworker/2:2][AUTOK]No need change para when dvfs
<5>[    6.523879] .(2)[229:kworker/2:2][VcoreFS] kicker: KIR_AUTOK_SDIO, opp: -1, dvfs_opp: 3, sw_opp: 3, kr opp: -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
<5>[    6.523883] .(2)[229:kworker/2:2][VcoreFS] [AUTOK] kicker: KIR_SYSFS, opp: 3, dvfs_opp: 3, sw_opp: 3
<5>[    6.523891] .(2)[229:kworker/2:2][VcoreFS] opp: 3, vcore: 725000 <= 725000, fddr: 1200000 <= 1200000 [O][O]
<5>[    6.523905] -(2)[229:kworker/2:2][VcoreFS] [spm_trigger_dvfs] fix: 0, opp: 3, vcore: 0x10000, emi: 0x90299, md: 0x0
<5>[    6.523912] .(2)[229:kworker/2:2][VcoreFS] [spm_msdc_dvfs_setting] MSDC AUTOK FINISH
<4>[    6.523915] .(2)[229:kworker/2:2][MMDVFS][pid=229]mmdvfs service has been enabled
<4>[    6.523919] .(2)[229:kworker/2:2][pid=229]mmdvfs_notify_prepare_action: 1
<6>[    6.524388] .(2)[229:kworker/2:2]mmc2: new ultra high speed SDR104 SDIO card at address 0001
<3>[    6.524942] .(2)[229:kworker/2:2][SDIO-DETECT][I]sdio_detect_probe:vendor(0x37a) device(0x6630) num(0x1)
<3>[    6.524950] .(2)[229:kworker/2:2][SDIO-DETECT][I]hif_sdio_match_chipid_by_dev_id:valid chipId found, index(4), vendor id(0x37a), device id(0x6630), chip id(0x6630)
<4>[    6.524954] .(2)[229:kworker/2:2]set current consys chipid (0x6630)
<3>[    6.524956] .(2)[229:kworker/2:2][SDIO-DETECT][I]sdio_detect_probe:autok function detected, func:0xffffffc04fcedc00
<3>[    6.525112] .(2)[229:kworker/2:2][SDIO-DETECT][I]sdio_detect_probe:vendor(0x37a) device(0x6630) num(0x2)
<3>[    6.525117] .(2)[229:kworker/2:2][SDIO-DETECT][I]hif_sdio_match_chipid_by_dev_id:valid chipId found, index(4), vendor id(0x37a), device id(0x6630), chip id(0x6630)
<4>[    6.525121] .(2)[229:kworker/2:2]set current consys chipid (0x6630)
<4>[    6.559224] .(2)[0:swapper/2]Power/swap DP: No enter --- SODI3: No enter --- SODI: No enter --- 
<4>[    6.559247] .(2)[0:swapper/2]mcdi cpu: 0, 0, 0, 0, 0, 0, 0, 0, cluster : 0, 0, pause = 0, multi core = 0, residency = 0, last core = 0, avail cpu = 00ff, cluster = 0003, enabled = 1, max_s_state = 5 (buck_off = 0), system_idle_hint = 00000000
<4>[    6.559247] 
<6>[    6.570581] .(2)[68:kworker/u16:1][msdc]msdc1 power on
<6>[    6.584338] .(6)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: VSYS = 4305mV, VBAT = 4305mV, IBAT = 0mA, IBUS = 400mA, VBUS = 4975mV
<6>[    6.586321] .(6)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: CHG_EN = 1, CHG_STATUS = progress, CHG_STAT = 0xA0
<6>[    6.588044] .(6)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: CHG_CTRL1 = 0x10, CHG_CTRL2 = 0x1B
<6>[    6.596895] .(6)[68:kworker/u16:1][msdc]msdc1 -> !!! Set<260KHz> Source<185999KHz> -> sclk<259KHz> timing<0> mode<0> div<179> hs400_div_dis<0>
<6>[    6.599698] .(6)[68:kworker/u16:1][msdc]msdc1 -> !!! Set<400KHz> Source<185999KHz> -> sclk<397KHz> timing<0> mode<0> div<117> hs400_div_dis<0>
<4>[    6.617046] -(7)[68:kworker/u16:1]------------[ cut here ]------------
<4>[    6.617899] -(7)[68:kworker/u16:1]WARNING: CPU: 7 PID: 68 at /data/jenkins/workspace/dl35_oreo/kernel-4.4/kernel/irq/manage.c:513 __enable_irq+0x44/0x80()
<4>[    6.619662] -(7)[68:kworker/u16:1]Unbalanced enable for IRQ 675
<4>[    6.620433] -(7)[68:kworker/u16:1]Modules linked in: wmt_drv ffffff8000c33000           (null) 1162215 0 (O) fpsgo ffffff8000c2f000           (null) 2624 0 (O)
<4>[    6.621973] -(7)[68:kworker/u16:1]CPU: 7 PID: 68 Comm: kworker/u16:1 Tainted: G        W  O    4.4.95+ #2
<4>[    6.623196] -(7)[68:kworker/u16:1]Hardware name: MT6763V/B (DT)
<4>[    6.623984] -(7)[68:kworker/u16:1]Workqueue: msdc-init msdc_add_host
<4>[    6.624523] -(7)[68:kworker/u16:1]Call trace:
<4>[    6.625096] -(7)[68:kworker/u16:1][<ffffff800808a298>] dump_backtrace+0x0/0x228
<4>[    6.626043] -(7)[68:kworker/u16:1][<ffffff800808a4d4>] show_stack+0x14/0x20
<4>[    6.626942] -(7)[68:kworker/u16:1][<ffffff8008360870>] dump_stack+0xa0/0xc0
<4>[    6.627841] -(7)[68:kworker/u16:1][<ffffff80080a1bc4>] warn_slowpath_common+0x9c/0xd8
<4>[    6.628850] -(7)[68:kworker/u16:1][<ffffff80080a1c5c>] warn_slowpath_fmt+0x5c/0x80
<4>[    6.629827] -(7)[68:kworker/u16:1][<ffffff800810c894>] __enable_irq+0x44/0x80
<4>[    6.630748] -(7)[68:kworker/u16:1][<ffffff800810c91c>] enable_irq+0x4c/0xa8
<4>[    6.631648] -(7)[68:kworker/u16:1][<ffffff800892f208>] mmc_gpiod_request_cd_irq+0x98/0xc0
<4>[    6.632701] -(7)[68:kworker/u16:1][<ffffff8008922fa4>] mmc_start_host+0x5c/0xb8
<4>[    6.633644] -(7)[68:kworker/u16:1][<ffffff8008924484>] mmc_add_host+0x64/0xc0
<4>[    6.634565] -(7)[68:kworker/u16:1][<ffffff800893c1e0>] msdc_add_host+0x20/0x48
<4>[    6.635498] -(7)[68:kworker/u16:1][<ffffff80080bda10>] process_one_work+0x1d0/0x468
<4>[    6.636485] -(7)[68:kworker/u16:1][<ffffff80080bddd8>] worker_thread+0x130/0x4e0
<4>[    6.637440] -(7)[68:kworker/u16:1][<ffffff80080c3fbc>] kthread+0xec/0x100
<4>[    6.638318] -(7)[68:kworker/u16:1][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    6.639253] -(7)[68:kworker/u16:1]---[ end trace 8cfa91f0817a7c76 ]---
<6>[    6.640250] .(7)[258:kworker/7:1][msdc]msdc1 -> Card insert<0> Block bad card<0>, mrq<          (null)> claimed<0> pwrcnt<0> <- msdc_ops_get_cd() : L<4522> PID<kworker/7:1><0x102>
<6>[    6.642472] .(7)[258:kworker/7:1][msdc]msdc1 power off
<3>[    6.668742] .(2)[410:wmt_loader][SDIO-DETECT][I]hif_sdio_is_chipid_valid:index:4, chipId:0x6630
<3>[    6.669889] .(2)[410:wmt_loader][SDIO-DETECT][I]hif_sdio_is_chipid_valid:index:4, chipId:0x6630
<3>[    6.671080] .(2)[410:wmt_loader][WMT-DETECT][I]wmt_detect_ext_chip_detect:valid external combo chip id (0x6630)
<3>[    6.672382] .(2)[410:wmt_loader][WMT-DETECT][I]wmt_detect_ext_chip_detect:--
<3>[    6.673546] .(2)[410:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:cmd (-2147191040),arg(0)
<4>[    6.674711] .(2)[410:wmt_loader]query current consys chipid (0x6630)
<14>[    6.677766] .(3)[1:init]init: PropSet [persist.mtk.wcn.combo.chipid]=[0x6630] Done
<3>[    6.680949] .(3)[410:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:cmd (-2147191032),arg(26160)
<3>[    6.682198] .(3)[410:wmt_loader][SDIO-DETECT][I]sdio_detect_do_autok:autok was move to sdio driver
<3>[    6.683479] .(3)[410:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:cmd (-2147191033),arg(4)
<3>[    6.684692] .(3)[410:wmt_loader][WMT-DETECT][I]wmt_detect_ext_chip_pwr_off:--
<4>[    6.685630] .(3)[410:wmt_loader]mtk_wcn_cmb_sdio_off (1)
<3>[    6.686506] .(3)[410:wmt_loader][SDIO-DETECT][I]sdio_detect_remove:do sdio remove
<3>[    6.687832] .(3)[410:wmt_loader][SDIO-DETECT][I]sdio_detect_remove:do sdio remove
<6>[    6.689051] .(3)[410:wmt_loader]mmc2: card 0001 removed
<6>[    6.701190] .(3)[410:wmt_loader][msdc]msdc2 -> MSDC Device Request Suspend
<3>[    6.701853] .(3)[410:wmt_loader][WMT-DETECT][I]_wmt_detect_output_low:WMT-DETECT: set GPIO89 to output 0
<3>[    6.703097] .(3)[410:wmt_loader][WMT-DETECT][I]_wmt_detect_output_low:WMT-DETECT: set GPIO90 to output 0
<3>[    6.704499] .(3)[410:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:cmd (1074034433),arg(26160)
<3>[    6.705785] .(3)[410:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:chipid(26160)
<4>[    6.706820] .(3)[410:wmt_loader]set current consys chipid (0x6630)
<3>[    6.707630] .(3)[410:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:cmd (-2147191035),arg(26160)
<3>[    6.708995] .(3)[410:wmt_loader][SDIO-DETECT][I]sdio_detect_exit:sdio_unregister_driver
<3>[    6.710040] .(3)[410:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:cmd (-2147191036),arg(26160)
<3>[    6.711213] .(3)[410:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:kernel object mode
<4>[    6.712291] .(3)[410:wmt_loader][HIF-SDIO][I]hif_sdio_init:start!
<4>[    6.713756] .(3)[410:wmt_loader][STPDbg]stp_dbg_init: stp-dbg init
<4>[    6.715553] .(3)[410:wmt_loader][STPDbg]stp_dbg_core_dump_init: create coredump object OK!
<4>[    6.716734] .(3)[410:wmt_loader][HIF-SDIO][I]WMT_init:driver(major 190) installed
<3>[    6.718248] .(0)[410:wmt_loader][HIF-SDIO][E]wmt_lib_init(282):no pwr on seq and clk par found
<6>[    6.719412] .(0)[410:wmt_loader][I]wmt_export_platform_bridge_register:
<4>[    6.720272] .(0)[410:wmt_loader][WMT-CMB-HW][I]mtk_wcn_cmb_hw_dmp_seq:combo chip power on sequence time, RTC (100), LDO (100), RST(30), OFF(10), ON(30)
<3>[    6.722089] .(0)[410:wmt_loader][CONN-MD-DFT][W]conn_md_add_user:uid (0x80000003) is added to user list successfully
<4>[    6.722092] .(3)[476:mtk_wmtd][HIF-SDIO][I]wmtd_thread:wmtd thread starts
<3>[    6.724583] .(0)[410:wmt_loader][WMT-DETECT][I]wmt_detect_close:close major 154 minor 0 (pid 410)
<14>[    6.727005] .(3)[1:init]init: PropSet [service.wcn.driver.ready]=[yes] Done
<14>[    6.729847] .(3)[1:init]init: processing action (service.wcn.driver.ready=yes) from (/vendor/etc/init/init.bt_drv.rc:2)
<6>[    6.733932] .(0)[1:init][MTK-BT] BT_init: mtk_stp_bt_chrdev driver(major 192) installed
<14>[    6.735750] .(0)[1:init]init: Service 'wmt_loader' (pid 410) exited with status 0
<14>[    6.737427] .(0)[1:init]init: processing action (service.wcn.driver.ready=yes) from (/vendor/etc/init/init.gps_drv.rc:3)
<4>[    6.741666] .(0)[1:init]mtk_stp_GPS_chrdev driver(major 191) installed.
<14>[    6.742854] .(0)[1:init]init: PropSet [gps_drv.ko]=[1] Done
<14>[    6.743738] .(0)[1:init]init: processing action (service.wcn.driver.ready=yes) from (/vendor/etc/init/init.wlan_drv.rc:3)
<6>[    6.747652] .(0)[1:init][MTK-WIFI] WIFI_init: mtk_wmt_wifi_chrdev driver(major 153) installed
<4>[    6.768440] .(1)[411:wmt_launcher][HIF-SDIO][I]WMT_open:major 190 minor 0 (pid 411)
<4>[    6.769575] .(1)[411:wmt_launcher][HIF-SDIO][I]WMT_open:1st call
<4>[    6.770711] .(1)[411:wmt_launcher][WMT-PLAT][I]wmt_plat_merge_if_flag_ctrl:set gWmtMergeIfSupport to 1
<3>[    6.773835] .(2)[411:wmt_launcher][WMT-CONF][E]wmt_conf_set_cfg_file(445):WMT config file is set to (mt6630_ant_m1.cfg)
<4>[    6.775289] .(2)[411:wmt_launcher][HIF-SDIO][I]WMT_unlocked_ioctl:luncher set STP mode success!
<4>[    6.775315] .(1)[476:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000cdd260):0-1-1,0,0,2
<3>[    6.775325] .(1)[476:mtk_wmtd][WMT-CORE][E]opfunc_hif_conf(1042):WMT-CORE: WMT HIF info added
<4>[    6.778607] .(2)[411:wmt_launcher][STP] mtk_wcn_stp_set_wmt_last_close:[I] set wmt_last_close flag (0)
<6>[    6.814366] -(7)[1:init]configfs-gadget gadget: high-speed config #1: b
<5>[    6.815277] -(7)[1:init][MUSB]fifo_setup 1238: musb type=BULK
<5>[    6.816025] -(7)[1:init][MUSB]check_musb_dbuffer_avail 1196: <check_musb_dbuffer_avail, 1196>, got bulk ep:81 in function :mtp
<5>[    6.817475] -(7)[1:init][MUSB]is_saving_mode 1012: 0
<5>[    6.818125] -(7)[1:init][MUSB]fifo_setup 1267: EP1 supports DBBUF
<5>[    6.818917] -(7)[1:init][MUSB]fifo_setup 1279: fifo size is 22 after 512, fifo address is 512, epnum 1,hwepnum 1
<5>[    6.820228] -(7)[1:init]QMU_WARN,<mtk_qmu_enable 636>, enable TQ(1)
<5>[    6.820238] -(7)[1:init][MUSB]musb_gadget_enable 1477: musb-hdrc periph: enabled ep1in for bulk IN, maxpacket 512
<6>[    6.820245] .(1)[389:composer@2.1-se]mtk-tpd: tpd_fb_notifier_callback
<5>[    6.820251] -(7)[1:init][MUSB]fifo_setup 1238: musb type=BULK
<5>[    6.820258] -(7)[1:init][MUSB]check_musb_dbuffer_avail 1196: <check_musb_dbuffer_avail, 1196>, got bulk ep:1 in function :mtp
<5>[    6.820261] -(7)[1:init][MUSB]is_saving_mode 1012: 0
<5>[    6.820263] -(7)[1:init][MUSB]fifo_setup 1267: EP1 supports DBBUF
<5>[    6.820265] -(7)[1:init][MUSB]fifo_setup 1279: fifo size is 22 after 512, fifo address is 1536, epnum 1,hwepnum 1
<5>[    6.820269] -(7)[1:init]QMU_WARN,<mtk_qmu_enable 567>, enable RQ(1)
<5>[    6.820275] -(7)[1:init][MUSB]musb_gadget_enable 1477: musb-hdrc periph: enabled ep1out for bulk OUT, maxpacket 512
<5>[    6.820280] -(7)[1:init][MUSB]fifo_setup 1238: musb type=INT
<5>[    6.820282] -(7)[1:init][MUSB]fifo_setup 1279: fifo size is 6 after 512, fifo address is 2560, epnum 2,hwepnum 2
<5>[    6.820285] -(7)[1:init]QMU_WARN,<mtk_qmu_enable 636>, enable TQ(2)
<5>[    6.820292] -(7)[1:init][MUSB]musb_gadget_enable 1477: musb-hdrc periph: enabled ep2in for int IN, maxpacket 28
<6>[    6.820299] -(7)[1:init]configfs-gadget gadget: [COM]USB_REQ_SET_CONFIGURATION: value=0
<5>[    6.820311] .(1)[389:composer@2.1-se][Power/PPM] @ppm_lcmoff_switch: onoff = 1
<5>[    6.820314] -(7)[1:init][BATTERY] BAT_SetUSBState Success! Set 2
<6>[    6.820318] .(1)[389:composer@2.1-se]#@# cm_mgr_fb_notifier_callback(176) SCREEN ON
<6>[    6.820322] .(1)[389:composer@2.1-se]mtk-tpd: tpd_fb_notifier_callback
<6>[    6.820324] .(1)[389:composer@2.1-se]mtk-tpd: fb_notify(blank=0)
<6>[    6.820343] .(1)[389:composer@2.1-se]mtk-tpd: LCD ON Notify
<4>[    6.820348] .(1)[389:composer@2.1-se][HIF-SDIO][W]wmt_fb_notifier_callback:@@@@@@@@@@wmt enter UNBLANK @@@@@@@@@@@@@@
<5>[    6.820415] .(7)[258:kworker/7:1][MUSB]usb_cable_connected 747: usb_cable_connected vbus_exist=1 type=2
<5>[    6.820423] .(7)[258:kworker/7:1][MUSB]usb_cable_connected 768: usb_cable_connected, connected:1, cable_mode:1, usb_data_lock:0
<6>[    6.820527] .(7)[258:kworker/7:1]android_work: sent uevent USB_STATE=CONFIGURED
<3>[    6.820532] .(7)[258:kworker/7:1]BOOTPROF:      6820.531708:USB configured
<6>[    6.845271] .(7)[1:init][wlan]Reset ALL DBG module log level to DEFAULT!
<6>[    6.845264] .(7)[1:init][wlan]createWirelessDevice:(INIT INFO) Create wireless device success
<6>[    6.845381] .(7)[1:init][wlan]glRegisterBus:(INIT INFO) mtk_sdio: MediaTek SDIO WLAN driver
<6>[    6.845384] .(7)[1:init][wlan]glRegisterBus:(INIT INFO) mtk_sdio: Copyright MediaTek Inc.
<14>[    6.845526] .(7)[1:init]init: Command 'insmod /vendor/lib/modules/wlan_drv_${ro.wlan.gen}.ko' action=service.wcn.driver.ready=yes (/vendor/etc/init/init.wlan_drv.rc:5) returned 0 took 96ms.
<14>[    6.846156] .(7)[1:init]init: PropSet [service.wcn.formeta.ready]=[yes] Done
<14>[    6.846224] .(7)[1:init]init: processing action (persist.mtk.wcn.coredump.mode=* && service.wcn.driver.ready=yes) from (/vendor/etc/init/init_connectivity.rc:26)
<4>[    6.846356] .(7)[1:init][WMT-DEV][I]wmt_dbg_write:write parameter len = 6
<4>[    6.846356] 
<4>[    6.846361] .(7)[1:init][WMT-DEV][I]wmt_dbg_write:write parameter data = 0x15 0
<4>[    6.846361] 
<4>[    6.846364] .(7)[1:init][WMT-DEV][I]wmt_dbg_write:y = 0x00000000
<4>[    6.846364] 
<4>[    6.846368] .(7)[1:init][WMT-DEV][I]wmt_dbg_write:x(0x00000015), y(0x00000000), z(0x0000000a)
<4>[    6.846368] 
<4>[    6.846367] .(7)[1:init][STP] mtk_wcn_stp_coredump_flag_ctrl:[I] disable coredump function.
<14>[    6.846791] .(7)[1:init]init: PropSet [service.sf.present_timestamp]=[1] Done
<14>[    6.851762] .(7)[1:init]init: PropSet [service.bootanim.exit]=[0] Done
<14>[    6.853455] .(7)[1:init]init: [PropSet]: pid:401 uid:1000 gid:1003 ctl.start, bootanim
<14>[    6.853858] .(7)[1:init]init: starting service 'bootanim'...
<3>[    6.855282] .(2)[482:SurfaceFlinger:]BOOTPROF:      6855.280323:BOOT_Animation:START
<4>[    6.866146] .(1)[70:kworker/1:1][HIF-SDIO][I]mtk_wcn_wmt_func_ctrl:wmt-exp: OPID(3) type(9) start
<4>[    6.867407] .(1)[70:kworker/1:1][STP] mtk_wcn_stp_psm_disable:[W] STP Not Ready, Dont do Sleep/Wakeup
<4>[    6.868695] .(0)[476:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000cdd398):3-0-9,0,0,0
<4>[    6.869759] .(0)[476:mtk_wmtd]query current consys chipid (0x6630)
<5>[    6.972665] .(0)[476:mtk_wmtd]mtk_rtc_common: rtc_gpio_enable_32k, user = 9
<5>[    6.973719] -(0)[476:mtk_wmtd]mtk_rtc_hal: RTC_GPIO user 9 enable = 1 32k (0x200), RTC_CON = 487
<4>[    7.076640] .(1)[476:mtk_wmtd][WMT-CMB-HW][I]mtk_wcn_cmb_hw_pwr_on:CMB-HW, rtc clock exported
<3>[    7.092699] .(6)[427:vold]BOOTPROF:      7092.697324:vold:scrypt_keymaster:END
<3>[    7.093770] .(6)[427:vold]BOOTPROF:      7093.770631:vold:decrypt_master_key:END
<6>[    7.095972] .(6)[427:vold][dm-crypt] dev path: /dev/block/platform/bootdevice/by-name/userdata, type: 0
<6>[    7.097218] .(6)[427:vold][dm-crypt] dev path: /dev/block/platform/bootdevice/by-name/userdata, type: 0
<4>[    7.165991] .(1)[476:mtk_wmtd]mtk_wcn_cmb_sdio_off (2)
<6>[    7.166723] .(1)[476:mtk_wmtd][msdc]msdc2 -> MSDC Device Request Suspend
<4>[    7.167332] .(1)[476:mtk_wmtd]mtk_wcn_cmb_sdio_on (2)
<6>[    7.192787] .(1)[476:mtk_wmtd][msdc]msdc2 -> !!! Set<400KHz> Source<185999KHz> -> sclk<397KHz> timing<0> mode<0> div<117> hs400_div_dis<0>
<5>[    7.209138] .(1)[486:kworker/1:2][msdc][msdc_command_resp_polling]: msdc2 CMD<52> MSDC_INT_CMDTMO Arg<0x00000c00>
<5>[    7.210974] .(1)[486:kworker/1:2][msdc][msdc_command_resp_polling]: msdc2 CMD<52> MSDC_INT_CMDTMO Arg<0x80000c08>
<6>[    7.212740] .(1)[486:kworker/1:2][msdc]msdc2 -> MSDC Device Request Resume
<5>[    7.216240] .(1)[486:kworker/1:2][msdc][msdc_command_resp_polling]: msdc2 CMD<8> MSDC_INT_CMDTMO Arg<0x000001aa>
<6>[    7.219552] .(1)[486:kworker/1:2][msdc]msdc2: card is busy!
<6>[    7.244777] .(1)[486:kworker/1:2][msdc]msdc2 -> !!! Set<400KHz> Source<185999KHz> -> sclk<397KHz> timing<0> mode<0> div<117> hs400_div_dis<0>
<6>[    7.262858] .(1)[486:kworker/1:2][msdc]msdc2 -> !!! Set<200000KHz> Source<185999KHz> -> sclk<185999KHz> timing<6> mode<1> div<0> hs400_div_dis<0>
<6>[    7.265538] .(1)[486:kworker/1:2][AUTOK]SDIO SDR104 Tune
<6>[    7.267268] .(1)[486:kworker/1:2][AUTOK]Apply first tune para (vcore = 4) without HW DVFS
<6>[    7.268753] .(1)[486:kworker/1:2]mmc2: new ultra high speed SDR104 SDIO card at address 0001
<4>[    7.270276] .(1)[486:kworker/1:2][HIF-SDIO][I]hif_sdio_probe:vendor(0x37a) device(0x6630) num(0x1)
<4>[    7.271656] .(1)[486:kworker/1:2][HIF-SDIO][I]hif_sdio_probe:vendor(0x37a) device(0x6630) num(0x2)
<4>[    7.356645] .(0)[495:stp_sdio_tx_rx][TKCORE] -11e5-b8-6d-9a-79-f0-6e-94-78
<4>[    7.356645] [   18.787255]: <4>DBG TKCore:tee_ta_open_session:1988: [TA 02662e8e: 0] init session
<4>[    7.356645] [   19.445715]: <4>INF KEYMASTER:TA_InvokeCommandEntryPoint:1363: TA_InvokeCommandEntryPoint nCommandID 0x10 pSessionContext 0x0 nParamType[TKCORE] s 0x653
<4>[    7.356645] [   19.484247]: <4>INF KEYMASTER:TA_InvokeCommandEntryPoint:1369: begin
<4>[    7.356645] [   19.509874]: <4>INF KEYMASTER:TA_InvokeCommandEntryPoint:1363: TA_InvokeCommandEntryPoint nCommandID 0x11 pSessionContext 0x0 nParamTypes 0x653
<4>[    7.356645] [   19.511583]: <4>INF KEYMA[TKCORE] STER:TA_InvokeCommandEntryPoint:1370: update
<4>[    7.356645] [   19.513085]: <4>INF KEYMASTER:TA_InvokeCommandEntryPoint:1363: TA_InvokeCommandEntryPoint nCommandID 0x11 pSessionContext 0x0 nParamTypes 0x653
<4>[    7.356645] [   19.540077]: <4>INF KEYMASTER:TA_InvokeCommandEntryPoint:137
<3>[    7.369071] .(0)[495:stp_sdio_tx_rx][STP SDIO][I]stp_sdio_tx_rx_handling:stp_tx_rx_thread start running...
<4>[    7.373539] .(2)[476:mtk_wmtd][WMT-CORE][I]wmt_core_hw_check:get hwcode (chip id) (0x6630)
<4>[    7.381117] .(2)[476:mtk_wmtd][WMT-IC][I]mt6630_ver_check:MT6630: read (hw version)(0x8a12), (fw version version)(0x8a11)
<4>[    7.382526] .(2)[476:mtk_wmtd][WMT-IC][W]mt6630_find_wmt_ic_info:find no ic info for (0x8a12) by full match!try major num match!
<4>[    7.383992] .(2)[476:mtk_wmtd][WMT-IC][I]mt6630_find_wmt_ic_info:MT6630: found ic info for hw_ver(0x8a12) by major num! index:3
<4>[    7.385475] .(2)[476:mtk_wmtd][WMT-IC][I]mt6630_ver_check:MT6630: wmt ic info: MT6630.E4 (0x8b11, WMTHWVER:3, patch_ext:_e2)
<14>[    7.389407] .(4)[1:init]init: PropSet [persist.mtk.wcn.patch.version]=[20181019b001011] Done
<14>[    7.392359] .(4)[1:init]init: PropSet [persist.mtk.wcn.patch.version]=[20181019b001011] Done
<4>[    7.393777] .(1)[476:mtk_wmtd][WMT-IC][I]mt6630_sw_init:patch total num = [2]
<4>[    7.394711] .(1)[476:mtk_wmtd][WMT-IC][I]mt6630_patch_dwn:the 1 time valid patch found: (mt6630_patch_e3_0_hdr.bin)
<4>[    7.397004] .(1)[476:mtk_wmtd][WMT-IC][I]mt6630_patch_dwn:Combo Patch:Build Time(20181019b001011)Hw(0x8a11) Sw(0x8a11) Ph(0x0008)Platform(1649)
<4>[    7.401923] .(6)[427:vold][WMT-IC][I]mt6630_patch_dwn:4 bytes address command:0x00,0x00,0x08,0x00
<3>[    7.514400] .(6)[427:vold]BOOTPROF:      7514.399402:vold:cryptfs_restart_internal:START
<4>[    7.518499] .(6)[427:vold]EXT4-fs (dm-2): Ignoring removed nomblk_io_submit option
<6>[    7.524286] .(6)[427:vold]EXT4-fs (dm-2): mounted filesystem with ordered data mode. Opts: errors=remount-ro,nomblk_io_submit
<14>[    7.579169] .(0)[427:vold]e2fsck: e2fsck 1.43.3 (04-Sep-2016)
<14>[    7.579169] 
<14>[    7.580178] .(0)[427:vold]e2fsck: data: clean, 5015/1605632 files, 622836/6419451 blocks (check in 4 mounts)
<14>[    7.580178] 
<6>[    7.587149] .(2)[427:vold]EXT4-fs (dm-2): mounted filesystem with ordered data mode. Opts: noauto_da_alloc,errors=panic
<14>[    7.589576] .(0)[1:init]init: PropSet [vold.post_fs_data_done]=[0] Done
<14>[    7.592200] .(0)[1:init]init: PropSet [vold.decrypt]=[trigger_post_fs_data] Done
<14>[    7.594624] .(0)[1:init]init: processing action (vold.decrypt=trigger_post_fs_data) from (/init.rc:727)
<14>[    7.595899] .(0)[1:init]init: processing action (vold.decrypt=trigger_post_fs_data) from (/vendor/etc/init/hw/init.mt6763.rc:910)
<3>[    7.597469] .(0)[1:init]BOOTPROF:      7597.467709:INIT:vold.decrypt=trigger_post_fs_data
<14>[    7.598612] .(0)[1:init]init: processing action (post-fs-data) from (/init.rc:420)
<14>[    7.716988] .(6)[1:init]init: starting service 'exec 5 (/system/bin/vdc --wait cryptfs init_user0)'...
<14>[    7.719321] .(6)[1:init]init: SVC_EXEC pid 504 (uid 0 gid 0+0 context default) started; waiting...
<14>[    7.737052] .(6)[1:init]init: Service 'exec 5 (/system/bin/vdc --wait cryptfs init_user0)' (pid 504) exited with status 0 waiting took 0.020000 seconds
<14>[    7.739853] .(0)[1:init]selinux: SELinux: Skipping restorecon_recursive(/data)
<14>[    7.739853] 
<14>[    7.741731] .(0)[1:init]init: starting service 'exec 6 (/system/bin/tzdatacheck /system/usr/share/zoneinfo /data/misc/zoneinfo)'...
<14>[    7.744339] .(0)[1:init]init: SVC_EXEC pid 505 (uid 1000 gid 1000+0 context default) started; waiting...
<14>[    7.760454] .(0)[1:init]init: Service 'exec 6 (/system/bin/tzdatacheck /system/usr/share/zoneinfo /data/misc/zoneinfo)' (pid 505) exited with status 0 waiting took 0.019000 seconds
<14>[    7.762897] .(0)[1:init]init: processing action (post-fs-data) from (/init.usb.rc:6)
<4>[    7.762952] .(2)[476:mtk_wmtd][WMT-IC][I]mt6630_patch_dwn:wmt_core: patch dwn:0 frag(50, 96) ok
<4>[    7.767848] .(6)[476:mtk_wmtd][WMT-IC][I]mt6630_patch_dwn:the 2 time valid patch found: (mt6630_patch_e3_1_hdr.bin)
<14>[    7.768877] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.mt6763.rc:157)
<3>[    7.768979] .(5)[1:init]BOOTPROF:      7768.976094:INIT:post-fs-data
<11>[    7.769371] .(5)[1:init]init: Unable to open '/sys/block/sdc/queue/iostats': No such file or directory
<11>[    7.769396] .(5)[1:init]init: Unable to open '/sys/block/sdc/queue/read_ahead_kb': No such file or directory
<11>[    7.769420] .(5)[1:init]init: Unable to open '/sys/block/sdc/queue/nr_requests': No such file or directory
<14>[    7.769776] .(5)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/nvcfg)
<14>[    7.769776] 
<14>[    7.773273] .(0)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/nvdata)
<14>[    7.773273] 
<4>[    7.783496] .(4)[1:init][WMT-IC][I]mt6630_patch_dwn:4 bytes address command:0x00,0x00,0x08,0x00
<14>[    7.809011] .(4)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.connectivity.rc:3)
<14>[    7.815940] .(4)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.project.rc:15)
<14>[    7.818858] .(4)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.aee.rc:1)
<14>[    7.827849] .(4)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.sensor_1_0.rc:2)
<14>[    7.832482] .(4)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.modem.rc:19)
<3>[    7.833901] .(4)[1:init]BOOTPROF:      7833.900248:post-fs-data: on modem start
<14>[    7.834926] .(4)[1:init]init: PropSet [vold.post_fs_data_done]=[1] Done
<14>[    7.835989] .(4)[1:init]init: PropSet [vold.decrypt]=[trigger_load_persist_props] Done
<14>[    7.837121] .(4)[1:init]init: processing action (post-fs-data) from (/system/etc/init/bootstat.rc:3)
<14>[    7.839737] .(4)[1:init]init: PropSet [vold.decrypt]=[trigger_restart_framework] Done
<14>[    7.842101] .(4)[1:init]init: processing action (init.svc.bootanim=running && ro.crypto.type=block && post-fs-data) from (/system/etc/init/bootstat.rc:44)
<14>[    7.844574] .(4)[1:init]init: starting service 'exec 7 (/system/bin/bootstat -r post_decrypt_time_elapsed)'...
<14>[    7.847042] .(4)[1:init]init: SVC_EXEC pid 518 (uid 1000 gid 1007+0 context default) started; waiting...
<14>[    7.867250] .(4)[1:init]init: Service 'exec 7 (/system/bin/bootstat -r post_decrypt_time_elapsed)' (pid 518) exited with status 0 waiting took 0.023000 seconds
<5>[    7.869119] -(4)[1:init]random: nonblocking pool is initialized
<14>[    7.870176] .(4)[1:init]init: processing action (post-fs-data) from (/system/etc/init/mobile_log_d.rc:1)
<14>[    7.873380] .(4)[1:init]init: processing action (post-fs-data) from (/system/etc/init/sn.rc:1)
<14>[    7.874749] .(4)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/android.hardware.audio@2.0-service-mediatek.rc:1)
<14>[    7.876805] .(4)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hostapd.android.rc:9)
<14>[    7.878426] .(4)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/init.cccifsd.rc:5)
<14>[    7.879760] .(4)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/protect_f)
<14>[    7.879760] 
<14>[    7.881138] .(4)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/protect_s)
<14>[    7.881138] 
<14>[    7.882464] .(4)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/init.cccimdinit.rc:4)
<14>[    7.886797] .(4)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/init.wod.rc:1)
<14>[    7.891303] .(4)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/mtk_agpsd.rc:1)
<14>[    7.893624] .(4)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/statusd.rc:1)
<14>[    7.895888] .(4)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/trustkernel.rc:7)
<3>[    7.897155] .(4)[1:init]BOOTPROF:      7897.154479:tkcore: prep SFS
<3>[    7.903091] .(4)[1:init]BOOTPROF:      7903.089941:tkcore: prep PP
<3>[    7.904232] .(4)[1:init]BOOTPROF:      7904.232249:tkcore: prep SPTA
<14>[    7.906492] .(4)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/vendor.mediatek.hardware.power@1.1-service.rc:1)
<14>[    7.913554] .(4)[1:init]init: processing action (vold.decrypt=trigger_load_persist_props) from (/init.rc:722)
<14>[    7.930822] .(4)[1:init]init: PropSet [persist.atm.mdmode]=[normal] Done
<14>[    7.935229] .(4)[1:init]init: PropSet [persist.sys.pq.mdp.color.idx]=[0] Done
<14>[    7.939039] .(4)[1:init]init: PropSet [persist.sys.pq.adl.idx]=[0] Done
<14>[    7.943226] .(4)[1:init]init: PropSet [persist.sys.pq.iso.shp.en]=[2] Done
<14>[    7.947336] .(4)[1:init]init: PropSet [persist.sys.pq.ultrares.en]=[2] Done
<14>[    7.951425] .(4)[1:init]init: PropSet [persist.sys.pq.mdp.color.dbg]=[1] Done
<14>[    7.956083] .(4)[1:init]init: PropSet [persist.sys.pq.log.en]=[0] Done
<14>[    7.960668] .(4)[1:init]init: PropSet [persist.sys.pq.hdr.en]=[1] Done
<14>[    7.964968] .(4)[1:init]init: PropSet [persist.sys.pq.mdp.ccorr.en]=[2] Done
<14>[    7.969302] .(4)[1:init]init: PropSet [persist.sys.pq.mdp.dre.en]=[2] Done
<14>[    7.973873] .(5)[1:init]init: PropSet [persist.sys.bluelight.default]=[128] Done
<14>[    7.978836] .(5)[1:init]init: PropSet [persist.sys.pq.shp.idx]=[2] Done
<14>[    7.983566] .(5)[1:init]init: PropSet [persist.radio.sim.opid]=[0] Done
<14>[    7.988220] .(5)[1:init]init: PropSet [persist.radio.simswitch]=[1] Done
<14>[    8.000756] .(5)[1:init]init: PropSet [persist.radio.lastsim1_iccid]=[null] Done
<14>[    8.005830] .(5)[1:init]init: PropSet [persist.radio.c_capability_slot]=[1] Done
<14>[    8.010265] .(5)[1:init]init: PropSet [persist.radio.raf1]=[94714] Done
<14>[    8.015017] .(1)[1:init]init: PropSet [persist.radio.last_iccid_sim1]=[N/A] Done
<14>[    8.019791] .(4)[1:init]init: PropSet [persist.radio.rilj_nw_type1]=[-1] Done
<14>[    8.024498] .(1)[1:init]init: PropSet [persist.sys.dalvik.vm.lib.2]=[libart.so] Done
<14>[    8.029511] .(4)[1:init]init: PropSet [persist.sys.usb.config]=[adb] Done
<14>[    8.034447] .(0)[1:init]init: PropSet [persist.sys.webview.vmsize]=[125701040] Done
<14>[    8.048514] .(3)[1:init]init: PropSet [persist.radio.airplane.mode.on]=[false] Done
<14>[    8.053828] .(3)[1:init]init: PropSet [persist.radio.cellular_ps_reg]=[0] Done
<14>[    8.058195] .(3)[1:init]init: PropSet [persist.radio.volte_state]=[1] Done
<14>[    8.062523] .(3)[1:init]init: PropSet [persist.radio.sim.mode]=[1] Done
<14>[    8.066722] .(3)[1:init]init: PropSet [persist.radio.data.iccid]=[89860119933700000608] Done
<14>[    8.072215] .(3)[1:init]init: PropSet [persist.sys.mtk.disable.moms]=[0] Done
<14>[    8.076303] .(3)[1:init]init: PropSet [persist.service.stk.shutdown]=[0] Done
<14>[    8.090138] .(3)[1:init]init: PropSet [persist.mtk.wcn.patch.version]=[20181019b001011] Done
<14>[    8.099739] .(3)[1:init]init: PropSet [persist.dlwifi.wifi_band_selection]=[2] Done
<14>[    8.104860] .(3)[1:init]init: PropSet [persist.netd.stable_secret]=[5afd:1aff:dea:7718:933c:b393:876:5bb8] Done
<14>[    8.110294] .(0)[1:init]init: PropSet [persist.radio.airplane_mode_on]=[0] Done
<14>[    8.114934] .(0)[1:init]init: PropSet [persist.sys.nlp.enabled]=[0] Done
<14>[    8.119299] .(0)[1:init]init: PropSet [persist.radio.simswitchstate]=[0] Done
<14>[    8.132358] .(2)[1:init]init: PropSet [persist.radio.unlock]=[false] Done
<14>[    8.136120] .(2)[1:init]init: PropSet [persist.radio.sim.status]=[] Done
<14>[    8.140578] .(0)[1:init]init: PropSet [persist.radio.cfu.iccid.0]=[89860119933700000608] Done
<14>[    8.145390] .(1)[1:init]init: PropSet [persist.radio.cfu.change.0]=[1] Done
<14>[    8.149984] .(0)[1:init]init: PropSet [persist.radio.terminal-based.cw]=[disabled_tbcw] Done
<14>[    8.154221] .(0)[1:init]init: PropSet [persist.radio.cfu.timeslot.0]=[] Done
<14>[    8.158567] .(1)[1:init]init: PropSet [persist.radio.cfu.mode]=[disabled_cfu_mode] Done
<14>[    8.163741] .(2)[1:init]init: PropSet [persist.radio.cfu_over_ims]=[0] Done
<14>[    8.167607] .(2)[1:init]init: PropSet [persist.radio.new.sim.slot]=[] Done
<14>[    8.171908] .(0)[1:init]init: PropSet [persist.radio.simswitch.iccid]=[89860119933700000608] Done
<14>[    8.175969] .(0)[1:init]init: PropSet [persist.sys.gps.lpp]=[] Done
<14>[    8.179887] .(0)[1:init]init: PropSet [persist.mtk.volte.enable]=[1] Done
<14>[    8.184681] .(0)[1:init]init: PropSet [persist.mtk.wfc.enable]=[0] Done
<14>[    8.189369] .(0)[1:init]init: PropSet [persist.mtk.vilte.enable]=[0] Done
<14>[    8.193900] .(1)[1:init]init: PropSet [persist.mtk.viwifi.enable]=[0] Done
<14>[    8.198112] .(2)[1:init]init: PropSet [persist.sys.locale]=[zh-Hans-CN] Done
<14>[    8.203484] .(2)[1:init]init: PropSet [persist.dlwifi.periodic_scan_interval_ms]=[1000] Done
<14>[    8.215984] .(1)[1:init]init: PropSet [persist.dlwifi.max_periodic_scan_interval_ms]=[16000] Done
<14>[    8.220766] .(1)[1:init]init: PropSet [persist.dlwifi.cpsinterval_ms]=[2000] Done
<14>[    8.225099] .(3)[1:init]init: PropSet [persist.dlwifi.mcpsinterval_ms]=[16000] Done
<14>[    8.229778] .(0)[1:init]init: PropSet [persist.dlwifi.disconnected_pno_scan_interval_ms]=[2000] Done
<14>[    8.234321] .(0)[1:init]init: PropSet [persist.dlwifi.connected_pno_scan_interval_ms]=[16000] Done
<14>[    8.240182] .(0)[1:init]init: PropSet [persist.dlwifi.low_rssi_network_retry_start_delay_ms]=[2000] Done
<14>[    8.245014] .(0)[1:init]init: PropSet [persist.dlwifi.low_rssi_network_retry_max_delay_ms]=[8000] Done
<14>[    8.258507] .(2)[1:init]init: PropSet [persist.mtklog.log2sd.path]=[internal_sd] Done
<11>[    8.259699] .(2)[1:init]init: property_set("ro.persistent_properties.ready", "true") failed: property already set
<14>[    8.261096] .(2)[1:init]init: Command 'load_persist_props' action=vold.decrypt=trigger_load_persist_props (/init.rc:723) returned 0 took 346ms.
<14>[    8.263472] .(2)[1:init]init: starting service 'logd-reinit'...
<14>[    8.265736] .(2)[1:init]init: processing action (vold.decrypt=trigger_load_persist_props) from (/vendor/etc/init/hw/init.aee.rc:18)
<4>[    8.265850] .(3)[476:mtk_wmtd][WMT-IC][I]mt6630_patch_dwn:wmt_core: patch dwn:0 frag(66, 328) ok
<14>[    8.268503] .(2)[1:init]init: Sending signal 9 to service 'aee_aedv' (pid 363) process group...
<4>[    8.273795] .(0)[476:mtk_wmtd][WMT-IC][I]wmt_stp_init_coex:ctrl GET_WMT_CONF ok(0xffffff8000cdc978)
<14>[    8.275421] .(2)[1:init]init: Successfully killed process cgroup uid 0 pid 363 in 5ms
<14>[    8.276858] .(2)[1:init]init: Service 'aee_aedv' (pid 363) killed by signal 9
<14>[    8.278338] .(2)[1:init]init: Sending signal 9 to service 'aee_aedv64' (pid 364) process group...
<4>[    8.285210] .(0)[476:mtk_wmtd][WMT-IC][I]mt6630_sw_init:set fm mode (2) ok
<14>[    8.285302] .(2)[1:init]init: Successfully killed process cgroup uid 0 pid 364 in 5ms
<30>[    8.285554] .(4)[353:logd.daemon]logd.daemon: reinit
<14>[    8.285630] .(2)[1:init]init: Service 'aee_aedv64' (pid 364) killed by signal 9
<14>[    8.285945] .(2)[1:init]init: Sending signal 9 to service 'aee_aed' (pid 360) process group...
<4>[    8.289965] .(0)[476:mtk_wmtd][WMT-IC][I]mt6630_sw_init:disable mt662x firmware coredump
<4>[    8.291021] .(0)[476:mtk_wmtd][WMT-IC][I]wmt_stp_wifi_lte_coex:ctrl GET_WMT_CONF ok(0xffffff8000cdc978)
<14>[    8.291532] .(1)[1:init]init: Successfully killed process cgroup uid 0 pid 360 in 5ms
<14>[    8.291823] .(1)[1:init]init: Service 'aee_aed' (pid 360) killed by signal 9
<14>[    8.292154] .(1)[1:init]init: Service 'logd-reinit' (pid 522) exited with status 0
<14>[    8.292311] .(1)[1:init]init: Sending signal 9 to service 'aee_aed64' (pid 361) process group...
<14>[    8.297902] .(3)[1:init]init: Successfully killed process cgroup uid 0 pid 361 in 5ms
<14>[    8.299460] .(3)[1:init]init: PropSet [log.tag]=[I] Done
<31>[    8.300254] .(0)[353:logd.daemon]logd: logd no log reader, set log level to INFO!
<14>[    8.301739] .(3)[1:init]init: processing action (vold.decrypt=trigger_restart_framework) from (/init.rc:735)
<11>[    8.303050] .(3)[1:init]init: ExecStart(update_verifier): Service not found
<14>[    8.304093] .(3)[1:init]init: Service 'aee_aed64' (pid 361) killed by signal 9
<14>[    8.306218] .(3)[1:init]init: starting service 'flash_recovery'...
<11>[    8.308469] .(3)[1:init]init: cannot find '/system/bin/cmmbsp', disabling 'cmmb': No such file or directory
<14>[    8.310795] .(3)[1:init]init: starting service 'mnld'...
<14>[    8.314376] .(3)[1:init]init: starting service 'zygote'...
<14>[    8.314628] .(1)[524:init]init: Created socket '/dev/socket/mnld', mode 660, user 1021, group 1000
<4>[    8.317410] .(2)[476:mtk_wmtd][WMT-IC][I]wmt_stp_wifi_lte_coex:wmt_core:set_wifi_lte_coex_table_0 ok
<14>[    8.317919] .(3)[1:init]init: starting service 'zygote_secondary'...
<14>[    8.319200] .(1)[525:init]init: Created socket '/dev/socket/zygote', mode 660, user 0, group 1000
<14>[    8.319912] .(3)[1:init]init: starting service 'aal'...
<4>[    8.321662] .(2)[476:mtk_wmtd][STP] mtk_wcn_stp_psm_enable:[W] STP Not Ready, Dont do Sleep/Wakeup
<14>[    8.322161] .(3)[1:init]init: starting service 'audioserver'...
<14>[    8.324735] .(3)[1:init]init: starting service 'batterywarning'...
<4>[    8.324795] .(2)[476:mtk_wmtd][WMT-CORE][I]wmt_core_dump_func_state:[AF FUNC ON]status(b:0 f:0 g:0 w:0 lpbk:2 coredump:0 wmt:2 ant:0 sd1:0 sd2:2 stp:0)
<4>[    8.324933] .(2)[473:mtk_stp_psm][STP-PSM] [I]_stp_psm_proc: pOp(ffffff8000cda400):1
<4>[    8.324935] .(1)[70:kworker/1:1][HIF-SDIO][I]mtk_wcn_wmt_func_ctrl:OPID(3) type(9) ok
<14>[    8.332495] .(3)[1:init]init: starting service 'cameraserver'...
<11>[    8.334577] .(0)[531:init]init: couldn't write 531 to /dev/cpuset/camera-daemon/tasks: No such file or directory
<14>[    8.336285] .(3)[1:init]init: starting service 'drm'...
<14>[    8.338234] .(1)[526:init]init: Created socket '/dev/socket/zygote_secondary', mode 660, user 0, group 1000
<14>[    8.340060] .(3)[1:init]init: starting service 'thermald'...
<14>[    8.344128] .(3)[1:init]init: starting service 'vtservice'...
<14>[    8.347974] .(3)[1:init]init: starting service 'installd'...
<14>[    8.351740] .(3)[1:init]init: starting service 'keystore'...
<4>[    8.353272] .(1)[473:mtk_stp_psm][STP-PSM] [I]_stp_psm_proc: pOp(ffffff8000cda538):0
<14>[    8.355247] .(3)[1:init]init: starting service 'mediadrm'...
<14>[    8.358856] .(6)[1:init]init: starting service 'mediaextractor'...
<14>[    8.362417] .(6)[1:init]init: starting service 'mediametrics'...
<14>[    8.365785] .(6)[1:init]init: starting service 'media'...
<14>[    8.369571] .(6)[1:init]init: starting service 'met_log_d'...
<14>[    8.372227] .(6)[1:init]init: starting service 'mobile_log_d'...
<14>[    8.375653] .(6)[1:init]init: starting service 'mtk_advcamserver'...
<14>[    8.378824] .(6)[1:init]init: starting service 'netd'...
<14>[    8.382078] .(6)[1:init]init: starting service 'netdiag'...
<14>[    8.382339] .(0)[544:init]init: Created socket '/dev/socket/netd', mode 660, user 0, group 1000
<14>[    8.383201] .(0)[544:init]init: Created socket '/dev/socket/dnsproxyd', mode 660, user 0, group 3003
<14>[    8.384219] .(0)[544:init]init: Created socket '/dev/socket/mdns', mode 660, user 0, group 1000
<14>[    8.385642] .(0)[544:init]init: Created socket '/dev/socket/fwmarkd', mode 660, user 0, group 3003
<14>[    8.389999] .(6)[1:init]init: starting service 'PPLAgent'...
<14>[    8.393200] .(6)[1:init]init: starting service 'storaged'...
<14>[    8.396419] .(6)[1:init]init: starting service 'wificond'...
<14>[    8.399792] .(6)[1:init]init: starting service 'mediacodec'...
<14>[    8.403335] .(6)[1:init]init: starting service 'sensors-hal-1-0'...
<14>[    8.406770] .(6)[1:init]init: starting service 'camerahalserver'...
<14>[    8.410118] .(6)[1:init]init: starting service 'fuelgauged_nvram'...
<11>[    8.410548] .(7)[551:init]init: couldn't write 551 to /dev/cpuset/camera-daemon/tasks: No such file or directory
<14>[    8.415621] .(6)[1:init]init: starting service 'thermal'...
<14>[    8.419208] .(6)[1:init]init: starting service 'thermal_manager'...
<14>[    8.423986] .(6)[1:init]init: starting service 'thermalloadalgod'...
<14>[    8.428120] .(6)[1:init]init: starting service 'ipsec_mon'...
<14>[    8.439446] .(6)[1:init]init: starting service 'lbs_hidl_service'...
<14>[    8.443943] .(6)[1:init]init: starting service 'agpsd'...
<14>[    8.447527] .(6)[1:init]init: starting service 'NvRAMAgent'...
<14>[    8.450865] .(6)[1:init]init: starting service 'nvram_daemon'...
<14>[    8.455380] .(5)[561:init]init: Created socket '/dev/socket/agpsd', mode 660, user 1021, group 1000
<14>[    8.458124] .(6)[1:init]init: starting service 'sysenv_daemon'...
<14>[    8.461912] .(6)[1:init]init: starting service 'gnss_service'...
<14>[    8.462219] .(5)[561:init]init: Created socket '/dev/socket/agpsd2', mode 660, user 1021, group 3003
<14>[    8.466218] .(6)[1:init]init: starting service 'pq-2-0'...
<14>[    8.466232] .(5)[561:init]init: Created socket '/dev/socket/agpsd3', mode 660, user 1021, group 3003
<14>[    8.474544] .(6)[1:init]init: starting service 'wifi2agps'...
<14>[    8.480126] .(6)[1:init]init: Command 'class_start main' action=vold.decrypt=trigger_restart_framework (/init.rc:738) returned 0 took 174ms.
<11>[    8.480785] .(7)[552:fuelgauged_nvra]NVRAM: fgauge_nvram: service.nvram_init=
<14>[    8.483830] .(6)[1:init]init: PropSet [debug.met.running]=[0] Done
<11>[    8.485026] .(6)[1:init]init: cannot find '/vendor/bin/STFlashTool', disabling 'stflashtool': No such file or directory
<14>[    8.492401] .(6)[1:init]init: starting service 'gatekeeperd'...
<14>[    8.495981] .(6)[1:init]init: starting service 'program_binary'...
<6>[    8.500112] .(0)[545:netdiag]capability: warning: `netdiag' uses 32-bit capabilities (legacy support in use)
<14>[    8.500472] .(6)[1:init]init: starting service 'sn'...
<14>[    8.510748] .(6)[1:init]init: starting service 'tombstoned'...
<14>[    8.513977] .(6)[1:init]init: starting service 'netdagent'...
<14>[    8.514552] .(7)[574:init]init: Created socket '/dev/socket/tombstoned_crash', mode 666, user 1000, group 1000
<14>[    8.515460] .(7)[574:init]init: Created socket '/dev/socket/tombstoned_intercept', mode 666, user 1000, group 1000
<14>[    8.516829] .(7)[574:init]init: Created socket '/dev/socket/tombstoned_java_trace', mode 666, user 1000, group 1000
<14>[    8.524351] .(6)[1:init]init: PropSet [debug.met_log_d.version]=[V6.0.0] Done
<14>[    8.530729] .(3)[1:init]init: processing action (vold.decrypt=trigger_restart_framework) from (/vendor/etc/init/hw/init.mt6763.rc:919)
<3>[    8.532480] .(6)[1:init]BOOTPROF:      8532.478558:INIT:vold.decrypt=trigger_restart_framework
<14>[    8.534466] .(6)[1:init]init: PropSet [debug.mtklog.netlog.Running]=[0] Done
<14>[    8.535779] .(6)[1:init]init: PropSet [debug.met_log_d.user]=[shell] Done
<11>[    8.536851] .(6)[1:init]init: do_start: Service msensord not found
<11>[    8.537753] .(6)[1:init]init: do_start: Service permission_check not found
<14>[    8.538727] .(6)[1:init]init: processing action (vold.decrypt=trigger_restart_framework) from (/vendor/etc/init/md_ctrl.rc:7)
<14>[    8.541595] .(6)[1:init]init: starting service 'start_modem'...
<14>[    8.544250] .(6)[1:init]init: processing action (vold.decrypt=trigger_restart_framework) from (/vendor/etc/init/sysenv_daemon.rc:4)
<14>[    8.599159] .(0)[547:init]init: Opened file '/d/mmc0/mmc0:0001/ext_csd', flags 0
<5>[    8.610697] .(6)[555:thermal_manager][Thermal/TZ/BTS] mtkts_bts_prepare_table table_num=7
<5>[    8.611948] .(6)[555:thermal_manager][Thermal/TZ/BTSMDPA] mtkts_btsmdpa_prepare_table table_num=7
<4>[    8.613425] .(6)[555:thermal_manager][Thermal/TZ/CPU]tscpu_write_atm_setting input 0 2000 10 15 1 685 0 280 0
<4>[    8.615811] .(6)[555:thermal_manager][Thermal/TZ/CPU]tscpu_write_dtm_setting applied 0 2000 10 15 1 685 1582 332 576
<3>[    8.621647] .(5)[564:sysenv_daemon]ENV_USER_INIT!
<4>[    8.621810] .(6)[555:thermal_manager][Thermal/TZ/CPU]tscpu_write_atm_setting input 1 1000 10 15 1 400 0 220 0
<4>[    8.621818] .(6)[555:thermal_manager][Thermal/TZ/CPU]tscpu_write_dtm_setting applied 1 1000 10 15 1 400 1582 332 576
<4>[    8.621961] .(6)[555:thermal_manager][Thermal/TZ/CPU]tscpu_write_ctm input 2 85000 59000 43000 46000 75000 52000 457636 8666 404682 7667 500 500 13500 -1
<4>[    8.622756] .(6)[555:thermal_manager][Thermal/TZ/CPU]tscpu_unbind unbinding OK
<4>[    8.622823] .(6)[555:thermal_manager][Thermal/TZ/CPU]tscpu_unbind unbinding OK
<4>[    8.622835] .(6)[555:thermal_manager][Thermal/TZ/CPU]tscpu_unbind unbinding OK
<4>[    8.622849] .(6)[555:thermal_manager][Thermal/TZ/CPU]tscpu_unbind unbinding OK
<4>[    8.623268] .(6)[555:thermal_manager][Thermal/TZ/CPU]tscpu_bind binding OK, 0
<4>[    8.623328] .(6)[555:thermal_manager][Thermal/TZ/CPU]tscpu_bind binding OK, 2
<4>[    8.623347] .(6)[555:thermal_manager][Thermal/TZ/CPU]tscpu_bind binding OK, 1
<4>[    8.632678] -(6)[555:thermal_manager]mt6356_get_auxadc_value: 29 callbacks suppressed
<4>[    8.636057] .(5)[555:thermal_manager]=====FG===== AC   = -75
<4>[    8.640639] .(5)[555:thermal_manager][STP-PSM] [I]_stp_psm_do_wait: STP is waiting state for ACT, i=1, state = 2
<4>[    8.640657] .(1)[473:mtk_stp_psm][STP-PSM] [I]_stp_psm_proc: pOp(ffffff8000cda670):1
<4>[    8.672720] .(7)[555:thermal_manager][STP-PSM] [I]_stp_psm_do_wait: +Total waits for ACT takes 32083 usec
<4>[    8.674080] .(0)[476:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000cdd4d0):15-0-1,0,0,0
<4>[    8.679235] .(1)[476:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000cdd608):15-0-2,0,0,0
<4>[    8.685081] .(2)[476:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000cdd740):15-0-3,0,0,0
<3>[    8.687189] .(5)[564:sysenv_daemon]ENV_USER_INIT!
<4>[    8.690564] .(7)[555:thermal_manager][HIF-SDIO][I]wmt_dev_tm_temp_query:[Thermal] current_temp = 0x18
<4>[    8.692744] .(7)[555:thermal_manager]=====   BTS BB Mainboard output output mV = 377
<4>[    8.693907] .(7)[555:thermal_manager]======  BTS BB Mainboard output temperature = 24
<4>[    8.695054] .(7)[555:thermal_manager][Thermal/TC/bcct]chrlmt_set_limit ffffff8009a77350 -1 -1 5000
<4>[    8.695097] .(1)[187:kworker/u17:1][Thermal/TC/bcct]chrlmt_set_limit_handler -1 -1
<5>[    8.695109] .(1)[187:kworker/u17:1]charger_manager_set_input_current_limit: dev:mtk-cooler-bcct idx:0 en:-1
<4>[    8.696369] .(0)[187:kworker/u17:1]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    8.696393] .(0)[187:kworker/u17:1]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    8.696400] .(0)[187:kworker/u17:1]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    8.696703] .(1)[187:kworker/u17:1][mtk_switch_charging_multi_power_supply_check]hall_1_eint_occur=0 mtk_charger_hall_1_eint=0
<4>[    8.697274] .(1)[187:kworker/u17:1]temp_now=223, temp_last=223 
<4>[    8.697281] .(1)[187:kworker/u17:1]=====FG===== TEMP = 223
<3>[    8.697524] .(6)[561:mtk_agpsd]Dump cpuinfo
<4>[    8.698584] .(2)[187:kworker/u17:1]=====FG===== VOLT = 4316
<4>[    8.698596] .(2)[187:kworker/u17:1]=====FG===== actural VOLT = 4325
<4>[    8.699164] .(2)[187:kworker/u17:1]=====FG===== AC   = -75
<4>[    8.700135] .(2)[187:kworker/u17:1]=====FG===== SOC  = 100
<4>[    8.700705] .(1)[187:kworker/u17:1]=====FG===== SOH  = 100
<4>[    8.700712] .(1)[187:kworker/u17:1]DLCP bat_vol=4325,  temperature=223  
<4>[    8.700716] .(1)[187:kworker/u17:1] ===CC_value from battery temprature=2000000
<4>[    8.700723] .(1)[187:kworker/u17:1]DLCP __mt6370_set_ieoc      = 150000
<4>[    8.701007] .(2)[187:kworker/u17:1]DLCP mt6370_set_vrech       = 300
<4>[    8.703163] .(2)[187:kworker/u17:1]DLCP mt6370_get_vrech       = 300
<4>[    8.703176] .(2)[187:kworker/u17:1]DLCP read cv              = 4350000
<4>[    8.703179] .(2)[187:kworker/u17:1]DLCP read eoc             = 250000
<4>[    8.703182] .(2)[187:kworker/u17:1]DLCP read recharge        = 300
<4>[    8.703185] .(2)[187:kworker/u17:1]DLCP Target Temp          = 410
<4>[    8.703187] .(2)[187:kworker/u17:1]DLCP Charge Current       = 2000
<4>[    8.703190] .(2)[187:kworker/u17:1]DLPID 
<4>[    8.703191] .(2)[187:kworker/u17:1]DLPID +++++++++++++++++ PID Start +++++++++++++++++++++ 
<4>[    8.703194] .(2)[187:kworker/u17:1]DLPID PID Target Temp = 410 
<4>[    8.703196] .(2)[187:kworker/u17:1]DLPID Battery Temp    = 223 
<4>[    8.703198] .(2)[187:kworker/u17:1]DLPID TEMP DIFF       = 163 
<4>[    8.703201] .(2)[187:kworker/u17:1]DLPID PID KI          = 5000 
<4>[    8.703203] .(2)[187:kworker/u17:1]DLPID CC MAX          = 2000000 
<4>[    8.703205] .(2)[187:kworker/u17:1]DLPID PID Current     = 2000000 
<4>[    8.703207] .(2)[187:kworker/u17:1]DLCP ccurrent from charge type        = 500000
<4>[    8.703209] .(2)[187:kworker/u17:1]DLCP ccurrent from battery temprature = 2000000
<4>[    8.703212] .(2)[187:kworker/u17:1]DLCP ccurrent from PID algorithm      = 2000000
<4>[    8.703214] .(2)[187:kworker/u17:1]DLCP ccurrent from DLPL               = 2000000
<4>[    8.703218] .(2)[187:kworker/u17:1]DLCP set input current:500000 
<4>[    8.703402] .(2)[187:kworker/u17:1]DLCP set charge current: 500000 
<4>[    8.704325] .(2)[187:kworker/u17:1]DLCP mt6370_enable_charging :1 
<5>[    8.704522] .(2)[187:kworker/u17:1]charger_manager_set_charging_current_limit: dev:mtk-cooler-bcct idx:0 en:-1
<5>[    8.704545] .(6)[266:charger_thread][charger_routine_thread]flags=0,1 
<4>[    8.704575] .(6)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    8.704709] .(2)[187:kworker/u17:1]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    8.704719] .(2)[187:kworker/u17:1]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    8.704727] .(2)[187:kworker/u17:1]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    8.705214] .(2)[187:kworker/u17:1][mtk_switch_charging_multi_power_supply_check]hall_1_eint_occur=0 mtk_charger_hall_1_eint=0
<4>[    8.705907] .(3)[187:kworker/u17:1]temp_now=223, temp_last=223 
<4>[    8.705918] .(3)[187:kworker/u17:1]=====FG===== TEMP = 223
<4>[    8.706992] .(3)[187:kworker/u17:1]=====FG===== VOLT = 4316
<4>[    8.707001] .(3)[187:kworker/u17:1]=====FG===== actural VOLT = 4325
<4>[    8.708036] .(2)[187:kworker/u17:1]=====FG===== AC   = -75
<36>[    8.708370] .(4)[362:logd.auditd]type=1400 audit(1578635487.617:29): avc: denied { write } for pid=365 comm="teed" name="/" dev="tmpfs" ino=10342 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0 duplicate messages suppressed
<36>[    8.708384] .(4)[362:logd.auditd]type=1400 audit(1578635490.469:30): avc: denied { read } for pid=547 comm="storaged" path="/sys/kernel/debug/mmc0/mmc0:0001/ext_csd" dev="debugfs" ino=97 scontext=u:r:storaged:s0 tcontext=u:object_r:debugfs_mmc:s0 tclass=file permissive=0
<4>[    8.708682] .(3)[187:kworker/u17:1]=====FG===== SOC  = 100
<4>[    8.709303] .(3)[187:kworker/u17:1]=====FG===== SOH  = 100
<4>[    8.709312] .(3)[187:kworker/u17:1]DLCP bat_vol=4325,  temperature=223  
<4>[    8.709316] .(3)[187:kworker/u17:1] ===CC_value from battery temprature=2000000
<4>[    8.709322] .(3)[187:kworker/u17:1]DLCP __mt6370_set_ieoc      = 150000
<4>[    8.709808] .(3)[187:kworker/u17:1]DLCP mt6370_set_vrech       = 300
<4>[    8.710226] .(3)[187:kworker/u17:1]DLCP mt6370_get_vrech       = 300
<4>[    8.710232] .(3)[187:kworker/u17:1]DLCP read cv              = 4350000
<4>[    8.710235] .(3)[187:kworker/u17:1]DLCP read eoc             = 250000
<4>[    8.710237] .(3)[187:kworker/u17:1]DLCP read recharge        = 300
<4>[    8.710240] .(3)[187:kworker/u17:1]DLCP Target Temp          = 410
<4>[    8.710242] .(3)[187:kworker/u17:1]DLCP Charge Current       = 2000
<4>[    8.710245] .(3)[187:kworker/u17:1]DLPID 
<4>[    8.710247] .(3)[187:kworker/u17:1]DLPID +++++++++++++++++ PID Start +++++++++++++++++++++ 
<4>[    8.710249] .(3)[187:kworker/u17:1]DLPID PID Target Temp = 410 
<4>[    8.710251] .(3)[187:kworker/u17:1]DLPID Battery Temp    = 223 
<4>[    8.710253] .(3)[187:kworker/u17:1]DLPID TEMP DIFF       = 175 
<4>[    8.710255] .(3)[187:kworker/u17:1]DLPID PID KI          = 5000 
<4>[    8.710257] .(3)[187:kworker/u17:1]DLPID CC MAX          = 2000000 
<4>[    8.710259] .(3)[187:kworker/u17:1]DLPID PID Current     = 2000000 
<4>[    8.710262] .(3)[187:kworker/u17:1]DLCP ccurrent from charge type        = 500000
<4>[    8.710264] .(3)[187:kworker/u17:1]DLCP ccurrent from battery temprature = 2000000
<4>[    8.710266] .(3)[187:kworker/u17:1]DLCP ccurrent from PID algorithm      = 2000000
<4>[    8.710269] .(3)[187:kworker/u17:1]DLCP ccurrent from DLPL               = 2000000
<4>[    8.710273] .(3)[187:kworker/u17:1]DLCP set input current:500000 
<4>[    8.710439] .(3)[187:kworker/u17:1]DLCP set charge current: 500000 
<4>[    8.710841] .(3)[187:kworker/u17:1]DLCP mt6370_enable_charging :1 
<6>[    8.711020] .(3)[187:kworker/u17:1][charger_manager_enable_high_voltage_charging] already set: 0 1
<4>[    8.716776] .(1)[473:mtk_stp_psm][STP-PSM] [I]_stp_psm_proc: pOp(ffffff8000cdb168):0
<6>[    8.746405] .(5)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_get_adc_vbus: VBUS = 4975mV
<4>[    8.746421] .(5)[266:charger_thread]sg_detect_typec_charge_ovp,1363,4975000,0 
<4>[    8.747198] .(5)[266:charger_thread]=====FG===== AC   = -75
<4>[    8.750187] .(5)[266:charger_thread]=====FG===== AC   = -75
<3>[    8.753696] .(1)[524:mnld]Dump cpuinfo
<3>[    8.791314] .(6)[550:android.hardwar]<ACCELEROMETER> acc_store_cali 480 : ACC DRIVER OLD ARCHITECTURE DON'T SUPPORT ACC COMMON VERSION FLUSH
<6>[    8.793717] .(6)[550:android.hardwar]<MAGNETIC> mag_store_cali: MAG DRIVER OLD ARCHITECTURE DON'T SUPPORT MAG COMMON VERSION FLUSH
<6>[    8.814400] .(6)[550:android.hardwar]<GYROSCOPE> GYRO DRIVER OLD ARCHITECTURE DON'T SUPPORT GYRO COMMON VERSION FLUSH
<4>[    8.816903] .(7)[555:thermal_manager]===== APtery output mV = 408
<4>[    8.817704] .(7)[555:thermal_manager]===== BTSMDPA output temperature = 22
<3>[    8.841383] .(3)[427:vold]BOOTPROF:      8841.381789:vold:cryptfs_restart_internal:END
<4>[    8.856720] .(7)[266:charger_thread]lifetime: data[0]=df 
<4>[    8.857446] .(7)[266:charger_thread]lifetime: data[1]=ff 
<4>[    8.858143] .(7)[266:charger_thread]lifetime: data[2]=40 
<4>[    8.858847] .(7)[266:charger_thread]lifetime: data[3]=11 
<4>[    8.859552] .(7)[266:charger_thread]lifetime: data[4]=45 
<4>[    8.860257] .(7)[266:charger_thread]lifetime: data[5]=a 
<4>[    8.868961] .(7)[266:charger_thread]lifetime: data[6]=fc 
<4>[    8.869705] .(7)[266:charger_thread]lifetime: data[7]=8 
<4>[    8.870394] .(7)[266:charger_thread]lifetime: data[8]=68 
<4>[    8.871097] .(7)[266:charger_thread]lifetime: data[9]=f7 
<4>[    8.871963] .(7)[266:charger_thread]lifetime: data[10]=18 
<6>[    8.874182] .(4)[591:mtk_agpsd][ccci1/chr]port ttyC2 open with flag 20802 by mtk_agpsd
<6>[    8.875383] .(4)[591:mtk_agpsd][ccci1/chr]write error done on ttyC2, l=16 r=-19
<4>[    8.884692] .(7)[266:charger_thread]lifetime: data[11]=0 
<4>[    8.887121] .(0)[266:charger_thread]=====FG-MTK===== bat_vol=4252
<4>[    8.895146] .(0)[266:charger_thread]=====FG===== AC   = -75
<5>[    8.896134] .(0)[266:charger_thread]Vbat=4252,Ibat=75,I=0,VChr=4730,T=24,Soc=100:100,CT:2:2 hv:1 pd:0:0
<5>[    8.900756] .(5)[266:charger_thread][mtk_is_charger_on]info->chr_type=2 
<4>[    8.909743] .(1)[266:charger_thread]temp_now=223, temp_last=223 
<4>[    8.910609] .(1)[266:charger_thread]=====FG===== TEMP = 223
<5>[    8.911331] .(1)[266:charger_thread]charger_check_status
<5>[    8.980657] .(0)[266:charger_thread][mtk_chg_check_vbus]charger_update_data(4730000 mV) 
<5>[    8.983399] .(2)[266:charger_thread][BATTERY] bat_auth 1 gpio53_state =1
<5>[    8.984310] .(2)[266:charger_thread]charger_check_status tmp:22 (jeita:0 sm:0 cv:0 en:0) (sm:1) charging:1 cmd_discharging:0 safety_timeout:0 vbusov_stat:0 can_charging:1, charging:1
<5>[    8.988135] .(2)[266:charger_thread]mtk_switch_charging_run [1 0], timer=0
<5>[    9.031704] .(3)[266:charger_thread]pe40_ready:0 hv:1 thermal:-1,-1 tmp:25,39,16 pps:0 en:0 ibus:0 80
<5>[    9.033053] .(3)[266:charger_thread]mtk_pe20_start_algorithm: stop, PE+20 is not connected
<5>[    9.034130] .(3)[266:charger_thread]mtk_pe_start_algorithm: stop, PE+ is not connected
<3>[    9.035041] .(7)[525:zygote64]BOOTPROF:      9035.040559:boot_progress_start
<5>[    9.038069] .(3)[266:charger_thread]mtk_pe_start_algorithm: vchr_org = 5000, vchr_after = 4730, delta = -270
<4>[    9.041727] .(3)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    9.043206] .(3)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    9.049271] .(3)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    9.050968] .(3)[266:charger_thread][mtk_switch_charging_multi_power_supply_check]hall_1_eint_occur=0 mtk_charger_hall_1_eint=0
<4>[    9.056813] .(3)[266:charger_thread]temp_now=223, temp_last=223 
<4>[    9.057680] .(3)[266:charger_thread]=====FG===== TEMP = 223
<4>[    9.059605] .(3)[266:charger_thread]=====FG===== VOLT = 4316
<4>[    9.064692] .(4)[266:charger_thread]=====FG===== actural VOLT = 4325
<4>[    9.066616] .(4)[266:charger_thread]=====FG===== AC   = -75
<4>[    9.067922] .(4)[266:charger_thread]=====FG===== SOC  = 100
<4>[    9.069341] .(3)[266:charger_thread]=====FG===== SOH  = 100
<4>[    9.070085] .(3)[266:charger_thread]DLCP bat_vol=4325,  temperature=223  
<4>[    9.070956] .(3)[266:charger_thread] ===CC_value from battery temprature=2000000
<4>[    9.071912] .(3)[266:charger_thread]DLCP __mt6370_set_ieoc      = 150000
<4>[    9.073199] .(7)[266:charger_thread]DLCP mt6370_set_vrech       = 300
<4>[    9.074511] .(7)[266:charger_thread]DLCP mt6370_get_vrech       = 300
<4>[    9.075366] .(7)[266:charger_thread]DLCP read cv              = 4350000
<4>[    9.076216] .(7)[266:charger_thread]DLCP read eoc             = 250000
<4>[    9.077125] .(7)[266:charger_thread]DLCP read recharge        = 300
<4>[    9.077952] .(7)[266:charger_thread]DLCP Target Temp          = 410
<4>[    9.078823] .(7)[266:charger_thread]DLCP Charge Current       = 2000
<4>[    9.079678] .(7)[266:charger_thread]DLPID 
<4>[    9.080228] .(7)[266:charger_thread]DLPID +++++++++++++++++ PID Start +++++++++++++++++++++ 
<4>[    9.088686] .(7)[266:charger_thread]DLPID PID Target Temp = 410 
<4>[    9.089501] .(7)[266:charger_thread]DLPID Battery Temp    = 223 
<4>[    9.090275] .(7)[266:charger_thread]DLPID TEMP DIFF       = 181 
<4>[    9.091055] .(7)[266:charger_thread]DLPID PID KI          = 5000 
<4>[    9.091847] .(7)[266:charger_thread]DLPID CC MAX          = 2000000 
<4>[    9.092717] .(7)[266:charger_thread]DLPID PID Current     = 2000000 
<4>[    9.100685] .(7)[266:charger_thread]DLCP ccurrent from charge type        = 500000
<4>[    9.101684] .(7)[266:charger_thread]DLCP ccurrent from battery temprature = 2000000
<4>[    9.102675] .(7)[266:charger_thread]DLCP ccurrent from PID algorithm      = 2000000
<4>[    9.103660] .(7)[266:charger_thread]DLCP ccurrent from DLPL               = 2000000
<4>[    9.104679] .(7)[266:charger_thread]DLCP set input current:500000 
<14>[    9.105072] .(4)[1:init]init: PropSet [debug.MB.running]=[0] Done
<14>[    9.107223] .(4)[1:init]init: Service 'flash_recovery' (pid 523) exited with status 0
<4>[    9.109142] .(7)[266:charger_thread]DLCP set charge current: 500000 
<14>[    9.110186] .(7)[1:init]init: Service 'thermal_manager' (pid 555) exited with status 0
<14>[    9.115734] .(7)[1:init]init: PropSet [net.ims.ipsec.version]=[2.0] Done
<14>[    9.119668] .(7)[1:init]init: PropSet [vold.encryption.type]=[default] Done
<14>[    9.124578] .(7)[1:init]init: [PropSet]: pid:548 uid:1010 gid:1010 ctl.stop, wpa_supplicant
<4>[    9.128908] .(7)[266:charger_thread]DLCP mt6370_enable_charging :1 
<14>[    9.131063] .(7)[1:init]init: PropSet [service.nvram_init]=[Ready] Done
<4>[    9.136844] .(4)[266:charger_thread]DLCP charger_dev_set_constant_voltage       = 4350000
<4>[    9.137928] .(4)[266:charger_thread]DLCP __mt6370_set_cv       = 4350000
<14>[    9.140256] .(7)[1:init]init: PropSet [debug.pq.shp.en]=[2] Done
<14>[    9.143049] .(7)[1:init]init: PropSet [debug.MB.realpath]=[/data/log_temp/boot/] Done
<14>[    9.146034] .(7)[1:init]init: [PropSet]: pid:548 uid:1010 gid:1010 ctl.stop, hostapd
<4>[    9.148670] .(4)[266:charger_thread]DLCP mt6370_enable_charging :1 
<14>[    9.150245] .(7)[1:init]init: PropSet [debug.pq.dshp.en]=[2] Done
<14>[    9.154296] .(7)[1:init]init: PropSet [ftrace.buffer.log]=[bsp] Done
<14>[    9.156567] .(7)[1:init]init: processing action (ftrace.buffer.log=bsp) from (/system/etc/init/mobile_log_d.rc:24)
<3>[    9.157365] .(4)[532:drmserver]Dump cpuinfo
<14>[    9.165577] .(7)[1:init]init: starting service 'bsplogstart'...
<14>[    9.210840] .(4)[1:init]init: PropSet [persist.sys.pq.mdp.color.idx]=[0] Done
<14>[    9.241208] .(1)[1:init]init: PropSet [persist.sys.pq.adl.idx]=[0] Done
<14>[    9.260079] .(0)[1:init]init: PropSet [persist.sys.pq.iso.shp.en]=[2] Done
<14>[    9.274042] .(5)[1:init]init: PropSet [persist.sys.pq.ultrares.en]=[2] Done
<7>[    9.280992] .(3)[674:sh][ftrace]event 'signal_deliver' is enabled
<7>[    9.281039] .(3)[674:sh][ftrace]event 'signal_generate' is enabled
<14>[    9.302120] .(4)[1:init]init: PropSet [persist.sys.pq.mdp.color.dbg]=[1] Done
<7>[    9.315294] .(0)[677:sh][ftrace]event 'sched_fork_time' is enabled
<14>[    9.326704] .(6)[1:init]init: PropSet [persist.sys.pq.log.en]=[0] Done
<3>[    9.343618] .(3)[406:ccci_mdinit]BOOTPROF:      9343.616867:ccci_md1: decpyt ready
<6>[    9.344762] .(3)[406:ccci_mdinit][ccci1/fsm]monitor node open by ccci_mdinit
<6>[    9.346207] .(3)[406:ccci_mdinit][ccci1/chr]port ccci_ipc_5 open with flag 20002 by ccci_mdinit
<6>[    9.346246] .(4)[591:mtk_agpsd][ccci1/chr]write error done on ttyC2, l=44 r=-19
<7>[    9.351490] .(4)[686:sh][ftrace]event 'sched_process_exit' is enabled
<6>[    9.353963] .(3)[406:ccci_mdinit][ccci1/fsm]CCCI_IOC_RELOAD_MD_TYPE: 0x5a00003d
<6>[    9.355746] .(1)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: ICHG = 500mA, AICR = 500mA, MIVR = 4400mV, IEOC = 250mA, CV = 4350mV
<3>[    9.356930] .(3)[406:ccci_mdinit]BOOTPROF:      9356.929252:ccci_md1: reset
<6>[    9.358611] .(1)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: VSYS = 4225mV, VBAT = 4250mV, IBAT = 0mA, IBUS = 400mA, VBUS = 4975mV
<6>[    9.360843] .(1)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: CHG_EN = 1, CHG_STATUS = progress, CHG_STAT = 0xA0
<6>[    9.365078] .(1)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: CHG_CTRL1 = 0x10, CHG_CTRL2 = 0x1B
<5>[    9.366606] .(1)[266:charger_thread][charger_routine_thread]flags=0,1 
<4>[    9.367474] .(1)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<6>[    9.368973] .(5)[700:ccci_mdinit][ccci1/ipc]Update fail
<3>[    9.381874] .(2)[540:mediaserver]Dump cpuinfo
<6>[    9.418941] .(2)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_get_adc_vbus: VBUS = 4975mV
<14>[    9.419198] .(7)[1:init]init: PropSet [persist.sys.pq.hdr.en]=[1] Done
<14>[    9.421055] .(7)[1:init]init: PropSet [mtk.md1.status]=[reset] Done
<14>[    9.422421] .(7)[1:init]init: processing action (mtk.md1.status=reset) from (/vendor/etc/init/hw/init.mt6763.rc:1138)
<6>[    9.422890] .(2)[406:ccci_mdinit][ccci1/fsm]CCCI_IOC_GET_MD_TYPE: 11!
<4>[    9.423126] .(2)[266:charger_thread]sg_detect_typec_charge_ovp,1363,4975000,0 
<4>[    9.424173] .(2)[266:charger_thread]=====FG===== AC   = -75
<4>[    9.424938] .(2)[266:charger_thread]=====FG===== AC   = -75
<14>[    9.448550] .(5)[1:init]init: PropSet [persist.atm.mdmode]=[normal] Done
<14>[    9.450291] .(5)[1:init]init: Service 'bsplogstart' (pid 671) exited with status 0
<14>[    9.451936] .(5)[1:init]init: processing action (mtk.md1.status=reset) from (/vendor/etc/init/init.bip.rc:7)
<14>[    9.454658] .(5)[1:init]init: PropSet [debug.MB.realpath]=[/data/log_temp/boot/] Done
<14>[    9.455871] .(5)[1:init]init: processing action (mtk.md1.status=reset) from (/vendor/etc/init/init.volte_imsm_93.rc:12)
<14>[    9.457759] .(5)[1:init]init: PropSet [debug.pq.adl.dbg]=[0] Done
<14>[    9.459323] .(5)[1:init]init: PropSet [ril.active.md]=[11] Done
<14>[    9.460565] .(5)[1:init]init: PropSet [debug.pq.hdr.dbg]=[0] Done
<14>[    9.461881] .(5)[1:init]init: processing action (mtk.md1.status=reset) from (/vendor/etc/init/init.wod.rc:20)
<14>[    9.486242] .(7)[1:init]init: PropSet [persist.sys.pq.mdp.ccorr.en]=[2] Done
<3>[    9.489707] .(4)[531:cameraserver]Dump cpuinfo
<4>[    9.500726] .(3)[266:charger_thread]lifetime: data[0]=1 
<4>[    9.501452] .(3)[266:charger_thread]lifetime: data[1]=df 
<4>[    9.502157] .(3)[266:charger_thread]lifetime: data[2]=ff 
<4>[    9.502863] .(3)[266:charger_thread]lifetime: data[3]=40 
<4>[    9.503567] .(3)[266:charger_thread]lifetime: data[4]=11 
<4>[    9.504272] .(3)[266:charger_thread]lifetime: data[5]=45 
<4>[    9.505088] .(3)[266:charger_thread]lifetime: data[6]=a 
<4>[    9.505833] .(3)[266:charger_thread]lifetime: data[7]=fc 
<4>[    9.506528] .(3)[266:charger_thread]lifetime: data[8]=8 
<4>[    9.507223] .(3)[266:charger_thread]lifetime: data[9]=68 
<4>[    9.507926] .(3)[266:charger_thread]lifetime: data[10]=f7 
<4>[    9.508660] .(3)[266:charger_thread]lifetime: data[11]=18 
<4>[    9.514595] .(1)[266:charger_thread]=====FG-MTK===== bat_vol=4242
<5>[    9.518832] .(0)[266:charger_thread]Vbat=4242,Ibat=75,I=0,VChr=4730,T=25,Soc=100:100,CT:2:2 hv:1 pd:0:0
<5>[    9.520063] .(0)[266:charger_thread][mtk_is_charger_on]info->chr_type=2 
<4>[    9.523570] .(1)[697:HwBinder:380_1]mtk_pcm_dl1_hardware.buffer_bytes_max = 49152 mPlaybackDramState = 0
<4>[    9.523924] .(0)[266:charger_thread]temp_now=223, temp_last=223 
<4>[    9.523931] .(0)[266:charger_thread]=====FG===== TEMP = 223
<5>[    9.523935] .(0)[266:charger_thread]charger_check_status
<4>[    9.527313] .(1)[697:HwBinder:380_1]mtk_soc_pcm_dl1_close
<4>[    9.528434] .(1)[697:HwBinder:380_1]mtk_capture_pcm_close
<4>[    9.531736] .(3)[697:HwBinder:380_1]mtk_voice_pcm_open(), stream(0)
<4>[    9.533167] .(3)[697:HwBinder:380_1]mtk_voice_close(), stream(0)
<4>[    9.534336] .(3)[697:HwBinder:380_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[    9.535260] .(3)[697:HwBinder:380_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<3>[    9.536850] .(0)[697:HwBinder:380_1][AudioError] , user count < 0
<3>[    9.537926] .(0)[697:HwBinder:380_1][AudioError] , user count < 0
<14>[    9.538021] .(5)[1:init]init: PropSet [persist.sys.pq.mdp.dre.en]=[2] Done
<4>[    9.539897] .(4)[697:HwBinder:380_1]set_aud_clk_mosi(), counter 0 <= 0
<14>[    9.540466] .(5)[1:init]init: [PropSet]: pid:406 uid:1000 gid:1001 ctl.start, ccci_fsd
<3>[    9.541027] .(0)[406:ccci_mdinit]BOOTPROF:      9541.025560:ccci_md1: bootup
<14>[    9.541032] .(5)[1:init]init: PropSet [debug.pq.dre.dbg]=[0] Done
<14>[    9.542641] .(5)[1:init]init: PropSet [mtk.md1.status]=[bootup] Done
<6>[    9.542957] .(2)[406:ccci_mdinit][ccci1/chr]port ccci_ccb_ctrl open with flag 20002 by ccci_mdinit
<6>[    9.542996] .(2)[406:ccci_mdinit][ccci1/shm]ccb_configs_len: 20
<6>[    9.543251] .(2)[406:ccci_mdinit][ccci1/shm]find ccb port ccci_ccb_dhl for user1!
<6>[    9.543321] .(2)[406:ccci_mdinit][ccci1/chr]remap control addr:0x80018000 len:4096  map-len:4096
<6>[    9.543332] .(2)[406:ccci_mdinit][ccci1/chr]remap succeed 80018, 0x80018000 -> 0xf3b50000
<6>[    9.543777] .(2)[406:ccci_mdinit][ccci1/chr]port ccci_ccb_ctrl close rx_len=0 empty=1, clear_cnt=0, drop=0
<6>[    9.543798] .(2)[406:ccci_mdinit][ccci1/pot]critical user check: 0x1
<6>[    9.543868] .(2)[406:ccci_mdinit][ccci1/chr]port ccci_ccb_ctrl open with flag 20002 by ccci_mdinit
<6>[    9.543889] .(2)[406:ccci_mdinit][ccci1/shm]ccb_configs_len: 20
<6>[    9.543939] .(2)[406:ccci_mdinit][ccci1/shm]find ccb port ccci_ccb_md_monitor for user2!
<6>[    9.543984] .(2)[406:ccci_mdinit][ccci1/chr]remap control addr:0x80018000 len:4096  map-len:4096
<6>[    9.543993] .(2)[406:ccci_mdinit][ccci1/chr]remap succeed 80018, 0x80018000 -> 0xf3b50000
<6>[    9.544073] .(2)[406:ccci_mdinit][ccci1/chr]port ccci_ccb_ctrl close rx_len=0 empty=1, clear_cnt=0, drop=0
<6>[    9.544089] .(2)[406:ccci_mdinit][ccci1/pot]critical user check: 0x1
<14>[    9.544150] .(5)[1:init]init: PropSet [debug.pq.acaltm.dbg]=[0] Done
<6>[    9.544207] .(2)[406:ccci_mdinit][ccci1/chr]port ccci_ccb_ctrl open with flag 20002 by ccci_mdinit
<6>[    9.544226] .(2)[406:ccci_mdinit][ccci1/shm]ccb_configs_len: 20
<6>[    9.544291] .(2)[406:ccci_mdinit][ccci1/shm]find ccb port ccci_ccb_meta for user3!
<6>[    9.544327] .(2)[406:ccci_mdinit][ccci1/chr]remap control addr:0x80018000 len:4096  map-len:4096
<6>[    9.544337] .(2)[406:ccci_mdinit][ccci1/chr]remap succeed 80018, 0x80018000 -> 0xf3b50000
<6>[    9.544403] .(2)[406:ccci_mdinit][ccci1/chr]port ccci_ccb_ctrl close rx_len=0 empty=1, clear_cnt=0, drop=0
<6>[    9.544419] .(2)[406:ccci_mdinit][ccci1/pot]critical user check: 0x1
<6>[    9.544474] .(2)[406:ccci_mdinit][ccci1/fsm]MD start ioctl called by ccci_mdinit
<6>[    9.544500] .(2)[406:ccci_mdinit][ccci1/fsm]command 1 is appended 1 from ccci_fsm_ioctl
<6>[    9.544556] .(3)[189:ccci_fsm1][ccci1/fsm]command 1 process
<6>[    9.544569] .(3)[189:ccci_fsm1][ccci1/pot]ready to reset MD in normal mode
<5>[    9.544585] .(3)[189:ccci_fsm1][VcoreFS] kicker: KIR_APCCCI, opp: 0, dvfs_opp: 0, sw_opp: 3, kr opp: -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, -1, -1, -1, 
<5>[    9.544660] .(3)[189:ccci_fsm1][VcoreFS] opp: 0, vcore: 793750 <= 793750, fddr: 1866000 <= 1866000 [O][O]
<5>[    9.544678] -(3)[189:ccci_fsm1][VcoreFS] [spm_trigger_dvfs] fix: 0, opp: 0, vcore: 0x110000, emi: 0x290299, md: 0x0
<6>[    9.544691] .(3)[189:ccci_fsm1][ccci1/fsm]md_state change from 0 to 2
<14>[    9.546686] .(5)[1:init]init: PropSet [debug.pq.dredriver.dbg]=[0] Done
<14>[    9.548288] .(5)[1:init]init: PropSet [debug.pq.dre.demowin.x]=[536805376] Done
<14>[    9.549883] .(5)[1:init]init: PropSet [debug.pq.dredriver.blk]=[0] Done
<14>[    9.551335] .(5)[1:init]init: PropSet [debug.pq.dre.isp.tuning]=[0] Done
<14>[    9.553727] .(5)[1:init]init: PropSet [debug.pq.cz.isp.tuning]=[0] Done
<5>[    9.568263] .(3)[266:charger_thread][mtk_chg_check_vbus]charger_update_data(4730000 mV) 
<5>[    9.569863] .(3)[266:charger_thread][BATTERY] bat_auth 1 gpio53_state =1
<5>[    9.569877] .(3)[266:charger_thread]charger_check_status tmp:22 (jeita:0 sm:0 cv:0 en:0) (sm:1) charging:1 cmd_discharging:0 safety_timeout:0 vbusov_stat:0 can_charging:1, charging:1
<5>[    9.571519] .(3)[266:charger_thread]mtk_switch_charging_run [1 0], timer=3
<3>[    9.585286] .(4)[697:HwBinder:380_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<4>[    9.587072] .(4)[697:HwBinder:380_1]mtk_voice_pcm_open(), stream(1)
<4>[    9.588054] .(4)[697:HwBinder:380_1]mtk_voice_close(), stream(1)
<4>[    9.590498] .(4)[697:HwBinder:380_1]mtk_uldlloopback_open runtime rate = 0 channels = 0
<4>[    9.591720] .(4)[697:HwBinder:380_1]mtk_uldlloopbackpcm_close
<3>[    9.592524] .(4)[697:HwBinder:380_1][AudioError] , user count < 0
<3>[    9.594868] .(6)[526:app_process32]Dump cpuinfo
<14>[    9.595523] .(5)[1:init]init: PropSet [persist.sys.bluelight.default]=[128] Done
<4>[    9.600860] .(7)[697:HwBinder:380_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[    9.601760] .(7)[697:HwBinder:380_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<3>[    9.602930] .(7)[697:HwBinder:380_1][AudioError] , user count < 0
<4>[    9.603791] .(7)[697:HwBinder:380_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[    9.604736] .(7)[697:HwBinder:380_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<4>[    9.606105] .(7)[697:HwBinder:380_1]mtk_uldlloopback_open runtime rate = 0 channels = 0
<4>[    9.607202] .(7)[697:HwBinder:380_1]mtk_uldlloopbackpcm_close
<3>[    9.608062] .(7)[697:HwBinder:380_1]mtk_uldlloopbackpcm_close  with SNDRV_PCM_STREAM_CAPTURE
<3>[    9.610047] .(0)[697:HwBinder:380_1]ASoC: mt-soc-i2s0-dummy-dai-codec <-> mt-soc-i2s0dai-driver No matching formats
<4>[    9.612341] .(0)[697:HwBinder:380_1]mtk_pcm_mrgrx_open
<4>[    9.613122] .(0)[697:HwBinder:380_1]mtk_pcm_mrgrx_open runtime rate = 0 channels = 0 substream->pcm->device = 5
<4>[    9.614431] .(0)[697:HwBinder:380_1]mtk_pcm_mrgrx_open return
<14>[    9.614497] .(3)[1:init]init: PropSet [persist.sys.pq.shp.idx]=[2] Done
<4>[    9.616243] .(0)[697:HwBinder:380_1]mtk_pcm_mrgrx_close
<5>[    9.616460] .(3)[266:charger_thread]pe40_ready:0 hv:1 thermal:-1,-1 tmp:24,39,16 pps:0 en:0 ibus:0 80
<5>[    9.616474] .(3)[266:charger_thread]mtk_pe20_start_algorithm: stop, PE+20 is not connected
<5>[    9.616480] .(3)[266:charger_thread]mtk_pe_start_algorithm: stop, PE+ is not connected
<5>[    9.618124] .(1)[266:charger_thread]mtk_pe_start_algorithm: vchr_org = 5000, vchr_after = 4730, delta = -270
<4>[    9.618313] .(3)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    9.618323] .(3)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    9.618330] .(3)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    9.618499] .(3)[266:charger_thread][mtk_switch_charging_multi_power_supply_check]hall_1_eint_occur=0 mtk_charger_hall_1_eint=0
<4>[    9.619232] .(3)[266:charger_thread]temp_now=223, temp_last=223 
<4>[    9.619236] .(3)[266:charger_thread]=====FG===== TEMP = 223
<4>[    9.620341] .(3)[266:charger_thread]=====FG===== VOLT = 4274
<4>[    9.620348] .(3)[266:charger_thread]=====FG===== actural VOLT = 4316
<4>[    9.620901] .(3)[266:charger_thread]=====FG===== AC   = -357
<4>[    9.621524] .(3)[266:charger_thread]=====FG===== SOC  = 100
<4>[    9.622064] .(3)[266:charger_thread]=====FG===== SOH  = 100
<4>[    9.622070] .(3)[266:charger_thread]DLCP bat_vol=4316,  temperature=223  
<4>[    9.622076] .(3)[266:charger_thread] ===CC_value from battery temprature=2000000
<4>[    9.622091] .(3)[266:charger_thread]DLCP __mt6370_set_ieoc      = 150000
<4>[    9.622676] .(3)[266:charger_thread]DLCP mt6370_set_vrech       = 300
<4>[    9.624190] .(2)[266:charger_thread]DLCP mt6370_get_vrech       = 300
<4>[    9.624216] .(2)[266:charger_thread]DLCP read cv              = 4350000
<4>[    9.624223] .(2)[266:charger_thread]DLCP read eoc             = 250000
<4>[    9.624225] .(2)[266:charger_thread]DLCP read recharge        = 300
<4>[    9.624230] .(2)[266:charger_thread]DLCP Target Temp          = 410
<4>[    9.624232] .(2)[266:charger_thread]DLCP Charge Current       = 2000
<4>[    9.624237] .(2)[266:charger_thread]DLPID 
<4>[    9.624239] .(2)[266:charger_thread]DLPID +++++++++++++++++ PID Start +++++++++++++++++++++ 
<4>[    9.624241] .(2)[266:charger_thread]DLPID PID Target Temp = 410 
<4>[    9.624244] .(2)[266:charger_thread]DLPID Battery Temp    = 223 
<4>[    9.624246] .(2)[266:charger_thread]DLPID TEMP DIFF       = 184 
<4>[    9.624249] .(2)[266:charger_thread]DLPID PID KI          = 5000 
<4>[    9.624254] .(2)[266:charger_thread]DLPID CC MAX          = 2000000 
<4>[    9.624258] .(2)[266:charger_thread]DLPID PID Current     = 2000000 
<4>[    9.624261] .(2)[266:charger_thread]DLCP ccurrent from charge type        = 500000
<4>[    9.624263] .(2)[266:charger_thread]DLCP ccurrent from battery temprature = 2000000
<4>[    9.624266] .(2)[266:charger_thread]DLCP ccurrent from PID algorithm      = 2000000
<4>[    9.624269] .(2)[266:charger_thread]DLCP ccurrent from DLPL               = 2000000
<4>[    9.624278] .(2)[266:charger_thread]DLCP set input current:500000 
<4>[    9.624537] .(2)[266:charger_thread]DLCP set charge current: 500000 
<4>[    9.625397] .(2)[266:charger_thread]DLCP mt6370_enable_charging :1 
<4>[    9.625594] .(2)[266:charger_thread]DLCP charger_dev_set_constant_voltage       = 4350000
<4>[    9.625606] .(2)[266:charger_thread]DLCP __mt6370_set_cv       = 4350000
<4>[    9.625784] .(2)[266:charger_thread]DLCP mt6370_enable_charging :1 
<6>[    9.647040] .(7)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d628000, buf_size=213032,buflen=213032,rx_size=81920,tx_size=131072,ctr_len=40
<6>[    9.647210] .(7)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d628000)=0xee0000ee ee0000ee
<6>[    9.647216] .(7)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d65c024)=0xff0000ff ff0000ff
<6>[    9.647220] .(7)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d628008
<6>[    9.652699] .(4)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d65c028, buf_size=122920,buflen=122920,rx_size=81920,tx_size=40960,ctr_len=40
<6>[    9.652830] .(4)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d65c028)=0xee0000ee ee0000ee
<6>[    9.652836] .(4)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d67a04c)=0xff0000ff ff0000ff
<6>[    9.652841] .(4)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d65c030
<6>[    9.655448] .(7)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d67a050, buf_size=49192,buflen=49192,rx_size=40960,tx_size=8192,ctr_len=40
<6>[    9.655497] .(7)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d67a050)=0xee0000ee ee0000ee
<6>[    9.655503] .(7)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d686074)=0xff0000ff ff0000ff
<6>[    9.655507] .(7)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d67a058
<6>[    9.660748] .(4)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d686078, buf_size=122920,buflen=122920,rx_size=81920,tx_size=40960,ctr_len=40
<6>[    9.660843] .(4)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d686078)=0xee0000ee ee0000ee
<6>[    9.660849] .(4)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6a409c)=0xff0000ff ff0000ff
<6>[    9.660875] .(4)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d686080
<6>[    9.673195] .(1)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6a40a0, buf_size=41000,buflen=41000,rx_size=20480,tx_size=20480,ctr_len=40
<6>[    9.673246] .(1)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6a40a0)=0xee0000ee ee0000ee
<6>[    9.673253] .(1)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6ae0c4)=0xff0000ff ff0000ff
<6>[    9.673260] .(1)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6a40a8
<6>[    9.676737] .(1)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6ae0c8, buf_size=41000,buflen=41000,rx_size=20480,tx_size=20480,ctr_len=40
<6>[    9.676794] .(1)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6ae0c8)=0xee0000ee ee0000ee
<6>[    9.676801] .(1)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6b80ec)=0xff0000ff ff0000ff
<6>[    9.676807] .(1)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6ae0d0
<6>[    9.681023] .(1)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6b80f0, buf_size=131112,buflen=131112,rx_size=65536,tx_size=65536,ctr_len=40
<6>[    9.681162] .(1)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6b80f0)=0xee0000ee ee0000ee
<6>[    9.681169] .(1)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6d8114)=0xff0000ff ff0000ff
<6>[    9.681175] .(1)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6b80f8
<6>[    9.688054] .(1)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6d8118, buf_size=40,buflen=40,rx_size=0,tx_size=0,ctr_len=40
<6>[    9.688078] .(1)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6d8118)=0xee0000ee ee0000ee
<6>[    9.688093] .(1)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6d813c)=0xff0000ff ff0000ff
<6>[    9.688104] .(1)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6d8120
<3>[    9.695631] .(7)[697:HwBinder:380_1][AudioError] , user count < 0
<4>[    9.696460] .(7)[697:HwBinder:380_1][AudioWarn] GeneralSampleRateTransform() sampleRate(0) is invalid, use 44.1kHz!!!
<4>[    9.697882] .(7)[697:HwBinder:380_1]SetMrgI2SEnable bEnable = 0
<6>[    9.698491] .(1)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6d8400, buf_size=24616,buflen=24616,rx_size=12288,tx_size=12288,ctr_len=40
<6>[    9.698524] .(1)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6d8400)=0xee0000ee ee0000ee
<6>[    9.698532] .(1)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6de424)=0xff0000ff ff0000ff
<6>[    9.698537] .(1)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6d8408
<6>[    9.698545] .(1)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6de428, buf_size=65576,buflen=65576,rx_size=32768,tx_size=32768,ctr_len=40
<6>[    9.698641] .(1)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6de428)=0xee0000ee ee0000ee
<6>[    9.698648] .(1)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6ee44c)=0xff0000ff ff0000ff
<6>[    9.698654] .(1)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6de430
<6>[    9.698661] .(1)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6ee450, buf_size=16424,buflen=16424,rx_size=8192,tx_size=8192,ctr_len=40
<6>[    9.698684] .(1)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6ee450)=0xee0000ee ee0000ee
<6>[    9.698690] .(1)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6f2474)=0xff0000ff ff0000ff
<6>[    9.698696] .(1)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6ee458
<6>[    9.698702] .(1)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6f2478, buf_size=40,buflen=40,rx_size=0,tx_size=0,ctr_len=40
<6>[    9.698710] .(1)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6f2478)=0xee0000ee ee0000ee
<6>[    9.698716] .(1)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6f249c)=0xff0000ff ff0000ff
<6>[    9.698722] .(1)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6f2480
<6>[    9.698729] .(1)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6f24a0, buf_size=40,buflen=40,rx_size=0,tx_size=0,ctr_len=40
<6>[    9.698740] .(1)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6f24a0)=0xee0000ee ee0000ee
<6>[    9.698746] .(1)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6f24c4)=0xff0000ff ff0000ff
<6>[    9.698752] .(1)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6f24a8
<6>[    9.698758] .(1)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6f24c8, buf_size=40,buflen=40,rx_size=0,tx_size=0,ctr_len=40
<6>[    9.698766] .(1)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6f24c8)=0xee0000ee ee0000ee
<6>[    9.698772] .(1)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6f24ec)=0xff0000ff ff0000ff
<6>[    9.698778] .(1)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6f24d0
<6>[    9.698785] .(1)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6f24f0, buf_size=16424,buflen=16424,rx_size=8192,tx_size=8192,ctr_len=40
<6>[    9.698806] .(1)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6f24f0)=0xee0000ee ee0000ee
<6>[    9.698812] .(1)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6f6514)=0xff0000ff ff0000ff
<6>[    9.698818] .(1)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6f24f8
<6>[    9.698824] .(1)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6f6518, buf_size=40,buflen=40,rx_size=0,tx_size=0,ctr_len=40
<6>[    9.698832] .(1)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6f6518)=0xee0000ee ee0000ee
<6>[    9.698838] .(1)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6f653c)=0xff0000ff ff0000ff
<6>[    9.698844] .(1)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6f6520
<6>[    9.699382] .(1)[189:ccci_fsm1][ccci1/mcd]ccci_set_clk_cg: on=1
<6>[    9.700177] .(1)[189:ccci_fsm1][ccci1/cif]md_ccif_sram_reset
<6>[    9.700222] .(1)[189:ccci_fsm1][ccci1/cif]md_ccif_switch_ringbuf
<6>[    9.700233] .(1)[189:ccci_fsm1][ccci1/cif]md_ccif_reset_queue
<6>[    9.700243] .(1)[189:ccci_fsm1][ccci1/cif]md_ccif_switch_ringbuf
<6>[    9.700248] .(1)[189:ccci_fsm1][ccci1/cif]md_ccif_reset_queue
<3>[    9.739581] .(7)[697:HwBinder:380_1][AudioError] , user count < 0
<4>[    9.740389] .(7)[697:HwBinder:380_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[    9.744166] .(0)[697:HwBinder:380_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<6>[    9.745511] .(1)[189:ccci_fsm1][ccci1/cldma]cldma_reset from md_cd_start
<6>[    9.746392] .(1)[189:ccci_fsm1][ccci1/cldma]cldma_start from md_cd_start
<4>[    9.747613] .(0)[697:HwBinder:380_1]mtk_pcm_mrgrx_open
<4>[    9.748296] .(0)[697:HwBinder:380_1]mtk_pcm_mrgrx_open runtime rate = 0 channels = 0 substream->pcm->device = 5
<4>[    9.749700] .(0)[697:HwBinder:380_1]mtk_pcm_mrgrx_open return
<4>[    9.750530] .(0)[697:HwBinder:380_1]mtk_pcm_mrgrx_close
<3>[    9.751252] .(0)[697:HwBinder:380_1][AudioError] , user count < 0
<4>[    9.752209] .(0)[697:HwBinder:380_1][AudioWarn] GeneralSampleRateTransform() sampleRate(0) is invalid, use 44.1kHz!!!
<4>[    9.753617] .(0)[697:HwBinder:380_1]SetMrgI2SEnable bEnable = 0
<3>[    9.754386] .(0)[697:HwBinder:380_1][AudioError] , user count < 0
<4>[    9.755192] .(0)[697:HwBinder:380_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[    9.756030] .(0)[697:HwBinder:380_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<4>[    9.757615] .(0)[697:HwBinder:380_1]mtk_mrgrx_awb_pcm_open
<4>[    9.758341] .(0)[697:HwBinder:380_1]mtk_mrgrx_awb_pcm_open runtime rate = 0 channels = 0
<3>[    9.759382] .(0)[697:HwBinder:380_1]mt-soc-mrgrx-awb-pcm mt-soc-mrgrx-awb-pcm: ASoC: can't open platform mt-soc-mrgrx-awb-pcm: -1
<4>[    9.761108] .(0)[697:HwBinder:380_1]mtk_mrgrx_awb_pcm_open
<4>[    9.761835] .(0)[697:HwBinder:380_1]mtk_mrgrx_awb_pcm_open runtime rate = 0 channels = 0
<4>[    9.762871] .(0)[697:HwBinder:380_1]SNDRV_PCM_STREAM_CAPTURE
<4>[    9.763788] .(0)[697:HwBinder:380_1]mtk_mrgrx_awb_pcm_open return
<4>[    9.769637] .(6)[697:HwBinder:380_1]mtk_pcm_I2S0dl1_open: mtk_I2S0dl1_hardware.buffer_bytes_max = 196608 mPlaybackDramState = 0
<4>[    9.771520] .(6)[697:HwBinder:380_1]mtk_pcm_I2S0dl1_close
<4>[    9.780989] .(6)[697:HwBinder:380_1]mtk_voice_bt_pcm_open(), stream(0)
<4>[    9.781952] .(6)[697:HwBinder:380_1]mtk_voice_bt_close(), stream(0)
<3>[    9.782792] .(6)[697:HwBinder:380_1][AudioError] , user count < 0
<4>[    9.784289] .(6)[697:HwBinder:380_1]mtk_bt_dai_pcm_open, stream 1
<4>[    9.785452] .(6)[697:HwBinder:380_1]mtk_bt_dai_pcm_open return
<4>[    9.789900] .(5)[697:HwBinder:380_1]mtk_I2S0dl1_hardware.buffer_bytes_max = 49152 mPlaybackDramState = 0
<4>[    9.791703] .(5)[697:HwBinder:380_1]mtk_capture2_pcm_open
<4>[    9.792432] .(5)[697:HwBinder:380_1]runtime->hw->rates = 0x40001ffe
<4>[    9.792432]  
<4>[    9.793051] .(5)[697:HwBinder:380_1]mtk_capture2_pcm_open runtime rate = 0 channels = 0
<4>[    9.794156] .(5)[697:HwBinder:380_1]SNDRV_PCM_STREAM_CAPTURE mtkalsa_capture_constraints
<4>[    9.795208] .(5)[697:HwBinder:380_1]mtk_capture2_pcm_open return
<4>[    9.796371] .(5)[697:HwBinder:380_1]mtk_capture2_pcm_close
<6>[    9.805369] .(6)[236:kworker/6:1][ccci1/cif]md_ccif_sram_rx_work:dk_pkg=ffffff800bef4100, md_featrue=ffffff800bef4110
<6>[    9.806805] .(6)[236:kworker/6:1][ccci1/cif]md_ccif_sram_rx_work:ccci_port_recv_skb ret=0
<6>[    9.806837] .(3)[197:ccci_ctrl][ccci1/fsm]control message 0x0,0x5555FFFF
<6>[    9.806858] .(3)[197:ccci_ctrl][ccci1/fsm]event 1 is appended from ccci_fsm_recv_control_packet
<4>[    9.807189] .(5)[697:HwBinder:380_1]mtk_i2s0_awb_pcm_open
<4>[    9.807329] .(5)[697:HwBinder:380_1]mtk_i2s0_awb_pcm_open runtime rate = 0 channels = 0
<4>[    9.807331] .(5)[697:HwBinder:380_1]SNDRV_PCM_STREAM_CAPTURE
<4>[    9.807333] .(5)[697:HwBinder:380_1]mtk_i2s0_awb_pcm_open return
<4>[    9.808195] .(5)[697:HwBinder:380_1]mtk_voice_md2_pcm_open(), stream(0)
<4>[    9.808251] .(5)[697:HwBinder:380_1]mtk_voice_md2_close(), stream(0)
<4>[    9.808263] .(5)[697:HwBinder:380_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[    9.808266] .(5)[697:HwBinder:380_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<3>[    9.808271] .(5)[697:HwBinder:380_1][AudioError] , user count < 0
<3>[    9.808273] .(5)[697:HwBinder:380_1][AudioError] , user count < 0
<4>[    9.811062] .(3)[697:HwBinder:380_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[    9.811081] .(3)[697:HwBinder:380_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<4>[    9.811454] .(3)[697:HwBinder:380_1]mtk_voice_md2_pcm_open(), stream(1)
<4>[    9.811522] .(3)[697:HwBinder:380_1]mtk_voice_md2_close(), stream(1)
<6>[    9.816730] -(1)[189:ccci_fsm1][ccci1/fsm]md_state change from 2 to 3
<5>[    9.816774] -(1)[189:ccci_fsm1]mtk_rtc_hal_common: rtc_spare_reg[12] = {a38, 1, 6}
<6>[    9.816945] -(1)[189:ccci_fsm1][ccci1/mcd]md_boot_stats len 0
<6>[    9.816953] -(1)[189:ccci_fsm1][ccci1/mcd]md_boot_stats0:0x54430007
<6>[    9.816959] -(1)[189:ccci_fsm1][ccci1/mcd]md_boot_stats1:0x53320000
<6>[    9.816976] -(1)[189:ccci_fsm1][ccci1/fsm]event 1 is completed by fsm_main_thread
<2>[    9.817038] .(1)[189:ccci_fsm1][PBM] AP2MD1 section level, 2G: 0xb9e7bf(0xb9e7bf), 3G: 0xb84696(0xb84696), 
<2>[    9.817034] .(1)[189:ccci_fsm1][PBM] 4G_upL1: 0xb84675(0xb84675), 4G_upL2: 0xb84675(0xb84675), TDD: 0xd84a75(0xd84a75), addr: 0xffffff800d60ff58
<2>[    9.817040] .(1)[189:ccci_fsm1][PBM] C2K section level, C2K: 0x108d2d7(0x108d2d7), addr: 0xffffff800d60ff58
<2>[    9.817043] .(1)[189:ccci_fsm1][PBM] MD section level init, MD1: 1
<6>[    9.817053] .(1)[189:ccci_fsm1][ccci1/fsm]send runtime data 0
<4>[    9.817293] .(2)[697:HwBinder:380_1]mtk_routing_pcm_open
<4>[    9.817298] .(2)[697:HwBinder:380_1]mtk_routing_pcm_open runtime rate = 0 channels = 0
<4>[    9.817301] .(2)[697:HwBinder:380_1]mtk_routing_pcm_open return
<4>[    9.817479] .(2)[697:HwBinder:380_1]mtk_routing_pcm_open
<4>[    9.817482] .(2)[697:HwBinder:380_1]mtk_routing_pcm_open runtime rate = 0 channels = 0
<4>[    9.817484] .(2)[697:HwBinder:380_1]mtk_routing_pcm_open return
<4>[    9.820476] .(2)[697:HwBinder:380_1]mtk_voice_md2_bt_pcm_open(), stream(0)
<4>[    9.820542] .(2)[697:HwBinder:380_1]mtk_voice_md2_bt_close(), stream(0)
<3>[    9.820550] .(2)[697:HwBinder:380_1][AudioError] , user count < 0
<4>[    9.821193] .(2)[697:HwBinder:380_1]mtk_pcm_fm_i2s_open
<4>[    9.821202] .(2)[697:HwBinder:380_1]mtk_pcm_fm_i2s_open return
<4>[    9.821226] .(2)[697:HwBinder:380_1]mtk_pcm_fm_i2s_close rate = 0
<3>[    9.821231] .(2)[697:HwBinder:380_1][AudioError] , user count < 0
<4>[    9.821238] .(2)[697:HwBinder:380_1][AudioWarn] GeneralSampleRateTransform() sampleRate(0) is invalid, use 44.1kHz!!!
<4>[    9.821250] .(2)[697:HwBinder:380_1]setConnsysI2SInEnable(), enable = 0
<3>[    9.821248] .(2)[697:HwBinder:380_1][AudioError] , user count < 0
<4>[    9.821257] .(2)[697:HwBinder:380_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[    9.821261] .(2)[697:HwBinder:380_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<4>[    9.821420] .(2)[697:HwBinder:380_1]mtk_fm_i2s_awb_pcm_open
<4>[    9.821519] .(2)[697:HwBinder:380_1]mtk_fm_i2s_awb_pcm_open return
<4>[    9.822825] .(2)[697:HwBinder:380_1]+Set_BTCVSD_State, state=16
<4>[    9.822914] .(2)[697:HwBinder:380_1]+Set_BTCVSD_State, state=16
<4>[    9.823725] .(2)[697:HwBinder:380_1]mtk_pcm_btcvsd_tx_open
<4>[    9.823810] .(2)[697:HwBinder:380_1]mtk_pcm_btcvsd_tx_close
<4>[    9.823815] .(2)[697:HwBinder:380_1]+Set_BTCVSD_State, state=0
<4>[    9.823873] .(2)[697:HwBinder:380_1]mtk_pcm_btcvsd_tx_open
<4>[    9.823899] .(2)[697:HwBinder:380_1]mtk_pcm_btcvsd_tx_close
<4>[    9.823902] .(2)[697:HwBinder:380_1]+Set_BTCVSD_State, state=0
<4>[    9.825203] .(1)[697:HwBinder:380_1]mtk_i2s2_adc2_pcm_open
<4>[    9.828994] .(3)[697:HwBinder:380_1]mtk_voice_usb_open()
<4>[    9.829014] .(3)[697:HwBinder:380_1]mtk_voice_usb_open(), return
<4>[    9.829087] .(3)[697:HwBinder:380_1]mtk_voice_usb_close(), stream 0, prepare 0
<4>[    9.829304] .(3)[697:HwBinder:380_1]mtk_voice_usb_open()
<4>[    9.829307] .(3)[697:HwBinder:380_1]mtk_voice_usb_open(), return
<4>[    9.829329] .(3)[697:HwBinder:380_1]mtk_voice_usb_close(), stream 1, prepare 0
<4>[    9.838633] .(7)[697:HwBinder:380_1]mtk_usb_echoref_open()
<4>[    9.838644] .(7)[697:HwBinder:380_1]mtk_usb_echoref_open(), return
<4>[    9.838697] .(7)[697:HwBinder:380_1]mtk_usb_echoref_close(), stream 0, prepare 0
<6>[    9.854872] .(2)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: ICHG = 500mA, AICR = 500mA, MIVR = 4400mV, IEOC = 250mA, CV = 4350mV
<6>[    9.854889] .(2)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: VSYS = 4240mV, VBAT = 4245mV, IBAT = 0mA, IBUS = 400mA, VBUS = 4975mV
<6>[    9.854895] .(2)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: CHG_EN = 1, CHG_STATUS = progress, CHG_STAT = 0xA0
<6>[    9.854900] .(2)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: CHG_CTRL1 = 0x10, CHG_CTRL2 = 0x1B
<4>[    9.871916] .(4)[697:HwBinder:380_1]mtk_i2s2_adc2_pcm_open
<31>[    9.993478] .(6)[354:logd.reader]logd: logdr: UID=1000 GID=1000 PID=542 b tail=0 logMask=1f pid=0 start=0ns timeout=0ns
<14>[    9.995486] .(7)[1:init]init: PropSet [debug.MB.running]=[1] Done
<14>[    9.998335] .(7)[1:init]init: PropSet [log.tag]=[M] Done
<31>[    9.999435] .(4)[764:logd.reader.per]logd: logd first log reader, set log level to M!
<31>[    9.999494] .(4)[764:logd.reader.per]logd: logd.reader.per thread start.
<14>[   10.001708] .(7)[1:init]init: PropSet [debug.MB.prdebug]=[1] Done
<14>[   10.003969] .(7)[1:init]init: processing action (debug.MB.prdebug=1) from (/system/etc/init/mobile_log_d.rc:31)
<6>[   10.039089] .(2)[191:ccci_rpc_k][ccci0/rpc]get_md_dtsi_val 1, mediatek,md_product_name_model_id -- 0xf0f0f0f
<36>[   10.072390] .(0)[362:logd.auditd]type=1400 audit(1578635490.469:30): avc: denied { read } for pid=547 comm="storaged" path="/sys/kernel/debug/mmc0/mmc0:0001/ext_csd" dev="debugfs" ino=97 scontext=u:r:storaged:s0 tcontext=u:object_r:debugfs_mmc:s0 tclass=file permissive=0
<36>[   10.076789] .(0)[362:logd.auditd]type=1400 audit(1578635491.833:31): avc: denied { getattr } for pid=767 comm="aee" path="/sys/devices/virtual/BOOT/BOOT/boot/boot_mode" dev="sysfs" ino=5378 scontext=u:r:mobile_log_d:s0 tcontext=u:object_r:sysfs:s0 tclass=file permissive=0
<6>[   10.163306] .(3)[197:ccci_ctrl][ccci1/fsm]control message 0x0,0x0
<6>[   10.164142] .(3)[197:ccci_ctrl][ccci1/fsm]event 4 is appended from ccci_fsm_recv_control_packet
<3>[   10.179609] .(5)[534:vtservice]Dump cpuinfo
<6>[   10.184676] -(0)[189:ccci_fsm1][ccci1/fsm]md_state change from 3 to 4
<6>[   10.185577] -(0)[189:ccci_fsm1][ccci1/fsm]event 4 is completed by fsm_main_thread
<5>[   10.186558] .(0)[189:ccci_fsm1][VcoreFS] kicker: KIR_APCCCI, opp: -1, dvfs_opp: 3, sw_opp: 0, kr opp: -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
<5>[   10.188491] .(0)[189:ccci_fsm1][VcoreFS] opp: 3, vcore: 725000 <= 793750, fddr: 1200000 <= 1866000 [O][O]
<5>[   10.189897] -(0)[189:ccci_fsm1][VcoreFS] [spm_trigger_dvfs] fix: 0, opp: 3, vcore: 0x10000, emi: 0x90299, md: 0x0
<6>[   10.191684] .(0)[189:ccci_fsm1][ccci1/fsm]command 1 is completed 1 by fsm_main_thread
<3>[   10.193779] .(2)[406:ccci_mdinit]BOOTPROF:     10193.778100:ccci_md1: ready
<14>[   10.196005] .(7)[1:init]init: PropSet [mtk.md1.status]=[ready] Done
<14>[   10.198383] .(7)[1:init]init: processing action (mtk.md1.status=ready) from (/vendor/etc/init/init.bip.rc:4)
<14>[   10.201862] .(7)[1:init]init: starting service 'bip'...
<14>[   10.206744] .(4)[774:init]init: Created socket '/dev/socket/bip', mode 660, user 0, group 1000
<14>[   10.209044] .(7)[1:init]init: [PropSet]: pid:406 uid:1000 gid:1001 ctl.start, emdlogger1
<14>[   10.211136] .(7)[1:init]init: starting service 'emdlogger1'...
<14>[   10.216869] .(7)[1:init]init: processing action (mtk.md1.status=ready) from (/vendor/etc/init/init.volte_imsm_93.rc:5)
<14>[   10.219144] .(7)[1:init]init: starting service 'volte_imsm_93'...
<14>[   10.225817] .(3)[1:init]init: [PropSet]: pid:406 uid:1000 gid:1001 ctl.start, gsm0710muxd
<14>[   10.228559] .(3)[1:init]init: starting service 'gsm0710muxd'...
<14>[   10.232376] .(3)[1:init]init: starting service 'volte_stack'...
<6>[   10.235403] .(4)[774:bip][ccci1/chr]port ccci_bip open with flag 20002 by bip
<14>[   10.236394] .(3)[1:init]init: starting service 'volte_ua'...
<4>[   10.236687] -(4)[0:swapper/4]MCDI bootup check: PASS
<14>[   10.240443] .(3)[1:init]init: starting service 'volte_imcb'...
<36>[   10.246950] .(4)[362:logd.auditd]type=1400 audit(1578635491.833:31): avc: denied { getattr } for pid=767 comm="aee" path="/sys/devices/virtual/BOOT/BOOT/boot/boot_mode" dev="sysfs" ino=5378 scontext=u:r:mobile_log_d:s0 tcontext=u:object_r:sysfs:s0 tclass=file permissive=0
<14>[   10.247295] .(7)[779:init]init: Created socket '/dev/socket/volte_stack', mode 660, user 0, group 1000
<14>[   10.250323] .(7)[780:init]init: Created socket '/dev/socket/volte_ua', mode 660, user 0, group 1000
<36>[   10.253502] .(4)[362:logd.auditd]type=1400 audit(1578635492.009:32): avc: denied { read } for pid=774 comm="bip" name="u:object_r:net_dns_prop:s0" dev="tmpfs" ino=8180 scontext=u:r:bip:s0 tcontext=u:object_r:net_dns_prop:s0 tclass=file permissive=0
<14>[   10.258731] .(7)[781:init]init: Created socket '/dev/socket/volte_imsa1', mode 660, user 0, group 1001
<14>[   10.267858] .(6)[781:init]init: Created socket '/dev/socket/volte_imsa2', mode 660, user 0, group 1001
<14>[   10.271337] .(6)[781:init]init: Created socket '/dev/socket/volte_ut', mode 660, user 0, group 1001
<6>[   10.280716] .(5)[85:kworker/5:1]usb_state<CONFIGURED>
<5>[   10.323018] -(4)[781:volte_imcb]alarmtimer_enqueue, 110278423077
<5>[   10.323826] -(4)[781:volte_imcb]alarmtimer_enqueue, 10279234461
<3>[   10.338127] .(3)[779:volte_stack]Dump cpuinfo
<7>[   10.418663] .(1)[697:HwBinder:380_1]Speaker_Amp_Set() value = 0
<7>[   10.418663]  
<7>[   10.418679] Headset_Speaker_Amp_Set() gain = 0
<7>[   10.418679]  <7>[   10.418707] .(1)[697:HwBinder:380_1]Ext_Speaker_Amp_Change OFF+  udio_mode_flags = 0, audio_mode_value = 2
<7>[   10.419254] .(1)[697:HwBinder:380_1]Ext_Speaker_Amp_Change OFF-
<7>[   10.419295] .(1)[697:HwBinder:380_1]Receiver_Speaker_Switch_Set()
<7>[   10.419318] .(1)[697:HwBinder:380_1]TurnOnADcPowerACC ADCType = 13 enable = 0
<4>[   10.419399] .(1)[697:HwBinder:380_1]TopCkCount <0 =-1
<4>[   10.419399]  
<4>[   10.419775] .(1)[697:HwBinder:380_1]ClsqEnable count <0
<4>[   10.420526] .(1)[697:HwBinder:380_1]NvRegCount <0 =-1
<4>[   10.420526]  
<4>[   10.420940] .(1)[697:HwBinder:380_1]audck_buf_Count count < 0
<7>[   10.421760] .(1)[697:HwBinder:380_1]TurnOnADcPowerACC ADCType = 14 enable = 0
<4>[   10.421858] .(1)[697:HwBinder:380_1]TopCkCount <0 =-1
<4>[   10.421858]  
<4>[   10.422224] .(1)[697:HwBinder:380_1]ClsqEnable count <0
<4>[   10.422939] .(1)[697:HwBinder:380_1]NvRegCount <0 =-1
<4>[   10.422939]  
<4>[   10.423308] .(1)[697:HwBinder:380_1]audck_buf_Count count < 0
<7>[   10.424441] .(1)[697:HwBinder:380_1]pmic_dctrim_control_get(), dctrim_calibrated = 2
<6>[   10.462024] .(1)[781:volte_imcb][ccci1/chr]port ccci_imsc open with flag 20002 by volte_imcb
<6>[   10.472801] .(6)[776:volte_imsm_93][ccci1/chr]port ccci_imsm open with flag 20102 by volte_imsm_93
<6>[   10.518435] .(3)[697:HwBinder:380_1][ccci1/chr]port ccci_aud open with flag 20002 by HwBinder:380_1
<6>[   10.520278] .(3)[697:HwBinder:380_1][ccci1/chr]port ccci_raw_audio open with flag 20002 by HwBinder:380_1
<6>[   10.521706] .(3)[697:HwBinder:380_1][ccci1/shm]smem_port->addr_phy=8001b000
<6>[   10.522851] .(3)[697:HwBinder:380_1][ccci1/chr]remap addr:0x8001b000 len:53248  map-len:53248
<6>[   10.643275] .(4)[551:camerahalserver][ISP][ISP_open] - E. UserCount: 0.
<6>[   10.644188] .(4)[551:camerahalserver][ISP][ISP_open] Curr UserCount(1), (process, pid, tgid)=(camerahalserver, 551, 551), log_limit_line(150), first user
<6>[   10.647136] .(4)[551:camerahalserver][ISP][ISP_open] - X. Ret: 0. UserCount: 1. G_u4EnableClockCount:1
<7>[   10.648392] .(4)[551:camerahalserver][imgsensor]imgsensor_open 1
<7>[   10.649188] .(4)[551:camerahalserver][imgsensor][CAMERA SENSOR] CCF kdSetSensorMclk on= 1, freq= 3, TG= 0
<7>[   10.649477] .(4)[551:camerahalserver][imgsensor][CAMERA SENSOR] CCF kdSetSensorMclk on= 1, freq= 3, TG= 1
<7>[   10.649760] .(4)[551:camerahalserver][imgsensor]imgsensor_open 2
<7>[   10.649899] .(4)[551:camerahalserver][imgsensor]sensor_idx = 0, pin=9, pin_state_on=10, hw_id =2(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.649908] .(4)[551:camerahalserver][imgsensor]mclk_set : sensor_idx 0 mclk_set pinctrl, PinIdx 9, Val 10
<7>[   10.649942] .(4)[551:camerahalserver][imgsensor]sensor_idx = 0, pin=1, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.649961] .(4)[551:camerahalserver][imgsensor]sensor_idx = 0, pin=2, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.649973] .(4)[551:camerahalserver][imgsensor]sensor_idx = 0, pin=5, pin_state_on=7, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.649992] .(4)[551:camerahalserver][imgsensor]sensor_idx = 0, pin=3, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.650473] .(4)[551:camerahalserver][imgsensor]sensor_idx = 0, pin=4, pin_state_on=3, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.651945] .(4)[551:camerahalserver][imgsensor]sensor_idx = 0, pin=6, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.652519] .(0)[551:camerahalserver][imgsensor]sensor_idx = 0, pin=1, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.652576] .(0)[551:camerahalserver][imgsensor]sensor_idx = 0, pin=2, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<4>[   10.652785] .(6)[551:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   10.653634] .(6)[551:camerahalserver]it is not ov7251 it is imx258_mipi_raw 
<7>[   10.659691] .(6)[551:camerahalserver]IMX258_camera_sensor[feature_control] feature_id = 3041
<6>[   10.659874] .(6)[551:camerahalserver]i2c i2c-2: addr: 1a, transfer ACK error
<3>[   10.660897] .(6)[551:camerahalserver]I2C write failed (0x0)! speed(0=400)
<7>[   10.661793] .(6)[551:camerahalserver]IMX258_camera_sensor[get_imgsensor_id] Read sensor id fail, write id: 0x34, id: 0x0
<6>[   10.661946] .(6)[551:camerahalserver]i2c i2c-2: addr: 10, transfer ACK error
<3>[   10.662899] .(6)[551:camerahalserver]I2C write failed (0x0)! speed(0=400)
<7>[   10.663787] .(6)[551:camerahalserver]IMX258_camera_sensor[get_imgsensor_id] Read sensor id fail, write id: 0x20, id: 0x0
<7>[   10.663802] .(6)[551:camerahalserver][imgsensor]Fail to get sensor ID ffffffff
<7>[   10.663807] .(6)[551:camerahalserver][imgsensor]ERROR:imgsensor_check_is_alive(), No imgsensor alive
<7>[   10.664928] .(6)[551:camerahalserver][imgsensor][regulator]6 is enabled
<7>[   10.665008] .(6)[551:camerahalserver][imgsensor][regulator]4 is enabled
<7>[   10.665036] .(6)[551:camerahalserver][imgsensor][regulator]3 is enabled
<7>[   10.665065] .(6)[551:camerahalserver][imgsensor][regulator]5 is enabled
<7>[   10.665121] .(6)[551:camerahalserver][imgsensor]mclk_set : sensor_idx 0 mclk_set pinctrl, PinIdx 9, Val 0
<4>[   10.665132] .(6)[551:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   10.666040] .(6)[551:camerahalserver]it is not ov7251 it is imx258_mipi_raw 
<7>[   10.666964] .(6)[551:camerahalserver][imgsensor][CheckIsAlive]Profile = 17067 us
<7>[   10.667009] .(6)[551:camerahalserver][imgsensor]sensor_idx = 0, pin=9, pin_state_on=10, hw_id =2(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.667017] .(6)[551:camerahalserver][imgsensor]mclk_set : sensor_idx 0 mclk_set pinctrl, PinIdx 9, Val 10
<7>[   10.667054] .(6)[551:camerahalserver][imgsensor]sensor_idx = 0, pin=1, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.667077] .(6)[551:camerahalserver][imgsensor]sensor_idx = 0, pin=2, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.667088] .(6)[551:camerahalserver][imgsensor]sensor_idx = 0, pin=5, pin_state_on=7, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.667603] .(6)[551:camerahalserver][imgsensor]sensor_idx = 0, pin=3, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.668055] .(6)[551:camerahalserver][imgsensor]sensor_idx = 0, pin=4, pin_state_on=3, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.669478] .(6)[551:camerahalserver][imgsensor]sensor_idx = 0, pin=6, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.669933] .(6)[551:camerahalserver][imgsensor]sensor_idx = 0, pin=1, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.669995] .(6)[551:camerahalserver][imgsensor]sensor_idx = 0, pin=2, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<4>[   10.670008] .(6)[551:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   10.670851] .(6)[551:camerahalserver]it is not ov7251 it is s5k3l8_mipi_raw 
<7>[   10.676772] .(6)[551:camerahalserver]S5K3L8[feature_control] feature_id = 3041
<7>[   10.677475] .(7)[551:camerahalserver]S5K3L8[get_imgsensor_id] i2c write id: 0x5a, ReadOut sensor id: 0x30c8, imgsensor_info.sensor_id:0x30c8.
<7>[   10.677510] .(7)[551:camerahalserver][imgsensor] Sensor found ID = 0x30c8
<7>[   10.679532] .(7)[551:camerahalserver][imgsensor][regulator]6 is enabled
<7>[   10.679603] .(7)[551:camerahalserver][imgsensor][regulator]4 is enabled
<7>[   10.679631] .(7)[551:camerahalserver][imgsensor][regulator]3 is enabled
<7>[   10.679661] .(7)[551:camerahalserver][imgsensor][regulator]5 is enabled
<7>[   10.679738] .(7)[551:camerahalserver][imgsensor]mclk_set : sensor_idx 0 mclk_set pinctrl, PinIdx 9, Val 0
<4>[   10.679749] .(7)[551:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   10.680634] .(7)[551:camerahalserver]it is not ov7251 it is s5k3l8_mipi_raw 
<7>[   10.681559] .(7)[551:camerahalserver][imgsensor][CheckIsAlive]Profile = 14552 us
<7>[   10.681570] .(7)[551:camerahalserver][imgsensor][imgsensor_set_driver] :[0][1][s5k3l8_mipi_raw]
<7>[   10.681578] .(7)[551:camerahalserver]S5K3L8[feature_control] feature_id = 3107
<7>[   10.681735] .(7)[551:camerahalserver][imgsensor][CAMERA SENSOR] CAOMPAT_KDIMGSENSORIOC_X_GETINFO2
<7>[   10.681759] .(7)[551:camerahalserver][imgsensor][adopt_CAMERA_HW_GetInfo2]Entry0
<7>[   10.681769] .(7)[551:camerahalserver]S5K3L8[get_info] scenario_id = 0
<7>[   10.681775] .(7)[551:camerahalserver]S5K3L8[get_info] scenario_id = 1
<7>[   10.681779] .(7)[551:camerahalserver]S5K3L8[get_info] scenario_id = 2
<7>[   10.681784] .(7)[551:camerahalserver]S5K3L8[get_info] scenario_id = 3
<7>[   10.681788] .(7)[551:camerahalserver]S5K3L8[get_info] scenario_id = 4
<7>[   10.681795] .(7)[551:camerahalserver]S5K3L8[get_info] scenario_id = 5
<7>[   10.681799] .(7)[551:camerahalserver]S5K3L8[get_info] scenario_id = 6
<7>[   10.681803] .(7)[551:camerahalserver]S5K3L8[get_info] scenario_id = 7
<7>[   10.681808] .(7)[551:camerahalserver]S5K3L8[get_info] scenario_id = 8
<7>[   10.681812] .(7)[551:camerahalserver]S5K3L8[get_info] scenario_id = 9
<7>[   10.681817] .(7)[551:camerahalserver]S5K3L8[get_resolution] E
<7>[   10.681822] .(7)[551:camerahalserver][imgsensor][CAMERA_HW][Pre]w=0x838, h = 0x618
<7>[   10.681826] .(7)[551:camerahalserver][imgsensor][CAMERA_HW][Full]w=0x1070, h = 0xc30
<7>[   10.681831] .(7)[551:camerahalserver][imgsensor][CAMERA_HW][VD]w=0x1070, h = 0xc30
<7>[   10.681950] .(7)[551:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   10.681970] .(7)[551:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 0
<7>[   10.681982] .(7)[551:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   10.681987] .(7)[551:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 1
<7>[   10.681995] .(7)[551:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   10.682000] .(7)[551:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 2
<7>[   10.682007] .(7)[551:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   10.682012] .(7)[551:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 3
<7>[   10.682023] .(7)[551:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   10.682031] .(7)[551:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 4
<7>[   10.682039] .(7)[551:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   10.682051] .(7)[551:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 5
<7>[   10.682064] .(7)[551:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   10.682069] .(7)[551:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 6
<7>[   10.682077] .(7)[551:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   10.682092] .(7)[551:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 7
<7>[   10.682100] .(7)[551:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   10.682113] .(7)[551:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 8
<7>[   10.682126] .(7)[551:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   10.682132] .(7)[551:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 9
<7>[   10.704372] .(7)[551:camerahalserver]S5K3L8[feature_control] feature_id = 3081
<7>[   10.704407] .(7)[551:camerahalserver]S5K3L8[feature_control] SENSOR_FEATURE_GET_CROP_INFO scenarioId:1
<7>[   10.704682] .(7)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=7, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   10.704693] .(7)[551:camerahalserver]gpio_set : pinctrl err, PinIdx 7, Val 0
<7>[   10.705622] .(7)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=8, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   10.705630] .(7)[551:camerahalserver]gpio_set : pinctrl err, PinIdx 8, Val 10
<4>[   10.706574] .(7)[551:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   10.707427] .(7)[551:camerahalserver]it is not ov7251 it is 1 
<7>[   10.713203] .(7)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=9, pin_state_on=10, hw_id =2(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.713245] .(7)[551:camerahalserver][imgsensor]mclk_set : sensor_idx 1 mclk_set pinctrl, PinIdx 9, Val 10
<7>[   10.713282] .(7)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=1, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.713316] .(7)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=2, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.713330] .(7)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=5, pin_state_on=7, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.713993] .(6)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=3, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   10.714022] .(6)[551:camerahalserver][regulator]fail to regulator_set_voltage, powertype:3 powerId:2800000
<7>[   10.715261] .(6)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=4, pin_state_on=3, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.716329] .(6)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=6, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   10.716355] .(6)[551:camerahalserver][regulator]fail to regulator_set_voltage, powertype:6 powerId:2800000
<7>[   10.717706] .(6)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=1, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.717781] .(6)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=2, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<4>[   10.717795] .(6)[551:camerahalserver]it is not ov7251 is_sub_camera=0 
<6>[   10.718569] .(2)[534:vtservice][ccci1/chr]port ccci_imsdc open with flag 20002 by vtservice
<4>[   10.719706] .(6)[551:camerahalserver]it is not ov7251 it is imx258_mipi_raw 
<7>[   10.725659] .(6)[551:camerahalserver]IMX258_camera_sensor[feature_control] feature_id = 3041
<6>[   10.725990] .(6)[551:camerahalserver]i2c i2c-4: addr: 1a, transfer ACK error
<3>[   10.726960] .(6)[551:camerahalserver]I2C write failed (0x0)! speed(0=400)
<7>[   10.727844] .(6)[551:camerahalserver]IMX258_camera_sensor[get_imgsensor_id] Read sensor id fail, write id: 0x34, id: 0x0
<6>[   10.727950] .(4)[551:camerahalserver]i2c i2c-4: addr: 10, transfer ACK error
<3>[   10.728934] .(4)[551:camerahalserver]I2C write failed (0x0)! speed(0=400)
<7>[   10.729822] .(4)[551:camerahalserver]IMX258_camera_sensor[get_imgsensor_id] Read sensor id fail, write id: 0x20, id: 0x0
<7>[   10.729836] .(4)[551:camerahalserver][imgsensor]Fail to get sensor ID ffffffff
<7>[   10.729841] .(4)[551:camerahalserver][imgsensor]ERROR:imgsensor_check_is_alive(), No imgsensor alive
<3>[   10.729849] .(4)[551:camerahalserver]gpio_set : pinctrl err, PinIdx 8, Val 0
<3>[   10.730755] .(4)[551:camerahalserver]gpio_set : pinctrl err, PinIdx 7, Val 10
<4>[   10.731672] .(4)[551:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   10.732517] .(4)[551:camerahalserver]it is not ov7251 it is 1 
<7>[   10.734390] .(4)[551:camerahalserver][imgsensor][regulator]6 is enabled
<7>[   10.734466] .(4)[551:camerahalserver][imgsensor][regulator]3 is enabled
<7>[   10.734475] .(4)[551:camerahalserver][imgsensor][regulator]5 is enabled
<7>[   10.734534] .(4)[551:camerahalserver][imgsensor]mclk_set : sensor_idx 1 mclk_set pinctrl, PinIdx 9, Val 0
<4>[   10.734545] .(4)[551:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   10.735417] .(4)[551:camerahalserver]it is not ov7251 it is imx258_mipi_raw 
<7>[   10.736356] .(4)[551:camerahalserver][imgsensor][CheckIsAlive]Profile = 31676 us
<7>[   10.736376] .(4)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=7, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   10.736383] .(4)[551:camerahalserver]gpio_set : pinctrl err, PinIdx 7, Val 0
<7>[   10.737351] .(4)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=8, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   10.737368] .(4)[551:camerahalserver]gpio_set : pinctrl err, PinIdx 8, Val 10
<4>[   10.738291] .(4)[551:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   10.739199] .(4)[551:camerahalserver]it is not ov7251 it is 1 
<7>[   10.745115] .(4)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=9, pin_state_on=10, hw_id =2(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.745146] .(4)[551:camerahalserver][imgsensor]mclk_set : sensor_idx 1 mclk_set pinctrl, PinIdx 9, Val 10
<7>[   10.745183] .(4)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=1, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.745205] .(4)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=2, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.745218] .(4)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=5, pin_state_on=7, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.745665] .(4)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=3, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   10.745683] .(4)[551:camerahalserver][regulator]fail to regulator_set_voltage, powertype:3 powerId:2800000
<7>[   10.746941] .(4)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=4, pin_state_on=3, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.747983] .(4)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=6, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   10.748005] .(4)[551:camerahalserver][regulator]fail to regulator_set_voltage, powertype:6 powerId:2800000
<7>[   10.749310] .(4)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=1, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.749380] .(4)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=2, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<4>[   10.749404] .(4)[551:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   10.750243] .(4)[551:camerahalserver]it is not ov7251 it is s5k3l8_mipi_raw 
<7>[   10.756158] .(4)[551:camerahalserver]S5K3L8[feature_control] feature_id = 3041
<6>[   10.756353] .(4)[551:camerahalserver]i2c i2c-4: addr: 2d, transfer ACK error
<3>[   10.757392] .(4)[551:camerahalserver]I2C read failed (0x0)! speed(0=400)
<6>[   10.758454] .(4)[551:camerahalserver]i2c i2c-4: addr: 2d, transfer ACK error
<3>[   10.759402] .(4)[551:camerahalserver]I2C read failed (0x0)! speed(0=400)
<7>[   10.760324] .(4)[551:camerahalserver]S5K3L8[get_imgsensor_id] Read sensor id fail, i2c write id: 0x5a, ReadOut sensor id: 0x0, imgsensor_info.sensor_id:0x30c8.
<6>[   10.760478] .(4)[551:camerahalserver]i2c i2c-4: addr: 2d, transfer ACK error
<3>[   10.761507] .(4)[551:camerahalserver]I2C read failed (0x0)! speed(0=400)
<6>[   10.762525] .(4)[551:camerahalserver]i2c i2c-4: addr: 2d, transfer ACK error
<3>[   10.763478] .(4)[551:camerahalserver]I2C read failed (0x0)! speed(0=400)
<7>[   10.764383] .(4)[551:camerahalserver]S5K3L8[get_imgsensor_id] Read sensor id fail, i2c write id: 0x5a, ReadOut sensor id: 0x0, imgsensor_info.sensor_id:0x30c8.
<7>[   10.764398] .(4)[551:camerahalserver][imgsensor]Fail to get sensor ID ffffffff
<7>[   10.764403] .(4)[551:camerahalserver][imgsensor]ERROR:imgsensor_check_is_alive(), No imgsensor alive
<3>[   10.764410] .(4)[551:camerahalserver]gpio_set : pinctrl err, PinIdx 8, Val 0
<3>[   10.764739] .(2)[525:main]BOOTPROF:     10764.736794:Zygote:Preload Start
<3>[   10.766250] .(4)[551:camerahalserver]gpio_set : pinctrl err, PinIdx 7, Val 10
<4>[   10.767195] .(4)[551:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   10.768058] .(4)[551:camerahalserver]it is not ov7251 it is 1 
<7>[   10.769921] .(4)[551:camerahalserver][imgsensor][regulator]6 is enabled
<7>[   10.769977] .(4)[551:camerahalserver][imgsensor][regulator]3 is enabled
<7>[   10.769985] .(4)[551:camerahalserver][imgsensor][regulator]5 is enabled
<7>[   10.770039] .(4)[551:camerahalserver][imgsensor]mclk_set : sensor_idx 1 mclk_set pinctrl, PinIdx 9, Val 0
<4>[   10.770053] .(4)[551:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   10.770915] .(4)[551:camerahalserver]it is not ov7251 it is s5k3l8_mipi_raw 
<7>[   10.771823] .(4)[551:camerahalserver][imgsensor][CheckIsAlive]Profile = 35446 us
<7>[   10.771835] .(4)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=7, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   10.771841] .(4)[551:camerahalserver]gpio_set : pinctrl err, PinIdx 7, Val 0
<7>[   10.772776] .(4)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=8, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   10.772789] .(4)[551:camerahalserver]gpio_set : pinctrl err, PinIdx 8, Val 10
<4>[   10.773767] .(4)[551:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   10.774610] .(4)[551:camerahalserver]it is not ov7251 it is 1 
<7>[   10.780369] .(4)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=9, pin_state_on=10, hw_id =2(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.780391] .(4)[551:camerahalserver][imgsensor]mclk_set : sensor_idx 1 mclk_set pinctrl, PinIdx 9, Val 10
<7>[   10.780430] .(4)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=3, pin_state_on=8, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   10.780442] .(4)[551:camerahalserver][regulator]fail to regulator_set_voltage, powertype:3 powerId:2500000
<7>[   10.782437] .(7)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=5, pin_state_on=7, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.782472] .(7)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=4, pin_state_on=2, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.782527] .(7)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=6, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   10.782535] .(7)[551:camerahalserver][regulator]fail to regulator_set_voltage, powertype:6 powerId:2800000
<7>[   10.783769] .(7)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=1, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.783807] .(7)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=1, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.783824] .(7)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=2, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.784843] .(7)[551:camerahalserver][imgsensor]sensor_idx = 1, pin=2, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<4>[   10.784890] .(7)[551:camerahalserver]it is ov7251 is_sub_camera=1 
<4>[   10.785691] .(7)[551:camerahalserver]OV7251_power_on 1
<4>[   10.786358] .(7)[551:camerahalserver]scanner 3v3 enable:1
<6>[   10.823874] .(0)[590:mtk_agpsd][ccci1/chr]port ccci_c2k_agps open with flag 20902 by mtk_agpsd
<6>[   10.843175] .(7)[551:camerahalserver][D][Factory Data](property_get): (offset = 7)
<6>[   10.844164] .(7)[551:camerahalserver][D][Factory Data](dl_factory_get_element_type): (id=6)+
<6>[   10.845295] .(7)[551:camerahalserver][D][Factory Data](_factory_get_element_type): (id=6)+
<6>[   10.846382] .(7)[551:camerahalserver][D][Factory Data](_get_factory_item): (id=6)+
<6>[   10.847349] .(7)[551:camerahalserver][D][Factory Data](_factory_get_element_type): (id=6): type = 3
<6>[   10.848536] .(7)[551:camerahalserver][D][Factory Data](dl_factory_get_element_num): (id=6)+
<6>[   10.849706] .(7)[551:camerahalserver][D][Factory Data](_factory_get_element_num): (id=6)+
<6>[   10.850781] .(7)[551:camerahalserver][D][Factory Data](_get_factory_item): (id=6)+
<6>[   10.851776] .(7)[551:camerahalserver][D][Factory Data](_factory_get_element_num): (id=6): elements = 1
<6>[   10.852991] .(7)[551:camerahalserver][D][Factory Data](dl_factory_get_value): +
<6>[   10.853927] .(7)[551:camerahalserver][D][Factory Data](_factory_get_value): [id=6,index=0] +
<6>[   10.855051] .(7)[551:camerahalserver][D][Factory Data](_get_factory_item): (id=6)+
<6>[   10.856015] .(7)[551:camerahalserver][D][Factory Data](_factory_get_value_from_memory): [id=6,index=0] +
<6>[   10.857285] .(7)[551:camerahalserver][D][Factory Data](_factory_get_value_from_memory): -
<6>[   10.858352] .(7)[551:camerahalserver][D][Factory Data](_factory_get_value): [id=6,index=0] value=16 -
<6>[   10.859535] .(7)[551:camerahalserver][D][Factory Data](property_get): els: 1, i 1, written 3
<4>[   10.860665] .(7)[551:camerahalserver][stm32]This is an EL engine!!! 
<6>[   10.861495] .(7)[551:camerahalserver]OV72512LANE[ov7251_init] E
<4>[   10.862264] .(7)[551:camerahalserver]hehai ov7251 id = 7750 
<7>[   10.862994] .(7)[551:camerahalserver][imgsensor] Sensor found ID = 0x7750
<3>[   10.863007] .(7)[551:camerahalserver]gpio_set : pinctrl err, PinIdx 8, Val 0
<3>[   10.863918] .(7)[551:camerahalserver]gpio_set : pinctrl err, PinIdx 7, Val 10
<4>[   10.864860] .(7)[551:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   10.865716] .(7)[551:camerahalserver]it is not ov7251 it is 1 
<7>[   10.867529] .(7)[551:camerahalserver][imgsensor][regulator]6 is enabled
<7>[   10.867559] .(7)[551:camerahalserver][imgsensor][regulator]5 is enabled
<7>[   10.867569] .(7)[551:camerahalserver][imgsensor][regulator]3 is enabled
<7>[   10.867603] .(7)[551:camerahalserver][imgsensor]mclk_set : sensor_idx 1 mclk_set pinctrl, PinIdx 9, Val 0
<4>[   10.867613] .(7)[551:camerahalserver]it is ov7251 is_sub_camera=1 
<4>[   10.868444] .(7)[551:camerahalserver]OV7251_power_off 1
<4>[   10.869161] .(7)[551:camerahalserver]scanner 3v3 enable:0
<6>[   10.870468] .(2)[409:wfca][ccci1/chr]port ccci_imsa close rx_len=0 empty=1, clear_cnt=0, drop=0
<6>[   10.871641] .(2)[409:wfca][ccci1/pot]critical user check: 0x1
<7>[   10.872412] .(4)[551:camerahalserver][imgsensor][CheckIsAlive]Profile = 100574 us
<7>[   10.872453] .(4)[551:camerahalserver][imgsensor][imgsensor_set_driver] :[1][2][ov7251]
<6>[   10.872534] .(2)[409:wfca][ccci1/chr]port ccci_imsa open with flag 20002 by wfca
<7>[   10.872808] .(4)[551:camerahalserver][imgsensor][CAMERA SENSOR] CAOMPAT_KDIMGSENSORIOC_X_GETINFO2
<7>[   10.872820] .(4)[551:camerahalserver][imgsensor][adopt_CAMERA_HW_GetInfo2]Entry1
<6>[   10.872830] .(4)[551:camerahalserver]OV72512LANE[get_info] scenario_id = 0
<6>[   10.872836] .(4)[551:camerahalserver]OV72512LANE[get_info] scenario_id = 1
<6>[   10.872839] .(4)[551:camerahalserver]OV72512LANE[get_info] scenario_id = 2
<6>[   10.872841] .(4)[551:camerahalserver]OV72512LANE[get_info] scenario_id = 3
<6>[   10.872844] .(4)[551:camerahalserver]OV72512LANE[get_info] scenario_id = 4
<6>[   10.872855] .(4)[551:camerahalserver]OV72512LANE[get_info] scenario_id = 5
<6>[   10.872863] .(4)[551:camerahalserver]OV72512LANE[get_info] scenario_id = 6
<6>[   10.872866] .(4)[551:camerahalserver]OV72512LANE[get_info] scenario_id = 7
<6>[   10.872868] .(4)[551:camerahalserver]OV72512LANE[get_info] scenario_id = 8
<6>[   10.872870] .(4)[551:camerahalserver]OV72512LANE[get_info] scenario_id = 9
<6>[   10.872874] .(4)[551:camerahalserver]OV72512LANE[get_resolution] E
<7>[   10.872878] .(4)[551:camerahalserver][imgsensor][CAMERA_HW][Pre]w=0x280, h = 0x1e0
<7>[   10.872883] .(4)[551:camerahalserver][imgsensor][CAMERA_HW][Full]w=0x280, h = 0x1e0
<7>[   10.872889] .(4)[551:camerahalserver][imgsensor][CAMERA_HW][VD]w=0x280, h = 0x1e0
<6>[   10.873002] .(4)[551:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 0
<6>[   10.873012] .(4)[551:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 1
<6>[   10.873017] .(4)[551:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 2
<6>[   10.873022] .(4)[551:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 3
<6>[   10.873027] .(4)[551:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 4
<6>[   10.873032] .(4)[551:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 5
<6>[   10.873036] .(4)[551:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 6
<6>[   10.873041] .(4)[551:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 7
<6>[   10.873046] .(4)[551:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 8
<6>[   10.873051] .(4)[551:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 9
<6>[   10.901052] .(4)[551:camerahalserver]OV72512LANE[feature_control] SENSOR_FEATURE_GET_CROP_INFO scenarioId:1
<7>[   10.902432] .(4)[551:camerahalserver][imgsensor][CAMERA SENSOR] CCF kdSetSensorMclk on= 0, freq= 3, TG= 0
<7>[   10.902814] .(4)[551:camerahalserver][imgsensor][CAMERA SENSOR] CCF kdSetSensorMclk on= 0, freq= 3, TG= 1
<6>[   10.903193] .(4)[551:camerahalserver][ISP][ISP_release] - E. UserCount: 1.
<6>[   10.904082] .(4)[551:camerahalserver][ISP][ISP_release] Curr UserCount(0), (process, pid, tgid)=(camerahalserver, 551, 551), log_limit_line(0),	last user
<6>[   10.906026] [ISP][ISP_release] - X. UserCount: 0. G_u4EnableClockCount:0<7>[   10.906910] .(4)[551:camerahalserver][imgsensor]imgsensor_release 1
<7>[   10.907106] .(4)[551:camerahalserver][imgsensor]imgsensor_release 0
<3>[   11.154761] .(7)[526:main]BOOTPROF:     11154.759872:Zygote:Preload End
<6>[   11.207177] .(5)[866:initCamdevice][ISP][ISP_open] - E. UserCount: 0.
<6>[   11.208054] .(5)[866:initCamdevice][ISP][ISP_open] Curr UserCount(1), (process, pid, tgid)=(initCamdevice, 866, 551), log_limit_line(150), first user
<6>[   11.210836] .(5)[866:initCamdevice][ISP][ISP_open] - X. Ret: 0. UserCount: 1. G_u4EnableClockCount:1
<7>[   11.212228] .(5)[866:initCamdevice][imgsensor]imgsensor_open 1
<7>[   11.212876] .(5)[866:initCamdevice][imgsensor]imgsensor_open 2
<7>[   11.212986] .(5)[866:initCamdevice][imgsensor][CAMERA SENSOR] CCF kdSetSensorMclk on= 1, freq= 3, TG= 0
<7>[   11.213364] .(5)[866:initCamdevice][imgsensor]sensor_idx = 0, pin=9, pin_state_on=10, hw_id =2(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.213378] .(5)[866:initCamdevice][imgsensor]mclk_set : sensor_idx 0 mclk_set pinctrl, PinIdx 9, Val 10
<7>[   11.213411] .(5)[866:initCamdevice][imgsensor]sensor_idx = 0, pin=1, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.213435] .(5)[866:initCamdevice][imgsensor]sensor_idx = 0, pin=2, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.213446] .(5)[866:initCamdevice][imgsensor]sensor_idx = 0, pin=5, pin_state_on=7, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.213888] .(6)[866:initCamdevice][imgsensor]sensor_idx = 0, pin=3, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.214322] .(6)[866:initCamdevice][imgsensor]sensor_idx = 0, pin=4, pin_state_on=3, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.215768] .(7)[866:initCamdevice][imgsensor]sensor_idx = 0, pin=6, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.216236] .(7)[866:initCamdevice][imgsensor]sensor_idx = 0, pin=1, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.216286] .(7)[866:initCamdevice][imgsensor]sensor_idx = 0, pin=2, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<4>[   11.216299] .(7)[866:initCamdevice]it is not ov7251 is_sub_camera=0 
<4>[   11.217170] .(7)[866:initCamdevice]it is not ov7251 it is s5k3l8_mipi_raw 
<7>[   11.228068] .(7)[866:initCamdevice][imgsensor][kdCISModulePowerOn]Profile = 14708 us
<7>[   11.228102] .(7)[866:initCamdevice]S5K3L8[open] S5K3L8,MIPI 4LANE
<7>[   11.228567] .(0)[866:initCamdevice]S5K3L8[open] i2c write id: 0x5a, sensor id: 0x30c8
<7>[   11.228703] .(7)[866:initCamdevice]S5K3L8[sensor_init] E
<14>[   11.248706] .(0)[1:init]init: Command 'wait /only_for_timeout 1' action=mtk.md1.status=ready (/vendor/etc/init/init.volte_imsm_93.rc:10) returned -1 took 1005ms.
<14>[   11.251242] .(0)[1:init]init: starting service 'aee_aed'...
<14>[   11.254748] .(0)[1:init]init: starting service 'aee_aed64'...
<14>[   11.258260] .(0)[1:init]init: starting service 'aee_aedv'...
<14>[   11.262790] .(0)[1:init]init: starting service 'aee_aedv64'...
<14>[   11.267603] .(6)[1:init]init: PropSet [ril.muxreport.run]=[0] Done
<14>[   11.268929] .(6)[1:init]init: processing action (mtk.md1.status=ready && persist.mtk_epdg_support=1) from (/vendor/etc/init/init.wod.rc:16)
<14>[   11.270800] .(6)[1:init]init: PropSet [ril.epdg.interface.ctrl]=[1] Done
<14>[   11.272436] .(6)[1:init]init: PropSet [debug.mdlogger.Running]=[0] Done
<14>[   11.274883] .(6)[1:init]init: starting service 'epdg_wod'...
<14>[   11.279078] .(6)[1:init]init: PropSet [af.speech.shm_init]=[1] Done
<14>[   11.281234] .(4)[873:init]init: Created socket '/dev/socket/wod_action', mode 660, user 0, group 1000
<14>[   11.288783] .(5)[873:init]init: Created socket '/dev/socket/wod_sim', mode 660, user 0, group 1000
<14>[   11.314696] .(6)[1:init]init: PropSet [ril.mux.ee.md1]=[0] Done
<14>[   11.317991] .(6)[1:init]init: PropSet [debug.mdl.run.folder]=[] Done
<6>[   11.318174] .(7)[778:gsm0710muxd][ccci1/chr]port ttyC0 open with flag 20902 by gsm0710muxd
<14>[   11.322007] .(6)[1:init]init: PropSet [af.modem_1.epof]=[0] Done
<7>[   11.323320] .(5)[866:initCamdevice][ccu][ccu_set_sensor_info] ccu catch Main sensor i2c slave address : 0x5a
<7>[   11.323350] .(5)[866:initCamdevice][ccu][ccu_set_sensor_info] ccu catch Main sensor name : s5k3l8_mipi_raw
<7>[   11.323366] .(5)[866:initCamdevice][imgsensor][SensorOpen]Profile = 110009 us
<7>[   11.324521] .(4)[864:HwBinder:551_2]CAM_CAL_DRV[EEPROM_drv_open] EEPROM_drv_open start
<14>[   11.324746] .(6)[1:init]init: PropSet [debug.mtk.aee.status64]=[free] Done
<7>[   11.326589] .(4)[864:HwBinder:551_2]CAM_CAL_DRV[EEPROM_drv_ioctl] CAM_CALIOC_G_READ start! offset=4, length=1
<7>[   11.326612] .(4)[864:HwBinder:551_2]CAM_CAL_DRV[EEPROM_set_i2c_bus] EEPROM_set_i2c_bus end! deviceID=1 g_curBusIdx=0 g_Current_Client=ffffffc05c210000
<7>[   11.326618] .(4)[864:HwBinder:551_2]CAM_CAL_DRV[EEPROM_drv_ioctl] SensorID=30c8 DeviceID=1
<7>[   11.326637] .(4)[864:HwBinder:551_2]CAM_CAL_DRV[EEPROM_get_cmd_info_ex] g_camCalDrvInfo[0].sensorID == 0, start get_cmd_info!
<7>[   11.326643] .(4)[864:HwBinder:551_2]CAM_CAL_DRV[EEPROM_get_cmd_info] pCamCalList!=NULL && pCamCalFunc!= NULL
<7>[   11.326648] .(4)[864:HwBinder:551_2]CAM_CAL_DRV[EEPROM_get_cmd_info] pCamCalList[4].sensorID==30c8
<7>[   11.326654] .(4)[864:HwBinder:551_2]CAM_CAL_DRV[EEPROM_get_cmd_info] g_Current_Client->addr =50
<7>[   11.326658] .(4)[864:HwBinder:551_2]CAM_CAL_DRV[EEPROM_get_cmd_info] 20 client=ffffffc05c210000 client2=ffffffc05c307c00 client3=          (null) Cur=ffffffc05c210000
<7>[   11.326936] .(0)[864:HwBinder:551_2]cam_cal_list[cam_cal_check_mtk_cid] calibrationID = 23
<7>[   11.326977] .(0)[864:HwBinder:551_2]cam_cal_list[cam_cal_check_mtk_cid] mtkCidList[0] == 23
<7>[   11.326988] .(0)[864:HwBinder:551_2]cam_cal_list[cam_cal_check_mtk_cid] ret =1
<7>[   11.326995] .(0)[864:HwBinder:551_2]CAM_CAL_DRV[EEPROM_get_cmd_info] pCamCalList[4].checkFunc ok!
<7>[   11.327004] .(0)[864:HwBinder:551_2]CAM_CAL_DRV[EEPROM_get_cmd_info_ex] deviceID=1, SensorID=30c8
<7>[   11.327303] .(0)[864:HwBinder:551_2]CAM_CAL_DRV[EEPROM_drv_open] EEPROM_drv_open start
<14>[   11.327476] .(6)[1:init]init: PropSet [debug.mtk.aee.vstatus64]=[free] Done
<7>[   11.329720] .(0)[864:HwBinder:551_2]CAM_CAL_DRV[EEPROM_drv_ioctl] CAM_CALIOC_G_READ start! offset=32, length=2
<7>[   11.329756] .(0)[864:HwBinder:551_2]CAM_CAL_DRV[EEPROM_set_i2c_bus] EEPROM_set_i2c_bus end! deviceID=1 g_curBusIdx=0 g_Current_Client=ffffffc05c210000
<7>[   11.329764] .(0)[864:HwBinder:551_2]CAM_CAL_DRV[EEPROM_drv_ioctl] SensorID=30c8 DeviceID=1
<7>[   11.330211] .(4)[864:HwBinder:551_2]CAM_CAL_DRV[EEPROM_drv_ioctl] CAM_CALIOC_G_READ start! offset=34, length=1868
<7>[   11.330239] .(4)[864:HwBinder:551_2]CAM_CAL_DRV[EEPROM_set_i2c_bus] EEPROM_set_i2c_bus end! deviceID=1 g_curBusIdx=0 g_Current_Client=ffffffc05c210000
<7>[   11.330246] .(4)[864:HwBinder:551_2]CAM_CAL_DRV[EEPROM_drv_ioctl] SensorID=30c8 DeviceID=1
<14>[   11.330663] .(6)[1:init]init: PropSet [debug.mdl.EE.folder]=[] Done
<14>[   11.333297] .(6)[1:init]init: PropSet [debug.mtk.aee.status64]=[free] Done
<14>[   11.336053] .(6)[1:init]init: PropSet [debug.mtk.aee.vstatus64]=[free] Done
<14>[   11.339156] .(6)[1:init]init: PropSet [debug.pullmdlog]=[] Done
<14>[   11.341653] .(6)[1:init]init: PropSet [debug.mtk.aee.status]=[free] Done
<14>[   11.344509] .(6)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[free] Done
<14>[   11.348050] .(6)[1:init]init: PropSet [debug.mdl.EE.done]=[] Done
<6>[   11.349828] .(1)[775:emdlogger1][ccci1/chr]port ccci_ccb_dhl open with flag 20002 by emdlogger1
<14>[   11.350724] .(6)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[free] Done
<6>[   11.351890] .(1)[775:emdlogger1][ccci1/shm]smem_port->addr_phy=7c000000
<14>[   11.352301] .(6)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[dumping] Done
<6>[   11.354030] .(1)[775:emdlogger1][ccci1/chr]remap addr:0x7c000000 len:2097152  map-len:2097152
<7>[   11.354325] .(2)[891:aee_aedv][KL_ENV]get env name=forceencrypt_config
<4>[   11.354334] .(2)[891:aee_aedv][KL_ENV]cann't find name=forceencrypt_config
<6>[   11.356229] .(1)[775:emdlogger1][ccci1/chr]port ccci_ccb_ctrl open with flag 20002 by emdlogger1
<6>[   11.357991] .(1)[775:emdlogger1][ccci1/shm]ccb_configs_len: 20
<6>[   11.359009] .(1)[775:emdlogger1][ccci1/shm]find ccb port ccci_ccb_dhl for user1!
<6>[   11.360034] .(1)[775:emdlogger1][ccci1/chr]remap control addr:0x80018000 len:4096  map-len:4096
<6>[   11.361227] .(1)[775:emdlogger1][ccci1/chr]remap succeed 80018, 0x80018000 -> 0x76545cc000
<7>[   11.362096] .(2)[891:aee_aedv][KL_ENV]get env name=forceencrypt_config
<4>[   11.362109] .(2)[891:aee_aedv][KL_ENV]cann't find name=forceencrypt_config
<6>[   11.364421] .(1)[775:emdlogger1][ccci1/chr]port ccci_raw_dhl open with flag 20002 by emdlogger1
<6>[   11.365844] .(7)[775:emdlogger1][ccci1/shm]smem_port->addr_phy=7c200000
<6>[   11.366900] .(7)[775:emdlogger1][ccci1/chr]remap addr:0x7c200000 len:20971520  map-len:20971520
<14>[   11.369007] .(6)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[free] Done
<14>[   11.380583] .(4)[1:init]init: [PropSet]: pid:778 uid:0 gid:1001 ctl.stop, ril-daemon
<11>[   11.381796] .(4)[1:init]init: no such service 'ril-daemon'
<14>[   11.383351] .(7)[1:init]init: PropSet [ril.mtk]=[1] Done
<14>[   11.385991] .(7)[1:init]init: processing action (ril.mtk=1) from (/vendor/etc/init/rild.rc:12)
<14>[   11.388514] .(7)[1:init]init: starting service 'ril-daemon-mtk'...
<14>[   11.391985] .(7)[1:init]init: PropSet [debug.mdlogger.log2sd.path]=[internal_sd] Done
<14>[   11.393250] .(6)[908:init]init: Created socket '/dev/socket/sap_uim_socket1', mode 660, user 1002, group 1002
<14>[   11.397902] .(6)[908:init]init: Created socket '/dev/socket/rild-oem', mode 660, user 1001, group 1000
<14>[   11.398639] .(3)[1:init]init: PropSet [debug.mdl.sdswap.path]=[/mnt/sdcard] Done
<14>[   11.401341] .(5)[1:init]init: PropSet [debug.mdlogger.log2sd.path]=[internal_sd] Done
<14>[   11.402991] .(6)[908:init]init: Created socket '/dev/socket/volte_imsvt1', mode 660, user 0, group 1001
<14>[   11.404289] .(5)[1:init]init: PropSet [debug.mdl.sdswap.path]=[/mnt/sdcard] Done
<14>[   11.409899] .(5)[1:init]init: PropSet [debug.mdl.run.folder]=[/data/mdlog/bootupLog/mdlog1] Done
<14>[   11.412970] .(5)[1:init]init: PropSet [debug.mdl.EE.folder]=[] Done
<14>[   11.421473] .(7)[1:init]init: PropSet [debug.mdlogger.log2sd.path]=[internal_sd] Done
<14>[   11.424298] .(7)[1:init]init: PropSet [debug.mdl.sdswap.path]=[/mnt/sdcard] Done
<3>[   11.454467] .(2)[864:HwBinder:551_2][Cooler_NR]clNR_status_open 153
<3>[   11.455342] .(2)[864:HwBinder:551_2][Cooler_NR]clNR_status_mmap 94
<3>[   11.456150] .(2)[864:HwBinder:551_2][Cooler_NR]clNR_status_mmap 99
<7>[   11.459680] .(2)[864:HwBinder:551_2]S5K3L8[feature_control] feature_id = 3081
<7>[   11.459707] .(2)[864:HwBinder:551_2]S5K3L8[feature_control] SENSOR_FEATURE_GET_CROP_INFO scenarioId:0
<7>[   11.459726] .(2)[864:HwBinder:551_2]S5K3L8[feature_control] feature_id = 3081
<7>[   11.459732] .(2)[864:HwBinder:551_2]S5K3L8[feature_control] SENSOR_FEATURE_GET_CROP_INFO scenarioId:1
<7>[   11.459743] .(2)[864:HwBinder:551_2]S5K3L8[feature_control] feature_id = 3081
<7>[   11.459749] .(2)[864:HwBinder:551_2]S5K3L8[feature_control] SENSOR_FEATURE_GET_CROP_INFO scenarioId:2
<7>[   11.459759] .(2)[864:HwBinder:551_2]S5K3L8[feature_control] feature_id = 3081
<7>[   11.459765] .(2)[864:HwBinder:551_2]S5K3L8[feature_control] SENSOR_FEATURE_GET_CROP_INFO scenarioId:3
<7>[   11.459776] .(2)[864:HwBinder:551_2]S5K3L8[feature_control] feature_id = 3081
<7>[   11.459782] .(2)[864:HwBinder:551_2]S5K3L8[feature_control] SENSOR_FEATURE_GET_CROP_INFO scenarioId:4
<36>[   11.469257] .(3)[362:logd.auditd]type=1400 audit(1578635492.009:33): avc: denied { read } for pid=774 comm="bip" name="u:object_r:net_dns_prop:s0" dev="tmpfs" ino=8180 scontext=u:r:bip:s0 tcontext=u:object_r:net_dns_prop:s0 tclass=file permissive=0
<36>[   11.472151] .(3)[362:logd.auditd]type=1400 audit(1578635493.233:34): avc: denied { add_name } for pid=551 comm="HwBinder:551_2" name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<7>[   11.486974] .(0)[864:HwBinder:551_2]S5K3L8[feature_control] feature_id = 3059
<7>[   11.486998] .(0)[864:HwBinder:551_2]S5K3L8[get_default_framerate_by_scenario] scenario_id = 0
<7>[   11.487088] .(0)[864:HwBinder:551_2]flashlight: flashlight_open: Open(0,0,0)
<7>[   11.487097] .(0)[864:HwBinder:551_2]flashlight: flashlight_open: Open(0,1,0)
<7>[   11.487112] .(0)[864:HwBinder:551_2]flashlight: _flashlight_ioctl: FLASH_IOC_GET_PART_ID(0,0,0): 1
<7>[   11.487125] .(0)[864:HwBinder:551_2]flashlight: flashlight_release: Release(0,0,0)
<7>[   11.487136] .(0)[864:HwBinder:551_2]flashlight: flashlight_release: Release(0,1,0)
<7>[   11.487440] .(0)[864:HwBinder:551_2]flashlight: flashlight_open: Open(0,0,0)
<7>[   11.487451] .(0)[864:HwBinder:551_2]flashlight: flashlight_open: Open(0,1,0)
<7>[   11.487463] .(0)[864:HwBinder:551_2]flashlight: _flashlight_ioctl: FLASHLIGHTIOC_X_SET_DRIVER(0,0,0): 1
<6>[   11.487473] .(0)[864:HwBinder:551_2]flashlights_mt6370: mt6370_set_driver: Set driver: 1
<7>[   11.488534] .(0)[864:HwBinder:551_2]flashlight: _flashlight_ioctl: FLASHLIGHTIOC_X_SET_DRIVER(0,1,0): 1
<6>[   11.488553] .(0)[864:HwBinder:551_2]flashlights_mt6370: mt6370_set_driver: Set driver: 2
<14>[   11.496917] .(4)[1:init]init: PropSet [trustkernel.log.state]=[ready] Done
<14>[   11.499484] .(4)[1:init]init: processing action (trustkernel.log.state=ready) from (/vendor/etc/init/trustkernel.rc:23)
<3>[   11.501340] .(4)[1:init]BOOTPROF:     11501.338103:tkcore: prep log
<14>[   11.502750] .(4)[1:init]init: PropSet [trustkernel.log.state]=[enable] Done
<7>[   11.526366] .(6)[864:HwBinder:551_2]flashlight: _flashlight_ioctl: FLASH_IOC_SET_ONOFF(0,0,0): 0
<7>[   11.526400] .(6)[864:HwBinder:551_2]flashlights_mt6370: mt6370_ioctl: FLASH_IOC_SET_ONOFF(0): 0
<7>[   11.526411] .(6)[864:HwBinder:551_2]flashlight: _flashlight_ioctl: FLASH_IOC_SET_ONOFF(0,1,0): 0
<7>[   11.526421] .(6)[864:HwBinder:551_2]flashlights_mt6370: mt6370_ioctl: FLASH_IOC_SET_ONOFF(1): 0
<6>[   11.526651] .(3)[864:HwBinder:551_2]mt6370_pmu_fled mt6370_pmu_fled.0: set to off mode
<5>[   11.527483] .(2)[413:vendor.mediatek][Power/PPM] (0x0)(-1)(0)(0-7)(15)(0)(4)(4) (15)(0)(4)(4) 
<6>[   11.532711] .(4)[864:HwBinder:551_2]mt6370_pmu_fled mt6370_pmu_fled.1: set to off mode
<7>[   11.533877] .(4)[864:HwBinder:551_2]flashlight: _flashlight_ioctl: FLASHLIGHTIOC_X_SET_DRIVER(0,0,0): 0
<6>[   11.533913] .(4)[864:HwBinder:551_2]flashlights_mt6370: mt6370_set_driver: Unset driver: 1
<7>[   11.536241] .(1)[864:HwBinder:551_2]flashlight: _flashlight_ioctl: FLASHLIGHTIOC_X_SET_DRIVER(0,1,0): 0
<6>[   11.536285] .(1)[864:HwBinder:551_2]mt6370_pmu_fled mt6370_pmu_fled.0: set to off mode
<6>[   11.545644] .(1)[864:HwBinder:551_2]mt6370_pmu_fled mt6370_pmu_fled.1: set to off mode
<6>[   11.546681] .(1)[864:HwBinder:551_2]flashlights_mt6370: mt6370_set_driver: Unset driver: 0
<7>[   11.547818] .(1)[864:HwBinder:551_2]flashlight: flashlight_release: Release(0,0,0)
<7>[   11.547843] .(1)[864:HwBinder:551_2]flashlight: flashlight_release: Release(0,1,0)
<4>[   11.549721] .(1)[222:battery_thread]=====FG===== SOC  = 100
<5>[   11.550471] .(1)[222:battery_thread][read_boot_battery_plug_out_status] rtc_invalid 0 plugout 0 bat_plug_out_time 0 sp0:0x60 sp3:0xe4 1 1
<4>[   11.552895] .(1)[222:battery_thread]=====FG===== AC   = -232
<4>[   11.555471] -(1)[222:battery_thread]mt6356_get_auxadc_value: 15 callbacks suppressed
<7>[   11.555485] .(1)[222:battery_thread][mt6356_get_auxadc_value]222 ch_idx = 10, channel = 1, reg_val = 0x6500, adc_result = 4260
<7>[   11.558094] .(2)[222:battery_thread][mt6356_get_auxadc_value]222 ch_idx = 1, channel = 2, reg_val = 0x474, adc_result = 500
<4>[   11.560168] .(1)[0:swapper/1]Power/swap DP: No enter --- SODI3: No enter --- SODI: No enter --- 
<4>[   11.560674] .(2)[0:swapper/2]mcdi cpu: 0, 0, 0, 1, 28, 61, 37, 101, cluster : 0, 1, pause = 0, multi core = 0, residency = 0, last core = 0, avail cpu = 00ff, cluster = 0003, enabled = 1, max_s_state = 5 (buck_off = 0), system_idle_hint = 00000000
<4>[   11.560674] 
<4>[   11.564818] .(1)[222:battery_thread]=====FG===== AC   = -232
<7>[   11.565619] .(1)[222:battery_thread][mt6356_get_auxadc_value]111 ch_idx = 2, channel = 3, bat_cur = 232, reg_val = 0x39d, adc_result = 812
<5>[   11.565863] .(1)[222:battery_thread]car[-12,130,-148,269,-147] c:0 -232 vbat:4260 vbus:4730 soc:100 100 gm3:0 0 0 0
<5>[   11.567456] .(1)[222:battery_thread]tmp:25 65535 65535 hcar2:278 lcar2:138 time:11 sw_iavg:0 23 1 nafg_m:0 0 0
<5>[   11.569145] .(2)[403:fuelgauged]MTK_FG: get_kernel_cmd:1 0
<6>[   11.570095] .(1)[222:battery_thread][I][Factory Data](read_config_partition): OK
<7>[   11.573064] .(1)[403:fuelgauged][mt6356_get_auxadc_value]222 ch_idx = 10, channel = 1, reg_val = 0x6529, adc_result = 4267
<4>[   11.573099] .(1)[403:fuelgauged]=====FG-MTK===== bat_vol=4267
<7>[   11.575286] .(6)[864:HwBinder:551_2][imgsensor][CAMERA SENSOR] CCF kdSetSensorMclk on= 0, freq= 3, TG= 0
<7>[   11.575604] .(6)[864:HwBinder:551_2]S5K3L8[close] E
<4>[   11.576398] .(3)[403:fuelgauged]=====FG===== AC   = -232
<7>[   11.576684] .(6)[864:HwBinder:551_2][imgsensor][regulator]6 is enabled
<7>[   11.576729] .(6)[864:HwBinder:551_2][imgsensor][regulator]4 is enabled
<7>[   11.576759] .(6)[864:HwBinder:551_2][imgsensor][regulator]3 is enabled
<7>[   11.576785] .(6)[864:HwBinder:551_2][imgsensor][regulator]5 is enabled
<7>[   11.576849] .(6)[864:HwBinder:551_2][imgsensor]mclk_set : sensor_idx 0 mclk_set pinctrl, PinIdx 9, Val 0
<4>[   11.576857] .(6)[864:HwBinder:551_2]it is not ov7251 is_sub_camera=0 
<4>[   11.576859] .(6)[864:HwBinder:551_2]it is not ov7251 it is s5k3l8_mipi_raw 
<7>[   11.577024] .(6)[864:HwBinder:551_2][imgsensor]imgsensor_release 1
<6>[   11.577177] .(6)[864:HwBinder:551_2][ISP][ISP_release] - E. UserCount: 1.
<6>[   11.577639] .(6)[864:HwBinder:551_2][ISP][ISP_release] Curr UserCount(0), (process, pid, tgid)=(HwBinder:551_2, 864, 551), log_limit_line(0),	last user
<6>[   11.577685] .(6)[864:HwBinder:551_2][ISP][ISP_release] - X. UserCount: 0. G_u4EnableClockCount:0
<7>[   11.577681] .(6)[864:HwBinder:551_2][imgsensor]imgsensor_release 0
<7>[   11.582856] .(3)[403:fuelgauged][mt6356_get_auxadc_value]111 ch_idx = 2, channel = 3, bat_cur = 232, reg_val = 0x39d, adc_result = 812
<5>[   11.584026] MTK_FG: [dod_init_result]HW(43209, 9898) SW(43209, 9898) OLD(43372, 9997) VBAT(43202, 9894) OldCAR(c:-11 v:-140) con0(10000)
<5>[   11.584026] [dod_init_result]NVRAM_ready 1 Embedded 0 plug_out 0 is_hwocv_unreliable 0 rtc_invalid 0 rtc_ui_soc 10000 two_sec_reboot 0 old_data.ui_soc 10000, nv_fail(0)
<5>[   11.584026] [dod_init_result]T_new 25 T_old 25 T_d0 25 shutdown_time 0 pmic_shutdown_time 1800 plugout_time 0 plugout_time_th 32 swocv_oldocv_diff_emb 1000
<5>[   11.584026] [dod_init_result]ocv[boot:43203 final:43372 diff:169] thr[10000 10000 10000] tmp[now 24 5] v[lk_v:43202 cur:42690] lk_i:-6 lk_r:1700,i*r:1,old_soc:9997
<5>[   11.584026] [dod_init_result] <9> 43370 43295 10000 0 0 1 0
<5>[   11.584026] [dod_init_result] fg_c_d0(43370, 10000) fg_v_d0(43295, 9951) ui_d0_soc 10000 ui_soc_opt 0 car_v:2 _car:2
<5>[   11.584026] [dod_init_result] force_vc_mode 0 vc_mode 1 d0_sel 0
<5>[   11.594524] .(3)[403:fuelgauged]MTK_FG: {FGADC}soc:9997 fg_c_soc:9997 fg_v_soc:9951 ui_soc:10000 vc_diff:46 vc_mode 1 VBAT 42670 T:[25 V 24 C 25] D0_C 10000 D0_V 9951 CAR[c:-9 v:2]Q:[27803 27803 27966 27966] aging 10000 bat_cycle 1 Trk[0:0:0] UI[1:0] Chr[1:9997:0] pseudo1 0 DC_ratio 100 vboot:35204 35119 dod_init[9]
<6>[   11.747070] .(1)[873:epdg_wod][ccci1/chr]port ccci_woa open with flag 20002 by epdg_wod
<3>[   11.971144] .(5)[525:main]BOOTPROF:     11971.141489:Zygote:Preload 4715 classes in 1074ms
<14>[   12.079008] .(0)[1:init]init: PropSet [ril.ecclist]=[] Done
<14>[   12.082049] .(0)[1:init]init: PropSet [ril.cdma.card.omh]=[-1] Done
<14>[   12.085497] .(0)[1:init]init: PropSet [ril.cdma.ecclist]=[] Done
<14>[   12.096415] .(0)[1:init]init: PropSet [persist.radio.sim.opid]=[0] Done
<14>[   12.112065] .(4)[1:init]init: PropSet [persist.radio.simswitch]=[1] Done
<14>[   12.114698] .(4)[1:init]init: PropSet [ril.simswitch.no_reset_support]=[1] Done
<14>[   12.121663] .(6)[1:init]init: PropSet [ril.simswitch.tpluswsupport]=[1] Done
<14>[   12.130811] .(6)[1:init]init: PropSet [ril.nw.worldmode.keep_3g_mode]=[0] Done
<6>[   12.157417] .(4)[960:RfxSender_3][ccci1/chr]port ccci_ioctl1 open with flag 20802 by RfxSender_3
<6>[   12.158586] .(4)[960:RfxSender_3][ccci1/fsm]CCCI_IOC_GET_MD_TYPE: 11!
<6>[   12.159477] .(4)[960:RfxSender_3][ccci1/chr]port ccci_ioctl1 close rx_len=0 empty=1, clear_cnt=0, drop=0
<6>[   12.160821] .(4)[960:RfxSender_3][ccci1/pot]critical user check: 0x7
<14>[   12.164285] .(0)[1:init]init: PropSet [ril.active.md]=[11] Done
<6>[   12.171063] .(5)[984:RfxSender_5][ccci1/chr]port ccci_ss_xcap open with flag 20002 by RfxSender_5
<14>[   12.171492] .(0)[1:init]init: PropSet [ril.nw.worldmode.activemode]=[1] Done
<14>[   12.175427] .(7)[1:init]init: PropSet [ril.nw.signalstrength.lte.1]=[2147483647,214748364] Done
<14>[   12.181324] .(0)[1:init]init: PropSet [ril.apc.support]=[1] Done
<3>[   12.254206] .(5)[525:main]BOOTPROF:     12254.204028:Zygote:Preload 64 obtain resources in 45ms
<3>[   12.260094] .(5)[525:main]BOOTPROF:     12260.091028:Zygote:Preload 41 resources in 5ms
<3>[   12.422861] .(5)[525:main]BOOTPROF:     12422.859644:Zygote:Preload End
<36>[   12.502949] .(2)[362:logd.auditd]type=1400 audit(1578635494.233:35): avc: denied { add_name } for pid=551 comm="HwBinder:551_2" name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<36>[   12.506410] .(2)[362:logd.auditd]type=1400 audit(1578635494.265:36): avc: denied { write } for pid=365 comm="teed" name="/" dev="dm-2" ino=2 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<14>[   12.671867] .(3)[1:init]init: PropSet [ril.ipo.radiooff]=[0] Done
<14>[   12.677782] .(3)[1:init]init: PropSet [ril.mux.report.case]=[0] Done
<7>[   12.707362] .(1)[521:disp_queue_P0][DISP]layer_cnt total:100.layers:100,0,0,0,0,0,0,0,0,0,0,0,
<7>[   12.707391] .(1)[521:disp_queue_P0][DISP]layer_cnt .ext:100,0,0,0,0,0,.arm_ext:100,0,0,0,0,0,
<6>[   12.729973] .(2)[972:RfxSender_8][ccci1/chr]port ccci_ioctl1 open with flag 20802 by RfxSender_8
<6>[   12.731138] .(2)[972:RfxSender_8][ccci1/fsm]EFUN set to 0
<6>[   12.731896] .(2)[972:RfxSender_8][ccci1/chr]port ccci_ioctl1 close rx_len=0 empty=1, clear_cnt=0, drop=0
<6>[   12.733178] .(2)[972:RfxSender_8][ccci1/pot]critical user check: 0x7
<14>[   12.735767] .(3)[1:init]init: PropSet [ril.ecclist]=[] Done
<14>[   12.738799] .(3)[1:init]init: PropSet [ril.cdma.ecclist]=[] Done
<14>[   12.741612] .(3)[1:init]init: PropSet [ril.iccid.sim1]=[N/A] Done
<14>[   12.744419] .(3)[1:init]init: PropSet [ril.ecc.service.category.list]=[] Done
<14>[   12.747354] .(3)[1:init]init: PropSet [ril.cdma.card.type.1]=[255] Done
<14>[   12.760959] .(1)[1:init]init: PropSet [persist.radio.lastsim1_iccid]=[null] Done
<14>[   12.772549] .(0)[1:init]init: PropSet [persist.radio.c_capability_slot]=[1] Done
<14>[   12.790721] .(2)[1:init]init: PropSet [persist.radio.raf1]=[94714] Done
<14>[   12.797448] .(2)[1:init]init: PropSet [persist.radio.last_iccid_sim1]=[N/A] Done
<3>[   12.797557] .(4)[986:system_server]BOOTPROF:     12797.556568:Android:SysServerInit_START
<14>[   12.807875] .(4)[1:init]init: PropSet [persist.sys.dalvik.vm.lib.2]=[libart.so] Done
<14>[   12.816079] .(6)[1:init]init: PropSet [persist.radio.rilj_nw_type1]=[-1] Done
<4>[   12.938942] .(1)[399:healthd]=====FG===== SOC  = 100
<4>[   12.940826] .(1)[399:healthd]=====FG===== VOLT = 4270
<4>[   12.941480] .(1)[399:healthd]=====FG===== actural VOLT = 4285
<4>[   12.943272] .(1)[399:healthd]=====FG===== AC   = -128
<4>[   12.944525] .(1)[399:healthd]bq27542_set_commands cmd = 0x12, val = 3889 
<4>[   12.946124] .(1)[399:healthd]temp_now=223, temp_last=223 
<4>[   12.946857] .(1)[399:healthd]=====FG===== TEMP = 223
<6>[   12.948029] .(1)[399:healthd]i2c i2c-2: addr: 6c, transfer ACK error
<6>[   12.948883] .(1)[399:healthd]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[   12.949893] .(1)[399:healthd]I2C structure:
<3>[   12.949893] [I2C]Clk=13650000,Id=2,Op=1,Irq_stat=2,Total_len=1
<3>[   12.949893] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=0,speed=400000
<3>[   12.949893] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[   12.953024] .(1)[399:healthd]base address 0xffffff800bf46000
<6>[   12.953817] .(1)[399:healthd]I2C register:
<6>[   12.953817] [I2C]SLAVE_ADDR=d8,INTR_MASK=0,INTR_STAT=1,CONTROL=28,TRANSFER_LEN=1
<6>[   12.953817] [I2C]TRANSAC_LEN=1,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[   12.953817] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=1
<6>[   12.957564] .(1)[399:healthd]before enable DMA register(0xffffff800bf48400):
<6>[   12.957564] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[   12.957564] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[   12.957564] [I2C]TX_LEN=0,RX_LEN=c,INT_BUF_SIZE=0,DEBUG_STATUS=c0c0c00
<6>[   12.957564] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
