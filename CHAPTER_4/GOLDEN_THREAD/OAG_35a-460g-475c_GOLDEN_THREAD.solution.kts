
solution {
    puzzle = "P037"
    name = "NEW SOLUTION 1"
    arm(PISTON) {
        number = 1
        position = 3 to 0
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 2
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = 4
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -4 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = 2
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = -3
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -5 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -5 to -1
        rotation = -3
    }
    glyph(BONDER) {
        position = 2 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = 3 to -1
        rotation = -3
    }
    glyph(BONDER) {
        position = 3 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 3 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 4
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -6 to 1
        rotation = -3
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -7 to 0
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -5 to 0
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 3 to 0
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 0
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -7 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 5 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 5 to -1
        rotation = 0
    }
    track {
        position = 4 to 0
        positions = listOf(-9 to -1, -8 to -1, -7 to -1, -6 to -1, -5 to -1, -4 to -1, -3 to -1, -2 to -1, -1 to -1, 0 to -1, 0 to 0, -1 to 1, -1 to 0, -2 to 1, -3 to 1, -4 to 1, -5 to 1, -6 to 1, -7 to 1, -8 to 1, -9 to 1, -10 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                extend()
                grab()
                retract()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
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
                forward()
                drop()
                back()
                back()
                back()
                back()
                back()
                back()
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
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                drop()
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
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
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
                rotateClockwise()
                drop()
                reset()
                wait(10)
                grab()
                retract()
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
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                rotateClockwise()
                extend()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                forward()
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
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                pivotClockwise()
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
                back()
                back()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                back()
                back()
                back()
                back()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(9)
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                extend()
                grab()
                retract()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                back()
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
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                back()
                back()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateClockwise()
                drop()
                reset()
                wait(6)
                grab()
                retract()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                back()
                back()
                back()
                back()
                back()
                rotateClockwise()
                extend()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
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
                back()
                back()
                back()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                forward()
                forward()
                drop()
                back()
                back()
                back()
                back()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(5)
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                forward()
                drop()
                back()
                back()
                back()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
                back()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                wait(3)
                extendTape()
            }
        }
        )
    }
}
