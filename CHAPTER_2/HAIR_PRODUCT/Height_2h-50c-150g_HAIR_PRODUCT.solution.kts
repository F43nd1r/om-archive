
solution {
    puzzle = "P016"
    name = "H2 C 2T"
    arm(ARM1) {
        number = 1
        position = 5 to -1
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 4 to 0
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 3 to 0
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -1 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -2 to 0
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to -1
        rotation = 0
    }
    track {
        position = -1 to -1
        positions = listOf(0 to 0, -1 to 1, -2 to 1, -2 to 0, -1 to 0)
    }
    track {
        position = 5 to -1
        positions = listOf(0 to 0, -1 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                drop()
                wait(4)
                reset()
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                forward()
                grab()
                back()
                reset()
                forward()
                grab()
                back()
                reset()
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                pivotClockwise()
                back()
                drop()
                back()
                back()
                wait(6)
                back()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(10)
                back()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                pivotClockwise()
                back()
                drop()
                back()
                back()
            }
        }
        )
    }
}
