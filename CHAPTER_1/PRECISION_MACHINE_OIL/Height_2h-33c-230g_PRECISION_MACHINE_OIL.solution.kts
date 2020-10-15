
solution {
    puzzle = "P012"
    name = "H2 6T"
    arm(ARM1) {
        number = 1
        position = -7 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -6 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -5 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -8 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -8 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 4 to -1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 3 to 0
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -4 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -4 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -5 to 0
        rotation = 0
    }
    track {
        position = -7 to 0
        positions = listOf(0 to 0, 1 to 0, 2 to -1, 1 to -1)
    }
    track {
        position = 2 to 0
        positions = listOf(0 to -1, 1 to -1, 2 to -1, 1 to 0, 0 to 0)
    }
    track {
        position = -8 to -1
        positions = listOf(0 to 0, 1 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(6) {
                grab()
                back()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                back()
                back()
                reset()
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(4)
                back()
                grab()
                back()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                back()
                reset()
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                back()
                drop()
                wait(1)
                back()
                grab()
                back()
                back()
                drop()
                wait(1)
                back()
                back()
                wait(1)
                grab()
                back()
                back()
                repeat()
                wait(14)
                back()
                drop()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                back()
                drop()
                back()
                back()
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(1)
                back()
                grab()
                back()
                drop()
                back()
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                back()
                wait(1)
                grab()
                back()
                back()
                back()
                drop()
                wait(1)
                back()
                grab()
                back()
                back()
                drop()
                wait(1)
                back()
                repeat()
                wait(14)
                back()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                back()
                drop()
                wait(1)
                back()
                back()
                wait(1)
                grab()
                back()
                back()
                back()
                drop()
                wait(1)
                back()
                repeat()
                wait(15)
                back()
                wait(1)
                reset()
            }
        }
        )
    }
}
