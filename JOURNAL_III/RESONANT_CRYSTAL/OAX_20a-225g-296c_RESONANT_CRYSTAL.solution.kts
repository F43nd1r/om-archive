
solution {
    puzzle = "P066"
    name = "OVERLAP AC"
    arm(PISTON) {
        number = 1
        position = -3 to 0
        rotation = -1
        size = 3
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = -1
    }
    glyph(BONDER) {
        position = 0 to -3
        rotation = 3
    }
    glyph(BONDER) {
        position = -4 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to -2
        rotation = -2
    }
    glyph(BONDER) {
        position = -4 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = -4 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -2 to -1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -1 to -2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -1 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -3 to -2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -3 to 1
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = -4 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 0 to -3
        rotation = 0
    }
    track {
        position = -2 to 1
        positions = listOf(1 to 0, 0 to 0, -1 to 0, -2 to 0, -1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                retract()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
                retract()
                back()
                rotateClockwise()
                grab()
                extend()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                retract()
                back()
                grab()
                extend()
                drop()
                retract()
                back()
                back()
                rotateCounterClockwise()
                grab()
                extend()
                drop()
                retract()
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
                back()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
                retract()
                retract()
                forward()
                forward()
                forward()
                grab()
                extend()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                retract()
                back()
                grab()
                extend()
                drop()
                retract()
                back()
                back()
                rotateCounterClockwise()
                grab()
                extend()
                drop()
                retract()
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
                back()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
                retract()
                retract()
                forward()
                forward()
                forward()
                grab()
                extend()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                retract()
                back()
                grab()
                extend()
                drop()
                retract()
                back()
                back()
                rotateCounterClockwise()
                grab()
                extend()
                drop()
                retract()
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
                back()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
                retract()
                retract()
                forward()
                forward()
                forward()
                grab()
                extend()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                retract()
                back()
                grab()
                extend()
                drop()
                retract()
                back()
                back()
                rotateCounterClockwise()
                grab()
                extend()
                drop()
                retract()
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
                back()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
                retract()
                retract()
                forward()
                forward()
                forward()
                grab()
                extend()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                retract()
                back()
                grab()
                extend()
                drop()
                retract()
                back()
                back()
                rotateCounterClockwise()
                grab()
                extend()
                drop()
                retract()
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
                back()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
                retract()
                retract()
                forward()
                forward()
                forward()
                grab()
                extend()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                retract()
                back()
                grab()
                extend()
                drop()
                retract()
                back()
                back()
                rotateCounterClockwise()
                grab()
                extend()
                drop()
                retract()
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
                back()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                reset()
            }
        }
        )
    }
}
