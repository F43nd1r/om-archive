
solution {
    puzzle = "P069"
    name = "B CG"
    arm(ARM1) {
        number = 1
        position = 1 to 1
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -3 to 1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 0 to 1
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 4 to -2
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 1 to -4
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 0 to -3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = -1 to 0
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -6 to 4
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = -1 to 2
        rotation = 2
        size = 2
    }
    arm(ARM3) {
        number = 10
        position = 1 to 0
        rotation = 2
        size = 3
    }
    arm(ARM3) {
        number = 11
        position = -4 to -1
        rotation = 0
        size = 2
    }
    arm(ARM3) {
        number = 12
        position = -3 to -2
        rotation = 0
        size = 2
    }
    arm(ARM3) {
        number = 13
        position = 2 to 3
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 14
        position = 0 to 2
        rotation = 5
        size = 2
    }
    glyph(BONDER) {
        position = -4 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = -4 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to 4
        rotation = 5
    }
    glyph(BONDER) {
        position = 1 to 3
        rotation = 5
    }
    glyph(CALCIFICATION) {
        position = -2 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to 1
        rotation = 0
    }
    glyph(DISPERSION) {
        position = 1 to -1
        rotation = 0
    }
    glyph(DISPERSION) {
        position = -3 to 3
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = -1 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -1
        rotation = 1
    }
    io(OUTPUT) {
        index = 1
        position = 0 to 5
        rotation = 1
    }
    io(OUTPUT) {
        index = 2
        position = -6 to 1
        rotation = 2
    }
    io(OUTPUT) {
        index = 3
        position = -5 to 0
        rotation = 4
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(5)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(5)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(13) {
                wait(5)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(5)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(5)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(12) {
                wait(5)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(14) {
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
