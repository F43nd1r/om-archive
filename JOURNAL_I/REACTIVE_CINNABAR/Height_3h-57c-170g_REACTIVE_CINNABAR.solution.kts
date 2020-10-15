
solution {
    puzzle = "P056"
    name = "H3 3T"
    arm(ARM1) {
        number = 1
        position = -2 to 2
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 3 to 1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -5 to 1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -4 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -3 to 0
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -2 to 0
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 0
        rotation = 0
    }
    track {
        position = 4 to 1
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = -3 to 1
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    track {
        position = -4 to 1
        positions = listOf(0 to 0, -1 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(3)
                repeat()
                wait(8)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                back()
                grab()
                back()
                reset()
                wait(3)
                repeat()
                wait(4)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                back()
                drop()
                back()
                back()
                grab()
                back()
                drop()
                back()
                wait(1)
                back()
                wait(1)
                grab()
                back()
                drop()
                back()
                back()
                wait(1)
                grab()
                back()
                drop()
                back()
                back()
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                back()
                grab()
                back()
                reset()
                wait(2)
                repeat()
                wait(4)
                repeat()
                wait(6)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(5)
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                reset()
                wait(2)
                repeat()
                wait(8)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(1)
                grab()
                back()
                drop()
                back()
                back()
                grab()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                drop()
                back()
                wait(2)
                back()
                grab()
                back()
                drop()
                back()
                back()
                grab()
                back()
                reset()
            }
        }
        )
    }
}
