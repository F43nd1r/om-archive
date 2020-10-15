
solution {
    puzzle = "P011"
    name = "H2 C 2T"
    arm(ARM1) {
        number = 1
        position = -8 to 1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -7 to 0
        rotation = 6
        size = 3
    }
    arm(PISTON) {
        number = 3
        position = -5 to 0
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = -6 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -2 to 1
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 0
        rotation = -7
    }
    io(INPUT) {
        index = 0
        position = -5 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -4 to 0
        rotation = 0
    }
    track {
        position = 0 to 1
        positions = listOf(0 to 0, -1 to 0, -2 to 0)
    }
    track {
        position = -7 to 1
        positions = listOf(0 to -1, 1 to -1, 0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(2)
                grab()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                pivotCounterClockwise()
                back()
                drop()
                back()
                back()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                extend()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                back()
                grab()
                back()
                pivotCounterClockwise()
                back()
                drop()
                back()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                back()
                back()
                reset()
            }
        }
        )
    }
}
