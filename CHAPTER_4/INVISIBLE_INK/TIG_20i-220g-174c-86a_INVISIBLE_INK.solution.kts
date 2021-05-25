
solution {
    puzzle = "P032"
    name = "NEW SOLUTION 2 (Copy) (Copy)"
    arm(ARM2) {
        number = 1
        position = 0 to -4
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -2 to -4
        rotation = -6
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -3 to -2
        rotation = -4
        size = 1
    }
    arm(ARM2) {
        number = 4
        position = 1 to -2
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = -1 to 2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -2 to 2
        rotation = -4
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = -3 to 2
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 0 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 4
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -2 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -4
        rotation = 4
    }
    io(INPUT) {
        index = 1
        position = -1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 3 to -1
        rotation = 2
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(17)
                grab()
                rotateClockwise()
                drop()
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
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(10)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(17)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(23)
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
            }
        }
        )
    }
}
