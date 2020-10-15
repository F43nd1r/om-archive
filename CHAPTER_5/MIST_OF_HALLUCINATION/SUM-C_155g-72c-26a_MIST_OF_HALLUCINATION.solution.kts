
solution {
    puzzle = "P038"
    name = "B S"
    arm(ARM6) {
        number = 1
        position = 2 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 3 to 0
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -1 to 2
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 4 to -3
        rotation = 2
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = 3 to -2
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 1 to -2
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 5 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 2 to -3
        rotation = 0
    }
    track {
        position = -1 to 2
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(2)
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                wait(1)
                repeat()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                forward()
                forward()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
