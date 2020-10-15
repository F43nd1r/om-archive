
solution {
    puzzle = "P026"
    name = "B CG"
    arm(ARM1) {
        number = 1
        position = 1 to 4
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 0 to 3
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 2 to 3
        rotation = 5
        size = 1
    }
    arm(ARM2) {
        number = 4
        position = 3 to 0
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 4 to -1
        rotation = 4
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = 1 to 2
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 2 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 3
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 3 to -2
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 4 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 5 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(3)
                grab()
                rotateClockwise()
                wait(2)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        )
    }
}
