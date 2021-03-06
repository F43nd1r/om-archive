
solution {
    puzzle = "P030b"
    name = "NO-TRACK I-19"
    arm(ARM6) {
        number = 1
        position = -1 to 2
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -1 to -1
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 6 to -4
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = 2 to -2
        rotation = -9
        size = 2
    }
    arm(ARM3) {
        number = 5
        position = 4 to -3
        rotation = 6
        size = 3
    }
    arm(ARM3) {
        number = 6
        position = 2 to -3
        rotation = -2
        size = 3
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = 5 to -3
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = 4 to 1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to -4
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 8 to -5
        rotation = -5
    }
    io(INPUT) {
        index = 1
        position = 6 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to 3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(2)
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
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                retract()
                reset()
                wait(1)
                extendTape()
            }
        }
        )
    }
}
