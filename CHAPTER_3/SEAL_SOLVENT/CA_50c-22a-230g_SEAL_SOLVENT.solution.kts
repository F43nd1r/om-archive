
solution {
    puzzle = "P026"
    name = "B CAX"
    arm(ARM1) {
        number = 1
        position = -2 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -3 to 0
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -1 to 1
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -2 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 0 to -1
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = 2 to -4
        rotation = 0
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = -1 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to -2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 1 to -2
        rotation = 5
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 3 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 1 to -1
        rotation = 0
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
            sequence(5) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                retract()
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
        )
    }
}
