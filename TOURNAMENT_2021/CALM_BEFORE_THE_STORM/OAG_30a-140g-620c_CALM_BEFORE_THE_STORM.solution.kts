
solution {
    puzzle = "w2450512434"
    name = "OA"
    arm(PISTON) {
        number = 1
        position = 0 to 0
        rotation = -3
        size = 2
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -2 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to 0
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = 0 to -1
        rotation = -4
    }
    io(INFINITE) {
        index = 0
        position = -13 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 0
        rotation = -2
    }
    io(INFINITE) {
        index = 1
        position = -14 to 0
        rotation = 0
    }
    track {
        position = 0 to 0
        positions = listOf(0 to 0, 0 to -1, -1 to -1, 0 to -2)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                extend()
                drop()
                retract()
                retract()
                grab()
                pivotClockwise()
                drop()
                forward()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                rotateCounterClockwise()
                wait(1)
                forward()
                extend()
                drop()
                retract()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                retract()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                forward()
                forward()
                rotateClockwise()
                extend()
                grab()
                retract()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                forward()
                forward()
                rotateClockwise()
                extend()
                grab()
                retract()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                extend()
                grab()
                retract()
                forward()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                drop()
                extend()
                grab()
                extend()
                drop()
                retract()
                retract()
                grab()
                extend()
                extend()
                drop()
                retract()
                forward()
                grab()
                extend()
                reset()
            }
        }
        )
    }
}
