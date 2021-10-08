
solution {
    puzzle = "w2450512626"
    name = "TI"
    arm(ARM6) {
        number = 1
        position = 7 to 0
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 11 to -2
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 3
        position = 6 to -1
        rotation = 1
        size = 3
    }
    arm(ARM3) {
        number = 4
        position = 3 to 1
        rotation = 0
        size = 3
    }
    arm(ARM3) {
        number = 5
        position = 2 to 2
        rotation = 2
        size = 3
    }
    arm(ARM3) {
        number = 6
        position = 2 to -3
        rotation = 2
        size = 3
    }
    arm(ARM3) {
        number = 7
        position = 7 to -3
        rotation = -1
        size = 1
    }
    arm(ARM3) {
        number = 8
        position = 1 to 2
        rotation = -1
        size = 1
    }
    arm(ARM3) {
        number = 9
        position = -2 to 2
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 10
        position = 5 to -7
        rotation = 8
        size = 1
    }
    glyph(BONDER) {
        position = 6 to -4
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = -2
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 5 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 6 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -1 to 5
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 11 to -1
        rotation = -7
    }
    glyph(CALCIFICATION) {
        position = 3 to 4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to 5
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 0 to 1
        rotation = -4
    }
    glyph(UNIFICATION) {
        position = 9 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 12 to -3
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 0
        rotation = -1
    }
    io(OUTPUT) {
        index = 1
        position = -4 to 2
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 5 to -6
        rotation = -1
    }
    io(INPUT) {
        index = 2
        position = 7 to 1
        rotation = 3
    }
    io(INPUT) {
        index = 3
        position = 4 to -7
        rotation = 1
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(7)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(18)
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
            sequence(4) {
                wait(14)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(14)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(17)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(20)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(16)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(60)
                grab()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
