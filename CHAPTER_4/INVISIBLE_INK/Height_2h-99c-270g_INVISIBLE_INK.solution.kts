
solution {
    puzzle = "P032"
    name = "H2"
    arm(PISTON) {
        number = 1
        position = -8 to 0
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -9 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -14 to -1
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = -4 to -1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -3 to 0
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 2 to 0
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -10 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -7 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -10 to -1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -6 to 0
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -4 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -12 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -8 to -1
        rotation = 0
    }
    track {
        position = -16 to -1
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
    }
    track {
        position = 4 to 0
        positions = listOf(0 to 0, -1 to 0, -2 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(15)
                grab()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(15)
                grab()
                back()
                back()
                reset()
            }
        }
        )
    }
}
