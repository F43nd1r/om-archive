
solution {
    puzzle = "P095"
    name = "OVERLAP AC"
    arm(PISTON) {
        number = 1
        position = -1 to 0
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -3 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -3 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -2 to 1
        rotation = -1
    }
    glyph(PROJECTION) {
        position = -2 to 0
        rotation = 2
    }
    glyph(PROJECTION) {
        position = -1 to 0
        rotation = 2
    }
    glyph(PURIFICATION) {
        position = -2 to 0
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = -2 to 0
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -2 to 1
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -3 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to 0
        rotation = 1
    }
    track {
        position = -2 to 1
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                forward()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                forward()
                back()
                drop()
                back()
                grab()
                back()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                rotateClockwise()
                forward()
                extend()
                grab()
                pivotClockwise()
                retract()
                drop()
                grab()
                back()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                rotateClockwise()
                forward()
                extend()
                grab()
                pivotClockwise()
                retract()
                drop()
                grab()
                back()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                rotateClockwise()
                forward()
                extend()
                grab()
                pivotClockwise()
                retract()
                drop()
                grab()
                back()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                rotateClockwise()
                forward()
                extend()
                grab()
                pivotClockwise()
                retract()
                drop()
                grab()
                back()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                rotateClockwise()
                forward()
                extend()
                grab()
                pivotClockwise()
                retract()
                drop()
                grab()
                back()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
