
solution {
    puzzle = "P034"
    name = "OVERLAP G"
    arm(ARM1) {
        number = 1
        position = 0 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -12 to 4
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 3
        position = 5 to -3
        rotation = -3
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = 3 to -5
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 1 to 1
        rotation = 5
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = 1 to -8
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 1 to -4
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 3
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 5
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 6
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = 3
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 3
    }
    glyph(BONDER) {
        position = 3 to -4
        rotation = 3
    }
    glyph(BONDER) {
        position = 1 to -5
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -6 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -7 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 3 to -5
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -1 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 3 to -4
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 2 to -3
        rotation = 3
    }
    glyph(UNBONDER) {
        position = 2 to 0
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -1 to -1
        rotation = 3
    }
    glyph(UNBONDER) {
        position = 0 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to 1
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -10 to 4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -5 to -2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to 0
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = 1 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to -2
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 2 to -5
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 2 to -4
        rotation = 0
    }
    track {
        position = -12 to 4
        positions = listOf(0 to 0, 0 to 1, 1 to 0, 2 to -1)
    }
    track {
        position = -7 to 0
        positions = listOf(7 to -1, 6 to -1, 5 to -1, 4 to -1, 3 to -1, 2 to -1, 1 to -1, 0 to -1, -1 to -1, -2 to -1, -3 to -1, -4 to -1)
    }
    track {
        position = 2 to -7
        positions = listOf(-1 to -1, -1 to -2, -1 to -3, -2 to -2, -2 to -1, -2 to 0, -2 to 1, -2 to 2)
    }
    track {
        position = 5 to -7
        positions = listOf(-2 to 1, -2 to 2)
    }
    track {
        position = 2 to -2
        positions = listOf(3 to 0, 4 to 0, 5 to 0, 6 to 0, 6 to -1, 5 to -1, 4 to -1, 3 to -1)
    }
    track {
        position = 1 to -4
        positions = listOf(0 to 0, -1 to 0, -2 to 0, -2 to -1, -3 to -1)
    }
    track {
        position = 2 to -4
        positions = listOf(0 to 5, 1 to 5, 1 to 4, 0 to 4, -1 to 4, -1 to 5)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(13)
                grab()
                forward()
                forward()
                forward()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                pivotCounterClockwise()
                wait(1)
                pivotClockwise()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateClockwise()
                pivotClockwise()
                back()
                forward()
                pivotClockwise()
                back()
                forward()
                back()
                forward()
                back()
                forward()
                back()
                forward()
                back()
                rotateCounterClockwise()
                drop()
                forward()
                wait(1)
                grab()
                back()
                extend()
                extend()
                forward()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                grab()
                forward()
                forward()
                drop()
                rotateClockwise()
                grab()
                forward()
                drop()
                back()
                wait(10)
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(5)
                grab()
                forward()
                retract()
                retract()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                extend()
                extend()
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                extend()
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(11)
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                back()
                back()
                back()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(7)
                grab()
                retract()
                wait(1)
                retract()
                wait(1)
                forward()
                wait(1)
                forward()
                wait(1)
                forward()
                extend()
                extend()
                forward()
                forward()
                forward()
                forward()
                reset()
            }
        }
        )
    }
}
