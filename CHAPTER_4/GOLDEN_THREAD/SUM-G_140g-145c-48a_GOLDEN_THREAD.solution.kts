
solution {
    puzzle = "P037"
    name = "B ACX 6T"
    arm(PISTON) {
        number = 1
        position = -13 to -1
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -11 to -2
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = -14 to 1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -12 to 0
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = -10 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -14 to 0
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -11 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -12 to -1
        rotation = 0
    }
    track {
        position = -12 to -2
        positions = listOf(1 to 0, 2 to 0)
    }
    track {
        position = -14 to -1
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                forward()
                extend()
                rotateClockwise()
                retract()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                rotateClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                extend()
                wait(4)
                pivotClockwise()
                retract()
                pivotClockwise()
                drop()
                rotateClockwise()
                wait(2)
                grab()
                back()
                drop()
                extend()
                extend()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                back()
                wait(1)
                grab()
                extend()
                forward()
                wait(3)
                pivotClockwise()
                retract()
                pivotClockwise()
                drop()
                rotateClockwise()
                wait(2)
                grab()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                back()
                wait(3)
                grab()
                extend()
                forward()
                wait(3)
                pivotClockwise()
                retract()
                pivotClockwise()
                drop()
                rotateClockwise()
                wait(2)
                grab()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                back()
                wait(3)
                grab()
                extend()
                forward()
                wait(3)
                pivotClockwise()
                retract()
                pivotClockwise()
                drop()
                rotateClockwise()
                wait(2)
                grab()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                back()
                wait(3)
                grab()
                extend()
                forward()
                wait(3)
                pivotClockwise()
                retract()
                pivotClockwise()
                wait(1)
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                forward()
                drop()
                rotateCounterClockwise()
                back()
                extend()
                grab()
                forward()
                drop()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                extend()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                retract()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                extend()
                drop()
                retract()
                grab()
                back()
                forward()
                rotateCounterClockwise()
                extend()
                back()
                drop()
                rotateClockwise()
                grab()
                retract()
                wait(6)
                forward()
                extend()
                extend()
                drop()
                retract()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                retract()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                back()
                forward()
                rotateCounterClockwise()
                extend()
                back()
                drop()
                rotateClockwise()
                grab()
                retract()
                forward()
                extend()
                extend()
                drop()
                retract()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                retract()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                back()
                forward()
                rotateCounterClockwise()
                extend()
                back()
                drop()
                rotateClockwise()
                grab()
                retract()
                forward()
                extend()
                extend()
                drop()
                retract()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                retract()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                back()
                forward()
                rotateCounterClockwise()
                extend()
                back()
                drop()
                rotateClockwise()
                grab()
                retract()
                forward()
                extend()
                extend()
                drop()
                retract()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                retract()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                back()
                forward()
                rotateCounterClockwise()
                extend()
                back()
                drop()
                retract()
                wait(2)
                grab()
                forward()
                drop()
                rotateClockwise()
                wait(2)
                grab()
                extend()
                extend()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
