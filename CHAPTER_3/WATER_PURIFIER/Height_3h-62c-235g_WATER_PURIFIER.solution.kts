
solution {
    puzzle = "P025"
    name = "H3 6T"
    arm(ARM1) {
        number = 1
        position = 1 to -1
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = 1 to -2
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 3 to -2
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = -1 to 0
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 2 to -1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -5 to -2
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -2 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -1
        rotation = 0
    }
    track {
        position = 0 to -1
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = 2 to -2
        positions = listOf(0 to 0, 1 to 0, 0 to 1)
    }
    track {
        position = -7 to -2
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
    }
    track {
        position = -3 to 0
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(3)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                reset()
                wait(3)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(1)
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                reset()
                wait(1)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                reset()
                wait(3)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                back()
                reset()
                wait(7)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                forward()
                reset()
                wait(7)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                grab()
                back()
                back()
                reset()
                wait(6)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        )
    }
}
