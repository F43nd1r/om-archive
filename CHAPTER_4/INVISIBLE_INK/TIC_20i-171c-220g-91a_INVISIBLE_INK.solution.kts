
solution {
    puzzle = "P032"
    name = "MOJO MIRROR"
    arm(ARM2) {
        number = 1
        position = 4 to 0
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 2 to 2
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 1 to 1
        rotation = -3
        size = 1
    }
    arm(ARM2) {
        number = 4
        position = -1 to 3
        rotation = -1
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = -3 to 1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -1 to 2
        rotation = -3
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to 3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to -1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 3 to 0
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -2
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = 5 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -4 to -1
        rotation = -2
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(16)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(22)
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(4) {
                wait(19)
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
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(10)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(17)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
