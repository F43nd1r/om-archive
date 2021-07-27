
solution {
    puzzle = "w2450511665"
    name = "A"
    arm(PISTON) {
        number = 1
        position = 2 to -2
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 2 to -4
        rotation = 1
    }
    glyph(DISPOSAL) {
        position = 1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 0
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -1
        rotation = 1
    }
    track {
        position = 2 to -2
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                retract()
                rotateClockwise()
                extend()
                extend()
                forward()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                extend()
                forward()
                drop()
                retract()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                back()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                back()
                rotateCounterClockwise()
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
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
                back()
                rotateCounterClockwise()
                grab()
                retract()
                rotateClockwise()
                extend()
                extend()
                forward()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                extend()
                forward()
                drop()
                retract()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                back()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                rotateClockwise()
                extend()
                grab()
                retract()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
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
                back()
                rotateCounterClockwise()
                grab()
                retract()
                rotateClockwise()
                forward()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                extend()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                forward()
                extend()
                pivotClockwise()
                retract()
                drop()
                retract()
                rotateClockwise()
                extend()
                grab()
                retract()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                back()
                rotateCounterClockwise()
            }
        }
        )
    }
}
