
solution {
    puzzle = "P038"
    name = "B CG"
    arm(ARM1) {
        number = 1
        position = 3 to 0
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 3 to -1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 5 to -4
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 2 to -3
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 2 to -2
        rotation = 3
        size = 1
    }
    arm(ARM3) {
        number = 6
        position = 0 to -2
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = -2
    }
    glyph(PURIFICATION) {
        position = 5 to -1
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 3 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
