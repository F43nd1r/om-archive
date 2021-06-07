
solution {
    puzzle = "P037"
    name = "OVERLAP AC"
    arm(PISTON) {
        number = 1
        position = 4 to 0
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 1 to -1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 1 to 1
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = 3 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = 3 to 1
        rotation = -2
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = -2
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = -2
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = -2
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -4 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = -5 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -4 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -7 to 0
        rotation = 7
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 5 to 0
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -7 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 5 to -1
        rotation = 0
    }
    track {
        position = 4 to 0
        positions = listOf(-6 to 0, -5 to -1, -4 to -1, -3 to -1, -2 to -1, -1 to -1, 0 to -1, 0 to 0, -1 to 0, -2 to 1, -3 to 1, -4 to 1, -5 to 1, -6 to 1, -7 to 1, -8 to 1, -9 to 1, -10 to 1, -10 to 0)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(6)
                back()
                grab()
                rotateClockwise()
                pivotClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                pivotCounterClockwise()
                wait(7)
                forward()
                forward()
                drop()
                forward()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(12)
                forward()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                back()
                back()
                back()
                extend()
                drop()
                retract()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                forward()
                forward()
                rotateClockwise()
                drop()
                back()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                forward()
                rotateClockwise()
                drop()
                rotateClockwise()
                back()
                back()
                back()
                grab()
                pivotCounterClockwise()
                back()
                back()
                back()
                back()
                back()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                back()
                rotateClockwise()
                back()
                back()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                wait(4)
                grab()
                rotateCounterClockwise()
                back()
                back()
                rotateClockwise()
                back()
                back()
                back()
                drop()
                wait(1)
                back()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                forward()
                rotateClockwise()
                forward()
                forward()
                drop()
                back()
                back()
                back()
                grab()
                forward()
                forward()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                drop()
                back()
                back()
                back()
                back()
                back()
                back()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                pivotClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                drop()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                forward()
                rotateClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                forward()
                forward()
                pivotCounterClockwise()
                drop()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                pivotCounterClockwise()
                forward()
                forward()
                drop()
                back()
                back()
                back()
                back()
                back()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                back()
                back()
                back()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                forward()
                forward()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                forward()
                drop()
                back()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                forward()
                forward()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                extend()
                drop()
                retract()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                forward()
                forward()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                back()
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                forward()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                extendTape()
            }
        }
        )
    }
}
