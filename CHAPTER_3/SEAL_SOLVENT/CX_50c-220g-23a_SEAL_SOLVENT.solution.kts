
solution {
    puzzle = "P026"
    name = "B CX 2"
    arm(ARM1) {
        number = 1
        position = -3 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -4 to 1
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -2 to 2
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -3 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 0 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 3 to -3
        rotation = 2
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = -2 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to -1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 2 to -3
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 2 to -2
        rotation = 0
    }
    track {
        position = 0 to -1
        positions = listOf(0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(4) {
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
                wait(4)
                grab()
                extend()
                extend()
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
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                back()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
