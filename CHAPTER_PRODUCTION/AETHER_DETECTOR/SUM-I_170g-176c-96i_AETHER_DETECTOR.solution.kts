
solution {
    puzzle = "P077"
    name = "B S"
    arm(ARM1) {
        number = 1
        position = 0 to -2
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 1 to -2
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 7 to -1
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 7 to 2
        rotation = -2
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = 8 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 0 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 10 to 0
        rotation = 1
    }
    track {
        position = 7 to 2
        positions = listOf(0 to -1, -1 to 0, 0 to 0, 1 to 0)
    }
    track {
        position = 2 to -2
        positions = listOf(0 to 0, -1 to 0, -2 to 0, -3 to 0)
    }
    conduit {
        id = 100
        position = 2 to 0
        rotation = 0
    }
    conduit {
        id = 100
        position = 6 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(3)
                pivotClockwise()
                wait(3)
                pivotClockwise()
                drop()
                forward()
                wait(4)
                grab()
                pivotClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(7)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                back()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                grab()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(10)
                grab()
                rotateCounterClockwise()
                back()
                pivotClockwise()
                back()
                drop()
                forward()
                grab()
                pivotClockwise()
                back()
                wait(1)
                forward()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                back()
                forward()
                back()
                pivotClockwise()
                wait(1)
                forward()
                forward()
                reset()
            }
        }
        )
    }
}
