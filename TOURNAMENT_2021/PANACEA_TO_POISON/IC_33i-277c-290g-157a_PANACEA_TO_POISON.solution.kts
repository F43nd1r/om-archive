
solution {
    puzzle = "w2450511665"
    name = "TI"
    arm(ARM6) {
        number = 1
        position = 2 to -1
        rotation = -2
        size = 2
    }
    arm(ARM6) {
        number = 2
        position = 7 to 0
        rotation = 4
        size = 3
    }
    arm(ARM2) {
        number = 3
        position = 7 to -1
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 8 to -1
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = 7 to -6
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 6 to 1
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 8 to -4
        rotation = -6
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 12 to -5
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = 10 to -6
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = 12 to -6
        rotation = -3
    }
    glyph(UNBONDER) {
        position = 3 to 1
        rotation = -3
    }
    glyph(UNBONDER) {
        position = 4 to -1
        rotation = -5
    }
    glyph(UNBONDER) {
        position = 7 to 3
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 10 to 0
        rotation = -7
    }
    glyph(ANIMISMUS) {
        position = 10 to -4
        rotation = -12
    }
    glyph(DISPOSAL) {
        position = 4 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 1
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 10 to -7
        rotation = -16
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
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
                wait(2)
                rotateClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
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
            sequence(7) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(8)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(8)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        )
    }
}
