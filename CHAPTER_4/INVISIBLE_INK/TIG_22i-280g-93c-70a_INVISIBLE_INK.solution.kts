
solution {
    puzzle = "P032"
    name = "NO-TRACK I-22"
    arm(ARM2) {
        number = 1
        position = 2 to -2
        rotation = -7
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 5 to -3
        rotation = -4
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 4 to -2
        rotation = -9
        size = 1
    }
    arm(ARM2) {
        number = 4
        position = -1 to -1
        rotation = -10
        size = 1
    }
    arm(ARM6) {
        number = 5
        position = -4 to 0
        rotation = -7
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -3 to -1
        rotation = -12
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = 3 to -1
        rotation = -2
    }
    glyph(MULTI_BONDER) {
        position = -2 to -2
        rotation = -5
    }
    glyph(CALCIFICATION) {
        position = 2 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 7 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -6 to 0
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 1 to -2
        rotation = -10
    }
    io(INPUT) {
        index = 0
        position = 3 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 1
        rotation = -4
    }
    io(INPUT) {
        index = 1
        position = -2 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 5 to -4
        rotation = -10
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
            }
        }
        )
    }
}
