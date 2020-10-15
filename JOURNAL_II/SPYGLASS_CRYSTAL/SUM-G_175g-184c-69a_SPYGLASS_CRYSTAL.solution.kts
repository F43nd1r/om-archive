
solution {
    puzzle = "P063"
    name = "B S"
    arm(ARM1) {
        number = 1
        position = -7 to 1
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -5 to -1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -4 to -1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -2 to -2
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 1 to -1
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = -5 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 2
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -6 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -3 to -1
        rotation = 0
    }
    track {
        position = -1 to -2
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = 2 to -1
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = -6 to 0
        positions = listOf(0 to 1, -1 to 1, -1 to 2)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(4)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(4)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateClockwise()
                back()
                pivotClockwise()
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                back()
                pivotClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                back()
                pivotClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                back()
                rotateClockwise()
                wait(1)
                forward()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                back()
                wait(2)
                grab()
                pivotClockwise()
                forward()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                back()
                wait(2)
                grab()
                pivotClockwise()
                forward()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                forward()
                back()
                reset()
                wait(1)
                repeat()
                wait(9)
                repeat()
            }
        }
        )
    }
}
