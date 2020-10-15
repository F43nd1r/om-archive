
solution {
    puzzle = "P032"
    name = "B CA"
    arm(PISTON) {
        number = 1
        position = -1 to 0
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 2 to -1
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 3 to -1
        rotation = 4
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = 4 to -2
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 1 to -1
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = 2 to -4
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = -1 to -3
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = -2 to -3
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 9
        position = -3 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 10
        position = 0 to -3
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = -3 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 4 to -3
        rotation = -3
    }
    glyph(CALCIFICATION) {
        position = -1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -3
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 1 to -2
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = -1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 2 to -2
        rotation = 0
    }
    track {
        position = -3 to -2
        positions = listOf(0 to 0, 1 to -1, 2 to -1, 1 to 0)
    }
    track {
        position = 4 to -2
        positions = listOf(0 to 0, -1 to 1, -2 to 1, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                forward()
                forward()
                drop()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                forward()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                forward()
                forward()
                grab()
                forward()
                extend()
                drop()
                retract()
                forward()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                forward()
                forward()
                drop()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(8) {
                wait(3)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                forward()
            }
        }
        , 
        {
            sequence(9) {
                wait(4)
                forward()
                forward()
                grab()
                forward()
                extend()
                drop()
                retract()
                forward()
            }
        }
        , 
        {
            sequence(10) {
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
