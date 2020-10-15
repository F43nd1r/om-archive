
solution {
    puzzle = "P032"
    name = "W2.5"
    arm(PISTON) {
        number = 1
        position = -2 to 1
        rotation = -2
        size = 3
    }
    arm(PISTON) {
        number = 2
        position = -3 to -1
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -1 to 2
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = -6 to -6
        rotation = -5
        size = 3
    }
    arm(PISTON) {
        number = 5
        position = -5 to -4
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = -7 to -7
        rotation = 7
        size = 2
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -7 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -8 to -6
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to 1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -4 to -2
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -6 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -6 to -5
        rotation = 0
    }
    track {
        position = -4 to -1
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = -4 to -4
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                back()
                drop()
                forward()
                extend()
                grab()
                retract()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                forward()
                back()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateClockwise()
                back()
                drop()
                forward()
                extend()
                grab()
                retract()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                forward()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                retract()
                retract()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                retract()
                reset()
                wait(2)
                grab()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                retract()
                retract()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                retract()
                reset()
                wait(2)
                grab()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                retract()
                rotateCounterClockwise()
                rotateClockwise()
                extend()
                extend()
                retract()
                pivotCounterClockwise()
                retract()
                wait(1)
                extend()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                retract()
                rotateCounterClockwise()
                rotateClockwise()
                extend()
                extend()
                retract()
                pivotCounterClockwise()
                retract()
                wait(1)
                extend()
                retract()
                reset()
            }
        }
        )
    }
}
