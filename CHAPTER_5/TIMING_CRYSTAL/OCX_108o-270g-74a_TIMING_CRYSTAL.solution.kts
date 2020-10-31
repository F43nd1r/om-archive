
solution {
    puzzle = "P042"
    name = "OVERLAP A"
    arm(ARM1) {
        number = 1
        position = 6 to 2
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 6 to 1
        rotation = -2
        size = 3
    }
    arm(PISTON) {
        number = 3
        position = 3 to 3
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 6 to -6
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = 6 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 7 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = 5 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 6 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = -7
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 5 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 5 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 4 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 5 to 1
        rotation = 4
    }
    glyph(UNBONDER) {
        position = 2 to 0
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 6 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 6 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 3 to 2
        rotation = 0
    }
    track {
        position = 6 to 4
        positions = listOf(0 to -2, 1 to -3, 0 to -3)
    }
    track {
        position = 3 to 5
        positions = listOf(-1 to -1, 0 to -2, 1 to -3)
    }
    track {
        position = 5 to -5
        positions = listOf(-2 to 1, -1 to 0, 0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                wait(11)
                forward()
                wait(3)
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                wait(11)
                forward()
                wait(3)
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                wait(11)
                forward()
                wait(5)
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(6)
                forward()
                rotateClockwise()
                wait(8)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                wait(11)
                forward()
                wait(3)
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                wait(11)
                forward()
                wait(3)
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                forward()
                drop()
                retract()
                retract()
                rotateClockwise()
                back()
                wait(7)
                grab()
                extend()
                extend()
                pivotClockwise()
                back()
                retract()
                wait(86)
                extend()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(19)
                grab()
                back()
                back()
                pivotClockwise()
                drop()
                forward()
                forward()
                grab()
                back()
                back()
                back()
                reset()
            }
        }
        )
    }
}
