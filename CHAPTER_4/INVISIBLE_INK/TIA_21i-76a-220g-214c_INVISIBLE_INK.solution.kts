
solution {
    puzzle = "P032"
    name = "TI (Copy)"
    arm(ARM2) {
        number = 1
        position = -1 to -1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -3 to 1
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 3 to 0
        rotation = 3
        size = 2
    }
    arm(ARM2) {
        number = 4
        position = 1 to -1
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 2 to 1
        rotation = 7
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -2 to 2
        rotation = -2
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = 1 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to -1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -2 to 1
        rotation = 5
    }
    io(INPUT) {
        index = 0
        position = 1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 5 to -3
        rotation = 2
    }
    io(OUTPUT) {
        index = 1
        position = 7 to -3
        rotation = 5
    }
    io(INPUT) {
        index = 1
        position = 0 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(20)
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(28)
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(4) {
                wait(25)
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
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(6) {
                wait(37)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        )
    }
}
